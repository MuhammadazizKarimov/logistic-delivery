package service;

import model.Delivery;
import repository.DeliveryRepository;

import java.util.List;

public class DeliveryService {

    private DeliveryRepository repository = new DeliveryRepository();

    public void addDelivery(Delivery delivery) {
        repository.addDelivery(delivery);
    }

    public List<Delivery> getAll() {
        return repository.getAllDeliveries();
    }

    public void removeDelivery(int index) {
        repository.removeDelivery(index);
    }

    public void updateDeliveryTransport(int index, String newTransport) {
        repository.updateTransport(index, newTransport);
    }
}

