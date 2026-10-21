package com.google.crypto.tink.internal;

import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.tinkkey.KeyHandle;

/* JADX INFO: loaded from: classes10.dex */
public final class KeyStatusTypeProtoConverter {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46639a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f46640b;

        static {
            int[] iArr = new int[KeyHandle.KeyStatusType.values().length];
            f46640b = iArr;
            try {
                iArr[KeyHandle.KeyStatusType.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46640b[KeyHandle.KeyStatusType.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46640b[KeyHandle.KeyStatusType.DESTROYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[KeyStatusType.values().length];
            f46639a = iArr2;
            try {
                iArr2[KeyStatusType.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f46639a[KeyStatusType.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f46639a[KeyStatusType.DESTROYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static KeyHandle.KeyStatusType fromProto(KeyStatusType keyStatusType) {
        int i10 = a.f46639a[keyStatusType.ordinal()];
        if (i10 == 1) {
            return KeyHandle.KeyStatusType.ENABLED;
        }
        if (i10 == 2) {
            return KeyHandle.KeyStatusType.DISABLED;
        }
        if (i10 == 3) {
            return KeyHandle.KeyStatusType.DESTROYED;
        }
        throw new IllegalArgumentException("Unknown key status type.");
    }

    public static KeyStatusType toProto(KeyHandle.KeyStatusType keyStatusType) {
        int i10 = a.f46640b[keyStatusType.ordinal()];
        if (i10 == 1) {
            return KeyStatusType.ENABLED;
        }
        if (i10 == 2) {
            return KeyStatusType.DISABLED;
        }
        if (i10 == 3) {
            return KeyStatusType.DESTROYED;
        }
        throw new IllegalArgumentException("Unknown key status type.");
    }
}
