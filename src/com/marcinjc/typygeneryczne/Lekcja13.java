package com.marcinjc.typygeneryczne;

public class Lekcja13 {
    BoxOnSteroids<Orange> boxOfOranges = new BoxOnSteroids<Orange>(new Orange());

    Pair<BoxOnSteroids<Orange>, BoxOnSteroids<Apple>> pairOfBoxes =
            new Pair<>(
                    new BoxOnSteroids<>(new Orange()),
                    new BoxOnSteroids<>(new Apple())
            );

    public static void main(String[] args) {
        FancyBox<String> box = new FancyBox<>("something");
        box.saySomethingFancy();
    }

    private static void method1(FancyBox<?> box) {
        Object object = box.object;
        System.out.println(object);
    }

    private static void plainWildcard() {
        method1(new FancyBox<>(new Object()));
        method1(new FancyBox<>(new Square()));
        method1(new FancyBox<>(new Apple()));
    }

    private static void method2(FancyBox<? extends Figure> box) {
        Figure figure = box.object;
        System.out.println(figure);
    }

    private static void method3(FancyBox<Figure> box) {
        Figure figure = box.object;
        System.out.println(figure);
    }

    private static void upperBoundWildcard() {
        method2(new FancyBox<>(new Square()));
        method2(new FancyBox<>(new Circle()));
        //method3(new FancyBox<Square>(new Square())); // compilation error
    }

    private static void method4(FancyBox<? super Rectangle> box) {
        box.object = new Square();
        //box.object = new Circle(); // compilation error
    }

    private static void lowerBoundWildcard() {
        method4(new FancyBox<>(new Rectangle()));
        method4(new FancyBox<Figure>(new Rectangle()));
        method4(new FancyBox<>(new Object()));
        //method4(new FancyBox<Square>(new Square())); // compilation error
    }
}

