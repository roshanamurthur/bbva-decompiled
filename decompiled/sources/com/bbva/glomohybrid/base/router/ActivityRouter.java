package com.bbva.glomohybrid.base.router;

import android.app.Activity;
import android.os.Bundle;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomohybrid.base.Animation;
import com.bbva.glomohybrid.base.R;
import com.bbva.glomoutils.mobileservices.MobileServices;
import com.bbva.notifications.model.constants.BanxicoConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ActivityRouter.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\rH&J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\rH&J0\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bH&J0\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\r2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u001d\u001a\u00020\u001eH&J&\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\r2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010!\u001a\u00020\"H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006#"}, d2 = {"Lcom/bbva/glomohybrid/base/router/ActivityRouter;", "", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "destination", "Ljava/lang/Class;", "getDestination", "()Ljava/lang/Class;", "launchApp", "", "packageName", "", "mobileServices", "Lcom/bbva/glomoutils/mobileservices/MobileServices;", "launchDialer", "phone", "launchExternalWebView", "url", "navigateTo", "route", "animation", "Lcom/bbva/glomohybrid/base/Animation;", "params", "Landroid/os/Bundle;", "parcel", "Lcom/bbva/glomohybrid/base/router/IntentExtra$Parcel;", "openWeb", "loadingLayoutId", "", "webNavigationTo", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "skipHistory", "", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ActivityRouter {

    /* JADX INFO: compiled from: ActivityRouter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void navigateTo$default(ActivityRouter activityRouter, String str, Animation animation, Bundle EMPTY, IntentExtra.Parcel parcel, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateTo");
            }
            if ((i10 & 2) != 0) {
                animation = Animation.Fade.INSTANCE;
            }
            if ((i10 & 4) != 0) {
                EMPTY = Bundle.EMPTY;
                Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
            }
            if ((i10 & 8) != 0) {
                parcel = null;
            }
            activityRouter.navigateTo(str, animation, EMPTY, parcel);
        }

        public static /* synthetic */ void openWeb$default(ActivityRouter activityRouter, String str, Object obj, Animation animation, int i10, int i11, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openWeb");
            }
            if ((i11 & 2) != 0) {
                obj = null;
            }
            if ((i11 & 4) != 0) {
                animation = Animation.Fade.INSTANCE;
            }
            if ((i11 & 8) != 0) {
                i10 = R.layout.loading_animation;
            }
            activityRouter.openWeb(str, obj, animation, i10);
        }

        public static /* synthetic */ void webNavigationTo$default(ActivityRouter activityRouter, String str, Object obj, boolean z10, int i10, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: webNavigationTo");
            }
            if ((i10 & 2) != 0) {
                obj = null;
            }
            if ((i10 & 4) != 0) {
                z10 = false;
            }
            activityRouter.webNavigationTo(str, obj, z10);
        }
    }

    @NotNull
    Activity getActivity();

    @Nullable
    Class<Activity> getDestination();

    void launchApp(@NotNull String packageName, @NotNull MobileServices mobileServices);

    void launchDialer(@NotNull String phone);

    void launchExternalWebView(@NotNull String url);

    void navigateTo(@NotNull String route, @NotNull Animation animation, @NotNull Bundle params, @Nullable IntentExtra.Parcel parcel);

    void openWeb(@NotNull String route, @Nullable Object params, @NotNull Animation animation, int loadingLayoutId);

    void webNavigationTo(@NotNull String route, @Nullable Object payload, boolean skipHistory);
}
