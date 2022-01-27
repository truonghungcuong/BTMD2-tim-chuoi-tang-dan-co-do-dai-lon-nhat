import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String string = input.nextLine();

        LinkedList<Character> maxGlobal = new LinkedList<>();

        for(int i = 0; i < string.length(); i++){
            LinkedList<Character> maxStartAtI = new LinkedList<>();
            maxStartAtI.add(string.charAt(i));

            for (int j = i+1; j < string.length(); j++){
                if(string.charAt(j) > maxStartAtI.getLast()){
                    maxStartAtI.add(string.charAt(j));
                }
            }

            if (maxGlobal.size() < maxStartAtI.size()){
                maxGlobal.clear();
                maxGlobal.addAll(maxStartAtI);
            }

        }


        for (Character ch: maxGlobal) {
            System.out.print(ch);
        }
        System.out.println();
    }

}