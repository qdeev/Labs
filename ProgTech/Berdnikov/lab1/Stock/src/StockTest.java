public class StockTest {
    public static void main(String[] args) {
        Stock stock = new Stock("SBER", "ПАО Сбербанк");

        stock.setPreviousClosingPrice(281.50);
        stock.setCurrentPrice(282.87);

        System.out.println("Обозначение акций: " + stock.getSymbol());
        System.out.println("Наименование: " + stock.getName());
        System.out.println("Стоимость на момент закрытия предыдущего дня: " + stock.getPreviousClosingPrice());
        System.out.println("Текущая стоимость акций: " + stock.getCurrentPrice());

        double changePercent = stock.getChangePercent();
        System.out.printf("Процент изменения стоимости акций: %.2f%%\n", changePercent);
    }
}