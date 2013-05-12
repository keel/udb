package oms.GameEngine;


public class MediaManager extends Object  {

// static fields
public static float MaxVolume = 0.0f;
public static float SoundVolume = 0.0f;
public static final int VOLUMEDOWN = 0x1;
public static final int VOLUMEUP = 0;
public static float VolumeInc;
public static oms.GameEngine.GameMedia _GameMedia;
public static oms.GameEngine.GameSound _GameSound;
public static boolean mMediaEnable;
public static boolean mSoundEnable;
// instance fields
private android.content.Context mContext;
// direct methods

public MediaManager(android.content.Context context){
	super();
	this.mContext = context;
	oms.GameEngine.MediaManager._GameMedia = null /* 0 */;
	oms.GameEngine.MediaManager._GameSound = null /* 0 */;
	oms.GameEngine.MediaManager.mSoundEnable = true;
	oms.GameEngine.MediaManager.mMediaEnable = true;
	android.media.AudioManager mgr = (android.media.AudioManager)this.mContext.getSystemService("audio");
	oms.GameEngine.MediaManager.SoundVolume = (float)mgr.getStreamVolume(3);
	oms.GameEngine.MediaManager.MaxVolume = (float)mgr.getStreamMaxVolume(3);
	oms.GameEngine.MediaManager.VolumeInc = (oms.GameEngine.MediaManager.MaxVolume / 0x41a0);
}
// virtual methods

public int CH_GetPlayedTime(int Channel){
	return oms.GameEngine.MediaManager._GameSound.CH_GetPlayedTime(Channel);
	//return oms.GameEngine.MediaManager._GameSound.CH_GetPlayedTime(Channel);
}

public boolean CH_MediaIsPlaying(int Channel){
	return oms.GameEngine.MediaManager._GameMedia.CH_isPlaying(Channel);
	//return oms.GameEngine.MediaManager._GameMedia.CH_isPlaying(Channel);
}

public void CH_MediaPause(int Channel){
	if (!oms.GameEngine.MediaManager.mMediaEnable) {
	} else {
	oms.GameEngine.MediaManager._GameMedia.CH_Pause(Channel);
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void CH_MediaPlay(int Channel,int StreamID,boolean loop){
	if (!oms.GameEngine.MediaManager.mMediaEnable) {
	} else {
	oms.GameEngine.MediaManager._GameMedia.CH_Play(Channel,StreamID,loop);
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void CH_MediaRelease(int Channel){
	oms.GameEngine.MediaManager._GameMedia.CH_Release(Channel);
	return;
}

public void CH_MediaResume(int Channel){
	if (!oms.GameEngine.MediaManager.mMediaEnable) {
	} else {
	oms.GameEngine.MediaManager._GameMedia.CH_Resume(Channel);
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void CH_MediaSetLoop(int Channel,boolean loop){
	if (!oms.GameEngine.MediaManager.mMediaEnable) {
	} else {
	oms.GameEngine.MediaManager._GameMedia.CH_SetLoop(Channel,loop);
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void CH_MediaStop(int Channel){
	if (!oms.GameEngine.MediaManager.mMediaEnable) {
	} else {
	oms.GameEngine.MediaManager._GameMedia.CH_Stop(Channel);
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void CH_SoundPause(int Channel){
	if (!oms.GameEngine.MediaManager.mSoundEnable) {
	} else {
	oms.GameEngine.MediaManager._GameSound.CH_Pause(Channel);
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void CH_SoundPlay(int Channel,int Resid){
	if (!oms.GameEngine.MediaManager.mSoundEnable) {
	} else {
	oms.GameEngine.MediaManager._GameSound.volume = (oms.GameEngine.MediaManager.SoundVolume / oms.GameEngine.MediaManager.MaxVolume);
	oms.GameEngine.MediaManager._GameSound.CH_Play(Channel,Resid);
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void CH_SoundPlayLoop(int Channel,int Resid){
	if (!oms.GameEngine.MediaManager.mSoundEnable) {
	} else {
	oms.GameEngine.MediaManager._GameSound.CH_PlayLoop(Channel,Resid);
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void CH_SoundResume(int Channel){
	if (!oms.GameEngine.MediaManager.mSoundEnable) {
	} else {
	oms.GameEngine.MediaManager._GameSound.CH_Resume(Channel);
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void CH_SoundSetRate(int Channel,float Rate){
	if (!oms.GameEngine.MediaManager.mSoundEnable) {
	} else {
	oms.GameEngine.MediaManager._GameSound.CH_SetRate(Channel,Rate);
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void CH_SoundStop(int Channel){
	if (!oms.GameEngine.MediaManager.mSoundEnable) {
	} else {
	oms.GameEngine.MediaManager._GameSound.CH_Stop(Channel);
		}
	// goto :goto_0
	// :goto_0
	return;
}

public boolean GetMediaStatus(){
	;
	return oms.GameEngine.MediaManager.mMediaEnable;
	//return oms.GameEngine.MediaManager.mMediaEnable;
}

public int GetPlayedTime(int resID){
	return oms.GameEngine.MediaManager._GameSound.GetPlayedTime(resID);
	//return oms.GameEngine.MediaManager._GameSound.GetPlayedTime(resID);
}

public boolean GetSoundStatus(){
	;
	return oms.GameEngine.MediaManager.mSoundEnable;
	//return oms.GameEngine.MediaManager.mSoundEnable;
}

public void Init(int soundNum,int mediaNum){
	;
	oms.GameEngine.MediaManager._GameMedia = new oms.GameEngine.GameMedia(this.mContext,mediaNum);
	oms.GameEngine.MediaManager._GameMedia.setAllMediaVolume((oms.GameEngine.MediaManager.SoundVolume / oms.GameEngine.MediaManager.MaxVolume));
	;
	oms.GameEngine.MediaManager._GameSound = new oms.GameEngine.GameSound(this.mContext,soundNum);
	oms.GameEngine.MediaManager._GameSound.setAllSoundVolume((oms.GameEngine.MediaManager.SoundVolume / oms.GameEngine.MediaManager.MaxVolume));
	return;
}

public void RemoveAll(){
	if (oms.GameEngine.MediaManager._GameMedia != null) {
	oms.GameEngine.MediaManager._GameMedia.stopAll();
	// :cond_0
	}
	if (oms.GameEngine.MediaManager._GameSound != null) {
	oms.GameEngine.MediaManager._GameSound.removeAll();
	// :cond_1
	}
	return;
}

public void SetMediaEnable(boolean enable){
	oms.GameEngine.MediaManager.mMediaEnable = enable;
	return;
}

public void SetSoundEnable(boolean enable){
	oms.GameEngine.MediaManager.mSoundEnable = enable;
	return;
}

public void SetSoundStopEn(boolean status){
	if (oms.GameEngine.MediaManager._GameSound != null) {
	oms.GameEngine.MediaManager._GameSound.SetSoundStopEn(status);
	// :cond_0
	}
	return;
}

public void SetSystemVolume(int Type){
	if (Type == 0) {
	oms.GameEngine.MediaManager.SoundVolume = (oms.GameEngine.MediaManager.SoundVolume + oms.GameEngine.MediaManager.VolumeInc);
	if ((oms.GameEngine.MediaManager.SoundVolume - oms.GameEngine.MediaManager.MaxVolume) >= 0) {
	oms.GameEngine.MediaManager.SoundVolume = oms.GameEngine.MediaManager.MaxVolume;
	// :cond_0
	}
	} else {
	oms.GameEngine.MediaManager.SoundVolume = (oms.GameEngine.MediaManager.SoundVolume - oms.GameEngine.MediaManager.VolumeInc);
	if ((oms.GameEngine.MediaManager.SoundVolume - 0) <= 0) {
	oms.GameEngine.MediaManager.SoundVolume = 0 /* 0 */;
		}
		}
	// goto :goto_0
	// :goto_0
	this.setAllSoundVolume(oms.GameEngine.MediaManager.SoundVolume);
	this.setAllMediaVolume(oms.GameEngine.MediaManager.SoundVolume);
	return;
}

public void addLoopSound(int resid){
	if (oms.GameEngine.MediaManager._GameSound != null) {
	oms.GameEngine.MediaManager._GameSound.addLoopSound(resid);
	// :cond_0
	}
	return;
}

public void addSound(int resid){
	if (oms.GameEngine.MediaManager._GameSound != null) {
	oms.GameEngine.MediaManager._GameSound.addSound(resid);
	// :cond_0
	}
	return;
}

public void clearMediaMap(){
	if (oms.GameEngine.MediaManager._GameMedia != null) {
	oms.GameEngine.MediaManager._GameMedia.clearMediaMap();
	// :cond_0
	}
	return;
}

public void clearSoundPlayMap(){
	return;
}

public float getMediaVolume(){
	;
	return oms.GameEngine.MediaManager.SoundVolume;
	//return oms.GameEngine.MediaManager.SoundVolume;
}

public float getSoundVolume(){
	;
	return oms.GameEngine.MediaManager.SoundVolume;
	//return oms.GameEngine.MediaManager.SoundVolume;
}

public boolean isMediaPlaying(int StreamID){
	if (!oms.GameEngine.MediaManager.mMediaEnable) {
	;
	return false /* 0 */;
	// :cond_0
	} else if (oms.GameEngine.MediaManager._GameMedia != null) {
	return false /* 0 */;
	// goto :goto_0
	} else {
	;
	return false /* 0 */;
		}
	// goto :goto_0
	// :goto_0
	//return 0;
}

public boolean mediaLoad(int StreamID){
	if (oms.GameEngine.MediaManager._GameMedia != null) {
	return oms.GameEngine.MediaManager._GameMedia.load(StreamID);
	} else {
	;
	return false /* 0 */;
		}
	// goto :goto_0
	// :goto_0
	//return oms.GameEngine.MediaManager._GameMedia.load(StreamID);
}

public void mediaPause(int StreamID){
	if (oms.GameEngine.MediaManager._GameMedia != null && oms.GameEngine.MediaManager.mMediaEnable) {
	oms.GameEngine.MediaManager._GameMedia.pause(StreamID);
	// :cond_0
	}
	return;
}

public void mediaPlay(int StreamID,boolean loop){
	if (!oms.GameEngine.MediaManager.mMediaEnable) {
	// :cond_0
	// :cond_1
	} else if (oms.GameEngine.MediaManager._GameMedia != null) {
	oms.GameEngine.MediaManager._GameMedia.play(StreamID,loop);
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void mediaResume(int StreamID){
	if (oms.GameEngine.MediaManager._GameMedia != null && oms.GameEngine.MediaManager.mMediaEnable) {
	oms.GameEngine.MediaManager._GameMedia.resume(StreamID);
	// :cond_0
	}
	return;
}

public void mediaStop(int StreamID){
	if (!oms.GameEngine.MediaManager.mMediaEnable) {
	// :cond_0
	// :cond_1
	} else if (oms.GameEngine.MediaManager._GameMedia != null) {
	oms.GameEngine.MediaManager._GameMedia.stop(StreamID);
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void mediaStopAll(){
	if (oms.GameEngine.MediaManager._GameMedia != null) {
	oms.GameEngine.MediaManager._GameMedia.stopAll();
	// :cond_0
	}
	return;
}

public void onPause(){
	if (oms.GameEngine.MediaManager._GameMedia != null) {
	oms.GameEngine.MediaManager._GameMedia.pause();
	// :cond_0
	}
	if (oms.GameEngine.MediaManager._GameSound != null) {
	oms.GameEngine.MediaManager._GameSound.pause();
	// :cond_1
	}
	return;
}

public void onResume(){
	if (oms.GameEngine.MediaManager._GameMedia != null && oms.GameEngine.MediaManager.mMediaEnable) {
	oms.GameEngine.MediaManager._GameMedia.resume();
	// :cond_0
	}
	if (oms.GameEngine.MediaManager._GameSound != null && oms.GameEngine.MediaManager.mSoundEnable) {
	oms.GameEngine.MediaManager._GameSound.resume();
	// :cond_1
	}
	return;
}

public void release(){
	if (oms.GameEngine.MediaManager._GameMedia != null) {
	oms.GameEngine.MediaManager._GameMedia.release();
	// :cond_0
	}
	if (oms.GameEngine.MediaManager._GameSound != null) {
	oms.GameEngine.MediaManager._GameSound.release();
	// :cond_1
	}
	return;
}

public void removeSound(int resid){
	if (oms.GameEngine.MediaManager._GameSound != null) {
	oms.GameEngine.MediaManager._GameSound.removeSound(resid);
	// :cond_0
	}
	return;
}

public void setAllMediaVolume(float Volume){
	if ((Volume - oms.GameEngine.MediaManager.MaxVolume) >= 0) {
	// :cond_0
	}
	oms.GameEngine.MediaManager.SoundVolume = oms.GameEngine.MediaManager.MaxVolume;
	android.media.AudioManager mgr = (android.media.AudioManager)this.mContext.getSystemService("audio");
	mgr.setStreamVolume(3,(int)oms.GameEngine.MediaManager.MaxVolume,1);
	if (oms.GameEngine.MediaManager._GameMedia != null) {
	oms.GameEngine.MediaManager._GameMedia.setAllMediaVolume((oms.GameEngine.MediaManager.MaxVolume / oms.GameEngine.MediaManager.MaxVolume));
	// :cond_1
	}
	return;
}

public void setAllSoundVolume(float Volume){
	if ((Volume - oms.GameEngine.MediaManager.MaxVolume) >= 0) {
	// :cond_0
	}
	oms.GameEngine.MediaManager.SoundVolume = oms.GameEngine.MediaManager.MaxVolume;
	android.media.AudioManager mgr = (android.media.AudioManager)this.mContext.getSystemService("audio");
	mgr.setStreamVolume(3,(int)oms.GameEngine.MediaManager.MaxVolume,1);
	if (oms.GameEngine.MediaManager._GameSound != null) {
	oms.GameEngine.MediaManager._GameSound.setAllSoundVolume((oms.GameEngine.MediaManager.MaxVolume / oms.GameEngine.MediaManager.MaxVolume));
	// :cond_1
	}
	return;
}

public void setAudioStreamType(int StreamID,int streamtype){
	if (oms.GameEngine.MediaManager._GameMedia != null) {
	oms.GameEngine.MediaManager._GameMedia.setAudioStreamType(StreamID,streamtype);
	// :cond_0
	}
	return;
}

public void setMediaLoop(int StreamID,boolean loop){
	if (!oms.GameEngine.MediaManager.mMediaEnable) {
	// :cond_0
	// :cond_1
	} else if (oms.GameEngine.MediaManager._GameMedia != null) {
	oms.GameEngine.MediaManager._GameMedia.setLoop(StreamID,loop);
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void setMediaVolume(int StreamID,float Volume){
	if (oms.GameEngine.MediaManager._GameMedia != null) {
	oms.GameEngine.MediaManager._GameMedia.setMediaVolume(StreamID,oms.GameEngine.MediaManager.SoundVolume);
	// :cond_0
	}
	return;
}

public void setRate(int streamID,float rate){
	if (oms.GameEngine.MediaManager._GameSound != null) {
	oms.GameEngine.MediaManager._GameSound.setRate(streamID,rate);
	// :cond_0
	}
	return;
}

public void setSoundVolume(int resid,float Volume){
	oms.GameEngine.MediaManager.SoundVolume = Volume;
	if (oms.GameEngine.MediaManager._GameSound != null) {
	oms.GameEngine.MediaManager._GameSound.setSoundVolume(resid,Volume);
	// :cond_0
	}
	return;
}

public void soundPause(int resid){
	if (oms.GameEngine.MediaManager._GameSound != null && oms.GameEngine.MediaManager.mSoundEnable) {
	oms.GameEngine.MediaManager._GameSound.pause(resid);
	// :cond_0
	}
	return;
}

public void soundPlay(int resid){
	if (!oms.GameEngine.MediaManager.mSoundEnable) {
	// :cond_0
	// :cond_1
	} else if (oms.GameEngine.MediaManager._GameSound != null) {
	oms.GameEngine.MediaManager._GameSound.volume = (oms.GameEngine.MediaManager.SoundVolume / oms.GameEngine.MediaManager.MaxVolume);
	oms.GameEngine.MediaManager._GameSound.play(resid);
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void soundPlayLoop(int resid){
	if (!oms.GameEngine.MediaManager.mSoundEnable) {
	// :cond_0
	// :cond_1
	} else if (oms.GameEngine.MediaManager._GameSound != null) {
	oms.GameEngine.MediaManager._GameSound.volume = (oms.GameEngine.MediaManager.SoundVolume / oms.GameEngine.MediaManager.MaxVolume);
	oms.GameEngine.MediaManager._GameSound.playLoop(resid);
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void soundResume(int resid){
	if (oms.GameEngine.MediaManager._GameSound != null && oms.GameEngine.MediaManager.mSoundEnable) {
	oms.GameEngine.MediaManager._GameSound.resume(resid);
	// :cond_0
	}
	return;
}

public void soundStop(int resid){
	if (!oms.GameEngine.MediaManager.mSoundEnable) {
	// :cond_0
	// :cond_1
	} else if (oms.GameEngine.MediaManager._GameSound != null) {
	oms.GameEngine.MediaManager._GameSound.stop(resid);
		}
	// goto :goto_0
	// :goto_0
	return;
}

}