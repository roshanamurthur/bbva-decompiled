package com.bbva.ethermobilesdk.deviceinfo.component;

import android.app.ActivityManager;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.nfc.NfcAdapter;
import android.os.Build;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobilesdk.deviceinfo.data.NFCStatus;
import com.bbva.ethermobilesdk.deviceinfo.data.Ram;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Hardware.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eR\u001b\u0010\u0007\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\n\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0012\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, d2 = {"Lcom/bbva/ethermobilesdk/deviceinfo/component/Hardware;", "", "", "b", "Lkotlin/Lazy;", "getManufacturer", "()Ljava/lang/String;", Constants.manufacturer, "c", "getModel", "model", "", "getBatteryLevel", "()I", "batteryLevel", "Lcom/bbva/ethermobilesdk/deviceinfo/data/NFCStatus;", "getNfcStatus", "()Lcom/bbva/ethermobilesdk/deviceinfo/data/NFCStatus;", "nfcStatus", "", "isBluetooth", "()Z", "isMicrophonePresent", "Lcom/bbva/ethermobilesdk/deviceinfo/data/Ram;", "getRamUsage", "()Lcom/bbva/ethermobilesdk/deviceinfo/data/Ram;", "ramUsage", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "deviceinfo_release"}, k = 1, mv = {1, 8, 0})
public final class Hardware {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f29527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy manufacturer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy model;

    /* JADX INFO: compiled from: Hardware.kt */
    public static final class a extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f29530p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Build.MANUFACTURER;
        }
    }

    /* JADX INFO: compiled from: Hardware.kt */
    public static final class b extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f29531p0 = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Build.MODEL;
        }
    }

    public Hardware(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f29527a = context;
        this.manufacturer = LazyKt__LazyJVMKt.lazy(a.f29530p0);
        this.model = LazyKt__LazyJVMKt.lazy(b.f29531p0);
    }

    public final int getBatteryLevel() {
        Intent intentRegisterReceiver = this.f29527a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return intentRegisterReceiver.getIntExtra("level", -1);
        }
        return -1;
    }

    @NotNull
    public final String getManufacturer() {
        Object value = this.manufacturer.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-manufacturer>(...)");
        return (String) value;
    }

    @NotNull
    public final String getModel() {
        Object value = this.model.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-model>(...)");
        return (String) value;
    }

    @NotNull
    public final NFCStatus getNfcStatus() {
        try {
            return NfcAdapter.getDefaultAdapter(this.f29527a).isEnabled() ? NFCStatus.ON : NFCStatus.OFF;
        } catch (Exception unused) {
            return NFCStatus.NOT_AVAILABLE;
        }
    }

    @Nullable
    public final Ram getRamUsage() {
        ActivityManager activityManager = (ActivityManager) this.f29527a.getSystemService(ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (activityManager == null) {
            return null;
        }
        activityManager.getMemoryInfo(memoryInfo);
        long j10 = memoryInfo.availMem;
        long j11 = memoryInfo.totalMem;
        return new Ram(j10 / 1048576, (j11 - j10) / 1048576, j11 / 1048576);
    }

    public final boolean isBluetooth() {
        BluetoothAdapter adapter;
        try {
            BluetoothManager bluetoothManager = (BluetoothManager) this.f29527a.getSystemService(com.bbva.nativesettings.common.Constants.BLUETOOTH);
            if (bluetoothManager == null || (adapter = bluetoothManager.getAdapter()) == null) {
                return false;
            }
            return adapter.isEnabled();
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean isMicrophonePresent() {
        return this.f29527a.getPackageManager().hasSystemFeature("android.hardware.microphone");
    }
}
