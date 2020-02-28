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
object ClassFxTraits_02 extends App {

  // 2: Write a Scala program and use a case class to define a shopping cart item. Each
  // shopping cart item should have the following properties, namely, a name, a price, and a quantity
  // bought. Create three shopping cart items for the following items:
  // 10 vanilla ice cream at $2.99 each
  // 3 chocolate biscuits at $3.99 each
  // 5 cupcakes at $4.99 each
  // Use an appropriate data structure to store the above-mentioned shopping cart items. Thereafter,
  // define and use a method that will print out all items from a given shopping cart.
  // Output:
//  10 vanilla ice cream at $2.99 each
//    3 chocolate biscuits at $3.99 each
//  5 cupcakes at $4.99 each
//  Define also another method that given a shopping cart basket will only output vanilla ice cream products.
  // A generic message, such as, "Found another item", will be the output for all other items.
  // Output:
//  Found another item.
//    Found another item.
//    Found a cupcake item.



  final case class ShoppingCartItem(name: String, price: Double, qtyBought: Int)

  val item1 = ShoppingCartItem("vanilla ice cream", 2.99, 10)
  val item2 = ShoppingCartItem("chocolate biscuits", 3.99, 3)
  val item3 = ShoppingCartItem("cupcakes", 4.99, 5)
  val basket = List(item1, item2, item3)

  def printCartItems(basket: List[ShoppingCartItem]): Unit = {
    basket.foreach { item =>
      println(s"${item.qtyBought} ${item.name} at $$${item.price} each")
    }
  }

  printCartItems(basket)


  def printIceCream(basket: List[ShoppingCartItem]): Unit = {
    basket.foreach { {
        case ShoppingCartItem("cupcakes", _, _) => println(s"Found a cupcake item.")
        case ShoppingCartItem(_,_,_) => println("Found another item.")
      }
    }
  }

  printIceCream(basket)

}
