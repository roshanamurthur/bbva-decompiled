package com.google.crypto.tink.mac;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes10.dex */
public interface ChunkedMacVerification {
    void update(ByteBuffer byteBuffer) throws GeneralSecurityException;

    void verifyMac() throws GeneralSecurityException;
}
