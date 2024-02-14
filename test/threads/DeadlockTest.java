package threads;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DeadlockTest {

    @Test
    public void testDeadlock() {
        Deadlock deadlockExample = new Deadlock();

        // Execute the threads
        deadlockExample.executeThreads();

        // If the execution completes without deadlock, the test passes
        assertTrue("No deadlock occurred",false);
    }
}

