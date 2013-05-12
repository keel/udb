package com.game.UnicornDash;


public class C_SceneMenu extends Object  {

// static fields
public static final int[] StarACTTBL = {0x7f0200e7,0x7f0200e8,0x7f0200e9,0x7f0200ea,0x7f0200eb};
// instance fields
private com.game.UnicornDash.C_EVTGameBTN[] c_EVTGameBTN;
private com.game.UnicornDash.C_EVTGameBTN c_GameBTN;
private int m_MenuSel;
private int m_StarFRM;
private boolean m_isRun;
// direct methods

static{
	;
	// op;
	;
}

public C_SceneMenu(){
	super();
	this.c_GameBTN = null /* 0 */;
	this.c_EVTGameBTN = null /* 0 */;
}

private void ExecEVENT(){
	this.ExecEVT();
	this.ExecRUN();
	return;
}

private void ExecEVT(){
	if (this.c_EVTGameBTN != null) {
	int i = 0;
	while (i < 5) {
	this.c_EVTGameBTN[i].ExecEVT(com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas());
	i = (i + 0x1);
	// goto :goto_0
	// :cond_1
	}
	//[OTHER] end local v0           #i:I
	// :cond_0
	}
	return;
	
}

private void ExecRUN(){
	if (this.c_EVTGameBTN != null) {
	int i = 0;
	while (i < 5) {
	this.c_EVTGameBTN[i].ExecRUN(com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas());
	i = (i + 0x1);
	// goto :goto_0
	// :cond_1
	}
	//[OTHER] end local v0           #i:I
	// :cond_0
	}
	return;
	
}

private void ExitEVENT(){
	if (this.c_EVTGameBTN != null) {
	int i = 0;
	while (i < 5) {
	this.c_EVTGameBTN[i].EVTCLR();
	i = (i + 0x1);
	// goto :goto_0
	// :cond_1
	}
	//[OTHER] end local v0           #i:I
	// :cond_0
	}
	return;
	
}

private void Initialize(){
	this.m_isRun = true;
	this.m_MenuSel = 0 /* 0 */;
	this.m_StarFRM = 0 /* 0 */;
	;
	this.c_GameBTN = new com.game.UnicornDash.C_EVTGameBTN();
	;
	this.c_EVTGameBTN = new com.game.UnicornDash.C_EVTGameBTN[5];
	int i = 0;
	while (i < 5) {
	;
	this.c_EVTGameBTN[i] = new com.game.UnicornDash.C_EVTGameBTN();
	i = (i + 0x1);
	// goto :goto_0
	// :cond_0
	}
	this.c_GameBTN.InitGameBTNOBJ(this.c_EVTGameBTN);
	this.c_GameBTN.CreateGameBTN(9,210,(com.game.UnicornDash.C_Global.g_ScreenScale_3_1 + 0x186));
	this.c_GameBTN.CreateGameBTN(10,153,(com.game.UnicornDash.C_Global.g_ScreenScale_3_1 + 0x186));
	this.c_GameBTN.CreateGameBTN(3,100,((com.game.UnicornDash.C_Global.g_ScreenScale_3_1 + 0x186) - 50));
	this.c_GameBTN.CreateGameBTN(4,100,(com.game.UnicornDash.C_Global.g_ScreenScale_3_1 + 0x186));
	this.c_GameBTN.CreateGameBTN(5,100,((com.game.UnicornDash.C_Global.g_ScreenScale_3_1 + 0x186) + 0x32));
	com.game.UnicornDash.C_PUB.InitTouch();
	return;
}

private void MsgLoop(){
	int MSGCount = com.game.UnicornDash.C_OPhoneApp.cLib.getMessageMgr().GetMessageQueueLength();
	int i = 0;
	while (i < MSGCount) {
	oms.GameEngine.C_MSG Msg = com.game.UnicornDash.C_OPhoneApp.cLib.getMessageMgr().GetMessageQueue(i);
	int hWnd = Msg.GetMsgHWnd();
	int message = Msg.GetMsgMessage();
	switch(hWnd){
	case 10: 
	switch(message){
	case 6:  case 7: 
	break;
	case 3: 
	com.game.UnicornDash.C_PUB.setSoundStatus();
	break;
	case 8:  case 9: 
	this.m_MenuSel = message;
	this.m_isRun = false /* 0 */;
	break;
	case 10: 
	com.game.UnicornDash.C_PUB.To_More();
	break;
	case 4: 
	com.game.UnicornDash.C_PUB.setMusicStatus();
	break;
	case 5: 
	com.game.UnicornDash.C_PUB.setVibratorStatus();
	break;
	} //end of switch
	} //end of switch
	i = (i + 0x1);
	// goto :goto_0
	// :cond_0
	}
	com.game.UnicornDash.C_OPhoneApp.cLib.getMessageMgr().RemoveAllMsgQueue();
	return;
	// op;
	
	
}

private void ReadTouch(){
	com.game.UnicornDash.C_OPhoneApp.cTouch.ReadTouch();
	com.game.UnicornDash.C_PUB.CHKTouch_Input();
	com.game.UnicornDash.C_OPhoneApp.cLib.getInput().ReadKeyBoard();
	if (com.game.UnicornDash.C_OPhoneApp.cLib.getInput().CHKUpKey(4)) {
	com.game.UnicornDash.C_Media.PlaySound(5);
	com.game.UnicornDash.C_OPhoneApp.cLib.getMessageMgr().SendMessage(10,8,0);
	// :cond_0
	}
	return;
}

private void ShowEVENT(){
	if (this.c_EVTGameBTN != null) {
	int i = 0;
	while (i < 5) {
	this.c_EVTGameBTN[i].ShowEVENT(com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas());
	i = (i + 0x1);
	// goto :goto_0
	// :cond_1
	}
	//[OTHER] end local v0           #i:I
	// :cond_0
	}
	return;
	
}

private void ShowInfo(){
	com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas().WriteSprite(0x7f02,28,220,6);
	com.game.UnicornDash.C_PUB.ShowNum(com.game.UnicornDash.C_Save.g_HighScore,30,220,15,1,1,com.game.UnicornDash.C_DEF.ResultNUM2TBL,7);
	if ((com.game.UnicornDash.C_OPhoneApp.cLib.nVBLCount % 0xa) == 0) {
	this.m_StarFRM = (this.m_StarFRM + 0x1);
	// :cond_0
	}
	this.m_StarFRM = (this.m_StarFRM % 0x5);
	com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas().WriteSprite(com.game.UnicornDash.C_SceneMenu.StarACTTBL[this.m_StarFRM],296,210,6);
	return;
}
// virtual methods

public void GameMain(){
	this.Initialize();
	com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas().LoadText(2130837742,0,0);
	com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas().SetTextYVal(0,-48);
	this.ReadTouch();
	this.ReadTouch();
	this.ExecEVENT();
	this.ShowEVENT();
	this.ShowInfo();
	com.game.UnicornDash.C_OPhoneApp.cLib.ViewOpen(64);
	com.game.UnicornDash.C_Media.PlayMenuMusic();
	while (this.m_isRun) {
	com.game.UnicornDash.C_OPhoneApp.cLib.ClearACT();
	this.ReadTouch();
	this.MsgLoop();
	this.ExecEVENT();
	this.ShowEVENT();
	this.ShowInfo();
	com.game.UnicornDash.C_OPhoneApp.cLib.WaitBLK();
	// goto :goto_0
	// :cond_0
	}
	this.ExitEVENT();
	com.game.UnicornDash.C_OPhoneApp.cLib.ViewDark(64);
	;
	switch(this.m_MenuSel){
	case 8: 
	com.game.UnicornDash.C_OPhoneApp.cLib.getMessageMgr().SendMessage(0,30,7);
	break;
	} //end of switch
	//:pswitch_0
	return;
	// op;
	
}

}