package com.bbva.qr.extension;

import android.app.Activity;
import android.content.Intent;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.qr.model.response.BarcodeResult;
import com.bbva.qr.utils.ConstantsKt;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Barcode.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0002\u0010\t\u001a#\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b*\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"setAsIntentResult", "", "Lcom/google/mlkit/vision/barcode/common/Barcode;", "origin", "Landroid/app/Activity;", "target", "Ljava/lang/Class;", "requestCode", "", "(Lcom/google/mlkit/vision/barcode/common/Barcode;Landroid/app/Activity;Ljava/lang/Class;Ljava/lang/Integer;)V", "toBarcodeResult", "Lcom/bbva/ethermobile/help/kit/result/Result$Success;", "Lcom/bbva/qr/model/response/BarcodeResult;", "(Lcom/google/mlkit/vision/barcode/common/Barcode;Ljava/lang/Integer;)Lcom/bbva/ethermobile/help/kit/result/Result$Success;", "qr_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBarcode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Barcode.kt\ncom/bbva/qr/extension/BarcodeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n1#2:61\n*E\n"})
public final class BarcodeKt {
    public static final void setAsIntentResult(@NotNull Barcode barcode, @NotNull Activity origin, @NotNull Class<?> target, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(barcode, "<this>");
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(target, "target");
        Intent intent = new Intent(origin, target);
        String rawValue = barcode.getRawValue();
        if (rawValue == null) {
            byte[] rBytes = barcode.getRawBytes();
            if (rBytes != null) {
                Intrinsics.checkNotNullExpressionValue(rBytes, "rBytes");
                Charset ISO_8859_1 = StandardCharsets.ISO_8859_1;
                Intrinsics.checkNotNullExpressionValue(ISO_8859_1, "ISO_8859_1");
                rawValue = new String(rBytes, ISO_8859_1);
            } else {
                rawValue = null;
            }
        }
        intent.putExtra("content", rawValue);
        intent.putExtra(ConstantsKt.FRIENDLY_CONTENT, barcode.getDisplayValue());
        intent.putExtra("type", barcode.getFormat());
        intent.putExtra(ConstantsKt.BARCODEVALUEFORMAT, barcode.getValueType());
        intent.putExtra("timestamp", System.currentTimeMillis());
        if (num != null) {
            intent.putExtra(ConstantsKt.REQUEST_CODE, num.intValue());
        }
        origin.setResult(-1, intent);
        origin.finish();
    }

    @NotNull
    public static final Result.Success<BarcodeResult> toBarcodeResult(@NotNull Barcode barcode, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(barcode, "<this>");
        String rawValue = barcode.getRawValue();
        Intrinsics.checkNotNull(rawValue);
        String displayValue = barcode.getDisplayValue();
        Intrinsics.checkNotNull(displayValue);
        return new Result.Success<>(new BarcodeResult(rawValue, displayValue, barcode.getFormat(), barcode.getValueType(), System.currentTimeMillis(), num));
    }

    public static /* synthetic */ Result.Success toBarcodeResult$default(Barcode barcode, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        return toBarcodeResult(barcode, num);
    }
}
