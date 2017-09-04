package com.marcinjc.typygeneryczne;

public class BoxForFigures<T extends Figure> {
    private T element;

    public BoxForFigures(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    public String getElementName() {
        return element.getName();
    }

    public static void main(String[] args) {
        BoxForFigures<Circle> circleBox = new BoxForFigures<>(new Circle());
        //BoxForFigures<Apple> appleBox; // complilation error
    }
}


