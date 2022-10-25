/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testproject;
import TIKI.searchTIKI;
import SENDO.searchSENDO;
public class Testproject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        searchTIKI tiki=new searchTIKI("samsung");
        searchSENDO sendo=new searchSENDO("samsung");
        System.out.println("TIKI: SAMSUNG");
        for(int i=0;i<tiki.getListproduct().size();i++)
            System.out.println(tiki.getproduct(i).getName());
        System.out.println("SENDO: SAMSUNG");
        for(int i=0;i<sendo.getListproduct().size();i++)
            System.out.println(sendo.getproduct(i).getName());
        
    }
}
