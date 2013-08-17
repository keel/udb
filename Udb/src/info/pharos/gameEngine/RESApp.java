package info.pharos.gameEngine;


public class RESApp extends Object  {

// instance fields
private android.content.Context mContext;
private java.io.InputStream mRes;
public int nFileLen;
// direct methods

public RESApp(android.content.Context context){
	super();
	this.mContext = null /* 0 */;
	this.mRes = null /* 0 */;
	this.nFileLen = 0 /* 0 */;
	this.mContext = context;
}
// virtual methods

public void CloseRes(){
	if (this.mRes != null) {
	try {
	this.mRes.close();
	//end of try
	} catch (java.io.IOException e/* */) {
		e.printStackTrace();
	} //end of catch: goto :goto_0
	// :goto_0
	this.mRes = null /* 0 */;
	// :cond_0
	}
	return;
	
}

public void OpenRes(int resId){
	if (this.mRes != null) {
	try {
	this.mRes.close();
	//end of try
	} catch (java.io.IOException e/* */) {
		e.printStackTrace();
	} //end of catch: goto :goto_0
	// :cond_0
	}
	// :goto_0
	this.mRes = this.mContext.getResources().openRawResource(resId);
	try {
	this.nFileLen = this.mRes.available();
	//end of try
	} catch (java.io.IOException e) {
		
		e.printStackTrace();
	} //end of catch: goto :goto_1
	// :goto_1
	return;
	
	//[OTHER] end local v0           #e:Ljava/io/IOException;
	
}

public void ResRead(byte[] b,int offset,int length){
	try {
	this.mRes.skip((long)offset);
	this.mRes.read(b,0,length);
	//end of try
	} catch (java.io.IOException e/* */) {
		e.printStackTrace();
	} //end of catch: goto :goto_0
	// :goto_0
	return;
	
}

public void Reset(){
	try {
	this.mRes.reset();
	//end of try
	} catch (java.io.IOException e/* */) {
		e.printStackTrace();
	} //end of catch: goto :goto_0
	// :goto_0
	return;
	
}

public int getLength(){
	;
	return this.nFileLen;
	//return this.nFileLen;
}

}
