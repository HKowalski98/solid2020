package pl.zzpj2020.solid.ocp.usa.solution;

public class SC implements FineCounter {
    private static final int SC_MAX_SPEED = 0;

    @Override
    public double calcualateSpeedLimitFine(int speed) {
        if(speed > SC_MAX_SPEED){
            return speed*2.0;
        }
        else return 0;
    }
}
