class Work_within_Methods {
  public static void main(String[] args) {
    //fill in the methods below to do the required operations.  I have pre-filled them so that they will run, but they do not do what they are supposed to yet.
    //Do not change what is in the main method.  I have put in method calls that will let you test to see if your methods are working.
    String str1 = beginningEnd("abcdefg",2);
    String str2 = beginningEnd(str1,5);
    System.out.println(str1);//abcdefgab
    System.out.println(str2);//abcdefgababcde
    double a1 = average(5, 9, 11);
    double a2 = average(5, 10, 11);
    System.out.println(a1 + " " + a2); //8.33 8.67
    char[] arr1 = {'A', 'a', 'B', 'b'};
    char[] arr2 = {'a', 'b', 'c', 'd'};
    System.out.println(hasAnA(arr1));//true
    System.out.println(hasAnA(arr2)); //false
    int[] arr3 = ranFill(5, 25);
    printArray(arr3); //should print the terms of arr3, 10 random ints from 5 - 25
  }

  public static String beginningEnd(String s, int x)
  {
    //should add the first x characters of the string onto the end of the string
    String sub = s.substring(0, x);
    String str = s + sub;
    return str;
  }

  public static double average(int a, int b, int c)
  {
    //should return the correct average of three integers and round the result to two digits.  ie 1, 2 and 4 should return 2.33
    double x = a;
    double y = b;
    double z = c;
    double avg = (x + y + z)/3;
    avg = (double) (Math.round(avg * 100))/100;
    return avg;
  }

  public static boolean hasAnA(char[] a)
  {
    //return true if at least one element of a is a capital A
    for(int i = 0; i < a.length; i++)
    {
      if(a[i] == 'A'){
        return true;
      }
    }
    return false;
  }

  public static int[] ranFill(int min, int max)
  {
    //create and fill an integer array with ten terms with random numbers from min to max
    int a[];
    a = new int[10];
    for(int i = 0; i < a.length; i++)
    {
      a[i] = (int)(Math.random()*(max - min)) + min;
    }
    return a;
  }

  public static void printArray(int[] array)
  {
    //should print the terms of array on one line, separated by a tab
    for(int i = 0; i < array.length; i++)
    {
        System.out.print(array[i] + "\t");
    }
  }
}