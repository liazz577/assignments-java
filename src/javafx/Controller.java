package javafx;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.awt.*;

public class Controller {
    public TextField  txtFullname;
    public TextField  txtTuoi;
    public TextField  txtEmail;
    public TextField  txtDiachi;
    public Text tMot;
    public Text tHai;
    public Text Age;
    public Text Address;
    public Text noticeFullName;
    public Text noticeEmail;
    public Text noticeAge;
    public Text noticeAddress;
    public void handleSubmit(){
        String fn = txtFullname.getText();
        if (fn.isEmpty()){
            noticeFullName.setText("Vui long nhap ho ten");
            noticeFullName.setVisible(true);
        }else {
            noticeFullName.setVisible(false);
            tMot.setText(fn);
        }

        String em = txtEmail.getText();
        //needs String regrex
        if (em.isEmpty() || !em.contains("@") || em.startsWith("@") || em.endsWith("@")){
            noticeEmail.setText("Vui long nhap dung dinh dang email");
            noticeEmail.setVisible(true);
        }else{
            noticeEmail.setVisible(false);
            tHai.setText(em);
        }

        String ag = txtTuoi.getText();
        try{
            Integer nAge = Integer.parseInt(ag);
            if(nAge <= 0 || nAge >100 )
                throw new Exception("Vui long nhap tuoi hop le");
            Age.setText(nAge.toString());
            noticeAge.setVisible(false);
        }catch (Exception e){
            noticeAge.setText(e.getMessage());
            noticeAge.setVisible(true);
        }

        String ad = txtDiachi.getText();
        if (ad.isEmpty()){
            noticeAddress.setText("Vui long dia chi");
            noticeAddress.setVisible(true);
        }else {
            noticeAddress.setVisible(false);
            Address.setText(ad);
        }
        System.out.println("Submitted...");
    }
}