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
object StringAndBasics_11 extends App {

  // 11. Assume a shopping basket with the following items: "Milk", "Cheese", "Donuts", "Apples",
  // "Bananas". Represent the above items into an appropriate data structure, and thereafter
  // define and use a value function that will remove all fruit items from the shopping basket.
  // In other words, the shopping basket should only contain items "Milk", "Cheese" and "Donuts".
  // Note also that the resulting output should be represented as an XML element format as shown below.
  // Output:
  // <items values= "Milk|Cheese|Donuts"></items>

  val shoppingBasket = Seq("Milk", "Cheese", "Donuts", "Apples", "Bananas")
  val filterFruitItemsF: (String) => Boolean = (s) => s == "Apples" || s == "Bananas"
  val basketWithoutFruits = shoppingBasket.filterNot(filterFruitItemsF)
  println(basketWithoutFruits.mkString("<items values= \"", "|", "\"></items>"))


}
