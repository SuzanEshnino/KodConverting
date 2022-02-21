import java.util.Arrays;
import java.util.HashMap;

public class DataCheck1 {
    private String dataTest = " ";
    private char[] mychar;
    private String[] toEng;
    boolean invalid=false;
    HashMap<Character, String> morse = new HashMap<>();

    public DataCheck1() {

        morse.put('a', ".-");
        morse.put('b', "-...");
        morse.put('c', "-.-");
        morse.put('d', "-..");
        morse.put('e', ".");
        morse.put('f', "..-.");
        morse.put('g', "--.");
        morse.put('h', "....");
        morse.put('i', "..");
        morse.put('j', ".---");
        morse.put('k', "-.--");
        morse.put('l', ".-..");
        morse.put('m', "--");
        morse.put('n', "-.");
        morse.put('o', "---");
        morse.put('p', ".--.");
        morse.put('q', "--.-");
        morse.put('r', ".-.");
        morse.put('s', "...");
        morse.put('t', "-");
        morse.put('u', "..-");
        morse.put('v', "...-");
        morse.put('w', ".--");
        morse.put('x', "-..-");
        morse.put('y', "-.--");
        morse.put('z', "--..");
        morse.put('1', ".----");
        morse.put('2', "..---");
        morse.put('3', "...--");
        morse.put('4', "....-");
        morse.put('5', ".....");
        morse.put('6', "-....");
        morse.put('7', "--...");
        morse.put('8', "---..");
        morse.put('9', "----.");
        morse.put('0', "-----");

    }

        public String ReadChar(String data) {
        dataTest = data;
        String toMorse = "";

        char[] word = dataTest.toCharArray();
        for (int x = 0; x < word.length; x++) {

            char char1 = word[x];

            if(char1>='A'&& char1<='Z') {
                char low;
                low=Character.toLowerCase(char1);

                toMorse += morse.get(low) + " ";
            }

            else if((char1>='a'&& char1<='z') ||(char1>='0'&&char1<='9')){

                toMorse += morse.get(char1) + " ";
            }

            else
            {
                invalid=true;
            }
        }

        if(invalid){
            return "Invalid data";
        }

        return toMorse;
    }




        public String morse(String data){
            String ToEng = "";
            dataTest = data;

            String[] toEnglish = dataTest.split("\\s+");

            for (int i = 0; i < toEnglish.length; i++) {
                for (HashMap.Entry<Character, String> entry : morse.entrySet()) {
                    if (toEnglish[i].equals(entry.getValue())) {
                        ToEng = ToEng + entry.getKey();
                    }
                    else if(!toEnglish[i].contains(".")&& !toEnglish[i].contains("-"))
                   // else if(!toEnglish[i].equals(entry.getValue()))
                    {
                       invalid=true;
                    }

                }
            }

           if(invalid){
               return "Invalid kod";
           }
            return ToEng;

        }
    }



