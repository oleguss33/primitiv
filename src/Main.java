public class Main {
    public static void main(String[] args) {
        // Исходные данные: измените эти переменные для тестирования
        int initialBalance = 100; // начальный счёт клиента
        int topUpAmount = 1100;   // сумма пополнения

        int bonus = 0;            // переменная для бонусных рублей
        int totalBalance = initialBalance + topUpAmount; // итоговый баланс

        // Проверяем, превысила ли сумма пополнения 1000 рублей
        if (topUpAmount > 1000) {
            // Вычисляем бонус: по 1 рублю за каждые полные 100 рублей
            bonus = topUpAmount / 100;
            totalBalance += bonus; // добавляем бонус к итоговому балансу
        }

        // Выводим результат
        System.out.println("Итоговый счёт: " + totalBalance + " рублей");
        System.out.println("Бонусных рублей: " + bonus);
    }
}