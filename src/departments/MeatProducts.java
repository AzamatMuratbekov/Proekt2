package departments;
import company.Company;
import products.Products;

import java.time.LocalDate;
public abstract class  MeatProducts extends Products {
    public MeatProducts(int id, LocalDate date, Company company) {
        super(id, date, company);
    }
}