public class Driver{
  public static void main(String[] args) {
    String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
    System.out.println("Just initialized SA1, a SuperArray made by the default constructor");
    SuperArray SA1 = new SuperArray();
    //test size
    System.out.println("Given no elements, SA1 has size: " + SA1.size());
    //test isEmpty
    System.out.println("So, does it qualify as isEmpty()?: " + SA1.isEmpty());
    //test add
    System.out.println("--L--O--O--P--");
    for (int i = 0; i<10; i++) {
    System.out.println("--" + letters[i] + "--");
    System.out.println("Let's add the letter " + letters[i] + " to SA1. Did this work? (expect true): " + SA1.add(letters[i]));
    System.out.println("How big is SA1 now? (expect " + i + "): " + SA1.size());
    //test toString
    System.out.println("toString() won't print out the null, but here is how SA1 currently looks: " + SA1);
    //test toStringDebug
    System.out.println("toStringDebug(): " + SA1.toStringDebug());
    System.out.println("--" + letters[i] + "--");
  }
    System.out.println("Now let's clear,");
    SA1.clear();
    System.out.println("size? isEmpty? toString? toStringDebug?: " + SA1.size() + ", " + SA1.isEmpty() + ", " + SA1 + ", " + SA1.toStringDebug());

    System.out.println("--D--O--N--E--");

    //System.out.println("Done for now");

  }
}
