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
object StringAndBasics_14 extends App {

  // 14. Write a Scala program and create two Lists data structures as follows: (1) The first List
  // will have items named "pencil", "pen", "sharpener", and (2) The second List will have items name
  // "math book", "french book", "english book". Merge the two List data structures such that the
  // resulting combined data structure is of type List[List[String]]. Finally, output all items
  // with the literal " is required in the classroom.".
  // Output:
//  pencil is required in the classroom.
//  pen is required in the classroom.
//  sharpener is required in the classroom.
//  math book is required in the classroom.
//    french book is required in the classroom.
//    english book is required in the classroom.

  val list1 = List("pencil", "pen", "sharpener")
  val list2 = List("math book", "french book", "english book")
  val combinedList: List[List[String]] = List(list1, list2)
  combinedList
    .flatten
    .map(_ + " is required in the classroom.")
    .foreach(println(_))

}
