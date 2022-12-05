package products;

import company.Company;
import departments.MeatProducts;

import java.time.LocalDate;

public class Sausage extends MeatProducts {
    public Sausage(int id, LocalDate date, Company company) {
        super(id, date, company);
    }

    @Override
    public String toString() {
        return "Sausage{} " + super.toString();
    }
}

