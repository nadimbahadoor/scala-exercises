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
object ClassFxTraits_18 extends App {

  // 18: Write a Scala program and use a case class to represent a Vehicle type with a name property.
  // Define a trait named VehicleInventory that will define the methods only - that is, without any
  // implementations - for typical Create, Read, Update, and Delete (CRUD) methods nsmed create(), read()
  // update(), and delete(). Each of the aforementioned methods will have as input parameter
  // a Vehicle type, and will have no return type. Next, extend the VehicleInventory trait
  // trait with a class named VehicleInventorySystem that will, of course, provide
  // implementation details to the create(), read(), update(), and delete() methods from the
  // VehicleInventory trait. Then, create an object, or instance, of the Vehicle type for a
  // "bmw car 5 series", along with an object, or instance, of the VehicleInventorySystem,
  // and pass-through the Vehicle object to the create(), read(), update(), and delete() methods
  // of the VehicleInventorySystem object.
  // Output:
//  Create vehicle = Vehicle(bmw car 5 series)
//  Read vehicle = Vehicle(bmw car 5 series)
//  Update vehicle = Vehicle(bmw car 5 series)
//  Delete vehicle = Vehicle(bmw car 5 series)

  case class Vehicle(name: String)

  trait VehicleInventory {
    def create(vehicle: Vehicle): Unit
    def read(vehicle: Vehicle): Unit
    def update(vehicle: Vehicle): Unit
    def delete(vehicle: Vehicle): Unit
  }

  class VehicleInvetorySystem extends VehicleInventory {
    override def create(vehicle: Vehicle): Unit = {
      println(s"Create vehicle = $vehicle")
    }

    override def read(vehicle: Vehicle): Unit = {
      println(s"Read vehicle = $vehicle")
    }

    override def update(vehicle: Vehicle): Unit = {
      println(s"Update vehicle = $vehicle")
    }

    override def delete(vehicle: Vehicle): Unit = {
      println(s"Delete vehicle = $vehicle")
    }
  }

  val carBmw5 = Vehicle("bmw car 5 series")

  val vehicleInventorySystem = new VehicleInvetorySystem()
  vehicleInventorySystem.create(carBmw5)
  vehicleInventorySystem.read(carBmw5)
  vehicleInventorySystem.update(carBmw5)
  vehicleInventorySystem.delete(carBmw5)




}
