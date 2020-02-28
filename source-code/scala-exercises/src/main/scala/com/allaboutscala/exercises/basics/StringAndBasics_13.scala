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
object StringAndBasics_13 extends App {

  // 9: Write a Scala program and use the Tuple type to represent items in a shopping baskets:
  // "T-Shirt", "Medium", 10.99
  // "Polo-Shirt", "Large", 4.99
  // "Vest", "Small", 5.99
  // "T-Shirt", "Small", 4.99
  // "T-Shirt", "Small", 4.99
  // You are free to use whichever data structure is appropriate to store the above-mentioned items.
  // The Scala program should then output all "T-Shirt" items in upper case format. Note that all other
  // items in the shopping basket should then be in the lower case format.
  // Output:
//  T-SHIRT is priced at $10.99 for the Medium size.
//    polo-shirt is priced at $4.99 for the Large size.
//    vest is priced at $5.99 for the Small size.
//    T-SHIRT is priced at $4.99 for the Small size.
//    T-SHIRT is priced at $4.99 for the Small size.


  val item1 = Tuple3("T-Shirt", "Medium", 10.99)
  val item2 = Tuple3("Polo-Shirt", "Large", 4.99)
  val item3 = Tuple3("Vest", "Small", 5.99)
  val item4 = Tuple3("T-Shirt", "Small", 4.99)
  val item5 = Tuple3("T-Shirt", "Small", 4.99)

  val shoppingBasket = List(item1, item2, item3, item4, item5)
  shoppingBasket.foreach {
    case item if item._1 == "T-Shirt" =>
      println(s"${item._1.toUpperCase()} is priced at $$${item._3} for the ${item._2} size.")
    case item =>
      println(s"${item._1.toLowerCase()} is priced at $$${item._3} for the ${item._2} size.")
  }

}
