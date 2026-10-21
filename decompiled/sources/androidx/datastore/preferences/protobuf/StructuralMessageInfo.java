package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class StructuralMessageInfo implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProtoSyntax f20986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f20987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f20988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FieldInfo[] f20989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MessageLite f20990e;

    public StructuralMessageInfo(ProtoSyntax protoSyntax, boolean z10, int[] iArr, FieldInfo[] fieldInfoArr, Object obj) {
        this.f20986a = protoSyntax;
        this.f20987b = z10;
        this.f20988c = iArr;
        this.f20989d = fieldInfoArr;
        Charset charset = Internal.f20943a;
        if (obj == null) {
            throw new NullPointerException("defaultInstance");
        }
        this.f20990e = (MessageLite) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.y
    public final boolean a() {
        return this.f20987b;
    }

    @Override // androidx.datastore.preferences.protobuf.y
    public final MessageLite b() {
        return this.f20990e;
    }

    @Override // androidx.datastore.preferences.protobuf.y
    public final ProtoSyntax getSyntax() {
        return this.f20986a;
    }

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f20991a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ProtoSyntax f20992b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f20993c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f20994d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int[] f20995e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f20996f;

        public Builder() {
            this.f20995e = null;
            this.f20991a = new ArrayList();
        }

        public StructuralMessageInfo build() {
            if (this.f20993c) {
                throw new IllegalStateException("Builder can only build once");
            }
            if (this.f20992b == null) {
                throw new IllegalStateException("Must specify a proto syntax");
            }
            this.f20993c = true;
            ArrayList arrayList = this.f20991a;
            Collections.sort(arrayList);
            return new StructuralMessageInfo(this.f20992b, this.f20994d, this.f20995e, (FieldInfo[]) arrayList.toArray(new FieldInfo[0]), this.f20996f);
        }

        public void withCheckInitialized(int[] iArr) {
            this.f20995e = iArr;
        }

        public void withDefaultInstance(Object obj) {
            this.f20996f = obj;
        }

        public void withField(FieldInfo fieldInfo) {
            if (this.f20993c) {
                throw new IllegalStateException("Builder can only build once");
            }
            this.f20991a.add(fieldInfo);
        }

        public void withMessageSetWireFormat(boolean z10) {
            this.f20994d = z10;
        }

        public void withSyntax(ProtoSyntax protoSyntax) {
            Charset charset = Internal.f20943a;
            if (protoSyntax == null) {
                throw new NullPointerException("syntax");
            }
            this.f20992b = protoSyntax;
        }

        public Builder(int i10) {
            this.f20995e = null;
            this.f20991a = new ArrayList(i10);
        }
    }
}
