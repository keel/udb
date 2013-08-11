package info.pharos.ly;

import android.util.Log;


public class C_LoadingLogo extends Object  {

// direct methods

public C_LoadingLogo(){
	super();
}
// virtual methods

public void GameMain(){
	int RunTime = 0;
	info.pharos.ly.C_GameMain.cLib.getGameCanvas().LoadText(2130837741,0,0);
//	GameCanvas gcv = info.pharos.ly.C_OPhoneApp.cLib.getGameCanvas();
	info.pharos.ly.C_GameMain.cLib.getGameCanvas().SetTextYVal(0,-48);
//
//	KLog.logObj(gcv.GetViewRect());
//	KLog.printTrace();
	info.pharos.ly.C_GameMain.cLib.ViewOpen(64);
	info.pharos.ly.C_Global.g_chkVersion = 1;
	while (RunTime <= 30) {
	RunTime = (RunTime + 0x1);
	info.pharos.ly.C_GameMain.cLib.WaitBLK();
	}
	info.pharos.ly.C_GameMain.cLib.ViewDark(64);
	info.pharos.ly.C_GameMain.cLib.getGameCanvas().LoadText(2130837741,0,0);
	info.pharos.ly.C_GameMain.cLib.getGameCanvas().SetTextYVal(0,-48);
	info.pharos.ly.C_GameMain.cLib.ViewOpen(64);
	
	info.pharos.ly.C_GameMain.cLib.getGameCanvas().InitACT(0,2130968583);
	info.pharos.ly.C_GameMain.cLib.getGameCanvas().InitACT(1,2130968583);
	try {
	info.pharos.ly.C_GameMain.cLib.getGameCanvas().InitACT(2,2130968583);
	//end of try
	} catch (OutOfMemoryError e/* */) {
		e.printStackTrace();
		info.pharos.ly.C_Global.g_chkVersion = 0 /* 0 */;
		info.pharos.ly.C_GameMain.cLib.getGameCanvas().FreeACT(2);
	} //end of catch: goto :goto_0
	// :goto_0
	info.pharos.ly.C_GameMain.cLib.ClearACT();
	info.pharos.ly.C_GameMain.cTouch.ReadTouch();
//	while (RunTime <= 30) {
//	RunTime = (RunTime + 0x1);
//	info.pharos.ly.C_GameMain.cLib.WaitBLK();
//	}
	info.pharos.ly.C_GameMain.cLib.ViewDark(64);
	return;
	
	//[OTHER] end local v1           #e:Ljava/lang/OutOfMemoryError;
}

}