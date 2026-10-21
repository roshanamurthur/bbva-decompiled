package com.bbva.gp2.android.product.mobilepayment.library.utils;

import com.bbva.gp2.android.product.mobilepayment.library.MobilePaymentError;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.InitNeededException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Extensions.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0000\u001a\u00020\u0001*\u00060\u0003j\u0002`\u0002¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"toError", "Lcom/bbva/gp2/android/product/mobilepayment/library/MobilePaymentError;", "Lkotlin/Exception;", "Ljava/lang/Exception;", "(Ljava/lang/Exception;)Lcom/bbva/gp2/android/product/mobilepayment/library/MobilePaymentError;", "payments-mobilepayment_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ExtensionsKt {
    @NotNull
    public static final MobilePaymentError toError(@NotNull Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "<this>");
        return exc instanceof InitNeededException ? MobilePaymentError.INIT_CALLED_IS_NEEDED : MobilePaymentError.INTERNAL_ERROR;
    }
}
