package k9;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingActivity.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.LandingActivity$collectNavigationErrors$1$1", f = "LandingActivity.kt", i = {0}, l = {344}, m = "emit", n = {"this"}, s = {"L$0"})
public final class e extends ContinuationImpl {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public f.a f79267p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f79268q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ f.a<Object> f79269r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f79270s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f.a<Object> aVar, Continuation<? super e> continuation) {
        super(continuation);
        this.f79269r0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f79268q0 = obj;
        this.f79270s0 |= Integer.MIN_VALUE;
        return this.f79269r0.a(this);
    }
}
