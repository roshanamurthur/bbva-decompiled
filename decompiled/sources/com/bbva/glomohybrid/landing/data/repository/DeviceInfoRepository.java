package com.bbva.glomohybrid.landing.data.repository;

import com.bbva.ethermobilesdk.deviceinfo.component.Sys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeviceInfoRepository.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0002R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/bbva/glomohybrid/landing/data/repository/DeviceInfoRepository;", "", "", "forceUpdate", "getIsDeviceSecure", "b", "Ljava/lang/Boolean;", "isDeviceSecureCache", "()Ljava/lang/Boolean;", "setDeviceSecureCache", "(Ljava/lang/Boolean;)V", "Lcom/bbva/ethermobilesdk/deviceinfo/component/Sys;", "system", "<init>", "(Lcom/bbva/ethermobilesdk/deviceinfo/component/Sys;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nDeviceInfoRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceInfoRepository.kt\ncom/bbva/glomohybrid/landing/data/repository/DeviceInfoRepository\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,17:1\n1#2:18\n*E\n"})
public final class DeviceInfoRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Sys f32540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Boolean isDeviceSecureCache;

    public DeviceInfoRepository(@NotNull Sys system) {
        Intrinsics.checkNotNullParameter(system, "system");
        this.f32540a = system;
    }

    public static /* synthetic */ boolean getIsDeviceSecure$default(DeviceInfoRepository deviceInfoRepository, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return deviceInfoRepository.getIsDeviceSecure(z10);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0014  */
    public final boolean getIsDeviceSecure(boolean forceUpdate) {
        boolean zIsDeviceSecure;
        Boolean bool = this.isDeviceSecureCache;
        if (bool != null) {
            bool.booleanValue();
            if (!(!forceUpdate)) {
                bool = null;
            }
            if (bool != null) {
                zIsDeviceSecure = bool.booleanValue();
            } else {
                zIsDeviceSecure = this.f32540a.isDeviceSecure();
            }
        } else {
            zIsDeviceSecure = this.f32540a.isDeviceSecure();
        }
        this.isDeviceSecureCache = Boolean.valueOf(zIsDeviceSecure);
        return zIsDeviceSecure;
    }

    @Nullable
    /* JADX INFO: renamed from: isDeviceSecureCache, reason: from getter */
    public final Boolean getIsDeviceSecureCache() {
        return this.isDeviceSecureCache;
    }

    public final void setDeviceSecureCache(@Nullable Boolean bool) {
        this.isDeviceSecureCache = bool;
    }
}
