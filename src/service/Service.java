package service;
import company.Company;
import departments.MeatProducts;
import departments.MilkProducts;
import departments.WheatProducts;
import products.Products;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Service {
    public static void vitradd(Products products) {
        ArrayList<MeatProducts> vitrina = new ArrayList<>();
        ArrayList<WheatProducts> vitrina2 = new ArrayList<>();
        ArrayList<MilkProducts> vitrina3 = new ArrayList<>();
        if (products.getCompany().equals(Company.TOIBOSS) && products.getDate().isAfter(LocalDate.now().plusDays(30))) {
            vitrina.add((MeatProducts) products);
            System.out.println(vitrina);
        } else if (products.getCompany().equals(Company.NUR) && products.getDate().isAfter(LocalDate.now().plusDays(30))) {
            vitrina2.add((WheatProducts) products);
            System.out.println(vitrina2);
        } else if (products.getCompany().equals(Company.MILKA) && products.getDate().isAfter(LocalDate.now().plusDays(30))) {
            vitrina3.add((MilkProducts) products);
            System.out.println(vitrina3);
        } else
            System.out.println("Не является товаром компаний Нур,Тойбосс,Милка или срок годности не превышает 30дней");

    }

    public static void chek(List<? extends Products> list) {
        ArrayList<Products> vitrinaSkidok = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Products products = list.get(i);
            if (products.getDate().isBefore(LocalDate.now())) {
                list.remove(i);
                i--;
            }
        }
            for (int i = 0; i < list.size(); i++) {
                Products products = list.get(i);
        if (products.getDate().isBefore(LocalDate.now().plusDays(7))){
                vitrinaSkidok.add(products);
                list.remove(i);
                i--;
                }

            }System.out.println("В витрине скидок: "+vitrinaSkidok);
        }
    }
