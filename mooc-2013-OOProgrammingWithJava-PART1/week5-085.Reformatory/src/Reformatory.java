public class Reformatory {
    private int amountsWeightCalled = 0; 

    public int weight(Person person) {
        amountsWeightCalled++; 
        return person.getWeight();
    }
    
    public void feed(Person person){
        person.setWeight(person.getWeight() + 1);
    }
    
    public int totalWeightsMeasured(){
        return amountsWeightCalled;
    }

}
