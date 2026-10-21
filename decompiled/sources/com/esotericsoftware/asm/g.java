package com.esotericsoftware.asm;

import h3.p;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends MethodVisitor {
    public int[] A;
    public int[] B;
    public int C;
    public e D;
    public e E;
    public int F;
    public ByteVector G;
    public int H;
    public ByteVector I;
    public int J;
    public ByteVector K;
    public int L;
    public ByteVector M;
    public int N;
    public a O;
    public a P;
    public Attribute Q;
    public boolean R;
    public int S;
    public final int T;
    public final Label U;
    public Label V;
    public Label W;
    public int X;
    public int Y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClassWriter f40001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f40003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f40004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f40005e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f40006f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f40007g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f40008h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f40009i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f40010j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ByteVector f40011k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f40012l;
    public a m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a f40013n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a f40014o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public a[] f40015p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public a[] f40016q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f40017r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Attribute f40018s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ByteVector f40019t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f40020u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f40021v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f40022w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f40023x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ByteVector f40024y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f40025z;

    public g(ClassWriter classWriter, int i10, String str, String str2, String str3, String[] strArr, boolean z10, boolean z11) {
        super(327680);
        this.f40019t = new ByteVector();
        if (classWriter.I == null) {
            classWriter.I = this;
        } else {
            classWriter.J.mv = this;
        }
        classWriter.J = this;
        this.f40001a = classWriter;
        this.f40002b = i10;
        if ("<init>".equals(str)) {
            this.f40002b = 524288 | i10;
        }
        this.f40003c = classWriter.newUTF8(str);
        this.f40004d = classWriter.newUTF8(str2);
        this.f40005e = str2;
        this.f40006f = str3;
        if (strArr != null && strArr.length > 0) {
            int length = strArr.length;
            this.f40009i = length;
            this.f40010j = new int[length];
            for (int i11 = 0; i11 < this.f40009i; i11++) {
                this.f40010j[i11] = classWriter.newClass(strArr[i11]);
            }
        }
        this.T = z11 ? 0 : z10 ? 1 : 2;
        if (z10 || z11) {
            int argumentsAndReturnSizes = Type.getArgumentsAndReturnSizes(this.f40005e) >> 2;
            argumentsAndReturnSizes = (i10 & 8) != 0 ? argumentsAndReturnSizes - 1 : argumentsAndReturnSizes;
            this.f40021v = argumentsAndReturnSizes;
            this.f40022w = argumentsAndReturnSizes;
            Label label = new Label();
            this.U = label;
            label.f39922a |= 8;
            visitLabel(label);
        }
    }

    public static int a(int i10, int i11, int[] iArr, int[] iArr2) {
        int i12 = i11 - i10;
        for (int i13 = 0; i13 < iArr.length; i13++) {
            int i14 = iArr[i13];
            if (i10 < i14 && i14 <= i11) {
                i12 += iArr2[i13];
            } else if (i11 < i14 && i14 <= i10) {
                i12 -= iArr2[i13];
            }
        }
        return i12;
    }

    public static int b(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public static void i(int[] iArr, int[] iArr2, Label label) {
        if ((label.f39922a & 4) == 0) {
            label.f39924c = a(0, label.f39924c, iArr, iArr2);
            label.f39922a |= 4;
        }
    }

    public static int l(byte[] bArr, int i10) {
        return (bArr[i10 + 1] & 255) | ((bArr[i10] & 255) << 8);
    }

    public final void c(int i10, int i11) {
        char c10;
        ByteVector byteVectorPutByte;
        String string;
        int iNewClass;
        while (i10 < i11) {
            int i12 = this.B[i10];
            int i13 = (-268435456) & i12;
            ClassWriter classWriter = this.f40001a;
            if (i13 == 0) {
                int i14 = i12 & 1048575;
                int i15 = i12 & 267386880;
                if (i15 == 24117248) {
                    byteVectorPutByte = this.f40024y.putByte(7);
                    string = classWriter.f39902k[i14].f39996e;
                } else if (i15 != 25165824) {
                    this.f40024y.putByte(i14);
                } else {
                    byteVectorPutByte = this.f40024y.putByte(8);
                    iNewClass = classWriter.f39902k[i14].f39994c;
                    byteVectorPutByte.putShort(iNewClass);
                }
                i10++;
            } else {
                StringBuffer stringBuffer = new StringBuffer();
                int i16 = i13 >> 28;
                while (true) {
                    int i17 = i16 - 1;
                    if (i16 > 0) {
                        stringBuffer.append(AbstractJsonLexerKt.BEGIN_LIST);
                        i16 = i17;
                    } else {
                        if ((i12 & 267386880) == 24117248) {
                            stringBuffer.append(Matrix.MATRIX_TYPE_RANDOM_LT);
                            stringBuffer.append(classWriter.f39902k[i12 & 1048575].f39996e);
                            c10 = ';';
                        } else {
                            int i18 = i12 & 15;
                            if (i18 == 1) {
                                c10 = 'I';
                            } else if (i18 == 2) {
                                c10 = 'F';
                            } else if (i18 != 3) {
                                switch (i18) {
                                    case 9:
                                        c10 = Matrix.MATRIX_TYPE_ZERO;
                                        break;
                                    case 10:
                                        c10 = 'B';
                                        break;
                                    case 11:
                                        c10 = 'C';
                                        break;
                                    case 12:
                                        c10 = 'S';
                                        break;
                                    default:
                                        c10 = 'J';
                                        break;
                                }
                            } else {
                                c10 = 'D';
                            }
                        }
                        stringBuffer.append(c10);
                        byteVectorPutByte = this.f40024y.putByte(7);
                        string = stringBuffer.toString();
                    }
                }
            }
            iNewClass = classWriter.newClass(string);
            byteVectorPutByte.putShort(iNewClass);
            i10++;
        }
    }

    public final void d(int i10, int i11, int i12) {
        int i13 = i11 + 3 + i12;
        int[] iArr = this.B;
        if (iArr == null || iArr.length < i13) {
            this.B = new int[i13];
        }
        int[] iArr2 = this.B;
        iArr2[0] = i10;
        iArr2[1] = i11;
        iArr2[2] = i12;
    }

    public final void e(int i10, Label label) {
        p pVar = new p(1);
        pVar.f69333a = i10;
        pVar.f69334b = label;
        Label label2 = this.W;
        pVar.f69335c = label2.f39931j;
        label2.f39931j = pVar;
    }

    public final void f(ByteVector byteVector) {
        int i10;
        int i11;
        int i12;
        int i13 = this.f40002b;
        int i14 = i13 & 262144;
        byteVector.putShort((~((i14 / 64) | 917504)) & i13).putShort(this.f40003c).putShort(this.f40004d);
        int i15 = this.f40007g;
        ClassWriter classWriter = this.f40001a;
        if (i15 != 0) {
            byteVector.putByteArray(classWriter.f39892a.f39889b, i15, this.f40008h);
            return;
        }
        int i16 = this.f40019t.f39887b > 0 ? 1 : 0;
        int i17 = this.f40009i;
        if (i17 > 0) {
            i16++;
        }
        int i18 = i13 & 4096;
        if (i18 != 0 && ((classWriter.f39893b & 65535) < 49 || i14 != 0)) {
            i16++;
        }
        int i19 = i13 & 131072;
        if (i19 != 0) {
            i16++;
        }
        String str = this.f40006f;
        if (str != null) {
            i16++;
        }
        if (this.G != null) {
            i16++;
        }
        if (this.f40011k != null) {
            i16++;
        }
        if (this.f40012l != null) {
            i16++;
        }
        if (this.m != null) {
            i16++;
        }
        if (this.f40013n != null) {
            i16++;
        }
        if (this.f40014o != null) {
            i16++;
        }
        if (this.f40015p != null) {
            i16++;
        }
        if (this.f40016q != null) {
            i16++;
        }
        Attribute attribute = this.f40018s;
        if (attribute != null) {
            int i20 = 0;
            while (attribute != null) {
                i20++;
                attribute = attribute.f39885b;
            }
            i16 += i20;
        }
        byteVector.putShort(i16);
        int i21 = this.f40019t.f39887b;
        if (i21 > 0) {
            int iA = (this.C * 8) + i21 + 12;
            ByteVector byteVector2 = this.I;
            if (byteVector2 != null) {
                iA += byteVector2.f39887b + 8;
            }
            ByteVector byteVector3 = this.K;
            if (byteVector3 != null) {
                iA += byteVector3.f39887b + 8;
            }
            ByteVector byteVector4 = this.M;
            if (byteVector4 != null) {
                iA += byteVector4.f39887b + 8;
            }
            ByteVector byteVector5 = this.f40024y;
            if (byteVector5 != null) {
                iA += byteVector5.f39887b + 8;
            }
            a aVar = this.O;
            if (aVar != null) {
                iA += aVar.a() + 8;
            }
            a aVar2 = this.P;
            if (aVar2 != null) {
                iA += aVar2.a() + 8;
            }
            Attribute attribute2 = this.Q;
            if (attribute2 != null) {
                ClassWriter classWriter2 = this.f40001a;
                ByteVector byteVector6 = this.f40019t;
                iA += attribute2.a(classWriter2, byteVector6.f39886a, byteVector6.f39887b, this.f40020u, this.f40021v);
            }
            byteVector.putShort(classWriter.newUTF8("Code")).putInt(iA);
            byteVector.putShort(this.f40020u).putShort(this.f40021v);
            ByteVector byteVectorPutInt = byteVector.putInt(this.f40019t.f39887b);
            ByteVector byteVector7 = this.f40019t;
            byteVectorPutInt.putByteArray(byteVector7.f39886a, 0, byteVector7.f39887b);
            byteVector.putShort(this.C);
            if (this.C > 0) {
                for (e eVar = this.D; eVar != null; eVar = eVar.f39991f) {
                    byteVector.putShort(eVar.f39986a.f39924c).putShort(eVar.f39987b.f39924c).putShort(eVar.f39988c.f39924c).putShort(eVar.f39990e);
                }
            }
            int i22 = this.I != null ? 1 : 0;
            if (this.K != null) {
                i22++;
            }
            if (this.M != null) {
                i22++;
            }
            if (this.f40024y != null) {
                i22++;
            }
            if (this.O != null) {
                i22++;
            }
            if (this.P != null) {
                i22++;
            }
            Attribute attribute3 = this.Q;
            if (attribute3 != null) {
                int i23 = 0;
                while (attribute3 != null) {
                    i23++;
                    attribute3 = attribute3.f39885b;
                }
                i22 += i23;
            }
            byteVector.putShort(i22);
            if (this.I != null) {
                byteVector.putShort(classWriter.newUTF8("LocalVariableTable"));
                byteVector.putInt(this.I.f39887b + 2).putShort(this.H);
                ByteVector byteVector8 = this.I;
                byteVector.putByteArray(byteVector8.f39886a, 0, byteVector8.f39887b);
            }
            if (this.K != null) {
                byteVector.putShort(classWriter.newUTF8("LocalVariableTypeTable"));
                byteVector.putInt(this.K.f39887b + 2).putShort(this.J);
                ByteVector byteVector9 = this.K;
                byteVector.putByteArray(byteVector9.f39886a, 0, byteVector9.f39887b);
            }
            if (this.M != null) {
                byteVector.putShort(classWriter.newUTF8("LineNumberTable"));
                byteVector.putInt(this.M.f39887b + 2).putShort(this.L);
                ByteVector byteVector10 = this.M;
                byteVector.putByteArray(byteVector10.f39886a, 0, byteVector10.f39887b);
            }
            if (this.f40024y != null) {
                byteVector.putShort(classWriter.newUTF8((classWriter.f39893b & 65535) >= 50 ? "StackMapTable" : "StackMap"));
                i12 = 2;
                byteVector.putInt(this.f40024y.f39887b + 2).putShort(this.f40023x);
                ByteVector byteVector11 = this.f40024y;
                byteVector.putByteArray(byteVector11.f39886a, 0, byteVector11.f39887b);
            } else {
                i12 = 2;
            }
            if (this.O != null) {
                byteVector.putShort(classWriter.newUTF8("RuntimeVisibleTypeAnnotations"));
                this.O.c(byteVector);
            }
            if (this.P != null) {
                byteVector.putShort(classWriter.newUTF8("RuntimeInvisibleTypeAnnotations"));
                this.P.c(byteVector);
            }
            Attribute attribute4 = this.Q;
            if (attribute4 != null) {
                ClassWriter classWriter3 = this.f40001a;
                ByteVector byteVector12 = this.f40019t;
                i10 = i12;
                attribute4.b(classWriter3, byteVector12.f39886a, byteVector12.f39887b, this.f40021v, this.f40020u, byteVector);
            } else {
                i10 = i12;
            }
        } else {
            i10 = 2;
        }
        if (i17 > 0) {
            byteVector.putShort(classWriter.newUTF8("Exceptions")).putInt((i17 * 2) + i10);
            byteVector.putShort(i17);
            for (int i24 = 0; i24 < i17; i24++) {
                byteVector.putShort(this.f40010j[i24]);
            }
        }
        if (i18 == 0 || ((classWriter.f39893b & 65535) >= 49 && i14 == 0)) {
            i11 = 0;
        } else {
            i11 = 0;
            byteVector.putShort(classWriter.newUTF8("Synthetic")).putInt(0);
        }
        if (i19 != 0) {
            byteVector.putShort(classWriter.newUTF8("Deprecated")).putInt(i11);
        }
        if (str != null) {
            byteVector.putShort(classWriter.newUTF8("Signature")).putInt(i10).putShort(classWriter.newUTF8(str));
        }
        if (this.G != null) {
            byteVector.putShort(classWriter.newUTF8("MethodParameters"));
            byteVector.putInt(this.G.f39887b + 1).putByte(this.F);
            ByteVector byteVector13 = this.G;
            byteVector.putByteArray(byteVector13.f39886a, 0, byteVector13.f39887b);
        }
        if (this.f40011k != null) {
            byteVector.putShort(classWriter.newUTF8("AnnotationDefault"));
            byteVector.putInt(this.f40011k.f39887b);
            ByteVector byteVector14 = this.f40011k;
            byteVector.putByteArray(byteVector14.f39886a, 0, byteVector14.f39887b);
        }
        if (this.f40012l != null) {
            byteVector.putShort(classWriter.newUTF8("RuntimeVisibleAnnotations"));
            this.f40012l.c(byteVector);
        }
        if (this.m != null) {
            byteVector.putShort(classWriter.newUTF8("RuntimeInvisibleAnnotations"));
            this.m.c(byteVector);
        }
        if (this.f40013n != null) {
            byteVector.putShort(classWriter.newUTF8("RuntimeVisibleTypeAnnotations"));
            this.f40013n.c(byteVector);
        }
        if (this.f40014o != null) {
            byteVector.putShort(classWriter.newUTF8("RuntimeInvisibleTypeAnnotations"));
            this.f40014o.c(byteVector);
        }
        if (this.f40015p != null) {
            byteVector.putShort(classWriter.newUTF8("RuntimeVisibleParameterAnnotations"));
            a.d(this.f40015p, this.f40017r, byteVector);
        }
        if (this.f40016q != null) {
            byteVector.putShort(classWriter.newUTF8("RuntimeInvisibleParameterAnnotations"));
            a.d(this.f40016q, this.f40017r, byteVector);
        }
        Attribute attribute5 = this.f40018s;
        if (attribute5 != null) {
            attribute5.b(this.f40001a, null, 0, -1, -1, byteVector);
        }
    }

    public final void g(Label label, Label[] labelArr) {
        Label label2 = this.W;
        if (label2 != null) {
            if (this.T == 0) {
                label2.f39929h.e(171, 0, null, null);
                e(0, label);
                label.a().f39922a |= 16;
                for (int i10 = 0; i10 < labelArr.length; i10++) {
                    e(0, labelArr[i10]);
                    labelArr[i10].a().f39922a |= 16;
                }
            } else {
                int i11 = this.X - 1;
                this.X = i11;
                e(i11, label);
                for (Label label3 : labelArr) {
                    e(this.X, label3);
                }
            }
            m();
        }
    }

    public final void h(Object obj) {
        ByteVector byteVectorPutByte;
        int iNewClass;
        if (obj instanceof String) {
            byteVectorPutByte = this.f40024y.putByte(7);
            iNewClass = this.f40001a.newClass((String) obj);
        } else if (obj instanceof Integer) {
            this.f40024y.putByte(((Integer) obj).intValue());
            return;
        } else {
            byteVectorPutByte = this.f40024y.putByte(8);
            iNewClass = ((Label) obj).f39924c;
        }
        byteVectorPutByte.putShort(iNewClass);
    }

    public final void j() {
        int i10;
        char c10;
        ByteVector byteVectorPutByte;
        int i11;
        if (this.A != null) {
            if (this.f40024y == null) {
                this.f40024y = new ByteVector();
            }
            int[] iArr = this.B;
            int i12 = iArr[1];
            int i13 = iArr[2];
            if ((this.f40001a.f39893b & 65535) < 50) {
                this.f40024y.putShort(iArr[0]).putShort(i12);
                i11 = i12 + 3;
                c(3, i11);
            } else {
                int[] iArr2 = this.A;
                int i14 = iArr2[1];
                int i15 = this.f40023x == 0 ? iArr[0] : (iArr[0] - iArr2[0]) - 1;
                if (i13 == 0) {
                    i10 = i12 - i14;
                    switch (i10) {
                        case -3:
                        case -2:
                        case -1:
                            i14 = i12;
                            c10 = 248;
                            break;
                        case 0:
                            c10 = i15 < 64 ? (char) 0 : (char) 251;
                            break;
                        case 1:
                        case 2:
                        case 3:
                            c10 = 252;
                            break;
                        default:
                            c10 = 255;
                            break;
                    }
                } else if (i12 == i14 && i13 == 1) {
                    c10 = i15 < 63 ? '@' : (char) 247;
                    i10 = 0;
                } else {
                    i10 = 0;
                    c10 = 255;
                }
                if (c10 != 255) {
                    int i16 = 3;
                    for (int i17 = 0; i17 < i14; i17++) {
                        if (this.B[i16] != this.A[i16]) {
                            c10 = 255;
                        } else {
                            i16++;
                        }
                    }
                }
                if (c10 != 0) {
                    if (c10 == '@') {
                        this.f40024y.putByte(i15 + 64);
                    } else if (c10 != 247) {
                        if (c10 == 248) {
                            byteVectorPutByte = this.f40024y.putByte(i10 + 251);
                        } else if (c10 == 251) {
                            byteVectorPutByte = this.f40024y.putByte(251);
                        } else if (c10 != 252) {
                            this.f40024y.putByte(255).putShort(i15).putShort(i12);
                            i11 = i12 + 3;
                            c(3, i11);
                        } else {
                            this.f40024y.putByte(i10 + 251).putShort(i15);
                            c(i14 + 3, i12 + 3);
                        }
                        byteVectorPutByte.putShort(i15);
                    } else {
                        this.f40024y.putByte(247).putShort(i15);
                    }
                    c(i12 + 3, i12 + 4);
                } else {
                    this.f40024y.putByte(i15);
                }
                this.f40023x++;
            }
            this.f40024y.putShort(i13);
            c(i11, i13 + i11);
            this.f40023x++;
        }
        this.A = this.B;
        this.B = null;
    }

    public final void k(d dVar) {
        int[] iArr = dVar.f39979b;
        int[] iArr2 = dVar.f39980c;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < iArr.length) {
            int i14 = iArr[i11];
            i13++;
            if (i14 != 16777216) {
                i12 += i13;
                i13 = 0;
            }
            if (i14 == 16777220 || i14 == 16777219) {
                i11++;
            }
            i11++;
        }
        int i15 = 0;
        int i16 = 0;
        while (i15 < iArr2.length) {
            int i17 = iArr2[i15];
            i16++;
            if (i17 == 16777220 || i17 == 16777219) {
                i15++;
            }
            i15++;
        }
        d(dVar.f39978a.f39924c, i12, i16);
        int i18 = 3;
        int i19 = 0;
        while (i12 > 0) {
            int i20 = iArr[i19];
            int i21 = i18 + 1;
            this.B[i18] = i20;
            if (i20 == 16777220 || i20 == 16777219) {
                i19++;
            }
            i19++;
            i12--;
            i18 = i21;
        }
        while (i10 < iArr2.length) {
            int i22 = iArr2[i10];
            int i23 = i18 + 1;
            this.B[i18] = i22;
            if (i22 == 16777220 || i22 == 16777219) {
                i10++;
            }
            i10++;
            i18 = i23;
        }
        j();
    }

    public final void m() {
        if (this.T == 0) {
            Label label = new Label();
            d dVar = new d();
            label.f39929h = dVar;
            dVar.f39978a = label;
            ByteVector byteVector = this.f40019t;
            label.d(byteVector.f39887b, byteVector.f39886a);
            this.V.f39930i = label;
            this.V = label;
        } else {
            this.W.f39928g = this.Y;
        }
        this.W = null;
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public final AnnotationVisitor visitAnnotation(String str, boolean z10) {
        ByteVector byteVector = new ByteVector();
        byteVector.putShort(this.f40001a.newUTF8(str)).putShort(0);
        a aVar = new a(this.f40001a, true, byteVector, byteVector, 2);
        if (z10) {
            aVar.f39945g = this.f40012l;
            this.f40012l = aVar;
        } else {
            aVar.f39945g = this.m;
            this.m = aVar;
        }
        return aVar;
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public final AnnotationVisitor visitAnnotationDefault() {
        ByteVector byteVector = new ByteVector();
        this.f40011k = byteVector;
        return new a(this.f40001a, false, byteVector, null, 0);
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public final void visitAttribute(Attribute attribute) {
        if (attribute.isCodeAttribute()) {
            attribute.f39885b = this.Q;
            this.Q = attribute;
        } else {
            attribute.f39885b = this.f40018s;
            this.f40018s = attribute;
        }
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public final void visitFieldInsn(int i10, String str, String str2, String str3) {
        int i11;
        int i12;
        this.N = this.f40019t.f39887b;
        ClassWriter classWriter = this.f40001a;
        f fVarK = classWriter.k(str, str2, str3);
        Label label = this.W;
        if (label != null) {
            if (this.T == 0) {
                label.f39929h.e(i10, 0, classWriter, fVarK);
            } else {
                char cCharAt = str3.charAt(0);
                int i13 = -2;
                switch (i10) {
                    case 178:
                        i11 = ((cCharAt == 'D' || cCharAt == 'J') ? 2 : 1) + this.X;
                        break;
                    case 179:
                        i12 = this.X;
                        if (cCharAt != 'D' && cCharAt != 'J') {
                            i13 = -1;
                        }
                        i11 = i12 + i13;
                        break;
                    case 180:
                        i11 = this.X + ((cCharAt == 'D' || cCharAt == 'J') ? 1 : 0);
                        break;
                    default:
                        i12 = this.X;
                        if (cCharAt == 'D' || cCharAt == 'J') {
                            i13 = -3;
                        }
                        i11 = i12 + i13;
                        break;
                }
                if (i11 > this.Y) {
                    this.Y = i11;
                }
                this.X = i11;
            }
        }
        this.f40019t.c(i10, fVarK.f39992a);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00b0  */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x006a. Please report as an issue. */
    @Override // com.esotericsoftware.asm.MethodVisitor
    public final void visitFrame(int i10, int i11, Object[] objArr, int i12, Object[] objArr2) {
        int i13;
        ByteVector byteVector;
        int i14;
        int i15;
        int i16;
        int i17;
        if (this.T == 0) {
            return;
        }
        int i18 = 3;
        if (i10 == -1) {
            int[] iArr = this.A;
            ClassWriter classWriter = this.f40001a;
            if (iArr == null) {
                String str = this.f40005e;
                d(0, str.length() + 1, 0);
                int i19 = this.f40002b;
                if ((i19 & 8) == 0) {
                    if ((i19 & 524288) == 0) {
                        this.B[3] = classWriter.n(classWriter.f39905o) | 24117248;
                    } else {
                        this.B[3] = 6;
                    }
                    i16 = 4;
                } else {
                    i16 = 3;
                }
                int i20 = 1;
                while (true) {
                    int i21 = i20 + 1;
                    char cCharAt = str.charAt(i20);
                    if (cCharAt == 'F') {
                        i17 = i16 + 1;
                        this.B[i16] = 2;
                    } else if (cCharAt == 'L') {
                        int i22 = i21;
                        while (str.charAt(i22) != ';') {
                            i22++;
                        }
                        this.B[i16] = classWriter.n(str.substring(i21, i22)) | 24117248;
                        i16++;
                        i20 = i22 + 1;
                    } else if (cCharAt == 'S' || cCharAt == 'I') {
                        i17 = i16 + 1;
                        this.B[i16] = 1;
                    } else if (cCharAt == 'J') {
                        i17 = i16 + 1;
                        this.B[i16] = 4;
                    } else if (cCharAt == 'Z') {
                        i17 = i16 + 1;
                        this.B[i16] = 1;
                    } else if (cCharAt != '[') {
                        switch (cCharAt) {
                            case 'B':
                            case 'C':
                                i17 = i16 + 1;
                                this.B[i16] = 1;
                                break;
                            case 'D':
                                i17 = i16 + 1;
                                this.B[i16] = 3;
                                break;
                        }
                        this.B[1] = i16 - 3;
                        j();
                    } else {
                        while (str.charAt(i21) == '[') {
                            i21++;
                        }
                        if (str.charAt(i21) == 'L') {
                            do {
                                i21++;
                            } while (str.charAt(i21) != ';');
                        }
                        i17 = i16 + 1;
                        i21++;
                        this.B[i16] = classWriter.n(str.substring(i20, i21)) | 24117248;
                    }
                    i16 = i17;
                    i20 = i21;
                }
            }
            this.f40022w = i11;
            d(this.f40019t.f39887b, i11, i12);
            for (int i23 = 0; i23 < i11; i23++) {
                Object obj = objArr[i23];
                if (obj instanceof String) {
                    i15 = i18 + 1;
                    this.B[i18] = classWriter.n((String) obj) | 24117248;
                } else {
                    if (obj instanceof Integer) {
                        i15 = i18 + 1;
                        this.B[i18] = ((Integer) obj).intValue();
                    } else {
                        this.B[i18] = classWriter.a("", ((Label) obj).f39924c) | 25165824;
                        i18++;
                    }
                }
                i18 = i15;
            }
            for (int i24 = 0; i24 < i12; i24++) {
                Object obj2 = objArr2[i24];
                if (obj2 instanceof String) {
                    i14 = i18 + 1;
                    this.B[i18] = classWriter.n((String) obj2) | 24117248;
                } else if (obj2 instanceof Integer) {
                    i14 = i18 + 1;
                    this.B[i18] = ((Integer) obj2).intValue();
                } else {
                    i14 = i18 + 1;
                    this.B[i18] = classWriter.a("", ((Label) obj2).f39924c) | 25165824;
                }
                i18 = i14;
            }
            j();
        } else {
            if (this.f40024y == null) {
                this.f40024y = new ByteVector();
                i13 = this.f40019t.f39887b;
            } else {
                i13 = (this.f40019t.f39887b - this.f40025z) - 1;
                if (i13 < 0) {
                    if (i10 != 3) {
                        throw new IllegalStateException();
                    }
                    return;
                }
            }
            if (i10 == 0) {
                this.f40022w = i11;
                this.f40024y.putByte(255).putShort(i13).putShort(i11);
                for (int i25 = 0; i25 < i11; i25++) {
                    h(objArr[i25]);
                }
                this.f40024y.putShort(i12);
                for (int i26 = 0; i26 < i12; i26++) {
                    h(objArr2[i26]);
                }
            } else if (i10 != 1) {
                int i27 = 251;
                if (i10 == 2) {
                    this.f40022w -= i11;
                    byteVector = this.f40024y;
                    i27 = 251 - i11;
                } else if (i10 == 3) {
                    byteVector = this.f40024y;
                    if (i13 < 64) {
                        byteVector.putByte(i13);
                    }
                } else if (i10 == 4) {
                    ByteVector byteVector2 = this.f40024y;
                    if (i13 < 64) {
                        byteVector2.putByte(i13 + 64);
                    } else {
                        byteVector2.putByte(247).putShort(i13);
                    }
                    h(objArr2[0]);
                }
                byteVector.putByte(i27).putShort(i13);
            } else {
                this.f40022w += i11;
                this.f40024y.putByte(i11 + 251).putShort(i13);
                for (int i28 = 0; i28 < i11; i28++) {
                    h(objArr[i28]);
                }
            }
            this.f40025z = this.f40019t.f39887b;
            this.f40023x++;
        }
        this.f40020u = Math.max(this.f40020u, i12);
        this.f40021v = Math.max(this.f40021v, this.f40022w);
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public final void visitIincInsn(int i10, int i11) {
        int i12;
        this.N = this.f40019t.f39887b;
        Label label = this.W;
        int i13 = this.T;
        if (label != null && i13 == 0) {
            label.f39929h.e(132, i10, null, null);
        }
        if (i13 != 2 && (i12 = i10 + 1) > this.f40021v) {
            this.f40021v = i12;
        }
        if (i10 <= 255 && i11 <= 127 && i11 >= -128) {
            this.f40019t.putByte(132).b(i10, i11);
            return;
        }
        ByteVector byteVectorPutByte = this.f40019t.putByte(196);
        byteVectorPutByte.c(132, i10);
        byteVectorPutByte.putShort(i11);
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public final void visitInsn(int i10) {
        ByteVector byteVector = this.f40019t;
        this.N = byteVector.f39887b;
        byteVector.putByte(i10);
        Label label = this.W;
        if (label != null) {
            if (this.T == 0) {
                label.f39929h.e(i10, 0, null, null);
            } else {
                int i11 = this.X + d.f39977i[i10];
                if (i11 > this.Y) {
                    this.Y = i11;
                }
                this.X = i11;
            }
            if ((i10 < 172 || i10 > 177) && i10 != 191) {
                return;
            }
            m();
        }
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public final AnnotationVisitor visitInsnAnnotation(int i10, TypePath typePath, String str, boolean z10) {
        ByteVector byteVector = new ByteVector();
        a.b((i10 & (-16776961)) | (this.N << 8), typePath, byteVector);
        byteVector.putShort(this.f40001a.newUTF8(str)).putShort(0);
        a aVar = new a(this.f40001a, true, byteVector, byteVector, byteVector.f39887b - 2);
        if (z10) {
            aVar.f39945g = this.O;
            this.O = aVar;
        } else {
            aVar.f39945g = this.P;
            this.P = aVar;
        }
        return aVar;
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public final void visitIntInsn(int i10, int i11) {
        this.N = this.f40019t.f39887b;
        Label label = this.W;
        if (label != null) {
            if (this.T == 0) {
                label.f39929h.e(i10, i11, null, null);
            } else if (i10 != 188) {
                int i12 = this.X + 1;
                if (i12 > this.Y) {
                    this.Y = i12;
                }
                this.X = i12;
            }
        }
        if (i10 == 17) {
            this.f40019t.c(i10, i11);
        } else {
            this.f40019t.b(i10, i11);
        }
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public final void visitInvokeDynamicInsn(String str, String str2, Handle handle, Object... objArr) {
        this.N = this.f40019t.f39887b;
        ClassWriter classWriter = this.f40001a;
        f fVarJ = classWriter.j(str, str2, handle, objArr);
        int argumentsAndReturnSizes = fVarJ.f39994c;
        Label label = this.W;
        if (label != null) {
            if (this.T == 0) {
                label.f39929h.e(186, 0, classWriter, fVarJ);
            } else {
                if (argumentsAndReturnSizes == 0) {
                    argumentsAndReturnSizes = Type.getArgumentsAndReturnSizes(str2);
                    fVarJ.f39994c = argumentsAndReturnSizes;
                }
                int i10 = (this.X - (argumentsAndReturnSizes >> 2)) + (argumentsAndReturnSizes & 3) + 1;
                if (i10 > this.Y) {
                    this.Y = i10;
                }
                this.X = i10;
            }
        }
        this.f40019t.c(186, fVarJ.f39992a);
        this.f40019t.putShort(0);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a7  */
    @Override // com.esotericsoftware.asm.MethodVisitor
    public final void visitJumpInsn(int i10, Label label) {
        this.N = this.f40019t.f39887b;
        Label label2 = this.W;
        Label label3 = null;
        if (label2 != null) {
            if (this.T == 0) {
                label2.f39929h.e(i10, 0, null, null);
                label.a().f39922a |= 16;
                e(0, label);
                if (i10 != 167) {
                    label3 = new Label();
                }
            } else if (i10 == 168) {
                int i11 = label.f39922a;
                if ((i11 & 512) == 0) {
                    label.f39922a = i11 | 512;
                    this.S++;
                }
                label2.f39922a |= 128;
                e(this.X + 1, label);
                label3 = new Label();
            } else {
                int i12 = this.X + d.f39977i[i10];
                this.X = i12;
                e(i12, label);
            }
        }
        if ((label.f39922a & 2) != 0) {
            int i13 = label.f39924c;
            ByteVector byteVector = this.f40019t;
            if (i13 - byteVector.f39887b < -32768) {
                int i14 = 200;
                if (i10 == 167) {
                    byteVector.putByte(i14);
                } else if (i10 == 168) {
                    i14 = 201;
                    byteVector.putByte(i14);
                } else {
                    if (label3 != null) {
                        label3.f39922a |= 16;
                    }
                    byteVector.putByte(i10 <= 166 ? ((i10 + 1) ^ 1) - 1 : i10 ^ 1);
                    this.f40019t.putShort(8);
                    this.f40019t.putByte(200);
                }
                ByteVector byteVector2 = this.f40019t;
                label.c(byteVector2, byteVector2.f39887b - 1, true);
            } else {
                this.f40019t.putByte(i10);
                ByteVector byteVector3 = this.f40019t;
                label.c(byteVector3, byteVector3.f39887b - 1, false);
            }
        } else {
            this.f40019t.putByte(i10);
            ByteVector byteVector4 = this.f40019t;
            label.c(byteVector4, byteVector4.f39887b - 1, false);
        }
        if (this.W != null) {
            if (label3 != null) {
                visitLabel(label3);
            }
            if (i10 == 167) {
                m();
            }
        }
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public final void visitLabel(Label label) {
        Label label2;
        boolean z10 = this.R;
        ByteVector byteVector = this.f40019t;
        this.R = z10 | label.d(byteVector.f39887b, byteVector.f39886a);
        int i10 = label.f39922a;
        if ((i10 & 1) != 0) {
            return;
        }
        int i11 = this.T;
        if (i11 == 0) {
            Label label3 = this.W;
            if (label3 != null) {
                if (label.f39924c == label3.f39924c) {
                    label3.f39922a = (i10 & 16) | label3.f39922a;
                    label.f39929h = label3.f39929h;
                    return;
                }
                e(0, label);
            }
            this.W = label;
            if (label.f39929h == null) {
                d dVar = new d();
                label.f39929h = dVar;
                dVar.f39978a = label;
            }
            label2 = this.V;
            if (label2 != null) {
                if (label.f39924c == label2.f39924c) {
                    label2.f39922a |= label.f39922a & 16;
                    label.f39929h = label2.f39929h;
                    this.W = label2;
                    return;
                }
                label2.f39930i = label;
            }
        } else {
            if (i11 != 1) {
                return;
            }
            Label label4 = this.W;
            if (label4 != null) {
                label4.f39928g = this.Y;
                e(this.X, label);
            }
            this.W = label;
            this.X = 0;
            this.Y = 0;
            label2 = this.V;
            if (label2 != null) {
                label2.f39930i = label;
            }
        }
        this.V = label;
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public final void visitLdcInsn(Object obj) {
        ByteVector byteVector;
        int i10;
        this.N = this.f40019t.f39887b;
        ClassWriter classWriter = this.f40001a;
        f fVarH = classWriter.h(obj);
        Label label = this.W;
        if (label != null) {
            if (this.T == 0) {
                label.f39929h.e(18, 0, classWriter, fVarH);
            } else {
                int i11 = fVarH.f39993b;
                int i12 = (i11 == 5 || i11 == 6) ? this.X + 2 : this.X + 1;
                if (i12 > this.Y) {
                    this.Y = i12;
                }
                this.X = i12;
            }
        }
        int i13 = fVarH.f39993b;
        int i14 = fVarH.f39992a;
        if (i13 == 5 || i13 == 6) {
            byteVector = this.f40019t;
            i10 = 20;
        } else if (i14 < 256) {
            this.f40019t.b(18, i14);
            return;
        } else {
            byteVector = this.f40019t;
            i10 = 19;
        }
        byteVector.c(i10, i14);
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public final void visitLineNumber(int i10, Label label) {
        if (this.M == null) {
            this.M = new ByteVector();
        }
        this.L++;
        this.M.putShort(label.f39924c);
        this.M.putShort(i10);
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public final void visitLocalVariable(String str, String str2, String str3, Label label, Label label2, int i10) {
        ClassWriter classWriter = this.f40001a;
        if (str3 != null) {
            if (this.K == null) {
                this.K = new ByteVector();
            }
            this.J++;
            this.K.putShort(label.f39924c).putShort(label2.f39924c - label.f39924c).putShort(classWriter.newUTF8(str)).putShort(classWriter.newUTF8(str3)).putShort(i10);
        }
        if (this.I == null) {
            this.I = new ByteVector();
        }
        this.H++;
        this.I.putShort(label.f39924c).putShort(label2.f39924c - label.f39924c).putShort(classWriter.newUTF8(str)).putShort(classWriter.newUTF8(str2)).putShort(i10);
        if (this.T != 2) {
            char cCharAt = str2.charAt(0);
            int i11 = i10 + ((cCharAt == 'J' || cCharAt == 'D') ? 2 : 1);
            if (i11 > this.f40021v) {
                this.f40021v = i11;
            }
        }
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public final AnnotationVisitor visitLocalVariableAnnotation(int i10, TypePath typePath, Label[] labelArr, Label[] labelArr2, int[] iArr, String str, boolean z10) {
        ByteVector byteVector = new ByteVector();
        byteVector.putByte(i10 >>> 24).putShort(labelArr.length);
        for (int i11 = 0; i11 < labelArr.length; i11++) {
            byteVector.putShort(labelArr[i11].f39924c).putShort(labelArr2[i11].f39924c - labelArr[i11].f39924c).putShort(iArr[i11]);
        }
        if (typePath == null) {
            byteVector.putByte(0);
        } else {
            byte[] bArr = typePath.f39937a;
            int i12 = typePath.f39938b;
            byteVector.putByteArray(bArr, i12, (bArr[i12] * 2) + 1);
        }
        byteVector.putShort(this.f40001a.newUTF8(str)).putShort(0);
        a aVar = new a(this.f40001a, true, byteVector, byteVector, byteVector.f39887b - 2);
        if (z10) {
            aVar.f39945g = this.O;
            this.O = aVar;
        } else {
            aVar.f39945g = this.P;
            this.P = aVar;
        }
        return aVar;
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public final void visitLookupSwitchInsn(Label label, int[] iArr, Label[] labelArr) {
        ByteVector byteVector = this.f40019t;
        int i10 = byteVector.f39887b;
        this.N = i10;
        byteVector.putByte(171);
        ByteVector byteVector2 = this.f40019t;
        byteVector2.putByteArray(null, 0, (4 - (byteVector2.f39887b % 4)) % 4);
        label.c(this.f40019t, i10, true);
        this.f40019t.putInt(labelArr.length);
        for (int i11 = 0; i11 < labelArr.length; i11++) {
            this.f40019t.putInt(iArr[i11]);
            labelArr[i11].c(this.f40019t, i10, true);
        }
        g(label, labelArr);
    }

    /* JADX WARN: Code duplicated, block: B:315:0x0630  */
    /* JADX WARN: Code duplicated, block: B:343:0x06cb  */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.esotericsoftware.asm.MethodVisitor
    public final void visitMaxs(int r29, int r30) {
        /*
            Method dump skipped, instruction units count: 1942
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.asm.g.visitMaxs(int, int):void");
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public final void visitMethodInsn(int i10, String str, String str2, String str3, boolean z10) {
        this.N = this.f40019t.f39887b;
        ClassWriter classWriter = this.f40001a;
        f fVarL = classWriter.l(str, str2, str3, z10);
        int argumentsAndReturnSizes = fVarL.f39994c;
        Label label = this.W;
        if (label != null) {
            if (this.T == 0) {
                label.f39929h.e(i10, 0, classWriter, fVarL);
            } else {
                if (argumentsAndReturnSizes == 0) {
                    argumentsAndReturnSizes = Type.getArgumentsAndReturnSizes(str3);
                    fVarL.f39994c = argumentsAndReturnSizes;
                }
                int i11 = i10 == 184 ? (this.X - (argumentsAndReturnSizes >> 2)) + (argumentsAndReturnSizes & 3) + 1 : (this.X - (argumentsAndReturnSizes >> 2)) + (argumentsAndReturnSizes & 3);
                if (i11 > this.Y) {
                    this.Y = i11;
                }
                this.X = i11;
            }
        }
        int i12 = fVarL.f39992a;
        if (i10 != 185) {
            this.f40019t.c(i10, i12);
            return;
        }
        if (argumentsAndReturnSizes == 0) {
            argumentsAndReturnSizes = Type.getArgumentsAndReturnSizes(str3);
            fVarL.f39994c = argumentsAndReturnSizes;
        }
        ByteVector byteVector = this.f40019t;
        byteVector.c(185, i12);
        byteVector.b(argumentsAndReturnSizes >> 2, 0);
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public final void visitMultiANewArrayInsn(String str, int i10) {
        this.N = this.f40019t.f39887b;
        ClassWriter classWriter = this.f40001a;
        f fVarI = classWriter.i(str);
        Label label = this.W;
        if (label != null) {
            if (this.T == 0) {
                label.f39929h.e(Opcodes.MULTIANEWARRAY, i10, classWriter, fVarI);
            } else {
                this.X = (1 - i10) + this.X;
            }
        }
        ByteVector byteVector = this.f40019t;
        byteVector.c(Opcodes.MULTIANEWARRAY, fVarI.f39992a);
        byteVector.putByte(i10);
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public final void visitParameter(String str, int i10) {
        if (this.G == null) {
            this.G = new ByteVector();
        }
        this.F++;
        this.G.putShort(str == null ? 0 : this.f40001a.newUTF8(str)).putShort(i10);
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public final AnnotationVisitor visitParameterAnnotation(int i10, String str, boolean z10) {
        ByteVector byteVector = new ByteVector();
        if ("Ljava/lang/Synthetic;".equals(str)) {
            this.f40017r = Math.max(this.f40017r, i10 + 1);
            return new a(this.f40001a, false, byteVector, null, 0);
        }
        byteVector.putShort(this.f40001a.newUTF8(str)).putShort(0);
        a aVar = new a(this.f40001a, true, byteVector, byteVector, 2);
        String str2 = this.f40005e;
        if (z10) {
            if (this.f40015p == null) {
                this.f40015p = new a[Type.getArgumentTypes(str2).length];
            }
            a[] aVarArr = this.f40015p;
            aVar.f39945g = aVarArr[i10];
            aVarArr[i10] = aVar;
        } else {
            if (this.f40016q == null) {
                this.f40016q = new a[Type.getArgumentTypes(str2).length];
            }
            a[] aVarArr2 = this.f40016q;
            aVar.f39945g = aVarArr2[i10];
            aVarArr2[i10] = aVar;
        }
        return aVar;
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public final void visitTableSwitchInsn(int i10, int i11, Label label, Label... labelArr) {
        ByteVector byteVector = this.f40019t;
        int i12 = byteVector.f39887b;
        this.N = i12;
        byteVector.putByte(170);
        ByteVector byteVector2 = this.f40019t;
        byteVector2.putByteArray(null, 0, (4 - (byteVector2.f39887b % 4)) % 4);
        label.c(this.f40019t, i12, true);
        this.f40019t.putInt(i10).putInt(i11);
        for (Label label2 : labelArr) {
            label2.c(this.f40019t, i12, true);
        }
        g(label, labelArr);
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public final AnnotationVisitor visitTryCatchAnnotation(int i10, TypePath typePath, String str, boolean z10) {
        ByteVector byteVector = new ByteVector();
        a.b(i10, typePath, byteVector);
        byteVector.putShort(this.f40001a.newUTF8(str)).putShort(0);
        a aVar = new a(this.f40001a, true, byteVector, byteVector, byteVector.f39887b - 2);
        if (z10) {
            aVar.f39945g = this.O;
            this.O = aVar;
        } else {
            aVar.f39945g = this.P;
            this.P = aVar;
        }
        return aVar;
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public final void visitTryCatchBlock(Label label, Label label2, Label label3, String str) {
        this.C++;
        e eVar = new e();
        eVar.f39986a = label;
        eVar.f39987b = label2;
        eVar.f39988c = label3;
        eVar.f39989d = str;
        eVar.f39990e = str != null ? this.f40001a.newClass(str) : 0;
        e eVar2 = this.E;
        if (eVar2 == null) {
            this.D = eVar;
        } else {
            eVar2.f39991f = eVar;
        }
        this.E = eVar;
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public final AnnotationVisitor visitTypeAnnotation(int i10, TypePath typePath, String str, boolean z10) {
        ByteVector byteVector = new ByteVector();
        a.b(i10, typePath, byteVector);
        byteVector.putShort(this.f40001a.newUTF8(str)).putShort(0);
        a aVar = new a(this.f40001a, true, byteVector, byteVector, byteVector.f39887b - 2);
        if (z10) {
            aVar.f39945g = this.f40013n;
            this.f40013n = aVar;
        } else {
            aVar.f39945g = this.f40014o;
            this.f40014o = aVar;
        }
        return aVar;
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public final void visitTypeInsn(int i10, String str) {
        this.N = this.f40019t.f39887b;
        ClassWriter classWriter = this.f40001a;
        f fVarI = classWriter.i(str);
        Label label = this.W;
        if (label != null) {
            if (this.T == 0) {
                label.f39929h.e(i10, this.f40019t.f39887b, classWriter, fVarI);
            } else if (i10 == 187) {
                int i11 = this.X + 1;
                if (i11 > this.Y) {
                    this.Y = i11;
                }
                this.X = i11;
            }
        }
        this.f40019t.c(i10, fVarI.f39992a);
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public final void visitVarInsn(int i10, int i11) {
        this.N = this.f40019t.f39887b;
        Label label = this.W;
        int i12 = this.T;
        if (label != null) {
            if (i12 == 0) {
                label.f39929h.e(i10, i11, null, null);
            } else if (i10 == 169) {
                label.f39922a |= 256;
                label.f39927f = this.X;
                m();
            } else {
                int i13 = this.X + d.f39977i[i10];
                if (i13 > this.Y) {
                    this.Y = i13;
                }
                this.X = i13;
            }
        }
        if (i12 != 2) {
            int i14 = (i10 == 22 || i10 == 24 || i10 == 55 || i10 == 57) ? i11 + 2 : i11 + 1;
            if (i14 > this.f40021v) {
                this.f40021v = i14;
            }
        }
        if (i11 >= 4 || i10 == 169) {
            ByteVector byteVector = this.f40019t;
            if (i11 >= 256) {
                byteVector.putByte(196).c(i10, i11);
            } else {
                byteVector.b(i10, i11);
            }
        } else {
            this.f40019t.putByte((i10 < 54 ? ((i10 - 21) << 2) + 26 : ((i10 - 54) << 2) + 59) + i11);
        }
        if (i10 < 54 || i12 != 0 || this.C <= 0) {
            return;
        }
        visitLabel(new Label());
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public final void visitCode() {
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public final void visitEnd() {
    }
}
