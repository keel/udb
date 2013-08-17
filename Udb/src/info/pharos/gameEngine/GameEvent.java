package info.pharos.gameEngine;


public class GameEvent extends Object  {

// annotations
// value = {
// Loms/GameEngine/GameEvent$EventDEF;
// }
// static fields
public static final int CVTEVT = 0x8000;
public static final int FIXEVT = 0x2000;
public static final int KeepACT = 0x80;
public static final int KeepADC = 0x200;
public static final int KeepHIT = 0x100;
public static final int KeepINC = 0x400;
public static final int MAPEVT = 0x1000;
public static final int RUNEVT = 0x4000;
public static final int V3DEVT = 0x800;
// instance fields
public info.pharos.gameEngine.GameEvent.EventDEF EVT;
public android.graphics.Rect mRc;
// direct methods

public GameEvent(){
	super();
	this.EVT = null /* 0 */;
	this.mRc = info.pharos.gameEngine.GameCanvas.GetViewRect();
	;
	this.EVT = new info.pharos.gameEngine.GameEvent.EventDEF();
	this.EVT.Valid = false /* 0 */;
}
// virtual methods

public boolean CHKEVTACTEnd(){
	if ((this.EVT.CurCNT + 0x1) == this.EVT.MaxCNT && (this.EVT.CurFRM + 0x1) == this.EVT.MaxFRM) {
	;
	return true /* 1 */;
	} else {
	;
	return false /* 0 */;
		}
	// goto :goto_0
	// :goto_0
	//return 1;
}

public void CheckEVTFun(info.pharos.gameEngine.GameCanvas canvas){
	android.graphics.Rect rc = info.pharos.gameEngine.GameCanvas.GetViewRect();
	if (this.EVT.Valid && (this.EVT.Status & 0x2000) != 8192 && (this.EVT.DispX >= rc.right || (this.EVT.DispX < rc.left || (this.EVT.DispY >= rc.bottom || this.EVT.DispY < rc.top)))) {
	// :cond_0
	this.EVTCLR();
	// :cond_1
	}
	return;
}

	public void EVTACT() {
		if ((this.EVT.Status & 32768) != 32768) {
			this.EVT.ACTIdx = this.EVT.ACTPtr[this.EVT.Ctrl][this.EVT.CurFRM];
			if ((this.EVT.Status & 0x80) != 128) {
				this.EVT.CurCNT = (this.EVT.CurCNT + 0x1);
				if (this.EVT.CurCNT >= this.EVT.MaxCNT) {
					this.EVT.CurCNT = 0 /* 0 */;
					this.EVT.CurFRM = (this.EVT.CurFRM + 0x1);
					if (this.EVT.CurFRM >= this.EVT.MaxFRM) {
						this.EVT.CurFRM = 0 /* 0 */;
						// :cond_0
					}
				}
			}
		}
		return;
	}

public void EVTCLR(){
	this.EVT.Valid = false /* 0 */;
	return;
}

public void EVTCVT(){
	int Status = this.EVT.Status;
	int Ctrl = this.EVT.Ctrl;
	if ((Status & 0x8000) == 0x8000) {
	if ((Status & 0x200) != 0x200) {
	this.EVT.XAdc = this.EVT.EVTPtr[Ctrl][3];
	this.EVT.YAdc = this.EVT.EVTPtr[Ctrl][4];
	this.EVT.ZAdc = this.EVT.EVTPtr[Ctrl][5];
	// :cond_0
	}
	if ((Status & 0x400) != 0x400) {
	this.EVT.XInc = this.EVT.EVTPtr[Ctrl][0];
	this.EVT.YInc = this.EVT.EVTPtr[Ctrl][1];
	this.EVT.ZInc = this.EVT.EVTPtr[Ctrl][2];
	// :cond_1
	}
	if ((Status & 0x80) != 0x80) {
	this.EVT.CurCNT = 0 /* 0 */;
	this.EVT.CurFRM = 0 /* 0 */;
	// :cond_2
	}
	this.EVT.MaxCNT = this.EVT.EVTPtr[Ctrl][6];
	this.EVT.MaxFRM = this.EVT.EVTPtr[Ctrl][7];
	if ((Status & 0x100) != 0x100) {
	this.EVT.ACTIdx = this.EVT.ACTPtr[Ctrl][this.EVT.CurFRM];
	// :cond_3
	}
	this.EVT.Status = (this.EVT.Status & -0x8781);
	// :cond_4
	}
	return;
}

public void EVTDIR(){
	int Status = this.EVT.Status;
	if ((Status & 0x200) != 512) {
	this.EVT.XInc = (this.EVT.XInc + this.EVT.XAdc);
	this.EVT.YInc = (this.EVT.YInc + this.EVT.YAdc);
	this.EVT.ZInc = (this.EVT.ZInc + this.EVT.ZAdc);
	// :cond_0
	}
	if ((Status & 0x400) != 1024) {
	this.EVT.XVal = (this.EVT.XVal + this.EVT.XInc);
	this.EVT.YVal = (this.EVT.YVal + this.EVT.YInc);
	this.EVT.ZVal = (this.EVT.ZVal + this.EVT.ZInc);
	// :cond_1
	}
	return;
}

public void EVTHIT(info.pharos.gameEngine.GameCanvas canvas){
	if ((this.EVT.Status & 0x100) != 256) {
	int ACTIdx = this.EVT.ACTIdx;
	if (ACTIdx != 0) {
	if ((this.EVT.Transform & 0x1) == 0) {
	this.EVT.XHitL = canvas.GetSpriteXHitL(ACTIdx);
	} else {
	this.EVT.XHitL = canvas.GetSpriteXHitR(ACTIdx);
		}
	// goto :goto_0
	// :goto_0
	if ((this.EVT.Transform & 0x1) == 0) {
	this.EVT.XHitR = canvas.GetSpriteXHitR(ACTIdx);
	} else {
	this.EVT.XHitR = canvas.GetSpriteXHitL(ACTIdx);
		}
	// goto :goto_1
	// :goto_1
	if ((this.EVT.Transform & 0x2) == 0) {
	this.EVT.YHitU = canvas.GetSpriteYHitU(ACTIdx);
	} else {
	this.EVT.YHitU = canvas.GetSpriteYHitD(ACTIdx);
		}
	// goto :goto_2
	// :goto_2
	if ((this.EVT.Transform & 0x2) == 0) {
	this.EVT.YHitD = canvas.GetSpriteYHitD(ACTIdx);
	} else {
	this.EVT.YHitD = canvas.GetSpriteYHitU(ACTIdx);
		}
	// goto :goto_3
	// :goto_3
	this.EVT.ZHitF = canvas.GetSpriteZHitF(ACTIdx);
	this.EVT.ZHitB = canvas.GetSpriteZHitB(ACTIdx);
	//[OTHER] end local v0           #ACTIdx:I
	// :cond_0
	}
	}
	return;
	
}

public void EVTRUN(){
	return;
}

public void ExecEVT(info.pharos.gameEngine.GameCanvas canvas){
	if (canvas == null) {
	// :cond_0
	} else {
	if (this.EVT.Valid) {
	this.EVTCVT();
	this.EVTDIR();
	this.EVTHIT(canvas);
		}
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void ExecRUN(info.pharos.gameEngine.GameCanvas canvas){
	if (canvas == null) {
	// :cond_0
	} else {
	if (this.EVT.Valid) {
	if ((this.EVT.Status & 32768) != 32768) {
	this.EVTRUN();
	// :cond_2
	}
	this.TouchEVTClr();
	this.CheckEVTFun(canvas);
	this.EVTACT();
		}
		}
	// goto :goto_0
	// :goto_0
	return;
}

public boolean MakeEVENT(int x,int y,int z){
	if (this.EVT.Valid) {
	;
	return false /* 0 */;
	} else {
	this.EVT.Valid = true;
	this.EVT.Ctrl = 0 /* 0 */;
	this.EVT.MaxCNT = 0 /* 0 */;
	this.EVT.MaxFRM = 0 /* 0 */;
	this.EVT.CurCNT = 0 /* 0 */;
	this.EVT.CurFRM = 0 /* 0 */;
	this.EVT.XVal = (x << 0x10);
	this.EVT.YVal = (y << 0x10);
	this.EVT.ZVal = (z << 0x10);
	this.EVT.XInc = 0 /* 0 */;
	this.EVT.YInc = 0 /* 0 */;
	this.EVT.ZInc = 0 /* 0 */;
	this.EVT.XAdc = 0 /* 0 */;
	this.EVT.YAdc = 0 /* 0 */;
	this.EVT.ZAdc = 0 /* 0 */;
	this.EVT.Flag = 0 /* 0 */;
	this.EVT.Attrib = 0 /* 0 */;
	this.EVT.Status = 32768;
	this.EVT.DispX = x;
	this.EVT.DispY = y;
	this.EVT.XHitL = 0 /* 0 */;
	this.EVT.XHitR = 0 /* 0 */;
	this.EVT.YHitU = 0 /* 0 */;
	this.EVT.YHitD = 0 /* 0 */;
	this.EVT.ZHitF = 0 /* 0 */;
	this.EVT.ZHitB = 0 /* 0 */;
	this.EVT.Transform = 0 /* 0 */;
	this.EVT.Touch = false /* 0 */;
	this.EVT.ACTIdx = 0 /* 0 */;
	this.EVT.Alpha = 255;
	this.EVT.TouchEVTIdx = 0 /* 0 */;
	this.EVT.TouchEVTName = "";
	this.EVT.Rotate = 0 /* 0 */;
	this.EVT.Scale = 1.0F;
	this.EVT.mPaintId = 0 /* 0 */;
	;
	return true /* 1 */;
		}
	// goto/16 :goto_0
	// :goto_0
	//return 0;
}

public void SetEVTCtrl(int Ctrl,int Mode){
	this.EVT.Status = (this.EVT.Status & -34689);
	this.EVT.Status = (this.EVT.Status | (32768 | Mode));
	this.EVT.Ctrl = Ctrl;
	return;
}

public void ShowEVENT(info.pharos.gameEngine.GameCanvas canvas){
		if (canvas == null) {
			// :cond_0
		} else {
			if (this.EVT.Valid) {
				int Status = (this.EVT.Status & 0x1000);
				if (Status == 0) {
					if ((this.EVT.Status & 0x800) != 2048) {
						this.EVT.DispX = (this.EVT.XVal >> 0x10);
						this.EVT.DispY = (this.EVT.YVal >> 0x10);
						// :cond_2
					}
					// :cond_3
				} else {
					// this.EVT.DispX = ((this.EVT.XVal -
					// canvas.GetTextXVal(this.EVT.Rotate)) >> 0x10);
					// this.EVT.DispY = ((this.EVT.YVal -
					// canvas.GetTextYVal(this.EVT.Rotate)) >> 0x10);
					this.EVT.DispX = ((this.EVT.XVal - canvas.GetTextXVal(0)) >> 0x10);
					this.EVT.DispY = ((this.EVT.YVal - canvas.GetTextYVal(0)) >> 0x10);

				}

				// goto :goto_1
				int DispX = this.EVT.DispX;
				int DispY = this.EVT.DispY;
				if ((this.EVT.ACTIdx > 0 && (DispX < this.mRc.right && (DispX >= this.mRc.left && (DispY < this.mRc.bottom && DispY >= this.mRc.top))))) {
					int spriteId = canvas.WriteSprite(this.EVT.ACTIdx, DispX,
							DispY, this.EVT.Attrib, this.EVT.Rotate,
							this.EVT.Scale);
					if (spriteId != -1) {
						canvas.SetPaintId(spriteId, this.EVT.mPaintId);
						canvas.SetSpriteAlpha(spriteId, this.EVT.Alpha);
						canvas.SetSpriteTransform(spriteId, this.EVT.Transform);
					}
					// goto :goto_0
					// [OTHER] end local v2 #DispX:I
					// [OTHER] end local v3 #DispY:I
					// [OTHER] end local v8 #spriteId:I
				}
			}
		}
		// :goto_0
		return;
}

public void TouchEVTClr(){
	this.EVT.Touch = false /* 0 */;
	this.EVT.TouchEVTIdx = 0 /* 0 */;
	this.EVT.TouchEVTName = "";
	return;
}

public void UpdateViewRect(){
	this.mRc = info.pharos.gameEngine.GameCanvas.GetViewRect();
	return;
}

public void release(){
	try {
	this.finalize();
	//end of try
	} catch (Throwable e) {
		;
		e.printStackTrace();
	} //end of catch: goto :goto_0
	// :goto_0
	return;
	
}














public class EventDEF extends Object  {

// annotations
// value = Loms/GameEngine/GameEvent;
// accessFlags = 0x1
// name = "EventDEF"
// instance fields
public int ACTIdx;
public int[][] ACTPtr;
public short Alpha;
public int Attrib;
public int Ctrl;
public int CurCNT;
public int CurFRM;
public int DispX;
public int DispY;
public int[][] EVTPtr;
public int Flag;
public int MaxCNT;
public int MaxFRM;
public float Rotate;
public float Scale;
public int Status;
public boolean Touch;
public int TouchEVTIdx;
public String TouchEVTName;
public int Transform;
public boolean Valid;
public int XAdc;
public int XHitL;
public int XHitR;
public int XInc;
public int XVal;
public int YAdc;
public int YHitD;
public int YHitU;
public int YInc;
public int YVal;
public int ZAdc;
public int ZHitB;
public int ZHitF;
public int ZInc;
public int ZVal;
public int mPaintId;
//final synthetic oms.GameEngine.GameEvent this$0 = $$0;
// direct methods

public EventDEF(){
	super();
	this.Ctrl = 0 /* 0 */;
	this.ACTIdx = 0 /* 0 */;
	this.MaxCNT = 0 /* 0 */;
	this.MaxFRM = 0 /* 0 */;
	this.CurCNT = 0 /* 0 */;
	this.CurFRM = 0 /* 0 */;
	this.XVal = 0 /* 0 */;
	this.YVal = 0 /* 0 */;
	this.ZVal = 0 /* 0 */;
	this.XInc = 0 /* 0 */;
	this.YInc = 0 /* 0 */;
	this.ZInc = 0 /* 0 */;
	this.XAdc = 0 /* 0 */;
	this.YAdc = 0 /* 0 */;
	this.ZAdc = 0 /* 0 */;
	this.Flag = 0 /* 0 */;
	this.Attrib = 0 /* 0 */;
	this.Status = 0 /* 0 */;
	this.DispX = 0 /* 0 */;
	this.DispY = 0 /* 0 */;
	this.XHitL = 0 /* 0 */;
	this.XHitR = 0 /* 0 */;
	this.YHitU = 0 /* 0 */;
	this.YHitD = 0 /* 0 */;
	this.ZHitF = 0 /* 0 */;
	this.ZHitB = 0 /* 0 */;
	this.Transform = 0 /* 0 */;
	this.EVTPtr = null /* 0 */;
	this.Touch = false /* 0 */;
	this.TouchEVTIdx = 0 /* 0 */;
	;
	this.TouchEVTName = new String();
	this.ACTPtr = null /* 0 */;
	this.Valid = false /* 0 */;
	this.mPaintId = 0 /* 0 */;
	this.Rotate = 0 /* 0 */;
	this.Scale = 1.0F;
}

}


}
