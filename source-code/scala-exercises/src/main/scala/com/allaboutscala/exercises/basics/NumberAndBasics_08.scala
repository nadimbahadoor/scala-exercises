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
object NumberAndBasics_08 extends App {

  // 8. Write a Scala program and use a Sequence data structure to store a combination of
  // names to ages as follows:
//  Seq(
//    "James", 7,
//    "Andy", 8,
//    "Tommy", 10,
//    "Bob", 13,
//    "Sam", 10
//  )
  // From the above Sequence, extract the age number literal, and use this to find the sum of ages.
  // Output:
//  Combined sequence of names to ages = James,7,Andy,8,Tommy,10,Bob,13,Sam,10
//  Sum of ages = 48


  val nameAndAge = Seq(
    "James", 7,
    "Andy", 8,
    "Tommy", 10,
    "Bob", 13,
    "Sam", 10
  )

  val ageSeq = nameAndAge.collect {
    case age: Int => age
  }

  println(s"Combined sequence of names to ages = ${nameAndAge.mkString(",")}")
  println(s"Sum of ages = ${ageSeq.sum}")



}
