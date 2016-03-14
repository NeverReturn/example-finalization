package reftest;

public class FinalizedResourceFactory {

    public static ResourceFacade newResource() {
        return new FinalizerHandle();
    }    
}
