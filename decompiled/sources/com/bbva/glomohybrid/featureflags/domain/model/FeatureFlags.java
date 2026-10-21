package com.bbva.glomohybrid.featureflags.domain.model;

import androidx.annotation.Keep;
import bk.q;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FeatureFlags.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0015\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003J\u001f\u0010*\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0001J\u0013\u0010+\u001a\u00020\u00072\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0004HÖ\u0001R\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R'\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\tR\u001d\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\tR\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\tR\u001f\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\tR\u0011\u0010\u001b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0011R\u0011\u0010\u001c\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0011R\u0011\u0010\u001d\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0011R\u001f\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\tR\u001f\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b!\u0010\tR\u0011\u0010\"\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b#\u0010\u0011R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u000b8F¢\u0006\u0006\u001a\u0004\b&\u0010\u000eR\u0011\u0010'\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b(\u0010\u0011¨\u00060"}, d2 = {"Lcom/bbva/glomohybrid/featureflags/domain/model/FeatureFlags;", "", "features", "", "", "(Ljava/util/Map;)V", "accessForeignIdCompatibility", "", "getAccessForeignIdCompatibility", "()Ljava/util/Map;", "akamaiItems", "", "Lcom/bbva/glomohybrid/featureflags/domain/model/AkamaiDataModel;", "getAkamaiItems", "()Ljava/util/List;", "clientN2RefactorFlag", "getClientN2RefactorFlag", "()Z", "customerLogins", "getCustomerLogins", "disabledFeatureFlags", "getDisabledFeatureFlags", "featureFlagCollection", "getFeatureFlagCollection", "getFeatures", "futuraFlagCollections", "getFuturaFlagCollections", "isFidoEnabled", "isSustainabilitySectionEnabled", "isTopUpEnabled", "keepAlive", "getKeepAlive", "landing", "getLanding", "lowCostFlag", "getLowCostFlag", "menuItems", "Lcom/bbva/glomohybrid/featureflags/domain/model/MenuDataModel;", "getMenuItems", "standIn", "getStandIn", "component1", "copy", "equals", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "gl-feature-flags_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFeatureFlags.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeatureFlags.kt\ncom/bbva/glomohybrid/featureflags/domain/model/FeatureFlags\n+ 2 MapExtensions.kt\ncom/bbva/glomoutils/MapExtensionsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,162:1\n12#2:163\n12#2:168\n12#2:170\n12#2:171\n12#2:172\n12#2:173\n12#2:174\n12#2:175\n12#2:176\n12#2:177\n12#2:178\n12#2:179\n12#2:180\n19#2:181\n19#2:185\n12#2:187\n12#2:188\n12#2:189\n12#2:190\n12#2:191\n12#2:192\n12#2:197\n12#2:198\n12#2:199\n12#2:200\n12#2:201\n12#2:202\n1549#3:164\n1620#3,3:165\n1549#3:193\n1620#3,3:194\n1#4:169\n125#5:182\n152#5,2:183\n154#5:186\n*S KotlinDebug\n*F\n+ 1 FeatureFlags.kt\ncom/bbva/glomohybrid/featureflags/domain/model/FeatureFlags\n*L\n11#1:163\n16#1:168\n20#1:170\n24#1:171\n33#1:172\n35#1:173\n36#1:174\n42#1:175\n44#1:176\n45#1:177\n51#1:178\n53#1:179\n54#1:180\n60#1:181\n61#1:185\n66#1:187\n69#1:188\n75#1:189\n77#1:190\n78#1:191\n83#1:192\n90#1:197\n91#1:198\n97#1:199\n98#1:200\n104#1:201\n108#1:202\n12#1:164\n12#1:165,3\n84#1:193\n84#1:194,3\n61#1:182\n61#1:183,2\n61#1:186\n*E\n"})
public final /* data */ class FeatureFlags {

    @NotNull
    private final Map<String, Object> features;

    public FeatureFlags(@NotNull Map<String, ? extends Object> features) {
        Intrinsics.checkNotNullParameter(features, "features");
        this.features = features;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeatureFlags copy$default(FeatureFlags featureFlags, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = featureFlags.features;
        }
        return featureFlags.copy(map);
    }

    @NotNull
    public final Map<String, Object> component1() {
        return this.features;
    }

    @NotNull
    public final FeatureFlags copy(@NotNull Map<String, ? extends Object> features) {
        Intrinsics.checkNotNullParameter(features, "features");
        return new FeatureFlags(features);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FeatureFlags) && Intrinsics.areEqual(this.features, ((FeatureFlags) other).features);
    }

    @Nullable
    public final Map<String, Boolean> getAccessForeignIdCompatibility() {
        Map<String, Object> map = this.features;
        Map<String, Boolean> mapEmptyMap = q.emptyMap();
        Object obj = map.get("accessForeignIdCompatibility");
        if (!(obj instanceof Map)) {
            obj = null;
        }
        Map<String, Boolean> map2 = (Map) obj;
        if (map2 != null) {
            mapEmptyMap = map2;
        }
        if (!mapEmptyMap.isEmpty()) {
            return mapEmptyMap;
        }
        return null;
    }

    @NotNull
    public final List<AkamaiDataModel> getAkamaiItems() {
        Map<String, Object> map = this.features;
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        Object obj = map.get("akamaiItems");
        if (!(obj instanceof List)) {
            obj = null;
        }
        List list = (List) obj;
        if (list != null) {
            listEmptyList = list;
        }
        List list2 = listEmptyList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(FeatureFlagsKt.access$asAkamaiDataModel((Map) it.next()));
        }
        return arrayList;
    }

    public final boolean getClientN2RefactorFlag() {
        Map<String, Object> map = this.features;
        Map mapEmptyMap = q.emptyMap();
        Object obj = map.get("featureFlagCollection");
        if (!(obj instanceof Map)) {
            obj = null;
        }
        Map map2 = (Map) obj;
        if (map2 != null) {
            mapEmptyMap = map2;
        }
        Map mapEmptyMap2 = q.emptyMap();
        Object obj2 = mapEmptyMap.get("glomo.liteOnboarding.refactorN2");
        if (!(obj2 instanceof Map)) {
            obj2 = null;
        }
        Map map3 = (Map) obj2;
        if (map3 != null) {
            mapEmptyMap2 = map3;
        }
        Boolean bool = Boolean.FALSE;
        Object obj3 = mapEmptyMap2.get("value");
        Boolean bool2 = (Boolean) (obj3 instanceof Boolean ? obj3 : null);
        if (bool2 != null) {
            bool = bool2;
        }
        return bool.booleanValue();
    }

    public final boolean getCustomerLogins() {
        Map<String, Object> map = this.features;
        Map mapEmptyMap = q.emptyMap();
        Object obj = map.get("featureFlagCollection");
        if (!(obj instanceof Map)) {
            obj = null;
        }
        Map map2 = (Map) obj;
        if (map2 != null) {
            mapEmptyMap = map2;
        }
        Map mapEmptyMap2 = q.emptyMap();
        Object obj2 = mapEmptyMap.get("glomo.login.customerLoginsIndicators");
        if (!(obj2 instanceof Map)) {
            obj2 = null;
        }
        Map map3 = (Map) obj2;
        if (map3 != null) {
            mapEmptyMap2 = map3;
        }
        Boolean bool = Boolean.FALSE;
        Object obj3 = mapEmptyMap2.get("value");
        Boolean bool2 = (Boolean) (obj3 instanceof Boolean ? obj3 : null);
        if (bool2 != null) {
            bool = bool2;
        }
        return bool.booleanValue();
    }

    @Nullable
    public final Map<String, List<String>> getDisabledFeatureFlags() {
        Object obj = this.features.get("disabledNativeFeatures");
        if (!(obj instanceof Map)) {
            obj = null;
        }
        Map map = (Map) obj;
        if (map == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object obj2 = ((Map) entry.getValue()).get("android");
            if (!(obj2 instanceof List)) {
                obj2 = null;
            }
            arrayList.add(new Pair(key, (List) obj2));
        }
        return q.toMap(arrayList);
    }

    @NotNull
    public final Map<String, Object> getFeatureFlagCollection() {
        Map<String, Object> map = this.features;
        Map<String, Object> mapEmptyMap = q.emptyMap();
        Object obj = map.get("featureFlagCollection");
        if (!(obj instanceof Map)) {
            obj = null;
        }
        Map<String, Object> map2 = (Map) obj;
        return map2 == null ? mapEmptyMap : map2;
    }

    @NotNull
    public final Map<String, Object> getFeatures() {
        return this.features;
    }

    @Nullable
    public final Map<String, Object> getFuturaFlagCollections() {
        Map<String, Object> map = this.features;
        Map<String, Object> mapEmptyMap = q.emptyMap();
        Object obj = map.get("futuraCollections");
        if (!(obj instanceof Map)) {
            obj = null;
        }
        Map<String, Object> map2 = (Map) obj;
        if (map2 != null) {
            mapEmptyMap = map2;
        }
        if (!mapEmptyMap.isEmpty()) {
            return mapEmptyMap;
        }
        return null;
    }

    @Nullable
    public final Map<String, Boolean> getKeepAlive() {
        Map<String, Object> map = this.features;
        Map<String, Boolean> mapEmptyMap = q.emptyMap();
        Object obj = map.get("keepAlive");
        if (!(obj instanceof Map)) {
            obj = null;
        }
        Map<String, Boolean> map2 = (Map) obj;
        if (map2 != null) {
            mapEmptyMap = map2;
        }
        if (!mapEmptyMap.isEmpty()) {
            return mapEmptyMap;
        }
        return null;
    }

    @Nullable
    public final Map<String, Boolean> getLanding() {
        Map<String, Object> map = this.features;
        Map<String, Boolean> mapEmptyMap = q.emptyMap();
        Object obj = map.get("landingItems");
        if (!(obj instanceof Map)) {
            obj = null;
        }
        Map<String, Boolean> map2 = (Map) obj;
        if (map2 != null) {
            mapEmptyMap = map2;
        }
        if (!mapEmptyMap.isEmpty()) {
            return mapEmptyMap;
        }
        return null;
    }

    public final boolean getLowCostFlag() {
        Map<String, Object> map = this.features;
        Map mapEmptyMap = q.emptyMap();
        Object obj = map.get("featureFlagCollection");
        if (!(obj instanceof Map)) {
            obj = null;
        }
        Map map2 = (Map) obj;
        if (map2 != null) {
            mapEmptyMap = map2;
        }
        Map mapEmptyMap2 = q.emptyMap();
        Object obj2 = mapEmptyMap.get("glomo.login.lowcostOff");
        if (!(obj2 instanceof Map)) {
            obj2 = null;
        }
        Map map3 = (Map) obj2;
        if (map3 != null) {
            mapEmptyMap2 = map3;
        }
        Boolean bool = Boolean.FALSE;
        Object obj3 = mapEmptyMap2.get("value");
        Boolean bool2 = (Boolean) (obj3 instanceof Boolean ? obj3 : null);
        if (bool2 != null) {
            bool = bool2;
        }
        return bool.booleanValue();
    }

    @NotNull
    public final List<MenuDataModel> getMenuItems() {
        Map<String, Object> map = this.features;
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        Object obj = map.get("menuSidebarItems");
        if (!(obj instanceof List)) {
            obj = null;
        }
        List list = (List) obj;
        if (list != null) {
            listEmptyList = list;
        }
        List list2 = listEmptyList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(FeatureFlagsKt.access$asMenuDataModel((Map) it.next()));
        }
        return arrayList;
    }

    public final boolean getStandIn() {
        Map<String, Object> map = this.features;
        Map mapEmptyMap = q.emptyMap();
        Object obj = map.get("featureFlagCollection");
        if (!(obj instanceof Map)) {
            obj = null;
        }
        Map map2 = (Map) obj;
        if (map2 != null) {
            mapEmptyMap = map2;
        }
        Map mapEmptyMap2 = q.emptyMap();
        Object obj2 = mapEmptyMap.get("glomo.standin.mode");
        if (!(obj2 instanceof Map)) {
            obj2 = null;
        }
        Map map3 = (Map) obj2;
        if (map3 != null) {
            mapEmptyMap2 = map3;
        }
        Boolean bool = Boolean.FALSE;
        Object obj3 = mapEmptyMap2.get("value");
        Boolean bool2 = (Boolean) (obj3 instanceof Boolean ? obj3 : null);
        if (bool2 != null) {
            bool = bool2;
        }
        return bool.booleanValue();
    }

    public int hashCode() {
        return this.features.hashCode();
    }

    public final boolean isFidoEnabled() {
        Map<String, Object> featureFlagCollection = getFeatureFlagCollection();
        Map mapEmptyMap = q.emptyMap();
        Object obj = featureFlagCollection.get("glomo.landing.fido");
        if (!(obj instanceof Map)) {
            obj = null;
        }
        Map map = (Map) obj;
        if (map != null) {
            mapEmptyMap = map;
        }
        if (!mapEmptyMap.isEmpty()) {
            Boolean bool = Boolean.FALSE;
            Object obj2 = mapEmptyMap.get("value");
            Boolean bool2 = (Boolean) (obj2 instanceof Boolean ? obj2 : null);
            if (bool2 != null) {
                bool = bool2;
            }
            if (!bool.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public final boolean isSustainabilitySectionEnabled() {
        Map<String, Object> featureFlagCollection = getFeatureFlagCollection();
        Map mapEmptyMap = q.emptyMap();
        Object obj = featureFlagCollection.get("glomo.sustainability.sustainabilitySection");
        if (!(obj instanceof Map)) {
            obj = null;
        }
        Map map = (Map) obj;
        if (map != null) {
            mapEmptyMap = map;
        }
        if (!mapEmptyMap.isEmpty()) {
            Boolean bool = Boolean.FALSE;
            Object obj2 = mapEmptyMap.get("value");
            Boolean bool2 = (Boolean) (obj2 instanceof Boolean ? obj2 : null);
            if (bool2 != null) {
                bool = bool2;
            }
            if (!bool.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public final boolean isTopUpEnabled() {
        Map<String, Object> featureFlagCollection = getFeatureFlagCollection();
        Map mapEmptyMap = q.emptyMap();
        Object obj = featureFlagCollection.get("glomo.forceTouch.mobileTopUp");
        if (!(obj instanceof Map)) {
            obj = null;
        }
        Map map = (Map) obj;
        if (map != null) {
            mapEmptyMap = map;
        }
        if (!mapEmptyMap.isEmpty()) {
            Boolean bool = Boolean.FALSE;
            Object obj2 = mapEmptyMap.get("value");
            Boolean bool2 = (Boolean) (obj2 instanceof Boolean ? obj2 : null);
            if (bool2 != null) {
                bool = bool2;
            }
            if (!bool.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public String toString() {
        return "FeatureFlags(features=" + this.features + ")";
    }
}
