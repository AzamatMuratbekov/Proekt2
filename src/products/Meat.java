package products;

import company.Company;
import departments.MeatProducts;

import java.time.LocalDate;

public class Meat extends MeatProducts {
    public Meat(int id, LocalDate date, Company company) {
        super(id, date, company);
    }

    @Override
    public String toString() {
        return "Meat{} " + super.toString();
    }
}
