package com.bbva.notifications.model;

import com.google.gson.Gson;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: MainNodeNotification.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u001a\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0005"}, d2 = {"toMainNodeNotification", "Lcom/bbva/notifications/model/MainNodeNotification;", "", "", "validateJsonStructure", "Notifications_mexicoRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class MainNodeNotificationKt {
    @NotNull
    public static final MainNodeNotification toMainNodeNotification(@NotNull Map<String, String> map) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(map, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            String strValidateJsonStructure = validateJsonStructure(map);
            Gson gson = new Gson();
            if (strValidateJsonStructure == null) {
                strValidateJsonStructure = "{}";
            }
            objM5535constructorimpl = Result.m5535constructorimpl((MainNodeNotification) gson.fromJson(strValidateJsonStructure, MainNodeNotification.class));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        MainNodeNotification mainNodeNotification = new MainNodeNotification(null, 1, null);
        if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
            objM5535constructorimpl = mainNodeNotification;
        }
        return (MainNodeNotification) objM5535constructorimpl;
    }

    @Nullable
    public static final String validateJsonStructure(@NotNull Map<String, String> map) throws JSONException {
        Intrinsics.checkNotNullParameter(map, "<this>");
        String str = map.get("message");
        if (str == null) {
            str = "{}";
        }
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.length() != 1 || !jSONObject.has("data")) {
            return str;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        return (jSONObject2.length() == 1 && jSONObject2.has("message")) ? jSONObject2.getJSONObject("message").toString() : str;
    }
}
