import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int k, i, toplam=0, ortalama, ortaksayi=0 ;
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        k=inp.nextInt();

        for(i=1;i<=k;i++){
            if(i%3==0 && i%4==0){
                ortaksayi++;
                toplam+=i;

                System.out.println(i);
            }
        }
        ortalama=toplam/ortaksayi;
        System.out.println("3 ve 4'e bölünen sayıların toplamı :" +toplam);
        System.out.println("3 ve 4'e bölünen sayıların ortalaması :" +ortalama);
    }
}