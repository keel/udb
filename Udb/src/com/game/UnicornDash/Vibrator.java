package com.game.UnicornDash;


public class Vibrator extends Object  {

// static fields
protected static boolean enabled;
protected static android.os.Vibrator vibrator;
// direct methods

static{
	com.game.UnicornDash.Vibrator.enabled = true;
}

public Vibrator(){
	super();
}

public static void disable(){
	com.game.UnicornDash.Vibrator.enabled = false /* 0 */;
	return;
}

public static void enable(){
	com.game.UnicornDash.Vibrator.enabled = true;
	return;
}

private static void prepareVibrator(){
	if (com.game.UnicornDash.Vibrator.vibrator != null) {
	} else {
	com.game.UnicornDash.Vibrator.vibrator = (android.os.Vibrator)com.game.UnicornDash.C_OPhoneApp.cLib.GetActivity().getSystemService("vibrator");
		}
	// goto :goto_0
	// :goto_0
	return;
}

public static void vibrate(long time){
	if (!com.game.UnicornDash.Vibrator.enabled) {
	} else {
	com.game.UnicornDash.Vibrator.prepareVibrator();
	com.game.UnicornDash.Vibrator.vibrator.vibrate(time);
		}
	// goto :goto_0
	// :goto_0
	return;
}

public static void vibrate(long[] pattern,int repeat){
	if (!com.game.UnicornDash.Vibrator.enabled) {
	} else {
	com.game.UnicornDash.Vibrator.prepareVibrator();
	com.game.UnicornDash.Vibrator.vibrator.vibrate(pattern,repeat);
		}
	// goto :goto_0
	// :goto_0
	return;
}

}