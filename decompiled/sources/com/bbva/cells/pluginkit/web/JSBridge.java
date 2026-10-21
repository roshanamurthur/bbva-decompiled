package com.bbva.cells.pluginkit.web;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: WebCommunicator.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005j\u0002`\u0007H&¨\u0006\b"}, d2 = {"Lcom/bbva/cells/pluginkit/web/JSBridge;", "", "onPostMessage", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "", "Lcom/bbva/pluginkit/web/MessageListener;", "pluginkit_release"}, k = 1, mv = {1, 4, 1})
public interface JSBridge {
    void onPostMessage(@NotNull Function1<? super String, Unit> listener);
}
