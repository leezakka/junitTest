public class Collaborator {
    private final Receiver receiver;

    public Collaborator(Receiver receiver) {
        this.receiver = receiver;
    }

    public void collaborate() {
        receiver.receive("이것 좀 처리해줘");
    }
}
