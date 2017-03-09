/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biometric.scanner;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Arosha D
 */
public class FileHandler {
    private static final String FILENAME = "palmData.txt"; 
    
    String enterData(ArrayList personData){
        
       
        BufferedWriter bw = null;
        FileWriter fw = null;

        try {
            for(int i=0; i<personData.size(); i++){
                fw = new FileWriter(FILENAME,true);
                bw = new BufferedWriter(fw);
                String content = personData.get(i).toString();
                //System.out.println(content);
                if(i!=(personData.size()-1)){
                    bw.write(content + ",");
                    bw.close();
                    fw.close();
                }
                else{
                    bw.write(content + "\r\n");}
                    bw.close();
                    fw.close();
            }
            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null)
                        bw.close();

                if (fw != null)
                        fw.close();

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return null;
    }
    
    
    public ArrayList readData(){
        ArrayList storedData = new ArrayList();
        BufferedReader br;
        FileReader fr;
        try{
            fr = new FileReader(FILENAME);
            br = new BufferedReader(fr);
            while(true){
            String content = br.readLine();
            if(content==null){
                break;
            }
            
            ArrayList dataEntry = new ArrayList(Arrays.asList(content.split(",")));
            storedData.add(dataEntry);
            }
            //System.out.println(storedData);
        }
        catch(IOException e){
            System.out.println(e);
        }
        return storedData;
    } 
}
