//package sealedswitch;
//
///*
//* /home/emzy/IdeaProjects/java-features/src/main/java/sealedswitch/Main.java:10:18
//java: patterns in switch statements are not supported in -source 17
//  (use -source 21 or higher to enable patterns in switch statements) :(
//* */
//public class Main {
//    public static void main(String[] args) {
//        Lorry lorry = new Lorry();
//    }
//
//    Vehicle getVehicle(Vehicle vehicle) {
//        return switch (vehicle) {
//            case Car c -> c;
//            case Lorry l -> l;
//            case Truck c -> c;
//            case MarketLorry c -> c;
//
//            default -> throw new IllegalStateException("Unexpected value: " + vehicle);
//        };
//    }
//
//    //Interface no default needed if all cases are covered
//    VehicleInterface getVehicleInterface(VehicleInterface v) {
//        return switch (v) {
//            case Auto auto -> auto;
//            case Automobile automobile -> automobile;
//        };
//    }
//
//    public sealed interface OtherResult permits Pending, Timeout {
//        void message();
//    }
//
//    public final class Pending implements OtherResult {
//        @Override
//        public void message() {
//            System.out.println("Pending!");
//        }
//    }
//
//    public final class Timeout implements OtherResult {
//        @Override
//        public void message() {
//            System.out.println("Timeout!");
//        }
//    }
//
//    private static void checkResult(OtherResult result) {
//        switch (result) {
//            case Pending p -> p.message();
//            case Timeout t -> t.message();
//        }
//    }
//
//    public sealed class Shape permits Circle, Rectangle, Square {
//    }
//
//    public final class Circle extends Shape {
//    }
//
//    public sealed class Rectangle extends Shape
//            permits TransparentRectangle, FilledRectangle {
//    }
//
//    public final class TransparentRectangle extends Rectangle {
//    }
//
//    public final class FilledRectangle extends Rectangle {
//    }
//
//    public non-sealed class Square extends Shape {
//    }
//
//    Shape rotate(Shape shape, double angle) {
//        return switch (shape) {   // pattern matching switch
//            case Circle c -> c;
//            case Rectangle r -> r;
//            case Square s -> s;
//            default -> throw new IllegalStateException("Unexpected value: " + shape);
//        };
//    }
//
//}
