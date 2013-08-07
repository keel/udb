package info.pharos.ly;

import android.os.Handler;
import android.util.Log;


public class LongMoon extends android.app.Activity {

// static fields
//public static com.google.ads.AdView adView;
//private static android.os.Handler mAdHandler;
private static int mLayoutMode;
// instance fields
//private String AdMobID;
public android.widget.RelativeLayout activityLayout;
//private boolean adViewStatus;
private info.pharos.ly.C_GameMain cOPhoneApp;
private info.pharos.gameEngine.GameView cView;
private boolean mClickMoreGames;
//private android.os.Handler mHandler;
private android.os.Handler mMoreGames;
// direct methods

static{
	info.pharos.ly.LongMoon.mLayoutMode = 10;
	;
	//com.game.UnicornDash.UnicornDash.mAdHandler = new com.game.UnicornDash.UnicornDash.2();
}

public LongMoon(){
	super();
	this.cView = null /* 0 */;
	this.cOPhoneApp = null /* 0 */;
//	this.adViewStatus = true;
//	this.AdMobID = "a14e71b150de87c";
	this.mClickMoreGames = false /* 0 */;
	;
	/*
	this.mHandler = new Handler(){public void handleMessage(android.os.Message msg){
//		// getter for: Lcom/game/UnicornDash/UnicornDash;->adViewStatus:Z;
//		if (UnicornDash.this.adViewStatus) {
////		com.game.UnicornDash.UnicornDash.adView.setVisibility(0);
//		} else {
////		com.game.UnicornDash.UnicornDash.adView.setVisibility(8);
//			}
//		// goto :goto_0
//		// :goto_0
		return;
	}};
	*/
	;
	this.mMoreGames = new Handler(){public void handleMessage(android.os.Message msg){
		moreGames();
		return;
	}};
}

public static void AdViewHandler(){
	;
	/*android.widget.RelativeLayout.LayoutParams adWhirlLayoutParams = new android.widget.RelativeLayout.LayoutParams(-1,-2);
	if (com.game.UnicornDash.UnicornDash.mLayoutMode == 10) {
	adWhirlLayoutParams.addRule(12,0);
	adWhirlLayoutParams.addRule(10,-1);
	// :cond_0
	} else {
	if (com.game.UnicornDash.UnicornDash.mLayoutMode == 12) {
	adWhirlLayoutParams.addRule(12,-1);
	adWhirlLayoutParams.addRule(10,0);
		}
		}
	// goto :goto_0
	// :goto_0
	com.game.UnicornDash.UnicornDash.adView.setLayoutParams(adWhirlLayoutParams);
	com.game.UnicornDash.UnicornDash.adView.invalidate();
	return;
	*/
}

public static void SetAdViewLayout(int align){
//	com.game.UnicornDash.UnicornDash.mLayoutMode = align;
//	android.os.Message msg = com.game.UnicornDash.UnicornDash.mAdHandler.obtainMessage();
//	com.game.UnicornDash.UnicornDash.mAdHandler.sendMessage(msg);
	return;
}

/*static synthetic boolean access$0(com.game.UnicornDash.UnicornDash $$0){
	;
	return $$0.adViewStatus;
	//return $$0.adViewStatus;
}*/
/*
static synthetic void access$1(com.game.UnicornDash.UnicornDash $$0){
	$$0.moreGames();
	return;
}
*/
private void addContentView(android.view.View view){
	android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout)this.findViewById(2131099648);
	;
	android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1,-1);
	relativeLayout.addView(view,0,layoutParams);
	return;
}

private void moreGames(){
	/*
	this.activityLayout.removeView(com.game.UnicornDash.UnicornDash.adView);
	;
	android.content.Intent intent = new android.content.Intent(this,Lcom/MoreGames/API/MoreGames;);
	this.startActivity(intent);
	return;*/
}
// virtual methods

public void FullScreen(boolean full){
	android.view.WindowManager.LayoutParams attrs = this.getWindow().getAttributes();
	if (full) {
	attrs.flags = (attrs.flags | 0x400);
	} else {
	attrs.flags = (attrs.flags & -0x401);
		}
	// goto :goto_0
	// :goto_0
	this.getWindow().setAttributes(attrs);
	this.getWindow().addFlags(512);
	return;
}

public void clickMoreGames(){
//	this.mClickMoreGames = true;
//	android.os.Message msg = this.mMoreGames.obtainMessage();
//	this.mMoreGames.sendMessage(msg);
	return;
}

	public void onCreate(android.os.Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(1);
		this.getWindow().setFlags(1024, 1024);
		;
		this.cOPhoneApp = new info.pharos.ly.C_GameMain(this);
		;
		android.util.DisplayMetrics dm = new android.util.DisplayMetrics();
		this.getWindowManager().getDefaultDisplay().getMetrics(dm);
		this.cOPhoneApp.getCLib().SetActivity(this);
		boolean hdFlag = false;
		int scrWidth_Final = 320;
		int scrHeight_Final = 576;
		int scrWidth = 320;
		int scrHeight = 576;
		if (dm.widthPixels < dm.heightPixels) {
			scrWidth = dm.widthPixels;
			scrHeight = dm.heightPixels;
		} else {
			scrWidth = dm.heightPixels;
			scrHeight = dm.widthPixels;
		}
		info.pharos.ly.C_Global.g_scrWidth = scrWidth;
		info.pharos.ly.C_Global.g_scrHeight = scrHeight;
		// goto/16 :goto_0
		// :goto_0
		if ((dm.widthPixels > 320 || dm.heightPixels > 576)) {
			// :cond_0
			hdFlag = true;
		} else {
			hdFlag = false /* 0 */;
		}
		// goto/16 :goto_1
		// :goto_1
		if (hdFlag) {
			this.cOPhoneApp.getCLib().SetCanvaseSize(dm.widthPixels, 576);
			info.pharos.gameEngine.C_MultiTouch.SetScreenOffset(0, 48);
			this.cOPhoneApp.getCLib().getInput().SetScreenOffset(0, 48);
			info.pharos.gameEngine.C_MultiTouch.SetScreenOffset(0, 48);
			this.cOPhoneApp.getCLib().getGameCanvas()
					.SetBackgroundDrawOffset(0, 48);
			this.cOPhoneApp.getCLib().getGameCanvas()
					.SetSpriteDrawOffset(0, 48);
			this.cOPhoneApp.getCLib().SetCanvasScale(
					((float) scrWidth / 320),
					((float) scrHeight / 576));
			info.pharos.ly.C_Global.g_scrHeight = 0x240;
		} else {
			this.cOPhoneApp.getCLib().SetReflashSize(
					scrWidth, scrHeight,dm.scaledDensity);
		}
		// goto/16 :goto_2
		// :goto_2
		info.pharos.ly.C_Global.g_ScreenScale_2_1 = 0 /* 0 */;
		if (info.pharos.ly.C_Global.g_scrHeight > 480) {
			info.pharos.ly.C_Global.g_ScreenScale_2_1 = ((576 - 480) / 0x2);
			info.pharos.ly.C_Global.g_ScreenScale_3_1 = ((576 - 480) / 0x3);
			// :cond_1
		}
		;
		this.activityLayout = new android.widget.RelativeLayout(this);
		this.setContentView(2130903041);
		this.addContentView(this.activityLayout);
		;
		this.cView = new info.pharos.gameEngine.GameView(this);
		this.cView.SetDraw(this.cOPhoneApp.getCLib());
		
		this.activityLayout.addView(this.cView);
		;/*
		 * com.game.UnicornDash.UnicornDash.adView = new
		 * com.google.ads.AdView(this
		 * ,com.google.ads.AdSize.BANNER,this.AdMobID); ;
		 * com.google.ads.AdRequest request = new com.google.ads.AdRequest();
		 * com.game.UnicornDash.UnicornDash.adView.setAdListener(this);
		 * com.game.UnicornDash.UnicornDash.adView.loadAd(request); ;
		 */
//		android.widget.RelativeLayout.LayoutParams adWhirlLayoutParams = new android.widget.RelativeLayout.LayoutParams(
//				-1, -2);
//		adWhirlLayoutParams.addRule(10, -1);
//		info.pharos.ly.UnicornDash.mLayoutMode = 10;
		// this.activityLayout.addView(com.game.UnicornDash.UnicornDash.adView,adWhirlLayoutParams);
		return;
		// [OTHER] end local v0
		// #adWhirlLayoutParams:Landroid/widget/RelativeLayout$LayoutParams;
		// [OTHER] end local v3 #request:Lcom/google/ads/AdRequest;
	}

protected void onDestroy(){
	this.cOPhoneApp.onDestory();
	this.cView.onDestory();
//	com.game.UnicornDash.UnicornDash.adView.destroy();
	super.onDestroy();
	return;
}
/*
public void onDismissScreen(com.google.ads.Ad arg0){
	return;
}

public void onFailedToReceiveAd(com.google.ads.Ad arg0,com.google.ads.AdRequest.ErrorCode arg1){
	return;
}

public void onFailedToReceiveAd(com.google.ads.AdView arg0){
	return;
}

public void onFailedToReceiveRefreshedAd(com.google.ads.AdView arg0){
	return;
}*/

public boolean onKeyDown(int keyCode,android.view.KeyEvent event){
	return this.cOPhoneApp.onKeyDown(keyCode,event);
	//return this.cOPhoneApp.onKeyDown(keyCode,event);
}

public boolean onKeyMultiple(int keyCode,int repeatCount,android.view.KeyEvent event){
	return super.onKeyMultiple(keyCode,repeatCount,event);
	//return super.onKeyMultiple(keyCode,repeatCount,event);
}

public boolean onKeyUp(int keyCode,android.view.KeyEvent event){
	return this.cOPhoneApp.onKeyUp(keyCode,event);
	//return this.cOPhoneApp.onKeyUp(keyCode,event);
}
/*
public void onLeaveApplication(com.google.ads.Ad arg0){
	return;
}
*/
protected void onPause(){
	this.cOPhoneApp.onPause();
	this.cView.onPause();
	super.onPause();
	return;
}
/*
public void onPresentScreen(com.google.ads.Ad arg0){
	return;
}

public void onReceiveAd(com.google.ads.Ad arg0){
	return;
}

public void onReceiveAd(com.google.ads.AdView arg0){
	return;
}

public void onReceiveRefreshedAd(com.google.ads.AdView arg0){
	return;
}
*/
protected void onResume(){
	this.FullScreen(true);
//	this.resumeMoreGames();
	this.cOPhoneApp.onResume();
	this.cView.onResume();
	super.onResume();
	return;
}

public boolean onTouchEvent(android.view.MotionEvent event){
	this.cOPhoneApp.onTouchEvent(event);
	;
	return false /* 0 */;
	//return 0;
}

public void resumeMoreGames(){
	if (this.mClickMoreGames) {
	this.mClickMoreGames = false /* 0 */;
	/*if (com.game.UnicornDash.UnicornDash.adView != null) {
	;
	android.widget.RelativeLayout.LayoutParams adWhirlLayoutParams = new android.widget.RelativeLayout.LayoutParams(-1,-2);
	adWhirlLayoutParams.addRule(com.game.UnicornDash.UnicornDash.mLayoutMode,-1);
	this.activityLayout.addView(com.game.UnicornDash.UnicornDash.adView,adWhirlLayoutParams);
	//[OTHER] end local v0           #adWhirlLayoutParams:Landroid/widget/RelativeLayout$LayoutParams;
	// :cond_0
	}*/
	}
	return;
}
/*
public void setAdVisibility(boolean status){
	this.adViewStatus = status;
	android.os.Message msg = this.mHandler.obtainMessage();
	this.mHandler.sendMessage(msg);
	return;
}
*/
}