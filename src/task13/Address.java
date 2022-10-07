package task13;

import java.util.StringTokenizer;

public class Address {
    String country;
    String region;
    String city;
    String street;
    String house;
    String corpus;
    String flat;

    public void setAddress(String address) {
        String [] add = address.split(",");

        /*StringTokenizer st = new StringTokenizer(address, ",");
        int i = 0;
        String [] add = new String[7];
        while (st.hasMoreTokens()) {
            add[i] = st.nextToken();
        }*/
        country = add[0];
        region = add[1];
        city = add[2];
        street = add[3];
        house = add[4];
        corpus = add[5];
        flat = add[6];
    }
    public String getAddress()
    {
        return country + " " + region + " " + city + " " + street + " " + house + " " + corpus + " " + flat;
    }

    public static void main(String[] args) {
        String str1 = "Russia,MoscowRegion,Serpukhov,Osennyaya,7,a,67";
        String str2 = "USA,Texas,Arlington,CentralSt,12a,c2,123";
        Address ad1 = new Address();
        ad1.setAddress(str1);
        System.out.println(ad1.getAddress());
        ad1.setAddress(str2);
        System.out.println(ad1.getAddress());

    }
}
