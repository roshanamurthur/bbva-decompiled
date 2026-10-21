package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes10.dex */
public final class StructuralMessageInfo implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProtoSyntax f47150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f47151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f47152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FieldInfo[] f47153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MessageLite f47154e;

    public StructuralMessageInfo(ProtoSyntax protoSyntax, boolean z10, int[] iArr, FieldInfo[] fieldInfoArr, Object obj) {
        this.f47150a = protoSyntax;
        this.f47151b = z10;
        this.f47152c = iArr;
        this.f47153d = fieldInfoArr;
        Charset charset = Internal.f47106a;
        if (obj == null) {
            throw new NullPointerException("defaultInstance");
        }
        this.f47154e = (MessageLite) obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    public final boolean a() {
        return this.f47151b;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    public final MessageLite b() {
        return this.f47154e;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    public final ProtoSyntax getSyntax() {
        return this.f47150a;
    }

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f47155a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ProtoSyntax f47156b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f47157c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f47158d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int[] f47159e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f47160f;

        public Builder() {
            this.f47159e = null;
            this.f47155a = new ArrayList();
        }

        public StructuralMessageInfo build() {
            if (this.f47157c) {
                throw new IllegalStateException("Builder can only build once");
            }
            if (this.f47156b == null) {
                throw new IllegalStateException("Must specify a proto syntax");
            }
            this.f47157c = true;
            ArrayList arrayList = this.f47155a;
            Collections.sort(arrayList);
            return new StructuralMessageInfo(this.f47156b, this.f47158d, this.f47159e, (FieldInfo[]) arrayList.toArray(new FieldInfo[0]), this.f47160f);
        }

        public void withCheckInitialized(int[] iArr) {
            this.f47159e = iArr;
        }

        public void withDefaultInstance(Object obj) {
            this.f47160f = obj;
        }

        public void withField(FieldInfo fieldInfo) {
            if (this.f47157c) {
                throw new IllegalStateException("Builder can only build once");
            }
            this.f47155a.add(fieldInfo);
        }

        public void withMessageSetWireFormat(boolean z10) {
            this.f47158d = z10;
        }

        public void withSyntax(ProtoSyntax protoSyntax) {
            Charset charset = Internal.f47106a;
            if (protoSyntax == null) {
                throw new NullPointerException("syntax");
            }
            this.f47156b = protoSyntax;
        }

        public Builder(int i10) {
            this.f47159e = null;
            this.f47155a = new ArrayList(i10);
        }
    }
}
