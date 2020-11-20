import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(new File("input.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

        while(s.hasNext()) {
            writer.write(solution(s.nextLong()) + "\n");
        }
        writer.close();
    }

    public static long solution(long size) {
        if (size == 1) {return 0;}
        long medium = size / 2 + 1;
        long count = 0;
        for (int i = 1; i < medium; i++) {
            count += size * i;
        }
        long centralQuantity = medium - 1;
        for (int i = 1; i < size; i = i + 2) {
            count += i * centralQuantity;
            centralQuantity--;
        }
        return count * 2;
    }
}
