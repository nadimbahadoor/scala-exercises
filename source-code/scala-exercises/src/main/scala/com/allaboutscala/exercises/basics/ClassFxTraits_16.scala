package com.allaboutscala.exercises.basics

/**
  * Created by Nadim Bahadoor on 01/20/2020.
  *
  * Tutorial: Source code for the scala-exercises section at http://allaboutscala.com
  *
  * [[http://allaboutscala.com/tutorials/scala-exercises/]]
  *
  *
  * Copyright 2016 Nadim Bahadoor (http://allaboutscala.com)
  *
  * Licensed under the Apache License, Version 2.0 (the "License"); you may not
  * use this file except in compliance with the License. You may obtain a copy of
  * the License at
  *
  *  [http://www.apache.org/licenses/LICENSE-2.0]
  *
  * Unless required by applicable law or agreed to in writing, software
  * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
  * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
  * License for the specific language governing permissions and limitations under
  * the License.
  */
object ClassFxTraits_16 extends App {

  // 16: Write a Scala program and use a case class to model a Lollipop type with a name property
  // of type String. Thereafter, create an object, or instance, of the Lollipop type. Using the types
  // from the previous scala exercises - that is, the Donut, VanillaDonut, GlazedDonut, and Pastry classes -
  // try to define a Pastry object that has an upper type bound to the Lollipop type. What you will observe
  // is that given the upper type bound constraint of P <: Donut on the Pastry type's constructor
  // argument, you will receive a compile time error because a Pastry of type Lollipop does
  // not match P <: Donut - in other words, a Lollipop is not a sub-type of the base Donut type.
  // Next, create a ShoppingCart class that has an addCartItem() method with a parameter named item that
  // is represented as a lower type bound with respect to the earlier VanillaDonut type. The method
  // should have no return type, but will output the following details regarding the item parameter.
  // Output:
//  Adding VanillaDonut(Vanilla Donut) to shopping cart
//    VanillaDonut
//  Adding GlazedDonut(Glazed Donut) to shopping cart
//    GlazedDonut
//  Adding Lollipop(Lollipop) to shopping cart
//    Lollipop
//  Adding oops something is not right! to shopping cart
//  String

  abstract class Donut(name: String) {
    def printName(): Unit
  }

  case class VanillaDonut(name: String) extends Donut(name) {
    override def printName(): Unit = println(name)
  }

  case class GlazedDonut(name: String) extends Donut(name) {
    override def printName(): Unit = println(name)
  }

  val vanillaDonut = VanillaDonut("Vanilla Donut")
  val glazedDonut = GlazedDonut("Glazed Donut")



  class Pastry[P <: Donut](pastry: P){
    def name(): Unit = pastry.printName()
  }

  val vanillaPastry = new Pastry[VanillaDonut](vanillaDonut)
  vanillaPastry.name()

  val glazedPastry = new Pastry[Donut](glazedDonut)
  glazedPastry.name()



  case class Lollipop(name: String)

  val lollipop = new Lollipop("Lollipop")

  // Compile time error because a Lollipop type does not match the P <: Donut constraint
  //  val lollipopPastry = new Pastry[Lollipop](lollipop)



  class ShoppingCart {
    def addCartItem[I >: VanillaDonut](item: I): Unit = {
      println(s"Adding $item to shopping cart")
      println(item.getClass.getSimpleName)
    }
  }


  val shoppingCart = new ShoppingCart()
  shoppingCart.addCartItem(vanillaDonut)
  shoppingCart.addCartItem(glazedDonut)
  shoppingCart.addCartItem(lollipop)
  shoppingCart.addCartItem("oops something is not right!")

}
