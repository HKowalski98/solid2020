package pl.zzpj2020.solid.ocp.usa.solution;

public class AL implements FineCounter {
    private static final int AL_MAX_SPEED = 0;

    @Override
    public double calcualateSpeedLimitFine(int speed) {
        if(speed > AL_MAX_SPEED){
            return speed*9.0;
        }
        else return 0;
    }
}
