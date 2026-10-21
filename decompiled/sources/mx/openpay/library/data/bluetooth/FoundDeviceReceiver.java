package mx.openpay.library.data.bluetooth;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FoundDeviceReceiver.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lmx/openpay/library/data/bluetooth/FoundDeviceReceiver;", "Landroid/content/BroadcastReceiver;", "onDeviceFound", "Lkotlin/Function1;", "Landroid/bluetooth/BluetoothDevice;", "", "(Lkotlin/jvm/functions/Function1;)V", "onReceive", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FoundDeviceReceiver extends BroadcastReceiver {

    @NotNull
    private final Function1<BluetoothDevice, Unit> onDeviceFound;

    /* JADX WARN: Multi-variable type inference failed */
    public FoundDeviceReceiver(@NotNull Function1<? super BluetoothDevice, Unit> onDeviceFound) {
        Intrinsics.checkNotNullParameter(onDeviceFound, "onDeviceFound");
        this.onDeviceFound = onDeviceFound;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @Nullable Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (action != null && action.hashCode() == 1167529923 && action.equals("android.bluetooth.device.action.FOUND")) {
            BluetoothDevice bluetoothDevice = Build.VERSION.SDK_INT >= 33 ? (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE", BluetoothDevice.class) : (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if (bluetoothDevice != null) {
                this.onDeviceFound.invoke(bluetoothDevice);
            }
        }
    }
}
