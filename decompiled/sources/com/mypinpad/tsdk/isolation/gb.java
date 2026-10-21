package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.core.libmcrypt.impl.LibMCryptConstants;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class gb extends fx {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f55650g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f55651h = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final setClipToOutline f55652f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb(@NotNull fi fiVar, @NotNull setTextKeepState settextkeepstate, @NotNull gr grVar, @NotNull setClipToOutline setcliptooutline) {
        super(fiVar, settextkeepstate, grVar);
        Intrinsics.checkNotNullParameter(fiVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(grVar, "");
        Intrinsics.checkNotNullParameter(setcliptooutline, "");
        this.f55652f = setcliptooutline;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws Exception {
        fk fkVar;
        fk fkVar2;
        int i13 = (i11 * 517) + (i10 * (-515));
        int i14 = ~i11;
        int i15 = ~(i14 | i12);
        int i16 = ~i12;
        int i17 = i15 | (~(i16 | i10));
        int i18 = ~(i16 | i11);
        int i19 = ~i10;
        int i20 = (((~(i19 | i11)) | i18) * LibMCryptConstants.IND_HEX_SEGMENTO2) + (((~(i12 | i14 | i19)) | (~(i19 | i16 | i11))) * LibMCryptConstants.IND_HEX_SEGMENTO2) + ((i17 | i18) * (-516)) + i13;
        if (i20 != 1) {
            fkVar2 = null;
            if (i20 == 2) {
                throw new fh(32, null);
            }
            gb gbVar = (gb) objArr[0];
            getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[1];
            int i21 = f55651h;
            int i22 = ((i21 | 11) << 1) - (i21 ^ 11);
            int i23 = i22 % 128;
            f55650g = i23;
            int i24 = i22 % 2;
            if (getbeeponfailure != null) {
                int i25 = i23 & 45;
                int i26 = i25 + ((i23 ^ 45) | i25);
                f55651h = i26 % 128;
                if (i26 % 2 == 0) {
                    fi onFocusChangeListener = gbVar.setOnFocusChangeListener();
                    setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener, getbeeponfailure}, 2008358388, -2008358355, System.identityHashCode(onFocusChangeListener));
                    int i27 = 20 / 0;
                } else {
                    fi onFocusChangeListener2 = gbVar.setOnFocusChangeListener();
                    setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener2, getbeeponfailure}, 2008358388, -2008358355, System.identityHashCode(onFocusChangeListener2));
                }
            }
            int i28 = f55651h;
            int i29 = i28 ^ 91;
            int i30 = (i28 & 91) << 1;
            int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
            f55650g = i31 % 128;
            if (i31 % 2 != 0) {
                int i32 = 24 / 0;
            }
        } else {
            gb gbVar2 = (gb) objArr[0];
            int i33 = f55651h;
            int i34 = i33 & 33;
            int i35 = ((i33 | 33) & (~i34)) + (i34 << 1);
            f55650g = i35 % 128;
            if (i35 % 2 != 0) {
                setClipToOutline setcliptooutline = gbVar2.f55652f;
                setDividerPadding(new Object[]{gbVar2, (getBeepOnFailure) setClipToOutline.setOnFocusChangeListener(new Object[]{setcliptooutline}, -858335374, 858335378, System.identityHashCode(setcliptooutline))}, -1204314795, 1204314795, System.identityHashCode(gbVar2));
                setClipToOutline setcliptooutline2 = gbVar2.f55652f;
                setDividerPadding(new Object[]{gbVar2, (getBeepOnFailure) setClipToOutline.setOnFocusChangeListener(new Object[]{setcliptooutline2}, -1323114687, 1323114690, System.identityHashCode(setcliptooutline2))}, -1204314795, 1204314795, System.identityHashCode(gbVar2));
                fkVar = fk.setOnEditorActionListener;
                int i36 = 24 / 0;
            } else {
                setClipToOutline setcliptooutline3 = gbVar2.f55652f;
                setDividerPadding(new Object[]{gbVar2, (getBeepOnFailure) setClipToOutline.setOnFocusChangeListener(new Object[]{setcliptooutline3}, -858335374, 858335378, System.identityHashCode(setcliptooutline3))}, -1204314795, 1204314795, System.identityHashCode(gbVar2));
                setClipToOutline setcliptooutline4 = gbVar2.f55652f;
                setDividerPadding(new Object[]{gbVar2, (getBeepOnFailure) setClipToOutline.setOnFocusChangeListener(new Object[]{setcliptooutline4}, -1323114687, 1323114690, System.identityHashCode(setcliptooutline4))}, -1204314795, 1204314795, System.identityHashCode(gbVar2));
                fkVar = fk.setOnEditorActionListener;
            }
            fkVar2 = fkVar;
            int i37 = f55650g + 17;
            f55651h = i37 % 128;
            int i38 = i37 % 2;
        }
        return fkVar2;
    }

    @Override // com.mypinpad.tsdk.isolation.ec
    @Nullable
    public final Object setX(@NotNull a aVar) {
        return setDividerPadding(new Object[]{this, aVar}, 579696369, -579696368, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ec
    @Nullable
    public final Object setDividerPadding(@NotNull Continuation<? super fk> continuation) {
        return setDividerPadding(new Object[]{this, continuation}, 2048002676, -2048002674, System.identityHashCode(this));
    }
}
