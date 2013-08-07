package info.pharos.gameEngine;


public class DataAccess extends Object  {

// static fields
public static java.io.DataInputStream inputStream;
// instance fields
java.io.File hFile;
public int inputFileLen;
public int outputFileLen;
public java.io.DataOutputStream outputStream;
// direct methods

static{
	info.pharos.gameEngine.DataAccess.inputStream = null /* 0 */;
}

public DataAccess(){
	super();
	this.hFile = null /* 0 */;
	this.inputFileLen = 0 /* 0 */;
	this.outputStream = null /* 0 */;
	this.outputFileLen = 0 /* 0 */;
}
// virtual methods

public void CloseInputFile(){
	this.inputFileLen = 0 /* 0 */;
	try {
	info.pharos.gameEngine.DataAccess.inputStream.close();
	//end of try
	} catch (java.io.IOException e/* */) {
		e.printStackTrace();
	} //end of catch: goto :goto_0
	// :goto_0
	return;
	
}

public void CloseOutputFile(){
	this.outputFileLen = 0 /* 0 */;
	try {
	this.outputStream.close();
	//end of try
	} catch (java.io.IOException e/* */) {
		e.printStackTrace();
	} //end of catch: goto :goto_0
	// :goto_0
	return;
	
}

public boolean OpenInputFile(android.content.Context context,String file){
	boolean ret = true;
	try {
	java.io.FileInputStream in = context.openFileInput(file);
	;
	;
	info.pharos.gameEngine.DataAccess.inputStream = new java.io.DataInputStream(new java.io.BufferedInputStream(in));
	this.inputFileLen = info.pharos.gameEngine.DataAccess.inputStream.available();
	//end of try
	} catch (java.io.FileNotFoundException e/* */) {
		e.printStackTrace();
		ret = false /* 0 */;
	return false /* 0 */;
	//} //end of catch: goto :goto_0
	} catch (java.io.IOException e/* */) {
		e.printStackTrace();
	} //end of catch: goto :goto_0
	//[OTHER] end local v2           #in:Ljava/io/FileInputStream;
	// :goto_0
	return ret;
	
	//[OTHER] end local v1           #e1:Ljava/io/FileNotFoundException;
	
}

public boolean OpenOutFile(android.content.Context context,String file){
	boolean ret = true;
	try {
	java.io.FileOutputStream out = context.openFileOutput(file,1);
	;
	java.io.BufferedOutputStream bout = new java.io.BufferedOutputStream(out);
	;
	this.outputStream = new java.io.DataOutputStream(bout);
	//end of try
	} catch (java.io.FileNotFoundException e/* */) {
		e.printStackTrace();
		ret = false /* 0 */;
	return false /* 0 */;
	} //end of catch: goto :goto_0
	//[OTHER] end local v0           #bout:Ljava/io/BufferedOutputStream;
	//[OTHER] end local v2           #out:Ljava/io/FileOutputStream;
	// :goto_0
	return ret;
	
}

public void read(byte[] buffer){
	try {
	info.pharos.gameEngine.DataAccess.inputStream.read(buffer);
	//end of try
	} catch (java.io.IOException e/* */) {
		e.printStackTrace();
	} //end of catch: goto :goto_0
	// :goto_0
	return;
	
}

public void write(byte[] buffer){
	try {
	this.outputStream.write(buffer);
	//end of try
	} catch (java.io.IOException e/* */) {
		e.printStackTrace();
	} //end of catch: goto :goto_0
	// :goto_0
	return;
	
}

}