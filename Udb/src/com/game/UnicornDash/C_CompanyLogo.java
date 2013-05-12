package com.game.UnicornDash;


public class C_CompanyLogo extends Object  {

// direct methods

public C_CompanyLogo(){
	super();
}
// virtual methods

public void GameMain(){
	int RunTime = 0;
	com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas().LoadText(2130837741,0,0);
	com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas().SetTextYVal(0,-48);
	com.game.UnicornDash.C_OPhoneApp.cLib.ViewOpen(64);
	com.game.UnicornDash.C_Global.g_chkVersion = 1;
	com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas().InitACT(0,2130968583);
	com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas().InitACT(1,2130968583);
	try {
	com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas().InitACT(2,2130968583);
	//end of try
	} catch (OutOfMemoryError e/* */) {
		e.printStackTrace();
		com.game.UnicornDash.C_Global.g_chkVersion = 0 /* 0 */;
		com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas().FreeACT(2);
	} //end of catch: goto :goto_0
	// :goto_0
	com.game.UnicornDash.C_OPhoneApp.cLib.ClearACT();
	com.game.UnicornDash.C_OPhoneApp.cTouch.ReadTouch();
	while (RunTime <= 60) {
	RunTime = (RunTime + 0x1);
	com.game.UnicornDash.C_OPhoneApp.cLib.WaitBLK();
	// goto :goto_0
	// :cond_0
	}
	com.game.UnicornDash.C_OPhoneApp.cLib.ViewDark(64);
	return;
	
	//[OTHER] end local v1           #e:Ljava/lang/OutOfMemoryError;
}

}