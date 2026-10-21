package mx.openpay.library.core.bluetooth;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.domain.model.CreateCharge;
import mx.openpay.library.domain.util.Result;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f83515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f83516b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, Continuation continuation) {
        super(2, continuation);
        this.f83516b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new a(this.f83516b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new a(this.f83516b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f83515a;
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
        mx.openpay.library.domain.bluetooth.BluetoothController bluetoothController = BluetoothController.controller;
        CreateCharge createCharge = null;
        if (bluetoothController == null) {
            Intrinsics.throwUninitializedPropertyAccessException("controller");
            bluetoothController = null;
        }
        CreateCharge createCharge2 = BluetoothController.createCharge;
        if (createCharge2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createCharge");
        } else {
            createCharge = createCharge2;
        }
        String str = this.f83516b;
        this.f83515a = 1;
        obj = bluetoothController.createChargeEglobalSignStep(createCharge, str, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        BluetoothController.Companion companion = BluetoothController.INSTANCE;
        this.f83515a = 2;
        if (companion.evalChargeResult((Result) obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
