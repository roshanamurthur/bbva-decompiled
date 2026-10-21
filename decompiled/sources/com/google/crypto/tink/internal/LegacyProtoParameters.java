package com.google.crypto.tink.internal;

import com.bbva.ethermobilesdk.cipher.token.utils.HMACUtilsKt;
import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.errorprone.annotations.Immutable;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
public final class LegacyProtoParameters extends Parameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProtoParametersSerialization f46652a;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46653a;

        static {
            int[] iArr = new int[OutputPrefixType.values().length];
            f46653a = iArr;
            try {
                iArr[OutputPrefixType.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46653a[OutputPrefixType.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46653a[OutputPrefixType.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46653a[OutputPrefixType.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public LegacyProtoParameters(ProtoParametersSerialization protoParametersSerialization) {
        this.f46652a = protoParametersSerialization;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LegacyProtoParameters)) {
            return false;
        }
        ProtoParametersSerialization protoParametersSerialization = ((LegacyProtoParameters) obj).f46652a;
        ProtoParametersSerialization protoParametersSerialization2 = this.f46652a;
        return protoParametersSerialization2.getKeyTemplate().getOutputPrefixType().equals(protoParametersSerialization.getKeyTemplate().getOutputPrefixType()) && protoParametersSerialization2.getKeyTemplate().getTypeUrl().equals(protoParametersSerialization.getKeyTemplate().getTypeUrl()) && protoParametersSerialization2.getKeyTemplate().getValue().equals(protoParametersSerialization.getKeyTemplate().getValue());
    }

    public ProtoParametersSerialization getSerialization() {
        return this.f46652a;
    }

    @Override // com.google.crypto.tink.Parameters
    public boolean hasIdRequirement() {
        return this.f46652a.getKeyTemplate().getOutputPrefixType() != OutputPrefixType.RAW;
    }

    public int hashCode() {
        ProtoParametersSerialization protoParametersSerialization = this.f46652a;
        return Objects.hash(protoParametersSerialization.getKeyTemplate(), protoParametersSerialization.getObjectIdentifier());
    }

    public String toString() {
        String str;
        Object[] objArr = new Object[2];
        ProtoParametersSerialization protoParametersSerialization = this.f46652a;
        objArr[0] = protoParametersSerialization.getKeyTemplate().getTypeUrl();
        int i10 = a.f46653a[protoParametersSerialization.getKeyTemplate().getOutputPrefixType().ordinal()];
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
