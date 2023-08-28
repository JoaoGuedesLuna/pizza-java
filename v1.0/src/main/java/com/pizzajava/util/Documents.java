package main.java.com.pizzajava.util;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 * Classe filha de PlainDocument. Deve ser usada para limitar os caractres de um determinado JTextField.
 * 
 * @author João Guedes.
 */
public class Documents extends PlainDocument {
    
    private final int MAX_SIZE;
    private final String REGEX;
    public static final String REGEX_SPECIAL_CHARACTER = "'|\"|!|¹|²|#|³|$|£|%|¢|¨|¬|&|*|(|)||=|+|§|´|`|[|{|ª|~|^|]|}|º|\\|||<|>|;|:|/|?|°";
    public static final String REGEX_EMAIL = REGEX_SPECIAL_CHARACTER + "|,| |-";
    public static final String REGEX_ONLY_NUMBER = REGEX_EMAIL + "|@|_|aA-zZ|.|á|à|â|ã|é|è|ê|í|ï|ó|ô|õ|ö|ú|ç|ñ|Á|À|Â|Ã|É|È|Ê|Í|Ï|Ó|Ô|Õ|Ö|Ú|Ç|Ñ|-";
    public static final String REGEX_STRING_AND_SPACE = REGEX_SPECIAL_CHARACTER + "|@|_|0-9";
    public static final String REGEX_ONLY_STRING = REGEX_STRING_AND_SPACE + "| ";
    
    public Documents(int maxSize, String regex) {
        this.MAX_SIZE = maxSize;
        this.REGEX = regex;
    }
    
    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        int size = this.getLength() + str.length();
        if (size <= this.MAX_SIZE) {
            super.insertString(offs, str.replaceAll("[" + this.REGEX + "]", ""), a);
            return;
        }
        int bound = 0;
        if (this.getLength() < this.MAX_SIZE) {
            bound = this.MAX_SIZE - this.getLength() - 1;
        }
        String newStr = str.substring(0, bound);
        super.insertString(offs, newStr.replaceAll("[" + this.REGEX + "]", ""), a);
    }
    
}