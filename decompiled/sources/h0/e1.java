package h0;

import androidx.compose.material.SnackbarData;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambda;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SnackbarHost.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f68729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> f68730b;

    /* JADX WARN: Multi-variable type inference failed */
    public e1(SnackbarData snackbarData, @NotNull ComposableLambda transition) {
        Intrinsics.checkNotNullParameter(transition, "transition");
        this.f68729a = snackbarData;
        this.f68730b = transition;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return Intrinsics.areEqual(this.f68729a, e1Var.f68729a) && Intrinsics.areEqual(this.f68730b, e1Var.f68730b);
    }

    public final int hashCode() {
        T t10 = this.f68729a;
        return this.f68730b.hashCode() + ((t10 == null ? 0 : t10.hashCode()) * 31);
    }

    @NotNull
    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.f68729a + ", transition=" + this.f68730b + RootService.CLOSE_BRACKET;
    }
}
