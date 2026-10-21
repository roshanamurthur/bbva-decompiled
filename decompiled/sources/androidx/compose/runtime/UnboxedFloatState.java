package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SnapshotStateExtensions.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Landroidx/compose/runtime/UnboxedFloatState;", "Landroidx/compose/runtime/FloatState;", "", "toString", "", "getFloatValue", "()F", "floatValue", "getValue", "()Ljava/lang/Float;", "value", "Landroidx/compose/runtime/State;", "baseState", "<init>", "(Landroidx/compose/runtime/State;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class UnboxedFloatState implements FloatState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final State<Float> f14808p0;

    public UnboxedFloatState(@NotNull State<Float> state) {
        this.f14808p0 = state;
    }

    @Override // androidx.compose.runtime.FloatState
    public float getFloatValue() {
        return this.f14808p0.getValue().floatValue();
    }

    @NotNull
    public String toString() {
        return "UnboxedFloatState(baseState=" + this.f14808p0 + ")@" + hashCode();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.FloatState, androidx.compose.runtime.State
    @NotNull
    public Float getValue() {
        return this.f14808p0.getValue();
    }
}
