package util;

public class CurrencyConverter {

    public static double priceDollar;
    public static double quantifyBuy;
    public static double totalMoney;

    public static double convertReais(double amount) {
        double totalValue, juros;
        totalValue = (priceDollar * amount);
        juros = totalValue * 0.06;
        return totalValue + juros;
    }


}
