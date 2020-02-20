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
object NumberAndBasics_07 extends App {

  // 7. Write a Scala program and use an appropriate data structure to represent the following
  // numerical values: 2, 8, 19, 20, 25, 50, 100, 10. Define a value function that will identify
  // whether a given numeric value is divisible by 2. Using this value function, and starting from
  // the left hand side to the right hand side, remove all elements from the abovementioned
  // data structure that factors of two. But, your program should stop removing elements
  // as soon as a number literal is not a factor of two.
  // Output:
  /**
    *  Starting from left to right, removing items that are factors of two, and will
    * stop execution on the first element that is not divisible by two:
    * 19
    * 20
    * 25
    * 50
    * 100
    * 10
    */

  val numberSeq = Seq(2, 8, 19, 20, 25, 50, 100, 10)
  val divByTwoF: (Int) => Boolean = (i) => i % 2 == 0
  println(
    """
      |Starting from left to right, removing items that are factors of two, and will
      |stop execution on the first element that is not divisible by two:
    """.stripMargin)
  numberSeq
    .dropWhile(divByTwoF)
    .foreach(println(_))


}
