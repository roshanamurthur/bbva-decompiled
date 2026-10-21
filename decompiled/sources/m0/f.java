package m0;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RememberObserver;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Effects.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f implements RememberObserver {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Function1<DisposableEffectScope, DisposableEffectResult> f83248p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    public DisposableEffectResult f83249q0;

    /* JADX WARN: Multi-variable type inference failed */
    public f(@NotNull Function1<? super DisposableEffectScope, ? extends DisposableEffectResult> function1) {
        this.f83248p0 = function1;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
        DisposableEffectResult disposableEffectResult = this.f83249q0;
        if (disposableEffectResult != null) {
            disposableEffectResult.dispose();
        }
        this.f83249q0 = null;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
        this.f83249q0 = this.f83248p0.invoke(EffectsKt.f14558a);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
    }
}
