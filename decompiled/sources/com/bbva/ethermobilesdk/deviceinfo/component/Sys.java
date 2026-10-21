package com.bbva.ethermobilesdk.deviceinfo.component;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;
import com.bbva.ethermobilesdk.deviceinfo.data.Platform;
import com.bbva.ethermobilesdk.deviceinfo.data.SystemProperties;
import com.bbva.ethermobilesdk.deviceinfo.data.SystemTheme;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.google.android.gms.common.GoogleApiAvailability;
import com.salesforce.marketingcloud.storage.db.k;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Sys.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0007\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0010\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/bbva/ethermobilesdk/deviceinfo/component/Sys;", "", "Lcom/bbva/ethermobilesdk/deviceinfo/data/Platform;", "b", "Lkotlin/Lazy;", "getPlatform", "()Lcom/bbva/ethermobilesdk/deviceinfo/data/Platform;", k.a.f65035b, "Lcom/bbva/ethermobilesdk/deviceinfo/data/SystemProperties;", "c", "getProperties", "()Lcom/bbva/ethermobilesdk/deviceinfo/data/SystemProperties;", LogKeysKt.PROPERTIES, "Lcom/bbva/ethermobilesdk/deviceinfo/data/SystemTheme;", "getCurrentTheme", "()Lcom/bbva/ethermobilesdk/deviceinfo/data/SystemTheme;", "currentTheme", "", "isGmsAvailable", "()Z", "isDeviceSecure", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "deviceinfo_release"}, k = 1, mv = {1, 8, 0})
public final class Sys {

    @NotNull
    public static final String OS_VERSION = "os.version";

    @NotNull
    public static final String RUNTIME_NAME = "java.runtime.name";

    @NotNull
    public static final String RUNTIME_VERSION = "java.runtime.version";

    @NotNull
    public static final String VM_NAME = "java.vm.name";

    @NotNull
    public static final String VM_VERSION = "java.vm.version";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f29539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy platform;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy properties;

    /* JADX INFO: compiled from: Sys.kt */
    public static final class a extends Lambda implements Function0<Platform> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f29542p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Platform invoke() {
            String RELEASE = Build.VERSION.RELEASE;
            Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
            return new Platform("ANDROID", RELEASE, String.valueOf(Build.VERSION.SDK_INT));
        }
    }

    /* JADX INFO: compiled from: Sys.kt */
    public static final class b extends Lambda implements Function0<SystemProperties> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f29543p0 = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final SystemProperties invoke() {
            return new SystemProperties(System.getProperty(Sys.OS_VERSION), System.getProperty(Sys.RUNTIME_NAME), System.getProperty(Sys.RUNTIME_VERSION), System.getProperty(Sys.VM_NAME), System.getProperty(Sys.VM_VERSION));
        }
    }

    public Sys(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f29539a = context;
        this.platform = LazyKt__LazyJVMKt.lazy(a.f29542p0);
        this.properties = LazyKt__LazyJVMKt.lazy(b.f29543p0);
    }

    @NotNull
    public final SystemTheme getCurrentTheme() {
        int i10 = this.f29539a.getResources().getConfiguration().uiMode & 48;
        if (i10 != 16) {
            return i10 != 32 ? SystemTheme.UNDEFINED : SystemTheme.DARK;
        }
        return SystemTheme.LIGHT;
    }

    @NotNull
    public final Platform getPlatform() {
        return (Platform) this.platform.getValue();
    }

    @NotNull
    public final SystemProperties getProperties() {
        return (SystemProperties) this.properties.getValue();
    }

    public final boolean isDeviceSecure() {
        Object systemService = this.f29539a.getSystemService("keyguard");
        KeyguardManager keyguardManager = systemService instanceof KeyguardManager ? (KeyguardManager) systemService : null;
        if (keyguardManager != null) {
            return keyguardManager.isDeviceSecure();
        }
        return false;
    }

    public final boolean isGmsAvailable() {
        return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this.f29539a.getApplicationContext()) == 0;
    }
}
