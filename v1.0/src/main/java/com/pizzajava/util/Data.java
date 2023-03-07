package main.java.com.pizzajava.util;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * Classe que disponibiliza métodos de validação e formatação de dados.
 *
 * @author Antonio Marinho e João Guedes.
 */
public class Data{
    
    public static final int MALE_TEXT_FIELD = 0;
    public static final int FEMALE_TEXT_FIELD = 1;
    
    /**
     * Método que verifica se um CPF é valido. O CPF deve ser passado como parâmetro apenas contendo digitos.
     *
     * @param cpf CPF que será analisado.
     *
     * @return retorna true caso o CPF seja válido ou false caso não seja válido.
     */
    public static boolean cpfIsValid(String cpf) {
        int[] cpfArray = Data.stringToArrayInt(cpf);
        int sum = Data.sum(cpfArray,1);
        int verif = (sum/11);
        if ((verif == cpfArray[1]) && (verif == cpfArray[9]) && (verif == cpfArray[10])) {
            return false;
        }
        sum = Data.sum(cpfArray,2);
        verif = (sum % 11);
        int dig1 = (11 - verif);
        if (dig1 >= 10) {
            dig1 = 0;
        }
        if(cpfArray[9] != dig1) {
            return false;
        }
        sum = Data.sum(cpfArray,3);
        verif = (sum % 11);
        int dig2 = (11 - verif);
        if(dig2 >= 10) {
            dig2 = 0;
        }
        return cpfArray[10] == dig2;
    }
    
    /**
     * Método que formata uma data no formato americano em uma data no formato brasileiro (dd/mm/yy).
     *
     * @param date Data no formato americano.
     *
     * @return Uma data (string) no padrão de formatação do Brasil.
     */
    public static String formatDate(String date) {
        if (date.length() < 10) {
            throw new IllegalArgumentException("invalid date!");
        }
        String year = date.substring(0,4);
        String month = date.substring(5,7);
        String day = date.substring(8);
        return day.concat("/").concat(month).concat("/").concat(year);
    }
    
    /**
     * Método responsável por saber se um campo de texto é inválido desobedecendo os requisitos de preenchimento. Caso seja inválido
     * um aviso será mostrado e e será retornado false caso contrário apenas será retornado true;
     *
     * @param txtField Campo de texto que será analisado.
     *
     * @param label Jlabel onde aparecerá um mensagem caso o campo de texto seja inválido.
     *
     * @param text Texto contido no txtField.
     *
     * @param txtFieldName Nome do dado cobrado no campo de texto. Exemplo, caso o campo solicite o CPF o valor usado como parãmetro poderá ser cpf.
     *
     * @param genderOfNouns Gênero do nome do campo. Caso o nome do campo seja uma palavra masculida deve-se usar a constante MALETEXTFIELD
     * pertencente a essa classe ou o número zero. Caso o nome do campo seja uma palavra feminina deve-se usar a constante FEMALETEXTFIELD
     * pertencente a essa classe ou um número maior diferente de zero. Exemplo, caso seja o campo cpf (masculino) a constante a se usar será
     * MALETEXTFIELD, caso seja o campo senha (feminino) a constante a se usar será FEMALETEXTFIELD.
     *
     * @param minValue Valor mínimo de caracteres que um campo aceita como válido.
     *
     * @param maxValue Valor máximo de caracteres que um campo aceita como válido.
     *
     * @param defaultColor Cor padrão das bordas do JTextField passado como parâmetro.
     *
     * @return retorna true caso o campo seja inválido ou false caso seja válido.
     */
    public static boolean textFieldSizeIsInvalid(JTextField txtField, JLabel label, String text, String txtFieldName, int genderOfNouns, int minValue, int maxValue, Color defaultColor) {
        String warning = null;
        if (text.length() < 1) {
            warning = genderOfNouns == 0 ? "digite um " + txtFieldName : "digite uma " + txtFieldName;
        }
        else if (text.length() < minValue) {
            warning = "use " + minValue + " caracteres";
            if (minValue != maxValue) {
                warning += " ou mais";
            }
        }
        if (warning != null) {
            Set.setLineBorder(Color.RED, txtField);
            label.setText(warning);
            return true;
        }
        Set.setLineBorder(defaultColor, txtField);
        label.setText("");
        return false;
    }
    
    /**
     * Método que converte uma string em um vetor de int.
     *
     * @param string uma string contendo apenas dígitos.
     *
     * @return vetor de inteiro onde cada posição equivale ao valor da posição da string passada como parâmetro.
     */
    private static int[] stringToArrayInt(String string) {
        int[] arrayInt = new int[string.length()];
        char[] arrayChar = string.toCharArray();
        for(int i = 0; i < arrayChar.length; i++) {
            arrayInt[i] = Character.getNumericValue(arrayChar[i]);
        }
        return arrayInt;
    }
    
    private static int sum(int[] arrayInt, int op){
        int sum = 0;
        switch(op) {
            case 1 -> {
                for (int j : arrayInt) {
                    sum += j;
                }
            }
            case 2 -> {
                for(int i = 0; i < (arrayInt.length-2); i++) {
                    sum += (arrayInt[i] * ((arrayInt.length) - (i+1)));
                }
            }
            case 3 -> {
                for(int i = 0; i < (arrayInt.length -1); i++) {
                    sum += (arrayInt[i] * ((arrayInt.length)-i));
                }
            }
        }
        return sum;
    }
    
}