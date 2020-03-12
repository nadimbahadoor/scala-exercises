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
object ClassFxTraits_19 extends App {

  // 19: Write a Scala program and use an abstract class to define a Vehicle type with a name
  // property. Next, create two case classes, named, Car, and Bike, to model a given Vehicle -
  // using, of course, the Vehicle type. Create a trait named VehicleInventory that has a type
  // parameter, V, and will define the methods only - that is, methods without implementations -
  // to model a typical create(), read(), update(), and delete(), CRUD operations. Each of these
  // CRUD methods will have an input parameter for a given vehicle, where the type is based
  // from the trait's type parameter. Using the VehicleInventory trait, create a class named
  // VehicleInventorySystem that implements all the CRUD methods of the base VehicleInventory trait.
  // Next, create objects, or instances, for the following cars, and bikes:
  // - bmw car 5 series
  // - mazda car 3 series
  // - honda bike firestorm
  // - bmw bike r 2000
  // With the above objects created, create an object, or instance, of the VehicleInventorySystem,
  // and pass-through the bmw car to the create() method, the mazda car to the read() method,
  // the honda bike to the update() method, and the bmw bike to the delete method. The output for your
  // Scala program should be as follows:
  // Output:
//  Create vehicle = Car(bmw car 5 series)
//  Read vehicle = Car(mazda car 3 series)
//  Update vehicle = Bike(honda bike firestorm)
//  Delete vehicle = Bike(bmw bike r 2000)

  abstract class Vehicle(name: String)
  case class Car(name: String) extends Vehicle(name)
  case class Bike(name: String) extends Vehicle(name)

  trait VehicleInventory[V] {
    def create(vehicle: V): Unit
    def read(vehicle: V): Unit
    def update(vehicle: V): Unit
    def delete(vehicle: V): Unit
  }

  class VehicleInvetorySystem[V] extends VehicleInventory[V] {
    override def create(vehicle: V): Unit = {
      println(s"Create vehicle = $vehicle")
    }

    override def read(vehicle: V): Unit = {
      println(s"Read vehicle = $vehicle")
    }

    override def update(vehicle: V): Unit = {
      println(s"Update vehicle = $vehicle")
    }

    override def delete(vehicle: V): Unit = {
      println(s"Delete vehicle = $vehicle")
    }
  }

  val carBmw5 = Car("bmw car 5 series")
  val carMazda5 = Car("mazda car 3 series")
  val bikeHonda = Bike("honda bike firestorm")
  val bikeBmwR = Bike("bmw bike r 2000")

  val vehicleInventorySystem = new VehicleInvetorySystem[Vehicle]()
  vehicleInventorySystem.create(carBmw5)
  vehicleInventorySystem.read(carMazda5)
  vehicleInventorySystem.update(bikeHonda)
  vehicleInventorySystem.delete(bikeBmwR)

}
