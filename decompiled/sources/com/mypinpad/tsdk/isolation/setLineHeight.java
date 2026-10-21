package com.mypinpad.tsdk.isolation;

import android.content.Context;
import android.graphics.Canvas;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setLineHeight implements setIndeterminateTintMode {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f59992c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f59993d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public onOptionsItemSelected f59994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public setGravity f59995b;

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        setFadingEdgeLength setfadingedgelength;
        onOptionsItemSelected onoptionsitemselected;
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = ~(i13 | i14);
        if ((i15 * 446) + (((~(i10 | i14 | i12)) | (~(i11 | i13))) * 446) + (((~((~i12) | i14)) | i15) * 446) + (i11 * (-445)) + (i10 * (-445)) != 1) {
            setLineHeight setlineheight = (setLineHeight) objArr[0];
            setGravity setgravity = (setGravity) objArr[1];
            onOptionsItemSelected onoptionsitemselected2 = (onOptionsItemSelected) objArr[2];
            int i16 = f59993d;
            int i17 = i16 & 41;
            int i18 = (((i16 | 41) & (~i17)) - (~(i17 << 1))) - 1;
            f59992c = i18 % 128;
            int i19 = i18 % 2;
            Intrinsics.checkNotNullParameter(setgravity, "");
            Intrinsics.checkNotNullParameter(onoptionsitemselected2, "");
            setlineheight.f59994a = onoptionsitemselected2;
            setlineheight.f59995b = setgravity;
            int i20 = f59992c;
            int i21 = i20 & 23;
            int i22 = (i20 | 23) & (~i21);
            int i23 = -(-(i21 << 1));
            int i24 = (i22 & i23) + (i22 | i23);
            f59993d = i24 % 128;
            if (i24 % 2 == 0) {
                int i25 = 53 / 0;
            }
            return null;
        }
        setLineHeight setlineheight2 = (setLineHeight) objArr[0];
        Context context = (Context) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        Canvas canvas = (Canvas) objArr[4];
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(canvas, "");
        setSupportImageTintList setsupportimagetintlist = new setSupportImageTintList(3, 5);
        setGravity setgravity2 = setlineheight2.f59995b;
        if (setgravity2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            setgravity2 = null;
        }
        int includeFontPadding = setgravity2.setIncludeFontPadding();
        setGravity setgravity3 = setlineheight2.f59995b;
        if (setgravity3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            setgravity3 = null;
        }
        setMinLines setminlines = new setMinLines(setsupportimagetintlist, iIntValue, iIntValue2, includeFontPadding, setgravity3.setZ());
        setGravity setgravity4 = setlineheight2.f59995b;
        if (setgravity4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            setgravity4 = null;
        }
        setGravity setgravity5 = setlineheight2.f59995b;
        if (setgravity5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            setgravity5 = null;
        }
        if (setgravity5.setZ() == 0.0f) {
            setfadingedgelength = null;
        } else {
            mv mvVar = new mv(0, 0);
            mv mvVar2 = new mv(2, 0);
            mv mvVar3 = new mv(0, 3);
            mv mvVar4 = new mv(2, 3);
            setGravity setgravity6 = setlineheight2.f59995b;
            if (setgravity6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                setgravity6 = null;
            }
            setfadingedgelength = new setFadingEdgeLength(mvVar, mvVar2, mvVar3, mvVar4, setgravity6.setZ());
        }
        setBottomEdgeEffectColor setbottomedgeeffectcolor = new setBottomEdgeEffectColor(context, setgravity4, canvas, setminlines, setfadingedgelength);
        setbottomedgeeffectcolor.setY();
        onOptionsItemSelected onoptionsitemselected3 = setlineheight2.f59994a;
        if (onoptionsitemselected3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            onoptionsitemselected = null;
        } else {
            onoptionsitemselected = onoptionsitemselected3;
        }
        try {
            getMetadata[] getmetadataArr = {new setImeOptions(onoptionsitemselected.setX()[0], new mv(0, 0)), new setImeOptions(onoptionsitemselected.setX()[1], new mv(1, 0)), new setImeOptions(onoptionsitemselected.setX()[2], new mv(2, 0)), new setImeOptions(onoptionsitemselected.setX()[3], new mv(0, 1)), new setImeOptions(onoptionsitemselected.setX()[4], new mv(1, 1)), new setImeOptions(onoptionsitemselected.setX()[5], new mv(2, 1)), new setImeOptions(onoptionsitemselected.setX()[6], new mv(0, 2)), new setImeOptions(onoptionsitemselected.setX()[7], new mv(1, 2)), new setImeOptions(onoptionsitemselected.setX()[8], new mv(2, 2)), new setImeOptions(onoptionsitemselected.setX()[9], new mv(1, 3)), new setTextMetricsParams(new mv(1, 4), false, 2, null), new setImageDrawable(new mv(2, 3)), new setNestedScrollingEnabled(new mv(0, 3))};
            CloseableKt.closeFinally(onoptionsitemselected, null);
            return setbottomedgeeffectcolor.setCompoundDrawableTintBlendMode(getmetadataArr);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(onoptionsitemselected, th2);
                throw th3;
            }
        }
    }

    @Override // com.mypinpad.tsdk.isolation.setIndeterminateTintMode
    public final void setDividerPadding(@NotNull setGravity setgravity, @NotNull onOptionsItemSelected onoptionsitemselected) {
        setX(new Object[]{this, setgravity, onoptionsitemselected}, 932216178, -932216178, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setIndeterminateTintMode
    @NotNull
    public final setCollapseIcon[] y_(@NotNull Context context, int i10, int i11, @NotNull Canvas canvas) {
        return (setCollapseIcon[]) setX(new Object[]{this, context, Integer.valueOf(i10), Integer.valueOf(i11), canvas}, 57858020, -57858019, i10);
    }
}
