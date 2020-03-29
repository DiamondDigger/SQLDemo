package sql_demo.model;

public class BaseModel {
    protected long id;

    BaseModel(){}

    public BaseModel(long id) {
        this.id = id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
