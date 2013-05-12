package com.game.UnicornDash.C_OPhoneApp;


class C_GameThread extends Thread  {

// annotations
// value = Lcom/game/UnicornDash/C_OPhoneApp;
// accessFlags = 0x2
// name = "C_GameThread"
// instance fields
com.game.UnicornDash.C_UnicornDash c_UnicornDash;
final synthetic com.game.UnicornDash.C_OPhoneApp this$0 = clib;
// direct methods

public C_GameThread(com.game.UnicornDash.C_OPhoneApp clib,oms.GameEngine.C_Lib cUnicornDash,com.game.UnicornDash.C_UnicornDash $$2){
	super();
	this.c_UnicornDash = $$2;
}
// virtual methods

public void run(){
	this.c_UnicornDash.GameMain();
	System.exit(0);
	return;
}

}