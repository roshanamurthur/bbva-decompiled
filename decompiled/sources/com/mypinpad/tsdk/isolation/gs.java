package com.mypinpad.tsdk.isolation;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class gs extends fy {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f56075i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f56076j = 1;

    public /* synthetic */ class setX {
        public static final /* synthetic */ int[] setCompoundDrawableTintBlendMode;

        static {
            int[] iArr = new int[setFitsSystemWindows.values().length];
            iArr[setFitsSystemWindows.setDividerPadding.ordinal()] = 1;
            iArr[setFitsSystemWindows.setOnFocusChangeListener.ordinal()] = 2;
            setCompoundDrawableTintBlendMode = iArr;
            int i10 = 86 - 1;
            int i11 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gs(@NotNull fi fiVar, @NotNull setTextKeepState settextkeepstate, @NotNull gr grVar, @NotNull getValue getvalue) {
        super(fiVar, settextkeepstate, grVar, getvalue);
        Intrinsics.checkNotNullParameter(fiVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(grVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) throws Exception {
        Pair pair;
        int i13;
        Pair pair2;
        int i14;
        int i15;
        int i16 = ((~i11) * (-783)) + (i11 * (-782)) + (i10 * 784);
        int i17 = ~i10;
        int i18 = ~i12;
        int i19 = ((i17 | (~(i11 | i18))) * 783) + ((~(i17 | i18 | i11)) * (-783)) + i16;
        if (i19 == 1) {
            gs gsVar = (gs) objArr[0];
            setRotationX setrotationx = (setRotationX) objArr[1];
            int i20 = f56075i;
            int i21 = i20 & 69;
            int i22 = -(-((i20 ^ 69) | i21));
            int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
            f56076j = i23 % 128;
            int i24 = i23 % 2;
            Intrinsics.checkNotNullParameter(setrotationx, "");
            Pair pair3 = (Pair) setX(new Object[]{(fi) gsVar.setOnFocusChangeListener(), gsVar.setCompoundDrawableTintBlendMode(), (ew) gsVar.setX(), setrotationx, ds.setCompoundDrawableTintBlendMode}, -1336450974, 1336450974, (int) System.currentTimeMillis());
            fk fkVar = (fk) pair3.component1();
            boolean zBooleanValue = ((Boolean) pair3.component2()).booleanValue();
            if (fkVar != null) {
                int i25 = f56076j;
                int i26 = (i25 & 43) + (i25 | 43);
                int i27 = i26 % 128;
                f56075i = i27;
                int i28 = i26 % 2;
                int i29 = (((i27 & (-82)) | ((~i27) & 81)) - (~((i27 & 81) << 1))) - 1;
                f56076j = i29 % 128;
                int i30 = i29 % 2;
                return fkVar;
            }
            gr grVar = (gr) gsVar.setX();
            gr.setCompoundDrawableTintBlendMode(new Object[]{grVar, (fi) gsVar.setOnFocusChangeListener(), gsVar.setCompoundDrawableTintBlendMode()}, 575703855, -575703854, System.identityHashCode(grVar));
            if (zBooleanValue) {
                pair = new Pair(activateSession.APPROVED, fd.APPROVED);
                int i31 = f56075i;
                int i32 = i31 ^ 113;
                int i33 = (i31 & 113) << 1;
                i13 = ((i32 | i33) << 1) - (i33 ^ i32);
                f56076j = i13 % 128;
            } else {
                pair = new Pair(activateSession.NOT_AUTHORISED, fd.DECLINED);
                int i34 = f56076j;
                int i35 = i34 ^ 121;
                int i36 = -(-((i34 & 121) << 1));
                i13 = (i35 ^ i36) + ((i36 & i35) << 1);
                f56075i = i13 % 128;
            }
            int i37 = i13 % 2;
            activateSession activatesession = (activateSession) pair.component1();
            fd fdVar = (fd) pair.component2();
            gr grVar2 = (gr) gsVar.setX();
            fi fiVar = (fi) gsVar.setOnFocusChangeListener();
            setTextKeepState compoundDrawableTintBlendMode = gsVar.setCompoundDrawableTintBlendMode();
            fi fiVar2 = (fi) gsVar.setOnFocusChangeListener();
            fk fkVar2 = (fk) gr.setCompoundDrawableTintBlendMode(new Object[]{grVar2, fiVar, compoundDrawableTintBlendMode, activatesession, fdVar, (setTransitionVisibility) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{fiVar2}, -672536244, 672536278, System.identityHashCode(fiVar2))}, -1887279096, 1887279110, System.identityHashCode(grVar2));
            int i38 = f56075i + 67;
            f56076j = i38 % 128;
            int i39 = i38 % 2;
            return fkVar2;
        }
        if (i19 == 2) {
            Pair pair4 = new Pair(null, Boolean.TRUE);
            int i40 = f56075i;
            int i41 = (i40 ^ 101) + ((i40 & 101) << 1);
            f56076j = i41 % 128;
            if (i41 % 2 != 0) {
                return pair4;
            }
            throw null;
        }
        if (i19 == 3) {
            Pair pair5 = new Pair(null, Boolean.FALSE);
            int i42 = f56075i;
            int i43 = (i42 & 77) + (i42 | 77);
            f56076j = i43 % 128;
            if (i43 % 2 != 0) {
                return pair5;
            }
            throw null;
        }
        if (i19 == 4) {
            Pair pair6 = new Pair((fk) objArr[0], Boolean.FALSE);
            int i44 = f56075i;
            int i45 = i44 & 41;
            int i46 = (i44 | 41) & (~i45);
            int i47 = -(-(i45 << 1));
            int i48 = (i46 & i47) + (i46 | i47);
            f56076j = i48 % 128;
            int i49 = i48 % 2;
            return pair6;
        }
        fi fiVar3 = (fi) objArr[0];
        setTextKeepState settextkeepstate = (setTextKeepState) objArr[1];
        ew ewVar = (ew) objArr[2];
        setRotationX setrotationx2 = (setRotationX) objArr[3];
        ds dsVar = (ds) objArr[4];
        int i50 = f56075i + 65;
        f56076j = i50 % 128;
        if (i50 % 2 == 0) {
            dx dxVar = dx.INSTANCE;
            throw null;
        }
        dx dxVar2 = dx.INSTANCE;
        fk fkVar3 = (fk) dx.setY(new Object[]{dxVar2, fiVar3, settextkeepstate, setrotationx2, ewVar, dsVar}, -25863307, 25863307, System.identityHashCode(dxVar2));
        if (fkVar3 != null) {
            pair2 = new Pair(fkVar3, Boolean.FALSE);
            int i51 = f56075i;
            i14 = i51 & 109;
            i15 = (i51 ^ 109) | i14;
        } else {
            cy cyVar = new cy(fiVar3);
            bd bdVar = new bd(fiVar3);
            bb bbVar = (bb) ((setImageTintList) w.setX(new Object[]{bdVar}, 1693919772, -1693919769, System.identityHashCode(bdVar)));
            int i52 = setX.setCompoundDrawableTintBlendMode[((setFitsSystemWindows) bb.setOnFocusChangeListener(new Object[]{bbVar}, -1171807076, 1171807076, System.identityHashCode(bbVar))).ordinal()];
            if (i52 == 1) {
                Pair pair7 = (Pair) setX(new Object[0], -1115476279, 1115476281, (int) System.currentTimeMillis());
                int i53 = f56075i;
                int i54 = ((i53 ^ 119) | (i53 & 119)) << 1;
                int i55 = -(((~i53) & 119) | (i53 & (-120)));
                int i56 = (i54 & i55) + (i55 | i54);
                f56076j = i56 % 128;
                if (i56 % 2 != 0) {
                    return pair7;
                }
                int i57 = 68 / 0;
                return pair7;
            }
            if (i52 == 2) {
                Pair pair8 = (Pair) setX(new Object[0], -1972708039, 1972708042, (int) System.currentTimeMillis());
                int i58 = f56076j;
                int i59 = (i58 & (-76)) | ((~i58) & 75);
                int i60 = -(-((i58 & 75) << 1));
                int i61 = (i59 ^ i60) + ((i60 & i59) << 1);
                f56075i = i61 % 128;
                if (i61 % 2 == 0) {
                    return pair8;
                }
                throw null;
            }
            pair2 = (Pair) setX(new Object[]{ewVar.setDividerPadding(fiVar3, settextkeepstate)}, 1004491687, -1004491683, (int) System.currentTimeMillis());
            int i62 = f56075i;
            int i63 = i62 & 75;
            int i64 = i62 | 75;
            i14 = i63 & i64;
            i15 = i64 | i63;
        }
        int i65 = i14 + i15;
        f56076j = i65 % 128;
        int i66 = i65 % 2;
        return pair2;
    }

    @Override // com.mypinpad.tsdk.isolation.eb
    @NotNull
    public final fk setY(@NotNull setRotationX setrotationx) {
        return (fk) setX(new Object[]{this, setrotationx}, 1096872399, -1096872398, System.identityHashCode(this));
    }
}
