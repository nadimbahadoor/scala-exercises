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
object StringAndBasics_08 extends App {


  // 8. Create a Scala program to parse the corresponding values in a String "Vanilla Donut 10 2.25", where the literal
  // Vanilla Donut is a particular donut, the 10 literal is the quantity purchased, and 2.25 is the unit price of each
  // Vanilla Donut. You further need to cast each token from the input String to their corresponding types, such as, an Int,
  // Double or String.
  // Suggested output:
  /**
    * Donut Name:       Vanilla Donut
    * Donut Price:      $2.25
    * Donut Purchased:  10
    *
    */
    val donutBoughtStr = "Vanilla Donut 10 2.25"
    val splitStr = donutBoughtStr.split(" ")
    val donutType = splitStr(0)
    val donutName = splitStr(1)
    val donutQty = splitStr(2).toInt
    val donutPrice = splitStr(3).toDouble
    val donutOutput =
      s"""
        |Donut Name:      $donutType $donutName
        |Donut Price:     $$$donutPrice
        |Donut Purchased: $donutQty
      """.stripMargin
    println(donutOutput)

}
