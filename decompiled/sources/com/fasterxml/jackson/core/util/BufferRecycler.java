package com.fasterxml.jackson.core.util;

import com.google.android.gms.wearable.WearableStatusCodes;
import com.nulabinc.zxcvbn.Guess;

/* JADX INFO: loaded from: classes9.dex */
public class BufferRecycler {
    public static final int BYTE_BASE64_CODEC_BUFFER = 3;
    public static final int BYTE_READ_IO_BUFFER = 0;
    public static final int BYTE_WRITE_CONCAT_BUFFER = 2;
    public static final int BYTE_WRITE_ENCODING_BUFFER = 1;
    public static final int CHAR_CONCAT_BUFFER = 1;
    public static final int CHAR_NAME_COPY_BUFFER = 3;
    public static final int CHAR_TEXT_BUFFER = 2;
    public static final int CHAR_TOKEN_BUFFER = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f43140a = {8000, 8000, Guess.REFERENCE_YEAR, Guess.REFERENCE_YEAR};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f43141b = {WearableStatusCodes.TARGET_NODE_NOT_CONNECTED, WearableStatusCodes.TARGET_NODE_NOT_CONNECTED, 200, 200};
    protected final byte[][] _byteBuffers;
    protected final char[][] _charBuffers;

    public BufferRecycler() {
        this(4, 4);
    }

    public final byte[] allocByteBuffer(int i10) {
        return allocByteBuffer(i10, 0);
    }

    public final char[] allocCharBuffer(int i10) {
        return allocCharBuffer(i10, 0);
    }

    public byte[] balloc(int i10) {
        return new byte[i10];
    }

    public int byteBufferLength(int i10) {
        return f43140a[i10];
    }

    public char[] calloc(int i10) {
        return new char[i10];
    }

    public int charBufferLength(int i10) {
        return f43141b[i10];
    }

    public void releaseByteBuffer(int i10, byte[] bArr) {
        this._byteBuffers[i10] = bArr;
    }

    public void releaseCharBuffer(int i10, char[] cArr) {
        this._charBuffers[i10] = cArr;
    }

    public BufferRecycler(int i10, int i11) {
        this._byteBuffers = new byte[i10][];
        this._charBuffers = new char[i11][];
    }

    public byte[] allocByteBuffer(int i10, int i11) {
        int iByteBufferLength = byteBufferLength(i10);
        if (i11 < iByteBufferLength) {
            i11 = iByteBufferLength;
        }
        byte[][] bArr = this._byteBuffers;
        byte[] bArr2 = bArr[i10];
        if (bArr2 == null || bArr2.length < i11) {
            return balloc(i11);
        }
        bArr[i10] = null;
        return bArr2;
    }

    public char[] allocCharBuffer(int i10, int i11) {
        int iCharBufferLength = charBufferLength(i10);
        if (i11 < iCharBufferLength) {
            i11 = iCharBufferLength;
        }
        char[][] cArr = this._charBuffers;
        char[] cArr2 = cArr[i10];
        if (cArr2 == null || cArr2.length < i11) {
            return calloc(i11);
        }
        cArr[i10] = null;
        return cArr2;
    }
}
