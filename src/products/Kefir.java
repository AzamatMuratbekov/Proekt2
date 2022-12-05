package products;

import company.Company;
import departments.MilkProducts;

import java.time.LocalDate;

public class Kefir extends MilkProducts {
    public Kefir(int id, LocalDate date, Company company) {
        super(id, date, company);
    }

    @Override
    public String toString() {
        return "Kefir{} " + super.toString();
    }
}