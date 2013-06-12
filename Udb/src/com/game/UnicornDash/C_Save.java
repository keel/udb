package com.game.UnicornDash;


public class C_Save extends Object  {

// static fields
private static byte[] Buff = null;
private static int BuffIdx = 0x0;
private static final String FILENAME = "Unicorn_02.ini";
public static final int HIGHDISTANCE = 0x1;
public static final int HIGHSCORE = 0x1;
public static final int MUSICSTATUS = 0x1;
public static final int PLAYCOUNT = 0x1;
public static final int SHAKESTATUS = 0x1;
public static final int SOUNDSTATUS = 0x1;
public static final int USER_SIZE = 0xf;
public static int g_HighDistance;
public static int g_HighScore;
public static boolean g_MusicStatus;
public static int g_PlayCount;
public static boolean g_ShakeStatus;
public static boolean g_SoundStatus;
// direct methods

static{
	com.game.UnicornDash.C_Save.g_SoundStatus = true;
	com.game.UnicornDash.C_Save.g_MusicStatus = true;
	com.game.UnicornDash.C_Save.g_ShakeStatus = true;
	com.game.UnicornDash.C_Save.g_HighScore = 0 /* 0 */;
	com.game.UnicornDash.C_Save.g_PlayCount = 0 /* 0 */;
	com.game.UnicornDash.C_Save.g_HighDistance = 0 /* 0 */;
	;
	com.game.UnicornDash.C_Save.Buff = new byte[16];
}

public C_Save(){
	super();
}

private static boolean LoadBln(){
	com.game.UnicornDash.C_Save.BuffIdx = (com.game.UnicornDash.C_Save.BuffIdx + 0x1);
	Boolean Data;
	if (com.game.UnicornDash.C_Save.Buff[com.game.UnicornDash.C_Save.BuffIdx] == 1) {
		Data = Boolean.valueOf(true);
	} else {
	Data = Boolean.valueOf(false);
	
		}
	// goto :goto_0
	// :goto_0
	return Data;
	//return Data.booleanValue();
	//[OTHER] end local v0           #Data:Ljava/lang/Boolean;
}

private static void LoadBuff(){
	com.game.UnicornDash.C_Save.BuffIdx = 0 /* 0 */;
	com.game.UnicornDash.C_Save.g_SoundStatus = com.game.UnicornDash.C_Save.LoadBln();
	com.game.UnicornDash.C_Save.g_MusicStatus = com.game.UnicornDash.C_Save.LoadBln();
	com.game.UnicornDash.C_Save.g_ShakeStatus = com.game.UnicornDash.C_Save.LoadBln();
	com.game.UnicornDash.C_OPhoneApp.cLib.getMediaManager().SetSoundEnable(com.game.UnicornDash.C_Save.g_SoundStatus);
	com.game.UnicornDash.C_OPhoneApp.cLib.getMediaManager().SetMediaEnable(com.game.UnicornDash.C_Save.g_MusicStatus);
	if (com.game.UnicornDash.C_Save.g_ShakeStatus) {
	com.game.UnicornDash.Vibrator.enable();
	} else {
	com.game.UnicornDash.Vibrator.disable();
		}
	// goto :goto_0
	// :goto_0
	com.game.UnicornDash.C_Save.g_HighScore = com.game.UnicornDash.C_Save.LoadInt();
	com.game.UnicornDash.C_Save.g_PlayCount = com.game.UnicornDash.C_Save.LoadInt();
	com.game.UnicornDash.C_Save.g_HighDistance = com.game.UnicornDash.C_Save.LoadInt();
	return;
}

public static void LoadData(){
	;
	oms.GameEngine.DataAccess UserData = new oms.GameEngine.DataAccess();
	if (UserData.OpenInputFile(com.game.UnicornDash.C_OPhoneApp.cLib.getMContext(),"Unicorn_02.ini")) {
	UserData.read(com.game.UnicornDash.C_Save.Buff);
	com.game.UnicornDash.C_Save.checkInputFileSize(UserData.inputFileLen);
	com.game.UnicornDash.C_Save.LoadBuff();
	UserData.CloseInputFile();
	} else {
	com.game.UnicornDash.C_Save.ResetData();
		}
	// goto :goto_0
	// :goto_0
	return;
}

private static int LoadInt(){
	com.game.UnicornDash.C_Save.BuffIdx = (com.game.UnicornDash.C_Save.BuffIdx + 0x1);
	byte a = com.game.UnicornDash.C_Save.Buff[com.game.UnicornDash.C_Save.BuffIdx];
	com.game.UnicornDash.C_Save.BuffIdx = (com.game.UnicornDash.C_Save.BuffIdx + 0x1);
	byte b = com.game.UnicornDash.C_Save.Buff[com.game.UnicornDash.C_Save.BuffIdx];
	com.game.UnicornDash.C_Save.BuffIdx = (com.game.UnicornDash.C_Save.BuffIdx + 0x1);
	byte c = com.game.UnicornDash.C_Save.Buff[com.game.UnicornDash.C_Save.BuffIdx];
	com.game.UnicornDash.C_Save.BuffIdx = (com.game.UnicornDash.C_Save.BuffIdx + 0x1);
	byte d = com.game.UnicornDash.C_Save.Buff[com.game.UnicornDash.C_Save.BuffIdx];
	int Data = ((((a & 0xff) | ((b & 0xff) << 0x8)) | ((c & 0xff) << 0x10)) | ((d & 0xff) << 0x18));
	return Data;
	//return Data;
}

private static void ResetData(){
	com.game.UnicornDash.C_Save.g_SoundStatus = true;
	com.game.UnicornDash.C_Save.g_MusicStatus = true;
	com.game.UnicornDash.C_Save.g_ShakeStatus = true;
	com.game.UnicornDash.C_Save.g_HighScore = 0 /* 0 */;
	com.game.UnicornDash.C_Save.g_PlayCount = 0 /* 0 */;
	com.game.UnicornDash.C_Save.g_HighDistance = 0 /* 0 */;
	com.game.UnicornDash.C_Save.SaveBuff();
	;
	oms.GameEngine.DataAccess UserData = new oms.GameEngine.DataAccess();
	if (UserData.OpenOutFile(com.game.UnicornDash.C_OPhoneApp.cLib.getMContext(),"Unicorn_02.ini")) {
	UserData.write(com.game.UnicornDash.C_Save.Buff);
	UserData.CloseOutputFile();
	// :cond_0
	}
	return;
}

private static void SaveBln(boolean Data){
	if (Data) {
	com.game.UnicornDash.C_Save.BuffIdx = (com.game.UnicornDash.C_Save.BuffIdx + 0x1);
	com.game.UnicornDash.C_Save.Buff[com.game.UnicornDash.C_Save.BuffIdx] = 1;
	} else {
	com.game.UnicornDash.C_Save.BuffIdx = (com.game.UnicornDash.C_Save.BuffIdx + 0x1);
	com.game.UnicornDash.C_Save.Buff[com.game.UnicornDash.C_Save.BuffIdx] = 0 /* 0 */;
		}
	// goto :goto_0
	// :goto_0
	return;
}

private static void SaveBuff(){
	com.game.UnicornDash.C_Save.BuffIdx = 0 /* 0 */;
	com.game.UnicornDash.C_Save.SaveBln(com.game.UnicornDash.C_Save.g_SoundStatus);
	com.game.UnicornDash.C_Save.SaveBln(com.game.UnicornDash.C_Save.g_MusicStatus);
	com.game.UnicornDash.C_Save.SaveBln(com.game.UnicornDash.C_Save.g_ShakeStatus);
	com.game.UnicornDash.C_Save.SaveInt(com.game.UnicornDash.C_Save.g_HighScore);
	com.game.UnicornDash.C_Save.SaveInt(com.game.UnicornDash.C_Save.g_PlayCount);
	com.game.UnicornDash.C_Save.SaveInt(com.game.UnicornDash.C_Save.g_HighDistance);
	return;
}

private static void SaveInt(int Data){
	byte a = (byte)(Data & 0xff);
	byte b = (byte)((Data >> 0x8) & 0xff);
	byte c = (byte)((Data >> 0x10) & 0xff);
	byte d = (byte)((Data >> 0x18) & 0xff);
	com.game.UnicornDash.C_Save.BuffIdx = (com.game.UnicornDash.C_Save.BuffIdx + 0x1);
	com.game.UnicornDash.C_Save.Buff[com.game.UnicornDash.C_Save.BuffIdx] = a;
	com.game.UnicornDash.C_Save.BuffIdx = (com.game.UnicornDash.C_Save.BuffIdx + 0x1);
	com.game.UnicornDash.C_Save.Buff[com.game.UnicornDash.C_Save.BuffIdx] = b;
	com.game.UnicornDash.C_Save.BuffIdx = (com.game.UnicornDash.C_Save.BuffIdx + 0x1);
	com.game.UnicornDash.C_Save.Buff[com.game.UnicornDash.C_Save.BuffIdx] = c;
	com.game.UnicornDash.C_Save.BuffIdx = (com.game.UnicornDash.C_Save.BuffIdx + 0x1);
	com.game.UnicornDash.C_Save.Buff[com.game.UnicornDash.C_Save.BuffIdx] = d;
	return;
}

public static void UpdataData(){
	com.game.UnicornDash.C_Save.SaveBuff();
	;
	oms.GameEngine.DataAccess UserData = new oms.GameEngine.DataAccess();
	if (UserData.OpenOutFile(com.game.UnicornDash.C_OPhoneApp.cLib.getMContext(),"Unicorn_02.ini")) {
	UserData.write(com.game.UnicornDash.C_Save.Buff);
	UserData.CloseOutputFile();
	// :cond_0
	}
	return;
}

private static void checkInputFileSize(int CurFileSize){
	if (CurFileSize != 15) {
	while (CurFileSize < 15) {
	com.game.UnicornDash.C_Save.Buff[CurFileSize] = 0 /* 0 */;
	CurFileSize = (CurFileSize + 0x1);
	// goto :goto_0
	// :cond_1
	}
	// :cond_0
	}
	return;
}

}