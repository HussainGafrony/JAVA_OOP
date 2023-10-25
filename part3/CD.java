package part3;

public class CD implements RetaiItem, Displayable {
    double price;
    String title;
    String artist;

    public CD(double price, String title, String artist) {
        this.price = price;
        this.title = title;
        this.artist = artist;
    }

    public double getItemPrice() {
        return price;
    }

    public void display() {
        System.out
                .println("StoreName : " + storeName + "\n" + "title : " + title + "\n" + "price : " + price + "\n"
                        + "artist : " + artist);
    }

}
