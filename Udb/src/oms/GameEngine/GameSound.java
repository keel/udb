package oms.GameEngine;


public class GameSound extends Object  {

// annotations
// value = {
// Loms/GameEngine/GameSound$CSoundPlay;
// }
// static fields
public static final int PLAY_LOOP = 0x1;
public static final int PLAY_ONCE = 0;
// instance fields
public boolean SoundStopEn;
public oms.GameEngine.GameSound.CSoundPlay[] cSoundPlay;
public int mChannelMax;
public android.content.Context mContext;
public int mCurLoadSoundNum;
public int[] mPlayChannel;
public android.media.SoundPool soundPool;
public float volume;
// direct methods

public GameSound(android.content.Context context,int size){
	super();
	this.volume = 1.0F;
	this.SoundStopEn = true;
	this.mContext = context;
	;
	this.soundPool = new android.media.SoundPool((size + 0x1),3,0);
	this.mChannelMax = size;
	;
	this.mPlayChannel = new int[size];
	;
	this.cSoundPlay = new oms.GameEngine.GameSound.CSoundPlay[size];
	int i = 0;
	while (i < size) {
	this.mPlayChannel[i] = -1;
	;
	this.cSoundPlay[i] = new oms.GameEngine.GameSound.CSoundPlay();
	i = (i + 0x1);
	// goto :goto_0
	// :cond_0
	}
	this.mCurLoadSoundNum = 0 /* 0 */;
}

private int GetMapIdx(int resID){
	int i = 0;
	while (i < this.mChannelMax) {
	if (this.cSoundPlay[i].nResID == resID) {
	;
	return i;
	// goto :goto_1
	} else {
	i = (i + 0x1);
		}
	// goto :goto_0
	// :cond_0
	}
	;
	return -1;
	//return -1;
}
// virtual methods

public int CH_GetPlayedTime(int Channel){
	int MapIdx = this.GetMapIdx(this.mPlayChannel[Channel]);
	if (MapIdx == -1) {
	;
	return 0 /* 0 */;
	} else {
	return this.cSoundPlay[MapIdx].GetPlayedTime();
		}
	// goto :goto_0
	// :goto_0
	//return 0;
}

public void CH_Pause(int Channel){
	if (Channel > this.mChannelMax) {
	// :cond_0
	} else {
	if (this.mPlayChannel[Channel] != -1) {
	this.pause(this.mPlayChannel[Channel]);
		}
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void CH_Play(int Channel,int Resid){
	if (Channel > this.mChannelMax) {
	// :cond_0
	} else {
	int MapIdx = this.GetMapIdx(Resid);
	if (MapIdx != -1) {
	if (this.mPlayChannel[Channel] != -1) {
	int LastMapIdx = this.GetMapIdx(this.mPlayChannel[Channel]);
	if (this.SoundStopEn && this.cSoundPlay[LastMapIdx].nSteamID != -1) {
	this.soundPool.stop(this.cSoundPlay[LastMapIdx].nSteamID);
	this.soundPool.setVolume(this.cSoundPlay[LastMapIdx].nSteamID,0,0);
	this.soundPool.setLoop(this.cSoundPlay[LastMapIdx].nSteamID,-1);
	this.cSoundPlay[LastMapIdx].nPlaying = false /* 0 */;
	//[OTHER] end local v7           #LastMapIdx:I
	// :cond_2
	}
	}
	int streamID = this.soundPool.play(this.cSoundPlay[MapIdx].nLoadedID,this.volume,this.volume,0,0,1.0F);
	this.cSoundPlay[MapIdx].nSteamID = streamID;
	this.cSoundPlay[MapIdx].nLoop = false /* 0 */;
	this.cSoundPlay[MapIdx].nPlaying = true;
	this.cSoundPlay[MapIdx].Start();
	this.soundPool.setLoop(streamID,0);
	this.mPlayChannel[Channel] = Resid;
		}
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void CH_PlayLoop(int Channel,int Resid){
	if (Channel > this.mChannelMax) {
	// :cond_0
	} else {
	int MapIdx = this.GetMapIdx(Resid);
	if (MapIdx != -1) {
	if (this.mPlayChannel[Channel] != -1) {
	int LastMapIdx = this.GetMapIdx(this.mPlayChannel[Channel]);
	if (this.SoundStopEn && this.cSoundPlay[LastMapIdx].nSteamID != -1) {
	this.soundPool.stop(this.cSoundPlay[LastMapIdx].nSteamID);
	this.soundPool.setVolume(this.cSoundPlay[LastMapIdx].nSteamID,0,0);
	this.soundPool.setLoop(this.cSoundPlay[LastMapIdx].nSteamID,-1);
	this.cSoundPlay[LastMapIdx].nPlaying = false /* 0 */;
	//[OTHER] end local v7           #LastMapIdx:I
	// :cond_2
	}
	}
	int streamID = this.soundPool.play(this.cSoundPlay[MapIdx].nLoadedID,this.volume,this.volume,0,-1,1.0F);
	this.cSoundPlay[MapIdx].nSteamID = streamID;
	this.cSoundPlay[MapIdx].nLoop = true;
	this.cSoundPlay[MapIdx].nPlaying = true;
	this.cSoundPlay[MapIdx].Start();
	this.soundPool.setLoop(streamID,-1);
	this.mPlayChannel[Channel] = Resid;
		}
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void CH_Resume(int Channel){
	if (Channel > this.mChannelMax) {
	// :cond_0
	} else {
	if (this.mPlayChannel[Channel] != -1) {
	this.resume(this.mPlayChannel[Channel]);
		}
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void CH_SetRate(int Channel,float Rate){
	if (Channel > this.mChannelMax) {
	// :cond_0
	} else {
	if (this.mPlayChannel[Channel] != -1) {
	this.setRate(this.mPlayChannel[Channel],Rate);
		}
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void CH_Stop(int Channel){
	if (Channel > this.mChannelMax) {
	// :cond_0
	} else {
	if (this.mPlayChannel[Channel] != -1) {
	this.stop(this.mPlayChannel[Channel]);
	this.mPlayChannel[Channel] = -1;
		}
		}
	// goto :goto_0
	// :goto_0
	return;
}

public int GetPlayedTime(int resID){
	int MapIdx = this.GetMapIdx(resID);
	if (MapIdx == -1) {
	;
	return 0 /* 0 */;
	} else {
	return this.cSoundPlay[MapIdx].GetPlayedTime();
		}
	// goto :goto_0
	// :goto_0
	//return 0;
}

public void SetSoundStopEn(boolean status){
	this.SoundStopEn = status;
	return;
}

public void addLoopSound(int resid){
	if (this.mCurLoadSoundNum >= this.mChannelMax) {
	// :cond_0
	} else {
	if (this.GetMapIdx(resid) == -1) {
	int soundId = this.soundPool.load(this.mContext,resid,1);
	this.cSoundPlay[this.mCurLoadSoundNum].nResID = resid;
	this.cSoundPlay[this.mCurLoadSoundNum].nLoadedID = soundId;
	this.mCurLoadSoundNum = (this.mCurLoadSoundNum + 0x1);
	this.cSoundPlay[this.mCurLoadSoundNum].nLoop = true;
		}
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void addSound(int resid){
	if (this.mCurLoadSoundNum >= this.mChannelMax) {
	// :cond_0
	} else {
	if (this.GetMapIdx(resid) == -1) {
	int soundId = this.soundPool.load(this.mContext,resid,1);
	this.cSoundPlay[this.mCurLoadSoundNum].nResID = resid;
	this.cSoundPlay[this.mCurLoadSoundNum].nLoadedID = soundId;
	this.mCurLoadSoundNum = (this.mCurLoadSoundNum + 0x1);
	this.cSoundPlay[this.mCurLoadSoundNum].nLoop = false /* 0 */;
		}
		}
	// goto :goto_0
	// :goto_0
	return;
}

public float getVolume(){
	;
	return this.volume;
	//return this.volume;
}

public void pause(){
	int i = 0;
	while (i < this.mCurLoadSoundNum) {
	if (this.cSoundPlay[i].nSteamID != -1) {
	this.soundPool.setLoop(this.cSoundPlay[i].nSteamID,0);
	this.cSoundPlay[i].nPlaying = false /* 0 */;
	this.cSoundPlay[i].Pause();
	int j = 0;
	while (j < 50) {
	this.soundPool.pause(this.cSoundPlay[i].nSteamID);
	j = (j + 0x1);
	// goto :goto_1
	// :cond_2
	}
	//[OTHER] end local v1           #j:I
	// :cond_1
	}
	i = (i + 0x1);
	// goto :goto_0
	// :cond_0
	}
	return;
	
}

public void pause(int resid){
	int MapIdx = this.GetMapIdx(resid);
	if (MapIdx == -1) {
	// :cond_0
	} else {
	if (this.cSoundPlay[MapIdx].nPlaying) {
	this.soundPool.setLoop(this.cSoundPlay[MapIdx].nSteamID,0);
	this.cSoundPlay[MapIdx].nPlaying = false /* 0 */;
	this.soundPool.pause(this.cSoundPlay[MapIdx].nSteamID);
	this.cSoundPlay[MapIdx].Pause();
		}
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void play(int resid){
	int MapIdx = this.GetMapIdx(resid);
	if (MapIdx == -1) {
	// :cond_0
	} else if (this.SoundStopEn && this.cSoundPlay[MapIdx].nSteamID != -1) {
	this.soundPool.stop(this.cSoundPlay[MapIdx].nSteamID);
	this.soundPool.setVolume(this.cSoundPlay[MapIdx].nSteamID,0,0);
	this.soundPool.setLoop(this.cSoundPlay[MapIdx].nSteamID,-1);
	this.cSoundPlay[MapIdx].nPlaying = false /* 0 */;
	// :cond_1
	}
	int streamID = this.soundPool.play(this.cSoundPlay[MapIdx].nLoadedID,this.volume,this.volume,0,0,1.0F);
	this.cSoundPlay[MapIdx].nSteamID = streamID;
	this.cSoundPlay[MapIdx].nLoop = false /* 0 */;
	this.cSoundPlay[MapIdx].nPlaying = true;
	this.cSoundPlay[MapIdx].Start();
	this.soundPool.setLoop(streamID,0);
	android.util.Log.v("SoundPool",new StringBuilder("Cur Stream ID=").append(streamID).toString());
	// goto :goto_0
	// :goto_0
	return;
}

public void playLoop(int resid){
	int MapIdx = this.GetMapIdx(resid);
	if (MapIdx == -1) {
	// :cond_0
	} else if (this.SoundStopEn && this.cSoundPlay[MapIdx].nSteamID != -1) {
	this.soundPool.stop(this.cSoundPlay[MapIdx].nSteamID);
	this.soundPool.setVolume(this.cSoundPlay[MapIdx].nSteamID,0,0);
	this.soundPool.setLoop(this.cSoundPlay[MapIdx].nSteamID,-1);
	this.cSoundPlay[MapIdx].nPlaying = false /* 0 */;
	// :cond_1
	}
	int streamID = this.soundPool.play(this.cSoundPlay[MapIdx].nLoadedID,this.volume,this.volume,0,-1,1.0F);
	this.cSoundPlay[MapIdx].nSteamID = streamID;
	this.cSoundPlay[MapIdx].nLoop = true;
	this.cSoundPlay[MapIdx].nPlaying = true;
	this.cSoundPlay[MapIdx].Start();
	this.soundPool.setLoop(streamID,-1);
	// goto :goto_0
	// :goto_0
	return;
}

public void release(){
	int i = 0;
	while (i < this.mChannelMax) {
	if (this.cSoundPlay[i].nSteamID != -1 && this.cSoundPlay[i].nLoop) {
	this.soundPool.stop(this.cSoundPlay[i].nSteamID);
	this.soundPool.setLoop(this.cSoundPlay[i].nSteamID,0);
	this.soundPool.unload(this.cSoundPlay[i].nSteamID);
	this.cSoundPlay[i].nLoop = false /* 0 */;
	// :cond_1
	}
	this.cSoundPlay[i].nSteamID = -1;
	this.cSoundPlay[i].nResID = -1;
	this.mPlayChannel[i] = -1;
	this.cSoundPlay[i].nPlaying = false /* 0 */;
	i = (i + 0x1);
	// goto :goto_0
	// :cond_0
	}
	this.soundPool.release();
	this.soundPool = null /* 0 */;
	this.mCurLoadSoundNum = 0 /* 0 */;
	return;
}

public void removeAll(){
	int i = 0;
	while (i < this.mChannelMax) {
	if (this.cSoundPlay[i].nSteamID != -1 && this.cSoundPlay[i].nLoop) {
	this.soundPool.stop(this.cSoundPlay[i].nSteamID);
	this.soundPool.setLoop(this.cSoundPlay[i].nSteamID,0);
	this.soundPool.unload(this.cSoundPlay[i].nSteamID);
	this.cSoundPlay[i].nLoop = false /* 0 */;
	// :cond_1
	}
	this.cSoundPlay[i].nSteamID = -1;
	this.cSoundPlay[i].nResID = -1;
	this.mPlayChannel[i] = -1;
	this.cSoundPlay[i].nPlaying = false /* 0 */;
	i = (i + 0x1);
	// goto :goto_0
	// :cond_0
	}
	this.mCurLoadSoundNum = 0 /* 0 */;
	return;
}

public void removeSound(int resid){
	int MapIdx = this.GetMapIdx(resid);
	if (MapIdx == -1) {
	// :cond_0
	} else {
	int loadId = this.cSoundPlay[MapIdx].nLoadedID;
	if (loadId != -1) {
	if (this.cSoundPlay[MapIdx].nLoop) {
	this.soundPool.stop(this.cSoundPlay[MapIdx].nSteamID);
	// :cond_2
	}
	this.soundPool.unload(loadId);
	this.cSoundPlay[MapIdx].nLoadedID = -1;
	this.cSoundPlay[MapIdx].nResID = -1;
	this.cSoundPlay[MapIdx].nLoop = false /* 0 */;
	this.cSoundPlay[MapIdx].nSteamID = -1;
	if (this.mCurLoadSoundNum > 0) {
	this.mCurLoadSoundNum = (this.mCurLoadSoundNum - 1);
		}
		}
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void resume(){
	int i = 0;
	while (i < this.mCurLoadSoundNum) {
	if (this.cSoundPlay[i].nLoop) {
	this.soundPool.setLoop(this.cSoundPlay[i].nSteamID,-1);
	this.soundPool.resume(this.cSoundPlay[i].nSteamID);
	this.cSoundPlay[i].nPlaying = true;
	this.cSoundPlay[i].Resume();
	// :cond_1
	} else {
	if (this.cSoundPlay[i].GetPlayedTime() >= 1000 || this.cSoundPlay[i].nSteamID == -1) {
	this.soundPool.resume(this.cSoundPlay[i].nSteamID);
	this.cSoundPlay[i].Resume();
	this.cSoundPlay[i].nPlaying = true;
		}
		}
	// goto :goto_1
	// :goto_1
	i = (i + 0x1);
	// goto :goto_0
	// :cond_0
	}
	return;
}

public void resume(int resid){
	int MapIdx = this.GetMapIdx(resid);
	if (MapIdx == -1) {
	// :cond_0
	} else {
	if (this.cSoundPlay[MapIdx].nSteamID == -1 || this.cSoundPlay[MapIdx].nPlaying) {
	if (this.cSoundPlay[MapIdx].nLoop) {
	this.soundPool.setLoop(this.cSoundPlay[MapIdx].nSteamID,-1);
	// :cond_2
	}
	this.soundPool.resume(this.cSoundPlay[MapIdx].nSteamID);
	this.cSoundPlay[MapIdx].Resume();
	this.cSoundPlay[MapIdx].nPlaying = true;
		}
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void setAllSoundVolume(float Volume){
	this.volume = Volume;
	return;
}

public void setRate(int streamID,float rate){
	int MapIdx = this.GetMapIdx(streamID);
	if (MapIdx == -1) {
	// :cond_0
	} else if (((double)rate - 1.75) < 0) {
	rate = 1.75F;
	// :cond_1
	// :cond_2
	} else if (((double)rate - 2.0) > 0) {
	rate = 2.0F;
		}
	// goto :goto_1
	// :goto_1
	this.soundPool.setRate(this.cSoundPlay[MapIdx].nSteamID,rate);
	// goto :goto_0
	// :goto_0
	return;
}

public void setSoundVolume(int resid,float Volume){
	this.volume = Volume;
	return;
}

public void stop(int resid){
	if (!this.SoundStopEn) {
	// :cond_0
	} else {
	int MapIdx = this.GetMapIdx(resid);
	if (MapIdx != -1) {
	this.soundPool.setLoop(this.cSoundPlay[MapIdx].nSteamID,0);
	this.soundPool.stop(this.cSoundPlay[MapIdx].nSteamID);
	this.cSoundPlay[MapIdx].nSteamID = -1;
	this.cSoundPlay[MapIdx].nLoop = false /* 0 */;
	this.cSoundPlay[MapIdx].nPlaying = false /* 0 */;
	this.cSoundPlay[MapIdx].Stop();
		}
		}
	// goto :goto_0
	// :goto_0
	return;
}






class CSoundPlay extends Object  {

// annotations
// value = Loms/GameEngine/GameSound;
// accessFlags = 0x2
// name = "CSoundPlay"
// instance fields
public int nLoadedID;
public boolean nLoop;
public long nPlayStart;
public int nPlayedTime;
public boolean nPlaying;
public int nResID;
public int nSteamID;
//final synthetic oms.GameEngine.GameSound this$0 = $$0;
// direct methods

public CSoundPlay(){
	super();
	this.Reset();
}
// virtual methods

public int GetPlayedTime(){
	if (this.nPlayedTime == 0) {
	long curTime = System.currentTimeMillis();
	if ((curTime - this.nPlayStart) < 0) {
	curTime = (curTime + 86400000);
	// :cond_0
	}
	//[OTHER] end local v0           #curTime:J
	return (int)(curTime - this.nPlayStart);
	} else {
	;
	return this.nPlayedTime;
		}
	// goto :goto_0
	// :goto_0
}

public void Pause(){
	long curTime = System.currentTimeMillis();
	if ((curTime - this.nPlayStart) < 0) {
	curTime = (curTime + 86400000);
	// :cond_0
	}
	this.nPlayedTime = (int)(curTime - this.nPlayStart);
	return;
}

public void Reset(){
	this.nResID = 1;
	this.nSteamID = -1;
	this.nLoadedID = -1;
	this.nLoop = false /* 0 */;
	this.nPlaying = false /* 0 */;
	this.nPlayedTime = 0 /* 0 */;
	this.nPlayStart = 0 /* 0 */;
	return;
}

public void Resume(){
	long curTime = System.currentTimeMillis();
	if ((curTime - (long)this.nPlayedTime) < 0) {
	curTime = (curTime + 86400000);
	// :cond_0
	}
	this.nPlayStart = (curTime - (long)this.nPlayedTime);
	this.nPlayedTime = 0 /* 0 */;
	return;
}

public void Start(){
	this.nPlayStart = System.currentTimeMillis();
	this.nPlayedTime = 0 /* 0 */;
	return;
}

public void Stop(){
	this.nPlayStart = 0 /* 0 */;
	this.nPlayedTime = 0 /* 0 */;
	return;
}

}





}