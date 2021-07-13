package normalizetext;

import java.io.*;
import java.util.*;

public class NormalizeText {
    
    String txt;

    NormalizeText() {        
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public NormalizeText(String txt) {
        this.txt = txt;
    }
    
    public void readFile(File f){
        try {
            Scanner r = new Scanner(f);
            String text = "";
            while (r.hasNext()) {
                text = text + r.nextLine() +"\n";
            }
            this.setTxt(text);
            r.close();
        } catch (FileNotFoundException ex) {
            System.out.println("ERROR!");
        }
    }
    
    public void writeFile(File f){
        try {
            Formatter w = new Formatter(f);
            w.format(this.getTxt());
            w.close();
        } catch (FileNotFoundException ex) {
            System.out.println("ERROR!");
        }    
    }
    
    public void Normalize(){
        String text = this.txt;
        text = text.trim();
        if(text.charAt(0) >= 'a')
            text = this.Up(text.charAt(0)) + text.substring(1, text.length());
        if(!text.endsWith(".")) text = text.concat(".");
        while (text.contains("  ")) 
            text = text.replace("  ", " ");
        while (text.contains(" .")) 
            text = text.replace(" .", ".");
        while (text.contains(" ,")) 
            text = text.replace(" ,", ",");
        while (text.contains(" :")) 
            text = text.replace(" :", ":");
        while (text.contains("\n\n")) 
            text = text.replace("\n\n", "\n");        
        while (text.contains("\n ")) 
            text = text.replace("\n ", "\n");
        for (int i = 0; i < text.length()-1; i++) {
            if(text.charAt(i) == '.' && text.charAt(i+1) != ' ')
                text = text.substring(0, i+1) + ' ' + text.substring(i+1, text.length());
        }
        for (int i = 0; i < text.length()-1; i++){
            if(text.charAt(i) == '.' && text.charAt(i+1) == ' ' && text.charAt(i+2) >= 'a'){
                text = text.substring(0, i+2) + this.Up(text.charAt(i+2)) + text.substring(i+3, text.length());
            }
        }
        while (text.contains(" \n")) 
            text = text.replace(" \n", "\n");
        for (int i = 0; i < text.length()-1; i++) {
            if(text.charAt(i) == ',' && text.charAt(i+1) != ' ')
                text = text.substring(0, i+1) + ' ' + text.substring(i+1, text.length());
        }
        for (int i = 0; i < text.length()-1; i++) {
            if(text.charAt(i) == ':' && text.charAt(i+1) != ' ')
                text = text.substring(0, i+1) + ' ' + text.substring(i+1, text.length());
        }
        for (int i = 0; i < text.length()-1; i++) {
            if(text.charAt(i) == '"' && text.charAt(i+1) != ' ')
                text = text.substring(0, i+1) + ' ' + text.substring(i+1, text.length());
        }
        for (int i = 0; i < text.length()-1; i++) {
            if(text.charAt(i) != ' ' && text.charAt(i+1) == '"')
                text = text.substring(0, i+1) + ' ' + text.substring(i+1, text.length());
        }
        int k = 0;
        for (int i = 0; i < text.length()-1; i++) {
            if(text.charAt(i) == '"'){
                k = k+1;
                if(k%2 == 0) text = text.substring(0, i-1) + text.substring(i, text.length());
                if(k%2 != 0) text = text.substring(0, i+1) + text.substring(i+2, text.length());
            }
        }
        for (int i = 0; i < text.length()-1; i++){
            if(text.charAt(i) == '\n' && text.charAt(i+1) >= 'a'){
                text = text.substring(0, i+1) + this.Up(text.charAt(i+1)) + text.substring(i+2, text.length());
            }
        }
        for (int i = 0; i < text.length()-1; i++){
            if(text.charAt(i) == '\n' && text.charAt(i-1) != '.'){
                text = text.substring(0, i) + '.' + text.substring(i, text.length());
            }
        }
        this.setTxt(text);
    }
    
    public char Up(char a){
        return (char) ((char) a-32);
    }
    
}
