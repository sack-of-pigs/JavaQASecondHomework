public class Main {
    public static void main(String[] args) {
        // Стоимость билета в рублях
        int ticketPrice = 13676;

        // Рассчитываем количество начисляемых миль
        // За каждые 20 рублей — 1 миля; дробные мили не начисляются (целочисленное деление)
        int bonusMiles = ticketPrice / 20;

        // Выводим результат
        System.out.println("Стоимость билета: " + ticketPrice + " рублей");
        System.out.println("Начислено бонусных миль: " + bonusMiles);
    }
}
