package products;

import company.Company;
import departments.WheatProducts;

import java.time.LocalDate;

public class Flour extends WheatProducts {
    public Flour(int id, LocalDate date, Company company) {
        super(id, date, company);
    }

    @Override
    public String toString() {
        return "Flour{} " + super.toString();
    }
}
