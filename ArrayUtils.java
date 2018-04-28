import java.util.ArrayList;

public class ArrayUtils {

  // Copies source array into the end of the dest array
  <T> ArrayList<T> copy(ArrayList<T> dest, ArrayList<T> source) {
    for (int i = 0; i < source.size(); i++) {
      dest.add(source.get(i));
    }
    return dest;

  }

  // Swaps the items at the given indexes at the given source ArrayList<T>
  <T> void swap(int a, int b, ArrayList<T> source) {
    T item1 = source.get(a);
    T item2 = source.get(b);
    source.set(b, item1);
    source.set(a, item2);

  }

}
