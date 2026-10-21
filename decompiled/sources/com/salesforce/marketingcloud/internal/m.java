package com.salesforce.marketingcloud.internal;

import androidx.exifinterface.media.ExifInterface;
import bk.p;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\f\u0010\u0002\u001a\u0004\u0018\u00010\u0000*\u00020\u0001\u001a\f\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u0001\u001a\u001b\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0006\b\u0000\u0010\u0004\u0018\u0001*\u00020\u0005H\u0086\b\u001a\u0016\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0007*\u00020\u0005\u001a\u0016\u0010\u0002\u001a\u00020\u0005*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0007\u001a.\u0010\u0002\u001a\u00028\u0000\"\u0010\b\u0000\u0010\u0004\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\b*\u00020\t2\u0006\u0010\n\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0002\u0010\u000b\u001a6\u0010\u0002\u001a\u00028\u0000\"\u0010\b\u0000\u0010\u0004\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\b*\u00020\t2\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\f\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b\u0002\u0010\r\"\u0014\u0010\u000f\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u000e\"\u0014\u0010\u0010\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e\"\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0002\u0010\u0014\"\u0017\u0010\u001a\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0003\u0010\u0019¨\u0006\u001b"}, d2 = {"Ljava/util/Date;", "", "a", "b", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/json/JSONArray;", "", "", "", "Lorg/json/JSONObject;", "name", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Enum;", "default", "(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Enum;)Ljava/lang/Enum;", "Ljava/lang/String;", "TAG", "DATE_FORMAT", "Ljava/util/TimeZone;", "c", "Ljava/util/TimeZone;", "()Ljava/util/TimeZone;", "UTC", "Ljava/nio/charset/Charset;", "d", "Ljava/nio/charset/Charset;", "()Ljava/nio/charset/Charset;", "UTF_8", "sdk_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\n-GeneralUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 -GeneralUtils.kt\ncom/salesforce/marketingcloud/internal/_GeneralUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,75:1\n41#1:80\n42#1,8:84\n51#1:93\n1549#2:76\n1620#2,3:77\n1549#2:81\n1620#2,2:82\n1622#2:92\n1179#2,2:94\n1253#2,4:96\n125#3:100\n152#3,3:101\n*S KotlinDebug\n*F\n+ 1 -GeneralUtils.kt\ncom/salesforce/marketingcloud/internal/_GeneralUtilsKt\n*L\n54#1:80\n54#1:84,8\n54#1:93\n41#1:76\n41#1:77,3\n54#1:81\n54#1:82,2\n54#1:92\n55#1:94,2\n55#1:96,4\n59#1:100\n59#1:101,3\n*E\n"})
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f64348a = com.salesforce.marketingcloud.g.a("GeneralUtils");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f64349b = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final TimeZone f64350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final Charset f64351d;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    public static final class a extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f64352a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.f64352a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return ad.d.f(new StringBuilder("Unable to parse "), this.f64352a, " as a Date.");
        }
    }

    static {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        Intrinsics.checkNotNullExpressionValue(timeZone, "getTimeZone(\"UTC\")");
        f64350c = timeZone;
        Charset charsetForName = Charset.forName("UTF-8");
        Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(\"UTF-8\")");
        f64351d = charsetForName;
    }

    public static final /* synthetic */ <T extends Enum<T>> T a(JSONObject jSONObject, String name) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        String string = jSONObject.getString(name);
        Intrinsics.checkNotNullExpressionValue(string, "getString(name)");
        Intrinsics.reifiedOperationMarker(5, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) Enum.valueOf(null, string);
    }

    @Nullable
    public static final String b(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 0) {
            return null;
        }
        return str;
    }

    public static final /* synthetic */ <T extends Enum<T>> T a(JSONObject jSONObject, String name, T t10) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(t10, "default");
        String strOptString = jSONObject.optString(name);
        Intrinsics.checkNotNullExpressionValue(strOptString, "optString(name)");
        String strB = b(strOptString);
        if (strB == null) {
            return t10;
        }
        Intrinsics.reifiedOperationMarker(5, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) Enum.valueOf(null, strB);
    }

    @NotNull
    public static final Charset b() {
        return f64351d;
    }

    @NotNull
    public static final String a(@NotNull Date date) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(f64350c);
        String str = simpleDateFormat.format(date);
        Intrinsics.checkNotNullExpressionValue(str, "SimpleDateFormat(DATE_FO…ne = UTC\n  }.format(this)");
        return str;
    }

    @NotNull
    public static final Map<String, String> b(@NotNull JSONArray jSONArray) throws JSONException {
        Object string;
        JSONObject jSONObject;
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        IntRange intRangeUntil = kotlin.ranges.c.until(0, jSONArray.length());
        ArrayList<JSONObject> arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(JSONObject.class);
            if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
                jSONObject = jSONArray.getJSONObject(iNextInt);
                if (jSONObject == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
            } else {
                if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                    string = Integer.valueOf(jSONArray.getInt(iNextInt));
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                    string = Double.valueOf(jSONArray.getDouble(iNextInt));
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                    string = Long.valueOf(jSONArray.getLong(iNextInt));
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                    string = Boolean.valueOf(jSONArray.getBoolean(iNextInt));
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                    string = jSONArray.getString(iNextInt);
                    if (string == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                } else {
                    string = jSONArray.get(iNextInt);
                    if (string == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                }
                jSONObject = (JSONObject) string;
            }
            arrayList.add(jSONObject);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.c.coerceAtLeast(p.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10)), 16));
        for (JSONObject jSONObject2 : arrayList) {
            Pair pair = TuplesKt.to(jSONObject2.optString("key"), jSONObject2.optString("value"));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    @Nullable
    public static final Date a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(f64350c);
            return simpleDateFormat.parse(str);
        } catch (ParseException e5) {
            com.salesforce.marketingcloud.g.f64223a.b(f64348a, e5, new a(str));
            return null;
        }
    }

    public static final /* synthetic */ <T> List<T> a(JSONArray jSONArray) throws JSONException {
        Object string;
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        IntRange intRangeUntil = kotlin.ranges.c.until(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
                string = jSONArray.getJSONObject(iNextInt);
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                string = Integer.valueOf(jSONArray.getInt(iNextInt));
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                string = Double.valueOf(jSONArray.getDouble(iNextInt));
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                string = Long.valueOf(jSONArray.getLong(iNextInt));
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                string = Boolean.valueOf(jSONArray.getBoolean(iNextInt));
            } else {
                string = Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class)) ? jSONArray.getString(iNextInt) : jSONArray.get(iNextInt);
            }
            Intrinsics.reifiedOperationMarker(1, ExifInterface.GPS_DIRECTION_TRUE);
            arrayList.add(string);
        }
        return arrayList;
    }

    @NotNull
    public static final TimeZone a() {
        return f64350c;
    }

    @NotNull
    public static final JSONArray a(@NotNull Map<String, String> map) throws JSONException {
        Intrinsics.checkNotNullParameter(map, "<this>");
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", key);
            jSONObject.put("value", value);
            arrayList.add(jSONObject);
        }
        return new JSONArray((Collection) arrayList);
    }
}
