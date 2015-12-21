class Question extends Exam {
   String description;
   public Question(String desc) {
      this.description = desc;
   }
   public void print() {
      System.out.println(description);
   }      
}