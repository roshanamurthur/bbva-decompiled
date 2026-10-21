package org.bouncycastle.jce;

import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import java.security.cert.CertStoreParameters;
import java.security.cert.LDAPCertStoreParameters;
import org.bouncycastle.x509.X509StoreParameters;

/* JADX INFO: loaded from: classes8.dex */
public class X509LDAPCertStoreParameters implements X509StoreParameters, CertStoreParameters {
    public String E0;
    public String F0;
    public String G0;
    public String H0;
    public String I0;
    public String J0;
    public String K0;
    public String L0;
    public String M0;
    public String N0;
    public String O0;
    public String P0;
    public String Q0;
    public String R0;
    public String S0;
    public String T0;
    public String U0;
    public String V0;
    public String W0;
    public String X0;
    public String Y0;
    public String Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public String f90324a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public String f90325b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public String f90326c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public String f90327d1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public String f90328p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public String f90329q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public String f90330r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public String f90331s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public String f90332t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public String f90333u0;
    public String v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public String f90334w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public String f90335x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public String f90336y0;

    public static class Builder {
        public String A;
        public String B;
        public String C;
        public String D;
        public String E;
        public String F;
        public String G;
        public String H;
        public String I;
        public String J;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f90337a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f90338b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f90339c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f90340d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f90341e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f90342f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f90343g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f90344h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f90345i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f90346j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f90347k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f90348l;
        public String m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public String f90349n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public String f90350o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public String f90351p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public String f90352q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public String f90353r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public String f90354s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public String f90355t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public String f90356u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public String f90357v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public String f90358w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public String f90359x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public String f90360y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public String f90361z;

        public Builder() {
            this("ldap://localhost:389", "");
        }

        public X509LDAPCertStoreParameters build() {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            String str12;
            String str13;
            String str14;
            String str15;
            String str16;
            String str17;
            String str18;
            String str19;
            String str20;
            String str21;
            String str22 = this.f90349n;
            if (str22 == null || (str = this.f90350o) == null || (str2 = this.f90351p) == null || (str3 = this.f90352q) == null || (str4 = this.f90353r) == null || (str5 = this.f90354s) == null || (str6 = this.f90355t) == null || (str7 = this.f90356u) == null || (str8 = this.f90357v) == null || (str9 = this.f90358w) == null || (str10 = this.f90359x) == null || (str11 = this.f90360y) == null || (str12 = this.f90361z) == null || (str13 = this.A) == null || (str14 = this.B) == null || (str15 = this.C) == null || (str16 = this.D) == null || (str17 = this.E) == null || (str18 = this.F) == null || (str19 = this.G) == null || (str20 = this.H) == null || (str21 = this.I) == null) {
                throw new IllegalArgumentException("Necessary parameters not specified.");
            }
            X509LDAPCertStoreParameters x509LDAPCertStoreParameters = new X509LDAPCertStoreParameters();
            x509LDAPCertStoreParameters.f90328p0 = this.f90337a;
            x509LDAPCertStoreParameters.f90329q0 = this.f90338b;
            x509LDAPCertStoreParameters.f90330r0 = this.f90339c;
            x509LDAPCertStoreParameters.f90331s0 = this.f90340d;
            x509LDAPCertStoreParameters.f90332t0 = this.f90341e;
            x509LDAPCertStoreParameters.f90333u0 = this.f90342f;
            x509LDAPCertStoreParameters.v0 = this.f90343g;
            x509LDAPCertStoreParameters.f90334w0 = this.f90344h;
            x509LDAPCertStoreParameters.f90335x0 = this.f90345i;
            x509LDAPCertStoreParameters.f90336y0 = this.f90346j;
            x509LDAPCertStoreParameters.E0 = this.f90347k;
            x509LDAPCertStoreParameters.F0 = this.f90348l;
            x509LDAPCertStoreParameters.G0 = this.m;
            x509LDAPCertStoreParameters.H0 = str22;
            x509LDAPCertStoreParameters.I0 = str;
            x509LDAPCertStoreParameters.J0 = str2;
            x509LDAPCertStoreParameters.K0 = str3;
            x509LDAPCertStoreParameters.L0 = str4;
            x509LDAPCertStoreParameters.M0 = str5;
            x509LDAPCertStoreParameters.N0 = str6;
            x509LDAPCertStoreParameters.O0 = str7;
            x509LDAPCertStoreParameters.P0 = str8;
            x509LDAPCertStoreParameters.Q0 = str9;
            x509LDAPCertStoreParameters.R0 = str10;
            x509LDAPCertStoreParameters.S0 = str11;
            x509LDAPCertStoreParameters.T0 = str12;
            x509LDAPCertStoreParameters.U0 = str13;
            x509LDAPCertStoreParameters.V0 = str14;
            x509LDAPCertStoreParameters.W0 = str15;
            x509LDAPCertStoreParameters.X0 = str16;
            x509LDAPCertStoreParameters.Y0 = str17;
            x509LDAPCertStoreParameters.Z0 = str18;
            x509LDAPCertStoreParameters.f90324a1 = str19;
            x509LDAPCertStoreParameters.f90325b1 = str20;
            x509LDAPCertStoreParameters.f90326c1 = str21;
            x509LDAPCertStoreParameters.f90327d1 = this.J;
            return x509LDAPCertStoreParameters;
        }

        public Builder setAACertificateAttribute(String str) {
            this.f90346j = str;
            return this;
        }

        public Builder setAACertificateSubjectAttributeName(String str) {
            this.F = str;
            return this;
        }

        public Builder setAttributeAuthorityRevocationListAttribute(String str) {
            this.m = str;
            return this;
        }

        public Builder setAttributeAuthorityRevocationListIssuerAttributeName(String str) {
            this.I = str;
            return this;
        }

        public Builder setAttributeCertificateAttributeAttribute(String str) {
            this.f90345i = str;
            return this;
        }

        public Builder setAttributeCertificateAttributeSubjectAttributeName(String str) {
            this.E = str;
            return this;
        }

        public Builder setAttributeCertificateRevocationListAttribute(String str) {
            this.f90348l = str;
            return this;
        }

        public Builder setAttributeCertificateRevocationListIssuerAttributeName(String str) {
            this.H = str;
            return this;
        }

        public Builder setAttributeDescriptorCertificateAttribute(String str) {
            this.f90347k = str;
            return this;
        }

        public Builder setAttributeDescriptorCertificateSubjectAttributeName(String str) {
            this.G = str;
            return this;
        }

        public Builder setAuthorityRevocationListAttribute(String str) {
            this.f90344h = str;
            return this;
        }

        public Builder setAuthorityRevocationListIssuerAttributeName(String str) {
            this.D = str;
            return this;
        }

        public Builder setCACertificateAttribute(String str) {
            this.f90340d = str;
            return this;
        }

        public Builder setCACertificateSubjectAttributeName(String str) {
            this.f90361z = str;
            return this;
        }

        public Builder setCertificateRevocationListAttribute(String str) {
            this.f90342f = str;
            return this;
        }

        public Builder setCertificateRevocationListIssuerAttributeName(String str) {
            this.B = str;
            return this;
        }

        public Builder setCrossCertificateAttribute(String str) {
            this.f90341e = str;
            return this;
        }

        public Builder setCrossCertificateSubjectAttributeName(String str) {
            this.A = str;
            return this;
        }

        public Builder setDeltaRevocationListAttribute(String str) {
            this.f90343g = str;
            return this;
        }

        public Builder setDeltaRevocationListIssuerAttributeName(String str) {
            this.C = str;
            return this;
        }

        public Builder setLdapAACertificateAttributeName(String str) {
            this.f90356u = str;
            return this;
        }

        public Builder setLdapAttributeAuthorityRevocationListAttributeName(String str) {
            this.f90359x = str;
            return this;
        }

        public Builder setLdapAttributeCertificateAttributeAttributeName(String str) {
            this.f90355t = str;
            return this;
        }

        public Builder setLdapAttributeCertificateRevocationListAttributeName(String str) {
            this.f90358w = str;
            return this;
        }

        public Builder setLdapAttributeDescriptorCertificateAttributeName(String str) {
            this.f90357v = str;
            return this;
        }

        public Builder setLdapAuthorityRevocationListAttributeName(String str) {
            this.f90354s = str;
            return this;
        }

        public Builder setLdapCACertificateAttributeName(String str) {
            this.f90350o = str;
            return this;
        }

        public Builder setLdapCertificateRevocationListAttributeName(String str) {
            this.f90352q = str;
            return this;
        }

        public Builder setLdapCrossCertificateAttributeName(String str) {
            this.f90351p = str;
            return this;
        }

        public Builder setLdapDeltaRevocationListAttributeName(String str) {
            this.f90353r = str;
            return this;
        }

        public Builder setLdapUserCertificateAttributeName(String str) {
            this.f90349n = str;
            return this;
        }

        public Builder setSearchForSerialNumberIn(String str) {
            this.J = str;
            return this;
        }

        public Builder setUserCertificateAttribute(String str) {
            this.f90339c = str;
            return this;
        }

        public Builder setUserCertificateSubjectAttributeName(String str) {
            this.f90360y = str;
            return this;
        }

        public Builder(String str, String str2) {
            this.f90337a = str;
            if (str2 == null) {
                this.f90338b = "";
            } else {
                this.f90338b = str2;
            }
            this.f90339c = "userCertificate";
            this.f90340d = "cACertificate";
            this.f90341e = "crossCertificatePair";
            this.f90342f = "certificateRevocationList";
            this.f90343g = "deltaRevocationList";
            this.f90344h = "authorityRevocationList";
            this.f90345i = "attributeCertificateAttribute";
            this.f90346j = "aACertificate";
            this.f90347k = "attributeDescriptorCertificate";
            this.f90348l = "attributeCertificateRevocationList";
            this.m = "attributeAuthorityRevocationList";
            this.f90349n = "cn";
            this.f90350o = "cn ou o";
            this.f90351p = "cn ou o";
            this.f90352q = "cn ou o";
            this.f90353r = "cn ou o";
            this.f90354s = "cn ou o";
            this.f90355t = "cn";
            this.f90356u = "cn o ou";
            this.f90357v = "cn o ou";
            this.f90358w = "cn o ou";
            this.f90359x = "cn o ou";
            this.f90360y = "cn";
            this.f90361z = "o ou";
            this.A = "o ou";
            this.B = "o ou";
            this.C = "o ou";
            this.D = "o ou";
            this.E = "cn";
            this.F = "o ou";
            this.G = "o ou";
            this.H = "o ou";
            this.I = "o ou";
            this.J = "uid serialNumber cn";
        }
    }

    public static int a(int i10, String str) {
        return (i10 * 29) + (str == null ? 0 : str.hashCode());
    }

    public static boolean b(String str, String str2) {
        if (str == str2) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    public static X509LDAPCertStoreParameters getInstance(LDAPCertStoreParameters lDAPCertStoreParameters) {
        return new Builder("ldap://" + lDAPCertStoreParameters.getServerName() + DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER + lDAPCertStoreParameters.getPort(), "").build();
    }

    public boolean equal(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof X509LDAPCertStoreParameters)) {
            return false;
        }
        X509LDAPCertStoreParameters x509LDAPCertStoreParameters = (X509LDAPCertStoreParameters) obj;
        return b(this.f90328p0, x509LDAPCertStoreParameters.f90328p0) && b(this.f90329q0, x509LDAPCertStoreParameters.f90329q0) && b(this.f90330r0, x509LDAPCertStoreParameters.f90330r0) && b(this.f90331s0, x509LDAPCertStoreParameters.f90331s0) && b(this.f90332t0, x509LDAPCertStoreParameters.f90332t0) && b(this.f90333u0, x509LDAPCertStoreParameters.f90333u0) && b(this.v0, x509LDAPCertStoreParameters.v0) && b(this.f90334w0, x509LDAPCertStoreParameters.f90334w0) && b(this.f90335x0, x509LDAPCertStoreParameters.f90335x0) && b(this.f90336y0, x509LDAPCertStoreParameters.f90336y0) && b(this.E0, x509LDAPCertStoreParameters.E0) && b(this.F0, x509LDAPCertStoreParameters.F0) && b(this.G0, x509LDAPCertStoreParameters.G0) && b(this.H0, x509LDAPCertStoreParameters.H0) && b(this.I0, x509LDAPCertStoreParameters.I0) && b(this.J0, x509LDAPCertStoreParameters.J0) && b(this.K0, x509LDAPCertStoreParameters.K0) && b(this.L0, x509LDAPCertStoreParameters.L0) && b(this.M0, x509LDAPCertStoreParameters.M0) && b(this.N0, x509LDAPCertStoreParameters.N0) && b(this.O0, x509LDAPCertStoreParameters.O0) && b(this.P0, x509LDAPCertStoreParameters.P0) && b(this.Q0, x509LDAPCertStoreParameters.Q0) && b(this.R0, x509LDAPCertStoreParameters.R0) && b(this.S0, x509LDAPCertStoreParameters.S0) && b(this.T0, x509LDAPCertStoreParameters.T0) && b(this.U0, x509LDAPCertStoreParameters.U0) && b(this.V0, x509LDAPCertStoreParameters.V0) && b(this.W0, x509LDAPCertStoreParameters.W0) && b(this.X0, x509LDAPCertStoreParameters.X0) && b(this.Y0, x509LDAPCertStoreParameters.Y0) && b(this.Z0, x509LDAPCertStoreParameters.Z0) && b(this.f90324a1, x509LDAPCertStoreParameters.f90324a1) && b(this.f90325b1, x509LDAPCertStoreParameters.f90325b1) && b(this.f90326c1, x509LDAPCertStoreParameters.f90326c1) && b(this.f90327d1, x509LDAPCertStoreParameters.f90327d1);
    }

    public String getAACertificateAttribute() {
        return this.f90336y0;
    }

    public String getAACertificateSubjectAttributeName() {
        return this.Z0;
    }

    public String getAttributeAuthorityRevocationListAttribute() {
        return this.G0;
    }

    public String getAttributeAuthorityRevocationListIssuerAttributeName() {
        return this.f90326c1;
    }

    public String getAttributeCertificateAttributeAttribute() {
        return this.f90335x0;
    }

    public String getAttributeCertificateAttributeSubjectAttributeName() {
        return this.Y0;
    }

    public String getAttributeCertificateRevocationListAttribute() {
        return this.F0;
    }

    public String getAttributeCertificateRevocationListIssuerAttributeName() {
        return this.f90325b1;
    }

    public String getAttributeDescriptorCertificateAttribute() {
        return this.E0;
    }

    public String getAttributeDescriptorCertificateSubjectAttributeName() {
        return this.f90324a1;
    }

    public String getAuthorityRevocationListAttribute() {
        return this.f90334w0;
    }

    public String getAuthorityRevocationListIssuerAttributeName() {
        return this.X0;
    }

    public String getBaseDN() {
        return this.f90329q0;
    }

    public String getCACertificateAttribute() {
        return this.f90331s0;
    }

    public String getCACertificateSubjectAttributeName() {
        return this.T0;
    }

    public String getCertificateRevocationListAttribute() {
        return this.f90333u0;
    }

    public String getCertificateRevocationListIssuerAttributeName() {
        return this.V0;
    }

    public String getCrossCertificateAttribute() {
        return this.f90332t0;
    }

    public String getCrossCertificateSubjectAttributeName() {
        return this.U0;
    }

    public String getDeltaRevocationListAttribute() {
        return this.v0;
    }

    public String getDeltaRevocationListIssuerAttributeName() {
        return this.W0;
    }

    public String getLdapAACertificateAttributeName() {
        return this.O0;
    }

    public String getLdapAttributeAuthorityRevocationListAttributeName() {
        return this.R0;
    }

    public String getLdapAttributeCertificateAttributeAttributeName() {
        return this.N0;
    }

    public String getLdapAttributeCertificateRevocationListAttributeName() {
        return this.Q0;
    }

    public String getLdapAttributeDescriptorCertificateAttributeName() {
        return this.P0;
    }

    public String getLdapAuthorityRevocationListAttributeName() {
        return this.M0;
    }

    public String getLdapCACertificateAttributeName() {
        return this.I0;
    }

    public String getLdapCertificateRevocationListAttributeName() {
        return this.K0;
    }

    public String getLdapCrossCertificateAttributeName() {
        return this.J0;
    }

    public String getLdapDeltaRevocationListAttributeName() {
        return this.L0;
    }

    public String getLdapURL() {
        return this.f90328p0;
    }

    public String getLdapUserCertificateAttributeName() {
        return this.H0;
    }

    public String getSearchForSerialNumberIn() {
        return this.f90327d1;
    }

    public String getUserCertificateAttribute() {
        return this.f90330r0;
    }

    public String getUserCertificateSubjectAttributeName() {
        return this.S0;
    }

    public int hashCode() {
        return a(a(a(a(a(a(a(a(a(a(a(a(a(a(a(a(a(a(a(a(a(a(a(a(a(a(a(a(a(a(a(a(a(a(0, this.f90330r0), this.f90331s0), this.f90332t0), this.f90333u0), this.v0), this.f90334w0), this.f90335x0), this.f90336y0), this.E0), this.F0), this.G0), this.H0), this.I0), this.J0), this.K0), this.L0), this.M0), this.N0), this.O0), this.P0), this.Q0), this.R0), this.S0), this.T0), this.U0), this.V0), this.W0), this.X0), this.Y0), this.Z0), this.f90324a1), this.f90325b1), this.f90326c1), this.f90327d1);
    }

    @Override // java.security.cert.CertStoreParameters
    public Object clone() {
        return this;
    }
}
