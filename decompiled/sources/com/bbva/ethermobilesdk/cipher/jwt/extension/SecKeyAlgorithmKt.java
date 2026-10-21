package com.bbva.ethermobilesdk.cipher.jwt.extension;

import com.bbva.ethermobilesdk.cipher.jwt.model.SecKeyAlgorithm;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SecKeyAlgorithm.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"buildJwsHeader", "Lcom/nimbusds/jose/JWSHeader;", "Lcom/bbva/ethermobilesdk/cipher/jwt/model/SecKeyAlgorithm;", "jwt-sign_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SecKeyAlgorithmKt {

    /* JADX INFO: compiled from: SecKeyAlgorithm.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SecKeyAlgorithm.values().length];
            try {
                iArr[SecKeyAlgorithm.HS256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SecKeyAlgorithm.HS384.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SecKeyAlgorithm.HS512.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SecKeyAlgorithm.RS256.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SecKeyAlgorithm.RS384.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SecKeyAlgorithm.RS512.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final JWSHeader buildJwsHeader(@NotNull SecKeyAlgorithm secKeyAlgorithm) {
        Intrinsics.checkNotNullParameter(secKeyAlgorithm, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[secKeyAlgorithm.ordinal()]) {
            case 1:
                return new JWSHeader(JWSAlgorithm.HS256);
            case 2:
                return new JWSHeader(JWSAlgorithm.HS384);
            case 3:
                return new JWSHeader(JWSAlgorithm.HS512);
            case 4:
                return new JWSHeader(JWSAlgorithm.RS256);
            case 5:
                return new JWSHeader(JWSAlgorithm.RS384);
            case 6:
                return new JWSHeader(JWSAlgorithm.RS512);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
