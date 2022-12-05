package products;

import company.Company;
import departments.WheatProducts;

import java.time.LocalDate;

public class Pasta extends WheatProducts {
    public Pasta(int id, LocalDate date, Company company) {
        super(id, date, company);
    }

    @Override
    public String toString() {
        return "Pasta{} " + super.toString();
    }
}
