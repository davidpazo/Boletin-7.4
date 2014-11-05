package Boletin74;
// @author dpazolopez

public class Boletin74 {

    public static void main(String[] args) {
        float num1, num2, num3;
        Numeros obx=new Numeros();
        num1= obx.pedirDato();
        num2= obx.pedirDato();
        num3= obx.pedirDato();
        obx.setNum1(num1);
        obx.setNum2(num2);
        obx.setNum3(num3);
        obx.Condicion();
    }
    
}
