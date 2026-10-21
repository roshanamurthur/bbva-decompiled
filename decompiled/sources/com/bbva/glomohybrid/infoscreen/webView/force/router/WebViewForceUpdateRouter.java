package com.bbva.glomohybrid.infoscreen.webView.force.router;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomohybrid.infoscreen.webView.force.WebViewForceUpdateContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: WebViewForceUpdateRouter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/webView/force/router/WebViewForceUpdateRouter;", "", "()V", "navigate", "", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroid/app/Activity;", NotificationCompat.CATEGORY_NAVIGATION, "Lcom/bbva/glomohybrid/infoscreen/webView/force/WebViewForceUpdateContract$Event$Navigation;", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class WebViewForceUpdateRouter {

    /* JADX INFO: compiled from: WebViewForceUpdateRouter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WebViewForceUpdateContract.Event.Navigation.Type.values().length];
            try {
                iArr[WebViewForceUpdateContract.Event.Navigation.Type.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final void navigate(@NotNull Activity activity, @NotNull WebViewForceUpdateContract.Event.Navigation navigation) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        if (WhenMappings.$EnumSwitchMapping$0[navigation.getType().ordinal()] == 1) {
            ContextCompat.startActivity(activity, new Intent("android.intent.action.VIEW", Uri.parse(navigation.getRoute().getRoute())), null);
        }
    }
}
