package info.pharos.ly;


public class C_EVTJumpBTN extends info.pharos.gameEngine.GameEvent  {

// static fields
private static final int[] BTN_Jump00 = {R.drawable.act_btna00,R.drawable.act_btna06};
private static final int[][] BTN_JumpACT;
public static final int[][] JumpBTNSpriteEVT = new int[2][];
// instance fields
public int m_BTNType;
// direct methods

static{
	;
	int[][] v0v58 = new int[2][];
	v0v58[0] = info.pharos.ly.C_EVTJumpBTN.BTN_Jump00;
	v0v58[1] = info.pharos.ly.C_EVTJumpBTN.BTN_Jump00;
	BTN_JumpACT = v0v58;
	;
	int[] v1v552 = new int[8];
	v1v552[6] = 4;
	v1v552[7] = 1;
	info.pharos.ly.C_EVTJumpBTN.JumpBTNSpriteEVT[0] = v1v552;
	int[] v1v436 = new int[8];
	v1v436[6] = 4;
	v1v436[7] = 2;
	info.pharos.ly.C_EVTJumpBTN.JumpBTNSpriteEVT[1] = v1v436;
	//com.game.UnicornDash.C_EVTJumpBTN.JumpBTNSpriteEVT = new int[2][];
	// op;
	;
}

public C_EVTJumpBTN(){
	super();
	this.m_BTNType = 0 /* 0 */;
	this.EVT.ACTPtr = info.pharos.ly.C_EVTJumpBTN.BTN_JumpACT;
	this.EVT.EVTPtr = info.pharos.ly.C_EVTJumpBTN.JumpBTNSpriteEVT;
}

private void JumpBTNExe00(){
	return;
}

private void JumpBTNExe01(){
	if (this.CHKEVTACTEnd()) {
	this.SetEVTCtrl(0,0);
	// :cond_0
	}
	return;
}

private void JumpBTNTouch(){
	info.pharos.ly.C_Global.g_JumpBTNTouch = 0 /* 0 */;
	int ACTName = this.EVT.ACTIdx;
	int XVal = (this.EVT.XVal >> 0x10);
	int YVal = (this.EVT.YVal >> 0x10);
	if (info.pharos.ly.C_PUB.CHKTouchDown(2,2,2,2,ACTName,XVal,YVal)) {
	info.pharos.ly.C_Global.g_JumpBTNTouch = (info.pharos.ly.C_Global.g_JumpBTNTouch | 0x4);
	this.EVT.CurCNT = 0 /* 0 */;
	this.EVT.CurFRM = 1;
	// :cond_0
	}
	if (info.pharos.ly.C_PUB.CHKIsTouch(2,2,2,2,ACTName,XVal,YVal)) {
	info.pharos.ly.C_Global.g_JumpBTNTouch = (info.pharos.ly.C_Global.g_JumpBTNTouch | 0x2);
	this.EVT.CurCNT = 0 /* 0 */;
	this.EVT.CurFRM = 1;
	// :cond_1
	}
	return;
}
// virtual methods

public void CreateJumpBTN(info.pharos.ly.C_EVTJumpBTN c_JumpBTN,int XVal,int YVal){
	if (!c_JumpBTN.EVT.Valid) {
	c_JumpBTN.MakeEVENT(XVal,YVal,0);
	c_JumpBTN.EVT.Flag = 3;
	c_JumpBTN.EVT.Attrib = 5;
	c_JumpBTN.EVT.Status = (c_JumpBTN.EVT.Status | 0x2000);
	c_JumpBTN.m_BTNType = 1;
	// :cond_0
	}
	return;
}

public void EVTRUN(){
	this.JumpBTNTouch();
	;
	switch(this.EVT.Ctrl){
	case 0: 
	this.JumpBTNExe00();
	break;
	case 1: 
	this.JumpBTNExe01();
	break;
	} //end of switch
	return;
	// op;
	
}

}
