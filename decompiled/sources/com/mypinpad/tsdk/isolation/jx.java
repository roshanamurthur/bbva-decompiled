package com.mypinpad.tsdk.isolation;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class jx extends jh {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f56721l = 0;
    public static int m = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final iw f56722k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx(@NotNull iv ivVar, @NotNull setTextKeepState settextkeepstate, @NotNull kc kcVar, @NotNull getValue getvalue, @NotNull iw iwVar) {
        super(ivVar, settextkeepstate, kcVar, getvalue);
        Intrinsics.checkNotNullParameter(ivVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(kcVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        Intrinsics.checkNotNullParameter(iwVar, "");
        this.f56722k = iwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws Exception {
        fd fdVar;
        jx jxVar = (jx) objArr[0];
        setRotationX setrotationx = (setRotationX) objArr[1];
        System.identityHashCode(jxVar);
        System.identityHashCode(jxVar);
        Intrinsics.checkNotNullParameter(setrotationx, "");
        setNextFocusLeftId setnextfocusleftid = setNextFocusLeftId.INSTANCE;
        if (((Boolean) setNextFocusLeftId.setDividerPadding(new Object[]{(byte[]) setRotationX.setX(new Object[]{setrotationx}, 1043258083, -1043258081, System.identityHashCode(setrotationx)), getEmvLibVersion.setCompoundDrawableTintBlendMode}, 177165021, -177165021, (int) System.currentTimeMillis())).booleanValue()) {
            int i13 = m;
            int i14 = i13 & 53;
            int i15 = -(-((i13 ^ 53) | i14));
            int i16 = (i14 & i15) + (i15 | i14);
            f56721l = i16 % 128;
            int i17 = i16 % 2;
            iw iwVar = jxVar.f56722k;
            if (!((Boolean) iw.setOnFocusChangeListener(new Object[]{iwVar}, -1546748914, 1546748916, System.identityHashCode(iwVar))).booleanValue()) {
                int i18 = m;
                int i19 = (((i18 & (-30)) | ((~i18) & 29)) - (~(-(-((i18 & 29) << 1))))) - 1;
                f56721l = i19 % 128;
                int i20 = i19 % 2;
                iw iwVar2 = jxVar.f56722k;
                iw.setOnFocusChangeListener(new Object[]{iwVar2}, -1545700222, 1545700222, System.identityHashCode(iwVar2));
                kc kcVar = (kc) jxVar.setX();
                fk fkVar = (fk) kc.setDividerPadding(new Object[]{kcVar, (iv) jxVar.setOnFocusChangeListener(), jxVar.setCompoundDrawableTintBlendMode()}, 644326672, -644326670, System.identityHashCode(kcVar));
                int i21 = f56721l;
                int i22 = (i21 ^ 108) + ((i21 & 108) << 1);
                int i23 = (i22 ^ (-1)) + (i22 << 1);
                m = i23 % 128;
                if (i23 % 2 != 0) {
                    return fkVar;
                }
                throw null;
            }
        }
        dx dxVar = dx.INSTANCE;
        Object onFocusChangeListener = jxVar.setOnFocusChangeListener();
        setTextKeepState compoundDrawableTintBlendMode = jxVar.setCompoundDrawableTintBlendMode();
        ew ewVar = (ew) jxVar.setX();
        iv ivVar = (iv) jxVar.setOnFocusChangeListener();
        ds dsVar = (ds) iv.setCompoundDrawableTintBlendMode(new Object[]{ivVar}, 1118340294, -1118340287, System.identityHashCode(ivVar));
        iv ivVar2 = (iv) jxVar.setOnFocusChangeListener();
        Pair pair = (Pair) dx.setY(new Object[]{dxVar, onFocusChangeListener, compoundDrawableTintBlendMode, ewVar, setrotationx, dsVar, (setFitsSystemWindows) iv.setCompoundDrawableTintBlendMode(new Object[]{ivVar2}, -219236292, 219236298, System.identityHashCode(ivVar2))}, 2109200881, -2109200880, System.identityHashCode(dxVar));
        fk fkVar2 = (fk) pair.component1();
        boolean zBooleanValue = ((Boolean) pair.component2()).booleanValue();
        if (fkVar2 != null) {
            int i24 = f56721l;
            int i25 = (i24 & 23) + (i24 | 23);
            int i26 = i25 % 128;
            m = i26;
            if (i25 % 2 == 0) {
                throw null;
            }
            int i27 = i26 + 15;
            f56721l = i27 % 128;
            int i28 = i27 % 2;
            return fkVar2;
        }
        kc kcVar2 = (kc) jxVar.setX();
        kc.setDividerPadding(new Object[]{kcVar2, (iv) jxVar.setOnFocusChangeListener(), jxVar.setCompoundDrawableTintBlendMode()}, -543624988, 543624992, System.identityHashCode(kcVar2));
        if (zBooleanValue) {
            int i29 = f56721l;
            int i30 = (i29 ^ 125) + ((i29 & 125) << 1);
            m = i30 % 128;
            int i31 = i30 % 2;
            fdVar = fd.ONLINE_REQUEST;
            int i32 = m;
            int i33 = (i32 ^ 91) + ((i32 & 91) << 1);
            f56721l = i33 % 128;
            int i34 = i33 % 2;
        } else {
            fdVar = fd.DECLINED;
            int i35 = m;
            int i36 = ((i35 | 29) << 1) - (i35 ^ 29);
            f56721l = i36 % 128;
            int i37 = i36 % 2;
        }
        jt jtVar = new jt((iv) jxVar.setOnFocusChangeListener(), jxVar.setCompoundDrawableTintBlendMode(), (kc) jxVar.setX());
        fk fkVar3 = (fk) jt.setDividerPadding(new Object[]{jtVar, fdVar}, -407897628, 407897628, System.identityHashCode(jtVar));
        int i38 = f56721l;
        int i39 = i38 & 115;
        int i40 = ((i38 | 115) & (~i39)) + (i39 << 1);
        m = i40 % 128;
        int i41 = i40 % 2;
        return fkVar3;
    }

    @Override // com.mypinpad.tsdk.isolation.eb
    @NotNull
    public final fk setY(@NotNull setRotationX setrotationx) {
        return (fk) setDividerPadding(new Object[]{this, setrotationx}, 631519398, -631519398, System.identityHashCode(this));
    }
}
