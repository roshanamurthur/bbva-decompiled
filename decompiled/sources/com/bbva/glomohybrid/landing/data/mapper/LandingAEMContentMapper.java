package com.bbva.glomohybrid.landing.data.mapper;

import bk.d;
import bk.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: LandingAEMContentMapper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0016\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u0004*\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0006H\u0004J$\u0010\t\u001a\u0004\u0018\u00010\n*\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0006H\u0004J(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005*\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005H\u0004J\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r*\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005H\u0004J\u001a\u0010\u000e\u001a\u00020\u0004*\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005H\u0004J$\u0010\u000f\u001a\u0004\u0018\u00010\u0006*\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0006H\u0004¨\u0006\u0011"}, d2 = {"Lcom/bbva/glomohybrid/landing/data/mapper/LandingAEMContentMapper;", "", "()V", "int", "", "", "", "Lkotlinx/serialization/json/JsonElement;", "key", "json", "Lorg/json/JSONObject;", "parseAnalytics", "parseConditions", "", "parsePriority", "string", "Companion", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLandingAEMContentMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingAEMContentMapper.kt\ncom/bbva/glomohybrid/landing/data/mapper/LandingAEMContentMapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,58:1\n1#2:59\n1549#3:60\n1620#3,3:61\n*S KotlinDebug\n*F\n+ 1 LandingAEMContentMapper.kt\ncom/bbva/glomohybrid/landing/data/mapper/LandingAEMContentMapper\n*L\n31#1:60\n31#1:61,3\n*E\n"})
public class LandingAEMContentMapper {

    @NotNull
    public static final String ANALYTICS = "analytics";

    @NotNull
    public static final String CONDITION = "condition";

    @NotNull
    public static final String EPI_CAMPAIGN_NAME = "epiCampaignName";

    @NotNull
    public static final String MULTI_VALUE = "multiValue";

    @NotNull
    public static final String PRIORITY = "priority";

    @NotNull
    public static final String VALUE = "value";

    /* JADX INFO: compiled from: LandingAEMContentMapper.kt */
    public static final class a extends Lambda implements Function1<String, Pair<? extends String, ? extends String>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ JSONObject f32534p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(JSONObject jSONObject) {
            super(1);
            this.f32534p0 = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Pair<? extends String, ? extends String> invoke(String str) {
            String str2 = str;
            return TuplesKt.to(str2, this.f32534p0.getString(str2));
        }
    }

    /* JADX INFO: renamed from: int, reason: not valid java name */
    public final int m4921int(@Nullable Map<String, ? extends JsonElement> map, @NotNull String key) {
        JsonElement jsonElement;
        JsonObject jsonObject;
        JsonElement jsonElement2;
        JsonPrimitive jsonPrimitive;
        Intrinsics.checkNotNullParameter(key, "key");
        if (map == null || (jsonElement = map.get(key)) == null || (jsonObject = JsonElementKt.getJsonObject(jsonElement)) == null || (jsonElement2 = (JsonElement) jsonObject.get((Object) "value")) == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement2)) == null) {
            return 0;
        }
        return JsonElementKt.getInt(jsonPrimitive);
    }

    @Nullable
    public final JSONObject json(@Nullable Map<String, ? extends JsonElement> map, @NotNull String key) {
        JsonElement jsonElement;
        JsonObject jsonObject;
        JsonElement jsonElement2;
        JsonPrimitive jsonPrimitive;
        String content;
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(key, "key");
        if (map == null || (jsonElement = map.get(key)) == null || (jsonObject = JsonElementKt.getJsonObject(jsonElement)) == null || (jsonElement2 = (JsonElement) jsonObject.get((Object) "value")) == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement2)) == null || (content = jsonPrimitive.getContent()) == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(new JSONObject(content));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        return (JSONObject) (Result.m5540isFailureimpl(objM5535constructorimpl) ? null : objM5535constructorimpl);
    }

    @Nullable
    public final Map<String, String> parseAnalytics(@Nullable Map<String, ? extends JsonElement> map) {
        JSONObject jSONObjectJson = json(map, ANALYTICS);
        if (jSONObjectJson == null) {
            return null;
        }
        Iterator<String> itKeys = jSONObjectJson.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
        return q.toMap(SequencesKt___SequencesKt.map(SequencesKt__SequencesKt.asSequence(itKeys), new a(jSONObjectJson)));
    }

    @Nullable
    public final List<String> parseConditions(@Nullable Map<String, ? extends JsonElement> map) {
        JsonElement jsonElement;
        JsonArray jsonArray;
        List list;
        JsonElement jsonElement2;
        JsonPrimitive jsonPrimitive;
        String content;
        JsonElement jsonElement3;
        JsonPrimitive jsonPrimitive2;
        JsonElement jsonElement4;
        JsonObject jsonObject = (map == null || (jsonElement4 = map.get(CONDITION)) == null) ? null : JsonElementKt.getJsonObject(jsonElement4);
        boolean z10 = false;
        if (jsonObject != null && (jsonElement3 = (JsonElement) jsonObject.get((Object) MULTI_VALUE)) != null && (jsonPrimitive2 = JsonElementKt.getJsonPrimitive(jsonElement3)) != null && JsonElementKt.getBoolean(jsonPrimitive2)) {
            z10 = true;
        }
        if (!z10) {
            if (jsonObject == null || (jsonElement2 = (JsonElement) jsonObject.get((Object) "value")) == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement2)) == null || (content = jsonPrimitive.getContent()) == null) {
                return null;
            }
            return d.listOf(content);
        }
        if (!z10) {
            throw new NoWhenBranchMatchedException();
        }
        if (jsonObject == null || (jsonElement = (JsonElement) jsonObject.get((Object) "value")) == null || (jsonArray = JsonElementKt.getJsonArray(jsonElement)) == null || (list = CollectionsKt___CollectionsKt.toList(jsonArray)) == null) {
            return null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(JsonElementKt.getJsonPrimitive((JsonElement) it.next()).getContent());
        }
        return arrayList;
    }

    public final int parsePriority(@Nullable Map<String, ? extends JsonElement> map) {
        return m4921int(map, "priority");
    }

    @Nullable
    public final String string(@Nullable Map<String, ? extends JsonElement> map, @NotNull String key) {
        JsonElement jsonElement;
        JsonObject jsonObject;
        JsonElement jsonElement2;
        JsonPrimitive jsonPrimitive;
        Intrinsics.checkNotNullParameter(key, "key");
        if (map == null || (jsonElement = map.get(key)) == null || (jsonObject = JsonElementKt.getJsonObject(jsonElement)) == null || (jsonElement2 = (JsonElement) jsonObject.get((Object) "value")) == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement2)) == null) {
            return null;
        }
        return jsonPrimitive.getContent();
    }
}
