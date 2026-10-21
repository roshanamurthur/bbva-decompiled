package com.bbva.cells.pluginkit.provider;

import android.app.Activity;
import android.app.Application;
import android.webkit.WebView;
import com.bbva.cells.pluginkit.activity.ActivityProvider;
import com.bbva.cells.pluginkit.activity.ActivityWeakReference;
import com.bbva.cells.pluginkit.activity.result.ActivityLauncher;
import com.bbva.cells.pluginkit.activity.result.PluginActivityLauncher;
import com.bbva.cells.pluginkit.permission.PermissionLauncher;
import com.bbva.cells.pluginkit.permission.PluginPermissionLauncher;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PlatformProvider.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lcom/bbva/cells/pluginkit/provider/PlatformProvider;", "", "Landroid/app/Application;", "b", "Landroid/app/Application;", "getApp", "()Landroid/app/Application;", "app", "Landroid/webkit/WebView;", "c", "Landroid/webkit/WebView;", "getWebView", "()Landroid/webkit/WebView;", "webView", "Lcom/bbva/cells/pluginkit/activity/result/ActivityLauncher;", "d", "Lcom/bbva/cells/pluginkit/activity/result/ActivityLauncher;", "getActivityLauncher", "()Lcom/bbva/cells/pluginkit/activity/result/ActivityLauncher;", "activityLauncher", "Lcom/bbva/cells/pluginkit/permission/PermissionLauncher;", "e", "Lcom/bbva/cells/pluginkit/permission/PermissionLauncher;", "getPermissionLauncher", "()Lcom/bbva/cells/pluginkit/permission/PermissionLauncher;", "permissionLauncher", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "startActivity", "<init>", "(Landroid/app/Application;Landroid/webkit/WebView;Landroid/app/Activity;Lcom/bbva/cells/pluginkit/activity/result/ActivityLauncher;Lcom/bbva/cells/pluginkit/permission/PermissionLauncher;)V", "pluginkit_release"}, k = 1, mv = {1, 4, 1})
public final class PlatformProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActivityWeakReference f26851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Application app;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final WebView webView;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ActivityLauncher activityLauncher;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final PermissionLauncher permissionLauncher;

    /* JADX INFO: compiled from: PlatformProvider.kt */
    public static final class a extends Lambda implements Function1<Activity, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Activity activity) {
            Activity it = activity;
            Intrinsics.checkNotNullParameter(it, "it");
            PlatformProvider.this.f26851a.update(it);
            return Unit.INSTANCE;
        }
    }

    public PlatformProvider(@NotNull Application app, @NotNull WebView webView, @Nullable Activity activity, @NotNull ActivityLauncher activityLauncher, @NotNull PermissionLauncher permissionLauncher) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(activityLauncher, "activityLauncher");
        Intrinsics.checkNotNullParameter(permissionLauncher, "permissionLauncher");
        this.app = app;
        this.webView = webView;
        this.activityLauncher = activityLauncher;
        this.permissionLauncher = permissionLauncher;
        ActivityProvider activityProvider = new ActivityProvider();
        this.f26851a = new ActivityWeakReference(activity);
        activityProvider.onNewActivityStarted(new a());
        app.registerActivityLifecycleCallbacks(activityProvider);
    }

    @Nullable
    public final Activity getActivity() {
        return this.f26851a.get();
    }

    @NotNull
    public final ActivityLauncher getActivityLauncher() {
        return this.activityLauncher;
    }

    @NotNull
    public final Application getApp() {
        return this.app;
    }

    @NotNull
    public final PermissionLauncher getPermissionLauncher() {
        return this.permissionLauncher;
    }

    @NotNull
    public final WebView getWebView() {
        return this.webView;
    }

    public /* synthetic */ PlatformProvider(Application application, WebView webView, Activity activity, ActivityLauncher activityLauncher, PermissionLauncher permissionLauncher, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(application, webView, (i10 & 4) != 0 ? null : activity, (i10 & 8) != 0 ? new PluginActivityLauncher() : activityLauncher, (i10 & 16) != 0 ? new PluginPermissionLauncher() : permissionLauncher);
    }
}
