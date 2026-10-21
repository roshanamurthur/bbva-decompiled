package com.esotericsoftware.kryo.util;

import com.esotericsoftware.kryo.Kryo;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: loaded from: classes9.dex */
public final class DefaultGenerics implements Generics {
    private int argumentsSize;
    private int genericTypesSize;
    private final Kryo kryo;
    private Generics.GenericType[] genericTypes = new Generics.GenericType[16];
    private int[] depths = new int[16];
    private Type[] arguments = new Type[16];

    public DefaultGenerics(Kryo kryo) {
        this.kryo = kryo;
    }

    @Override // com.esotericsoftware.kryo.util.Generics
    public int getGenericTypesSize() {
        return this.genericTypesSize;
    }

    @Override // com.esotericsoftware.kryo.util.Generics
    public Class nextGenericClass() {
        Generics.GenericType[] genericTypeArrNextGenericTypes = nextGenericTypes();
        if (genericTypeArrNextGenericTypes == null) {
            return null;
        }
        return genericTypeArrNextGenericTypes[0].resolve(this);
    }

    @Override // com.esotericsoftware.kryo.util.Generics
    public Generics.GenericType[] nextGenericTypes() {
        int i10 = this.genericTypesSize;
        if (i10 > 0) {
            int i11 = i10 - 1;
            Generics.GenericType genericType = this.genericTypes[i11];
            if (genericType.arguments != null && this.depths[i11] == this.kryo.getDepth() - 1) {
                Generics.GenericType[] genericTypeArr = genericType.arguments;
                pushGenericType(genericTypeArr[genericTypeArr.length - 1]);
                return genericType.arguments;
            }
        }
        return null;
    }

    @Override // com.esotericsoftware.kryo.util.Generics
    public void popGenericType() {
        int i10 = this.genericTypesSize;
        if (i10 == 0) {
            return;
        }
        int i11 = i10 - 1;
        if (this.depths[i11] < this.kryo.getDepth()) {
            return;
        }
        this.genericTypes[i11] = null;
        this.genericTypesSize = i11;
    }

    @Override // com.esotericsoftware.kryo.util.Generics
    public void popTypeVariables(int i10) {
        int i11 = this.argumentsSize;
        int i12 = i11 - i10;
        this.argumentsSize = i12;
        while (i12 < i11) {
            this.arguments[i12] = null;
            i12++;
        }
    }

    @Override // com.esotericsoftware.kryo.util.Generics
    public void pushGenericType(Generics.GenericType genericType) {
        int i10 = this.genericTypesSize;
        int i11 = i10 + 1;
        Generics.GenericType[] genericTypeArr = this.genericTypes;
        if (i11 == genericTypeArr.length) {
            Generics.GenericType[] genericTypeArr2 = new Generics.GenericType[genericTypeArr.length << 1];
            System.arraycopy(genericTypeArr, 0, genericTypeArr2, 0, i10);
            this.genericTypes = genericTypeArr2;
            int[] iArr = this.depths;
            int[] iArr2 = new int[iArr.length << 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            this.depths = iArr2;
        }
        this.genericTypesSize = i11;
        this.genericTypes[i10] = genericType;
        this.depths[i10] = this.kryo.getDepth();
    }

    @Override // com.esotericsoftware.kryo.util.Generics
    public int pushTypeVariables(Generics.GenericsHierarchy genericsHierarchy, Generics.GenericType[] genericTypeArr) {
        int i10 = genericsHierarchy.total;
        if (i10 == 0 || genericsHierarchy.rootTotal > genericTypeArr.length) {
            return 0;
        }
        int i11 = this.argumentsSize;
        int i12 = i10 + i11;
        Type[] typeArr = this.arguments;
        if (i12 > typeArr.length) {
            Type[] typeArr2 = new Type[Math.max(i12, typeArr.length << 1)];
            System.arraycopy(this.arguments, 0, typeArr2, 0, i11);
            this.arguments = typeArr2;
        }
        int[] iArr = genericsHierarchy.counts;
        TypeVariable[] typeVariableArr = genericsHierarchy.parameters;
        int length = genericTypeArr.length;
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14++) {
            Class clsResolve = genericTypeArr[i14].resolve(this);
            if (clsResolve != null) {
                int i15 = iArr[i14] + i13;
                while (i13 < i15) {
                    Type[] typeArr3 = this.arguments;
                    int i16 = this.argumentsSize;
                    typeArr3[i16] = typeVariableArr[i13];
                    typeArr3[i16 + 1] = clsResolve;
                    this.argumentsSize = i16 + 2;
                    i13++;
                }
            }
        }
        return this.argumentsSize - i11;
    }

    @Override // com.esotericsoftware.kryo.util.Generics
    public Class resolveTypeVariable(TypeVariable typeVariable) {
        for (int i10 = this.argumentsSize - 2; i10 >= 0; i10 -= 2) {
            Type type = this.arguments[i10];
            if (type == typeVariable || type.equals(typeVariable)) {
                return (Class) this.arguments[i10 + 1];
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < this.argumentsSize; i10 += 2) {
            if (i10 != 0) {
                sb2.append(", ");
            }
            sb2.append(((TypeVariable) this.arguments[i10]).getName());
            sb2.append("=");
            sb2.append(((Class) this.arguments[i10 + 1]).getSimpleName());
        }
        return sb2.toString();
    }
}
