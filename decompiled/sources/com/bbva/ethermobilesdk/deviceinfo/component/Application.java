package com.bbva.ethermobilesdk.deviceinfo.component;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.webkit.WebView;
import androidx.webkit.WebViewCompat;
import com.bbva.ethermobilesdk.cipher.factory.HashFactoryKt;
import com.bbva.ethermobilesdk.cipher.utils.EncodingUtilsKt;
import com.bbva.ethermobilesdk.deviceinfo.data.ApplicationVersion;
import com.bbva.ethermobilesdk.deviceinfo.data.ScreenDimensions;
import com.bbva.ethermobilesdk.deviceinfo.data.WebViewVersion;
import com.bbva.ethermobilesdk.deviceinfo.utils.extension.DisplayMetricsKt;
import com.bbva.semaas.model.Properties;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Application.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002R\u0013\u0010\b\u001a\u0004\u0018\u00010\u00058G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u000b\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/bbva/ethermobilesdk/deviceinfo/component/Application;", "", "", "userID", "getCollideFingerprint", "Lcom/bbva/ethermobilesdk/deviceinfo/data/ApplicationVersion;", "getAppVersion", "()Lcom/bbva/ethermobilesdk/deviceinfo/data/ApplicationVersion;", Properties.APP_VERSION, "getAndroidId", "()Ljava/lang/String;", "androidId", "Lcom/bbva/ethermobilesdk/deviceinfo/data/WebViewVersion;", "getWebViewVersion", "()Lcom/bbva/ethermobilesdk/deviceinfo/data/WebViewVersion;", "webViewVersion", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "deviceinfo_release"}, k = 1, mv = {1, 8, 0})
public final class Application {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f29523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f29524b;

    /* JADX INFO: compiled from: Application.kt */
    public static final class a extends Lambda implements Function0<ScreenDimensions> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ScreenDimensions invoke() {
            DisplayMetrics metrics = Application.this.f29523a.getResources().getDisplayMetrics();
            float f6 = metrics.widthPixels;
            float f10 = metrics.heightPixels;
            double d2 = metrics.density;
            Intrinsics.checkNotNullExpressionValue(metrics, "metrics");
            return new ScreenDimensions(f6, f10, d2, DisplayMetricsKt.scaleFactor(metrics));
        }
    }

    public Application(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f29523a = context;
        this.f29524b = LazyKt__LazyJVMKt.lazy(new a());
    }

    @NotNull
    public final String getAndroidId() {
        String string = Settings.Secure.getString(this.f29523a.getApplicationContext().getContentResolver(), "android_id");
        return string == null ? "" : string;
    }

    @SuppressLint({"NewApi"})
    @Nullable
    public final ApplicationVersion getAppVersion() {
        Object objM5535constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            Context context = this.f29523a;
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            String str = packageInfo.versionName;
            Intrinsics.checkNotNullExpressionValue(str, "it.versionName");
            objM5535constructorimpl = Result.m5535constructorimpl(new ApplicationVersion(str, Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
            objM5535constructorimpl = null;
        }
        return (ApplicationVersion) objM5535constructorimpl;
    }

    @NotNull
    public final String getCollideFingerprint(@NotNull String userID) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        String lowerCase = EncodingUtilsKt.toHex$default((byte[]) com.bbva.ethermobile.help.kit.result.ResultKt.getOrThrow(HashFactoryKt.sha256Of(CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.listOf(userID, Build.MANUFACTURER, Build.MODEL, (ScreenDimensions) this.f29524b.getValue()), ";;", null, null, 0, null, null, 62, null))), null, 1, null).toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    @Nullable
    public final WebViewVersion getWebViewVersion() {
        List<String> groupValues;
        Context context = this.f29523a;
        String userAgentString = new WebView(context).getSettings().getUserAgentString();
        if (userAgentString == null) {
            userAgentString = "";
        }
        MatchResult matchResultFind$default = Regex.find$default(new Regex("Chrome/([\\d.]+)"), userAgentString, 0, 2, null);
        String str = (matchResultFind$default == null || (groupValues = matchResultFind$default.getGroupValues()) == null) ? null : groupValues.get(1);
        PackageInfo currentWebViewPackage = WebViewCompat.getCurrentWebViewPackage(context);
        if (currentWebViewPackage == null) {
            return null;
        }
        String str2 = currentWebViewPackage.packageName;
        Intrinsics.checkNotNullExpressionValue(str2, "webViewPackage.packageName");
        String str3 = currentWebViewPackage.versionName;
        Intrinsics.checkNotNullExpressionValue(str3, "webViewPackage.versionName");
        return new WebViewVersion(str2, str3, str);
    }
}
