
public class Car {
    private String maker;
    private int model;
    public static void main(String[] args) {
        
    }

    public String getMaker() {
        return maker;
    }

    public int getModel() {
        return model;
    }

    public void setMaker(String maker) {

        if (maker == "Bmw" || maker == "Jaguar" || maker == "Gmc") {
            this.maker = maker;
        } else {
            System.out.println("Invalid maker. Please choose from: Bmw, Jaguar, Gmc");
        }

    }

    public void setModel(int model) {
        if (model > 2015 && model < 2028) {
            this.model = model;
        } else {
            System.out.println("Unfortunately, these models are not purchased by our company");
        }
    }

    public void showCarDetails() {

        if (getMaker().isEmpty() || getMaker() == null || getModel() <= 0) {
            System.out.println("Car details are incomplete or invalid");
        } else {
            System.out.println("Model: " + getModel() + "\n" + "Maker: " + getMaker());
        }
    }

}
