package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import bc.org.bouncycastle.math.ec.custom.sec.a;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SemanticsProperties.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B-\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/semantics/ScrollAxisRange;", "", "", "toString", "Lkotlin/Function0;", "", "a", "Lkotlin/jvm/functions/Function0;", "getValue", "()Lkotlin/jvm/functions/Function0;", "value", "b", "getMaxValue", "maxValue", "", "c", "Z", "getReverseScrolling", "()Z", "reverseScrolling", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Z)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class ScrollAxisRange {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function0<Float> value;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function0<Float> maxValue;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final boolean reverseScrolling;

    public ScrollAxisRange(@NotNull Function0<Float> value, @NotNull Function0<Float> maxValue, boolean z10) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(maxValue, "maxValue");
        this.value = value;
        this.maxValue = maxValue;
        this.reverseScrolling = z10;
    }

    @NotNull
    public final Function0<Float> getMaxValue() {
        return this.maxValue;
    }

    public final boolean getReverseScrolling() {
        return this.reverseScrolling;
    }

    @NotNull
    public final Function0<Float> getValue() {
        return this.value;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ScrollAxisRange(value=");
        sb2.append(this.value.invoke().floatValue());
        sb2.append(", maxValue=");
        sb2.append(this.maxValue.invoke().floatValue());
        sb2.append(", reverseScrolling=");
        return a.d(sb2, this.reverseScrolling, RootService.CLOSE_BRACKET);
    }

    public /* synthetic */ ScrollAxisRange(Function0 function0, Function0 function1, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, function1, (i10 & 4) != 0 ? false : z10);
    }
}
