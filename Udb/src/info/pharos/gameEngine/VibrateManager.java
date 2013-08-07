package info.pharos.gameEngine;


public class VibrateManager extends Object  {

// instance fields
private info.pharos.gameEngine.C_Vibrator cVibrator;
// direct methods

public VibrateManager(){
	super();
	;
	this.cVibrator = new info.pharos.gameEngine.C_Vibrator();
}
// virtual methods

public void OpenVibrate(android.app.Activity activity){
	this.cVibrator.InitVibrator(activity);
	return;
}

public void Vibrate(long milliseconds){
	this.cVibrator.Vibrate(milliseconds);
	return;
}

public void Vibrate(long[] pattern){
	this.cVibrator.Vibrate(pattern);
	return;
}

public void Vibrate(long[] pattern,int loops){
	this.cVibrator.Vibrate(pattern,loops);
	return;
}

}