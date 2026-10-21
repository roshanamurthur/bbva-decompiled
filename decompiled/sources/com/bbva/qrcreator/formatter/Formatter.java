package com.bbva.qrcreator.formatter;

import android.graphics.Bitmap;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: formatter.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0005H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/qrcreator/formatter/Formatter;", ExifInterface.GPS_DIRECTION_TRUE, "", "format", AuthConstants.IMAGE, "Landroid/graphics/Bitmap;", "(Landroid/graphics/Bitmap;)Ljava/lang/Object;", "qrcreator_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface Formatter<T> {
    T format(@NotNull Bitmap image);
}
