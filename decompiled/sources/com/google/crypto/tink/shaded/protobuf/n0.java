package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: compiled from: RawMessageInfo.java */
/* JADX INFO: loaded from: classes10.dex */
public final class n0 implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MessageLite f47244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f47246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f47247d;

    public n0(MessageLite messageLite, String str, Object[] objArr) {
        this.f47244a = messageLite;
        this.f47245b = str;
        this.f47246c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f47247d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f47247d = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    public final boolean a() {
        return (this.f47247d & 2) == 2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    public final MessageLite b() {
        return this.f47244a;
    }

    public final Object[] c() {
        return this.f47246c;
    }

    public final String d() {
        return this.f47245b;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    public final ProtoSyntax getSyntax() {
        return (this.f47247d & 1) == 1 ? ProtoSyntax.PROTO2 : ProtoSyntax.PROTO3;
    }
}
