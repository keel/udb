package info.pharos.ly;


public class C_EVTEidolon extends info.pharos.gameEngine.GameEvent  {

// static fields
public static final int CTRL_BLAST = 0x1;
public static final int CTRL_NORMALL = 0;
public static final int[][] EIDOLONAEVT = new int[2][];
private static final int[] Eidolon00ACT = {R.drawable.act_eidolon100,R.drawable.act_eidolon101,R.drawable.act_eidolon102,R.drawable.act_eidolon103,R.drawable.act_eidolon104,R.drawable.act_eidolon105,R.drawable.act_eidolon104,R.drawable.act_eidolon103,R.drawable.act_eidolon102,R.drawable.act_eidolon101};
private static final int[] Eidolon01ACT = {R.drawable.act_eidolon200,R.drawable.act_eidolon201,R.drawable.act_eidolon202,R.drawable.act_eidolon203,R.drawable.act_eidolon204};
private static final int[][] EidolonACT;
// instance fields
private info.pharos.ly.C_EVTEidolon[] c_EVTEidolon;
public int m_EVTIdx;
// direct methods

static{
	;
	;
	int[][] v0v490 = new int[2][];
	v0v490[0] = info.pharos.ly.C_EVTEidolon.Eidolon00ACT;
	v0v490[1] = info.pharos.ly.C_EVTEidolon.Eidolon01ACT;
	EidolonACT = v0v490;
	;
	int[] v1v445 = new int[8];
	v1v445[6] = 4;
	v1v445[7] = 9;
	info.pharos.ly.C_EVTEidolon.EIDOLONAEVT[0] = v1v445;
	int[] v1v528 = new int[8];
	v1v528[6] = 3;
	v1v528[7] = 5;
	info.pharos.ly.C_EVTEidolon.EIDOLONAEVT[1] = v1v528;
	//com.game.UnicornDash.C_EVTEidolon.EIDOLONAEVT = new int[2][];
	;
	;
}

public C_EVTEidolon(){
	super();
	this.c_EVTEidolon = null /* 0 */;
	this.EVT.ACTPtr = info.pharos.ly.C_EVTEidolon.EidolonACT;
	this.EVT.EVTPtr = info.pharos.ly.C_EVTEidolon.EIDOLONAEVT;
}

private void Eidolon00(){
	if (this.EVT.YVal < -0x400000) {
	info.pharos.ly.C_Global.g_EidolonCount = 0 /* 0 */;
	this.EVTCLR();
	// :cond_0
	}
	return;
}

private void Eidolon01(){
	this.EVT.Attrib = 5;
	if (this.CHKEVTACTEnd()) {
	this.EVTCLR();
	// :cond_0
	}
	return;
}
// virtual methods

public void CreateEidolon(int LandIdx,int XVal,int YVal){
	int i = 0;
	while (i < 2) {
	if (!this.c_EVTEidolon[i].EVT.Valid) {
	this.c_EVTEidolon[i].MakeEVENT(XVal,YVal,0);
	this.c_EVTEidolon[i].EVT.Attrib = 3;
	this.c_EVTEidolon[i].EVT.Status = (this.c_EVTEidolon[i].EVT.Status | 0x2400);
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
	this.Eidolon00();
	break;
	case 1: 
	this.Eidolon01();
	break;
	} //end of switch
	return;
	
}

public void InitEidolonOBJ(info.pharos.ly.C_EVTEidolon[] cEVTEidolon){
	this.c_EVTEidolon = cEVTEidolon;
	int i = 0;
	while (i < 2) {
	this.c_EVTEidolon[i].c_EVTEidolon = cEVTEidolon;
	i = (i + 0x1);
	// goto :goto_0
	// :cond_0
	}
	return;
}

}
