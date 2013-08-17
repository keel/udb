package info.pharos.gameEngine;


public class GameMedia extends Object  {

// static fields
public static final int PLAY_LOOP = 0x1;
public static final int PLAY_ONCE = 0;
// instance fields
private int SOUNDCHANNEL;
private java.util.HashMap<Integer,Integer> gameMediaMap;
// .annotation system Ldalvik/annotation/Signature;
// value = {
// "Ljava/util/HashMap",
// "<",
// "Ljava/lang/Integer;",
// "Ljava/lang/Integer;",
// ">;"
// }
// .end annotation
private int loadStreamNum;
private android.content.Context mContext;
private int[] mPlayChannel;
private int[] mSavePlayPos;
private int maxStream;
private android.media.MediaPlayer[] mediaPlayer;
public float volume;
// direct methods

public GameMedia(android.content.Context context,int StreamNum){
	super();
	this.SOUNDCHANNEL = 0 /* 0 */;
	this.mContext = context;
	this.maxStream = StreamNum;
	;
	this.gameMediaMap = new java.util.HashMap();
	;
	this.mediaPlayer = new android.media.MediaPlayer[(this.maxStream + this.SOUNDCHANNEL)];
	;
	this.mPlayChannel = new int[(this.maxStream + this.SOUNDCHANNEL)];
	;
	this.mSavePlayPos = new int[(this.maxStream + this.SOUNDCHANNEL)];
	int i = 0;
	while (i < (this.maxStream + this.SOUNDCHANNEL)) {
	;
	this.mediaPlayer[i] = new android.media.MediaPlayer();
	this.mSavePlayPos[i] = -1;
	this.mPlayChannel[i] = -1;
	i = (i + 0x1);
	// goto :goto_0
	// :cond_0
	}
	this.loadStreamNum = 0 /* 0 */;
	this.volume = 1.0F;
}
// virtual methods

public void CH_Pause(int Channel){
	if (Channel >= this.maxStream) {
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

public void CH_Play(int Channel,int StreamID,boolean loop){
	if (Channel >= this.maxStream) {
	// :cond_0
	} else {
	this.CH_Stop(Channel);
	if (this.play(StreamID,loop)) {
	this.mPlayChannel[Channel] = StreamID;
		}
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void CH_Release(int Channel){
	if (Channel >= this.maxStream) {
	// :cond_0
	} else {
	if (this.mPlayChannel[Channel] != -1) {
	this.release(this.mPlayChannel[Channel]);
	this.mPlayChannel[Channel] = -1;
		}
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void CH_Resume(int Channel){
	if (Channel >= this.maxStream) {
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

public void CH_SetLoop(int Channel,boolean loop){
	if (Channel >= this.maxStream) {
	// :cond_0
	} else {
	if (this.mPlayChannel[Channel] != -1) {
	this.setLoop(this.mPlayChannel[Channel],loop);
		}
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void CH_Stop(int Channel){
	if (Channel >= this.maxStream) {
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

public boolean CH_isPlaying(int Channel){
	if (Channel >= this.maxStream) {
	;
	return false /* 0 */;
	} else {
	if (this.mPlayChannel[Channel] != -1) {
	return false /* 0 */;
	// goto :goto_0
	} else {
	;
	return false /* 0 */;
		}
		}
	// goto :goto_0
	// :goto_0
	//return 0;
}

public void clearMediaMap(){
	this.gameMediaMap.clear();
	this.loadStreamNum = 0 /* 0 */;
	return;
}

public float getVolume(){
	;
	return this.volume;
	//return this.volume;
}

public boolean isPlaying(int StreamID){
	if (this.gameMediaMap.isEmpty()) {
	;
	return false /* 0 */;
	} else {
	int ID = this.gameMediaMap.get(Integer.valueOf(StreamID)).intValue();
	if (ID >= this.maxStream) {
	;
	return false /* 0 */;
	// goto :goto_0
	// :cond_1
	} else if (ID != 0) {
	return false /* 0 */;
	// goto :goto_0
	} else {
	;
	return false /* 0 */;
		}
		}
	// goto :goto_0
	// :goto_0
	//return 0;
}

	public boolean load(int StreamID) {
		if (this.loadStreamNum >= this.maxStream) {
			;
			return false /* 0 */;
			// return 0;
		} else {
			android.content.res.AssetFileDescriptor afd = this.mContext
					.getResources().openRawResourceFd(StreamID);
			if (afd == null) {
				;
				return false /* 0 */;
				// goto :goto_0
			} else {
				try {
					this.mediaPlayer[this.loadStreamNum].setDataSource(
							afd.getFileDescriptor(), afd.getStartOffset(),
							afd.getLength());
					// end of try
				} catch (IllegalArgumentException e/* */) {
					e.printStackTrace();
					// }
					// } //end of catch: goto :goto_1
				} catch (IllegalStateException e/* */) {
					e.printStackTrace();
					// } //end of catch: goto :goto_1
				} catch (java.io.IOException e/* */) {
					e.printStackTrace();
				} // end of catch: goto :goto_1
					// :goto_1
				try {
					afd.close();
					// end of try
				} catch (java.io.IOException e) {

					e.printStackTrace();
				} // end of catch: goto :goto_2
					// :goto_2
				try {
					this.mediaPlayer[this.loadStreamNum].prepare();
					// end of try
				} catch (IllegalStateException e/* */) {
					e.printStackTrace();
					// } //end of catch: goto :goto_3
				} catch (java.io.IOException e/* */) {
					e.printStackTrace();
				} // end of catch: goto :goto_3
					// :goto_3
				this.gameMediaMap.put(Integer.valueOf(StreamID),
						Integer.valueOf((this.loadStreamNum + 0x1)));
				this.loadStreamNum = (this.loadStreamNum + 0x1);
				;
				return true;
			}
		}
		// goto :goto_0

		// [OTHER] end local v7 #e:Ljava/lang/IllegalArgumentException;

		// [OTHER] end local v7 #e:Ljava/lang/IllegalStateException;

		// [OTHER] end local v7 #e:Ljava/io/IOException;

		// [OTHER] end local v7 #e:Ljava/io/IOException;

		// [OTHER] end local v7 #e:Ljava/lang/IllegalStateException;

	}

public void pause(){
	int Count = this.gameMediaMap.size();
	int i = 0;
	while (i < Count) {
	if (this.mediaPlayer[i] != null && this.mediaPlayer[i].isPlaying()) {
	this.mediaPlayer[i].pause();
	this.mSavePlayPos[i] = this.mediaPlayer[i].getCurrentPosition();
	// :cond_1
	}
	i = (i + 0x1);
	// goto :goto_0
	// :cond_0
	}
	return;
}

public void pause(int StreamID){
	if (this.gameMediaMap.isEmpty()) {
	// :cond_0
	} else {
	int ID = this.gameMediaMap.get(Integer.valueOf(StreamID)).intValue();
	if (ID != 0) {
	this.mediaPlayer[(ID - 1)].pause();
	this.mSavePlayPos[(ID - 1)] = this.mediaPlayer[(ID - 1)].getCurrentPosition();
		}
		}
	// goto :goto_0
	// :goto_0
	return;
}

public boolean play(int StreamID,boolean loop){
	this.load(StreamID);
	if (this.gameMediaMap.isEmpty()) {
	;
	return false /* 0 */;
	} else {
	int ID = this.gameMediaMap.get(Integer.valueOf(StreamID)).intValue();
	if (ID >= this.maxStream) {
	;
	return false /* 0 */;
	// goto :goto_0
	// :cond_1
	} else if (ID != 0) {
	this.mediaPlayer[(ID - 1)].seekTo(0);
	this.mediaPlayer[(ID - 1)].setLooping(loop);
	this.mediaPlayer[(ID - 1)].start();
	this.mediaPlayer[(ID - 1)].setVolume(this.volume,this.volume);
	;
	return true;
	// goto :goto_0
	} else {
	;
	return false;
		}
		}
	// goto :goto_0
	// :goto_0
	//return 0;
}

public void release(){
	int i = 0;
	while (i < (this.maxStream + this.SOUNDCHANNEL)) {
	this.mediaPlayer[i].stop();
	this.mediaPlayer[i].release();
	this.mPlayChannel[i] = -1;
	i = (i + 0x1);
	// goto :goto_0
	// :cond_0
	}
	this.gameMediaMap.clear();
	this.loadStreamNum = 0 /* 0 */;
	return;
}

public void release(int StreamID){
	if (this.gameMediaMap.isEmpty()) {
	// :cond_0
	} else {
	int ID = this.gameMediaMap.get(Integer.valueOf(StreamID)).intValue();
	if (ID != 0) {
	this.mediaPlayer[(ID - 1)].stop();
	this.mediaPlayer[(ID - 1)].release();
	this.gameMediaMap.remove(Integer.valueOf(StreamID));
	if (this.loadStreamNum > 0) {
	this.loadStreamNum = (this.loadStreamNum - 1);
		}
		}
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void resume(){
	int Count = this.gameMediaMap.size();
	int i = 0;
	while (i < Count) {
	if (this.mediaPlayer[i] != null && this.mSavePlayPos[i] != -1) {
	this.mSavePlayPos[i] = -1;
	this.mediaPlayer[i].start();
	// :cond_1
	}
	i = (i + 0x1);
	// goto :goto_0
	// :cond_0
	}
	return;
}

public void resume(int StreamID){
	if (this.gameMediaMap.isEmpty()) {
	// :cond_0
	} else {
	int ID = this.gameMediaMap.get(Integer.valueOf(StreamID)).intValue();
	if (ID != 0) {
	this.mediaPlayer[(ID - 1)].start();
	if (this.mSavePlayPos[(ID - 1)] != -1) {
	this.mSavePlayPos[(ID - 1)] = -1;
	this.mediaPlayer[(ID - 1)].start();
		}
		}
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void setAllMediaVolume(float Volume){
	this.volume = 1.0F;
	return;
}

public void setAudioStreamType(int StreamID,int streamtype){
	int ID = this.gameMediaMap.get(Integer.valueOf(StreamID)).intValue();
	if (ID != 0) {
	this.mediaPlayer[(ID - 1)].setAudioStreamType(streamtype);
	// :cond_0
	}
	return;
}

public void setLoop(int StreamID,boolean loop){
	if (this.gameMediaMap.isEmpty()) {
	// :cond_0
	} else {
	int ID = this.gameMediaMap.get(Integer.valueOf(StreamID)).intValue();
	if (ID >= this.maxStream || ID == 0) {
	this.mediaPlayer[(ID - 1)].setLooping(loop);
		}
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void setMediaVolume(int StreamID,float Volume){
	this.volume = 1.0F;
	return;
}

public void stop(int StreamID){
	if (this.gameMediaMap.isEmpty()) {
	// :cond_0
	} else {
	int ID = this.gameMediaMap.get(Integer.valueOf(StreamID)).intValue();
	if (ID < this.maxStream) {
	if (ID != 0) {
	this.mediaPlayer[(ID - 1)].stop();
	this.mSavePlayPos[(ID - 1)] = -1;
	this.mediaPlayer[(ID - 1)].release();
	;
	this.mediaPlayer[(ID - 1)] = new android.media.MediaPlayer();
	this.loadStreamNum = (this.loadStreamNum - 1);
	// :cond_2
	}
	this.gameMediaMap.remove(Integer.valueOf(StreamID));
		}
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void stopAll(){
	if (this.gameMediaMap.isEmpty()) {
	} else {
	int Count = this.gameMediaMap.size();
	int i = 0;
	while (i < Count) {
	this.mediaPlayer[i].stop();
	this.mediaPlayer[i].release();
	;
	this.mediaPlayer[i] = new android.media.MediaPlayer();
	this.mSavePlayPos[i] = -1;
	i = (i + 0x1);
	// goto :goto_1
	// :cond_1
	}
	this.clearMediaMap();
		}
	// goto :goto_0
	// :goto_0
	return;
}

}
