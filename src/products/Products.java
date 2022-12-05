package products;
import company.Company;
import java.time.LocalDate;
public class Products {
    private int id;
    private LocalDate date;
    private Company company;

    public Products(int id, LocalDate date, Company company) {
        this.id = id;
        this.date = date;
        this.company = company;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", date=" + date +
                ", company=" + company +
                '}';
    }
}