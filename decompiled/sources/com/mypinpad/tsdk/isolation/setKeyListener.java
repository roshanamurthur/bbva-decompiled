package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/mypinpad/tsdk/i/setKeyListener;", "", "", "p0", "Lcom/mypinpad/tsdk/i/setFindListener;", "setDividerPadding", "(Ljava/lang/String;)Lcom/mypinpad/tsdk/i/setFindListener;", "Lcom/mypinpad/tsdk/i/Terminal;", "p1", "setX", "(Ljava/lang/String;Lcom/mypinpad/tsdk/i/Terminal;)Lcom/mypinpad/tsdk/i/setFindListener;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class setKeyListener {

    @NotNull
    public static final setKeyListener INSTANCE = new setKeyListener();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f59935a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f59936b = 1;

    static {
        int i10 = f59936b;
        int i11 = (i10 ^ 83) + ((i10 & 83) << 1);
        f59935a = i11 % 128;
        int i12 = i11 % 2;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        setFindListener setfindlistener;
        setFindListener setfindlistener2;
        int i13 = (i11 * (-500)) + (i10 * (-500));
        int i14 = ~i11;
        int i15 = ~(i14 | i10);
        int i16 = ~i10;
        if (((~(i16 | (~i12) | i11)) * 501) + ((~(i14 | i16)) * 1002) + ((i15 | (~(i16 | i11 | i12))) * 501) + i13 == 1) {
            String str = (String) objArr[0];
            int i17 = f59936b;
            int i18 = i17 & 89;
            int i19 = (i17 | 89) & (~i18);
            int i20 = -(-(i18 << 1));
            int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
            f59935a = i21 % 128;
            int i22 = i21 % 2;
            TransactionFailed transactionFailed = (TransactionFailed) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{setOnGenericMotionListener.setCompoundDrawableTintBlendMode, str}, -1501590138, 1501590142, (int) System.currentTimeMillis());
            if (transactionFailed == null) {
                int i23 = f59936b + 79;
                int i24 = i23 % 128;
                f59935a = i24;
                int i25 = i23 % 2;
                int i26 = i24 + 83;
                f59936b = i26 % 128;
                int i27 = i26 % 2;
                setfindlistener = null;
            } else {
                setfindlistener = (setFindListener) TransactionFailed.setX(new Object[]{transactionFailed}, -570885530, 570885532, System.identityHashCode(transactionFailed));
                int i28 = f59935a;
                int i29 = i28 & 117;
                int i30 = ((i28 | 117) & (~i29)) + (i29 << 1);
                f59936b = i30 % 128;
                int i31 = i30 % 2;
            }
            if (setfindlistener == null) {
                throw new setOnHierarchyChangeListener(2010, str);
            }
            int i32 = f59935a;
            int i33 = i32 & 25;
            int i34 = (i32 ^ 25) | i33;
            int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
            f59936b = i35 % 128;
            if (i35 % 2 != 0) {
                return setfindlistener;
            }
            throw null;
        }
        String str2 = (String) objArr[0];
        Terminal terminal = (Terminal) objArr[1];
        int i36 = f59936b + 41;
        f59935a = i36 % 128;
        if (i36 % 2 != 0) {
            Intrinsics.checkNotNullParameter(terminal, "");
            setOnGenericMotionListener setongenericmotionlistener = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
            throw null;
        }
        Intrinsics.checkNotNullParameter(terminal, "");
        setOnGenericMotionListener setongenericmotionlistener2 = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
        TransactionFailed transactionFailed2 = (TransactionFailed) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{str2, terminal}, 1668702711, -1668702709, (int) System.currentTimeMillis());
        if (transactionFailed2 == null) {
            int i37 = f59936b;
            int i38 = i37 & 89;
            int i39 = -(-((i37 ^ 89) | i38));
            int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
            int i41 = i40 % 128;
            f59935a = i41;
            int i42 = i40 % 2;
            int i43 = i41 & 123;
            int i44 = (i41 ^ 123) | i43;
            int i45 = (i43 ^ i44) + ((i44 & i43) << 1);
            f59936b = i45 % 128;
            int i46 = i45 % 2;
            setfindlistener2 = null;
        } else {
            setfindlistener2 = (setFindListener) TransactionFailed.setX(new Object[]{transactionFailed2}, -570885530, 570885532, System.identityHashCode(transactionFailed2));
            int i47 = f59935a;
            int i48 = (i47 & 1) + (i47 | 1);
            f59936b = i48 % 128;
            int i49 = i48 % 2;
        }
        if (setfindlistener2 == null) {
            int i50 = f59936b + 53;
            f59935a = i50 % 128;
            if (i50 % 2 == 0) {
                return (setFindListener) setDividerPadding(new Object[]{str2}, -377194506, 377194507, (int) System.currentTimeMillis());
            }
            throw null;
        }
        int i51 = f59936b;
        int i52 = i51 ^ 87;
        int i53 = ((i51 & 87) | i52) << 1;
        int i54 = -i52;
        int i55 = (i53 & i54) + (i53 | i54);
        f59935a = i55 % 128;
        if (i55 % 2 == 0) {
            return setfindlistener2;
        }
        int i56 = 25 / 0;
        return setfindlistener2;
    }

    @NotNull
    public static setFindListener setX(@Nullable String p4, @NotNull Terminal p10) {
        return (setFindListener) setDividerPadding(new Object[]{p4, p10}, -450333367, 450333367, (int) System.currentTimeMillis());
    }

    @NotNull
    public static setFindListener setDividerPadding(@Nullable String p4) {
        return (setFindListener) setDividerPadding(new Object[]{p4}, -377194506, 377194507, (int) System.currentTimeMillis());
    }
}
