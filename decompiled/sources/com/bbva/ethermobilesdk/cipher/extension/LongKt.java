package com.bbva.ethermobilesdk.cipher.extension;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Long.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\t\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toByteArray", "", "", "cipher_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LongKt {
    @NotNull
    public static final byte[] toByteArray(long j10) {
        byte[] bArr = new byte[8];
        for (int i10 = 7; -1 < i10; i10--) {
            bArr[i10] = (byte) (255 & j10);
            j10 >>= 8;
        }
        return bArr;
    }
}
