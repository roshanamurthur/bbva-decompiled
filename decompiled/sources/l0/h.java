package l0;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.material3.AppBarKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AppBar.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.material3.AppBarKt", f = "AppBar.kt", i = {0, 0, 0, 1}, l = {1622, 1638}, m = "settleAppBar", n = {"state", "snapAnimationSpec", "remainingVelocity", "remainingVelocity"}, s = {"L$0", "L$1", "L$2", "L$0"})
public final class h extends ContinuationImpl {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Object f82585p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public AnimationSpec f82586q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Ref.FloatRef f82587r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public /* synthetic */ Object f82588s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f82589t0;

    public h() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f82588s0 = obj;
        this.f82589t0 |= Integer.MIN_VALUE;
        return AppBarKt.access$settleAppBar(null, 0.0f, null, null, this);
    }
}
