package main.java.com.oracle.oracle;
import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.regex.*;
import java.net.InetAddress.*;
import java.net.*;

    public class SolutionMyRegex {
        // Function for Validating IP
        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

            Scanner in = new Scanner(System.in);
            while(in.hasNext()){
                String IP = in.next();
                System.out.println(IP.matches(new MyRegex().pattern));
            }



        }



    }


    class MyRegex {

        String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
        public String pattern =  zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;;

    }

