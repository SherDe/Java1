package Animals;

public abstract class Animals {
    private final int maxRun;
    private final int maxSwim;

    public Animals(int maxRun, int maxSwim) {

        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
    }
    public int getMaxRun() {
return maxRun;

    }

    public int getMaxSwim() {
        return maxSwim;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);
}