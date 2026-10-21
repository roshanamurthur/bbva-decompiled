package com.mypinpad.tsdk.isolation;

import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GetProcessingOptionsCommandApdu;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/setLayoutAnimationListener;", "", "", "a", "[B", "setDividerPadding", "()[B", "<init>", "()V"}, k = 1, mv = {1, 5, 1})
public final class setLayoutAnimationListener {

    @NotNull
    public static final setLayoutAnimationListener INSTANCE = new setLayoutAnimationListener();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final byte[] setDividerPadding = {-100, GetProcessingOptionsCommandApdu.COMMAND_TEMPLATE_TAG, -28, -83};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f59968b;

    static {
        int i10 = f59968b;
        int i11 = i10 & 67;
        int i12 = (i10 | 67) & (~i11);
        int i13 = -(-(i11 << 1));
        int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
        int i15 = i14 % 128;
        if (i14 % 2 == 0) {
            throw null;
        }
    }

    @JvmName(name = "setDividerPadding")
    @NotNull
    public static byte[] setDividerPadding() {
        return (byte[]) setY(new Object[0], -1117967001, 1117967001, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = f59968b;
        int i14 = i13 & 71;
        int i15 = (i13 ^ 71) | i14;
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        int i17 = i16 % 128;
        int i18 = i16 % 2;
        int i19 = i17 & 69;
        int i20 = i17 | 69;
        int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
        f59968b = i21 % 128;
        if (i21 % 2 == 0) {
            return setDividerPadding;
        }
        throw null;
    }
}
