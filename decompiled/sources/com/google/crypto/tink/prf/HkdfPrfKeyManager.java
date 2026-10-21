package com.google.crypto.tink.prf;

import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.internal.MutableSerializationRegistry;
import com.google.crypto.tink.internal.ParametersSerializer;
import com.google.crypto.tink.internal.PrimitiveFactory;
import com.google.crypto.tink.internal.ProtoParametersSerialization;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.HkdfPrfKeyFormat;
import com.google.crypto.tink.proto.HkdfPrfParams;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.subtle.Enums;
import com.google.crypto.tink.subtle.Random;
import com.google.crypto.tink.subtle.Validators;
import com.google.crypto.tink.subtle.prf.HkdfStreamingPrf;
import com.google.crypto.tink.subtle.prf.PrfImpl;
import com.google.crypto.tink.subtle.prf.StreamingPrf;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class HkdfPrfKeyManager extends KeyTypeManager<com.google.crypto.tink.proto.HkdfPrfKey> {

    public class a extends PrimitiveFactory<StreamingPrf, com.google.crypto.tink.proto.HkdfPrfKey> {
        @Override // com.google.crypto.tink.internal.PrimitiveFactory
        public final StreamingPrf getPrimitive(MessageLite messageLite) throws GeneralSecurityException {
            com.google.crypto.tink.proto.HkdfPrfKey hkdfPrfKey = (com.google.crypto.tink.proto.HkdfPrfKey) messageLite;
            return new HkdfStreamingPrf(HkdfPrfKeyManager.a(hkdfPrfKey.getParams().getHash()), hkdfPrfKey.getKeyValue().toByteArray(), hkdfPrfKey.getParams().getSalt().toByteArray());
        }
    }

    public class b extends PrimitiveFactory<Prf, com.google.crypto.tink.proto.HkdfPrfKey> {
        @Override // com.google.crypto.tink.internal.PrimitiveFactory
        public final Prf getPrimitive(MessageLite messageLite) throws GeneralSecurityException {
            com.google.crypto.tink.proto.HkdfPrfKey hkdfPrfKey = (com.google.crypto.tink.proto.HkdfPrfKey) messageLite;
            return PrfImpl.wrap(new HkdfStreamingPrf(HkdfPrfKeyManager.a(hkdfPrfKey.getParams().getHash()), hkdfPrfKey.getKeyValue().toByteArray(), hkdfPrfKey.getParams().getSalt().toByteArray()));
        }
    }

    public class c extends KeyTypeManager.KeyFactory<HkdfPrfKeyFormat, com.google.crypto.tink.proto.HkdfPrfKey> {
        public c() {
            super(HkdfPrfKeyFormat.class);
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite createKey(MessageLite messageLite) throws GeneralSecurityException {
            HkdfPrfKeyFormat hkdfPrfKeyFormat = (HkdfPrfKeyFormat) messageLite;
            return com.google.crypto.tink.proto.HkdfPrfKey.newBuilder().setKeyValue(ByteString.copyFrom(Random.randBytes(hkdfPrfKeyFormat.getKeySize()))).setVersion(HkdfPrfKeyManager.this.getVersion()).setParams(hkdfPrfKeyFormat.getParams()).build();
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final Map<String, KeyTypeManager.KeyFactory.KeyFormat<HkdfPrfKeyFormat>> keyFormats() throws GeneralSecurityException {
            HashMap map = new HashMap();
            map.put("HKDF_SHA256", new KeyTypeManager.KeyFactory.KeyFormat(HkdfPrfKeyFormat.newBuilder().setKeySize(32).setParams(HkdfPrfParams.newBuilder().setHash(HashType.SHA256)).build(), KeyTemplate.OutputPrefixType.RAW));
            return Collections.unmodifiableMap(map);
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite parseKeyFormat(ByteString byteString) throws InvalidProtocolBufferException {
            return HkdfPrfKeyFormat.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final void validateKeyFormat(MessageLite messageLite) throws GeneralSecurityException {
            HkdfPrfKeyFormat hkdfPrfKeyFormat = (HkdfPrfKeyFormat) messageLite;
            if (hkdfPrfKeyFormat.getKeySize() < 32) {
                throw new GeneralSecurityException("Invalid HkdfPrfKey/HkdfPrfKeyFormat: Key size too short");
            }
            HkdfPrfParams params = hkdfPrfKeyFormat.getParams();
            if (params.getHash() != HashType.SHA256 && params.getHash() != HashType.SHA512) {
                throw new GeneralSecurityException("Invalid HkdfPrfKey/HkdfPrfKeyFormat: Unsupported hash");
            }
        }
    }

    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46832a;

        static {
            int[] iArr = new int[HashType.values().length];
            f46832a = iArr;
            try {
                iArr[HashType.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46832a[HashType.SHA256.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46832a[HashType.SHA384.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46832a[HashType.SHA512.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public HkdfPrfKeyManager() {
        super(com.google.crypto.tink.proto.HkdfPrfKey.class, new a(StreamingPrf.class), new b(Prf.class));
    }

    public static Enums.HashType a(HashType hashType) throws GeneralSecurityException {
        int i10 = d.f46832a[hashType.ordinal()];
        if (i10 == 1) {
            return Enums.HashType.SHA1;
        }
        if (i10 == 2) {
            return Enums.HashType.SHA256;
        }
        if (i10 == 3) {
            return Enums.HashType.SHA384;
        }
        if (i10 == 4) {
            return Enums.HashType.SHA512;
        }
        throw new GeneralSecurityException("HashType " + hashType.name() + " not known in");
    }

    public static final KeyTemplate hkdfSha256Template() {
        return KeyTemplate.create(staticKeyType(), HkdfPrfKeyFormat.newBuilder().setKeySize(32).setParams(HkdfPrfParams.newBuilder().setHash(HashType.SHA256)).build().toByteArray(), KeyTemplate.OutputPrefixType.RAW);
    }

    public static void register(boolean z10) throws GeneralSecurityException {
        Registry.registerKeyManager(new HkdfPrfKeyManager(), z10);
        ParametersSerializer<HkdfPrfParameters, ProtoParametersSerialization> parametersSerializer = com.google.crypto.tink.prf.a.f46848a;
        MutableSerializationRegistry mutableSerializationRegistryGlobalInstance = MutableSerializationRegistry.globalInstance();
        mutableSerializationRegistryGlobalInstance.registerParametersSerializer(com.google.crypto.tink.prf.a.f46848a);
        mutableSerializationRegistryGlobalInstance.registerParametersParser(com.google.crypto.tink.prf.a.f46849b);
        mutableSerializationRegistryGlobalInstance.registerKeySerializer(com.google.crypto.tink.prf.a.f46850c);
        mutableSerializationRegistryGlobalInstance.registerKeyParser(com.google.crypto.tink.prf.a.f46851d);
    }

    public static String staticKeyType() {
        return new HkdfPrfKeyManager().getKeyType();
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.HkdfPrfKey";
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyTypeManager.KeyFactory<HkdfPrfKeyFormat, com.google.crypto.tink.proto.HkdfPrfKey> keyFactory() {
        return new c();
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyData.KeyMaterialType keyMaterialType() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.proto.HkdfPrfKey parseKey(ByteString byteString) throws InvalidProtocolBufferException {
        return com.google.crypto.tink.proto.HkdfPrfKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public void validateKey(com.google.crypto.tink.proto.HkdfPrfKey hkdfPrfKey) throws GeneralSecurityException {
        Validators.validateVersion(hkdfPrfKey.getVersion(), getVersion());
        if (hkdfPrfKey.getKeyValue().size() < 32) {
            throw new GeneralSecurityException("Invalid HkdfPrfKey/HkdfPrfKeyFormat: Key size too short");
        }
        HkdfPrfParams params = hkdfPrfKey.getParams();
        if (params.getHash() != HashType.SHA256 && params.getHash() != HashType.SHA512) {
            throw new GeneralSecurityException("Invalid HkdfPrfKey/HkdfPrfKeyFormat: Unsupported hash");
        }
    }
}
