import java.util.Scanner;
public class UKL1A {    
    public static void main(String[] args) {
     Scanner a =new Scanner(System.in);
     double b,j,p,l,t;
     System.out.print("berat paket (kg): ");
     b=a.nextDouble();
     System.out.print("jarak tempuh (km): ");
     j=a.nextDouble();
     System.out.print("panjang paket (cm): ");
     p=a.nextDouble();
     System.out.print("lebar paket (cm): ");
     l=a.nextDouble();
     System.out.print("tinggi paket (cm): ");
     t=a.nextDouble();
System.out.print("\n");
    double bpkg;
    long bb;
    if (j <=10 ) {
        bpkg = 4250;
    }else{
        bpkg = 6000;
    }
    bb=(long) (b*bpkg);
        double v = p * l * t;
        long hv = 0;
        final double bv = 100;
        final long lv = 50000;
        if (v > bv) {
            hv = lv;
            System.out.println("terkena biaya tambahan ");
        }else{
            System.out.println("\n");
        }
        
        long totalharga = bb + hv;
      System.out.println("Harga jasa pengiriman:"+totalharga);
      a.close();
    }
}
