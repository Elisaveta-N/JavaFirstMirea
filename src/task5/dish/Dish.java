package task5.dish;

public abstract class Dish {
    protected boolean clean;
    protected boolean full;
    abstract void isFull();

    public void setClean(boolean clean) {
        this.clean = clean;
    }
    public boolean getClean()
    {
        return clean;
    }

    public void setFull(boolean full) {
        this.full = full;
    }
    public boolean getFull()
    {
        return full;
    }
}


