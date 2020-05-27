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
public class Student {
    
    private String name;
    
    public Student()
    {
        name = " ";
    }
    
    public Student(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    @Override
    public String toString()
    {
        return name;
    }

}
