package com.facetec.sdk;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    s f42383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f42384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f42385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ArrayList<String> f42386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f42387e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    String f42388g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    String f42389h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f42390i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    String f42391j;

    public /* synthetic */ m() {
    }

    public m(String str, s sVar, ArrayList<String> arrayList, String str2, String str3, String str4, String str5, String str6) {
        this.f42385c = str;
        this.f42383a = sVar;
        this.f42386d = arrayList;
        this.f42384b = str2;
        this.f42387e = str3;
        this.f42389h = str4;
        this.f42391j = str5;
        this.f42388g = str6;
        this.f42390i = 0;
    }

    public final byte[] c() throws Exception {
        return new dy().d().a().e(this).getBytes(StandardCharsets.UTF_8);
    }

    public static m c(byte[] bArr) throws Exception {
        return (m) new dy().d().a().e(new String(bArr, 0, bArr.length, StandardCharsets.UTF_8), m.class);
    }
}
