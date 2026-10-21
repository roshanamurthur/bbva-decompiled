package ja;

import com.bbva.glomohybrid.welcome.model.domain.WelcomeContract;
import com.bbva.glomohybrid.welcome.presentation.WelcomeAccessesHandler;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WelcomeAccessesHandler.kt */
/* JADX INFO: loaded from: classes7.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.welcome.presentation.WelcomeAccessesHandler$handleWebNavigationAsEvent$1", f = "WelcomeAccessesHandler.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, s = {})
public final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f78835p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ WelcomeAccessesHandler f78836q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ WelcomeContract.Event.Navigation f78837r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(WelcomeContract.Event.Navigation navigation, WelcomeAccessesHandler welcomeAccessesHandler, Continuation continuation) {
        super(2, continuation);
        this.f78836q0 = welcomeAccessesHandler;
        this.f78837r0 = navigation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new b(this.f78837r0, this.f78836q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f78835p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            Channel channel = this.f78836q0.f34741r0;
            this.f78835p0 = 1;
            if (channel.send(this.f78837r0, this) == coroutine_suspended) {
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
