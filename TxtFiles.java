/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package txtfiles;

public class TxtFiles {

    public static void main(String[] args) {
        String fileContent = "CSC102";
        String fileName = "CSC102.txt";

        try {
            if (fileContent == null || fileName == null) {
              throw new Exception("File content or name is null.");
            }
            
            System.out.println( fileContent);
            System.out.println( getFileName(fileName));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

     public static String getFileName(String fileName) {
        return fileName;
    }
}