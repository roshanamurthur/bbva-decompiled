package mx.openpay.library.data.datasource.remote.interceptors;

import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import ek.a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import mx.openpay.library.domain.repository.AuthTokenRepository;
import okhttp3.Authenticator;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JwtOpenPayAuthenticator.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lmx/openpay/library/data/datasource/remote/interceptors/JwtOpenPayAuthenticator;", "Lokhttp3/Authenticator;", "tokenRepository", "Lmx/openpay/library/domain/repository/AuthTokenRepository;", "(Lmx/openpay/library/domain/repository/AuthTokenRepository;)V", NaturalAuthenticationCommandFactory.ACTION_AUTHENTICATE, "Lokhttp3/Request;", "route", "Lokhttp3/Route;", DigipassManagerConstants.KEY_RESPONSE, "Lokhttp3/Response;", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class JwtOpenPayAuthenticator implements Authenticator {

    @NotNull
    private final AuthTokenRepository tokenRepository;

    /* JADX INFO: renamed from: mx.openpay.library.data.datasource.remote.interceptors.JwtOpenPayAuthenticator$authenticate$1, reason: invalid class name */
    /* JADX INFO: compiled from: JwtOpenPayAuthenticator.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lokhttp3/Request;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "mx.openpay.library.data.datasource.remote.interceptors.JwtOpenPayAuthenticator$authenticate$1", f = "JwtOpenPayAuthenticator.kt", i = {1}, l = {22, 25}, m = "invokeSuspend", n = {"newToken"}, s = {"L$0"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Request>, Object> {
        final /* synthetic */ Response $response;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Response response, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$response = response;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return JwtOpenPayAuthenticator.this.new AnonymousClass1(this.$response, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            String str;
            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str = (String) this.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    return this.$response.request().newBuilder().header("Authorization", "Bearer " + str).build();
                }
                ResultKt.throwOnFailure(obj);
                AuthTokenRepository authTokenRepository = JwtOpenPayAuthenticator.this.tokenRepository;
                this.label = 1;
                obj = authTokenRepository.getLastJwtToken(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                String str2 = (String) obj;
                if (str2.length() <= 0) {
                    return null;
                }
                AuthTokenRepository authTokenRepository2 = JwtOpenPayAuthenticator.this.tokenRepository;
                this.L$0 = str2;
                this.label = 2;
                if (authTokenRepository2.saveJwtToken(str2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str = str2;
                return this.$response.request().newBuilder().header("Authorization", "Bearer " + str).build();
            } catch (Exception e5) {
                e5.printStackTrace();
                return null;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Request> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public JwtOpenPayAuthenticator(@NotNull AuthTokenRepository tokenRepository) {
        Intrinsics.checkNotNullParameter(tokenRepository, "tokenRepository");
        this.tokenRepository = tokenRepository;
    }

    @Override // okhttp3.Authenticator
    @Nullable
    public Request authenticate(@Nullable Route route, @NotNull Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return (Request) BuildersKt__BuildersKt.runBlocking$default(null, new AnonymousClass1(response, null), 1, null);
    }
}
