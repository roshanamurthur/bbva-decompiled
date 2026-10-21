package com.google.crypto.tink.mac;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes10.dex */
public interface ChunkedMacComputation {
    byte[] computeMac() throws GeneralSecurityException;

    void update(ByteBuffer byteBuffer) throws GeneralSecurityException;
}
