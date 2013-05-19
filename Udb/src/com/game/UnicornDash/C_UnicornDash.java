package com.game.UnicornDash;


public class C_UnicornDash extends Object  {

// instance fields
private com.game.UnicornDash.C_CompanyLogo c_CompanyLogo;
private com.game.UnicornDash.C_SceneMenu c_SceneMenu;
private com.game.UnicornDash.C_SceneNormal c_SceneNormal;
private boolean m_isRun;
// direct methods

public C_UnicornDash(){
	super();
	this.c_SceneNormal = null /* 0 */;
	this.c_SceneMenu = null /* 0 */;
	this.c_CompanyLogo = null /* 0 */;
	this.m_isRun = true;
	;
	this.c_SceneNormal = new com.game.UnicornDash.C_SceneNormal();
	;
	this.c_SceneMenu = new com.game.UnicornDash.C_SceneMenu();
	;
	this.c_CompanyLogo = new com.game.UnicornDash.C_CompanyLogo();
}

private void MsgLoop(){
	int MSGCount = com.game.UnicornDash.C_OPhoneApp.cLib.getMessageMgr().GetMessageQueueLength();
	int i = 0;
	while (i < MSGCount) {
	oms.GameEngine.C_MSG Msg = com.game.UnicornDash.C_OPhoneApp.cLib.getMessageMgr().GetMessageQueue(i);
	int param = Msg.GetwParam();
	switch(Msg.GetMsgMessage()){
	case 30: 
	com.game.UnicornDash.C_PUB.setGameMode(param);
	break;
	} //end of switch
	i = (i + 0x1);
	// goto :goto_0
	// :cond_0
	}
	com.game.UnicornDash.C_OPhoneApp.cLib.getMessageMgr().RemoveAllMsgQueue();
	return;
	// op;
	
}
// virtual methods

public void GameMain(){
	this.m_isRun = true;
	com.game.UnicornDash.C_PUB.setGameMode(1);
	com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas().SetViewRect(-1024,-2048,1024,1024);
	
	while (this.m_isRun) {
	

	com.game.UnicornDash.C_OPhoneApp.cLib.getInput().ReadTouch();
	;
	switch(com.game.UnicornDash.C_Global.g_GameMode){
	case 1: 
	com.game.UnicornDash.C_Media.Initialize();
	com.game.UnicornDash.C_Save.LoadData();
	com.game.UnicornDash.C_PUB.setGameMode(2);
	break;
	case 2: 
	this.c_CompanyLogo.GameMain();
	com.game.UnicornDash.C_PUB.setGameMode(5);
	break;
	case 5: 
	com.game.UnicornDash.C_PUB.ShowAdView(true);
	this.c_SceneMenu.GameMain();
	com.game.UnicornDash.C_PUB.setGameMode(6);
	break;
	case 6: 
	com.game.UnicornDash.C_PUB.ShowAdView(false);
	this.c_SceneNormal.GameMain();
	break;
	case 7: 
	this.m_isRun = false /* 0 */;
	break;
	} //end of switch
	//:pswitch_0
	this.MsgLoop();
	com.game.UnicornDash.C_OPhoneApp.cLib.WaitBLK();
	//goto somewhere; //maybe return,continue,break: goto :goto_0
	
		}
}

public void freeResouce(){
	com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas().FreeAllACT();
	com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas().ViewDark(16);
	return;
}

public boolean onKeyDown(int keyCode){
	switch(keyCode){
	case 24: 
	com.game.UnicornDash.C_OPhoneApp.cLib.getMediaManager().SetSystemVolume(0);
	;
	return true /* 1 */;
	//break;
	case 25: 
	com.game.UnicornDash.C_OPhoneApp.cLib.getMediaManager().SetSystemVolume(1);
	;
	return false /* 0 */;
	//break;
	case 3: case 5: case 6: case 27: case 82: 
	;
	return false /* 0 */;
	//break;
	default:
	com.game.UnicornDash.C_OPhoneApp.cLib.getInput().onKeyDown(keyCode);
	;
	return true /* 1 */;
	} //end of switch
	//return 1;
	
}

public boolean onKeyUp(int keyCode){
	switch(keyCode){
	case 3: case 5: case 6: case 24: case 25: case 27: case 82: 
	;
	return false /* 0 */;
	//break;
	default:
	com.game.UnicornDash.C_OPhoneApp.cLib.getInput().onKeyUp(keyCode);
	;
	return true /* 1 */;
	} //end of switch
	//return 1;
	
}

public boolean onTouchEvent(android.view.MotionEvent evt,int X,int Y){
	switch(evt.getAction()){
	case 0: 
	com.game.UnicornDash.C_OPhoneApp.cLib.getInput().SetTouchDown(X,Y);
	//break;
	case 1: 
	com.game.UnicornDash.C_OPhoneApp.cLib.getInput().SetTouchUp(X,Y);
	//break;
	case 2: 
	com.game.UnicornDash.C_OPhoneApp.cLib.getInput().SetTouchMove(X,Y);
	//break;
	} //end of switch
	;
	return true /* 1 */;
	//return 1;
	// op;
	
}

}