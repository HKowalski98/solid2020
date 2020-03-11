package pl.zzpj2020.solid.ocp.usa.solution;


public class GA implements FineCounter {
    private static final int GA_MAX_SPEED = 0;

    @Override
    public double calcualateSpeedLimitFine(int speed) {
        if(speed > GA_MAX_SPEED){
            return speed*5.0;
        }
        else return 0;
    }
}
