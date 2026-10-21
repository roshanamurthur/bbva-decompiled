package com.vasco.digipass.sdk.obfuscated;

import com.vasco.digipass.sdk.DigipassSDKConstants;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements DigipassSDKConstants {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f65715a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f65717c = new i();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f65718d = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d[] f65716b = new d[8];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f65719e = new d();

    public d a(int i10) {
        if (i10 == 100) {
            return this.f65719e;
        }
        for (int i11 = 0; i11 < this.f65715a; i11++) {
            d dVar = this.f65716b[i11];
            if (dVar.f65702c == i10) {
                return dVar;
            }
        }
        return null;
    }

    public boolean b() {
        return this.f65718d.f65728c == 1;
    }

    public boolean c() {
        for (int i10 = 0; i10 < this.f65715a; i10++) {
            if (this.f65716b[i10].f65705f) {
                return true;
            }
        }
        return false;
    }

    public boolean d() {
        return this.f65718d.f65728c == 0;
    }

    public boolean e() {
        byte b10 = this.f65718d.f65728c;
        return b10 == 1 || b10 == 3;
    }

    public void f() {
        q.g(this.f65718d.f65732g);
        q.g(this.f65718d.f65733h);
        q.g(this.f65718d.f65734i);
        q.g(this.f65718d.f65735j);
        q.g(this.f65717c.f65750c);
        q.g(this.f65718d.f65740p);
        q.g(this.f65718d.f65741q);
        q.g(this.f65718d.f65743s);
        q.g(this.f65718d.f65744t);
    }

    public d[] a() {
        return this.f65716b;
    }
}
