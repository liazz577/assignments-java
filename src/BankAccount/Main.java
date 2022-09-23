package BankAccount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*
        Account myAccount = new Account(1,"Trinh Quang Hoa",1000000);
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tien muon rut:");
        int x = sc.nextInt();
        if(myAccount.debit(x);){
            System.out.println("Rut thanh cong " +x);
        }else{
            System.out.println("So du tai khoan khong du hoac nhap sai so tien");
        }
        Account nam = new Account(2,"Cao Hoang Nam", 10000);
        if (myAccount.transferFunds(nam,y);){
            System.out.println("Chuyen thanh cong sang tai khoan" + nam.getName());
        }else{
            System.out.println("Chuyen khoan that bai");
        }
        */

        Account A = new Account("6A7","Liam Vicerador",500);
        Account B = new Account("H7V","Diep Tinh Ha",400);

        // print initial balances
        System.out.println("Account " + A.getId() + " has initial balance of "+ A.getBalance());
        System.out.println("Account " + B.getId() + " has initial balance of "+ B.getBalance());

        A.transferFunds(B,-70);
    }
}
