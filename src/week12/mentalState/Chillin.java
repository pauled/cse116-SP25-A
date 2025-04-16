package week12.mentalState;

public class Chillin extends MentalState{
    public Chillin(Student brain){
        super(brain);
    }
    public void study(){
        System.out.println("I am suuch a good student I still study");
    }
    public void getCloserToExam(){
        System.out.println("I am so good I take exam even when done");
    }
    public void expressFeelings(){
        System.out.println("I am done");
    }
}
