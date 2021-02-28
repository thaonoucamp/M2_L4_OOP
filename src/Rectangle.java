public class Rectangle {
    // tao lop, khai bao cac thuoc tinh. dinh nghia phuong thuc constructor;
    double width;
    double height;

    // 1 constructor ko tham so;
    public Rectangle() {
    }

    // 1 constructor co tham so;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // dinh nghia phuong thuc tinh dien tich;
    public double getArea() {
        return this.height * this.width;
    }

    // dinh nghia phuong thuc tinh chu vi;
    public double getPerimeter() {
        return (this.height + this.width) * 2;
    }

    // dinh nghia phuong thuc hien thi thong tin;
    public String display() {
        return "Rectangle : " + "width = " + width + ", height = " + height;
    }
}
