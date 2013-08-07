package info.pharos.gameEngine;


public class SoundMeter extends Object  {

// static fields
private static final double EMA_FILTER = 0.6;
private static final boolean FILE_W = true;
// instance fields
private double mEMA;
private android.media.MediaRecorder mRecorder;
private String mStrFilePath;
// direct methods

public SoundMeter(){
	super();
	this.mStrFilePath = null /* 0 */;
	this.mRecorder = null /* 0 */;
	this.mEMA = 0 /* 0 */;
}
// virtual methods

public double getAmplitude(){
	if (this.mRecorder != null) {
	;
	return (double)this.mRecorder.getMaxAmplitude();
	} else {
	;
	return 0 /* 0 */;
		}
	// goto :goto_0
	// :goto_0
	//return (double)this.mRecorder.getMaxAmplitude();
}

public double getAmplitudeEMA(){

	
    this.mEMA = (0.6D * this.getAmplitude() + 0.4D * this.mEMA);
    return this.mEMA;

	//return this.mEMA;ßß
}

public void reset(){
	this.stop();
	this.start();
	return;
}

public void start(){
	if (this.mRecorder == null) {
	;
	this.mRecorder = new android.media.MediaRecorder();
	this.mRecorder.setAudioSource(1);
	this.mRecorder.setOutputFormat(1);
	this.mRecorder.setAudioEncoder(1);
	java.io.File audiofile = null;
	java.io.File sampleDir = android.os.Environment.getExternalStorageDirectory();
	try {
		audiofile = java.io.File.createTempFile("temp",".3gp",sampleDir);
	//end of try
	} catch (java.io.IOException e/* */) {
	} //end of catch: goto :goto_1
	this.mStrFilePath = audiofile.getAbsolutePath();
	this.mRecorder.setOutputFile(this.mStrFilePath);
	try {
	this.mRecorder.prepare();
	this.mRecorder.start();
	//end of try
	} catch (IllegalStateException e/* */) {
		e.printStackTrace();
	//} //end of catch: goto :goto_0
	} catch (java.io.IOException e/* */) {
		e.printStackTrace();
	} //end of catch: goto :goto_0
	// :goto_0
	this.mEMA = 0 /* 0 */;
	//[OTHER] end local v0           #audiofile:Ljava/io/File;
	//[OTHER] end local v2           #sampleDir:Ljava/io/File;
	// :cond_0
	}
	// :goto_1
	return;
	
	
	
	//[OTHER] end local v1           #e:Ljava/io/IOException;
	
	//[OTHER] end local v1           #e:Ljava/lang/IllegalStateException;
	
}

public void stop(){
	if (this.mRecorder != null) {
	this.mRecorder.stop();
	this.mRecorder.release();
	this.mRecorder = null /* 0 */;
	if (this.mStrFilePath != null) {
	;
	java.io.File audiofile = new java.io.File(this.mStrFilePath);
	audiofile.delete();
	//[OTHER] end local v0           #audiofile:Ljava/io/File;
	// :cond_0
	}
	this.mStrFilePath = null /* 0 */;
	// :cond_1
	}
	return;
}

}