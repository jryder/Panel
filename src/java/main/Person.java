/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author jorda_000
 */
@Named(value = "person")
@Dependent
public class Person {
    
    String name;

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = "Test";
    }



    /**
     * Creates a new instance of Person
     */
    public Person() {

    }
}
