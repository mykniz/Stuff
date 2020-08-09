package ru.mykniz;

class PigLatin {
    public static void main(String[] args) {
        String in = "Hello []";
        pigIt(in);
    }

    public static String pigIt(String str) {
        return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
    }
}