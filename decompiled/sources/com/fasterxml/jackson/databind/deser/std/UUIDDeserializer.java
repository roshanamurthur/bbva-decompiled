package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: classes9.dex */
public class UUIDDeserializer extends FromStringDeserializer<UUID> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final int[] f43297p0;

    static {
        int[] iArr = new int[127];
        f43297p0 = iArr;
        Arrays.fill(iArr, -1);
        for (int i10 = 0; i10 < 10; i10++) {
            f43297p0[i10 + 48] = i10;
        }
        for (int i11 = 0; i11 < 6; i11++) {
            int[] iArr2 = f43297p0;
            int i12 = i11 + 10;
            iArr2[i11 + 97] = i12;
            iArr2[i11 + 65] = i12;
        }
    }

    public UUIDDeserializer() {
        super(UUID.class);
    }

    public static int b(int i10, byte[] bArr) {
        return (bArr[i10 + 3] & 255) | (bArr[i10] << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public final UUID a(byte[] bArr, DeserializationContext deserializationContext) throws JsonMappingException {
        if (bArr.length == 16) {
            return new UUID((((long) b(0, bArr)) << 32) | ((((long) b(4, bArr)) << 32) >>> 32), (((long) b(8, bArr)) << 32) | ((((long) b(12, bArr)) << 32) >>> 32));
        }
        throw InvalidFormatException.from(deserializationContext.getParser(), androidx.appcompat.widget.a.c(new StringBuilder("Can only construct UUIDs from byte[16]; got "), bArr.length, " bytes"), bArr, handledType());
    }

    public final int c(String str, int i10, DeserializationContext deserializationContext) throws JsonMappingException {
        int i11;
        char cCharAt = str.charAt(i10);
        char cCharAt2 = str.charAt(i10 + 1);
        int[] iArr = f43297p0;
        if (cCharAt <= 127 && cCharAt2 <= 127 && (i11 = (iArr[cCharAt] << 4) | iArr[cCharAt2]) >= 0) {
            return i11;
        }
        if (cCharAt > 127 || iArr[cCharAt] < 0) {
            throw deserializationContext.weirdStringException(str, handledType(), String.format("Non-hex character '%c' (value 0x%s), not valid for UUID String", Character.valueOf(cCharAt), Integer.toHexString(cCharAt)));
        }
        throw deserializationContext.weirdStringException(str, handledType(), String.format("Non-hex character '%c' (value 0x%s), not valid for UUID String", Character.valueOf(cCharAt2), Integer.toHexString(cCharAt2)));
    }

    public final int d(String str, int i10, DeserializationContext deserializationContext) throws JsonMappingException {
        return c(str, i10 + 6, deserializationContext) + (c(str, i10, deserializationContext) << 24) + (c(str, i10 + 2, deserializationContext) << 16) + (c(str, i10 + 4, deserializationContext) << 8);
    }

    public final int e(String str, int i10, DeserializationContext deserializationContext) throws JsonMappingException {
        return c(str, i10 + 2, deserializationContext) + (c(str, i10, deserializationContext) << 8);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
    public UUID _deserialize(String str, DeserializationContext deserializationContext) throws IOException {
        if (str.length() != 36) {
            return str.length() == 24 ? a(Base64Variants.getDefaultVariant().decode(str), deserializationContext) : (UUID) deserializationContext.handleWeirdStringValue(handledType(), str, "UUID has to be represented by standard 36-char representation", new Object[0]);
        }
        if (str.charAt(8) != '-' || str.charAt(13) != '-' || str.charAt(18) != '-' || str.charAt(23) != '-') {
        }
        return new UUID((((long) d(str, 0, deserializationContext)) << 32) + ((((long) e(str, 9, deserializationContext)) << 16) | ((long) e(str, 14, deserializationContext))), ((((long) d(str, 28, deserializationContext)) << 32) >>> 32) | (((long) ((e(str, 19, deserializationContext) << 16) | e(str, 24, deserializationContext))) << 32));
    }

    @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
    public UUID _deserializeEmbedded(Object obj, DeserializationContext deserializationContext) throws IOException {
        if (obj instanceof byte[]) {
            return a((byte[]) obj, deserializationContext);
        }
        super._deserializeEmbedded(obj, deserializationContext);
        return null;
    }
}
