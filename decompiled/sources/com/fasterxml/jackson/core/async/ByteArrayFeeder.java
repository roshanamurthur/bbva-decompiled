package com.fasterxml.jackson.core.async;

import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public interface ByteArrayFeeder extends NonBlockingInputFeeder {
    void feedInput(byte[] bArr, int i10, int i11) throws IOException;
}
