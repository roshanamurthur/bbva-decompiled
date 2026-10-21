package com.google.crypto.tink.jwt;

import com.bbva.glomohybrid.login.domain.constants.LoginHelperConstants;
import com.google.crypto.tink.Key;
import com.google.crypto.tink.KeyStatus;
import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.SecretKeyAccess;
import com.google.crypto.tink.internal.LegacyProtoKey;
import com.google.crypto.tink.internal.ProtoKeySerialization;
import com.google.crypto.tink.proto.JwtEcdsaAlgorithm;
import com.google.crypto.tink.proto.JwtEcdsaPublicKey;
import com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm;
import com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey;
import com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm;
import com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.subtle.Base64;
import com.google.crypto.tink.tinkkey.KeyAccess;
import com.google.errorprone.annotations.InlineMe;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonReader;
import java.io.IOException;
import java.io.StringReader;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.Optional;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class JwkSetConverter {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46699a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f46700b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f46701c;

        static {
            int[] iArr = new int[JwtRsaSsaPssAlgorithm.values().length];
            f46701c = iArr;
            try {
                iArr[JwtRsaSsaPssAlgorithm.PS256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46701c[JwtRsaSsaPssAlgorithm.PS384.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46701c[JwtRsaSsaPssAlgorithm.PS512.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[JwtRsaSsaPkcs1Algorithm.values().length];
            f46700b = iArr2;
            try {
                iArr2[JwtRsaSsaPkcs1Algorithm.RS256.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f46700b[JwtRsaSsaPkcs1Algorithm.RS384.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f46700b[JwtRsaSsaPkcs1Algorithm.RS512.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[JwtEcdsaAlgorithm.values().length];
            f46699a = iArr3;
            try {
                iArr3[JwtEcdsaAlgorithm.ES256.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f46699a[JwtEcdsaAlgorithm.ES384.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f46699a[JwtEcdsaAlgorithm.ES512.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public static void a(JsonObject jsonObject, String str, String str2) throws GeneralSecurityException {
        String strC = c(jsonObject, str);
        if (!strC.equals(str2)) {
            throw new GeneralSecurityException(androidx.camera.core.impl.utils.c.a("unexpected ", str, " value: ", strC));
        }
    }

    public static Optional<String> b(@Nullable Integer num) {
        return num == null ? Optional.empty() : Optional.of(Base64.urlSafeEncode(ByteBuffer.allocate(4).putInt(num.intValue()).array()));
    }

    public static String c(JsonObject jsonObject, String str) throws GeneralSecurityException {
        if (!jsonObject.has(str)) {
            throw new GeneralSecurityException(str.concat(" not found"));
        }
        if (jsonObject.get(str).isJsonPrimitive() && jsonObject.get(str).getAsJsonPrimitive().isString()) {
            return jsonObject.get(str).getAsString();
        }
        throw new GeneralSecurityException(str.concat(" is not a string"));
    }

    public static void d(JsonObject jsonObject) throws GeneralSecurityException {
        if (jsonObject.has("key_ops")) {
            if (!jsonObject.get("key_ops").isJsonArray()) {
                throw new GeneralSecurityException("key_ops is not an array");
            }
            JsonArray asJsonArray = jsonObject.get("key_ops").getAsJsonArray();
            if (asJsonArray.size() != 1) {
                throw new GeneralSecurityException("key_ops must contain exactly one element");
            }
            if (!asJsonArray.get(0).isJsonPrimitive() || !asJsonArray.get(0).getAsJsonPrimitive().isString()) {
                throw new GeneralSecurityException("key_ops is not a string");
            }
            if (asJsonArray.get(0).getAsString().equals("verify")) {
                return;
            }
            throw new GeneralSecurityException("unexpected keyOps value: " + asJsonArray.get(0).getAsString());
        }
    }

    @InlineMe(imports = {"com.google.crypto.tink.jwt.JwkSetConverter"}, replacement = "JwkSetConverter.fromPublicKeysetHandle(handle)")
    @Deprecated
    public static String fromKeysetHandle(KeysetHandle keysetHandle, KeyAccess keyAccess) throws GeneralSecurityException, IOException {
        return fromPublicKeysetHandle(keysetHandle);
    }

    public static String fromPublicKeysetHandle(KeysetHandle keysetHandle) throws GeneralSecurityException, IOException {
        String str;
        String str2;
        String str3;
        String str4;
        JsonArray jsonArray = new JsonArray();
        for (int i10 = 0; i10 < keysetHandle.size(); i10++) {
            KeysetHandle.Entry at = keysetHandle.getAt(i10);
            if (at.getStatus() == KeyStatus.ENABLED) {
                Key key = at.getKey();
                if (!(key instanceof LegacyProtoKey)) {
                    throw new GeneralSecurityException("only LegacyProtoKey is currently supported");
                }
                ProtoKeySerialization serialization = ((LegacyProtoKey) key).getSerialization(null);
                if (serialization.getOutputPrefixType() != OutputPrefixType.RAW && serialization.getOutputPrefixType() != OutputPrefixType.TINK) {
                    throw new GeneralSecurityException("only OutputPrefixType RAW and TINK are supported");
                }
                if (serialization.getKeyMaterialType() != KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC) {
                    throw new GeneralSecurityException("only public keys can be converted");
                }
                String typeUrl = serialization.getTypeUrl();
                typeUrl.getClass();
                switch (typeUrl) {
                    case "type.googleapis.com/google.crypto.tink.JwtEcdsaPublicKey":
                        try {
                            JwtEcdsaPublicKey from = JwtEcdsaPublicKey.parseFrom(serialization.getValue(), ExtensionRegistryLite.getEmptyRegistry());
                            int i11 = a.f46699a[from.getAlgorithm().ordinal()];
                            if (i11 == 1) {
                                str2 = "ES256";
                                str3 = "P-256";
                            } else if (i11 == 2) {
                                str2 = "ES384";
                                str3 = "P-384";
                            } else {
                                if (i11 != 3) {
                                    throw new GeneralSecurityException("unknown algorithm");
                                }
                                str2 = "ES512";
                                str3 = "P-521";
                            }
                            JsonObject jsonObject = new JsonObject();
                            jsonObject.addProperty("kty", LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC);
                            jsonObject.addProperty("crv", str3);
                            jsonObject.addProperty("x", Base64.urlSafeEncode(from.getX().toByteArray()));
                            jsonObject.addProperty("y", Base64.urlSafeEncode(from.getY().toByteArray()));
                            jsonObject.addProperty("use", "sig");
                            jsonObject.addProperty("alg", str2);
                            JsonArray jsonArray2 = new JsonArray();
                            jsonArray2.add("verify");
                            jsonObject.add("key_ops", jsonArray2);
                            Optional<String> optionalB = b(serialization.getIdRequirementOrNull());
                            if (optionalB.isPresent()) {
                                jsonObject.addProperty("kid", (String) optionalB.get());
                            } else if (from.hasCustomKid()) {
                                jsonObject.addProperty("kid", from.getCustomKid().getValue());
                            }
                            jsonArray.add(jsonObject);
                            break;
                        } catch (InvalidProtocolBufferException e5) {
                            throw new GeneralSecurityException("failed to parse value as JwtEcdsaPublicKey proto", e5);
                        }
                        break;
                    case "type.googleapis.com/google.crypto.tink.JwtRsaSsaPkcs1PublicKey":
                        try {
                            JwtRsaSsaPkcs1PublicKey from2 = JwtRsaSsaPkcs1PublicKey.parseFrom(serialization.getValue(), ExtensionRegistryLite.getEmptyRegistry());
                            int i12 = a.f46700b[from2.getAlgorithm().ordinal()];
                            if (i12 == 1) {
                                str4 = "RS256";
                            } else if (i12 == 2) {
                                str4 = "RS384";
                            } else {
                                if (i12 != 3) {
                                    throw new GeneralSecurityException("unknown algorithm");
                                }
                                str4 = "RS512";
                            }
                            JsonObject jsonObject2 = new JsonObject();
                            jsonObject2.addProperty("kty", "RSA");
                            jsonObject2.addProperty("n", Base64.urlSafeEncode(from2.getN().toByteArray()));
                            jsonObject2.addProperty("e", Base64.urlSafeEncode(from2.getE().toByteArray()));
                            jsonObject2.addProperty("use", "sig");
                            jsonObject2.addProperty("alg", str4);
                            JsonArray jsonArray3 = new JsonArray();
                            jsonArray3.add("verify");
                            jsonObject2.add("key_ops", jsonArray3);
                            Optional<String> optionalB2 = b(serialization.getIdRequirementOrNull());
                            if (optionalB2.isPresent()) {
                                jsonObject2.addProperty("kid", (String) optionalB2.get());
                            } else if (from2.hasCustomKid()) {
                                jsonObject2.addProperty("kid", from2.getCustomKid().getValue());
                            }
                            jsonArray.add(jsonObject2);
                            break;
                        } catch (InvalidProtocolBufferException e7) {
                            throw new GeneralSecurityException("failed to parse value as JwtRsaSsaPkcs1PublicKey proto", e7);
                        }
                        break;
                    case "type.googleapis.com/google.crypto.tink.JwtRsaSsaPssPublicKey":
                        try {
                            JwtRsaSsaPssPublicKey from3 = JwtRsaSsaPssPublicKey.parseFrom(serialization.getValue(), ExtensionRegistryLite.getEmptyRegistry());
                            int i13 = a.f46701c[from3.getAlgorithm().ordinal()];
                            if (i13 == 1) {
                                str = "PS256";
                            } else if (i13 == 2) {
                                str = "PS384";
                            } else {
                                if (i13 != 3) {
                                    throw new GeneralSecurityException("unknown algorithm");
                                }
                                str = "PS512";
                            }
                            JsonObject jsonObject3 = new JsonObject();
                            jsonObject3.addProperty("kty", "RSA");
                            jsonObject3.addProperty("n", Base64.urlSafeEncode(from3.getN().toByteArray()));
                            jsonObject3.addProperty("e", Base64.urlSafeEncode(from3.getE().toByteArray()));
                            jsonObject3.addProperty("use", "sig");
                            jsonObject3.addProperty("alg", str);
                            JsonArray jsonArray4 = new JsonArray();
                            jsonArray4.add("verify");
                            jsonObject3.add("key_ops", jsonArray4);
                            Optional<String> optionalB3 = b(serialization.getIdRequirementOrNull());
                            if (optionalB3.isPresent()) {
                                jsonObject3.addProperty("kid", (String) optionalB3.get());
                            } else if (from3.hasCustomKid()) {
                                jsonObject3.addProperty("kid", from3.getCustomKid().getValue());
                            }
                            jsonArray.add(jsonObject3);
                            break;
                        } catch (InvalidProtocolBufferException e10) {
                            throw new GeneralSecurityException("failed to parse value as JwtRsaSsaPssPublicKey proto", e10);
                        }
                        break;
                    default:
                        throw new GeneralSecurityException(String.format("key type %s is not supported", serialization.getTypeUrl()));
                }
            }
        }
        JsonObject jsonObject4 = new JsonObject();
        jsonObject4.add("keys", jsonArray);
        return jsonObject4.toString();
    }

    @InlineMe(imports = {"com.google.crypto.tink.jwt.JwkSetConverter"}, replacement = "JwkSetConverter.toPublicKeysetHandle(jwkSet)")
    @Deprecated
    public static KeysetHandle toKeysetHandle(String str, KeyAccess keyAccess) throws GeneralSecurityException, IOException {
        return toPublicKeysetHandle(str);
    }

    /* JADX WARN: Code duplicated, block: B:127:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:12:0x0058  */
    /* JADX WARN: Code duplicated, block: B:181:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x0193 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:54:0x0101  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c5 A[PHI: r20
      0x01c5: PHI (r20v6 java.lang.String) = (r20v2 java.lang.String), (r20v3 java.lang.String), (r20v4 java.lang.String), (r20v7 java.lang.String) binds: [B:90:0x01ec, B:86:0x01de, B:82:0x01d0, B:79:0x01c3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static KeysetHandle toPublicKeysetHandle(String str) throws GeneralSecurityException, IOException {
        int i10;
        byte b10;
        JwtEcdsaAlgorithm jwtEcdsaAlgorithm;
        SecretKeyAccess secretKeyAccess;
        ProtoKeySerialization protoKeySerializationCreate;
        String str2;
        byte b11;
        JwtRsaSsaPssAlgorithm jwtRsaSsaPssAlgorithm;
        byte b12;
        JwtRsaSsaPkcs1Algorithm jwtRsaSsaPkcs1Algorithm;
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            int i11 = 0;
            jsonReader.setLenient(false);
            JsonObject asJsonObject = Streams.parse(jsonReader).getAsJsonObject();
            KeysetHandle.Builder builderNewBuilder = KeysetHandle.newBuilder();
            Iterator<JsonElement> it = asJsonObject.get("keys").getAsJsonArray().iterator();
            while (it.hasNext()) {
                JsonObject asJsonObject2 = it.next().getAsJsonObject();
                String strSubstring = c(asJsonObject2, "alg").substring(i11, 2);
                strSubstring.getClass();
                int iHashCode = strSubstring.hashCode();
                if (iHashCode != 2222) {
                    if (iHashCode != 2563) {
                        if (iHashCode == 2625 && strSubstring.equals("RS")) {
                            i10 = 2;
                        } else {
                            i10 = -1;
                        }
                    } else if (strSubstring.equals(LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_PS)) {
                        i10 = 1;
                    } else {
                        i10 = -1;
                    }
                } else if (strSubstring.equals("ES")) {
                    i10 = i11;
                } else {
                    i10 = -1;
                }
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new GeneralSecurityException("unexpected alg value: " + c(asJsonObject2, "alg"));
                        }
                        String strC = c(asJsonObject2, "alg");
                        strC.getClass();
                        switch (strC.hashCode()) {
                            case 78251122:
                                if (strC.equals("RS256")) {
                                    b12 = 0;
                                }
                                switch (b12) {
                                    case 0:
                                        jwtRsaSsaPkcs1Algorithm = JwtRsaSsaPkcs1Algorithm.RS256;
                                        break;
                                    case 1:
                                        jwtRsaSsaPkcs1Algorithm = JwtRsaSsaPkcs1Algorithm.RS384;
                                        break;
                                    case 2:
                                        jwtRsaSsaPkcs1Algorithm = JwtRsaSsaPkcs1Algorithm.RS512;
                                        break;
                                    default:
                                        throw new GeneralSecurityException("Unknown Rsa Algorithm: " + c(asJsonObject2, "alg"));
                                }
                                if (!asJsonObject2.has("p") || asJsonObject2.has("q") || asJsonObject2.has("dp") || asJsonObject2.has("dq") || asJsonObject2.has("d") || asJsonObject2.has("qi")) {
                                    throw new UnsupportedOperationException("importing RSA private keys is not implemented");
                                }
                                a(asJsonObject2, "kty", "RSA");
                                if (asJsonObject2.has("use")) {
                                    a(asJsonObject2, "use", "sig");
                                }
                                d(asJsonObject2);
                                JwtRsaSsaPkcs1PublicKey.Builder n7 = JwtRsaSsaPkcs1PublicKey.newBuilder().setVersion(0).setAlgorithm(jwtRsaSsaPkcs1Algorithm).setE(ByteString.copyFrom(Base64.urlSafeDecode(c(asJsonObject2, "e")))).setN(ByteString.copyFrom(Base64.urlSafeDecode(c(asJsonObject2, "n"))));
                                if (asJsonObject2.has("kid")) {
                                    n7.setCustomKid(JwtRsaSsaPkcs1PublicKey.CustomKid.newBuilder().setValue(c(asJsonObject2, "kid")).build());
                                }
                                protoKeySerializationCreate = ProtoKeySerialization.create("type.googleapis.com/google.crypto.tink.JwtRsaSsaPkcs1PublicKey", n7.build().toByteString(), KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC, OutputPrefixType.RAW, null);
                                break;
                            case 78252174:
                                if (strC.equals("RS384")) {
                                    b12 = 1;
                                }
                                switch (b12) {
                                    case 0:
                                        jwtRsaSsaPkcs1Algorithm = JwtRsaSsaPkcs1Algorithm.RS256;
                                        break;
                                    case 1:
                                        jwtRsaSsaPkcs1Algorithm = JwtRsaSsaPkcs1Algorithm.RS384;
                                        break;
                                    case 2:
                                        jwtRsaSsaPkcs1Algorithm = JwtRsaSsaPkcs1Algorithm.RS512;
                                        break;
                                    default:
                                        throw new GeneralSecurityException("Unknown Rsa Algorithm: " + c(asJsonObject2, "alg"));
                                }
                                if (!asJsonObject2.has("p")) {
                                }
                                throw new UnsupportedOperationException("importing RSA private keys is not implemented");
                            case 78253877:
                                if (strC.equals("RS512")) {
                                    b12 = 2;
                                }
                                switch (b12) {
                                    case 0:
                                        jwtRsaSsaPkcs1Algorithm = JwtRsaSsaPkcs1Algorithm.RS256;
                                        break;
                                    case 1:
                                        jwtRsaSsaPkcs1Algorithm = JwtRsaSsaPkcs1Algorithm.RS384;
                                        break;
                                    case 2:
                                        jwtRsaSsaPkcs1Algorithm = JwtRsaSsaPkcs1Algorithm.RS512;
                                        break;
                                    default:
                                        throw new GeneralSecurityException("Unknown Rsa Algorithm: " + c(asJsonObject2, "alg"));
                                }
                                if (!asJsonObject2.has("p")) {
                                }
                                throw new UnsupportedOperationException("importing RSA private keys is not implemented");
                        }
                        b12 = -1;
                        switch (b12) {
                            case 0:
                                jwtRsaSsaPkcs1Algorithm = JwtRsaSsaPkcs1Algorithm.RS256;
                                break;
                            case 1:
                                jwtRsaSsaPkcs1Algorithm = JwtRsaSsaPkcs1Algorithm.RS384;
                                break;
                            case 2:
                                jwtRsaSsaPkcs1Algorithm = JwtRsaSsaPkcs1Algorithm.RS512;
                                break;
                            default:
                                throw new GeneralSecurityException("Unknown Rsa Algorithm: " + c(asJsonObject2, "alg"));
                        }
                        if (!asJsonObject2.has("p")) {
                        }
                        throw new UnsupportedOperationException("importing RSA private keys is not implemented");
                    }
                    String strC2 = c(asJsonObject2, "alg");
                    strC2.getClass();
                    switch (strC2.hashCode()) {
                        case 76404080:
                            str2 = "kid";
                            if (!strC2.equals("PS256")) {
                                b11 = -1;
                            } else {
                                b11 = 0;
                            }
                            break;
                        case 76405132:
                            str2 = "kid";
                            if (!strC2.equals("PS384")) {
                                b11 = -1;
                            } else {
                                b11 = 1;
                            }
                            break;
                        case 76406835:
                            str2 = "kid";
                            if (!strC2.equals("PS512")) {
                                b11 = -1;
                            } else {
                                b11 = 2;
                            }
                            break;
                        default:
                            str2 = "kid";
                            b11 = -1;
                            break;
                    }
                    switch (b11) {
                        case 0:
                            jwtRsaSsaPssAlgorithm = JwtRsaSsaPssAlgorithm.PS256;
                            break;
                        case 1:
                            jwtRsaSsaPssAlgorithm = JwtRsaSsaPssAlgorithm.PS384;
                            break;
                        case 2:
                            jwtRsaSsaPssAlgorithm = JwtRsaSsaPssAlgorithm.PS512;
                            break;
                        default:
                            throw new GeneralSecurityException("Unknown Rsa Algorithm: " + c(asJsonObject2, "alg"));
                    }
                    if (asJsonObject2.has("p") || asJsonObject2.has("q") || asJsonObject2.has("dq") || asJsonObject2.has("dq") || asJsonObject2.has("d") || asJsonObject2.has("qi")) {
                        throw new UnsupportedOperationException("importing RSA private keys is not implemented");
                    }
                    a(asJsonObject2, "kty", "RSA");
                    if (asJsonObject2.has("use")) {
                        a(asJsonObject2, "use", "sig");
                    }
                    d(asJsonObject2);
                    JwtRsaSsaPssPublicKey.Builder n10 = JwtRsaSsaPssPublicKey.newBuilder().setVersion(0).setAlgorithm(jwtRsaSsaPssAlgorithm).setE(ByteString.copyFrom(Base64.urlSafeDecode(c(asJsonObject2, "e")))).setN(ByteString.copyFrom(Base64.urlSafeDecode(c(asJsonObject2, "n"))));
                    String str3 = str2;
                    if (asJsonObject2.has(str3)) {
                        n10.setCustomKid(JwtRsaSsaPssPublicKey.CustomKid.newBuilder().setValue(c(asJsonObject2, str3)).build());
                    }
                    protoKeySerializationCreate = ProtoKeySerialization.create("type.googleapis.com/google.crypto.tink.JwtRsaSsaPssPublicKey", n10.build().toByteString(), KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC, OutputPrefixType.RAW, null);
                    secretKeyAccess = null;
                } else {
                    String strC3 = c(asJsonObject2, "alg");
                    strC3.getClass();
                    int iHashCode2 = strC3.hashCode();
                    if (iHashCode2 != 66245349) {
                        if (iHashCode2 != 66246401) {
                            if (iHashCode2 == 66248104 && strC3.equals("ES512")) {
                                b10 = 2;
                            } else {
                                b10 = -1;
                            }
                        } else if (strC3.equals("ES384")) {
                            b10 = 1;
                        } else {
                            b10 = -1;
                        }
                    } else if (strC3.equals("ES256")) {
                        b10 = 0;
                    } else {
                        b10 = -1;
                    }
                    if (b10 == 0) {
                        a(asJsonObject2, "crv", "P-256");
                        jwtEcdsaAlgorithm = JwtEcdsaAlgorithm.ES256;
                    } else if (b10 == 1) {
                        a(asJsonObject2, "crv", "P-384");
                        jwtEcdsaAlgorithm = JwtEcdsaAlgorithm.ES384;
                    } else {
                        if (b10 != 2) {
                            throw new GeneralSecurityException("Unknown Ecdsa Algorithm: " + c(asJsonObject2, "alg"));
                        }
                        a(asJsonObject2, "crv", "P-521");
                        jwtEcdsaAlgorithm = JwtEcdsaAlgorithm.ES512;
                    }
                    if (asJsonObject2.has("d")) {
                        throw new UnsupportedOperationException("importing ECDSA private keys is not implemented");
                    }
                    a(asJsonObject2, "kty", LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC);
                    if (asJsonObject2.has("use")) {
                        a(asJsonObject2, "use", "sig");
                    }
                    d(asJsonObject2);
                    JwtEcdsaPublicKey.Builder y7 = JwtEcdsaPublicKey.newBuilder().setVersion(0).setAlgorithm(jwtEcdsaAlgorithm).setX(ByteString.copyFrom(Base64.urlSafeDecode(c(asJsonObject2, "x")))).setY(ByteString.copyFrom(Base64.urlSafeDecode(c(asJsonObject2, "y"))));
                    if (asJsonObject2.has("kid")) {
                        y7.setCustomKid(JwtEcdsaPublicKey.CustomKid.newBuilder().setValue(c(asJsonObject2, "kid")).build());
                    }
                    secretKeyAccess = null;
                    protoKeySerializationCreate = ProtoKeySerialization.create("type.googleapis.com/google.crypto.tink.JwtEcdsaPublicKey", y7.build().toByteString(), KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC, OutputPrefixType.RAW, null);
                }
                KeysetHandle.Builder builder = builderNewBuilder;
                builder.addEntry(KeysetHandle.importKey(new LegacyProtoKey(protoKeySerializationCreate, secretKeyAccess)).withRandomId());
                builderNewBuilder = builder;
                it = it;
                i11 = 0;
            }
            KeysetHandle.Builder builder2 = builderNewBuilder;
            if (builder2.size() <= 0) {
                throw new GeneralSecurityException("empty keyset");
            }
            builder2.getAt(0).makePrimary();
            return builder2.build();
        } catch (JsonParseException | IllegalStateException | StackOverflowError e5) {
            throw new GeneralSecurityException("JWK set is invalid JSON", e5);
        }
    }
}
