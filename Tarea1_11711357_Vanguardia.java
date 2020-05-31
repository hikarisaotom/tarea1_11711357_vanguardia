package tarea1_11711357_vanguardia;

/**
 *
 * @author Claudia Cortes
 */
public class Tarea1_11711357_Vanguardia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        EagerSingleton a = EagerSingleton.getInstance();
        System.out.println("******************************************************EJEMPLO DE SINGLETON ******************************************************");
        System.out.println("Objeto : "+ a);
        
        
     
        System.out.println("****************************************************** EJEMPLO FACTORY******************************************************");
        Car small = new CarFactory().buildCar(CarType.SMALL);
        Car luxury = new CarFactory().buildCar(CarType.LUXURY);
        Car sedan = new CarFactory().buildCar(CarType.SEDAN);
        System.out.println("Tipo : "+small.model);
        System.out.println("Tipo : "+luxury.model);
        System.out.println("Tipo: "+sedan.model);
        System.out.println("****************************************************** EJEMPLO OBSERVER ******************************************************");
        
        HeadHunter hunter = new HeadHunter();
        JobSeeker usuario1 = new JobSeeker("Wilfredo");
        JobSeeker usuario2 = new JobSeeker("Ingrid");
        JobSeeker usuario3 = new JobSeeker("Claudia");
        hunter.registerObserver(usuario1);
        hunter.registerObserver(usuario2);
        hunter.registerObserver(usuario3);
        hunter.addJob("Cocinero");
        System.out.println(hunter.getJobs().get(0));
        hunter.notifyAllObserver();
        System.out.println("");
        
        System.out.println("****************************************************** EJEMPLO BUILDER******************************************************");
        MealDirector mealDirector = new MealDirector();
        mealDirector.makeMeal(new SandwichMealBuilder());
    }
    
    
}
