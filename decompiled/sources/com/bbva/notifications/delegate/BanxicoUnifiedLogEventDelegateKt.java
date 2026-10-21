package com.bbva.notifications.delegate;

import bk.d;
import com.bbva.glomo.storage.MainStorage;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import kotlin.Metadata;

/* JADX INFO: compiled from: BanxicoUnifiedLogEventDelegate.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"Notifications_mexicoRelease"}, k = 2, mv = {1, 9, 0})
public final class BanxicoUnifiedLogEventDelegateKt {
    public static final void access$storeEvent(MainStorage mainStorage, String str, JsonObject jsonObject) {
        JsonObject json$default = MainStorage.getJson$default(mainStorage, str, false, null, 6, null);
        if (json$default.has("value")) {
            json$default.getAsJsonArray("value").add(jsonObject);
        } else {
            json$default.add("value", new Gson().toJsonTree(d.listOf(jsonObject)));
        }
        MainStorage.put$default(mainStorage, str, json$default.toString(), false, null, 12, null);
    }
}
