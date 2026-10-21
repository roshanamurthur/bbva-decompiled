package com.bbva.ethermobilesdk.devicechecker.magisk.permission;

import bk.w;
import bk.x;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MagiskApp.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/bbva/ethermobilesdk/devicechecker/magisk/permission/MagiskApp;", "Lcom/bbva/ethermobilesdk/devicechecker/magisk/permission/MagiskPermission;", "", "()V", "Companion", "Magisk22000", "Magisk24000", "Lcom/bbva/ethermobilesdk/devicechecker/magisk/permission/MagiskApp$Magisk22000;", "Lcom/bbva/ethermobilesdk/devicechecker/magisk/permission/MagiskApp$Magisk24000;", "devicechecker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class MagiskApp implements MagiskPermission<Integer> {

    @NotNull
    public static final String ACCESS_NETWORK_STATE = "android.permission.ACCESS_NETWORK_STATE";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String FOREGROUND_SERVICE = "android.permission.FOREGROUND_SERVICE";

    @NotNull
    public static final String HIDE_OVERLAY_WINDOWS = "android.permission.HIDE_OVERLAY_WINDOWS";

    @NotNull
    public static final String INTERNET = "android.permission.INTERNET";

    @NotNull
    public static final String QUERY_ALL_PACKAGES = "android.permission.QUERY_ALL_PACKAGES";

    @NotNull
    public static final String RECEIVE_BOOT_COMPLETED = "android.permission.RECEIVE_BOOT_COMPLETED";

    @NotNull
    public static final String REQUEST_DELETE_PACKAGES = "android.permission.REQUEST_DELETE_PACKAGES";

    @NotNull
    public static final String REQUEST_INSTALL_PACKAGES = "android.permission.REQUEST_INSTALL_PACKAGES";

    @NotNull
    public static final String UPDATE_PACKAGES_WITHOUT_USER_ACTION = "android.permission.UPDATE_PACKAGES_WITHOUT_USER_ACTION";

    @NotNull
    public static final String USE_BIOMETRIC = "android.permission.USE_BIOMETRIC";

    @NotNull
    public static final String USE_FINGERPRINT = "android.permission.USE_FINGERPRINT";

    @NotNull
    public static final String WAKE_LOCK = "android.permission.WAKE_LOCK";

    @NotNull
    public static final String WRITE_EXTERNAL_STORAGE = "android.permission.WRITE_EXTERNAL_STORAGE";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final HashSet<String> f29485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final HashSet<String> f29486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final HashSet<String> f29487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final HashSet<String> f29488d;

    /* JADX INFO: compiled from: MagiskApp.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R!\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00040\tj\b\u0012\u0004\u0012\u00020\u0004`\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR!\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00040\tj\b\u0012\u0004\u0012\u00020\u0004`\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR!\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00040\tj\b\u0012\u0004\u0012\u00020\u0004`\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR!\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00040\tj\b\u0012\u0004\u0012\u00020\u0004`\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/bbva/ethermobilesdk/devicechecker/magisk/permission/MagiskApp$Companion;", "", "()V", "ACCESS_NETWORK_STATE", "", "FOREGROUND_SERVICE", "HIDE_OVERLAY_WINDOWS", "INTERNET", "MAGISK_22000_PERMISSIONS", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "getMAGISK_22000_PERMISSIONS", "()Ljava/util/HashSet;", "MAGISK_22000_PERMISSIONS_AT_LEAST_29", "getMAGISK_22000_PERMISSIONS_AT_LEAST_29", "MAGISK_24000_PERMISSIONS", "getMAGISK_24000_PERMISSIONS", "MAGISK_24000_PERMISSIONS_AT_LEAST_29", "getMAGISK_24000_PERMISSIONS_AT_LEAST_29", "QUERY_ALL_PACKAGES", "RECEIVE_BOOT_COMPLETED", "REQUEST_DELETE_PACKAGES", "REQUEST_INSTALL_PACKAGES", "UPDATE_PACKAGES_WITHOUT_USER_ACTION", "USE_BIOMETRIC", "USE_FINGERPRINT", "WAKE_LOCK", "WRITE_EXTERNAL_STORAGE", "devicechecker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HashSet<String> getMAGISK_22000_PERMISSIONS() {
            return MagiskApp.f29485a;
        }

        @NotNull
        public final HashSet<String> getMAGISK_22000_PERMISSIONS_AT_LEAST_29() {
            return MagiskApp.f29486b;
        }

        @NotNull
        public final HashSet<String> getMAGISK_24000_PERMISSIONS() {
            return MagiskApp.f29487c;
        }

        @NotNull
        public final HashSet<String> getMAGISK_24000_PERMISSIONS_AT_LEAST_29() {
            return MagiskApp.f29488d;
        }
    }

    /* JADX INFO: compiled from: MagiskApp.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/bbva/ethermobilesdk/devicechecker/magisk/permission/MagiskApp$Magisk22000;", "Lcom/bbva/ethermobilesdk/devicechecker/magisk/permission/MagiskApp;", "()V", "obtainPermissions", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "deviceApiLevel", "", "devicechecker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Magisk22000 extends MagiskApp {

        @NotNull
        public static final Magisk22000 INSTANCE = new Magisk22000();

        public Magisk22000() {
            super(null);
        }

        @Override // com.bbva.ethermobilesdk.devicechecker.magisk.permission.MagiskPermission
        public /* bridge */ /* synthetic */ HashSet obtainPermissions(Integer num) {
            return obtainPermissions(num.intValue());
        }

        @NotNull
        public HashSet<String> obtainPermissions(int deviceApiLevel) {
            return deviceApiLevel < 29 ? MagiskApp.INSTANCE.getMAGISK_22000_PERMISSIONS() : MagiskApp.INSTANCE.getMAGISK_22000_PERMISSIONS_AT_LEAST_29();
        }
    }

    /* JADX INFO: compiled from: MagiskApp.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/bbva/ethermobilesdk/devicechecker/magisk/permission/MagiskApp$Magisk24000;", "Lcom/bbva/ethermobilesdk/devicechecker/magisk/permission/MagiskApp;", "()V", "obtainPermissions", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "deviceApiLevel", "", "devicechecker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Magisk24000 extends MagiskApp {

        @NotNull
        public static final Magisk24000 INSTANCE = new Magisk24000();

        public Magisk24000() {
            super(null);
        }

        @Override // com.bbva.ethermobilesdk.devicechecker.magisk.permission.MagiskPermission
        public /* bridge */ /* synthetic */ HashSet obtainPermissions(Integer num) {
            return obtainPermissions(num.intValue());
        }

        @NotNull
        public HashSet<String> obtainPermissions(int deviceApiLevel) {
            return deviceApiLevel < 29 ? MagiskApp.INSTANCE.getMAGISK_24000_PERMISSIONS() : MagiskApp.INSTANCE.getMAGISK_24000_PERMISSIONS_AT_LEAST_29();
        }
    }

    static {
        HashSet<String> hashSetHashSetOf = w.hashSetOf(REQUEST_DELETE_PACKAGES, INTERNET, ACCESS_NETWORK_STATE, FOREGROUND_SERVICE, REQUEST_INSTALL_PACKAGES, WRITE_EXTERNAL_STORAGE, QUERY_ALL_PACKAGES, USE_BIOMETRIC, USE_FINGERPRINT, WAKE_LOCK, RECEIVE_BOOT_COMPLETED);
        f29485a = hashSetHashSetOf;
        f29486b = CollectionsKt___CollectionsKt.toHashSet(x.minus(hashSetHashSetOf, WRITE_EXTERNAL_STORAGE));
        HashSet<String> hashSetHashSetOf2 = w.hashSetOf(INTERNET, ACCESS_NETWORK_STATE, FOREGROUND_SERVICE, REQUEST_INSTALL_PACKAGES, HIDE_OVERLAY_WINDOWS, UPDATE_PACKAGES_WITHOUT_USER_ACTION, WRITE_EXTERNAL_STORAGE, QUERY_ALL_PACKAGES, USE_BIOMETRIC, USE_FINGERPRINT);
        f29487c = hashSetHashSetOf2;
        f29488d = CollectionsKt___CollectionsKt.toHashSet(x.minus(hashSetHashSetOf2, WRITE_EXTERNAL_STORAGE));
    }

    public MagiskApp() {
    }

    public /* synthetic */ MagiskApp(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
