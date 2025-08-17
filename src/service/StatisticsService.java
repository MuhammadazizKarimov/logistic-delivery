package service;

import model.Delivery;

import javax.crypto.spec.DESedeKeySpec;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class StatisticsService {
    public void printStats(List<Delivery> deliveries){
        System.out.println("Umumiy yetkazib berishlar soni: " + deliveries.size());

        Map<String, Integer> transportCount= new HashMap<>();
        for(Delivery d : deliveries){
            String transport = d.getTransport();
            transportCount.put(transport,transportCount.getOrDefault(transport,0) + 1);
        }
        System.out.println("Transportlar  bo'yicha taqismot : ");
        for(String key: transportCount.keySet()){
            System.out.println("- " + key + ": " + transportCount.get(key) + "marta");
        }
    }

}
