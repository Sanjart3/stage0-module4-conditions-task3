package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        String alphabet = "qwertyuiopasdfghjklzxcvbnm";
        char char1 = Character.toLowerCase(symbol);
        System.out.println((alphabet.indexOf(char1)>=0)?"English":"Non English");
    }
}
