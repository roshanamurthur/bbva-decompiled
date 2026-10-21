package com.google.crypto.tink.jwt;

import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.internal.PrimitiveFactory;
import com.google.crypto.tink.proto.JwtHmacAlgorithm;
import com.google.crypto.tink.proto.JwtHmacKey;
import com.google.crypto.tink.proto.JwtHmacKeyFormat;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.subtle.PrfHmacJce;
import com.google.crypto.tink.subtle.PrfMac;
import com.google.crypto.tink.subtle.Random;
import com.google.crypto.tink.subtle.Validators;
import com.google.errorprone.annotations.Immutable;
import com.google.gson.JsonObject;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes10.dex */
public final class JwtHmacKeyManager extends KeyTypeManager<JwtHmacKey> {

    public class a extends PrimitiveFactory<hf.b, JwtHmacKey> {
        @Override // com.google.crypto.tink.internal.PrimitiveFactory
        public final hf.b getPrimitive(MessageLite messageLite) throws GeneralSecurityException {
            String str;
            String str2;
            JwtHmacKey jwtHmacKey = (JwtHmacKey) messageLite;
            JwtHmacAlgorithm algorithm = jwtHmacKey.getAlgorithm();
            SecretKeySpec secretKeySpec = new SecretKeySpec(jwtHmacKey.getKeyValue().toByteArray(), "HMAC");
            int[] iArr = c.f46704a;
            int i10 = iArr[algorithm.ordinal()];
            if (i10 == 1) {
                str = "HMACSHA256";
            } else if (i10 == 2) {
                str = "HMACSHA384";
            } else {
                if (i10 != 3) {
                    throw new GeneralSecurityException("unknown algorithm");
                }
                str = "HMACSHA512";
            }
            PrfHmacJce prfHmacJce = new PrfHmacJce(str, secretKeySpec);
            PrfMac prfMac = new PrfMac(prfHmacJce, prfHmacJce.getMaxOutputLength());
            Optional optionalOf = jwtHmacKey.hasCustomKid() ? Optional.of(jwtHmacKey.getCustomKid().getValue()) : Optional.empty();
            int i11 = iArr[algorithm.ordinal()];
            if (i11 == 1) {
                str2 = "HS256";
            } else if (i11 == 2) {
                str2 = "HS384";
            } else {
                if (i11 != 3) {
                    throw new GeneralSecurityException("unknown algorithm");
                }
                str2 = "HS512";
            }
            return new d(str2, optionalOf, prfMac);
        }
    }

    public class b extends KeyTypeManager.KeyFactory<JwtHmacKeyFormat, JwtHmacKey> {
        public b() {
            super(JwtHmacKeyFormat.class);
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite createKey(MessageLite messageLite) throws GeneralSecurityException {
            JwtHmacKeyFormat jwtHmacKeyFormat = (JwtHmacKeyFormat) messageLite;
            return JwtHmacKey.newBuilder().setVersion(JwtHmacKeyManager.this.getVersion()).setAlgorithm(jwtHmacKeyFormat.getAlgorithm()).setKeyValue(ByteString.copyFrom(Random.randBytes(jwtHmacKeyFormat.getKeySize()))).build();
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite deriveKey(MessageLite messageLite, InputStream inputStream) throws GeneralSecurityException {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final Map<String, KeyTypeManager.KeyFactory.KeyFormat<JwtHmacKeyFormat>> keyFormats() {
            HashMap map = new HashMap();
            JwtHmacAlgorithm jwtHmacAlgorithm = JwtHmacAlgorithm.HS256;
            KeyTemplate.OutputPrefixType outputPrefixType = KeyTemplate.OutputPrefixType.RAW;
            map.put("JWT_HS256_RAW", JwtHmacKeyManager.a(jwtHmacAlgorithm, 32, outputPrefixType));
            KeyTemplate.OutputPrefixType outputPrefixType2 = KeyTemplate.OutputPrefixType.TINK;
            map.put("JWT_HS256", JwtHmacKeyManager.a(jwtHmacAlgorithm, 32, outputPrefixType2));
            JwtHmacAlgorithm jwtHmacAlgorithm2 = JwtHmacAlgorithm.HS384;
            map.put("JWT_HS384_RAW", JwtHmacKeyManager.a(jwtHmacAlgorithm2, 48, outputPrefixType));
            map.put("JWT_HS384", JwtHmacKeyManager.a(jwtHmacAlgorithm2, 48, outputPrefixType2));
            JwtHmacAlgorithm jwtHmacAlgorithm3 = JwtHmacAlgorithm.HS512;
            map.put("JWT_HS512_RAW", JwtHmacKeyManager.a(jwtHmacAlgorithm3, 64, outputPrefixType));
            map.put("JWT_HS512", JwtHmacKeyManager.a(jwtHmacAlgorithm3, 64, outputPrefixType2));
            return Collections.unmodifiableMap(map);
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite parseKeyFormat(ByteString byteString) throws InvalidProtocolBufferException {
            return JwtHmacKeyFormat.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final void validateKeyFormat(MessageLite messageLite) throws GeneralSecurityException {
            JwtHmacKeyFormat jwtHmacKeyFormat = (JwtHmacKeyFormat) messageLite;
            if (jwtHmacKeyFormat.getKeySize() < JwtHmacKeyManager.c(jwtHmacKeyFormat.getAlgorithm())) {
                throw new GeneralSecurityException("key too short");
            }
        }
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46704a;

        static {
            int[] iArr = new int[JwtHmacAlgorithm.values().length];
            f46704a = iArr;
            try {
                iArr[JwtHmacAlgorithm.HS256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46704a[JwtHmacAlgorithm.HS384.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46704a[JwtHmacAlgorithm.HS512.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Immutable
    public static final class d implements hf.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PrfMac f46705a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f46706b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Optional<String> f46707c;

        public d(String str, Optional<String> optional, PrfMac prfMac) {
            this.f46706b = str;
            this.f46707c = optional;
            this.f46705a = prfMac;
        }

        @Override // hf.b
        public final VerifiedJwt a(String str, JwtValidator jwtValidator, Optional<String> optional) throws GeneralSecurityException {
            com.google.crypto.tink.jwt.d.a aVarF = com.google.crypto.tink.jwt.d.f(str);
            this.f46705a.verifyMac(aVarF.f46745b, aVarF.f46744a.getBytes(StandardCharsets.US_ASCII));
            JsonObject jsonObjectA = hf.a.a(aVarF.f46746c);
            com.google.crypto.tink.jwt.d.i(this.f46706b, optional, this.f46707c, jsonObjectA);
            return jwtValidator.a(new RawJwt(com.google.crypto.tink.jwt.d.e(jsonObjectA), aVarF.f46747d));
        }

        @Override // hf.b
        public final String b(RawJwt rawJwt, Optional<String> optional) throws GeneralSecurityException {
            Optional<String> optional2 = this.f46707c;
            if (optional2.isPresent()) {
                if (optional.isPresent()) {
                    throw new JwtInvalidException("custom_kid can only be set for RAW keys.");
                }
                optional = optional2;
            }
            String strB = com.google.crypto.tink.jwt.d.b(this.f46706b, optional, rawJwt);
            return com.google.crypto.tink.jwt.d.a(strB, this.f46705a.computeMac(strB.getBytes(StandardCharsets.US_ASCII)));
        }
    }

    public JwtHmacKeyManager() {
        super(JwtHmacKey.class, new a(hf.b.class));
    }

    public static KeyTypeManager.KeyFactory.KeyFormat a(JwtHmacAlgorithm jwtHmacAlgorithm, int i10, KeyTemplate.OutputPrefixType outputPrefixType) {
        return new KeyTypeManager.KeyFactory.KeyFormat(JwtHmacKeyFormat.newBuilder().setAlgorithm(jwtHmacAlgorithm).setKeySize(i10).build(), outputPrefixType);
    }

    public static KeyTemplate b(JwtHmacAlgorithm jwtHmacAlgorithm, int i10) {
        return KeyTemplate.create(new JwtHmacKeyManager().getKeyType(), JwtHmacKeyFormat.newBuilder().setAlgorithm(jwtHmacAlgorithm).setKeySize(i10).build().toByteArray(), KeyTemplate.OutputPrefixType.RAW);
    }

    public static final int c(JwtHmacAlgorithm jwtHmacAlgorithm) throws GeneralSecurityException {
        int i10 = c.f46704a[jwtHmacAlgorithm.ordinal()];
        if (i10 == 1) {
            return 32;
        }
        if (i10 == 2) {
            return 48;
        }
        if (i10 == 3) {
            return 64;
        }
        throw new GeneralSecurityException("unknown algorithm");
    }

    public static final KeyTemplate hs256Template() {
        return b(JwtHmacAlgorithm.HS256, 32);
    }

    public static final KeyTemplate hs384Template() {
        return b(JwtHmacAlgorithm.HS384, 48);
    }

    public static final KeyTemplate hs512Template() {
        return b(JwtHmacAlgorithm.HS512, 64);
    }

    public static void register(boolean z10) throws GeneralSecurityException {
        Registry.registerKeyManager(new JwtHmacKeyManager(), z10);
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.JwtHmacKey";
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyTypeManager.KeyFactory<JwtHmacKeyFormat, JwtHmacKey> keyFactory() {
        return new b();
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyData.KeyMaterialType keyMaterialType() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public JwtHmacKey parseKey(ByteString byteString) throws InvalidProtocolBufferException {
        return JwtHmacKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public void validateKey(JwtHmacKey jwtHmacKey) throws GeneralSecurityException {
        Validators.validateVersion(jwtHmacKey.getVersion(), getVersion());
        if (jwtHmacKey.getKeyValue().size() < c(jwtHmacKey.getAlgorithm())) {
            throw new GeneralSecurityException("key too short");
        }
    }
}
