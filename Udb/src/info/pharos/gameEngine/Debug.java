package info.pharos.gameEngine;


public class Debug extends Object  {

// static fields
protected static boolean debugMode;
private static String tag;
// direct methods

static{
	info.pharos.gameEngine.Debug.tag = "P_debug";
	info.pharos.gameEngine.Debug.debugMode = true;
}

public Debug(){
	super();
}

public static void error(String message){
	android.util.Log.e(info.pharos.gameEngine.Debug.tag,message);
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
	return info.pharos.gameEngine.Debug.tag;
	//return oms.GameEngine.Debug.tag;
}

public static void print(String message){
	if (!info.pharos.gameEngine.Debug.debugMode) {
	} else {
	android.util.Log.v(info.pharos.gameEngine.Debug.tag,message);
		}
	// goto :goto_0
	// :goto_0
	return;
}

public static void setDebugTag(String tag){
	info.pharos.gameEngine.Debug.tag = tag;
	return;
}

public static void verbose(String message){
	if (!info.pharos.gameEngine.Debug.debugMode) {
	} else {
	android.util.Log.v(info.pharos.gameEngine.Debug.tag,message);
		}
	// goto :goto_0
	// :goto_0
	return;
}

public static void verbose(String method,String message){
	if (!info.pharos.gameEngine.Debug.debugMode) {
	// :cond_0
	} else {
	android.util.Log.v(info.pharos.gameEngine.Debug.tag,new StringBuilder(String.valueOf(method)).append(" - ").append(message).toString());
	if (!info.pharos.gameEngine.Debug.debugMode) {
		}
		}
	// goto :goto_0
	// :goto_0
	return;
}

public static void warning(String message){
	if (!info.pharos.gameEngine.Debug.debugMode) {
	} else {
	android.util.Log.w(info.pharos.gameEngine.Debug.tag,message);
		}
	// goto :goto_0
	// :goto_0
	return;
}

public static void warning(String source,String message){
	if (!info.pharos.gameEngine.Debug.debugMode) {
	} else {
	android.util.Log.w(info.pharos.gameEngine.Debug.tag,new StringBuilder(String.valueOf(source)).append(" - ").append(message).toString());
	;
	Exception e = new Exception(new StringBuilder(String.valueOf(source)).append(" - ").append(message).toString());
	e.printStackTrace();
		}
	// goto :goto_0
	// :goto_0
	return;
}

}