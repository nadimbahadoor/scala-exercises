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
object StringAndBasics_05 extends App {

  // 5. Create a Scala program to calculate the total cost for a customer who is buying 10 Glazed
  // donuts. You can assume that the price of each Glazed donut item is $2.50. Notice the
  // format of the $25.00 total cost literal is essentially at 2 decimal places.
  // Output:
  /**
    * Total cost of 10 Glazed Donuts = $25.00
    */

    val glazedDonut = "Glazed Donut"
    val unitPrice = 2.50
    val qtyPurchased = 10
    val totalCost = qtyPurchased * unitPrice

    println(f"""Total cost of $qtyPurchased $glazedDonut${if (qtyPurchased > 1) "s" else ""} = $$$totalCost%1.2f""")

}
