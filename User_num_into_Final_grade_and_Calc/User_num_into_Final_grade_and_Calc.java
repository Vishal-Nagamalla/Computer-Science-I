class User_num_into_Final_grade_and_Calc {
  public static void main(String[] args) {
    int earned1 = 9;
    int earned2 = 10;
    int earned3 = 3;
    int poss1 = 10;
    int poss2 = 10;
    int poss3 = 5;
    double pointsEarned = earned1 + earned2 + earned3;
    double pointsPossible = poss1 + poss2 + poss3;
    double finalGrade = (pointsEarned / pointsPossible) * 100;
    System.out.println("You earned " + (int)pointsEarned + " out of a possible " + (int)pointsPossible);
    System.out.println("Your grade so far is an " + finalGrade + "%");
  }
}