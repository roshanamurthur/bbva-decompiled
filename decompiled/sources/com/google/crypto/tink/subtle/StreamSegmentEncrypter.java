package com.google.crypto.tink.subtle;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes10.dex */
public interface StreamSegmentEncrypter {
    void encryptSegment(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, boolean z10, ByteBuffer byteBuffer3) throws GeneralSecurityException;

    void encryptSegment(ByteBuffer byteBuffer, boolean z10, ByteBuffer byteBuffer2) throws GeneralSecurityException;

    ByteBuffer getHeader();
}
