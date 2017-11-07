public class Premax {

    public static Integer premax(int[] ints) {
        if (ints == null || ints.length < 2){
            return null;
        }

        int max = ints[0];
        int premax = ints[0];

        for(Integer x : ints){
            if (x > max){
                premax = max;
                max = x;
            }else if ((max == premax) || x > premax && x != max){
                premax = x;
            }
        }
        return premax == max ? null : premax;
    }
}
