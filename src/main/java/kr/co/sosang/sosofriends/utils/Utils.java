package kr.co.sosang.sosofriends.utils;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class Utils {
     public static String chkNull(String str){
         if(str ==null){
             return "";
         }
         return  str;
     }

     public static String chkNull(Object str) {
         String d = (String) str;
         if (str == null) {
             return "";
         }
         return d;
     }

    /* 여기서 부터 날짜 관련 함수*/

    /*포맷2021.10.10*/
    public static String formatYMD(String ymd){

        if(ymd.length() <8){
            return ymd;
        }
        StringBuilder sb =new StringBuilder();
        sb.append(ymd.substring(0,4));
        sb.append(ymd.substring(4,6));
        sb.append(ymd.substring(6,10));

        return sb.toString();
    }

    /*포맷:2021-03-22 24:00:00*/
    public static String formatHM(String ymdhms){
        StringBuilder sb = new StringBuilder();
        sb.append(ymdhms.substring(0, 4)).append("-");
        sb.append(ymdhms.substring(4, 6)).append("-");
        sb.append(ymdhms.substring(6, 8)).append(" ");
        sb.append(ymdhms.substring(8, 10)).append(":");
        sb.append(ymdhms.substring(10, 12)).append(":");
        sb.append(ymdhms.substring(12, 14));
        return sb.toString();
    }

    /*포맷:long형태로 변환*/
    public static long formatHMS(String ymdhms){
        GregorianCalendar cal = new GregorianCalendar();
        Integer.parseInt(ymdhms.substring(0,4));
        Integer.parseInt(ymdhms.substring(4,6));
        Integer.parseInt(ymdhms.substring(6,8));
        Integer.parseInt(ymdhms.substring(8,10));
        Integer.parseInt(ymdhms.substring(10,12));
        Integer.parseInt(ymdhms.substring(12,14));
        return cal.getTimeInMillis();
    }

    /*포맷:현재년월일을 Str로 반환 ex)20210311*/
    public static String formatStrDay1(){
        GregorianCalendar cal = new GregorianCalendar();
        StringBuilder sb = new StringBuilder();
        sb.append(Utils.numFormat(cal.get(Calendar.YEAR), "0000")).
                append(Utils.numFormat(cal.get(Calendar.MONTH) + 1, "00")).
                append(Utils.numFormat(cal.get(Calendar.DAY_OF_MONTH), "00"));
        return sb.toString();
    }

    /*포맷:현재년월일을 Str로 반환 ex)2021-03-11*/
    public static String formatStrDay2(){
        GregorianCalendar cal = new GregorianCalendar();
        StringBuilder sb = new StringBuilder();
        sb.append(Utils.numFormat(cal.get(Calendar.YEAR), "0000")).
                append("-").
                append(Utils.numFormat(cal.get(Calendar.MONTH) + 1, "00")).
                append("-").
                append(Utils.numFormat(cal.get(Calendar.DAY_OF_MONTH), "00"));
        return sb.toString();
    }


    /*포맷: 현재시간 가지고 오기 ex)Sat Jul 12 16:03:00 GMT+01:00 2000*/
    public static String pastTime(){
        Date today = new Date();
        StringBuilder sb = new StringBuilder();
        sb.append(today);
        return sb.toString();
    }

   /* 현재 년월시 문자열 반환*/
   public static String getPastTimeH(){
        GregorianCalendar cal = new GregorianCalendar();
        StringBuilder sb = new StringBuilder();

        sb.append(Utils.numFormat(cal.get(Calendar.YEAR),"0000"))
                .append(Utils.numFormat(cal.get(Calendar.MONTH)+1,"00"))
                .append(Utils.numFormat(cal.get(Calendar.DAY_OF_MONTH),"00"))
                .append(Utils.numFormat(cal.get(Calendar.HOUR_OF_DAY),"00"));
        return sb.toString();
   }

    /* 현재 년월시분 문자열 반환*/
    public static String getPastTimeM(){
        GregorianCalendar cal = new GregorianCalendar();
        StringBuilder sb = new StringBuilder();
        sb.append(Utils.numFormat(cal.get(Calendar.YEAR),"0000"))
                .append(Utils.numFormat(cal.get(Calendar.MONTH)+1,"00"))
                .append(Utils.numFormat(cal.get(Calendar.DAY_OF_MONTH),"00"))
                .append(Utils.numFormat(cal.get(Calendar.HOUR_OF_DAY),"00"))
                .append(Utils.numFormat(cal.get(Calendar.MINUTE),"00"));
        return sb.toString();
    }

    /* 현재 년월시분초 문자열 반환*/
    public static String getPastTimeS(){
        GregorianCalendar cal = new GregorianCalendar();
        StringBuilder sb = new StringBuilder();
        sb.append(Utils.numFormat(cal.get(Calendar.YEAR),"0000"))
                .append(Utils.numFormat(cal.get(Calendar.MONTH)+1,"00"))
                .append(Utils.numFormat(cal.get(Calendar.DAY_OF_MONTH),"00"))
                .append(Utils.numFormat(cal.get(Calendar.HOUR_OF_DAY),"00"))
                .append(Utils.numFormat(cal.get(Calendar.MINUTE),"00"))
                .append(Utils.numFormat(cal.get(Calendar.SECOND),"00"));
        return sb.toString();
    }

	    /* 포맷:v는 넣을 값, format 은 문자나 형식*/
	    public static String numFormat(double v,String format){
	        NumberFormat formatter = new DecimalFormat(format);
	        return formatter.format(v);
	    }
    
	    /**
	     * 문자로된 숫자의 표현식을 자리수에 맞는 숫자로표현(예: 23->0023)
	     * @param number
	     * @param cnt
	     * @return
	     */
	    public static String stringNumberToZeroStringNumber(String number, int cnt){
	        
	        String str = number.trim();
	        if(number == null) return "";
	        
	        cnt = cnt - str.length();
	        for(int i = 0 ; i < cnt ; i++){
	            str = "0" + str;
	        }
	        return str;
	        
	    }
	    public static int chkNull(int str) {
	        if (str == 0) {
	            return 0;
	        }
	        return str;
	    }
	    public static ResponseEntity<String> responseentity(String data){
			return new ResponseEntity<String>(data, getHttpheader(), HttpStatus.OK);
		}
	    public static HttpHeaders getHttpheader(){
	    	
	    	HttpHeaders responseHeaders = new HttpHeaders();
			responseHeaders.add("Content-Type", "application/json; charset=UTF-8");
			responseHeaders.add("Access-Control-Allow-Origin", "*");
			responseHeaders.add("Access-Control-Allow-Headers", "origin, x-requested-with, content-type, accept");
	
			return responseHeaders;
			
	    }
    
}
