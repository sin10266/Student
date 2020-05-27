/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sheridancollege.softwaredevelopment;

/**
 *
 * @author Manjot Singh
 */
public class TestStudent1 {
    
    public static void main(String[] args)
    {
        Student[] arr = new Student[5];
        
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = new Student();
            arr[i].setName("Student " + (i + 1));
        }
        
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
