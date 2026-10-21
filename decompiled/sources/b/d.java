package b;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import mx.openpay.library.core.bluetooth.BluetoothController;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f24732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BluetoothController f24733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24734c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(BluetoothController bluetoothController, Continuation continuation) {
        super(continuation);
        this.f24733b = bluetoothController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24732a = obj;
        this.f24734c |= Integer.MIN_VALUE;
        return this.f24733b.executeCharge$library_release(null, null, null, this);
    }
}
