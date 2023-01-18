public class Main {
    public static void main(String[] args) {
        int a = 1;
        byte b = 2;
        short c = 3;
        long d = 4L;
        float e = 5.1f;
        double h = 2.34567890;

        float firstBoxer = 78.2f;
        float secondBoxer = 82.7f;
        float summa = firstBoxer + secondBoxer;
        float minus = secondBoxer - firstBoxer;
        System.out.println("Общий вес двух бойцов " + summa + " кг");
        System.out.println("Разница в весе " + minus + " кг");

        int bananasWeight = 80 * 5;
        int milkWeight = 105 * 2;
        int icecreamsWeight = 100 * 2;
        int eggsWeight = 70 * 4;
        float breakfastWeight = bananasWeight + milkWeight + icecreamsWeight + eggsWeight;
        float kg = breakfastWeight / 1000;
        System.out.println("Вес завтрака " + kg + " кг");

        int purpose = 7 * 1000;
        int purposeOfOneDay = 250;
        int puproseOfOneDay2= 500;
        int daysForPohudenie = purpose / purposeOfOneDay;
        int daysForPohudenie2 = purpose / puproseOfOneDay2;
        int daysVSrednem = (daysForPohudenie + daysForPohudenie2) / 2;
        System.out.println("Дней для похудения , если спортсмен теряет 250 грамм в день - " + daysForPohudenie);
        System.out.println("Дней для похудения , если спортсмен теряет 500 грамм в день - " + daysForPohudenie2);
        System.out.println("Дней в среднем для похудения " + daysVSrednem);

        float mashaZp = 67760f;
        float denisZp = 83690f;
        float kristinaZp = 76230f;
        float mashaZp2 = mashaZp * 1.1f;
        float denisZp2 = denisZp * 1.1f;
        float kristinaZp2 = kristinaZp * 1.1f;
        float godovoiDohodMasha = mashaZp2 * 12 - mashaZp * 12;
        float godovoiDohodDenis = denisZp2 * 12 - denisZp * 12;
        float godovoiDohodKristina = kristinaZp2 * 12 - kristinaZp * 12;
        System.out.println("Маша теперь получает " + mashaZp2 + " рублей. Годовой доход вырос на " + godovoiDohodMasha + " рублей");
        System.out.println("Денис теперь получает " + denisZp2 + " рублей. Годовой доход вырос на " + godovoiDohodDenis + " рублей");
        System.out.println("Кристина теперь получает " + kristinaZp2 + " рублей. Годовой доход вырос на " + godovoiDohodKristina + " рублей");
    }
}