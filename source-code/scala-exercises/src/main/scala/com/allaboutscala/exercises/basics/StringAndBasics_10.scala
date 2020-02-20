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
object StringAndBasics_10 extends App {

  // 10: Let us assume that you two shopping baskets with a bunch of items in each one. The first
  // contains elements: "Cake", "Milk", "Cheese", "Toilet Paper", and the second one has the following
  // items: "Bread", "Water", "Juice", "Milk", "Cheese". Write a Scala program to find the common
  // items between the two shopping baskets. You can use whichever data structure that you feel is
  // appropriate for this particular problem.
  // Output:
//   Shopping Basket One = Cake - Milk - Cheese - Toilet Paper
//   Shopping Basket Two = Water - Milk - Juice - Cheese - Bread
//   Common items are:
//
//    MILK
//  CHEESE

    val setBasketOne = Set("Cake", "Milk", "Cheese", "Toilet Paper")
    val setBasketTwo = Set("Bread", "Water", "Juice", "Milk", "Cheese")
    val commonItems = setBasketOne intersect setBasketTwo
    println(
      s"""
        |Shopping Basket One = ${setBasketOne.mkString(" - ")}
        |Shopping Basket Two = ${setBasketTwo.mkString(" - ")}
        |Common items are:
      """.stripMargin)

    commonItems.foreach(item => println(item.toUpperCase()))

}
