/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stategy59cntt3demo;

import duck.Duck;
import duck.MallardDuck;
import fly.FlyWithWings;
import quack.SQueak;

/**
 *
 * @author Admin
 */
public class Stategy59CNTT3Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Duck duck = new MallardDuck ();
        duck.setFlyBehavior(new FlyWithWings());
        duck.setQuackBehavior(new SQueak());
        System.out.println(duck.display());
    }
    
}
