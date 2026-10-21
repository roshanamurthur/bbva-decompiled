package com.bbva.ethermobilesdk.deviceinfo;

import android.content.Context;
import com.bbva.appsflyer.DeepLinkListenerAdapter;
import com.bbva.ethermobilesdk.deviceinfo.component.Application;
import com.bbva.ethermobilesdk.deviceinfo.component.FileSystem;
import com.bbva.ethermobilesdk.deviceinfo.component.Hardware;
import com.bbva.ethermobilesdk.deviceinfo.component.Locale;
import com.bbva.ethermobilesdk.deviceinfo.component.Network;
import com.bbva.ethermobilesdk.deviceinfo.component.Screen;
import com.bbva.ethermobilesdk.deviceinfo.component.Sys;
import com.bbva.ethermobilesdk.deviceinfo.component.Time;
import com.bbva.nativesettings.common.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DeviceInfo.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b8\u00109R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010%\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010+\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u00101\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u00107\u001a\u0002028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106¨\u0006:"}, d2 = {"Lcom/bbva/ethermobilesdk/deviceinfo/DeviceInfo;", "", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "Lcom/bbva/ethermobilesdk/deviceinfo/component/Application;", "b", "Lcom/bbva/ethermobilesdk/deviceinfo/component/Application;", "getApplication", "()Lcom/bbva/ethermobilesdk/deviceinfo/component/Application;", Constants.APPLICATION, "Lcom/bbva/ethermobilesdk/deviceinfo/component/FileSystem;", "c", "Lcom/bbva/ethermobilesdk/deviceinfo/component/FileSystem;", "getFileSystem", "()Lcom/bbva/ethermobilesdk/deviceinfo/component/FileSystem;", "fileSystem", "Lcom/bbva/ethermobilesdk/deviceinfo/component/Hardware;", "d", "Lcom/bbva/ethermobilesdk/deviceinfo/component/Hardware;", "getHardware", "()Lcom/bbva/ethermobilesdk/deviceinfo/component/Hardware;", "hardware", "Lcom/bbva/ethermobilesdk/deviceinfo/component/Locale;", "e", "Lcom/bbva/ethermobilesdk/deviceinfo/component/Locale;", "getLocale", "()Lcom/bbva/ethermobilesdk/deviceinfo/component/Locale;", "locale", "Lcom/bbva/ethermobilesdk/deviceinfo/component/Network;", "f", "Lcom/bbva/ethermobilesdk/deviceinfo/component/Network;", "getNetwork", "()Lcom/bbva/ethermobilesdk/deviceinfo/component/Network;", DeepLinkListenerAdapter.Constants.ERROR_NETWORK, "Lcom/bbva/ethermobilesdk/deviceinfo/component/Screen;", "g", "Lcom/bbva/ethermobilesdk/deviceinfo/component/Screen;", "getScreen", "()Lcom/bbva/ethermobilesdk/deviceinfo/component/Screen;", "screen", "Lcom/bbva/ethermobilesdk/deviceinfo/component/Sys;", "h", "Lcom/bbva/ethermobilesdk/deviceinfo/component/Sys;", "getSystem", "()Lcom/bbva/ethermobilesdk/deviceinfo/component/Sys;", "system", "Lcom/bbva/ethermobilesdk/deviceinfo/component/Time;", "i", "Lcom/bbva/ethermobilesdk/deviceinfo/component/Time;", "getTime", "()Lcom/bbva/ethermobilesdk/deviceinfo/component/Time;", "time", "<init>", "(Landroid/content/Context;)V", "deviceinfo_release"}, k = 1, mv = {1, 8, 0})
public final class DeviceInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Application application;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final FileSystem fileSystem;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Hardware hardware;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Locale locale;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Network network;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Screen screen;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Sys system;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Time time;

    public DeviceInfo(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.application = new Application(context);
        this.fileSystem = new FileSystem(context);
        this.hardware = new Hardware(context);
        this.locale = new Locale(context);
        this.network = new Network(context);
        this.screen = new Screen(context);
        this.system = new Sys(context);
        this.time = new Time(context);
    }

    @NotNull
    public final Application getApplication() {
        return this.application;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final FileSystem getFileSystem() {
        return this.fileSystem;
    }

    @NotNull
    public final Hardware getHardware() {
        return this.hardware;
    }

    @NotNull
    public final Locale getLocale() {
        return this.locale;
    }

    @NotNull
    public final Network getNetwork() {
        return this.network;
    }

    @NotNull
    public final Screen getScreen() {
        return this.screen;
    }

    @NotNull
    public final Sys getSystem() {
        return this.system;
    }

    @NotNull
    public final Time getTime() {
        return this.time;
    }
}
