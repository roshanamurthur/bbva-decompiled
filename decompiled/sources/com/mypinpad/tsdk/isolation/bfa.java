package com.mypinpad.tsdk.isolation;

import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes10.dex */
public final class bfa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bex f54676a = new bex();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f54677b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f54678c;

    static {
        int i10 = f54677b;
        int i11 = i10 | 63;
        int i12 = (i11 << 1) - ((~(i10 & 63)) & i11);
        f54678c = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
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
    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (((~(i10 | i12)) | (~i11)) * 529) + (((~((~i12) | i10)) | (~(i10 | i11))) * 529) + (i11 * 530) + (i10 * 530) + 1058;
        int i14 = f54678c;
        bex bexVar = f54676a;
        if (i13 == 1) {
            byte[] bArr = (byte[]) objArr[0];
            int iIntValue = ((Number) objArr[1]).intValue();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bexVar.setDividerPadding(iIntValue));
            try {
                bexVar.setDividerPadding(bArr, 0, iIntValue, byteArrayOutputStream);
                int i15 = i14 + 27;
                f54677b = i15 % 128;
                int i16 = i15 % 2;
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                int i17 = i14 & 19;
                int i18 = -(-((i14 ^ 19) | i17));
                int i19 = (i17 ^ i18) + ((i17 & i18) << 1);
                f54677b = i19 % 128;
                int i20 = i19 % 2;
                return byteArray;
            } catch (Exception e5) {
                StringBuilder sb2 = new StringBuilder("exception encoding base64 string: ");
                sb2.append(e5.getMessage());
                throw new bfd(sb2.toString(), e5);
            }
        }
        if (i13 == 2) {
            byte[] bArr2 = (byte[]) objArr[0];
            int i21 = ((i14 & 77) - (~(-(-(i14 | 77))))) - 1;
            f54677b = i21 % 128;
            if (i21 % 2 == 0) {
                int length = bArr2.length;
                return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{bArr2, Integer.valueOf(length)}, 1100488811, -1100488810, length);
            }
            int length2 = bArr2.length;
            throw null;
        }
        String str = (String) objArr[0];
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream((str.length() / 4) * 3);
        try {
            bexVar.setY(str, byteArrayOutputStream2);
            int i22 = i14 & 39;
            int i23 = -(-(i14 | 39));
            int i24 = (i22 ^ i23) + ((i22 & i23) << 1);
            f54677b = i24 % 128;
            int i25 = i24 % 2;
            int i26 = i14 & 31;
            int i27 = ((i14 ^ 31) | i26) << 1;
            int i28 = -((~i26) & (i14 | 31));
            int i29 = ((i27 | i28) << 1) - (i27 ^ i28);
            f54677b = i29 % 128;
            int i30 = i29 % 2;
            byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
            if (i30 == 0) {
                return byteArray2;
            }
            int i31 = 2 / 0;
            return byteArray2;
        } catch (Exception e7) {
            StringBuilder sb3 = new StringBuilder("unable to decode base64 string: ");
            sb3.append(e7.getMessage());
            throw new bew(sb3.toString(), e7);
        }
    }

    public static byte[] setDividerPadding(byte[] bArr) {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{bArr}, -1057021271, 1057021273, (int) System.currentTimeMillis());
    }

    public static byte[] setX(String str) {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{str}, -2077456639, 2077456639, (int) System.currentTimeMillis());
    }
}
