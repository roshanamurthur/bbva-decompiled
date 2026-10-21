package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.CharsKt;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "", "setOnFocusChangeListener", "(B)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class e9 extends Lambda implements Function1<Byte, CharSequence> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final e9 f55330p0 = new e9();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f55331q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f55332r0 = 1;

    static {
        int i10 = f55331q0;
        int i11 = i10 & 13;
        int i12 = (i10 | 13) & (~i11);
        int i13 = i11 << 1;
        int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
        f55332r0 = i14 % 128;
        int i15 = i14 % 2;
    }

    public e9() {
        super(1);
    }

    public static /* synthetic */ CharSequence a(Object[] objArr, int i10, int i11, int i12) {
        CharSequence charSequenceA;
        int i13 = ~i11;
        if ((((~((~i10) | i12)) | i13) * 502) + ((~((~i12) | i13 | i10)) * (-502)) + (((~(i11 | i10)) | (~(i13 | i12))) * (-502)) + (i11 * 503) + (i10 * (-501)) != 1) {
            byte bByteValue = ((Byte) objArr[1]).byteValue();
            int i14 = f55331q0;
            int i15 = ((i14 | 91) << 1) - (((~i14) & 91) | (i14 & (-92)));
            f55332r0 = i15 % 128;
            int i16 = i15 % 2;
            charSequenceA = Integer.toString(bByteValue, CharsKt.checkRadix(CharsKt.checkRadix(16)));
            Intrinsics.checkNotNullExpressionValue(charSequenceA, "");
            int i17 = f55331q0;
            int i18 = (i17 ^ 91) + ((i17 & 91) << 1);
            f55332r0 = i18 % 128;
            int i19 = i18 % 2;
        } else {
            e9 e9Var = (e9) objArr[0];
            Object obj = objArr[1];
            int i20 = f55332r0;
            int i21 = (i20 | 5) << 1;
            int i22 = -(((~i20) & 5) | (i20 & (-6)));
            int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
            f55331q0 = i23 % 128;
            int i24 = i23 % 2;
            charSequenceA = a(new Object[]{e9Var, Byte.valueOf(((Number) obj).byteValue())}, -444819816, 444819816, System.identityHashCode(e9Var));
            int i25 = f55331q0 + 21;
            f55332r0 = i25 % 128;
            int i26 = i25 % 2;
        }
        return charSequenceA;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ CharSequence invoke(Byte b10) {
        return a(new Object[]{this, b10}, -749171465, 749171466, System.identityHashCode(this));
    }
}
