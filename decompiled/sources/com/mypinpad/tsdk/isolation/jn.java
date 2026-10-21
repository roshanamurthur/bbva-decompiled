package com.mypinpad.tsdk.isolation;

import com.bbva.sdkcatalog.openpay.plugin.data.error.ErrorCodes;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class jn extends jh {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f56655l = 0;
    public static int m = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final setContentDescription f56656k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jn(@NotNull iv ivVar, @NotNull setTextKeepState settextkeepstate, @NotNull kc kcVar, @NotNull getValue getvalue, @NotNull setContentDescription setcontentdescription) {
        super(ivVar, settextkeepstate, kcVar, getvalue);
        Intrinsics.checkNotNullParameter(ivVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(kcVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        Intrinsics.checkNotNullParameter(setcontentdescription, "");
        this.f56656k = setcontentdescription;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:62:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:65:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:67:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:68:0x052b  */
    /* JADX WARN: Code duplicated, block: B:70:0x0559  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v47, types: [com.mypinpad.tsdk.i.setScrollBarDefaultDelayBeforeFade] */
    /* JADX WARN: Type inference failed for: r2v74, types: [com.mypinpad.tsdk.i.setScrollBarDefaultDelayBeforeFade] */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        fk fkVar;
        fk fkVar2;
        int i13;
        int i14;
        int i15 = ~i12;
        int i16 = ~i10;
        int i17 = ~i11;
        int i18 = i15 | (~(i16 | i17));
        int i19 = ~(i10 | i11);
        if ((((~(i10 | i17)) | (~(i11 | i16))) * ErrorCodes.STORAGE_PERMISSION) + (((~(i12 | i11)) | (~(i10 | i12)) | i19) * (-1444)) + ((i18 | i19) * 1444) + (i11 * (-721)) + (i10 * (-721)) != 1) {
            jn jnVar = (jn) objArr[0];
            setRotationX setrotationx = (setRotationX) objArr[1];
            int i20 = m;
            int i21 = i20 & 79;
            int i22 = (i20 | 79) & (~i21);
            int i23 = i21 << 1;
            int i24 = (i22 ^ i23) + ((i22 & i23) << 1);
            f56655l = i24 % 128;
            int i25 = i24 % 2;
            Intrinsics.checkNotNullParameter(setrotationx, "");
            setNextFocusLeftId setnextfocusleftid = setNextFocusLeftId.INSTANCE;
            if (((Boolean) setNextFocusLeftId.setDividerPadding(new Object[]{(byte[]) setRotationX.setX(new Object[]{setrotationx}, 1043258083, -1043258081, System.identityHashCode(setrotationx)), getEmvLibVersion.setOnFocusChangeListener}, 177165021, -177165021, (int) System.currentTimeMillis())).booleanValue()) {
                int i26 = f56655l;
                int i27 = (i26 & 122) + (i26 | 122);
                int i28 = (i27 ^ (-1)) + (i27 << 1);
                m = i28 % 128;
                int i29 = i28 % 2;
                SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
                SouthPacificEndpoint.setX(new Object[]{20002, (getDetailsFieldTextSizeSp) setInputExtras.setDividerPadding(new Object[]{(byte[]) setRotationX.setX(new Object[]{setrotationx}, 1043258083, -1043258081, System.identityHashCode(setrotationx))}, -1588575357, 1588575372, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20002);
                kc kcVar = (kc) jnVar.setX();
                fk fkVar3 = (fk) kc.setDividerPadding(new Object[]{kcVar, (iv) jnVar.setOnFocusChangeListener(), jnVar.setCompoundDrawableTintBlendMode(), (byte[]) setRotationX.setX(new Object[]{setrotationx}, 1043258083, -1043258081, System.identityHashCode(setrotationx))}, 1660550511, -1660550495, System.identityHashCode(kcVar));
                int i30 = f56655l;
                int i31 = i30 ^ 41;
                int i32 = (i30 & 41) << 1;
                int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
                m = i33 % 128;
                int i34 = i33 % 2;
                return fkVar3;
            }
            if (!((Boolean) setRotationX.setX(new Object[]{setrotationx}, -268504199, 268504206, System.identityHashCode(setrotationx))).booleanValue()) {
                int i35 = m + 3;
                f56655l = i35 % 128;
                int i36 = i35 % 2;
                SouthPacificEndpoint southPacificEndpoint2 = SouthPacificEndpoint.setX;
                SouthPacificEndpoint.setX(new Object[]{20002, (getDetailsFieldTextSizeSp) setInputExtras.setDividerPadding(new Object[]{(byte[]) setRotationX.setX(new Object[]{setrotationx}, 1043258083, -1043258081, System.identityHashCode(setrotationx))}, -1588575357, 1588575372, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20002);
                kc kcVar2 = (kc) jnVar.setX();
                fk fkVar4 = (fk) kc.setDividerPadding(new Object[]{kcVar2, (iv) jnVar.setOnFocusChangeListener(), jnVar.setCompoundDrawableTintBlendMode(), (byte[]) setRotationX.setX(new Object[]{setrotationx}, 1043258083, -1043258081, System.identityHashCode(setrotationx))}, 483519789, -483519779, System.identityHashCode(kcVar2));
                int i37 = f56655l;
                int i38 = i37 & 117;
                int i39 = (i37 | 117) & (~i38);
                int i40 = -(-(i38 << 1));
                int i41 = (i39 ^ i40) + ((i39 & i40) << 1);
                m = i41 % 128;
                if (i41 % 2 != 0) {
                    return fkVar4;
                }
                throw null;
            }
            ea eaVar = ea.INSTANCE;
            fk fkVar5 = (fk) ea.setX(new Object[]{eaVar, jnVar.setOnFocusChangeListener(), jnVar.setCompoundDrawableTintBlendMode(), (ew) jnVar.setX(), setrotationx}, -221571889, 221571889, System.identityHashCode(eaVar));
            if (fkVar5 != null) {
                int i42 = m;
                int i43 = i42 | 17;
                int i44 = ((i43 << 1) - (~(-((~(i42 & 17)) & i43)))) - 1;
                f56655l = i44 % 128;
                if (i44 % 2 != 0) {
                    throw null;
                }
            } else {
                aq aqVar = new aq(jnVar.setOnFocusChangeListener());
                am amVar = (am) ((setImageTintList) w.setX(new Object[]{aqVar}, 1693919772, -1693919769, System.identityHashCode(aqVar)));
                je jeVar = new je((iv) jnVar.setOnFocusChangeListener());
                fkVar5 = (fk) setX(new Object[]{jnVar, amVar, (ji) ((setImageTintList) w.setX(new Object[]{jeVar}, 1693919772, -1693919769, System.identityHashCode(jeVar)))}, -1863549703, 1863549704, System.identityHashCode(jnVar));
                if (fkVar5 == null) {
                    jl jlVar = jl.INSTANCE;
                    fk fkVar6 = (fk) jl.setDividerPadding(new Object[]{(iv) jnVar.setOnFocusChangeListener(), jnVar.setCompoundDrawableTintBlendMode(), jnVar.setY(), jnVar.f56656k, (kc) jnVar.setX()}, 708475684, -708475683, (int) System.currentTimeMillis());
                    int i45 = f56655l;
                    int i46 = (i45 & 49) + (i45 | 49);
                    m = i46 % 128;
                    int i47 = i46 % 2;
                    return fkVar6;
                }
                int i48 = m;
                int i49 = (i48 & (-4)) | ((~i48) & 3);
                int i50 = -(-((i48 & 3) << 1));
                int i51 = (i49 & i50) + (i49 | i50);
                f56655l = i51 % 128;
                if (i51 % 2 != 0) {
                    throw null;
                }
                int i52 = i48 & 41;
                int i53 = -(-((i48 ^ 41) | i52));
                int i54 = (i52 ^ i53) + ((i53 & i52) << 1);
                f56655l = i54 % 128;
                int i55 = i54 % 2;
            }
            return fkVar5;
        }
        jn jnVar2 = (jn) objArr[0];
        am amVar2 = (am) objArr[1];
        ji jiVar = (ji) objArr[2];
        int i56 = m;
        int i57 = i56 & 93;
        int i58 = (((i56 ^ 93) | i57) << 1) - ((i56 | 93) & (~i57));
        f56655l = i58 % 128;
        if (i58 % 2 != 0) {
            ((Boolean) am.setY(new Object[]{amVar2}, -1841382210, 1841382214, System.identityHashCode(amVar2))).booleanValue();
            throw null;
        }
        if (((Boolean) am.setY(new Object[]{amVar2}, -1841382210, 1841382214, System.identityHashCode(amVar2))).booleanValue()) {
            if (((Boolean) am.setY(new Object[]{amVar2}, -776903, 776911, System.identityHashCode(amVar2))).booleanValue()) {
                int i59 = f56655l;
                int i60 = i59 & 13;
                int i61 = (((i59 ^ 13) | i60) << 1) - ((i59 | 13) & (~i60));
                m = i61 % 128;
                if (i61 % 2 == 0) {
                    iv ivVar = (iv) jnVar2.setOnFocusChangeListener();
                    TransactionFailed compoundDrawables = setAnimation.setCompoundDrawables();
                    ((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{ivVar, (String) TransactionFailed.setX(new Object[]{compoundDrawables}, 1914607362, -1914607356, System.identityHashCode(compoundDrawables))}, -232375606, 232375652, System.identityHashCode(ivVar))).booleanValue();
                    throw null;
                }
                iv ivVar2 = (iv) jnVar2.setOnFocusChangeListener();
                TransactionFailed compoundDrawables2 = setAnimation.setCompoundDrawables();
                if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{ivVar2, (String) TransactionFailed.setX(new Object[]{compoundDrawables2}, 1914607362, -1914607356, System.identityHashCode(compoundDrawables2))}, -232375606, 232375652, System.identityHashCode(ivVar2))).booleanValue()) {
                    ja jaVar = new ja((iv) jnVar2.setOnFocusChangeListener());
                    jc jcVar = (jc) ((setImageTintList) w.setX(new Object[]{jaVar}, 1693919772, -1693919769, System.identityHashCode(jaVar)));
                    if (((iz) jc.setOnFocusChangeListener(new Object[]{jcVar}, 1232158677, -1232158676, System.identityHashCode(jcVar))) == iz.BLOCKED) {
                        cz czVar = new cz(jnVar2.setOnFocusChangeListener());
                        int i62 = f56655l;
                        int i63 = (i62 & 93) + (i62 | 93);
                        m = i63 % 128;
                        int i64 = i63 % 2;
                    }
                }
            }
            int i65 = f56655l;
            int i66 = i65 & 33;
            int i67 = (((i65 ^ 33) | i66) << 1) - ((i65 | 33) & (~i66));
            m = i67 % 128;
            if (i67 % 2 == 0) {
                throw null;
            }
            fkVar2 = null;
        } else {
            if (((Boolean) ji.setDividerPadding(new Object[]{jiVar}, 1505013453, -1505013449, System.identityHashCode(jiVar))).booleanValue()) {
                kc kcVar3 = (kc) jnVar2.setX();
                fkVar = (fk) kc.setDividerPadding(new Object[]{kcVar3, (iv) jnVar2.setOnFocusChangeListener(), jnVar2.setCompoundDrawableTintBlendMode(), ValueQualifier.setY, setContentCaptureSession.getNavBarTitleString}, 611466742, -611466721, System.identityHashCode(kcVar3));
                int i68 = m;
                int i69 = ((i68 ^ 33) | (i68 & 33)) << 1;
                int i70 = -(((~i68) & 33) | (i68 & (-34)));
                int i71 = (i69 & i70) + (i70 | i69);
                f56655l = i71 % 128;
                int i72 = i71 % 2;
            } else {
                int i73 = f56655l;
                int i74 = (i73 & 87) + (i73 | 87);
                m = i74 % 128;
                int i75 = i74 % 2;
                if (((Boolean) ji.setDividerPadding(new Object[]{jiVar}, -2048597984, 2048597990, System.identityHashCode(jiVar))).booleanValue()) {
                    int i76 = m + 61;
                    f56655l = i76 % 128;
                    if (i76 % 2 != 0) {
                        int i77 = 60 / 0;
                        if (!((Boolean) am.setY(new Object[]{amVar2}, -776903, 776911, System.identityHashCode(amVar2))).booleanValue()) {
                            int i78 = f56655l;
                            i13 = (i78 & 103) + (i78 | 103);
                            m = i13 % 128;
                            if (i13 % 2 != 0) {
                                ((Boolean) am.setY(new Object[]{amVar2}, -146153948, 146153955, System.identityHashCode(amVar2))).booleanValue();
                                throw null;
                            }
                            if (!(!((Boolean) am.setY(new Object[]{amVar2}, -146153948, 146153955, System.identityHashCode(amVar2))).booleanValue())) {
                                int i79 = f56655l;
                                i14 = (i79 ^ 1) + ((i79 & 1) << 1);
                                m = i14 % 128;
                                if (i14 % 2 != 0) {
                                    kc kcVar4 = (kc) jnVar2.setX();
                                    throw null;
                                }
                                kc kcVar5 = (kc) jnVar2.setX();
                                fkVar2 = (fk) kc.setDividerPadding(new Object[]{kcVar5, (iv) jnVar2.setOnFocusChangeListener(), jnVar2.setCompoundDrawableTintBlendMode(), ValueQualifier.setY, setContentCaptureSession.getNavBarTitleString}, -96080429, 96080447, System.identityHashCode(kcVar5));
                            }
                        }
                    } else if (!((Boolean) am.setY(new Object[]{amVar2}, -776903, 776911, System.identityHashCode(amVar2))).booleanValue()) {
                        int i710 = f56655l;
                        i13 = (i710 & 103) + (i710 | 103);
                        m = i13 % 128;
                        if (i13 % 2 != 0) {
                            ((Boolean) am.setY(new Object[]{amVar2}, -146153948, 146153955, System.identityHashCode(amVar2))).booleanValue();
                            throw null;
                        }
                        if (!(!((Boolean) am.setY(new Object[]{amVar2}, -146153948, 146153955, System.identityHashCode(amVar2))).booleanValue())) {
                            int i711 = f56655l;
                            i14 = (i711 ^ 1) + ((i711 & 1) << 1);
                            m = i14 % 128;
                            if (i14 % 2 != 0) {
                                kc kcVar6 = (kc) jnVar2.setX();
                                throw null;
                            }
                            kc kcVar7 = (kc) jnVar2.setX();
                            fkVar2 = (fk) kc.setDividerPadding(new Object[]{kcVar7, (iv) jnVar2.setOnFocusChangeListener(), jnVar2.setCompoundDrawableTintBlendMode(), ValueQualifier.setY, setContentCaptureSession.getNavBarTitleString}, -96080429, 96080447, System.identityHashCode(kcVar7));
                        }
                    }
                }
                kc kcVar8 = (kc) jnVar2.setX();
                fkVar = (fk) kc.setDividerPadding(new Object[]{kcVar8, (iv) jnVar2.setOnFocusChangeListener(), jnVar2.setCompoundDrawableTintBlendMode(), ValueQualifier.setY, setContentCaptureSession.getNavBarTitleString}, 611466742, -611466721, System.identityHashCode(kcVar8));
                int i80 = m;
                int i81 = i80 & 107;
                int i82 = ((((i80 ^ 107) | i81) << 1) - (~(-((i80 | 107) & (~i81))))) - 1;
                f56655l = i82 % 128;
                if (i82 % 2 != 0) {
                    throw null;
                }
            }
            fkVar2 = fkVar;
        }
        return fkVar2;
    }

    @Override // com.mypinpad.tsdk.isolation.eb
    @NotNull
    public final fk setY(@NotNull setRotationX setrotationx) {
        return (fk) setX(new Object[]{this, setrotationx}, 345573438, -345573438, System.identityHashCode(this));
    }
}
