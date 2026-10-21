package io.github.cortexr7.utility;

public final class TimePrinter {
    private TimePrinter(){}
    private static String formatPrint(String msg){
        return new String("[TIME]: " + msg);
    }

    public static void PrintNano(double nano, String msg){
        System.out.println(formatPrint(msg) + nano + " ns");
    }

    public static void PrintMilis(double milis, String msg){
        System.out.println(formatPrint(msg) + milis + " ms");
    }
}
