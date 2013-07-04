package info.pharos.ly;



import java.lang.reflect.Field;

import android.util.Log;

/**
 * @author keel
 *
 */
public class KLog {

	/**
	 * 
	 */
	public KLog() {
	}
	
	public static void printTrace(){
		new Exception("KLog print trace").printStackTrace();
	}
	
	
	public static void log(String tag,String msg){
		Log.e(tag, msg);
	}
	public static void log(String msg){
		Log.e("KLog", msg);
	}
	
	public static void log(int msg){
		log("KLog", String.valueOf(msg));
	}
	public static void log(long msg){
		log("KLog", String.valueOf(msg));
	}
	
	
	public static void log(String tag,int msg){
		log(tag, String.valueOf(msg));
	}
	
	public static void log(String tag,int msg1,int msg2){
		StringBuilder sb = new StringBuilder(msg1);
		sb.append(" , ");
		sb.append(msg2);
		log(tag, sb.toString());
	}
	
	public static void log(String tag,int msg1,int msg2,int msg3){
		StringBuilder sb = new StringBuilder(msg1);
		sb.append(" , ");
		sb.append(msg2);
		sb.append(" , ");
		sb.append(msg3);
		log(tag, sb.toString());
	}
	
	public static void log(String tag,long msg){
		log(tag, String.valueOf(msg));
	}
	
	public static void log(String tag,long msg1,long msg2){
		StringBuilder sb = new StringBuilder(String.valueOf(msg1));
		sb.append(" , ");
		sb.append(msg2);
		log(tag, sb.toString());
	}
	
	
	public static void log(String tag,String msg1,String msg2){
		log(tag, msg1+" , "+msg2);
	}
	public static void logObj(Object obj){
		String tag = "KLog";
		logObj(tag,obj);
		
	}
	public static void logObj(String tag,Object obj){
		if(obj == null){
			log(tag,"null");
			return;
		}
		Class<?> claz = obj.getClass();
		Field[] fields = claz.getDeclaredFields();
		StringBuilder sb = new StringBuilder("{");
		try {
			for (Field field : fields) {
				field.setAccessible(true);
				sb.append(field.getName()).append(":")
						.append(field.get(obj)).append(",");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		sb.deleteCharAt(sb.length()-1);
		sb.append("}");
		log(tag,sb.toString());
	}
	
}
