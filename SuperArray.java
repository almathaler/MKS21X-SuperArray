public class SuperArray {
  //fields
  private String[] data;
  private int size;
  //constructor
  public SuperArray() {
    size = 0;
    data = new String[10];
  }
  //methods
  public void clear() {
    for (int i = size-1; i >= 0; i--) {
      data[i] = null;
    }
    size = 0;
  }

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    if (size == 0) {
      return true;
    }
    return false;
  }

  public boolean add(String element) {
    if (size == data.length) {
      resize();
    }
    data[size] = element;
    size += 1;
    return true;
  }

  public String toString() {
    String rS = "[";
    for (int i = 0; i<size-1; i++) {
      //if (data[i] == null) {
      //  i+=1;
      //}
      //else {
        rS += data[i] + ", ";
      //}
    }
    if (size != 0) {
      rS += data[size-1];
    }
    rS += "]";
    return rS;
  }

  public String toStringDebug() {
    String rS = "[";
    for (int i = 0; i<data.length-1; i++) {
      //if (data[i] == null) {
      //  rS += "null,";
      //}
      //else {
        rS += data[i] + ",";
      //}
    }
    //if (data[data.length-1] == null) {
    //  rS += "null]";
    //}
    //else {
      rS += data[data.length-1]+ "]";
    //}
    return rS;
  }

  public String get(int index) {
    if (index < 0 || index >= size) {
      System.out.println("error: index out of bounds");
      return null;
    }
    else {
      return data[index];
    }
  }

  public String set(int index, String element) {
    if (index < 0 || index >= size) {
      System.out.println("error: index out of bounds");
      return null;
    }
    String oldE = data[index];
    data[index] = element;
    return oldE;

  }

  private void resize() {
    String[] temp = new String[data.length + data.length + 1];
    for (int i = 0; i < data.length; i++) {
      temp[i] = data[i];
    }
    data = temp;
  }

  public boolean contains(String target) {
    for (int i = 0; i<size; i++) {
      if (data[i].equals(target)) {
        return true;
      }
    }
    return false;
  }

  public int indexOf(String target) {
    for (int i = 0; i<size; i++) {
      if (data[i].equals(target)) {
        return i;
      }
    }
    return -1;
  }

  public int lastIndexOf(String target) {
    for (int i = size-1; i>=0; i--) {
      if (data[i].equals(target)) {
        return i;
      }
    }
    return -1;
  }

  public void add(int index, String element) {
    if (index > size || index < 0) {
      System.out.println("Error: index out of range");
    }
    else {
      if (size == data.length) {
        this.resize();
      }
      size++;
      String[] temp = new String[data.length];
      for (int i = 0; i < index; i++) {
        temp[i] = data[i];
      }
      temp[index] = element;
      for (int i = index+1; i<size; i++) {
        temp[i] = data[i-1];
      }
      data = temp;
    }
  }

  public String remove(int index) {
    if (index > size || index < 0) {
      System.out.println("Error: index out of range");
      return null;
    }
    else {
      size--;
      String oldE = data[index];
      String[] temp = new String[data.length];
      for (int i = 0; i < index; i++) {
        temp[i] = data[i];
      }
      for (int i = index; i < size; i++) {
        temp[i] = data[i+1];
      }
      data = temp;
      return oldE;
    }
  }

  public boolean remove(String element) {
    if (!this.contains(element)) {
      return false;
    }
    else {
      size--;
      int index = this.indexOf(element);
      String[] temp = new String[data.length];
      for (int i = 0; i<index; i++) {
        temp[i] = data[i];
      }
      for (int i = index; i<size; i++) {
        temp[i] = data[i+1];
      }
      data = temp;
    }
    return true;
  }


}
