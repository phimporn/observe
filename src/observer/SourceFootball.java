/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author sarun
 */
public interface SourceFootball  {
    public void notifyObservers();
    public void register(MyObserver observer);
}
