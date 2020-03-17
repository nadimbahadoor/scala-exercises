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
object ClassFxTraits_24 extends App {

  // 24: This Scala exercise is yet another example of Scala's built-in support
  // for dependency injection, and we will reuse some of the constructs from the earlier
  // Scala exercises that you are already familiar with, such as, the abstract class Vehicle,
  // the case class Car, and the case class Bike. Next, create a new class named VehicleInventorService
  // that has a type parameter for all sub-types of Vehicle. It will define a checkStock() method
  // with an input parameter of the same type as the class's type parameter. Then, create
  // a VehiclePricingService class that also has a type parameter for all sub-types of Vehicle.
  // It will define a checkPrice() method with an input parameter of the same type as the class's
  // type parameter. Use these new above-mentioned classes, and create two lazy objects, or instances,
  // in a new trait named VehicleServices with a type parameter for all sub-types of Vehicle. You
  // can think of this VehicleServices trait as a layer for encapsulating all the given service layers
  // for a particular vehicle system. Naturally, next, we define the VehicleSystem trait which also
  // has a type parameter for all sub-types of Vehicle. It however uses the self-type approach in Scala,
  // to narrow down the - this: - to the VehicleServices trait above. Of course, any instance of
  // the VehicleSystem trait will have to, inject, or mixin, VehiclesServices. It further
  // defines a buyVehicle() method that logically calls the checkStock() method from the
  // VehicleInventoryService, and the checkPrice() of the VehiclePricingService, respectively.
  // To use the above layers, create a singleton object named VehicleApp that will extend
  // the VehicleSystem and inject, or mixin, the VehiclesServices trait, for the Vehicle type.
  // Finally, call the buyVehicle() method of the VehicleApp for a given Car "mazda 3 series" ,
  // and a bike "honda bike firestorm".
  // Output:
//  buying vehicle Car(mazda 3 series)
//  checking stock for vehicle = Car(mazda 3 series)
//  checking price for vehicle = Car(mazda 3 series)
//  buying vehicle Bike(honda bike firestorm)
//  checking stock for vehicle = Bike(honda bike firestorm)
//  checking price for vehicle = Bike(honda bike firestorm)


  abstract class Vehicle(name: String)
  case class Car(name: String) extends Vehicle(name)
  case class Bike(name: String) extends Vehicle(name)

  class VehicleInventoryService[V <: Vehicle] {
    def checkStock(vehicle: V): Unit = {
      println(s"checking stock for vehicle = $vehicle")
    }
  }

  class VehiclePricingService[V <: Vehicle] {
    def checkPrice(vehicle: V): Unit = {
      println(s"checking price for vehicle = $vehicle")
    }
  }

  trait VehicleServices[V <: Vehicle] {
      lazy val vehicleInventoryService = new VehicleInventoryService[V]
      lazy val vehiclePricingService = new VehiclePricingService[V]
  }

  trait VehicleSystem[V <: Vehicle] {
    this: VehicleServices[V] =>

    def buyVehicle(vehicle: V): Unit = {
      println(s"buying vehicle $vehicle")
      vehicleInventoryService.checkStock(vehicle)
      vehiclePricingService.checkPrice(vehicle)
    }
  }


  object VehicleApp extends VehicleSystem[Vehicle] with VehicleServices[Vehicle]

  VehicleApp.buyVehicle(Car("mazda 3 series"))
  VehicleApp.buyVehicle(Bike("honda bike firestorm"))

}
