package com.marcinjc.interfacey;

import java.util.Date;

public class BrokenClock implements Clock {
    @Override
    public long secondsElapsedSince(Date date) {
        return 300;
    }
}
