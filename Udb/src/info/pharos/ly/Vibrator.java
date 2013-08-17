package info.pharos.ly;


public class Vibrator extends Object  {

// static fields
protected static boolean enabled;
protected static android.os.Vibrator vibrator;
// direct methods

static{
	info.pharos.ly.Vibrator.enabled = true;
}

public Vibrator(){
	super();
}

public static void disable(){
	info.pharos.ly.Vibrator.enabled = false /* 0 */;
	return;
}

public static void enable(){
	info.pharos.ly.Vibrator.enabled = true;
	return;
}

private static void prepareVibrator(){
	if (info.pharos.ly.Vibrator.vibrator != null) {
	} else {
	info.pharos.ly.Vibrator.vibrator = (android.os.Vibrator)info.pharos.ly.C_GameMain.cLib.GetActivity().getSystemService("vibrator");
		}
	// goto :goto_0
	// :goto_0
	return;
}

public static void vibrate(long time){
	if (!info.pharos.ly.Vibrator.enabled) {
	} else {
	info.pharos.ly.Vibrator.prepareVibrator();
	info.pharos.ly.Vibrator.vibrator.vibrate(time);
		}
	// goto :goto_0
	// :goto_0
	return;
}

public static void vibrate(long[] pattern,int repeat){
	if (!info.pharos.ly.Vibrator.enabled) {
	} else {
	info.pharos.ly.Vibrator.prepareVibrator();
	info.pharos.ly.Vibrator.vibrator.vibrate(pattern,repeat);
		}
	// goto :goto_0
	// :goto_0
	return;
}

}
