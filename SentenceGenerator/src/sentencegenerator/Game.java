
package sentencegenerator;


public class Game {
    
    
    public String generator(){
        String[] firstWord = {"Nagyon jó", "Megbízható", "Kiváló", "Tökéletes", "A legeslegjobb"};    
        String[] secondWord = {"megoldás", "lehetőség", "kivitelezés"};    
        String[] thirdWord = {"neked", "mindenkinek", "az egész világnak", "még a földönkívülieknek is"};

        int oneLenght = firstWord.length;    
        int secondLenght = secondWord.length;    
        int thirdLenght = thirdWord.length;

        int random1 = (int) (Math.random() * oneLenght);
        int random2 = (int) (Math.random() * secondLenght);
        int random3 = (int) (Math.random() * thirdLenght);
        
        String sentence = firstWord[random1]+ " " + secondWord[random2] + " " + thirdWord[random3] + ".";
        
        return sentence;
    }
    
}
