public class Main {
    public static void main(String[] args) {
        // Стоимость билета (например, 13676 рублей)
        int ticketPrice = 13676;

        // Количество рублей, за которые начисляется 1 миля (20 рублей)
        int rublesPerMile = 20;

        // Расчет количества бонусных миль
        int bonusMiles = ticketPrice / rublesPerMile;

        // Вывод результата
        System.out.println("Количество начисленных миль: " + bonusMiles);
    }
}