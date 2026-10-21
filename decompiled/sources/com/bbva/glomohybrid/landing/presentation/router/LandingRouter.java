package com.bbva.glomohybrid.landing.presentation.router;

import android.app.Activity;
import androidx.core.app.NotificationCompat;
import com.bbva.actionlauncher.ActionLauncher;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomo.router.HybridRouter;
import com.bbva.glomohybrid.base.router.Route;
import com.bbva.glomohybrid.landing.presentation.LandingContract;
import com.bbva.glomohybrid.landing.presentation.model.LandingNavigationPayload;
import com.bbva.glomohybrid.landing.presentation.router.handler.CustomNavigationHandler;
import com.bbva.glomoutils.mobileservices.MobileServices;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LandingRouter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b¨\u0006\u0015"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/router/LandingRouter;", "Lcom/bbva/glomo/router/HybridRouter;", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Event$Navigation;", NotificationCompat.CATEGORY_NAVIGATION, "", "navigate", "", "route", "", "customNavigation", "Lcom/bbva/actionlauncher/ActionLauncher;", "launcher", "", "Lcom/bbva/glomohybrid/landing/presentation/router/handler/CustomNavigationHandler;", "handlers", "Lcom/bbva/glomoutils/mobileservices/MobileServices;", "mobileServices", "<init>", "(Lcom/bbva/actionlauncher/ActionLauncher;Ljava/util/List;Lcom/bbva/glomoutils/mobileservices/MobileServices;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLandingRouter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingRouter.kt\ncom/bbva/glomohybrid/landing/presentation/router/LandingRouter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,54:1\n1#2:55\n*E\n"})
public final class LandingRouter extends HybridRouter {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final List<CustomNavigationHandler> f33084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MobileServices f33085e;

    /* JADX INFO: compiled from: LandingRouter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LandingContract.Event.Navigation.Type.values().length];
            try {
                iArr[LandingContract.Event.Navigation.Type.CUSTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LandingContract.Event.Navigation.Type.WEB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LandingContract.Event.Navigation.Type.DIALER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LandingContract.Event.Navigation.Type.EXTERNAL_APP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LandingContract.Event.Navigation.Type.MARKET.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LandingContract.Event.Navigation.Type.EXTERNAL_WEB_LINK.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[LandingContract.Event.Navigation.Type.NATIVE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LandingRouter(@NotNull ActionLauncher launcher, @NotNull List<? extends CustomNavigationHandler> handlers, @NotNull MobileServices mobileServices) {
        super(launcher, mobileServices);
        Intrinsics.checkNotNullParameter(launcher, "launcher");
        Intrinsics.checkNotNullParameter(handlers, "handlers");
        Intrinsics.checkNotNullParameter(mobileServices, "mobileServices");
        this.f33084d = handlers;
        this.f33085e = mobileServices;
    }

    public final boolean customNavigation(@NotNull Activity activity, @NotNull String route) {
        Object next;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(route, "route");
        Iterator<T> it = this.f33084d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((CustomNavigationHandler) next).getRoute(), route));
        CustomNavigationHandler customNavigationHandler = (CustomNavigationHandler) next;
        if (customNavigationHandler != null) {
            return customNavigationHandler.transformNavigation(activity);
        }
        return false;
    }

    public final void navigate(@NotNull Activity activity, @NotNull LandingContract.Event.Navigation navigation) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        switch (WhenMappings.$EnumSwitchMapping$0[navigation.getType().ordinal()]) {
            case 1:
            case 2:
                webNavigation(activity, navigation.getRoute());
                break;
            case 3:
                openDialer(navigation.getRoute());
                break;
            case 4:
                openExternalApp(navigation.getRoute());
                break;
            case 5:
                openMarket(navigation.getRoute());
                break;
            case 6:
                openExternalLink(navigation.getRoute());
                break;
            case 7:
                Route route = navigation.getRoute();
                boolean clearHistory = navigation.getClearHistory();
                LandingNavigationPayload payload = navigation.getPayload();
                nativeNavigation(activity, route, clearHistory, payload != null ? payload.getData() : null);
                break;
        }
    }
}
