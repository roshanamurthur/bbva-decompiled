package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.data.BufferedOutputStream;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.Util;
import com.bumptech.glide.util.pool.GlideTrace;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public class BitmapEncoder implements ResourceEncoder<Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final ArrayPool f38537a;
    public static final Option<Integer> COMPRESSION_QUALITY = Option.memory("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);
    public static final Option<Bitmap.CompressFormat> COMPRESSION_FORMAT = Option.memory("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");

    public BitmapEncoder(@NonNull ArrayPool arrayPool) {
        this.f38537a = arrayPool;
    }

    @Override // com.bumptech.glide.load.ResourceEncoder
    @NonNull
    public EncodeStrategy getEncodeStrategy(@NonNull Options options) {
        return EncodeStrategy.TRANSFORMED;
    }

    @Override // com.bumptech.glide.load.Encoder
    public boolean encode(@NonNull Resource<Bitmap> resource, @NonNull File file, @NonNull Options options) {
        boolean z10;
        Bitmap bitmap = resource.get();
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) options.get(COMPRESSION_FORMAT);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        GlideTrace.beginSectionFormat("encode: [%dx%d] %s", Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), compressFormat);
        try {
            long logTime = LogTime.getLogTime();
            int iIntValue = ((Integer) options.get(COMPRESSION_QUALITY)).intValue();
            OutputStream bufferedOutputStream = null;
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                ArrayPool arrayPool = this.f38537a;
                if (arrayPool != null) {
                    try {
                        bufferedOutputStream = new BufferedOutputStream(fileOutputStream, arrayPool);
                    } catch (IOException unused) {
                        bufferedOutputStream = fileOutputStream;
                        if (bufferedOutputStream != null) {
                            try {
                                bufferedOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        z10 = false;
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedOutputStream = fileOutputStream;
                        if (bufferedOutputStream != null) {
                            try {
                                bufferedOutputStream.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                } else {
                    bufferedOutputStream = fileOutputStream;
                }
                bitmap.compress(compressFormat, iIntValue, bufferedOutputStream);
                bufferedOutputStream.close();
                try {
                    bufferedOutputStream.close();
                } catch (IOException unused4) {
                }
                z10 = true;
            } catch (IOException unused5) {
            } catch (Throwable th3) {
                th = th3;
            }
            if (Log.isLoggable("BitmapEncoder", 2)) {
                Objects.toString(compressFormat);
                Util.getBitmapByteSize(bitmap);
                LogTime.getElapsedMillis(logTime);
                Objects.toString(options.get(COMPRESSION_FORMAT));
                bitmap.hasAlpha();
            }
            GlideTrace.endSection();
            return z10;
        } catch (Throwable th4) {
            GlideTrace.endSection();
            throw th4;
        }
    }

    @Deprecated
    public BitmapEncoder() {
        this.f38537a = null;
    }
}
