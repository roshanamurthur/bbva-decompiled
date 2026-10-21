package com.vasco.digipass.sdk.utils.utilities.obfuscated;

/* JADX INFO: loaded from: classes9.dex */
public class r5 extends o implements f {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private u f66301p0;

    public r5(u uVar) {
        this.f66301p0 = uVar;
    }

    public static r5 a(Object obj) {
        if (obj == null || (obj instanceof r5)) {
            return (r5) obj;
        }
        if (obj instanceof u) {
            return new r5((u) obj);
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("unknown object in getInstance()");
        }
        try {
            return new r5(u.a((byte[]) obj));
        } catch (Exception e5) {
            throw new IllegalArgumentException(ci.a.b(e5, new StringBuilder("unable to parse encoded data: ")));
        }
    }

    public u c() {
        return this.f66301p0;
    }

    public boolean d() {
        return this.f66301p0 instanceof p;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.o, com.vasco.digipass.sdk.utils.utilities.obfuscated.g
    public u toASN1Primitive() {
        return this.f66301p0;
    }
}
