package tema.scoalainformala.week6;

public class Calculator {
    float mm;
    float cm;
    float dm;
    float m;
    float km;
    float sum;

    public float getMm() {
        return mm;
    }

    public float getCm() {
        return cm;
    }

    public float getDm() {
        return dm;
    }

    public float getM() {
        return m;
    }

    public float getKm() {
        return km;
    }


    public float calculate(float mm, float cm, float dm, float m, float km) {
        this.mm = mm;
        this.cm = cm;
        this.dm = dm;
        this.m = m;
        this.km = km;
        if (mm > 0 || mm < 0) {
            cm = cm * 10;
            dm = dm * 100;
            m = m * 1000;
            km = km * 1000000;
        }
        if (mm == 0 && cm > 0 || cm < 0) {
            cm = cm * 1;
            dm = dm * 10;
            m = m * 100;
            km = km * 100000;
        }
        if (mm == 0 && cm == 0 && dm > 0 || dm < 0) {
            dm = dm * 1;
            m = m * 10;
            km = km * 10000;
        }
        if (mm == 0 && cm == 0 && dm == 0 && m > 0 || m < 0) {
            m = m * 1;
            km = km * 1000;
        }
        if (mm == 0 && cm == 0 && dm == 0 && m == 0 && km > 0 || km < 0) {
            km = km * 1;
        }
        sum = mm + cm + dm + m + km;
        return sum;
    }
    public float getSum() {
        return sum;
    }
}

