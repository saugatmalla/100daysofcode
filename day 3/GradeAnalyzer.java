import java.util.ArrayList;

class GradeAnalyzer{
  //constructor
  public GradeAnalyzer(){
  }
  
  
  //Method getAverage
  public int getAverage(ArrayList<Integer> grades){
    if (grades.size() < 1) {
      System.out.println("ArrayList is empty, dude!");
      return 0;
    }else{
      int sum = 0;
      int average = 0;
      for (int grade : grades) {
        sum += grade;
      }
      average = sum/grades.size();
      return average;
    }
    
    
    }
  public static void main(String[] args) {
      GradeAnalyzer myAnalyzer = new GradeAnalyzer();
      
      ArrayList<Integer> myClassroom = new ArrayList<Integer>();
      myClassroom.add(98);
      myClassroom.add(92);
      myClassroom.add(88);
      myClassroom.add(75);
      myClassroom.add(61);
      myClassroom.add(89);
      myClassroom.add(95);
    
   int average =  myAnalyzer.getAverage(myClassroom);
    System.out.println("The average is " + average);
  }
  
  
  
}