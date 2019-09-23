import java.util.List;

public class CarShearing{
    private String name;

    private List <Client> clients;
    private List<Car> cars;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public List<Client> getClients() {
        return clients;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public void addClient(Client client) {
        if (!clients.contains(client)) {
            clients.add(client);
        }
    }

    public void addCar(Car car){
        if(!cars.contains(car)){
            cars.add(car);
        }
    }
}