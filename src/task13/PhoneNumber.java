package task13;

public class PhoneNumber {
    public StringBuilder changeNumber (String str)
    {
        StringBuilder res = new StringBuilder();
        if (str.charAt(0) == '8')
            res.append("+7").append(str, 1, 4).append('-').append(str, 4, 7).append('-').append(str.substring(7));
        else
            res.append(str, 0, str.length()-7).append('-').append(str, str.length()-7, str.length()-4).append('-').append(str.substring(str.length()-4));
        return res;
    }

    public static void main(String[] args) {
        PhoneNumber ph = new PhoneNumber();
        System.out.println(ph.changeNumber("89772997435"));
        System.out.println(ph.changeNumber("+79772997435"));
        System.out.println(ph.changeNumber("+109772997435"));
    }
}
