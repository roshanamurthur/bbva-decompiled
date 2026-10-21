package com.bbva.glomohybrid.base.router;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.bbva.actionlauncher.ActionLauncher;
import com.bbva.actionlauncher.AndroidActionLauncher;
import com.bbva.actionlauncher.ViewValue;
import com.bbva.cellscore.web.WebController;
import com.bbva.cellscore.web.model.to_web.NavigationOptions;
import com.bbva.cellscore.web.model.to_web.WebNavigation;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomohybrid.base.Animation;
import com.bbva.glomohybrid.base.R;
import com.bbva.glomohybrid.base.extensions.MobileServicesExtensionsKt;
import com.bbva.glomoutils.mobileservices.MobileServices;
import com.bbva.notifications.model.constants.BanxicoConstants;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ActivityRouter.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010!\u001a\u00020\u001c\u0012\u0010\b\u0002\u0010'\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\"\u0012\u0006\u0010-\u001a\u00020(¢\u0006\u0004\b.\u0010/J*\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J*\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016J\"\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0002H\u0016J\u0010\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0002H\u0016R\u001a\u0010!\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010'\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010-\u001a\u00020(8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u00060"}, d2 = {"Lcom/bbva/glomohybrid/base/router/DefaultActivityRouter;", "Lcom/bbva/glomohybrid/base/router/ActivityRouter;", "", "route", "Lcom/bbva/glomohybrid/base/Animation;", "animation", "Landroid/os/Bundle;", "params", "Lcom/bbva/glomohybrid/base/router/IntentExtra$Parcel;", "parcel", "", "navigateTo", "", "", "loadingLayoutId", "openWeb", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "", "skipHistory", "webNavigationTo", "packageName", "Lcom/bbva/glomoutils/mobileservices/MobileServices;", "mobileServices", "launchApp", "phone", "launchDialer", "url", "launchExternalWebView", "Landroid/app/Activity;", "a", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Ljava/lang/Class;", "b", "Ljava/lang/Class;", "getDestination", "()Ljava/lang/Class;", "destination", "Lcom/bbva/cellscore/web/WebController;", "c", "Lcom/bbva/cellscore/web/WebController;", "getWebController", "()Lcom/bbva/cellscore/web/WebController;", "webController", "<init>", "(Landroid/app/Activity;Ljava/lang/Class;Lcom/bbva/cellscore/web/WebController;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nActivityRouter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityRouter.kt\ncom/bbva/glomohybrid/base/router/DefaultActivityRouter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,143:1\n1#2:144\n*E\n"})
public final class DefaultActivityRouter implements ActivityRouter {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Activity activity;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Class<Activity> destination;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final WebController webController;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f31481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Lazy f31482e;

    /* JADX INFO: compiled from: ActivityRouter.kt */
    public static final class a extends Lambda implements Function0<AndroidActionLauncher> {
        public a() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final AndroidActionLauncher invoke() {
            Application application = DefaultActivityRouter.this.getActivity().getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
            return new AndroidActionLauncher(application, null, 2, 0 == true ? 1 : 0);
        }
    }

    public DefaultActivityRouter(@NotNull Activity activity, @Nullable Class<Activity> cls, @NotNull WebController webController) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(webController, "webController");
        this.activity = activity;
        this.destination = cls;
        this.webController = webController;
        this.f31481d = "action.glomo.open";
        this.f31482e = LazyKt__LazyJVMKt.lazy(new a());
    }

    @Override // com.bbva.glomohybrid.base.router.ActivityRouter
    @NotNull
    public Activity getActivity() {
        return this.activity;
    }

    @Override // com.bbva.glomohybrid.base.router.ActivityRouter
    @Nullable
    public Class<Activity> getDestination() {
        return this.destination;
    }

    @NotNull
    public final WebController getWebController() {
        return this.webController;
    }

    @Override // com.bbva.glomohybrid.base.router.ActivityRouter
    public void launchApp(@NotNull String packageName, @NotNull MobileServices mobileServices) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(mobileServices, "mobileServices");
        Lazy lazy = this.f31482e;
        if (((ActionLauncher) lazy.getValue()).launchApp(packageName)) {
            return;
        }
        ((ActionLauncher) lazy.getValue()).launchMarket(packageName, MobileServicesExtensionsKt.getPlatformType(mobileServices));
    }

    @Override // com.bbva.glomohybrid.base.router.ActivityRouter
    public void launchDialer(@NotNull String phone) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        ((ActionLauncher) this.f31482e.getValue()).launchDialer(phone);
    }

    @Override // com.bbva.glomohybrid.base.router.ActivityRouter
    public void launchExternalWebView(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        ((ActionLauncher) this.f31482e.getValue()).launchView(new ViewValue.Url(url));
    }

    @Override // com.bbva.glomohybrid.base.router.ActivityRouter
    public void navigateTo(@NotNull String route, @NotNull Animation animation, @NotNull Bundle params, @Nullable IntentExtra.Parcel parcel) {
        Parcelable value;
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(animation, "animation");
        Intrinsics.checkNotNullParameter(params, "params");
        Uri uriBuild = new Uri.Builder().scheme(getActivity().getString(R.string.deep_linking_scheme)).authority(getActivity().getString(R.string.deep_linking_host)).path(route).build();
        Intent intentPutExtras = new Intent(this.f31481d, uriBuild).setPackage(getActivity().getPackageName()).putExtras(params);
        Intrinsics.checkNotNullExpressionValue(intentPutExtras, "putExtras(...)");
        if (parcel != null && (value = parcel.getValue()) != null) {
            intentPutExtras.putExtra(parcel.getKey(), value);
        }
        getActivity().getClass();
        Objects.toString(uriBuild);
        getActivity().startActivity(intentPutExtras, ActivityOptions.makeCustomAnimation(getActivity(), animation.getEnterAnim(), animation.getExitAnim()).toBundle());
    }

    @Override // com.bbva.glomohybrid.base.router.ActivityRouter
    public void openWeb(@NotNull String route, @Nullable Object params, @NotNull Animation animation, int loadingLayoutId) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(animation, "animation");
        if (l.isBlank(route) || getDestination() == null) {
            return;
        }
        this.webController.openWeb(getActivity(), new WebNavigation.Builder().route(route).nativeContainer(new com.bbva.cellscore.web.navigation.Route.Builder().activity(getDestination()).animationIn(animation.getEnterAnim()).animationOut(animation.getExitAnim()).loadingLayout(loadingLayoutId).build()).build(), params);
    }

    @Override // com.bbva.glomohybrid.base.router.ActivityRouter
    public void webNavigationTo(@NotNull String route, @Nullable Object payload, boolean skipHistory) {
        NavigationOptions navigationOptionsSkipHistory;
        Intrinsics.checkNotNullParameter(route, "route");
        if (l.isBlank(route)) {
            return;
        }
        if (skipHistory) {
            navigationOptionsSkipHistory = NavigationOptions.skipHistory(true);
        } else {
            if (skipHistory) {
                throw new NoWhenBranchMatchedException();
            }
            navigationOptionsSkipHistory = null;
        }
        WebController webController = this.webController;
        webController.syncChannels();
        webController.navigateTo(route, payload, navigationOptionsSkipHistory);
    }

    public /* synthetic */ DefaultActivityRouter(Activity activity, Class cls, WebController webController, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity, (i10 & 2) != 0 ? null : cls, webController);
    }
}
