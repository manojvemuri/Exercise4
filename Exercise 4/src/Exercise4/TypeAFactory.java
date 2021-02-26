package Exercise4;

public class TypeAFactory {


    public Frame createFrame() {
        return new TypeAFrame();
    }

    public Style createStyle() {
        return new TypeAStyle();
    }

    public Engine createEngine() {
        return new TypeAEngine();
    }

    public Kitchen createKitchen() {
        return new TypeAKitchen();
    }
}