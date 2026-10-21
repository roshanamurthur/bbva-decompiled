package com.bbva.glomohybrid.base.handler;

import bk.p;
import com.bbva.bridge.dispatcher.MessageDispatcher;
import com.bbva.glomo.localstorage.LocalStorageConstantsKt;
import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomohybrid.base.cells.channels.CellsChannels;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: SingleAppHostChangerHandler.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0002J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\f"}, d2 = {"Lcom/bbva/glomohybrid/base/handler/SingleAppHostChangerHandler;", "", "handleHostChangeNotification", "", "messageDispatcher", "Lcom/bbva/bridge/dispatcher/MessageDispatcher;", "storage", "Lcom/bbva/glomo/storage/MainStorage;", "host", "", "notifyHostToWeb", "storeHost", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface SingleAppHostChangerHandler {

    /* JADX INFO: compiled from: SingleAppHostChangerHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void handleHostChangeNotification(@NotNull SingleAppHostChangerHandler singleAppHostChangerHandler, @NotNull MessageDispatcher messageDispatcher, @NotNull MainStorage storage, @NotNull String host) {
            Intrinsics.checkNotNullParameter(messageDispatcher, "messageDispatcher");
            Intrinsics.checkNotNullParameter(storage, "storage");
            Intrinsics.checkNotNullParameter(host, "host");
            String name = CellsChannels.INSTANCE.getHostSingleAppChannel().getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            messageDispatcher.sendMessage(name, host);
            String string = new JSONObject(p.mapOf(TuplesKt.to("value", host))).toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            MainStorage.put$default(storage, LocalStorageConstantsKt.CHANGE_HOST_SINGLE_APP_KEY, string, true, null, 8, null);
        }
    }

    void handleHostChangeNotification(@NotNull MessageDispatcher messageDispatcher, @NotNull MainStorage storage, @NotNull String host);
}
