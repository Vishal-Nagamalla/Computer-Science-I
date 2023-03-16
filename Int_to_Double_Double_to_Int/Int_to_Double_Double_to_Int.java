class Int_to_Double_Double_to_Int {
  public static void main(String[] args) {
    System.out.println(prodThree(4, 5, 6));  //should output 120
    System.out.println(sumQuot(9, 5));  //should output 2.8
  }
  public static int prodThree (int a, int b, int c){
    return a * b * c;
  }
  public static double sumQuot (double a, double b){
    return (a + b)/b;
  }
}