package com.google.android.gms.internal.mlkit_vision_face_bundled;

import androidx.annotation.NonNull;
import java.io.OutputStream;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
final class zzbj extends OutputStream {
    private long zza = 0;

    @Override // java.io.OutputStream
    public final void write(int i10) {
        this.zza++;
    }

    public final long zza() {
        return this.zza;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.zza += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(@NonNull byte[] bArr, int i10, int i11) {
        int length;
        int i12;
        if (i10 >= 0 && i10 <= (length = bArr.length) && i11 >= 0 && (i12 = i10 + i11) <= length && i12 >= 0) {
            this.zza += (long) i11;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
