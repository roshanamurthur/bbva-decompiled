package com.esotericsoftware.asm;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends FieldVisitor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClassWriter f39966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f39968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f39969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f39970e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f39971f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f39972g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f39973h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f39974i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f39975j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Attribute f39976k;

    public c(ClassWriter classWriter, int i10, String str, String str2, String str3, Object obj) {
        super(327680);
        if (classWriter.G == null) {
            classWriter.G = this;
        } else {
            classWriter.H.fv = this;
        }
        classWriter.H = this;
        this.f39966a = classWriter;
        this.f39967b = i10;
        this.f39968c = classWriter.newUTF8(str);
        this.f39969d = classWriter.newUTF8(str2);
        if (str3 != null) {
            this.f39970e = classWriter.newUTF8(str3);
        }
        if (obj != null) {
            this.f39971f = classWriter.h(obj).f39992a;
        }
    }

    @Override // com.esotericsoftware.asm.FieldVisitor
    public final AnnotationVisitor visitAnnotation(String str, boolean z10) {
        ByteVector byteVector = new ByteVector();
        byteVector.putShort(this.f39966a.newUTF8(str)).putShort(0);
        a aVar = new a(this.f39966a, true, byteVector, byteVector, 2);
        if (z10) {
            aVar.f39945g = this.f39972g;
            this.f39972g = aVar;
        } else {
            aVar.f39945g = this.f39973h;
            this.f39973h = aVar;
        }
        return aVar;
    }

    @Override // com.esotericsoftware.asm.FieldVisitor
    public final void visitAttribute(Attribute attribute) {
        attribute.f39885b = this.f39976k;
        this.f39976k = attribute;
    }

    @Override // com.esotericsoftware.asm.FieldVisitor
    public final AnnotationVisitor visitTypeAnnotation(int i10, TypePath typePath, String str, boolean z10) {
        ByteVector byteVector = new ByteVector();
        a.b(i10, typePath, byteVector);
        byteVector.putShort(this.f39966a.newUTF8(str)).putShort(0);
        a aVar = new a(this.f39966a, true, byteVector, byteVector, byteVector.f39887b - 2);
        if (z10) {
            aVar.f39945g = this.f39974i;
            this.f39974i = aVar;
        } else {
            aVar.f39945g = this.f39975j;
            this.f39975j = aVar;
        }
        return aVar;
    }

    @Override // com.esotericsoftware.asm.FieldVisitor
    public final void visitEnd() {
    }
}
