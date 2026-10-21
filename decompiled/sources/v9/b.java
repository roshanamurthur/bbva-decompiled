package v9;

import com.bbva.glomohybrid.login.presentation.viewmodel.handler.GlobalLoginFailureCounterHandler;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GlobalLoginFailureCounterHandler.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.login.presentation.viewmodel.handler.GlobalLoginFailureCounterHandler", f = "GlobalLoginFailureCounterHandler.kt", i = {0}, l = {57}, m = "computeLoginFailures", n = {"this"}, s = {"L$0"})
public final class b extends ContinuationImpl {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public GlobalLoginFailureCounterHandler f93990p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f93991q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ GlobalLoginFailureCounterHandler f93992r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f93993s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(GlobalLoginFailureCounterHandler globalLoginFailureCounterHandler, Continuation<? super b> continuation) {
        super(continuation);
        this.f93992r0 = globalLoginFailureCounterHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f93991q0 = obj;
        this.f93993s0 |= Integer.MIN_VALUE;
        return GlobalLoginFailureCounterHandler.access$computeLoginFailures(this.f93992r0, this);
    }
}
