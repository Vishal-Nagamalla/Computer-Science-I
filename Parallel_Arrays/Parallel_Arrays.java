class Parallel_Arrays {
  public static void main(String[] args) {
    System.out.println("Football Stats - QuarterBack:");
    String [] name = {"Tom   ", "Peyton", "Patrick", "Russell", "Eli   "};
    char [] lastInital = {'B', 'M', 'M', 'W', 'M'};
    int [] completions = {6778, 6125, 1114, 2820, 4895};
    System.out.println("First Name\tLast Intital\tTotal Completions");

    for(int i = 0; i < name.length; i++)
    {
      System.out.println(name[i] + "\t\t" + lastInital[i] + "\t\t\t\t" + completions[i]);
    }
  }
}