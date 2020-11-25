package Lab3;
import javafx.util.Pair;

import java.util.*;
import java.util.stream.Collectors;


public class TextManipulation {
    public String text = "For 2001, Suzuki introduced a new GSX-R model that replaced the largest and most powerful model of the GSX-R series sportbike, the GSX-R1100, with the all-new GSX-R1000. As the model name revealed, the engine's cylinder displacement was roughly 1,000 cc (61 cu in), about 100 cc smaller than its predecessor. The GSX-R1000 was not just an enlarged version of the GSX-R750, although it shared many features with its little brother. The mainframe is the same in both models, but the material used on the big brother was .5 mm (0.020 in) thicker. Suzuki claimed the torsional rigidity of the frame had increased 10% in comparison with the GSX-R750.\n" +
            "\n" +
            "The GSX-R1000 engine was a redesigned GSX-R750 engine. The R1000 had a 1 mm (0.04 in) bigger bore and 13 mm (0.51 in) longer stroke, newly designed pistons with lower crown, and gear-driven counter balancer. The engine weighed 130 lb (59 kg) which was slightly heavier than the 750 engine but 31 lb (14 kg) lighter than the engine of the GSX1300R. The performance of the engine is a peak of 160 bhp (119 kW) at 9,500 rpm, as measured on the crank and 143 hp (107 kW),[2] when measured on the rear wheel with small variations between different instances of the same model. The redline is set at 12,000 rpm. The maximum torque of the engine is 80 ft⋅lbf (108 N⋅m) at 8,000 rpm. Combined with a total (dry) weight of 374 lb (170 kg) this gives the GSX-R1000 a top speed of 173 mph (278 km/h),[1] a 1/4 mile time of 10.1 seconds at 141.7 mph (228.0 km/h), and a 0 to 100 km/h (62 mph) time of 3 seconds.\n" +
            "\n" +
            "Using titanium for the exhaust downpipe (K1 model link pipe is black, K2 model link pipe is polished titanium) and the inside of the silencer, enabled the 1000s exhaust system to become 4 lb (1.8 kg) lighter than that of the 750.[citation needed] Titanium was also used in the front fork (titanium-nitride) to coat the stanchions. An exhaust tuning valve had been mounted inside the exhaust pipe. Using a servo the system dynamically adjusted the exhaust backpressure, according to engine speed, throttle position, and gear selection for increased torque, lower emissions, and decreased noise—the (stock) exhaust noise of the GSX-R1000 is notably lower than that of the GSX-R600.\n" +
            "\n" +
            "With the 2001 model of the GSX-R1000, the 1998 Yamaha YZF-R1 was finally surpassed with the GSX-R being lighter and more powerful.[3]\n" +
            "\n" +
            "The 2001 model carried over to 2002 with minimal changes. 2002 introduced i.a. modifications to the fuel pump, clutch, front axle, torque link, mirrors, and luggage hooks. The manual fast-idle was replaced with a computer operated implementation (the \"STV servo\"). New colors, and new GSXR stickers.";

    public String getText() {
        return this.text;
    }

    public static int CalculateSentences(String str){
        String[] sentenceList = str.split("[!?.:]+");
        return sentenceList.length;
    }

    public static int CalculateWords(String str){
        String[] wordList = str.split("\\s+");
        return wordList.length;
    }

    public static int[] CalculateLetters(String str){
        int vowels = 0;
        int consonants = 0;
        str = str.toLowerCase();

        for(int i = 0; i < str.length(); i++)
        {
            char c = str.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                vowels++;
            else if(c >= 'a'&& c <= 'z')
                consonants++;
        }
        return new int[] {vowels+consonants, vowels, consonants};
    }

    public void TopWords(String text) {
        LinkedHashMap<String,Integer> words = new LinkedHashMap<String,Integer>();
        String str1 [] = text.split("[\\s.,?!:]");
        for (String s : str1){
            int count=0;
            if(words.containsKey(s)){
                count = words.get(s);
            }
            words.put(s,count+1);
        }

        List<Pair<String,Integer>> mostFrequent=
                words.entrySet()
                        .stream()
                        .sorted(Comparator.comparing(e->-e.getValue()))
                        .map(e->new Pair<>(e.getKey(),e.getValue()))
                        .collect(Collectors.toList());
        int c=0;
        for(Pair<String,Integer> e : mostFrequent){

            if(c++>=5) break;
            System.out.println(e.getKey() + " : " + e.getValue());

        }

    }

    public static String LongestWord(String str){
        String[] wordList = GetCleanWordList(str);
        String longest = wordList[0];
        for (String w:wordList) {
            if(w.length() > longest.length()) longest = w;
        }
        return longest;
    }

    private static String[] GetCleanWordList(String str){
        return str.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
    }
}