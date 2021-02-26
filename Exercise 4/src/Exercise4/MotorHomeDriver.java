package Exercise4;

public class MotorHomeDriver{
    public static void main(String[] args) {
        //Creating Abstract factory
        MotorHomeAbstractFactory mhFactory = null;


        // Step 2
        // Create a factory instance
        String nextMotorHome = "TypeA"; // simulated user input

        switch (nextMotorHome) {
            case "TypeA" -> {
                System.out.println("\nType A motor home selected");
                mhFactory = new MotorHomeAbstractFactory() {
                    @Override
                    public Frame createFrame() {
                        return null;
                    }

                    @Override
                    public Style createStyle() {
                        return null;
                    }

                    @Override
                    public Engine createEngine() {
                        return null;
                    }

                    @Override
                    public Kitchen createKitchen() {
                        return null;
                    }
                };
            }
            case "TypeB" -> {
                System.out.println("\nType B motor home selected");
                mhFactory = new TypeBFactory();
            }
            case "TypeC" -> {
                System.out.println("\nType C motor home selected");
                mhFactory = new TypeCFactory();
            }
            default -> System.out.println("Invalid motor home type entered.");
        }

        // Step 3
        // Create motor home components
        Style mhStyle = mhFactory.createStyle();
        Frame mhFrame = mhFactory.createFrame();
        Engine mhEngine = mhFactory.createEngine();
        Kitchen mhKitchen = mhFactory.createKitchen();

        // Step 4
        // Provide Output
        System.out.println("\nComponent list for " + nextMotorHome + " motor home");
        System.out.println(mhStyle.getStyle());
        System.out.println(mhFrame.getFrame());
        System.out.println(mhEngine.getEngine());
        System.out.println(mhKitchen.getKitchen());
    }
}
