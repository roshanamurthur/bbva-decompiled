package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.Internal;

/* JADX INFO: loaded from: classes10.dex */
public enum EcPointFormat implements Internal.EnumLite {
    UNKNOWN_FORMAT(0),
    UNCOMPRESSED(1),
    COMPRESSED(2),
    DO_NOT_USE_CRUNCHY_UNCOMPRESSED(3),
    UNRECOGNIZED(-1);

    public static final int COMPRESSED_VALUE = 2;
    public static final int DO_NOT_USE_CRUNCHY_UNCOMPRESSED_VALUE = 3;
    public static final int UNCOMPRESSED_VALUE = 1;
    public static final int UNKNOWN_FORMAT_VALUE = 0;
    private static final Internal.EnumLiteMap<EcPointFormat> internalValueMap = new a();
    private final int value;

    public class a implements Internal.EnumLiteMap<EcPointFormat> {
        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i10) {
            return EcPointFormat.forNumber(i10);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f46880a = new b();

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i10) {
            return EcPointFormat.forNumber(i10) != null;
        }
    }

    EcPointFormat(int i10) {
        this.value = i10;
    }

    public static EcPointFormat forNumber(int i10) {
        if (i10 == 0) {
            return UNKNOWN_FORMAT;
        }
        if (i10 == 1) {
            return UNCOMPRESSED;
        }
        if (i10 == 2) {
            return COMPRESSED;
        }
        if (i10 != 3) {
            return null;
        }
        return DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
    }

    public static Internal.EnumLiteMap<EcPointFormat> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f46880a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EcPointFormat valueOf(int i10) {
        return forNumber(i10);
    }
}
