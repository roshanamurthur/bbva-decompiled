package com.veridas.resource;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidResourcesUtil.kt */
/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\t"}, d2 = {"Lcom/veridas/resource/AndroidResourcesUtil;", "", "()V", "bytesToBitmap", "Landroid/graphics/Bitmap;", "bytes", "", "bytesToString", "", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AndroidResourcesUtil {

    @NotNull
    public static final AndroidResourcesUtil INSTANCE = new AndroidResourcesUtil();

    private AndroidResourcesUtil() {
    }

    @JvmStatic
    @Nullable
    public static final Bitmap bytesToBitmap(@Nullable byte[] bytes) {
        if (bytes != null) {
            return BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
        }
        return null;
    }

    @JvmStatic
    @Nullable
    public static final String bytesToString(@Nullable byte[] bytes) {
        if (bytes != null) {
            return new String(bytes, Charsets.UTF_8);
        }
        return null;
    }
}
