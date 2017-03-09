/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biometric.scanner;

import java.util.ArrayList;

/**
 *
 * @author Arosha D
 */
public class Identifier {
    
    private FileHandler handler;
    private ArrayList scannedData;
    private ArrayList<ArrayList> storedData;
    private ArrayList<ArrayList> differences; 
    
    public Identifier(FileHandler handler){
         this.handler = handler;
         storedData = handler.readData();
    }
    
    
    
    public String identify(ArrayList scannedData){
        this.scannedData=scannedData;
        System.out.println(scannedData);
        differences = new ArrayList();
        for(int i=0; i<storedData.size(); i++){
            ArrayList<Float> differenceEntry = new ArrayList();
            //System.out.println("awa");
            try{
                for(int j=1; j<storedData.get(i).size(); j++){
                    float elementDifference = Math.abs(Float.parseFloat(this.scannedData.get(j-1).toString())-Float.parseFloat(storedData.get(i).get(j).toString()));
                    differenceEntry.add(elementDifference);
                }
                differences.add(differenceEntry);
            }
            catch(NumberFormatException e){
                System.out.println("Enter data in correct format! ====> " + e );
            }
        }
        
        ArrayList totalDifference = new ArrayList();
        for(int k=0; k<differences.size(); k++){
            float sum=0;
            for(int i = 0; i < differences.get(k).size(); i++)
                sum += Float.parseFloat(differences.get(k).get(i).toString());         
            totalDifference.add(sum);
        }
        
        float min = 1000000000;
        for(int i=0; i<totalDifference.size(); i++){
            if(Float.parseFloat(totalDifference.get(i).toString()) < min){
                min=Float.parseFloat(totalDifference.get(i).toString());
            }
        }
        System.out.println(min);
        if(min>1){
            return ("Unidentified person!");
        }
        System.out.println(storedData.get(totalDifference.indexOf(min)).get(0));
        return ("Welcome " + storedData.get(totalDifference.indexOf(min)).get(0).toString() + " !");
    }
}
