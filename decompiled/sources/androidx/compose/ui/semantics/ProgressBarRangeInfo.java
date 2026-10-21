package androidx.compose.ui.semantics;

import androidx.activity.a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import ok.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SemanticsProperties.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB'\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0019\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "a", "F", "getCurrent", "()F", "current", "Lkotlin/ranges/ClosedFloatingPointRange;", "b", "Lkotlin/ranges/ClosedFloatingPointRange;", "getRange", "()Lkotlin/ranges/ClosedFloatingPointRange;", "range", "c", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getSteps", "()I", "steps", "<init>", "(FLkotlin/ranges/ClosedFloatingPointRange;I)V", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSemanticsProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsProperties.kt\nandroidx/compose/ui/semantics/ProgressBarRangeInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1291:1\n1#2:1292\n*E\n"})
public final class ProgressBarRangeInfo {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final ProgressBarRangeInfo f17480d = new ProgressBarRangeInfo(0.0f, e.rangeTo(0.0f, 0.0f), 0, 4, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final float current;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ClosedFloatingPointRange<Float> range;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int steps;

    /* JADX INFO: compiled from: SemanticsProperties.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/semantics/ProgressBarRangeInfo$Companion;", "", "()V", "Indeterminate", "Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", "getIndeterminate", "()Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ProgressBarRangeInfo getIndeterminate() {
            return ProgressBarRangeInfo.f17480d;
        }
    }

    public ProgressBarRangeInfo(float f6, @NotNull ClosedFloatingPointRange<Float> range, int i10) {
        Intrinsics.checkNotNullParameter(range, "range");
        this.current = f6;
        this.range = range;
        this.steps = i10;
        if (!(!Float.isNaN(f6))) {
            throw new IllegalArgumentException("current must not be NaN".toString());
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProgressBarRangeInfo)) {
            return false;
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) other;
        return this.current == progressBarRangeInfo.current && Intrinsics.areEqual(this.range, progressBarRangeInfo.range) && this.steps == progressBarRangeInfo.steps;
    }

    public final float getCurrent() {
        return this.current;
    }

    @NotNull
    public final ClosedFloatingPointRange<Float> getRange() {
        return this.range;
    }

    public final int getSteps() {
        return this.steps;
    }

    public int hashCode() {
        return ((this.range.hashCode() + (Float.floatToIntBits(this.current) * 31)) * 31) + this.steps;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ProgressBarRangeInfo(current=");
        sb2.append(this.current);
        sb2.append(", range=");
        sb2.append(this.range);
        sb2.append(", steps=");
        return a.d(sb2, this.steps, RootService.CLOSE_BRACKET);
    }

    public /* synthetic */ ProgressBarRangeInfo(float f6, ClosedFloatingPointRange closedFloatingPointRange, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f6, closedFloatingPointRange, (i11 & 4) != 0 ? 0 : i10);
    }
}
