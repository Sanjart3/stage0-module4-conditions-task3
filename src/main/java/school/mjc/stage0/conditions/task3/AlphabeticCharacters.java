package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if (Character.isAlphabetic(character)){
            char lowerChar = Character.toLowerCase(character);
            if (lowerChar=='a'||lowerChar=='e'||lowerChar=='i'||lowerChar=='o'||lowerChar=='u'||lowerChar=='y')
                System.out.println("Vowel");
            else System.out.println("Consonant");
        }else System.out.println("wrong alphabet!");
    }
}
