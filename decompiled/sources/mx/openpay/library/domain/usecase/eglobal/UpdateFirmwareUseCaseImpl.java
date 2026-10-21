package mx.openpay.library.domain.usecase.eglobal;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.domain.bluetooth.BluetoothController;
import mx.openpay.library.domain.util.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: UpdateFirmwareUseCase.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096Bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lmx/openpay/library/domain/usecase/eglobal/UpdateFirmwareUseCaseImpl;", "Lmx/openpay/library/domain/usecase/eglobal/UpdateFirmwareUseCase;", "Lmx/openpay/library/domain/bluetooth/BluetoothController;", "bluetoothController", "Lmx/openpay/library/domain/util/Result;", "", "invoke", "(Lmx/openpay/library/domain/bluetooth/BluetoothController;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmx/openpay/library/domain/usecase/eglobal/GetFirmwareUseCase;", "getFirmwareUseCase", "<init>", "(Lmx/openpay/library/domain/usecase/eglobal/GetFirmwareUseCase;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final class UpdateFirmwareUseCaseImpl implements UpdateFirmwareUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final GetFirmwareUseCase f84260a;

    /* JADX INFO: compiled from: UpdateFirmwareUseCase.kt */
    @DebugMetadata(c = "mx.openpay.library.domain.usecase.eglobal.UpdateFirmwareUseCaseImpl", f = "UpdateFirmwareUseCase.kt", i = {0}, l = {16, 18}, m = "invoke", n = {"bluetoothController"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public BluetoothController f84261p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f84262q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f84264s0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f84262q0 = obj;
            this.f84264s0 |= Integer.MIN_VALUE;
            return UpdateFirmwareUseCaseImpl.this.invoke(null, this);
        }
    }

    public UpdateFirmwareUseCaseImpl(@NotNull GetFirmwareUseCase getFirmwareUseCase) {
        Intrinsics.checkNotNullParameter(getFirmwareUseCase, "getFirmwareUseCase");
        this.f84260a = getFirmwareUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mx.openpay.library.domain.usecase.eglobal.UpdateFirmwareUseCase
    @Nullable
    public Object invoke(@NotNull BluetoothController bluetoothController, @NotNull Continuation<? super Result<Boolean>> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f84264s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f84264s0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objInvoke = aVar.f84262q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f84264s0;
        if (i11 != 0) {
            if (i11 == 1) {
                bluetoothController = aVar.f84261p0;
                ResultKt.throwOnFailure(objInvoke);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objInvoke);
            }
        }
        ResultKt.throwOnFailure(objInvoke);
        aVar.f84261p0 = bluetoothController;
        aVar.f84264s0 = 1;
        objInvoke = this.f84260a.invoke(aVar);
        if (objInvoke == coroutine_suspended) {
            return coroutine_suspended;
        }
        Result result = (Result) objInvoke;
        if (!(result instanceof Result.Success)) {
            if (result instanceof Result.Failure) {
                return result;
            }
            throw new NoWhenBranchMatchedException();
        }
        byte[] bArr = (byte[]) mx.openpay.library.domain.util.ResultKt.getSuccessData(result);
        aVar.f84261p0 = null;
        aVar.f84264s0 = 2;
        objInvoke = bluetoothController.sendFile(bArr, aVar);
        return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
    }
}
