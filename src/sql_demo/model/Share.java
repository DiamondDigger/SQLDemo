package sql_demo.model;

import java.math.BigDecimal;

public class Share extends BaseModel{

    private String name;
    private BigDecimal startPrice;
    private int changeProbability;
    private int delta;


    public Share() {
    }

    public Share(long id,String name, BigDecimal startPrice, int changeProbability, int delta) {
        super (id);
        this.name = name;
        this.startPrice = startPrice;
        this.changeProbability = changeProbability;
        this.delta = delta;
    }
}
