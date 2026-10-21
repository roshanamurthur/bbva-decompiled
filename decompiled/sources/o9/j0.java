package o9;

import com.bbva.glomo.user.domain.model.UserProfileConfiguration;
import com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel", f = "LandingViewModel.kt", i = {0, 0, 0, 0}, l = {302, 304}, m = "updateState", n = {"this", "userProfile", "fromProfileChange", "lightAccessEnabled"}, s = {"L$0", "L$1", "Z$0", "Z$1"})
public final class j0 extends ContinuationImpl {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public LandingViewModel f85341p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public UserProfileConfiguration f85342q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public UserProfileConfiguration f85343r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f85344s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f85345t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public /* synthetic */ Object f85346u0;
    public final /* synthetic */ LandingViewModel v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f85347w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(LandingViewModel landingViewModel, Continuation<? super j0> continuation) {
        super(continuation);
        this.v0 = landingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f85346u0 = obj;
        this.f85347w0 |= Integer.MIN_VALUE;
        return LandingViewModel.access$updateState(this.v0, null, false, false, this);
    }
}
