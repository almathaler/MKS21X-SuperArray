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
    for (int i = 0; i<10; i++) { //switch this back to 10 whenever
    System.out.println("--" + letters[i] + "--");
    System.out.println("Let's add the letter " + letters[i] + " to SA1. Did this work? (expect true): " + SA1.add(letters[i]));
    System.out.println("How big is SA1 now? (expect " + i + "): " + SA1.size());
    //test toString
    System.out.println("toString() won't print out the null, but here is how SA1 currently looks: " + SA1);
    //test toStringDebug
    System.out.println("toStringDebug(): " + SA1.toStringDebug());
    System.out.println("--" + letters[i] + "--");
  }
  System.out.println("Array is full but let's add \" k \": ");
  SA1.add("k");
  System.out.println("size? isEmpty? toString? toStringDebug?: " + + SA1.size() + ", " + SA1.isEmpty() + ", " + SA1 + ", " + SA1.toStringDebug());
  System.out.println("--M--O--V--I--N--G----O--N");
  System.out.println("Now let's clear,");
  SA1.clear();
  System.out.println("size? isEmpty? toString? toStringDebug?: " + SA1.size() + ", " + SA1.isEmpty() + ", " + SA1 + ", " + SA1.toStringDebug());
  System.out.println("--C--H--E--C--K----S--E--T--&--G--E--T");
  System.out.println("");
  System.out.println("Now let's check set and get");
  System.out.println("Setting index 3 to \" hey \", should print error since 3 is greater than size: ");
  System.out.println(SA1.set(3, "hey"));
  System.out.println("Setting index -1 to \" hey \", should print error since -1 doesn't exist: ");
  System.out.println(SA1.set(-1, "hey"));
  SA1.add("a");
  SA1.add("b");
  SA1.add("c");
  SA1.add("d");
  System.out.println("Adding \"a\" and \"b\" and \"c\" and \"d\", so that index 3 is valid and also should return \"d\" since that's what was in set: " + SA1.set(3, "hey"));
  System.out.println("size (4)? toString ([a, b, c, hey])?: " + SA1.size() + ", " + SA1);
  System.out.println("----");
  System.out.println("GET, we are going to go through all 4 elements and print all, and then get 2 errors: one for -1 and one for index 4");
  for (int i = -1; i < 5; i++) {
    System.out.println(SA1.get(i));
  }
  System.out.println("--C--O--N--T--A--I--N--S--");
  System.out.println("Contains a? Contains b? Contains c? Contains hey? Contains d? Contains A?: ");
  System.out.println(SA1.contains("a") + ", " + SA1.contains("b") + ", " + SA1.contains("c") + ", " + SA1.contains("hey") + ", " + SA1.contains("d") + ", " + SA1.contains("A"));
  System.out.println("--I--N--D--E--X----O--F");
  System.out.println("let's add two more As to SA1 to confuse this method");
  SA1.add("a");
  SA1.add("a");
  System.out.println("This is how SA1 now looks: " + SA1);
  System.out.println("Where is the first index of a? (should return 0): " + SA1.indexOf("a"));
  System.out.println("Where is the last index of a? (Should return 5): " + SA1.lastIndexOf("a"));
  System.out.println("What happens when we search for first or last index of something not in SuperArray (two -1s)?: " + SA1.indexOf("ggg") + ", " + SA1.lastIndexOf("djfkS"));
  System.out.println("D--O--N--E");


    //System.out.println("Done for now");

  }
}
