package com.game.UnicornDash;


public class C_PUB extends Object  {

// direct methods

public C_PUB(){
	super();
}

public static double AngleToRadian(double Angle){
	double Radian = ((4614256656552045848 * Angle) / 4640537203540230144);
	return Radian;
	//return Radian;
}

public static boolean CHKIsTouch(int SXHitL,int SXHitR,int SYHitU,int SYHitD,int DACTName,int DXVal,int DYVal){
	SXHitL = 0 /* 0 */;
	//[OTHER] end local p1
	//[OTHER] end local p2
	int i = SXHitL;
	SXHitR = 4;
	while (i < SXHitR) {
	com.game.UnicornDash.C_Global.g_TouchFlag[i] = (com.game.UnicornDash.C_Global.g_TouchFlag[i] & 0x2);
	SYHitU = 2;
	if (com.game.UnicornDash.C_Global.g_TouchFlag[i] == SYHitU) {
	int Touch_X = com.game.UnicornDash.C_Global.g_Touch_X[i];
	int Touch_Y = com.game.UnicornDash.C_Global.g_Touch_Y[i];
	com.game.UnicornDash.C_OPhoneApp.cLib = com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas().CHKACTTouch(Touch_X,Touch_Y,2,2,2,2,DACTName,DXVal,DYVal);
	if (com.game.UnicornDash.C_OPhoneApp.cLib != null) {
	i = 1;
	return true /* 1 */;
		}
	// goto :goto_1
	//[OTHER] end local v1           #Touch_X:I
	//[OTHER] end local v2           #Touch_Y:I
	// :cond_1
	}
	i = (i + 0x1);
	// goto :goto_0
	// :cond_0
	}
	i = 0 /* 0 */;
	//[OTHER] end local p0           #i:I
	return i;
	
}

public static boolean CHKTouchDown(int SXHitL,int SXHitR,int SYHitU,int SYHitD,int DACTName,int DXVal,int DYVal){
	//[OTHER] end local p0
	com.game.UnicornDash.C_OPhoneApp.cTouch = com.game.UnicornDash.C_OPhoneApp.cTouch.CHKTouchDown();
	if (com.game.UnicornDash.C_OPhoneApp.cTouch != null) {
	com.game.UnicornDash.C_OPhoneApp.cTouch = null /* 0 */;
	//[OTHER] end local p1
	//[OTHER] end local p2
	int i = 0;
	SXHitR = 4;
	while (i < SXHitR) {
	com.game.UnicornDash.C_OPhoneApp.cTouch = com.game.UnicornDash.C_OPhoneApp.cTouch.getTouchDownId(i);
	SYHitU = -1;
	if (com.game.UnicornDash.C_OPhoneApp.cTouch != SYHitU) {
	int Touch_X = com.game.UnicornDash.C_OPhoneApp.cTouch.getTouchDownX(i);
	int Touch_Y = com.game.UnicornDash.C_OPhoneApp.cTouch.getTouchDownY(i);
	com.game.UnicornDash.C_OPhoneApp.cLib = com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas().CHKACTTouch(Touch_X,Touch_Y,2,2,2,2,DACTName,DXVal,DYVal);
	if (com.game.UnicornDash.C_OPhoneApp.cLib != null) {
	i = 1;
	return true /* 1 */;
		}
	// goto :goto_1
	//[OTHER] end local v1           #Touch_X:I
	//[OTHER] end local v2           #Touch_Y:I
	// :cond_2
	}
	i = (i + 0x1);
	// goto :goto_0
	// :cond_1
	}
	//[OTHER] end local p0           #i:I
	// :cond_0
	}
	i = 0 /* 0 */;
	return 0 /* 0 */;
	//return i;
	
}

public static boolean CHKTouchUp(int SXHitL,int SXHitR,int SYHitU,int SYHitD,int DACTName,int DXVal,int DYVal){
	//[OTHER] end local p0
	com.game.UnicornDash.C_OPhoneApp.cTouch = com.game.UnicornDash.C_OPhoneApp.cTouch.CHKTouchUp();
	if (com.game.UnicornDash.C_OPhoneApp.cTouch != null) {
	com.game.UnicornDash.C_OPhoneApp.cTouch = null /* 0 */;
	//[OTHER] end local p1
	//[OTHER] end local p2
	int i = 0;
	SXHitR = 4;
	while (i < SXHitR) {
	com.game.UnicornDash.C_OPhoneApp.cTouch = com.game.UnicornDash.C_OPhoneApp.cTouch.getTouchUpId(i);
	SYHitU = -1;
	if (com.game.UnicornDash.C_OPhoneApp.cTouch != SYHitU) {
	int Touch_X = com.game.UnicornDash.C_OPhoneApp.cTouch.getTouchUpX(i);
	int Touch_Y = com.game.UnicornDash.C_OPhoneApp.cTouch.getTouchUpY(i);
	com.game.UnicornDash.C_OPhoneApp.cLib = com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas().CHKACTTouch(Touch_X,Touch_Y,2,2,2,2,DACTName,DXVal,DYVal);
	if (com.game.UnicornDash.C_OPhoneApp.cLib != null) {
	i = 1;
	return true /* 1 */;
		}
	// goto :goto_1
	//[OTHER] end local v1           #Touch_X:I
	//[OTHER] end local v2           #Touch_Y:I
	// :cond_2
	}
	i = (i + 0x1);
	// goto :goto_0
	// :cond_1
	}
	//[OTHER] end local p0           #i:I
	// :cond_0
	}
	i = 0 /* 0 */;
	return 0 /* 0 */;
	//return i;
	
}

public static void CHKTouch_Input(){
	int i = 0;
	while (i < 4) {
	if ((com.game.UnicornDash.C_Global.g_TouchFlag[i] & 0x8) == 8) {
	com.game.UnicornDash.C_Global.g_TouchId[0] = -1;
	com.game.UnicornDash.C_Global.g_TouchFlag[0] = (com.game.UnicornDash.C_Global.g_TouchFlag[i] & -0x3);
	// :cond_4
	}
	com.game.UnicornDash.C_Global.g_TouchFlag[0] = (com.game.UnicornDash.C_Global.g_TouchFlag[i] & -0x5);
	com.game.UnicornDash.C_Global.g_TouchFlag[0] = (com.game.UnicornDash.C_Global.g_TouchFlag[i] & -0x9);
	i = (i + 0x1);
	// goto :goto_0
	// :cond_3
	}
	if (com.game.UnicornDash.C_OPhoneApp.cTouch.CHKTouchDown()) {
	i = 0 /* 0 */;
	while (i < 4) {
	if (com.game.UnicornDash.C_OPhoneApp.cTouch.getTouchDownId(i) != -1) {
	com.game.UnicornDash.C_Global.g_TouchId[0] = 0 /* i */;
	com.game.UnicornDash.C_Global.g_TouchFlag[0] = (com.game.UnicornDash.C_Global.g_TouchFlag[i] | 0x2);
	com.game.UnicornDash.C_Global.g_TouchFlag[0] = (com.game.UnicornDash.C_Global.g_TouchFlag[i] | 0x4);
	com.game.UnicornDash.C_Global.g_Touch_X[0] = com.game.UnicornDash.C_OPhoneApp.cTouch.getTouchDownX(i);
	com.game.UnicornDash.C_Global.g_Touch_Y[0] = com.game.UnicornDash.C_OPhoneApp.cTouch.getTouchDownY(i);
	// :cond_6
	}
	i = (i + 0x1);
	// goto :goto_1
	// :cond_5
	}
	// :cond_0
	}
	if (com.game.UnicornDash.C_OPhoneApp.cTouch.CHKTouchMove()) {
	i = 0 /* 0 */;
	while (i < 4) {
	if (com.game.UnicornDash.C_OPhoneApp.cTouch.getTouchMoveId(i) != -1 && com.game.UnicornDash.C_OPhoneApp.cTouch.getTouchMoveCount(i) > 0) {
	com.game.UnicornDash.C_Global.g_TouchId[0] = 0 /* i */;
	com.game.UnicornDash.C_Global.g_TouchFlag[0] = (com.game.UnicornDash.C_Global.g_TouchFlag[i] | 0x2);
	com.game.UnicornDash.C_Global.g_TouchFlag[0] = (com.game.UnicornDash.C_Global.g_TouchFlag[i] | 0x10);
	com.game.UnicornDash.C_Global.g_Touch_X[0] = com.game.UnicornDash.C_OPhoneApp.cTouch.getTouchMoveX(i,(com.game.UnicornDash.C_OPhoneApp.cTouch.getTouchMoveCount(i) - 1));
	com.game.UnicornDash.C_Global.g_Touch_Y[0] = com.game.UnicornDash.C_OPhoneApp.cTouch.getTouchMoveY(i,(com.game.UnicornDash.C_OPhoneApp.cTouch.getTouchMoveCount(i) - 1));
	// :cond_8
	}
	i = (i + 0x1);
	// goto/16 :goto_2
	// :cond_7
	}
	// :cond_1
	}
	if (com.game.UnicornDash.C_OPhoneApp.cTouch.CHKTouchUp()) {
	i = 0 /* 0 */;
	while (i < 4) {
	if (com.game.UnicornDash.C_OPhoneApp.cTouch.getTouchUpId(i) != -1) {
	com.game.UnicornDash.C_Global.g_TouchId[0] = 0 /* i */;
	com.game.UnicornDash.C_Global.g_TouchFlag[0] = (com.game.UnicornDash.C_Global.g_TouchFlag[i] | 0x2);
	com.game.UnicornDash.C_Global.g_TouchFlag[0] = (com.game.UnicornDash.C_Global.g_TouchFlag[i] | 0x8);
	com.game.UnicornDash.C_Global.g_Touch_X[0] = com.game.UnicornDash.C_OPhoneApp.cTouch.getTouchUpX(i);
	com.game.UnicornDash.C_Global.g_Touch_Y[0] = com.game.UnicornDash.C_OPhoneApp.cTouch.getTouchUpY(i);
	// :cond_a
	}
	i = (i + 0x1);
	// goto/16 :goto_3
	// :cond_9
	}
	// :cond_2
	}
	return;
}

public static boolean CHKisTouch(){
	int i = 0;
	while (i < 4) {
	if (com.game.UnicornDash.C_Global.g_TouchId[i] != -1) {
	;
	return true /* 1 */;
	// goto :goto_1
	} else {
	i = (i + 0x1);
		}
	// goto :goto_0
	// :cond_0
	}
	;
	return false /* 0 */;
	//return 0;
}

public static int GetActPixel(int ACTName,int XVal,int YVal,int Tar_X,int Tar_Y){
	android.graphics.Bitmap bmp = com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas().GetSpriteBitmap(ACTName);
	int DYHitU = com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas().GetSpriteYHitU(ACTName);
	int DXHitL = com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas().GetSpriteXHitL(ACTName);
	int color = 0;
	if (DYHitU != -1) {
	color = 0 /* 0 */;
	//[OTHER] end local v0           #color:I
	int color = color;
	} else {
	color = color;
	//[OTHER] end local v0           #color:I
	
		}
	// goto :goto_0
	// :goto_0
	ACTName = com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas().CHKACTTouch(Tar_X,Tar_Y,1,1,1,1,ACTName,XVal,YVal);
	//[OTHER] end local p0
	if (ACTName != 0) {
	ACTName = (Tar_X - XVal);
	ACTName = (ACTName + DXHitL);
	ACTName = (ACTName + 0x1);
	int x = ACTName;
	XVal = (Tar_Y - YVal);
	XVal = (XVal + DYHitU);
	XVal = (XVal + 0x1);
	int y = XVal;
	x = bmp.getPixel(x,y);
	//[OTHER] end local v13           #color:I
	//[OTHER] end local p1           #y:I
	int color = x;
	return color;
	} else {
	color = color;
	//[OTHER] end local v13           #color:I
	;
	return color
		}
	// goto :goto_1
	// :goto_1
	//return color;
	//[OTHER] end local p0           #color:I
	
	int XVal = y;
	
	int ACTName = color;
}

public static void InitTouch(){
	int i = 0;
	while (i < 4) {
	com.game.UnicornDash.C_Global.g_TouchId[i] = -1;
	com.game.UnicornDash.C_Global.g_TouchFlag[i] = 0 /* 0 */;
	com.game.UnicornDash.C_Global.g_Touch_X[i] = 0 /* 0 */;
	com.game.UnicornDash.C_Global.g_Touch_Y[i] = 0 /* 0 */;
	i = (i + 0x1);
	// goto :goto_0
	// :cond_0
	}
	return;
}

public static double RadianToAngle(double Radian){
	double Angle = ((4640537203540230144 * Radian) / 4614256656552045848);
	return Angle;
	//return Angle;
}

public static int Random(int Ran){
	;
	return (com.game.UnicornDash.C_Global.m_random.nextInt(Ran) % Ran);
	//return (com.game.UnicornDash.C_Global.m_random.nextInt(Ran) % Ran);
}

public static void Rate(){
	android.net.Uri uri = android.net.Uri.parse("market://details?id=com.RunnerGames.game.PumpkinsVsMonster_AD");
	;
	android.content.Intent it = new android.content.Intent("android.intent.action.VIEW",uri);
	it.addFlags(0x1000);
	com.game.UnicornDash.C_OPhoneApp.cLib.GetActivity().startActivity(it);
	return;
}

public static void ShowAdView(boolean Flag){
	com.game.UnicornDash.UnicornDash activity = (com.game.UnicornDash.UnicornDash)com.game.UnicornDash.C_OPhoneApp.cLib.GetActivity();
	if (activity != null) {
	activity.setAdVisibility(Flag);
	// :cond_0
	}
	return;
}

public static void ShowNum(int number,int x,int y,int s,int NumLenth,int Align,int[] ACTPtr,int ACT_SPD){
	number = Math.abs(number);
	switch(Align){
	// :cond_0
	case 3:  case 4: 
	return;
	case 1: 
	int Bit = com.game.UnicornDash.C_PUB.getScoreLength(number);
	y = (y + (Bit * s));
	int i = 0;
	if (i < 8) {
	if (i < NumLenth) {
	int Num = (number % 0xa);
	number = (number / 0xa);
	com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas().WriteSprite(ACTPtr[Num],x,(y - (i * s)),ACT_SPD);
	//[OTHER] end local v1           #Num:I
	// :cond_2
	}
	i = (i + 0x1);
	goto somewhere; //maybe return,continue,break: goto :goto_0
	case 5: 
	Bit = com.game.UnicornDash.C_PUB.getScoreLength(number);
	
	if (Bit < NumLenth) {
	Bit = NumLenth;
	// :cond_3
	}
	y = (y + ((s * Bit) / 0x2));
	i = 0 /* 0 */;
	
	if (i < 8) {
	if (number == 0) {
	if (i < NumLenth) {
	// :cond_4
	}
	Num = (number % 0xa);
	
	number = (number / 0xa);
	com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas().WriteSprite(ACTPtr[Num],x,(y - (i * s)),ACT_SPD);
	//[OTHER] end local v1           #Num:I
	// :cond_5
	}
	i = (i + 0x1);
	goto somewhere; //maybe return,continue,break: goto :goto_1
	case 2: 
	i = 0 /* 0 */;
	
	if (i < 8) {
	if (number == 0) {
	if (i < NumLenth) {
	// :cond_6
	}
	Num = (number % 0xa);
	
	number = (number / 0xa);
	com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas().WriteSprite(ACTPtr[Num],x,(y - (i * s)),ACT_SPD);
	//[OTHER] end local v1           #Num:I
	// :cond_7
	}
	i = (i + 0x1);
	goto somewhere; //maybe return,continue,break: goto :goto_2
	} //end of switch
	//[OTHER] end local v0           #Bit:I
	//[OTHER] end local v2           #i:I
	//[OTHER] end local v0           #Bit:I
	//[OTHER] end local v2           #i:I
	
		}
		}
		}
}

public static void ShowNum_Dec(long number,int x,int y,int s){
	long Value = Math.abs(number);
	int i = 0;
	//[OTHER] end local v2           #i:I
	int i = i;
	//[OTHER] end local v0           #Value:J
	long Value = Value;
	//[OTHER] end local v7           #Value:J
	long Value = Value;
	Value = 8;
	while (i < Value) {
	if (((Value - 0) == 0 && i != 0)) {
	// :cond_3
	int Num = 10;
	Value = (Value / 10);
	//[OTHER] end local v0           #Num:I
	com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas().WriteSprite(com.game.UnicornDash.C_DEF.TESTNUMTBL[Num],x,(y - (i * s)),7);
	//[OTHER] end local v3           #i:I
	int i = (i + 0x1);
	i = i;
	//[OTHER] end local v0           #i:I
	
		}
	// goto :goto_0
	// :cond_2
	}
	// :cond_0
	Value = 0;
	if ((number - Value) < 0) {
	//[OTHER] end local p0
	com.game.UnicornDash.C_OPhoneApp.cLib = com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas();
	Value = 16;
	Value = (i + 0x1);
	s = (s * Value);
	y = (y - s);
	s = 7;
	com.game.UnicornDash.C_OPhoneApp.cLib.WriteSprite(com.game.UnicornDash.C_DEF.TESTNUMTBL[Value],x,y,s);
	//[OTHER] end local p3
	//[OTHER] end local p4
	// :cond_1
	}
	return;
	
	
	
}

public static void ShowNum_Hex(long number,int x,int y,int s){
	int i = 0;
	while (i < 8) {
	int Value = 15;
	com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas().WriteSprite(com.game.UnicornDash.C_DEF.TESTNUMTBL[Value],x,(y - (i * s)),7);
	number = (number >> 4);
	i = (i + 0x1);
	// goto :goto_0
	// :cond_0
	}
	return;
}

public static void To_Buy(){
	android.net.Uri uri = android.net.Uri.parse("market://details?id=com.wuzla.game.UnicornDash_Paid_L");
	;
	android.content.Intent it = new android.content.Intent("android.intent.action.VIEW",uri);
	it.addFlags(0x1000);
	com.game.UnicornDash.C_OPhoneApp.cLib.GetActivity().startActivity(it);
	com.game.UnicornDash.C_PUB.InitTouch();
	return;
}

public static void To_More(){
	com.game.UnicornDash.UnicornDash activity = (com.game.UnicornDash.UnicornDash)com.game.UnicornDash.C_OPhoneApp.cLib.GetActivity();
	if (activity != null) {
	activity.clickMoreGames();
	// :cond_0
	}
	return;
}

public static int getScoreLength(int num){
	int bit = 0;
	num = Math.abs(num);
	do {
	bit = (bit + 0x1);
	num = (num / 0xa);
	} while (num == 0);
	return bit;
}

public static void setGameMode(int mGameMode){
	com.game.UnicornDash.C_Global.g_GameMode = mGameMode;
	return;
}

public static void setGameState(int mGameState){
	com.game.UnicornDash.C_Global.g_GameState = mGameState;
	return;
}

public static void setMusicStatus(){
	com.game.UnicornDash.C_Save.g_MusicStatus = com.game.UnicornDash.C_OPhoneApp.cLib.getMediaManager().GetMediaStatus();
	if (!com.game.UnicornDash.C_Save.g_MusicStatus) {
	com.game.UnicornDash.C_OPhoneApp.cLib.getMediaManager().SetMediaEnable(true);
	if (com.game.UnicornDash.C_Global.g_GameMode == 5) {
	com.game.UnicornDash.C_Media.PlayMenuMusic();
	} else {
	com.game.UnicornDash.C_Media.PlayGameMusic();
		}
	// goto :goto_0
	} else {
	com.game.UnicornDash.C_OPhoneApp.cLib.getMediaManager().CH_MediaStop(5);
	com.game.UnicornDash.C_OPhoneApp.cLib.getMediaManager().SetMediaEnable(5);
		}
	// goto :goto_0
	// :goto_0
	return;
}

public static void setSoundStatus(){
	com.game.UnicornDash.C_Save.g_SoundStatus = com.game.UnicornDash.C_OPhoneApp.cLib.getMediaManager().GetSoundStatus();
	if (!com.game.UnicornDash.C_Save.g_SoundStatus) {
	com.game.UnicornDash.C_OPhoneApp.cLib.getMediaManager().SetSoundEnable(true);
	com.game.UnicornDash.C_Media.PlaySound(5);
	} else {
	com.game.UnicornDash.C_OPhoneApp.cLib.getMediaManager().SetSoundEnable(false);
		}
	// goto :goto_0
	// :goto_0
	return;
}

public static void setVibratorStatus(){
	com.game.UnicornDash.C_Save.g_ShakeStatus = com.game.UnicornDash.Vibrator.enabled;
	if (!com.game.UnicornDash.C_Save.g_ShakeStatus) {
	com.game.UnicornDash.Vibrator.enable();
	} else {
	com.game.UnicornDash.Vibrator.disable();
		}
	// goto :goto_0
	// :goto_0
	com.game.UnicornDash.C_PUB.setVibratorTime();
	return;
}

public static void setVibratorTime(){
	com.game.UnicornDash.Vibrator.vibrate(500);
	return;
}

public static void showPauseSCR(){
	int i = 0;
	while (i < 36) {
	com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas().WriteSprite(2130837682,160,((i * 0x10) - 48),6);
	i = (i + 0x1);
	// goto :goto_0
	// :cond_0
	}
	return;
}

}