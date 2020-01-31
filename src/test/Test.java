/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author k00253718
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ex238(6);
    }

    public static int ex238(int n) {
        String callName = "CALL ex238(" + n + ")";
        System.out.println(callName);
        System.out.println("if (" + n + " <= 0) //== " + (n <= 0));
        if (n <= 0) {
            System.out.println("return 0;");
            System.out.println("END " + callName);
            System.out.println("");
            return 0;
        }
        System.out.println("return ex238(" + (n - 3) + ") + " + n + " + ex238(" + (n - 2) + ") + " + n + ";");
        int returnValue = ex238(n - 3) + n + ex238(n - 2) + n;;
        System.out.println("END " + callName);
        System.out.println("");

        return returnValue;
    }

}
