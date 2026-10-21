package com.bbva.ethermobilesdk.tokencompat.model.legacy.impl;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.STOathParam;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.STParam;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.STReturnCode;
import com.huawei.hms.feature.model.c;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: STParamImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b6\u0018\u00002\u00020\u0001:\u0001\u0010R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R(\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/impl/STParamImpl;", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STParam;", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "a", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "getRc", "()Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "rc", "Lkotlin/Pair;", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STOathParam;", "", "b", "Lkotlin/Pair;", "getValue", "()Lkotlin/Pair;", "value", "FeatureUnavailable", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
public abstract class STParamImpl implements STParam {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final STReturnCode rc;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Pair<STOathParam, String> value;

    public STParamImpl() {
        throw null;
    }

    public STParamImpl(STReturnCode sTReturnCode, Pair pair, DefaultConstructorMarker defaultConstructorMarker) {
        this.rc = sTReturnCode;
        this.value = pair;
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STParam
    @NotNull
    public STReturnCode getRc() {
        return this.rc;
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STParam
    @Nullable
    public Pair<STOathParam, String> getValue() {
        return this.value;
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STParam
    public boolean isOk() {
        return STParam.DefaultImpls.isOk(this);
    }

    /* JADX INFO: compiled from: STParamImpl.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u0017\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006HÆ\u0003J5\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\n\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/impl/STParamImpl$FeatureUnavailable;", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STParam;", "", "component1", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "component2", "Lkotlin/Pair;", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STOathParam;", "component3", c.f50460q, "rc", "value", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getFeature", "()Ljava/lang/String;", "b", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "getRc", "()Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "c", "Lkotlin/Pair;", "getValue", "()Lkotlin/Pair;", "<init>", "(Ljava/lang/String;Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;Lkotlin/Pair;)V", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class FeatureUnavailable implements STParam {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String feature;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final STReturnCode rc;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final Pair<STOathParam, String> value;

        /* JADX WARN: Multi-variable type inference failed */
        public FeatureUnavailable(@NotNull String feature, @NotNull STReturnCode rc2, @Nullable Pair<? extends STOathParam, String> pair) {
            Intrinsics.checkNotNullParameter(feature, "feature");
            Intrinsics.checkNotNullParameter(rc2, "rc");
            this.feature = feature;
            this.rc = rc2;
            this.value = pair;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FeatureUnavailable copy$default(FeatureUnavailable featureUnavailable, String str, STReturnCode sTReturnCode, Pair pair, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = featureUnavailable.feature;
            }
            if ((i10 & 2) != 0) {
                sTReturnCode = featureUnavailable.getRc();
            }
            if ((i10 & 4) != 0) {
                pair = featureUnavailable.getValue();
            }
            return featureUnavailable.copy(str, sTReturnCode, pair);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getFeature() {
            return this.feature;
        }

        @NotNull
        public final STReturnCode component2() {
            return getRc();
        }

        @Nullable
        public final Pair<STOathParam, String> component3() {
            return getValue();
        }

        @NotNull
        public final FeatureUnavailable copy(@NotNull String feature, @NotNull STReturnCode rc2, @Nullable Pair<? extends STOathParam, String> value) {
            Intrinsics.checkNotNullParameter(feature, "feature");
            Intrinsics.checkNotNullParameter(rc2, "rc");
            return new FeatureUnavailable(feature, rc2, value);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FeatureUnavailable)) {
                return false;
            }
            FeatureUnavailable featureUnavailable = (FeatureUnavailable) other;
            return Intrinsics.areEqual(this.feature, featureUnavailable.feature) && Intrinsics.areEqual(getRc(), featureUnavailable.getRc()) && Intrinsics.areEqual(getValue(), featureUnavailable.getValue());
        }

        @NotNull
        public final String getFeature() {
            return this.feature;
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STParam
        @NotNull
        public STReturnCode getRc() {
            return this.rc;
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STParam
        @Nullable
        public Pair<STOathParam, String> getValue() {
            return this.value;
        }

        public int hashCode() {
            return ((getRc().hashCode() + (this.feature.hashCode() * 31)) * 31) + (getValue() == null ? 0 : getValue().hashCode());
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STParam
        public boolean isOk() {
            return STParam.DefaultImpls.isOk(this);
        }

        @NotNull
        public String toString() {
            return "FeatureUnavailable(feature=" + this.feature + ", rc=" + getRc() + ", value=" + getValue() + ")";
        }

        public /* synthetic */ FeatureUnavailable(String str, STReturnCode sTReturnCode, Pair pair, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? new STReturnCodeImpl.FeatureUnavailable(str, 0, null, 6, null) : sTReturnCode, (i10 & 4) != 0 ? null : pair);
        }
    }
}
