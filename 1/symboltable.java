import java.io.*;
import java.util.*;

public class symboltable {
    public static void main(String[] args) throws IOException{
        File reader = new File("no_whitespace.asm");
        Hashtable<String, Integer>  d= new Hashtable<>();
        d.put("R0",0);
        d.put("R1",1);
        d.put("R2",2);
        d.put("R3",3);
        d.put("R4",4);
        d.put("R5",5);
        d.put("R6",6);
        d.put("R7",7);
        d.put("R8",8);
        d.put("R9",9);
        d.put("R10",10);
        d.put("R11",11);
        d.put("R12",12);
        d.put("R13",13);
        d.put("R14",14);
        d.put("R15",15);
        d.put("SCREEN",16384);
        d.put("KBD",24576);
        d.put("SP",0);
        d.put("LCL",1);
        d.put("ARG",2);    
        d.put("THIS",3);
        d.put("THAT",4);
        Scanner sc = new Scanner(reader);
        File writer = new File("SymbolTable.asm");
        String line;
        int linecnt=0,varcnt =16 ; 
        while(sc.hasNextLine()){
            line = sc.nextLine();
            if (line.startsWith("(")){
                line = line.substring(1,line.indexOf(")"));
                d.put(line,linecnt);
            }
            linecnt++;
        }
    }
}