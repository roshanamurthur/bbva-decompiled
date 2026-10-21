package com.bbva.ethermobilesdk.devicemanager.gms.data.devicechecker.playintegrity.repository;

import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.devicechecker.play.integrity.IntegrityApi;
import com.noknok.android.client.appsdk_plus.IAppSDKPlus;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeviceCheckerPlayIntegrityRepositoryImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/gms/data/devicechecker/playintegrity/repository/DeviceCheckerPlayIntegrityRepositoryImpl;", "Lcom/bbva/ethermobilesdk/devicemanager/gms/data/devicechecker/playintegrity/repository/DeviceCheckerPlayIntegrityRepository;", "", IAppSDKPlus.EXTRA_KEY_NONCE, "", "cloudProjectNumber", "Lcom/bbva/ethermobile/help/kit/result/Result;", "integrityToken", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/ethermobilesdk/devicechecker/play/integrity/IntegrityApi;", "playIntegrityApi", "<init>", "(Lcom/bbva/ethermobilesdk/devicechecker/play/integrity/IntegrityApi;)V", "devicemanager-gms_release"}, k = 1, mv = {2, 0, 0})
public final class DeviceCheckerPlayIntegrityRepositoryImpl implements DeviceCheckerPlayIntegrityRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final IntegrityApi f29736a;

    /* JADX INFO: compiled from: DeviceCheckerPlayIntegrityRepositoryImpl.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.devicemanager.gms.data.devicechecker.playintegrity.repository.DeviceCheckerPlayIntegrityRepositoryImpl$integrityToken$2", f = "DeviceCheckerPlayIntegrityRepositoryImpl.kt", i = {}, l = {16}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function1<Continuation<? super String>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f29737p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f29739r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ long f29740s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, long j10, Continuation<? super a> continuation) {
            super(1, continuation);
            this.f29739r0 = str;
            this.f29740s0 = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return DeviceCheckerPlayIntegrityRepositoryImpl.this.new a(this.f29739r0, this.f29740s0, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super String> continuation) {
            return ((a) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f29737p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                IntegrityApi integrityApi = DeviceCheckerPlayIntegrityRepositoryImpl.this.f29736a;
                Long lBoxLong = Boxing.boxLong(this.f29740s0);
                this.f29737p0 = 1;
                obj = integrityApi.token(this.f29739r0, lBoxLong, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return com.bbva.ethermobile.help.kit.result.ResultKt.getOrThrow((Result) obj);
        }
    }

    public DeviceCheckerPlayIntegrityRepositoryImpl(@NotNull IntegrityApi playIntegrityApi) {
        Intrinsics.checkNotNullParameter(playIntegrityApi, "playIntegrityApi");
        this.f29736a = playIntegrityApi;
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.gms.data.devicechecker.playintegrity.repository.DeviceCheckerPlayIntegrityRepository
    @Nullable
    public Object integrityToken(@NotNull String str, long j10, @NotNull Continuation<? super Result<String>> continuation) {
        return com.bbva.ethermobile.help.kit.result.ResultKt.suspendCatching(new a(str, j10, null), continuation);
    }
}
