package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0005\b\t\n\u000b\f"}, d2 = {"Lcom/mypinpad/tsdk/i/setHorizontalScrollBarEnabled;", "", "", "a", "Ljava/lang/String;", "setDividerPadding", "()Ljava/lang/String;", "setOnFocusChangeListener", "Lcom/mypinpad/tsdk/i/setLogoDescription;", "Lcom/mypinpad/tsdk/i/setFriction;", "Lcom/mypinpad/tsdk/i/setBreakStrategy;", "Lcom/mypinpad/tsdk/i/setSupportBackgroundTintList;", "Lcom/mypinpad/tsdk/i/setDividerHeight;"}, k = 1, mv = {1, 5, 1})
public abstract class setHorizontalScrollBarEnabled {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f59805b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String setOnFocusChangeListener;

    public setHorizontalScrollBarEnabled(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this.setOnFocusChangeListener = str;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        setHorizontalScrollBarEnabled sethorizontalscrollbarenabled = (setHorizontalScrollBarEnabled) objArr[0];
        int i13 = f59805b;
        int i14 = ((i13 ^ 43) | (i13 & 43)) << 1;
        int i15 = -(((~i13) & 43) | (i13 & (-44)));
        int i16 = (i14 & i15) + (i15 | i14);
        int i17 = i16 % 128;
        int i18 = i16 % 2;
        String str = sethorizontalscrollbarenabled.setOnFocusChangeListener;
        int i19 = i17 & 119;
        int i20 = (i17 | 119) & (~i19);
        int i21 = -(-(i19 << 1));
        int i22 = (i20 & i21) + (i20 | i21);
        f59805b = i22 % 128;
        int i23 = i22 % 2;
        return str;
    }

    @JvmName(name = "setDividerPadding")
    @NotNull
    public final String setDividerPadding() {
        return (String) setOnFocusChangeListener(new Object[]{this}, 1383818273, -1383818273, System.identityHashCode(this));
    }
}
