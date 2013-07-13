package oms.GameEngine;


public class C_MultiTouch extends Object  {

// static fields
public static final int MULTIMOVEMAX = 0xa;
public static final int MULTITOUCHMAX = 0x4;
public static int nScreenXOff;
public static int nScreenYOff;
// instance fields
public int mTouchDownReadCount;
public int[] mTouchDownReadId;
public int[] mTouchDownReadXVal;
public int[] mTouchDownReadYVal;
public int mTouchDownWriteCount;
public int[] mTouchDownWriteId;
public int[] mTouchDownWriteXVal;
public int[] mTouchDownWriteYVal;
public boolean mTouchMove;
public int[] mTouchMoveReadCount;
public int[] mTouchMoveReadId;
public int[][] mTouchMoveReadXVal;
public int[][] mTouchMoveReadYVal;
public int[] mTouchMoveWriteCount;
public int[] mTouchMoveWriteId;
public int[][] mTouchMoveWriteXVal;
public int[][] mTouchMoveWriteYVal;
public int mTouchUpReadCount;
public int[] mTouchUpReadId;
public int[] mTouchUpReadXVal;
public int[] mTouchUpReadYVal;
public int mTouchUpWriteCount;
public int[] mTouchUpWriteId;
public int[] mTouchUpWriteXVal;
public int[] mTouchUpWriteYVal;
private int nScreenOrientation;
// direct methods

public C_MultiTouch(){
	super();
	this.nScreenOrientation = 0 /* 0 */;
	oms.GameEngine.OS.determineAPI();
	this.initTouch();
	oms.GameEngine.C_MultiTouch.SetScreenOffset(0,0);
}

private int ChangeToLpX(int X,int Y){
	
	switch(this.nScreenOrientation){
	case 0: 
	case 3:
		return X;
	case 1: 
	X = Y;
	return X;
	//break;
	case 2: 
	X = (oms.GameEngine.GameCanvas.GetScreenHeight() - Y);
	return X;
	//break;
	default:
	X = (oms.GameEngine.GameCanvas.GetScreenWidth() - X);
	return X;
	} //end of switch
	//:pswitch_0
//	return X;
	// op;
	
}

private int ChangeToLpY(int X,int Y){
	;
	switch(this.nScreenOrientation){
	case 0: 
	case 3:
		return Y;
	case 1: 
	Y = (oms.GameEngine.GameCanvas.GetScreenWidth() - X);
	return Y;
	//break;
	case 2: 
	Y = X;
	return Y;
	//break;
	default:
	Y = (oms.GameEngine.GameCanvas.GetScreenHeight() - Y);
	return Y;
	} //end of switch
	//:pswitch_0
//	return Y;
	// op;
	
}

public static void SetScreenOffset(int XOff,int YOff){
	oms.GameEngine.C_MultiTouch.nScreenXOff = XOff;
	oms.GameEngine.C_MultiTouch.nScreenYOff = YOff;
	return;
}

private void initTouch(){
	this.mTouchDownWriteCount = 0 /* 0 */;
	;
	this.mTouchDownWriteId = new int[4];
	;
	this.mTouchDownWriteXVal = new int[4];
	;
	this.mTouchDownWriteYVal = new int[4];
	this.mTouchDownReadCount = 0 /* 0 */;
	;
	this.mTouchDownReadId = new int[4];
	;
	this.mTouchDownReadXVal = new int[4];
	;
	this.mTouchDownReadYVal = new int[4];
	this.mTouchUpWriteCount = 0 /* 0 */;
	;
	this.mTouchUpWriteId = new int[4];
	;
	this.mTouchUpWriteXVal = new int[4];
	;
	this.mTouchUpWriteYVal = new int[4];
	this.mTouchUpReadCount = 0 /* 0 */;
	;
	this.mTouchUpReadId = new int[4];
	;
	this.mTouchUpReadXVal = new int[4];
	;
	this.mTouchUpReadYVal = new int[4];
	;
	this.mTouchMoveWriteId = new int[4];
	;
	this.mTouchMoveWriteCount = new int[4];
	this.mTouchMoveWriteXVal = (int[][])java.lang.reflect.Array.newInstance(Integer.TYPE,new int[]{4,10});
	this.mTouchMoveWriteYVal = (int[][])java.lang.reflect.Array.newInstance(Integer.TYPE,new int[]{4,10});
	;
	this.mTouchMoveReadId = new int[4];
	;
	this.mTouchMoveReadCount = new int[4];
	this.mTouchMoveReadXVal = (int[][])java.lang.reflect.Array.newInstance(Integer.TYPE,new int[]{4,10});
	this.mTouchMoveReadYVal = (int[][])java.lang.reflect.Array.newInstance(Integer.TYPE,new int[]{4,10});
	this.mTouchMove = false /* 0 */;
	int i = 0;
	while (i < 4) {
	this.mTouchDownWriteId[i] = 0 /* 0 */;
	this.mTouchDownWriteXVal[i] = 0 /* 0 */;
	this.mTouchDownWriteYVal[i] = 0 /* 0 */;
	this.mTouchDownReadId[i] = -1;
	this.mTouchDownReadXVal[i] = 0 /* 0 */;
	this.mTouchDownReadYVal[i] = 0 /* 0 */;
	this.mTouchUpWriteId[i] = -1;
	this.mTouchUpWriteXVal[i] = 0 /* 0 */;
	this.mTouchUpWriteYVal[i] = 0 /* 0 */;
	this.mTouchUpReadId[i] = 0 /* 0 */;
	this.mTouchUpReadXVal[i] = 0 /* 0 */;
	this.mTouchUpReadYVal[i] = 0 /* 0 */;
	this.mTouchMoveWriteId[i] = 0 /* 0 */;
	this.mTouchMoveWriteCount[i] = 0 /* 0 */;
	this.mTouchMoveReadId[i] = 0 /* 0 */;
	this.mTouchMoveReadCount[i] = 0 /* 0 */;
	int j = 0;
	while (j < 10) {
	this.mTouchMoveWriteXVal[i][j] = 0 /* 0 */;
	this.mTouchMoveWriteYVal[i][j] = 0 /* 0 */;
	this.mTouchMoveReadXVal[i][j] = 0 /* 0 */;
	this.mTouchMoveReadYVal[i][j] = 0 /* 0 */;
	j = (j + 0x1);
	// goto :goto_1
	// :cond_1
	}
	i = (i + 0x1);
	// goto :goto_0
	// :cond_0
	}
	return;
}

private void onTouchDown(float x,float y,int pointerCount,int pointerId){
	if (pointerId >= 4) {
	} else {
	this.mTouchDownWriteId[pointerId] = pointerId;
	this.mTouchDownWriteXVal[pointerId] = (int)x;
	this.mTouchDownWriteYVal[pointerId] = (int)y;
		}
	// goto :goto_0
	// :goto_0
	return;
}

private void onTouchMove(float x,float y,int pointerCount,int pointerId){
	if (pointerId >= 4) {
	// :cond_0
	} else {
	this.mTouchMoveWriteId[pointerId] = pointerId;
	if (this.mTouchMoveWriteCount[pointerId] < 10) {
	this.mTouchMoveWriteXVal[pointerId][this.mTouchMoveWriteCount[pointerId]] = (int)x;
	this.mTouchMoveWriteCount[pointerId] = (this.mTouchMoveWriteCount[pointerId] + 0x1);
	this.mTouchMoveWriteYVal[pointerId][this.mTouchMoveWriteCount[pointerId]] = (int)y;
		}
		}
	// goto :goto_0
	// :goto_0
	return;
}

private void onTouchUp(float x,float y,int pointerCount,int pointerId){
	if (pointerId >= 4) {
	} else {
	this.mTouchUpWriteId[pointerId] = pointerId;
	this.mTouchUpWriteXVal[pointerId] = (int)x;
	this.mTouchUpWriteYVal[pointerId] = (int)y;
		}
	// goto :goto_0
	// :goto_0
	return;
}
// virtual methods

public boolean CHKTouchDown(){
	if (this.mTouchDownReadCount > 0) {
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

public boolean CHKTouchMove(){
	;
	return this.mTouchMove;
	//return this.mTouchMove;
}

public boolean CHKTouchUp(){
	if (this.mTouchUpReadCount > 0) {
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

	public void ReadTouch() {
		this.mTouchDownReadCount = 0 /* 0 */;
		int i = 0;
		while (i < 4) {
			if (this.mTouchDownWriteId[i] != -1) {
				this.mTouchDownReadCount = (this.mTouchDownReadCount + 0x1);
				// :cond_1
			}
			this.mTouchDownReadId[i] = this.mTouchDownWriteId[i];
			this.mTouchDownReadXVal[i] = this.mTouchDownWriteXVal[i];
			this.mTouchDownReadYVal[i] = this.mTouchDownWriteYVal[i];
			this.mTouchDownWriteId[i] = -1;
			i = (i + 0x1);
			// goto :goto_0
			// :cond_0
		}
		this.mTouchUpReadCount = 0 /* 0 */;
		i = 0 /* 0 */;
		while (i < 4) {
			if (this.mTouchUpWriteId[i] != -1) {
				this.mTouchUpReadCount = (this.mTouchUpReadCount + 0x1);
				// :cond_3
			}
			this.mTouchUpReadId[i] = this.mTouchUpWriteId[i];
			this.mTouchUpReadXVal[i] = this.mTouchUpWriteXVal[i];
			this.mTouchUpReadYVal[i] = this.mTouchUpWriteYVal[i];
			this.mTouchUpWriteId[i] = -1;
			i = (i + 0x1);
			// goto :goto_1
			// :cond_2
		}
		this.mTouchMove = false /* 0 */;
		i = 0 /* 0 */;
		while (i < 4) {
			if (this.mTouchMoveWriteId[i] != -1) {
				this.mTouchMove = true;
				// :cond_5
			}
			this.mTouchMoveReadId[i] = this.mTouchMoveWriteId[i];
			if (this.mTouchMoveWriteId[i] != -1) {
				this.mTouchMove = true;
				// :cond_6
			}
			int j = 0;
			while (j < 10) {
				this.mTouchMoveReadXVal[i][j] = this.mTouchMoveWriteXVal[i][j];
				this.mTouchMoveReadYVal[i][j] = this.mTouchMoveWriteYVal[i][j];
				j = (j + 0x1);
				// goto :goto_3
				// :cond_7
			}
			this.mTouchMoveReadCount[i] = this.mTouchMoveWriteCount[i];
			this.mTouchMoveWriteCount[i] = 0 /* 0 */;
			this.mTouchMoveWriteId[i] = -1;
			i = (i + 0x1);
			// goto/16 :goto_2
			// :cond_4
		}
		return;
	}

public void SetScreenOrientation(int orientation){
	this.nScreenOrientation = orientation;
	return;
}

public int getTouchDownCount(){
	;
	return this.mTouchDownReadCount;
	//return this.mTouchDownReadCount;
}

public int getTouchDownId(int pointerId){
	if (pointerId < 4) {
	;
	return this.mTouchDownReadId[pointerId];
	} else {
	;
	return 0 /* 0 */;
		}
	// goto :goto_0
	// :goto_0
	//return this.mTouchDownReadId[pointerId];
}

public int getTouchDownX(int pointerId){
	if (pointerId < 4) {
	;
	return this.mTouchDownReadXVal[pointerId];
	} else {
	;
	return 0 /* 0 */;
		}
	// goto :goto_0
	// :goto_0
	//return this.mTouchDownReadXVal[pointerId];
}

public int getTouchDownY(int pointerId){
	if (pointerId < 4) {
	;
	return this.mTouchDownReadYVal[pointerId];
	} else {
	;
	return 0 /* 0 */;
		}
	// goto :goto_0
	// :goto_0
	//return this.mTouchDownReadYVal[pointerId];
}

public int getTouchMoveCount(int nID){
	;
	return this.mTouchMoveReadCount[nID];
	//return this.mTouchMoveReadCount[nID];
}

public int getTouchMoveId(int nID){
	;
	return this.mTouchMoveReadId[nID];
	//return this.mTouchMoveReadId[nID];
}

public int getTouchMoveX(int nID,int pointId){
	;
	return this.mTouchMoveReadXVal[nID][pointId];
	//return this.mTouchMoveReadXVal[nID][pointId];
}

public int getTouchMoveY(int nID,int pointId){
	;
	return this.mTouchMoveReadYVal[nID][pointId];
	//return this.mTouchMoveReadYVal[nID][pointId];
}

public int getTouchUpCount(){
	;
	return this.mTouchUpReadCount;
	//return this.mTouchUpReadCount;
}

public int getTouchUpId(int pointerId){
	if (pointerId < 4) {
	;
	return this.mTouchUpReadId[pointerId];
	} else {
	;
	return 0 /* 0 */;
		}
	// goto :goto_0
	// :goto_0
	//return this.mTouchUpReadId[pointerId];
}

public int getTouchUpX(int pointerId){
	if (pointerId < 4) {
	;
	return this.mTouchUpReadXVal[pointerId];
	} else {
	;
	return 0 /* 0 */;
		}
	// goto :goto_0
	// :goto_0
	//return this.mTouchUpReadXVal[pointerId];
}

public int getTouchUpY(int pointerId){
	if (pointerId < 4) {
	;
	return this.mTouchUpReadYVal[pointerId];
	} else {
	;
	return 0 /* 0 */;
		}
	// goto :goto_0
	// :goto_0
	//return this.mTouchUpReadYVal[pointerId];
}

protected void handleMultiTouch(android.view.MotionEvent event){
	int pointerCount = oms.GameEngine.C_MotionEventWrapper5.getPointerCount(event);
	int action = event.getAction();
	int idx = 0;
	while (idx < pointerCount) {
	int id = oms.GameEngine.C_MotionEventWrapper5.getPointerId(event,idx);
	float realX = oms.GameEngine.C_MotionEventWrapper5.getX(event,idx);
	float realY = oms.GameEngine.C_MotionEventWrapper5.getY(event,idx);
	int X = (int)(realX - (float)oms.GameEngine.C_MultiTouch.nScreenXOff);
	int Y = (int)(realY - (float)oms.GameEngine.C_MultiTouch.nScreenYOff);
	int x = this.ChangeToLpX(oms.GameEngine.GameMath.convertToRealX(X),oms.GameEngine.GameMath.convertToRealY(Y));
	int y = this.ChangeToLpY(oms.GameEngine.GameMath.convertToRealX(X),oms.GameEngine.GameMath.convertToRealY(Y));
	switch(action){
	case 0: 
	this.onTouchDown((float)x,(float)y,pointerCount,id);
	break;
	case 1: 
	this.onTouchUp((float)x,(float)y,pointerCount,id);
	break;
	case 2: 
	this.onTouchMove((float)x,(float)y,pointerCount,id);
	break;
	case 5: 
	if (idx == 0) {
	this.onTouchDown((float)x,(float)y,pointerCount,id);
	}
	break;
	case 6: 
	if (idx == 0) {
	this.onTouchUp((float)x,(float)y,pointerCount,id);
	}
	break;
	case 261: 
	if (idx == 1) {
	this.onTouchDown((float)x,(float)y,pointerCount,id);
	}
	break;
	case 262: 
	if (idx == 1) {
	this.onTouchUp((float)x,(float)y,pointerCount,id);
	}
	break;
	case 517: 
	if (idx == 2) {
	this.onTouchDown((float)x,(float)y,pointerCount,id);
	}
	break;
	case 518: 
	if (idx == 2) {
	this.onTouchUp((float)x,(float)y,pointerCount,id);
	break;
	} //end of switch
	// :cond_1
	}
	idx = (idx + 0x1);
	// goto :goto_0
	// :cond_0
	}
	return;
	
}

protected void handleSDK8MultiTouch(android.view.MotionEvent event){
	int pointerCount = oms.GameEngine.C_MotionEventWrapper8.getPointerCount(event);
	int action = event.getAction();
	int idx = 0;
		while (idx < pointerCount) {
			int id = oms.GameEngine.C_MotionEventWrapper8.getPointerId(event,
					idx);
			float realX = oms.GameEngine.C_MotionEventWrapper8.getX(event, idx);
			float realY = oms.GameEngine.C_MotionEventWrapper8.getY(event, idx);
			int X = (int) (realX - (float) oms.GameEngine.C_MultiTouch.nScreenXOff);
			int Y = (int) (realY - (float) oms.GameEngine.C_MultiTouch.nScreenYOff);
			int x = this.ChangeToLpX(oms.GameEngine.GameMath.convertToRealX(X),
					oms.GameEngine.GameMath.convertToRealY(Y));
			int y = this.ChangeToLpY(oms.GameEngine.GameMath.convertToRealX(X),
					oms.GameEngine.GameMath.convertToRealY(Y));
			switch ((action & 0xff)) {
			case 0:
				this.onTouchDown((float) x, (float) y, pointerCount, id);
				break;
			case 1:
				this.onTouchUp((float) x, (float) y, pointerCount, id);
				break;
			case 2:
				this.onTouchMove((float) x, (float) y, pointerCount, id);
				break;
			case 5:
				if (((action & 65280) >> 0x8) == idx) {
					this.onTouchDown((float) x, (float) y, pointerCount, id);
				}
				break;
			case 6:
				if (((action & 65280) >> 0x8) == idx) {
					this.onTouchUp((float) x, (float) y, pointerCount, id);
					break;
				} // end of switch
					// :cond_1
			}
			// :pswitch_0
			idx = (idx + 0x1);
			// goto somewhere; //maybe return,continue,break: goto :goto_0
			// op;

		}
}

public void handleTouch(android.view.MotionEvent event){
	if (oms.GameEngine.OS.API_LEVEL >= 5) {
	if (oms.GameEngine.OS.API_LEVEL >= 8) {
	this.handleSDK8MultiTouch(event);
	} else {
	this.handleMultiTouch(event);
		}
	// goto :goto_0
	} else {
	int action = event.getAction();
	float realX = event.getX();
	float realY = event.getY();
	int X = (int)(realX - (float)oms.GameEngine.C_MultiTouch.nScreenXOff);
	int Y = (int)(realY - (float)oms.GameEngine.C_MultiTouch.nScreenYOff);
	int x = this.ChangeToLpX(oms.GameEngine.GameMath.convertToRealX(X),oms.GameEngine.GameMath.convertToRealY(Y));
	int y = this.ChangeToLpY(oms.GameEngine.GameMath.convertToRealX(X),oms.GameEngine.GameMath.convertToRealY(Y));
	switch(action){
	case 0: 
	this.onTouchDown((float)x,(float)y,1,0);
	break;
	case 1: 
	this.onTouchUp((float)x,(float)y,1,0);
	break;
	case 2: 
	this.onTouchMove((float)x,(float)y,1,0);
	break;
	} //end of switch
		}
	// goto :goto_0
	// :goto_0
	return;
	// op;
	
}

}