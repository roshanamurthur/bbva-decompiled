package b;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import mx.openpay.library.core.bluetooth.BluetoothController;
import mx.openpay.library.domain.model.common.ChargeCallbackStates;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BluetoothController f24727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChargeCallbackStates f24728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BluetoothController.AnonymousClass1 f24729c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(BluetoothController bluetoothController, ChargeCallbackStates chargeCallbackStates, BluetoothController.AnonymousClass1 anonymousClass1) {
        super(1);
        this.f24727a = bluetoothController;
        this.f24728b = chargeCallbackStates;
        this.f24729c = anonymousClass1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f24727a.onPointsModalResponse(((ChargeCallbackStates.Eglobal.PayWithPoints) this.f24728b).getCreateCharge(), this.f24729c, ((Boolean) obj).booleanValue());
        return Unit.INSTANCE;
    }
}
