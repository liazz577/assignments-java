package session1;

public class Triangle {
    int canh1 ;
    int canh2 ;
    int canh3 ;

    public Triangle(){
        System.out.println("Vua tao xong doi tuong chay vao day luon");
    }

    public int getCanh1() {
        return canh1;
    }

    public int getCanh2() {
        return canh2;
    }

    public void setCanh2(int canh2) {
        this.canh2 = canh2;
    }

    public int getCanh3() {
        return canh3;
    }

    public void setCanh3(int canh3) {
        this.canh3 = canh3;
    }

    public void setCanh1(int canh1) {
        this.canh1 = canh1;
    }


    public boolean ktTriangle(){
        return canh1+canh2 > canh3 && canh1+canh3>canh2 && canh2+canh3>canh1;
    }
    public int chuVi(){
        return canh1+canh2+canh3;
    }
    public double dienTich(){
        if (!ktTriangle()) return 0;
        double cv2 = chuVi()/2.0;
        return Math.sqrt(cv2*(cv2-canh1)*(cv2-canh2)*(cv2-canh3));
    }
}
