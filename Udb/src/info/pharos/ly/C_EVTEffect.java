package info.pharos.ly;


public class C_EVTEffect extends info.pharos.gameEngine.GameEvent  {

// static fields
public static final int CTRL_CLOUD_EFF = 0x3;
public static final int CTRL_EIDOLONSCORE_EFF = 0x2;
public static final int CTRL_HORSE_EFF = 0x0;
public static final int CTRL_PROPASCORE_EFF = 0x1;
public static final double[] CloudScaleCTBL = {0.8D,0.9D,1.0D,1.1D,1.2D,1.3D,1.4D,1.5D};
public static final int[][] EFFECTEVT = new int[4][];
private static final int[] Effect00ACT = {0x7f020023,0x7f020024,0x7f020025,0x7f020026,0x7f020027,0x7f020028,0x7f020029,0x7f02002a};
private static final int[] Effect01ACT = new int[16];
private static final int[] Effect02ACT = new int[16];
private static final int[] Effect03ACT;
private static final int[][] EffectACT;
// instance fields
private info.pharos.ly.C_EVTEffect[] c_EVTEffect;
public int m_EVTIdx;
public int m_Score;
// direct methods

static{
	;
	;
	;
	int[] v0v165 = new int[1];
	v0v165[0] = 2130837529;
	Effect03ACT = v0v165;
	int[][] v0v140 = new int[4][];
	v0v140[0] = info.pharos.ly.C_EVTEffect.Effect00ACT;
	v0v140[1] = info.pharos.ly.C_EVTEffect.Effect01ACT;
	v0v140[2] = info.pharos.ly.C_EVTEffect.Effect02ACT;
	v0v140[3] = info.pharos.ly.C_EVTEffect.Effect03ACT;
	EffectACT = v0v140;
	;
	int[] v2v134 = new int[8];
	v2v134[6] = 1;
	v2v134[7] = 8;
	info.pharos.ly.C_EVTEffect.EFFECTEVT[0] = v2v134;
	int[] v1v472 = new int[8];
	v1v472[6] = 3;
	v1v472[7] = 8;
	info.pharos.ly.C_EVTEffect.EFFECTEVT[1] = v1v472;
	int[] v2v182 = new int[8];
	v2v182[6] = 3;
	v2v182[7] = 8;
	info.pharos.ly.C_EVTEffect.EFFECTEVT[2] = v2v182;
	int[] v1v533 = new int[8];
	v1v533[6] = 3;
	v1v533[7] = 1;
	info.pharos.ly.C_EVTEffect.EFFECTEVT[3] = v1v533;
	//com.game.UnicornDash.C_EVTEffect.EFFECTEVT = new int[4][];
	;
	// op;
	;
	;
}

public C_EVTEffect(){
	super();
	this.c_EVTEffect = null /* 0 */;
	this.EVT.ACTPtr = info.pharos.ly.C_EVTEffect.EffectACT;
	this.EVT.EVTPtr = info.pharos.ly.C_EVTEffect.EFFECTEVT;
}

private void Effect00(){
	if (this.CHKEVTACTEnd()) {
	this.EVTCLR();
	// :cond_0
	}
	return;
}

private void Effect01(){
	this.EVT.XVal = (this.EVT.XVal + 0x10000);
	int XVal = ((this.EVT.XVal >> 0x10) + 0x14);
	int YVal = ((this.EVT.YVal >> 0x10) - 50);
	int SceneFloat_X = 0;
	int SceneFloat_Y = 0;
	if (this.EVT.CurFRM < 4) {
	info.pharos.ly.C_PUB.ShowNum((this.m_Score * 0x64),(XVal + SceneFloat_X),(YVal + SceneFloat_Y),15,3,5,info.pharos.ly.C_DEF.ResultNUM1TBL,this.EVT.Attrib);
	} else {
	info.pharos.ly.C_PUB.ShowNum((this.m_Score * 0x64),(XVal + SceneFloat_X),(YVal + SceneFloat_Y),12,3,5,info.pharos.ly.C_DEF.ResultNUM2TBL,this.EVT.Attrib);
		}
	// goto :goto_0
	// :goto_0
	if (this.CHKEVTACTEnd()) {
	this.EVTCLR();
	// :cond_0
	}
	return;
}

private void Effect02(){
	this.EVT.XVal = (this.EVT.XVal + 0x10000);
	int XVal = (this.EVT.XVal >> 0x10);
	int YVal = ((this.EVT.YVal >> 0x10) - 50);
	int SceneFloat_X = 0;
	int SceneFloat_Y = 0;
	info.pharos.ly.C_PUB.ShowNum((this.m_Score * 0xa),(XVal + SceneFloat_X),(YVal + SceneFloat_Y),15,2,5,info.pharos.ly.C_DEF.ResultNUM2TBL,this.EVT.Attrib);
	if (this.CHKEVTACTEnd()) {
	this.EVTCLR();
	// :cond_0
	}
	return;
}

private void Effect03(){
	if (this.EVT.YVal < -0x1000000) {
	this.EVTCLR();
	// :cond_0
	}
	return;
}
// virtual methods

public void CreateCloud_Eff(int XVal,int YVal,int Speed){
		if (info.pharos.ly.C_Global.g_chkVersion != 1) {
			return;
			// :cond_1
		} else if (info.pharos.ly.C_Global.g_MakeCloudDly != 0) {
			info.pharos.ly.C_Global.g_MakeCloudDly = (info.pharos.ly.C_Global.g_MakeCloudDly - 1);
			// goto :goto_0
		} else {
			info.pharos.ly.C_Global.g_MakeCloudDly = (info.pharos.ly.C_PUB
					.Random(120) + 0x40);
			int i = 0;
			while (i < 10) {
				if (!this.c_EVTEffect[i].EVT.Valid) {
					XVal = (info.pharos.ly.C_PUB.Random(160) + 0x28);
					YVal = 680;
					this.c_EVTEffect[i].MakeEVENT(XVal, YVal, 0);
					this.c_EVTEffect[i].EVT.Attrib = 5;
					this.c_EVTEffect[i].SetEVTCtrl(3, 9216);
					// goto :goto_0
					return;
				} else {
					i = (i + 0x1);
				}
			}
		}
	// goto :goto_1
}

public void CreateEidolonScore_Eff(int XVal,int YVal,int Score){
	int i = 0;
	while (i < 10) {
	if (!this.c_EVTEffect[i].EVT.Valid) {
	this.c_EVTEffect[i].MakeEVENT((info.pharos.ly.C_Global.g_SceneFloat_X + XVal),(info.pharos.ly.C_Global.g_SceneFloat_Y + YVal),0);
	this.c_EVTEffect[i].EVT.Attrib = 6;
	this.c_EVTEffect[i].EVT.Status = (this.c_EVTEffect[i].EVT.Status | 0x2400);
	this.c_EVTEffect[i].m_Score = Score;
	this.c_EVTEffect[i].SetEVTCtrl(2,0);
	// goto :goto_1
break ; //
	} else {
	i = (i + 0x1);
		}
	// goto :goto_0
	// :cond_0
	}
	return;
}

public void CreateHorse_Eff(int XVal,int YVal,int Speed){
	int i = 0;
	while (i < 10) {
	if (!this.c_EVTEffect[i].EVT.Valid) {
	this.c_EVTEffect[i].MakeEVENT(XVal,YVal,0);
	this.c_EVTEffect[i].EVT.Attrib = 6;
	this.c_EVTEffect[i].EVT.Status = (this.c_EVTEffect[i].EVT.Status | 0x2400);
	this.c_EVTEffect[i].EVT.YInc = -0x50000;
	// goto :goto_1
break ; //
	} else {
	i = (i + 0x1);
		}
	// goto :goto_0
	// :cond_0
	}
	return;
}

public void CreatePropAScore_Eff(int XVal,int YVal,int Score){
	int i = 0;
	while (i < 10) {
	if (!this.c_EVTEffect[i].EVT.Valid) {
	this.c_EVTEffect[i].MakeEVENT((info.pharos.ly.C_Global.g_SceneFloat_X + XVal),(info.pharos.ly.C_Global.g_SceneFloat_Y + YVal),0);
	this.c_EVTEffect[i].EVT.Attrib = 6;
	this.c_EVTEffect[i].EVT.Status = (this.c_EVTEffect[i].EVT.Status | 0x2400);
	this.c_EVTEffect[i].m_Score = Score;
	this.c_EVTEffect[i].SetEVTCtrl(1,0);
	// goto :goto_1
break ; //
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
	this.Effect00();
	break;
	case 1: 
	this.Effect01();
	break;
	case 2: 
	this.Effect02();
	break;
	case 3: 
	this.Effect03();
	break;
	} //end of switch
	return;
	
}

public void InitEffectOBJ(info.pharos.ly.C_EVTEffect[] cEVTEffect){
	this.c_EVTEffect = cEVTEffect;
	int i = 0;
	while (i < 10) {
	this.c_EVTEffect[i].c_EVTEffect = cEVTEffect;
	i = (i + 0x1);
	// goto :goto_0
	// :cond_0
	}
	return;
}

}