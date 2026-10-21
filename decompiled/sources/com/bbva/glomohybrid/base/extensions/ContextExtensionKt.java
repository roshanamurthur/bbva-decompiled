package com.bbva.glomohybrid.base.extensions;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.annotation.ColorRes;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.viewbinding.ViewBinding;
import androidx.webkit.WebViewCompat;
import bk.p;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomohybrid.base.Animation;
import com.bbva.glomohybrid.base.deeplink.constants.DynamicLinkConstants;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;

/* JADX INFO: compiled from: ContextExtension.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0007\u001a\u0014\u0010\b\u001a\u00020\t*\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\t\u001a\n\u0010\u000b\u001a\u00020\f*\u00020\u0007\u001a\n\u0010\r\u001a\u00020\u0006*\u00020\u0007\u001a\n\u0010\u000e\u001a\u00020\u0004*\u00020\u0007\u001a\u0012\u0010\u000f\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0004\u001a\n\u0010\u0011\u001a\u00020\u0012*\u00020\u0007\u001a6\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0014\"\b\b\u0000\u0010\u0015*\u00020\u0016*\u00020\u00022\u0014\b\u0004\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u0002H\u00150\u0018H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001a"}, d2 = {"activityParameters", "Lorg/koin/core/parameter/ParametersHolder;", "Landroid/app/Activity;", DynamicLinkConstants.COMES_FROM_DEEPLINK_KEY, "", "getApplicationName", "", "Landroid/content/Context;", "getColorCompat", "", "colorId", "getVersionCode", "", "getVersionName", "isAndroidWebViewAvailable", "notificationsAppId", "distinguishByBuildType", "restartApplication", "", "viewBinding", "Lkotlin/Lazy;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/viewbinding/ViewBinding;", "binding", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "Base_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nContextExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextExtension.kt\ncom/bbva/glomohybrid/base/extensions/ContextExtensionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,83:1\n1#2:84\n*E\n"})
public final class ContextExtensionKt {
    @NotNull
    public static final ParametersHolder activityParameters(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        return ParametersHolderKt.parametersOf(p.mapOf(TuplesKt.to(ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, activity)));
    }

    public static final boolean comesFromDeeplink(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Bundle extras = activity.getIntent().getExtras();
        if (extras != null) {
            return extras.getBoolean(DynamicLinkConstants.COMES_FROM_DEEPLINK_KEY);
        }
        return false;
    }

    @NotNull
    public static final String getApplicationName(@NotNull Context context) throws PackageManager.NameNotFoundException {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(context.getPackageName(), 0)).toString();
    }

    public static final int getColorCompat(@NotNull Context context, @ColorRes int i10) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return ContextCompat.getColor(context, i10);
    }

    public static final long getVersionCode(@NotNull Context context) throws PackageManager.NameNotFoundException {
        Intrinsics.checkNotNullParameter(context, "<this>");
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        return Build.VERSION.SDK_INT < 28 ? packageInfo.versionCode : packageInfo.getLongVersionCode();
    }

    @NotNull
    public static final String getVersionName(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        Intrinsics.checkNotNullExpressionValue(str, "with(...)");
        return str;
    }

    public static final boolean isAndroidWebViewAvailable(@NotNull Context context) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            PackageInfo currentWebViewPackage = WebViewCompat.getCurrentWebViewPackage(context);
            String str = currentWebViewPackage != null ? currentWebViewPackage.packageName : null;
            objM5535constructorimpl = Result.m5535constructorimpl(Boolean.valueOf((str == null || str.length() == 0) ? false : true));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5538exceptionOrNullimpl(objM5535constructorimpl) != null) {
            objM5535constructorimpl = Boolean.FALSE;
        }
        return ((Boolean) objM5535constructorimpl).booleanValue();
    }

    @NotNull
    public static final String notificationsAppId(@NotNull Context context, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        String packageName = context.getPackageName();
        if (!z10) {
            packageName = null;
        }
        if (packageName != null) {
            return packageName;
        }
        String packageName2 = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName2, "getPackageName(...)");
        return l.replace$default(packageName2, ".dev", "", false, 4, (Object) null);
    }

    public static final void restartApplication(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        Intrinsics.checkNotNull(launchIntentForPackage);
        Intent intentMakeRestartActivityTask = Intent.makeRestartActivityTask(launchIntentForPackage.getComponent());
        Animation.Fade fade = Animation.Fade.INSTANCE;
        context.startActivity(intentMakeRestartActivityTask, ActivityOptions.makeCustomAnimation(context, fade.getEnterAnim(), fade.getExitAnim()).toBundle());
        Runtime.getRuntime().exit(0);
    }

    @NotNull
    public static final <T extends ViewBinding> Lazy<T> viewBinding(@NotNull final Activity activity, @NotNull final Function1<? super LayoutInflater, ? extends T> binding) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(binding, "binding");
        return LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<T>() { // from class: com.bbva.glomohybrid.base.extensions.ContextExtensionKt.viewBinding.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewBinding invoke() {
                LayoutInflater layoutInflater = activity.getLayoutInflater();
                Intrinsics.checkNotNullExpressionValue(layoutInflater, "getLayoutInflater(...)");
                return (ViewBinding) binding.invoke(layoutInflater);
            }
        });
    }
}
