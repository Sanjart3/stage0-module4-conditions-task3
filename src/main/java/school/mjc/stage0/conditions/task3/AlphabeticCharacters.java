package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        String alphabet = "qwertyuiopasdfghjklzxcvbnm";
        char lowerChar = Character.toLowerCase(character);
        if (alphabet.indexOf(lowerChar)>=0){
            if (lowerChar=='a'||lowerChar=='e'||lowerChar=='i'||lowerChar=='o'||lowerChar=='u'||lowerChar=='y')
                System.out.println("Vowel");
            else System.out.println("Consonant");
        }else System.out.println("wrong alphabet!");
    }

}
