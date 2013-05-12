package oms.GameEngine;


public class C_MotionEventWrapper8 extends Object  {

// static fields
public static final int ACTION_MASK = 0xff;
public static final int ACTION_POINTER_DOWN = 0x5;
public static final int ACTION_POINTER_INDEX_MASK = 0xff00;
public static final int ACTION_POINTER_INDEX_SHIFT = 0x8;
public static final int ACTION_POINTER_UP = 0x6;
// direct methods

public C_MotionEventWrapper8(){
	super();
}

public static int getPointerCount(android.view.MotionEvent motionEvent){
	return motionEvent.getPointerCount();
	//return motionEvent.getPointerCount();
}

public static int getPointerId(android.view.MotionEvent motionEvent,int index){
	return motionEvent.getPointerId(index);
	//return motionEvent.getPointerId(index);
}

public static float getX(android.view.MotionEvent motionEvent,int index){
	return motionEvent.getX(index);
	//return motionEvent.getX(index);
}

public static float getY(android.view.MotionEvent motionEvent,int index){
	return motionEvent.getY(index);
	//return motionEvent.getY(index);
}

}