package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.UByte;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/ih;", "", "Lcom/mypinpad/tsdk/i/gv;", "p0", "Lcom/mypinpad/tsdk/i/setImeActionLabel;", "setCompoundDrawableTintBlendMode", "(Lcom/mypinpad/tsdk/i/gv;)Lcom/mypinpad/tsdk/i/setImeActionLabel;", "<init>", "()V"}, k = 1, mv = {1, 5, 1})
public final class ih {

    @NotNull
    public static final ih INSTANCE = new ih();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f56461a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f56462b = 1;

    static {
        int i10 = f56461a + 113;
        f56462b = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 45 / 0;
        }
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        setImeActionLabel setimeactionlabel;
        int i13;
        int i14 = ~i10;
        int i15 = ((i10 | i11) * 624) + ((i14 | i11) * 624) + (i14 * (-624)) + (i11 * (-623)) + (i10 * (-623));
        if (i15 == 1) {
            gv gvVar = (gv) objArr[0];
            hk hkVar = new hk(gvVar);
            ((Integer) setLeftTopRightBottom.setCompoundDrawableTintBlendMode(new Object[]{(setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{hkVar}, 1115257939, -1115257923, System.identityHashCode(hkVar)), new byte[]{1, 0}}, -1162888331, 1162888331, (int) System.currentTimeMillis())).intValue();
            SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
            SouthPacificEndpoint.setX(new Object[]{20018, new setEms(gvVar.printStackTrace(), false), 4}, 1336485880, -1336485874, 20018);
            setImeActionLabel setimeactionlabel2 = (setImeActionLabel) setX(new Object[]{gvVar}, -393114321, 393114325, (int) System.currentTimeMillis());
            int i16 = f56462b;
            int i17 = (((i16 | 81) << 1) - (~(-(((~i16) & 81) | (i16 & (-82)))))) - 1;
            f56461a = i17 % 128;
            int i18 = i17 % 2;
            return setimeactionlabel2;
        }
        if (i15 != 2) {
            if (i15 != 3) {
                if (i15 == 4) {
                    gv gvVar2 = (gv) objArr[0];
                    setAnimation setanimation = setAnimation.INSTANCE;
                    gv.setOnFocusChangeListener(new Object[]{gvVar2, (TransactionFailed) setAnimation.setY(new Object[0], 75174323, -75174132, (int) System.currentTimeMillis()), (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar2, (TransactionFailed) setAnimation.setY(new Object[0], -154084724, 154084974, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(gvVar2))}, -909813507, 909813520, System.identityHashCode(gvVar2));
                    gw gwVar = new gw(gvVar2.setDividerPadding(setAnimation.setOnScrollListener()), new hk(gvVar2));
                    int i19 = f56461a;
                    int i20 = (i19 ^ 31) + ((i19 & 31) << 1);
                    f56462b = i20 % 128;
                    int i21 = i20 % 2;
                    return gwVar;
                }
                gv gvVar3 = (gv) objArr[0];
                hk hkVar2 = new hk(gvVar3);
                ((Integer) setLeftTopRightBottom.setCompoundDrawableTintBlendMode(new Object[]{(setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{hkVar2}, 1115257939, -1115257923, System.identityHashCode(hkVar2)), new byte[]{1, 0}}, -1162888331, 1162888331, (int) System.currentTimeMillis())).intValue();
                SouthPacificEndpoint southPacificEndpoint2 = SouthPacificEndpoint.setX;
                SouthPacificEndpoint.setX(new Object[]{20018, new setEms(gvVar3.printStackTrace(), true), 4}, 1336485880, -1336485874, 20018);
                setImeActionLabel setimeactionlabel3 = (setImeActionLabel) setX(new Object[]{gvVar3}, -393114321, 393114325, (int) System.currentTimeMillis());
                int i22 = f56462b;
                int i23 = ((i22 ^ 102) + ((i22 & 102) << 1)) - 1;
                f56461a = i23 % 128;
                int i24 = i23 % 2;
                return setimeactionlabel3;
            }
            gv gvVar4 = (gv) objArr[1];
            aq aqVar = new aq(gvVar4);
            hb hbVar = new hb(gvVar4);
            am amVar = (am) ((setImageTintList) w.setX(new Object[]{aqVar}, 1693919772, -1693919769, System.identityHashCode(aqVar)));
            if (((Boolean) am.setY(new Object[]{amVar}, -514113289, 514113295, System.identityHashCode(amVar))).booleanValue()) {
                int i25 = f56462b;
                int i26 = i25 & 3;
                int i27 = ((i25 | 3) & (~i26)) + (i26 << 1);
                f56461a = i27 % 128;
                if (i27 % 2 != 0) {
                    hd hdVar = (hd) ((setImageTintList) w.setX(new Object[]{hbVar}, 1693919772, -1693919769, System.identityHashCode(hbVar)));
                    ((Boolean) hd.setY(new Object[]{hdVar}, 701423058, -701423056, System.identityHashCode(hdVar))).booleanValue();
                    throw null;
                }
                hd hdVar2 = (hd) ((setImageTintList) w.setX(new Object[]{hbVar}, 1693919772, -1693919769, System.identityHashCode(hbVar)));
                if (!(!((Boolean) hd.setY(new Object[]{hdVar2}, 701423058, -701423056, System.identityHashCode(hdVar2))).booleanValue())) {
                    int i28 = f56462b;
                    int i29 = i28 & 103;
                    int i30 = ((i28 ^ 103) | i29) << 1;
                    int i31 = -((i28 | 103) & (~i29));
                    int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
                    f56461a = i32 % 128;
                    int i33 = i32 % 2;
                    gv.setOnFocusChangeListener(new Object[]{gvVar4, setFitsSystemWindows.setOnFocusChangeListener}, 68662447, -68662445, System.identityHashCode(gvVar4));
                    int i34 = f56461a;
                    int i35 = ((((i34 ^ 35) | (i34 & 35)) << 1) - (~(-(((~i34) & 35) | (i34 & (-36)))))) - 1;
                    f56462b = i35 % 128;
                    int i36 = i35 % 2;
                }
            }
            setImeActionLabel setimeactionlabel4 = (setImeActionLabel) setX(new Object[]{gvVar4}, -418450109, 418450110, (int) System.currentTimeMillis());
            int i37 = f56462b;
            int i38 = ((i37 ^ 73) | (i37 & 73)) << 1;
            int i39 = -(((~i37) & 73) | (i37 & (-74)));
            int i40 = (i38 & i39) + (i39 | i38);
            f56461a = i40 % 128;
            if (i40 % 2 == 0) {
                return setimeactionlabel4;
            }
            throw null;
        }
        ih ihVar = (ih) objArr[0];
        gv gvVar5 = (gv) objArr[1];
        int i41 = f56462b + 115;
        f56461a = i41 % 128;
        int i42 = i41 % 2;
        Intrinsics.checkNotNullParameter(gvVar5, "");
        if (((Byte) gv.setOnFocusChangeListener(new Object[]{gvVar5}, -1980384064, 1980384093, System.identityHashCode(gvVar5))).byteValue() == UByte.m5545constructorimpl((byte) -128)) {
            cz czVar = new cz(gvVar5);
            cv cvVar = (cv) ((setImageTintList) w.setX(new Object[]{czVar}, 1693919772, -1693919769, System.identityHashCode(czVar)));
            if (!((Boolean) cv.setDividerPadding(new Object[]{cvVar}, 1554941971, -1554941959, System.identityHashCode(cvVar))).booleanValue()) {
                if (((setFitsSystemWindows) gv.setOnFocusChangeListener(new Object[]{gvVar5}, 326807100, -326807083, System.identityHashCode(gvVar5))) != setFitsSystemWindows.setOnFocusChangeListener) {
                    setImeActionLabel setimeactionlabel5 = (setImeActionLabel) setX(new Object[]{gvVar5}, 755471408, -755471408, (int) System.currentTimeMillis());
                    int i43 = f56461a + 121;
                    f56462b = i43 % 128;
                    if (i43 % 2 != 0) {
                        return setimeactionlabel5;
                    }
                    throw null;
                }
                ag agVar = new ag(gvVar5);
                setAnimation setanimation2 = setAnimation.INSTANCE;
                TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -1412794821, 1412794991, (int) System.currentTimeMillis());
                if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar5, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, 2064855914, -2064855856, System.identityHashCode(gvVar5))).booleanValue()) {
                    int i44 = f56461a;
                    int i45 = ((i44 ^ 52) + ((i44 & 52) << 1)) - 1;
                    f56462b = i45 % 128;
                    int i46 = i45 % 2;
                    if (((ac) ((setImageTintList) w.setX(new Object[]{agVar}, 1693919772, -1693919769, System.identityHashCode(agVar)))).setLayoutAnimation() == au.setCompoundDrawableTintBlendMode) {
                        int i47 = f56462b;
                        int i48 = i47 & 39;
                        int i49 = i48 + ((i47 ^ 39) | i48);
                        f56461a = i49 % 128;
                        if (i49 % 2 == 0) {
                            return (setImeActionLabel) setX(new Object[]{gvVar5}, 755471408, -755471408, (int) System.currentTimeMillis());
                        }
                        throw null;
                    }
                }
                setImeActionLabel setimeactionlabel6 = (setImeActionLabel) setX(new Object[]{gvVar5}, -418450109, 418450110, (int) System.currentTimeMillis());
                int i50 = f56462b;
                int i51 = (i50 ^ 75) + ((i50 & 75) << 1);
                f56461a = i51 % 128;
                if (i51 % 2 == 0) {
                    return setimeactionlabel6;
                }
                throw null;
            }
            int i52 = f56462b;
            int i53 = (i52 ^ 71) + ((i52 & 71) << 1);
            f56461a = i53 % 128;
            if (i53 % 2 != 0) {
                setimeactionlabel = (setImeActionLabel) setX(new Object[]{ihVar, gvVar5}, -465756422, 465756425, System.identityHashCode(ihVar));
                int i54 = 19 / 0;
            } else {
                setimeactionlabel = (setImeActionLabel) setX(new Object[]{ihVar, gvVar5}, -465756422, 465756425, System.identityHashCode(ihVar));
            }
            int i55 = f56461a;
            int i56 = i55 & 35;
            int i57 = i55 | 35;
            i13 = (i56 & i57) + (i57 | i56);
            f56462b = i13 % 128;
        } else {
            setimeactionlabel = (setImeActionLabel) setX(new Object[]{gvVar5}, -418450109, 418450110, (int) System.currentTimeMillis());
            int i58 = f56462b;
            int i59 = ((i58 ^ 107) | (i58 & 107)) << 1;
            int i60 = -(((~i58) & 107) | (i58 & (-108)));
            i13 = ((i59 | i60) << 1) - (i60 ^ i59);
            f56461a = i13 % 128;
        }
        int i61 = i13 % 2;
        return setimeactionlabel;
    }

    @NotNull
    public final setImeActionLabel setCompoundDrawableTintBlendMode(@NotNull gv p4) {
        return (setImeActionLabel) setX(new Object[]{this, p4}, -1216037535, 1216037537, System.identityHashCode(this));
    }
}
