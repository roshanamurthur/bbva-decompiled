package com.bumptech.glide.load.model;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes9.dex */
public class StreamEncoder implements Encoder<InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayPool f38479a;

    public StreamEncoder(ArrayPool arrayPool) {
        this.f38479a = arrayPool;
    }

    @Override // com.bumptech.glide.load.Encoder
    public boolean encode(@NonNull InputStream inputStream, @NonNull File file, @NonNull Options options) throws Throwable {
        ArrayPool arrayPool = this.f38479a;
        byte[] bArr = (byte[]) arrayPool.get(65536, byte[].class);
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            while (true) {
                try {
                    int i10 = inputStream.read(bArr);
                    if (i10 == -1) {
                        break;
                    }
                    fileOutputStream2.write(bArr, 0, i10);
                } catch (IOException unused) {
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    arrayPool.put(bArr);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    arrayPool.put(bArr);
                    throw th;
                }
            }
            fileOutputStream2.close();
            try {
                fileOutputStream2.close();
            } catch (IOException unused4) {
            }
            arrayPool.put(bArr);
            return true;
        } catch (IOException unused5) {
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
