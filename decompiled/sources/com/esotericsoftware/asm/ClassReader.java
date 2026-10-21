package com.esotericsoftware.asm;

import androidx.camera.camera2.internal.compat.u;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import com.fasterxml.jackson.core.JsonPointer;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes9.dex */
public class ClassReader {
    public static final int EXPAND_FRAMES = 8;
    public static final int SKIP_CODE = 1;
    public static final int SKIP_DEBUG = 2;
    public static final int SKIP_FRAMES = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f39888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f39889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f39890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f39891d;
    public final int header;

    public ClassReader(InputStream inputStream) throws IOException {
        this(h(inputStream, false));
    }

    public static byte[] h(InputStream inputStream, boolean z10) throws IOException {
        if (inputStream == null) {
            throw new IOException("Class not found");
        }
        try {
            byte[] bArr = new byte[inputStream.available()];
            int i10 = 0;
            while (true) {
                int i11 = inputStream.read(bArr, i10, bArr.length - i10);
                if (i11 == -1) {
                    if (i10 < bArr.length) {
                        byte[] bArr2 = new byte[i10];
                        System.arraycopy(bArr, 0, bArr2, 0, i10);
                        bArr = bArr2;
                    }
                    return bArr;
                }
                i10 += i11;
                if (i10 == bArr.length) {
                    int i12 = inputStream.read();
                    if (i12 < 0) {
                        return bArr;
                    }
                    byte[] bArr3 = new byte[bArr.length + 1000];
                    System.arraycopy(bArr, 0, bArr3, 0, i10);
                    int i13 = i10 + 1;
                    bArr3[i10] = (byte) i12;
                    i10 = i13;
                    bArr = bArr3;
                }
            }
        } finally {
            if (z10) {
                inputStream.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:98:0x01e5  */
    public final int a(int i10, char[] cArr, String str, AnnotationVisitor annotationVisitor) {
        Object type;
        Object sh2;
        int i11 = 0;
        if (annotationVisitor == null) {
            int i12 = this.f39889b[i10] & 255;
            if (i12 == 64) {
                return b(i10 + 3, cArr, true, null);
            }
            if (i12 != 91) {
                return i12 != 101 ? i10 + 3 : i10 + 5;
            }
            return b(i10 + 1, cArr, false, null);
        }
        int i13 = i10 + 1;
        int i14 = this.f39889b[i10] & 255;
        if (i14 == 64) {
            return b(i10 + 3, cArr, true, annotationVisitor.visitAnnotation(str, readUTF8(i13, cArr)));
        }
        if (i14 != 70) {
            int[] iArr = this.f39888a;
            if (i14 != 83) {
                if (i14 == 99) {
                    type = Type.getType(readUTF8(i13, cArr));
                } else {
                    if (i14 == 101) {
                        annotationVisitor.visitEnum(str, readUTF8(i13, cArr), readUTF8(i10 + 3, cArr));
                        return i10 + 5;
                    }
                    if (i14 == 115) {
                        type = readUTF8(i13, cArr);
                    } else if (i14 == 73 || i14 == 74) {
                        type = readConst(readUnsignedShort(i13), cArr);
                    } else if (i14 == 90) {
                        type = readInt(iArr[readUnsignedShort(i13)]) == 0 ? Boolean.FALSE : Boolean.TRUE;
                    } else {
                        if (i14 == 91) {
                            int unsignedShort = readUnsignedShort(i13);
                            int i15 = i10 + 3;
                            if (unsignedShort == 0) {
                                return b(i10 + 1, cArr, false, annotationVisitor.visitArray(str));
                            }
                            int i16 = i10 + 4;
                            int i17 = this.f39889b[i15] & 255;
                            if (i17 == 70) {
                                float[] fArr = new float[unsignedShort];
                                while (i11 < unsignedShort) {
                                    fArr[i11] = Float.intBitsToFloat(readInt(iArr[readUnsignedShort(i16)]));
                                    i16 += 3;
                                    i11++;
                                }
                                annotationVisitor.visit(str, fArr);
                            } else if (i17 == 83) {
                                short[] sArr = new short[unsignedShort];
                                while (i11 < unsignedShort) {
                                    sArr[i11] = (short) readInt(iArr[readUnsignedShort(i16)]);
                                    i16 += 3;
                                    i11++;
                                }
                                annotationVisitor.visit(str, sArr);
                            } else if (i17 == 90) {
                                boolean[] zArr = new boolean[unsignedShort];
                                for (int i18 = 0; i18 < unsignedShort; i18++) {
                                    zArr[i18] = readInt(iArr[readUnsignedShort(i16)]) != 0;
                                    i16 += 3;
                                }
                                annotationVisitor.visit(str, zArr);
                            } else if (i17 == 73) {
                                int[] iArr2 = new int[unsignedShort];
                                while (i11 < unsignedShort) {
                                    iArr2[i11] = readInt(iArr[readUnsignedShort(i16)]);
                                    i16 += 3;
                                    i11++;
                                }
                                annotationVisitor.visit(str, iArr2);
                            } else if (i17 != 74) {
                                switch (i17) {
                                    case 66:
                                        byte[] bArr = new byte[unsignedShort];
                                        while (i11 < unsignedShort) {
                                            bArr[i11] = (byte) readInt(iArr[readUnsignedShort(i16)]);
                                            i16 += 3;
                                            i11++;
                                        }
                                        annotationVisitor.visit(str, bArr);
                                        break;
                                    case 67:
                                        char[] cArr2 = new char[unsignedShort];
                                        while (i11 < unsignedShort) {
                                            cArr2[i11] = (char) readInt(iArr[readUnsignedShort(i16)]);
                                            i16 += 3;
                                            i11++;
                                        }
                                        annotationVisitor.visit(str, cArr2);
                                        break;
                                    case 68:
                                        double[] dArr = new double[unsignedShort];
                                        while (i11 < unsignedShort) {
                                            dArr[i11] = Double.longBitsToDouble(readLong(iArr[readUnsignedShort(i16)]));
                                            i16 += 3;
                                            i11++;
                                        }
                                        annotationVisitor.visit(str, dArr);
                                        break;
                                    default:
                                        return b(i10 + 1, cArr, false, annotationVisitor.visitArray(str));
                                }
                            } else {
                                long[] jArr = new long[unsignedShort];
                                while (i11 < unsignedShort) {
                                    jArr[i11] = readLong(iArr[readUnsignedShort(i16)]);
                                    i16 += 3;
                                    i11++;
                                }
                                annotationVisitor.visit(str, jArr);
                            }
                            return i16 - 1;
                        }
                        switch (i14) {
                            case 66:
                                sh2 = new Byte((byte) readInt(iArr[readUnsignedShort(i13)]));
                                break;
                            case 67:
                                sh2 = new Character((char) readInt(iArr[readUnsignedShort(i13)]));
                                break;
                            case 68:
                                type = readConst(readUnsignedShort(i13), cArr);
                                break;
                            default:
                                return i13;
                        }
                    }
                }
                annotationVisitor.visit(str, type);
            } else {
                sh2 = new Short((short) readInt(iArr[readUnsignedShort(i13)]));
            }
            annotationVisitor.visit(str, sh2);
        } else {
            type = readConst(readUnsignedShort(i13), cArr);
            annotationVisitor.visit(str, type);
        }
        return i10 + 3;
    }

    public void accept(ClassVisitor classVisitor, int i10) {
        accept(classVisitor, new Attribute[0], i10);
    }

    public final int b(int i10, char[] cArr, boolean z10, AnnotationVisitor annotationVisitor) {
        int unsignedShort = readUnsignedShort(i10);
        int iA = i10 + 2;
        if (z10) {
            while (unsignedShort > 0) {
                iA = a(iA + 2, cArr, readUTF8(iA, cArr), annotationVisitor);
                unsignedShort--;
            }
        } else {
            while (unsignedShort > 0) {
                iA = a(iA, cArr, null, annotationVisitor);
                unsignedShort--;
            }
        }
        if (annotationVisitor != null) {
            annotationVisitor.visitEnd();
        }
        return iA;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0075  */
    public final int c(b bVar, int i10) {
        int i11;
        int i12;
        int i13 = readInt(i10);
        int i14 = i13 >>> 24;
        if (i14 == 0 || i14 == 1) {
            i11 = i13 & SupportMenu.CATEGORY_MASK;
            i12 = i10 + 2;
        } else {
            int i15 = ViewCompat.MEASURED_STATE_MASK;
            if (i14 != 64 && i14 != 65) {
                switch (i14) {
                    case 19:
                    case 20:
                    case 21:
                        i11 = i13 & ViewCompat.MEASURED_STATE_MASK;
                        i12 = i10 + 1;
                        break;
                    case 22:
                        i11 = i13 & SupportMenu.CATEGORY_MASK;
                        i12 = i10 + 2;
                        break;
                    default:
                        switch (i14) {
                            case 71:
                            case 72:
                            case 73:
                            case 74:
                            case 75:
                                i11 = i13 & (-16776961);
                                i12 = i10 + 4;
                                break;
                            default:
                                if (i14 < 67) {
                                    i15 = InputDeviceCompat.SOURCE_ANY;
                                }
                                i11 = i13 & i15;
                                i12 = i10 + 3;
                                break;
                        }
                        break;
                }
            } else {
                i11 = i13 & ViewCompat.MEASURED_STATE_MASK;
                int unsignedShort = readUnsignedShort(i10 + 1);
                bVar.f39958l = new Label[unsignedShort];
                bVar.m = new Label[unsignedShort];
                bVar.f39959n = new int[unsignedShort];
                i12 = i10 + 3;
                for (int i16 = 0; i16 < unsignedShort; i16++) {
                    int unsignedShort2 = readUnsignedShort(i12);
                    int unsignedShort3 = readUnsignedShort(i12 + 2);
                    bVar.f39958l[i16] = readLabel(unsignedShort2, bVar.f39954h);
                    bVar.m[i16] = readLabel(unsignedShort2 + unsignedShort3, bVar.f39954h);
                    bVar.f39959n[i16] = readUnsignedShort(i12 + 4);
                    i12 += 6;
                }
            }
        }
        int i17 = readByte(i12);
        bVar.f39955i = i11;
        bVar.f39956j = i17 == 0 ? null : new TypePath(this.f39889b, i12);
        return (i17 * 2) + i12 + 1;
    }

    public final int d(Object[] objArr, int i10, int i11, char[] cArr, Label[] labelArr) {
        int i12 = i11 + 1;
        switch (this.f39889b[i11] & 255) {
            case 0:
                objArr[i10] = Opcodes.TOP;
                return i12;
            case 1:
                objArr[i10] = Opcodes.INTEGER;
                return i12;
            case 2:
                objArr[i10] = Opcodes.FLOAT;
                return i12;
            case 3:
                objArr[i10] = Opcodes.DOUBLE;
                return i12;
            case 4:
                objArr[i10] = Opcodes.LONG;
                return i12;
            case 5:
                objArr[i10] = Opcodes.NULL;
                return i12;
            case 6:
                objArr[i10] = Opcodes.UNINITIALIZED_THIS;
                return i12;
            case 7:
                objArr[i10] = readClass(i12, cArr);
                break;
            default:
                objArr[i10] = readLabel(readUnsignedShort(i12), labelArr);
                break;
        }
        return i11 + 3;
    }

    public final Attribute e(Attribute[] attributeArr, String str, int i10, int i11, char[] cArr) {
        for (int i12 = 0; i12 < attributeArr.length; i12++) {
            if (attributeArr[i12].type.equals(str)) {
                return attributeArr[i12].read(this, i10, i11, cArr, -1, null);
            }
        }
        return new Attribute(str).read(this, i10, i11, null, -1, null);
    }

    public final String f(int i10, char[] cArr, int i11) {
        int i12;
        int i13 = i11 + i10;
        byte[] bArr = this.f39889b;
        int i14 = 0;
        char c10 = 0;
        char c11 = 0;
        while (i10 < i13) {
            int i15 = i10 + 1;
            byte b10 = bArr[i10];
            if (c10 == 0) {
                int i16 = b10 & 255;
                if (i16 < 128) {
                    cArr[i14] = (char) i16;
                    i14++;
                } else if (i16 >= 224 || i16 <= 191) {
                    c11 = (char) (b10 & 15);
                    c10 = 2;
                } else {
                    i12 = b10 & 31;
                    c11 = (char) i12;
                    c10 = 1;
                }
            } else if (c10 == 1) {
                cArr[i14] = (char) ((b10 & 63) | (c11 << 6));
                i14++;
                c10 = 0;
            } else if (c10 == 2) {
                i12 = (b10 & 63) | (c11 << 6);
                c11 = (char) i12;
                c10 = 1;
            }
            i10 = i15;
        }
        return new String(cArr, 0, i14);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:145:0x03dc. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:260:0x06a4. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [int] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r46v0, types: [com.esotericsoftware.asm.ClassReader] */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    public final void g(MethodVisitor methodVisitor, b bVar, int i10) {
        Label[] labelArr;
        b bVar2;
        ?? r1;
        char[] cArr;
        int i11;
        MethodVisitor methodVisitor2;
        char[] cArr2;
        b bVar3;
        int[] iArr;
        String utf8;
        int i12;
        char c10;
        MethodVisitor methodVisitor3;
        int i13;
        int i14;
        int i15;
        int i16;
        int[] iArr2;
        int i17;
        byte b10;
        int i18;
        int i19;
        int i20;
        int unsignedShort;
        Label[] labelArr2;
        int i21;
        char c11;
        char c12;
        int i22;
        Label[] labelArr3;
        int unsignedShort2;
        int i23;
        int i24;
        int[] iArr3;
        int[] iArr4;
        int i25;
        String str;
        int[] iArr5;
        Label[] labelArr4;
        int i26;
        int i27;
        int[] iArr6;
        Attribute attribute;
        MethodVisitor methodVisitor4 = methodVisitor;
        b bVar4 = bVar;
        byte[] bArr = this.f39889b;
        char[] cArr3 = bVar4.f39949c;
        int unsignedShort3 = readUnsignedShort(i10);
        int unsignedShort4 = readUnsignedShort(i10 + 2);
        int i28 = readInt(i10 + 4);
        int i29 = i10 + 8;
        int i30 = i29 + i28;
        Label[] labelArr5 = new Label[i28 + 2];
        bVar4.f39954h = labelArr5;
        readLabel(i28 + 1, labelArr5);
        int i31 = i29;
        while (i31 < i30) {
            int i32 = i31 - i29;
            switch (ClassWriter.N[bArr[i31] & 255]) {
                case 0:
                case 4:
                    i31++;
                    break;
                case 1:
                case 3:
                case 11:
                    i31 += 2;
                    break;
                case 2:
                case 5:
                case 6:
                case 12:
                case 13:
                    i31 += 3;
                    break;
                case 7:
                case 8:
                    i31 += 5;
                    break;
                case 9:
                    readLabel(readShort(i31 + 1) + i32, labelArr5);
                    i31 += 3;
                    break;
                case 10:
                    readLabel(readInt(i31 + 1) + i32, labelArr5);
                    i31 += 5;
                    break;
                case 14:
                    int i33 = (i31 + 4) - (i32 & 3);
                    readLabel(readInt(i33) + i32, labelArr5);
                    for (int i34 = (readInt(i33 + 8) - readInt(i33 + 4)) + 1; i34 > 0; i34--) {
                        readLabel(readInt(i33 + 12) + i32, labelArr5);
                        i33 += 4;
                    }
                    i31 = i33 + 12;
                    break;
                case 15:
                    int i35 = (i31 + 4) - (i32 & 3);
                    readLabel(readInt(i35) + i32, labelArr5);
                    for (int i36 = readInt(i35 + 4); i36 > 0; i36--) {
                        readLabel(readInt(i35 + 12) + i32, labelArr5);
                        i35 += 8;
                    }
                    i31 = i35 + 8;
                    break;
                case 16:
                default:
                    break;
                case 17:
                    i31 = (bArr[i31 + 1] & 255) == 132 ? i31 + 6 : i31 + 4;
                    break;
            }
        }
        int unsignedShort5 = readUnsignedShort(i31);
        while (true) {
            int[] iArr7 = this.f39888a;
            if (unsignedShort5 > 0) {
                Label label = readLabel(readUnsignedShort(i31 + 2), labelArr5);
                Label label2 = readLabel(readUnsignedShort(i31 + 4), labelArr5);
                int i37 = i30;
                Label label3 = readLabel(readUnsignedShort(i31 + 6), labelArr5);
                i31 += 8;
                methodVisitor4.visitTryCatchBlock(label, label2, label3, readUTF8(iArr7[readUnsignedShort(i31)], cArr3));
                unsignedShort5--;
                i30 = i37;
            } else {
                int i38 = i30;
                int i39 = i31 + 2;
                boolean z10 = (bVar4.f39948b & 8) != 0;
                int i40 = i39;
                int unsignedShort6 = readUnsignedShort(i39);
                int[] iArrI = null;
                int[] iArr8 = null;
                int i41 = 0;
                boolean z11 = true;
                int i42 = 0;
                int i43 = 0;
                int i44 = 0;
                Attribute attribute2 = null;
                int unsignedShort7 = 0;
                int unsignedShort8 = -1;
                int unsignedShort9 = -1;
                while (unsignedShort6 > 0) {
                    String utf9 = readUTF8(i40 + 2, cArr3);
                    if ("LocalVariableTable".equals(utf9)) {
                        if ((bVar4.f39948b & 2) == 0) {
                            int i45 = i40 + 8;
                            int unsignedShort10 = readUnsignedShort(i45);
                            int i46 = i40;
                            while (unsignedShort10 > 0) {
                                int i47 = i46 + 10;
                                int[] iArr9 = iArrI;
                                int unsignedShort11 = readUnsignedShort(i47);
                                int[] iArr10 = iArr8;
                                if (labelArr5[unsignedShort11] == null) {
                                    readLabel(unsignedShort11, labelArr5).f39922a |= 1;
                                }
                                int unsignedShort12 = readUnsignedShort(i46 + 12) + unsignedShort11;
                                if (labelArr5[unsignedShort12] == null) {
                                    readLabel(unsignedShort12, labelArr5).f39922a |= 1;
                                }
                                unsignedShort10--;
                                i46 = i47;
                                i45 = i45;
                                iArrI = iArr9;
                                iArr8 = iArr10;
                            }
                            iArr7 = iArr7;
                            labelArr5 = labelArr5;
                            i38 = i38;
                            i41 = i45;
                        } else {
                            iArr3 = iArrI;
                            iArr4 = iArr8;
                        }
                        i40 = readInt(i40 + 4) + 6 + i40;
                        unsignedShort6--;
                        methodVisitor4 = methodVisitor;
                        iArr7 = iArr7;
                        labelArr5 = labelArr5;
                        i38 = i38;
                    } else {
                        iArr3 = iArrI;
                        iArr4 = iArr8;
                        if ("LocalVariableTypeTable".equals(utf9)) {
                            i44 = i40 + 8;
                        } else if (!"LineNumberTable".equals(utf9)) {
                            if ("RuntimeVisibleTypeAnnotations".equals(utf9)) {
                                int[] iArrI2 = i(methodVisitor4, bVar4, i40 + 8, true);
                                unsignedShort8 = (iArrI2.length == 0 || readByte(iArrI2[0]) < 67) ? -1 : readUnsignedShort(iArrI2[0] + 1);
                                iArr7 = iArr7;
                                labelArr5 = labelArr5;
                                i38 = i38;
                                iArr8 = iArrI2;
                                iArrI = iArr3;
                            } else if ("RuntimeInvisibleTypeAnnotations".equals(utf9)) {
                                iArrI = i(methodVisitor4, bVar4, i40 + 8, false);
                                unsignedShort9 = (iArrI.length == 0 || readByte(iArrI[0]) < 67) ? -1 : readUnsignedShort(iArrI[0] + 1);
                                iArr8 = iArr4;
                            } else if ("StackMapTable".equals(utf9)) {
                                if ((bVar4.f39948b & 4) == 0) {
                                    i42 = i40 + 10;
                                    i43 = readInt(i40 + 4);
                                    unsignedShort7 = readUnsignedShort(i40 + 8);
                                }
                            } else if (!"StackMap".equals(utf9)) {
                                int i48 = 0;
                                Attribute attribute3 = attribute2;
                                while (true) {
                                    Attribute[] attributeArr = bVar4.f39947a;
                                    if (i48 < attributeArr.length) {
                                        if (attributeArr[i48].type.equals(utf9)) {
                                            i26 = i41;
                                            attribute = attribute3;
                                            i25 = i48;
                                            str = utf9;
                                            iArr6 = iArr4;
                                            iArr5 = iArr7;
                                            labelArr4 = labelArr5;
                                            i27 = i38;
                                            attribute3 = bVar4.f39947a[i48].read(this, i40 + 8, readInt(i40 + 4), cArr3, i10, labelArr4);
                                            if (attribute3 != null) {
                                                attribute3.f39885b = attribute;
                                            }
                                            i48 = i25 + 1;
                                            iArr7 = iArr5;
                                            labelArr5 = labelArr4;
                                            utf9 = str;
                                            i41 = i26;
                                            iArr4 = iArr6;
                                            i38 = i27;
                                        } else {
                                            i25 = i48;
                                            str = utf9;
                                            iArr5 = iArr7;
                                            labelArr4 = labelArr5;
                                            i26 = i41;
                                            i27 = i38;
                                            iArr6 = iArr4;
                                            attribute = attribute3;
                                        }
                                        attribute3 = attribute;
                                        i48 = i25 + 1;
                                        iArr7 = iArr5;
                                        labelArr5 = labelArr4;
                                        utf9 = str;
                                        i41 = i26;
                                        iArr4 = iArr6;
                                        i38 = i27;
                                    } else {
                                        iArr7 = iArr7;
                                        labelArr5 = labelArr5;
                                        i38 = i38;
                                        attribute2 = attribute3;
                                        iArrI = iArr3;
                                        i41 = i41;
                                        iArr8 = iArr4;
                                    }
                                }
                            } else if ((bVar4.f39948b & 4) == 0) {
                                i42 = i40 + 10;
                                i43 = readInt(i40 + 4);
                                unsignedShort7 = readUnsignedShort(i40 + 8);
                                z11 = false;
                            }
                            i40 = readInt(i40 + 4) + 6 + i40;
                            unsignedShort6--;
                            methodVisitor4 = methodVisitor;
                            iArr7 = iArr7;
                            labelArr5 = labelArr5;
                            i38 = i38;
                        } else if ((bVar4.f39948b & 2) == 0) {
                            int i49 = i40;
                            for (int unsignedShort13 = readUnsignedShort(i40 + 8); unsignedShort13 > 0; unsignedShort13--) {
                                int unsignedShort14 = readUnsignedShort(i49 + 10);
                                if (labelArr5[unsignedShort14] == null) {
                                    readLabel(unsignedShort14, labelArr5).f39922a |= 1;
                                }
                                Label label4 = labelArr5[unsignedShort14];
                                while (label4.f39923b > 0) {
                                    if (label4.f39932k == null) {
                                        label4.f39932k = new Label();
                                    }
                                    label4 = label4.f39932k;
                                }
                                label4.f39923b = readUnsignedShort(i49 + 12);
                                i49 += 4;
                            }
                        }
                    }
                    iArrI = iArr3;
                    iArr8 = iArr4;
                    i40 = readInt(i40 + 4) + 6 + i40;
                    unsignedShort6--;
                    methodVisitor4 = methodVisitor;
                    iArr7 = iArr7;
                    labelArr5 = labelArr5;
                    i38 = i38;
                }
                int[] iArr11 = iArrI;
                int[] iArr12 = iArr8;
                int[] iArr13 = iArr7;
                Label[] labelArr6 = labelArr5;
                int i50 = i41;
                int i51 = i38;
                if (i42 != 0) {
                    bVar4.f39957k = -1;
                    bVar4.f39960o = 0;
                    bVar4.f39961p = 0;
                    bVar4.f39962q = 0;
                    bVar4.f39964s = 0;
                    Object[] objArr = new Object[unsignedShort4];
                    bVar4.f39963r = objArr;
                    bVar4.f39965t = new Object[unsignedShort3];
                    if (z10) {
                        String str2 = bVar4.f39953g;
                        if ((bVar4.f39951e & 8) != 0) {
                            i23 = 0;
                        } else if ("<init>".equals(bVar4.f39952f)) {
                            objArr[0] = Opcodes.UNINITIALIZED_THIS;
                            i23 = 1;
                        } else {
                            objArr[0] = readClass(this.header + 2, bVar4.f39949c);
                            i23 = 1;
                        }
                        int i52 = i23;
                        int i53 = 1;
                        while (true) {
                            int i54 = i53 + 1;
                            char cCharAt = str2.charAt(i53);
                            if (cCharAt == 'F') {
                                i24 = i52 + 1;
                                objArr[i52] = Opcodes.FLOAT;
                            } else if (cCharAt == 'L') {
                                int i55 = i54;
                                while (str2.charAt(i55) != ';') {
                                    i55++;
                                }
                                objArr[i52] = str2.substring(i54, i55);
                                i52++;
                                i53 = i55 + 1;
                            } else if (cCharAt == 'S' || cCharAt == 'I') {
                                i24 = i52 + 1;
                                objArr[i52] = Opcodes.INTEGER;
                            } else if (cCharAt != 'J') {
                                if (cCharAt != 'Z') {
                                    if (cCharAt != '[') {
                                        switch (cCharAt) {
                                            case 'D':
                                                objArr[i52] = Opcodes.DOUBLE;
                                                i52++;
                                                i53 = i54;
                                                break;
                                        }
                                        bVar4.f39961p = i52;
                                    } else {
                                        while (str2.charAt(i54) == '[') {
                                            i54++;
                                        }
                                        if (str2.charAt(i54) == 'L') {
                                            do {
                                                i54++;
                                            } while (str2.charAt(i54) != ';');
                                        }
                                        int i56 = i54 + 1;
                                        objArr[i52] = str2.substring(i53, i56);
                                        i53 = i56;
                                        i52++;
                                    }
                                }
                                i24 = i52 + 1;
                                objArr[i52] = Opcodes.INTEGER;
                            } else {
                                i24 = i52 + 1;
                                objArr[i52] = Opcodes.LONG;
                            }
                            i52 = i24;
                            i53 = i54;
                        }
                    }
                    int i57 = i42;
                    while (i57 < (i42 + i43) - 2) {
                        if (bArr[i57] != 8 || (unsignedShort2 = readUnsignedShort(i57 + 1)) < 0 || unsignedShort2 >= i28) {
                            labelArr3 = labelArr6;
                        } else {
                            labelArr3 = labelArr6;
                            if ((bArr[i29 + unsignedShort2] & 255) == 187) {
                                readLabel(unsignedShort2, labelArr3);
                            }
                        }
                        i57++;
                        labelArr6 = labelArr3;
                    }
                    labelArr = labelArr6;
                    bVar2 = bVar4;
                } else {
                    labelArr = labelArr6;
                    bVar2 = null;
                }
                b bVar5 = bVar2;
                int i58 = i29;
                int i59 = 0;
                int i60 = 0;
                while (true) {
                    int i61 = i51;
                    if (i58 >= i61) {
                        int i62 = i28;
                        int i63 = unsignedShort4;
                        int i64 = unsignedShort3;
                        int[] iArr14 = iArr11;
                        int i65 = 0;
                        MethodVisitor methodVisitor5 = methodVisitor;
                        Label label5 = labelArr[i62];
                        if (label5 != null) {
                            methodVisitor5.visitLabel(label5);
                        }
                        if ((bVar4.f39948b & 2) == 0 && i50 != 0) {
                            int i66 = i44;
                            if (i66 != 0) {
                                int i67 = i66 + 2;
                                int unsignedShort15 = readUnsignedShort(i66) * 3;
                                int[] iArr15 = new int[unsignedShort15];
                                int i68 = i67;
                                while (unsignedShort15 > 0) {
                                    iArr15[unsignedShort15 - 1] = i68 + 6;
                                    iArr15[unsignedShort15 - 2] = readUnsignedShort(i68 + 8);
                                    unsignedShort15 -= 3;
                                    iArr15[unsignedShort15] = readUnsignedShort(i68);
                                    i68 += 10;
                                }
                                iArr = iArr15;
                            } else {
                                iArr = null;
                            }
                            int i69 = i50 + 2;
                            int unsignedShort16 = readUnsignedShort(i50);
                            while (unsignedShort16 > 0) {
                                int unsignedShort17 = readUnsignedShort(i69);
                                int unsignedShort18 = readUnsignedShort(i69 + 2);
                                int unsignedShort19 = readUnsignedShort(i69 + 8);
                                if (iArr == null) {
                                    utf8 = null;
                                    break;
                                    break;
                                }
                                int i70 = 0;
                                while (true) {
                                    if (i70 >= iArr.length) {
                                        utf8 = null;
                                        break;
                                    } else {
                                        if (iArr[i70] == unsignedShort17 && iArr[i70 + 1] == unsignedShort19) {
                                            utf8 = readUTF8(iArr[i70 + 2], cArr3);
                                            break;
                                        }
                                        i70 += 3;
                                    }
                                }
                                methodVisitor.visitLocalVariable(readUTF8(i69 + 4, cArr3), readUTF8(i69 + 6, cArr3), utf8, labelArr[unsignedShort17], labelArr[unsignedShort17 + unsignedShort18], unsignedShort19);
                                i69 += 10;
                                unsignedShort16--;
                                labelArr = labelArr;
                            }
                        }
                        int[] iArr16 = iArr12;
                        int i71 = 32;
                        if (iArr16 != null) {
                            int i72 = 0;
                            while (i72 < iArr16.length) {
                                if ((readByte(iArr16[i72]) >> 1) == i71) {
                                    int iC = c(bVar4, iArr16[i72]);
                                    int i73 = iC + 2;
                                    int i74 = bVar4.f39955i;
                                    TypePath typePath = bVar4.f39956j;
                                    Label[] labelArr7 = bVar4.f39958l;
                                    Label[] labelArr8 = bVar4.m;
                                    int[] iArr17 = bVar4.f39959n;
                                    String utf10 = readUTF8(iC, cArr3);
                                    bVar3 = bVar4;
                                    methodVisitor2 = methodVisitor;
                                    i11 = i65;
                                    cArr2 = cArr3;
                                    b(i73, cArr2, true, methodVisitor.visitLocalVariableAnnotation(i74, typePath, labelArr7, labelArr8, iArr17, utf10, true));
                                } else {
                                    i11 = i65;
                                    methodVisitor2 = methodVisitor5;
                                    cArr2 = cArr3;
                                    bVar3 = bVar4;
                                }
                                i72++;
                                iArr14 = iArr14;
                                methodVisitor5 = methodVisitor2;
                                bVar4 = bVar3;
                                i63 = i63;
                                i64 = i64;
                                cArr3 = cArr2;
                                i65 = i11;
                                iArr16 = iArr16;
                                i71 = 32;
                            }
                        }
                        int[] iArr18 = iArr14;
                        int i75 = i65;
                        MethodVisitor methodVisitor6 = methodVisitor5;
                        char[] cArr4 = cArr3;
                        b bVar6 = bVar4;
                        int i76 = i64;
                        int i77 = i63;
                        ?? r14 = 1;
                        if (iArr18 != null) {
                            int i78 = i75;
                            while (i78 < iArr18.length) {
                                if ((readByte(iArr18[i78]) >> r14) == 32) {
                                    int iC2 = c(bVar6, iArr18[i78]);
                                    int i79 = iC2 + 2;
                                    int i80 = bVar6.f39955i;
                                    TypePath typePath2 = bVar6.f39956j;
                                    Label[] labelArr9 = bVar6.f39958l;
                                    Label[] labelArr10 = bVar6.m;
                                    int[] iArr19 = bVar6.f39959n;
                                    String utf11 = readUTF8(iC2, cArr4);
                                    r1 = r14;
                                    cArr = cArr4;
                                    b(i79, cArr, r1, methodVisitor.visitLocalVariableAnnotation(i80, typePath2, labelArr9, labelArr10, iArr19, utf11, false));
                                } else {
                                    r1 = r14;
                                    cArr = cArr4;
                                }
                                i78++;
                                r14 = r1;
                                cArr4 = cArr;
                                iArr18 = iArr18;
                            }
                        }
                        Attribute attribute4 = attribute2;
                        while (attribute4 != null) {
                            Attribute attribute5 = attribute4.f39885b;
                            attribute4.f39885b = null;
                            methodVisitor6.visitAttribute(attribute4);
                            attribute4 = attribute5;
                        }
                        methodVisitor6.visitMaxs(i76, i77);
                        return;
                    }
                    int i81 = i58 - i29;
                    Label label6 = labelArr[i81];
                    if (label6 != null) {
                        label6.f39932k = null;
                        i12 = unsignedShort3;
                        methodVisitor3 = methodVisitor;
                        methodVisitor3.visitLabel(label6);
                        c10 = 2;
                        if ((bVar4.f39948b & 2) == 0 && (i22 = label6.f39923b) > 0) {
                            methodVisitor3.visitLineNumber(i22, label6);
                            for (Label label7 = label6.f39932k; label7 != null; label7 = label7.f39932k) {
                                methodVisitor3.visitLineNumber(label7.f39923b, label6);
                            }
                        }
                    } else {
                        i12 = unsignedShort3;
                        c10 = 2;
                        methodVisitor3 = methodVisitor;
                    }
                    b bVar7 = bVar5;
                    while (true) {
                        if (bVar7 == null) {
                            i13 = -1;
                        } else {
                            int i82 = bVar7.f39957k;
                            if (i82 == i81 || i82 == -1) {
                                if (i82 == -1) {
                                    i58 = i58;
                                    i17 = 3;
                                } else if (!z11 || z10) {
                                    i58 = i58;
                                    i17 = 3;
                                    methodVisitor.visitFrame(-1, bVar7.f39961p, bVar7.f39963r, bVar7.f39964s, bVar7.f39965t);
                                } else {
                                    i17 = 3;
                                    i58 = i58;
                                    methodVisitor.visitFrame(bVar7.f39960o, bVar7.f39962q, bVar7.f39963r, bVar7.f39964s, bVar7.f39965t);
                                }
                                if (unsignedShort7 > 0) {
                                    char[] cArr5 = bVar7.f39949c;
                                    Label[] labelArr11 = bVar7.f39954h;
                                    if (z11) {
                                        i20 = this.f39889b[i42] & 255;
                                        i18 = i42 + 1;
                                        i19 = 0;
                                        b10 = -1;
                                    } else {
                                        b10 = -1;
                                        bVar7.f39957k = -1;
                                        i18 = i42;
                                        i19 = 0;
                                        i20 = 255;
                                    }
                                    bVar7.f39962q = i19;
                                    if (i20 < 64) {
                                        bVar7.f39960o = i17;
                                        bVar7.f39964s = i19;
                                        i42 = i18;
                                        labelArr2 = labelArr11;
                                    } else {
                                        if (i20 < 128) {
                                            unsignedShort = i20 - 64;
                                            int iD = d(bVar7.f39965t, 0, i18, cArr5, labelArr11);
                                            bVar7.f39960o = 4;
                                            bVar7.f39964s = 1;
                                            i42 = iD;
                                            labelArr2 = labelArr11;
                                        } else {
                                            unsignedShort = readUnsignedShort(i18);
                                            int iD2 = i18 + 2;
                                            if (i20 == 247) {
                                                labelArr2 = labelArr11;
                                                int iD3 = d(bVar7.f39965t, 0, iD2, cArr5, labelArr2);
                                                bVar7.f39960o = 4;
                                                bVar7.f39964s = 1;
                                                i42 = iD3;
                                            } else {
                                                labelArr2 = labelArr11;
                                                if (i20 < 248 || i20 >= 251) {
                                                    i21 = 0;
                                                    c11 = 2;
                                                    if (i20 == 251) {
                                                        bVar7.f39960o = i17;
                                                    } else if (i20 < 255) {
                                                        int i83 = i20 - 251;
                                                        int i84 = z10 ? bVar7.f39961p : 0;
                                                        int i85 = i83;
                                                        while (i85 > 0) {
                                                            iD2 = d(bVar7.f39963r, i84, iD2, cArr5, labelArr2);
                                                            i85--;
                                                            i83 = i83;
                                                            i84++;
                                                            c11 = c11;
                                                        }
                                                        int i86 = i83;
                                                        c12 = c11;
                                                        bVar7.f39960o = 1;
                                                        bVar7.f39962q = i86;
                                                        bVar7.f39961p += i86;
                                                        bVar7.f39964s = 0;
                                                        i42 = iD2;
                                                    } else {
                                                        c12 = 2;
                                                        bVar7.f39960o = 0;
                                                        int unsignedShort20 = readUnsignedShort(iD2);
                                                        int iD4 = i18 + 4;
                                                        bVar7.f39962q = unsignedShort20;
                                                        bVar7.f39961p = unsignedShort20;
                                                        int i87 = unsignedShort20;
                                                        int i88 = 0;
                                                        while (i87 > 0) {
                                                            iD4 = d(bVar7.f39963r, i88, iD4, cArr5, labelArr2);
                                                            i87--;
                                                            i88++;
                                                        }
                                                        int unsignedShort21 = readUnsignedShort(iD4);
                                                        int iD5 = iD4 + 2;
                                                        bVar7.f39964s = unsignedShort21;
                                                        int i89 = unsignedShort21;
                                                        int i90 = 0;
                                                        while (i89 > 0) {
                                                            iD5 = d(bVar7.f39965t, i90, iD5, cArr5, labelArr2);
                                                            i89--;
                                                            i90++;
                                                        }
                                                        i42 = iD5;
                                                    }
                                                    i20 = unsignedShort;
                                                } else {
                                                    c11 = 2;
                                                    bVar7.f39960o = 2;
                                                    int i91 = 251 - i20;
                                                    bVar7.f39962q = i91;
                                                    bVar7.f39961p -= i91;
                                                    i21 = 0;
                                                }
                                                bVar7.f39964s = i21;
                                                c12 = c11;
                                                i42 = iD2;
                                                i20 = unsignedShort;
                                            }
                                            int i92 = i20 + 1 + bVar7.f39957k;
                                            bVar7.f39957k = i92;
                                            readLabel(i92, labelArr2);
                                            unsignedShort7--;
                                            c10 = c12;
                                        }
                                        i20 = unsignedShort;
                                    }
                                    c12 = 2;
                                    int i93 = i20 + 1 + bVar7.f39957k;
                                    bVar7.f39957k = i93;
                                    readLabel(i93, labelArr2);
                                    unsignedShort7--;
                                    c10 = c12;
                                } else {
                                    c10 = 2;
                                    bVar7 = null;
                                }
                            } else {
                                i13 = -1;
                            }
                        }
                    }
                    int i94 = i81;
                    int i95 = i58;
                    int i96 = bArr[i95] & 255;
                    switch (ClassWriter.N[i96]) {
                        case 0:
                            methodVisitor3.visitInsn(i96);
                            i58 = i95 + 1;
                            i59 = i59;
                            unsignedShort8 = unsignedShort8;
                            iArr12 = iArr12;
                            break;
                        case 1:
                            methodVisitor3.visitIntInsn(i96, bArr[i95 + 1]);
                            i58 = i95 + 2;
                            i59 = i59;
                            unsignedShort8 = unsignedShort8;
                            iArr12 = iArr12;
                            break;
                        case 2:
                            methodVisitor3.visitIntInsn(i96, readShort(i95 + 1));
                            i58 = i95 + 3;
                            i59 = i59;
                            unsignedShort8 = unsignedShort8;
                            iArr12 = iArr12;
                            break;
                        case 3:
                            methodVisitor3.visitVarInsn(i96, bArr[i95 + 1] & 255);
                            i58 = i95 + 2;
                            i59 = i59;
                            unsignedShort8 = unsignedShort8;
                            iArr12 = iArr12;
                            break;
                        case 4:
                            if (i96 > 54) {
                                i15 = i96 - 59;
                                i16 = (i15 >> 2) + 54;
                                i14 = 3;
                            } else {
                                i14 = 3;
                                i15 = i96 - 26;
                                i16 = (i15 >> 2) + 21;
                            }
                            methodVisitor3.visitVarInsn(i16, i14 & i15);
                            i58 = i95 + 1;
                            i59 = i59;
                            unsignedShort8 = unsignedShort8;
                            iArr12 = iArr12;
                            break;
                        case 5:
                            methodVisitor3.visitTypeInsn(i96, readClass(i95 + 1, cArr3));
                            i59 = i59;
                            unsignedShort8 = unsignedShort8;
                            iArr12 = iArr12;
                            break;
                        case 6:
                        case 7:
                            int i97 = iArr13[readUnsignedShort(i95 + 1)];
                            boolean z12 = bArr[i97 + (-1)] == 11;
                            String str3 = readClass(i97, cArr3);
                            int i98 = iArr13[readUnsignedShort(i97 + 2)];
                            String utf12 = readUTF8(i98, cArr3);
                            String utf13 = readUTF8(i98 + 2, cArr3);
                            if (i96 < 182) {
                                methodVisitor3.visitFieldInsn(i96, str3, utf12, utf13);
                            } else {
                                methodVisitor.visitMethodInsn(i96, str3, utf12, utf13, z12);
                            }
                            i58 = i96 == 185 ? i95 + 5 : i95 + 3;
                            i59 = i59;
                            unsignedShort8 = unsignedShort8;
                            iArr12 = iArr12;
                            break;
                        case 8:
                            int i99 = iArr13[readUnsignedShort(i95 + 1)];
                            int i100 = bVar4.f39950d[readUnsignedShort(i99)];
                            Handle handle = (Handle) readConst(readUnsignedShort(i100), cArr3);
                            int unsignedShort22 = readUnsignedShort(i100 + 2);
                            Object[] objArr2 = new Object[unsignedShort22];
                            int i101 = i100 + 4;
                            for (int i102 = 0; i102 < unsignedShort22; i102++) {
                                objArr2[i102] = readConst(readUnsignedShort(i101), cArr3);
                                i101 += 2;
                            }
                            int i103 = iArr13[readUnsignedShort(i99 + 2)];
                            methodVisitor3.visitInvokeDynamicInsn(readUTF8(i103, cArr3), readUTF8(i103 + 2, cArr3), handle, objArr2);
                            i59 = i59;
                            unsignedShort8 = unsignedShort8;
                            iArr12 = iArr12;
                            break;
                        case 9:
                            methodVisitor3.visitJumpInsn(i96, labelArr[readShort(i95 + 1) + i94]);
                            i58 = i95 + 3;
                            i59 = i59;
                            unsignedShort8 = unsignedShort8;
                            iArr12 = iArr12;
                            break;
                        case 10:
                            methodVisitor3.visitJumpInsn(i96 - 33, labelArr[readInt(i95 + 1) + i94]);
                            i58 = i95 + 5;
                            i59 = i59;
                            unsignedShort8 = unsignedShort8;
                            iArr12 = iArr12;
                            break;
                        case 11:
                            methodVisitor3.visitLdcInsn(readConst(bArr[i95 + 1] & 255, cArr3));
                            i58 = i95 + 2;
                            i59 = i59;
                            unsignedShort8 = unsignedShort8;
                            iArr12 = iArr12;
                            break;
                        case 12:
                            methodVisitor3.visitLdcInsn(readConst(readUnsignedShort(i95 + 1), cArr3));
                            i58 = i95 + 3;
                            i59 = i59;
                            unsignedShort8 = unsignedShort8;
                            iArr12 = iArr12;
                            break;
                        case 13:
                            methodVisitor3.visitIincInsn(bArr[i95 + 1] & 255, bArr[i95 + 2]);
                            i58 = i95 + 3;
                            i59 = i59;
                            unsignedShort8 = unsignedShort8;
                            iArr12 = iArr12;
                            break;
                        case 14:
                            int i104 = (i95 + 4) - (i94 & 3);
                            int i105 = readInt(i104) + i94;
                            int i106 = readInt(i104 + 4);
                            int i107 = readInt(i104 + 8);
                            int i108 = (i107 - i106) + 1;
                            Label[] labelArr12 = new Label[i108];
                            int i109 = i104 + 12;
                            for (int i110 = 0; i110 < i108; i110++) {
                                labelArr12[i110] = labelArr[readInt(i109) + i94];
                                i109 += 4;
                            }
                            methodVisitor3.visitTableSwitchInsn(i106, i107, labelArr[i105], labelArr12);
                            i58 = i109;
                            i59 = i59;
                            unsignedShort8 = unsignedShort8;
                            iArr12 = iArr12;
                            break;
                        case 15:
                            int i111 = (i95 + 4) - (i94 & 3);
                            int i112 = readInt(i111) + i94;
                            int i113 = readInt(i111 + 4);
                            int[] iArr20 = new int[i113];
                            Label[] labelArr13 = new Label[i113];
                            i58 = i111 + 8;
                            for (int i114 = 0; i114 < i113; i114++) {
                                iArr20[i114] = readInt(i58);
                                labelArr13[i114] = labelArr[readInt(i58 + 4) + i94];
                                i58 += 8;
                            }
                            methodVisitor3.visitLookupSwitchInsn(labelArr[i112], iArr20, labelArr13);
                            i59 = i59;
                            unsignedShort8 = unsignedShort8;
                            iArr12 = iArr12;
                            break;
                        case 16:
                        default:
                            methodVisitor3.visitMultiANewArrayInsn(readClass(i95 + 1, cArr3), bArr[i95 + 3] & 255);
                            i58 = i95 + 4;
                            break;
                        case 17:
                            int i115 = bArr[i95 + 1] & 255;
                            int i116 = i95 + 2;
                            if (i115 == 132) {
                                methodVisitor3.visitIincInsn(readUnsignedShort(i116), readShort(i95 + 4));
                                i58 = i95 + 6;
                            } else {
                                methodVisitor3.visitVarInsn(i115, readUnsignedShort(i116));
                                i58 = i95 + 4;
                            }
                            break;
                    }
                    while (iArr12 != null && i59 < iArr12.length && unsignedShort8 <= i94) {
                        if (unsignedShort8 == i94) {
                            int iC3 = c(bVar4, iArr12[i59]);
                            b(iC3 + 2, cArr3, true, methodVisitor3.visitInsnAnnotation(bVar4.f39955i, bVar4.f39956j, readUTF8(iC3, cArr3), true));
                        }
                        i59++;
                        unsignedShort8 = (i59 >= iArr12.length || readByte(iArr12[i59]) < 67) ? i13 : readUnsignedShort(iArr12[i59] + 1);
                    }
                    int i117 = i60;
                    int unsignedShort23 = unsignedShort9;
                    while (true) {
                        if (iArr11 != null) {
                            iArr2 = iArr11;
                            if (i117 < iArr2.length && unsignedShort23 <= i94) {
                                if (unsignedShort23 == i94) {
                                    int iC4 = c(bVar4, iArr2[i117]);
                                    b(iC4 + 2, cArr3, true, methodVisitor3.visitInsnAnnotation(bVar4.f39955i, bVar4.f39956j, readUTF8(iC4, cArr3), false));
                                }
                                i117++;
                                unsignedShort23 = (i117 >= iArr2.length || readByte(iArr2[i117]) < 67) ? i13 : readUnsignedShort(iArr2[i117] + 1);
                                i94 = i94;
                                iArr11 = iArr2;
                                unsignedShort8 = unsignedShort8;
                                iArr12 = iArr12;
                            }
                        } else {
                            iArr2 = iArr11;
                        }
                    }
                    unsignedShort9 = unsignedShort23;
                    bVar5 = bVar7;
                    iArr11 = iArr2;
                    unsignedShort8 = unsignedShort8;
                    unsignedShort3 = i12;
                    i28 = i28;
                    unsignedShort4 = unsignedShort4;
                    i51 = i61;
                    i60 = i117;
                }
            }
        }
    }

    public int getAccess() {
        return readUnsignedShort(this.header);
    }

    public String getClassName() {
        return readClass(this.header + 2, new char[this.f39891d]);
    }

    public String[] getInterfaces() {
        int i10 = this.header + 6;
        int unsignedShort = readUnsignedShort(i10);
        String[] strArr = new String[unsignedShort];
        if (unsignedShort > 0) {
            char[] cArr = new char[this.f39891d];
            for (int i11 = 0; i11 < unsignedShort; i11++) {
                i10 += 2;
                strArr[i11] = readClass(i10, cArr);
            }
        }
        return strArr;
    }

    public int getItem(int i10) {
        return this.f39888a[i10];
    }

    public int getItemCount() {
        return this.f39888a.length;
    }

    public int getMaxStringLength() {
        return this.f39891d;
    }

    public String getSuperName() {
        return readClass(this.header + 4, new char[this.f39891d]);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0055  */
    public final int[] i(MethodVisitor methodVisitor, b bVar, int i10, boolean z10) {
        int i11;
        char[] cArr = bVar.f39949c;
        int unsignedShort = readUnsignedShort(i10);
        int[] iArr = new int[unsignedShort];
        int iB = i10 + 2;
        for (int i12 = 0; i12 < unsignedShort; i12++) {
            iArr[i12] = iB;
            int i13 = readInt(iB);
            int i14 = i13 >>> 24;
            if (i14 == 0 || i14 == 1) {
                i11 = iB + 2;
            } else {
                if (i14 != 64 && i14 != 65) {
                    switch (i14) {
                        case 19:
                        case 20:
                        case 21:
                            i11 = iB + 1;
                            break;
                        case 22:
                            i11 = iB + 2;
                            break;
                        default:
                            switch (i14) {
                                case 71:
                                case 72:
                                case 73:
                                case 74:
                                case 75:
                                    i11 = iB + 4;
                                    break;
                            }
                            break;
                    }
                } else {
                    for (int unsignedShort2 = readUnsignedShort(iB + 1); unsignedShort2 > 0; unsignedShort2--) {
                        int unsignedShort3 = readUnsignedShort(iB + 3);
                        int unsignedShort4 = readUnsignedShort(iB + 5);
                        readLabel(unsignedShort3, bVar.f39954h);
                        readLabel(unsignedShort3 + unsignedShort4, bVar.f39954h);
                        iB += 6;
                    }
                }
                i11 = iB + 3;
            }
            int i15 = readByte(i11);
            if (i14 == 66) {
                TypePath typePath = i15 != 0 ? new TypePath(this.f39889b, i11) : null;
                int iB2 = u.b(i15, 2, 1, i11);
                iB = b(iB2 + 2, cArr, true, methodVisitor.visitTryCatchAnnotation(i13, typePath, readUTF8(iB2, cArr), z10));
            } else {
                iB = b((i15 * 2) + i11 + 3, cArr, true, null);
            }
        }
        return iArr;
    }

    public final int j() {
        int i10 = this.header;
        int unsignedShort = (readUnsignedShort(i10 + 6) * 2) + i10 + 8;
        for (int unsignedShort2 = readUnsignedShort(unsignedShort); unsignedShort2 > 0; unsignedShort2--) {
            for (int unsignedShort3 = readUnsignedShort(unsignedShort + 8); unsignedShort3 > 0; unsignedShort3--) {
                unsignedShort += readInt(unsignedShort + 12) + 6;
            }
            unsignedShort += 8;
        }
        int i11 = unsignedShort + 2;
        for (int unsignedShort4 = readUnsignedShort(i11); unsignedShort4 > 0; unsignedShort4--) {
            for (int unsignedShort5 = readUnsignedShort(i11 + 8); unsignedShort5 > 0; unsignedShort5--) {
                i11 += readInt(i11 + 12) + 6;
            }
            i11 += 8;
        }
        return i11 + 2;
    }

    public final void k(MethodVisitor methodVisitor, b bVar, int i10, boolean z10) {
        int iB = i10 + 1;
        int i11 = this.f39889b[i10] & 255;
        int length = Type.getArgumentTypes(bVar.f39953g).length - i11;
        int i12 = 0;
        while (i12 < length) {
            AnnotationVisitor annotationVisitorVisitParameterAnnotation = methodVisitor.visitParameterAnnotation(i12, "Ljava/lang/Synthetic;", false);
            if (annotationVisitorVisitParameterAnnotation != null) {
                annotationVisitorVisitParameterAnnotation.visitEnd();
            }
            i12++;
        }
        char[] cArr = bVar.f39949c;
        while (i12 < i11 + length) {
            iB += 2;
            for (int unsignedShort = readUnsignedShort(iB); unsignedShort > 0; unsignedShort--) {
                iB = b(iB + 2, cArr, true, methodVisitor.visitParameterAnnotation(i12, readUTF8(iB, cArr), z10));
            }
            i12++;
        }
    }

    public int readByte(int i10) {
        return this.f39889b[i10] & 255;
    }

    public String readClass(int i10, char[] cArr) {
        return readUTF8(this.f39888a[readUnsignedShort(i10)], cArr);
    }

    public Object readConst(int i10, char[] cArr) {
        int[] iArr = this.f39888a;
        int i11 = iArr[i10];
        byte b10 = this.f39889b[i11 - 1];
        if (b10 == 16) {
            return Type.getMethodType(readUTF8(i11, cArr));
        }
        switch (b10) {
            case 3:
                return new Integer(readInt(i11));
            case 4:
                return new Float(Float.intBitsToFloat(readInt(i11)));
            case 5:
                return new Long(readLong(i11));
            case 6:
                return new Double(Double.longBitsToDouble(readLong(i11)));
            case 7:
                return Type.getObjectType(readUTF8(i11, cArr));
            case 8:
                return readUTF8(i11, cArr);
            default:
                int i12 = readByte(i11);
                int i13 = iArr[readUnsignedShort(i11 + 1)];
                boolean z10 = this.f39889b[i13 + (-1)] == 11;
                String str = readClass(i13, cArr);
                int i14 = iArr[readUnsignedShort(i13 + 2)];
                return new Handle(i12, str, readUTF8(i14, cArr), readUTF8(i14 + 2, cArr), z10);
        }
    }

    public int readInt(int i10) {
        byte[] bArr = this.f39889b;
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public Label readLabel(int i10, Label[] labelArr) {
        if (labelArr[i10] == null) {
            labelArr[i10] = new Label();
        }
        return labelArr[i10];
    }

    public long readLong(int i10) {
        return (((long) readInt(i10)) << 32) | (((long) readInt(i10 + 4)) & 4294967295L);
    }

    public short readShort(int i10) {
        byte[] bArr = this.f39889b;
        return (short) ((bArr[i10 + 1] & 255) | ((bArr[i10] & 255) << 8));
    }

    public String readUTF8(int i10, char[] cArr) {
        int unsignedShort = readUnsignedShort(i10);
        if (i10 == 0 || unsignedShort == 0) {
            return null;
        }
        String[] strArr = this.f39890c;
        String str = strArr[unsignedShort];
        if (str != null) {
            return str;
        }
        int i11 = this.f39888a[unsignedShort];
        String strF = f(i11 + 2, cArr, readUnsignedShort(i11));
        strArr[unsignedShort] = strF;
        return strF;
    }

    public int readUnsignedShort(int i10) {
        byte[] bArr = this.f39889b;
        return (bArr[i10 + 1] & 255) | ((bArr[i10] & 255) << 8);
    }

    public ClassReader(String str) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str.replace('.', JsonPointer.SEPARATOR));
        stringBuffer.append(".class");
        this(h(ClassLoader.getSystemResourceAsStream(stringBuffer.toString()), true));
    }

    public void accept(ClassVisitor classVisitor, Attribute[] attributeArr, int i10) {
        String str;
        String str2;
        String str3;
        int i11;
        String str4;
        int[] iArr;
        ClassVisitor classVisitor2;
        boolean z10;
        int i12;
        String str5;
        int i13;
        String str6;
        int i14;
        String str7;
        String str8;
        String str9;
        int i15;
        String str10;
        String str11;
        int i16 = this.header;
        char[] cArr = new char[this.f39891d];
        b bVar = new b();
        bVar.f39947a = attributeArr;
        bVar.f39948b = i10;
        bVar.f39949c = cArr;
        int unsignedShort = readUnsignedShort(i16);
        String str12 = readClass(i16 + 2, cArr);
        String str13 = readClass(i16 + 4, cArr);
        int unsignedShort2 = readUnsignedShort(i16 + 6);
        String[] strArr = new String[unsignedShort2];
        int i17 = i16 + 8;
        for (int i18 = 0; i18 < unsignedShort2; i18++) {
            strArr[i18] = readClass(i17, cArr);
            i17 += 2;
        }
        int iJ = j();
        int i19 = iJ;
        int i20 = unsignedShort;
        int unsignedShort3 = readUnsignedShort(iJ);
        String str14 = null;
        int i21 = 0;
        String utf8 = null;
        String strF = null;
        String utf9 = null;
        Attribute attribute = null;
        String utf10 = null;
        String utf11 = null;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        while (true) {
            str = utf9;
            str2 = strF;
            utf8 = utf8;
            str3 = "Deprecated";
            i11 = i21;
            str4 = str14;
            iArr = this.f39888a;
            if (unsignedShort3 <= 0) {
                break;
            }
            String utf12 = readUTF8(i19 + 2, cArr);
            String[] strArr2 = strArr;
            if ("SourceFile".equals(utf12)) {
                utf9 = readUTF8(i19 + 8, cArr);
            } else {
                if ("InnerClasses".equals(utf12)) {
                    i25 = i19 + 8;
                } else {
                    if ("EnclosingMethod".equals(utf12)) {
                        str14 = readClass(i19 + 8, cArr);
                        int unsignedShort4 = readUnsignedShort(i19 + 10);
                        if (unsignedShort4 != 0) {
                            utf11 = readUTF8(iArr[unsignedShort4], cArr);
                            utf8 = readUTF8(iArr[unsignedShort4] + 2, cArr);
                        } else {
                            utf8 = utf8;
                        }
                        utf9 = str;
                        strF = str2;
                        i21 = i11;
                    } else if ("Signature".equals(utf12)) {
                        utf10 = readUTF8(i19 + 8, cArr);
                    } else if ("RuntimeVisibleAnnotations".equals(utf12)) {
                        i21 = i19 + 8;
                        utf9 = str;
                        strF = str2;
                        str14 = str4;
                    } else if ("RuntimeVisibleTypeAnnotations".equals(utf12)) {
                        i23 = i19 + 8;
                    } else if ("Deprecated".equals(utf12)) {
                        i20 |= 131072;
                    } else if ("Synthetic".equals(utf12)) {
                        i20 |= 266240;
                    } else if ("SourceDebugExtension".equals(utf12)) {
                        int i26 = readInt(i19 + 4);
                        strF = f(i19 + 8, new char[i26], i26);
                        utf9 = str;
                        i21 = i11;
                        str14 = str4;
                    } else if ("RuntimeInvisibleAnnotations".equals(utf12)) {
                        i22 = i19 + 8;
                    } else if ("RuntimeInvisibleTypeAnnotations".equals(utf12)) {
                        i24 = i19 + 8;
                    } else {
                        if ("BootstrapMethods".equals(utf12)) {
                            int unsignedShort5 = readUnsignedShort(i19 + 8);
                            int[] iArr2 = new int[unsignedShort5];
                            int unsignedShort6 = i19 + 10;
                            for (int i27 = 0; i27 < unsignedShort5; i27++) {
                                iArr2[i27] = unsignedShort6;
                                unsignedShort6 += (readUnsignedShort(unsignedShort6 + 2) + 2) << 1;
                            }
                            bVar.f39950d = iArr2;
                            str11 = str;
                            str10 = str2;
                            i15 = i11;
                            str9 = str4;
                        } else {
                            str9 = str4;
                            i15 = i11;
                            str10 = str2;
                            str11 = str;
                            Attribute attributeE = e(attributeArr, utf12, i19 + 8, readInt(i19 + 4), cArr);
                            if (attributeE != null) {
                                attributeE.f39885b = attribute;
                                attribute = attributeE;
                            }
                        }
                        strF = str10;
                        i21 = i15;
                        str14 = str9;
                        utf9 = str11;
                        utf8 = utf8;
                    }
                    i19 = readInt(i19 + 4) + 6 + i19;
                    unsignedShort3--;
                    strArr = strArr2;
                }
                utf9 = str;
            }
            strF = str2;
            i21 = i11;
            str14 = str4;
            i19 = readInt(i19 + 4) + 6 + i19;
            unsignedShort3--;
            strArr = strArr2;
        }
        String str15 = "RuntimeInvisibleTypeAnnotations";
        Attribute attribute2 = attribute;
        String str16 = "RuntimeInvisibleAnnotations";
        String str17 = "RuntimeVisibleTypeAnnotations";
        String str18 = utf10;
        String str19 = "RuntimeVisibleAnnotations";
        b bVar2 = bVar;
        String str20 = "Synthetic";
        classVisitor.visit(readInt(iArr[1] - 7), i20, str12, str18, str13, strArr);
        String str21 = "Signature";
        if ((i10 & 2) != 0 || (str == null && str2 == null)) {
            classVisitor2 = classVisitor;
        } else {
            classVisitor2 = classVisitor;
            classVisitor2.visitSource(str, str2);
        }
        if (str4 != null) {
            classVisitor2.visitOuterClass(str4, utf11, utf8);
        }
        if (i11 != 0) {
            int iB = i11 + 2;
            for (int unsignedShort7 = readUnsignedShort(i11); unsignedShort7 > 0; unsignedShort7--) {
                iB = b(iB + 2, cArr, true, classVisitor2.visitAnnotation(readUTF8(iB, cArr), true));
            }
        }
        int i28 = i22;
        if (i28 != 0) {
            int iB2 = i28 + 2;
            for (int unsignedShort8 = readUnsignedShort(i28); unsignedShort8 > 0; unsignedShort8--) {
                iB2 = b(iB2 + 2, cArr, true, classVisitor2.visitAnnotation(readUTF8(iB2, cArr), false));
            }
        }
        int i29 = i23;
        if (i29 != 0) {
            int iB3 = i29 + 2;
            for (int unsignedShort9 = readUnsignedShort(i29); unsignedShort9 > 0; unsignedShort9--) {
                int iC = c(bVar2, iB3);
                iB3 = b(iC + 2, cArr, true, classVisitor2.visitTypeAnnotation(bVar2.f39955i, bVar2.f39956j, readUTF8(iC, cArr), true));
            }
        }
        int i30 = i24;
        if (i30 != 0) {
            int iB4 = i30 + 2;
            for (int unsignedShort10 = readUnsignedShort(i30); unsignedShort10 > 0; unsignedShort10--) {
                int iC2 = c(bVar2, iB4);
                iB4 = b(iC2 + 2, cArr, true, classVisitor2.visitTypeAnnotation(bVar2.f39955i, bVar2.f39956j, readUTF8(iC2, cArr), false));
            }
        }
        int i31 = 0;
        Attribute attribute3 = attribute2;
        while (attribute3 != null) {
            Attribute attribute4 = attribute3.f39885b;
            attribute3.f39885b = null;
            classVisitor2.visitAttribute(attribute3);
            attribute3 = attribute4;
        }
        int i32 = i25;
        if (i32 != 0) {
            int i33 = i32 + 2;
            for (int unsignedShort11 = readUnsignedShort(i32); unsignedShort11 > 0; unsignedShort11--) {
                classVisitor2.visitInnerClass(readClass(i33, cArr), readClass(i33 + 2, cArr), readUTF8(i33 + 4, cArr), readUnsignedShort(i33 + 6));
                i33 += 8;
            }
        }
        int i34 = (unsignedShort2 * 2) + this.header + 10;
        int unsignedShort12 = readUnsignedShort(i34 - 2);
        while (unsignedShort12 > 0) {
            char[] cArr2 = bVar2.f39949c;
            int unsignedShort13 = readUnsignedShort(i34);
            String utf13 = readUTF8(i34 + 2, cArr2);
            String utf14 = readUTF8(i34 + 4, cArr2);
            int i35 = i34 + 6;
            int unsignedShort14 = readUnsignedShort(i35);
            int i36 = i35;
            int i37 = i31;
            int i38 = i37;
            int i39 = i38;
            Attribute attribute5 = null;
            String utf15 = null;
            Object obj = null;
            int i40 = unsignedShort13;
            int i41 = i39;
            while (unsignedShort14 > 0) {
                String utf16 = readUTF8(i36 + 2, cArr2);
                i41 = i41;
                if ("ConstantValue".equals(utf16)) {
                    int unsignedShort15 = readUnsignedShort(i36 + 8);
                    obj = unsignedShort15 == 0 ? null : readConst(unsignedShort15, cArr2);
                } else {
                    if (str21.equals(utf16)) {
                        utf15 = readUTF8(i36 + 8, cArr2);
                    } else {
                        if (str3.equals(utf16)) {
                            i40 |= 131072;
                        } else {
                            String str22 = str20;
                            if (str22.equals(utf16)) {
                                i40 |= 266240;
                                str20 = str22;
                            } else {
                                str20 = str22;
                                String str23 = str19;
                                if (str23.equals(utf16)) {
                                    i38 = i36 + 8;
                                    bVar2 = bVar2;
                                    str8 = str23;
                                    str7 = str17;
                                    unsignedShort12 = unsignedShort12;
                                } else {
                                    str7 = str17;
                                    if (str7.equals(utf16)) {
                                        str7 = str7;
                                        i41 = i36 + 8;
                                        str8 = str23;
                                    } else {
                                        int i42 = i38;
                                        str16 = str16;
                                        if (str16.equals(utf16)) {
                                            i37 = i36 + 8;
                                            i39 = i39;
                                            str15 = str15;
                                        } else {
                                            Attribute attribute6 = attribute5;
                                            String str24 = str15;
                                            if (str24.equals(utf16)) {
                                                str15 = str24;
                                                i39 = i36 + 8;
                                                attribute5 = attribute6;
                                            } else {
                                                str8 = str23;
                                                bVar2 = bVar2;
                                                str21 = str21;
                                                str7 = str7;
                                                str3 = str3;
                                                int i43 = i37;
                                                str16 = str16;
                                                str15 = str24;
                                                unsignedShort12 = unsignedShort12;
                                                int i44 = i39;
                                                Attribute attributeE2 = e(bVar2.f39947a, utf16, i36 + 8, readInt(i36 + 4), cArr2);
                                                if (attributeE2 != null) {
                                                    attributeE2.f39885b = attribute6;
                                                    attribute5 = attributeE2;
                                                    i37 = i43;
                                                    i38 = i42;
                                                    i41 = i41;
                                                    i39 = i44;
                                                } else {
                                                    i39 = i44;
                                                    i37 = i43;
                                                    attribute5 = attribute6;
                                                    i38 = i42;
                                                    i41 = i41;
                                                }
                                            }
                                        }
                                        str8 = str23;
                                        i38 = i42;
                                        unsignedShort12 = unsignedShort12;
                                    }
                                }
                            }
                        }
                        i36 = readInt(i36 + 4) + 6 + i36;
                        unsignedShort14--;
                        unsignedShort12 = unsignedShort12;
                        i39 = i39;
                        bVar2 = bVar2;
                        str21 = str21;
                        str19 = str8;
                        str17 = str7;
                        str3 = str3;
                        str16 = str16;
                        str15 = str15;
                    }
                    i41 = i41;
                    str8 = str19;
                    str7 = str17;
                    i36 = readInt(i36 + 4) + 6 + i36;
                    unsignedShort14--;
                    unsignedShort12 = unsignedShort12;
                    i39 = i39;
                    bVar2 = bVar2;
                    str21 = str21;
                    str19 = str8;
                    str17 = str7;
                    str3 = str3;
                    str16 = str16;
                    str15 = str15;
                }
                str8 = str19;
                str7 = str17;
                unsignedShort12 = unsignedShort12;
                i36 = readInt(i36 + 4) + 6 + i36;
                unsignedShort14--;
                unsignedShort12 = unsignedShort12;
                i39 = i39;
                bVar2 = bVar2;
                str21 = str21;
                str19 = str8;
                str17 = str7;
                str3 = str3;
                str16 = str16;
                str15 = str15;
            }
            b bVar3 = bVar2;
            int i45 = i41;
            String str25 = str3;
            int i46 = i38;
            String str26 = str21;
            int i47 = unsignedShort12;
            int i48 = i39;
            String str27 = str15;
            String str28 = str16;
            String str29 = str19;
            String str30 = str17;
            int i49 = i37;
            Attribute attribute7 = attribute5;
            int i50 = i36 + 2;
            FieldVisitor fieldVisitorVisitField = classVisitor.visitField(i40, utf13, utf14, utf15, obj);
            if (fieldVisitorVisitField != null) {
                if (i46 != 0) {
                    int iB5 = i46 + 2;
                    for (int unsignedShort16 = readUnsignedShort(i46); unsignedShort16 > 0; unsignedShort16--) {
                        iB5 = b(iB5 + 2, cArr2, true, fieldVisitorVisitField.visitAnnotation(readUTF8(iB5, cArr2), true));
                    }
                }
                if (i49 != 0) {
                    int iB6 = i49 + 2;
                    for (int unsignedShort17 = readUnsignedShort(i49); unsignedShort17 > 0; unsignedShort17--) {
                        iB6 = b(iB6 + 2, cArr2, true, fieldVisitorVisitField.visitAnnotation(readUTF8(iB6, cArr2), false));
                    }
                }
                if (i45 != 0) {
                    int iB7 = i45 + 2;
                    for (int unsignedShort18 = readUnsignedShort(i45); unsignedShort18 > 0; unsignedShort18--) {
                        int iC3 = c(bVar3, iB7);
                        iB7 = b(iC3 + 2, cArr2, true, fieldVisitorVisitField.visitTypeAnnotation(bVar3.f39955i, bVar3.f39956j, readUTF8(iC3, cArr2), true));
                    }
                }
                if (i48 != 0) {
                    int iB8 = i48 + 2;
                    for (int unsignedShort19 = readUnsignedShort(i48); unsignedShort19 > 0; unsignedShort19--) {
                        int iC4 = c(bVar3, iB8);
                        iB8 = b(iC4 + 2, cArr2, true, fieldVisitorVisitField.visitTypeAnnotation(bVar3.f39955i, bVar3.f39956j, readUTF8(iC4, cArr2), false));
                    }
                }
                Attribute attribute8 = attribute7;
                while (attribute8 != null) {
                    Attribute attribute9 = attribute8.f39885b;
                    attribute8.f39885b = null;
                    fieldVisitorVisitField.visitAttribute(attribute8);
                    attribute8 = attribute9;
                }
                fieldVisitorVisitField.visitEnd();
            }
            unsignedShort12 = i47 - 1;
            bVar2 = bVar3;
            i34 = i50;
            str21 = str26;
            str19 = str29;
            str17 = str30;
            str3 = str25;
            str16 = str28;
            str15 = str27;
            i31 = 0;
        }
        b bVar4 = bVar2;
        String str31 = str3;
        String str32 = str21;
        String str33 = str15;
        String str34 = str16;
        String str35 = str19;
        String str36 = str17;
        int i51 = i34 + 2;
        int unsignedShort20 = readUnsignedShort(i34);
        while (unsignedShort20 > 0) {
            char[] cArr3 = bVar4.f39949c;
            bVar4.f39951e = readUnsignedShort(i51);
            bVar4.f39952f = readUTF8(i51 + 2, cArr3);
            bVar4.f39953g = readUTF8(i51 + 4, cArr3);
            int i52 = i51 + 6;
            int unsignedShort21 = readUnsignedShort(i52);
            int i53 = i52;
            int i54 = 0;
            int i55 = 0;
            int i56 = 0;
            int i57 = 0;
            int i58 = 0;
            int i59 = 0;
            String utf17 = null;
            String[] strArr3 = null;
            Attribute attribute10 = null;
            int i60 = 0;
            int i61 = 0;
            int i62 = 0;
            int i63 = 0;
            while (unsignedShort21 > 0) {
                String utf18 = readUTF8(i53 + 2, cArr3);
                int i64 = i54;
                if (!"Code".equals(utf18)) {
                    if ("Exceptions".equals(utf18)) {
                        int unsignedShort22 = readUnsignedShort(i53 + 8);
                        String[] strArr4 = new String[unsignedShort22];
                        i12 = i55;
                        int i65 = i53 + 10;
                        for (int i66 = 0; i66 < unsignedShort22; i66++) {
                            strArr4[i66] = readClass(i65, cArr3);
                            i65 += 2;
                        }
                        i54 = i64;
                        i61 = i65;
                        i13 = unsignedShort20;
                        strArr3 = strArr4;
                        str5 = str32;
                    } else {
                        i12 = i55;
                        str5 = str32;
                        if (str5.equals(utf18)) {
                            utf17 = readUTF8(i53 + 8, cArr3);
                            i13 = unsignedShort20;
                        } else {
                            String str37 = str31;
                            if (str37.equals(utf18)) {
                                bVar4.f39951e |= 131072;
                                str6 = str37;
                                str5 = str5;
                                i56 = i56;
                                i57 = i57;
                                i58 = i58;
                                i13 = unsignedShort20;
                                i14 = i59;
                            } else {
                                i13 = unsignedShort20;
                                String str38 = str35;
                                if (str38.equals(utf18)) {
                                    i59 = i53 + 8;
                                    str6 = str37;
                                    str5 = str5;
                                    str35 = str38;
                                } else {
                                    str35 = str38;
                                    String str39 = str36;
                                    if (str39.equals(utf18)) {
                                        i56 = i53 + 8;
                                        str6 = str37;
                                        str5 = str5;
                                        str36 = str39;
                                    } else {
                                        str31 = str37;
                                        if ("AnnotationDefault".equals(utf18)) {
                                            i57 = i53 + 8;
                                            str36 = str39;
                                        } else {
                                            String str40 = str20;
                                            if (str40.equals(utf18)) {
                                                bVar4.f39951e |= 266240;
                                                str20 = str40;
                                                str5 = str5;
                                                str36 = str39;
                                                str6 = str31;
                                                i14 = i59;
                                            } else {
                                                str36 = str39;
                                                String str41 = str34;
                                                if (str41.equals(utf18)) {
                                                    i58 = i53 + 8;
                                                    str20 = str40;
                                                    str34 = str41;
                                                } else {
                                                    str34 = str41;
                                                    String str42 = str33;
                                                    if (str42.equals(utf18)) {
                                                        str20 = str40;
                                                        str5 = str5;
                                                        str33 = str42;
                                                        i55 = i53 + 8;
                                                        str6 = str31;
                                                    } else {
                                                        str20 = str40;
                                                        if ("RuntimeVisibleParameterAnnotations".equals(utf18)) {
                                                            i62 = i53 + 8;
                                                        } else if ("RuntimeInvisibleParameterAnnotations".equals(utf18)) {
                                                            i54 = i53 + 8;
                                                            str5 = str5;
                                                            str33 = str42;
                                                        } else if ("MethodParameters".equals(utf18)) {
                                                            i60 = i53 + 8;
                                                        } else {
                                                            str33 = str42;
                                                            str6 = str31;
                                                            str5 = str5;
                                                            i57 = i57;
                                                            i56 = i56;
                                                            i58 = i58;
                                                            i14 = i59;
                                                            Attribute attributeE3 = e(bVar4.f39947a, utf18, i53 + 8, readInt(i53 + 4), cArr3);
                                                            if (attributeE3 != null) {
                                                                attributeE3.f39885b = attribute10;
                                                                i55 = i12;
                                                                attribute10 = attributeE3;
                                                                i59 = i14;
                                                                i57 = i57;
                                                                i56 = i56;
                                                                i58 = i58;
                                                            }
                                                        }
                                                        str33 = str42;
                                                    }
                                                    i54 = i64;
                                                }
                                            }
                                        }
                                    }
                                }
                                i54 = i64;
                                i55 = i12;
                            }
                            i54 = i64;
                            i55 = i12;
                            i59 = i14;
                            i57 = i57;
                            i56 = i56;
                            i58 = i58;
                        }
                        str6 = str31;
                        i54 = i64;
                        i55 = i12;
                    }
                    str6 = str31;
                    i55 = i12;
                } else if ((bVar4.f39948b & 1) == 0) {
                    i63 = i53 + 8;
                    i13 = unsignedShort20;
                    str5 = str32;
                    str6 = str31;
                    i54 = i64;
                } else {
                    i12 = i55;
                    i13 = unsignedShort20;
                    str5 = str32;
                    str6 = str31;
                    i14 = i59;
                    i54 = i64;
                    i55 = i12;
                    i59 = i14;
                    i57 = i57;
                    i56 = i56;
                    i58 = i58;
                }
                i53 = readInt(i53 + 4) + 6 + i53;
                unsignedShort21--;
                unsignedShort20 = i13;
                str31 = str6;
                str32 = str5;
            }
            int i67 = i54;
            int i68 = i55;
            int i69 = i56;
            int i70 = i57;
            int i71 = i58;
            int i72 = unsignedShort20;
            String str43 = str32;
            String str44 = str31;
            int i73 = i59;
            int i74 = i53 + 2;
            MethodVisitor methodVisitorVisitMethod = classVisitor.visitMethod(bVar4.f39951e, bVar4.f39952f, bVar4.f39953g, utf17, strArr3);
            if (methodVisitorVisitMethod != null) {
                if (methodVisitorVisitMethod instanceof g) {
                    g gVar = (g) methodVisitorVisitMethod;
                    if (gVar.f40001a.f39892a == this && utf17 == gVar.f40006f) {
                        int i75 = gVar.f40009i;
                        if (strArr3 == null) {
                            if (i75 == 0) {
                                gVar.f40007g = i52;
                                gVar.f40008h = i74 - i52;
                                z10 = true;
                            }
                        } else if (strArr3.length == i75) {
                            int length = strArr3.length - 1;
                            while (true) {
                                if (length >= 0) {
                                    int i76 = i61 - 2;
                                    if (gVar.f40010j[length] == readUnsignedShort(i76)) {
                                        length--;
                                        i61 = i76;
                                    }
                                } else {
                                    gVar.f40007g = i52;
                                    gVar.f40008h = i74 - i52;
                                    z10 = true;
                                }
                            }
                        }
                    }
                }
                if (i60 != 0) {
                    int i77 = this.f39889b[i60] & 255;
                    int i78 = i60 + 1;
                    while (i77 > 0) {
                        methodVisitorVisitMethod.visitParameter(readUTF8(i78, cArr3), readUnsignedShort(i78 + 2));
                        i77--;
                        i78 += 4;
                    }
                }
                if (i70 != 0) {
                    AnnotationVisitor annotationVisitorVisitAnnotationDefault = methodVisitorVisitMethod.visitAnnotationDefault();
                    a(i70, cArr3, null, annotationVisitorVisitAnnotationDefault);
                    if (annotationVisitorVisitAnnotationDefault != null) {
                        annotationVisitorVisitAnnotationDefault.visitEnd();
                    }
                }
                if (i73 != 0) {
                    int iB9 = i73 + 2;
                    for (int unsignedShort23 = readUnsignedShort(i73); unsignedShort23 > 0; unsignedShort23--) {
                        iB9 = b(iB9 + 2, cArr3, true, methodVisitorVisitMethod.visitAnnotation(readUTF8(iB9, cArr3), true));
                    }
                }
                if (i71 != 0) {
                    int unsignedShort24 = readUnsignedShort(i71);
                    int iB10 = i71 + 2;
                    while (unsignedShort24 > 0) {
                        unsignedShort24--;
                        iB10 = b(iB10 + 2, cArr3, true, methodVisitorVisitMethod.visitAnnotation(readUTF8(iB10, cArr3), false));
                    }
                }
                if (i69 != 0) {
                    int iB11 = i69 + 2;
                    for (int unsignedShort25 = readUnsignedShort(i69); unsignedShort25 > 0; unsignedShort25--) {
                        int iC5 = c(bVar4, iB11);
                        iB11 = b(iC5 + 2, cArr3, true, methodVisitorVisitMethod.visitTypeAnnotation(bVar4.f39955i, bVar4.f39956j, readUTF8(iC5, cArr3), true));
                    }
                }
                if (i68 != 0) {
                    int iB12 = i68 + 2;
                    for (int unsignedShort26 = readUnsignedShort(i68); unsignedShort26 > 0; unsignedShort26--) {
                        int iC6 = c(bVar4, iB12);
                        iB12 = b(iC6 + 2, cArr3, true, methodVisitorVisitMethod.visitTypeAnnotation(bVar4.f39955i, bVar4.f39956j, readUTF8(iC6, cArr3), false));
                    }
                }
                z10 = true;
                int i79 = i62;
                if (i79 != 0) {
                    k(methodVisitorVisitMethod, bVar4, i79, true);
                }
                if (i67 != 0) {
                    k(methodVisitorVisitMethod, bVar4, i67, false);
                }
                while (attribute10 != null) {
                    Attribute attribute11 = attribute10.f39885b;
                    attribute10.f39885b = null;
                    methodVisitorVisitMethod.visitAttribute(attribute10);
                    attribute10 = attribute11;
                }
                int i80 = i63;
                if (i80 != 0) {
                    methodVisitorVisitMethod.visitCode();
                    g(methodVisitorVisitMethod, bVar4, i80);
                }
                methodVisitorVisitMethod.visitEnd();
            } else {
                z10 = true;
            }
            unsignedShort20 = i72 - 1;
            i51 = i74;
            str31 = str44;
            str32 = str43;
        }
        classVisitor.visitEnd();
    }

    public ClassReader(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public ClassReader(byte[] bArr, int i10, int i11) {
        this.f39889b = bArr;
        if (readShort(i10 + 6) > 52) {
            throw new IllegalArgumentException();
        }
        int[] iArr = new int[readUnsignedShort(i10 + 8)];
        this.f39888a = iArr;
        int length = iArr.length;
        this.f39890c = new String[length];
        int i12 = i10 + 10;
        int i13 = 0;
        int i14 = 1;
        while (i14 < length) {
            int i15 = i12 + 1;
            this.f39888a[i14] = i15;
            byte b10 = bArr[i12];
            int unsignedShort = 3;
            if (b10 == 1) {
                unsignedShort = 3 + readUnsignedShort(i15);
                if (unsignedShort > i13) {
                    i13 = unsignedShort;
                }
            } else if (b10 != 15) {
                unsignedShort = 5;
                if (b10 != 18 && b10 != 3 && b10 != 4) {
                    if (b10 != 5 && b10 != 6) {
                        switch (b10) {
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                                break;
                            default:
                                continue;
                        }
                    } else {
                        i14++;
                        unsignedShort = 9;
                    }
                }
            } else {
                unsignedShort = 4;
            }
            i12 += unsignedShort;
            i14++;
        }
        this.f39891d = i13;
        this.header = i12;
    }
}
