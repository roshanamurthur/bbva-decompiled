package com.google.crypto.tink.internal;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.util.Bytes;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
public final class ProtoKeySerialization implements Serialization {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bytes f46680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ByteString f46681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final KeyData.KeyMaterialType f46682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final OutputPrefixType f46683e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Integer f46684f;

    public ProtoKeySerialization(String str, ByteString byteString, KeyData.KeyMaterialType keyMaterialType, OutputPrefixType outputPrefixType, @Nullable Integer num) {
        this.f46679a = str;
        this.f46680b = Util.toBytesFromPrintableAscii(str);
        this.f46681c = byteString;
        this.f46682d = keyMaterialType;
        this.f46683e = outputPrefixType;
        this.f46684f = num;
    }

    public static ProtoKeySerialization create(String str, ByteString byteString, KeyData.KeyMaterialType keyMaterialType, OutputPrefixType outputPrefixType, @Nullable Integer num) throws GeneralSecurityException {
        if (outputPrefixType == OutputPrefixType.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new ProtoKeySerialization(str, byteString, keyMaterialType, outputPrefixType, num);
    }

    @Nullable
    public Integer getIdRequirementOrNull() {
        return this.f46684f;
    }

    public KeyData.KeyMaterialType getKeyMaterialType() {
        return this.f46682d;
    }

    @Override // com.google.crypto.tink.internal.Serialization
    public Bytes getObjectIdentifier() {
        return this.f46680b;
    }

    public OutputPrefixType getOutputPrefixType() {
        return this.f46683e;
    }

    public String getTypeUrl() {
        return this.f46679a;
    }

    public ByteString getValue() {
        return this.f46681c;
    }
}
