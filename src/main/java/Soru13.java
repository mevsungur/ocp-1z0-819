/**
 * @author mevlut.sungur
 */
public class Soru13 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};


    }
}

class CD {
    int r;

    CD(int r) {
        this.r = r;
    }

    CD() {}

}

class DVD extends CD {
    int c;
    DVD(int r, int c) {
        super.r=r;
        this.c=c;
    }
}
