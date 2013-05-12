package oms.GameEngine;


public class OS extends Object  {

// static fields
public static int API_LEVEL;
// direct methods

static{
	oms.GameEngine.OS.API_LEVEL = 0 /* 0 */;
}

public OS(){
	super();
}

public static void determineAPI(){
	oms.GameEngine.OS.API_LEVEL = Integer.parseInt(android.os.Build.VERSION.SDK);
	oms.GameEngine.Debug.print(new StringBuilder("API LEVEL ").append(android.os.Build.VERSION.SDK).append(" int=").append(oms.GameEngine.OS.API_LEVEL).toString());
	return;
}

}