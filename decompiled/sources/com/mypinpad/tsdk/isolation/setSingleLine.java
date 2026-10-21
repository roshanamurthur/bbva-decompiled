package com.mypinpad.tsdk.isolation;

import java.io.BufferedReader;
import java.io.IOException;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class setSingleLine {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f60575a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f60576b = 1;

    public static final /* synthetic */ String setCompoundDrawableTintBlendMode(Iterable iterable) {
        return (String) setX(new Object[]{iterable}, -651071146, 651071150, (int) System.currentTimeMillis());
    }

    public static final /* synthetic */ String setDividerPadding(byte[] bArr) {
        return (String) setX(new Object[]{bArr}, -693778564, 693778567, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) throws IOException {
        int i13;
        CharSequence charSequence;
        d9 d9Var;
        int i14;
        int i15 = ~i10;
        int i16 = ~i11;
        int i17 = ~(i15 | i16);
        int i18 = (~i12) | i15;
        int i19 = (((~(i10 | i16)) | (~(i11 | i18))) * 241) + ((i10 | i11) * (-482)) + (((~i18) | i17) * (-241)) + (i11 * 242) + (i10 * 483);
        if (i19 == 1) {
            byte[] bArr = (byte[]) objArr[0];
            int i20 = f60575a + 37;
            f60576b = i20 % 128;
            int i21 = i20 % 2;
            String strJoinToString$default = ArraysKt___ArraysKt.joinToString$default(bArr, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) e9.f55330p0, 30, (Object) null);
            int i22 = f60575a;
            int i23 = ((i22 & 36) + (i22 | 36)) - 1;
            f60576b = i23 % 128;
            if (i23 % 2 != 0) {
                return strJoinToString$default;
            }
            throw null;
        }
        if (i19 == 2) {
            BufferedReader bufferedReader = (BufferedReader) objArr[0];
            int iIntValue = ((Number) objArr[1]).intValue();
            StringBuilder sb2 = new StringBuilder();
            int i24 = f60576b + 3;
            f60575a = i24 % 128;
            int i25 = i24 % 2;
            while (true) {
                int i26 = bufferedReader.read();
                if (i26 == -1) {
                    break;
                }
                int i27 = f60575a;
                int i28 = i27 & 21;
                int i29 = -(-((i27 ^ 21) | i28));
                int i30 = (i28 & i29) + (i29 | i28);
                int i31 = i30 % 128;
                f60576b = i31;
                int i32 = i30 % 2;
                char c10 = (char) i26;
                if (c10 == '\n') {
                    break;
                }
                int i33 = i31 & 25;
                int i34 = (i31 ^ 25) | i33;
                int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
                f60575a = i35 % 128;
                if (i35 % 2 != 0) {
                    sb2.append(c10);
                    int i36 = 49 / 0;
                    if (sb2.length() >= iIntValue) {
                        break;
                    }
                } else {
                    sb2.append(c10);
                    if (sb2.length() >= iIntValue) {
                        break;
                    }
                }
            }
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            int i37 = f60575a;
            int i38 = ((((i37 ^ 47) | (i37 & 47)) << 1) - (~(-(((~i37) & 47) | (i37 & (-48)))))) - 1;
            f60576b = i38 % 128;
            int i39 = i38 % 2;
            return string;
        }
        if (i19 == 3) {
            byte[] bArr2 = (byte[]) objArr[0];
            int i40 = f60575a;
            int i41 = (i40 & 107) + (i40 | 107);
            f60576b = i41 % 128;
            if (i41 % 2 != 0) {
                return (String) setX(new Object[]{bArr2}, -674007189, 674007190, (int) System.currentTimeMillis());
            }
            throw null;
        }
        if (i19 == 4) {
            Iterable iterable = (Iterable) objArr[0];
            int i42 = f60576b;
            int i43 = ((i42 ^ 43) | (i42 & 43)) << 1;
            int i44 = -(((~i42) & 43) | (i42 & (-44)));
            int i45 = (i43 & i44) + (i44 | i43);
            f60575a = i45 % 128;
            int i46 = i45 % 2;
            String str = (String) setX(new Object[]{iterable}, 95443164, -95443164, (int) System.currentTimeMillis());
            int i47 = f60576b;
            int i48 = (i47 & 31) + (i47 | 31);
            f60575a = i48 % 128;
            int i49 = i48 % 2;
            return str;
        }
        if (i19 == 5) {
            BufferedReader bufferedReader2 = (BufferedReader) objArr[0];
            ((Number) objArr[1]).intValue();
            int i50 = f60575a + 63;
            f60576b = i50 % 128;
            String str2 = (String) (i50 % 2 == 0 ? setX(new Object[]{bufferedReader2, 9790}, -385396886, 385396888, 9790) : setX(new Object[]{bufferedReader2, 128}, -385396886, 385396888, 128));
            int i51 = f60575a;
            int i52 = i51 & 117;
            int i53 = i52 + ((i51 ^ 117) | i52);
            f60576b = i53 % 128;
            int i54 = i53 % 2;
            return str2;
        }
        Iterable iterable2 = (Iterable) objArr[0];
        int i55 = f60575a;
        int i56 = i55 & 65;
        int i57 = (i55 ^ 65) | i56;
        int i58 = (i56 ^ i57) + ((i57 & i56) << 1);
        f60576b = i58 % 128;
        if (i58 % 2 == 0) {
            i13 = 1;
            charSequence = null;
            d9Var = d9.f55126p0;
            i14 = 28;
        } else {
            i13 = 0;
            charSequence = null;
            d9Var = d9.f55126p0;
            i14 = 30;
        }
        return CollectionsKt___CollectionsKt.joinToString$default(iterable2, "", null, null, i13, charSequence, d9Var, i14, null);
    }

    public static final /* synthetic */ String setX(BufferedReader bufferedReader, int i10) {
        return (String) setX(new Object[]{bufferedReader, Integer.valueOf(i10)}, 265914503, -265914498, i10);
    }
}
