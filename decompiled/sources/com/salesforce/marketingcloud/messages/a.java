package com.salesforce.marketingcloud.messages;

import com.salesforce.marketingcloud.location.LatLon;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lorg/json/JSONObject;", "Lcom/salesforce/marketingcloud/location/LatLon;", "a", "(Lorg/json/JSONObject;)Lcom/salesforce/marketingcloud/location/LatLon;", "", "b", "(Lorg/json/JSONObject;)I", "sdk_release"}, k = 2, mv = {1, 8, 0})
public final class a {
    @JvmName(name = "-refreshCenter")
    @NotNull
    public static final LatLon a(@NotNull JSONObject jSONObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        JSONObject jSONObject2 = jSONObject.getJSONObject("refreshCenter");
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "getJSONObject(\"refreshCenter\")");
        return new LatLon(jSONObject2);
    }

    @JvmName(name = "-refreshRadius")
    public static final int b(@NotNull JSONObject jSONObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        return jSONObject.getInt("refreshRadius");
    }
}
