package com.bbva.gp2.android.product.mobilepayment.plugin;

import com.bbva.gp2.android.product.mobilepayment.library.MobilePaymentLib;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MobilePaymentLibInjector.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/bbva/gp2/android/product/mobilepayment/plugin/MobilePaymentLibInjector;", "", "<init>", "()V", "mobilePayment", "Lcom/bbva/gp2/android/product/mobilepayment/library/MobilePaymentLib;", "getMobilePayment", "()Lcom/bbva/gp2/android/product/mobilepayment/library/MobilePaymentLib;", "setMobilePayment", "(Lcom/bbva/gp2/android/product/mobilepayment/library/MobilePaymentLib;)V", "initialize", "", "payments-mobilepayment-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MobilePaymentLibInjector {

    @NotNull
    public static final MobilePaymentLibInjector INSTANCE = new MobilePaymentLibInjector();
    public static MobilePaymentLib mobilePayment;

    private MobilePaymentLibInjector() {
    }

    @NotNull
    public final MobilePaymentLib getMobilePayment() {
        MobilePaymentLib mobilePaymentLib = mobilePayment;
        if (mobilePaymentLib != null) {
            return mobilePaymentLib;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mobilePayment");
        return null;
    }

    public final void initialize(@NotNull MobilePaymentLib mobilePayment2) {
        Intrinsics.checkNotNullParameter(mobilePayment2, "mobilePayment");
        setMobilePayment(mobilePayment2);
    }

    public final void setMobilePayment(@NotNull MobilePaymentLib mobilePaymentLib) {
        Intrinsics.checkNotNullParameter(mobilePaymentLib, "<set-?>");
        mobilePayment = mobilePaymentLib;
    }
}
