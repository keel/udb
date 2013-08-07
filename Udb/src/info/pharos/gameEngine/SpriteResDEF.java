package info.pharos.gameEngine;


public class SpriteResDEF extends Object  {

// instance fields
public android.graphics.Bitmap Sprite;
public int SpriteCenterX;
public int SpriteCenterY;
public int SpriteResID;
public int SpriteXHitL;
public int SpriteXHitR;
public int SpriteYHitD;
public int SpriteYHitU;
public int SpriteZHitB;
public int SpriteZHitF;
// direct methods

public SpriteResDEF(){
	super();
	this.Sprite = null /* 0 */;
	this.SpriteResID = -1;
	this.SpriteCenterX = 0 /* 0 */;
	this.SpriteCenterY = 0 /* 0 */;
	this.SpriteXHitL = 0 /* 0 */;
	this.SpriteXHitR = 0 /* 0 */;
	this.SpriteYHitU = 0 /* 0 */;
	this.SpriteYHitD = 0 /* 0 */;
	this.SpriteZHitF = 0 /* 0 */;
	this.SpriteZHitB = 0 /* 0 */;
}
// virtual methods

public android.graphics.Bitmap getSprite(){
	;
	return this.Sprite;
	//return this.Sprite;
}

public int getSpriteCenterX(){
	;
	return this.SpriteCenterX;
	//return this.SpriteCenterX;
}

public int getSpriteCenterY(){
	;
	return this.SpriteCenterY;
	//return this.SpriteCenterY;
}

public int getSpriteResID(){
	;
	return this.SpriteResID;
	//return this.SpriteResID;
}

public int getSpriteXHitL(){
	;
	return this.SpriteXHitL;
	//return this.SpriteXHitL;
}

public int getSpriteXHitR(){
	;
	return this.SpriteXHitR;
	//return this.SpriteXHitR;
}

public int getSpriteYHitD(){
	;
	return this.SpriteYHitD;
	//return this.SpriteYHitD;
}

public int getSpriteYHitU(){
	;
	return this.SpriteYHitU;
	//return this.SpriteYHitU;
}

public int getSpriteZHitB(){
	;
	return this.SpriteZHitB;
	//return this.SpriteZHitB;
}

public int getSpriteZHitF(){
	;
	return this.SpriteZHitF;
	//return this.SpriteZHitF;
}

public void release(){
	if (this.Sprite != null) {
	this.Sprite.recycle();
	this.Sprite = null /* 0 */;
	// :cond_0
	}
	return;
}

public void setSprite(android.graphics.Bitmap sprite){
	this.Sprite = sprite;
	return;
}

public void setSpriteCenterX(int spriteCenterX){
	this.SpriteCenterX = spriteCenterX;
	return;
}

public void setSpriteCenterY(int spriteCenterY){
	this.SpriteCenterY = spriteCenterY;
	return;
}

public void setSpriteResID(int spriteResID){
	this.SpriteResID = spriteResID;
	return;
}

public void setSpriteXHitL(int spriteXHitL){
	this.SpriteXHitL = spriteXHitL;
	return;
}

public void setSpriteXHitR(int spriteXHitR){
	this.SpriteXHitR = spriteXHitR;
	return;
}

public void setSpriteYHitD(int spriteYHitD){
	this.SpriteYHitD = spriteYHitD;
	return;
}

public void setSpriteYHitU(int spriteYHitU){
	this.SpriteYHitU = spriteYHitU;
	return;
}

public void setSpriteZHitB(int spriteZHitB){
	this.SpriteZHitB = spriteZHitB;
	return;
}

public void setSpriteZHitF(int spriteZHitF){
	this.SpriteZHitF = spriteZHitF;
	return;
}

}