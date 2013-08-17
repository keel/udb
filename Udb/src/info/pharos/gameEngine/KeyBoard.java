package info.pharos.gameEngine;


public class KeyBoard extends Object  {

// static fields
public static final int KEYMAX = 0x5c;
// instance fields
public boolean[] CurUpKey;
public boolean[] DownKey;
public boolean[] SingleKey;
public boolean[] SteadyKey;
public boolean[] UpKey;
// direct methods

public KeyBoard(){
	super();
	;
	this.SingleKey = new boolean[92];
	;
	this.SteadyKey = new boolean[92];
	;
	this.DownKey = new boolean[92];
	;
	this.UpKey = new boolean[92];
	;
	this.CurUpKey = new boolean[92];
}
// virtual methods

public boolean CHKSingleKey(int keyCode){
	;
	return this.SingleKey[keyCode];
	//return this.SingleKey[keyCode];
}

public boolean CHKSteadyKey(int keyCode){
	;
	return this.SteadyKey[keyCode];
	//return this.SteadyKey[keyCode];
}

public boolean CHKUpKey(int keyCode){
	;
	return this.UpKey[keyCode];
	//return this.UpKey[keyCode];
}

public void ClearKeyValue(){
	int i = 0;
	while (i < 92) {
	this.SingleKey[i] = false /* 0 */;
	this.SteadyKey[i] = false /* 0 */;
	this.UpKey[i] = false /* 0 */;
	this.CurUpKey[i] = false /* 0 */;
	i = (i + 0x1);
	// goto :goto_0
	// :cond_0
	}
	return;
}

public void ReadKeyBoard(){
	int i = 0;
	while (i < 92) {
	if (this.DownKey[i] != false && this.SteadyKey[i] == false) {
	this.SingleKey[i] = true;
	} else {
	this.SingleKey[i] = false /* 0 */;
		}
	// goto :goto_1
	// :goto_1
	this.SteadyKey[i] = this.DownKey[i];
	this.UpKey[i] = this.CurUpKey[i];
	this.CurUpKey[i] = false /* 0 */;
	i = (i + 0x1);
	// goto :goto_0
	// :cond_0
	}
	return;
}

public void onKeyDown(int keyCode){
	if ((keyCode < 0 || keyCode >= 92)) {
	// :cond_0
	} else {
	this.DownKey[keyCode] = true;
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void onKeyUp(int keyCode){
	if ((keyCode < 0 || keyCode >= 92)) {
	// :cond_0
	} else {
	this.DownKey[keyCode] = false /* 0 */;
	this.CurUpKey[keyCode] = true;
		}
	// goto :goto_0
	// :goto_0
	return;
}

}
