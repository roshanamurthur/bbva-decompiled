package o9;

import com.bbva.glomohybrid.landing.presentation.LandingContract;
import com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel$handleMenuItemTap$1", f = "LandingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class t extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ LandingViewModel f85368p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ LandingContract.Intent.MenuItemTap f85369q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(LandingViewModel landingViewModel, LandingContract.Intent.MenuItemTap menuItemTap, Continuation<? super t> continuation) {
        super(2, continuation);
        this.f85368p0 = landingViewModel;
        this.f85369q0 = menuItemTap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new t(this.f85368p0, this.f85369q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((t) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        ek.a.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        LandingViewModel landingViewModel = this.f85368p0;
        landingViewModel.f33128r0.onTap(this.f85369q0.getItem(), landingViewModel.c());
        return Unit.INSTANCE;
    }
}
