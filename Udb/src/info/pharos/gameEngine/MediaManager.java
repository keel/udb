package info.pharos.gameEngine;


public class MediaManager extends Object  {

// static fields
public static float MaxVolume = 0.0f;
public static float SoundVolume = 0.0f;
public static final int VOLUMEDOWN = 0x1;
public static final int VOLUMEUP = 0;
public static float VolumeInc;
public static info.pharos.gameEngine.GameMedia _GameMedia;
public static info.pharos.gameEngine.GameSound _GameSound;
public static boolean mMediaEnable;
public static boolean mSoundEnable;
// instance fields
private android.content.Context mContext;
// direct methods

public MediaManager(android.content.Context context){
	super();
	this.mContext = context;
	info.pharos.gameEngine.MediaManager._GameMedia = null /* 0 */;
	info.pharos.gameEngine.MediaManager._GameSound = null /* 0 */;
	info.pharos.gameEngine.MediaManager.mSoundEnable = true;
	info.pharos.gameEngine.MediaManager.mMediaEnable = true;
	android.media.AudioManager mgr = (android.media.AudioManager)this.mContext.getSystemService("audio");
	info.pharos.gameEngine.MediaManager.SoundVolume = (float)mgr.getStreamVolume(3);
	info.pharos.gameEngine.MediaManager.MaxVolume = (float)mgr.getStreamMaxVolume(3);
	info.pharos.gameEngine.MediaManager.VolumeInc = (info.pharos.gameEngine.MediaManager.MaxVolume / 20);
}
// virtual methods

public int CH_GetPlayedTime(int Channel){
	return info.pharos.gameEngine.MediaManager._GameSound.CH_GetPlayedTime(Channel);
	//return oms.GameEngine.MediaManager._GameSound.CH_GetPlayedTime(Channel);
}

public boolean CH_MediaIsPlaying(int Channel){
	return info.pharos.gameEngine.MediaManager._GameMedia.CH_isPlaying(Channel);
	//return oms.GameEngine.MediaManager._GameMedia.CH_isPlaying(Channel);
}

public void CH_MediaPause(int Channel){
	if (!info.pharos.gameEngine.MediaManager.mMediaEnable) {
	} else {
	info.pharos.gameEngine.MediaManager._GameMedia.CH_Pause(Channel);
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void CH_MediaPlay(int Channel,int StreamID,boolean loop){
	if (!info.pharos.gameEngine.MediaManager.mMediaEnable) {
	} else {
	info.pharos.gameEngine.MediaManager._GameMedia.CH_Play(Channel,StreamID,loop);
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void CH_MediaRelease(int Channel){
	info.pharos.gameEngine.MediaManager._GameMedia.CH_Release(Channel);
	return;
}

public void CH_MediaResume(int Channel){
	if (!info.pharos.gameEngine.MediaManager.mMediaEnable) {
	} else {
	info.pharos.gameEngine.MediaManager._GameMedia.CH_Resume(Channel);
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void CH_MediaSetLoop(int Channel,boolean loop){
	if (!info.pharos.gameEngine.MediaManager.mMediaEnable) {
	} else {
	info.pharos.gameEngine.MediaManager._GameMedia.CH_SetLoop(Channel,loop);
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void CH_MediaStop(int Channel){
	if (!info.pharos.gameEngine.MediaManager.mMediaEnable) {
	} else {
	info.pharos.gameEngine.MediaManager._GameMedia.CH_Stop(Channel);
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void CH_SoundPause(int Channel){
	if (!info.pharos.gameEngine.MediaManager.mSoundEnable) {
	} else {
	info.pharos.gameEngine.MediaManager._GameSound.CH_Pause(Channel);
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void CH_SoundPlay(int Channel,int Resid){
	if (!info.pharos.gameEngine.MediaManager.mSoundEnable) {
	} else {
	info.pharos.gameEngine.MediaManager._GameSound.volume = (info.pharos.gameEngine.MediaManager.SoundVolume / info.pharos.gameEngine.MediaManager.MaxVolume);
	info.pharos.gameEngine.MediaManager._GameSound.CH_Play(Channel,Resid);
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void CH_SoundPlayLoop(int Channel,int Resid){
	if (!info.pharos.gameEngine.MediaManager.mSoundEnable) {
	} else {
	info.pharos.gameEngine.MediaManager._GameSound.CH_PlayLoop(Channel,Resid);
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void CH_SoundResume(int Channel){
	if (!info.pharos.gameEngine.MediaManager.mSoundEnable) {
	} else {
	info.pharos.gameEngine.MediaManager._GameSound.CH_Resume(Channel);
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void CH_SoundSetRate(int Channel,float Rate){
	if (!info.pharos.gameEngine.MediaManager.mSoundEnable) {
	} else {
	info.pharos.gameEngine.MediaManager._GameSound.CH_SetRate(Channel,Rate);
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void CH_SoundStop(int Channel){
	if (!info.pharos.gameEngine.MediaManager.mSoundEnable) {
	} else {
	info.pharos.gameEngine.MediaManager._GameSound.CH_Stop(Channel);
		}
	// goto :goto_0
	// :goto_0
	return;
}

public boolean GetMediaStatus(){
	;
	return info.pharos.gameEngine.MediaManager.mMediaEnable;
	//return oms.GameEngine.MediaManager.mMediaEnable;
}

public int GetPlayedTime(int resID){
	return info.pharos.gameEngine.MediaManager._GameSound.GetPlayedTime(resID);
	//return oms.GameEngine.MediaManager._GameSound.GetPlayedTime(resID);
}

public boolean GetSoundStatus(){
	;
	return info.pharos.gameEngine.MediaManager.mSoundEnable;
	//return oms.GameEngine.MediaManager.mSoundEnable;
}

public void Init(int soundNum,int mediaNum){
	;
	info.pharos.gameEngine.MediaManager._GameMedia = new info.pharos.gameEngine.GameMedia(this.mContext,mediaNum);
	info.pharos.gameEngine.MediaManager._GameMedia.setAllMediaVolume((info.pharos.gameEngine.MediaManager.SoundVolume / info.pharos.gameEngine.MediaManager.MaxVolume));
	;
	info.pharos.gameEngine.MediaManager._GameSound = new info.pharos.gameEngine.GameSound(this.mContext,soundNum);
	info.pharos.gameEngine.MediaManager._GameSound.setAllSoundVolume((info.pharos.gameEngine.MediaManager.SoundVolume / info.pharos.gameEngine.MediaManager.MaxVolume));
	return;
}

public void RemoveAll(){
	if (info.pharos.gameEngine.MediaManager._GameMedia != null) {
	info.pharos.gameEngine.MediaManager._GameMedia.stopAll();
	// :cond_0
	}
	if (info.pharos.gameEngine.MediaManager._GameSound != null) {
	info.pharos.gameEngine.MediaManager._GameSound.removeAll();
	// :cond_1
	}
	return;
}

public void SetMediaEnable(boolean enable){
	info.pharos.gameEngine.MediaManager.mMediaEnable = enable;
	return;
}

public void SetSoundEnable(boolean enable){
	info.pharos.gameEngine.MediaManager.mSoundEnable = enable;
	return;
}

public void SetSoundStopEn(boolean status){
	if (info.pharos.gameEngine.MediaManager._GameSound != null) {
	info.pharos.gameEngine.MediaManager._GameSound.SetSoundStopEn(status);
	// :cond_0
	}
	return;
}

public void SetSystemVolume(int Type){
		if (Type == 0) {
			info.pharos.gameEngine.MediaManager.SoundVolume = (info.pharos.gameEngine.MediaManager.SoundVolume + info.pharos.gameEngine.MediaManager.VolumeInc);
			if ((info.pharos.gameEngine.MediaManager.SoundVolume - info.pharos.gameEngine.MediaManager.MaxVolume) >= 0) {
				info.pharos.gameEngine.MediaManager.SoundVolume = info.pharos.gameEngine.MediaManager.MaxVolume;
				// :cond_0
			}
		} else {
			info.pharos.gameEngine.MediaManager.SoundVolume = (info.pharos.gameEngine.MediaManager.SoundVolume - info.pharos.gameEngine.MediaManager.VolumeInc);
			if ((info.pharos.gameEngine.MediaManager.SoundVolume - 0) <= 0) {
				info.pharos.gameEngine.MediaManager.SoundVolume = 0 /* 0 */;
			}
		}
	// goto :goto_0
	// :goto_0
	this.setAllSoundVolume(info.pharos.gameEngine.MediaManager.SoundVolume);
	this.setAllMediaVolume(info.pharos.gameEngine.MediaManager.SoundVolume);
	return;
}

public void addLoopSound(int resid){
	if (info.pharos.gameEngine.MediaManager._GameSound != null) {
	info.pharos.gameEngine.MediaManager._GameSound.addLoopSound(resid);
	// :cond_0
	}
	return;
}

public void addSound(int resid){
	if (info.pharos.gameEngine.MediaManager._GameSound != null) {
	info.pharos.gameEngine.MediaManager._GameSound.addSound(resid);
	// :cond_0
	}
	return;
}

public void clearMediaMap(){
	if (info.pharos.gameEngine.MediaManager._GameMedia != null) {
	info.pharos.gameEngine.MediaManager._GameMedia.clearMediaMap();
	// :cond_0
	}
	return;
}

public void clearSoundPlayMap(){
	return;
}

public float getMediaVolume(){
	;
	return info.pharos.gameEngine.MediaManager.SoundVolume;
	//return oms.GameEngine.MediaManager.SoundVolume;
}

public float getSoundVolume(){
	;
	return info.pharos.gameEngine.MediaManager.SoundVolume;
	//return oms.GameEngine.MediaManager.SoundVolume;
}

public boolean isMediaPlaying(int StreamID){
	if (!info.pharos.gameEngine.MediaManager.mMediaEnable) {
	;
	return false /* 0 */;
	// :cond_0
	} else if (info.pharos.gameEngine.MediaManager._GameMedia != null) {
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
	if (info.pharos.gameEngine.MediaManager._GameMedia != null) {
	return info.pharos.gameEngine.MediaManager._GameMedia.load(StreamID);
	} else {
	;
	return false /* 0 */;
		}
	// goto :goto_0
	// :goto_0
	//return oms.GameEngine.MediaManager._GameMedia.load(StreamID);
}

public void mediaPause(int StreamID){
	if (info.pharos.gameEngine.MediaManager._GameMedia != null && info.pharos.gameEngine.MediaManager.mMediaEnable) {
	info.pharos.gameEngine.MediaManager._GameMedia.pause(StreamID);
	// :cond_0
	}
	return;
}

public void mediaPlay(int StreamID,boolean loop){
	if (!info.pharos.gameEngine.MediaManager.mMediaEnable) {
	// :cond_0
	// :cond_1
	} else if (info.pharos.gameEngine.MediaManager._GameMedia != null) {
	info.pharos.gameEngine.MediaManager._GameMedia.play(StreamID,loop);
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void mediaResume(int StreamID){
	if (info.pharos.gameEngine.MediaManager._GameMedia != null && info.pharos.gameEngine.MediaManager.mMediaEnable) {
	info.pharos.gameEngine.MediaManager._GameMedia.resume(StreamID);
	// :cond_0
	}
	return;
}

public void mediaStop(int StreamID){
	if (!info.pharos.gameEngine.MediaManager.mMediaEnable) {
	// :cond_0
	// :cond_1
	} else if (info.pharos.gameEngine.MediaManager._GameMedia != null) {
	info.pharos.gameEngine.MediaManager._GameMedia.stop(StreamID);
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void mediaStopAll(){
	if (info.pharos.gameEngine.MediaManager._GameMedia != null) {
	info.pharos.gameEngine.MediaManager._GameMedia.stopAll();
	// :cond_0
	}
	return;
}

public void onPause(){
	if (info.pharos.gameEngine.MediaManager._GameMedia != null) {
	info.pharos.gameEngine.MediaManager._GameMedia.pause();
	// :cond_0
	}
	if (info.pharos.gameEngine.MediaManager._GameSound != null) {
	info.pharos.gameEngine.MediaManager._GameSound.pause();
	// :cond_1
	}
	return;
}

public void onResume(){
	if (info.pharos.gameEngine.MediaManager._GameMedia != null && info.pharos.gameEngine.MediaManager.mMediaEnable) {
	info.pharos.gameEngine.MediaManager._GameMedia.resume();
	// :cond_0
	}
	if (info.pharos.gameEngine.MediaManager._GameSound != null && info.pharos.gameEngine.MediaManager.mSoundEnable) {
	info.pharos.gameEngine.MediaManager._GameSound.resume();
	// :cond_1
	}
	return;
}

public void release(){
	if (info.pharos.gameEngine.MediaManager._GameMedia != null) {
	info.pharos.gameEngine.MediaManager._GameMedia.release();
	// :cond_0
	}
	if (info.pharos.gameEngine.MediaManager._GameSound != null) {
	info.pharos.gameEngine.MediaManager._GameSound.release();
	// :cond_1
	}
	return;
}

public void removeSound(int resid){
	if (info.pharos.gameEngine.MediaManager._GameSound != null) {
	info.pharos.gameEngine.MediaManager._GameSound.removeSound(resid);
	// :cond_0
	}
	return;
}

public void setAllMediaVolume(float Volume){
	if ((Volume - info.pharos.gameEngine.MediaManager.MaxVolume) >= 0) {
	// :cond_0
		info.pharos.gameEngine.MediaManager.SoundVolume = info.pharos.gameEngine.MediaManager.MaxVolume;
	}
	android.media.AudioManager mgr = (android.media.AudioManager)this.mContext.getSystemService("audio");
	mgr.setStreamVolume(3,(int)info.pharos.gameEngine.MediaManager.SoundVolume,1);
	if (info.pharos.gameEngine.MediaManager._GameMedia != null) {
	info.pharos.gameEngine.MediaManager._GameMedia.setAllMediaVolume((info.pharos.gameEngine.MediaManager.SoundVolume / info.pharos.gameEngine.MediaManager.MaxVolume));
	// :cond_1
	}
	return;
}

public void setAllSoundVolume(float Volume){
	if ((Volume - info.pharos.gameEngine.MediaManager.MaxVolume) >= 0) {
	// :cond_0
		info.pharos.gameEngine.MediaManager.SoundVolume = info.pharos.gameEngine.MediaManager.MaxVolume;
	}
	android.media.AudioManager mgr = (android.media.AudioManager)this.mContext.getSystemService("audio");
	mgr.setStreamVolume(3,(int)info.pharos.gameEngine.MediaManager.SoundVolume,1);
	if (info.pharos.gameEngine.MediaManager._GameSound != null) {
	info.pharos.gameEngine.MediaManager._GameSound.setAllSoundVolume((info.pharos.gameEngine.MediaManager.SoundVolume / info.pharos.gameEngine.MediaManager.MaxVolume));
	// :cond_1
	}
	return;
}

public void setAudioStreamType(int StreamID,int streamtype){
	if (info.pharos.gameEngine.MediaManager._GameMedia != null) {
	info.pharos.gameEngine.MediaManager._GameMedia.setAudioStreamType(StreamID,streamtype);
	// :cond_0
	}
	return;
}

public void setMediaLoop(int StreamID,boolean loop){
	if (!info.pharos.gameEngine.MediaManager.mMediaEnable) {
	// :cond_0
	// :cond_1
	} else if (info.pharos.gameEngine.MediaManager._GameMedia != null) {
	info.pharos.gameEngine.MediaManager._GameMedia.setLoop(StreamID,loop);
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void setMediaVolume(int StreamID,float Volume){
	if (info.pharos.gameEngine.MediaManager._GameMedia != null) {
	info.pharos.gameEngine.MediaManager._GameMedia.setMediaVolume(StreamID,info.pharos.gameEngine.MediaManager.SoundVolume);
	// :cond_0
	}
	return;
}

public void setRate(int streamID,float rate){
	if (info.pharos.gameEngine.MediaManager._GameSound != null) {
	info.pharos.gameEngine.MediaManager._GameSound.setRate(streamID,rate);
	// :cond_0
	}
	return;
}

public void setSoundVolume(int resid,float Volume){
	info.pharos.gameEngine.MediaManager.SoundVolume = Volume;
	if (info.pharos.gameEngine.MediaManager._GameSound != null) {
	info.pharos.gameEngine.MediaManager._GameSound.setSoundVolume(resid,Volume);
	// :cond_0
	}
	return;
}

public void soundPause(int resid){
	if (info.pharos.gameEngine.MediaManager._GameSound != null && info.pharos.gameEngine.MediaManager.mSoundEnable) {
	info.pharos.gameEngine.MediaManager._GameSound.pause(resid);
	// :cond_0
	}
	return;
}

public void soundPlay(int resid){
	if (!info.pharos.gameEngine.MediaManager.mSoundEnable) {
	// :cond_0
	// :cond_1
	} else if (info.pharos.gameEngine.MediaManager._GameSound != null) {
	info.pharos.gameEngine.MediaManager._GameSound.volume = (info.pharos.gameEngine.MediaManager.SoundVolume / info.pharos.gameEngine.MediaManager.MaxVolume);
	info.pharos.gameEngine.MediaManager._GameSound.play(resid);
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void soundPlayLoop(int resid){
	if (!info.pharos.gameEngine.MediaManager.mSoundEnable) {
	// :cond_0
	// :cond_1
	} else if (info.pharos.gameEngine.MediaManager._GameSound != null) {
	info.pharos.gameEngine.MediaManager._GameSound.volume = (info.pharos.gameEngine.MediaManager.SoundVolume / info.pharos.gameEngine.MediaManager.MaxVolume);
	info.pharos.gameEngine.MediaManager._GameSound.playLoop(resid);
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void soundResume(int resid){
	if (info.pharos.gameEngine.MediaManager._GameSound != null && info.pharos.gameEngine.MediaManager.mSoundEnable) {
	info.pharos.gameEngine.MediaManager._GameSound.resume(resid);
	// :cond_0
	}
	return;
}

public void soundStop(int resid){
	if (!info.pharos.gameEngine.MediaManager.mSoundEnable) {
	// :cond_0
	// :cond_1
	} else if (info.pharos.gameEngine.MediaManager._GameSound != null) {
	info.pharos.gameEngine.MediaManager._GameSound.stop(resid);
		}
	// goto :goto_0
	// :goto_0
	return;
}

}