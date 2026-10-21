package mx.openpay.library.domain.usecase.eglobal;

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
import mx.openpay.library.domain.bluetooth.model.eglobal.ConnectedDeviceQ8;
import mx.openpay.library.domain.model.eglobal.Merchant;
import mx.openpay.library.domain.repository.EglobalRepository;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InsertMerchantDetailsUseCase.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096Bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lmx/openpay/library/domain/usecase/eglobal/InsertMerchantDetailsUseCaseImpl;", "Lmx/openpay/library/domain/usecase/eglobal/InsertMerchantDetailsUseCase;", "Lmx/openpay/library/domain/model/eglobal/Merchant;", "merchant", "Lmx/openpay/library/domain/bluetooth/model/eglobal/ConnectedDeviceQ8;", "deviceInfo", "", "isTop", "", "invoke", "(Lmx/openpay/library/domain/model/eglobal/Merchant;Lmx/openpay/library/domain/bluetooth/model/eglobal/ConnectedDeviceQ8;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmx/openpay/library/domain/repository/EglobalRepository;", "repository", "<init>", "(Lmx/openpay/library/domain/repository/EglobalRepository;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final class InsertMerchantDetailsUseCaseImpl implements InsertMerchantDetailsUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final EglobalRepository f84251a;

    /* JADX INFO: compiled from: InsertMerchantDetailsUseCase.kt */
    @DebugMetadata(c = "mx.openpay.library.domain.usecase.eglobal.InsertMerchantDetailsUseCaseImpl$invoke$2", f = "InsertMerchantDetailsUseCase.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f84252p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Merchant f84254r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ ConnectedDeviceQ8 f84255s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ boolean f84256t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Merchant merchant, ConnectedDeviceQ8 connectedDeviceQ8, boolean z10, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f84254r0 = merchant;
            this.f84255s0 = connectedDeviceQ8;
            this.f84256t0 = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return InsertMerchantDetailsUseCaseImpl.this.new a(this.f84254r0, this.f84255s0, this.f84256t0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f84252p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                EglobalRepository eglobalRepository = InsertMerchantDetailsUseCaseImpl.this.f84251a;
                this.f84252p0 = 1;
                if (eglobalRepository.insertLocalMerchantDetails(this.f84254r0, this.f84255s0, this.f84256t0, this) == coroutine_suspended) {
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

    public InsertMerchantDetailsUseCaseImpl(@NotNull EglobalRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f84251a = repository;
    }

    @Override // mx.openpay.library.domain.usecase.eglobal.InsertMerchantDetailsUseCase
    @Nullable
    public Object invoke(@NotNull Merchant merchant, @NotNull ConnectedDeviceQ8 connectedDeviceQ8, boolean z10, @NotNull Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new a(merchant, connectedDeviceQ8, z10, null), continuation);
        return objWithContext == ek.a.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }
}
