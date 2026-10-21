package com.google.crypto.tink;

import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.proto.OutputPrefixType;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes10.dex */
public final class CryptoFormat {
    public static final int LEGACY_PREFIX_SIZE = 5;
    public static final byte LEGACY_START_BYTE = 0;
    public static final int NON_RAW_PREFIX_SIZE = 5;
    public static final byte[] RAW_PREFIX = new byte[0];
    public static final int RAW_PREFIX_SIZE = 0;
    public static final int TINK_PREFIX_SIZE = 5;
    public static final byte TINK_START_BYTE = 1;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46405a;

        static {
            int[] iArr = new int[OutputPrefixType.values().length];
            f46405a = iArr;
            try {
                iArr[OutputPrefixType.LEGACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46405a[OutputPrefixType.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46405a[OutputPrefixType.TINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46405a[OutputPrefixType.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static byte[] getOutputPrefix(Keyset.Key key) throws GeneralSecurityException {
        int i10 = a.f46405a[key.getOutputPrefixType().ordinal()];
        if (i10 == 1 || i10 == 2) {
            return ByteBuffer.allocate(5).put((byte) 0).putInt(key.getKeyId()).array();
        }
        if (i10 == 3) {
            return ByteBuffer.allocate(5).put((byte) 1).putInt(key.getKeyId()).array();
        }
        if (i10 == 4) {
            return RAW_PREFIX;
        }
        throw new GeneralSecurityException("unknown output prefix type");
    }
}
