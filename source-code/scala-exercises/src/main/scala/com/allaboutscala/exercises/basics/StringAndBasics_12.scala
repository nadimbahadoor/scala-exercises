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
object StringAndBasics_12 extends App {

  // 12. Assume the following lexical coupon codes: "A", "BB", "CCC", "DDDD", "EEEEE".
  // Write a Scala program to create a new set of coupon codes based on the above one.
  // The format for each coupon code should be as follows: "coupon code - i", where the
  // number i is derived from the length of each corresponding coupon code.
  // Output:
//  A - 1
//  BB - 2
//  CCC - 3
//  DDDD - 4
//  EEEEE - 5

  val codes = Seq("A", "BB", "CCC", "DDDD", "EEEEE")
  val codesWithLength = codes.map { code =>
    s"$code - ${code.length}"
  }

  codesWithLength.foreach(println(_))

}
