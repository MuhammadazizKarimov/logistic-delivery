import model.Customer;
import model.Delivery;
import model.Product;
import service.*;
import util.CSVExporter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        DeliveryService deliveryService = new DeliveryService();
        StatisticsService staticService =  new StatisticsService();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("\n--- Mahsulot yetkazib Berish Tizimi  ---");
            System.out.println("1. Yangi  yetkazib berish  qo'shish");
            System.out.println("2. Yetkazilganlar ro'yxati");
            System.out.println("3. Statistikani ko'rish");
            System.out.println("4. CSV faylga eksport");
            System.out.println("0. Chiqish");
            System.out.println("Tanlang: ");
            int tanlov  = scanner.nextInt();

            switch (tanlov) {
                case 1 -> {
                    System.out.println("Mahsulot nomi : ");
                    String pname = scanner.nextLine();
                    System.out.println("Mahsulot turi: ");
                    String ptype = scanner.nextLine();
                    System.out.println("Miqdori (kg)");
                    double qty = scanner.nextDouble(); scanner.nextLine();

                    System.out.println("Mijoz ismi: ");
                    String cname = scanner.nextLine();
                    System.out.println("Mijoz manzili: ");
                    String caddress = scanner.nextLine();

                    System.out.println("Transport vositasi: ");
                    String transport = scanner.nextLine();

                    Product product = new Product(pname, ptype,qty);
                    Customer customer = new Customer(cname, caddress);
                    Delivery delivery = new Delivery(product, customer, transport, LocalDateTime.now());

                    deliveryService.addDelivery(delivery);
                    System.out.println("Yetakizb berish  qo'shildi ");
                }
                case 2 -> {
                    List<Delivery> list = deliveryService.getAll();
                    System.out.println("Yetkazilgan ro'yxati: ");
                    for(Delivery d : list){
                        System.out.println(d.getProduct().getName() + " -> " + d.getCustomer().getName() + "[" + d.getDeliveryDate() + "]" );
                    }
                }
                case 3 -> staticService.printStats(deliveryService.getAll());
                case 4 -> CSVExporter.export(deliveryService.getAll(), "deliveries.csv");
                case 0 -> {
                    System.out.println("Dasturdan chiqildi.");
                    return;
                }
                default -> System.out.println("! Noto'g'ri  tanlov !");
            }
        }





    }
}