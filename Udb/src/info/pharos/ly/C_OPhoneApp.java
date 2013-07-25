package info.pharos.ly;


public class C_OPhoneApp extends Object  {

// annotations
// value = {
// Lcom/game/UnicornDash/C_OPhoneApp$C_GameThread;
// }
// static fields
public static oms.GameEngine.C_Lib cLib;
public static oms.GameEngine.C_MultiTouch cTouch;
// instance fields
private info.pharos.ly.C_OPhoneApp.C_GameThread cGameThread;
private info.pharos.ly.C_UnicornDash c_UnicornDash;
// direct methods

public C_OPhoneApp(android.content.Context context){
	super();
	;
	info.pharos.ly.C_OPhoneApp.cLib = new oms.GameEngine.C_Lib(context,3,2048,256);
	;
	this.c_UnicornDash = new info.pharos.ly.C_UnicornDash();
	info.pharos.ly.C_OPhoneApp.cLib.setFrameReflashTime(30);
	info.pharos.ly.C_OPhoneApp.cLib.getMediaManager().Init(30,2);
	info.pharos.ly.C_OPhoneApp.cLib.getMediaManager().SetSoundStopEn(true);
	info.pharos.ly.C_OPhoneApp.cLib.getGameCanvas().SetMaxLogicLayer(10);
	this.cGameThread = null /* 0 */;
	;
	info.pharos.ly.C_OPhoneApp.cTouch = new oms.GameEngine.C_MultiTouch();
	info.pharos.ly.C_OPhoneApp.cTouch.ReadTouch();
}
// virtual methods

public oms.GameEngine.C_Lib getCLib(){
	;
	return info.pharos.ly.C_OPhoneApp.cLib;
	//return com.game.UnicornDash.C_OPhoneApp.cLib;
}

public void onDestory(){
	info.pharos.ly.C_OPhoneApp.cLib.getMediaManager().release();
	boolean retry = true;
	// :goto_0
	while (retry) {
	try {
	this.cGameThread.join();
	//end of try
	} catch (InterruptedException e/* */) {
		Thread.currentThread().interrupt();
	} //end of catch: goto :goto_0
	retry = false /* 0 */;
	// goto :goto_0
	// :cond_0
	}
	this.cGameThread = null /* 0 */;
	return;
	
}

public boolean onKeyDown(int keyCode,android.view.KeyEvent event){
	return this.c_UnicornDash.onKeyDown(keyCode);
	//return this.c_UnicornDash.onKeyDown(keyCode);
}

public boolean onKeyMultiple(int keyCode,int repeatCount,android.view.KeyEvent event){
	return true;
}

public boolean onKeyUp(int keyCode,android.view.KeyEvent event){
	return this.c_UnicornDash.onKeyUp(keyCode);
	//return this.c_UnicornDash.onKeyUp(keyCode);
}

public void onPause(){
	if (info.pharos.ly.C_Global.g_GameState == 7) {
	info.pharos.ly.C_OPhoneApp.cLib.getMessageMgr().SendMessage(10,6,0);
	// :cond_0
	}
	info.pharos.ly.C_OPhoneApp.cLib.onPause();
	return;
}

public void onResume(){
	if (this.cGameThread == null) {
	;
	this.cGameThread = new info.pharos.ly.C_OPhoneApp.C_GameThread(this,info.pharos.ly.C_OPhoneApp.cLib,this.c_UnicornDash);
	this.cGameThread.start();
	} else {
	//this.cGameThread.resume();
		}
	// goto :goto_0
	// :goto_0
	info.pharos.ly.C_OPhoneApp.cLib.onResume();
	return;
}

public boolean onTouchEvent(android.view.MotionEvent event){
	info.pharos.ly.C_OPhoneApp.cTouch.handleTouch(event);
	;
	return true /* 1 */;
	//return 1;
}












class C_GameThread extends Thread  {

// annotations
// value = Lcom/game/UnicornDash/C_OPhoneApp;
// accessFlags = 0x2
// name = "C_GameThread"
// instance fields
info.pharos.ly.C_UnicornDash c_UnicornDash;
//final synthetic com.game.UnicornDash.C_OPhoneApp this$0 = clib;
// direct methods

public C_GameThread(info.pharos.ly.C_OPhoneApp clib,oms.GameEngine.C_Lib cUnicornDash,info.pharos.ly.C_UnicornDash $$2){
	super();
	this.c_UnicornDash = $$2;
}
// virtual methods

public void run(){
	this.c_UnicornDash.GameMain();
	System.exit(0);
	return;
}

}

}