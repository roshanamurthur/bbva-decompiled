package com.bbva.qr.contract;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.qr.activity.ScannerActivity;
import com.bbva.qr.extension.IntentKt;
import com.bbva.qr.model.input.ScannerSettings;
import com.bbva.qr.model.response.BarcodeResult;
import com.bbva.qr.model.response.DetectBarcodeCanceled;
import com.bbva.qr.utils.ConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ScannerActivityContract.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u000f"}, d2 = {"Lcom/bbva/qr/contract/ScannerActivityContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/bbva/qr/model/input/ScannerSettings;", "Lcom/bbva/ethermobile/help/kit/result/Result;", "Lcom/bbva/qr/model/response/BarcodeResult;", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", "intent", "qr_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ScannerActivityContract extends ActivityResultContract<ScannerSettings, Result<BarcodeResult>> {
    @Override // androidx.activity.result.contract.ActivityResultContract
    @NotNull
    public Intent createIntent(@NotNull Context context, @NotNull ScannerSettings input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent intent = new Intent(context, (Class<?>) ScannerActivity.class);
        intent.putExtra(ConstantsKt.QR_INTENT_PARAMS, input);
        return intent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.activity.result.contract.ActivityResultContract
    @NotNull
    public Result<BarcodeResult> parseResult(int resultCode, @Nullable Intent intent) {
        Result<BarcodeResult> resultAsBarcodeResult;
        if (resultCode != -1) {
            return resultCode != 0 ? new Result.Error(new Exception()) : new Result.Error(DetectBarcodeCanceled.INSTANCE);
        }
        return (intent == null || (resultAsBarcodeResult = IntentKt.asBarcodeResult(intent)) == null) ? new Result.Error(new RuntimeException("Result not found")) : resultAsBarcodeResult;
    }
}
