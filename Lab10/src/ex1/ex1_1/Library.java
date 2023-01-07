package ex1.ex1_1;

import java.time.Duration;

public class Library {
    Rent[] rents;

    public Library(Rent[] rents) {
        this.rents = rents;
    }

    public Rent getLongestRent(){
        Rent longestRent = rents[0];
        for (int i = 0; i < rents.length; i++) {
            long time = (rents[i].begin.getTime() - rents[i].end.getTime())/(24*60*60*1000);
            long timelongest = (longestRent.begin.getTime() - longestRent.end.getTime())/(24*60*60*1000);
            if (timelongest < time) {
                longestRent = rents[i];
            }
        }
        return longestRent;
    }
}
