package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/mypinpad/tsdk/i/setEms;", "Lcom/mypinpad/tsdk/i/getDetailsFieldTextSizeSp;", "", "setDividerPadding", "()I", "", "setCompoundDrawableTintBlendMode", "()Ljava/lang/String;", "Lcom/mypinpad/tsdk/i/setFitsSystemWindows;", "p0", "", "p1", "<init>", "(Lcom/mypinpad/tsdk/i/setFitsSystemWindows;Z)V"}, k = 1, mv = {1, 5, 1})
public final class setEms implements getDetailsFieldTextSizeSp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final setFitsSystemWindows f59647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f59648b;

    static {
        int i10 = 1 & 9;
        int i11 = 1 | 9;
        int i12 = (i10 & i11) + (i10 | i11);
        int i13 = i12 % 128;
        int i14 = i12 % 2;
    }

    public setEms(@NotNull setFitsSystemWindows setfitssystemwindows, boolean z10) {
        Intrinsics.checkNotNullParameter(setfitssystemwindows, "");
        this.f59647a = setfitssystemwindows;
        this.f59648b = z10;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * 971) + (i10 * (-1939));
        int i14 = ~i11;
        int i15 = ~(i14 | i10);
        int i16 = ~((~i12) | i11);
        int i17 = ~i10;
        if ((((~(i17 | i14)) | i16) * 970) + ((~(i11 | i17)) * 1940) + ((i15 | i16) * (-970)) + i13 == 1) {
            setEms setems = (setEms) objArr[0];
            return Integer.valueOf(((Byte) setLogo.setY(new Object[]{Byte.valueOf(((Byte) setLogo.setY(new Object[]{Byte.valueOf(setems.f59647a.setDividerPadding()), 6}, 310482515, -310482506, 6)).byteValue()), 4, Boolean.valueOf(setems.f59648b)}, -1488015476, 1488015481, 4)).byteValue());
        }
        setEms setems2 = (setEms) objArr[0];
        StringBuilder sb2 = new StringBuilder();
        sb2.append(setems2.f59647a.ordinal());
        sb2.append(", ");
        sb2.append(setems2.f59648b);
        return sb2.toString();
    }

    @Override // com.mypinpad.tsdk.isolation.getDetailsFieldTextSizeSp
    @NotNull
    public final String setCompoundDrawableTintBlendMode() {
        return (String) setOnFocusChangeListener(new Object[]{this}, -1064740632, 1064740632, System.identityHashCode(this));
    }

    public final int setDividerPadding() {
        return ((Integer) setOnFocusChangeListener(new Object[]{this}, 1059560589, -1059560588, System.identityHashCode(this))).intValue();
    }
}
