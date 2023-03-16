class RND_num_with_Array {
  public static void main(String[] args) {
    int[] array2 = new int[10];
    for (int i = 0; i < array2.length; i++) {
      array2[i] = i % 3;
      System.out.print(array2[i]+ " ");
    }
  }
}