package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ki extends eb<ka, kw> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f56797j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f56798k = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final kb f56799i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ki(@NotNull ka kaVar, @NotNull setTextKeepState settextkeepstate, @NotNull kw kwVar, @NotNull getValue getvalue, @NotNull kb kbVar) {
        super(kaVar, settextkeepstate, kwVar, getvalue);
        Intrinsics.checkNotNullParameter(kaVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(kwVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        Intrinsics.checkNotNullParameter(kbVar, "");
        this.f56799i = kbVar;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:17:0x00be  */
    /* JADX WARN: Code duplicated, block: B:20:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:22:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:24:0x0112  */
    /* JADX WARN: Code duplicated, block: B:27:0x0157  */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        Object obj;
        int i13;
        ka kaVar;
        kb kbVar;
        int i14;
        boolean zBooleanValue;
        int i15 = (i11 * (-755)) + (i10 * (-755));
        int i16 = ~((~i10) | (~i11));
        int i17 = i10 | i11;
        if (((i17 | (~i12)) * 756) + (((~(i17 | i12)) | i16) * (-756)) + (i16 * 1512) + i15 != 1) {
            ki kiVar = (ki) objArr[0];
            int i18 = f56798k;
            int i19 = ((i18 | 59) << 1) - (i18 ^ 59);
            int i20 = i19 % 128;
            f56797j = i20;
            int i21 = i19 % 2;
            obj = kiVar.f56799i;
            int i22 = (i20 ^ 99) + ((i20 & 99) << 1);
            f56798k = i22 % 128;
            if (i22 % 2 == 0) {
                int i23 = 87 / 0;
            }
        } else {
            ki kiVar2 = (ki) objArr[0];
            setRotationX setrotationx = (setRotationX) objArr[1];
            int i24 = f56798k;
            int i25 = i24 & 29;
            int i26 = (i25 - (~(-(-((i24 ^ 29) | i25))))) - 1;
            f56797j = i26 % 128;
            if (i26 % 2 != 0) {
                Intrinsics.checkNotNullParameter(setrotationx, "");
                ka kaVar2 = (ka) kiVar2.setOnFocusChangeListener();
                int i27 = 81 / 0;
                if (!(!((Boolean) ka.setCompoundDrawableTintBlendMode(new Object[]{kaVar2}, 1525191230, -1525191215, System.identityHashCode(kaVar2))).booleanValue())) {
                    int i28 = f56797j;
                    i13 = ((i28 | 101) << 1) - (i28 ^ 101);
                    f56798k = i13 % 128;
                    if (i13 % 2 == 0) {
                        ka kaVar3 = (ka) kiVar2.setOnFocusChangeListener();
                        zBooleanValue = ((Boolean) ka.setCompoundDrawableTintBlendMode(new Object[]{kaVar3}, -411478475, 411478481, System.identityHashCode(kaVar3))).booleanValue();
                        int i29 = 84 / 0;
                        if (zBooleanValue) {
                            kbVar = kiVar2.f56799i;
                            if (!((Boolean) kb.setX(new Object[]{kbVar}, -1837987600, 1837987604, System.identityHashCode(kbVar))).booleanValue()) {
                                int i30 = f56797j;
                                int i31 = (((i30 | 52) << 1) - (i30 ^ 52)) - 1;
                                f56798k = i31 % 128;
                                int i32 = i31 % 2;
                                kw kwVar = (kw) kiVar2.setX();
                                obj = (fk) kw.setCompoundDrawableTintBlendMode(new Object[]{kwVar, (ka) kiVar2.setOnFocusChangeListener(), kiVar2.setCompoundDrawableTintBlendMode(), setrotationx}, -1478600848, 1478600848, System.identityHashCode(kwVar));
                                i14 = f56797j + 13;
                                f56798k = i14 % 128;
                                if (i14 % 2 == 0) {
                                    throw null;
                                }
                            }
                        }
                    } else {
                        kaVar = (ka) kiVar2.setOnFocusChangeListener();
                        if (((Boolean) ka.setCompoundDrawableTintBlendMode(new Object[]{kaVar}, -411478475, 411478481, System.identityHashCode(kaVar))).booleanValue()) {
                            kbVar = kiVar2.f56799i;
                            if (!((Boolean) kb.setX(new Object[]{kbVar}, -1837987600, 1837987604, System.identityHashCode(kbVar))).booleanValue()) {
                                int i33 = f56797j;
                                int i34 = (((i33 | 52) << 1) - (i33 ^ 52)) - 1;
                                f56798k = i34 % 128;
                                int i35 = i34 % 2;
                                kw kwVar2 = (kw) kiVar2.setX();
                                obj = (fk) kw.setCompoundDrawableTintBlendMode(new Object[]{kwVar2, (ka) kiVar2.setOnFocusChangeListener(), kiVar2.setCompoundDrawableTintBlendMode(), setrotationx}, -1478600848, 1478600848, System.identityHashCode(kwVar2));
                                i14 = f56797j + 13;
                                f56798k = i14 % 128;
                                if (i14 % 2 == 0) {
                                    throw null;
                                }
                            }
                        }
                    }
                }
            } else {
                Intrinsics.checkNotNullParameter(setrotationx, "");
                ka kaVar4 = (ka) kiVar2.setOnFocusChangeListener();
                if (((Boolean) ka.setCompoundDrawableTintBlendMode(new Object[]{kaVar4}, 1525191230, -1525191215, System.identityHashCode(kaVar4))).booleanValue()) {
                    int i210 = f56797j;
                    i13 = ((i210 | 101) << 1) - (i210 ^ 101);
                    f56798k = i13 % 128;
                    if (i13 % 2 == 0) {
                        ka kaVar5 = (ka) kiVar2.setOnFocusChangeListener();
                        zBooleanValue = ((Boolean) ka.setCompoundDrawableTintBlendMode(new Object[]{kaVar5}, -411478475, 411478481, System.identityHashCode(kaVar5))).booleanValue();
                        int i211 = 84 / 0;
                        if (zBooleanValue) {
                            kbVar = kiVar2.f56799i;
                            if (!((Boolean) kb.setX(new Object[]{kbVar}, -1837987600, 1837987604, System.identityHashCode(kbVar))).booleanValue()) {
                                int i36 = f56797j;
                                int i37 = (((i36 | 52) << 1) - (i36 ^ 52)) - 1;
                                f56798k = i37 % 128;
                                int i38 = i37 % 2;
                                kw kwVar3 = (kw) kiVar2.setX();
                                obj = (fk) kw.setCompoundDrawableTintBlendMode(new Object[]{kwVar3, (ka) kiVar2.setOnFocusChangeListener(), kiVar2.setCompoundDrawableTintBlendMode(), setrotationx}, -1478600848, 1478600848, System.identityHashCode(kwVar3));
                                i14 = f56797j + 13;
                                f56798k = i14 % 128;
                                if (i14 % 2 == 0) {
                                    throw null;
                                }
                            }
                        }
                    } else {
                        kaVar = (ka) kiVar2.setOnFocusChangeListener();
                        if (((Boolean) ka.setCompoundDrawableTintBlendMode(new Object[]{kaVar}, -411478475, 411478481, System.identityHashCode(kaVar))).booleanValue()) {
                            kbVar = kiVar2.f56799i;
                            if (!((Boolean) kb.setX(new Object[]{kbVar}, -1837987600, 1837987604, System.identityHashCode(kbVar))).booleanValue()) {
                                int i39 = f56797j;
                                int i310 = (((i39 | 52) << 1) - (i39 ^ 52)) - 1;
                                f56798k = i310 % 128;
                                int i311 = i310 % 2;
                                kw kwVar4 = (kw) kiVar2.setX();
                                obj = (fk) kw.setCompoundDrawableTintBlendMode(new Object[]{kwVar4, (ka) kiVar2.setOnFocusChangeListener(), kiVar2.setCompoundDrawableTintBlendMode(), setrotationx}, -1478600848, 1478600848, System.identityHashCode(kwVar4));
                                i14 = f56797j + 13;
                                f56798k = i14 % 128;
                                if (i14 % 2 == 0) {
                                    throw null;
                                }
                            }
                        }
                    }
                }
            }
            kw kwVar5 = (kw) kiVar2.setX();
            obj = (fk) kw.setCompoundDrawableTintBlendMode(new Object[]{kwVar5, (ka) kiVar2.setOnFocusChangeListener(), kiVar2.setCompoundDrawableTintBlendMode()}, -1515791855, 1515791859, System.identityHashCode(kwVar5));
            int i40 = f56797j;
            int i41 = ((i40 ^ 55) | (i40 & 55)) << 1;
            int i42 = -(((~i40) & 55) | (i40 & (-56)));
            int i43 = (i41 & i42) + (i42 | i41);
            f56798k = i43 % 128;
            if (i43 % 2 == 0) {
                int i44 = 78 / 0;
            }
        }
        return obj;
    }

    @NotNull
    public final kb setOnLongClickListener() {
        return (kb) setOnFocusChangeListener(new Object[]{this}, -817623043, 817623043, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.eb
    @NotNull
    public final fk setX(@NotNull setRotationX setrotationx) {
        return (fk) setOnFocusChangeListener(new Object[]{this, setrotationx}, 997799247, -997799246, System.identityHashCode(this));
    }
}
