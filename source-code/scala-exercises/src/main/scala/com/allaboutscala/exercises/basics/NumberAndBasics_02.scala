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
object NumberAndBasics_02 extends App {

  // 2. Create a Scala program to represent a List with a sequence of number from 100 to 150. You should omit
  // the last numeric item of 150, and each numeric item should have a 10 numeric interval. You should then calculate
  // the sum of all the numeric items in the List.
  // Output:
  // Elements of Vector from 100 to 150, excluding the 150 number literal = 100, 110, 120, 130, 140
  // Sum for elements in the List = 600

    val listRange = List.range(100, 150, 10)
    val listRangeAsStr = listRange.mkString(", ")
    println(s"Elements of List from 100 to 150, excluding the 150 number literal = $listRangeAsStr")
    println(s"Sum for elements in the List = ${listRange.sum}")


}
