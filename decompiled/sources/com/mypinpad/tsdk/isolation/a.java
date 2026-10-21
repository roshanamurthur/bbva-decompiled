package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0005\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0007\u0010\u0010R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017"}, d2 = {"Lcom/mypinpad/tsdk/i/a;", "", "Lcom/mypinpad/tsdk/i/setTextLocales;", "a", "Lcom/mypinpad/tsdk/i/setTextLocales;", "setY", "()Lcom/mypinpad/tsdk/i/setTextLocales;", "setX", "Lcom/mypinpad/tsdk/i/setMaxWidth;", "b", "Lcom/mypinpad/tsdk/i/setMaxWidth;", "setCompoundDrawableTintBlendMode", "()Lcom/mypinpad/tsdk/i/setMaxWidth;", "", "c", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "setOnFocusChangeListener", "d", "setDividerPadding", "Lcom/mypinpad/tsdk/i/TransactionProcessingResult;", "e", "Lcom/mypinpad/tsdk/i/TransactionProcessingResult;", "()Lcom/mypinpad/tsdk/i/TransactionProcessingResult;"}, k = 1, mv = {1, 5, 1})
public class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f51959f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f51960g = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final setTextLocales setX;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final setMaxWidth setY;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer setOnFocusChangeListener;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer setCompoundDrawableTintBlendMode;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final TransactionProcessingResult setDividerPadding;

    public a(setTextLocales settextlocales, setMaxWidth setmaxwidth, Integer num, Integer num2, TransactionProcessingResult transactionProcessingResult, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        setmaxwidth = (i10 & 2) != 0 ? new setMaxWidth() : setmaxwidth;
        num = (i10 & 4) != 0 ? null : num;
        num2 = (i10 & 8) != 0 ? null : num2;
        transactionProcessingResult = (i10 & 16) != 0 ? null : transactionProcessingResult;
        Intrinsics.checkNotNullParameter(settextlocales, "");
        Intrinsics.checkNotNullParameter(setmaxwidth, "");
        this.setX = settextlocales;
        this.setY = setmaxwidth;
        this.setOnFocusChangeListener = num;
        this.setCompoundDrawableTintBlendMode = num2;
        this.setDividerPadding = transactionProcessingResult;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        Object obj;
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = i13 | i14;
        int i16 = ~i12;
        int i17 = (((~(i10 | i14 | i16)) | (~(i13 | i12))) * 765) + (((~i15) | (~(i13 | i16))) * 1530) + (((~(i11 | i13 | i12)) | (~(i15 | i16)) | (~(i14 | i10 | i12))) * 765) + (i11 * (-764)) + (i10 * (-1529));
        if (i17 == 1) {
            a aVar = (a) objArr[0];
            int i18 = f51959f;
            int i19 = (i18 & 22) + (i18 | 22);
            int i20 = (i19 ^ (-1)) + (i19 << 1);
            f51960g = i20 % 128;
            int i21 = i20 % 2;
            obj = aVar.setDividerPadding;
            if (i21 == 0) {
                throw null;
            }
            int i22 = (-2) - ((i18 + 116) ^ (-1));
            f51960g = i22 % 128;
            if (i22 % 2 == 0) {
                int i23 = 3 / 0;
            }
        } else if (i17 == 2) {
            a aVar2 = (a) objArr[0];
            int i24 = f51960g;
            int i25 = ((i24 & (-72)) | ((~i24) & 71)) + ((i24 & 71) << 1);
            int i26 = i25 % 128;
            f51959f = i26;
            int i27 = i25 % 2;
            obj = aVar2.setY;
            int i28 = i26 + 71;
            f51960g = i28 % 128;
            if (i28 % 2 == 0) {
                int i29 = 86 / 0;
            }
        } else if (i17 == 3) {
            a aVar3 = (a) objArr[0];
            int i30 = f51959f;
            int i31 = (i30 & 113) + (i30 | 113);
            f51960g = i31 % 128;
            int i32 = i31 % 2;
            obj = aVar3.setX;
            if (i32 == 0) {
                throw null;
            }
            int i33 = i30 ^ 79;
            int i34 = -(-((i30 & 79) << 1));
            int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
            f51960g = i35 % 128;
            if (i35 % 2 == 0) {
                throw null;
            }
        } else if (i17 != 4) {
            a aVar4 = (a) objArr[0];
            int i36 = f51960g;
            int i37 = i36 & 1;
            int i38 = (i37 - (~((i36 ^ 1) | i37))) - 1;
            f51959f = i38 % 128;
            int i39 = i38 % 2;
            obj = aVar4.setOnFocusChangeListener;
            if (i39 != 0) {
                int i40 = 64 / 0;
            }
        } else {
            a aVar5 = (a) objArr[0];
            int i41 = f51960g;
            int i42 = i41 & 21;
            int i43 = (i41 ^ 21) | i42;
            int i44 = (i42 ^ i43) + ((i42 & i43) << 1);
            f51959f = i44 % 128;
            int i45 = i44 % 2;
            obj = aVar5.setCompoundDrawableTintBlendMode;
            int i46 = i41 ^ 101;
            int i47 = (i41 & 101) << 1;
            int i48 = (i46 ^ i47) + ((i47 & i46) << 1);
            f51959f = i48 % 128;
            if (i48 % 2 != 0) {
                throw null;
            }
        }
        return obj;
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    @NotNull
    public final setMaxWidth setCompoundDrawableTintBlendMode() {
        return (setMaxWidth) setX(new Object[]{this}, -917873151, 917873153, System.identityHashCode(this));
    }

    @JvmName(name = "setDividerPadding")
    @Nullable
    public final Integer setDividerPadding() {
        return (Integer) setX(new Object[]{this}, 156913967, -156913963, System.identityHashCode(this));
    }

    @JvmName(name = "setOnFocusChangeListener")
    @Nullable
    public final TransactionProcessingResult setOnFocusChangeListener() {
        return (TransactionProcessingResult) setX(new Object[]{this}, 1133945330, -1133945329, System.identityHashCode(this));
    }

    @JvmName(name = "setY")
    @NotNull
    public final setTextLocales setY() {
        return (setTextLocales) setX(new Object[]{this}, -298445589, 298445592, System.identityHashCode(this));
    }

    @JvmName(name = "setX")
    @Nullable
    public final Integer setX() {
        return (Integer) setX(new Object[]{this}, -114513983, 114513983, System.identityHashCode(this));
    }
}
