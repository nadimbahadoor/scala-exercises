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
object ClassFxTraits_15 extends App {


  // 15: Write a Scala program and use an abstract class to model a Donut pastry with a name
  // property of type String, and having also a printName() method that does not have a return type.
  // Use Scala's case class construct to define two sub-classes of the abstract Donut class to define
  // two additional types, namely, a VanillaDonut, and a GlazedDonut. Next, create a class
  // that accepts an upper type bound for a Donut type as its constructor argument. This particular
  // Pastry class will further have a name() method that basically calls a given pastry's printName()
  // method - that is of course derived from the upper type bound constraint that is applied to
  // the Pastry's constructor argument. With the above classes defined, create two instances of
  // Pastry, one with an upper type bound constraint of VanillaDonut, whereas the other, is bound
  // to the abstract Donut type. You will have to respectively pass-through corresponding objects -
  // that is, a VanillaDonut, and a GlazedDonut - to the two Pastry instances, and thereafter call the
  // Pastry's name() method.
  // Output:



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


  // Upper Type Bounds
  class Pastry[P <: Donut](pastry: P){
    def name(): Unit = pastry.printName()
  }

  val vanillaPastry = new Pastry[VanillaDonut](vanillaDonut)
  vanillaPastry.name()

  val glazedPastry = new Pastry[Donut](glazedDonut)
  glazedPastry.name()

}
