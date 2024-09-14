package ru.mirea.task4;

public class Main {
    public static void main(String[] args) {
        Seasons favoriteSeason = Seasons.SUMMER;
        System.out.println("Любимое время года: " + favoriteSeason);
        System.out.println("Средняя температура: " + favoriteSeason.getAverageTemp() + "°C");
        System.out.println("Описание: " + favoriteSeason.getDescription());

        printSeasonMessage(favoriteSeason);

        for (Seasons season: Seasons.values()){
            System.out.printf("%s: Средняя температура = %d°C, описание = %s\n",
                    season, season.getAverageTemp(), season.getDescription());
        }

    }

    public static void printSeasonMessage(Seasons season) {
        switch (season) {
            case WINTER -> System.out.println("Я люблю зиму");
            case SPRING -> System.out.println("Я люблю весну");
            case SUMMER -> System.out.println("Я люблю лето");
            case AUTUMN -> System.out.println("Я люблю осень");
        }
    }
}
