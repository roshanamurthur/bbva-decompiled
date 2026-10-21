package com.bbva.cellscore.web.navigation.actions;

import com.bbva.cellscore.pubsub.PubSubController;
import com.bbva.cellscore.web.constant.NavigationOperations;
import com.bbva.cellscore.web.navigation.actions.ActionResetChannels;
import com.bbva.cellscore.web.navigation.actions.NavigationAction;
import java.util.HashMap;
import l4.a;
import l4.b;
import l4.c;
import l4.e;
import l4.j;

/* JADX INFO: loaded from: classes2.dex */
public class NavigationActionFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f27194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PubSubController f27195b;

    public interface LazyNavigationAction {
        NavigationAction get();
    }

    public NavigationActionFactory(PubSubController pubSubController) {
        this.f27195b = pubSubController;
        HashMap map = new HashMap();
        this.f27194a = map;
        map.put(NavigationOperations.CLEAR_AND_PUSH, new a());
        map.put(NavigationOperations.POP, new b());
        map.put(NavigationOperations.POP_AND_PUSH, new c());
        map.put(NavigationOperations.UPDATE, new LazyNavigationAction() { // from class: l4.d
            @Override // com.bbva.cellscore.web.navigation.actions.NavigationActionFactory.LazyNavigationAction
            public final NavigationAction get() {
                return new k(this.f83089a.f27195b);
            }
        });
        map.put("push", new e());
        map.put(NavigationOperations.RESET_CHANNELS, new LazyNavigationAction() { // from class: l4.f
            @Override // com.bbva.cellscore.web.navigation.actions.NavigationActionFactory.LazyNavigationAction
            public final NavigationAction get() {
                return new ActionResetChannels(this.f83090a.f27195b);
            }
        });
    }

    public NavigationAction getAction(String str) {
        LazyNavigationAction lazyNavigationAction = (LazyNavigationAction) this.f27194a.get(str);
        return lazyNavigationAction == null ? new j() : lazyNavigationAction.get();
    }
}
