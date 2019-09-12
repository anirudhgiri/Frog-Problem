import java.io.*;

class FrogProblem{
    static int frog(int n){
        int pos = 0; //position of the frog
        int steps = 0; // number of steps taken to reach the opposite bank
        while(pos<n){
            long leap = Math.round(Math.random()*(n-pos)); //calculating how many lilly pads to leap randomly
            pos+=leap;
            steps++;
        }
        return steps;
    }

    public static void main(String args[])throws IOException{
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("out.csv")));
        for(int i = 1; i< 10000; i++){
        int sum = 0;
        for(int j=0; j<1000; j++){
            sum += frog(i);
        }
        pw.println(sum/1000+",");
    }
        pw.close();
    }
}
