import java.util.*;

class TransactionService {
    enum Type {PAYMENT, REFUND}

    static class TransactionData {
        final Type type;
        final String currency;
        final Long amount;

        TransactionData(Type type,
                        String currency,
                        Long amount) {
            this.type = type;
            this.currency = currency;
            this.amount = amount;
        }

        String getCurrency() {
            return currency;
        }

        Long getAmount() {
            return amount;
        }

        Type getType() {
            return type;
        }
    }

    // метод для поиска среднего арифметического значения транзакций в списке
    public double middleForTheCurrency(List<TransactionData> list) {
        double count = 0;
        for (TransactionData tr : list) count += tr.getAmount();
        return (count / list.size());
    }

    // формирование списка: на вход подается транзакция и тип валюты; если операция «возврат» и тип валюты равен указанному, то в список добавляется транзакция.
    public List<TransactionData> listForming(TransactionData tr, Currency cur) {
        List<TransactionData> list = new ArrayList<>();
        if ((tr.getType().toString().equals(Type.REFUND.toString())) &&
                (tr.getCurrency().equals(cur.toString())))
            list.add(tr);
        return list;
    }

    //метод для создания ассоциативного массива
    public HashMap<String, Double> keyValue(List<TransactionData> list, double middle) {
        HashMap<String, Double> hash = new HashMap<>();
        hash.put(list.get(0).getCurrency(), middle);
        return hash;
    }
    // TODO: метод, который позволяет упорядочить ср. арифм. значения по валютам
    public TreeMap<String, Double> Order(HashMap<String, Double> map){
        return new TreeMap<>(map);
    }


    /**
     * @param transactionDataList список транзакций
     * @return Map, где ключи - это валюты, которые хранятся в алфавитном порядке,
     * а значение – это среднее значение всех транзакций типа REFUND в данной валюте
     * Пример входных данных:
     * [
     * Transaction(REFUND, "EUR", 2000),
     * Transaction(REFUND, "USD", 15),
     * Transaction(REFUND, "RUB", 200),
     * Transaction(PAYMENT, "RUB", 1250),
     * Transaction(REFUND, "USD", 35),
     * Transaction(PAYMENT, "USD", 55),
     * Transaction(REFUND, "RUB", 100)
     * ]
     * <p>
     * Ожидаемый результат:
     * ["EUR" -> 2000.0, "RUB" -> 150.0, "USD" -> 25.0]
     */
    Map<String, Double> getAverageRefundMapByCurrency(List<TransactionData> transactionDataList) {
        List<TransactionData> listEur = new ArrayList<>();
        List<TransactionData> listUsd = new ArrayList<>();
        List<TransactionData> listRub = new ArrayList<>();
        for (TransactionData td : transactionDataList) {
            listEur.addAll(listForming(td, Currency.getInstance("EUR")));
            listUsd.addAll(listForming(td, Currency.getInstance("USD")));
            listRub.addAll(listForming(td, Currency.getInstance("RUB")));
        }
        double middleEur = middleForTheCurrency(listEur);
        double middleUsd = middleForTheCurrency(listUsd);
        double middleRub = middleForTheCurrency(listRub);
        HashMap<String, Double> map = new HashMap<>();
        map.putAll(keyValue(listEur, middleEur));
        map.putAll(keyValue(listUsd, middleUsd));
        map.putAll(keyValue(listRub, middleRub));
        return Order(map);
    }

    public static void main (String[] args){
        TransactionService transactionService = new TransactionService();
        List<TransactionData> list = Arrays.asList(
                new TransactionData(Type.REFUND, "EUR", 2000L),
                new TransactionData(Type.REFUND, "USD", 15L),
                new TransactionData(Type.REFUND, "RUB", 200L),
                new TransactionData(Type.PAYMENT, "RUB", 1250L),
                new TransactionData(Type.REFUND, "USD", 35L),
                new TransactionData(Type.PAYMENT, "USD", 55L),
                new TransactionData(Type.REFUND, "RUB", 100L));
        System.out.println(transactionService.getAverageRefundMapByCurrency(list));
    }
}