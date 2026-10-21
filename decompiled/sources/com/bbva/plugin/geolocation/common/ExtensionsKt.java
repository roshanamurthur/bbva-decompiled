package com.bbva.plugin.geolocation.common;

import android.location.Address;
import android.location.Location;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: Extensions.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"toJson", "Lorg/json/JSONObject;", "Landroid/location/Location;", "toPrettyString", "", "Landroid/location/Address;", "geolocation-plugin_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ExtensionsKt {
    @NotNull
    public static final JSONObject toJson(@NotNull Location location) throws JSONException {
        Intrinsics.checkNotNullParameter(location, "<this>");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("latitude", location.getLatitude());
        jSONObject.put("longitude", location.getLongitude());
        jSONObject.put(ConstantsKt.ALTITUDE, location.getAltitude());
        jSONObject.put(ConstantsKt.ACCURACY, Float.valueOf(location.getAccuracy()));
        return jSONObject;
    }

    @NotNull
    public static final String toPrettyString(@NotNull Address address) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(address, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            StringBuilder sb2 = new StringBuilder();
            int maxAddressLineIndex = address.getMaxAddressLineIndex();
            if (maxAddressLineIndex >= 0) {
                int i10 = 0;
                while (true) {
                    sb2.append(address.getAddressLine(i10));
                    sb2.append(" ");
                    if (i10 == maxAddressLineIndex) {
                        break;
                    }
                    i10++;
                }
            }
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            objM5535constructorimpl = Result.m5535constructorimpl(StringsKt__StringsKt.trim((CharSequence) string).toString());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5538exceptionOrNullimpl(objM5535constructorimpl) != null && (objM5535constructorimpl = address.getThoroughfare()) == null) {
            objM5535constructorimpl = "";
        }
        return (String) objM5535constructorimpl;
    }
}
