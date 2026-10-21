package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: PointerEvent.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Deprecated(message = "Use PointerInputChange.isConsumed and PointerInputChange.consume() instead")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R(\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR(\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\f\u0010\u0004\u0012\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/input/pointer/ConsumedData;", "", "", "a", "Z", "getPositionChange", "()Z", "setPositionChange", "(Z)V", "getPositionChange$annotations", "()V", "positionChange", "b", "getDownChange", "setDownChange", "getDownChange$annotations", "downChange", "<init>", "(ZZ)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class ConsumedData {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public boolean positionChange;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public boolean downChange;

    /* JADX WARN: Illegal instructions before constructor call */
    public ConsumedData() {
        boolean z10 = false;
        this(z10, z10, 3, null);
    }

    public final boolean getDownChange() {
        return this.downChange;
    }

    public final boolean getPositionChange() {
        return this.positionChange;
    }

    public final void setDownChange(boolean z10) {
        this.downChange = z10;
    }

    public final void setPositionChange(boolean z10) {
        this.positionChange = z10;
    }

    public ConsumedData(boolean z10, boolean z11) {
        this.positionChange = z10;
        this.downChange = z11;
    }

    public /* synthetic */ ConsumedData(boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11);
    }

    @Deprecated(message = "Partial consumption was deprecated. Use PointerEvent.isConsumed and PointerEvent.consume() instead.")
    public static /* synthetic */ void getDownChange$annotations() {
    }

    @Deprecated(message = "Partial consumption was deprecated. Use PointerEvent.isConsumed and PointerEvent.consume() instead.")
    public static /* synthetic */ void getPositionChange$annotations() {
    }
}
