package reftest;

public class FinalizerHandle extends Resource {

    protected void finalize() {
        dispose();
    }
}
