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
object NumberAndBasics_04 extends App {

  // 4. Let us assume two data structures to represent the following numerals: (1) 1, 3, 5, 10, 20
  // and (2) 20, 17, 18, 99, 0. Write a Scala program to find the number literals that are in the first
  // data structure, but not in the other one. Conversely, also find the number literals that are in the
  // second data structure, but not in the first one. You can use whichever data structure from the
  // standard Scala collection types.
  // Output:
//  Number literals in set one but not in set two = HashSet(5, 10, 1, 3)
//  Number literals in set two but not in set one = HashSet(0, 17, 18, 99)

  val setOne = Set(1, 3, 5, 10, 20)
  val setTwo = Set(20, 17, 18, 99, 0)

  val diffSetOneVSSetTwo = setOne -- setTwo
  val diffSetTwoVSSetOne = setTwo -- setOne

  println(s"Number literals in set one but not in set two = $diffSetOneVSSetTwo")
  println(s"Number literals in set two but not in set one = $diffSetTwoVSSetOne")
}
