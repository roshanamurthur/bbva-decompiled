package com.google.firebase.installations;

import android.util.Base64;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* JADX INFO: loaded from: classes10.dex */
public class RandomFidGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte f48457a = Byte.parseByte("01110000", 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte f48458b = Byte.parseByte("00001111", 2);

    @NonNull
    public String createRandomFid() {
        UUID uuidRandomUUID = UUID.randomUUID();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[17]);
        byteBufferWrap.putLong(uuidRandomUUID.getMostSignificantBits());
        byteBufferWrap.putLong(uuidRandomUUID.getLeastSignificantBits());
        byte[] bArrArray = byteBufferWrap.array();
        byte b10 = bArrArray[0];
        bArrArray[16] = b10;
        bArrArray[0] = (byte) ((b10 & f48458b) | f48457a);
        return new String(Base64.encode(bArrArray, 11), Charset.defaultCharset()).substring(0, 22);
    }
}
