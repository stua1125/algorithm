package test240721;

public class TestOne {

    public static void main(String[] args) {

        int year = 1987;

        int p = 1987;
        int answer = 0;

        for(int i = p+1; i < 1990; i++) {
            int [] tmp = new int[4];

            int num = i;

            tmp[0] = (int) (num/(1000));
            num= num%1000;
            tmp[1] = (int) (num/(100));
            num= num%100;
            tmp[2] = (int) (num/(10));
            num= num%10;
            tmp[3] = (int) (num);

            System.out.println(tmp[0] + "" + tmp[1] + "" + tmp[2] + "" + tmp[3] );

        }
    }
}
