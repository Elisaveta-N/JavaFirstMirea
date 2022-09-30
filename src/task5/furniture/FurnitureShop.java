package task5.furniture;

public class FurnitureShop {
    Table [] tables;
    Chair[] chairs;
    Wardrobe [] wardrobes;
    public void showFurniture()
    {
        System.out.println("The assortment of the shop is: ");
        for (Table t: tables) {
            if (!t.getSold())
                System.out.println(t);
        }
        for (Chair ch: chairs) {
            if (!ch.getSold())
                System.out.println(ch);
        }
        for (Wardrobe w: wardrobes) {
            if (!w.getSold())
                System.out.println(w);
        }
    }
    public void innitAssortment()
    {
        tables = new Table[5];
        for (int i=0; i < tables.length; ++i) {
            tables[i] = new Table();
        }
        chairs = new Chair[5];
        for (int i=0; i < chairs.length; ++i) {
            chairs[i] = new Chair();
        }
        wardrobes = new Wardrobe[5];
        for (int i=0; i < wardrobes.length; ++i) {
            wardrobes[i] = new Wardrobe();
        }
    }
    public void buy(int tab, int ch, int ward)
    {
        int ic = 0, it = 0, iw = 0, sum = 0;
        for (Table t: tables) {
            if (!t.getSold())
                it++;
        }
        for (Chair c: chairs) {
            if (!c.getSold())
                ic++;
        }
        for (Wardrobe w: wardrobes) {
            if (!w.getSold())
                iw++;
        }
        if (it < tab || ic < ch || iw < ward)
            System.out.println("The shop doesn't have enough furniture");
        else {
                for (Chair c: chairs) {
                    if (!c.getSold() && ch > 0) {
                        c.setSold();
                        ch--;
                        sum += c.getCost();
                    }
                    if (ch == 0)
                        break;
                }
                for (Table t: tables) {
                    if (!t.getSold() && tab > 0) {
                        tab--;
                        t.setSold();
                        sum += t.getCost();
                    }
                    if (tab == 0)
                        break;
                }
                for (Wardrobe w: wardrobes) {
                    if (!w.getSold() && ward > 0) {
                        ward--;
                        w.setSold();
                        sum += w.getCost();
                    }
                    if (ward == 0)
                        break;
                }
            System.out.println("You have bought furniture for the total cost of " + sum);
        }

    }
}
