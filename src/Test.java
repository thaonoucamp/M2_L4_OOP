import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //khai bao cac bien luu gia tri nhap vao cua nguoi dung va gan gia tri;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the width: ");
        double width = Double.parseDouble(sc.nextLine());

        System.out.println("Enter the height: ");
        double height = Double.parseDouble(sc.nextLine());

        // khoi tao doi tuong hinh chu nhat voi phuong thuc co tham so;
        Rectangle rectangle = new Rectangle(width, height);

        // goi cac phuong thuc cua lop hinh chu nhat thong qua doi tuong vua khoi tao;
        System.out.println("your rectangle :" + rectangle.display());
        System.out.println("Perimeter of the rectangle: " + rectangle.getPerimeter());
        System.out.println("Area of the rectangle: " + rectangle.getArea());

    }
}
