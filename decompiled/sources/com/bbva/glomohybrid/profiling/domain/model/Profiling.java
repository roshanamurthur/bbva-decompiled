package com.bbva.glomohybrid.profiling.domain.model;

import ad.d;
import androidx.annotation.Keep;
import androidx.camera.camera2.internal.n1;
import bk.q;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Profiling.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0014\u0015B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0015\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001R\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/bbva/glomohybrid/profiling/domain/model/Profiling;", "", "features", "", "", "(Ljava/util/Map;)V", "featureFlagCollection", "getFeatureFlagCollection", "()Ljava/util/Map;", "getFeatures", "futuraFlagCollections", "getFuturaFlagCollections", "component1", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "FeatureFlagModel", "ProfilingFlagsModel", "gl-feature-flags_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nProfiling.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Profiling.kt\ncom/bbva/glomohybrid/profiling/domain/model/Profiling\n+ 2 MapExtensions.kt\ncom/bbva/glomoutils/MapExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n12#2:39\n12#2:41\n1#3:40\n*S KotlinDebug\n*F\n+ 1 Profiling.kt\ncom/bbva/glomohybrid/profiling/domain/model/Profiling\n*L\n14#1:39\n20#1:41\n*E\n"})
public final /* data */ class Profiling {

    @NotNull
    private final Map<String, Object> features;

    /* JADX INFO: compiled from: Profiling.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/bbva/glomohybrid/profiling/domain/model/Profiling$FeatureFlagModel;", "", "", "component1", "", "component2", "key", "value", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "b", "Z", "getValue", "()Z", "<init>", "(Ljava/lang/String;Z)V", "gl-feature-flags_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class FeatureFlagModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @SerializedName("key")
        @NotNull
        private final String key;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @SerializedName("value")
        private final boolean value;

        public FeatureFlagModel(@NotNull String key, boolean z10) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.key = key;
            this.value = z10;
        }

        public static /* synthetic */ FeatureFlagModel copy$default(FeatureFlagModel featureFlagModel, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = featureFlagModel.key;
            }
            if ((i10 & 2) != 0) {
                z10 = featureFlagModel.value;
            }
            return featureFlagModel.copy(str, z10);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getValue() {
            return this.value;
        }

        @NotNull
        public final FeatureFlagModel copy(@NotNull String key, boolean value) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new FeatureFlagModel(key, value);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FeatureFlagModel)) {
                return false;
            }
            FeatureFlagModel featureFlagModel = (FeatureFlagModel) other;
            return Intrinsics.areEqual(this.key, featureFlagModel.key) && this.value == featureFlagModel.value;
        }

        @NotNull
        public final String getKey() {
            return this.key;
        }

        public final boolean getValue() {
            return this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3 */
        public int hashCode() {
            int iHashCode = this.key.hashCode() * 31;
            boolean z10 = this.value;
            ?? r1 = z10;
            if (z10) {
                r1 = 1;
            }
            return iHashCode + r1;
        }

        @NotNull
        public String toString() {
            return "FeatureFlagModel(key=" + this.key + ", value=" + this.value + ")";
        }
    }

    /* JADX INFO: compiled from: Profiling.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J1\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014¨\u0006\u001d"}, d2 = {"Lcom/bbva/glomohybrid/profiling/domain/model/Profiling$ProfilingFlagsModel;", "", "", "component1", "component2", "component3", "component4", "a", "i", "va", "vi", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "Ljava/lang/String;", "getA", "()Ljava/lang/String;", "b", "getI", "c", "getVa", "d", "getVi", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gl-feature-flags_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class ProfilingFlagsModel {

        @NotNull
        public final String a;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String i;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String va;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String vi;

        public ProfilingFlagsModel(@NotNull String a10, @NotNull String i10, @NotNull String va2, @NotNull String vi2) {
            Intrinsics.checkNotNullParameter(a10, "a");
            Intrinsics.checkNotNullParameter(i10, "i");
            Intrinsics.checkNotNullParameter(va2, "va");
            Intrinsics.checkNotNullParameter(vi2, "vi");
            this.a = a10;
            this.i = i10;
            this.va = va2;
            this.vi = vi2;
        }

        public static /* synthetic */ ProfilingFlagsModel copy$default(ProfilingFlagsModel profilingFlagsModel, String str, String str2, String str3, String str4, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = profilingFlagsModel.a;
            }
            if ((i10 & 2) != 0) {
                str2 = profilingFlagsModel.i;
            }
            if ((i10 & 4) != 0) {
                str3 = profilingFlagsModel.va;
            }
            if ((i10 & 8) != 0) {
                str4 = profilingFlagsModel.vi;
            }
            return profilingFlagsModel.copy(str, str2, str3, str4);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getA() {
            return this.a;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getI() {
            return this.i;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getVa() {
            return this.va;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getVi() {
            return this.vi;
        }

        @NotNull
        public final ProfilingFlagsModel copy(@NotNull String a10, @NotNull String i10, @NotNull String va2, @NotNull String vi2) {
            Intrinsics.checkNotNullParameter(a10, "a");
            Intrinsics.checkNotNullParameter(i10, "i");
            Intrinsics.checkNotNullParameter(va2, "va");
            Intrinsics.checkNotNullParameter(vi2, "vi");
            return new ProfilingFlagsModel(a10, i10, va2, vi2);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProfilingFlagsModel)) {
                return false;
            }
            ProfilingFlagsModel profilingFlagsModel = (ProfilingFlagsModel) other;
            return Intrinsics.areEqual(this.a, profilingFlagsModel.a) && Intrinsics.areEqual(this.i, profilingFlagsModel.i) && Intrinsics.areEqual(this.va, profilingFlagsModel.va) && Intrinsics.areEqual(this.vi, profilingFlagsModel.vi);
        }

        @NotNull
        public final String getA() {
            return this.a;
        }

        @NotNull
        public final String getI() {
            return this.i;
        }

        @NotNull
        public final String getVa() {
            return this.va;
        }

        @NotNull
        public final String getVi() {
            return this.vi;
        }

        public int hashCode() {
            return this.vi.hashCode() + n1.c(this.va, n1.c(this.i, this.a.hashCode() * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ProfilingFlagsModel(a=");
            sb2.append(this.a);
            sb2.append(", i=");
            sb2.append(this.i);
            sb2.append(", va=");
            sb2.append(this.va);
            sb2.append(", vi=");
            return d.f(sb2, this.vi, ")");
        }
    }

    public Profiling(@NotNull Map<String, ? extends Object> features) {
        Intrinsics.checkNotNullParameter(features, "features");
        this.features = features;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Profiling copy$default(Profiling profiling, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = profiling.features;
        }
        return profiling.copy(map);
    }

    @NotNull
    public final Map<String, Object> component1() {
        return this.features;
    }

    @NotNull
    public final Profiling copy(@NotNull Map<String, ? extends Object> features) {
        Intrinsics.checkNotNullParameter(features, "features");
        return new Profiling(features);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Profiling) && Intrinsics.areEqual(this.features, ((Profiling) other).features);
    }

    @Nullable
    public final Map<String, Object> getFeatureFlagCollection() {
        Map<String, Object> map = this.features;
        Map<String, Object> mapEmptyMap = q.emptyMap();
        Object obj = map.get("featureFlagCollection");
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

    public int hashCode() {
        return this.features.hashCode();
    }

    @NotNull
    public String toString() {
        return "Profiling(features=" + this.features + ")";
    }
}
