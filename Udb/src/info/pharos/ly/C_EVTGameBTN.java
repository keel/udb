package info.pharos.ly;


public class C_EVTGameBTN extends oms.GameEngine.GameEvent  {

// static fields
private static final int[] BTN_BuyNow00 = new int[0];
private static final int[][] BTN_BuyNowACT;
private static final int[] BTN_MaybeLater00 = new int[0];
private static final int[][] BTN_MaybeLaterACT;
private static final int[] BTN_More00 = {0x7f020011,0x7f020012,0x7f020011,0x7f020012};
private static final int[][] BTN_MoreACT;
private static final int[] BTN_MusicOFF00 = {0x7f020014,0x7f020013,0x7f020014,0x7f020013};
private static final int[][] BTN_MusicOFFACT;
private static final int[] BTN_MusicON00 = {0x7f020013,0x7f020014,0x7f020013,0x7f020014};
private static final int[][] BTN_MusicONACT;
private static final int[] BTN_Pause00 = {0x7f020009,0x7f02000a,0x7f020009,0x7f02000a};
private static final int[][] BTN_PauseACT;
private static final int[] BTN_Play00 = {0x7f02000f,0x7f020010,0x7f02000f,0x7f020010};
private static final int[][] BTN_PlayACT;
private static final int[] BTN_Quit00 = {0x7f0200b0,0x7f0200b1,0x7f0200b0,0x7f0200b1};
private static final int[][] BTN_QuitACT;
private static final int[] BTN_Resume00 = {0x7f0200ae,0x7f0200af,0x7f0200ae,0x7f0200af};
private static final int[][] BTN_ResumeACT;
private static final int[] BTN_ShakeOFF00 = {0x7f020016,0x7f020015,0x7f020016,0x7f020015};
private static final int[][] BTN_ShakeOFFACT;
private static final int[] BTN_ShakeON00 = {0x7f020015,0x7f020016,0x7f020015,0x7f020016};
private static final int[][] BTN_ShakeONACT;
private static final int[] BTN_SoundOFF00 = {0x7f020018,0x7f020017,0x7f020018,0x7f020017};
private static final int[][] BTN_SoundOFFACT;
private static final int[] BTN_SoundON00 = {0x7f020017,0x7f020018,0x7f020017,0x7f020018};
private static final int[][] BTN_SoundONACT;
public static final int[][] GameBTNSpriteEVT = new int[2][];
// instance fields
private info.pharos.ly.C_EVTGameBTN[] c_EVTGameBTN;
public int m_BTNType;
public boolean m_isTouch;
// direct methods

static{
	;
	;
	;
	;
	;
	;
	;
	;
	;
	;
	;
	;
	;
	int[][] v0v321 = new int[2][];
	v0v321[0] = info.pharos.ly.C_EVTGameBTN.BTN_Play00;
	v0v321[1] = info.pharos.ly.C_EVTGameBTN.BTN_Play00;
	BTN_PlayACT = v0v321;
	int[][] v0v39 = new int[2][];
	v0v39[0] = info.pharos.ly.C_EVTGameBTN.BTN_More00;
	v0v39[1] = info.pharos.ly.C_EVTGameBTN.BTN_More00;
	BTN_MoreACT = v0v39;
	int[][] v0v361 = new int[2][];
	v0v361[0] = info.pharos.ly.C_EVTGameBTN.BTN_Pause00;
	v0v361[1] = info.pharos.ly.C_EVTGameBTN.BTN_Pause00;
	BTN_PauseACT = v0v361;
	int[][] v0v376 = new int[2][];
	v0v376[0] = info.pharos.ly.C_EVTGameBTN.BTN_Resume00;
	v0v376[1] = info.pharos.ly.C_EVTGameBTN.BTN_Resume00;
	BTN_ResumeACT = v0v376;
	int[][] v0v325 = new int[2][];
	v0v325[0] = info.pharos.ly.C_EVTGameBTN.BTN_Quit00;
	v0v325[1] = info.pharos.ly.C_EVTGameBTN.BTN_Quit00;
	BTN_QuitACT = v0v325;
	int[][] v0v388 = new int[2][];
	v0v388[0] = info.pharos.ly.C_EVTGameBTN.BTN_SoundON00;
	v0v388[1] = info.pharos.ly.C_EVTGameBTN.BTN_SoundON00;
	BTN_SoundONACT = v0v388;
	int[][] v0v342 = new int[2][];
	v0v342[0] = info.pharos.ly.C_EVTGameBTN.BTN_SoundOFF00;
	v0v342[1] = info.pharos.ly.C_EVTGameBTN.BTN_SoundOFF00;
	BTN_SoundOFFACT = v0v342;
	int[][] v0v365 = new int[2][];
	v0v365[0] = info.pharos.ly.C_EVTGameBTN.BTN_MusicON00;
	v0v365[1] = info.pharos.ly.C_EVTGameBTN.BTN_MusicON00;
	BTN_MusicONACT = v0v365;
	int[][] v0v344 = new int[2][];
	v0v344[0] = info.pharos.ly.C_EVTGameBTN.BTN_MusicOFF00;
	v0v344[1] = info.pharos.ly.C_EVTGameBTN.BTN_MusicOFF00;
	BTN_MusicOFFACT = v0v344;
	int[][] v0v31 = new int[2][];
	v0v31[0] = info.pharos.ly.C_EVTGameBTN.BTN_ShakeON00;
	v0v31[1] = info.pharos.ly.C_EVTGameBTN.BTN_ShakeON00;
	BTN_ShakeONACT = v0v31;
	int[][] v0v322 = new int[2][];
	v0v322[0] = info.pharos.ly.C_EVTGameBTN.BTN_ShakeOFF00;
	v0v322[1] = info.pharos.ly.C_EVTGameBTN.BTN_ShakeOFF00;
	BTN_ShakeOFFACT = v0v322;
	int[][] v0v389 = new int[2][];
	v0v389[0] = info.pharos.ly.C_EVTGameBTN.BTN_BuyNow00;
	v0v389[1] = info.pharos.ly.C_EVTGameBTN.BTN_BuyNow00;
	BTN_BuyNowACT = v0v389;
	int[][] v0v398 = new int[2][];
	v0v398[0] = info.pharos.ly.C_EVTGameBTN.BTN_MaybeLater00;
	v0v398[1] = info.pharos.ly.C_EVTGameBTN.BTN_MaybeLater00;
	BTN_MaybeLaterACT = v0v398;
	;
	int[] v1v31 = new int[8];
	v1v31[6] = 4;
	v1v31[7] = 1;
	info.pharos.ly.C_EVTGameBTN.GameBTNSpriteEVT[0] = v1v31;
	int[] v1v488 = new int[8];
	v1v488[6] = 2;
	v1v488[7] = 4;
	info.pharos.ly.C_EVTGameBTN.GameBTNSpriteEVT[1] = v1v488;
	//com.game.UnicornDash.C_EVTGameBTN.GameBTNSpriteEVT = new int[2][];
	// op;
	;
	;
	;
	;
	;
	;
	;
	;
	;
	;
	;
}

public C_EVTGameBTN(){
	super();
	this.c_EVTGameBTN = null /* 0 */;
	this.m_BTNType = 0 /* 0 */;
	this.m_isTouch = false /* 0 */;
	this.EVT.ACTPtr = info.pharos.ly.C_EVTGameBTN.BTN_PauseACT;
	this.EVT.EVTPtr = info.pharos.ly.C_EVTGameBTN.GameBTNSpriteEVT;
}

private void GameBTNExe00(){
	int ACTName = this.EVT.ACTIdx;
	int XVal = (this.EVT.XVal >> 0x10);
	int YVal = (this.EVT.YVal >> 0x10);
	if (!info.pharos.ly.C_Global.g_BtnIsValid) {
	// :cond_0
	// :cond_1
	} else if (info.pharos.ly.C_PUB.CHKTouchDown(2,2,2,2,ACTName,XVal,YVal)) {
	info.pharos.ly.C_Media.PlaySound(5);
	this.SetEVTCtrl(1,0);
	;
	switch(this.m_BTNType){
	default:
	case 6:  case 7:  case 8:  case 9: 
	info.pharos.ly.C_Global.g_BtnIsValid = false /* 0 */;
	} //end of switch
		}
	// goto :goto_0
	
	// :goto_0
	return;
}

private void GameBTNExe01(){
	if (this.CHKEVTACTEnd()) {
	info.pharos.ly.C_OPhoneApp.cLib.getMessageMgr().SendMessage(10,this.m_BTNType,0);
	this.SetEVTCtrl(0,0);
	// :cond_0
	}
	return;
}

private void SetGameBTNType(int Idx,int type){
	switch(type){
	case 9: 
	this.c_EVTGameBTN[Idx].EVT.ACTPtr = info.pharos.ly.C_EVTGameBTN.BTN_PlayACT;
	break;
	case 10: 
	this.c_EVTGameBTN[Idx].EVT.ACTPtr = info.pharos.ly.C_EVTGameBTN.BTN_MoreACT;
	break;
	case 6: 
	this.c_EVTGameBTN[Idx].EVT.ACTPtr = info.pharos.ly.C_EVTGameBTN.BTN_PauseACT;
	break;
	case 7: 
	this.c_EVTGameBTN[Idx].EVT.ACTPtr = info.pharos.ly.C_EVTGameBTN.BTN_ResumeACT;
	break;
	case 8: 
	this.c_EVTGameBTN[Idx].EVT.ACTPtr = info.pharos.ly.C_EVTGameBTN.BTN_QuitACT;
	break;
	case 3: 
	this.c_EVTGameBTN[Idx].EVT.ACTPtr = info.pharos.ly.C_EVTGameBTN.BTN_SoundONACT;
	break;
	case 4: 
	this.c_EVTGameBTN[Idx].EVT.ACTPtr = info.pharos.ly.C_EVTGameBTN.BTN_MusicONACT;
	break;
	case 5: 
	this.c_EVTGameBTN[Idx].EVT.ACTPtr = info.pharos.ly.C_EVTGameBTN.BTN_ShakeONACT;
	break;
	case 12: 
	this.c_EVTGameBTN[Idx].EVT.ACTPtr = info.pharos.ly.C_EVTGameBTN.BTN_BuyNowACT;
	break;
	case 13: 
	this.c_EVTGameBTN[Idx].EVT.ACTPtr = info.pharos.ly.C_EVTGameBTN.BTN_MaybeLaterACT;
	break;
	} //end of switch
	//:pswitch_0
	return;
	
}

private void setSoundBNTACT(){
	if (this.m_BTNType == 3) {
	info.pharos.ly.C_Save.g_SoundStatus = info.pharos.ly.C_OPhoneApp.cLib.getMediaManager().GetSoundStatus();
	if (info.pharos.ly.C_Save.g_SoundStatus) {
	this.EVT.ACTPtr = info.pharos.ly.C_EVTGameBTN.BTN_SoundONACT;
	} else {
	this.EVT.ACTPtr = info.pharos.ly.C_EVTGameBTN.BTN_SoundOFFACT;
		}
	// goto :goto_0
	// :cond_0
	}
	// :goto_0
	if (this.m_BTNType == 4) {
	info.pharos.ly.C_Save.g_MusicStatus = info.pharos.ly.C_OPhoneApp.cLib.getMediaManager().GetMediaStatus();
	if (info.pharos.ly.C_Save.g_MusicStatus) {
	this.EVT.ACTPtr = info.pharos.ly.C_EVTGameBTN.BTN_MusicONACT;
	} else {
	this.EVT.ACTPtr = info.pharos.ly.C_EVTGameBTN.BTN_MusicOFFACT;
		}
	// goto :goto_1
	// :cond_1
	}
	// :goto_1
	if (this.m_BTNType == 5) {
	info.pharos.ly.C_Save.g_ShakeStatus = info.pharos.ly.Vibrator.enabled;
	if (info.pharos.ly.C_Save.g_ShakeStatus) {
	this.EVT.ACTPtr = info.pharos.ly.C_EVTGameBTN.BTN_ShakeONACT;
	} else {
	this.EVT.ACTPtr = info.pharos.ly.C_EVTGameBTN.BTN_ShakeOFFACT;
		}
	// goto :goto_2
	// :cond_2
	}
	// :goto_2
	return;
}
// virtual methods

	public void CreateGameBTN(int BTNType, int XVal, int YVal) {
		int i = 0;
		while (i < 5) {
			if (!this.c_EVTGameBTN[i].EVT.Valid) {
				this.c_EVTGameBTN[i].MakeEVENT(XVal, YVal, 0);
				this.c_EVTGameBTN[i].EVT.Flag = 2;
				this.c_EVTGameBTN[i].EVT.Attrib = 7;
				this.c_EVTGameBTN[i].EVT.Status = (this.c_EVTGameBTN[i].EVT.Status | 0x2000);
				this.c_EVTGameBTN[i].m_BTNType = BTNType;
				this.c_EVTGameBTN[i].m_isTouch = false /* 0 */;
				this.SetGameBTNType(i, BTNType);
				info.pharos.ly.C_Global.g_BtnIsValid = true;
				// goto :goto_1
				break; //
			} else {
				i = (i + 0x1);
			}
			// goto :goto_0
			// :cond_0
		}
		return;
	}

public void EVTRUN(){
	;
	switch(this.EVT.Ctrl){
	case 0: 
	this.GameBTNExe00();
	break;
	case 1: 
	this.GameBTNExe01();
	break;
	} //end of switch
	this.setSoundBNTACT();
	return;
	// op;
	
}

public void InitGameBTNOBJ(info.pharos.ly.C_EVTGameBTN[] cEVTGameBTN){
	this.c_EVTGameBTN = cEVTGameBTN;
	int i = 0;
	while (i < 5) {
	this.c_EVTGameBTN[i].c_EVTGameBTN = cEVTGameBTN;
	i = (i + 0x1);
	// goto :goto_0
	// :cond_0
	}
	return;
}

}