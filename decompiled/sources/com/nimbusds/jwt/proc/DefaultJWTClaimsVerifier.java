package com.nimbusds.jwt.proc;

import com.nimbusds.jose.proc.SecurityContext;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.util.DateUtils;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import net.jcip.annotations.ThreadSafe;

/* JADX INFO: loaded from: classes10.dex */
@ThreadSafe
public class DefaultJWTClaimsVerifier<C extends SecurityContext> implements JWTClaimsSetVerifier<C>, JWTClaimsVerifier, ClockSkewAware {
    public static final int DEFAULT_MAX_CLOCK_SKEW_SECONDS = 60;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f62838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<String> f62839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JWTClaimsSet f62840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set<String> f62841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set<String> f62842e;

    public DefaultJWTClaimsVerifier() {
        this(null, null, null, null);
    }

    public Set<String> getAcceptedAudienceValues() {
        return this.f62839b;
    }

    public JWTClaimsSet getExactMatchClaims() {
        return this.f62840c;
    }

    @Override // com.nimbusds.jwt.proc.ClockSkewAware
    public int getMaxClockSkew() {
        return this.f62838a;
    }

    public Set<String> getProhibitedClaims() {
        return this.f62842e;
    }

    public Set<String> getRequiredClaims() {
        return this.f62841d;
    }

    @Override // com.nimbusds.jwt.proc.ClockSkewAware
    public void setMaxClockSkew(int i10) {
        this.f62838a = i10;
    }

    @Override // com.nimbusds.jwt.proc.JWTClaimsVerifier
    public void verify(JWTClaimsSet jWTClaimsSet) throws BadJWTException {
        verify(jWTClaimsSet, null);
    }

    public DefaultJWTClaimsVerifier(JWTClaimsSet jWTClaimsSet, Set<String> set) {
        this(null, jWTClaimsSet, set, null);
    }

    @Override // com.nimbusds.jwt.proc.JWTClaimsSetVerifier
    public void verify(JWTClaimsSet jWTClaimsSet, C c10) throws BadJWTException {
        Set<String> set = this.f62839b;
        if (set != null) {
            List<String> audience = jWTClaimsSet.getAudience();
            if (audience != null && !audience.isEmpty()) {
                Iterator<String> it = audience.iterator();
                do {
                    if (!it.hasNext()) {
                        throw new BadJWTException("JWT audience rejected: " + audience);
                    }
                } while (!set.contains(it.next()));
            } else if (!set.contains(null)) {
                throw new BadJWTException("JWT missing required audience");
            }
        }
        Set<String> setKeySet = jWTClaimsSet.getClaims().keySet();
        Set<String> set2 = this.f62841d;
        if (!setKeySet.containsAll(set2)) {
            HashSet hashSet = new HashSet(set2);
            hashSet.removeAll(jWTClaimsSet.getClaims().keySet());
            throw new BadJWTException("JWT missing required claims: " + hashSet);
        }
        HashSet hashSet2 = new HashSet();
        for (String str : this.f62842e) {
            if (jWTClaimsSet.getClaims().containsKey(str)) {
                hashSet2.add(str);
            }
            if (!hashSet2.isEmpty()) {
                throw new BadJWTException("JWT has prohibited claims: " + hashSet2);
            }
        }
        JWTClaimsSet jWTClaimsSet2 = this.f62840c;
        for (String str2 : jWTClaimsSet2.getClaims().keySet()) {
            Object claim = jWTClaimsSet.getClaim(str2);
            Object claim2 = jWTClaimsSet2.getClaim(str2);
            if (!claim.equals(claim2)) {
                throw new BadJWTException("JWT \"" + str2 + "\" claim has value " + claim + ", must be " + claim2);
            }
        }
        Date date = new Date();
        Date expirationTime = jWTClaimsSet.getExpirationTime();
        if (expirationTime != null && !DateUtils.isAfter(expirationTime, date, this.f62838a)) {
            throw new BadJWTException("Expired JWT");
        }
        Date notBeforeTime = jWTClaimsSet.getNotBeforeTime();
        if (notBeforeTime != null && !DateUtils.isBefore(notBeforeTime, date, this.f62838a)) {
            throw new BadJWTException("JWT before use time");
        }
    }

    public DefaultJWTClaimsVerifier(String str, JWTClaimsSet jWTClaimsSet, Set<String> set) {
        this(str != null ? Collections.singleton(str) : null, jWTClaimsSet, set, null);
    }

    public DefaultJWTClaimsVerifier(Set<String> set, JWTClaimsSet jWTClaimsSet, Set<String> set2, Set<String> set3) {
        this.f62838a = 60;
        Set<String> setUnmodifiableSet = set != null ? Collections.unmodifiableSet(set) : null;
        this.f62839b = setUnmodifiableSet;
        jWTClaimsSet = jWTClaimsSet == null ? new JWTClaimsSet.Builder().build() : jWTClaimsSet;
        this.f62840c = jWTClaimsSet;
        HashSet hashSet = new HashSet(jWTClaimsSet.getClaims().keySet());
        if (setUnmodifiableSet != null && !setUnmodifiableSet.contains(null)) {
            hashSet.add("aud");
        }
        if (set2 != null) {
            hashSet.addAll(set2);
        }
        this.f62841d = Collections.unmodifiableSet(hashSet);
        this.f62842e = set3 != null ? Collections.unmodifiableSet(set3) : Collections.emptySet();
    }
}
