package com.salesforce.marketingcloud.messages.inbox;

import androidx.databinding.f;
import com.salesforce.marketingcloud.internal.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\u000e\u0010\u0002\u001a\u0004\u0018\u00010\u0000*\u00020\u0001H\u0000¨\u0006\u0003"}, d2 = {"Lcom/salesforce/marketingcloud/messages/inbox/InboxMessage$Media;", "Lorg/json/JSONObject;", "a", "sdk_release"}, k = 2, mv = {1, 8, 0})
public final class b {
    @Nullable
    public static final InboxMessage.Media a(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        String strOptString = jSONObject.optString("androidUrl");
        Intrinsics.checkNotNullExpressionValue(strOptString, "optString(\"androidUrl\")");
        String strB = m.b(strOptString);
        String strG = f.g(jSONObject, "alt", "optString(\"alt\")");
        if (strB == null && strG == null) {
            return null;
        }
        if (strB == null) {
            strB = "";
        }
        return new InboxMessage.Media(strB, strG);
    }

    @NotNull
    public static final JSONObject a(@NotNull InboxMessage.Media media) throws JSONException {
        Intrinsics.checkNotNullParameter(media, "<this>");
        JSONObject jSONObject = new JSONObject();
        if (media.getUrl() != null) {
            jSONObject.put("androidUrl", media.getUrl());
        }
        if (media.getAltText() != null) {
            jSONObject.put("alt", media.getAltText());
        }
        return jSONObject;
    }
}
