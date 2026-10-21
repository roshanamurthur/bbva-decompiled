package b;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import mx.openpay.library.core.bluetooth.BluetoothController;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BluetoothController f24730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BluetoothController.AnonymousClass1 f24731b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(BluetoothController bluetoothController, BluetoothController.AnonymousClass1 anonymousClass1) {
        super(1);
        this.f24730a = bluetoothController;
        this.f24731b = anonymousClass1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f24730a.onPlansModalResponse(((Number) obj).intValue(), this.f24731b);
        return Unit.INSTANCE;
    }
}
