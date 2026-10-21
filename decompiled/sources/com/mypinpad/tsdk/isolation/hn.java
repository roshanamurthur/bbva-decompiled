package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class hn extends hh {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f56211j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f56212k = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final et f56213i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hn(@NotNull gv gvVar, @NotNull setTextKeepState settextkeepstate, @NotNull ex exVar, @NotNull getValue getvalue, @NotNull et etVar) {
        super(gvVar, settextkeepstate, exVar, getvalue);
        Intrinsics.checkNotNullParameter(gvVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(exVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        Intrinsics.checkNotNullParameter(etVar, "");
        this.f56213i = etVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v7, types: [com.mypinpad.tsdk.i.setScrollBarDefaultDelayBeforeFade] */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws Exception {
        int i13 = ~i11;
        int i14 = ~i10;
        int i15 = ~i12;
        int i16 = (((~(i10 | i11)) | (~(i13 | i14)) | (~(i15 | i11))) * 494) + ((i11 | i14 | i15) * 494) + ((i10 | i13) * (-988)) + (i11 * (-493)) + (i10 * 495);
        if (i16 == 1) {
            a aVar = (a) objArr[1];
            int i17 = f56212k;
            int i18 = (i17 ^ 33) + ((i17 & 33) << 1);
            f56211j = i18 % 128;
            if (i18 % 2 != 0) {
                Intrinsics.checkNotNullParameter(aVar, "");
                fk fkVar = fk.setX;
                throw null;
            }
            Intrinsics.checkNotNullParameter(aVar, "");
            fk fkVar2 = fk.setIncludeFontPadding;
            int i19 = f56212k;
            int i20 = i19 & 117;
            int i21 = i19 | 117;
            int i22 = (i20 & i21) + (i21 | i20);
            f56211j = i22 % 128;
            int i23 = i22 % 2;
            return fkVar2;
        }
        if (i16 != 2) {
            if (i16 != 3) {
                hn hnVar = (hn) objArr[0];
                int i24 = f56211j + 33;
                f56212k = i24 % 128;
                int i25 = i24 % 2;
                et etVar = hnVar.f56213i;
                et.setDividerPadding(new Object[]{(gv) hnVar.setOnFocusChangeListener()}, 338249870, -338249868, (int) System.currentTimeMillis());
                fk compoundDrawableTintBlendMode = ex.setCompoundDrawableTintBlendMode((ex) hnVar.setX(), (gv) hnVar.setOnFocusChangeListener(), hnVar.setCompoundDrawableTintBlendMode(), fd.END_APPLICATION, null, null, null, setDrawSelectorOnTop.setOnFocusChangeListener, null, false, 184);
                int i26 = f56211j;
                int i27 = i26 & 109;
                int i28 = (((i26 ^ 109) | i27) << 1) - ((i26 | 109) & (~i27));
                f56212k = i28 % 128;
                if (i28 % 2 != 0) {
                    return compoundDrawableTintBlendMode;
                }
                int i29 = 81 / 0;
                return compoundDrawableTintBlendMode;
            }
            hn hnVar2 = (hn) objArr[0];
            setRotationX setrotationx = (setRotationX) objArr[1];
            int i30 = f56211j + 9;
            f56212k = i30 % 128;
            int i31 = i30 % 2;
            Intrinsics.checkNotNullParameter(setrotationx, "");
            et etVar2 = hnVar2.f56213i;
            et.setDividerPadding(new Object[]{(gv) hnVar2.setOnFocusChangeListener()}, 338249870, -338249868, (int) System.currentTimeMillis());
            ex exVar = (ex) hnVar2.setX();
            ?? onFocusChangeListener = hnVar2.setOnFocusChangeListener();
            setTextKeepState compoundDrawableTintBlendMode2 = hnVar2.setCompoundDrawableTintBlendMode();
            activateSession activatesession = activateSession.PRESENT_CARD_AGAIN;
            ValueQualifier valueQualifier = ValueQualifier.setOnFocusChangeListener;
            byte[] bArr = new byte[3];
            int i32 = f56212k;
            int i33 = i32 & 15;
            int i34 = i33 + ((i32 ^ 15) | i33);
            f56211j = i34 % 128;
            int i35 = i34 % 2;
            int i36 = 0;
            while (i36 < 3) {
                int i37 = f56211j + 27;
                int i38 = i37 % 128;
                f56212k = i38;
                if (i37 % 2 == 0) {
                    bArr[i36] = 0;
                    i36 = 0;
                } else {
                    bArr[i36] = 0;
                    i36 = (((i36 ^ 1) | (i36 & 1)) << 1) - (((~i36) & 1) | (i36 & (-2)));
                }
                int i39 = i38 & 77;
                int i40 = i39 + ((i38 ^ 77) | i39);
                f56211j = i40 % 128;
                int i41 = i40 % 2;
            }
            fk dividerPadding = ex.setDividerPadding(exVar, onFocusChangeListener, compoundDrawableTintBlendMode2, activatesession, valueQualifier, bArr, fd.END_APPLICATION, getY.setOnFocusChangeListener, Boolean.FALSE, activateSession.PRESENT_CARD_AGAIN, (setItemChecked) setRotationX.setX(new Object[]{setrotationx}, 2020716727, -2020716721, System.identityHashCode(setrotationx)), null, null, null, null, null, null, null, null, false, false, 4193280);
            int i42 = f56211j + 79;
            f56212k = i42 % 128;
            if (i42 % 2 != 0) {
                return dividerPadding;
            }
            throw null;
        }
        hn hnVar3 = (hn) objArr[0];
        setRotationX setrotationx2 = (setRotationX) objArr[1];
        int i43 = f56212k;
        int i44 = (i43 & (-76)) | ((~i43) & 75);
        int i45 = (i43 & 75) << 1;
        int i46 = (i44 & i45) + (i45 | i44);
        f56211j = i46 % 128;
        if (i46 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setrotationx2, "");
            ((Boolean) setRotationX.setX(new Object[]{setrotationx2}, -268504199, 268504206, System.identityHashCode(setrotationx2))).booleanValue();
            throw null;
        }
        Intrinsics.checkNotNullParameter(setrotationx2, "");
        if (((Boolean) setRotationX.setX(new Object[]{setrotationx2}, -268504199, 268504206, System.identityHashCode(setrotationx2))).booleanValue()) {
            gv gvVar = (gv) hnVar3.setOnFocusChangeListener();
            if (!((setMaxWidth) gv.setOnFocusChangeListener(new Object[]{gvVar}, -242476784, 242476788, System.identityHashCode(gvVar))).isEmpty()) {
                int i47 = f56211j;
                int i48 = i47 ^ 43;
                int i49 = ((i47 & 43) | i48) << 1;
                int i50 = -i48;
                int i51 = (i49 ^ i50) + ((i50 & i49) << 1);
                f56212k = i51 % 128;
                int i52 = i51 % 2;
                int i53 = ((i47 & 24) + (i47 | 24)) - 1;
                f56212k = i53 % 128;
                int i54 = i53 % 2;
                gv gvVar2 = (gv) hnVar3.setOnFocusChangeListener();
                getBeepOnFailure getbeeponfailureRemove = ((setMaxWidth) gv.setOnFocusChangeListener(new Object[]{gvVar2}, -242476784, 242476788, System.identityHashCode(gvVar2))).remove(0);
                Intrinsics.checkNotNullExpressionValue(getbeeponfailureRemove, "");
                hnVar3.setY().setOnFocusChangeListener(new getAmountGroupSeparator(getbeeponfailureRemove));
                fk fkVar3 = fk.setIncludeFontPadding;
                int i55 = f56212k;
                int i56 = i55 & 13;
                int i57 = (i55 ^ 13) | i56;
                int i58 = (i56 & i57) + (i57 | i56);
                f56211j = i58 % 128;
                if (i58 % 2 == 0) {
                    return fkVar3;
                }
                throw null;
            }
            int i59 = f56211j + 19;
            f56212k = i59 % 128;
            int i60 = i59 % 2;
            gv gvVar3 = (gv) hnVar3.setOnFocusChangeListener();
            getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar3, setAnimation.setBottom()}, -1593889019, 1593889062, System.identityHashCode(gvVar3));
            Intrinsics.checkNotNull(getbeeponfailure);
            byte b10 = ((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure)))[0];
            int i61 = b10 ^ (-128);
            int i62 = b10 & (-128);
            byte b11 = (byte) ((i62 & i61) | (i61 ^ i62));
            gv gvVar4 = (gv) hnVar3.setOnFocusChangeListener();
            getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar4, setAnimation.setBottom()}, -1593889019, 1593889062, System.identityHashCode(gvVar4));
            Intrinsics.checkNotNull(getbeeponfailure2);
            ((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 252497730, -252497710, System.identityHashCode(getbeeponfailure2)))[0] = b11;
            int i63 = f56211j + 35;
            f56212k = i63 % 128;
            int i64 = i63 % 2;
        }
        ih ihVar = ih.INSTANCE;
        hnVar3.setY().setOnFocusChangeListener((setImeActionLabel) ih.setX(new Object[]{ihVar, (gv) hnVar3.setOnFocusChangeListener()}, -1216037535, 1216037537, System.identityHashCode(ihVar)));
        fk fkVar4 = fk.setAlwaysDrawnWithCacheEnabled;
        int i65 = f56211j;
        int i66 = ((i65 | 115) << 1) - (i65 ^ 115);
        f56212k = i66 % 128;
        if (i66 % 2 != 0) {
            return fkVar4;
        }
        throw null;
    }

    @Override // com.mypinpad.tsdk.isolation.ec
    @NotNull
    public final fk setCompoundDrawableTintBlendMode(@NotNull a aVar) {
        return (fk) setDividerPadding(new Object[]{this, aVar}, -2008536570, 2008536571, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ec
    @NotNull
    public final fk setNavigationOnClickListener() {
        return (fk) setDividerPadding(new Object[]{this}, 2005970998, -2005970998, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.eb
    @NotNull
    public final fk setX(@NotNull setRotationX setrotationx) {
        return (fk) setDividerPadding(new Object[]{this, setrotationx}, 1503418262, -1503418259, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.eb
    @NotNull
    public final fk setY(@NotNull setRotationX setrotationx) {
        return (fk) setDividerPadding(new Object[]{this, setrotationx}, -1151561306, 1151561308, System.identityHashCode(this));
    }
}
