package com.bbva.glomohybrid;

import android.os.Build;
import androidx.camera.core.impl.utils.c;
import androidx.constraintlayout.core.parser.a;
import com.bbva.tohu.android.product.valkyria.sdk.logic.ReplenishLogic;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: UserAgent.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/glomohybrid/UserAgent;", "", "()V", "retrieve", "", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class UserAgent {

    @NotNull
    public static final UserAgent INSTANCE = new UserAgent();

    @NotNull
    public final String retrieve() {
        String upperCase = BuildConfig.COUNTRY_CODE.toUpperCase();
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        String str = Build.VERSION.RELEASE;
        return c.b(a.c("GLOMO_", upperCase, "/25.50.19 (Android;", str, ReplenishLogic.ID_SEPARATOR), Build.MANUFACTURER, " ", Build.MODEL, ")");
    }
}
