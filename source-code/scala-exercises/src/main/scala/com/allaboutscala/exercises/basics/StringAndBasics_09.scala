package com.allaboutscala.exercises.basics

import scala.collection.immutable.TreeMap

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
object StringAndBasics_09 extends App {

  // 9. Create a Scala program and use an appropriate data structure to present the following key and value
  // pairs of children and their ages: Bill is 9 years old, Jonny is 8 years old, Tommy is 11 years old,
  // and Cindy is 13 years old. Sort out the corresponding child to age in reverse alphabet order.
  // Output:
  // Children to ages in reverse order by their names = Tommy -> 11, Jonny -> 8, Cindy -> 13, Bill -> 9


  object ReverseAlphaOrder extends Ordering[String]{
    def compare(key1:String, key2:String) = key2.compareTo(key1)
  }

  val childrenToAges = TreeMap(
    ("Bill",9),
    ("Jonny",8),
    ("Tommy",11),
    ("Cindy", 13)
  )(ReverseAlphaOrder)
  println(s"Children to ages in reverse order by their names = ${childrenToAges.mkString(", ")}")


}
