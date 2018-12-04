
public class Main {
    public static void main(String[] args){
        RoachMotel TheRoach911 = RoachMotel.getInstance();
        // TheRoach911.demo();

        TheRoach911.createRooms(6);
        System.out.println(TheRoach911);



        RoachColony r1 = new RoachColony("Nielsen",2,1.0,TheRoach911);
        RoachColony r2 = new RoachColony("Hansen",3,1.2,TheRoach911);
        RoachColony r3 = new RoachColony("Skywalker",4,1.3,TheRoach911);
        RoachColony r4 = new RoachColony("vw ey553&¤%w",2,2.0,TheRoach911);
        RoachColony r5 = new RoachColony("Jensen",10,0.8,TheRoach911);
        RoachColony r6 = new RoachColony("Vader",5,1.0,TheRoach911);

        TheRoach911.notifyObserver();

        TheRoach911.checkIn(r1,"deluxe", true, false, true);
        TheRoach911.checkIn(r2,"regular", false, true, true);
        TheRoach911.checkIn(r3,"suite", true, true, false);
        TheRoach911.checkIn(r4,"deluxe", true, true, true);
        TheRoach911.checkIn(r5,"suite", false, false, false);
        TheRoach911.checkIn(r6,"regular", true, true, true);
        
        System.out.println(TheRoach911);


    }
}
