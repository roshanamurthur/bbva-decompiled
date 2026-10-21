package com.bbva.cellscore.web.activity;

import android.app.Activity;
import com.bbva.cellscore.reactor.PageReaction;
import com.bbva.cellscore.web.WebController;
import com.bbva.cellscore.web.data.CellsMessage;
import com.bbva.cellscore.web.navigation.Dispatcher;
import com.bbva.glomohybrid.base.webview.WebActions;
import j4.a;
import j4.b;

/* JADX INFO: loaded from: classes2.dex */
public class WebViewReaction extends PageReaction {
    @Override // com.bbva.cellscore.reactor.GlobalReaction
    public void configure() {
        int i10 = 0;
        when(this.mTag).doAction(WebViewActivity.ON_RESUME).then().in(WebActions.ID, WebController.class).doReactionAndCleanChannel(new a(i10));
        when(this.mTag).doAction(WebViewActivity.ON_BACK).then().in(WebActions.ID, WebController.class).doReactionAndCleanChannel(new b(i10));
        when(WebActions.ID).doAction(WebController.ON_WEB_MESSAGE).then().in(Dispatcher.ID, Dispatcher.class).doNavigationAndCleanChannel(new com.appsflyer.internal.a(this, 1));
    }

    public void dispatchWebMessage(Activity activity, Dispatcher dispatcher, CellsMessage cellsMessage) {
        dispatcher.dispatch(activity, cellsMessage);
    }
}
