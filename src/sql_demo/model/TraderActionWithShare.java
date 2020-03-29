package sql_demo.model;

import java.time.LocalDateTime;

public class TraderActionWithShare extends BaseModel {

    public static final int OPERATION_BUY =1;
    public static final int OPERATION_SELL =2;

    private LocalDateTime operationDate;
    private int operation;
    private long trader;
    private long share;
    private long amount;

    public TraderActionWithShare() {
    }

    public TraderActionWithShare(LocalDateTime operationDate, int operation, long trader, long share, long amount) {
        this.operationDate = operationDate;
        this.operation = operation;
        this.trader = trader;
        this.share = share;
        this.amount = amount;
    }

    public LocalDateTime getOperationDate() {
        return operationDate;
    }

    public void setOperationDate(LocalDateTime operationDate) {
        this.operationDate = operationDate;
    }

    public int getOperation() {
        return operation;
    }

    public void setOperation(int operation) {
        this.operation = operation;
    }

    public long getTrader() {
        return trader;
    }

    public void setTrader(long trader) {
        this.trader = trader;
    }

    public long getShare() {
        return share;
    }

    public void setShare(long share) {
        this.share = share;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }
}