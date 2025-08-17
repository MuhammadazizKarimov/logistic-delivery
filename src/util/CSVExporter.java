package util;

import model.Delivery;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class CSVExporter {
    public static void export(List<Delivery> deliveries,String filename){
        try (FileWriter writer = new FileWriter(filename)){
            writer.write("Product, Type , Quantity, Customer, Address,Transport,Date\n");
            for (Delivery d : deliveries){
                writer.write(d.getProduct().getName()+ "," +
                        d.getProduct().getType() + "," +
                        d.getProduct().getQuantity() + "," +
                        d.getCustomer().getName() + "," +
                        d.getCustomer().getAddress() + "," +
                        d.getTransport() + "," +
                        d.getDeliveryDate() + "\n");

            }
            System.out.println(
                    "✅ CSV fayl saqlandi: " + filename
            );
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
