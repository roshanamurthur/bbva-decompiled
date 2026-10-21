package com.bbva.ethermobilesdk.cipher.jwt.extension;

import com.bbva.ethermobilesdk.cipher.jwt.model.JwtPayload;
import com.nimbusds.jwt.JWTClaimsSet;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JwtPayload.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"buildJwtClaim", "Lcom/nimbusds/jwt/JWTClaimsSet;", "Lcom/bbva/ethermobilesdk/cipher/jwt/model/JwtPayload;", "jwt-sign_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nJwtPayload.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JwtPayload.kt\ncom/bbva/ethermobilesdk/cipher/jwt/extension/JwtPayloadKt\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,22:1\n215#2,2:23\n*S KotlinDebug\n*F\n+ 1 JwtPayload.kt\ncom/bbva/ethermobilesdk/cipher/jwt/extension/JwtPayloadKt\n*L\n12#1:23,2\n*E\n"})
public final class JwtPayloadKt {
    @NotNull
    public static final JWTClaimsSet buildJwtClaim(@NotNull JwtPayload jwtPayload) {
        Intrinsics.checkNotNullParameter(jwtPayload, "<this>");
        JWTClaimsSet.Builder builder = new JWTClaimsSet.Builder();
        HashMap<String, Object> claim = jwtPayload.getClaim();
        if (claim != null) {
            for (Map.Entry<String, Object> entry : claim.entrySet()) {
                builder.claim(entry.getKey(), entry.getValue());
            }
        }
        builder.audience(jwtPayload.getAudience());
        builder.expirationTime(jwtPayload.getExpirationTime());
        builder.notBeforeTime(jwtPayload.getNotBeforeTime());
        builder.jwtID(jwtPayload.getJwtId());
        builder.issuer(jwtPayload.getIssuer());
        builder.subject(jwtPayload.getSubject());
        JWTClaimsSet jWTClaimsSetBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(jWTClaimsSetBuild, "Builder().apply {\n      …ct(subject)\n    }.build()");
        return jWTClaimsSetBuild;
    }
}
