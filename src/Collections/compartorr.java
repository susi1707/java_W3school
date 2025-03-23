package Collections;

import java.util.Comparator;

public class compartorr implements Comparator {


    @Override
    public int compare(Object o1, Object o2) {
        IbsEmployee ibs = (IbsEmployee) o1;
        IbsEmployee ib2 = (IbsEmployee) o2;
        if(ibs.hike > ib2.hike ){
            return 1;
        } else if (ibs.hike < ib2.hike) {
            return -1;
        }
        else
            return 0;
    }
}
