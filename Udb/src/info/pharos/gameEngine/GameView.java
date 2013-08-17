package info.pharos.gameEngine;

import info.pharos.ly.KLog;
import android.graphics.Bitmap;
import android.util.Log;


public class GameView extends android.view.SurfaceView implements android.view.SurfaceHolder.Callback {

// annotations
// value = {
// Loms/GameEngine/GameView$RanderThread;
// }
// static fields
private static final boolean FOCUSABLE = false;
private static final boolean THREADEN = true;
// instance fields
private info.pharos.gameEngine.C_Lib cLib;
private final android.graphics.PaintFlagsDrawFilter drawFilter = new android.graphics.PaintFlagsDrawFilter(0,3);
private android.view.SurfaceHolder mHolder;
private int mThreadPriority;
private info.pharos.gameEngine.GameView.RanderThread thread;
// direct methods

public GameView(android.content.Context context){
	super(context);
	this.thread = null /* 0 */;
	;
	this.mHolder = this.getHolder();
	this.mHolder.addCallback(this);
	this.setFocusable(false);
	this.mThreadPriority = 10;
}

public GameView(android.content.Context context,android.util.AttributeSet attrs){
	super(context,attrs);
	this.thread = null /* 0 */;
	;
	//this.drawFilter = new android.graphics.PaintFlagsDrawFilter(0,3);
	this.mHolder = this.getHolder();
	this.mHolder.addCallback(this);
	this.setFocusable(false);
	this.mThreadPriority = 10;
}

private void CreateThread(){
	;
	;
	this.thread = new info.pharos.gameEngine.GameView.RanderThread(this,this.mHolder,new android.os.Handler(){

public void handleMessage(android.os.Message m){
	return;
}

	});
	return;
}
/*
static synthetic android.graphics.PaintFlagsDrawFilter access$0(oms.GameEngine.GameView $$0){
	;
	return $$0.drawFilter;
	//return $$0.drawFilter;
}
*/
// virtual methods

public void SetDraw(info.pharos.gameEngine.C_Lib clib){
	this.cLib = clib;
	this.cLib.SetGameView(this);
	if (this.thread != null) {
	this.thread.SetDraw(clib);
	// :cond_0
	}
	return;
}

public void SetThreadPriority(int priority){
	this.mThreadPriority = priority;
	return;
}

public void onDestory(){
	return;
}

public void onPause(){
	if (this.thread != null) {
	this.thread.setRunning(false);
	// :cond_0
	}
	return;
}

public void onResume(){
	if (this.thread != null) {
	this.thread.setRunning(true);
	if (this.thread.isAlive()) {
	//this.thread.resume();
	} else {
	try {
	this.thread.join();
	//end of try
	} catch (InterruptedException e/* */) {
		e.printStackTrace();
	} //end of catch: goto :goto_1
	// :goto_1
	this.thread = null /* 0 */;
	if (this.thread == null) {
	this.CreateThread();
	// :cond_2
	}
	this.thread.SetDraw(this.cLib);
	this.thread.setRunning(true);
	this.thread.setPriority(this.mThreadPriority);
	this.thread.start();
	this.setFocusable(false);
		}
	// goto :goto_0
	// :cond_0
	}
	// :goto_0
	return;
	
}

protected void onWindowVisibilityChanged(int visibility){
	super.onWindowVisibilityChanged(visibility);
	return;
}

public void surfaceChanged(android.view.SurfaceHolder arg0,int arg1,int arg2,int arg3){
	// ERR: unknown sententce. line:monitor-enter p0;
	//:try_start_0
	if (this.thread != null) {
	this.thread.setRunning(true);
	this.thread.setPriority(this.mThreadPriority);
	// ERR: unknown sententce. line:monitor-exit p0;
	}
	return;
}

public void surfaceCreated(android.view.SurfaceHolder arg0){
	// ERR: unknown sententce. line:monitor-enter p0;
	//:try_start_0
	if (this.thread == null) {
	this.CreateThread();
	// :cond_0
	}
	this.thread.SetDraw(this.cLib);
	this.thread.setRunning(true);
	this.thread.start();
	this.setFocusable(false);
	// ERR: unknown sententce. line:monitor-exit p0;
	return;
}

public void surfaceDestroyed(android.view.SurfaceHolder arg0){
	boolean retry = true;
	this.thread.setRunning(false);
	// :goto_0
	while (retry) {
	try {
	this.thread.join();
	//end of try
	} catch (InterruptedException e/* */) {
	} //end of catch: goto :goto_0
	retry = false /* 0 */;
	// goto :goto_0
	// :cond_0
	}
	this.thread = null /* 0 */;
	return;
	
}



public class RanderThread extends Thread  {

// annotations
// value = Loms/GameEngine/GameView;
// accessFlags = 0x1
// name = "RanderThread"
// instance fields
private info.pharos.gameEngine.C_Lib cLib;
private boolean mRun;
private android.view.SurfaceHolder mSurfaceHolder;
public boolean mThreadEnd;
//final synthetic oms.GameEngine.GameView this$0 = mSurfaceHolder;
// direct methods

public RanderThread(info.pharos.gameEngine.GameView mSurfaceHolder,android.view.SurfaceHolder handler,android.os.Handler $$2){
	super();
	this.mRun = false /* 0 */;
	this.mThreadEnd = false /* 0 */;
	this.mSurfaceHolder = handler;
	handler.setType(2);
	this.cLib = null /* 0 */;
	this.mThreadEnd = false /* 0 */;
}
// virtual methods

public void SetDraw(info.pharos.gameEngine.C_Lib c_lib){
	this.cLib = c_lib;
	return;
}

public boolean ismRun(){
	;
	return this.mRun;
	//return this.mRun;
}

public void run(){
	// :goto_0
	while (this.cLib == null) {
	try {
	Thread.sleep(0,500);
	//end of try
	} catch (InterruptedException e) {
		e.printStackTrace();
	} //end of catch: goto/16 :goto_0
	// goto/16 :goto_0
	// :cond_4
	}
	
	
	long frameElapse = 0;
	long frameTick = 0;
	int rectHeight = ((this.cLib.nRefreshHeight - 480) / 0x2);
	boolean randerMode = false;
	if ((info.pharos.gameEngine.C_Lib.mCanvasScaleX - info.pharos.gameEngine.C_Lib.mCanvasScaleY) == 0 && (info.pharos.gameEngine.C_Lib.mCanvasScaleX - 1.0F) == 0) {
		randerMode = true;
	// :cond_5
	}else{
		randerMode = false /* 0 */;
	}
	
	// goto/16 :goto_1
	android.graphics.Bitmap canvasBMP = null;
	android.graphics.Canvas canvas = null;
	android.graphics.Canvas c = null;
	if (!randerMode) {
	canvasBMP = Bitmap.createBitmap(this.cLib.nRefreshWidth,this.cLib.nRefreshHeight,Bitmap.Config.ARGB_8888);
	//[OTHER] end local v6           #canvas:Landroid/graphics/Canvas;
	canvas = new android.graphics.Canvas();
	canvas.setBitmap(canvasBMP);
	// :cond_0
	}
	;
	int a = (int)((float)this.cLib.nRefreshWidth * info.pharos.gameEngine.C_Lib.mCanvasScaleX);
	int b = (int)((float)this.cLib.nRefreshHeight * info.pharos.gameEngine.C_Lib.mCanvasScaleY);
	android.graphics.Rect rc = new android.graphics.Rect(0,0,a,b);
	//KLog.logObj(rc);
	//android.graphics.Rect rc = new android.graphics.Rect;
	// :cond_1
	// :goto_2
	while (this.mRun != false) {
	
		frameTick = System.currentTimeMillis();
		
		// :goto_3
		while (true) {
			if(!this.mRun){
				return;
			}
			if(!this.cLib.isReflash()){
				try {
					Thread.sleep((long)(this.cLib.getFrameReflashTime() >> 0x2));
					//end of try
				} catch (InterruptedException e) {
					e.printStackTrace();
					Log.v("Test",e.toString());
				}		
			}else{
				break;
			}
			
		}
		
		
		long randerStart = System.currentTimeMillis();
		
		try {
			//KLog.logObj("GameView_rc",rc);
		c = this.mSurfaceHolder.lockCanvas(rc);
		if (!randerMode) {
		if (c != null) {
		// getter for: Loms/GameEngine/GameView;->drawFilter:Landroid/graphics/PaintFlagsDrawFilter;;
		c.setDrawFilter(GameView.this.drawFilter);
		c.scale(info.pharos.gameEngine.C_Lib.mCanvasScaleX,info.pharos.gameEngine.C_Lib.mCanvasScaleY);
		// :cond_7
		}
		// getter for: Loms/GameEngine/GameView;->drawFilter:Landroid/graphics/PaintFlagsDrawFilter;;
		canvas.setDrawFilter(GameView.this.drawFilter);
		if (rectHeight > 0) {
		this.cLib.onDraw(this.cLib,canvas,rectHeight);
		} else {
		//:try_start_4
			try{
				
				this.cLib.OnDraw(canvas);
			}catch (Exception e) {
				
				throw e;
			}
		//:try_end_4
		// goto/16 :goto_4
		// :cond_d
		}
		
		if (c != null) {
			c.drawBitmap(canvasBMP,0,0,null);
			//:try_end_1
			// :cond_9
		}
		}else{
			
			if (c != null) {
				//:try_start_5
				// getter for: Loms/GameEngine/GameView;->drawFilter:Landroid/graphics/PaintFlagsDrawFilter;;
				c.setDrawFilter(GameView.this.drawFilter);
				// :cond_e
			}
			if (rectHeight > 0) {
				if (c != null) {
					this.cLib.onDraw(this.cLib,c,rectHeight);
				}
				// goto/16 :goto_5
				// :cond_f
			}
			else if (c != null) {
				this.cLib.OnDraw(c);
				//:try_end_5
			}
		}
		
		// :cond_8 
		//:goto_5
		}catch (Exception e) {
			
			
			
		}finally{
			if (c != null) {
				this.mSurfaceHolder.unlockCanvasAndPost(c);
				// :cond_c
			}
		}
		
	
		
		
		
		this.cLib.nFPS = (int)(System.currentTimeMillis() - randerStart);
		frameElapse = (System.currentTimeMillis() - frameTick);
		if ((frameElapse - (long)cLib.getFrameReflashTime()) < 0) {
		try {
		info.pharos.gameEngine.GameView.RanderThread.sleep((((long)this.cLib.getFrameReflashTime() - frameElapse) - 1));
		//end of try
		} catch (InterruptedException e/* */) {
			e.printStackTrace();
		} //end of catch: goto/16 :goto_2
			//}
		// goto/16 :goto_2
		
		} 
	}
	
	
	if (canvasBMP != null) {
		canvasBMP.recycle();
		canvasBMP = null /* 0 */;
		// :cond_2
		}
	this.mThreadEnd = true;
	
	
	
	
	
	
	
	
}

public void setRunning(boolean b){
	this.mRun = b;
	return;
}

}

}
