package b;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import mx.openpay.library.core.bluetooth.BluetoothController;
import mx.openpay.library.di.DependenciesProvider;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BluetoothController f24726a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(BluetoothController bluetoothController) {
        super(0);
        this.f24726a = bluetoothController;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return DependenciesProvider.INSTANCE.provideBluetoothController(this.f24726a.context, BluetoothController.coroutineScope);
    }
}
