package androidx.compose.ui.platform;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements OpenEndRange<Float> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f17449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f17450b;

    public s0(float f6, float f10) {
        this.f17449a = f6;
        this.f17450b = f10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.platform.OpenEndRange
    public final boolean contains(Comparable comparable) {
        float fFloatValue = ((Number) comparable).floatValue();
        return fFloatValue >= this.f17449a && fFloatValue < this.f17450b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof s0) {
            if (!isEmpty() || !((s0) obj).isEmpty()) {
                s0 s0Var = (s0) obj;
                if (this.f17449a != s0Var.f17449a || this.f17450b != s0Var.f17450b) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.platform.OpenEndRange
    public final Comparable getEndExclusive() {
        return Float.valueOf(this.f17450b);
    }

    @Override // androidx.compose.ui.platform.OpenEndRange
    public final Comparable getStart() {
        return Float.valueOf(this.f17449a);
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.floatToIntBits(this.f17449a) * 31) + Float.floatToIntBits(this.f17450b);
    }

    @Override // androidx.compose.ui.platform.OpenEndRange
    public final boolean isEmpty() {
        return this.f17449a >= this.f17450b;
    }

    @NotNull
    public final String toString() {
        return this.f17449a + "..<" + this.f17450b;
    }
}
