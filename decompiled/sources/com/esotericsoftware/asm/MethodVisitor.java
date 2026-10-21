package com.esotericsoftware.asm;

/* JADX INFO: loaded from: classes9.dex */
public abstract class MethodVisitor {
    protected final int api;
    protected MethodVisitor mv;

    public MethodVisitor(int i10) {
        this(i10, null);
    }

    public AnnotationVisitor visitAnnotation(String str, boolean z10) {
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            return methodVisitor.visitAnnotation(str, z10);
        }
        return null;
    }

    public AnnotationVisitor visitAnnotationDefault() {
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            return methodVisitor.visitAnnotationDefault();
        }
        return null;
    }

    public void visitAttribute(Attribute attribute) {
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitAttribute(attribute);
        }
    }

    public void visitCode() {
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitCode();
        }
    }

    public void visitEnd() {
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitEnd();
        }
    }

    public void visitFieldInsn(int i10, String str, String str2, String str3) {
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitFieldInsn(i10, str, str2, str3);
        }
    }

    public void visitFrame(int i10, int i11, Object[] objArr, int i12, Object[] objArr2) {
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitFrame(i10, i11, objArr, i12, objArr2);
        }
    }

    public void visitIincInsn(int i10, int i11) {
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitIincInsn(i10, i11);
        }
    }

    public void visitInsn(int i10) {
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitInsn(i10);
        }
    }

    public AnnotationVisitor visitInsnAnnotation(int i10, TypePath typePath, String str, boolean z10) {
        if (this.api < 327680) {
            throw new RuntimeException();
        }
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            return methodVisitor.visitInsnAnnotation(i10, typePath, str, z10);
        }
        return null;
    }

    public void visitIntInsn(int i10, int i11) {
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitIntInsn(i10, i11);
        }
    }

    public void visitInvokeDynamicInsn(String str, String str2, Handle handle, Object... objArr) {
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitInvokeDynamicInsn(str, str2, handle, objArr);
        }
    }

    public void visitJumpInsn(int i10, Label label) {
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitJumpInsn(i10, label);
        }
    }

    public void visitLabel(Label label) {
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitLabel(label);
        }
    }

    public void visitLdcInsn(Object obj) {
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitLdcInsn(obj);
        }
    }

    public void visitLineNumber(int i10, Label label) {
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitLineNumber(i10, label);
        }
    }

    public void visitLocalVariable(String str, String str2, String str3, Label label, Label label2, int i10) {
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitLocalVariable(str, str2, str3, label, label2, i10);
        }
    }

    public AnnotationVisitor visitLocalVariableAnnotation(int i10, TypePath typePath, Label[] labelArr, Label[] labelArr2, int[] iArr, String str, boolean z10) {
        if (this.api < 327680) {
            throw new RuntimeException();
        }
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            return methodVisitor.visitLocalVariableAnnotation(i10, typePath, labelArr, labelArr2, iArr, str, z10);
        }
        return null;
    }

    public void visitLookupSwitchInsn(Label label, int[] iArr, Label[] labelArr) {
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitLookupSwitchInsn(label, iArr, labelArr);
        }
    }

    public void visitMaxs(int i10, int i11) {
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitMaxs(i10, i11);
        }
    }

    public void visitMethodInsn(int i10, String str, String str2, String str3) {
        if (this.api >= 327680) {
            visitMethodInsn(i10, str, str2, str3, i10 == 185);
            return;
        }
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitMethodInsn(i10, str, str2, str3);
        }
    }

    public void visitMultiANewArrayInsn(String str, int i10) {
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitMultiANewArrayInsn(str, i10);
        }
    }

    public void visitParameter(String str, int i10) {
        if (this.api < 327680) {
            throw new RuntimeException();
        }
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitParameter(str, i10);
        }
    }

    public AnnotationVisitor visitParameterAnnotation(int i10, String str, boolean z10) {
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            return methodVisitor.visitParameterAnnotation(i10, str, z10);
        }
        return null;
    }

    public void visitTableSwitchInsn(int i10, int i11, Label label, Label... labelArr) {
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitTableSwitchInsn(i10, i11, label, labelArr);
        }
    }

    public AnnotationVisitor visitTryCatchAnnotation(int i10, TypePath typePath, String str, boolean z10) {
        if (this.api < 327680) {
            throw new RuntimeException();
        }
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            return methodVisitor.visitTryCatchAnnotation(i10, typePath, str, z10);
        }
        return null;
    }

    public void visitTryCatchBlock(Label label, Label label2, Label label3, String str) {
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitTryCatchBlock(label, label2, label3, str);
        }
    }

    public AnnotationVisitor visitTypeAnnotation(int i10, TypePath typePath, String str, boolean z10) {
        if (this.api < 327680) {
            throw new RuntimeException();
        }
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            return methodVisitor.visitTypeAnnotation(i10, typePath, str, z10);
        }
        return null;
    }

    public void visitTypeInsn(int i10, String str) {
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitTypeInsn(i10, str);
        }
    }

    public void visitVarInsn(int i10, int i11) {
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitVarInsn(i10, i11);
        }
    }

    public MethodVisitor(int i10, MethodVisitor methodVisitor) {
        if (i10 != 262144 && i10 != 327680) {
            throw new IllegalArgumentException();
        }
        this.api = i10;
        this.mv = methodVisitor;
    }

    public void visitMethodInsn(int i10, String str, String str2, String str3, boolean z10) {
        if (this.api < 327680) {
            if (z10 != (i10 == 185)) {
                throw new IllegalArgumentException("INVOKESPECIAL/STATIC on interfaces require ASM 5");
            }
            visitMethodInsn(i10, str, str2, str3);
        } else {
            MethodVisitor methodVisitor = this.mv;
            if (methodVisitor != null) {
                methodVisitor.visitMethodInsn(i10, str, str2, str3, z10);
            }
        }
    }
}
