package com.bbva.cells.components;

import android.content.Context;
import android.os.Bundle;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.cellscore.app.Reactor;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class CellsBus {
    public static void sendClearEvent(Context context, String str, String str2) {
        Reactor.in(str).doAction(new ActionSpec(str2)).clean();
    }

    public static void sendEvent(Context context, String str, String str2, Bundle bundle) {
        Reactor.in(str).doAction(new ActionSpec(str2)).with(bundle).fire();
    }

    public static void sendEventAndNotReplay(Context context, String str, String str2, Bundle bundle) {
        Reactor.in(str).doAction(new ActionSpec(str2)).with(bundle).fire();
        Reactor.in(str).doAction(new ActionSpec(str2)).clean();
    }
}
