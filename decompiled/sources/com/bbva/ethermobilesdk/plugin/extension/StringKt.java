package com.bbva.ethermobilesdk.plugin.extension;

import androidx.camera.camera2.internal.compat.u;
import com.bbva.ethermobilesdk.cipher.model.HashAlgorithm;
import com.bbva.ethermobilesdk.cipher.model.HmacAlgorithm;
import com.bbva.ethermobilesdk.cipher.model.SymmetricAlgorithm;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: String.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0002*\u00020\u0002H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0002*\u00020\u0002H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0002*\u00020\u0002H\u0000\u001a\f\u0010\b\u001a\u00020\u0002*\u00020\u0002H\u0000\u001a\f\u0010\t\u001a\u00020\n*\u00020\u0002H\u0000¨\u0006\u000b"}, d2 = {"toHashAlgorithm", "Lcom/bbva/ethermobilesdk/cipher/model/HashAlgorithm;", "", "toHmacAlgorithm", "Lcom/bbva/ethermobilesdk/cipher/model/HmacAlgorithm;", "toJweRsaKeyPairContentAlgorithm", "toJweRsaKeyPairKeyAlgorithm", "toSymmetricAlgorithm", "toSymmetricAlgorithmTransformation", "toSymmetricKeyAlgorithm", "Lcom/bbva/ethermobilesdk/cipher/model/SymmetricAlgorithm;", "cipher-plugin_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class StringKt {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    public static final HashAlgorithm toHashAlgorithm(@NotNull String str) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        switch (str.hashCode()) {
            case -1523887821:
                if (str.equals(McElieceCCA2KeyGenParameterSpec.SHA224)) {
                    return HashAlgorithm.SHA224;
                }
                break;
            case -1523887726:
                if (str.equals("SHA-256")) {
                    return HashAlgorithm.SHA256;
                }
                break;
            case -1523886674:
                if (str.equals(McElieceCCA2KeyGenParameterSpec.SHA384)) {
                    return HashAlgorithm.SHA384;
                }
                break;
            case -1523884971:
                if (str.equals("SHA-512")) {
                    return HashAlgorithm.SHA512;
                }
                break;
        }
        throw new NoSuchAlgorithmException(str.concat(" algorithm does not exist"));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    public static final HmacAlgorithm toHmacAlgorithm(@NotNull String str) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        switch (str.hashCode()) {
            case -1523887821:
                if (str.equals(McElieceCCA2KeyGenParameterSpec.SHA224)) {
                    return HmacAlgorithm.SHA224;
                }
                break;
            case -1523887726:
                if (str.equals("SHA-256")) {
                    return HmacAlgorithm.SHA256;
                }
                break;
            case -1523886674:
                if (str.equals(McElieceCCA2KeyGenParameterSpec.SHA384)) {
                    return HmacAlgorithm.SHA384;
                }
                break;
            case -1523884971:
                if (str.equals("SHA-512")) {
                    return HmacAlgorithm.SHA512;
                }
                break;
        }
        throw new NoSuchAlgorithmException(str.concat(" algorithm does not exist"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        if (r2.equals("A256GCM") != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        if (r2.equals("A192GCM") != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
    
        if (r2.equals("A128GCM") != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        if (r2.equals("A192CBC-HS384") != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r2.equals("A128CBC-HS256") != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        if (r2.equals("A256CBC-HS512") != false) goto L22;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String toJweRsaKeyPairContentAlgorithm(@org.jetbrains.annotations.NotNull java.lang.String r2) throws java.security.NoSuchAlgorithmException {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r2.hashCode()
            switch(r0) {
                case -1532459726: goto L3a;
                case -991059749: goto L31;
                case -984773848: goto L28;
                case -959719617: goto L1f;
                case 703408816: goto L16;
                case 1277183113: goto Ld;
                default: goto Lc;
            }
        Lc:
            goto L43
        Ld:
            java.lang.String r0 = "A128CBC-HS256"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L43
            goto L42
        L16:
            java.lang.String r0 = "A256CBC-HS512"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L43
            goto L42
        L1f:
            java.lang.String r0 = "A256GCM"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L43
            goto L42
        L28:
            java.lang.String r0 = "A192GCM"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L43
            goto L42
        L31:
            java.lang.String r0 = "A128GCM"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L43
            goto L42
        L3a:
            java.lang.String r0 = "A192CBC-HS384"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L43
        L42:
            return r2
        L43:
            java.security.NoSuchAlgorithmException r0 = new java.security.NoSuchAlgorithmException
            java.lang.String r1 = " content algorithm does not exist"
            java.lang.String r2 = r2.concat(r1)
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bbva.ethermobilesdk.plugin.extension.StringKt.toJweRsaKeyPairContentAlgorithm(java.lang.String):java.lang.String");
    }

    @NotNull
    public static final String toJweRsaKeyPairKeyAlgorithm(@NotNull String str) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int iHashCode = str.hashCode();
        if (iHashCode == -1868738169 ? !str.equals("RSA1_5") : iHashCode == -890830960 ? !str.equals("RSA-OAEP-256") : !(iHashCode == -565207670 && str.equals("RSA-OAEP"))) {
            throw new NoSuchAlgorithmException(str.concat(" algorithm does not exist"));
        }
        return str;
    }

    @NotNull
    public static final String toSymmetricAlgorithm(@NotNull String str) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (Intrinsics.areEqual(str, "AES")) {
            return str;
        }
        throw new NoSuchAlgorithmException(u.f(str, " algorithm does not exist"));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    public static final String toSymmetricAlgorithmTransformation(@NotNull String str) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        switch (str.hashCode()) {
            case -2125161149:
                if (str.equals("AES/CBC-PKCS7")) {
                    return "AES/CBC/PKCS5Padding";
                }
                break;
            case -1664237881:
                if (str.equals("AES/CBC-NoPadding")) {
                    return "AES/CBC/NoPadding";
                }
                break;
            case -589796125:
                if (str.equals("AES/ECB-PKCS7")) {
                    return "AES/ECB/PKCS5Padding";
                }
                break;
            case -325009817:
                if (str.equals("AES/ECB-NoPadding")) {
                    return "AES/ECB/NoPadding";
                }
                break;
        }
        throw new NoSuchAlgorithmException(str.concat(" algorithm does not exist"));
    }

    @NotNull
    public static final SymmetricAlgorithm toSymmetricKeyAlgorithm(@NotNull String str) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int iHashCode = str.hashCode();
        if (iHashCode != -388349927) {
            if (iHashCode != -388349716) {
                if (iHashCode == -388348875 && str.equals("AES-256")) {
                    return SymmetricAlgorithm.AES_256;
                }
            } else if (str.equals("AES-192")) {
                return SymmetricAlgorithm.AES_192;
            }
        } else if (str.equals("AES-128")) {
            return SymmetricAlgorithm.AES_128;
        }
        throw new NoSuchAlgorithmException(str.concat(" algorithm does not exist"));
    }
}
