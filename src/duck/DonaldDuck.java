/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duck;

/**
 *
 * @author Admin
 */
public class DonaldDuck extends Duck
{

    @Override
    public String display() 
    {
        return "Chào mọi người tôi là vịt Donald" + "\n" +
                swim() + "\n" +
                performFly() + "\n" +
                performQuack();
    }
    
}
