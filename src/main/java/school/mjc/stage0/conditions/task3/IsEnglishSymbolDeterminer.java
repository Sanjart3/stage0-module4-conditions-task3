package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        System.out.println((Character.isLetter(symbol))?"English":"Non English");
    }
}
