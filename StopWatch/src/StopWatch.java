
public class StopWatch {
    public long startTime;
    public long endTime;

    public StopWatch(){
    }
    public long start(){
        return this.startTime = System.currentTimeMillis();
    }

    public long stop() {
        return this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime-startTime;
    }
}
