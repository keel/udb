package oms.GameEngine;


public class Debug extends Object  {

// static fields
protected static boolean debugMode;
private static String tag;
// direct methods

static{
	oms.GameEngine.Debug.tag = "oms";
	oms.GameEngine.Debug.debugMode = true;
}

public Debug(){
	super();
}

public static void error(String message){
	android.util.Log.e(oms.GameEngine.Debug.tag,message);
	;
	Exception e = new Exception(message);
	e.printStackTrace();
	return;
}

public static void forceExit(){
	System.exit(0);
	return;
}

public static String getDebugTag(){
	;
	return oms.GameEngine.Debug.tag;
	//return oms.GameEngine.Debug.tag;
}

public static void print(String message){
	if (!oms.GameEngine.Debug.debugMode) {
	} else {
	android.util.Log.v(oms.GameEngine.Debug.tag,message);
		}
	// goto :goto_0
	// :goto_0
	return;
}

public static void setDebugTag(String tag){
	oms.GameEngine.Debug.tag = tag;
	return;
}

public static void verbose(String message){
	if (!oms.GameEngine.Debug.debugMode) {
	} else {
	android.util.Log.v(oms.GameEngine.Debug.tag,message);
		}
	// goto :goto_0
	// :goto_0
	return;
}

public static void verbose(String method,String message){
	if (!oms.GameEngine.Debug.debugMode) {
	// :cond_0
	} else {
	android.util.Log.v(oms.GameEngine.Debug.tag,new StringBuilder(String.valueOf(method)).append(" - ").append(message).toString());
	if (!oms.GameEngine.Debug.debugMode) {
		}
		}
	// goto :goto_0
	// :goto_0
	return;
}

public static void warning(String message){
	if (!oms.GameEngine.Debug.debugMode) {
	} else {
	android.util.Log.w(oms.GameEngine.Debug.tag,message);
		}
	// goto :goto_0
	// :goto_0
	return;
}

public static void warning(String source,String message){
	if (!oms.GameEngine.Debug.debugMode) {
	} else {
	android.util.Log.w(oms.GameEngine.Debug.tag,new StringBuilder(String.valueOf(source)).append(" - ").append(message).toString());
	;
	Exception e = new Exception(new StringBuilder(String.valueOf(source)).append(" - ").append(message).toString());
	e.printStackTrace();
		}
	// goto :goto_0
	// :goto_0
	return;
}

}