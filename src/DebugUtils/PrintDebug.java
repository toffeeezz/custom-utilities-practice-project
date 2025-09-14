package DebugUtils;

import javafx.scene.image.Image;
import javafx.scene.text.Font;

public class PrintDebug {

    /**
     *
     * @NOTICE  The whole print methods right now can only accept an {@code Object, String, int, boolean, double, char, long,} and {@code float}
     *
     * Prints on the same line
     * @params {@code x} The value to be printed
     */
    public static void simplePrint(String x){ System.out.print(x); }
    public static void simplePrint(char x){ System.out.print(x); }
    public static void simplePrint(boolean x){ System.out.print(x); }
    public static void simplePrint(int x){ System.out.print(x); }
    public static void simplePrint(double x){ System.out.print(x); }
    public static void simplePrint(long x){ System.out.print(x); }
    public static void simplePrint(float x){ System.out.print(x); }
    public static void simplePrint(Object x){ System.out.print(x); }


    /**
     * Prints on a new line
     * @param x The value to be printed
     */
    public static void linePrint(String x){ System.out.println(x); }
    public static void linePrint(char x){ System.out.println(x); }
    public static void linePrint(boolean x){ System.out.println(x); }
    public static void linePrint(int x){ System.out.println(x); }
    public static void linePrint(double x){ System.out.println(x); }
    public static void linePrint(long x){ System.out.println(x); }
    public static void linePrint(float x){ System.out.println(x); }
    public static void linePrint(Object x){ System.out.println(x); }


    /**
     *
     * @param x  The value to be printed
     * @param args  The variables inside the value to be printed
     */
    public static void formatPrint(String x, Object... args){ System.out.printf(x, args); }
    public static void formatPrint(char x, Object... args){ System.out.printf(String.valueOf(x), args); }
    public static void formatPrint(int x, Object... args){ System.out.printf(String.valueOf(x), args); }
    public static void formatPrint(boolean x, Object... args){ System.out.printf(String.valueOf(x), args); }
    public static void formatPrint(double x, Object... args){ System.out.printf(String.valueOf(x), args); }
    public static void formatPrint(float x, Object... args){ System.out.printf(String.valueOf(x), args); }
    public static void formatPrint(Object x, Object... args){ System.out.printf((String) x, args); }


    /**
     * Custom prints for easy designing in console-type programs
     */
    public static void LineBreak(){
        System.out.println();
    }
    public static void SimpleDecoLine(){
        System.out.println("----------------------------------------------------------------------------------------");
    }
    public static void ArrowDecoLine(){
        System.out.println("<||-----------------------------------------------------------------------------------||>");
    }

    /**
     * Prints with an indention
     * @param val The value to be printed
     */
    public static void indentPrint(String val){ System.out.println("     " + val);}
    public static void indentPrint(int val){ System.out.println("     " + val);}
    public static void indentPrint(boolean val){ System.out.println("     " + val);}
    public static void indentPrint(double val){ System.out.println("     " + val);}
    public static void indentPrint(long val){ System.out.println("     " + val);}
    public static void indentPrint(float val){ System.out.println("     " + val);}
    public static void indentPrint(Object val){ System.out.println("     " + val);}


    /**
     * Checks whether an image is successfully loaded or not
     * @param img The image to be debugged
     */
    public static void checkImageLoad(Image img){
        linePrint("Image error? " + img.isError());
        if(img.isError()) throw new RuntimeException(img.getException().getCause());
    }

    /**
     * Checks whether a font is loaded properly
     * @param font The font to be debugged
     */
    public static void checkFontLoad(Font font){
        if(font == null) linePrint("Font Failed to Load");
    }
}
