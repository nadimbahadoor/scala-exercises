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
object NumberAndBasics_06 extends App {

  // 6. Write a Scala value function that will always return true for all numeric literals
  // that match to some magic number of, say, 77. That is, the value function should
  // of course output false for all other numeric values. Then, use an appropriate
  // data structure to capture the following numeric values: 10, 77, 90, 50, 100, 110.
  // Use the value function to verify if the magic number of 77 is
  // part of the aforementioned numeric values.

  // Output: Does magic number 77 exist within the numerical value of 10,77,90,50,100,110? TRUE

  val findMagicNumberF: (Int) => Boolean = (i) => i == 77
  val numberSeq = Seq(10, 77, 90, 50, 100, 110)
  val boolMagicNumberExists = numberSeq.exists(findMagicNumberF)
  println(s"Does magic number 77 exist within the numerical value of ${numberSeq.mkString(",")}? ${boolMagicNumberExists.toString.toUpperCase()}")

}
