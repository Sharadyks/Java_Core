package Abstraction_and_more;

public abstract class Vehicle implements Transport {
    private int noOfTyres;

    public abstract void makeStartSound();
    public Vehicle(int noOfTyres){
        this.noOfTyres = noOfTyres;
    }

    Transport t = new Transport(){
        @Override
        public void getSetGo() {
            System.out.println("Return to place....");
        }
    };

    public void getSetGo() {
        System.out.println("Going to place");
    }

    public int getNoOfTyres() {
        return noOfTyres;
    }

    public void setNoOfTyres(int noOfTyres) {
        this.noOfTyres = noOfTyres;
    }

    public void commute(){
        System.out.println("Going...");
    }
}
