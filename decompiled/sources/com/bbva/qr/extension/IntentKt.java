package com.bbva.qr.extension;

import android.content.Intent;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.qr.model.response.BarcodeResult;
import com.bbva.qr.utils.ConstantsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Intent.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"asBarcodeResult", "Lcom/bbva/ethermobile/help/kit/result/Result;", "Lcom/bbva/qr/model/response/BarcodeResult;", "Landroid/content/Intent;", "qr_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class IntentKt {
    @NotNull
    public static final Result<BarcodeResult> asBarcodeResult(@NotNull Intent intent) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(intent, "<this>");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            String stringExtra = intent.getStringExtra("content");
            Intrinsics.checkNotNull(stringExtra);
            String stringExtra2 = intent.getStringExtra(ConstantsKt.FRIENDLY_CONTENT);
            Intrinsics.checkNotNull(stringExtra2);
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(new Result.Success(new BarcodeResult(stringExtra, stringExtra2, intent.getIntExtra("type", 0), intent.getIntExtra(ConstantsKt.BARCODEVALUEFORMAT, 0), intent.getLongExtra("timestamp", -1L), Integer.valueOf(intent.getIntExtra(ConstantsKt.REQUEST_CODE, -5)))));
        } catch (Throwable th2) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl != null) {
            objM5535constructorimpl = new Result.Error(thM5538exceptionOrNullimpl);
        }
        return (Result) objM5535constructorimpl;
    }
}
