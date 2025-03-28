import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class PseudocodeCompiler {
    public static void main(String[] args) {
        try {
            long start = System.currentTimeMillis();
            System.out.println("=======Enter the absolute path of the input file=======");
            String filePath = new Scanner(System.in).nextLine();
            String input = Files.readString(Paths.get(filePath));
            System.out.println("=======Compiling, C++ Transpiled code as shown=======");

            PseudocodePaper2Lexer lexer = new PseudocodePaper2Lexer(CharStreams.fromString(input));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            PseudocodePaper2Parser parser = new PseudocodePaper2Parser(tokens);

            ParseTree tree = parser.program();

            Transpiler visitor = new Transpiler();
            String cppCode = visitor.visit(tree);

            System.out.println(cppCode);

            System.out.println("=======Enter the absolute path you want the compiled .cpp file to be saved:=======");
            System.out.println("======For example, /Users/user1/Downloads/Main.cpp======");
            String savePath = new Scanner(System.in).nextLine();
            BufferedWriter br = new BufferedWriter(new FileWriter(savePath));
            br.write(cppCode);
            br.close();

            System.out.println("=======Compile succeeded=======");

            System.out.println("=======Executing=======");

            Process compileProcess = Runtime.getRuntime().exec(new String[]{
                    "g++", "/Users/zhong/Downloads/Main.cpp", "-o", "/Users/zhong/Downloads/Main"
            });

            int compileExitCode = compileProcess.waitFor();
            if (compileExitCode != 0) {
                System.err.println("Compilation failed! Please check your C++ code.");
                return;
            }

            File executable = new File("/Users/zhong/Downloads/Main");
            if (!executable.exists()) {
                System.err.println("Executable file not found! Compilation might have failed.");
                return;
            }

            Process runProcess = Runtime.getRuntime().exec("/Users/zhong/Downloads/Main");

            BufferedReader reader = new BufferedReader(new InputStreamReader(runProcess.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
            System.out.println("=======Output all shown, total time used: " + (System.currentTimeMillis()-start) + "ms=======");
        } catch (Exception e) {
            System.err.println("Exception occurred during compilation or execution: " + e.getMessage());
        }

    }
}