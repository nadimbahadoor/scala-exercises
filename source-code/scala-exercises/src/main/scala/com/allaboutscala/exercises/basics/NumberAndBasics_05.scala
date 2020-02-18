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
object NumberAndBasics_05 extends App{

  // 5. Write a Scala program and use an appropriate data structure to represent the following number literal -
  // 99.5, 100.0, 50.0, 55.0, 70.0, 100.0, -1.0. Assume a second data structure with the following number literals
  // 10.0, 20.0, 30.0, 40.0, 50.0. Join the two data structures together, and thereafter find the lowest and the
  // largest number literal from the combined number literals.
  // Output:
  // Combined number literals = List(99.5, 100.0, 50.0, 55.0, 70.0, 100.0, -1.0, 10, 20, 30, 40, 50)
//  Lowest number literal = -1.0
//  Largest number literal = 100.0

  val seqOne = Seq(99.5, 100.0, 50.0, 55.0, 70.0, 100.0, -1.0)
  val seqTwo = Seq(10.0, 20.0, 30.0, 40.0, 50.0)
  val combinedNumbers = seqOne ++ seqTwo

  implicit val doubleOrdering = Ordering.Double.TotalOrdering
  val minNumber = combinedNumbers.min
  val maxNumber = combinedNumbers.max

  println(s"Combined number literals = $combinedNumbers")
  println(s"Lowest number literal = $minNumber")
  println(s"Largest number literal = $maxNumber")



}
