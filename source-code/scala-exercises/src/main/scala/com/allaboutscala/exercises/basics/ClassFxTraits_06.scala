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
object ClassFxTraits_06 extends App {

  // 6: Write a Scala program which defines a method named "toUpper" and it accepts
  // a String as input parameter that is then formatted to upper case as output.
  // Define another method named "toLower" which accepts a String as input parameter
  // and formats the input to lower case as output. Define another method named
  // "formatNames" which also has an input String called "name". This method however
  // has a parameter group which accepts a functions with an input of type String and
  // also outputs a String. This particular function will be used to apply the
  // given format to the "name" input. You can use the test inputs for, say, "Bob",
  // "Joe", and "Jack", and make sure that the output is as shown below.
  // Output:
//  BOB
//  joe
//  JACK


  def toUpper(s: String): String = {
    s.toUpperCase()
  }

  def toLower(s: String): String = {
    s.toLowerCase()
  }

  def formatNames(name: String)(func: String => String): String = {
    func(name)
  }

  println(formatNames("Bob")(toUpper(_)))
  println(formatNames("Joe")(toLower(_)))
  println(formatNames("Jack")(toUpper(_)))
}
