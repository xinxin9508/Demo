package javaStudyDemo.ClassAndMethodHomeWork;

public class HomeWork03 {
    public static void main(String[] args) {
        double bookPrice = 160;
        String name = "a";
        Book b = new Book(name,bookPrice);
        b.info();
        b.updatePrice();
        b.info();
    }
}
class Book{
    String name;
    double price;

    public Book(String name, double price){
        this.name = name;
        this.price = price;
    }

    public void updatePrice(){
        if (this.price > 150){
             this.price = 150;
         } else if (this.price > 100 && price <= 150) {
             this.price = 100;
         }
    }

    public void info(){
//        this.updatePrice();
        System.out.println("书名=" + this.name + " 价格=" + this.price);
    }
}
