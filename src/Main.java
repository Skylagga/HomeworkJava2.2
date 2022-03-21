public class Main {
    public static void main(String[] args) {

        int amount = 30;
        int refill = 1001;
        int bonus;

        if (refill > 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }


        System.out.println("Баллов зачисленно: " + bonus);

        int total = amount + bonus + refill;
        if (bonus < 1)
            total = amount + refill;

        System.out.println("Итоговый счет: " + total);

    }
}
