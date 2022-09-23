package session1;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int x= 10;
        System.out.println("x= "+x);
        String str = "Hello World";
        if (x>5) {
            System.out.println(str);
        }else {
            System.out.println("not found");
        }
        for(int i=0;i<10;i++){
            System.out.println("i="+i);
        }

        Car c = new Car();
        Car c2 = new Car();
        c.brand = "Toyota";
        System.out.println(c.brand);
        Car.color = "red";
        System.out.println(Car.color);
        c.showInfo();
        c2.showInfo();
        Bike b = new Bike();
        b.run();
        System.out.println(Car.color);

        Triangle t = new Triangle();
        Triangle t2 = new Triangle();
        t.setCanh1(4);
        t2.setCanh1(10);
        t.setCanh2(5);
        t.setCanh3(6);
        System.out.println("Chu vi: "+t.chuVi());
        System.out.println("Dien tich: "+t.dienTich());

        //phan so test
        //Scanner sc = new Scanner(System.in);
        //int x = sc.nextInt(); // <=> scanf("%d",&x);
        //int ts = sc.nextIntx;

        Fraction ps1 = new Fraction(1,5);
        Fraction ps2 = new Fraction(1,5);

        Fraction psTong;
        Fraction psHieu;
        Fraction psThuong;
        Fraction psTich;

        // In phan so
        System.out.println("Phan so 1 la:");
        ps1.display();
        System.out.println("Phan so 2 la:");
        ps2.display();



        // Cong 2 phan so
        psTong = ps1.add(ps2);

        //Tru 2 phan so
        psHieu = ps1.sub(ps2);

        // Nhan 2 phan so
        psTich =  ps1.mul(ps2);



        // Hien thi
        System.out.println("Tong 2 phan so la:");
        psTong.display();
        System.out.println("Hieu 2 phan so la: ");
        psHieu.display();
        System.out.println("Tich 2 phan so la: ");
        psTich.display();
        // Chia,rut gon va display 2 phan so
        ps1.div(ps2);

    }
}
