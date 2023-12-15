package org.example;
import lombok.Data;
import org.example.impl.Space;

@Data  // Аннотация Lombok
public class office extends AbstractSpace {
    private double square;
    private int quantity;


    // Константы для значений по умолчанию
    private static final int DEFAULT_ROOMS = 2;
    private static final double DEFAULT_SQUARE = 50.0;
    public static int length;

    // Конструктор 1 по умолчанию
    public office() {
        square = DEFAULT_SQUARE;
        quantity = DEFAULT_ROOMS;
    }

    // Конструктор 2 с указанной площадью и 2 комнатами
    public office(double square) {
        this.square = square;
        quantity = DEFAULT_ROOMS;
    }

    // Конструктор 3 с указанной площадью и количеством комнат
    public office (double square, int quantity) {
        this.square = square;
        this.quantity = quantity;
    }

    // Метод для получения площади квартиры
    public double getSquare() {
        return square;
    }

    // Метод для изменения площади квартиры
    public void setSquare(double square) {
        this.square = square;
    }

    // Метод для получения количества комнат в квартире
    public int getQuantity() {
        return quantity;
    }

    // Метод для изменения количества комнат в квартире
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getRooms() {
        return 0;
    }
}

class Office implements Space {
    private int square;
    private int quantity;

    @Override
    public int getSquare() {
        return square;
    }

    @Override
    public void setSquare(int square) {
        this.square = square;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
