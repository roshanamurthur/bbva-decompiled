package androidx.compose.foundation.lazy.layout;

import kotlin.Metadata;

/* JADX INFO: compiled from: LazyLayoutBeyondBoundsModifierLocal.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 8, 0})
public final class LazyLayoutBeyondBoundsModifierLocalKt {
    public static final Void access$unsupportedDirection() {
        throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction".toString());
    }
}
