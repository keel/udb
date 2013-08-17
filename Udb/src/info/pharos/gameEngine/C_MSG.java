package info.pharos.gameEngine;


public class C_MSG extends Object  {

// static fields
public static final int ON_COMMAND = 0x0;
public static final int ON_WM = 0x1;
// instance fields
private int HWND;
private int nCursorX;
private int nCursorY;
private int nMessage;
private long nTime;
private String sMessage;
private int wParam;
// direct methods

public C_MSG(){
	super();
	this.HWND = 0 /* 0 */;
	this.nMessage = 0 /* 0 */;
	this.nTime = 0 /* 0 */;
	this.nCursorX = 0 /* 0 */;
	this.nCursorY = 0 /* 0 */;
}
// virtual methods

public int GetCursorX(){
	;
	return this.nCursorX;
	//return this.nCursorX;
}

public int GetCursorY(){
	;
	return this.nCursorY;
	//return this.nCursorY;
}

public int GetMsgHWnd(){
	;
	return this.HWND;
	//return this.HWND;
}

public int GetMsgMessage(){
	;
	return this.nMessage;
	//return this.nMessage;
}

public long GetMsgTime(){
	;
	return this.nTime;
	//return this.nTime;
}

public String GetSMsgMessage(){
	;
	return this.sMessage;
	//return this.sMessage;
}

public int GetwParam(){
	;
	return this.wParam;
	//return this.wParam;
}

public void SetMessage(int hWnd,int message,int param){
	this.HWND = hWnd;
	this.nMessage = message;
	this.wParam = param;
	return;
}

public void SetMessage(int hWnd,int message,int param,int time,int cursorX,int cursorY){
	this.HWND = hWnd;
	this.nMessage = message;
	this.wParam = param;
	this.nTime = (long)time;
	this.nCursorX = cursorX;
	this.nCursorY = cursorY;
	return;
}

public void SetMessage(int hWnd,String message,int param){
	this.HWND = hWnd;
	this.sMessage = message;
	this.wParam = param;
	return;
}

public void SetMessage(int hWnd,String message,int param,int time,int cursorX,int cursorY){
	this.HWND = hWnd;
	this.sMessage = message;
	this.wParam = param;
	this.nTime = (long)time;
	this.nCursorX = cursorX;
	this.nCursorY = cursorY;
	return;
}

}
