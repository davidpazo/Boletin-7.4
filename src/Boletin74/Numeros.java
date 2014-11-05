package Boletin74;
//@author dpazolopez

import javax.swing.JOptionPane;

public class Numeros {
    float num1;
    float num2;
    float num3;
    
    public Numeros(){
    }
    public Numeros(float n1, float n2,float n3){
        num1=n1;
        num2=n2;
        num3=n3;
    }
    public void setNum1(float n1){
        num1=n1;
    }
    public void setNum2(float n2){
        num2=n2;
    }
    public void setNum3(float n3){
        num3=n3;
    }
    public float getNum1(){
        return num1;
    }
    public float getNum2(){
        return num2;
    }
    public float getNum3(){
        return num3;
    }
    public float pedirDato(){
        return Float.parseFloat(JOptionPane.showInputDialog("introduce dato"));
    }
    public void Condicion(){
        if(num1!=num2 && num2!=num3 && num3!=num1){
        if(num1>num2&&num1>num3){
            JOptionPane.showMessageDialog(null, num1+" É o mais alto");
        }
        else if(num2>num1&&num2>num3){
            JOptionPane.showMessageDialog(null, num2+" É o mais alto");
        }
        else{
        //num3>num2&&num3>num1
                JOptionPane.showMessageDialog(null, num3+" É o mais alto");
    }
} 
        else{
               JOptionPane.showMessageDialog(null,"Hay números iguais");
        }
}
}
