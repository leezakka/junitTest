import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CollaboratorTest {

    @Test
    public void testCollaborateWithReceiver() {
        Receiver receiver = mock(Receiver.class);

        Collaborator collaborator = new Collaborator(receiver);

        collaborator.collaborate();

        verify(receiver).receive("이것 좀 처리해줘");
    }
}
