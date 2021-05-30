package Task1;

import java.util.List;

public class Book {
    double price;
    String title;
    final String[] coverType = {"hard", "soft"};

    int quantityOfPages;

    public Book(double price, String title, int quantityOfPages, String coverTypevar) {
        this.price = price;
        this.title = title;
        this.quantityOfPages = quantityOfPages;
        if(coverType[0] == coverTypevar) {
            this.coverType[0] = coverTypevar;
        }if(coverType[1] == coverTypevar) {
            this.coverType[1] = coverTypevar;
        }else{
            System.out.println("Incorrect input");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getCoverType() {
        return coverType;
    }

    public int getQuantityOfPages() {
        return quantityOfPages;
    }

    public void setQuantityOfPages(int quantityOfPages) {
        this.quantityOfPages = quantityOfPages;
    }

    public String getСoverType(int typenum){
        return coverType[typenum];
    }
}
