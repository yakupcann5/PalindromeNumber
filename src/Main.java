import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args) {
        boolean loop = true;
        int number, newNumber = 0,result,reamining;
        String numberStr;
        numberStr = JOptionPane.showInputDialog("Bir sayi giriniz ?");
        number = Integer.parseInt(numberStr);
        result = number;
        while (loop) {
            reamining = result%10;
            result = (result-reamining)/10;
            newNumber = newNumber*10+reamining;
            if(result == 0){
                if(newNumber==number){
                    System.out.printf("%d sayisi palindrom sayidir",number);
                    break;
                }else{
                    System.out.printf("%d sayisi palindrom değildir",number);
                    loop = false;
                }
            }
        }
    }

}
