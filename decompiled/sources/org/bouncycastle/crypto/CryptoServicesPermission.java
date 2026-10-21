package org.bouncycastle.crypto;

import java.security.Permission;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public class CryptoServicesPermission extends Permission {
    public static final String DEFAULT_RANDOM = "defaultRandomConfig";
    public static final String GLOBAL_CONFIG = "globalConfig";
    public static final String THREAD_LOCAL_CONFIG = "threadLocalConfig";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final HashSet f87855p0;

    public CryptoServicesPermission(String str) {
        super(str);
        HashSet hashSet = new HashSet();
        this.f87855p0 = hashSet;
        hashSet.add(str);
    }

    public boolean equals(Object obj) {
        return (obj instanceof CryptoServicesPermission) && this.f87855p0.equals(((CryptoServicesPermission) obj).f87855p0);
    }

    @Override // java.security.Permission
    public String getActions() {
        return this.f87855p0.toString();
    }

    public int hashCode() {
        return this.f87855p0.hashCode();
    }

    @Override // java.security.Permission
    public boolean implies(Permission permission) {
        if (!(permission instanceof CryptoServicesPermission)) {
            return false;
        }
        CryptoServicesPermission cryptoServicesPermission = (CryptoServicesPermission) permission;
        return getName().equals(cryptoServicesPermission.getName()) || this.f87855p0.containsAll(cryptoServicesPermission.f87855p0);
    }
}
