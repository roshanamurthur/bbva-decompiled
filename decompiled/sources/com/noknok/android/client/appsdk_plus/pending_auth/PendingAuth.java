package com.noknok.android.client.appsdk_plus.pending_auth;

import android.os.Build;
import android.util.Base64;
import com.google.firebase.messaging.Constants;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import h2.e;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class PendingAuth {
    public String deviceInfo;
    public final String rawData;
    public final String remainingTime;
    public String statusCode;
    public String title;

    public PendingAuth(String str, String str2) {
        this.rawData = str;
        this.remainingTime = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(List list, JsonElement jsonElement) {
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        PendingAuth pendingAuth = new PendingAuth(asJsonObject.get(Constants.MessagePayloadKeys.RAW_DATA).getAsString(), asJsonObject.get("remainingTimeMillis").getAsString());
        if (asJsonObject.has("transaction")) {
            pendingAuth.title = new String(Base64.decode(asJsonObject.getAsJsonObject("transaction").get("text").getAsString(), 8));
        }
        if (asJsonObject.has("push")) {
            pendingAuth.statusCode = asJsonObject.getAsJsonObject("push").get("status").getAsString();
            pendingAuth.deviceInfo = asJsonObject.getAsJsonObject("push").getAsJsonObject(com.bbva.component.dm.naturalauth.Constants.device).get("info").getAsString();
        }
        list.add(pendingAuth);
    }

    public static List<PendingAuth> parsePendingAuths(JsonArray jsonArray) {
        if (Build.VERSION.SDK_INT < 24 || jsonArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        jsonArray.forEach(new e(arrayList, 2));
        return arrayList;
    }
}
