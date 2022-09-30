package task5.furniture;

public abstract class Furniture {
    protected String material;
    protected int cost;
    protected boolean sold = false;

    public void setCost(int cost) {
        this.cost = cost;
    }
    public int getCost() {
        return cost;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    public String getMaterial() {
        return material;
    }

    public void setSold() {
        this.sold = true;
    }
    public boolean getSold() {
        return sold;
    }

    @Override
    public abstract String toString();
}
