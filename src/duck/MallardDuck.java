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
public class MallardDuck extends Duck
{

    @Override
    public String display() 
    {
        return "Tôi là giống vịt cổ xanh" + "\n" +
                swim() + "\n" +
                performFly() + "\n" +
                performQuack();
                
    }
    
}
