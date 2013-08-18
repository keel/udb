package info.pharos.ly;


public class C_GameMain extends Object  {

// annotations
// value = {
// Lcom/game/LongMoon/C_OPhoneApp$C_GameThread;
// }
// static fields
public static info.pharos.gameEngine.C_Lib cLib;
public static info.pharos.gameEngine.C_MultiTouch cTouch;
// instance fields
private info.pharos.ly.C_GameMain.C_GameThread cGameThread;
private info.pharos.ly.C_LongMoon c_LongMoon;
// direct methods
/**
 * 这里初始化关键的参数值
 * 
 * */
public C_GameMain(android.content.Context context){
	super();
	;
	//这里直接定义了sprite的最大数量和资源数量
	info.pharos.ly.C_GameMain.cLib = new info.pharos.gameEngine.C_Lib(context,3,2048,256);
	;
	this.c_LongMoon = new info.pharos.ly.C_LongMoon();
	info.pharos.ly.C_GameMain.cLib.setFrameReflashTime(30);
	info.pharos.ly.C_GameMain.cLib.getMediaManager().Init(30,2);
	info.pharos.ly.C_GameMain.cLib.getMediaManager().SetSoundStopEn(true);
	info.pharos.ly.C_GameMain.cLib.getGameCanvas().SetMaxLogicLayer(10);
	this.cGameThread = null /* 0 */;
	;
	info.pharos.ly.C_GameMain.cTouch = new info.pharos.gameEngine.C_MultiTouch();
	//info.pharos.ly.C_GameMain.cTouch.ReadTouch();
}
// virtual methods

public info.pharos.gameEngine.C_Lib getCLib(){
	;
	return info.pharos.ly.C_GameMain.cLib;
	//return com.game.LongMoon.C_OPhoneApp.cLib;
}

public void onDestory(){
	info.pharos.ly.C_GameMain.cLib.getMediaManager().release();
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
	return this.c_LongMoon.onKeyDown(keyCode);
	//return this.c_LongMoon.onKeyDown(keyCode);
}

public boolean onKeyMultiple(int keyCode,int repeatCount,android.view.KeyEvent event){
	return true;
}

public boolean onKeyUp(int keyCode,android.view.KeyEvent event){
	return this.c_LongMoon.onKeyUp(keyCode);
	//return this.c_LongMoon.onKeyUp(keyCode);
}

public void onPause(){
	if (info.pharos.ly.C_Global.g_GameState == 7) {
	info.pharos.ly.C_GameMain.cLib.getMessageMgr().SendMessage(10,6,0);
	// :cond_0
	}
	info.pharos.ly.C_GameMain.cLib.onPause();
	return;
}

public void onResume(){
	if (this.cGameThread == null) {
	;
	this.cGameThread = new info.pharos.ly.C_GameMain.C_GameThread(this,info.pharos.ly.C_GameMain.cLib,this.c_LongMoon);
	this.cGameThread.start();
	} else {
	//this.cGameThread.resume();
		}
	// goto :goto_0
	// :goto_0
	info.pharos.ly.C_GameMain.cLib.onResume();
	return;
}

public boolean onTouchEvent(android.view.MotionEvent event){
	info.pharos.ly.C_GameMain.cTouch.handleTouch(event);
	;
	return true /* 1 */;
	//return 1;
}












class C_GameThread extends Thread  {

// annotations
// value = Lcom/game/LongMoon/C_OPhoneApp;
// accessFlags = 0x2
// name = "C_GameThread"
// instance fields
info.pharos.ly.C_LongMoon c_LongMoon;
//final synthetic com.game.LongMoon.C_OPhoneApp this$0 = clib;
// direct methods

public C_GameThread(info.pharos.ly.C_GameMain clib,info.pharos.gameEngine.C_Lib cLongMoon,info.pharos.ly.C_LongMoon $$2){
	super();
	this.c_LongMoon = $$2;
}
// virtual methods

public void run(){
	this.c_LongMoon.GameMain();
	System.exit(0);
	return;
}

}

}
