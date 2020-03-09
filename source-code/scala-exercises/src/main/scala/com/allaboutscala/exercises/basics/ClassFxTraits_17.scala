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
object ClassFxTraits_17 extends App {

  // 17: Write a Scala program and use a case class to represent a CartItem object that has
  // a name property of type String, a quantity property of type Int, and a price property of type
  // Double. Next, create a singleton object named ShoppingCart and define a totalCost() method
  // that has two parameters - the first is the above CartItem type, and the second is a couponCode
  // of type String, but which is optional. The return type of the totalCost() method will be a
  // Double type. In the body of the totalCost() method, use pattern matching and apply a 10% discount
  // to the total cost for a given CartItem for a coupon code of "COUPON_1234". If there is no
  // couponCode parameter, then the total cost for a given CartItem will be basically the associated
  // price of the CartItem multiplied by its quantity. Next, create an object, or instance, of the CarItem
  // to represent a Chocolate item, with 10 quantity at a price of $2.50 each.
  // Output:
//  Calculating cost for Chocolate, quantity = 10
//  Total cost without couponCode = $25.0
//  Calculating cost for Chocolate, quantity = 10
//  Total cost with couponCode = $22.5


  final case class CartItem(name: String, quantity: Int, price: Double)


  object ShoppingCart {
    def totalCost(cartItem: CartItem, couponCode: Option[String]): Double = {
      println(s"Calculating cost for ${cartItem.name}, quantity = ${cartItem.quantity}")

      couponCode match {
        case Some(coupon) =>
          val discount = if (coupon == "COUPON_1234") 0.1 else 0.0
          val totalCost = cartItem.price * cartItem.quantity * (1 - discount)
          totalCost

        case None => cartItem.price * cartItem.quantity
      }
    }
  }


  val cartItem = CartItem("Chocolate", 10, 2.50)
  println(s"""Total cost without couponCode = $$${ShoppingCart.totalCost(cartItem, None)}""")
  println(s"""Total cost with couponCode = $$${ShoppingCart.totalCost(cartItem, Some("COUPON_1234"))}""")
}
