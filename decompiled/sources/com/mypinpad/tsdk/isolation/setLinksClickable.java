package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0013\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u001a\u0010\r\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/setLinksClickable;", "", "", "a", "J", "setY", "()J", "b", "setX", "c", "setOnFocusChangeListener", "setCompoundDrawableTintBlendMode", "d", "setDividerPadding", "e", "p0", "p1", "p2", "p3", "p4", "<init>", "(JJJJJ)V"}, k = 1, mv = {1, 5, 1})
public final class setLinksClickable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f60028f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f60029g = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long setY;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final long setX;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final long setCompoundDrawableTintBlendMode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final long setDividerPadding;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final long setOnFocusChangeListener;

    public setLinksClickable(long j10, long j11, long j12, long j13, long j14) {
        this.setY = j10;
        this.setX = j11;
        this.setCompoundDrawableTintBlendMode = j12;
        this.setDividerPadding = j13;
        this.setOnFocusChangeListener = j14;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        long j10;
        int i13 = ((~(i10 | i11 | i12)) * (-301)) + (i11 * 302) + (i10 * (-300));
        int i14 = ~i11;
        int i15 = (((~((~i10) | i12)) | i14) * 301) + (((~(i14 | i12)) | (~((~i12) | i10))) * (-301)) + i13;
        if (i15 == 1) {
            setLinksClickable setlinksclickable = (setLinksClickable) objArr[0];
            int i16 = f60028f;
            int i17 = ((i16 & 112) + (i16 | 112)) - 1;
            int i18 = i17 % 128;
            f60029g = i18;
            if (i17 % 2 == 0) {
                j10 = setlinksclickable.setOnFocusChangeListener;
                int i19 = 12 / 0;
            } else {
                j10 = setlinksclickable.setOnFocusChangeListener;
            }
            int i20 = i18 + 19;
            f60028f = i20 % 128;
            int i21 = i20 % 2;
            return Long.valueOf(j10);
        }
        if (i15 == 2) {
            setLinksClickable setlinksclickable2 = (setLinksClickable) objArr[0];
            int i22 = f60029g + 5;
            f60028f = i22 % 128;
            if (i22 % 2 == 0) {
                return Long.valueOf(setlinksclickable2.setX);
            }
            long j11 = setlinksclickable2.setX;
            throw null;
        }
        if (i15 == 3) {
            setLinksClickable setlinksclickable3 = (setLinksClickable) objArr[0];
            int i23 = f60029g + 25;
            int i24 = i23 % 128;
            f60028f = i24;
            if (i23 % 2 != 0) {
                long j12 = setlinksclickable3.setY;
                throw null;
            }
            long j13 = setlinksclickable3.setY;
            int i25 = i24 & 77;
            int i26 = (i25 - (~(-(-((i24 ^ 77) | i25))))) - 1;
            f60029g = i26 % 128;
            int i27 = i26 % 2;
            return Long.valueOf(j13);
        }
        if (i15 == 4) {
            setLinksClickable setlinksclickable4 = (setLinksClickable) objArr[0];
            int i28 = f60029g;
            int i29 = i28 ^ 57;
            int i30 = (i28 & 57) << 1;
            int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
            int i32 = i31 % 128;
            f60028f = i32;
            int i33 = i31 % 2;
            long j14 = setlinksclickable4.setDividerPadding;
            int i34 = i32 + 77;
            f60029g = i34 % 128;
            int i35 = i34 % 2;
            return Long.valueOf(j14);
        }
        setLinksClickable setlinksclickable5 = (setLinksClickable) objArr[0];
        int i36 = f60029g;
        int i37 = ((((i36 ^ 17) | (i36 & 17)) << 1) - (~(-(((~i36) & 17) | (i36 & (-18)))))) - 1;
        int i38 = i37 % 128;
        f60028f = i38;
        if (i37 % 2 != 0) {
            long j15 = setlinksclickable5.setCompoundDrawableTintBlendMode;
            throw null;
        }
        long j16 = setlinksclickable5.setCompoundDrawableTintBlendMode;
        int i39 = i38 + 73;
        f60029g = i39 % 128;
        if (i39 % 2 != 0) {
            return Long.valueOf(j16);
        }
        throw null;
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    public final long setCompoundDrawableTintBlendMode() {
        return ((Long) setY(new Object[]{this}, 1067389134, -1067389133, System.identityHashCode(this))).longValue();
    }

    @JvmName(name = "setDividerPadding")
    public final long setDividerPadding() {
        return ((Long) setY(new Object[]{this}, 1437177834, -1437177830, System.identityHashCode(this))).longValue();
    }

    @JvmName(name = "setOnFocusChangeListener")
    public final long setOnFocusChangeListener() {
        return ((Long) setY(new Object[]{this}, 2054346920, -2054346920, System.identityHashCode(this))).longValue();
    }

    @JvmName(name = "setX")
    public final long setX() {
        return ((Long) setY(new Object[]{this}, -1606976429, 1606976431, System.identityHashCode(this))).longValue();
    }

    public /* synthetic */ setLinksClickable(long j10, long j11, long j12, long j13, long j14, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 10000L : j10, (i10 & 2) != 0 ? 5000L : j11, (i10 & 4) != 0 ? 30000L : j12, (i10 & 8) == 0 ? j13 : 10000L, (i10 & 16) == 0 ? j14 : 30000L);
    }

    public setLinksClickable() {
        this(0L, 0L, 0L, 0L, 0L, 31, null);
    }

    @JvmName(name = "setY")
    public final long setY() {
        return ((Long) setY(new Object[]{this}, -453105872, 453105875, System.identityHashCode(this))).longValue();
    }
}
