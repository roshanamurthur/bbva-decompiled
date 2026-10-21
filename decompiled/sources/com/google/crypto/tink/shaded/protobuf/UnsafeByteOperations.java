package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public final class UnsafeByteOperations {
    public static ByteString unsafeWrap(byte[] bArr) {
        ByteString byteString = ByteString.EMPTY;
        return new ByteString.h(bArr);
    }

    public static void unsafeWriteTo(ByteString byteString, ByteOutput byteOutput) throws IOException {
        byteString.g(byteOutput);
    }

    public static ByteString unsafeWrap(byte[] bArr, int i10, int i11) {
        ByteString byteString = ByteString.EMPTY;
        return new ByteString.e(bArr, i10, i11);
    }

    public static ByteString unsafeWrap(ByteBuffer byteBuffer) {
        return ByteString.f(byteBuffer);
    }
}
