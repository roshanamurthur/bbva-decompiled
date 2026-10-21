package mx.openpay.library.data.datasource.remote.interceptors;

import com.google.firebase.analytics.FirebaseAnalytics;
import ek.a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import mx.openpay.library.domain.repository.AuthTokenRepository;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AuthHeaderInterceptor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "mx.openpay.library.data.datasource.remote.interceptors.AuthHeaderInterceptor$intercept$token$1", f = "AuthHeaderInterceptor.kt", i = {}, l = {18, 20}, m = "invokeSuspend", n = {}, s = {})
public final class AuthHeaderInterceptor$intercept$token$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final /* synthetic */ Request $request;
    int label;
    final /* synthetic */ AuthHeaderInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthHeaderInterceptor$intercept$token$1(Request request, AuthHeaderInterceptor authHeaderInterceptor, Continuation<? super AuthHeaderInterceptor$intercept$token$1> continuation) {
        super(2, continuation);
        this.$request = request;
        this.this$0 = authHeaderInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new AuthHeaderInterceptor$intercept$token$1(this.$request, this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                ResultKt.throwOnFailure(obj);
                return (String) obj;
            }
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return (String) obj;
        }
        ResultKt.throwOnFailure(obj);
        String path = this.$request.url().url().getPath();
        Intrinsics.checkNotNullExpressionValue(path, "request.url.toUrl().path");
        if (StringsKt__StringsKt.contains$default((CharSequence) path, (CharSequence) FirebaseAnalytics.Event.REFUND, false, 2, (Object) null)) {
            AuthTokenRepository authTokenRepository = this.this$0.authRepository;
            this.label = 1;
            obj = authTokenRepository.getLastJwtRefundToken(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            return (String) obj;
        }
        AuthTokenRepository authTokenRepository2 = this.this$0.authRepository;
        this.label = 2;
        obj = authTokenRepository2.getLastJwtToken(this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        return (String) obj;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super String> continuation) {
        return ((AuthHeaderInterceptor$intercept$token$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
