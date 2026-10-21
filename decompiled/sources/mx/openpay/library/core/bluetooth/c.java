package mx.openpay.library.core.bluetooth;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import mx.openpay.library.domain.model.CreateCharge;
import mx.openpay.library.domain.model.common.ChargeCallback;
import mx.openpay.library.domain.util.Result;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f83521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BluetoothController f83522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CreateCharge f83523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ChargeCallback f83524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f83525e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(BluetoothController bluetoothController, CreateCharge createCharge, ChargeCallback chargeCallback, boolean z10, Continuation continuation) {
        super(2, continuation);
        this.f83522b = bluetoothController;
        this.f83523c = createCharge;
        this.f83524d = chargeCallback;
        this.f83525e = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f83522b, this.f83523c, this.f83524d, this.f83525e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f83521a;
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
        mx.openpay.library.domain.bluetooth.BluetoothController bluetoothController = this.f83522b.getBluetoothController();
        CreateCharge createCharge = this.f83523c;
        ChargeCallback chargeCallback = this.f83524d;
        boolean z10 = this.f83525e;
        this.f83521a = 1;
        obj = bluetoothController.createChargeEglobalPointsStep(createCharge, chargeCallback, z10, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        BluetoothController.Companion companion = BluetoothController.INSTANCE;
        this.f83521a = 2;
        if (companion.evalChargeResult((Result) obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
