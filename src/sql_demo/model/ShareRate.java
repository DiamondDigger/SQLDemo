package sql_demo.model;

import java.time.LocalDateTime;

public class ShareRate extends BaseModel {
    private LocalDateTime operationDate;
    private long share;
    private double rate;

    public ShareRate() {
    }

    public ShareRate(LocalDateTime operationDate, long share, double rate) {
        this.operationDate = operationDate;
        this.share = share;
        this.rate = rate;
    }

    public LocalDateTime getOperationDate() {
        return operationDate;
    }

    public void setOperationDate(LocalDateTime operationDate) {
        this.operationDate = operationDate;
    }

    public long getShare() {
        return share;
    }

    public void setShare(long share) {
        this.share = share;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
