package org.bouncycastle.jcajce.provider.config;

import com.mastercard.sonic.androidsvg.SVGParser;
import java.security.BasicPermission;
import java.security.Permission;
import java.util.StringTokenizer;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes8.dex */
public class ProviderConfigurationPermission extends BasicPermission {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final String f90047p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f90048q0;

    public ProviderConfigurationPermission(String str) {
        super(str);
        this.f90047p0 = SVGParser.XML_STYLESHEET_ATTR_MEDIA_ALL;
        this.f90048q0 = 63;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProviderConfigurationPermission)) {
            return false;
        }
        ProviderConfigurationPermission providerConfigurationPermission = (ProviderConfigurationPermission) obj;
        return this.f90048q0 == providerConfigurationPermission.f90048q0 && getName().equals(providerConfigurationPermission.getName());
    }

    @Override // java.security.BasicPermission, java.security.Permission
    public String getActions() {
        return this.f90047p0;
    }

    public int hashCode() {
        return getName().hashCode() + this.f90048q0;
    }

    @Override // java.security.BasicPermission, java.security.Permission
    public boolean implies(Permission permission) {
        if (!(permission instanceof ProviderConfigurationPermission) || !getName().equals(permission.getName())) {
            return false;
        }
        int i10 = this.f90048q0;
        int i11 = ((ProviderConfigurationPermission) permission).f90048q0;
        return (i10 & i11) == i11;
    }

    public ProviderConfigurationPermission(String str, String str2) {
        super(str, str2);
        this.f90047p0 = str2;
        StringTokenizer stringTokenizer = new StringTokenizer(Strings.toLowerCase(str2), " ,");
        int i10 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            if (strNextToken.equals("threadlocalecimplicitlyca")) {
                i10 |= 1;
            } else if (strNextToken.equals("ecimplicitlyca")) {
                i10 |= 2;
            } else if (strNextToken.equals("threadlocaldhdefaultparams")) {
                i10 |= 4;
            } else if (strNextToken.equals("dhdefaultparams")) {
                i10 |= 8;
            } else if (strNextToken.equals("acceptableeccurves")) {
                i10 |= 16;
            } else if (strNextToken.equals("additionalecparameters")) {
                i10 |= 32;
            } else if (strNextToken.equals(SVGParser.XML_STYLESHEET_ATTR_MEDIA_ALL)) {
                i10 |= 63;
            }
        }
        if (i10 == 0) {
            throw new IllegalArgumentException("unknown permissions passed to mask");
        }
        this.f90048q0 = i10;
    }
}
