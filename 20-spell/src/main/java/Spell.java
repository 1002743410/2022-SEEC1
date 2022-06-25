public class Spell {
    public boolean spell(int x, int y) {
        //add code here
        while (true) {
            if (x >= y) {
                return true;
            } else if (x < y) {
                if (x % 2 == 0) {
                    if ((3 * x) / 2 < y) {
                        if (((3 * x) / 2)-1==x){
                            return false;
                        }else {
                            x = (3 * x) / 2;
                        }
                    } else {
                        return true;
                    }
                } else {
                    if ((3*(x-1))/2!=x && x>2) {
                        x=(3*(x-1))/2;
                    } else {
                        return false;
                    }
                }
            }
        }
    }
}
