package org.bouncycastle.asn1.eac;

/* JADX INFO: loaded from: classes12.dex */
public class Flags {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f87187a;

    public Flags() {
        this.f87187a = 0;
    }

    public int getFlags() {
        return this.f87187a;
    }

    public boolean isSet(int i10) {
        return (i10 & this.f87187a) != 0;
    }

    public void set(int i10) {
        this.f87187a = i10 | this.f87187a;
    }

    public Flags(int i10) {
        this.f87187a = i10;
    }
}
