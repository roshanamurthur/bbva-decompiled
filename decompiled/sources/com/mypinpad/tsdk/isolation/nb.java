package com.mypinpad.tsdk.isolation;

import com.mypinpad.tsdk.api.errors.TerminalException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/nb;", "", "", "p0", "", "setDividerPadding", "(I)V", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class nb {

    @NotNull
    public static final nb INSTANCE = new nb();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f57230a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f57231b;

    static {
        int i10 = f57230a;
        int i11 = ((i10 ^ 56) + ((i10 & 56) << 1)) - 1;
        f57231b = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    public static void setDividerPadding(int p4) throws TerminalException {
        setX(new Object[]{Integer.valueOf(p4)}, 1383735215, -1383735215, p4);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0069  */
    /* JADX WARN: Code duplicated, block: B:9:0x0056  */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) throws TerminalException {
        boolean z10;
        int iIntValue = ((Number) objArr[0]).intValue();
        int i13 = f57231b;
        int i14 = i13 & 113;
        int i15 = ((i13 ^ 113) | i14) << 1;
        int i16 = -((~i14) & (i13 | 113));
        int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
        f57230a = i17 % 128;
        if (i17 % 2 != 0) {
            uq uqVar = uq.INSTANCE;
            component14.Companion companion = component14.INSTANCE;
            int i18 = 85 / 0;
            if (((component14) component14.Companion.setX(new Object[]{Integer.valueOf(iIntValue)}, -700745811, 700745811, iIntValue)) != null) {
                int i19 = i13 & 125;
                int i20 = -(-((i13 ^ 125) | i19));
                int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
                f57230a = i21 % 128;
                int i22 = i21 % 2;
                z10 = true;
            } else {
                int i23 = (i13 & 105) + (i13 | 105);
                f57230a = i23 % 128;
                int i24 = i23 % 2;
                z10 = false;
            }
        } else {
            uq uqVar2 = uq.INSTANCE;
            component14.Companion companion2 = component14.INSTANCE;
            if (((component14) component14.Companion.setX(new Object[]{Integer.valueOf(iIntValue)}, -700745811, 700745811, iIntValue)) != null) {
                int i110 = i13 & 125;
                int i25 = -(-((i13 ^ 125) | i110));
                int i26 = (i110 ^ i25) + ((i110 & i25) << 1);
                f57230a = i26 % 128;
                int i27 = i26 % 2;
                z10 = true;
            } else {
                int i28 = (i13 & 105) + (i13 | 105);
                f57230a = i28 % 128;
                int i29 = i28 % 2;
                z10 = false;
            }
        }
        uq.setCompoundDrawableTintBlendMode(new Object[]{Boolean.valueOf(z10), 14, String.valueOf(iIntValue)}, -68532531, 68532531, 14);
        int i30 = ((i13 | 101) << 1) - (i13 ^ 101);
        f57230a = i30 % 128;
        int i31 = i30 % 2;
        return null;
    }
}
