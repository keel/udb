package oms.GameEngine;


public class C_Lib extends Object  {

// static fields
public static final int ADMOB_GONE = 0x2;
public static final int ADMOB_INVISIABLE = 0x0;
public static final int ADMOB_REFLASH = 0x8000;
public static final int ADMOB_VISIABLE = 0x1;
public static android.graphics.BitmapFactory.Options bitmapOptions;
public static float mCanvasScaleX;
public static float mCanvasScaleY;
// instance fields
private android.app.Activity cActivity;
public oms.GameEngine.MediaManager cMediaManager;
public oms.GameEngine.C_MessageManager cMessageMgr;
public Thread cThread;
public oms.GameEngine.VibrateManager cVibrateManager;
public oms.GameEngine.GameView cView;
public oms.GameEngine.GameCanvas gameCanvas;
public oms.GameEngine.InputInterface input;
public android.graphics.Bitmap mBackground;
private android.content.Context mContext;
public boolean mTop;
public int nFPS;
private int nFrameFlashTime;
public int nRefreshHeight;
public int nRefreshWidth;
private int nResumeDelay;
public float nScaledDensity;
public int nVBLCount;
// direct methods

static{
	oms.GameEngine.C_Lib.mCanvasScaleX = 0x3f80;
	oms.GameEngine.C_Lib.mCanvasScaleY = 0x3f80;
	;
	oms.GameEngine.C_Lib.bitmapOptions = new android.graphics.BitmapFactory.Options();
}

public C_Lib(android.content.Context context,int TextLayer,int SpriteResNum,int SpriteNum){
	super();
	this.mContext = null /* 0 */;
	this.mContext = context;
	this.gameCanvas = null /* 0 */;
	;
	this.cMediaManager = new oms.GameEngine.MediaManager(this.mContext);
	;
	this.input = new oms.GameEngine.InputInterface();
	this.InitCanvas(TextLayer,SpriteResNum,SpriteNum);
	;
	this.cMessageMgr = new oms.GameEngine.C_MessageManager();
	;
	this.cVibrateManager = new oms.GameEngine.VibrateManager();
	this.setFrameReflashTime(33);
	this.nFPS = 0 /* 0 */;
	this.nVBLCount = 0 /* 0 */;
	this.nRefreshWidth = 320;
	this.nRefreshHeight = 480;
	this.nScaledDensity = 0x3f80;
	this.cView = null /* 0 */;
	this.cThread = null /* 0 */;
	this.mBackground = null /* 0 */;
	this.mTop = true;
	this.nResumeDelay = 0 /* 0 */;
	oms.GameEngine.C_Lib.bitmapOptions.inSampleSize = 1;
}

private void InitCanvas(int TextLayer,int SpriteResNum,int SpriteNum){
	if (this.gameCanvas == null) {
	;
	this.gameCanvas = new oms.GameEngine.GameCanvas(this.mContext,TextLayer,SpriteResNum,SpriteNum);
	// :cond_0
	}
	return;
}
// virtual methods

public void ClearACT(){
	this.gameCanvas.ClearACT();
	return;
}

public android.app.Activity GetActivity(){
	;
	return this.cActivity;
	//return this.cActivity;
}

public Thread GetGameThread(){
	;
	return this.cThread;
	//return this.cThread;
}

public int GetReflashHeight(){
	;
	return (int)((float)this.nRefreshHeight * this.nScaledDensity);
	//return (int)((float)this.nRefreshHeight * this.nScaledDensity);
}

public int GetReflashWidth(){
	;
	return (int)((float)this.nRefreshWidth * this.nScaledDensity);
	//return (int)((float)this.nRefreshWidth * this.nScaledDensity);
}

public oms.GameEngine.GameView GetView(){
	;
	return this.cView;
	//return this.cView;
}

public void InitMedia(int soundNum,int mediaNum){
	if (this.cMediaManager == null) {
	this.cMediaManager.Init(soundNum,mediaNum);
	// :cond_0
	}
	return;
}

public void OnDraw(android.graphics.Canvas canvas){
	this.gameCanvas.onDraw(canvas);
	return;
}

public void ReadTouch(){
	this.input.ReadTouch();
	return;
}

public void Release(){
	if (this.gameCanvas != null) {
	this.gameCanvas.release();
	this.gameCanvas = null /* 0 */;
	// :cond_0
	}
	if (this.cMediaManager != null) {
	this.cMediaManager.release();
	this.cMediaManager = null /* 0 */;
	// :cond_1
	}
	if (this.mBackground != null) {
	this.mBackground.recycle();
	this.mBackground = null /* 0 */;
	// :cond_2
	}
	return;
}

public void SetActivity(android.app.Activity activity){
	this.cActivity = activity;
	return;
}

public void SetBackground(int resID){
	if (this.nRefreshHeight > 480) {
	if (this.mBackground != null) {
	this.mBackground.recycle();
	this.mBackground = null /* 0 */;
	// :cond_0
	}
	this.mBackground = oms.GameEngine.PackageManager.createBitmap(this.mContext,resID);
	// :cond_1
	}
	return;
}

public void SetBackgroundTop(boolean top){
	this.mTop = top;
	return;
}

public void SetCanvasScale(float x,float y){
	oms.GameEngine.C_Lib.mCanvasScaleX = x;
	oms.GameEngine.C_Lib.mCanvasScaleY = y;
	return;
}

public void SetCanvaseSize(int width,int height){
	this.nRefreshWidth = width;
	this.nRefreshHeight = height;
	this.gameCanvas.SetScreenSize(width,height);
	return;
}

public void SetGameThread(Thread thread){
	this.cThread = thread;
	return;
}

public void SetGameView(oms.GameEngine.GameView view){
	this.cView = view;
	return;
}

public void SetReflashSize(int Width,int Height,float scaledDensity){
	this.nRefreshWidth = Width;
	this.nRefreshHeight = Height;
	this.nScaledDensity = scaledDensity;
	int xOff = ((this.nRefreshWidth - 320) / 0x2);
	int yOff = ((this.nRefreshHeight - 480) / 0x2);
	this.SetScreenOffset(xOff,yOff);
	this.SetCanvasScale(0x3f80,0x3f80);
	return;
}

public void SetScreenOffset(int XOff,int YOff){
	this.input.SetScreenOffset(XOff,YOff);
	this.gameCanvas.SetScreenOffset(XOff,YOff);
	oms.GameEngine.C_MultiTouch.SetScreenOffset(XOff,YOff);
	return;
}

public void ViewDark(int alphaSpeed){
	System.gc();
	boolean rt = true;
	while (rt) {
	if (this.gameCanvas.ViewDark(alphaSpeed)) {
	rt = false /* 0 */;
	// :cond_1
	}
	this.WaitBLK();
	// goto :goto_0
	// :cond_0
	}
	this.input.ReadTouch();
	this.input.ReadKeyBoard();
	return;
}

public void ViewOpen(int alphaSpeed){
	System.gc();
	boolean rt = true;
	while (rt) {
	if (this.gameCanvas.ViewOpen(alphaSpeed)) {
	rt = false /* 0 */;
	// :cond_1
	}
	this.WaitBLK();
	// goto :goto_0
	// :cond_0
	}
	this.input.ReadTouch();
	this.input.ReadKeyBoard();
	return;
}

public void WaitBLK(){
	if (this.nResumeDelay > 0) {
	this.nResumeDelay = (this.nResumeDelay - 1);
	} else {
	this.input.nIsPause = false /* 0 */;
		}
	// goto :goto_0
	// :goto_0
	if (this.gameCanvas != null) {
	this.gameCanvas.flush();
	if (this.cView != null) {
	// :goto_1
	while (this.gameCanvas != null && this.gameCanvas.getUpdata()) {
	// :cond_0
	}
	}
	try {
	Thread.sleep((long)(this.nFrameFlashTime >> 0x1));
	//end of try
	} catch (InterruptedException e/* */) {
		e.printStackTrace();
	} //end of catch: goto :goto_1
	// goto :goto_1
	// :cond_2
	}
	this.nVBLCount = (this.nVBLCount + 0x1);
	return;
	
}

public int getFPS(){
	;
	return this.nFPS;
	//return this.nFPS;
}

public int getFrameReflashTime(){
	;
	return this.nFrameFlashTime;
	//return this.nFrameFlashTime;
}

public oms.GameEngine.GameCanvas getGameCanvas(){
	;
	return this.gameCanvas;
	//return this.gameCanvas;
}

public oms.GameEngine.InputInterface getInput(){
	;
	return this.input;
	//return this.input;
}

public android.content.Context getMContext(){
	;
	return this.mContext;
	//return this.mContext;
}

public oms.GameEngine.MediaManager getMediaManager(){
	;
	return this.cMediaManager;
	//return this.cMediaManager;
}

public oms.GameEngine.C_MessageManager getMessageMgr(){
	;
	return this.cMessageMgr;
	//return this.cMessageMgr;
}

public int getVBLCount(){
	;
	return this.nVBLCount;
	//return this.nVBLCount;
}

public oms.GameEngine.VibrateManager getVibrateManager(){
	;
	return this.cVibrateManager;
	//return this.cVibrateManager;
}

public boolean isReflash(){
	return this.gameCanvas.isReflash();
	//return this.gameCanvas.isReflash();
}

void onDraw(oms.GameEngine.C_Lib cLib,android.graphics.Canvas canvas,int picHeight){
	this.gameCanvas.onDraw(cLib,canvas,picHeight);
	return;
}

public void onPause(){
	this.input.nIsPause = true;
	this.input.ClearKeyValue();
	this.nResumeDelay = 10;
	this.gameCanvas.bUpdate = false /* 0 */;
	if (this.cMediaManager != null) {
	this.cMediaManager.onPause();
	// :cond_0
	}
	return;
}

public void onResume(){
	if (this.cMediaManager != null) {
	this.cMediaManager.onResume();
	// :cond_0
	}
	return;
}

public void setFPS(int FPS){
	this.nFPS = FPS;
	return;
}

public void setFrameReflashTime(int time){
	this.nFrameFlashTime = time;
	return;
}

public void setMContext(android.content.Context context){
	this.mContext = context;
	return;
}

}