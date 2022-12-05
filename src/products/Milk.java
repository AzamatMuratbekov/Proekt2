package products;

import company.Company;
import departments.MilkProducts;

import java.time.LocalDate;

public class Milk extends MilkProducts {
    public Milk(int id, LocalDate date, Company company) {
        super(id, date, company);
    }

    @Override
    public String toString() {
        return "Milk{} " + super.toString();
    }
}
