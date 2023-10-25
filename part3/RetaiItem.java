package part3;

/**
 * RetaiItem
 */
public interface RetaiItem {
    // note :
    // all fields in an interface are treated as final and static
    String storeName = "Parky";

    public double getItemPrice();
}