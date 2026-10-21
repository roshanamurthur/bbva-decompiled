package com.esotericsoftware.asm;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends AnnotationVisitor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClassWriter f39939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f39941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ByteVector f39942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ByteVector f39943e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f39944f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f39945g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f39946h;

    public a(ClassWriter classWriter, boolean z10, ByteVector byteVector, ByteVector byteVector2, int i10) {
        super(327680);
        this.f39939a = classWriter;
        this.f39941c = z10;
        this.f39942d = byteVector;
        this.f39943e = byteVector2;
        this.f39944f = i10;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    public static void b(int i10, TypePath typePath, ByteVector byteVector) {
        int i11 = i10 >>> 24;
        if (i11 != 0 && i11 != 1) {
            switch (i11) {
                case 19:
                case 20:
                case 21:
                    byteVector.putByte(i11);
                    break;
                case 22:
                    byteVector.putShort(i10 >>> 16);
                    break;
                default:
                    switch (i11) {
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                            byteVector.putInt(i10);
                            break;
                        default:
                            byteVector.c(i11, (i10 & 16776960) >> 8);
                            break;
                    }
                    break;
            }
        } else {
            byteVector.putShort(i10 >>> 16);
        }
        if (typePath == null) {
            byteVector.putByte(0);
            return;
        }
        byte[] bArr = typePath.f39937a;
        int i12 = typePath.f39938b;
        byteVector.putByteArray(bArr, i12, (bArr[i12] * 2) + 1);
    }

    public static void d(a[] aVarArr, int i10, ByteVector byteVector) {
        int length = ((aVarArr.length - i10) * 2) + 1;
        int i11 = i10;
        while (true) {
            int iA = 0;
            if (i11 >= aVarArr.length) {
                break;
            }
            a aVar = aVarArr[i11];
            if (aVar != null) {
                iA = aVar.a();
            }
            length += iA;
            i11++;
        }
        byteVector.putInt(length).putByte(aVarArr.length - i10);
        while (i10 < aVarArr.length) {
            a aVar2 = null;
            int i12 = 0;
            for (a aVar3 = aVarArr[i10]; aVar3 != null; aVar3 = aVar3.f39945g) {
                i12++;
                aVar3.visitEnd();
                aVar3.f39946h = aVar2;
                aVar2 = aVar3;
            }
            byteVector.putShort(i12);
            while (aVar2 != null) {
                ByteVector byteVector2 = aVar2.f39942d;
                byteVector.putByteArray(byteVector2.f39886a, 0, byteVector2.f39887b);
                aVar2 = aVar2.f39946h;
            }
            i10++;
        }
    }

    public final int a() {
        int i10 = 0;
        for (a aVar = this; aVar != null; aVar = aVar.f39945g) {
            i10 += aVar.f39942d.f39887b;
        }
        return i10;
    }

    public final void c(ByteVector byteVector) {
        int i10 = 2;
        int i11 = 0;
        a aVar = null;
        for (a aVar2 = this; aVar2 != null; aVar2 = aVar2.f39945g) {
            i11++;
            i10 += aVar2.f39942d.f39887b;
            aVar2.visitEnd();
            aVar2.f39946h = aVar;
            aVar = aVar2;
        }
        byteVector.putInt(i10);
        byteVector.putShort(i11);
        while (aVar != null) {
            ByteVector byteVector2 = aVar.f39942d;
            byteVector.putByteArray(byteVector2.f39886a, 0, byteVector2.f39887b);
            aVar = aVar.f39946h;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.esotericsoftware.asm.AnnotationVisitor
    public final void visit(String str, Object obj) {
        int iCharAt;
        int iNewUTF8;
        this.f39940b++;
        boolean z10 = this.f39941c;
        ClassWriter classWriter = this.f39939a;
        ByteVector byteVector = this.f39942d;
        if (z10) {
            byteVector.putShort(classWriter.newUTF8(str));
        }
        if (obj instanceof String) {
            iNewUTF8 = classWriter.newUTF8((String) obj);
            iCharAt = 115;
        } else {
            if (obj instanceof Byte) {
                byteVector.c(66, classWriter.d(((Byte) obj).byteValue()).f39992a);
                return;
            }
            if (obj instanceof Boolean) {
                byteVector.c(90, classWriter.d(((Boolean) obj).booleanValue() ? 1 : 0).f39992a);
                return;
            }
            if (obj instanceof Character) {
                byteVector.c(67, classWriter.d(((Character) obj).charValue()).f39992a);
                return;
            }
            if (obj instanceof Short) {
                byteVector.c(83, classWriter.d(((Short) obj).shortValue()).f39992a);
                return;
            }
            if (obj instanceof Type) {
                iNewUTF8 = classWriter.newUTF8(((Type) obj).getDescriptor());
                iCharAt = 99;
            } else {
                int i10 = 0;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byteVector.c(91, bArr.length);
                    while (i10 < bArr.length) {
                        byteVector.c(66, classWriter.d(bArr[i10]).f39992a);
                        i10++;
                    }
                    return;
                }
                if (obj instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj;
                    byteVector.c(91, zArr.length);
                    while (i10 < zArr.length) {
                        byteVector.c(90, classWriter.d(zArr[i10] ? 1 : 0).f39992a);
                        i10++;
                    }
                    return;
                }
                if (obj instanceof short[]) {
                    short[] sArr = (short[]) obj;
                    byteVector.c(91, sArr.length);
                    while (i10 < sArr.length) {
                        byteVector.c(83, classWriter.d(sArr[i10]).f39992a);
                        i10++;
                    }
                    return;
                }
                if (obj instanceof char[]) {
                    char[] cArr = (char[]) obj;
                    byteVector.c(91, cArr.length);
                    while (i10 < cArr.length) {
                        byteVector.c(67, classWriter.d(cArr[i10]).f39992a);
                        i10++;
                    }
                    return;
                }
                if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    byteVector.c(91, iArr.length);
                    while (i10 < iArr.length) {
                        byteVector.c(73, classWriter.d(iArr[i10]).f39992a);
                        i10++;
                    }
                    return;
                }
                if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    byteVector.c(91, jArr.length);
                    while (i10 < jArr.length) {
                        byteVector.c(74, classWriter.f(jArr[i10]).f39992a);
                        i10++;
                    }
                    return;
                }
                if (obj instanceof float[]) {
                    float[] fArr = (float[]) obj;
                    byteVector.c(91, fArr.length);
                    while (i10 < fArr.length) {
                        byteVector.c(70, classWriter.c(fArr[i10]).f39992a);
                        i10++;
                    }
                    return;
                }
                if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    byteVector.c(91, dArr.length);
                    while (i10 < dArr.length) {
                        byteVector.c(68, classWriter.b(dArr[i10]).f39992a);
                        i10++;
                    }
                    return;
                }
                f fVarH = classWriter.h(obj);
                iCharAt = ".s.IFJDCS".charAt(fVarH.f39993b);
                iNewUTF8 = fVarH.f39992a;
            }
        }
        byteVector.c(iCharAt, iNewUTF8);
    }

    @Override // com.esotericsoftware.asm.AnnotationVisitor
    public final AnnotationVisitor visitAnnotation(String str, String str2) {
        this.f39940b++;
        boolean z10 = this.f39941c;
        ClassWriter classWriter = this.f39939a;
        ByteVector byteVector = this.f39942d;
        if (z10) {
            byteVector.putShort(classWriter.newUTF8(str));
        }
        byteVector.c(64, classWriter.newUTF8(str2));
        byteVector.putShort(0);
        return new a(this.f39939a, true, byteVector, byteVector, byteVector.f39887b - 2);
    }

    @Override // com.esotericsoftware.asm.AnnotationVisitor
    public final AnnotationVisitor visitArray(String str) {
        this.f39940b++;
        boolean z10 = this.f39941c;
        ByteVector byteVector = this.f39942d;
        if (z10) {
            byteVector.putShort(this.f39939a.newUTF8(str));
        }
        byteVector.c(91, 0);
        return new a(this.f39939a, false, byteVector, byteVector, byteVector.f39887b - 2);
    }

    @Override // com.esotericsoftware.asm.AnnotationVisitor
    public final void visitEnd() {
        ByteVector byteVector = this.f39943e;
        if (byteVector != null) {
            byte[] bArr = byteVector.f39886a;
            int i10 = this.f39940b;
            int i11 = this.f39944f;
            bArr[i11] = (byte) (i10 >>> 8);
            bArr[i11 + 1] = (byte) i10;
        }
    }

    @Override // com.esotericsoftware.asm.AnnotationVisitor
    public final void visitEnum(String str, String str2, String str3) {
        this.f39940b++;
        boolean z10 = this.f39941c;
        ByteVector byteVector = this.f39942d;
        ClassWriter classWriter = this.f39939a;
        if (z10) {
            byteVector.putShort(classWriter.newUTF8(str));
        }
        byteVector.c(101, classWriter.newUTF8(str2));
        byteVector.putShort(classWriter.newUTF8(str3));
    }
}
