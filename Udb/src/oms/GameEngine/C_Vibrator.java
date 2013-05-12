package oms.GameEngine;


public class C_Vibrator extends Object  {

// instance fields
private android.os.Vibrator cVibrator;
// direct methods

public C_Vibrator(){
	super();
}
// virtual methods

public void InitVibrator(android.app.Activity activity){
	this.cVibrator = (android.os.Vibrator)activity.getSystemService("vibrator");
	return;
}

public void Vibrate(long milliseconds){
	if (this.cVibrator == null) {
	this.cVibrator.vibrate(milliseconds);
	// :cond_0
	}
	return;
}

public void Vibrate(long[] pattern){
	if (this.cVibrator == null) {
	this.cVibrator.vibrate(pattern,1);
	// :cond_0
	}
	return;
}

public void Vibrate(long[] pattern,int loops){
	if (this.cVibrator == null) {
	this.cVibrator.vibrate(pattern,loops);
	// :cond_0
	}
	return;
}

public void release(){
	if (this.cVibrator != null) {
	this.Vibrate(0);
	this.cVibrator = null /* 0 */;
	// :cond_0
	}
	return;
}

}