package com.esotericsoftware.asm;

import androidx.camera.camera2.internal.compat.u;
import com.fasterxml.jackson.core.JsonPointer;

/* JADX INFO: loaded from: classes9.dex */
public class ClassWriter extends ClassVisitor {
    public static final int COMPUTE_FRAMES = 2;
    public static final int COMPUTE_MAXS = 1;
    public static final byte[] N;
    public a A;
    public Attribute B;
    public int C;
    public ByteVector D;
    public int E;
    public ByteVector F;
    public c G;
    public c H;
    public g I;
    public g J;
    public boolean K;
    public boolean L;
    public boolean M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClassReader f39892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ByteVector f39895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f[] f39896e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f39897f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f39898g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f39899h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f f39900i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f f39901j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f[] f39902k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public short f39903l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f39904n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f39905o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f39906p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f39907q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f39908r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int[] f39909s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f39910t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ByteVector f39911u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f39912v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f39913w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public a f39914x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public a f39915y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public a f39916z;

    static {
        byte[] bArr = new byte[220];
        for (int i10 = 0; i10 < 220; i10++) {
            bArr[i10] = (byte) ("AAAAAAAAAAAAAAAABCLMMDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAANAAAAAAAAAAAAAAAAAAAAJJJJJJJJJJJJJJJJDOPAAAAAAGGGGGGGHIFBFAAFFAARQJJKKJJJJJJJJJJJJJJJJJJ".charAt(i10) - 'A');
        }
        N = bArr;
    }

    public ClassWriter(int i10) {
        super(327680);
        this.f39894c = 1;
        this.f39895d = new ByteVector();
        f[] fVarArr = new f[256];
        this.f39896e = fVarArr;
        this.f39897f = (int) (((double) fVarArr.length) * 0.75d);
        this.f39898g = new f();
        this.f39899h = new f();
        this.f39900i = new f();
        this.f39901j = new f();
        this.K = (i10 & 1) != 0;
        this.L = (i10 & 2) != 0;
    }

    public final int a(String str, int i10) {
        f fVar = this.f39898g;
        fVar.f39993b = 31;
        fVar.f39994c = i10;
        fVar.f39996e = str;
        fVar.f39999h = (str.hashCode() + 31 + i10) & Integer.MAX_VALUE;
        f fVarG = g(fVar);
        if (fVarG == null) {
            fVarG = o();
        }
        return fVarG.f39992a;
    }

    public final f b(double d2) {
        f fVar = this.f39898g;
        fVar.f39993b = 6;
        fVar.f39995d = Double.doubleToRawLongBits(d2);
        fVar.f39999h = Integer.MAX_VALUE & (fVar.f39993b + ((int) d2));
        f fVarG = g(fVar);
        if (fVarG != null) {
            return fVarG;
        }
        this.f39895d.putByte(6).putLong(fVar.f39995d);
        f fVar2 = new f(this.f39894c, fVar);
        this.f39894c += 2;
        m(fVar2);
        return fVar2;
    }

    public final f c(float f6) {
        f fVar = this.f39898g;
        fVar.f39993b = 4;
        fVar.f39994c = Float.floatToRawIntBits(f6);
        fVar.f39999h = Integer.MAX_VALUE & (fVar.f39993b + ((int) f6));
        f fVarG = g(fVar);
        if (fVarG != null) {
            return fVarG;
        }
        this.f39895d.putByte(4).putInt(fVar.f39994c);
        int i10 = this.f39894c;
        this.f39894c = i10 + 1;
        f fVar2 = new f(i10, fVar);
        m(fVar2);
        return fVar2;
    }

    public final f d(int i10) {
        f fVar = this.f39898g;
        fVar.f39993b = 3;
        fVar.f39994c = i10;
        fVar.f39999h = Integer.MAX_VALUE & (3 + i10);
        f fVarG = g(fVar);
        if (fVarG != null) {
            return fVarG;
        }
        this.f39895d.putByte(3).putInt(i10);
        int i11 = this.f39894c;
        this.f39894c = i11 + 1;
        f fVar2 = new f(i11, fVar);
        m(fVar2);
        return fVar2;
    }

    public final f e(int i10, String str, String str2, String str3, boolean z10) {
        f fVar = this.f39901j;
        fVar.b(i10 + 20, str, str2, str3);
        f fVarG = g(fVar);
        if (fVarG != null) {
            return fVarG;
        }
        ByteVector byteVector = this.f39895d;
        int iNewField = i10 <= 4 ? newField(str, str2, str3) : newMethod(str, str2, str3, z10);
        byteVector.b(15, i10);
        byteVector.putShort(iNewField);
        int i11 = this.f39894c;
        this.f39894c = i11 + 1;
        f fVar2 = new f(i11, fVar);
        m(fVar2);
        return fVar2;
    }

    public final f f(long j10) {
        f fVar = this.f39898g;
        fVar.f39993b = 5;
        fVar.f39995d = j10;
        fVar.f39999h = (((int) j10) + 5) & Integer.MAX_VALUE;
        f fVarG = g(fVar);
        if (fVarG != null) {
            return fVarG;
        }
        this.f39895d.putByte(5).putLong(j10);
        f fVar2 = new f(this.f39894c, fVar);
        this.f39894c += 2;
        m(fVar2);
        return fVar2;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x001f. Please report as an issue. */
    public final f g(f fVar) {
        f[] fVarArr = this.f39896e;
        for (f fVar2 = fVarArr[fVar.f39999h % fVarArr.length]; fVar2 != null; fVar2 = fVar2.f40000i) {
            int i10 = fVar2.f39993b;
            int i11 = fVar.f39993b;
            if (i10 == i11) {
                if (i11 != 1) {
                    if (i11 == 12) {
                        if (fVar2.f39996e.equals(fVar.f39996e) && fVar2.f39997f.equals(fVar.f39997f)) {
                            return fVar2;
                        }
                    } else if (i11 != 16) {
                        if (i11 != 18) {
                            switch (i11) {
                                case 3:
                                case 4:
                                    if (fVar2.f39994c == fVar.f39994c) {
                                    }
                                    break;
                                case 5:
                                case 6:
                                    if (fVar2.f39995d == fVar.f39995d) {
                                    }
                                    break;
                                case 7:
                                case 8:
                                    break;
                                default:
                                    switch (i11) {
                                        case 30:
                                            break;
                                        case 31:
                                            if (fVar2.f39994c != fVar.f39994c || !fVar2.f39996e.equals(fVar.f39996e)) {
                                            }
                                            break;
                                        case 32:
                                            if (fVar2.f39995d == fVar.f39995d) {
                                            }
                                            break;
                                        default:
                                            if (!fVar2.f39996e.equals(fVar.f39996e) || !fVar2.f39997f.equals(fVar.f39997f) || !fVar2.f39998g.equals(fVar.f39998g)) {
                                            }
                                            break;
                                    }
                                    break;
                            }
                            return fVar2;
                        }
                        if (fVar2.f39995d == fVar.f39995d && fVar2.f39996e.equals(fVar.f39996e) && fVar2.f39997f.equals(fVar.f39997f)) {
                            return fVar2;
                        }
                    }
                }
                if (fVar2.f39996e.equals(fVar.f39996e)) {
                    return fVar2;
                }
            }
        }
        return fVar2;
    }

    public String getCommonSuperClass(String str, String str2) {
        ClassLoader classLoader = getClass().getClassLoader();
        try {
            Class<?> cls = Class.forName(str.replace(JsonPointer.SEPARATOR, '.'), false, classLoader);
            Class<?> cls2 = Class.forName(str2.replace(JsonPointer.SEPARATOR, '.'), false, classLoader);
            if (cls.isAssignableFrom(cls2)) {
                return str;
            }
            if (cls2.isAssignableFrom(cls)) {
                return str2;
            }
            if (cls.isInterface() || cls2.isInterface()) {
                return "java/lang/Object";
            }
            do {
                cls = cls.getSuperclass();
            } while (!cls.isAssignableFrom(cls2));
            return cls.getName().replace('.', JsonPointer.SEPARATOR);
        } catch (Exception e5) {
            throw new RuntimeException(e5.toString());
        }
    }

    public final f h(Object obj) {
        if (obj instanceof Integer) {
            return d(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return d(((Byte) obj).intValue());
        }
        if (obj instanceof Character) {
            return d(((Character) obj).charValue());
        }
        if (obj instanceof Short) {
            return d(((Short) obj).intValue());
        }
        if (obj instanceof Boolean) {
            return d(((Boolean) obj).booleanValue() ? 1 : 0);
        }
        if (obj instanceof Float) {
            return c(((Float) obj).floatValue());
        }
        if (obj instanceof Long) {
            return f(((Long) obj).longValue());
        }
        if (obj instanceof Double) {
            return b(((Double) obj).doubleValue());
        }
        if (obj instanceof String) {
            String str = (String) obj;
            f fVar = this.f39899h;
            fVar.b(8, str, null, null);
            f fVarG = g(fVar);
            if (fVarG != null) {
                return fVarG;
            }
            this.f39895d.c(8, newUTF8(str));
            int i10 = this.f39894c;
            this.f39894c = i10 + 1;
            f fVar2 = new f(i10, fVar);
            m(fVar2);
            return fVar2;
        }
        if (obj instanceof Type) {
            Type type = (Type) obj;
            int sort = type.getSort();
            if (sort == 10) {
                return i(type.getInternalName());
            }
            String descriptor = type.getDescriptor();
            return sort == 11 ? p(descriptor) : i(descriptor);
        }
        if (obj instanceof Handle) {
            Handle handle = (Handle) obj;
            return e(handle.f39917a, handle.f39918b, handle.f39919c, handle.f39920d, handle.f39921e);
        }
        StringBuffer stringBuffer = new StringBuffer("value ");
        stringBuffer.append(obj);
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    public final f i(String str) {
        f fVar = this.f39899h;
        fVar.b(7, str, null, null);
        f fVarG = g(fVar);
        if (fVarG != null) {
            return fVarG;
        }
        this.f39895d.c(7, newUTF8(str));
        int i10 = this.f39894c;
        this.f39894c = i10 + 1;
        f fVar2 = new f(i10, fVar);
        m(fVar2);
        return fVar2;
    }

    public final f j(String str, String str2, Handle handle, Object... objArr) {
        int i10;
        ByteVector byteVector = this.F;
        if (byteVector == null) {
            byteVector = new ByteVector();
            this.F = byteVector;
        }
        int i11 = byteVector.f39887b;
        int iHashCode = handle.hashCode();
        byteVector.putShort(newHandle(handle.f39917a, handle.f39918b, handle.f39919c, handle.f39920d, handle.isInterface()));
        int length = objArr.length;
        byteVector.putShort(length);
        for (Object obj : objArr) {
            iHashCode ^= obj.hashCode();
            byteVector.putShort(newConst(obj));
        }
        byte[] bArr = byteVector.f39886a;
        int i12 = (length + 2) << 1;
        int i13 = iHashCode & Integer.MAX_VALUE;
        f[] fVarArr = this.f39896e;
        f fVar = fVarArr[i13 % fVarArr.length];
        loop1: while (fVar != null) {
            if (fVar.f39993b == 33 && fVar.f39999h == i13) {
                int i14 = fVar.f39994c;
                int i15 = 0;
                while (true) {
                    if (i15 >= i12) {
                        break loop1;
                    }
                    if (bArr[i11 + i15] != bArr[i14 + i15]) {
                        break;
                    }
                    i15++;
                }
            }
            fVar = fVar.f40000i;
        }
        if (fVar != null) {
            byteVector.f39887b = i11;
            i10 = fVar.f39992a;
        } else {
            i10 = this.E;
            this.E = i10 + 1;
            f fVar2 = new f(i10);
            fVar2.f39993b = 33;
            fVar2.f39994c = i11;
            fVar2.f39999h = i13;
            m(fVar2);
        }
        f fVar3 = this.f39900i;
        fVar3.a(i10, str, str2);
        f fVarG = g(fVar3);
        if (fVarG != null) {
            return fVarG;
        }
        int iNewNameType = newNameType(str, str2);
        ByteVector byteVector2 = this.f39895d;
        byteVector2.c(18, i10);
        byteVector2.putShort(iNewNameType);
        int i16 = this.f39894c;
        this.f39894c = i16 + 1;
        f fVar4 = new f(i16, fVar3);
        m(fVar4);
        return fVar4;
    }

    public final f k(String str, String str2, String str3) {
        f fVar = this.f39900i;
        fVar.b(9, str, str2, str3);
        f fVarG = g(fVar);
        if (fVarG != null) {
            return fVarG;
        }
        int iNewClass = newClass(str);
        int iNewNameType = newNameType(str2, str3);
        ByteVector byteVector = this.f39895d;
        byteVector.c(9, iNewClass);
        byteVector.putShort(iNewNameType);
        int i10 = this.f39894c;
        this.f39894c = i10 + 1;
        f fVar2 = new f(i10, fVar);
        m(fVar2);
        return fVar2;
    }

    public final f l(String str, String str2, String str3, boolean z10) {
        int i10 = z10 ? 11 : 10;
        f fVar = this.f39900i;
        fVar.b(i10, str, str2, str3);
        f fVarG = g(fVar);
        if (fVarG != null) {
            return fVarG;
        }
        int iNewClass = newClass(str);
        int iNewNameType = newNameType(str2, str3);
        ByteVector byteVector = this.f39895d;
        byteVector.c(i10, iNewClass);
        byteVector.putShort(iNewNameType);
        int i11 = this.f39894c;
        this.f39894c = i11 + 1;
        f fVar2 = new f(i11, fVar);
        m(fVar2);
        return fVar2;
    }

    public final void m(f fVar) {
        if (this.f39894c + this.f39903l > this.f39897f) {
            int length = this.f39896e.length;
            int i10 = (length * 2) + 1;
            f[] fVarArr = new f[i10];
            for (int i11 = length - 1; i11 >= 0; i11--) {
                f fVar2 = this.f39896e[i11];
                while (fVar2 != null) {
                    int i12 = fVar2.f39999h % i10;
                    f fVar3 = fVar2.f40000i;
                    fVar2.f40000i = fVarArr[i12];
                    fVarArr[i12] = fVar2;
                    fVar2 = fVar3;
                }
            }
            this.f39896e = fVarArr;
            this.f39897f = (int) (((double) i10) * 0.75d);
        }
        int i13 = fVar.f39999h;
        f[] fVarArr2 = this.f39896e;
        int length2 = i13 % fVarArr2.length;
        fVar.f40000i = fVarArr2[length2];
        fVarArr2[length2] = fVar;
    }

    public final int n(String str) {
        f fVar = this.f39898g;
        fVar.b(30, str, null, null);
        f fVarG = g(fVar);
        if (fVarG == null) {
            fVarG = o();
        }
        return fVarG.f39992a;
    }

    public int newClass(String str) {
        return i(str).f39992a;
    }

    public int newConst(Object obj) {
        return h(obj).f39992a;
    }

    public int newField(String str, String str2, String str3) {
        return k(str, str2, str3).f39992a;
    }

    public int newHandle(int i10, String str, String str2, String str3) {
        return newHandle(i10, str, str2, str3, i10 == 9);
    }

    public int newInvokeDynamic(String str, String str2, Handle handle, Object... objArr) {
        return j(str, str2, handle, objArr).f39992a;
    }

    public int newMethod(String str, String str2, String str3, boolean z10) {
        return l(str, str2, str3, z10).f39992a;
    }

    public int newMethodType(String str) {
        return p(str).f39992a;
    }

    public int newNameType(String str, String str2) {
        f fVar = this.f39899h;
        fVar.b(12, str, str2, null);
        f fVarG = g(fVar);
        if (fVarG == null) {
            int iNewUTF8 = newUTF8(str);
            int iNewUTF9 = newUTF8(str2);
            ByteVector byteVector = this.f39895d;
            byteVector.c(12, iNewUTF8);
            byteVector.putShort(iNewUTF9);
            int i10 = this.f39894c;
            this.f39894c = i10 + 1;
            fVarG = new f(i10, fVar);
            m(fVarG);
        }
        return fVarG.f39992a;
    }

    public int newUTF8(String str) {
        f fVar = this.f39898g;
        fVar.b(1, str, null, null);
        f fVarG = g(fVar);
        if (fVarG == null) {
            this.f39895d.putByte(1).putUTF8(str);
            int i10 = this.f39894c;
            this.f39894c = i10 + 1;
            fVarG = new f(i10, fVar);
            m(fVarG);
        }
        return fVarG.f39992a;
    }

    public final f o() {
        short s4 = (short) (this.f39903l + 1);
        this.f39903l = s4;
        f fVar = new f(s4, this.f39898g);
        m(fVar);
        if (this.f39902k == null) {
            this.f39902k = new f[16];
        }
        short s7 = this.f39903l;
        f[] fVarArr = this.f39902k;
        if (s7 == fVarArr.length) {
            f[] fVarArr2 = new f[fVarArr.length * 2];
            System.arraycopy(fVarArr, 0, fVarArr2, 0, fVarArr.length);
            this.f39902k = fVarArr2;
        }
        this.f39902k[this.f39903l] = fVar;
        return fVar;
    }

    public final f p(String str) {
        f fVar = this.f39899h;
        fVar.b(16, str, null, null);
        f fVarG = g(fVar);
        if (fVarG != null) {
            return fVarG;
        }
        this.f39895d.c(16, newUTF8(str));
        int i10 = this.f39894c;
        this.f39894c = i10 + 1;
        f fVar2 = new f(i10, fVar);
        m(fVar2);
        return fVar2;
    }

    public byte[] toByteArray() {
        String str;
        String str2;
        int iA;
        int i10;
        String str3;
        int i11;
        int i12;
        ByteVector byteVector;
        String str4;
        int i13;
        String str5;
        int i14;
        int iA2;
        int i15;
        int i16;
        int i17;
        int iA3;
        int i18;
        ClassWriter classWriter = this;
        int i19 = 65535;
        if (classWriter.f39894c > 65535) {
            throw new RuntimeException("Class file too large!");
        }
        int i20 = (classWriter.f39908r * 2) + 24;
        c cVar = classWriter.G;
        int i21 = 0;
        while (true) {
            str = "ConstantValue";
            str2 = "Synthetic";
            if (cVar == null) {
                break;
            }
            i21++;
            int i22 = cVar.f39971f;
            ClassWriter classWriter2 = cVar.f39966a;
            if (i22 != 0) {
                classWriter2.newUTF8("ConstantValue");
                iA3 = 16;
            } else {
                iA3 = 8;
            }
            int i23 = cVar.f39967b;
            if ((i23 & 4096) != 0 && ((classWriter2.f39893b & i19) < 49 || (i23 & 262144) != 0)) {
                classWriter2.newUTF8("Synthetic");
                iA3 += 6;
            }
            if ((i23 & 131072) != 0) {
                classWriter2.newUTF8("Deprecated");
                iA3 += 6;
            }
            if (cVar.f39970e != 0) {
                classWriter2.newUTF8("Signature");
                iA3 += 8;
            }
            if (cVar.f39972g != null) {
                classWriter2.newUTF8("RuntimeVisibleAnnotations");
                i18 = 8;
                iA3 += cVar.f39972g.a() + 8;
            } else {
                i18 = 8;
            }
            if (cVar.f39973h != null) {
                classWriter2.newUTF8("RuntimeInvisibleAnnotations");
                iA3 += cVar.f39973h.a() + i18;
            }
            if (cVar.f39974i != null) {
                classWriter2.newUTF8("RuntimeVisibleTypeAnnotations");
                iA3 += cVar.f39974i.a() + i18;
            }
            if (cVar.f39975j != null) {
                classWriter2.newUTF8("RuntimeInvisibleTypeAnnotations");
                iA3 += cVar.f39975j.a() + i18;
            }
            Attribute attribute = cVar.f39976k;
            if (attribute != null) {
                iA3 += attribute.a(cVar.f39966a, null, 0, -1, -1);
            }
            i20 += iA3;
            cVar = (c) cVar.fv;
            i19 = 65535;
        }
        g gVar = classWriter.I;
        int i24 = 0;
        while (gVar != null) {
            int i25 = i24 + 1;
            if (gVar.f40007g != 0) {
                i16 = gVar.f40008h + 6;
                i20 = i20;
                i14 = i25;
                i21 = i21;
                str = str;
            } else {
                int i26 = gVar.f40019t.f39887b;
                ClassWriter classWriter3 = gVar.f40001a;
                if (i26 <= 0) {
                    i14 = i25;
                    iA2 = 8;
                } else {
                    if (i26 > 65535) {
                        throw new RuntimeException("Method code too large!");
                    }
                    classWriter3.newUTF8("Code");
                    i14 = i25;
                    int iB = u.b(gVar.C, 8, gVar.f40019t.f39887b + 18, 8);
                    if (gVar.I != null) {
                        classWriter3.newUTF8("LocalVariableTable");
                        iB += gVar.I.f39887b + 8;
                    }
                    if (gVar.K != null) {
                        classWriter3.newUTF8("LocalVariableTypeTable");
                        iB += gVar.K.f39887b + 8;
                    }
                    if (gVar.M != null) {
                        classWriter3.newUTF8("LineNumberTable");
                        iB += gVar.M.f39887b + 8;
                    }
                    if (gVar.f40024y != null) {
                        classWriter3.newUTF8((classWriter3.f39893b & 65535) >= 50 ? "StackMapTable" : "StackMap");
                        i17 = 8;
                        iB += gVar.f40024y.f39887b + 8;
                    } else {
                        i17 = 8;
                    }
                    if (gVar.O != null) {
                        classWriter3.newUTF8("RuntimeVisibleTypeAnnotations");
                        iB += gVar.O.a() + i17;
                    }
                    if (gVar.P != null) {
                        classWriter3.newUTF8("RuntimeInvisibleTypeAnnotations");
                        iB = gVar.P.a() + i17 + iB;
                    }
                    Attribute attribute2 = gVar.Q;
                    if (attribute2 != null) {
                        ClassWriter classWriter4 = gVar.f40001a;
                        ByteVector byteVector2 = gVar.f40019t;
                        iA2 = attribute2.a(classWriter4, byteVector2.f39886a, byteVector2.f39887b, gVar.f40020u, gVar.f40021v) + iB;
                    } else {
                        iA2 = iB;
                    }
                }
                int i27 = gVar.f40009i;
                if (i27 > 0) {
                    classWriter3.newUTF8("Exceptions");
                    iA2 += (i27 * 2) + 8;
                }
                int i28 = gVar.f40002b;
                if ((i28 & 4096) != 0 && ((classWriter3.f39893b & 65535) < 49 || (i28 & 262144) != 0)) {
                    classWriter3.newUTF8("Synthetic");
                    iA2 += 6;
                }
                if ((i28 & 131072) != 0) {
                    classWriter3.newUTF8("Deprecated");
                    iA2 += 6;
                }
                String str6 = gVar.f40006f;
                if (str6 != null) {
                    classWriter3.newUTF8("Signature");
                    classWriter3.newUTF8(str6);
                    iA2 += 8;
                }
                if (gVar.G != null) {
                    classWriter3.newUTF8("MethodParameters");
                    iA2 += gVar.G.f39887b + 7;
                }
                if (gVar.f40011k != null) {
                    classWriter3.newUTF8("AnnotationDefault");
                    iA2 += gVar.f40011k.f39887b + 6;
                }
                if (gVar.f40012l != null) {
                    classWriter3.newUTF8("RuntimeVisibleAnnotations");
                    i15 = 8;
                    iA2 += gVar.f40012l.a() + 8;
                } else {
                    i15 = 8;
                }
                if (gVar.m != null) {
                    classWriter3.newUTF8("RuntimeInvisibleAnnotations");
                    iA2 += gVar.m.a() + i15;
                }
                if (gVar.f40013n != null) {
                    classWriter3.newUTF8("RuntimeVisibleTypeAnnotations");
                    iA2 += gVar.f40013n.a() + i15;
                }
                if (gVar.f40014o != null) {
                    classWriter3.newUTF8("RuntimeInvisibleTypeAnnotations");
                    iA2 += gVar.f40014o.a() + i15;
                }
                if (gVar.f40015p != null) {
                    classWriter3.newUTF8("RuntimeVisibleParameterAnnotations");
                    a[] aVarArr = gVar.f40015p;
                    int length = ((aVarArr.length - gVar.f40017r) * 2) + 7 + iA2;
                    for (int length2 = aVarArr.length - 1; length2 >= gVar.f40017r; length2--) {
                        a aVar = gVar.f40015p[length2];
                        length += aVar == null ? 0 : aVar.a();
                    }
                    iA2 = length;
                }
                if (gVar.f40016q != null) {
                    classWriter3.newUTF8("RuntimeInvisibleParameterAnnotations");
                    a[] aVarArr2 = gVar.f40016q;
                    int length3 = ((aVarArr2.length - gVar.f40017r) * 2) + 7 + iA2;
                    for (int length4 = aVarArr2.length - 1; length4 >= gVar.f40017r; length4--) {
                        a aVar2 = gVar.f40016q[length4];
                        length3 += aVar2 == null ? 0 : aVar2.a();
                    }
                    iA2 = length3;
                }
                Attribute attribute3 = gVar.f40018s;
                if (attribute3 != null) {
                    iA2 += attribute3.a(gVar.f40001a, null, 0, -1, -1);
                }
                i16 = iA2;
            }
            i20 += i16;
            gVar = (g) gVar.mv;
            classWriter = this;
            i24 = i14;
            str = str;
            i21 = i21;
        }
        int i29 = i20;
        int i30 = i21;
        String str7 = str;
        ByteVector byteVector3 = classWriter.F;
        String str8 = "BootstrapMethods";
        if (byteVector3 != null) {
            iA = byteVector3.f39887b + 8 + i29;
            classWriter.newUTF8("BootstrapMethods");
            i10 = 1;
        } else {
            iA = i29;
            i10 = 0;
        }
        if (classWriter.f39906p != 0) {
            i10++;
            iA += 8;
            classWriter.newUTF8("Signature");
        }
        String str9 = "SourceFile";
        if (classWriter.f39910t != 0) {
            i10++;
            iA += 8;
            classWriter.newUTF8("SourceFile");
        }
        ByteVector byteVector4 = classWriter.f39911u;
        String str10 = "SourceDebugExtension";
        if (byteVector4 != null) {
            i10++;
            iA += byteVector4.f39887b + 6;
            classWriter.newUTF8("SourceDebugExtension");
        }
        if (classWriter.f39912v != 0) {
            i10++;
            iA += 10;
            classWriter.newUTF8("EnclosingMethod");
        }
        if ((classWriter.m & 131072) != 0) {
            i10++;
            iA += 6;
            classWriter.newUTF8("Deprecated");
        }
        int i31 = classWriter.m;
        String str11 = "Deprecated";
        if ((i31 & 4096) != 0) {
            str3 = "Signature";
            if ((classWriter.f39893b & 65535) < 49 || (i31 & 262144) != 0) {
                i10++;
                iA += 6;
                classWriter.newUTF8("Synthetic");
            }
        } else {
            str3 = "Signature";
        }
        ByteVector byteVector5 = classWriter.D;
        if (byteVector5 != null) {
            i10++;
            i11 = 8;
            iA += byteVector5.f39887b + 8;
            classWriter.newUTF8("InnerClasses");
        } else {
            i11 = 8;
        }
        a aVar3 = classWriter.f39914x;
        if (aVar3 != null) {
            i10++;
            iA += aVar3.a() + i11;
            classWriter.newUTF8("RuntimeVisibleAnnotations");
        }
        a aVar4 = classWriter.f39915y;
        if (aVar4 != null) {
            i10++;
            iA += aVar4.a() + i11;
            classWriter.newUTF8("RuntimeInvisibleAnnotations");
        }
        a aVar5 = classWriter.f39916z;
        if (aVar5 != null) {
            i10++;
            iA += aVar5.a() + i11;
            classWriter.newUTF8("RuntimeVisibleTypeAnnotations");
        }
        a aVar6 = classWriter.A;
        if (aVar6 != null) {
            i10++;
            iA += aVar6.a() + i11;
            classWriter.newUTF8("RuntimeInvisibleTypeAnnotations");
        }
        int iA4 = iA;
        Attribute attribute4 = classWriter.B;
        if (attribute4 != null) {
            int i32 = 0;
            while (attribute4 != null) {
                i32++;
                attribute4 = attribute4.f39885b;
            }
            iA4 += classWriter.B.a(this, null, 0, -1, -1);
            i10 = i32 + i10;
        }
        ByteVector byteVector6 = classWriter.f39895d;
        ByteVector byteVector7 = new ByteVector(iA4 + byteVector6.f39887b);
        byteVector7.putInt(-889275714).putInt(classWriter.f39893b);
        byteVector7.putShort(classWriter.f39894c).putByteArray(byteVector6.f39886a, 0, byteVector6.f39887b);
        int i33 = classWriter.m;
        int i34 = 393216;
        byteVector7.putShort(i33 & (~(((i33 & 262144) / 64) | 393216))).putShort(classWriter.f39904n).putShort(classWriter.f39907q);
        byteVector7.putShort(classWriter.f39908r);
        for (int i35 = 0; i35 < classWriter.f39908r; i35++) {
            byteVector7.putShort(classWriter.f39909s[i35]);
        }
        byteVector7.putShort(i30);
        c cVar2 = classWriter.G;
        while (cVar2 != null) {
            int i36 = cVar2.f39967b;
            int i37 = i36 & 262144;
            String str12 = str10;
            byteVector7.putShort((~((i37 / 64) | i34)) & i36).putShort(cVar2.f39968c).putShort(cVar2.f39969d);
            int i38 = cVar2.f39971f;
            int i39 = i38 != 0 ? 1 : 0;
            String str13 = str9;
            int i40 = i36 & 4096;
            String str14 = str8;
            ClassWriter classWriter5 = cVar2.f39966a;
            int i41 = i10;
            if (i40 != 0 && ((classWriter5.f39893b & 65535) < 49 || i37 != 0)) {
                i39++;
            }
            int i42 = i36 & 131072;
            if (i42 != 0) {
                i39++;
            }
            int i43 = cVar2.f39970e;
            if (i43 != 0) {
                i39++;
            }
            if (cVar2.f39972g != null) {
                i39++;
            }
            if (cVar2.f39973h != null) {
                i39++;
            }
            if (cVar2.f39974i != null) {
                i39++;
            }
            if (cVar2.f39975j != null) {
                i39++;
            }
            Attribute attribute5 = cVar2.f39976k;
            if (attribute5 != null) {
                int i44 = 0;
                while (attribute5 != null) {
                    i44++;
                    attribute5 = attribute5.f39885b;
                }
                i39 = i44 + i39;
            }
            byteVector7.putShort(i39);
            if (i38 != 0) {
                byteVector7.putShort(classWriter5.newUTF8(str7));
                byteVector7.putInt(2).putShort(i38);
            }
            if (i40 == 0 || ((classWriter5.f39893b & 65535) >= 49 && i37 == 0)) {
                str4 = str2;
                i13 = 0;
            } else {
                str4 = str2;
                i13 = 0;
                byteVector7.putShort(classWriter5.newUTF8(str4)).putInt(0);
            }
            if (i42 != 0) {
                str5 = str11;
                byteVector7.putShort(classWriter5.newUTF8(str5)).putInt(i13);
            } else {
                str5 = str11;
            }
            if (i43 != 0) {
                byteVector7.putShort(classWriter5.newUTF8(str3));
                byteVector7.putInt(2).putShort(i43);
            }
            if (cVar2.f39972g != null) {
                byteVector7.putShort(classWriter5.newUTF8("RuntimeVisibleAnnotations"));
                cVar2.f39972g.c(byteVector7);
            }
            if (cVar2.f39973h != null) {
                byteVector7.putShort(classWriter5.newUTF8("RuntimeInvisibleAnnotations"));
                cVar2.f39973h.c(byteVector7);
            }
            if (cVar2.f39974i != null) {
                byteVector7.putShort(classWriter5.newUTF8("RuntimeVisibleTypeAnnotations"));
                cVar2.f39974i.c(byteVector7);
            }
            if (cVar2.f39975j != null) {
                byteVector7.putShort(classWriter5.newUTF8("RuntimeInvisibleTypeAnnotations"));
                cVar2.f39975j.c(byteVector7);
            }
            Attribute attribute6 = cVar2.f39976k;
            if (attribute6 != null) {
                attribute6.b(cVar2.f39966a, null, 0, -1, -1, byteVector7);
            }
            cVar2 = (c) cVar2.fv;
            str11 = str5;
            str2 = str4;
            str10 = str12;
            str9 = str13;
            str8 = str14;
            i10 = i41;
            i34 = 393216;
        }
        int i45 = i10;
        String str15 = str8;
        String str16 = str9;
        String str17 = str10;
        String str18 = str2;
        String str19 = str11;
        byteVector7.putShort(i24);
        for (g gVar2 = this.I; gVar2 != null; gVar2 = (g) gVar2.mv) {
            gVar2.f(byteVector7);
        }
        byteVector7.putShort(i45);
        if (this.F != null) {
            byteVector7.putShort(newUTF8(str15));
            byteVector7.putInt(this.F.f39887b + 2).putShort(this.E);
            ByteVector byteVector8 = this.F;
            byteVector7.putByteArray(byteVector8.f39886a, 0, byteVector8.f39887b);
        }
        if (this.f39906p != 0) {
            i12 = 2;
            byteVector7.putShort(newUTF8(str3)).putInt(2).putShort(this.f39906p);
        } else {
            i12 = 2;
        }
        if (this.f39910t != 0) {
            byteVector7.putShort(newUTF8(str16)).putInt(i12).putShort(this.f39910t);
        }
        ByteVector byteVector9 = this.f39911u;
        if (byteVector9 != null) {
            int i46 = byteVector9.f39887b;
            byteVector7.putShort(newUTF8(str17)).putInt(i46);
            byteVector7.putByteArray(this.f39911u.f39886a, 0, i46);
        }
        if (this.f39912v != 0) {
            byteVector7.putShort(newUTF8("EnclosingMethod")).putInt(4);
            byteVector7.putShort(this.f39912v).putShort(this.f39913w);
        }
        if ((this.m & 131072) != 0) {
            byteVector7.putShort(newUTF8(str19)).putInt(0);
        }
        int i47 = this.m;
        if ((i47 & 4096) != 0 && ((this.f39893b & 65535) < 49 || (i47 & 262144) != 0)) {
            byteVector7.putShort(newUTF8(str18)).putInt(0);
        }
        if (this.D != null) {
            byteVector7.putShort(newUTF8("InnerClasses"));
            byteVector7.putInt(this.D.f39887b + 2).putShort(this.C);
            ByteVector byteVector10 = this.D;
            byteVector7.putByteArray(byteVector10.f39886a, 0, byteVector10.f39887b);
        }
        if (this.f39914x != null) {
            byteVector7.putShort(newUTF8("RuntimeVisibleAnnotations"));
            this.f39914x.c(byteVector7);
        }
        if (this.f39915y != null) {
            byteVector7.putShort(newUTF8("RuntimeInvisibleAnnotations"));
            this.f39915y.c(byteVector7);
        }
        if (this.f39916z != null) {
            byteVector7.putShort(newUTF8("RuntimeVisibleTypeAnnotations"));
            this.f39916z.c(byteVector7);
        }
        if (this.A != null) {
            byteVector7.putShort(newUTF8("RuntimeInvisibleTypeAnnotations"));
            this.A.c(byteVector7);
        }
        Attribute attribute7 = this.B;
        if (attribute7 != null) {
            byteVector = byteVector7;
            attribute7.b(this, null, 0, -1, -1, byteVector);
        } else {
            byteVector = byteVector7;
        }
        if (!this.M) {
            return byteVector.f39886a;
        }
        this.f39914x = null;
        this.f39915y = null;
        this.B = null;
        this.C = 0;
        this.D = null;
        this.E = 0;
        this.F = null;
        this.G = null;
        this.H = null;
        this.I = null;
        this.J = null;
        this.K = false;
        this.L = true;
        this.M = false;
        new ClassReader(byteVector.f39886a).accept(this, 4);
        return toByteArray();
    }

    @Override // com.esotericsoftware.asm.ClassVisitor
    public final void visit(int i10, int i11, String str, String str2, String str3, String[] strArr) {
        this.f39893b = i10;
        this.m = i11;
        this.f39904n = newClass(str);
        this.f39905o = str;
        if (str2 != null) {
            this.f39906p = newUTF8(str2);
        }
        this.f39907q = str3 == null ? 0 : newClass(str3);
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        int length = strArr.length;
        this.f39908r = length;
        this.f39909s = new int[length];
        for (int i12 = 0; i12 < this.f39908r; i12++) {
            this.f39909s[i12] = newClass(strArr[i12]);
        }
    }

    @Override // com.esotericsoftware.asm.ClassVisitor
    public final AnnotationVisitor visitAnnotation(String str, boolean z10) {
        ByteVector byteVector = new ByteVector();
        byteVector.putShort(newUTF8(str)).putShort(0);
        a aVar = new a(this, true, byteVector, byteVector, 2);
        if (z10) {
            aVar.f39945g = this.f39914x;
            this.f39914x = aVar;
        } else {
            aVar.f39945g = this.f39915y;
            this.f39915y = aVar;
        }
        return aVar;
    }

    @Override // com.esotericsoftware.asm.ClassVisitor
    public final void visitAttribute(Attribute attribute) {
        attribute.f39885b = this.B;
        this.B = attribute;
    }

    @Override // com.esotericsoftware.asm.ClassVisitor
    public final FieldVisitor visitField(int i10, String str, String str2, String str3, Object obj) {
        return new c(this, i10, str, str2, str3, obj);
    }

    @Override // com.esotericsoftware.asm.ClassVisitor
    public final void visitInnerClass(String str, String str2, String str3, int i10) {
        if (this.D == null) {
            this.D = new ByteVector();
        }
        f fVarI = i(str);
        if (fVarI.f39994c == 0) {
            this.C++;
            this.D.putShort(fVarI.f39992a);
            this.D.putShort(str2 == null ? 0 : newClass(str2));
            this.D.putShort(str3 != null ? newUTF8(str3) : 0);
            this.D.putShort(i10);
            fVarI.f39994c = this.C;
        }
    }

    @Override // com.esotericsoftware.asm.ClassVisitor
    public final MethodVisitor visitMethod(int i10, String str, String str2, String str3, String[] strArr) {
        return new g(this, i10, str, str2, str3, strArr, this.K, this.L);
    }

    @Override // com.esotericsoftware.asm.ClassVisitor
    public final void visitOuterClass(String str, String str2, String str3) {
        this.f39912v = newClass(str);
        if (str2 == null || str3 == null) {
            return;
        }
        this.f39913w = newNameType(str2, str3);
    }

    @Override // com.esotericsoftware.asm.ClassVisitor
    public final void visitSource(String str, String str2) {
        if (str != null) {
            this.f39910t = newUTF8(str);
        }
        if (str2 != null) {
            ByteVector byteVector = new ByteVector();
            byteVector.d(0, Integer.MAX_VALUE, str2);
            this.f39911u = byteVector;
        }
    }

    @Override // com.esotericsoftware.asm.ClassVisitor
    public final AnnotationVisitor visitTypeAnnotation(int i10, TypePath typePath, String str, boolean z10) {
        ByteVector byteVector = new ByteVector();
        a.b(i10, typePath, byteVector);
        byteVector.putShort(newUTF8(str)).putShort(0);
        a aVar = new a(this, true, byteVector, byteVector, byteVector.f39887b - 2);
        if (z10) {
            aVar.f39945g = this.f39916z;
            this.f39916z = aVar;
        } else {
            aVar.f39945g = this.A;
            this.A = aVar;
        }
        return aVar;
    }

    public ClassWriter(ClassReader classReader, int i10) {
        int i11;
        int i12;
        this(i10);
        char[] cArr = new char[classReader.f39891d];
        int[] iArr = classReader.f39888a;
        int length = iArr.length;
        f[] fVarArr = new f[length];
        byte b10 = 1;
        int i13 = 1;
        while (i13 < length) {
            int i14 = iArr[i13];
            byte b11 = classReader.f39889b[i14 - 1];
            f fVar = new f(i13);
            if (b11 == b10) {
                i11 = i13;
                String[] strArr = classReader.f39890c;
                String strF = strArr[i11];
                if (strF == null) {
                    strF = classReader.f(i14 + 2, cArr, classReader.readUnsignedShort(i14));
                    strArr[i11] = strF;
                }
                fVar.b(b11, strF, null, null);
            } else if (b11 == 15) {
                i11 = i13;
                int i15 = iArr[classReader.readUnsignedShort(i14 + 1)];
                int i16 = iArr[classReader.readUnsignedShort(i15 + 2)];
                fVar.b(classReader.readByte(i14) + 20, classReader.readClass(i15, cArr), classReader.readUTF8(i16, cArr), classReader.readUTF8(i16 + 2, cArr));
            } else if (b11 != 18) {
                if (b11 == 3) {
                    int i17 = classReader.readInt(i14);
                    fVar.f39993b = 3;
                    fVar.f39994c = i17;
                    fVar.f39999h = (3 + i17) & Integer.MAX_VALUE;
                } else if (b11 != 4) {
                    if (b11 == 5) {
                        long j10 = classReader.readLong(i14);
                        fVar.f39993b = 5;
                        fVar.f39995d = j10;
                        fVar.f39999h = (5 + ((int) j10)) & Integer.MAX_VALUE;
                    } else if (b11 != 6) {
                        switch (b11) {
                            case 9:
                            case 10:
                            case 11:
                                int i18 = iArr[classReader.readUnsignedShort(i14 + 2)];
                                fVar.b(b11, classReader.readClass(i14, cArr), classReader.readUTF8(i18, cArr), classReader.readUTF8(i18 + 2, cArr));
                                break;
                            case 12:
                                fVar.b(b11, classReader.readUTF8(i14, cArr), classReader.readUTF8(i14 + 2, cArr), null);
                                break;
                            default:
                                fVar.b(b11, classReader.readUTF8(i14, cArr), null, null);
                                break;
                        }
                    } else {
                        double dLongBitsToDouble = Double.longBitsToDouble(classReader.readLong(i14));
                        fVar.f39993b = 6;
                        fVar.f39995d = Double.doubleToRawLongBits(dLongBitsToDouble);
                        fVar.f39999h = (fVar.f39993b + ((int) dLongBitsToDouble)) & Integer.MAX_VALUE;
                    }
                    i12 = i13 + 1;
                    int i19 = fVar.f39999h % length;
                    fVar.f40000i = fVarArr[i19];
                    fVarArr[i19] = fVar;
                    b10 = 1;
                    i13 = i12 + 1;
                } else {
                    float fIntBitsToFloat = Float.intBitsToFloat(classReader.readInt(i14));
                    fVar.f39993b = 4;
                    fVar.f39994c = Float.floatToRawIntBits(fIntBitsToFloat);
                    fVar.f39999h = (fVar.f39993b + ((int) fIntBitsToFloat)) & Integer.MAX_VALUE;
                }
                i11 = i13;
            } else {
                if (this.F == null) {
                    int iJ = classReader.j();
                    int unsignedShort = classReader.readUnsignedShort(iJ);
                    while (true) {
                        if (unsignedShort <= 0) {
                            i11 = i13;
                        } else if ("BootstrapMethods".equals(classReader.readUTF8(iJ + 2, cArr))) {
                            int unsignedShort2 = classReader.readUnsignedShort(iJ + 8);
                            int i20 = iJ + 10;
                            int i21 = 0;
                            int i22 = i20;
                            while (i21 < unsignedShort2) {
                                int i23 = (i22 - iJ) - 10;
                                int iHashCode = classReader.readConst(classReader.readUnsignedShort(i22), cArr).hashCode();
                                int unsignedShort3 = classReader.readUnsignedShort(i22 + 2);
                                while (unsignedShort3 > 0) {
                                    iHashCode ^= classReader.readConst(classReader.readUnsignedShort(i22 + 4), cArr).hashCode();
                                    i22 += 2;
                                    unsignedShort3--;
                                    i13 = i13;
                                }
                                int i24 = i13;
                                int i25 = i22 + 4;
                                f fVar2 = new f(i21);
                                int i26 = iHashCode & Integer.MAX_VALUE;
                                fVar2.f39993b = 33;
                                fVar2.f39994c = i23;
                                fVar2.f39999h = i26;
                                int i27 = i26 % length;
                                fVar2.f40000i = fVarArr[i27];
                                fVarArr[i27] = fVar2;
                                i21++;
                                i22 = i25;
                                i13 = i24;
                            }
                            i11 = i13;
                            int i28 = classReader.readInt(iJ + 4);
                            ByteVector byteVector = new ByteVector(i28 + 62);
                            byteVector.putByteArray(classReader.f39889b, i20, i28 - 2);
                            this.E = unsignedShort2;
                            this.F = byteVector;
                        } else {
                            iJ += classReader.readInt(iJ + 4) + 6;
                            unsignedShort--;
                        }
                    }
                } else {
                    i11 = i13;
                }
                int i29 = iArr[classReader.readUnsignedShort(i14 + 2)];
                fVar.a(classReader.readUnsignedShort(i14), classReader.readUTF8(i29, cArr), classReader.readUTF8(i29 + 2, cArr));
            }
            i12 = i11;
            int i110 = fVar.f39999h % length;
            fVar.f40000i = fVarArr[i110];
            fVarArr[i110] = fVar;
            b10 = 1;
            i13 = i12 + 1;
        }
        int i30 = iArr[b10] - b10;
        this.f39895d.putByteArray(classReader.f39889b, i30, classReader.header - i30);
        this.f39896e = fVarArr;
        this.f39897f = (int) (((double) length) * 0.75d);
        this.f39894c = length;
        this.f39892a = classReader;
    }

    public int newHandle(int i10, String str, String str2, String str3, boolean z10) {
        return e(i10, str, str2, str3, z10).f39992a;
    }

    @Override // com.esotericsoftware.asm.ClassVisitor
    public final void visitEnd() {
    }
}
