package edu.ifes.lfa.calc;


public class Utils {
    
    public static String unescapeString(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c: s.toCharArray()) {
            switch (c) {
                case '\b': sb.append("\\b"); break;
                case '\n': sb.append("\\n"); break;
                case '\t': sb.append("\\t"); break;
                case '\r': sb.append("\\r"); break;
                case '\f': sb.append("\\f"); break;
                case '\"': sb.append("\\\""); break;
                case '\'': sb.append("\\\'"); break;
                case '\\': sb.append("\\\\"); break;
                default: sb.append(c);
            }
        }
        return sb.toString();
    }
    
}
