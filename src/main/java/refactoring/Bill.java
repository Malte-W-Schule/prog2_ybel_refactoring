package refactoring;

import java.util.ArrayList;
import java.util.Date;

public class Bill {


    private Customer customer;
    private Adress adress;
    private ArrayList<Article> articles;

    public Customer getCustomer()
    {
        return this.customer;
    }
    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }
    public Adress getAdress()
    {
        return this.adress;
    }
    public void setAdress(Adress adress)
    {
        this.adress = adress;
    }


    public Bill(Customer customer, Adress adress) {
        this.customer = customer;
        this.adress = adress;
        this.articles = new ArrayList<>();
    }

    public boolean addArticle(Article a) {
        return articles.add(a);
    }

    public String getDetails() {
        double total = 0;

        String result = "Details for \"" + customer.customerName + "\"\n";
        result += adress.street + " " + adress.streetNumber + "\n";
        result += adress.postalCode + " " + adress.city + "\n";
        result += "Geburtstag: " + customer.birthday + "\n";
        result += "Email: " + customer.email + "\n\n";
        result += "refactoring.Article: \n";
        for (Article article : articles) {
            double price = article.calculatePrice();
            result +=
                "\t"
                    + article.bike.productName
                    + "\tx\t"
                    + article.purchaseAmount
                    + "\t=\t"
                    + String.valueOf(price)
                    + "\n";
            total += price;
        }

        result += "\nTotal price:\t" + String.valueOf(total) + "\n";

        return result;
    }

}
