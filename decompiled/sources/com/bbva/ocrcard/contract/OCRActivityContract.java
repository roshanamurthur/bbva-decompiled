package com.bbva.ocrcard.contract;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ocrcard.command.params.ScanParams;
import com.bbva.ocrcard.extension.CreditCardKt;
import com.bbva.ocrcard.extension.ScanParamsKt;
import io.card.payment.CardIOActivity;
import io.card.payment.CreditCard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: OCRActivityContract.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u000f"}, d2 = {"Lcom/bbva/ocrcard/contract/OCRActivityContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/bbva/ocrcard/command/params/ScanParams;", "Lcom/bbva/ethermobile/help/kit/result/Result;", "Lio/card/payment/CreditCard;", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", "intent", "ocrcard_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class OCRActivityContract extends ActivityResultContract<ScanParams, Result<CreditCard>> {
    @Override // androidx.activity.result.contract.ActivityResultContract
    @NotNull
    public Intent createIntent(@NotNull Context context, @NotNull ScanParams input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent intent = new Intent(context, (Class<?>) CardIOActivity.class);
        intent.putExtras(ScanParamsKt.toIntent(input));
        return intent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.activity.result.contract.ActivityResultContract
    @Nullable
    public Result<CreditCard> parseResult(int resultCode, @Nullable Intent intent) {
        CreditCard creditCard;
        if (resultCode != CardIOActivity.RESULT_CARD_INFO) {
            return resultCode == 0 ? new Result.Error(CardRecognizerCanceled.INSTANCE) : new Result.Error(new Exception());
        }
        if (intent == null || (creditCard = (CreditCard) intent.getParcelableExtra(CardIOActivity.EXTRA_SCAN_RESULT)) == null) {
            return null;
        }
        return CreditCardKt.toCreditCardResult(creditCard);
    }
}
