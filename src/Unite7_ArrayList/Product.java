package Unite7_ArrayList;

public class Product {
    private String name;
    private String colour;
    private double price;
    private int num;

    public Product(String name, String colour, double price, int num) {
        this.name = name;
        this.colour = colour;
        this.price = price;
        this.num = num;
    }
    public Product() {
    }
    public void info(){
        System.out.println("商品名称："+this.name+"  商品颜色："+this.colour+"  商品价格："+this.price+"元  商品数量："+this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
