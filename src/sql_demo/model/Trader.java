package sql_demo.model;

import java.math.BigDecimal;

public class Trader extends BaseModel{

    public static final int METHOD_SELL_ALL_BUY_CHEAP = 1;
    public static final int METHOD_SELL_EXPENSIVE_BUY_CHEAP = 2;
    public static final int METHOD_SELL_RANDOM_BUY_RANDOM = 3;


    private String name;
    private int freqPerDay;
    private BigDecimal cash;
    private int tradingMethod;

    public Trader(long id, String name, int freqPerDay, BigDecimal cash, int tradingMethod) {
        super(id);
        this.name = name;
        this.freqPerDay = freqPerDay;
        this.cash = cash;
        this.tradingMethod = tradingMethod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFreqPerDay() {
        return freqPerDay;
    }

    public void setFreqPerDay(int freqPerDay) {
        this.freqPerDay = freqPerDay;
    }

    public BigDecimal getCash() {
        return cash;
    }

    public void setCash(BigDecimal cash) {
        this.cash = cash;
    }

    public int getTradingMethod() {
        return tradingMethod;
    }

    public void setTradingMethod(int tradingMethod) {
        this.tradingMethod = tradingMethod;
    }
}
