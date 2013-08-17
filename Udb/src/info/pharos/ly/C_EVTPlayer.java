package info.pharos.ly;


public class C_EVTPlayer extends info.pharos.gameEngine.GameEvent  {

// static fields
public static final int CTRL_DASH = 0x3;
public static final int CTRL_DEAD = 0x4;
public static final int CTRL_FALL = 0x2;
public static final int CTRL_JUMP = 0x1;
public static final int CTRL_RUN = 0x0;
public static final int DEAD_LINE = -0x2000000;
public static final int FEET_MAXADJUST = 0x20;
public static final int JUMP_ADC = -0x1c000;
public static final int JUMP_JUMP = 0xf0000;
public static final int JUMP_MAXFALL = -0x140000;
public static final int JUMP_MINFALL = -0x20000;
public static final int[][] PLANEEVT = new int[5][];
private static final int[] Plane00ACT = {R.drawable.act_running00,R.drawable.act_running01,R.drawable.act_running02,R.drawable.act_running03,R.drawable.act_running04,R.drawable.act_running05,R.drawable.act_running06,R.drawable.act_running07,R.drawable.act_running08,R.drawable.act_running09,R.drawable.act_running0a,R.drawable.act_running0b};
private static final int[] Plane01ACT = {R.drawable.act_jumping00,R.drawable.act_jumping00,R.drawable.act_jumping00,R.drawable.act_jumping01,R.drawable.act_jumping01,R.drawable.act_jumping02,R.drawable.act_jumping03,R.drawable.act_jumping04,R.drawable.act_jumping05,R.drawable.act_jumping06,R.drawable.act_jumping07,R.drawable.act_jumping08,R.drawable.act_jumping09,R.drawable.act_jumping0a,R.drawable.act_jumping0b,R.drawable.act_jumping0c,R.drawable.act_jumping0d};
private static final int[] Plane02ACT = {R.drawable.act_jumping08,R.drawable.act_jumping09,R.drawable.act_jumping0a,R.drawable.act_jumping0b,R.drawable.act_jumping0c,R.drawable.act_jumping0d};
private static final int[] Plane03ACT = {R.drawable.act_dash00,R.drawable.act_dash01,R.drawable.act_dash02,R.drawable.act_dash03,R.drawable.act_dash04,R.drawable.act_dash05,R.drawable.act_dash06,R.drawable.act_dash06,R.drawable.act_dash05,R.drawable.act_dash04,R.drawable.act_dash03,R.drawable.act_dash02,R.drawable.act_dash00};
private static final int[] Plane04ACT;
private static final int[][] PlaneACT;
// instance fields
private info.pharos.ly.C_EVTPlayer c_EVTPlayer;
public double m_BodyRadian;
public int m_DashCount;
public int m_DashDly;
public int m_FeetOffset_B;
public int m_FeetOffset_F;
public int m_JumpCount;
private int m_OperateCount;
public boolean m_isGround;
// direct methods

static{
	;
	;
	;
	;
	int[] v0v134 = new int[28];
	v0v134[0] = R.drawable.act_blast00;
	v0v134[1] = R.drawable.act_blast01;
	v0v134[2] = R.drawable.act_blast02;
	v0v134[3] = R.drawable.act_blast03;
	v0v134[4] = R.drawable.act_blast02;
	v0v134[5] = R.drawable.act_blast03;
	v0v134[6] = R.drawable.act_blast04;
	v0v134[7] = R.drawable.act_blast05;
	Plane04ACT = v0v134;
	int[][] v0v146 = new int[5][];
	v0v146[0] = info.pharos.ly.C_EVTPlayer.Plane00ACT;
	v0v146[1] = info.pharos.ly.C_EVTPlayer.Plane01ACT;
	v0v146[2] = info.pharos.ly.C_EVTPlayer.Plane02ACT;
	v0v146[3] = info.pharos.ly.C_EVTPlayer.Plane03ACT;
	v0v146[4] = info.pharos.ly.C_EVTPlayer.Plane04ACT;
	PlaneACT = v0v146;
	;
	int[] v2v171 = new int[8];
	v2v171[6] = 1;
	v2v171[7] = 11;
	info.pharos.ly.C_EVTPlayer.PLANEEVT[0] = v2v171;
	int[] v1v511 = new int[8];
	v1v511[6] = 1;
	v1v511[7] = 17;
	info.pharos.ly.C_EVTPlayer.PLANEEVT[1] = v1v511;
	int[] v1v867 = new int[8];
	v1v867[6] = 1;
	v1v867[7] = 6;
	info.pharos.ly.C_EVTPlayer.PLANEEVT[2] = v1v867;
	int[] v2v114 = new int[8];
	v2v114[6] = 1;
	v2v114[7] = 13;
	info.pharos.ly.C_EVTPlayer.PLANEEVT[3] = v2v114;
	int[] v2v143 = new int[8];
	v2v143[6] = 2;
	v2v143[7] = 16;
	info.pharos.ly.C_EVTPlayer.PLANEEVT[4] = v2v143;
	//com.game.UnicornDash.C_EVTPlayer.PLANEEVT = new int[5][];
	// op;
	;
	;
	;
	;
}

public C_EVTPlayer(){
	super();
	this.c_EVTPlayer = null /* 0 */;
	this.EVT.ACTPtr = info.pharos.ly.C_EVTPlayer.PlaneACT;
	this.EVT.EVTPtr = info.pharos.ly.C_EVTPlayer.PLANEEVT;
}

private void CHKGameOperate(){
		if (this.c_EVTPlayer.m_OperateCount >= 7) {
			// :cond_0
		} else {
			if ((info.pharos.ly.C_Global.g_JumpBTNTouch & 0x4) == 4) {
				this.c_EVTPlayer.m_DashCount = 0 /* 0 */;
				this.c_EVTPlayer.m_OperateCount = (this.c_EVTPlayer.m_OperateCount + 0x1);
				if ((this.c_EVTPlayer.m_JumpCount >= 1 && this.c_EVTPlayer.m_OperateCount >= 4)
						|| this.c_EVTPlayer.m_JumpCount >= 2) {
					return;
				} else {
					// :cond_2
					this.c_EVTPlayer.m_JumpCount = (this.c_EVTPlayer.m_JumpCount + 0x1);
					this.setPlayerCtrl(1, 0);
					// :cond_3
				}
			}
			if ((info.pharos.ly.C_Global.g_DashBTNTouch & 0x4) == 4
					&& this.c_EVTPlayer.m_DashDly == 0) {
				this.c_EVTPlayer.m_JumpCount = 0 /* 0 */;
				this.c_EVTPlayer.m_OperateCount = (this.c_EVTPlayer.m_OperateCount + 0x1);
				if ((this.c_EVTPlayer.m_DashCount < 1 || this.c_EVTPlayer.m_OperateCount < 4)
						&& this.c_EVTPlayer.m_DashCount < 2) {
					// :cond_4
					this.c_EVTPlayer.m_DashCount = (this.c_EVTPlayer.m_DashCount + 0x1);
					this.setPlayerCtrl(3, 0);
				}
			}
		}
		// goto :goto_0
		// :goto_0
		return;
}

private void JumpConctrl(){
	;
	switch(this.EVT.Ctrl){
	case 1:  case 2: 
	this.EVT.Status = (this.EVT.Status | 0x200);
	;
	switch(this.EVT.ACTIdx){
	case R.drawable.act_jumping00: 
	this.EVT.XInc = 0x80000;
	break;
	case R.drawable.act_jumping01: 
	this.EVT.XInc = 0x60000;
	break;
	case R.drawable.act_jumping02: 
	this.EVT.XInc = 0x40000;
	break;
	case R.drawable.act_jumping03: 
	this.EVT.XInc = 0x20000;
	break;
	case R.drawable.act_jumping04: 
	this.EVT.XInc = 0x10000;
	break;
	case R.drawable.act_jumping05: 
	this.EVT.XInc = 0 /* 0 */;
	break;
	case R.drawable.act_jumping06: 
	this.EVT.XInc = -0x10000;
	break;
	case R.drawable.act_jumping07: 
	this.EVT.XInc = -0x20000;
	break;
	case R.drawable.act_jumping08: 
	this.EVT.XInc = -0x40000;
	break;
	case R.drawable.act_jumping09: 
	this.EVT.XInc = -0x60000;
	break;
	case R.drawable.act_jumping0a: 
	this.EVT.XInc = -0x80000;
	break;
	case R.drawable.act_jumping0b: 
	this.EVT.XInc = -0xa0000;
	break;
	case R.drawable.act_jumping0c: 
	this.EVT.XInc = -0xc0000;
	break;
	case R.drawable.act_jumping0d: 
	this.EVT.XInc = -0x100000;
	break;
	} //end of switch
	break;
	} //end of switch
	return;
	// op;
	
	
}

private void JumpFeetOffset(){
	this.c_EVTPlayer.m_FeetOffset_F = 0 /* 0 */;
	this.c_EVTPlayer.m_FeetOffset_B = 0 /* 0 */;
	;
	switch(this.EVT.Ctrl){
	case 1:  case 2: 
	this.EVT.Status = (this.EVT.Status | 0x200);
	;
	switch(this.EVT.ACTIdx){
	case R.drawable.act_jumping00: 
	this.c_EVTPlayer.m_FeetOffset_F = 28;
	this.c_EVTPlayer.m_FeetOffset_B = 0 /* 0 */;
	break;
	case R.drawable.act_jumping01: 
	this.c_EVTPlayer.m_FeetOffset_F = 26;
	this.c_EVTPlayer.m_FeetOffset_B = 2;
	break;
	case R.drawable.act_jumping02: 
	this.c_EVTPlayer.m_FeetOffset_F = 24;
	this.c_EVTPlayer.m_FeetOffset_B = 4;
	break;
	case R.drawable.act_jumping03: 
	this.c_EVTPlayer.m_FeetOffset_F = 22;
	this.c_EVTPlayer.m_FeetOffset_B = 6;
	break;
	case R.drawable.act_jumping04: 
	this.c_EVTPlayer.m_FeetOffset_F = 20;
	this.c_EVTPlayer.m_FeetOffset_B = 8;
	break;
	case R.drawable.act_jumping05: 
	this.c_EVTPlayer.m_FeetOffset_F = 18;
	this.c_EVTPlayer.m_FeetOffset_B = 10;
	break;
	case R.drawable.act_jumping06: 
	this.c_EVTPlayer.m_FeetOffset_F = 16;
	this.c_EVTPlayer.m_FeetOffset_B = 12;
	break;
	case R.drawable.act_jumping07: 
	this.c_EVTPlayer.m_FeetOffset_F = 14;
	this.c_EVTPlayer.m_FeetOffset_B = 14;
	break;
	case R.drawable.act_jumping08: 
	this.c_EVTPlayer.m_FeetOffset_F = 12;
	this.c_EVTPlayer.m_FeetOffset_B = 16;
	break;
	case R.drawable.act_jumping09: 
	this.c_EVTPlayer.m_FeetOffset_F = 10;
	this.c_EVTPlayer.m_FeetOffset_B = 18;
	break;
	case R.drawable.act_jumping0a: 
	this.c_EVTPlayer.m_FeetOffset_F = 8;
	this.c_EVTPlayer.m_FeetOffset_B = 20;
	break;
	case R.drawable.act_jumping0b: 
	this.c_EVTPlayer.m_FeetOffset_F = 6;
	this.c_EVTPlayer.m_FeetOffset_B = 22;
	break;
	case R.drawable.act_jumping0c: 
	this.c_EVTPlayer.m_FeetOffset_F = 4;
	this.c_EVTPlayer.m_FeetOffset_B = 24;
	break;
	case R.drawable.act_jumping0d: 
	this.c_EVTPlayer.m_FeetOffset_F = 2;
	this.c_EVTPlayer.m_FeetOffset_B = 26;
	break;
	} //end of switch
	break;
	} //end of switch
	return;
	// op;
	
	
}

/**
 * 降落？？
 */
private void PlayerExe00(){
	if (!this.c_EVTPlayer.m_isGround) {
	this.setPlayerCtrl(2,0);
	// :cond_0
	}
	return;
}

/**
 * Jump??
 */
private void PlayerExe01(){
	if (this.CHKEVTACTEnd()) {
	this.EVT.Status = (this.EVT.Status | 0x80);
	// :cond_0
	}
	if ((info.pharos.ly.C_Global.g_JumpBTNTouch & 0x2) == 2) {
	this.EVT.MaxCNT = 4;
	} else {
	this.EVT.MaxCNT = 1;
		}
	// goto :goto_0
	// :goto_0
	return;
}

private void PlayerExe02(){
	if (this.CHKEVTACTEnd()) {
	this.EVT.Status = (this.EVT.Status | 0x80);
	// :cond_0
	}
	return;
}

/**
 * dash??
 */
private void PlayerExe03(){
	this.EVT.Status = (this.EVT.Status | 0x400);
	this.c_EVTPlayer.m_DashDly = 10;
	if (this.CHKEVTACTEnd()) {
	this.EVT.XInc = 0 /* 0 */;
	this.setPlayerCtrl(2,0);
	// :cond_0
	}
	return;
}

/**
 * 退出
 */
private void PlayerExe04(){
	this.EVT.Attrib = 5;
	this.EVT.Status = (this.EVT.Status | 0x400);
	if (this.CHKEVTACTEnd()) {
		//退出
	info.pharos.ly.C_GameMain.cLib.getMessageMgr().SendMessage(20,9,0);
	this.EVTCLR();
	// :cond_0
	}
	return;
}

private void chkGameSide(){
	if (this.EVT.Ctrl != 4 && this.c_EVTPlayer.EVT.XVal < -0x2000000) {
	this.setPlayerCtrl(4,0);
	info.pharos.ly.C_GameMain.cLib.getMessageMgr().SendMessage(40,45,0);
	// :cond_0
	}
	return;
}
// virtual methods

public void CHKGameOperateClr(){
	if (this.c_EVTPlayer.EVT.XInc >= 0) {
	} else {
	this.m_JumpCount = 0 /* 0 */;
	this.m_DashCount = 0 /* 0 */;
	this.m_OperateCount = 0 /* 0 */;
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void CreatePlayer(){
	if (!this.c_EVTPlayer.EVT.Valid) {
	this.c_EVTPlayer.MakeEVENT(240,(80 - info.pharos.ly.C_Global.g_ScreenScale_3_1),0);
	this.c_EVTPlayer.EVT.Attrib = 4;
	this.c_EVTPlayer.EVT.Status = (this.c_EVTPlayer.EVT.Status | 0x2400);
	this.c_EVTPlayer.m_isGround = false /* 0 */;
	this.c_EVTPlayer.m_JumpCount = 0 /* 0 */;
	this.c_EVTPlayer.m_DashCount = 0 /* 0 */;
	this.c_EVTPlayer.m_OperateCount = 0 /* 0 */;
	this.c_EVTPlayer.m_BodyRadian = 0 /* 0 */;
	this.c_EVTPlayer.m_FeetOffset_F = 0 /* 0 */;
	this.c_EVTPlayer.m_FeetOffset_B = 0 /* 0 */;
	this.c_EVTPlayer.m_DashDly = 0 /* 0 */;
	// :cond_0
	}
	return;
}

public void EVTRUN(){
	this.EVT.Status = (this.EVT.Status & -0x401);
	this.EVT.XAdc = -0x1C000;
	if (this.EVT.XInc < -0x20000 && this.c_EVTPlayer.m_isGround) {
	this.EVT.XInc = -0x20000;
	// :cond_0
	}
	if (this.EVT.XInc < -0x140000) {
	this.EVT.XInc = -0x140000;
	// :cond_1
	}
	if (this.c_EVTPlayer.m_DashDly != 0) {
	this.c_EVTPlayer.m_DashDly = (this.c_EVTPlayer.m_DashDly - 1);
	// :cond_2
	}
	;
	switch(this.EVT.Ctrl){
	case 0: 
	this.PlayerExe00();
	break;
	case 1: 
	this.PlayerExe01();
	break;
	case 2: 
	this.PlayerExe02();
	break;
	case 3: 
	this.PlayerExe03();
	break;
	case 4: 
	this.PlayerExe04();
	break;
	} //end of switch
	this.chkGameSide();
	this.CHKGameOperate();
	this.JumpConctrl();
	this.JumpFeetOffset();
	return;
	// op;
	
}

public void InitPlaneOBJ(info.pharos.ly.C_EVTPlayer cEVTPlayer){
	this.c_EVTPlayer = cEVTPlayer;
	return;
}

public void setPlayerCtrl(int Ctrl,int Mode){
	if (Ctrl != 0) {
	info.pharos.ly.C_Media.StopSound(3);
	// :cond_0
	}
	switch(Ctrl){
	case 0: 
	if (this.c_EVTPlayer.EVT.Ctrl != 0) {
	info.pharos.ly.C_Media.PlaySound(3);
	this.SetEVTCtrl(0,Mode);
	}
	break;
	case 1: 
	if (this.c_EVTPlayer.EVT.Ctrl != 4) {
	info.pharos.ly.C_Media.PlaySound(4);
	this.c_EVTPlayer.EVT.XInc = 0xf0000;
	this.SetEVTCtrl(1,1024);
	}
	break;
	case 2: 
	this.c_EVTPlayer.EVT.XInc = -0x20000;
	this.SetEVTCtrl(2,1024);
	break;
	case 3: 
	if (this.c_EVTPlayer.EVT.Ctrl != 3 && this.c_EVTPlayer.EVT.Ctrl != 4) {
	this.SetEVTCtrl(3,0);
	info.pharos.ly.C_Media.PlaySound(0);
	}
	break;
	case 4: 
	this.EVT.XVal = (this.EVT.XVal + 0x100000);
	info.pharos.ly.C_PUB.setVibratorTime();
	info.pharos.ly.C_Media.PlaySound(1);
	this.SetEVTCtrl(4,1024);
	info.pharos.ly.C_GameMain.cLib.getMessageMgr().SendMessage(40,45,0);
	info.pharos.ly.C_GameMain.cLib.getMessageMgr().SendMessage(40,49,0);
	break;
	} //end of switch
	// :cond_1
	return;
	
}

}
