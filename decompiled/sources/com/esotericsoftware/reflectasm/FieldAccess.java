package com.esotericsoftware.reflectasm;

import androidx.camera.camera2.internal.h0;
import androidx.camera.core.processing.f;
import com.bbva.appsflyer.DeepLinkListenerAdapter;
import com.bbva.plugin.localstorage.command.SetCommand;
import com.esotericsoftware.asm.ClassWriter;
import com.esotericsoftware.asm.Label;
import com.esotericsoftware.asm.MethodVisitor;
import com.esotericsoftware.asm.Opcodes;
import com.esotericsoftware.asm.Type;
import com.fasterxml.jackson.core.JsonPointer;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import qd.a;

/* JADX INFO: loaded from: classes9.dex */
public abstract class FieldAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String[] f40063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Class[] f40064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Field[] f40065c;

    public static void a(ClassWriter classWriter, String str, ArrayList<Field> arrayList) {
        int i10;
        MethodVisitor methodVisitorVisitMethod = classWriter.visitMethod(1, "get", "(Ljava/lang/Object;I)Ljava/lang/Object;", null, null);
        methodVisitorVisitMethod.visitCode();
        methodVisitorVisitMethod.visitVarInsn(21, 2);
        if (arrayList.isEmpty()) {
            i10 = 6;
        } else {
            int size = arrayList.size();
            Label[] labelArr = new Label[size];
            for (int i11 = 0; i11 < size; i11++) {
                labelArr[i11] = new Label();
            }
            Label label = new Label();
            methodVisitorVisitMethod.visitTableSwitchInsn(0, size - 1, label, labelArr);
            for (int i12 = 0; i12 < size; i12++) {
                Field field = arrayList.get(i12);
                methodVisitorVisitMethod.visitLabel(labelArr[i12]);
                methodVisitorVisitMethod.visitFrame(3, 0, null, 0, null);
                methodVisitorVisitMethod.visitVarInsn(25, 1);
                methodVisitorVisitMethod.visitTypeInsn(192, str);
                methodVisitorVisitMethod.visitFieldInsn(180, field.getDeclaringClass().getName().replace('.', JsonPointer.SEPARATOR), field.getName(), Type.getDescriptor(field.getType()));
                switch (Type.getType(field.getType()).getSort()) {
                    case 1:
                        methodVisitorVisitMethod.visitMethodInsn(184, "java/lang/Boolean", DeepLinkListenerAdapter.Constants.STATUS_VALUE_OF, "(Z)Ljava/lang/Boolean;");
                        break;
                    case 2:
                        methodVisitorVisitMethod.visitMethodInsn(184, "java/lang/Character", DeepLinkListenerAdapter.Constants.STATUS_VALUE_OF, "(C)Ljava/lang/Character;");
                        break;
                    case 3:
                        methodVisitorVisitMethod.visitMethodInsn(184, "java/lang/Byte", DeepLinkListenerAdapter.Constants.STATUS_VALUE_OF, "(B)Ljava/lang/Byte;");
                        break;
                    case 4:
                        methodVisitorVisitMethod.visitMethodInsn(184, "java/lang/Short", DeepLinkListenerAdapter.Constants.STATUS_VALUE_OF, "(S)Ljava/lang/Short;");
                        break;
                    case 5:
                        methodVisitorVisitMethod.visitMethodInsn(184, "java/lang/Integer", DeepLinkListenerAdapter.Constants.STATUS_VALUE_OF, "(I)Ljava/lang/Integer;");
                        break;
                    case 6:
                        methodVisitorVisitMethod.visitMethodInsn(184, "java/lang/Float", DeepLinkListenerAdapter.Constants.STATUS_VALUE_OF, "(F)Ljava/lang/Float;");
                        break;
                    case 7:
                        methodVisitorVisitMethod.visitMethodInsn(184, "java/lang/Long", DeepLinkListenerAdapter.Constants.STATUS_VALUE_OF, "(J)Ljava/lang/Long;");
                        break;
                    case 8:
                        methodVisitorVisitMethod.visitMethodInsn(184, "java/lang/Double", DeepLinkListenerAdapter.Constants.STATUS_VALUE_OF, "(D)Ljava/lang/Double;");
                        break;
                }
                methodVisitorVisitMethod.visitInsn(176);
            }
            methodVisitorVisitMethod.visitLabel(label);
            methodVisitorVisitMethod.visitFrame(3, 0, null, 0, null);
            i10 = 5;
        }
        f(methodVisitorVisitMethod);
        methodVisitorVisitMethod.visitMaxs(i10, 3);
        methodVisitorVisitMethod.visitEnd();
    }

    public static void b(ClassWriter classWriter, String str, ArrayList<Field> arrayList, Type type) {
        String str2;
        int i10;
        int i11;
        ArrayList<Field> arrayList2 = arrayList;
        String descriptor = type.getDescriptor();
        int i12 = 172;
        switch (type.getSort()) {
            case 1:
                str2 = "getBoolean";
                break;
            case 2:
                str2 = "getChar";
                break;
            case 3:
                str2 = "getByte";
                break;
            case 4:
                str2 = "getShort";
                break;
            case 5:
                str2 = "getInt";
                break;
            case 6:
                str2 = "getFloat";
                i12 = 174;
                break;
            case 7:
                str2 = "getLong";
                i12 = 173;
                break;
            case 8:
                str2 = "getDouble";
                i12 = 175;
                break;
            default:
                str2 = "get";
                i12 = 176;
                break;
        }
        MethodVisitor methodVisitorVisitMethod = classWriter.visitMethod(1, str2, f.d("(Ljava/lang/Object;I)", descriptor), null, null);
        methodVisitorVisitMethod.visitCode();
        methodVisitorVisitMethod.visitVarInsn(21, 2);
        if (arrayList.isEmpty()) {
            i10 = 6;
        } else {
            int size = arrayList.size();
            Label[] labelArr = new Label[size];
            Label label = new Label();
            int i13 = 0;
            int i14 = 0;
            boolean z10 = false;
            while (true) {
                int i15 = 1;
                if (i14 < size) {
                    if (Type.getType(arrayList2.get(i14).getType()).equals(type)) {
                        labelArr[i14] = new Label();
                    } else {
                        labelArr[i14] = label;
                        z10 = true;
                    }
                    i14++;
                } else {
                    Label label2 = new Label();
                    methodVisitorVisitMethod.visitTableSwitchInsn(0, size - 1, label2, labelArr);
                    while (i13 < size) {
                        Field field = arrayList2.get(i13);
                        if (labelArr[i13].equals(label)) {
                            i11 = i15;
                        } else {
                            methodVisitorVisitMethod.visitLabel(labelArr[i13]);
                            i11 = i15;
                            methodVisitorVisitMethod.visitFrame(3, 0, null, 0, null);
                            methodVisitorVisitMethod.visitVarInsn(25, i11);
                            methodVisitorVisitMethod.visitTypeInsn(192, str);
                            methodVisitorVisitMethod.visitFieldInsn(180, field.getDeclaringClass().getName().replace('.', JsonPointer.SEPARATOR), field.getName(), descriptor);
                            methodVisitorVisitMethod.visitInsn(i12);
                        }
                        i13++;
                        i15 = i11;
                        arrayList2 = arrayList;
                    }
                    if (z10) {
                        methodVisitorVisitMethod.visitLabel(label);
                        methodVisitorVisitMethod.visitFrame(3, 0, null, 0, null);
                        g(methodVisitorVisitMethod, type.getClassName());
                    }
                    methodVisitorVisitMethod.visitLabel(label2);
                    methodVisitorVisitMethod.visitFrame(3, 0, null, 0, null);
                    i10 = 5;
                }
            }
        }
        f(methodVisitorVisitMethod);
        methodVisitorVisitMethod.visitMaxs(i10, 3);
        methodVisitorVisitMethod.visitEnd();
    }

    public static void c(ClassWriter classWriter, String str, ArrayList<Field> arrayList) {
        int i10;
        MethodVisitor methodVisitorVisitMethod = classWriter.visitMethod(1, "getString", "(Ljava/lang/Object;I)Ljava/lang/String;", null, null);
        methodVisitorVisitMethod.visitCode();
        methodVisitorVisitMethod.visitVarInsn(21, 2);
        if (arrayList.isEmpty()) {
            i10 = 6;
        } else {
            int size = arrayList.size();
            Label[] labelArr = new Label[size];
            Label label = new Label();
            boolean z10 = false;
            for (int i11 = 0; i11 < size; i11++) {
                if (arrayList.get(i11).getType().equals(String.class)) {
                    labelArr[i11] = new Label();
                } else {
                    labelArr[i11] = label;
                    z10 = true;
                }
            }
            Label label2 = new Label();
            methodVisitorVisitMethod.visitTableSwitchInsn(0, size - 1, label2, labelArr);
            for (int i12 = 0; i12 < size; i12++) {
                if (!labelArr[i12].equals(label)) {
                    Field field = arrayList.get(i12);
                    methodVisitorVisitMethod.visitLabel(labelArr[i12]);
                    methodVisitorVisitMethod.visitFrame(3, 0, null, 0, null);
                    methodVisitorVisitMethod.visitVarInsn(25, 1);
                    methodVisitorVisitMethod.visitTypeInsn(192, str);
                    methodVisitorVisitMethod.visitFieldInsn(180, field.getDeclaringClass().getName().replace('.', JsonPointer.SEPARATOR), field.getName(), "Ljava/lang/String;");
                    methodVisitorVisitMethod.visitInsn(176);
                }
            }
            if (z10) {
                methodVisitorVisitMethod.visitLabel(label);
                methodVisitorVisitMethod.visitFrame(3, 0, null, 0, null);
                g(methodVisitorVisitMethod, "String");
            }
            methodVisitorVisitMethod.visitLabel(label2);
            methodVisitorVisitMethod.visitFrame(3, 0, null, 0, null);
            i10 = 5;
        }
        f(methodVisitorVisitMethod);
        methodVisitorVisitMethod.visitMaxs(i10, 3);
        methodVisitorVisitMethod.visitEnd();
    }

    public static void d(ClassWriter classWriter, String str, ArrayList<Field> arrayList) {
        int i10;
        MethodVisitor methodVisitorVisitMethod = classWriter.visitMethod(1, SetCommand.ID, "(Ljava/lang/Object;ILjava/lang/Object;)V", null, null);
        methodVisitorVisitMethod.visitCode();
        methodVisitorVisitMethod.visitVarInsn(21, 2);
        if (arrayList.isEmpty()) {
            i10 = 6;
        } else {
            int size = arrayList.size();
            Label[] labelArr = new Label[size];
            for (int i11 = 0; i11 < size; i11++) {
                labelArr[i11] = new Label();
            }
            Label label = new Label();
            methodVisitorVisitMethod.visitTableSwitchInsn(0, size - 1, label, labelArr);
            for (int i12 = 0; i12 < size; i12++) {
                Field field = arrayList.get(i12);
                Type type = Type.getType(field.getType());
                methodVisitorVisitMethod.visitLabel(labelArr[i12]);
                methodVisitorVisitMethod.visitFrame(3, 0, null, 0, null);
                methodVisitorVisitMethod.visitVarInsn(25, 1);
                methodVisitorVisitMethod.visitTypeInsn(192, str);
                methodVisitorVisitMethod.visitVarInsn(25, 3);
                switch (type.getSort()) {
                    case 1:
                        methodVisitorVisitMethod.visitTypeInsn(192, "java/lang/Boolean");
                        methodVisitorVisitMethod.visitMethodInsn(182, "java/lang/Boolean", "booleanValue", "()Z");
                        break;
                    case 2:
                        methodVisitorVisitMethod.visitTypeInsn(192, "java/lang/Character");
                        methodVisitorVisitMethod.visitMethodInsn(182, "java/lang/Character", "charValue", "()C");
                        break;
                    case 3:
                        methodVisitorVisitMethod.visitTypeInsn(192, "java/lang/Byte");
                        methodVisitorVisitMethod.visitMethodInsn(182, "java/lang/Byte", "byteValue", "()B");
                        break;
                    case 4:
                        methodVisitorVisitMethod.visitTypeInsn(192, "java/lang/Short");
                        methodVisitorVisitMethod.visitMethodInsn(182, "java/lang/Short", "shortValue", "()S");
                        break;
                    case 5:
                        methodVisitorVisitMethod.visitTypeInsn(192, "java/lang/Integer");
                        methodVisitorVisitMethod.visitMethodInsn(182, "java/lang/Integer", "intValue", "()I");
                        break;
                    case 6:
                        methodVisitorVisitMethod.visitTypeInsn(192, "java/lang/Float");
                        methodVisitorVisitMethod.visitMethodInsn(182, "java/lang/Float", "floatValue", "()F");
                        break;
                    case 7:
                        methodVisitorVisitMethod.visitTypeInsn(192, "java/lang/Long");
                        methodVisitorVisitMethod.visitMethodInsn(182, "java/lang/Long", "longValue", "()J");
                        break;
                    case 8:
                        methodVisitorVisitMethod.visitTypeInsn(192, "java/lang/Double");
                        methodVisitorVisitMethod.visitMethodInsn(182, "java/lang/Double", "doubleValue", "()D");
                        break;
                    case 9:
                        methodVisitorVisitMethod.visitTypeInsn(192, type.getDescriptor());
                        break;
                    case 10:
                        methodVisitorVisitMethod.visitTypeInsn(192, type.getInternalName());
                        break;
                }
                methodVisitorVisitMethod.visitFieldInsn(181, field.getDeclaringClass().getName().replace('.', JsonPointer.SEPARATOR), field.getName(), type.getDescriptor());
                methodVisitorVisitMethod.visitInsn(177);
            }
            methodVisitorVisitMethod.visitLabel(label);
            methodVisitorVisitMethod.visitFrame(3, 0, null, 0, null);
            i10 = 5;
        }
        f(methodVisitorVisitMethod);
        methodVisitorVisitMethod.visitMaxs(i10, 4);
        methodVisitorVisitMethod.visitEnd();
    }

    public static void e(ClassWriter classWriter, String str, ArrayList<Field> arrayList, Type type) {
        String str2;
        String str3;
        int i10;
        String str4;
        int i11;
        int i12;
        int i13;
        String descriptor = type.getDescriptor();
        int i14 = 25;
        int i15 = 4;
        switch (type.getSort()) {
            case 1:
                str2 = "setBoolean";
                str3 = str2;
                i10 = 21;
                break;
            case 2:
                str2 = "setChar";
                str3 = str2;
                i10 = 21;
                break;
            case 3:
                str2 = "setByte";
                str3 = str2;
                i10 = 21;
                break;
            case 4:
                str2 = "setShort";
                str3 = str2;
                i10 = 21;
                break;
            case 5:
                str2 = "setInt";
                str3 = str2;
                i10 = 21;
                break;
            case 6:
                str3 = "setFloat";
                i10 = 23;
                break;
            case 7:
                str4 = "setLong";
                i11 = 22;
                str3 = str4;
                i10 = i11;
                i15 = 5;
                break;
            case 8:
                str4 = "setDouble";
                i11 = 24;
                str3 = str4;
                i10 = i11;
                i15 = 5;
                break;
            default:
                str3 = SetCommand.ID;
                i10 = 25;
                break;
        }
        MethodVisitor methodVisitorVisitMethod = classWriter.visitMethod(1, str3, h0.b("(Ljava/lang/Object;I", descriptor, ")V"), null, null);
        methodVisitorVisitMethod.visitCode();
        methodVisitorVisitMethod.visitVarInsn(21, 2);
        if (arrayList.isEmpty()) {
            i12 = 6;
        } else {
            int size = arrayList.size();
            Label[] labelArr = new Label[size];
            Label label = new Label();
            int i16 = 0;
            int i17 = 0;
            boolean z10 = false;
            while (true) {
                int i18 = 1;
                if (i17 < size) {
                    if (Type.getType(arrayList.get(i17).getType()).equals(type)) {
                        labelArr[i17] = new Label();
                    } else {
                        labelArr[i17] = label;
                        z10 = true;
                    }
                    i17++;
                } else {
                    Label label2 = new Label();
                    methodVisitorVisitMethod.visitTableSwitchInsn(0, size - 1, label2, labelArr);
                    while (i16 < size) {
                        if (labelArr[i16].equals(label)) {
                            i13 = i18;
                        } else {
                            Field field = arrayList.get(i16);
                            methodVisitorVisitMethod.visitLabel(labelArr[i16]);
                            i13 = i18;
                            methodVisitorVisitMethod.visitFrame(3, 0, null, 0, null);
                            methodVisitorVisitMethod.visitVarInsn(i14, i13);
                            methodVisitorVisitMethod.visitTypeInsn(192, str);
                            methodVisitorVisitMethod.visitVarInsn(i10, 3);
                            methodVisitorVisitMethod.visitFieldInsn(181, field.getDeclaringClass().getName().replace('.', JsonPointer.SEPARATOR), field.getName(), descriptor);
                            methodVisitorVisitMethod.visitInsn(177);
                        }
                        i16++;
                        i18 = i13;
                        i14 = 25;
                    }
                    if (z10) {
                        methodVisitorVisitMethod.visitLabel(label);
                        methodVisitorVisitMethod.visitFrame(3, 0, null, 0, null);
                        g(methodVisitorVisitMethod, type.getClassName());
                    }
                    methodVisitorVisitMethod.visitLabel(label2);
                    methodVisitorVisitMethod.visitFrame(3, 0, null, 0, null);
                    i12 = 5;
                }
            }
        }
        f(methodVisitorVisitMethod);
        methodVisitorVisitMethod.visitMaxs(i12, i15);
        methodVisitorVisitMethod.visitEnd();
    }

    public static void f(MethodVisitor methodVisitor) {
        methodVisitor.visitTypeInsn(187, "java/lang/IllegalArgumentException");
        methodVisitor.visitInsn(89);
        methodVisitor.visitTypeInsn(187, "java/lang/StringBuilder");
        methodVisitor.visitInsn(89);
        methodVisitor.visitLdcInsn("Field not found: ");
        methodVisitor.visitMethodInsn(183, "java/lang/StringBuilder", "<init>", "(Ljava/lang/String;)V");
        methodVisitor.visitVarInsn(21, 2);
        methodVisitor.visitMethodInsn(182, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;");
        methodVisitor.visitMethodInsn(182, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;");
        methodVisitor.visitMethodInsn(183, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V");
        methodVisitor.visitInsn(Opcodes.ATHROW);
    }

    public static void g(MethodVisitor methodVisitor, String str) {
        methodVisitor.visitTypeInsn(187, "java/lang/IllegalArgumentException");
        methodVisitor.visitInsn(89);
        methodVisitor.visitTypeInsn(187, "java/lang/StringBuilder");
        methodVisitor.visitInsn(89);
        methodVisitor.visitLdcInsn("Field not declared as " + str + ": ");
        methodVisitor.visitMethodInsn(183, "java/lang/StringBuilder", "<init>", "(Ljava/lang/String;)V");
        methodVisitor.visitVarInsn(21, 2);
        methodVisitor.visitMethodInsn(182, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;");
        methodVisitor.visitMethodInsn(182, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;");
        methodVisitor.visitMethodInsn(183, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V");
        methodVisitor.visitInsn(Opcodes.ATHROW);
    }

    public abstract Object get(Object obj, int i10);

    public Object get(Object obj, String str) {
        return get(obj, getIndex(str));
    }

    public abstract boolean getBoolean(Object obj, int i10);

    public abstract byte getByte(Object obj, int i10);

    public abstract char getChar(Object obj, int i10);

    public abstract double getDouble(Object obj, int i10);

    public int getFieldCount() {
        return this.f40064b.length;
    }

    public String[] getFieldNames() {
        return this.f40063a;
    }

    public Class[] getFieldTypes() {
        return this.f40064b;
    }

    public Field[] getFields() {
        return this.f40065c;
    }

    public abstract float getFloat(Object obj, int i10);

    public int getIndex(String str) {
        int length = this.f40063a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (this.f40063a[i10].equals(str)) {
                return i10;
            }
        }
        throw new IllegalArgumentException(f.d("Unable to find non-private field: ", str));
    }

    public abstract int getInt(Object obj, int i10);

    public abstract long getLong(Object obj, int i10);

    public abstract short getShort(Object obj, int i10);

    public abstract String getString(Object obj, int i10);

    public abstract void set(Object obj, int i10, Object obj2);

    public void set(Object obj, String str, Object obj2) {
        set(obj, getIndex(str), obj2);
    }

    public abstract void setBoolean(Object obj, int i10, boolean z10);

    public abstract void setByte(Object obj, int i10, byte b10);

    public abstract void setChar(Object obj, int i10, char c10);

    public abstract void setDouble(Object obj, int i10, double d2);

    public void setFields(Field[] fieldArr) {
        this.f40065c = fieldArr;
    }

    public abstract void setFloat(Object obj, int i10, float f6);

    public abstract void setInt(Object obj, int i10, int i11);

    public abstract void setLong(Object obj, int i10, long j10);

    public abstract void setShort(Object obj, int i10, short s4);

    public static FieldAccess get(Class cls) {
        Class clsD;
        if (cls.getSuperclass() == null) {
            throw new IllegalArgumentException("The type must not be the Object class, an interface, a primitive type, or void.");
        }
        ArrayList arrayList = new ArrayList();
        Class superclass = cls;
        while (true) {
            if (superclass == Object.class) {
                break;
            }
            for (Field field : superclass.getDeclaredFields()) {
                int modifiers = field.getModifiers();
                if (!Modifier.isStatic(modifiers) && !Modifier.isPrivate(modifiers)) {
                    arrayList.add(field);
                }
            }
            superclass = superclass.getSuperclass();
        }
        int size = arrayList.size();
        String[] strArr = new String[size];
        Class[] clsArr = new Class[arrayList.size()];
        for (int i10 = 0; i10 < size; i10++) {
            strArr[i10] = ((Field) arrayList.get(i10)).getName();
            clsArr[i10] = ((Field) arrayList.get(i10)).getType();
        }
        String name = cls.getName();
        String strConcat = name.concat("FieldAccess");
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
                    ClassWriter classWriter = new ClassWriter(0);
                    classWriter.visit(Opcodes.V1_1, 33, strReplace, null, "com/esotericsoftware/reflectasm/FieldAccess", null);
                    MethodVisitor methodVisitorVisitMethod = classWriter.visitMethod(1, "<init>", "()V", null, null);
                    methodVisitorVisitMethod.visitCode();
                    methodVisitorVisitMethod.visitVarInsn(25, 0);
                    methodVisitorVisitMethod.visitMethodInsn(183, "com/esotericsoftware/reflectasm/FieldAccess", "<init>", "()V");
                    methodVisitorVisitMethod.visitInsn(177);
                    methodVisitorVisitMethod.visitMaxs(1, 1);
                    methodVisitorVisitMethod.visitEnd();
                    a(classWriter, strReplace2, arrayList);
                    d(classWriter, strReplace2, arrayList);
                    Type type = Type.BOOLEAN_TYPE;
                    b(classWriter, strReplace2, arrayList, type);
                    e(classWriter, strReplace2, arrayList, type);
                    Type type2 = Type.BYTE_TYPE;
                    b(classWriter, strReplace2, arrayList, type2);
                    e(classWriter, strReplace2, arrayList, type2);
                    Type type3 = Type.SHORT_TYPE;
                    b(classWriter, strReplace2, arrayList, type3);
                    e(classWriter, strReplace2, arrayList, type3);
                    Type type4 = Type.INT_TYPE;
                    b(classWriter, strReplace2, arrayList, type4);
                    e(classWriter, strReplace2, arrayList, type4);
                    Type type5 = Type.LONG_TYPE;
                    b(classWriter, strReplace2, arrayList, type5);
                    e(classWriter, strReplace2, arrayList, type5);
                    Type type6 = Type.DOUBLE_TYPE;
                    b(classWriter, strReplace2, arrayList, type6);
                    e(classWriter, strReplace2, arrayList, type6);
                    Type type7 = Type.FLOAT_TYPE;
                    b(classWriter, strReplace2, arrayList, type7);
                    e(classWriter, strReplace2, arrayList, type7);
                    Type type8 = Type.CHAR_TYPE;
                    b(classWriter, strReplace2, arrayList, type8);
                    e(classWriter, strReplace2, arrayList, type8);
                    c(classWriter, strReplace2, arrayList);
                    classWriter.visitEnd();
                    clsD = aVarB.a(strConcat, classWriter.toByteArray());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        try {
            FieldAccess fieldAccess = (FieldAccess) clsD.newInstance();
            fieldAccess.f40063a = strArr;
            fieldAccess.f40064b = clsArr;
            fieldAccess.f40065c = (Field[]) arrayList.toArray(new Field[arrayList.size()]);
            return fieldAccess;
        } catch (Throwable th3) {
            throw new RuntimeException(f.d("Error constructing field access class: ", strConcat), th3);
        }
    }

    public int getIndex(Field field) {
        int length = this.f40065c.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (this.f40065c[i10].equals(field)) {
                return i10;
            }
        }
        throw new IllegalArgumentException("Unable to find non-private field: " + field);
    }
}
