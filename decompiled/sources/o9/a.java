package o9;

import com.bbva.glomohybrid.base.inappupdate.usecase.CheckForFlexibleUpdateUseCase;
import com.bbva.glomohybrid.landing.domain.model.LandingAppAccess;
import com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel$checkFlexibleUpdates$1", f = "LandingViewModel.kt", i = {}, l = {372}, m = "invokeSuspend", n = {}, s = {})
public final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f85297p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ boolean f85298q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ LandingViewModel f85299r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ boolean f85300s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(boolean z10, LandingViewModel landingViewModel, boolean z11, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f85298q0 = z10;
        this.f85299r0 = landingViewModel;
        this.f85300s0 = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new a(this.f85298q0, this.f85299r0, this.f85300s0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f85297p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.f85298q0) {
                LandingViewModel landingViewModel = this.f85299r0;
                if (Intrinsics.areEqual(landingViewModel.L0, LandingAppAccess.Available.INSTANCE) && !this.f85300s0 && !landingViewModel.N0) {
                    landingViewModel.N0 = true;
                    CheckForFlexibleUpdateUseCase checkForFlexibleUpdateUseCaseAccess$getCheckUpdateUseCase = LandingViewModel.access$getCheckUpdateUseCase(landingViewModel);
                    if (checkForFlexibleUpdateUseCaseAccess$getCheckUpdateUseCase != null) {
                        this.f85297p0 = 1;
                        if (checkForFlexibleUpdateUseCaseAccess$getCheckUpdateUseCase.execute(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
