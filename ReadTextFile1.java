/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readtextfile;
import java.io.*;
/**
 *
 * @author Ashley
 */
public class ReadTextFile {
    private final String path;
    public ReadTextFile(String fileLocation){
        path = fileLocation;
    }
    public String[] OpenFile() throws IOException {
        
        //Start FileReader and the BufferedReader
         FileReader filereader = new FileReader(path);
         String[] textData;
        try (BufferedReader textReader = new BufferedReader(filereader)) {
            int agesOfFamily = 15;
            textData = new String[agesOfFamily];
            int i;
            for (i=0; i < agesOfFamily; i++){
                textData[i] = textReader.readLine();
            }
        }
        return textData;
    }
    //Main method with an IOException
    public static void main(String[] args) throws IOException{
        
        //text file location
        String fileLocation = "C:/familymembers.txt";
        
        //Read the text file from the above location
        try {
            ReadTextFile file = new ReadTextFile(fileLocation);
            String[] arrayLines = file.OpenFile();
            
            //print each line as an array
            int i;
            for (i=0; i < arrayLines.length; i++){
                System.out.println(arrayLines[i]);
            }
        }
        
        //catch any exception and print out the message associated
        catch (IOException e){
            System.out.println( e.getMessage());
            
        }
    }
    
}
