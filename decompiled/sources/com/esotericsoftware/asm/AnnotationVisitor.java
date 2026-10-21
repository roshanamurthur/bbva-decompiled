package com.esotericsoftware.asm;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AnnotationVisitor {
    protected final int api;
    protected AnnotationVisitor av;

    public AnnotationVisitor(int i10) {
        this(i10, null);
    }

    public void visit(String str, Object obj) {
        AnnotationVisitor annotationVisitor = this.av;
        if (annotationVisitor != null) {
            annotationVisitor.visit(str, obj);
        }
    }

    public AnnotationVisitor visitAnnotation(String str, String str2) {
        AnnotationVisitor annotationVisitor = this.av;
        if (annotationVisitor != null) {
            return annotationVisitor.visitAnnotation(str, str2);
        }
        return null;
    }

    public AnnotationVisitor visitArray(String str) {
        AnnotationVisitor annotationVisitor = this.av;
        if (annotationVisitor != null) {
            return annotationVisitor.visitArray(str);
        }
        return null;
    }

    public void visitEnd() {
        AnnotationVisitor annotationVisitor = this.av;
        if (annotationVisitor != null) {
            annotationVisitor.visitEnd();
        }
    }

    public void visitEnum(String str, String str2, String str3) {
        AnnotationVisitor annotationVisitor = this.av;
        if (annotationVisitor != null) {
            annotationVisitor.visitEnum(str, str2, str3);
        }
    }

    public AnnotationVisitor(int i10, AnnotationVisitor annotationVisitor) {
        if (i10 != 262144 && i10 != 327680) {
            throw new IllegalArgumentException();
        }
        this.api = i10;
        this.av = annotationVisitor;
    }
}
