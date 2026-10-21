package com.google.crypto.tink.internal;

import com.bbva.ethermobilesdk.cipher.token.utils.HMACUtilsKt;
import com.google.crypto.tink.Key;
import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.SecretKeyAccess;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.subtle.Bytes;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.util.Objects;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
public final class LegacyProtoKey extends Key {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProtoKeySerialization f46647a;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46648a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f46649b;

        static {
            int[] iArr = new int[KeyData.KeyMaterialType.values().length];
            f46649b = iArr;
            try {
                iArr[KeyData.KeyMaterialType.SYMMETRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46649b[KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[OutputPrefixType.values().length];
            f46648a = iArr2;
            try {
                iArr2[OutputPrefixType.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46648a[OutputPrefixType.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f46648a[OutputPrefixType.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f46648a[OutputPrefixType.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @Immutable
    public static class b extends Parameters {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f46650a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final OutputPrefixType f46651b;

        public b(String str, OutputPrefixType outputPrefixType) {
            this.f46650a = str;
            this.f46651b = outputPrefixType;
        }

        @Override // com.google.crypto.tink.Parameters
        public final boolean hasIdRequirement() {
            return this.f46651b != OutputPrefixType.RAW;
        }

        public final String toString() {
            String str;
            Object[] objArr = new Object[2];
            objArr[0] = this.f46650a;
            int i10 = a.f46648a[this.f46651b.ordinal()];
            if (i10 == 1) {
                str = "TINK";
            } else if (i10 == 2) {
                str = "LEGACY";
            } else if (i10 != 3) {
                str = i10 != 4 ? "UNKNOWN" : "CRUNCHY";
            } else {
                str = HMACUtilsKt.DEFAULT_SECRET_KEYSPEC_ALGORITHM;
            }
            objArr[1] = str;
            return String.format("(typeUrl=%s, outputPrefixType=%s)", objArr);
        }
    }

    public LegacyProtoKey(ProtoKeySerialization protoKeySerialization, @Nullable SecretKeyAccess secretKeyAccess) throws GeneralSecurityException {
        int i10 = a.f46649b[protoKeySerialization.getKeyMaterialType().ordinal()];
        if (i10 == 1 || i10 == 2) {
            SecretKeyAccess.requireAccess(secretKeyAccess);
        }
        this.f46647a = protoKeySerialization;
    }

    @Override // com.google.crypto.tink.Key
    public boolean equalsKey(Key key) {
        if (!(key instanceof LegacyProtoKey)) {
            return false;
        }
        ProtoKeySerialization protoKeySerialization = ((LegacyProtoKey) key).f46647a;
        OutputPrefixType outputPrefixType = protoKeySerialization.getOutputPrefixType();
        ProtoKeySerialization protoKeySerialization2 = this.f46647a;
        if (outputPrefixType.equals(protoKeySerialization2.getOutputPrefixType()) && protoKeySerialization.getKeyMaterialType().equals(protoKeySerialization2.getKeyMaterialType()) && protoKeySerialization.getTypeUrl().equals(protoKeySerialization2.getTypeUrl()) && Objects.equals(protoKeySerialization.getIdRequirementOrNull(), protoKeySerialization2.getIdRequirementOrNull())) {
            return Bytes.equal(protoKeySerialization2.getValue().toByteArray(), protoKeySerialization.getValue().toByteArray());
        }
        return false;
    }

    @Override // com.google.crypto.tink.Key
    @Nullable
    public Integer getIdRequirementOrNull() {
        return this.f46647a.getIdRequirementOrNull();
    }

    @Override // com.google.crypto.tink.Key
    public Parameters getParameters() {
        ProtoKeySerialization protoKeySerialization = this.f46647a;
        return new b(protoKeySerialization.getTypeUrl(), protoKeySerialization.getOutputPrefixType());
    }

    public ProtoKeySerialization getSerialization(@Nullable SecretKeyAccess secretKeyAccess) throws GeneralSecurityException {
        int[] iArr = a.f46649b;
        ProtoKeySerialization protoKeySerialization = this.f46647a;
        int i10 = iArr[protoKeySerialization.getKeyMaterialType().ordinal()];
        if (i10 == 1 || i10 == 2) {
            SecretKeyAccess.requireAccess(secretKeyAccess);
        }
        return protoKeySerialization;
    }
}
