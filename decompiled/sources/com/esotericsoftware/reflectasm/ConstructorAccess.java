package com.esotericsoftware.reflectasm;

import androidx.camera.core.processing.f;
import com.esotericsoftware.asm.ClassWriter;
import com.esotericsoftware.asm.MethodVisitor;
import com.esotericsoftware.asm.Opcodes;
import com.fasterxml.jackson.core.JsonPointer;
import java.lang.reflect.Modifier;
import qd.a;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ConstructorAccess<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f40062a;

    public static void a(ClassWriter classWriter, String str, String str2) {
        MethodVisitor methodVisitorVisitMethod = classWriter.visitMethod(1, "newInstance", "(Ljava/lang/Object;)Ljava/lang/Object;", null, null);
        methodVisitorVisitMethod.visitCode();
        if (str2 != null) {
            methodVisitorVisitMethod.visitTypeInsn(187, str);
            methodVisitorVisitMethod.visitInsn(89);
            methodVisitorVisitMethod.visitVarInsn(25, 1);
            methodVisitorVisitMethod.visitTypeInsn(192, str2);
            methodVisitorVisitMethod.visitInsn(89);
            methodVisitorVisitMethod.visitMethodInsn(182, "java/lang/Object", "getClass", "()Ljava/lang/Class;");
            methodVisitorVisitMethod.visitInsn(87);
            methodVisitorVisitMethod.visitMethodInsn(183, str, "<init>", "(L" + str2 + ";)V");
            methodVisitorVisitMethod.visitInsn(176);
            methodVisitorVisitMethod.visitMaxs(4, 2);
        } else {
            methodVisitorVisitMethod.visitTypeInsn(187, "java/lang/UnsupportedOperationException");
            methodVisitorVisitMethod.visitInsn(89);
            methodVisitorVisitMethod.visitLdcInsn("Not an inner class.");
            methodVisitorVisitMethod.visitMethodInsn(183, "java/lang/UnsupportedOperationException", "<init>", "(Ljava/lang/String;)V");
            methodVisitorVisitMethod.visitInsn(Opcodes.ATHROW);
            methodVisitorVisitMethod.visitMaxs(3, 2);
        }
        methodVisitorVisitMethod.visitEnd();
    }

    public static <T> ConstructorAccess<T> get(Class<T> cls) {
        Class clsD;
        int modifiers;
        String str;
        Class<?> enclosingClass = cls.getEnclosingClass();
        boolean z10 = (enclosingClass == null || !cls.isMemberClass() || Modifier.isStatic(cls.getModifiers())) ? false : true;
        String name = cls.getName();
        String strConcat = name.concat("ConstructorAccess");
        if (strConcat.startsWith("java.")) {
            strConcat = "reflectasm.".concat(strConcat);
        }
        a aVarB = a.b(cls);
        synchronized (aVarB) {
            try {
                clsD = aVarB.d(strConcat);
                if (clsD == null) {
                    String strReplace = strConcat.replace('.', JsonPointer.SEPARATOR);
                    String strReplace2 = name.replace('.', JsonPointer.SEPARATOR);
                    if (z10) {
                        String strReplace3 = enclosingClass.getName().replace('.', JsonPointer.SEPARATOR);
                        try {
                            modifiers = cls.getDeclaredConstructor(enclosingClass).getModifiers();
                            if (Modifier.isPrivate(modifiers)) {
                                throw new RuntimeException("Non-static member class cannot be created (the enclosing class constructor is private): ".concat(cls.getName()));
                            }
                            str = strReplace3;
                        } catch (Exception e5) {
                            throw new RuntimeException("Non-static member class cannot be created (missing enclosing class constructor): ".concat(cls.getName()), e5);
                        }
                    } else {
                        str = null;
                        try {
                            modifiers = cls.getDeclaredConstructor(null).getModifiers();
                            if (Modifier.isPrivate(modifiers)) {
                                throw new RuntimeException("Class cannot be created (the no-arg constructor is private): ".concat(cls.getName()));
                            }
                        } catch (Exception e7) {
                            throw new RuntimeException("Class cannot be created (missing no-arg constructor): ".concat(cls.getName()), e7);
                        }
                    }
                    String str2 = Modifier.isPublic(modifiers) ? "com/esotericsoftware/reflectasm/PublicConstructorAccess" : "com/esotericsoftware/reflectasm/ConstructorAccess";
                    ClassWriter classWriter = new ClassWriter(0);
                    classWriter.visit(Opcodes.V1_1, 33, strReplace, null, str2, null);
                    MethodVisitor methodVisitorVisitMethod = classWriter.visitMethod(1, "<init>", "()V", null, null);
                    methodVisitorVisitMethod.visitCode();
                    methodVisitorVisitMethod.visitVarInsn(25, 0);
                    methodVisitorVisitMethod.visitMethodInsn(183, str2, "<init>", "()V");
                    methodVisitorVisitMethod.visitInsn(177);
                    methodVisitorVisitMethod.visitMaxs(1, 1);
                    methodVisitorVisitMethod.visitEnd();
                    MethodVisitor methodVisitorVisitMethod2 = classWriter.visitMethod(1, "newInstance", "()Ljava/lang/Object;", null, null);
                    methodVisitorVisitMethod2.visitCode();
                    methodVisitorVisitMethod2.visitTypeInsn(187, strReplace2);
                    methodVisitorVisitMethod2.visitInsn(89);
                    methodVisitorVisitMethod2.visitMethodInsn(183, strReplace2, "<init>", "()V");
                    methodVisitorVisitMethod2.visitInsn(176);
                    methodVisitorVisitMethod2.visitMaxs(2, 1);
                    methodVisitorVisitMethod2.visitEnd();
                    a(classWriter, strReplace2, str);
                    classWriter.visitEnd();
                    clsD = aVarB.a(strConcat, classWriter.toByteArray());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        try {
            ConstructorAccess<T> constructorAccess = (ConstructorAccess) clsD.newInstance();
            if (!(constructorAccess instanceof PublicConstructorAccess)) {
                if (cls.getPackage() == clsD.getPackage()) {
                    ClassLoader classLoader = cls.getClassLoader();
                    ClassLoader classLoader2 = clsD.getClassLoader();
                    ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
                    if (classLoader != null) {
                    }
                }
                throw new RuntimeException((!z10 ? "Class cannot be created (the no-arg constructor is protected or package-protected, and its ConstructorAccess could not be defined in the same class loader): " : "Non-static member class cannot be created (the enclosing class constructor is protected or package-protected, and its ConstructorAccess could not be defined in the same class loader): ").concat(cls.getName()));
            }
            constructorAccess.f40062a = z10;
            return constructorAccess;
        } catch (Throwable th3) {
            throw new RuntimeException(f.d("Exception constructing constructor access class: ", strConcat), th3);
        }
    }

    public boolean isNonStaticMemberClass() {
        return this.f40062a;
    }

    public abstract T newInstance();

    public abstract T newInstance(Object obj);
}
