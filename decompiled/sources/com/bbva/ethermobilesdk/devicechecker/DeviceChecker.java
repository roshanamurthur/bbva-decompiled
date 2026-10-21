package com.bbva.ethermobilesdk.devicechecker;

import android.content.Context;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobilesdk.devicechecker.debug.DebugApi;
import com.bbva.ethermobilesdk.devicechecker.developer.DeveloperApi;
import com.bbva.ethermobilesdk.devicechecker.device.DeviceApi;
import com.bbva.ethermobilesdk.devicechecker.emulator.EmulatorApi;
import com.bbva.ethermobilesdk.devicechecker.frida.FridaApi;
import com.bbva.ethermobilesdk.devicechecker.location.LocationApi;
import com.bbva.ethermobilesdk.devicechecker.magisk.MagiskApi;
import com.bbva.ethermobilesdk.devicechecker.root.RootApi;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeviceChecker.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b@\u0010AB\u001d\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010B¢\u0006\u0004\b@\u0010DR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010%\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010-\u001a\u00020&8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010(\u0012\u0004\b+\u0010,\u001a\u0004\b)\u0010*R\u0017\u00103\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u00109\u001a\u0002048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010?\u001a\u00020:8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006E"}, d2 = {"Lcom/bbva/ethermobilesdk/devicechecker/DeviceChecker;", "", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "Lcom/bbva/ethermobilesdk/devicechecker/debug/DebugApi;", "b", "Lcom/bbva/ethermobilesdk/devicechecker/debug/DebugApi;", "getDebug", "()Lcom/bbva/ethermobilesdk/devicechecker/debug/DebugApi;", com.mastercard.mpsdk.mcbp.mcmlite.BuildConfig.BUILD_TYPE, "Lcom/bbva/ethermobilesdk/devicechecker/emulator/EmulatorApi;", "c", "Lcom/bbva/ethermobilesdk/devicechecker/emulator/EmulatorApi;", "getEmulator", "()Lcom/bbva/ethermobilesdk/devicechecker/emulator/EmulatorApi;", "emulator", "Lcom/bbva/ethermobilesdk/devicechecker/location/LocationApi;", "d", "Lcom/bbva/ethermobilesdk/devicechecker/location/LocationApi;", "getLocation", "()Lcom/bbva/ethermobilesdk/devicechecker/location/LocationApi;", "location", "Lcom/bbva/ethermobilesdk/devicechecker/root/RootApi;", "e", "Lcom/bbva/ethermobilesdk/devicechecker/root/RootApi;", "getRoot", "()Lcom/bbva/ethermobilesdk/devicechecker/root/RootApi;", "root", "Lcom/bbva/ethermobilesdk/devicechecker/frida/FridaApi;", "f", "Lcom/bbva/ethermobilesdk/devicechecker/frida/FridaApi;", "getFrida", "()Lcom/bbva/ethermobilesdk/devicechecker/frida/FridaApi;", "frida", "", "g", "Lkotlin/Unit;", "getSafetyNet", "()Lkotlin/Unit;", "getSafetyNet$annotations", "()V", "safetyNet", "Lcom/bbva/ethermobilesdk/devicechecker/developer/DeveloperApi;", "h", "Lcom/bbva/ethermobilesdk/devicechecker/developer/DeveloperApi;", "getDeveloper", "()Lcom/bbva/ethermobilesdk/devicechecker/developer/DeveloperApi;", "developer", "Lcom/bbva/ethermobilesdk/devicechecker/magisk/MagiskApi;", "i", "Lcom/bbva/ethermobilesdk/devicechecker/magisk/MagiskApi;", "getMagisk", "()Lcom/bbva/ethermobilesdk/devicechecker/magisk/MagiskApi;", "magisk", "Lcom/bbva/ethermobilesdk/devicechecker/device/DeviceApi;", "j", "Lcom/bbva/ethermobilesdk/devicechecker/device/DeviceApi;", "getDevice", "()Lcom/bbva/ethermobilesdk/devicechecker/device/DeviceApi;", Constants.device, "<init>", "(Landroid/content/Context;)V", "", "safetyNetApiKey", "(Landroid/content/Context;Ljava/lang/String;)V", "devicechecker_release"}, k = 1, mv = {1, 8, 0})
public final class DeviceChecker {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DebugApi debug;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final EmulatorApi emulator;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LocationApi location;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final RootApi root;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final FridaApi frida;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Unit safetyNet;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DeveloperApi developer;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MagiskApi magisk;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DeviceApi device;

    public DeviceChecker(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.debug = new DebugApi(context);
        this.emulator = new EmulatorApi(context);
        this.location = new LocationApi(context);
        this.root = new RootApi(context);
        this.frida = new FridaApi();
        this.safetyNet = Unit.INSTANCE;
        this.developer = new DeveloperApi(context);
        this.magisk = new MagiskApi(context);
        this.device = new DeviceApi(context);
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final DebugApi getDebug() {
        return this.debug;
    }

    @NotNull
    public final DeveloperApi getDeveloper() {
        return this.developer;
    }

    @NotNull
    public final DeviceApi getDevice() {
        return this.device;
    }

    @NotNull
    public final EmulatorApi getEmulator() {
        return this.emulator;
    }

    @NotNull
    public final FridaApi getFrida() {
        return this.frida;
    }

    @NotNull
    public final LocationApi getLocation() {
        return this.location;
    }

    @NotNull
    public final MagiskApi getMagisk() {
        return this.magisk;
    }

    @NotNull
    public final RootApi getRoot() {
        return this.root;
    }

    @NotNull
    public final Unit getSafetyNet() {
        return this.safetyNet;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(level = DeprecationLevel.ERROR, message = "SafetyNet Attestation is deprecated. Use the default constructor without API key", replaceWith = @ReplaceWith(expression = "DeviceChecker(context)", imports = {}))
    public DeviceChecker(@NotNull Context context, @Nullable String str) {
        this(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ DeviceChecker(Context context, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : str);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "SafetyNet API is deprecated. Use the standalone module instead")
    public static /* synthetic */ void getSafetyNet$annotations() {
    }
}
