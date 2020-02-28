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
object ClassFxTraits_03 extends App {

  //3: Write a Scala program that defines a method with an integer input parameter. You can use
  // this method to produce the following output:
//  10 as String literal = 10
  // Create another method similar to the above-mentioned, but this particular method should accept
  // an arbitrary integer input parameters as opposed to just one. You can then use this method
  // to produce the following output:
  // 10, 11, 12 as String literals = 10 :: 11 :: 12



  def numberToString(num: Int): String = {
    num.toString
  }

  println(s"10 as String literal = ${numberToString(10)}")


  def numbersToString(numbers: Int*): String = {
    numbers.mkString(" :: ")
  }

  println(s"10, 11, 12 as String literals = ${numbersToString(10, 11, 12)}")
}
