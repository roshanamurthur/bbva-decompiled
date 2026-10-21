package com.esotericsoftware.asm;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f39995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f39996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f39997f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f39998g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f39999h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f40000i;

    public f(int i10) {
        this.f39992a = i10;
    }

    public final void a(int i10, String str, String str2) {
        this.f39993b = 18;
        this.f39995d = i10;
        this.f39996e = str;
        this.f39997f = str2;
        this.f39999h = ((this.f39997f.hashCode() * str.hashCode() * i10) + 18) & Integer.MAX_VALUE;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0046  */
    public final void b(int i10, String str, String str2, String str3) {
        int iHashCode;
        int iHashCode2;
        this.f39993b = i10;
        this.f39996e = str;
        this.f39997f = str2;
        this.f39998g = str3;
        if (i10 == 1) {
            iHashCode = str.hashCode();
            iHashCode2 = (iHashCode + i10) & Integer.MAX_VALUE;
        } else if (i10 != 12) {
            if (i10 == 16 || i10 == 30) {
                iHashCode = str.hashCode();
            } else {
                if (i10 == 7) {
                    this.f39994c = 0;
                } else if (i10 != 8) {
                    iHashCode = str3.hashCode() * str2.hashCode() * str.hashCode();
                }
                iHashCode = str.hashCode();
            }
            iHashCode2 = (iHashCode + i10) & Integer.MAX_VALUE;
        } else {
            iHashCode2 = ((str2.hashCode() * str.hashCode()) + i10) & Integer.MAX_VALUE;
        }
        this.f39999h = iHashCode2;
    }

    public f(int i10, f fVar) {
        this.f39992a = i10;
        this.f39993b = fVar.f39993b;
        this.f39994c = fVar.f39994c;
        this.f39995d = fVar.f39995d;
        this.f39996e = fVar.f39996e;
        this.f39997f = fVar.f39997f;
        this.f39998g = fVar.f39998g;
        this.f39999h = fVar.f39999h;
    }
}
