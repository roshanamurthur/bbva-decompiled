package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b&\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010*\u001a\u00020\u0005\u0012\b\u0010+\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010,\u001a\u00020\u0011\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010.\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010/\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010&¢\u0006\u0004\b1\u00102J\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u000e\u001a\u00020\u00118\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u001c8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u0019\u001a\u0004\u0018\u00010!8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0013\u0010\b\u001a\u0004\u0018\u00010&X\u0007¢\u0006\u0006\n\u0004\b\u001b\u0010'"}, d2 = {"Lcom/mypinpad/tsdk/i/setSelectedGroup;", "Lcom/mypinpad/tsdk/i/setSystemGestureExclusionRects;", "", "toString", "()Ljava/lang/String;", "Lcom/mypinpad/tsdk/i/setClipChildren;", "b", "Lcom/mypinpad/tsdk/i/setClipChildren;", "setOnFocusChangeListener", "()Lcom/mypinpad/tsdk/i/setClipChildren;", "getNavBarTitleString", "Lcom/mypinpad/tsdk/i/setProgressTintList;", "c", "Lcom/mypinpad/tsdk/i/setProgressTintList;", "setCompoundDrawableTintBlendMode", "()Lcom/mypinpad/tsdk/i/setProgressTintList;", "setOnLongClickListener", "", "d", "Z", "setX", "()Z", "", "e", "[B", "setY", "()[B", "setDividerPadding", "Lcom/mypinpad/tsdk/i/SessionActivationFailureCause;", "f", "Lcom/mypinpad/tsdk/i/SessionActivationFailureCause;", "setNavigationOnClickListener", "()Lcom/mypinpad/tsdk/i/SessionActivationFailureCause;", "Lcom/mypinpad/tsdk/i/setSaveFromParentEnabled;", "g", "Lcom/mypinpad/tsdk/i/setSaveFromParentEnabled;", "setOnDragListener", "()Lcom/mypinpad/tsdk/i/setSaveFromParentEnabled;", "Lcom/mypinpad/tsdk/i/component16;", "Lcom/mypinpad/tsdk/i/component16;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "<init>", "(ILcom/mypinpad/tsdk/i/setClipChildren;Lcom/mypinpad/tsdk/i/setProgressTintList;Z[BLcom/mypinpad/tsdk/i/SessionActivationFailureCause;Lcom/mypinpad/tsdk/i/setSaveFromParentEnabled;Lcom/mypinpad/tsdk/i/component16;)V"}, k = 1, mv = {1, 5, 1})
public abstract class setSelectedGroup extends setSystemGestureExclusionRects {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f60544h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f60545i = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final setClipChildren getNavBarTitleString;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final setProgressTintList setOnLongClickListener;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final boolean setCompoundDrawableTintBlendMode;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final byte[] setDividerPadding;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final SessionActivationFailureCause setX;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final setSaveFromParentEnabled setY;

    /* JADX INFO: renamed from: setDividerPadding, reason: from kotlin metadata */
    @Nullable
    public component16 setOnFocusChangeListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setSelectedGroup(int i10, @NotNull setClipChildren setclipchildren, @Nullable setProgressTintList setprogresstintlist, boolean z10, @Nullable byte[] bArr, @Nullable SessionActivationFailureCause sessionActivationFailureCause, @Nullable setSaveFromParentEnabled setsavefromparentenabled, @Nullable component16 component16Var) {
        super(i10);
        Intrinsics.checkNotNullParameter(setclipchildren, "");
        this.getNavBarTitleString = setclipchildren;
        this.setOnLongClickListener = setprogresstintlist;
        this.setCompoundDrawableTintBlendMode = z10;
        this.setDividerPadding = bArr;
        this.setX = sessionActivationFailureCause;
        this.setY = setsavefromparentenabled;
        this.setOnFocusChangeListener = component16Var;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = (~i12) | i13;
        int i15 = (((~i14) | i10) * 226) + (i11 * (-112)) + (i10 * (-112));
        int i16 = ~i10;
        int i17 = ((~(i13 | i12)) * 113) + (((~(i10 | i14)) | (~(i11 | i16)) | (~(i16 | i12))) * (-113)) + i15;
        if (i17 == 1) {
            setSelectedGroup setselectedgroup = (setSelectedGroup) objArr[0];
            int i18 = f60544h + 82;
            int i19 = (i18 ^ (-1)) + (i18 << 1);
            f60545i = i19 % 128;
            int i20 = i19 % 2;
            byte[] bArr = setselectedgroup.setDividerPadding;
            if (i20 != 0) {
                return bArr;
            }
            throw null;
        }
        if (i17 == 2) {
            setSelectedGroup setselectedgroup2 = (setSelectedGroup) objArr[0];
            int i21 = f60544h;
            int i22 = i21 & 33;
            int i23 = -(-((i21 ^ 33) | i22));
            int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
            int i25 = i24 % 128;
            f60545i = i25;
            int i26 = i24 % 2;
            setSaveFromParentEnabled setsavefromparentenabled = setselectedgroup2.setY;
            int i27 = (i25 & (-10)) | ((~i25) & 9);
            int i28 = -(-((i25 & 9) << 1));
            int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
            f60544h = i29 % 128;
            if (i29 % 2 == 0) {
                return setsavefromparentenabled;
            }
            int i30 = 58 / 0;
            return setsavefromparentenabled;
        }
        if (i17 == 3) {
            setSelectedGroup setselectedgroup3 = (setSelectedGroup) objArr[0];
            int i31 = f60545i;
            int i32 = (i31 & (-114)) | ((~i31) & 113);
            int i33 = (i31 & 113) << 1;
            int i34 = (i32 & i33) + (i33 | i32);
            int i35 = i34 % 128;
            f60544h = i35;
            int i36 = i34 % 2;
            SessionActivationFailureCause sessionActivationFailureCause = setselectedgroup3.setX;
            int i37 = i35 + 25;
            f60545i = i37 % 128;
            if (i37 % 2 != 0) {
                return sessionActivationFailureCause;
            }
            throw null;
        }
        if (i17 == 4) {
            setSelectedGroup setselectedgroup4 = (setSelectedGroup) objArr[0];
            System.identityHashCode(setselectedgroup4);
            System.identityHashCode(setselectedgroup4);
            setClipChildren setclipchildren = setselectedgroup4.getNavBarTitleString;
            int i38 = f60545i;
            int i39 = (i38 & 87) + (i38 | 87);
            f60544h = i39 % 128;
            if (i39 % 2 == 0) {
                return setclipchildren;
            }
            throw null;
        }
        if (i17 != 5) {
            setSelectedGroup setselectedgroup5 = (setSelectedGroup) objArr[0];
            int i40 = f60545i;
            int i41 = (i40 ^ 51) + ((i40 & 51) << 1);
            f60544h = i41 % 128;
            int i42 = i41 % 2;
            setProgressTintList setprogresstintlist = setselectedgroup5.setOnLongClickListener;
            if (i42 == 0) {
                return setprogresstintlist;
            }
            int i43 = 16 / 0;
            return setprogresstintlist;
        }
        setSelectedGroup setselectedgroup6 = (setSelectedGroup) objArr[0];
        int i44 = f60545i;
        int i45 = ((i44 ^ 8) + ((i44 & 8) << 1)) - 1;
        int i46 = i45 % 128;
        f60544h = i46;
        int i47 = i45 % 2;
        boolean z10 = setselectedgroup6.setCompoundDrawableTintBlendMode;
        int i48 = ((-1) << 1) - ((-1) ^ ((i46 & 54) + (i46 | 54)));
        f60545i = i48 % 128;
        int i49 = i48 % 2;
        return Boolean.valueOf(z10);
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    @Nullable
    public final setProgressTintList setCompoundDrawableTintBlendMode() {
        return (setProgressTintList) setOnFocusChangeListener(new Object[]{this}, -1836225693, 1836225693, System.identityHashCode(this));
    }

    @JvmName(name = "setNavigationOnClickListener")
    @Nullable
    public final SessionActivationFailureCause setNavigationOnClickListener() {
        return (SessionActivationFailureCause) setOnFocusChangeListener(new Object[]{this}, -1093762156, 1093762159, System.identityHashCode(this));
    }

    @JvmName(name = "setOnDragListener")
    @Nullable
    public final setSaveFromParentEnabled setOnDragListener() {
        return (setSaveFromParentEnabled) setOnFocusChangeListener(new Object[]{this}, -581072750, 581072752, System.identityHashCode(this));
    }

    @JvmName(name = "setX")
    public final boolean setX() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, 1719180190, -1719180185, System.identityHashCode(this))).booleanValue();
    }

    @JvmName(name = "setY")
    @Nullable
    public final byte[] setY() {
        return (byte[]) setOnFocusChangeListener(new Object[]{this}, -758206076, 758206077, System.identityHashCode(this));
    }

    @NotNull
    public String toString() {
        int i10 = f60545i;
        int i11 = (((i10 | 60) << 1) - (i10 ^ 60)) - 1;
        f60544h = i11 % 128;
        int i12 = i11 % 2;
        setRenderEffect setrendereffect = setRenderEffect.INSTANCE;
        int i13 = f60544h + 57;
        f60545i = i13 % 128;
        if (i13 % 2 != 0) {
            return "";
        }
        throw null;
    }

    @JvmName(name = "setOnFocusChangeListener")
    @NotNull
    public final setClipChildren setOnFocusChangeListener() {
        return (setClipChildren) setOnFocusChangeListener(new Object[]{this}, -648065664, 648065668, System.identityHashCode(this));
    }
}
