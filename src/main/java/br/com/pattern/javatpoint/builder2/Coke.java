package br.com.pattern.javatpoint.builder2;

/**
 *
 * @author Ashwani
 */
public abstract class Coke extends ColdDrink {
    
    @Override
    public abstract  String name();

    @Override
    public abstract  String size();
    
    @Override
    public abstract  float price();    
}