package l0;

import androidx.compose.material3.SnackbarData;
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
public final class w1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f83019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> f83020b;

    /* JADX WARN: Multi-variable type inference failed */
    public w1(SnackbarData snackbarData, @NotNull ComposableLambda transition) {
        Intrinsics.checkNotNullParameter(transition, "transition");
        this.f83019a = snackbarData;
        this.f83020b = transition;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj;
        return Intrinsics.areEqual(this.f83019a, w1Var.f83019a) && Intrinsics.areEqual(this.f83020b, w1Var.f83020b);
    }

    public final int hashCode() {
        T t10 = this.f83019a;
        return this.f83020b.hashCode() + ((t10 == null ? 0 : t10.hashCode()) * 31);
    }

    @NotNull
    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.f83019a + ", transition=" + this.f83020b + RootService.CLOSE_BRACKET;
    }
}
