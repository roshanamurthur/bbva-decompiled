package com.google.crypto.tink.subtle;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes10.dex */
public interface StreamSegmentDecrypter {
    void decryptSegment(ByteBuffer byteBuffer, int i10, boolean z10, ByteBuffer byteBuffer2) throws GeneralSecurityException;

    void init(ByteBuffer byteBuffer, byte[] bArr) throws GeneralSecurityException;
}
