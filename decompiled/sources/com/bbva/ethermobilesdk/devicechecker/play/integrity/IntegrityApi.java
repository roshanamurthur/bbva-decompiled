package com.bbva.ethermobilesdk.devicechecker.play.integrity;

import android.content.Context;
import com.bbva.ethermobile.help.kit.result.Result;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import com.noknok.android.client.appsdk_plus.IAppSDKPlus;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.tasks.TasksKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: IntegrityApi.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J+\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/bbva/ethermobilesdk/devicechecker/play/integrity/IntegrityApi;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "token", "Lcom/bbva/ethermobile/help/kit/result/Result;", "", IAppSDKPlus.EXTRA_KEY_NONCE, "cloudProjectNumber", "", "(Ljava/lang/String;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "devicechecker-play-integrity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class IntegrityApi {

    @NotNull
    private final Context context;

    /* JADX INFO: compiled from: IntegrityApi.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.devicechecker.play.integrity.IntegrityApi$token$2", f = "IntegrityApi.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<String>>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f29491p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f29492q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Long f29494s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ String f29495t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Long l6, String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f29494s0 = l6;
            this.f29495t0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = IntegrityApi.this.new a(this.f29494s0, this.f29495t0, continuation);
            aVar.f29492q0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<String>> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x003e A[Catch: all -> 0x000f, TryCatch #0 {all -> 0x000f, blocks: (B:5:0x000b, B:21:0x005f, B:12:0x0022, B:15:0x002e, B:18:0x0041, B:17:0x003e), top: B:29:0x0007 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM5535constructorimpl;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f29491p0;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    IntegrityApi integrityApi = IntegrityApi.this;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    IntegrityTokenRequest.Builder builder = IntegrityTokenRequest.builder();
                    Long l6 = this.f29494s0;
                    String str = this.f29495t0;
                    if (l6 != null) {
                        l6.longValue();
                        builder.setCloudProjectNumber(l6.longValue());
                        if (builder.setNonce(str) == null) {
                            builder.setNonce(str);
                        }
                    } else {
                        builder.setNonce(str);
                    }
                    Task<IntegrityTokenResponse> taskRequestIntegrityToken = IntegrityManagerFactory.create(integrityApi.context).requestIntegrityToken(builder.build());
                    Intrinsics.checkNotNullExpressionValue(taskRequestIntegrityToken, "create(context).requestI…ityToken(builder.build())");
                    this.f29491p0 = 1;
                    obj = TasksKt.await(taskRequestIntegrityToken, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                objM5535constructorimpl = kotlin.Result.m5535constructorimpl(new Result.Success(((IntegrityTokenResponse) obj).token()));
            } catch (Throwable th2) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                objM5535constructorimpl = kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
            return thM5538exceptionOrNullimpl == null ? objM5535constructorimpl : new Result.Error(thM5538exceptionOrNullimpl);
        }
    }

    public IntegrityApi(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public static /* synthetic */ Object token$default(IntegrityApi integrityApi, String str, Long l6, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            l6 = null;
        }
        return integrityApi.token(str, l6, continuation);
    }

    @Nullable
    public final Object token(@NotNull String str, @Nullable Long l6, @NotNull Continuation<? super Result<String>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new a(l6, str, null), continuation);
    }
}
