class String_Replacement {
  public static void main(String[] args) {
    String s = "whenever, wherever, we're meant to be together";

    int e = 0;
    System.out.println(s);
    for (int i = 0; i < s.length(); i ++)
    {
      if (s.substring(i,i+1).equals("e"))
        e ++;
    }
    System.out.println("This sentence has " + e + " e's");

    String replace = s.replace("r","R");
    System.out.println(replace);

    String replace1 = s.replace("e","");
    System.out.println(replace1);
  }
}