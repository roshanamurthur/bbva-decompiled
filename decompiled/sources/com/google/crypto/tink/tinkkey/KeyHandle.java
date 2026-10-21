package com.google.crypto.tink.tinkkey;

import com.bbva.tohu.android.product.valkyria.sdk.export.constants.PaymentStatus;
import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.internal.Util;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.tinkkey.internal.ProtoKey;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
@Deprecated
public class KeyHandle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TinkKey f47518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KeyStatusType f47519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f47520c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class KeyStatusType {
        private static final /* synthetic */ KeyStatusType[] $VALUES;
        public static final KeyStatusType DESTROYED;
        public static final KeyStatusType DISABLED;
        public static final KeyStatusType ENABLED;

        static {
            KeyStatusType keyStatusType = new KeyStatusType(PaymentStatus.ENABLED, 0);
            ENABLED = keyStatusType;
            KeyStatusType keyStatusType2 = new KeyStatusType("DISABLED", 1);
            DISABLED = keyStatusType2;
            KeyStatusType keyStatusType3 = new KeyStatusType("DESTROYED", 2);
            DESTROYED = keyStatusType3;
            $VALUES = new KeyStatusType[]{keyStatusType, keyStatusType2, keyStatusType3};
        }

        public KeyStatusType() {
            throw null;
        }

        public static KeyStatusType valueOf(String str) {
            return (KeyStatusType) Enum.valueOf(KeyStatusType.class, str);
        }

        public static KeyStatusType[] values() {
            return (KeyStatusType[]) $VALUES.clone();
        }
    }

    public KeyHandle(TinkKey tinkKey) {
        this.f47518a = tinkKey;
        this.f47519b = KeyStatusType.ENABLED;
        this.f47520c = Util.randKeyId();
    }

    public static KeyHandle createFromKey(TinkKey tinkKey, KeyAccess keyAccess) throws GeneralSecurityException {
        KeyHandle keyHandle = new KeyHandle(tinkKey);
        if (!keyHandle.hasSecret() || keyAccess.canAccessSecret()) {
            return keyHandle;
        }
        throw new GeneralSecurityException("No access");
    }

    public static KeyHandle generateNew(KeyTemplate keyTemplate) throws GeneralSecurityException {
        return new KeyHandle(new ProtoKey(Registry.newKeyData(keyTemplate), keyTemplate.getOutputPrefixType()));
    }

    public int getId() {
        return this.f47520c;
    }

    public TinkKey getKey(KeyAccess keyAccess) throws GeneralSecurityException {
        if (!hasSecret() || keyAccess.canAccessSecret()) {
            return this.f47518a;
        }
        throw new GeneralSecurityException("No access");
    }

    public KeyTemplate getKeyTemplate() {
        return this.f47518a.getKeyTemplate();
    }

    public KeyStatusType getStatus() {
        return this.f47519b;
    }

    public boolean hasSecret() {
        return this.f47518a.hasSecret();
    }

    @Deprecated
    public static KeyHandle createFromKey(KeyData keyData, KeyTemplate.OutputPrefixType outputPrefixType) {
        return new KeyHandle(new ProtoKey(keyData, outputPrefixType));
    }

    public KeyHandle(TinkKey tinkKey, KeyStatusType keyStatusType, int i10) {
        this.f47518a = tinkKey;
        this.f47519b = keyStatusType;
        this.f47520c = i10;
    }
}
