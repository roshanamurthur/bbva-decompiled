package com.bbva.ethermobilesdk.cipher.jwt;

import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobile.help.kit.result.ResultKt;
import com.bbva.ethermobilesdk.cipher.jwt.extension.JwtPayloadKt;
import com.bbva.ethermobilesdk.cipher.jwt.extension.SecKeyAlgorithmKt;
import com.bbva.ethermobilesdk.cipher.jwt.model.JwtPayload;
import com.bbva.ethermobilesdk.cipher.jwt.model.SecKeyAlgorithm;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.crypto.MACSigner;
import com.nimbusds.jose.crypto.MACVerifier;
import com.nimbusds.jose.crypto.RSASSASigner;
import com.nimbusds.jose.crypto.RSASSAVerifier;
import com.nimbusds.jwt.SignedJWT;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JwtSign.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bJ\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012J\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r¨\u0006\u0013"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/jwt/JwtSign;", "", "()V", "sign", "Lcom/bbva/ethermobile/help/kit/result/Result;", "", "data", "Lcom/bbva/ethermobilesdk/cipher/jwt/model/JwtPayload;", "rsaPrivateKey", "Ljava/security/interfaces/RSAPrivateKey;", "secKeyAlgorithm", "Lcom/bbva/ethermobilesdk/cipher/jwt/model/SecKeyAlgorithm;", "secret", "", "verify", "", "serializedJwt", "rsaPublicKey", "Ljava/security/interfaces/RSAPublicKey;", "jwt-sign_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class JwtSign {

    /* JADX INFO: compiled from: JwtSign.kt */
    public static final class a extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ SecKeyAlgorithm f29316p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ JwtPayload f29317q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ byte[] f29318r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(JwtPayload jwtPayload, byte[] bArr, SecKeyAlgorithm secKeyAlgorithm) {
            super(0);
            this.f29316p0 = secKeyAlgorithm;
            this.f29317q0 = jwtPayload;
            this.f29318r0 = bArr;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() throws JOSEException {
            SignedJWT signedJWT = new SignedJWT(SecKeyAlgorithmKt.buildJwsHeader(this.f29316p0), JwtPayloadKt.buildJwtClaim(this.f29317q0));
            signedJWT.sign(new MACSigner(this.f29318r0));
            String strSerialize = signedJWT.serialize();
            Intrinsics.checkNotNullExpressionValue(strSerialize, "SignedJWT(secKeyAlgorith…t))\n        }.serialize()");
            return strSerialize;
        }
    }

    /* JADX INFO: compiled from: JwtSign.kt */
    public static final class b extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ SecKeyAlgorithm f29319p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ JwtPayload f29320q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ RSAPrivateKey f29321r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(JwtPayload jwtPayload, RSAPrivateKey rSAPrivateKey, SecKeyAlgorithm secKeyAlgorithm) {
            super(0);
            this.f29319p0 = secKeyAlgorithm;
            this.f29320q0 = jwtPayload;
            this.f29321r0 = rSAPrivateKey;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() throws JOSEException {
            SignedJWT signedJWT = new SignedJWT(SecKeyAlgorithmKt.buildJwsHeader(this.f29319p0), JwtPayloadKt.buildJwtClaim(this.f29320q0));
            signedJWT.sign(new RSASSASigner(this.f29321r0));
            String strSerialize = signedJWT.serialize();
            Intrinsics.checkNotNullExpressionValue(strSerialize, "SignedJWT(secKeyAlgorith…            }.serialize()");
            return strSerialize;
        }
    }

    /* JADX INFO: compiled from: JwtSign.kt */
    public static final class c extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f29322p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ byte[] f29323q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, byte[] bArr) {
            super(0);
            this.f29322p0 = str;
            this.f29323q0 = bArr;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(SignedJWT.parse(this.f29322p0).verify(new MACVerifier(this.f29323q0)));
        }
    }

    /* JADX INFO: compiled from: JwtSign.kt */
    public static final class d extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f29324p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ RSAPublicKey f29325q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, RSAPublicKey rSAPublicKey) {
            super(0);
            this.f29324p0 = str;
            this.f29325q0 = rSAPublicKey;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(SignedJWT.parse(this.f29324p0).verify(new RSASSAVerifier(this.f29325q0)));
        }
    }

    @NotNull
    public final Result<String> sign(@NotNull JwtPayload data, @NotNull byte[] secret, @NotNull SecKeyAlgorithm secKeyAlgorithm) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(secret, "secret");
        Intrinsics.checkNotNullParameter(secKeyAlgorithm, "secKeyAlgorithm");
        return ResultKt.catching(new a(data, secret, secKeyAlgorithm));
    }

    @NotNull
    public final Result<Boolean> verify(@NotNull String serializedJwt, @NotNull byte[] secret) {
        Intrinsics.checkNotNullParameter(serializedJwt, "serializedJwt");
        Intrinsics.checkNotNullParameter(secret, "secret");
        return ResultKt.catching(new c(serializedJwt, secret));
    }

    @NotNull
    public final Result<String> sign(@NotNull JwtPayload data, @NotNull RSAPrivateKey rsaPrivateKey, @NotNull SecKeyAlgorithm secKeyAlgorithm) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(rsaPrivateKey, "rsaPrivateKey");
        Intrinsics.checkNotNullParameter(secKeyAlgorithm, "secKeyAlgorithm");
        return ResultKt.catching(new b(data, rsaPrivateKey, secKeyAlgorithm));
    }

    @NotNull
    public final Result<Boolean> verify(@NotNull String serializedJwt, @NotNull RSAPublicKey rsaPublicKey) {
        Intrinsics.checkNotNullParameter(serializedJwt, "serializedJwt");
        Intrinsics.checkNotNullParameter(rsaPublicKey, "rsaPublicKey");
        return ResultKt.catching(new d(serializedJwt, rsaPublicKey));
    }
}
