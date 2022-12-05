package departments;
import company.Company;
import products.Products;

import java.time.LocalDate;
public abstract class WheatProducts extends Products {
    public WheatProducts(int id, LocalDate date, Company company) {
        super(id, date, company);
    }

}