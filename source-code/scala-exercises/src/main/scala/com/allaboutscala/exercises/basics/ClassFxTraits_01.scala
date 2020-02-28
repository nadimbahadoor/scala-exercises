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
object ClassFxTraits_01 extends App {

  // 1. Write a Scala program and use the Tuple type to represent a shopping cart item
  // with the following properties: a name, a price, and a quantity bought. Thereafter,
  // use a case class to represent the above shopping cart item. You can use the following
  // shopping cart item as an example: A packet of rice at $10.99 and quantity bought is 5.
  // Output:
//  A packet of rice is currently priced at $10.99, and the customer bought 5.
//  A packet of rice is currently priced at $10.99, and the customer bought 5.

  val tupleItem = ("packet of rice", 10.99, 5)
  println(s"A ${tupleItem._1} is currently priced at $$${tupleItem._2}, and the customer bought ${tupleItem._3}.")

  final case class ShoppingCartItem(name: String, price: Double, qtyBought: Int)
  val cartItem = ShoppingCartItem(
                  name = "packet of rice",
                  price = 10.99,
                  qtyBought = 5)
  println(s"A ${cartItem.name} is currently priced at $$${cartItem.price}, and the customer bought ${cartItem.qtyBought}.")


}
