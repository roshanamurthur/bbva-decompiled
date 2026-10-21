package com.esotericsoftware.asm;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ClassVisitor {
    protected final int api;
    protected ClassVisitor cv;

    public ClassVisitor(int i10) {
        this(i10, null);
    }

    public void visit(int i10, int i11, String str, String str2, String str3, String[] strArr) {
        ClassVisitor classVisitor = this.cv;
        if (classVisitor != null) {
            classVisitor.visit(i10, i11, str, str2, str3, strArr);
        }
    }

    public AnnotationVisitor visitAnnotation(String str, boolean z10) {
        ClassVisitor classVisitor = this.cv;
        if (classVisitor != null) {
            return classVisitor.visitAnnotation(str, z10);
        }
        return null;
    }

    public void visitAttribute(Attribute attribute) {
        ClassVisitor classVisitor = this.cv;
        if (classVisitor != null) {
            classVisitor.visitAttribute(attribute);
        }
    }

    public void visitEnd() {
        ClassVisitor classVisitor = this.cv;
        if (classVisitor != null) {
            classVisitor.visitEnd();
        }
    }

    public FieldVisitor visitField(int i10, String str, String str2, String str3, Object obj) {
        ClassVisitor classVisitor = this.cv;
        if (classVisitor != null) {
            return classVisitor.visitField(i10, str, str2, str3, obj);
        }
        return null;
    }

    public void visitInnerClass(String str, String str2, String str3, int i10) {
        ClassVisitor classVisitor = this.cv;
        if (classVisitor != null) {
            classVisitor.visitInnerClass(str, str2, str3, i10);
        }
    }

    public MethodVisitor visitMethod(int i10, String str, String str2, String str3, String[] strArr) {
        ClassVisitor classVisitor = this.cv;
        if (classVisitor != null) {
            return classVisitor.visitMethod(i10, str, str2, str3, strArr);
        }
        return null;
    }

    public void visitOuterClass(String str, String str2, String str3) {
        ClassVisitor classVisitor = this.cv;
        if (classVisitor != null) {
            classVisitor.visitOuterClass(str, str2, str3);
        }
    }

    public void visitSource(String str, String str2) {
        ClassVisitor classVisitor = this.cv;
        if (classVisitor != null) {
            classVisitor.visitSource(str, str2);
        }
    }

    public AnnotationVisitor visitTypeAnnotation(int i10, TypePath typePath, String str, boolean z10) {
        if (this.api < 327680) {
            throw new RuntimeException();
        }
        ClassVisitor classVisitor = this.cv;
        if (classVisitor != null) {
            return classVisitor.visitTypeAnnotation(i10, typePath, str, z10);
        }
        return null;
    }

    public ClassVisitor(int i10, ClassVisitor classVisitor) {
        if (i10 != 262144 && i10 != 327680) {
            throw new IllegalArgumentException();
        }
        this.api = i10;
        this.cv = classVisitor;
    }
}
