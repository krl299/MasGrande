/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masgrande;

/**
 *
 * @author usuario
 */
public class MasGrande {

    public static int max(int[] a) {
        try {
            int i, m = a[0];
            for (i = 0; i < a.length; i++) {
                if (a[i] > m) {
                    m = a[i];
                }
            }
            return m;
        }catch(Exception e){
            return 0;
        }

    }
}
