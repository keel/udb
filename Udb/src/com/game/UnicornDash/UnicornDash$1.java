package com.game.UnicornDash.UnicornDash;


class 1 extends android.os.Handler  {

// annotations
// value = Lcom/game/UnicornDash/UnicornDash;
// accessFlags = 0x0
// name = null
// instance fields
final synthetic com.game.UnicornDash.UnicornDash this$0 = $$0;
// direct methods

1(com.game.UnicornDash.UnicornDash $$0){
	super();
}
// virtual methods

public void handleMessage(android.os.Message msg){
	// getter for: Lcom/game/UnicornDash/UnicornDash;->adViewStatus:Z;
	if (com.game.UnicornDash.UnicornDash.access$0(this.this$0)) {
	com.game.UnicornDash.UnicornDash.adView.setVisibility(0);
	} else {
	com.game.UnicornDash.UnicornDash.adView.setVisibility(8);
		}
	// goto :goto_0
	// :goto_0
	return;
}

}