package com.bbva.ethermobilesdk.devicemanager.di;

import android.app.Application;
import android.content.Context;
import com.bbva.ethermobilesdk.devicemanager.data.cipher.repository.JwtSignRepository;
import com.bbva.ethermobilesdk.devicemanager.data.devicechecker.common.repository.DeviceCheckerRepository;
import com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepository;
import com.bbva.ethermobilesdk.devicemanager.data.deviceuid.repository.DeviceUidRepository;
import com.bbva.ethermobilesdk.devicemanager.data.logger.repository.EtherLoggerRepositoryImpl;
import com.bbva.ethermobilesdk.devicemanager.data.permission.repository.PermissionRepository;
import com.bbva.nativesettings.common.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Injector.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010%\u001a\u00020 8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006*"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/di/Injector;", "", "Lcom/bbva/ethermobilesdk/devicemanager/data/logger/repository/EtherLoggerRepositoryImpl;", "a", "Lcom/bbva/ethermobilesdk/devicemanager/data/logger/repository/EtherLoggerRepositoryImpl;", "getLogger", "()Lcom/bbva/ethermobilesdk/devicemanager/data/logger/repository/EtherLoggerRepositoryImpl;", "logger", "Lcom/bbva/ethermobilesdk/devicemanager/data/deviceinfo/repository/DeviceInfoRepository;", "b", "Lcom/bbva/ethermobilesdk/devicemanager/data/deviceinfo/repository/DeviceInfoRepository;", "getDeviceInfoRepository$devicemanager_release", "()Lcom/bbva/ethermobilesdk/devicemanager/data/deviceinfo/repository/DeviceInfoRepository;", "deviceInfoRepository", "Lcom/bbva/ethermobilesdk/devicemanager/data/devicechecker/common/repository/DeviceCheckerRepository;", "c", "Lcom/bbva/ethermobilesdk/devicemanager/data/devicechecker/common/repository/DeviceCheckerRepository;", "getDeviceCheckerRepository$devicemanager_release", "()Lcom/bbva/ethermobilesdk/devicemanager/data/devicechecker/common/repository/DeviceCheckerRepository;", "deviceCheckerRepository", "Lcom/bbva/ethermobilesdk/devicemanager/data/deviceuid/repository/DeviceUidRepository;", "d", "Lcom/bbva/ethermobilesdk/devicemanager/data/deviceuid/repository/DeviceUidRepository;", "getDeviceUidRepository$devicemanager_release", "()Lcom/bbva/ethermobilesdk/devicemanager/data/deviceuid/repository/DeviceUidRepository;", "deviceUidRepository", "Lcom/bbva/ethermobilesdk/devicemanager/data/permission/repository/PermissionRepository;", "e", "Lcom/bbva/ethermobilesdk/devicemanager/data/permission/repository/PermissionRepository;", "getPermissionRepository", "()Lcom/bbva/ethermobilesdk/devicemanager/data/permission/repository/PermissionRepository;", "permissionRepository", "Lcom/bbva/ethermobilesdk/devicemanager/data/cipher/repository/JwtSignRepository;", "f", "Lcom/bbva/ethermobilesdk/devicemanager/data/cipher/repository/JwtSignRepository;", "getCipherJwtSignRepository$devicemanager_release", "()Lcom/bbva/ethermobilesdk/devicemanager/data/cipher/repository/JwtSignRepository;", "cipherJwtSignRepository", "Landroid/app/Application;", Constants.APPLICATION, "<init>", "(Landroid/app/Application;)V", "devicemanager_release"}, k = 1, mv = {2, 0, 0})
public final class Injector {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final EtherLoggerRepositoryImpl logger;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DeviceInfoRepository deviceInfoRepository;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DeviceCheckerRepository deviceCheckerRepository;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DeviceUidRepository deviceUidRepository;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final PermissionRepository permissionRepository;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final JwtSignRepository cipherJwtSignRepository;

    public Injector(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.logger = new EtherLoggerRepositoryImpl();
        Context applicationContext = application.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        DeviceInfoModule deviceInfoModule = new DeviceInfoModule(applicationContext);
        Context applicationContext2 = application.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
        DeviceCheckerModule deviceCheckerModule = new DeviceCheckerModule(applicationContext2);
        this.deviceInfoRepository = deviceInfoModule.provideDeviceInfoRepository$devicemanager_release();
        this.deviceCheckerRepository = deviceCheckerModule.provideDeviceCheckerRepository$devicemanager_release();
        this.deviceUidRepository = new DeviceUidModule(application).provideDeviceUidRepository$devicemanager_release();
        Context applicationContext3 = application.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext3, "getApplicationContext(...)");
        this.permissionRepository = new PermissionModule(applicationContext3).providePermissionRepository$devicemanager_release();
        this.cipherJwtSignRepository = new CipherJwtSignModule().provideCipherJwtSignRepository$devicemanager_release();
    }

    @NotNull
    /* JADX INFO: renamed from: getCipherJwtSignRepository$devicemanager_release, reason: from getter */
    public final JwtSignRepository getCipherJwtSignRepository() {
        return this.cipherJwtSignRepository;
    }

    @NotNull
    /* JADX INFO: renamed from: getDeviceCheckerRepository$devicemanager_release, reason: from getter */
    public final DeviceCheckerRepository getDeviceCheckerRepository() {
        return this.deviceCheckerRepository;
    }

    @NotNull
    /* JADX INFO: renamed from: getDeviceInfoRepository$devicemanager_release, reason: from getter */
    public final DeviceInfoRepository getDeviceInfoRepository() {
        return this.deviceInfoRepository;
    }

    @NotNull
    /* JADX INFO: renamed from: getDeviceUidRepository$devicemanager_release, reason: from getter */
    public final DeviceUidRepository getDeviceUidRepository() {
        return this.deviceUidRepository;
    }

    @NotNull
    public final EtherLoggerRepositoryImpl getLogger() {
        return this.logger;
    }

    @NotNull
    public final PermissionRepository getPermissionRepository() {
        return this.permissionRepository;
    }
}
