package com.bbva.qrcreator.formatter;

import android.graphics.Bitmap;
import android.util.Base64;
import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: formatter.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bbva/qrcreator/formatter/Base64Formatter;", "Lcom/bbva/qrcreator/formatter/Formatter;", "", "()V", "format", AuthConstants.IMAGE, "Landroid/graphics/Bitmap;", "qrcreator_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Base64Formatter implements Formatter<String> {
    @Override // com.bbva.qrcreator.formatter.Formatter
    @NotNull
    public String format(@NotNull Bitmap image) {
        Intrinsics.checkNotNullParameter(image, "image");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            image.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(it.toByteArray(), Base64.DEFAULT)");
            CloseableKt.closeFinally(byteArrayOutputStream, null);
            return strEncodeToString;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(byteArrayOutputStream, th2);
                throw th3;
            }
        }
    }
}
