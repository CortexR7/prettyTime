package io.github.cortexr7.utility;

public class PassedTime {
    private long start;
    private long end;

    public void setStart(){
        start = System.nanoTime();
    }

    public void setEnd(){
        end = System.nanoTime();
    }

    public double getElapsedTimeNano(){
        return end-start;
    }

    public double getElapsedTimeMilli(){
        double tenToPowerOfNegativeSix = 1E-6;
        return  (end-start)*tenToPowerOfNegativeSix;
    }
}
