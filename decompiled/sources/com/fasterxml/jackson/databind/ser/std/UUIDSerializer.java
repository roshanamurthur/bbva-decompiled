package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.IOException;
import java.util.UUID;

/* JADX INFO: loaded from: classes9.dex */
public class UUIDSerializer extends StdScalarSerializer<UUID> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final char[] f43450q0 = "0123456789abcdef".toCharArray();

    public UUIDSerializer() {
        super(UUID.class);
    }

    public static final void a(int i10, int i11, byte[] bArr) {
        bArr[i11] = (byte) (i10 >> 24);
        bArr[i11 + 1] = (byte) (i10 >> 16);
        bArr[i11 + 2] = (byte) (i10 >> 8);
        bArr[i11 + 3] = (byte) i10;
    }

    public static void b(int i10, char[] cArr, int i11) {
        char[] cArr2 = f43450q0;
        cArr[i11] = cArr2[(i10 >> 12) & 15];
        cArr[i11 + 1] = cArr2[(i10 >> 8) & 15];
        cArr[i11 + 2] = cArr2[(i10 >> 4) & 15];
        cArr[i11 + 3] = cArr2[i10 & 15];
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public boolean isEmpty(SerializerProvider serializerProvider, UUID uuid) {
        return uuid.getLeastSignificantBits() == 0 && uuid.getMostSignificantBits() == 0;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(UUID uuid, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if (jsonGenerator.canWriteBinaryNatively() && !(jsonGenerator instanceof TokenBuffer)) {
            byte[] bArr = new byte[16];
            long mostSignificantBits = uuid.getMostSignificantBits();
            long leastSignificantBits = uuid.getLeastSignificantBits();
            a((int) (mostSignificantBits >> 32), 0, bArr);
            a((int) mostSignificantBits, 4, bArr);
            a((int) (leastSignificantBits >> 32), 8, bArr);
            a((int) leastSignificantBits, 12, bArr);
            jsonGenerator.writeBinary(bArr);
            return;
        }
        char[] cArr = new char[36];
        long mostSignificantBits2 = uuid.getMostSignificantBits();
        int i10 = (int) (mostSignificantBits2 >> 32);
        b(i10 >> 16, cArr, 0);
        b(i10, cArr, 4);
        cArr[8] = '-';
        int i11 = (int) mostSignificantBits2;
        b(i11 >>> 16, cArr, 9);
        cArr[13] = '-';
        b(i11, cArr, 14);
        cArr[18] = '-';
        long leastSignificantBits2 = uuid.getLeastSignificantBits();
        b((int) (leastSignificantBits2 >>> 48), cArr, 19);
        cArr[23] = '-';
        b((int) (leastSignificantBits2 >>> 32), cArr, 24);
        int i12 = (int) leastSignificantBits2;
        b(i12 >> 16, cArr, 28);
        b(i12, cArr, 32);
        jsonGenerator.writeString(cArr, 0, 36);
    }
}
