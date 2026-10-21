package k9;

import com.bbva.glomohybrid.base.snackbar.SnackbarState;
import com.bbva.glomohybrid.landing.presentation.LandingActivity;
import com.bbva.glomohybrid.ui.snackbar.CountrySnackbarsFactory;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingActivity.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.LandingActivity$collectNavigationErrors$1", f = "LandingActivity.kt", i = {}, l = {341}, m = "invokeSuspend", n = {}, s = {})
public final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f79271p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ LandingActivity f79272q0;

    /* JADX INFO: compiled from: LandingActivity.kt */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ LandingActivity f79273p0;

        public a(LandingActivity landingActivity) {
            this.f79273p0 = landingActivity;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Nullable
        public final Object a(@NotNull Continuation continuation) {
            e eVar;
            a<T> aVar;
            if (continuation instanceof e) {
                eVar = (e) continuation;
                int i10 = eVar.f79270s0;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    eVar.f79270s0 = i10 - Integer.MIN_VALUE;
                } else {
                    eVar = new e(this, continuation);
                }
            } else {
                eVar = new e(this, continuation);
            }
            Object obj = eVar.f79268q0;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i11 = eVar.f79270s0;
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                this.f79273p0.renderSnackbar(new SnackbarState.Show(CountrySnackbarsFactory.INSTANCE.activityNotFoundSnackbar()));
                eVar.f79267p0 = this;
                eVar.f79270s0 = 1;
                if (DelayKt.delay(3000L, eVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                aVar = this;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = eVar.f79267p0;
                ResultKt.throwOnFailure(obj);
            }
            aVar.f79273p0.renderSnackbar(SnackbarState.Hide.INSTANCE);
            return Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return a(continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(LandingActivity landingActivity, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f79272q0 = landingActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new f(this.f79272q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f79271p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            LandingActivity landingActivity = this.f79272q0;
            Flow<Exception> navigationErrorFlow = landingActivity.v0.getNavigationErrorFlow();
            a aVar = new a(landingActivity);
            this.f79271p0 = 1;
            if (navigationErrorFlow.collect(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
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
