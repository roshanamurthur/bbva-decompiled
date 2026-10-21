package com.bbva.ethermobilesdk.deviceinfo.component;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.provider.Settings;
import android.util.DisplayMetrics;
import com.bbva.ethermobilesdk.deviceinfo.data.Orientation;
import com.bbva.ethermobilesdk.deviceinfo.data.ScreenDimensions;
import com.bbva.ethermobilesdk.deviceinfo.utils.extension.DisplayMetricsKt;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Screen.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0007\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0012\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, d2 = {"Lcom/bbva/ethermobilesdk/deviceinfo/component/Screen;", "", "Lcom/bbva/ethermobilesdk/deviceinfo/data/ScreenDimensions;", "b", "Lkotlin/Lazy;", "getDimensions", "()Lcom/bbva/ethermobilesdk/deviceinfo/data/ScreenDimensions;", "dimensions", "", "getBrightnessLevel", "()I", "brightnessLevel", "", "isLocked", "()Z", "Lcom/bbva/ethermobilesdk/deviceinfo/data/Orientation;", "getOrientation", "()Lcom/bbva/ethermobilesdk/deviceinfo/data/Orientation;", "orientation", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "deviceinfo_release"}, k = 1, mv = {1, 8, 0})
public final class Screen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f29536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy dimensions;

    /* JADX INFO: compiled from: Screen.kt */
    public static final class a extends Lambda implements Function0<ScreenDimensions> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ScreenDimensions invoke() {
            DisplayMetrics metrics = Screen.this.f29536a.getResources().getDisplayMetrics();
            float f6 = metrics.widthPixels;
            float f10 = metrics.heightPixels;
            double d2 = metrics.density;
            Intrinsics.checkNotNullExpressionValue(metrics, "metrics");
            return new ScreenDimensions(f6, f10, d2, DisplayMetricsKt.scaleFactor(metrics));
        }
    }

    public Screen(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f29536a = context;
        this.dimensions = LazyKt__LazyJVMKt.lazy(new a());
    }

    public final int getBrightnessLevel() {
        try {
            return Settings.System.getInt(this.f29536a.getContentResolver(), "screen_brightness");
        } catch (Exception unused) {
            return -1;
        }
    }

    @NotNull
    public final ScreenDimensions getDimensions() {
        return (ScreenDimensions) this.dimensions.getValue();
    }

    @NotNull
    public final Orientation getOrientation() {
        Configuration configuration;
        Resources resources = this.f29536a.getResources();
        Integer numValueOf = (resources == null || (configuration = resources.getConfiguration()) == null) ? null : Integer.valueOf(configuration.orientation);
        return (numValueOf != null && numValueOf.intValue() == 1) ? Orientation.Portrait : Orientation.Landscape;
    }

    public final boolean isLocked() {
        Object systemService = this.f29536a.getSystemService("keyguard");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.KeyguardManager");
        return ((KeyguardManager) systemService).isKeyguardSecure();
    }
}
