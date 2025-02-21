package sealedswitch;

//ERROR: Sealed class must have subclasses
//sealed class Vehicle {}

sealed class Vehicle permits Car, Truck, Lorry, MarketLorry {}

final class Car extends Vehicle {}
final class Truck extends Vehicle {}

// 'Submarine' is not allowed in the sealed hierarchy, it is not in permits of Vehicle
//final class Submarine extends Vehicle{}


// ERROR: Sealed class must have subclasses
//sealed interface VehicleInterface {}

sealed interface VehicleInterface permits Auto, Automobile {}

final class Auto implements VehicleInterface {}
final class Automobile implements VehicleInterface {}