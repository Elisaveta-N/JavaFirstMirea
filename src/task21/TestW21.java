package task21;

import java.io.File;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Stream;

class AnyData{
    private Object[] arr;
    int indx;
    int size;
    public AnyData()
    {
        indx = 0;
        size = 10;
        arr = new Object[size];
    }

    <T> void add(T val)
    {
        if(indx >= size)
        {
            size *= 2;
            arr = Arrays.copyOf(arr, size);
        }

        arr[indx] = val;
        indx++;
    }

    Object get_at_index(int indx)
    {
        if(indx > -1 && indx < size)
            return arr[indx];
        else
            return null;
    }

    int size()
    {
        return indx + 1;
    }
}



public class TestW21 {
    static AnyData listFiles(String dir)
    {
        AnyData any = new AnyData();
        Stream<File> stream = Stream.of(Objects.requireNonNull(new File(dir).listFiles()));
        for(File f : stream.toList())
        {
            any.add(f);
        }

        return any;
    }

    public static void main(String[] args) {
        String dir = "C:/Temp";
        AnyData any = listFiles(dir);
        for(int i = 0; i < any.size(); ++i) {
            System.out.println(any.get_at_index(i));
            if(i == 4) break;
        }
    }
}
