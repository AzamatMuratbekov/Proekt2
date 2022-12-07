import departments.MeatProducts;
import departments.MilkProducts;
import departments.WheatProducts;
import products.*;
import service.Manager;
import service.MyException;
import service.Service;
import java.time.LocalDate;
import java.util.ArrayList;
import static company.Company.*;

public class Main {
    public static void main(String[] args) throws MyException {
        Manager.manager();
        Meat meat = new Meat(255, LocalDate.of(2022, 12, 14), OTHER);
        Fish fish = new Fish(216, LocalDate.of(2022, 10, 11), OTHER);
        Sausage sausage = new Sausage(144, LocalDate.of(2023, 12, 30), TOIBOSS);
        Milk milk = new Milk(151, LocalDate.of(2023, 01, 1), MILKA);
        Kefir kefir = new Kefir(54, LocalDate.of(2022, 11, 30), OTHER);
        Yogurt yogurt = new Yogurt(45, LocalDate.of(2022, 12, 8), OTHER);
        Bread bread = new Bread(23, LocalDate.of(2022, 12, 20), OTHER);
        Flour flour = new Flour(492, LocalDate.of(2023, 02, 9), NUR);
        Pasta pasta = new Pasta(115, LocalDate.of(2022, 12, 7), OTHER);
        ArrayList<MeatProducts> vitrinaMeat = new ArrayList<>();
        vitrinaMeat.add(meat);
        vitrinaMeat.add(fish);
        vitrinaMeat.add(sausage);
        ArrayList<MilkProducts> vitrinaMilk = new ArrayList<>();
        vitrinaMilk.add(milk);
        vitrinaMilk.add(yogurt);
        vitrinaMilk.add(kefir);
        ArrayList<WheatProducts> vitrinaWheat = new ArrayList<>();
        vitrinaWheat.add(bread);
        vitrinaWheat.add(flour);
        vitrinaWheat.add(pasta);
//        Service.chek(vitrinaWheat);
//        System.out.println("В витрине: "+vitrinaWheat);
        Service.vitradd(sausage);
    }
}

