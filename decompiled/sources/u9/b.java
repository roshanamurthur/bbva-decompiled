package u9;

import com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LoginGlobalViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel", f = "LoginGlobalViewModel.kt", i = {}, l = {778}, m = "isTokenActive", n = {}, s = {})
public final class b extends ContinuationImpl {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public /* synthetic */ Object f93752p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ LoginGlobalViewModel f93753q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f93754r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(LoginGlobalViewModel loginGlobalViewModel, Continuation<? super b> continuation) {
        super(continuation);
        this.f93753q0 = loginGlobalViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f93752p0 = obj;
        this.f93754r0 |= Integer.MIN_VALUE;
        return LoginGlobalViewModel.access$isTokenActive(this.f93753q0, null, this);
    }
}
