package info.pharos.ly;


public class C_EVTPowerBall extends oms.GameEngine.GameEvent  {

// static fields
private static final int[] PowerBall00;
private static final int[] PowerBall01 = {0x7f0200b4,0x7f0200b5,0x7f0200b6,0x7f0200b7,0x7f0200b4};
private static final int[] PowerBall02 = {0x7f0200ba,0x7f0200bb,0x7f0200bc,0x7f0200bd,0x7f0200be,0x7f0200bf,0x7f0200c0,0x7f0200c1};
private static final int[][] PowerBallACT;
public static final int[][] PowerBallSpriteEVT = new int[3][];
// direct methods

static{
	int[] v0v388 = new int[1];
	v0v388[0] = 2130837683;
	PowerBall00 = v0v388;
	;
	;
	int[][] v0v318 = new int[3][];
	v0v318[0] = info.pharos.ly.C_EVTPowerBall.PowerBall00;
	v0v318[1] = info.pharos.ly.C_EVTPowerBall.PowerBall01;
	v0v318[2] = info.pharos.ly.C_EVTPowerBall.PowerBall02;
	PowerBallACT = v0v318;
	;
	int[] v1v366 = new int[8];
	v1v366[6] = 4;
	v1v366[7] = 1;
	info.pharos.ly.C_EVTPowerBall.PowerBallSpriteEVT[0] = v1v366;
	int[] v1v419 = new int[8];
	v1v419[6] = 1;
	v1v419[7] = 5;
	info.pharos.ly.C_EVTPowerBall.PowerBallSpriteEVT[1] = v1v419;
	int[] v1v62 = new int[8];
	v1v62[6] = 2;
	v1v62[7] = 8;
	info.pharos.ly.C_EVTPowerBall.PowerBallSpriteEVT[2] = v1v62;
	//com.game.UnicornDash.C_EVTPowerBall.PowerBallSpriteEVT = new int[3][];
	;
	;
}

public C_EVTPowerBall(){
	super();
	this.EVT.ACTPtr = info.pharos.ly.C_EVTPowerBall.PowerBallACT;
	this.EVT.EVTPtr = info.pharos.ly.C_EVTPowerBall.PowerBallSpriteEVT;
}

private void PowerBallExe00(){
	if (this.EVT.YVal < -0x400000) {
	this.EVTCLR();
	// :cond_0
	}
	return;
}

private void PowerBallExe01(){
	if (this.CHKEVTACTEnd()) {
	this.EVT.Status = (this.EVT.Status | 0x80);
	// :cond_0
	}
	if (info.pharos.ly.C_PUB.Random(20) == 0) {
	this.EVT.Status = (this.EVT.Status & -0x81);
	// :cond_1
	}
	return;
}

private void PowerBallExe02(){
	if (this.CHKEVTACTEnd()) {
	this.EVTCLR();
	// :cond_0
	}
	return;
}
// virtual methods

void CreatePowerBall(info.pharos.ly.C_EVTPowerBall c_PowerBall,int XVal,int YVal){
	if (!c_PowerBall.EVT.Valid) {
	c_PowerBall.MakeEVENT(XVal,YVal,0);
	c_PowerBall.EVT.Flag = 6;
	c_PowerBall.EVT.Attrib = 5;
	c_PowerBall.EVT.Status = (c_PowerBall.EVT.Status | 0x2000);
	// :cond_0
	}
	return;
}

public void EVTRUN(){
	;
	switch(this.EVT.Ctrl){
	case 0: 
	this.PowerBallExe00();
	break;
	case 1: 
	this.PowerBallExe01();
	break;
	case 2: 
	this.PowerBallExe02();
	break;
	} //end of switch
	return;
	
}

}