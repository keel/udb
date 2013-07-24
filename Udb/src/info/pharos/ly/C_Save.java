package info.pharos.ly;


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
	info.pharos.ly.C_Save.g_SoundStatus = true;
	info.pharos.ly.C_Save.g_MusicStatus = true;
	info.pharos.ly.C_Save.g_ShakeStatus = true;
	info.pharos.ly.C_Save.g_HighScore = 0 /* 0 */;
	info.pharos.ly.C_Save.g_PlayCount = 0 /* 0 */;
	info.pharos.ly.C_Save.g_HighDistance = 0 /* 0 */;
	;
	info.pharos.ly.C_Save.Buff = new byte[16];
}

public C_Save(){
	super();
}

private static boolean LoadBln(){
	//info.pharos.ly.C_Save.BuffIdx = (info.pharos.ly.C_Save.BuffIdx + 0x1);
	Boolean Data;
	if (info.pharos.ly.C_Save.Buff[info.pharos.ly.C_Save.BuffIdx++] == 1) {
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
	info.pharos.ly.C_Save.BuffIdx = 0 /* 0 */;
	info.pharos.ly.C_Save.g_SoundStatus = info.pharos.ly.C_Save.LoadBln();
	info.pharos.ly.C_Save.g_MusicStatus = info.pharos.ly.C_Save.LoadBln();
	info.pharos.ly.C_Save.g_ShakeStatus = info.pharos.ly.C_Save.LoadBln();
	info.pharos.ly.C_OPhoneApp.cLib.getMediaManager().SetSoundEnable(info.pharos.ly.C_Save.g_SoundStatus);
	info.pharos.ly.C_OPhoneApp.cLib.getMediaManager().SetMediaEnable(info.pharos.ly.C_Save.g_MusicStatus);
	if (info.pharos.ly.C_Save.g_ShakeStatus) {
	info.pharos.ly.Vibrator.enable();
	} else {
	info.pharos.ly.Vibrator.disable();
		}
	// goto :goto_0
	// :goto_0
	info.pharos.ly.C_Save.g_HighScore = info.pharos.ly.C_Save.LoadInt();
	info.pharos.ly.C_Save.g_PlayCount = info.pharos.ly.C_Save.LoadInt();
	info.pharos.ly.C_Save.g_HighDistance = info.pharos.ly.C_Save.LoadInt();
	return;
}

public static void LoadData(){
	;
	oms.GameEngine.DataAccess UserData = new oms.GameEngine.DataAccess();
	if (UserData.OpenInputFile(info.pharos.ly.C_OPhoneApp.cLib.getMContext(),FILENAME)) {
	UserData.read(info.pharos.ly.C_Save.Buff);
	info.pharos.ly.C_Save.checkInputFileSize(UserData.inputFileLen);
	info.pharos.ly.C_Save.LoadBuff();
	UserData.CloseInputFile();
	} else {
	info.pharos.ly.C_Save.ResetData();
		}
	// goto :goto_0
	// :goto_0
	return;
}

private static int LoadInt(){
	//info.pharos.ly.C_Save.BuffIdx = (info.pharos.ly.C_Save.BuffIdx + 0x1);
	byte a = info.pharos.ly.C_Save.Buff[info.pharos.ly.C_Save.BuffIdx++];
	//info.pharos.ly.C_Save.BuffIdx = (info.pharos.ly.C_Save.BuffIdx + 0x1);
	byte b = info.pharos.ly.C_Save.Buff[info.pharos.ly.C_Save.BuffIdx++];
	//info.pharos.ly.C_Save.BuffIdx = (info.pharos.ly.C_Save.BuffIdx + 0x1);
	byte c = info.pharos.ly.C_Save.Buff[info.pharos.ly.C_Save.BuffIdx++];
	//info.pharos.ly.C_Save.BuffIdx = (info.pharos.ly.C_Save.BuffIdx + 0x1);
	byte d = info.pharos.ly.C_Save.Buff[info.pharos.ly.C_Save.BuffIdx++];
	int Data = ((((a & 0xff) | ((b & 0xff) << 0x8)) | ((c & 0xff) << 0x10)) | ((d & 0xff) << 0x18));
	return Data;
	//return Data;
}

private static void ResetData(){
	info.pharos.ly.C_Save.g_SoundStatus = true;
	info.pharos.ly.C_Save.g_MusicStatus = true;
	info.pharos.ly.C_Save.g_ShakeStatus = true;
	info.pharos.ly.C_Save.g_HighScore = 0 /* 0 */;
	info.pharos.ly.C_Save.g_PlayCount = 0 /* 0 */;
	info.pharos.ly.C_Save.g_HighDistance = 0 /* 0 */;
	info.pharos.ly.C_Save.SaveBuff();
	;
	oms.GameEngine.DataAccess UserData = new oms.GameEngine.DataAccess();
	if (UserData.OpenOutFile(info.pharos.ly.C_OPhoneApp.cLib.getMContext(),FILENAME)) {
	UserData.write(info.pharos.ly.C_Save.Buff);
	UserData.CloseOutputFile();
	// :cond_0
	}
	return;
}

private static void SaveBln(boolean Data){
	if (Data) {
	//info.pharos.ly.C_Save.BuffIdx = (info.pharos.ly.C_Save.BuffIdx + 0x1);
	info.pharos.ly.C_Save.Buff[info.pharos.ly.C_Save.BuffIdx++] = 1;
	} else {
	//info.pharos.ly.C_Save.BuffIdx = (info.pharos.ly.C_Save.BuffIdx + 0x1);
	info.pharos.ly.C_Save.Buff[info.pharos.ly.C_Save.BuffIdx++] = 0 /* 0 */;
		}
	// goto :goto_0
	// :goto_0
	return;
}

private static void SaveBuff(){
	info.pharos.ly.C_Save.BuffIdx = 0 /* 0 */;
	info.pharos.ly.C_Save.SaveBln(info.pharos.ly.C_Save.g_SoundStatus);
	info.pharos.ly.C_Save.SaveBln(info.pharos.ly.C_Save.g_MusicStatus);
	info.pharos.ly.C_Save.SaveBln(info.pharos.ly.C_Save.g_ShakeStatus);
	info.pharos.ly.C_Save.SaveInt(info.pharos.ly.C_Save.g_HighScore);
	info.pharos.ly.C_Save.SaveInt(info.pharos.ly.C_Save.g_PlayCount);
	info.pharos.ly.C_Save.SaveInt(info.pharos.ly.C_Save.g_HighDistance);
	return;
}

private static void SaveInt(int Data){
	byte a = (byte)(Data & 0xff);
	byte b = (byte)((Data >> 0x8) & 0xff);
	byte c = (byte)((Data >> 0x10) & 0xff);
	byte d = (byte)((Data >> 0x18) & 0xff);
//	info.pharos.ly.C_Save.BuffIdx = (info.pharos.ly.C_Save.BuffIdx + 0x1);
	info.pharos.ly.C_Save.Buff[info.pharos.ly.C_Save.BuffIdx++] = a;
//	info.pharos.ly.C_Save.BuffIdx = (info.pharos.ly.C_Save.BuffIdx + 0x1);
	info.pharos.ly.C_Save.Buff[info.pharos.ly.C_Save.BuffIdx++] = b;
//	info.pharos.ly.C_Save.BuffIdx = (info.pharos.ly.C_Save.BuffIdx + 0x1);
	info.pharos.ly.C_Save.Buff[info.pharos.ly.C_Save.BuffIdx++] = c;
//	info.pharos.ly.C_Save.BuffIdx = (info.pharos.ly.C_Save.BuffIdx + 0x1);
	info.pharos.ly.C_Save.Buff[info.pharos.ly.C_Save.BuffIdx++] = d;
	return;
}

public static void UpdataData(){
	info.pharos.ly.C_Save.SaveBuff();
	;
	oms.GameEngine.DataAccess UserData = new oms.GameEngine.DataAccess();
	if (UserData.OpenOutFile(info.pharos.ly.C_OPhoneApp.cLib.getMContext(),FILENAME)) {
	UserData.write(info.pharos.ly.C_Save.Buff);
	UserData.CloseOutputFile();
	// :cond_0
	}
	return;
}

private static void checkInputFileSize(int CurFileSize){
	if (CurFileSize != 15) {
	while (CurFileSize < 15) {
	info.pharos.ly.C_Save.Buff[CurFileSize] = 0 /* 0 */;
	CurFileSize = (CurFileSize + 0x1);
	// goto :goto_0
	// :cond_1
	}
	// :cond_0
	}
	return;
}

}