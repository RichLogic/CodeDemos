package cocurrent;

import java.util.concurrent.atomic.AtomicLong;

public class SafeWM {
    private final AtomicLong upper = new AtomicLong(0);
    private final AtomicLong lower = new AtomicLong(0);

    void setUpper(long v) {
        upper.set(v);
    }

    void setLower(long v) {
        lower.set(v);
    }
}
