package products;

import company.Company;
import departments.MilkProducts;

import java.time.LocalDate;

public class Yogurt extends MilkProducts {
    public Yogurt(int id, LocalDate date, Company company) {
        super(id, date, company);
    }

    @Override
    public String toString() {
        return "Yogurt{} " + super.toString();
    }
}