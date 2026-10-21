package t7;

import com.bbva.bridge.navigate.WebNavigateDispatcher;
import com.bbva.glomohybrid.base.cells.channels.CellsDeepLinkChannels;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AppReaction.kt */
/* JADX INFO: loaded from: classes5.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.AppReaction$configureReactions$4$1", f = "AppReaction.kt", i = {}, l = {91, 92}, m = "invokeSuspend", n = {}, s = {})
public final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f93474p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ WebNavigateDispatcher f93475q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(WebNavigateDispatcher webNavigateDispatcher, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f93475q0 = webNavigateDispatcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new f(this.f93475q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f93474p0;
        if (i10 != 0) {
            if (i10 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        MutableStateFlow<Boolean> webReadyToExecuteDeeplinkFlow = CellsDeepLinkChannels.INSTANCE.getWebReadyToExecuteDeeplinkFlow();
        Boolean boolBoxBoolean = Boxing.boxBoolean(true);
        this.f93474p0 = 1;
        if (webReadyToExecuteDeeplinkFlow.emit(boolBoxBoolean, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        this.f93474p0 = 2;
        if (this.f93475q0.setPageLoadingReady(this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
