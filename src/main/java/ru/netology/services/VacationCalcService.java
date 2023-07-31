package ru.netology.services;

public class VacationCalcService {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0; // количество денег на счету
        int vacation = 0; // счетчик месяцев отдыха
        for (int month = 0; month < 12; month++) {
            if (money > threshold) {
                money = (money - expenses) / 3;
                vacation++;
            } else {
                money = money + income - expenses;
            }

        }
        return vacation;
    }
}
