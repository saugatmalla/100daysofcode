import java.util.HashMap;

class Library{
  //constructor
  public Library() {
    }
  
  //method for finished books
  public void getFinishedBooks(HashMap<String, Boolean> library) {
    if (library.size() < 1) {
    	  System.out.println("Dear Sir, your HashMap is empty.");
    } else {
      for (String book : library.keySet() ) {
        if (library.get(book) == true ) {
          System.out.println(book);
        }
      }
    }   
  }
  
  //method for unfinished books
  public void getUnfinishedBooks(HashMap<String, Boolean> library2) {
    if (library2.size() < 1) {
    	  System.out.println("Dear Sir, your HashMap is empty.");
    } else {
      for (String book2 : library2.keySet() ) {
        if (library2.get(book2) == false ) {
          System.out.println(book2);
        }
      }
    }   
  }
  
  public static void main(String[] args) {
    //making the hashmap called myBooks
      HashMap<String, Boolean> myBooks = new HashMap<String, Boolean>();
      myBooks.put("Paral ko aago ", true);
      myBooks.put("Aalu ", false);
      myBooks.put("Seto Dharti ", true);
      myBooks.put("Rukmini ", false);
    	myBooks.put("Muna Madan", false);
      
      Library myLibrary = new Library();
    
    	System.out.println("The finished books are: ");
    	myLibrary.getFinishedBooks(myBooks);
    		
    	System.out.println("The unfinished books are: ");
    	myLibrary.getUnfinishedBooks(myBooks);
    
    
    }
     
}