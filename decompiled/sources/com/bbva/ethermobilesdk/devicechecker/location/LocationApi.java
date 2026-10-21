package com.bbva.ethermobilesdk.devicechecker.location;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import bk.d;
import bk.w;
import com.bbva.ethermobilesdk.devicechecker.common.util.SystemBuild;
import com.bbva.ethermobilesdk.devicechecker.extension.ContextKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LocationApi.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\f"}, d2 = {"Lcom/bbva/ethermobilesdk/devicechecker/location/LocationApi;", "", "", "isAnyMockLocationAppInstalled", "Landroid/location/Location;", "location", "isLocationFromMockProvider", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "devicechecker_release"}, k = 1, mv = {1, 8, 0})
public final class LocationApi {

    @NotNull
    public static final String ACCESS_MOCK_LOCATION_PERMISSION = "android.permission.ACCESS_MOCK_LOCATION";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f29446a;

    public LocationApi(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f29446a = context;
    }

    public final boolean isAnyMockLocationAppInstalled() {
        Object objM5535constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(Boolean.valueOf(!ContextKt.permissionsByApp(this.f29446a, d.listOf(w.hashSetOf(ACCESS_MOCK_LOCATION_PERMISSION))).isEmpty()));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
            objM5535constructorimpl = bool;
        }
        return ((Boolean) objM5535constructorimpl).booleanValue();
    }

    @SuppressLint({"NewApi"})
    public final boolean isLocationFromMockProvider(@NotNull Location location) {
        Intrinsics.checkNotNullParameter(location, "location");
        SystemBuild systemBuild = SystemBuild.INSTANCE;
        return systemBuild.getVersion() >= systemBuild.getVersionCodesAndroidS() ? location.isMock() : location.isFromMockProvider();
    }
}
