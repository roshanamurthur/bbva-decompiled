package com.esotericsoftware.reflectasm;

import androidx.camera.core.processing.f;
import com.bbva.appsflyer.DeepLinkListenerAdapter;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.esotericsoftware.asm.ClassWriter;
import com.esotericsoftware.asm.Label;
import com.esotericsoftware.asm.MethodVisitor;
import com.esotericsoftware.asm.Opcodes;
import com.esotericsoftware.asm.Type;
import com.fasterxml.jackson.core.JsonPointer;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import qd.a;

/* JADX INFO: loaded from: classes9.dex */
public abstract class MethodAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String[] f40066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Class[][] f40067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Class[] f40068c;

    public static void a(Class cls, ArrayList<Method> arrayList) {
        for (Method method : cls.getDeclaredMethods()) {
            if (!Modifier.isPrivate(method.getModifiers())) {
                arrayList.add(method);
            }
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            a(cls2, arrayList);
        }
    }

    public static MethodAccess get(Class cls) {
        Class clsD;
        Class[][] clsArr;
        Class[] clsArr2;
        String str;
        boolean zIsInterface = cls.isInterface();
        if (!zIsInterface && cls.getSuperclass() == null && cls != Object.class) {
            throw new IllegalArgumentException("The type must not be an interface, a primitive type, or void.");
        }
        ArrayList arrayList = new ArrayList();
        if (zIsInterface) {
            a(cls, arrayList);
        } else {
            for (Class superclass = cls; superclass != Object.class; superclass = superclass.getSuperclass()) {
                for (Method method : superclass.getDeclaredMethods()) {
                    if (!Modifier.isPrivate(method.getModifiers())) {
                        arrayList.add(method);
                    }
                }
            }
        }
        int size = arrayList.size();
        String[] strArr = new String[size];
        Class[][] clsArr3 = new Class[size][];
        Class[] clsArr4 = new Class[size];
        for (int i10 = 0; i10 < size; i10++) {
            Method method2 = (Method) arrayList.get(i10);
            strArr[i10] = method2.getName();
            clsArr3[i10] = method2.getParameterTypes();
            clsArr4[i10] = method2.getReturnType();
        }
        String name = cls.getName();
        String strConcat = name.concat("MethodAccess");
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
                    ClassWriter classWriter = new ClassWriter(1);
                    classWriter.visit(Opcodes.V1_1, 33, strReplace, null, "com/esotericsoftware/reflectasm/MethodAccess", null);
                    MethodVisitor methodVisitorVisitMethod = classWriter.visitMethod(1, "<init>", "()V", null, null);
                    methodVisitorVisitMethod.visitCode();
                    methodVisitorVisitMethod.visitVarInsn(25, 0);
                    methodVisitorVisitMethod.visitMethodInsn(183, "com/esotericsoftware/reflectasm/MethodAccess", "<init>", "()V");
                    methodVisitorVisitMethod.visitInsn(177);
                    methodVisitorVisitMethod.visitMaxs(0, 0);
                    methodVisitorVisitMethod.visitEnd();
                    MethodVisitor methodVisitorVisitMethod2 = classWriter.visitMethod(129, "invoke", "(Ljava/lang/Object;I[Ljava/lang/Object;)Ljava/lang/Object;", null, null);
                    methodVisitorVisitMethod2.visitCode();
                    if (arrayList.isEmpty()) {
                        clsArr = clsArr3;
                        clsArr2 = clsArr4;
                        str = strConcat;
                    } else {
                        methodVisitorVisitMethod2.visitVarInsn(25, 1);
                        methodVisitorVisitMethod2.visitTypeInsn(192, strReplace2);
                        methodVisitorVisitMethod2.visitVarInsn(58, 4);
                        methodVisitorVisitMethod2.visitVarInsn(21, 2);
                        Label[] labelArr = new Label[size];
                        for (int i11 = 0; i11 < size; i11++) {
                            labelArr[i11] = new Label();
                        }
                        Label label = new Label();
                        methodVisitorVisitMethod2.visitTableSwitchInsn(0, size - 1, label, labelArr);
                        StringBuilder sb2 = new StringBuilder(128);
                        int i12 = 0;
                        while (i12 < size) {
                            methodVisitorVisitMethod2.visitLabel(labelArr[i12]);
                            if (i12 == 0) {
                                methodVisitorVisitMethod2.visitFrame(1, 1, new Object[]{strReplace2}, 0, null);
                            } else {
                                methodVisitorVisitMethod2.visitFrame(3, 0, null, 0, null);
                            }
                            methodVisitorVisitMethod2.visitVarInsn(25, 4);
                            sb2.setLength(0);
                            sb2.append(RootService.OPEN_BRACKET);
                            Class[] clsArr5 = clsArr3[i12];
                            Class cls2 = clsArr4[i12];
                            Label[] labelArr2 = labelArr;
                            int i13 = 0;
                            while (i13 < clsArr5.length) {
                                Class[] clsArr6 = clsArr4;
                                methodVisitorVisitMethod2.visitVarInsn(25, 3);
                                methodVisitorVisitMethod2.visitIntInsn(16, i13);
                                methodVisitorVisitMethod2.visitInsn(50);
                                Type type = Type.getType(clsArr5[i13]);
                                switch (type.getSort()) {
                                    case 1:
                                        clsArr5 = clsArr5;
                                        methodVisitorVisitMethod2.visitTypeInsn(192, "java/lang/Boolean");
                                        methodVisitorVisitMethod2.visitMethodInsn(182, "java/lang/Boolean", "booleanValue", "()Z");
                                        break;
                                    case 2:
                                        clsArr5 = clsArr5;
                                        methodVisitorVisitMethod2.visitTypeInsn(192, "java/lang/Character");
                                        methodVisitorVisitMethod2.visitMethodInsn(182, "java/lang/Character", "charValue", "()C");
                                        break;
                                    case 3:
                                        clsArr5 = clsArr5;
                                        methodVisitorVisitMethod2.visitTypeInsn(192, "java/lang/Byte");
                                        methodVisitorVisitMethod2.visitMethodInsn(182, "java/lang/Byte", "byteValue", "()B");
                                        break;
                                    case 4:
                                        clsArr5 = clsArr5;
                                        methodVisitorVisitMethod2.visitTypeInsn(192, "java/lang/Short");
                                        methodVisitorVisitMethod2.visitMethodInsn(182, "java/lang/Short", "shortValue", "()S");
                                        break;
                                    case 5:
                                        clsArr5 = clsArr5;
                                        methodVisitorVisitMethod2.visitTypeInsn(192, "java/lang/Integer");
                                        methodVisitorVisitMethod2.visitMethodInsn(182, "java/lang/Integer", "intValue", "()I");
                                        break;
                                    case 6:
                                        clsArr5 = clsArr5;
                                        methodVisitorVisitMethod2.visitTypeInsn(192, "java/lang/Float");
                                        methodVisitorVisitMethod2.visitMethodInsn(182, "java/lang/Float", "floatValue", "()F");
                                        break;
                                    case 7:
                                        clsArr5 = clsArr5;
                                        methodVisitorVisitMethod2.visitTypeInsn(192, "java/lang/Long");
                                        methodVisitorVisitMethod2.visitMethodInsn(182, "java/lang/Long", "longValue", "()J");
                                        break;
                                    case 8:
                                        clsArr5 = clsArr5;
                                        methodVisitorVisitMethod2.visitTypeInsn(192, "java/lang/Double");
                                        methodVisitorVisitMethod2.visitMethodInsn(182, "java/lang/Double", "doubleValue", "()D");
                                        break;
                                    case 9:
                                        methodVisitorVisitMethod2.visitTypeInsn(192, type.getDescriptor());
                                        break;
                                    case 10:
                                        methodVisitorVisitMethod2.visitTypeInsn(192, type.getInternalName());
                                        break;
                                    default:
                                        break;
                                }
                                sb2.append(type.getDescriptor());
                                i13++;
                                clsArr5 = clsArr5;
                                clsArr4 = clsArr6;
                                clsArr3 = clsArr3;
                                strConcat = strConcat;
                            }
                            Class[][] clsArr7 = clsArr3;
                            Class[] clsArr8 = clsArr4;
                            String str2 = strConcat;
                            sb2.append(RootService.CLOSE_BRACKET);
                            sb2.append(Type.getDescriptor(cls2));
                            methodVisitorVisitMethod2.visitMethodInsn(zIsInterface ? 185 : Modifier.isStatic(((Method) arrayList.get(i12)).getModifiers()) ? 184 : 182, strReplace2, strArr[i12], sb2.toString());
                            switch (Type.getType(cls2).getSort()) {
                                case 0:
                                    methodVisitorVisitMethod2.visitInsn(1);
                                    continue;
                                    methodVisitorVisitMethod2.visitInsn(176);
                                    i12++;
                                    labelArr = labelArr2;
                                    size = size;
                                    clsArr4 = clsArr8;
                                    clsArr3 = clsArr7;
                                    strConcat = str2;
                                    break;
                                case 1:
                                    methodVisitorVisitMethod2.visitMethodInsn(184, "java/lang/Boolean", DeepLinkListenerAdapter.Constants.STATUS_VALUE_OF, "(Z)Ljava/lang/Boolean;");
                                    break;
                                case 2:
                                    methodVisitorVisitMethod2.visitMethodInsn(184, "java/lang/Character", DeepLinkListenerAdapter.Constants.STATUS_VALUE_OF, "(C)Ljava/lang/Character;");
                                    break;
                                case 3:
                                    methodVisitorVisitMethod2.visitMethodInsn(184, "java/lang/Byte", DeepLinkListenerAdapter.Constants.STATUS_VALUE_OF, "(B)Ljava/lang/Byte;");
                                    break;
                                case 4:
                                    methodVisitorVisitMethod2.visitMethodInsn(184, "java/lang/Short", DeepLinkListenerAdapter.Constants.STATUS_VALUE_OF, "(S)Ljava/lang/Short;");
                                    break;
                                case 5:
                                    methodVisitorVisitMethod2.visitMethodInsn(184, "java/lang/Integer", DeepLinkListenerAdapter.Constants.STATUS_VALUE_OF, "(I)Ljava/lang/Integer;");
                                    break;
                                case 6:
                                    methodVisitorVisitMethod2.visitMethodInsn(184, "java/lang/Float", DeepLinkListenerAdapter.Constants.STATUS_VALUE_OF, "(F)Ljava/lang/Float;");
                                    break;
                                case 7:
                                    methodVisitorVisitMethod2.visitMethodInsn(184, "java/lang/Long", DeepLinkListenerAdapter.Constants.STATUS_VALUE_OF, "(J)Ljava/lang/Long;");
                                    break;
                                case 8:
                                    methodVisitorVisitMethod2.visitMethodInsn(184, "java/lang/Double", DeepLinkListenerAdapter.Constants.STATUS_VALUE_OF, "(D)Ljava/lang/Double;");
                                    break;
                            }
                            methodVisitorVisitMethod2.visitInsn(176);
                            i12++;
                            labelArr = labelArr2;
                            size = size;
                            clsArr4 = clsArr8;
                            clsArr3 = clsArr7;
                            strConcat = str2;
                        }
                        clsArr = clsArr3;
                        clsArr2 = clsArr4;
                        str = strConcat;
                        methodVisitorVisitMethod2.visitLabel(label);
                        methodVisitorVisitMethod2.visitFrame(3, 0, null, 0, null);
                    }
                    methodVisitorVisitMethod2.visitTypeInsn(187, "java/lang/IllegalArgumentException");
                    methodVisitorVisitMethod2.visitInsn(89);
                    methodVisitorVisitMethod2.visitTypeInsn(187, "java/lang/StringBuilder");
                    methodVisitorVisitMethod2.visitInsn(89);
                    methodVisitorVisitMethod2.visitLdcInsn("Method not found: ");
                    methodVisitorVisitMethod2.visitMethodInsn(183, "java/lang/StringBuilder", "<init>", "(Ljava/lang/String;)V");
                    methodVisitorVisitMethod2.visitVarInsn(21, 2);
                    methodVisitorVisitMethod2.visitMethodInsn(182, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;");
                    methodVisitorVisitMethod2.visitMethodInsn(182, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;");
                    methodVisitorVisitMethod2.visitMethodInsn(183, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V");
                    methodVisitorVisitMethod2.visitInsn(Opcodes.ATHROW);
                    methodVisitorVisitMethod2.visitMaxs(0, 0);
                    methodVisitorVisitMethod2.visitEnd();
                    classWriter.visitEnd();
                    strConcat = str;
                    clsD = aVarB.a(strConcat, classWriter.toByteArray());
                } else {
                    clsArr = clsArr3;
                    clsArr2 = clsArr4;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        try {
            MethodAccess methodAccess = (MethodAccess) clsD.newInstance();
            methodAccess.f40066a = strArr;
            methodAccess.f40067b = clsArr;
            methodAccess.f40068c = clsArr2;
            return methodAccess;
        } catch (Throwable th3) {
            throw new RuntimeException(f.d("Error constructing method access class: ", strConcat), th3);
        }
    }

    public int getIndex(String str) {
        int length = this.f40066a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (this.f40066a[i10].equals(str)) {
                return i10;
            }
        }
        throw new IllegalArgumentException(f.d("Unable to find non-private method: ", str));
    }

    public String[] getMethodNames() {
        return this.f40066a;
    }

    public Class[][] getParameterTypes() {
        return this.f40067b;
    }

    public Class[] getReturnTypes() {
        return this.f40068c;
    }

    public abstract Object invoke(Object obj, int i10, Object... objArr);

    public Object invoke(Object obj, String str, Class[] clsArr, Object... objArr) {
        return invoke(obj, getIndex(str, clsArr), objArr);
    }

    public Object invoke(Object obj, String str, Object... objArr) {
        return invoke(obj, getIndex(str, objArr == null ? 0 : objArr.length), objArr);
    }

    public int getIndex(String str, Class... clsArr) {
        int length = this.f40066a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (this.f40066a[i10].equals(str) && Arrays.equals(clsArr, this.f40067b[i10])) {
                return i10;
            }
        }
        StringBuilder sbD = ci.a.d("Unable to find non-private method: ", str, " ");
        sbD.append(Arrays.toString(clsArr));
        throw new IllegalArgumentException(sbD.toString());
    }

    public int getIndex(String str, int i10) {
        int length = this.f40066a.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (this.f40066a[i11].equals(str) && this.f40067b[i11].length == i10) {
                return i11;
            }
        }
        throw new IllegalArgumentException("Unable to find non-private method: " + str + " with " + i10 + " params.");
    }
}
