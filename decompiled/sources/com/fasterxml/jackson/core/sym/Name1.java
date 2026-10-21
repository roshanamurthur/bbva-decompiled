package com.fasterxml.jackson.core.sym;

/* JADX INFO: loaded from: classes9.dex */
public final class Name1 extends Name {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Name1 f43132b = new Name1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43133a;

    public Name1() {
        super("", 0);
        this.f43133a = 0;
    }

    public static Name1 getEmptyName() {
        return f43132b;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i10, int i11, int i12) {
        return false;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i10) {
        return i10 == this.f43133a;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i10, int i11) {
        return i10 == this.f43133a && i11 == 0;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int[] iArr, int i10) {
        return i10 == 1 && iArr[0] == this.f43133a;
    }
}
