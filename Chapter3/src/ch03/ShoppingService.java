package ch03;

// Architecture (설계도)
public interface ShoppingService {

    // Overloading
    public Integer buy(Integer money, String thing);
    public Integer buy(Integer money, String[] things);

    public Integer sell(Integer money, String thing);
    public Integer sell(Integer money, String[] things);

}
