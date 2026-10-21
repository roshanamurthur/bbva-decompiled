package com.google.crypto.tink.prf;

import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.internal.PrimitiveFactory;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.HmacPrfKey;
import com.google.crypto.tink.proto.HmacPrfKeyFormat;
import com.google.crypto.tink.proto.HmacPrfParams;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.subtle.PrfHmacJce;
import com.google.crypto.tink.subtle.Random;
import com.google.crypto.tink.subtle.Validators;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes10.dex */
public final class HmacPrfKeyManager extends KeyTypeManager<HmacPrfKey> {

    public class a extends PrimitiveFactory<Prf, HmacPrfKey> {
        @Override // com.google.crypto.tink.internal.PrimitiveFactory
        public final Prf getPrimitive(MessageLite messageLite) throws GeneralSecurityException {
            HmacPrfKey hmacPrfKey = (HmacPrfKey) messageLite;
            HashType hash = hmacPrfKey.getParams().getHash();
            SecretKeySpec secretKeySpec = new SecretKeySpec(hmacPrfKey.getKeyValue().toByteArray(), "HMAC");
            int i10 = c.f46841a[hash.ordinal()];
            if (i10 == 1) {
                return new PrfHmacJce("HMACSHA1", secretKeySpec);
            }
            if (i10 == 2) {
                return new PrfHmacJce("HMACSHA224", secretKeySpec);
            }
            if (i10 == 3) {
                return new PrfHmacJce("HMACSHA256", secretKeySpec);
            }
            if (i10 == 4) {
                return new PrfHmacJce("HMACSHA384", secretKeySpec);
            }
            if (i10 == 5) {
                return new PrfHmacJce("HMACSHA512", secretKeySpec);
            }
            throw new GeneralSecurityException("unknown hash");
        }
    }

    public class b extends KeyTypeManager.KeyFactory<HmacPrfKeyFormat, HmacPrfKey> {
        public b() {
            super(HmacPrfKeyFormat.class);
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite createKey(MessageLite messageLite) throws GeneralSecurityException {
            HmacPrfKeyFormat hmacPrfKeyFormat = (HmacPrfKeyFormat) messageLite;
            return HmacPrfKey.newBuilder().setVersion(HmacPrfKeyManager.this.getVersion()).setParams(hmacPrfKeyFormat.getParams()).setKeyValue(ByteString.copyFrom(Random.randBytes(hmacPrfKeyFormat.getKeySize()))).build();
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite deriveKey(MessageLite messageLite, InputStream inputStream) throws GeneralSecurityException {
            HmacPrfKeyFormat hmacPrfKeyFormat = (HmacPrfKeyFormat) messageLite;
            int version = hmacPrfKeyFormat.getVersion();
            HmacPrfKeyManager hmacPrfKeyManager = HmacPrfKeyManager.this;
            Validators.validateVersion(version, hmacPrfKeyManager.getVersion());
            byte[] bArr = new byte[hmacPrfKeyFormat.getKeySize()];
            try {
                KeyTypeManager.KeyFactory.readFully(inputStream, bArr);
                return HmacPrfKey.newBuilder().setVersion(hmacPrfKeyManager.getVersion()).setParams(hmacPrfKeyFormat.getParams()).setKeyValue(ByteString.copyFrom(bArr)).build();
            } catch (IOException e5) {
                throw new GeneralSecurityException("Reading pseudorandomness failed", e5);
            }
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final Map<String, KeyTypeManager.KeyFactory.KeyFormat<HmacPrfKeyFormat>> keyFormats() throws GeneralSecurityException {
            HashMap map = new HashMap();
            HmacPrfKeyFormat hmacPrfKeyFormatBuild = HmacPrfKeyFormat.newBuilder().setParams(HmacPrfParams.newBuilder().setHash(HashType.SHA256).build()).setKeySize(32).build();
            KeyTemplate.OutputPrefixType outputPrefixType = KeyTemplate.OutputPrefixType.RAW;
            map.put("HMAC_SHA256_PRF", new KeyTypeManager.KeyFactory.KeyFormat(hmacPrfKeyFormatBuild, outputPrefixType));
            map.put("HMAC_SHA512_PRF", new KeyTypeManager.KeyFactory.KeyFormat(HmacPrfKeyFormat.newBuilder().setParams(HmacPrfParams.newBuilder().setHash(HashType.SHA512).build()).setKeySize(64).build(), outputPrefixType));
            return Collections.unmodifiableMap(map);
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite parseKeyFormat(ByteString byteString) throws InvalidProtocolBufferException {
            return HmacPrfKeyFormat.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final void validateKeyFormat(MessageLite messageLite) throws GeneralSecurityException {
            HmacPrfKeyFormat hmacPrfKeyFormat = (HmacPrfKeyFormat) messageLite;
            if (hmacPrfKeyFormat.getKeySize() < 16) {
                throw new GeneralSecurityException("key too short");
            }
            HmacPrfKeyManager.b(hmacPrfKeyFormat.getParams());
        }
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46841a;

        static {
            int[] iArr = new int[HashType.values().length];
            f46841a = iArr;
            try {
                iArr[HashType.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46841a[HashType.SHA224.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46841a[HashType.SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46841a[HashType.SHA384.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f46841a[HashType.SHA512.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public HmacPrfKeyManager() {
        super(HmacPrfKey.class, new a(Prf.class));
    }

    public static KeyTemplate a(int i10, HashType hashType) {
        return KeyTemplate.create(new HmacPrfKeyManager().getKeyType(), HmacPrfKeyFormat.newBuilder().setParams(HmacPrfParams.newBuilder().setHash(hashType).build()).setKeySize(i10).build().toByteArray(), KeyTemplate.OutputPrefixType.RAW);
    }

    public static void b(HmacPrfParams hmacPrfParams) throws GeneralSecurityException {
        if (hmacPrfParams.getHash() != HashType.SHA1 && hmacPrfParams.getHash() != HashType.SHA224 && hmacPrfParams.getHash() != HashType.SHA256 && hmacPrfParams.getHash() != HashType.SHA384 && hmacPrfParams.getHash() != HashType.SHA512) {
            throw new GeneralSecurityException("unknown hash type");
        }
    }

    public static final KeyTemplate hmacSha256Template() {
        return a(32, HashType.SHA256);
    }

    public static final KeyTemplate hmacSha512Template() {
        return a(64, HashType.SHA512);
    }

    public static void register(boolean z10) throws GeneralSecurityException {
        Registry.registerKeyManager(new HmacPrfKeyManager(), z10);
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public TinkFipsUtil.AlgorithmFipsCompatibility fipsStatus() {
        return TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.HmacPrfKey";
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyTypeManager.KeyFactory<HmacPrfKeyFormat, HmacPrfKey> keyFactory() {
        return new b();
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyData.KeyMaterialType keyMaterialType() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public HmacPrfKey parseKey(ByteString byteString) throws InvalidProtocolBufferException {
        return HmacPrfKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public void validateKey(HmacPrfKey hmacPrfKey) throws GeneralSecurityException {
        Validators.validateVersion(hmacPrfKey.getVersion(), getVersion());
        if (hmacPrfKey.getKeyValue().size() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        b(hmacPrfKey.getParams());
    }
}
