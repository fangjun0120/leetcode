package jfang.leetcode.solution;

import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class SolutionCounter {

    public static void main(String[] args) throws Exception {
        System.out.println("easy solutions: " + calculateForDifficulty("easy"));
        System.out.println("medium solutions: " + calculateForDifficulty("medium"));
        System.out.println("hard solutions: " + calculateForDifficulty("hard"));
    }

    public static int calculateForDifficulty(String difficulty) {
        String workingDir = System.getProperty("user.dir");
        Path dir = Paths.get(workingDir, "src", "jfang", "leetcode", "solution", difficulty);
        int count = 0;
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
            for (@SuppressWarnings("unused") Path file: stream) {
                count++;
            }
        } catch (IOException | DirectoryIteratorException x) {
            // IOException can never be thrown by the iteration.
            // In this snippet, it can only be thrown by newDirectoryStream.
            System.err.println(x);
        }
        return count;
    }
}
