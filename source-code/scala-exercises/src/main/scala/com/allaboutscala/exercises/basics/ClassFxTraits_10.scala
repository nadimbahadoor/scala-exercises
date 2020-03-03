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
object ClassFxTraits_10 extends App {

  // 10: Write a Scala program to simulate a very basic car inventory. In doing so,
  // use a case class to represent a Car type that needs to have a name property of type
  // String, and a price property of type Double. Thereafter you should define an
  // aliased type named CarStock that will in effect, alias, Scala's Tuple2 type
  // and represent a tuple or pair of Car and Int. The former is obviously the above-mentioned
  // Car type, and the Int type represents the current stock inventory for a particular Car item.
  // You should then define a create the following car stock items, and use an appropriate
  // data structure from Scala's Collection types.
  // - a vw passat with price of 10,000 and stock of 100
  // - a vw golf with price of 12,000 and stock of 50
  // - a bmw 3 series with price of 20,000 and stock of 200
  // - a bmw 5 series with price of 50,000 and stock of 75
  // - a mazda 3 series with price of 15,000 and stock of 49
  // Create a method named orderByLowestStock which will have as input the Collection
  // data structure of cars to stock, and will order the car items from the collection
  // by the lowest or minimum stock quantity.
  // Output:


  final case class Car(name: String, price: Double)

  type CarStock = Tuple2[Car, Int]

  val vwPassatStock = new CarStock(Car("vw passat", 10000), 100)
  val vwGolfStock = new CarStock(Car("vw golf", 12000), 50)
  val bmw3Stock = new CarStock(Car("bmw 3 series", 20000), 200)
  val bmw5Stock = new CarStock(Car("bmw 5 series", 50000), 75)
  val mazdaStock = new CarStock(Car("mazda 3", 15000), 49)

  val carInventory = List(vwPassatStock, vwGolfStock, bmw3Stock, bmw5Stock, mazdaStock)

  def orderByLowestStock(inventory: List[CarStock]): Unit = {
    inventory
      .sortBy(_._2)
      .foreach { case (car, stock) =>
        println(s"${car.name} stock = $stock")
      }
  }

  println("Cars sorted by lowest stock: ")
  orderByLowestStock(carInventory)
}
