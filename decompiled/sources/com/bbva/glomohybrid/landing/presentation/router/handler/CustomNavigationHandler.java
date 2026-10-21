package com.bbva.glomohybrid.landing.presentation.router.handler;

import android.app.Activity;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CustomNavigationHandler.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/router/handler/CustomNavigationHandler;", "", "route", "", "getRoute", "()Ljava/lang/String;", "transformNavigation", "", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroid/app/Activity;", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface CustomNavigationHandler {
    @NotNull
    String getRoute();

    boolean transformNavigation(@NotNull Activity activity);
}
