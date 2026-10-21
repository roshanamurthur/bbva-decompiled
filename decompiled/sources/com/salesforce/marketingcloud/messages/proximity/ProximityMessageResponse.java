package com.salesforce.marketingcloud.messages.proximity;

import com.salesforce.marketingcloud.MCKeep;
import com.salesforce.marketingcloud.g;
import com.salesforce.marketingcloud.location.LatLon;
import com.salesforce.marketingcloud.messages.MessageResponse;
import com.salesforce.marketingcloud.messages.Region;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@MCKeep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B%\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fJ\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0002\b\u0010J\r\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0011J\r\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\b\u0012R\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/salesforce/marketingcloud/messages/proximity/ProximityMessageResponse;", "Lcom/salesforce/marketingcloud/messages/MessageResponse;", "json", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "refreshCenter", "Lcom/salesforce/marketingcloud/location/LatLon;", "refreshRadius", "", "beacons", "", "Lcom/salesforce/marketingcloud/messages/Region;", "(Lcom/salesforce/marketingcloud/location/LatLon;ILjava/util/List;)V", "()Ljava/util/List;", "()Lcom/salesforce/marketingcloud/location/LatLon;", "()I", "-deprecated_beacons", "-deprecated_refreshCenter", "-deprecated_refreshRadius", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nProximityMessageResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProximityMessageResponse.kt\ncom/salesforce/marketingcloud/messages/proximity/ProximityMessageResponse\n+ 2 -GeneralUtils.kt\ncom/salesforce/marketingcloud/internal/_GeneralUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,71:1\n41#2:72\n42#2,8:76\n51#2:85\n1549#3:73\n1620#3,2:74\n1622#3:84\n1603#3,9:86\n1855#3:95\n1856#3:97\n1612#3:98\n1#4:96\n*S KotlinDebug\n*F\n+ 1 ProximityMessageResponse.kt\ncom/salesforce/marketingcloud/messages/proximity/ProximityMessageResponse\n*L\n26#1:72\n26#1:76,8\n26#1:85\n26#1:73\n26#1:74,2\n26#1:84\n27#1:86,9\n27#1:95\n27#1:97\n27#1:98\n27#1:96\n*E\n"})
public final class ProximityMessageResponse implements MessageResponse {

    @NotNull
    private final List<Region> beacons;

    @NotNull
    private final LatLon refreshCenter;
    private final int refreshRadius;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    public static final class a extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f64758a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Unable to parse Region from proximity message payload.";
        }
    }

    public ProximityMessageResponse(@NotNull LatLon refreshCenter, int i10, @NotNull List<Region> beacons) {
        Intrinsics.checkNotNullParameter(refreshCenter, "refreshCenter");
        Intrinsics.checkNotNullParameter(beacons, "beacons");
        this.refreshCenter = refreshCenter;
        this.refreshRadius = i10;
        this.beacons = beacons;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "beacons", imports = {}))
    @JvmName(name = "-deprecated_beacons")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_beacons, reason: not valid java name */
    public final List<Region> m5464deprecated_beacons() {
        return this.beacons;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "refreshCenter", imports = {}))
    @JvmName(name = "-deprecated_refreshCenter")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_refreshCenter, reason: not valid java name */
    public final LatLon m5465deprecated_refreshCenter() {
        return getRefreshCenter();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "refreshRadius", imports = {}))
    @JvmName(name = "-deprecated_refreshRadius")
    /* JADX INFO: renamed from: -deprecated_refreshRadius, reason: not valid java name */
    public final int m5466deprecated_refreshRadius() {
        return getRefreshRadius();
    }

    @JvmName(name = "beacons")
    @NotNull
    public final List<Region> beacons() {
        return this.beacons;
    }

    @Override // com.salesforce.marketingcloud.messages.MessageResponse
    @JvmName(name = "refreshCenter")
    @NotNull
    /* JADX INFO: renamed from: refreshCenter, reason: from getter */
    public LatLon getRefreshCenter() {
        return this.refreshCenter;
    }

    @Override // com.salesforce.marketingcloud.messages.MessageResponse
    @JvmName(name = "refreshRadius")
    /* JADX INFO: renamed from: refreshRadius, reason: from getter */
    public int getRefreshRadius() {
        return this.refreshRadius;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.ArrayList] */
    public ProximityMessageResponse(@NotNull JSONObject json) throws JSONException {
        ?? EmptyList;
        Region region;
        Object string;
        JSONObject jSONObject;
        Intrinsics.checkNotNullParameter(json, "json");
        LatLon latLonA = com.salesforce.marketingcloud.messages.a.a(json);
        int iB = com.salesforce.marketingcloud.messages.a.b(json);
        JSONArray jSONArrayOptJSONArray = json.optJSONArray("beacons");
        if (jSONArrayOptJSONArray != null) {
            IntRange intRangeUntil = c.until(0, jSONArrayOptJSONArray.length());
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRangeUntil, 10));
            Iterator<Integer> it = intRangeUntil.iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(JSONObject.class);
                if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
                    jSONObject = jSONArrayOptJSONArray.getJSONObject(iNextInt);
                    if (jSONObject == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                } else {
                    if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                        string = Integer.valueOf(jSONArrayOptJSONArray.getInt(iNextInt));
                    } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                        string = Double.valueOf(jSONArrayOptJSONArray.getDouble(iNextInt));
                    } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                        string = Long.valueOf(jSONArrayOptJSONArray.getLong(iNextInt));
                    } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                        string = Boolean.valueOf(jSONArrayOptJSONArray.getBoolean(iNextInt));
                    } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                        string = jSONArrayOptJSONArray.getString(iNextInt);
                        if (string == null) {
                            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                        }
                    } else {
                        string = jSONArrayOptJSONArray.get(iNextInt);
                        if (string == null) {
                            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                        }
                    }
                    jSONObject = (JSONObject) string;
                }
                arrayList.add(jSONObject);
            }
            EmptyList = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                try {
                    region = new Region((JSONObject) it2.next());
                } catch (Exception e5) {
                    g.f64223a.b(Region.INSTANCE.m5390TAG(), e5, a.f64758a);
                    region = null;
                }
                if (region != null) {
                    EmptyList.add(region);
                }
            }
        } else {
            EmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        this(latLonA, iB, EmptyList);
    }
}
