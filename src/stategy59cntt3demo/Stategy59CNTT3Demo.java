/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stategy59cntt3demo;

import duck.DonaldDuck;
import duck.Duck;
import duck.MallardDuck;
import fly.FlyNoWings;
import fly.FlyWithWings;
import quack.MuteQuack;
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
        Duck duck1 = new MallardDuck ();
        duck1.setFlyBehavior(new FlyWithWings());
        duck1.setQuackBehavior(new SQueak());
        System.out.println(duck1.display());
        
        Duck duck2 = new DonaldDuck ();
        duck2.setFlyBehavior(new FlyNoWings());
        duck2.setQuackBehavior(new MuteQuack());
        System.out.println(duck2.display());
    }
    
}
