package com.esotericsoftware.asm;

/* JADX INFO: loaded from: classes9.dex */
public abstract class FieldVisitor {
    protected final int api;
    protected FieldVisitor fv;

    public FieldVisitor(int i10) {
        this(i10, null);
    }

    public AnnotationVisitor visitAnnotation(String str, boolean z10) {
        FieldVisitor fieldVisitor = this.fv;
        if (fieldVisitor != null) {
            return fieldVisitor.visitAnnotation(str, z10);
        }
        return null;
    }

    public void visitAttribute(Attribute attribute) {
        FieldVisitor fieldVisitor = this.fv;
        if (fieldVisitor != null) {
            fieldVisitor.visitAttribute(attribute);
        }
    }

    public void visitEnd() {
        FieldVisitor fieldVisitor = this.fv;
        if (fieldVisitor != null) {
            fieldVisitor.visitEnd();
        }
    }

    public AnnotationVisitor visitTypeAnnotation(int i10, TypePath typePath, String str, boolean z10) {
        if (this.api < 327680) {
            throw new RuntimeException();
        }
        FieldVisitor fieldVisitor = this.fv;
        if (fieldVisitor != null) {
            return fieldVisitor.visitTypeAnnotation(i10, typePath, str, z10);
        }
        return null;
    }

    public FieldVisitor(int i10, FieldVisitor fieldVisitor) {
        if (i10 != 262144 && i10 != 327680) {
            throw new IllegalArgumentException();
        }
        this.api = i10;
        this.fv = fieldVisitor;
    }
}
