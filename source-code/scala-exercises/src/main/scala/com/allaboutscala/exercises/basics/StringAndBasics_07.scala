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
object StringAndBasics_07 extends App {

  // 7. Create a Scala program to output your name and favorite movie.
  // Output:
  /**
    * First Name: Nadim
    * Last Name: Bahadoor
    * Favorite Movie: The Matrix
    */

    val firstName = "Nadim"
    val lastName = "Bahadoor"
    val favoriteMovie = "The Matrix"
    val output =
      s"""
         | First Name: $firstName
         | Last Name: $lastName
         | Favorite Movie: $favoriteMovie
       """.stripMargin

    println(output)

}
