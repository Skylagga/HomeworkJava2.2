public class Main {
    public static void main(String[] args) {

        int amount = 35;
        int refill = 1235;
        int bonus = refill / 100;
        if (refill < 1000)
            bonus = 0;


        System.out.println("Баллов зачисленно: " + bonus);

        int total = amount + bonus + refill;
        if (bonus < 1)
            total = amount + refill;

        System.out.println("Итоговый счет: " + total);

    }
}
