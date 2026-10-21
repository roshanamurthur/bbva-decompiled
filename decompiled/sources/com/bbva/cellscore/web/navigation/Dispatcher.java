package com.bbva.cellscore.web.navigation;

import android.app.Activity;
import android.os.Bundle;
import com.bbva.cellscore.pubsub.PubSubController;
import com.bbva.cellscore.web.activity.WebViewActivity;
import com.bbva.cellscore.web.data.CellsMessage;
import com.bbva.cellscore.web.data.CellsPage;
import com.bbva.cellscore.web.navigation.actions.NavigationActionFactory;
import com.bbva.cellscore.web.reader.RouteReader;

/* JADX INFO: loaded from: classes2.dex */
public class Dispatcher {
    public static final String ID = "component-id-cells-dispatcher";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RouterFactory f27181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavigationActionFactory f27182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RouteReader f27183c;

    public Dispatcher(PubSubController pubSubController, RouterFactory routerFactory, RouteReader routeReader) {
        this.f27181a = routerFactory;
        this.f27182b = new NavigationActionFactory(pubSubController);
        this.f27183c = routeReader;
    }

    public void dispatch(Activity activity, CellsMessage cellsMessage) {
        this.f27182b.getAction(cellsMessage.operation()).execute(activity, cellsMessage, this.f27181a.get(cellsMessage.route(), WebViewActivity.ROUTE));
    }

    public void dispatch(Activity activity, String str) {
        CellsPage route = this.f27183c.readRoute(str);
        if (route.getRoute().isEmpty()) {
            return;
        }
        dispatch(activity, CellsMessage.create(route.getOperation(), route.getRoute(), new Bundle()));
    }
}
