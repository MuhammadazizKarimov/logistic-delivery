package repository;

import model.Delivery;

import java.util.ArrayList;
import java.util.List;

public class DeliveryRepository {

    private List<Delivery> deliveryList = new ArrayList<>();

    // 🟢 Qo‘shish
    public void addDelivery(Delivery delivery) {
        deliveryList.add(delivery);
    }

    // 🟢 Barcha yetkazib berishlarni olish
    public List<Delivery> getAllDeliveries() {
        return deliveryList;
    }

    // 🔴 O‘chirish (id yoki index asosida - hozircha oddiy index)
    public void removeDelivery(int index) {
        if (index >= 0 && index < deliveryList.size()) {
            deliveryList.remove(index);
        } else {
            System.out.println("❗ Noto‘g‘ri index!");
        }
    }

    // 🔁 Yangilash (misol uchun, transportni yangilash)
    public void updateTransport(int index, String newTransport) {
        if (index >= 0 && index < deliveryList.size()) {
            deliveryList.get(index).setTransport(newTransport);
        } else {
            System.out.println("❗ Noto‘g‘ri index!");
        }
    }
}
