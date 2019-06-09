package sample;

public class IllegalTic extends Exception {

    public IllegalTic() {
        super("Illegal parameter value supplied.");
    }

    /**
     * Passes along the message supplied to the exception.
     * @param message A more specific message.
     */
    public IllegalTic(String message) {
        super(message);
    }
}
