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
object NumberAndBasics_09 extends App {

  // 9: Write a Scala program and list all the odd number between 300 and 350.
  // As a tip, there is no need to manually create a data structure to represent
  // all the number literals, such as, 300, 301, 302, etc. Instead, use the handy
  // Range type to help you create number literals between 300 and 350. As a
  // second tip, experiment with the handy collection functions in Scala that
  // can help you avoid boiler-plate code to solve this particular problem.
  // Output:
//  Odd number between 300 and 340 =
//  301||303||305||307||309||311||313||315||317||319||321||323||325||327||329||331||333||335||337||339

  val oddNumbers = (300 to 340)
    .filter(_ %2 != 0)
    .take(20)
    .toList
    .mkString("||")

  println("Odd numbers between 300 and 340 = ")
  println(oddNumbers)

}
