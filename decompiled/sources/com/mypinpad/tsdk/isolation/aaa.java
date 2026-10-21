package com.mypinpad.tsdk.isolation;

import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\n\u001a\u00020\bX\u0007¢\u0006\u0006\n\u0004\b\u0003\u0010\t"}, d2 = {"Lcom/mypinpad/tsdk/i/aaa;", "", "", "setDividerPadding", "()Ljava/lang/String;", "Lcom/mypinpad/tsdk/i/ye;", "setX", "()Lcom/mypinpad/tsdk/i/ye;", "Lcom/mypinpad/tsdk/i/aby;", "Lcom/mypinpad/tsdk/i/aby;", "setY", "p0", "<init>", "(Lcom/mypinpad/tsdk/i/aby;)V", "setCompoundDrawableTintBlendMode"}, k = 1, mv = {1, 6, 0})
public final class aaa {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f52014b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f52015c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f52016a;

    /* JADX INFO: renamed from: setDividerPadding, reason: from kotlin metadata */
    @NotNull
    public aby setY;

    static {
        int i10 = f52014b;
        int i11 = ((i10 & 94) + (i10 | 94)) - 1;
        f52015c = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    public aaa(@NotNull aby abyVar) {
        Intrinsics.checkNotNullParameter(abyVar, "");
        this.setY = abyVar;
        this.f52016a = SvgConstantsKt.SPECIFIED_TEXT_ANCHOR;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws IOException {
        String layoutAnimation;
        long length;
        int i13 = ~i11;
        if ((((~((~i10) | i12)) | i13) * 502) + ((~((~i12) | i13 | i10)) * (-502)) + (((~(i11 | i10)) | (~(i13 | i12))) * (-502)) + (i11 * 503) + (i10 * (-501)) == 1) {
            aaa aaaVar = (aaa) objArr[0];
            int i14 = f52015c;
            int i15 = (i14 & 62) + (i14 | 62);
            int i16 = (i15 ^ (-1)) + (i15 << 1);
            f52014b = i16 % 128;
            if (i16 % 2 != 0) {
                layoutAnimation = aaaVar.setY.setLayoutAnimation(aaaVar.f52016a);
                length = aaaVar.f52016a + ((long) layoutAnimation.length());
            } else {
                layoutAnimation = aaaVar.setY.setLayoutAnimation(aaaVar.f52016a);
                length = aaaVar.f52016a - ((long) layoutAnimation.length());
            }
            aaaVar.f52016a = length;
            String str = layoutAnimation;
            int i17 = f52015c + 43;
            f52014b = i17 % 128;
            int i18 = i17 % 2;
            return str;
        }
        aaa aaaVar2 = (aaa) objArr[0];
        ye.setOnFocusChangeListener setonfocuschangelistener = new ye.setOnFocusChangeListener();
        int i19 = f52014b;
        int i20 = i19 & 117;
        int i21 = ((((i19 ^ 117) | i20) << 1) - (~(-((i19 | 117) & (~i20))))) - 1;
        f52015c = i21 % 128;
        int i22 = i21 % 2;
        while (true) {
            String str2 = (String) setDividerPadding(new Object[]{aaaVar2}, 1848816107, -1848816106, System.identityHashCode(aaaVar2));
            if (str2.length() == 0) {
                int i23 = f52014b;
                int i24 = i23 & 83;
                int i25 = (~i24) & (i23 | 83);
                int i26 = i24 << 1;
                int i27 = (i25 & i26) + (i26 | i25);
                f52015c = i27 % 128;
                int i28 = i27 % 2;
                int i29 = (i23 ^ 53) + ((i23 & 53) << 1);
                f52015c = i29 % 128;
                int i30 = i29 % 2;
                ye yeVar = (ye) ye.setOnFocusChangeListener.setOnFocusChangeListener(new Object[]{setonfocuschangelistener}, -1008790874, 1008790879, System.identityHashCode(setonfocuschangelistener));
                int i31 = f52014b;
                int i32 = i31 & 45;
                int i33 = (((i31 | 45) & (~i32)) - (~(i32 << 1))) - 1;
                f52015c = i33 % 128;
                int i34 = i33 % 2;
                return yeVar;
            }
            int i35 = f52014b;
            int i36 = i35 & 103;
            int i37 = ((i35 ^ 103) | i36) << 1;
            int i38 = -((i35 | 103) & (~i36));
            int i39 = (i37 & i38) + (i38 | i37);
            int i40 = i39 % 128;
            f52015c = i40;
            int i41 = i39 % 2;
            int i42 = i40 & 89;
            int i43 = ((i40 ^ 89) | i42) << 1;
            int i44 = -((i40 | 89) & (~i42));
            int i45 = (i43 ^ i44) + ((i44 & i43) << 1);
            f52014b = i45 % 128;
            if (i45 % 2 != 0) {
                int i46 = 17 / 0;
            }
        }
    }

    @NotNull
    public final ye setX() {
        return (ye) setDividerPadding(new Object[]{this}, -357327575, 357327575, System.identityHashCode(this));
    }

    @NotNull
    public final String setDividerPadding() {
        return (String) setDividerPadding(new Object[]{this}, 1848816107, -1848816106, System.identityHashCode(this));
    }
}
