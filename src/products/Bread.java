package products;

import company.Company;
import departments.WheatProducts;

import java.time.LocalDate;

public class Bread extends WheatProducts {
    public Bread(int id, LocalDate date, Company company) {
        super(id, date, company);
    }

    @Override
    public String toString() {
        return "Bread{} " + super.toString();
    }
}