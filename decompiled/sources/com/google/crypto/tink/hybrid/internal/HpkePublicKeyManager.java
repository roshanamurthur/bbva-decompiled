package com.google.crypto.tink.hybrid.internal;

import com.google.crypto.tink.HybridEncrypt;
import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.internal.PrimitiveFactory;
import com.google.crypto.tink.proto.HpkeParams;
import com.google.crypto.tink.proto.HpkePublicKey;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.subtle.Validators;
import ff.g;
import ff.l;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes10.dex */
public final class HpkePublicKeyManager extends KeyTypeManager<HpkePublicKey> {

    public class a extends PrimitiveFactory<HybridEncrypt, HpkePublicKey> {
        @Override // com.google.crypto.tink.internal.PrimitiveFactory
        public final HybridEncrypt getPrimitive(MessageLite messageLite) throws GeneralSecurityException {
            HpkePublicKey hpkePublicKey = (HpkePublicKey) messageLite;
            if (hpkePublicKey.getPublicKey().isEmpty()) {
                throw new IllegalArgumentException("HpkePublicKey.public_key is empty.");
            }
            HpkeParams params = hpkePublicKey.getParams();
            return new g(hpkePublicKey, l.c(params), l.b(params), l.a(params));
        }
    }

    public HpkePublicKeyManager() {
        super(HpkePublicKey.class, new a(HybridEncrypt.class));
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.HpkePublicKey";
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyData.KeyMaterialType keyMaterialType() {
        return KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public HpkePublicKey parseKey(ByteString byteString) throws InvalidProtocolBufferException {
        return HpkePublicKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public void validateKey(HpkePublicKey hpkePublicKey) throws GeneralSecurityException {
        Validators.validateVersion(hpkePublicKey.getVersion(), getVersion());
        if (!hpkePublicKey.hasParams()) {
            throw new GeneralSecurityException("Missing HPKE key params.");
        }
        HpkeUtil.c(hpkePublicKey.getParams());
    }
}
