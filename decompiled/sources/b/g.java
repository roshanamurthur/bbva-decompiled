package b;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import mx.openpay.library.core.bluetooth.BluetoothController;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f24741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BluetoothController f24742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24743c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(BluetoothController bluetoothController, Continuation continuation) {
        super(continuation);
        this.f24742b = bluetoothController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24741a = obj;
        this.f24743c |= Integer.MIN_VALUE;
        return this.f24742b.startDeviceConnection(null, this);
    }
}
