import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AntsOnALog {
    static File file = null;
    public static void main(String[] args) throws FileNotFoundException {
        file = new File(args[0]);
        //File f = new File("antsonalog.txt");
        Scanner scan = new Scanner(file);

        int numOfTrials = Integer.parseInt(scan.nextLine());
        int logLength ;
        for (int i = 0; i < numOfTrials; ++i){
            logLength = Integer.parseInt(scan.nextLine()); // log length
            int [] log = new int[logLength+1];
            for(int p = 0; p < logLength; ++p){
                log[i]=0;
            }
            int [] c = makeA(log, scan.nextLine(), scan.nextLine());

            System.out.println(stickP(c));
        }
    }

    public static int [] makeA(int [] log, String a, String b){
        int [] answerA = new int[log.length + 1];
        String [] red = a.split(" ");
        String [] black = b.split(" ");
        for(int i = 0; i < red.length; ++i){
            answerA[Integer.parseInt(red[i])] = 1;
        }
        for(int i = 0; i < black.length; ++i){
            answerA[Integer.parseInt(black[i])] = -1;
        }
        return answerA;
    }

    public static int stickP(int [] p){
        int answer = 0;
        int check = 0;
        boolean ab = false;
        for(int i = 0; i < p.length; ++i){
            if ((ab && p[i] != check) && p[i] !=0 ){
                ++answer; }
            if(p[i] != 0) { check = p[i]; ab = true;} }
        return answer;
    }
}