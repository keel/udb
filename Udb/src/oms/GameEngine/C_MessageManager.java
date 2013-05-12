package oms.GameEngine;


public class C_MessageManager extends Object  {

// instance fields
private int nQueueLen;
private java.util.LinkedList pMessageQueue;
// .annotation system Ldalvik/annotation/Signature;
// value = {
// "Ljava/util/LinkedList",
// "<",
// "Loms/GameEngine/C_MSG;",
// ">;"
// }
// .end annotation
// direct methods

public C_MessageManager(){
	super();
	;
	this.pMessageQueue = new java.util.LinkedList();
	this.RemoveAllMsgQueue();
}
// virtual methods

public oms.GameEngine.C_MSG GetMessageQueue(){
	if (this.nQueueLen == 0) {
	;
	return null /* 0 */;
	} else {
	oms.GameEngine.C_MSG msg = (oms.GameEngine.C_MSG)this.pMessageQueue.get((this.nQueueLen - 1));
	;
	return msg;
		}
	// goto :goto_0
	// :goto_0
	//return 0;
}

public oms.GameEngine.C_MSG GetMessageQueue(int queueIdx){
	if (queueIdx >= this.nQueueLen) {
	;
	return null /* 0 */;
	} else {
	oms.GameEngine.C_MSG msg = (oms.GameEngine.C_MSG)this.pMessageQueue.get(queueIdx);
	;
	return msg;
		}
	// goto :goto_0
	// :goto_0
	//return 0;
}

public int GetMessageQueueLength(){
	;
	return this.nQueueLen;
	//return this.nQueueLen;
}

public void RemoveAllMsgQueue(){
	if (this.pMessageQueue != null) {
	int i = 0;
	while (i < this.nQueueLen) {
	this.pMessageQueue.removeLast();
	i = (i + 0x1);
	// goto :goto_0
	// :cond_1
	}
	//[OTHER] end local v0           #i:I
	// :cond_0
	}
	this.nQueueLen = 0 /* 0 */;
	return;
	
}

public void SendMessage(int hWnd,int message,int param){
	;
	oms.GameEngine.C_MSG msg = new oms.GameEngine.C_MSG();
	msg.SetMessage(hWnd,message,param);
	this.pMessageQueue.add(msg);
	this.nQueueLen = (this.nQueueLen + 0x1);
	return;
}

public void SendMessage(int hWnd,int message,int param,int time,int cursorX,int cursorY){
	;
	oms.GameEngine.C_MSG msg = new oms.GameEngine.C_MSG();
	msg.SetMessage(hWnd,message,param,time,cursorX,cursorY);
	this.pMessageQueue.add(msg);
	this.nQueueLen = (this.nQueueLen + 0x1);
	return;
}

public void SendMessage(int hWnd,String message,int param){
	;
	oms.GameEngine.C_MSG msg = new oms.GameEngine.C_MSG();
	msg.SetMessage(hWnd,message,param);
	this.pMessageQueue.add(msg);
	this.nQueueLen = (this.nQueueLen + 0x1);
	return;
}

public void SendMessage(int hWnd,String message,int param,int time,int cursorX,int cursorY){
	;
	oms.GameEngine.C_MSG msg = new oms.GameEngine.C_MSG();
	msg.SetMessage(hWnd,message,param,time,cursorX,cursorY);
	this.pMessageQueue.add(msg);
	this.nQueueLen = (this.nQueueLen + 0x1);
	return;
}

}