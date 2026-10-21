package o9;

import com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel", f = "LandingViewModel.kt", i = {0}, l = {448, 449}, m = "removeUserData", n = {"this"}, s = {"L$0"})
public final class h0 extends ContinuationImpl {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public LandingViewModel f85332p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f85333q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ LandingViewModel f85334r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f85335s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(LandingViewModel landingViewModel, Continuation<? super h0> continuation) {
        super(continuation);
        this.f85334r0 = landingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f85333q0 = obj;
        this.f85335s0 |= Integer.MIN_VALUE;
        return LandingViewModel.access$removeUserData(this.f85334r0, null, this);
    }
}
