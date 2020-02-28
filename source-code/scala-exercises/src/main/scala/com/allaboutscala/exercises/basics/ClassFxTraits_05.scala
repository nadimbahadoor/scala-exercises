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
object ClassFxTraits_05 extends App {

  // 5. Write a Scala program and define the following Partial Functions. The first will be
  // called "nameIsJohn" and it will have a String input parameter, and will output true only
  // for the String literal "John". This partial function will not have any other matching clauses.
  // The second partial function will be called "nameIsJoe" and it will have a String input parameter,
  // and will output true only for the String literal "Joe". Similar to the previous partial function,
  // it will not have any other matching clauses. The third partial function will be called "nameIsJackOrJill"
  // and it will output true for String literals of "Jack" or "Jill". Likewise to the previous
  // partial functions, it will not have any other matching clauses. The final partial function
  // will output false for all String inputs. Using the above-mentioned partial functions,
  // combined them into a single partial function that match this particular type: PartialFunction[String, Boolean].
  // Using the combined single partial function, test the following name inputs to produce
  // the resulting output as shown below.
  // Output:
//  Name John is valid = true
//  Name Jack is valid = true
//  Name Bob is valid = false


  val nameIsJohn: PartialFunction[String, Boolean] = {
    case "John" => true
  }

  val nameIsJoe: PartialFunction[String, Boolean] = {
    case "Joe" => true
  }

  val nameIsJackOrJill: PartialFunction[String, Boolean] = {
    case "Jack" | "Jill" => true
  }

  val invalidName: PartialFunction[String, Boolean] = {
    case _ => false;
  }

  val nameValidator = nameIsJohn orElse nameIsJoe orElse nameIsJackOrJill orElse invalidName
  println(s"Name John is valid = ${nameValidator("John")}")
  println(s"Name Jack is valid = ${nameValidator("John")}")
  println(s"Name Bob is valid = ${nameValidator("Bob")}")



}
