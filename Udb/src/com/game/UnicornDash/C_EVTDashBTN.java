package com.game.UnicornDash;


public class C_EVTDashBTN extends oms.GameEngine.GameEvent  {

// static fields
private static final int[][] BTN_DashACT;
private static final int[] BTN_Rush00 = {0x7f020008,0x7f02000e};
public static final int[][] DashBTNSpriteEVT = new int[2][];
// instance fields
public int m_BTNType;
// direct methods

static{
	;
	int[][] v0v558 = new int[2][];
	v0v558[0] = com.game.UnicornDash.C_EVTDashBTN.BTN_Rush00;
	v0v558[1] = com.game.UnicornDash.C_EVTDashBTN.BTN_Rush00;
	BTN_DashACT = v0v558;
	;
	int[] v1v568 = new int[8];
	v1v568[6] = 4;
	v1v568[7] = 1;
	com.game.UnicornDash.C_EVTDashBTN.DashBTNSpriteEVT[0] = v1v568;
	int[] v1v431 = new int[8];
	v1v431[6] = 4;
	v1v431[7] = 2;
	com.game.UnicornDash.C_EVTDashBTN.DashBTNSpriteEVT[1] = v1v431;
	//com.game.UnicornDash.C_EVTDashBTN.DashBTNSpriteEVT = new int[2][];
	// op;
	;
}

public C_EVTDashBTN(){
	super();
	this.m_BTNType = 0 /* 0 */;
	this.EVT.ACTPtr = com.game.UnicornDash.C_EVTDashBTN.BTN_DashACT;
	this.EVT.EVTPtr = com.game.UnicornDash.C_EVTDashBTN.DashBTNSpriteEVT;
}

private void DashBTNExe00(){
	return;
}

private void DashBTNExe01(){
	if (this.CHKEVTACTEnd()) {
	this.SetEVTCtrl(0,0);
	// :cond_0
	}
	return;
}

private void DashBTNTouch(){
	com.game.UnicornDash.C_Global.g_DashBTNTouch = 0 /* 0 */;
	int ACTName = this.EVT.ACTIdx;
	int XVal = (this.EVT.XVal >> 0x10);
	int YVal = (this.EVT.YVal >> 0x10);
	if (com.game.UnicornDash.C_PUB.CHKTouchDown(2,2,2,2,ACTName,XVal,YVal)) {
	com.game.UnicornDash.C_Global.g_DashBTNTouch = (com.game.UnicornDash.C_Global.g_DashBTNTouch | 0x4);
	this.EVT.CurCNT = 0 /* 0 */;
	this.EVT.CurFRM = 1;
	// :cond_0
	}
	return;
}
// virtual methods

public void CreateDashBTN(com.game.UnicornDash.C_EVTDashBTN c_DashBTN,int XVal,int YVal){
	if (!c_DashBTN.EVT.Valid) {
	c_DashBTN.MakeEVENT(XVal,YVal,0);
	c_DashBTN.EVT.Flag = 3;
	c_DashBTN.EVT.Attrib = 5;
	c_DashBTN.EVT.Status = (c_DashBTN.EVT.Status | 0x2000);
	c_DashBTN.m_BTNType = 2;
	// :cond_0
	}
	return;
}

public void EVTRUN(){
	this.DashBTNTouch();
	;
	switch(this.EVT.Ctrl){
	case 0: 
	this.DashBTNExe00();
	break;
	case 1: 
	this.DashBTNExe01();
	break;
	} //end of switch
	return;
	// op;
	
}

}