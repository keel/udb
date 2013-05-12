package oms.GameEngine;


public class TouchPannel extends Object  {

// static fields
public static final int BUFFMAX = 0x14;
public static final int MOVEBUFFMAX = 0x14;
// instance fields
public boolean mTouch;
public boolean mTouchDown;
public int[] mTouchDownBuff;
public int mTouchDownReadCount;
public int mTouchDownWriteCount;
public boolean mTouchEn;
public boolean mTouchMove;
public int[] mTouchMoveBuff;
public int mTouchMoveReadCount;
public int mTouchMoveWriteCount;
public int mTouchMoveX;
public int[] mTouchMoveXBuff;
public int[] mTouchMoveXReadBuff;
public int mTouchMoveY;
public int[] mTouchMoveYBuff;
public int[] mTouchMoveYReadBuff;
public boolean mTouchUp;
public int[] mTouchUpBuff;
public int mTouchUpReadCount;
public int mTouchUpWriteCount;
public int mTouchUpX;
public int[] mTouchUpXBuff;
public int[] mTouchUpXReadBuff;
public int mTouchUpY;
public int[] mTouchUpYBuff;
public int[] mTouchUpYReadBuff;
public int mTouchX;
public int[] mTouchXBuff;
public int[] mTouchXReadBuff;
public int mTouchY;
public int[] mTouchYBuff;
public int[] mTouchYReadBuff;
// direct methods

public TouchPannel(){
	super();
	this.mTouchEn = false /* 0 */;
	this.mTouch = false /* 0 */;
	this.mTouchDown = false /* 0 */;
	this.mTouchX = 0 /* 0 */;
	this.mTouchY = 0 /* 0 */;
	this.mTouchMove = false /* 0 */;
	this.mTouchMoveX = 0 /* 0 */;
	this.mTouchMoveY = 0 /* 0 */;
	this.mTouchUp = false /* 0 */;
	this.mTouchUpX = 0 /* 0 */;
	this.mTouchUpY = 0 /* 0 */;
	this.mTouchDownReadCount = 0 /* 0 */;
	this.mTouchDownWriteCount = 0 /* 0 */;
	this.mTouchMoveReadCount = 0 /* 0 */;
	this.mTouchMoveWriteCount = 0 /* 0 */;
	this.mTouchUpReadCount = 0 /* 0 */;
	this.mTouchUpWriteCount = 0 /* 0 */;
	;
	this.mTouchDownBuff = new int[1];
	;
	this.mTouchXBuff = new int[20];
	;
	this.mTouchYBuff = new int[20];
	;
	this.mTouchXReadBuff = new int[20];
	;
	this.mTouchYReadBuff = new int[20];
	;
	this.mTouchMoveBuff = new int[1];
	;
	this.mTouchMoveXBuff = new int[20];
	;
	this.mTouchMoveYBuff = new int[20];
	;
	this.mTouchMoveXReadBuff = new int[20];
	;
	this.mTouchMoveYReadBuff = new int[20];
	;
	this.mTouchUpBuff = new int[1];
	;
	this.mTouchUpXBuff = new int[20];
	;
	this.mTouchUpYBuff = new int[20];
	;
	this.mTouchUpXReadBuff = new int[20];
	;
	this.mTouchUpYReadBuff = new int[20];
	this.mTouchDownBuff[0] = 0 /* 0 */;
	this.mTouchUpBuff[0] = 0 /* 0 */;
	int i = 0;
	while (i < 20) {
	this.mTouchXBuff[0] = 0 /* 0 */;
	this.mTouchYBuff[0] = 0 /* 0 */;
	this.mTouchXReadBuff[0] = 0 /* 0 */;
	this.mTouchYReadBuff[0] = 0 /* 0 */;
	this.mTouchUpXBuff[0] = 0 /* 0 */;
	this.mTouchUpYBuff[0] = 0 /* 0 */;
	this.mTouchUpXReadBuff[0] = 0 /* 0 */;
	this.mTouchUpYReadBuff[0] = 0 /* 0 */;
	i = (i + 0x1);
	// goto :goto_0
	// :cond_0
	}
	this.mTouchMoveBuff[0] = 0 /* 0 */;
	i = 0 /* 0 */;
	while (i < 20) {
	this.mTouchMoveXBuff[0] = 0 /* 0 */;
	this.mTouchMoveYBuff[0] = 0 /* 0 */;
	this.mTouchMoveXReadBuff[0] = 0 /* 0 */;
	this.mTouchMoveYReadBuff[0] = 0 /* 0 */;
	i = (i + 0x1);
	// goto :goto_1
	// :cond_1
	}
}
// virtual methods

public boolean CHKIsTouch(){
	;
	return this.mTouch;
	//return this.mTouch;
}

public boolean CHKTouchDown(){
	;
	return this.mTouchDown;
	//return this.mTouchDown;
}

public boolean CHKTouchMove(){
	;
	return this.mTouchMove;
	//return this.mTouchMove;
}

public boolean CHKTouchUp(){
	;
	return this.mTouchUp;
	//return this.mTouchUp;
}

public void ClearTouchDown(){
	this.mTouchDownBuff[0] = 0 /* 0 */;
	int i = 0;
	while (i < 20) {
	this.mTouchXBuff[i] = 0 /* 0 */;
	this.mTouchYBuff[i] = 0 /* 0 */;
	i = (i + 0x1);
	// goto :goto_0
	// :cond_0
	}
	return;
}

public void ClearTouchMove(){
	this.mTouchMoveBuff[0] = 0 /* 0 */;
	int i = 0;
	while (i < 20) {
	this.mTouchMoveXBuff[i] = 0 /* 0 */;
	this.mTouchMoveYBuff[i] = 0 /* 0 */;
	i = (i + 0x1);
	// goto :goto_0
	// :cond_0
	}
	this.mTouchMoveReadCount = 0 /* 0 */;
	this.mTouchMoveWriteCount = 0 /* 0 */;
	return;
}

public void ClearTouchUp(){
	this.mTouchUpBuff[0] = 0 /* 0 */;
	int i = 0;
	while (i < 20) {
	this.mTouchUpXBuff[i] = 0 /* 0 */;
	this.mTouchUpYBuff[i] = 0 /* 0 */;
	i = (i + 0x1);
	// goto :goto_0
	// :cond_0
	}
	return;
}

public int GetTouchDownCount(){
	;
	return this.mTouchDownReadCount;
	//return this.mTouchDownReadCount;
}

public int GetTouchDownX(){
	;
	return this.mTouchX;
	//return this.mTouchX;
}

public int GetTouchDownX(int Count){
	if (Count < this.mTouchDownReadCount && Count >= 0) {
	;
	return this.mTouchXReadBuff[Count];
	} else {
	;
	return 0 /* 0 */;
		}
	// goto :goto_0
	// :goto_0
	//return this.mTouchXReadBuff[Count];
}

public int GetTouchDownY(){
	;
	return this.mTouchY;
	//return this.mTouchY;
}

public int GetTouchDownY(int Count){
	if (Count < this.mTouchDownReadCount && Count >= 0) {
	;
	return this.mTouchYReadBuff[Count];
	} else {
	;
	return 0 /* 0 */;
		}
	// goto :goto_0
	// :goto_0
	//return this.mTouchYReadBuff[Count];
}

public boolean GetTouchEn(){
	;
	return this.mTouchEn;
	//return this.mTouchEn;
}

public int GetTouchMoveCount(){
	;
	return this.mTouchMoveReadCount;
	//return this.mTouchMoveReadCount;
}

public int GetTouchMoveX(){
	;
	return this.mTouchMoveX;
	//return this.mTouchMoveX;
}

public int GetTouchMoveX(int Count){
	if (Count >= 0 && Count < this.mTouchMoveReadCount) {
	;
	return this.mTouchMoveXReadBuff[Count];
	} else {
	;
	return 0 /* 0 */;
		}
	// goto :goto_0
	// :goto_0
	//return this.mTouchMoveXReadBuff[Count];
}

public int GetTouchMoveY(){
	;
	return this.mTouchMoveY;
	//return this.mTouchMoveY;
}

public int GetTouchMoveY(int Count){
	if (Count >= 0 && Count < this.mTouchMoveReadCount) {
	;
	return this.mTouchMoveYReadBuff[Count];
	} else {
	;
	return 0 /* 0 */;
		}
	// goto :goto_0
	// :goto_0
	//return this.mTouchMoveYReadBuff[Count];
}

public int GetTouchUpCount(){
	;
	return this.mTouchUpReadCount;
	//return this.mTouchUpReadCount;
}

public int GetTouchUpX(){
	;
	return this.mTouchUpX;
	//return this.mTouchUpX;
}

public int GetTouchUpX(int Count){
	if (Count < this.mTouchUpReadCount && Count >= 0) {
	;
	return this.mTouchUpXReadBuff[Count];
	} else {
	;
	return 0 /* 0 */;
		}
	// goto :goto_0
	// :goto_0
	//return this.mTouchUpXReadBuff[Count];
}

public int GetTouchUpY(){
	;
	return this.mTouchUpY;
	//return this.mTouchUpY;
}

public int GetTouchUpY(int Count){
	if (Count < this.mTouchUpReadCount && Count >= 0) {
	;
	return this.mTouchUpYReadBuff[Count];
	} else {
	;
	return 0 /* 0 */;
		}
	// goto :goto_0
	// :goto_0
	//return this.mTouchUpYReadBuff[Count];
}

public void ReadTouch(){
	if (this.mTouchDownBuff[0] == 1) {
	this.mTouchDown = true;
	} else {
	this.mTouchDown = false /* 0 */;
		}
	// goto :goto_0
	// :goto_0
	this.mTouchX = this.mTouchXBuff[0];
	this.mTouchY = this.mTouchYBuff[0];
	this.mTouchDownBuff[0] = 0 /* 0 */;
	int i = 0;
	while (i < this.mTouchDownWriteCount) {
	this.mTouchXReadBuff[0] = this.mTouchXBuff[i];
	this.mTouchYReadBuff[0] = this.mTouchYBuff[i];
	i = (i + 0x1);
	// goto :goto_1
	// :cond_1
	}
	this.mTouchDownReadCount = this.mTouchDownWriteCount;
	this.mTouchDownWriteCount = 0 /* 0 */;
	if (this.mTouchMoveBuff[0] == 1) {
	this.mTouchMove = true;
	} else {
	this.mTouchMove = false /* 0 */;
		}
	// goto :goto_2
	// :goto_2
	this.mTouchMoveBuff[0] = 0 /* 0 */;
	if (this.mTouchMoveWriteCount > 0) {
	this.mTouchMoveX = this.mTouchMoveXBuff[(this.mTouchMoveWriteCount - 1)];
	this.mTouchMoveY = this.mTouchMoveYBuff[(this.mTouchMoveWriteCount - 1)];
	} else {
	this.mTouchMoveX = this.mTouchMoveXBuff[0];
	this.mTouchMoveY = this.mTouchMoveYBuff[0];
		}
	// goto :goto_3
	// :goto_3
	i = 0 /* 0 */;
	while (i < this.mTouchMoveWriteCount) {
	this.mTouchMoveXReadBuff[0] = this.mTouchMoveXBuff[i];
	this.mTouchMoveYReadBuff[0] = this.mTouchMoveYBuff[i];
	this.mTouchMoveXBuff[0] = 0 /* 0 */;
	this.mTouchMoveYBuff[0] = 0 /* 0 */;
	i = (i + 0x1);
	// goto :goto_4
	// :cond_4
	}
	this.mTouchMoveReadCount = this.mTouchMoveWriteCount;
	this.mTouchMoveWriteCount = 0 /* 0 */;
	if (this.mTouchUpBuff[0] == 1) {
	this.mTouchUp = true;
	} else {
	this.mTouchUp = false /* 0 */;
		}
	// goto :goto_5
	// :goto_5
	this.mTouchUpX = this.mTouchUpXBuff[0];
	this.mTouchUpY = this.mTouchUpYBuff[0];
	this.mTouchUpBuff[0] = 0 /* 0 */;
	i = 0 /* 0 */;
	while (i < this.mTouchUpWriteCount) {
	this.mTouchUpXReadBuff[0] = this.mTouchUpXBuff[i];
	this.mTouchUpYReadBuff[0] = this.mTouchUpYBuff[i];
	this.mTouchUpXBuff[0] = 0 /* 0 */;
	this.mTouchUpYBuff[0] = 0 /* 0 */;
	i = (i + 0x1);
	// goto :goto_6
	// :cond_6
	}
	this.mTouchUpReadCount = this.mTouchUpWriteCount;
	this.mTouchUpWriteCount = 0 /* 0 */;
	return;
	//[OTHER] end local v0           #i:I
	
}

public void SetTouchDown(int X,int Y){
	this.mTouchDownBuff[0] = 1;
	this.mTouch = true;
	if (this.mTouchDownWriteCount < 20) {
	this.mTouchXBuff[this.mTouchDownWriteCount] = X;
	this.mTouchDownWriteCount = (this.mTouchDownWriteCount + 0x1);
	this.mTouchYBuff[this.mTouchDownWriteCount] = Y;
	// :cond_0
	}
	return;
}

public void SetTouchEn(boolean touch){
	this.mTouchEn = touch;
	return;
}

public void SetTouchMove(int X,int Y){
	this.mTouchMoveBuff[0] = 1;
	this.mTouch = true;
	if (this.mTouchMoveWriteCount < 20) {
	this.mTouchMoveXBuff[this.mTouchMoveWriteCount] = X;
	this.mTouchMoveWriteCount = (this.mTouchMoveWriteCount + 0x1);
	this.mTouchMoveYBuff[this.mTouchMoveWriteCount] = Y;
	// :cond_0
	}
	return;
}

public void SetTouchUp(int X,int Y){
	this.mTouchUpBuff[0] = 1;
	this.mTouch = false /* 0 */;
	if (this.mTouchUpWriteCount < 20) {
	this.mTouchUpXBuff[this.mTouchUpWriteCount] = X;
	this.mTouchUpWriteCount = 0 /* (this.mTouchUpWriteCount + 0x1) */;
	this.mTouchUpYBuff[this.mTouchUpWriteCount] = Y;
	// :cond_0
	}
	return;
}

}