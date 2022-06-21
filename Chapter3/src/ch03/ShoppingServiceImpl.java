package ch03;

public class ShoppingServiceImpl implements ShoppingService {

    @Override
    public Integer buy(Integer money, String thing) {
        System.out.println("물건 한개 샀음");
        return null;
    }

    @Override
    public Integer buy(Integer money, String[] things) {
        System.out.println("물건 여러개 샀음");
        return null;
    }

    @Override
    public Integer sell(Integer money, String thing) {
        System.out.println("물건 한개 팔았음");
        return null;
    }

    @Override
    public Integer sell(Integer money, String[] things) {
        System.out.println("물건 여러개 팔았음");
        return null;
    }
}
