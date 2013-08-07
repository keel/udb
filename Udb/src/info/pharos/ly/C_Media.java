package info.pharos.ly;


public class C_Media extends Object  {

// static fields
public static final int BGM_MUSICCHANNEL = 0x0;
public static final int SFX_BLAST = 0x1;
public static final int SFX_CLICK = 0x5;
public static final int SFX_COUNT = 0x7;
public static final int SFX_DASH = 0x0;
public static final int SFX_DORSE = 0x2;
public static final int SFX_JUMP = 0x4;
public static final int SFX_PRISE = 0x6;
public static final int SFX_RUN = 0x3;
public static final int[] SoundPlayChannel;
public static final boolean[] SoundPlayMode = {true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true};
public static final int[] SoundResIDTBL = {0x7f040003,0x7f040000,0x7f040004,0x7f040009,0x7f040005,0x7f040001,0x7f040008,0x7f040002,0x0000ffff};
public static int m_AnimalType;
public static int m_FIXControl;
// direct methods

static{
	info.pharos.ly.C_Media.m_FIXControl = 0 /* 0 */;
	info.pharos.ly.C_Media.m_AnimalType = 0 /* 0 */;
	;
	;
	int[] v0v123 = new int[10];
	v0v123[1] = 1;
	v0v123[2] = 2;
	v0v123[3] = 3;
	v0v123[4] = 4;
	v0v123[5] = 5;
	v0v123[6] = 6;
	v0v123[7] = 7;
	v0v123[8] = 8;
	v0v123[9] = 9;
	SoundPlayChannel = v0v123;
	// op;
	;
	;
}

public C_Media(info.pharos.gameEngine.C_Lib clib){
	super();
	info.pharos.ly.C_GameMain.cLib = clib;
}

public static void InitMedia(){
	info.pharos.ly.C_Media.m_FIXControl = 0 /* 0 */;
	return;
}

public static void Initialize(){
	int i = 0;
	while (info.pharos.ly.C_Media.SoundResIDTBL[i] != 65535) {
	//[OTHER] end local v0           #i:I
	info.pharos.ly.C_GameMain.cLib.getMediaManager().addSound(info.pharos.ly.C_Media.SoundResIDTBL[i]);
	i = (i + 0x1);
	//i = i;
	//[OTHER] end local v1           #i:I
	
	// goto :goto_0
	// :cond_0
	}
	return;
}

public static void MediaContrl(){
	return;
}

public static void PlayGameMusic(){
	if (!info.pharos.ly.C_GameMain.cLib.getMediaManager().CH_MediaIsPlaying(0)) {
	info.pharos.ly.C_GameMain.cLib.getMediaManager().CH_MediaPlay(0,2130968582,true);
	// :cond_0
	}
	return;
}

public static void PlayMenuMusic(){
	if (!info.pharos.ly.C_GameMain.cLib.getMediaManager().CH_MediaIsPlaying(0)) {
	info.pharos.ly.C_GameMain.cLib.getMediaManager().CH_MediaPlay(0,2130968582,true);
	// :cond_0
	}
	return;
}

public static void PlaySound(int SoundResID){
	if (info.pharos.ly.C_Media.SoundPlayMode[SoundResID] != false) {
	info.pharos.ly.C_GameMain.cLib.getMediaManager().CH_SoundPlay(info.pharos.ly.C_Media.SoundPlayChannel[SoundResID],info.pharos.ly.C_Media.SoundResIDTBL[SoundResID]);
	// :cond_0
	}
	return;
}

public static void SetMediaCrl(int fix_Flag){
	info.pharos.ly.C_Media.m_FIXControl = (info.pharos.ly.C_Media.m_FIXControl | fix_Flag);
	return;
}

public static void StopAllSound(){
	int i = 0;
	while (info.pharos.ly.C_Media.SoundResIDTBL[i] != 65535) {
	//[OTHER] end local v0           #i:I
	 i = (i + 0x1);
	info.pharos.ly.C_GameMain.cLib.getMediaManager().soundStop(info.pharos.ly.C_Media.SoundResIDTBL[i]);
	//i = i;
	//[OTHER] end local v1           #i:I
	
	// goto :goto_0
	// :cond_0
	}
	return;
}

public static void StopSound(int SoundResID){
	info.pharos.ly.C_GameMain.cLib.getMediaManager().CH_SoundStop(info.pharos.ly.C_Media.SoundPlayChannel[SoundResID]);
	return;
}

}