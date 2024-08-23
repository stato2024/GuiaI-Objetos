package service;

import model.HourClass;

public class ServiceHour {
    public ServiceHour() {
    }

    public HourClass CreateClock (Integer Hour, Integer minutes, Integer seconds){
        if (Hour >= 0 && Hour <= 23) {
            if (minutes >= 0 && minutes <= 59) {
                if (seconds >= 0 && seconds <= 59) {

                    return new HourClass(Hour, minutes, seconds);
                }
            }
        }
        System.out.println("Los valores son erroneos");
        return new HourClass(0,0,0);
    }

    public void sumseconds(HourClass H1){
        if (H1.getSeconds() == 59) {
            H1.setSeconds(0);
            sumsminutes(H1);
        }else{
                H1.setSeconds(H1.getSeconds() + 1);
            }
        }

        public void sumsminutes(HourClass H1){
            if (H1.getMinute() == 59) {
                H1.setMinute(0);
                sumHour(H1);
                H1.setSeconds(0);
            }else{
                H1.setMinute(H1.getMinute() + 1);
            }
        }


        public void retmin(HourClass H1){
            if (H1.getMinute() == 0) {
                H1.setMinute(59);
                retHour(H1);
                H1.setSeconds(0);
            }else{
                H1.setMinute(H1.getMinute() - 1);
            }
        }

    public void retHour(HourClass H1){
        if (H1.getHour() == 0) {
            H1.setHour(23);
        }else{
            H1.setHour(H1.getHour() - 1);
        }
    }

        public void retseg(HourClass H1){
        if (H1.getSeconds() == 0) {
            H1.setMinute(59);
            retmin(H1);
        }else{
            H1.setSeconds(H1.getSeconds() - 1);
        }
    }


    public void sumHour(HourClass H1){
        if (H1.getHour() == 59) {
            H1.setHour(0);
        }else{
            H1.setHour(H1.getHour() + 1);
        }
    }

    public void showClock (HourClass H1){
        System.out.println("Reloj[" + String.format("%02d", H1.getHour()) + ":" + String.format("%02d", H1.getMinute()) + ":" + String.format("%02d", H1.getSeconds()) + "]");
    }
}
