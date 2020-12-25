package coding_pretice;


import java.text.SimpleDateFormat;
import java.util.Date;

public class ASD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        Date spreadDate = (new Date());
        Date nowDate = new Date();
        long calDate = nowDate.getTime() - spreadDate.getTime();
        long calDateDays = calDate / (24*60*60*1000);
        calDateDays = Math.abs(calDateDays);
        System.out.println(calDateDays);
        if(calDateDays > 7){
            System.out.println("씨뽕");
        }
	}

}
