package com.bbva.qrplugin.extension;

import android.os.Bundle;
import com.bbva.androidtoolkit.plugin.activity.result.ActivityResult;
import com.bbva.qr.extension.IntKt;
import com.bbva.qr.utils.ConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: ActivityResult.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"parseIntentData", "Lorg/json/JSONObject;", "Lcom/bbva/androidtoolkit/plugin/activity/result/ActivityResult$Success;", "qr-plugin_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ActivityResultKt {
    @NotNull
    public static final JSONObject parseIntentData(@NotNull ActivityResult.Success success) throws JSONException {
        Intrinsics.checkNotNullParameter(success, "<this>");
        JSONObject jSONObject = new JSONObject();
        Bundle extras = success.getIntent().getExtras();
        if (extras != null) {
            jSONObject.put("content", extras.getString("content"));
            jSONObject.put(ConstantsKt.FRIENDLY_CONTENT, extras.getString(ConstantsKt.FRIENDLY_CONTENT));
            if (extras.containsKey(ConstantsKt.REQUEST_CODE)) {
                jSONObject.put(ConstantsKt.REQUEST_CODE, extras.getInt(ConstantsKt.REQUEST_CODE));
            }
            if (extras.containsKey("type")) {
                jSONObject.put("type", IntKt.toFormatIdentifier(extras.getInt("type")));
            }
            jSONObject.put(ConstantsKt.BARCODEVALUEFORMAT, extras.getString(ConstantsKt.BARCODEVALUEFORMAT));
            jSONObject.put("timestamp", extras.getString("timestamp"));
        }
        return jSONObject;
    }
}
