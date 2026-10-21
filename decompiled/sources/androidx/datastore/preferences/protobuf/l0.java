package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: RawMessageInfo.java */
/* JADX INFO: loaded from: classes2.dex */
public final class l0 implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MessageLite f21077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f21079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21080d;

    public l0(MessageLite messageLite, String str, Object[] objArr) {
        this.f21077a = messageLite;
        this.f21078b = str;
        this.f21079c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f21080d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f21080d = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.y
    public final boolean a() {
        return (this.f21080d & 2) == 2;
    }

    @Override // androidx.datastore.preferences.protobuf.y
    public final MessageLite b() {
        return this.f21077a;
    }

    public final Object[] c() {
        return this.f21079c;
    }

    public final String d() {
        return this.f21078b;
    }

    @Override // androidx.datastore.preferences.protobuf.y
    public final ProtoSyntax getSyntax() {
        return (this.f21080d & 1) == 1 ? ProtoSyntax.PROTO2 : ProtoSyntax.PROTO3;
    }
}
