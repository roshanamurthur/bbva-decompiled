package androidx.compose.runtime.reflect;

import androidx.activity.a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ComposableMethod.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J1\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u0004HÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\b\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018¨\u0006\u001f"}, d2 = {"Landroidx/compose/runtime/reflect/ComposableInfo;", "", "", "component1", "", "component2", "component3", "component4", "isComposable", "realParamsCount", "changedParams", "defaultParams", "copy", "", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Z", "()Z", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getRealParamsCount", "()I", "c", "getChangedParams", "d", "getDefaultParams", "<init>", "(ZIII)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class ComposableInfo {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean isComposable;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int realParamsCount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int changedParams;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int defaultParams;

    public ComposableInfo(boolean z10, int i10, int i11, int i12) {
        this.isComposable = z10;
        this.realParamsCount = i10;
        this.changedParams = i11;
        this.defaultParams = i12;
    }

    public static /* synthetic */ ComposableInfo copy$default(ComposableInfo composableInfo, boolean z10, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z10 = composableInfo.isComposable;
        }
        if ((i13 & 2) != 0) {
            i10 = composableInfo.realParamsCount;
        }
        if ((i13 & 4) != 0) {
            i11 = composableInfo.changedParams;
        }
        if ((i13 & 8) != 0) {
            i12 = composableInfo.defaultParams;
        }
        return composableInfo.copy(z10, i10, i11, i12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsComposable() {
        return this.isComposable;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRealParamsCount() {
        return this.realParamsCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getChangedParams() {
        return this.changedParams;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDefaultParams() {
        return this.defaultParams;
    }

    @NotNull
    public final ComposableInfo copy(boolean isComposable, int realParamsCount, int changedParams, int defaultParams) {
        return new ComposableInfo(isComposable, realParamsCount, changedParams, defaultParams);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComposableInfo)) {
            return false;
        }
        ComposableInfo composableInfo = (ComposableInfo) other;
        return this.isComposable == composableInfo.isComposable && this.realParamsCount == composableInfo.realParamsCount && this.changedParams == composableInfo.changedParams && this.defaultParams == composableInfo.defaultParams;
    }

    public final int getChangedParams() {
        return this.changedParams;
    }

    public final int getDefaultParams() {
        return this.defaultParams;
    }

    public final int getRealParamsCount() {
        return this.realParamsCount;
    }

    public int hashCode() {
        return ((((((this.isComposable ? 1231 : 1237) * 31) + this.realParamsCount) * 31) + this.changedParams) * 31) + this.defaultParams;
    }

    public final boolean isComposable() {
        return this.isComposable;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ComposableInfo(isComposable=");
        sb2.append(this.isComposable);
        sb2.append(", realParamsCount=");
        sb2.append(this.realParamsCount);
        sb2.append(", changedParams=");
        sb2.append(this.changedParams);
        sb2.append(", defaultParams=");
        return a.d(sb2, this.defaultParams, RootService.CLOSE_BRACKET);
    }
}
