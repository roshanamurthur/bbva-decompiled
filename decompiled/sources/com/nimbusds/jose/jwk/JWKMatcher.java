package com.nimbusds.jose.jwk;

import com.nimbusds.jose.Algorithm;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.util.Base64URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import net.jcip.annotations.Immutable;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
public class JWKMatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<KeyType> f62645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<KeyUse> f62646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<KeyOperation> f62647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set<Algorithm> f62648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set<String> f62649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f62650f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f62651g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f62652h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f62653i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f62654j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f62655k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Set<Integer> f62656l;
    public final Set<Curve> m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Set<Base64URL> f62657n;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Set<KeyType> f62658a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Set<KeyUse> f62659b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Set<KeyOperation> f62660c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Set<Algorithm> f62661d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Set<String> f62662e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f62663f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f62664g = false;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f62665h = false;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f62666i = false;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f62667j = 0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f62668k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Set<Integer> f62669l;
        public Set<Curve> m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Set<Base64URL> f62670n;

        public Builder algorithm(Algorithm algorithm) {
            if (algorithm == null) {
                this.f62661d = null;
            } else {
                this.f62661d = new HashSet(Collections.singletonList(algorithm));
            }
            return this;
        }

        public Builder algorithms(Algorithm... algorithmArr) {
            algorithms(new LinkedHashSet(Arrays.asList(algorithmArr)));
            return this;
        }

        public JWKMatcher build() {
            return new JWKMatcher(this.f62658a, this.f62659b, this.f62660c, this.f62661d, this.f62662e, this.f62663f, this.f62664g, this.f62665h, this.f62666i, this.f62667j, this.f62668k, this.f62669l, this.m, this.f62670n);
        }

        public Builder curve(Curve curve) {
            if (curve == null) {
                this.m = null;
            } else {
                this.m = Collections.singleton(curve);
            }
            return this;
        }

        public Builder curves(Curve... curveArr) {
            curves(new LinkedHashSet(Arrays.asList(curveArr)));
            return this;
        }

        public Builder hasKeyID(boolean z10) {
            this.f62664g = z10;
            return this;
        }

        public Builder hasKeyUse(boolean z10) {
            this.f62663f = z10;
            return this;
        }

        public Builder keyID(String str) {
            if (str == null) {
                this.f62662e = null;
            } else {
                this.f62662e = new HashSet(Collections.singletonList(str));
            }
            return this;
        }

        public Builder keyIDs(String... strArr) {
            keyIDs(new LinkedHashSet(Arrays.asList(strArr)));
            return this;
        }

        public Builder keyOperation(KeyOperation keyOperation) {
            if (keyOperation == null) {
                this.f62660c = null;
            } else {
                this.f62660c = new HashSet(Collections.singletonList(keyOperation));
            }
            return this;
        }

        public Builder keyOperations(KeyOperation... keyOperationArr) {
            keyOperations(new LinkedHashSet(Arrays.asList(keyOperationArr)));
            return this;
        }

        public Builder keySize(int i10) {
            if (i10 <= 0) {
                this.f62669l = null;
            } else {
                this.f62669l = Collections.singleton(Integer.valueOf(i10));
            }
            return this;
        }

        public Builder keySizes(int... iArr) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i10 : iArr) {
                linkedHashSet.add(Integer.valueOf(i10));
            }
            keySizes(linkedHashSet);
            return this;
        }

        public Builder keyType(KeyType keyType) {
            if (keyType == null) {
                this.f62658a = null;
            } else {
                this.f62658a = new HashSet(Collections.singletonList(keyType));
            }
            return this;
        }

        public Builder keyTypes(KeyType... keyTypeArr) {
            keyTypes(new LinkedHashSet(Arrays.asList(keyTypeArr)));
            return this;
        }

        public Builder keyUse(KeyUse keyUse) {
            if (keyUse == null) {
                this.f62659b = null;
            } else {
                this.f62659b = new HashSet(Collections.singletonList(keyUse));
            }
            return this;
        }

        public Builder keyUses(KeyUse... keyUseArr) {
            keyUses(new LinkedHashSet(Arrays.asList(keyUseArr)));
            return this;
        }

        public Builder maxKeySize(int i10) {
            this.f62668k = i10;
            return this;
        }

        public Builder minKeySize(int i10) {
            this.f62667j = i10;
            return this;
        }

        public Builder privateOnly(boolean z10) {
            this.f62665h = z10;
            return this;
        }

        public Builder publicOnly(boolean z10) {
            this.f62666i = z10;
            return this;
        }

        public Builder x509CertSHA256Thumbprint(Base64URL base64URL) {
            if (base64URL == null) {
                this.f62670n = null;
            } else {
                this.f62670n = Collections.singleton(base64URL);
            }
            return this;
        }

        public Builder x509CertSHA256Thumbprints(Base64URL... base64URLArr) {
            return x509CertSHA256Thumbprints(new LinkedHashSet(Arrays.asList(base64URLArr)));
        }

        public Builder algorithms(Set<Algorithm> set) {
            this.f62661d = set;
            return this;
        }

        public Builder curves(Set<Curve> set) {
            this.m = set;
            return this;
        }

        public Builder keyIDs(Set<String> set) {
            this.f62662e = set;
            return this;
        }

        public Builder keyOperations(Set<KeyOperation> set) {
            this.f62660c = set;
            return this;
        }

        public Builder keyTypes(Set<KeyType> set) {
            this.f62658a = set;
            return this;
        }

        public Builder keyUses(Set<KeyUse> set) {
            this.f62659b = set;
            return this;
        }

        public Builder x509CertSHA256Thumbprints(Set<Base64URL> set) {
            this.f62670n = set;
            return this;
        }

        public Builder keySizes(Set<Integer> set) {
            this.f62669l = set;
            return this;
        }
    }

    @Deprecated
    public JWKMatcher(Set<KeyType> set, Set<KeyUse> set2, Set<KeyOperation> set3, Set<Algorithm> set4, Set<String> set5, boolean z10, boolean z11) {
        this(set, set2, set3, set4, set5, z10, z11, 0, 0);
    }

    public static void a(StringBuilder sb2, String str, Set<?> set) {
        if (set != null) {
            sb2.append(str);
            sb2.append('=');
            if (set.size() == 1) {
                Object next = set.iterator().next();
                if (next == null) {
                    sb2.append("ANY");
                } else {
                    sb2.append(next.toString().trim());
                }
            } else {
                sb2.append(set.toString().trim());
            }
            sb2.append(' ');
        }
    }

    public static JWKMatcher forJWEHeader(JWEHeader jWEHeader) {
        return new Builder().keyType(KeyType.forAlgorithm(jWEHeader.getAlgorithm())).keyID(jWEHeader.getKeyID()).keyUses(KeyUse.ENCRYPTION, null).algorithms(jWEHeader.getAlgorithm(), null).build();
    }

    public static JWKMatcher forJWSHeader(JWSHeader jWSHeader) {
        JWSAlgorithm algorithm = jWSHeader.getAlgorithm();
        if (JWSAlgorithm.Family.RSA.contains(algorithm) || JWSAlgorithm.Family.EC.contains(algorithm)) {
            return new Builder().keyType(KeyType.forAlgorithm(algorithm)).keyID(jWSHeader.getKeyID()).keyUses(KeyUse.SIGNATURE, null).algorithms(algorithm, null).x509CertSHA256Thumbprint(jWSHeader.getX509CertSHA256Thumbprint()).build();
        }
        if (JWSAlgorithm.Family.HMAC_SHA.contains(algorithm)) {
            return new Builder().keyType(KeyType.forAlgorithm(algorithm)).keyID(jWSHeader.getKeyID()).privateOnly(true).algorithms(algorithm, null).build();
        }
        if (JWSAlgorithm.Family.ED.contains(algorithm)) {
            return new Builder().keyType(KeyType.forAlgorithm(algorithm)).keyID(jWSHeader.getKeyID()).keyUses(KeyUse.SIGNATURE, null).algorithms(algorithm, null).curves(Curve.forJWSAlgorithm(algorithm)).build();
        }
        return null;
    }

    public Set<Algorithm> getAlgorithms() {
        return this.f62648d;
    }

    public Set<Curve> getCurves() {
        return this.m;
    }

    public Set<String> getKeyIDs() {
        return this.f62649e;
    }

    public Set<KeyOperation> getKeyOperations() {
        return this.f62647c;
    }

    public Set<Integer> getKeySizes() {
        return this.f62656l;
    }

    public Set<KeyType> getKeyTypes() {
        return this.f62645a;
    }

    public Set<KeyUse> getKeyUses() {
        return this.f62646b;
    }

    public int getMaxKeySize() {
        return this.f62655k;
    }

    @Deprecated
    public int getMaxSize() {
        return getMaxKeySize();
    }

    public int getMinKeySize() {
        return this.f62654j;
    }

    @Deprecated
    public int getMinSize() {
        return getMinKeySize();
    }

    public Set<Base64URL> getX509CertSHA256Thumbprints() {
        return this.f62657n;
    }

    public boolean hasKeyID() {
        return this.f62651g;
    }

    public boolean hasKeyUse() {
        return this.f62650f;
    }

    public boolean isPrivateOnly() {
        return this.f62652h;
    }

    public boolean isPublicOnly() {
        return this.f62653i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean matches(JWK jwk) {
        if (this.f62650f && jwk.getKeyUse() == null) {
            return false;
        }
        if (this.f62651g && (jwk.getKeyID() == null || jwk.getKeyID().trim().isEmpty())) {
            return false;
        }
        if (this.f62652h && !jwk.isPrivate()) {
            return false;
        }
        if (this.f62653i && jwk.isPrivate()) {
            return false;
        }
        Set<KeyType> set = this.f62645a;
        if (set != null && !set.contains(jwk.getKeyType())) {
            return false;
        }
        Set<KeyUse> set2 = this.f62646b;
        if (set2 != null && !set2.contains(jwk.getKeyUse())) {
            return false;
        }
        Set<KeyOperation> set3 = this.f62647c;
        if (set3 != null && ((!set3.contains(null) || jwk.getKeyOperations() != null) && (jwk.getKeyOperations() == null || !set3.containsAll(jwk.getKeyOperations())))) {
            return false;
        }
        Set<Algorithm> set4 = this.f62648d;
        if (set4 != null && !set4.contains(jwk.getAlgorithm())) {
            return false;
        }
        Set<String> set5 = this.f62649e;
        if (set5 != null && !set5.contains(jwk.getKeyID())) {
            return false;
        }
        int i10 = this.f62654j;
        if (i10 > 0 && jwk.size() < i10) {
            return false;
        }
        int i11 = this.f62655k;
        if (i11 > 0 && jwk.size() > i11) {
            return false;
        }
        Set<Integer> set6 = this.f62656l;
        if (set6 != null && !set6.contains(Integer.valueOf(jwk.size()))) {
            return false;
        }
        Set<Curve> set7 = this.m;
        if (set7 != null && (!(jwk instanceof CurveBasedJWK) || !set7.contains(((CurveBasedJWK) jwk).getCurve()))) {
            return false;
        }
        Set<Base64URL> set8 = this.f62657n;
        if (set8 != null) {
            return set8.contains(jwk.getX509CertSHA256Thumbprint());
        }
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        a(sb2, "kty", this.f62645a);
        a(sb2, "use", this.f62646b);
        a(sb2, "key_ops", this.f62647c);
        a(sb2, "alg", this.f62648d);
        a(sb2, "kid", this.f62649e);
        if (this.f62650f) {
            sb2.append("has_use=true ");
        }
        if (this.f62651g) {
            sb2.append("has_id=true ");
        }
        if (this.f62652h) {
            sb2.append("private_only=true ");
        }
        if (this.f62653i) {
            sb2.append("public_only=true ");
        }
        int i10 = this.f62654j;
        if (i10 > 0) {
            sb2.append("min_size=" + i10 + " ");
        }
        int i11 = this.f62655k;
        if (i11 > 0) {
            sb2.append("max_size=" + i11 + " ");
        }
        a(sb2, "size", this.f62656l);
        a(sb2, "crv", this.m);
        a(sb2, "x5t#S256", this.f62657n);
        return sb2.toString().trim();
    }

    @Deprecated
    public JWKMatcher(Set<KeyType> set, Set<KeyUse> set2, Set<KeyOperation> set3, Set<Algorithm> set4, Set<String> set5, boolean z10, boolean z11, int i10, int i11) {
        this(set, set2, set3, set4, set5, z10, z11, i10, i11, null);
    }

    @Deprecated
    public JWKMatcher(Set<KeyType> set, Set<KeyUse> set2, Set<KeyOperation> set3, Set<Algorithm> set4, Set<String> set5, boolean z10, boolean z11, int i10, int i11, Set<Curve> set6) {
        this(set, set2, set3, set4, set5, z10, z11, i10, i11, null, set6);
    }

    @Deprecated
    public JWKMatcher(Set<KeyType> set, Set<KeyUse> set2, Set<KeyOperation> set3, Set<Algorithm> set4, Set<String> set5, boolean z10, boolean z11, int i10, int i11, Set<Integer> set6, Set<Curve> set7) {
        this(set, set2, set3, set4, set5, false, false, z10, z11, i10, i11, set6, set7);
    }

    @Deprecated
    public JWKMatcher(Set<KeyType> set, Set<KeyUse> set2, Set<KeyOperation> set3, Set<Algorithm> set4, Set<String> set5, boolean z10, boolean z11, boolean z12, boolean z13, int i10, int i11, Set<Integer> set6, Set<Curve> set7) {
        this(set, set2, set3, set4, set5, z10, z11, z12, z13, i10, i11, set6, set7, null);
    }

    public JWKMatcher(Set<KeyType> set, Set<KeyUse> set2, Set<KeyOperation> set3, Set<Algorithm> set4, Set<String> set5, boolean z10, boolean z11, boolean z12, boolean z13, int i10, int i11, Set<Integer> set6, Set<Curve> set7, Set<Base64URL> set8) {
        this.f62645a = set;
        this.f62646b = set2;
        this.f62647c = set3;
        this.f62648d = set4;
        this.f62649e = set5;
        this.f62650f = z10;
        this.f62651g = z11;
        this.f62652h = z12;
        this.f62653i = z13;
        this.f62654j = i10;
        this.f62655k = i11;
        this.f62656l = set6;
        this.m = set7;
        this.f62657n = set8;
    }
}
