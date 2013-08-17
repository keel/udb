package info.pharos.ly;

import android.util.Log;


public class C_LoadingLogo extends Object  {
	
	
	private boolean m_isRun;

// direct methods

public C_LoadingLogo(){
	super();
}
// virtual methods

public void GameMain(){
	int RunTime = 0;
	info.pharos.ly.C_GameMain.cLib.getGameCanvas().LoadText(R.drawable.scr_logo,0,0);
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
	info.pharos.ly.C_GameMain.cLib.getGameCanvas().LoadText(R.drawable.scr_logo,0,0);
	info.pharos.ly.C_GameMain.cLib.getGameCanvas().SetTextYVal(0,-48);
	info.pharos.ly.C_GameMain.cLib.ViewOpen(64);

	/*
	Thread load = new LoadThread();
	boolean loadEnd = true;
	int star = 0;
	while(loading){
		info.pharos.ly.C_GameMain.cLib.ClearACT();
		info.pharos.ly.C_GameMain.cLib.getGameCanvas().WriteSprite(
				C_SceneMenu.StarACTTBL[star], 140, 240, 6);
		star++;
		if (star >=5) {
			star = 0;
		}
//		star = (star >= 5) ? 0: star++;
		if(loadEnd){
			Log.e("Loading", "load thread start...");
			load.start();
			loadEnd = false;
		}
		info.pharos.ly.C_GameMain.cLib.WaitBLK();
		
	}*/
	
	info.pharos.ly.C_GameMain.cLib.getGameCanvas().InitACT(0,R.raw.sps);
	info.pharos.ly.C_GameMain.cLib.getGameCanvas().InitACT(1,R.raw.sps);
	try {
	info.pharos.ly.C_GameMain.cLib.getGameCanvas().InitACT(2,R.raw.sps);
	//end of try
	} catch (OutOfMemoryError e) {
		e.printStackTrace();
		info.pharos.ly.C_Global.g_chkVersion = 0;
		info.pharos.ly.C_GameMain.cLib.getGameCanvas().FreeACT(2);
	} //end of catch: goto :goto_0
	
	
	// :goto_0
	info.pharos.ly.C_GameMain.cLib.ClearACT();
	//info.pharos.ly.C_GameMain.cTouch.ReadTouch();
//	while (RunTime <= 30) {
//	RunTime = (RunTime + 0x1);
//	info.pharos.ly.C_GameMain.cLib.WaitBLK();
//	}
	info.pharos.ly.C_GameMain.cLib.ViewDark(64);
	return;
	
	//[OTHER] end local v1           #e:Ljava/lang/OutOfMemoryError;
}
/*
private static boolean loading = true;

class LoadThread extends Thread  {

	@Override
	public void run() {
		info.pharos.ly.C_GameMain.cLib.getGameCanvas().InitACT(0,R.raw.sp);
		info.pharos.ly.C_GameMain.cLib.getGameCanvas().InitACT(1,R.raw.sp);
		try {
		info.pharos.ly.C_GameMain.cLib.getGameCanvas().InitACT(2,R.raw.sp);
		//end of try
		} catch (OutOfMemoryError e) {
			e.printStackTrace();
			info.pharos.ly.C_Global.g_chkVersion = 0;
			info.pharos.ly.C_GameMain.cLib.getGameCanvas().FreeACT(2);
		} //end of catch: goto :goto_0
		loading = false;
	}
	
}
*/
}
