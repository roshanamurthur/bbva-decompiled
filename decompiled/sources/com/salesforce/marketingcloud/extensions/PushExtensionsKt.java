package com.salesforce.marketingcloud.extensions;

import com.salesforce.marketingcloud.MCKeep;
import com.salesforce.marketingcloud.config.b;
import com.salesforce.marketingcloud.g;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007\u001a\u001f\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001a\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b*\u00020\u0007H\u0007\u001a\u0018\u0010\f\u001a\u00020\u0007*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b0\nH\u0007¨\u0006\r"}, d2 = {"Lorg/json/JSONObject;", "", "name", "getStringOrNull", "", "getIntOrNull", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;", "Lorg/json/JSONArray;", "", "toMap", "", "Lcom/salesforce/marketingcloud/config/b;", "toJSONArray", "sdk_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPushExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PushExtensions.kt\ncom/salesforce/marketingcloud/extensions/PushExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,76:1\n1#2:77\n215#3,2:78\n*S KotlinDebug\n*F\n+ 1 PushExtensions.kt\ncom/salesforce/marketingcloud/extensions/PushExtensionsKt\n*L\n68#1:78,2\n*E\n"})
public final class PushExtensionsKt {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    public static final class a extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f64222a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Could not add event to active events map.";
        }
    }

    @MCKeep
    @Nullable
    public static final Integer getIntOrNull(@NotNull JSONObject jSONObject, @Nullable String str) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        if (str != null) {
            try {
                return Integer.valueOf(jSONObject.getInt(str));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    @MCKeep
    @Nullable
    public static final String getStringOrNull(@NotNull JSONObject jSONObject, @Nullable String str) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        if (str != null) {
            try {
                return jSONObject.getString(str);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    @MCKeep
    @NotNull
    public static final JSONArray toJSONArray(@NotNull Map<String, b> map) throws JSONException {
        Intrinsics.checkNotNullParameter(map, "<this>");
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry<String, b> entry : map.entrySet()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.salesforce.marketingcloud.config.a.f64109t, entry.getKey());
            String strF = entry.getValue().f();
            if (strF != null) {
                jSONObject.put("path", strF);
            }
            jSONObject.put(com.salesforce.marketingcloud.config.a.f64111v, entry.getValue().e());
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    @MCKeep
    @NotNull
    public static final Map<String, String> toMap(@NotNull JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (jSONArray.length() != 0) {
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                try {
                    Object obj = jSONArray.get(i10);
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
                    JSONObject jSONObject = (JSONObject) obj;
                    String stringOrNull = getStringOrNull(jSONObject, com.salesforce.marketingcloud.config.a.f64108s);
                    if (stringOrNull != null) {
                        String lowerCase = stringOrNull.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        linkedHashMap.put(lowerCase, getStringOrNull(jSONObject, com.salesforce.marketingcloud.config.a.f64105p));
                    }
                } catch (Exception e5) {
                    g.f64223a.e("~!toMap", e5, a.f64222a);
                }
            }
        }
        return linkedHashMap;
    }
}
