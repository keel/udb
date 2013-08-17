package info.pharos.gameEngine;


public class OS extends Object  {

// static fields
public static int API_LEVEL;
// direct methods

static{
	info.pharos.gameEngine.OS.API_LEVEL = 0 /* 0 */;
}

public OS(){
	super();
}

public static void determineAPI(){
	info.pharos.gameEngine.OS.API_LEVEL = Integer.parseInt(android.os.Build.VERSION.SDK);
	info.pharos.gameEngine.Debug.print(new StringBuilder("API LEVEL ").append(android.os.Build.VERSION.SDK).append(" int=").append(info.pharos.gameEngine.OS.API_LEVEL).toString());
	return;
}

}
