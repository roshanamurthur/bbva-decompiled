package com.mypinpad.tsdk.isolation;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0007\u0010\fR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000b\u001a\u0004\b\u000e\u0010\fR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\fR\u001a\u0010\u0015\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006R\u001a\u0010\u0012\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0017\u0010\u0006R\u0011\u0010\u0014\u001a\u00020\u0002X\u0007¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/applicationCreated;", "", "", "a", "Ljava/lang/String;", "setDividerPadding", "()Ljava/lang/String;", "setX", "", "Lcom/mypinpad/tsdk/i/setIndeterminateDrawableTiled;", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "setCompoundDrawableTintBlendMode", "setLayoutAnimation", "Lcom/mypinpad/tsdk/i/setHorizontalScrollBarEnabled;", "d", "setY", "e", "setOnFocusChangeListener", "setOnDragListener", "f", "setOnLongClickListener"}, k = 1, mv = {1, 5, 1})
public final class applicationCreated {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53519g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f53520h = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String setX;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<setIndeterminateDrawableTiled> setDividerPadding;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<String> setLayoutAnimation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<setHorizontalScrollBarEnabled> setCompoundDrawableTintBlendMode;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String setOnDragListener;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String setY;

    /* JADX INFO: renamed from: setDividerPadding, reason: from kotlin metadata */
    @NotNull
    public String setOnFocusChangeListener;

    public applicationCreated() {
        throw null;
    }

    public applicationCreated(String str, List list, List list2, List list3, String str2, String str3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        str3 = (i10 & 32) != 0 ? "" : str3;
        str4 = (i10 & 64) != 0 ? "" : str4;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.setX = str;
        this.setDividerPadding = list;
        this.setLayoutAnimation = list2;
        this.setCompoundDrawableTintBlendMode = list3;
        this.setOnDragListener = str2;
        this.setY = str3;
        this.setOnFocusChangeListener = str4;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = ~(i13 | i10);
        int i15 = ~i12;
        int i16 = ~(i15 | i10);
        int i17 = ((i13 | i16) * 712) + (((~(i10 | i11 | i12)) | (~(i13 | i15 | i10))) * (-712)) + ((i14 | i16) * (-712)) + (i11 * 713) + (i10 * (-711));
        if (i17 == 1) {
            applicationCreated applicationcreated = (applicationCreated) objArr[0];
            int i18 = f53520h;
            int i19 = (((i18 | 114) << 1) - (i18 ^ 114)) - 1;
            f53519g = i19 % 128;
            int i20 = i19 % 2;
            List<String> list = applicationcreated.setLayoutAnimation;
            if (i20 != 0) {
                throw null;
            }
            int i21 = i18 ^ 65;
            int i22 = (((i18 & 65) | i21) << 1) - i21;
            f53519g = i22 % 128;
            if (i22 % 2 == 0) {
                return list;
            }
            int i23 = 51 / 0;
            return list;
        }
        if (i17 == 2) {
            applicationCreated applicationcreated2 = (applicationCreated) objArr[0];
            int i24 = f53519g;
            int i25 = i24 + 115;
            f53520h = i25 % 128;
            int i26 = i25 % 2;
            List<setHorizontalScrollBarEnabled> list2 = applicationcreated2.setCompoundDrawableTintBlendMode;
            int i27 = i24 + 98;
            int i28 = (i27 ^ (-1)) + (i27 << 1);
            f53520h = i28 % 128;
            if (i28 % 2 != 0) {
                return list2;
            }
            int i29 = 51 / 0;
            return list2;
        }
        if (i17 == 3) {
            applicationCreated applicationcreated3 = (applicationCreated) objArr[0];
            int i30 = f53519g;
            int i31 = ((i30 & (-18)) | ((~i30) & 17)) + ((i30 & 17) << 1);
            f53520h = i31 % 128;
            int i32 = i31 % 2;
            String str = applicationcreated3.setY;
            int i33 = (i30 ^ 93) + ((i30 & 93) << 1);
            f53520h = i33 % 128;
            if (i33 % 2 != 0) {
                return str;
            }
            throw null;
        }
        if (i17 == 4) {
            applicationCreated applicationcreated4 = (applicationCreated) objArr[0];
            int i34 = f53520h;
            int i35 = (i34 | 45) << 1;
            int i36 = ~i34;
            int i37 = -((i34 & (-46)) | (i36 & 45));
            int i38 = ((i35 | i37) << 1) - (i35 ^ i37);
            f53519g = i38 % 128;
            int i39 = i38 % 2;
            List<setIndeterminateDrawableTiled> list3 = applicationcreated4.setDividerPadding;
            if (i39 != 0) {
                throw null;
            }
            int i40 = ((i34 ^ 113) | (i34 & 113)) << 1;
            int i41 = -((i34 & (-114)) | (i36 & 113));
            int i42 = (i40 ^ i41) + ((i41 & i40) << 1);
            f53519g = i42 % 128;
            int i43 = i42 % 2;
            return list3;
        }
        if (i17 == 5) {
            applicationCreated applicationcreated5 = (applicationCreated) objArr[0];
            int i44 = f53520h + 63;
            f53519g = i44 % 128;
            int i45 = i44 % 2;
            String str2 = applicationcreated5.setOnDragListener;
            if (i45 == 0) {
                return str2;
            }
            throw null;
        }
        applicationCreated applicationcreated6 = (applicationCreated) objArr[0];
        int i46 = f53519g;
        int i47 = (i46 ^ 52) + ((i46 & 52) << 1);
        int i48 = (i47 ^ (-1)) + (i47 << 1);
        int i49 = i48 % 128;
        f53520h = i49;
        int i50 = i48 % 2;
        String str3 = applicationcreated6.setX;
        int i51 = i49 & 81;
        int i52 = -(-((i49 ^ 81) | i51));
        int i53 = (i51 & i52) + (i51 | i52);
        f53519g = i53 % 128;
        int i54 = i53 % 2;
        return str3;
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    @NotNull
    public final List<String> setCompoundDrawableTintBlendMode() {
        return (List) setOnFocusChangeListener(new Object[]{this}, 601619422, -601619421, System.identityHashCode(this));
    }

    @JvmName(name = "setDividerPadding")
    @NotNull
    public final String setDividerPadding() {
        return (String) setOnFocusChangeListener(new Object[]{this}, -315072230, 315072230, System.identityHashCode(this));
    }

    @JvmName(name = "setOnLongClickListener")
    @NotNull
    public final String setOnLongClickListener() {
        return (String) setOnFocusChangeListener(new Object[]{this}, 521662335, -521662332, System.identityHashCode(this));
    }

    @JvmName(name = "setX")
    @NotNull
    public final List<setIndeterminateDrawableTiled> setX() {
        return (List) setOnFocusChangeListener(new Object[]{this}, -1713923561, 1713923565, System.identityHashCode(this));
    }

    @JvmName(name = "setY")
    @NotNull
    public final List<setHorizontalScrollBarEnabled> setY() {
        return (List) setOnFocusChangeListener(new Object[]{this}, 2095232536, -2095232534, System.identityHashCode(this));
    }

    @JvmName(name = "setOnFocusChangeListener")
    @NotNull
    public final String setOnFocusChangeListener() {
        return (String) setOnFocusChangeListener(new Object[]{this}, 1855898331, -1855898326, System.identityHashCode(this));
    }
}
