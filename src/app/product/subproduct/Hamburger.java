package app.product.subproduct;

import app.product.Product;

public class Hamburger extends Product {
    private boolean isBurgerSet;
    private int bergerSetPrice;

    public Hamburger(int id, String name, int price, int kcal, boolean isBurgerSet, int bergerSetPrice) {
        super(id, name, price, kcal);
        this.isBurgerSet = isBurgerSet;
        this.bergerSetPrice = bergerSetPrice;
    }

    public boolean isBurgerSet() {
        return isBurgerSet;
    }

    public void setBurgerSet(boolean burgerSet) {
        isBurgerSet = burgerSet;
    }

    public int getBergerSetPrice() {
        return bergerSetPrice;
    }

    public void setBergerSetPrice(int bergerSetPrice) {
        this.bergerSetPrice = bergerSetPrice;
    }
}
