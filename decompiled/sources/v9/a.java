package v9;

import com.bbva.glomohybrid.login.presentation.viewmodel.handler.GlobalLoginFailureCounterHandler;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GlobalLoginFailureCounterHandler.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.login.presentation.viewmodel.handler.GlobalLoginFailureCounterHandler", f = "GlobalLoginFailureCounterHandler.kt", i = {0}, l = {72}, m = "computeCheckCounter", n = {"this"}, s = {"L$0"})
public final class a extends ContinuationImpl {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public GlobalLoginFailureCounterHandler f93986p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f93987q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ GlobalLoginFailureCounterHandler f93988r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f93989s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(GlobalLoginFailureCounterHandler globalLoginFailureCounterHandler, Continuation<? super a> continuation) {
        super(continuation);
        this.f93988r0 = globalLoginFailureCounterHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f93987q0 = obj;
        this.f93989s0 |= Integer.MIN_VALUE;
        return GlobalLoginFailureCounterHandler.access$computeCheckCounter(this.f93988r0, this);
    }
}
