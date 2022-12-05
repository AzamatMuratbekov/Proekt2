package products;

import company.Company;
import departments.MeatProducts;

import java.time.LocalDate;

public class Fish extends MeatProducts {
    public Fish(int id, LocalDate date, Company company) {
        super(id, date, company);
    }

    @Override
    public String toString() {
        return "Fish{} " + super.toString();
    }
}