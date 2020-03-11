/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masgrande;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class MasGrandeTest {
    
    public MasGrandeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of max method, of class MasGrande.
     */
    @Test
    public void testMax() {
        System.out.println("max");
//        Arrays para realizar las pruebas
        int[] a = {3,4,5};//Numeros positivos ordenados
        int[] b = {8,5,3};//Numeros positivos desordenados
        int[] c = {2,9,5};//Numeros positivos desordenados
        int[] d = {3};//Array[1,1]
        int[] e = {-5,-4,-3};//Numeros negativos ordenados
        int[] f = {-9,-1,-4};//Numeros negativos desordenados
        int[] g = {-1,-9,-7};//Numeros negativos desordenados
        int[] h = {-2,0,5};//Numeros negativos y positivos ordenados
        int[] i = {9,1,-1};//Numeros negativos y positivos desordenados
        int[] j = {-2,1,-9};//Numeros negativos y positivos desordenados
        int[] k ={};//Vacio
        int[] l = {0};//Nulo
        
        
//        Array(3,4,5)--> Max=5
        assertEquals(5, MasGrande.max(a));
//        Array(8,5,3)--> Max=8
//        assertEquals(8, MasGrande.max(b));
//        Array(2,9,5)--> Max=9
        assertEquals(9, MasGrande.max(c));
//        Array(3)--> Max=3
        assertEquals(3, MasGrande.max(d));
//        Array(-5,-4,-3)--> Max=-3
        assertEquals(-3, MasGrande.max(e));
//        Array(-9,-1,-4)--> Max=-1
        assertEquals(-1, MasGrande.max(f));
//        Array(-1,-9,-7)--> Max=-1
        assertEquals(-1, MasGrande.max(g));
//        Array(-2,0,5)--> Max=5
        assertEquals(5, MasGrande.max(h));
//        Array(9,1,-1)--> Max=9
        assertEquals(9, MasGrande.max(i));
//        Array(-2,1,-9)--> Max=1
        assertEquals(1, MasGrande.max(j));
//        Array()--> Max=0
        assertEquals(0, MasGrande.max(k));
//        Array(0)--> Max=0
        assertEquals(0, MasGrande.max(l));
    }
}
