package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/setOnItemClickListener;", "Lcom/mypinpad/tsdk/i/component9;", "", "a", "Ljava/lang/String;", "setOnFocusChangeListener", "()Ljava/lang/String;", "setCompoundDrawableTintBlendMode", "b", "setDividerPadding", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "setX"}, k = 1, mv = {1, 5, 1})
public final class setOnItemClickListener extends component9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String setCompoundDrawableTintBlendMode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String setOnFocusChangeListener;

    static {
        int i10 = 1 ^ 97;
        int i11 = ((1 & 97) | i10) << 1;
        int i12 = -i10;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        int i14 = i13 % 128;
        if (i13 % 2 != 0) {
            int i15 = 47 / 0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setOnItemClickListener(@NotNull String str, @NotNull String str2) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.setCompoundDrawableTintBlendMode = str;
        this.setOnFocusChangeListener = str2;
        getPinPadLandscape.setY(new Object[]{str}, 165764303, -165764303, (int) System.currentTimeMillis());
        setDividerPadding(new Object[]{this}, -346709464, 346709464, System.identityHashCode(this));
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * (-489)) + (i10 * 491);
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = ((i14 | i15 | (~i12)) * (-490)) + i13;
        int i17 = (i14 * 490) + (((~(i10 | i15)) | (~(i15 | i12))) * 490) + i16;
        if (i17 == 1) {
            return ((setOnItemClickListener) objArr[0]).setOnFocusChangeListener;
        }
        if (i17 == 2) {
            return ((setOnItemClickListener) objArr[0]).setCompoundDrawableTintBlendMode;
        }
        setOnItemClickListener setonitemclicklistener = (setOnItemClickListener) objArr[0];
        if (setonitemclicklistener.setCompoundDrawableTintBlendMode.length() == 10) {
            return null;
        }
        throw new setIndeterminateDrawable(1005, setonitemclicklistener.setCompoundDrawableTintBlendMode, null, 4, null);
    }

    @JvmName(name = "setOnFocusChangeListener")
    @NotNull
    public final String setOnFocusChangeListener() {
        return (String) setDividerPadding(new Object[]{this}, 1567811735, -1567811733, System.identityHashCode(this));
    }

    @JvmName(name = "setDividerPadding")
    @NotNull
    public final String setDividerPadding() {
        return (String) setDividerPadding(new Object[]{this}, -1512127988, 1512127989, System.identityHashCode(this));
    }
}
