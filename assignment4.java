//Student no: 121376141
//Student name: Peace Samuel

//Java Practical 4
import java.util.*;
public class assignment4
{
    static void program1()
    {
        //create an array list and take input from user
        ArrayList<String> subjects = new ArrayList<String>();
        for (int i=0; i<4; i++){
            Scanner subject = new Scanner(System.in);
            System.out.println("Enter a computer science subject:");
            String sub = subject.nextLine();
            subjects.add(sub);
        }
    
        //search the array list and remove the subject: Networking
        for (int i=0; i< subjects.size(); i++){
            String subject_check = subjects.get(i);
            if (subject_check.compareTo("Networking") == 0){
                subjects.remove(i); //remove using index
            }
        }
        // Print the remaining items in reverse order
        for (int i=0; i< subjects.size(); i++){
            int index = i;
            for (int j=i+1;j <subjects.size(); j++){
                if (subjects.get(j).compareTo(subjects.get(i)) > 0){
                    index = j;
                }
            }
            String temp = subjects.get(i);
            subjects.set(i, subjects.get(index));
            subjects.set(index, temp);
        }
        System.out.println(subjects);
    }
    static void program2()
    {
        //hashmap to store jersey number and names of players
        HashMap<Integer,String> soccer_players = new HashMap<Integer,String>();
        //Chelsea Premier league team
        soccer_players.put(16, "Edouard Mendy");
        soccer_players.put(1, "Kepa Arrizabalaga");
        soccer_players.put(36, "Gabriel Slonina");
        soccer_players.put(13, "Marcus Bettinelli");
        soccer_players.put(33, "Wesley Fofana");
        soccer_players.put(4, "Benoit Badiashile");
        soccer_players.put(26, "Kalidou Koulibaly");
        soccer_players.put(14, "Trevoh Chalobah");
        soccer_players.put(6, "Thiago Silva");
        soccer_players.put(32, "Marc Cucurella");
        soccer_players.put(21, "Ben Chilwell");
        soccer_players.put(67, "Lewis Hall");
        soccer_players.put(24, "Reece James");
        soccer_players.put(28, "César Azpilicueta");
        soccer_players.put(7, "N'Golo Kanté");
        soccer_players.put(20, "Denis Zakaria");
        soccer_players.put(5, "Enzo Fernández");
        soccer_players.put(8, "Mateo Kovacic");
        soccer_players.put(23, "Conor Gallagher");
        soccer_players.put(12, "Ruben Loftus-Cheek");
        soccer_players.put(30, "Carney Chukwuemeka");
        soccer_players.put(19, "Mason Mount");
        soccer_players.put(29, "Kai Havertz");
        soccer_players.put(17, "Raheem Sterling");
        soccer_players.put(15, "Mykhaylo Mudryk");
        soccer_players.put(10, "Christian Pulisic");
        soccer_players.put(22, "Hakim Ziyech");
        soccer_players.put(31, "Noni Madueke");
        soccer_players.put(11, "Joao Félix");
        soccer_players.put(18, "Armando Broja");
        soccer_players.put(9, "Pierre-Emerick Aubameyang");
        soccer_players.put(17, "David Datro Fofana");

        //get input from the user, jersey number
        Scanner number = new Scanner(System.in);
        System.out.println("Enter a players number:");
        int num = number.nextInt();

        //loop through the hashmap to find the player name that matches the number entered
        for (int i: soccer_players.keySet()){
            if (soccer_players.containsKey(num)){
                if (num == i){
            System.out.println(soccer_players.get(i));
            break;
           }
            }
            else{
            System.out.println("Could not find a player to match that number :(");
            break;
           }
        }

    }
    static void program4()
    {
        //inputs two strings from the user  
        Scanner mystr = new Scanner(System.in);
        System.out.println("Enter a string:");
        String string1 = mystr.nextLine();
        String string2 = mystr.nextLine();
        // (i) Concatenate the strings
        String con_string = string1 +" "+ string2;
        System.out.println("Concatenated string: "+con_string);

        //(ii) print number of chars in the concatenated string
        int count = 0;//initialize count value to 0
        //count characters if it's not a space
        for (int i=0; i< con_string.length();  i++){
            if (con_string.charAt(i) != ' '){
                count++;
            }
        }
        System.out.println("Number of chars: " + count);

        //(iii) print concatenated string
        String rev_string = "";//initialize reverse string
        String[] parts = con_string.split(" ");
        for(int i=parts.length-1; i>=0; i--){
            rev_string += parts[i] + " ";
        }
        //rev_string =parts[1] +" "+ parts[0];
        System.out.println("Reversed string: "+ rev_string);

        //(iv)print chars that occur twice
        for (int i=0; i < con_string.length(); i++){
            //loop over each character in the string
            char current = con_string.charAt(i);
            //check if a char appears more than once and hasn't already been printed
            if (con_string.indexOf(current, i+1) != -1 && con_string.indexOf(current) == i){
                System.out.print(current);
            }
        }
    }
    
    public static void main (String[] args)
    {
        //program1();
        //program2();
        program4();
    }
}
