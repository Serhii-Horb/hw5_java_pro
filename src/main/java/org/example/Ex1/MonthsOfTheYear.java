package org.example.Ex1;

/* 1) Создайте класс Enum для хранения перечня  месяцев в году.
Кроме костантных значений, в нем должен также сохраняться русское наименование месяца.
Напишите метод, который будет рекомендовать вам режим питания, в зависимости от текущего месяца и сезона года. */

public enum MonthsOfTheYear {
    JANUARY("Январь"),
    FEBRUARY("Февраль"),
    MARCH("Март"),
    APRIL("Апрель"),
    MAY("Май"),
    JUNE("Июнь"),
    JULY("Июль"),
    AUGUST("Август"),
    SEPTEMBER("Сентябрь"),
    OCTOBER("Октябрь"),
    NOVEMBER("Ноябрь"),
    DECEMBER("Декабрь"),
    PROBE("Проверка");

    private String title;

    MonthsOfTheYear(String title) {
        this.title = title;
    }

    public static void main(String[] args) {
        MonthsOfTheYear months1 = MonthsOfTheYear.JANUARY;
        months1.nutritionalRecommendation(months1);

        MonthsOfTheYear months2 = MonthsOfTheYear.APRIL;
        months2.nutritionalRecommendation(months2);

        MonthsOfTheYear months3 = MonthsOfTheYear.JULY;
        months3.nutritionalRecommendation(months3);

        MonthsOfTheYear months4 = MonthsOfTheYear.OCTOBER;
        months4.nutritionalRecommendation(months4);

        MonthsOfTheYear months5 = MonthsOfTheYear.PROBE;
        months5.nutritionalRecommendation(months5);
    }

    public void nutritionalRecommendation(MonthsOfTheYear months) {
        switch (months) {
            case JANUARY, FEBRUARY, DECEMBER -> System.out.println("Зима нужно кушать витамины!");
            case MARCH, APRIL, MAY -> System.out.println("Уже весна но всё равно нужны витамины!");
            case JUNE, JULY, AUGUST -> System.out.println("Лето жара нужно много пить и можно не есть!");
            case OCTOBER, NOVEMBER, SEPTEMBER -> System.out.println("Опять осень ничего не поможет иди в аптеку!");
            default -> System.out.println("Не помогло ты заболел!");
        }
    }
}
