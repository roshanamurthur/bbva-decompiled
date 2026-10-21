package com.google.crypto.tink.jwt;

import androidx.camera.camera2.internal.h0;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import com.google.crypto.tink.internal.Util;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.subtle.Base64;
import com.google.gson.JsonObject;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.util.Optional;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: compiled from: JwtFormat.java */
/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: compiled from: JwtFormat.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f46744a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f46745b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f46746c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f46747d;
    }

    public static String a(String str, byte[] bArr) {
        StringBuilder sbE = androidx.camera.core.processing.f.e(str, Constant.DOT_STRING);
        sbE.append(Base64.urlSafeEncode(bArr));
        return sbE.toString();
    }

    public static String b(String str, Optional<String> optional, RawJwt rawJwt) throws JwtInvalidException, InvalidAlgorithmParameterException {
        String string = rawJwt.f46731a.toString();
        Optional optionalOf = rawJwt.f46732b.isPresent() ? Optional.of(rawJwt.d()) : Optional.empty();
        StringBuilder sb2 = new StringBuilder();
        h(str);
        JsonObject jsonObject = new JsonObject();
        if (optional.isPresent()) {
            jsonObject.addProperty("kid", (String) optional.get());
        }
        jsonObject.addProperty("alg", str);
        if (optionalOf.isPresent()) {
            jsonObject.addProperty(ClientData.KEY_TYPE, (String) optionalOf.get());
        }
        String string2 = jsonObject.toString();
        Charset charset = Util.UTF_8;
        sb2.append(Base64.urlSafeEncode(string2.getBytes(charset)));
        sb2.append(Constant.DOT_STRING);
        sb2.append(Base64.urlSafeEncode(string.getBytes(charset)));
        return sb2.toString();
    }

    public static Optional<String> c(int i10, OutputPrefixType outputPrefixType) throws JwtInvalidException {
        if (outputPrefixType == OutputPrefixType.RAW) {
            return Optional.empty();
        }
        if (outputPrefixType == OutputPrefixType.TINK) {
            return Optional.of(Base64.urlSafeEncode(ByteBuffer.allocate(4).putInt(i10).array()));
        }
        throw new JwtInvalidException("unsupported output prefix type");
    }

    public static String d(JsonObject jsonObject, String str) throws JwtInvalidException {
        if (!jsonObject.has(str)) {
            throw new JwtInvalidException(h0.b("header ", str, " does not exist"));
        }
        if (jsonObject.get(str).isJsonPrimitive() && jsonObject.get(str).getAsJsonPrimitive().isString()) {
            return jsonObject.get(str).getAsString();
        }
        throw new JwtInvalidException(h0.b("header ", str, " is not a string"));
    }

    public static Optional<String> e(JsonObject jsonObject) throws JwtInvalidException {
        return jsonObject.has(ClientData.KEY_TYPE) ? Optional.of(d(jsonObject, ClientData.KEY_TYPE)) : Optional.empty();
    }

    public static a f(String str) throws JwtInvalidException {
        for (int i10 = 0; i10 < str.length(); i10++) {
            if ((str.charAt(i10) & 128) > 0) {
                throw new JwtInvalidException("Non ascii character");
            }
        }
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf < 0) {
            throw new JwtInvalidException("only tokens in JWS compact serialization format are supported");
        }
        String strSubstring = str.substring(0, iLastIndexOf);
        byte[] bArrG = g(str.substring(iLastIndexOf + 1));
        int iIndexOf = strSubstring.indexOf(46);
        if (iIndexOf < 0) {
            throw new JwtInvalidException("only tokens in JWS compact serialization format are supported");
        }
        String strSubstring2 = strSubstring.substring(0, iIndexOf);
        String strSubstring3 = strSubstring.substring(iIndexOf + 1);
        if (strSubstring3.indexOf(46) > 0) {
            throw new JwtInvalidException("only tokens in JWS compact serialization format are supported");
        }
        byte[] bArrG2 = g(strSubstring2);
        Charset charset = Util.UTF_8;
        try {
            charset.newDecoder().decode(ByteBuffer.wrap(bArrG2));
            String str2 = new String(bArrG2, charset);
            byte[] bArrG3 = g(strSubstring3);
            try {
                charset.newDecoder().decode(ByteBuffer.wrap(bArrG3));
                String str3 = new String(bArrG3, charset);
                a aVar = new a();
                aVar.f46744a = strSubstring;
                aVar.f46745b = bArrG;
                aVar.f46746c = str2;
                aVar.f46747d = str3;
                return aVar;
            } catch (CharacterCodingException e5) {
                throw new JwtInvalidException(e5.getMessage());
            }
        } catch (CharacterCodingException e7) {
            throw new JwtInvalidException(e7.getMessage());
        }
    }

    public static byte[] g(String str) throws JwtInvalidException {
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && !((cCharAt >= '0' && cCharAt <= '9') || cCharAt == '-' || cCharAt == '_'))) {
                throw new JwtInvalidException("invalid encoding");
            }
        }
        try {
            return Base64.urlSafeDecode(str);
        } catch (IllegalArgumentException e5) {
            throw new JwtInvalidException("invalid encoding: " + e5);
        }
    }

    public static void h(String str) throws InvalidAlgorithmParameterException {
        str.getClass();
        switch (str) {
            case "ES256":
            case "ES384":
            case "ES512":
            case "HS256":
            case "HS384":
            case "HS512":
            case "PS256":
            case "PS384":
            case "PS512":
            case "RS256":
            case "RS384":
            case "RS512":
                return;
            default:
                throw new InvalidAlgorithmParameterException("invalid algorithm: ".concat(str));
        }
    }

    public static void i(String str, Optional<String> optional, Optional<String> optional2, JsonObject jsonObject) throws JwtInvalidException, InvalidAlgorithmParameterException {
        h(str);
        String strD = d(jsonObject, "alg");
        if (!strD.equals(str)) {
            throw new InvalidAlgorithmParameterException(String.format("invalid algorithm; expected %s, got %s", str, strD));
        }
        if (jsonObject.has("crit")) {
            throw new JwtInvalidException("all tokens with crit headers are rejected");
        }
        if (optional.isPresent() && optional2.isPresent()) {
            throw new JwtInvalidException("custom_kid can only be set for RAW keys.");
        }
        boolean zHas = jsonObject.has("kid");
        if (optional.isPresent()) {
            if (!zHas) {
                throw new JwtInvalidException("missing kid in header");
            }
            if (!d(jsonObject, "kid").equals((String) optional.get())) {
                throw new JwtInvalidException("invalid kid in header");
            }
        }
        if (optional2.isPresent() && zHas && !d(jsonObject, "kid").equals((String) optional2.get())) {
            throw new JwtInvalidException("invalid kid in header");
        }
    }
}
