package departments;
import company.Company;
import products.Products;

import java.time.LocalDate;
public abstract class MilkProducts extends Products {
    public MilkProducts(int id, LocalDate date, Company company) {
        super(id, date, company);
    }
}
