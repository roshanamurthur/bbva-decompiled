package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.CharsKt;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "", "setX", "(B)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class d9 extends Lambda implements Function1<Byte, CharSequence> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final d9 f55126p0 = new d9();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f55127q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f55128r0 = 1;

    static {
        int i10 = f55128r0 + 105;
        f55127q0 = i10 % 128;
        int i11 = i10 % 2;
    }

    public d9() {
        super(1);
    }

    public static /* synthetic */ CharSequence a(Object[] objArr, int i10, int i11, int i12) {
        CharSequence charSequenceA;
        int i13 = ~i11;
        int i14 = ~i12;
        if ((((~(i10 | i14 | i11)) | (~(i12 | i13)) | (~((~i10) | i13))) * 988) + ((i10 | i13) * (-988)) + (((~(i13 | i14 | i10)) | (~(i10 | i11 | i12))) * 988) + (i11 * (-987)) + (i10 * 989) != 1) {
            byte bByteValue = ((Byte) objArr[1]).byteValue();
            int i15 = f55128r0;
            int i16 = ((i15 | 11) << 1) - (i15 ^ 11);
            f55127q0 = i16 % 128;
            charSequenceA = Integer.toString(bByteValue, CharsKt.checkRadix(CharsKt.checkRadix(i16 % 2 != 0 ? 123 : 16)));
            Intrinsics.checkNotNullExpressionValue(charSequenceA, "");
        } else {
            d9 d9Var = (d9) objArr[0];
            Object obj = objArr[1];
            int i17 = f55128r0;
            int i18 = (-2) - ((((i17 | 50) << 1) - (i17 ^ 50)) ^ (-1));
            f55127q0 = i18 % 128;
            int i19 = i18 % 2;
            charSequenceA = a(new Object[]{d9Var, Byte.valueOf(((Number) obj).byteValue())}, 618089233, -618089233, System.identityHashCode(d9Var));
            int i20 = f55127q0 + 69;
            f55128r0 = i20 % 128;
            int i21 = i20 % 2;
        }
        return charSequenceA;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ CharSequence invoke(Byte b10) {
        return a(new Object[]{this, b10}, 1271028119, -1271028118, System.identityHashCode(this));
    }
}
