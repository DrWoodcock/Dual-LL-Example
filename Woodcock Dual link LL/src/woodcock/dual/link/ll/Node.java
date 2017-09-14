/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package woodcock.dual.link.ll;

/**
 *
 * @author woodcocktg
 */
public class Node {
    public int value;
    public Node nextLL;
    public Node prevLL;
    
    public Node(int value)
    {
        this.value = value;
        nextLL = null;
        prevLL = null;
    }
    
}
