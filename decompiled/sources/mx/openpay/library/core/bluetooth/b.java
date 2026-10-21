package mx.openpay.library.core.bluetooth;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import mx.openpay.library.domain.model.CreateCharge;
import mx.openpay.library.domain.model.common.ChargeCallback;
import mx.openpay.library.domain.util.Result;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f83517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BluetoothController f83518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ChargeCallback f83519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f83520d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(BluetoothController bluetoothController, ChargeCallback chargeCallback, int i10, Continuation continuation) {
        super(2, continuation);
        this.f83518b = bluetoothController;
        this.f83519c = chargeCallback;
        this.f83520d = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.f83518b, this.f83519c, this.f83520d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f83517a;
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
        mx.openpay.library.domain.bluetooth.BluetoothController bluetoothController = this.f83518b.getBluetoothController();
        CreateCharge createCharge = BluetoothController.createCharge;
        if (createCharge == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createCharge");
            createCharge = null;
        }
        ChargeCallback chargeCallback = this.f83519c;
        int i11 = this.f83520d;
        this.f83517a = 1;
        obj = bluetoothController.createChargeEglobalPlansStep(createCharge, chargeCallback, i11, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        BluetoothController.Companion companion = BluetoothController.INSTANCE;
        this.f83517a = 2;
        if (companion.evalChargeResult((Result) obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
