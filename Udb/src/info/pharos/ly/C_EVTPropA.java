package info.pharos.ly;


public class C_EVTPropA extends info.pharos.gameEngine.GameEvent  {

// static fields
public static final int CTRL_BLAST = 0x1;
public static final int CTRL_NORMALL = 0;
public static final int[][] PROPAEVT = new int[2][];
private static final int[] PropA00ACT;
private static final int[] PropA01ACT = {R.drawable.act_propclr00,R.drawable.act_propclr01,R.drawable.act_propclr02,R.drawable.act_propclr03,R.drawable.act_propclr04,R.drawable.act_propclr05,R.drawable.act_propclr06,R.drawable.act_propclr07};
private static final int[][] PropAACT;
// instance fields
private info.pharos.ly.C_EVTPropA[] c_EVTPropA;
public int m_EVTIdx;
// direct methods

static{
	int[] v0v535 = new int[1];
	v0v535[0] = R.drawable.act_prop00;
	PropA00ACT = v0v535;
	;
	int[][] v0v551 = new int[2][];
	v0v551[0] = info.pharos.ly.C_EVTPropA.PropA00ACT;
	v0v551[1] = info.pharos.ly.C_EVTPropA.PropA01ACT;
	PropAACT = v0v551;
	;
	int[] v1v52 = new int[8];
	v1v52[6] = 4;
	v1v52[7] = 1;
	info.pharos.ly.C_EVTPropA.PROPAEVT[0] = v1v52;
	int[] v1v338 = new int[8];
	v1v338[6] = 2;
	v1v338[7] = 8;
	info.pharos.ly.C_EVTPropA.PROPAEVT[1] = v1v338;
	//com.game.UnicornDash.C_EVTPropA.PROPAEVT = new int[2][];
	;
}

public C_EVTPropA(){
	super();
	this.c_EVTPropA = null /* 0 */;
	this.EVT.ACTPtr = info.pharos.ly.C_EVTPropA.PropAACT;
	this.EVT.EVTPtr = info.pharos.ly.C_EVTPropA.PROPAEVT;
}

private void PropA00(){
	if (this.EVT.YVal < -0x400000) {
	info.pharos.ly.C_Global.g_PropACount = 0 /* 0 */;
	this.EVTCLR();
	// :cond_0
	}
	return;
}

private void PropA01(){
	this.EVT.Attrib = 5;
	info.pharos.ly.C_GameMain.cLib.getGameCanvas().WriteSprite(info.pharos.ly.C_EVTPropA.PropA01ACT[this.EVT.CurFRM],this.EVT.DispX,(this.EVT.DispY + 0x1e),this.EVT.Attrib);
	if (this.CHKEVTACTEnd()) {
	this.EVTCLR();
	// :cond_0
	}
	return;
}
// virtual methods

public void CreatePropA(int LandIdx,int XVal,int YVal){
	int i = 0;
	while (i < 5) {
	if (!this.c_EVTPropA[i].EVT.Valid) {
	this.c_EVTPropA[i].MakeEVENT(XVal,YVal,0);
	this.c_EVTPropA[i].EVT.Attrib = 3;
	this.c_EVTPropA[i].EVT.Status = (this.c_EVTPropA[i].EVT.Status | 0x2400);
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
	this.PropA00();
	break;
	case 1: 
	this.PropA01();
	break;
	} //end of switch
	return;
	
}

public void InitPropAOBJ(info.pharos.ly.C_EVTPropA[] cEVTPropA){
	this.c_EVTPropA = cEVTPropA;
	int i = 0;
	while (i < 5) {
	this.c_EVTPropA[i].c_EVTPropA = cEVTPropA;
	i = (i + 0x1);
	// goto :goto_0
	// :cond_0
	}
	return;
}

}
