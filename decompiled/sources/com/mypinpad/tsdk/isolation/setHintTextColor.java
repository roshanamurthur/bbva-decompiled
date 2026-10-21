package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0011\u0010\r\u001a\u00020\u000bX\u0007¢\u0006\u0006\n\u0004\b\b\u0010\fR\u0011\u0010\b\u001a\u00020\u000bX\u0007¢\u0006\u0006\n\u0004\b\r\u0010\f"}, d2 = {"Lcom/mypinpad/tsdk/i/setHintTextColor;", "Lcom/mypinpad/tsdk/i/setSystemGestureExclusionRects;", "", "toString", "()Ljava/lang/String;", "Lcom/mypinpad/tsdk/i/component16;", "b", "Lcom/mypinpad/tsdk/i/component16;", "setX", "()Lcom/mypinpad/tsdk/i/component16;", "setY", "", "[B", "setCompoundDrawableTintBlendMode", "", "p0", "p1", "p2", "p3", "<init>", "(ILcom/mypinpad/tsdk/i/component16;[B[B)V"}, k = 1, mv = {1, 5, 1})
public abstract class setHintTextColor extends setSystemGestureExclusionRects {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f59789c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f59790d = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final component16 setY;

    /* JADX INFO: renamed from: setCompoundDrawableTintBlendMode, reason: from kotlin metadata */
    @NotNull
    public byte[] setX;

    /* JADX INFO: renamed from: setX, reason: from kotlin metadata */
    @NotNull
    public byte[] setCompoundDrawableTintBlendMode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setHintTextColor(int i10, @Nullable component16 component16Var, @NotNull byte[] bArr, @NotNull byte[] bArr2) {
        super(i10);
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        this.setY = component16Var;
        this.setCompoundDrawableTintBlendMode = bArr;
        this.setX = bArr2;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        setHintTextColor sethinttextcolor = (setHintTextColor) objArr[0];
        int i13 = f59790d;
        int i14 = i13 & 115;
        int i15 = -(-((i13 ^ 115) | i14));
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        f59789c = i16 % 128;
        int i17 = i16 % 2;
        component16 component16Var = sethinttextcolor.setY;
        if (i17 != 0) {
            int i18 = 29 / 0;
        }
        return component16Var;
    }

    @JvmName(name = "setX")
    @Nullable
    public final component16 setX() {
        return (component16) setCompoundDrawableTintBlendMode(new Object[]{this}, 714768134, -714768134, System.identityHashCode(this));
    }

    @NotNull
    public String toString() {
        int i10 = f59789c;
        int i11 = i10 & 5;
        int i12 = -(-(i10 | 5));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f59790d = i13 % 128;
        if (i13 % 2 != 0) {
            setRenderEffect setrendereffect = setRenderEffect.INSTANCE;
            return "";
        }
        setRenderEffect setrendereffect2 = setRenderEffect.INSTANCE;
        throw null;
    }
}
