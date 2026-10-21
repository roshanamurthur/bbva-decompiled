package b;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import mx.openpay.library.core.bluetooth.BluetoothController;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f24738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BluetoothController f24739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24740c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(BluetoothController bluetoothController, Continuation continuation) {
        super(continuation);
        this.f24739b = bluetoothController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24738a = obj;
        this.f24740c |= Integer.MIN_VALUE;
        return this.f24739b.listDevicesScanned(this);
    }
}
