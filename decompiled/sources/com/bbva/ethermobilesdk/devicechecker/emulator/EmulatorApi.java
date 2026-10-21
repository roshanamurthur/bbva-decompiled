package com.bbva.ethermobilesdk.devicechecker.emulator;

import android.content.Context;
import com.bbva.ethermobilesdk.devicechecker.common.util.SystemBuild;
import com.bbva.ethermobilesdk.devicechecker.extension.ContextKt;
import com.bbva.ethermobilesdk.devicechecker.extension.StringKt;
import com.bbva.ethermobilesdk.devicechecker.util.EtherFile;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EmulatorApi.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0003\u001a\u00020\u0002J\u000f\u0010\u0006\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\u0005J\u001d\u0010\u0010\u001a\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/bbva/ethermobilesdk/devicechecker/emulator/EmulatorApi;", "", "", "isEmulator", "checkBasic$devicechecker_release", "()Z", "checkBasic", "checkAdvanced$devicechecker_release", "checkAdvanced", "checkPackageName$devicechecker_release", "checkPackageName", "", "", "targets", "checkFiles$devicechecker_release", "(Ljava/util/List;)Z", "checkFiles", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "devicechecker_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nEmulatorApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmulatorApi.kt\ncom/bbva/ethermobilesdk/devicechecker/emulator/EmulatorApi\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,136:1\n1747#2,3:137\n*S KotlinDebug\n*F\n+ 1 EmulatorApi.kt\ncom/bbva/ethermobilesdk/devicechecker/emulator/EmulatorApi\n*L\n73#1:137,3\n*E\n"})
public final class EmulatorApi {

    @Deprecated
    @NotNull
    public static final String ANDROID_SDK_BUILT_FOR_X86 = "Android SDK built for x86";

    @Deprecated
    @NotNull
    public static final String DROID4X = "droid4x";

    @Deprecated
    @NotNull
    public static final String EMULATOR = "Emulator";

    @Deprecated
    @NotNull
    public static final String GENERIC = "generic";

    @Deprecated
    @NotNull
    public static final String GENYMOTION = "Genymotion";

    @Deprecated
    @NotNull
    public static final String GOLDFISH = "goldfish";

    @Deprecated
    @NotNull
    public static final String GOOGLE_SDK = "google_sdk";

    @Deprecated
    @NotNull
    public static final String NOX = "nox";

    @Deprecated
    @NotNull
    public static final String SDK = "sdk";

    @Deprecated
    @NotNull
    public static final String SDK_X86 = "sdk_x86";

    @Deprecated
    @NotNull
    public static final String VBOX86 = "vbox86";

    @Deprecated
    @NotNull
    public static final String VBOX86P = "vbox86p";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final List<String> f29426b = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"fstab.andy", "ueventd.andy.rc"});

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final List<String> f29427c = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"/dev/socket/genyd", "/dev/socket/baseband_genyd"});

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final List<String> f29428d = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"fstab.nox", "init.nox.rc", "ueventd.nox.rc"});

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final List<String> f29429e = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"/dev/socket/qemud", "/dev/qemu_pipe"});

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final List<String> f29430f = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"ueventd.android_x86.rc", "x86.prop", "ueventd.ttVM_x86.rc", "init.ttVM_x86.rc", "fstab.ttVM_x86", "fstab.vbox86", "init.vbox86.rc", "ueventd.vbox86.rc"});

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final List<String> f29431g = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"com.google.android.launcher.layouts.genymotion", "com.bluestacks.", "com.bignox.", "com.vphone.", "com.nox.mopen.app", "me.haima.", "cn.itools.", "com.kop.", "com.kaopu.", "com.microvirt."});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f29432a;

    public EmulatorApi(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f29432a = context;
    }

    public final boolean checkAdvanced$devicechecker_release() {
        return checkFiles$devicechecker_release(f29427c) || checkFiles$devicechecker_release(f29426b) || checkFiles$devicechecker_release(f29428d) || checkFiles$devicechecker_release(f29429e) || checkFiles$devicechecker_release(f29430f);
    }

    public final boolean checkBasic$devicechecker_release() {
        SystemBuild systemBuild = SystemBuild.INSTANCE;
        String fingerprint = systemBuild.getFingerprint();
        Intrinsics.checkNotNullExpressionValue(fingerprint, "getFingerprint()");
        if (!l.startsWith$default(fingerprint, GENERIC, false, 2, null)) {
            String model = systemBuild.getModel();
            Intrinsics.checkNotNullExpressionValue(model, "getModel()");
            if (!StringsKt__StringsKt.contains$default((CharSequence) model, (CharSequence) GOOGLE_SDK, false, 2, (Object) null)) {
                String model2 = systemBuild.getModel();
                Intrinsics.checkNotNullExpressionValue(model2, "getModel()");
                if (!StringKt.toLowerCaseContains(model2, DROID4X)) {
                    String model3 = systemBuild.getModel();
                    Intrinsics.checkNotNullExpressionValue(model3, "getModel()");
                    if (!StringsKt__StringsKt.contains$default((CharSequence) model3, (CharSequence) EMULATOR, false, 2, (Object) null)) {
                        String model4 = systemBuild.getModel();
                        Intrinsics.checkNotNullExpressionValue(model4, "getModel()");
                        if (!StringsKt__StringsKt.contains$default((CharSequence) model4, (CharSequence) ANDROID_SDK_BUILT_FOR_X86, false, 2, (Object) null)) {
                            String manufacturer = systemBuild.getManufacturer();
                            Intrinsics.checkNotNullExpressionValue(manufacturer, "getManufacturer()");
                            if (!StringsKt__StringsKt.contains$default((CharSequence) manufacturer, (CharSequence) GENYMOTION, false, 2, (Object) null) && !Intrinsics.areEqual(systemBuild.getHardware(), GOLDFISH) && !Intrinsics.areEqual(systemBuild.getHardware(), VBOX86) && !Intrinsics.areEqual(systemBuild.getProduct(), SDK) && !Intrinsics.areEqual(systemBuild.getProduct(), GOOGLE_SDK) && !Intrinsics.areEqual(systemBuild.getProduct(), SDK_X86) && !Intrinsics.areEqual(systemBuild.getProduct(), VBOX86P)) {
                                String board = systemBuild.getBoard();
                                Intrinsics.checkNotNullExpressionValue(board, "getBoard()");
                                if (!StringKt.toLowerCaseContains(board, NOX)) {
                                    String bootloader = systemBuild.getBootloader();
                                    Intrinsics.checkNotNullExpressionValue(bootloader, "getBootloader()");
                                    if (!StringKt.toLowerCaseContains(bootloader, NOX)) {
                                        String hardware = systemBuild.getHardware();
                                        Intrinsics.checkNotNullExpressionValue(hardware, "getHardware()");
                                        if (!StringKt.toLowerCaseContains(hardware, NOX)) {
                                            String product = systemBuild.getProduct();
                                            Intrinsics.checkNotNullExpressionValue(product, "getProduct()");
                                            if (!StringKt.toLowerCaseContains(product, NOX)) {
                                                String brand = systemBuild.getBrand();
                                                Intrinsics.checkNotNullExpressionValue(brand, "getBrand()");
                                                boolean zStartsWith$default = l.startsWith$default(brand, GENERIC, false, 2, null);
                                                String device = systemBuild.getDevice();
                                                Intrinsics.checkNotNullExpressionValue(device, "getDevice()");
                                                if (!(l.startsWith$default(device, GENERIC, false, 2, null) & zStartsWith$default)) {
                                                    return false;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public final boolean checkFiles$devicechecker_release(@NotNull List<String> targets) {
        Intrinsics.checkNotNullParameter(targets, "targets");
        List<String> list = targets;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (new EtherFile((String) it.next()).exists()) {
                return true;
            }
        }
        return false;
    }

    public final boolean checkPackageName$devicechecker_release() {
        return ContextKt.isPackageInstalledStartWith(this.f29432a, f29431g);
    }

    public final boolean isEmulator() {
        return checkBasic$devicechecker_release() || checkAdvanced$devicechecker_release() || checkPackageName$devicechecker_release();
    }
}
