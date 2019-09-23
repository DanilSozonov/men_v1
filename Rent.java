import java.sql.Date;

public class Rent {
    private Date start;
    private Date end;
    Car car;
    Client client;
    private int cost;

    public Rent(Date start, Date end,Client client, Car car, int cost ){
        this.start = start;
        this.end = end;
        this.client = client;
        this.car = car;
        this.cost = car.getPrice();
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Date getStart() {
        return start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
