package com.salesforce.marketingcloud.analytics.piwama;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class m {
    @NotNull
    public static String a(c cVar, @NotNull String str, @NotNull String fieldName, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        String string = StringsKt__StringsKt.trim((CharSequence) str).toString();
        int length = string.length();
        if (length == 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.a("PiEvent must contain a ", fieldName, '.'));
        }
        if (length <= 1024) {
            return string;
        }
        String strSubstring = string.substring(0, 1024);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return StringsKt__StringsKt.trim((CharSequence) strSubstring).toString();
    }

    public static void b(c cVar, @NotNull JSONObject jSONObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        jSONObject.put("analyticType", cVar.b());
        jSONObject.put("api_endpoint", cVar.d());
        if (cVar.a().length() > 0) {
            jSONObject.put("event_name", cVar.a());
        }
        jSONObject.put("timestamp", com.salesforce.marketingcloud.internal.m.a(cVar.e()));
    }
}
