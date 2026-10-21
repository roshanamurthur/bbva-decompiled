package mx.openpay.library.data.mapper;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.data.bluetooth.eglobal.EglobalDevice;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BluetoothDeviceMapper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¨\u0006\u0003"}, d2 = {"mapToLocalDevice", "Lmx/openpay/library/data/bluetooth/eglobal/EglobalDevice;", "Landroid/bluetooth/BluetoothDevice;", "data_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class BluetoothDeviceMapperKt {
    @SuppressLint({"MissingPermission"})
    @NotNull
    public static final EglobalDevice mapToLocalDevice(@NotNull BluetoothDevice bluetoothDevice) {
        Intrinsics.checkNotNullParameter(bluetoothDevice, "<this>");
        String name = bluetoothDevice.getName();
        Intrinsics.checkNotNullExpressionValue(name, "name");
        String address = bluetoothDevice.getAddress();
        Intrinsics.checkNotNullExpressionValue(address, "address");
        return new EglobalDevice(name, address);
    }
}
