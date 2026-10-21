package com.facetec.sdk;

/* JADX INFO: loaded from: classes9.dex */
final class bd {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static boolean f40494c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static boolean f40495d = false;

    public static void c() {
        f40494c = false;
        String str = FaceTecSDK.f40106a.f40094t.get("ac_rcf");
        if (str != null) {
            f40494c = str.equals("85c13fc9-c119-4729-8126-6005d67235c9");
        }
        f40495d = d("ac_chri", "f8956461-4b1c-49b0-805b-678a45e48e9a");
    }

    private static boolean d(String str, String str2) {
        String str3 = FaceTecSDK.f40106a.f40094t.get(str);
        return str3 != null && str3.equals(str2);
    }
}
