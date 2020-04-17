/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duck;

import fly.IFlyBehavior;
import quack.IQuackBehavior;

/**
 *
 * @author Admin
 */
public abstract class Duck 
{
    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;

    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(IQuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
    
    public String performQuack()
    {
        return quackBehavior.quack();
    }
    
    public String performFly()
    {
        return flyBehavior.fly();
    }
    
    public String swim()
    {
        return "Tôi có thể bơi lội";
    }
    
    public abstract String display();
}
