package mx.openpay.library.data.bluetooth;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BluetoothStateReceiver.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B.\u0012'\u0010\u0002\u001a#\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\u0002\u0010\nJ\u001c\u0010\u000b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R/\u0010\u0002\u001a#\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lmx/openpay/library/data/bluetooth/BluetoothStateReceiver;", "Landroid/content/BroadcastReceiver;", "onStateChanged", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "isConnected", "Landroid/bluetooth/BluetoothDevice;", "", "(Lkotlin/jvm/functions/Function2;)V", "onReceive", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BluetoothStateReceiver extends BroadcastReceiver {

    @NotNull
    private final Function2<Boolean, BluetoothDevice, Unit> onStateChanged;

    /* JADX WARN: Multi-variable type inference failed */
    public BluetoothStateReceiver(@NotNull Function2<? super Boolean, ? super BluetoothDevice, Unit> onStateChanged) {
        Intrinsics.checkNotNullParameter(onStateChanged, "onStateChanged");
        this.onStateChanged = onStateChanged;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0010  */
    @Override // android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @Nullable Intent intent) {
        BluetoothDevice bluetoothDevice;
        if (Build.VERSION.SDK_INT >= 33) {
            if (intent != null) {
                bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE", BluetoothDevice.class);
            } else {
                bluetoothDevice = null;
            }
        } else if (intent != null) {
            bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        } else {
            bluetoothDevice = null;
        }
        String action = intent != null ? intent.getAction() : null;
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode == -301431627) {
                if (action.equals("android.bluetooth.device.action.ACL_CONNECTED")) {
                    Function2<Boolean, BluetoothDevice, Unit> function2 = this.onStateChanged;
                    Boolean bool = Boolean.TRUE;
                    if (bluetoothDevice == null) {
                        return;
                    }
                    function2.invoke(bool, bluetoothDevice);
                    return;
                }
                return;
            }
            if (iHashCode == 1821585647 && action.equals("android.bluetooth.device.action.ACL_DISCONNECTED")) {
                Function2<Boolean, BluetoothDevice, Unit> function3 = this.onStateChanged;
                Boolean bool2 = Boolean.FALSE;
                if (bluetoothDevice == null) {
                    return;
                }
                function3.invoke(bool2, bluetoothDevice);
            }
        }
    }
}
