package j9;

import com.bbva.glomohybrid.landing.domain.usecase.FetchLandingHeaderDataUseCase;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FetchLandingHeaderDataUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.landing.domain.usecase.FetchLandingHeaderDataUseCase", f = "FetchLandingHeaderDataUseCase.kt", i = {0}, l = {139}, m = "waitForMinDelay", n = {"this"}, s = {"L$0"})
public final class a extends ContinuationImpl {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public FetchLandingHeaderDataUseCase f78806p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f78807q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ FetchLandingHeaderDataUseCase f78808r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f78809s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(FetchLandingHeaderDataUseCase fetchLandingHeaderDataUseCase, Continuation<? super a> continuation) {
        super(continuation);
        this.f78808r0 = fetchLandingHeaderDataUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f78807q0 = obj;
        this.f78809s0 |= Integer.MIN_VALUE;
        return FetchLandingHeaderDataUseCase.access$waitForMinDelay(this.f78808r0, false, this);
    }
}
