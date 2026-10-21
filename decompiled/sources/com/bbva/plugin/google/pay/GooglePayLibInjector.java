package com.bbva.plugin.google.pay;

import com.bbva.google.pay.GoogleTapAndPay;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GooglePayLibInjector.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/bbva/plugin/google/pay/GooglePayLibInjector;", "", "()V", "googleTapAndPay", "Lcom/bbva/google/pay/GoogleTapAndPay;", "getGoogleTapAndPay", "()Lcom/bbva/google/pay/GoogleTapAndPay;", "setGoogleTapAndPay", "(Lcom/bbva/google/pay/GoogleTapAndPay;)V", "initialize", "", "google-pay-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GooglePayLibInjector {

    @NotNull
    public static final GooglePayLibInjector INSTANCE = new GooglePayLibInjector();
    public static GoogleTapAndPay googleTapAndPay;

    @NotNull
    public final GoogleTapAndPay getGoogleTapAndPay() {
        GoogleTapAndPay googleTapAndPay2 = googleTapAndPay;
        if (googleTapAndPay2 != null) {
            return googleTapAndPay2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("googleTapAndPay");
        return null;
    }

    public final void initialize(@NotNull GoogleTapAndPay googleTapAndPay2) {
        Intrinsics.checkNotNullParameter(googleTapAndPay2, "googleTapAndPay");
        setGoogleTapAndPay(googleTapAndPay2);
    }

    public final void setGoogleTapAndPay(@NotNull GoogleTapAndPay googleTapAndPay2) {
        Intrinsics.checkNotNullParameter(googleTapAndPay2, "<set-?>");
        googleTapAndPay = googleTapAndPay2;
    }
}
