package com.salesforce.marketingcloud.util;

/* JADX INFO: loaded from: classes9.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Boolean f65133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Boolean f65134b;

    private d() {
    }

    public static boolean a() {
        if (f65134b == null) {
            try {
                Class.forName("org.altbeacon.beacon.BeaconManager");
                f65134b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                f65134b = Boolean.FALSE;
            }
        }
        return f65134b.booleanValue();
    }

    public static boolean b() {
        if (f65133a == null) {
            try {
                f65133a = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                f65133a = Boolean.FALSE;
            }
        }
        return f65133a.booleanValue();
    }
}
