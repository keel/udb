package info.pharos.ly;

import oms.GameEngine.GameCanvas;
import android.util.Log;


public class C_CompanyLogo extends Object  {

// direct methods

public C_CompanyLogo(){
	super();
}
// virtual methods

public void GameMain(){
	int RunTime = 0;
	info.pharos.ly.C_OPhoneApp.cLib.getGameCanvas().LoadText(2130837741,0,0);
	//GameCanvas gcv = info.pharos.ly.C_OPhoneApp.cLib.getGameCanvas();
	//Log.e("C_comp",gcv.GetTextXVal(0)+" "+ gcv.GetTextYVal(0));
	info.pharos.ly.C_OPhoneApp.cLib.getGameCanvas().SetTextYVal(0,-48);
	info.pharos.ly.C_OPhoneApp.cLib.ViewOpen(64);
	info.pharos.ly.C_Global.g_chkVersion = 1;
	info.pharos.ly.C_OPhoneApp.cLib.getGameCanvas().InitACT(0,2130968583);
	info.pharos.ly.C_OPhoneApp.cLib.getGameCanvas().InitACT(1,2130968583);
	try {
	info.pharos.ly.C_OPhoneApp.cLib.getGameCanvas().InitACT(2,2130968583);
	//end of try
	} catch (OutOfMemoryError e/* */) {
		e.printStackTrace();
		info.pharos.ly.C_Global.g_chkVersion = 0 /* 0 */;
		info.pharos.ly.C_OPhoneApp.cLib.getGameCanvas().FreeACT(2);
	} //end of catch: goto :goto_0
	// :goto_0
	info.pharos.ly.C_OPhoneApp.cLib.ClearACT();
	info.pharos.ly.C_OPhoneApp.cTouch.ReadTouch();
	while (RunTime <= 60) {
	RunTime = (RunTime + 0x1);
	info.pharos.ly.C_OPhoneApp.cLib.WaitBLK();
	// goto :goto_0
	// :cond_0
	}
	info.pharos.ly.C_OPhoneApp.cLib.ViewDark(64);
	return;
	
	//[OTHER] end local v1           #e:Ljava/lang/OutOfMemoryError;
}

}