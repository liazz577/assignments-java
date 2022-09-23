package session1;

import java.util.Scanner;

public class Fraction {
    int tuSo;
    int mauSo;

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public Fraction() {
        tuSo = 0;
        mauSo = 1;
    }

    public Fraction(int tuSo, int mauSo) {
        if (mauSo == 0) {
            System.out.println("Mau so ko the = 0");
            tuSo = 0;
            mauSo = 1;
        } else {
            this.tuSo = tuSo;
            this.mauSo = mauSo;
        }
    }

    // Ham in phan so
    public void display() {
        if (tuSo * mauSo < 0) {
            System.out.println("-" + Math.abs(tuSo)+ "/" + Math.abs(mauSo));
        } else {
            System.out.println(Math.abs(tuSo) + "/" + Math.abs(mauSo));
        }
    }

    // Ham rut gon phan so
    public void reduce() {
        // Tim usc lon nhat
        int a = tuSo;
        int b = mauSo;
        int r = a % b;
        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }
        // Toi gian phan so /=	op1 /= op2	op1 = op1 / op2
        tuSo /= b;
        mauSo /= b;
    }

    // chua ,phan  rut gon
    //public void rutGon() {
     //   int ucln = Math.min((Math.abs(tuSo),Math.abs(mauSo));i>1;i--){
    //        if (tuSo%i==0 && mauSo%i==0){
    //            ucln = i;
    //         break;
     //       }
     //   }
     //   setTuSo(tuSo/ucln);
     //   setMauSo(mauSo/ucln);
    //  }

    // Ham nghich dao phan so
    public void inverse() {
        int tg = tuSo;
        tuSo = mauSo;
        mauSo = tg;
    }

    // Ham cong 2 phan so
    public Fraction add(Fraction ps2) {
        int ts = tuSo * ps2.mauSo + ps2.tuSo * mauSo;
        int ms = mauSo * ps2.mauSo;
        return new Fraction(ts, ms);
    }

    // Ham tru 2 phan so
    public Fraction sub(Fraction ps2) {
        int ts = tuSo * ps2.mauSo - ps2.tuSo * mauSo;
        int ms = mauSo * ps2.mauSo;
        Fraction psTong = new Fraction(ts, ms);
        psTong.reduce();
        return psTong;
    }

    // Ham nhan 2 phan so
    public Fraction mul(Fraction ps2) {
        int ts = tuSo * ps2.tuSo;
        int ms = mauSo * ps2.mauSo;
        return new Fraction(ts, ms);
    }

    // Ham chia 2 phan so
    public void div(Fraction ps) {
        int ts = this.getTuSo() * ps.getMauSo();
        int ms = this.getMauSo() * ps.getTuSo();
        Fraction psThuong = new Fraction(ts, ms);
        psThuong.reduce();
        System.out.println("Thuong 2 phan so la: " + psThuong.tuSo + "/" + psThuong.mauSo);
    }

}
