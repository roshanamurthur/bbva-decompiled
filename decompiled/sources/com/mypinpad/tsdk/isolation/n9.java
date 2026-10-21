package com.mypinpad.tsdk.isolation;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0006*\u00020\u00020\u00022\n\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/pw;", "p0", "Lcom/mypinpad/tsdk/i/ti$setOnFocusChangeListener;", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/pw;)Lcom/mypinpad/tsdk/i/ti$setOnFocusChangeListener;"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class n9 extends Lambda implements Function1<pw, ti.setOnFocusChangeListener> {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f57217r0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f57218s0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ti f57219p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ UUID f57220q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9(ti tiVar, UUID uuid) {
        super(1);
        this.f57219p0 = tiVar;
        this.f57220q0 = uuid;
    }

    public static /* synthetic */ ti.setOnFocusChangeListener a(Object[] objArr, int i10, int i11, int i12) {
        ti.setOnFocusChangeListener setonfocuschangelistenerA;
        int i13 = ~i10;
        int i14 = ((~(i13 | i11)) * (-1182)) + (i11 * (-590)) + (i10 * 592);
        int i15 = ~i11;
        if (((i12 | i13 | i15) * 591) + (((~(i10 | i11)) | (~(i13 | i15 | (~i12)))) * (-591)) + i14 != 1) {
            n9 n9Var = (n9) objArr[0];
            Object obj = objArr[1];
            int i16 = f57217r0;
            int i17 = ((i16 & (-62)) | ((~i16) & 61)) + ((i16 & 61) << 1);
            f57218s0 = i17 % 128;
            int i18 = i17 % 2;
            setonfocuschangelistenerA = a(new Object[]{n9Var, (pw) obj}, 88991356, -88991355, System.identityHashCode(n9Var));
            int i19 = f57218s0;
            int i20 = i19 & 89;
            int i21 = i19 | 89;
            int i22 = (i20 & i21) + (i21 | i20);
            f57217r0 = i22 % 128;
            if (i22 % 2 != 0) {
                int i23 = 35 / 0;
            }
        } else {
            n9 n9Var2 = (n9) objArr[0];
            pw pwVar = (pw) objArr[1];
            int i24 = f57218s0;
            int i25 = ((i24 & 108) + (i24 | 108)) - 1;
            f57217r0 = i25 % 128;
            int i26 = i25 % 2;
            ti tiVar = n9Var2.f57219p0;
            Intrinsics.checkNotNullExpressionValue(pwVar, "");
            String string = n9Var2.f57220q0.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            setonfocuschangelistenerA = (ti.setOnFocusChangeListener) ti.setDividerPadding(new Object[]{tiVar, pwVar, string}, -1660614105, 1660614105, System.identityHashCode(tiVar));
            int i27 = f57217r0;
            int i28 = (i27 ^ 69) + ((i27 & 69) << 1);
            f57218s0 = i28 % 128;
            if (i28 % 2 == 0) {
                throw null;
            }
        }
        return setonfocuschangelistenerA;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ ti.setOnFocusChangeListener invoke(pw pwVar) {
        return a(new Object[]{this, pwVar}, -346397760, 346397760, System.identityHashCode(this));
    }
}
