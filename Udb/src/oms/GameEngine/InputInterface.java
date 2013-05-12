package oms.GameEngine;


public class InputInterface extends Object  {

// instance fields
private oms.GameEngine.KeyBoard cKeyBoard;
private oms.GameEngine.TouchPannel cTouchPannel;
public boolean nIsPause;
private int nScreenOrientation;
private int nScreenXOff;
private int nScreenYOff;
// direct methods

public InputInterface(){
	super();
	this.nScreenOrientation = 0 /* 0 */;
	;
	this.cKeyBoard = new oms.GameEngine.KeyBoard();
	;
	this.cTouchPannel = new oms.GameEngine.TouchPannel();
	this.nScreenXOff = 0 /* 0 */;
	this.nScreenYOff = 0 /* 0 */;
	this.nIsPause = false /* 0 */;
}

private int ChangeToLpX(int X,int Y){
	;
	switch(this.nScreenOrientation){
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
	//return X;
	// op;
	
}

private int ChangeToLpY(int X,int Y){
	;
	switch(this.nScreenOrientation){
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
	//return Y;
	// op;
	
}
// virtual methods

public boolean CHKIsTouch(){
	return this.cTouchPannel.CHKIsTouch();
	//return this.cTouchPannel.CHKIsTouch();
}

public boolean CHKSingleKey(int keyCode){
	return this.cKeyBoard.CHKSingleKey(keyCode);
	//return this.cKeyBoard.CHKSingleKey(keyCode);
}

public boolean CHKSteadyKey(int keyCode){
	return this.cKeyBoard.CHKSteadyKey(keyCode);
	//return this.cKeyBoard.CHKSteadyKey(keyCode);
}

public boolean CHKTouchDown(){
	return this.cTouchPannel.CHKTouchDown();
	//return this.cTouchPannel.CHKTouchDown();
}

public boolean CHKTouchMove(){
	return this.cTouchPannel.CHKTouchMove();
	//return this.cTouchPannel.CHKTouchMove();
}

public boolean CHKTouchUp(){
	return this.cTouchPannel.CHKTouchUp();
	//return this.cTouchPannel.CHKTouchUp();
}

public boolean CHKUpKey(int keyCode){
	return this.cKeyBoard.CHKUpKey(keyCode);
	//return this.cKeyBoard.CHKUpKey(keyCode);
}

public void ClearKeyValue(){
	this.cKeyBoard.ClearKeyValue();
	return;
}

public void ClearTouchDown(){
	this.cTouchPannel.ClearTouchDown();
	return;
}

public void ClearTouchMove(){
	this.cTouchPannel.ClearTouchMove();
	return;
}

public void ClearTouchUp(){
	this.cTouchPannel.ClearTouchUp();
	return;
}

public int GetTouchDownCount(){
	return this.cTouchPannel.GetTouchDownCount();
	//return this.cTouchPannel.GetTouchDownCount();
}

public int GetTouchDownX(){
	return this.cTouchPannel.GetTouchDownX();
	//return this.cTouchPannel.GetTouchDownX();
}

public int GetTouchDownX(int Count){
	return this.cTouchPannel.GetTouchDownX();
	//return this.cTouchPannel.GetTouchDownX();
}

public int GetTouchDownY(){
	return this.cTouchPannel.GetTouchDownY();
	//return this.cTouchPannel.GetTouchDownY();
}

public int GetTouchDownY(int Count){
	return this.cTouchPannel.GetTouchDownY();
	//return this.cTouchPannel.GetTouchDownY();
}

public boolean GetTouchEn(){
	;
	return this.cTouchPannel.mTouchEn;
	//return this.cTouchPannel.mTouchEn;
}

public int GetTouchMoveCount(){
	return this.cTouchPannel.GetTouchMoveCount();
	//return this.cTouchPannel.GetTouchMoveCount();
}

public int GetTouchMoveX(){
	return this.cTouchPannel.GetTouchMoveX();
	//return this.cTouchPannel.GetTouchMoveX();
}

public int GetTouchMoveX(int Count){
	return this.cTouchPannel.GetTouchMoveX(Count);
	//return this.cTouchPannel.GetTouchMoveX(Count);
}

public int GetTouchMoveY(){
	return this.cTouchPannel.GetTouchMoveY();
	//return this.cTouchPannel.GetTouchMoveY();
}

public int GetTouchMoveY(int Count){
	return this.cTouchPannel.GetTouchMoveY(Count);
	//return this.cTouchPannel.GetTouchMoveY(Count);
}

public int GetTouchUpCount(){
	return this.cTouchPannel.GetTouchUpCount();
	//return this.cTouchPannel.GetTouchUpCount();
}

public int GetTouchUpX(){
	return this.cTouchPannel.GetTouchUpX();
	//return this.cTouchPannel.GetTouchUpX();
}

public int GetTouchUpX(int Count){
	return this.cTouchPannel.GetTouchUpX();
	//return this.cTouchPannel.GetTouchUpX();
}

public int GetTouchUpY(){
	return this.cTouchPannel.GetTouchUpY();
	//return this.cTouchPannel.GetTouchUpY();
}

public int GetTouchUpY(int Count){
	return this.cTouchPannel.GetTouchUpY();
	//return this.cTouchPannel.GetTouchUpY();
}

public void ReadKeyBoard(){
	this.cKeyBoard.ReadKeyBoard();
	return;
}

public void ReadTouch(){
	this.cTouchPannel.ReadTouch();
	return;
}

public void SetScreenOffset(int XOff,int YOff){
	this.nScreenXOff = XOff;
	this.nScreenYOff = YOff;
	return;
}

public void SetScreenOrientation(int orientation){
	this.nScreenOrientation = orientation;
	return;
}

public void SetTouchDown(int X,int Y){
	X = (X - this.nScreenXOff);
	Y = (Y - this.nScreenYOff);
	int x = this.ChangeToLpX(oms.GameEngine.GameMath.convertToRealX(X),oms.GameEngine.GameMath.convertToRealY(Y));
	int y = this.ChangeToLpY(oms.GameEngine.GameMath.convertToRealX(X),oms.GameEngine.GameMath.convertToRealY(Y));
	this.cTouchPannel.SetTouchDown(x,y);
	return;
}

public void SetTouchEn(boolean touch){
	this.cTouchPannel.mTouchEn = touch;
	return;
}

public void SetTouchMove(int X,int Y){
	X = (X - this.nScreenXOff);
	Y = (Y - this.nScreenYOff);
	int x = this.ChangeToLpX(oms.GameEngine.GameMath.convertToRealX(X),oms.GameEngine.GameMath.convertToRealY(Y));
	int y = this.ChangeToLpY(oms.GameEngine.GameMath.convertToRealX(X),oms.GameEngine.GameMath.convertToRealY(Y));
	this.cTouchPannel.SetTouchMove(x,y);
	return;
}

public void SetTouchUp(int X,int Y){
	X = (X - this.nScreenXOff);
	Y = (Y - this.nScreenYOff);
	int x = this.ChangeToLpX(oms.GameEngine.GameMath.convertToRealX(X),oms.GameEngine.GameMath.convertToRealY(Y));
	int y = this.ChangeToLpY(oms.GameEngine.GameMath.convertToRealX(X),oms.GameEngine.GameMath.convertToRealY(Y));
	this.cTouchPannel.SetTouchUp(x,y);
	return;
}

public void onKeyDown(int keyCode){
	if (!this.nIsPause) {
	this.cKeyBoard.onKeyDown(keyCode);
	// :cond_0
	}
	return;
}

public void onKeyUp(int keyCode){
	if (!this.nIsPause) {
	this.cKeyBoard.onKeyUp(keyCode);
	// :cond_0
	}
	return;
}

}