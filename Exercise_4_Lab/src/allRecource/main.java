package allRecource;

import java.util.ArrayList;

public class main {
    public static void main (String [] args){
        ArrayList <Integer> arrayList = new ArrayList<>();
        for (int h = 0; h < 16; h++){
            arrayList.add(h);
        }
        int t = arrayList.remove( 15);
        System.out.println("Numbers for 0 to 16: " +arrayList);

        System.out.println("Last deleted number: " +t );
    }
}
