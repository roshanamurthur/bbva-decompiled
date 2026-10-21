package o9;

import com.bbva.glomohybrid.base.models.ShortcutModel;
import com.bbva.glomohybrid.landing.presentation.LandingContract;
import com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel$configureDeeplinkChannelObservers$8", f = "LandingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class k extends SuspendLambda implements Function2<ShortcutModel, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ LandingViewModel f85348p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(LandingViewModel landingViewModel, Continuation<? super k> continuation) {
        super(2, continuation);
        this.f85348p0 = landingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new k(this.f85348p0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ShortcutModel shortcutModel, Continuation<? super Unit> continuation) {
        return ((k) create(shortcutModel, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        ek.a.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        LandingViewModel.access$handleShortcut(this.f85348p0, new LandingContract.Intent.Shortcut(true, null, null, null, 14, null));
        return Unit.INSTANCE;
    }
}
