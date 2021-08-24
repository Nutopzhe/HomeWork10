package ru.rybakov.nikolay;

import java.util.Random;

public class Casino {

    @MyAnnotation(name = "Покер")
    public int poker() {
        return calculateWinOrLose();
    }

    @MyAnnotation(name = "Рулетка")
    public int roulette() {
        return calculateWinOrLose();
    }

    public int slotMachine() {
        return calculateWinOrLose();
    }

    public int blackJack() {
        return calculateWinOrLose();
    }

    @MyAnnotation(name = "Колесо Фортуны")
    public int wheelFortune() {
        return calculateWinOrLose();
    }

    public int baccarat() {
        return calculateWinOrLose();
    }

    //метод, который генерирует выигрыш или проигрыш и выводит на экран сумму
    //также метод возвращает int - баланс выигрыша или проигрыша
    private int calculateWinOrLose() {
        String winOrLose = Math.random() > 0.15 ? "Проигрыш" : "Выигрыш";
        int count;
        if (winOrLose.equals("Проигрыш"))
            count = new Random().nextInt(5000);
        else
            count = new Random().nextInt(10000);

        System.out.printf(": %s = %d\n", winOrLose, count);
        return count;
    }
}
