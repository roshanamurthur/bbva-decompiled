package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import com.bbva.sl.ar.core.libmcrypt.impl.LibMCryptConstants;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class iq extends is {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f56513i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f56514j = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final di f56515f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final component10 f56516g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final setContentDescription f56517h;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/ct;", "", "setX", "(Lcom/mypinpad/tsdk/i/ct;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends Lambda implements Function1<ct, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f56518p0 = new a();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f56519q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f56520r0 = 1;

        static {
            int i10 = f56520r0;
            int i11 = i10 & 117;
            int i12 = (i10 ^ 117) | i11;
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            f56519q0 = i13 % 128;
            int i14 = i13 % 2;
        }

        public a() {
            super(1);
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ((i10 | i12) * (-50)) + (i11 * (-49)) + (i10 * 51);
            int i14 = ~i10;
            int i15 = ~i11;
            int i16 = ~(i14 | i15 | i12);
            int i17 = ~i12;
            int i18 = i15 | i17;
            if ((((~(i10 | i17)) | (~(i15 | i10)) | (~i18)) * 50) + ((i16 | (~(i18 | i10))) * 50) + i13 == 1) {
                a aVar = (a) objArr[0];
                Object obj = objArr[1];
                int i19 = f56520r0;
                int i20 = (i19 | 117) << 1;
                int i21 = -(((~i19) & 117) | (i19 & (-118)));
                int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                f56519q0 = i22 % 128;
                int i23 = i22 % 2;
                a(new Object[]{aVar, (ct) obj}, -1782281877, 1782281877, System.identityHashCode(aVar));
                Unit unit = Unit.INSTANCE;
                int i24 = f56520r0;
                int i25 = i24 & 55;
                int i26 = (i24 ^ 55) | i25;
                int i27 = (i25 & i26) + (i26 | i25);
                f56519q0 = i27 % 128;
                if (i27 % 2 == 0) {
                    return unit;
                }
                throw null;
            }
            ct ctVar = (ct) objArr[1];
            int i28 = f56520r0;
            int i29 = i28 & 55;
            int i30 = (i28 | 55) & (~i29);
            int i31 = i29 << 1;
            int i32 = (i30 & i31) + (i30 | i31);
            f56519q0 = i32 % 128;
            if (i32 % 2 != 0) {
                Intrinsics.checkNotNullParameter(ctVar, "");
                ((Boolean) ct.setY(new Object[]{ctVar}, -1674422501, 1674422504, System.identityHashCode(ctVar))).booleanValue();
                throw null;
            }
            Intrinsics.checkNotNullParameter(ctVar, "");
            if (!(!((Boolean) ct.setY(new Object[]{ctVar}, -1674422501, 1674422504, System.identityHashCode(ctVar))).booleanValue())) {
                ct.setY(new Object[]{ctVar}, 785942766, -785942764, System.identityHashCode(ctVar));
                int i33 = f56519q0;
                int i34 = i33 ^ 93;
                int i35 = ((i33 & 93) | i34) << 1;
                int i36 = -i34;
                int i37 = (i35 & i36) + (i35 | i36);
                f56520r0 = i37 % 128;
                int i38 = i37 % 2;
            }
            int i39 = f56519q0;
            int i40 = i39 & 55;
            int i41 = (i39 | 55) & (~i40);
            int i42 = i40 << 1;
            int i43 = (i41 & i42) + (i41 | i42);
            f56520r0 = i43 % 128;
            int i44 = i43 % 2;
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(ct ctVar) {
            return a(new Object[]{this, ctVar}, -1525068015, 1525068016, System.identityHashCode(this));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iq(@NotNull im imVar, @NotNull setTextKeepState settextkeepstate, @NotNull iu iuVar, @NotNull di diVar, @NotNull component10 component10Var, @NotNull setContentDescription setcontentdescription) {
        super(imVar, settextkeepstate, iuVar);
        Intrinsics.checkNotNullParameter(imVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(iuVar, "");
        Intrinsics.checkNotNullParameter(diVar, "");
        Intrinsics.checkNotNullParameter(component10Var, "");
        Intrinsics.checkNotNullParameter(setcontentdescription, "");
        this.f56515f = diVar;
        this.f56516g = component10Var;
        this.f56517h = setcontentdescription;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:14:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:16:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:18:0x0128  */
    /* JADX WARN: Code duplicated, block: B:20:0x0133  */
    /* JADX WARN: Code duplicated, block: B:21:0x013a  */
    /* JADX WARN: Code duplicated, block: B:22:0x013e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0168  */
    /* JADX WARN: Code duplicated, block: B:27:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:29:0x01be  */
    /* JADX WARN: Code duplicated, block: B:30:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:33:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:38:0x024f  */
    /* JADX WARN: Code duplicated, block: B:40:0x026e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0285  */
    /* JADX WARN: Code duplicated, block: B:44:0x02af  */
    /* JADX WARN: Code duplicated, block: B:46:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:47:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:48:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:50:0x0326  */
    /* JADX WARN: Code duplicated, block: B:52:0x033d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0369  */
    /* JADX WARN: Code duplicated, block: B:58:0x0396  */
    /* JADX WARN: Code duplicated, block: B:60:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:61:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:62:0x03be  */
    /* JADX WARN: Code duplicated, block: B:64:0x03de  */
    /* JADX WARN: Code duplicated, block: B:66:0x0406  */
    /* JADX WARN: Code duplicated, block: B:68:0x041e  */
    /* JADX WARN: Code duplicated, block: B:70:0x0488  */
    /* JADX WARN: Code duplicated, block: B:72:0x049d  */
    /* JADX WARN: Code duplicated, block: B:74:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:75:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:76:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:77:0x050c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0510  */
    /* JADX WARN: Code duplicated, block: B:81:0x051f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0526  */
    /* JADX WARN: Code duplicated, block: B:84:0x0529  */
    /* JADX WARN: Code duplicated, block: B:85:0x054e  */
    public static /* synthetic */ setTransitionVisibility a(Object[] objArr) throws Exception {
        setTransitionVisibility settransitionvisibility;
        setTransitionVisibility settransitionvisibility2;
        im onFocusChangeListener;
        TransactionFailed transactionFailedComponent25;
        bf bfVar;
        int i10;
        getBeepOnFailure getbeeponfailure;
        int i11;
        int i12;
        setTransitionVisibility settransitionvisibility3;
        byte[] bArr;
        byte[] bArr2;
        int i13;
        cr crVar;
        int i14;
        int i15;
        cr crVar2;
        int i16;
        cr crVar3;
        int i17;
        cr crVar4;
        cr crVar5;
        cr crVar6;
        int i18;
        int i19;
        iq iqVar = (iq) objArr[0];
        setFitsSystemWindows setfitssystemwindows = (setFitsSystemWindows) objArr[1];
        setTransitionVisibility settransitionvisibility4 = setTransitionVisibility.setOnDragListener;
        cs csVar = new cs(iqVar.setOnFocusChangeListener());
        im onFocusChangeListener2 = iqVar.setOnFocusChangeListener();
        if (((Boolean) im.setY(new Object[]{onFocusChangeListener2}, 61227936, -61227928, System.identityHashCode(onFocusChangeListener2))).booleanValue()) {
            settransitionvisibility = settransitionvisibility4;
        } else {
            int i20 = f56513i;
            int i21 = ((i20 ^ 68) + ((i20 & 68) << 1)) - 1;
            f56514j = i21 % 128;
            if (i21 % 2 == 0) {
                im onFocusChangeListener3 = iqVar.setOnFocusChangeListener();
                TransactionFailed transactionFailedComponent26 = setAnimation.component25();
                int i22 = 97 / 0;
                if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener3, (String) TransactionFailed.setX(new Object[]{transactionFailedComponent26}, 1914607362, -1914607356, System.identityHashCode(transactionFailedComponent26))}, 1014467290, -1014467254, System.identityHashCode(onFocusChangeListener3))).booleanValue()) {
                    int i23 = f56513i + 79;
                    f56514j = i23 % 128;
                    int i24 = i23 % 2;
                    crVar3 = (cr) ((setImageTintList) w.setX(new Object[]{csVar}, 1693919772, -1693919769, System.identityHashCode(csVar)));
                    if (!((Boolean) cr.setDividerPadding(new Object[]{crVar3}, 720483124, -720483117, System.identityHashCode(crVar3))).booleanValue()) {
                        int i25 = f56514j;
                        i17 = (i25 ^ 1) + ((i25 & 1) << 1);
                        f56513i = i17 % 128;
                        if (i17 % 2 == 0) {
                            cr crVar7 = (cr) ((setImageTintList) w.setX(new Object[]{csVar}, 1693919772, -1693919769, System.identityHashCode(csVar)));
                            ((Boolean) cr.setDividerPadding(new Object[]{crVar7}, -798032540, 798032540, System.identityHashCode(crVar7))).booleanValue();
                            throw null;
                        }
                        crVar4 = (cr) ((setImageTintList) w.setX(new Object[]{csVar}, 1693919772, -1693919769, System.identityHashCode(csVar)));
                        if (((Boolean) cr.setDividerPadding(new Object[]{crVar4}, -798032540, 798032540, System.identityHashCode(crVar4))).booleanValue()) {
                            i19 = f56514j + 79;
                            f56513i = i19 % 128;
                            if (i19 % 2 != 0) {
                                settransitionvisibility = setTransitionVisibility.setX;
                                int i26 = 34 / 0;
                            } else {
                                settransitionvisibility = setTransitionVisibility.setX;
                            }
                        } else {
                            crVar5 = (cr) ((setImageTintList) w.setX(new Object[]{csVar}, 1693919772, -1693919769, System.identityHashCode(csVar)));
                            if (((Boolean) cr.setDividerPadding(new Object[]{crVar5}, 1108158449, -1108158440, System.identityHashCode(crVar5))).booleanValue()) {
                                int i27 = f56513i;
                                int i28 = ((i27 ^ 95) - (~(-(-((i27 & 95) << 1))))) - 1;
                                f56514j = i28 % 128;
                                int i29 = i28 % 2;
                                crVar6 = (cr) ((setImageTintList) w.setX(new Object[]{csVar}, 1693919772, -1693919769, System.identityHashCode(csVar)));
                                if (!((Boolean) cr.setDividerPadding(new Object[]{crVar6}, 1815100415, -1815100409, System.identityHashCode(crVar6))).booleanValue()) {
                                    int i30 = f56513i;
                                    int i31 = i30 & 21;
                                    int i32 = ((i30 ^ 21) | i31) << 1;
                                    int i33 = -((i30 | 21) & (~i31));
                                    i18 = (i32 ^ i33) + ((i33 & i32) << 1);
                                    f56514j = i18 % 128;
                                    if (i18 % 2 == 0) {
                                        settransitionvisibility = setTransitionVisibility.setY;
                                        int i34 = 91 / 0;
                                    } else {
                                        settransitionvisibility = setTransitionVisibility.setY;
                                    }
                                    int i35 = f56514j + 99;
                                    f56513i = i35 % 128;
                                    int i36 = i35 % 2;
                                }
                            }
                            im onFocusChangeListener4 = iqVar.setOnFocusChangeListener();
                            im.setY(new Object[]{onFocusChangeListener4, Boolean.TRUE}, 36630807, -36630802, System.identityHashCode(onFocusChangeListener4));
                            System.identityHashCode(iqVar);
                            System.identityHashCode(iqVar);
                        }
                    }
                }
                onFocusChangeListener = iqVar.setOnFocusChangeListener();
                transactionFailedComponent25 = setAnimation.component25();
                if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener, (String) TransactionFailed.setX(new Object[]{transactionFailedComponent25}, 1914607362, -1914607356, System.identityHashCode(transactionFailedComponent25))}, 2064855914, -2064855856, System.identityHashCode(onFocusChangeListener))).booleanValue()) {
                    bfVar = new bf(iqVar.setOnFocusChangeListener());
                    if (((be) ((setImageTintList) w.setX(new Object[]{bfVar}, 1693919772, -1693919769, System.identityHashCode(bfVar)))).setNavigationOnClickListener()) {
                        int i37 = f56514j;
                        i15 = (((i37 ^ 41) | (i37 & 41)) << 1) - (((~i37) & 41) | (i37 & (-42)));
                        f56513i = i15 % 128;
                        if (i15 % 2 != 0) {
                            cr crVar8 = (cr) ((setImageTintList) w.setX(new Object[]{csVar}, 1693919772, -1693919769, System.identityHashCode(csVar)));
                            ((Boolean) cr.setDividerPadding(new Object[]{crVar8}, 1815100415, -1815100409, System.identityHashCode(crVar8))).booleanValue();
                            throw null;
                        }
                        crVar2 = (cr) ((setImageTintList) w.setX(new Object[]{csVar}, 1693919772, -1693919769, System.identityHashCode(csVar)));
                        if (((Boolean) cr.setDividerPadding(new Object[]{crVar2}, 1815100415, -1815100409, System.identityHashCode(crVar2))).booleanValue()) {
                            int i38 = f56513i;
                            int i39 = i38 & 95;
                            i16 = ((((i38 ^ 95) | i39) << 1) - (~(-((i38 | 95) & (~i39))))) - 1;
                            f56514j = i16 % 128;
                            if (i16 % 2 == 0) {
                                settransitionvisibility = setTransitionVisibility.setY;
                                im onFocusChangeListener5 = iqVar.setOnFocusChangeListener();
                                im.setY(new Object[]{onFocusChangeListener5, Boolean.TRUE}, -818388399, 818388408, System.identityHashCode(onFocusChangeListener5));
                            } else {
                                settransitionvisibility = setTransitionVisibility.setY;
                                im onFocusChangeListener6 = iqVar.setOnFocusChangeListener();
                                im.setY(new Object[]{onFocusChangeListener6, Boolean.TRUE}, -818388399, 818388408, System.identityHashCode(onFocusChangeListener6));
                            }
                        } else if (!((be) ((setImageTintList) w.setX(new Object[]{bfVar}, 1693919772, -1693919769, System.identityHashCode(bfVar)))).setIncludeFontPadding()) {
                            crVar = (cr) ((setImageTintList) w.setX(new Object[]{csVar}, 1693919772, -1693919769, System.identityHashCode(csVar)));
                            if (((Boolean) cr.setDividerPadding(new Object[]{crVar}, -798032540, 798032540, System.identityHashCode(crVar))).booleanValue()) {
                                int i40 = f56513i;
                                int i41 = (i40 | 67) << 1;
                                int i42 = -(((~i40) & 67) | (i40 & (-68)));
                                int i43 = (i41 & i42) + (i42 | i41);
                                f56514j = i43 % 128;
                                int i44 = i43 % 2;
                                if (((be) ((setImageTintList) w.setX(new Object[]{bfVar}, 1693919772, -1693919769, System.identityHashCode(bfVar)))).setLayoutAnimation()) {
                                    int i45 = f56514j;
                                    i14 = (((i45 & (-78)) | ((~i45) & 77)) - (~(-(-((i45 & 77) << 1))))) - 1;
                                    f56513i = i14 % 128;
                                    if (i14 % 2 == 0) {
                                        throw null;
                                    }
                                    settransitionvisibility = setTransitionVisibility.setX;
                                    int i46 = f56514j;
                                    int i47 = (i46 & 77) + (i46 | 77);
                                    f56513i = i47 % 128;
                                    int i48 = i47 % 2;
                                }
                            }
                        } else {
                            int i49 = f56514j;
                            int i50 = (i49 | 67) << 1;
                            int i51 = -(((~i49) & 67) | (i49 & (-68)));
                            i10 = (i50 & i51) + (i51 | i50);
                            f56513i = i10 % 128;
                            if (i10 % 2 == 0) {
                                im onFocusChangeListener7 = iqVar.setOnFocusChangeListener();
                                throw null;
                            }
                            im onFocusChangeListener8 = iqVar.setOnFocusChangeListener();
                            getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener8, (TransactionFailed) setAnimation.setY(new Object[0], -1761153819, 1761153841, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(onFocusChangeListener8));
                            if (getbeeponfailure != null) {
                                if (((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure))).length >= 7) {
                                    int i52 = f56514j;
                                    int i53 = ((i52 ^ 97) | (i52 & 97)) << 1;
                                    int i54 = -(((~i52) & 97) | (i52 & (-98)));
                                    int i55 = (i53 & i54) + (i54 | i53);
                                    f56513i = i55 % 128;
                                    int i56 = i55 % 2;
                                    bArr = new byte[2];
                                    bArr2 = new byte[2];
                                    System.arraycopy((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure)), 5, bArr, 0, 2);
                                    System.arraycopy((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{bfVar}, 252497730, -252497710, System.identityHashCode(bfVar)), 0, bArr2, 0, 2);
                                    if (Intrinsics.areEqual((String) setInputExtras.setDividerPadding(new Object[]{bArr}, 1609250238, -1609250236, (int) System.currentTimeMillis()), (String) setInputExtras.setDividerPadding(new Object[]{bArr2}, 1609250238, -1609250236, (int) System.currentTimeMillis()))) {
                                        int i57 = f56513i;
                                        int i58 = i57 ^ 21;
                                        int i59 = -(-((i57 & 21) << 1));
                                        i13 = ((i58 | i59) << 1) - (i59 ^ i58);
                                        f56514j = i13 % 128;
                                        if (i13 % 2 != 0) {
                                            throw null;
                                        }
                                        settransitionvisibility = setTransitionVisibility.setDividerPadding;
                                        int i60 = f56513i;
                                        i11 = ((i60 ^ 89) - (~(-(-((i60 & 89) << 1))))) - 1;
                                        f56514j = i11 % 128;
                                        int i61 = i11 % 2;
                                    } else {
                                        im onFocusChangeListener9 = iqVar.setOnFocusChangeListener();
                                        im.setY(new Object[]{onFocusChangeListener9, Boolean.TRUE}, 36630807, -36630802, System.identityHashCode(onFocusChangeListener9));
                                        int i62 = f56513i;
                                        int i63 = (i62 & (-18)) | ((~i62) & 17);
                                        int i64 = -(-((i62 & 17) << 1));
                                        int i65 = (i63 ^ i64) + ((i64 & i63) << 1);
                                        f56514j = i65 % 128;
                                        int i66 = i65 % 2;
                                    }
                                } else {
                                    im onFocusChangeListener10 = iqVar.setOnFocusChangeListener();
                                    im.setY(new Object[]{onFocusChangeListener10, Boolean.TRUE}, 36630807, -36630802, System.identityHashCode(onFocusChangeListener10));
                                    int i67 = f56514j + 53;
                                    f56513i = i67 % 128;
                                    int i68 = i67 % 2;
                                }
                            } else if (setfitssystemwindows == setFitsSystemWindows.setX) {
                                int i69 = f56513i;
                                i12 = (i69 ^ 37) + ((i69 & 37) << 1);
                                f56514j = i12 % 128;
                                if (i12 % 2 == 0) {
                                    settransitionvisibility3 = setTransitionVisibility.setDividerPadding;
                                    int i70 = 64 / 0;
                                } else {
                                    settransitionvisibility3 = setTransitionVisibility.setDividerPadding;
                                }
                                settransitionvisibility = settransitionvisibility3;
                            } else {
                                im onFocusChangeListener11 = iqVar.setOnFocusChangeListener();
                                im.setY(new Object[]{onFocusChangeListener11, Boolean.TRUE}, 36630807, -36630802, System.identityHashCode(onFocusChangeListener11));
                                int i71 = f56513i;
                                i11 = (i71 ^ 85) + ((i71 & 85) << 1);
                                f56514j = i11 % 128;
                                int i610 = i11 % 2;
                            }
                        }
                    } else if (!((be) ((setImageTintList) w.setX(new Object[]{bfVar}, 1693919772, -1693919769, System.identityHashCode(bfVar)))).setIncludeFontPadding()) {
                        crVar = (cr) ((setImageTintList) w.setX(new Object[]{csVar}, 1693919772, -1693919769, System.identityHashCode(csVar)));
                        if (((Boolean) cr.setDividerPadding(new Object[]{crVar}, -798032540, 798032540, System.identityHashCode(crVar))).booleanValue()) {
                            int i410 = f56513i;
                            int i411 = (i410 | 67) << 1;
                            int i412 = -(((~i410) & 67) | (i410 & (-68)));
                            int i413 = (i411 & i412) + (i412 | i411);
                            f56514j = i413 % 128;
                            int i414 = i413 % 2;
                            if (((be) ((setImageTintList) w.setX(new Object[]{bfVar}, 1693919772, -1693919769, System.identityHashCode(bfVar)))).setLayoutAnimation()) {
                                int i415 = f56514j;
                                i14 = (((i415 & (-78)) | ((~i415) & 77)) - (~(-(-((i415 & 77) << 1))))) - 1;
                                f56513i = i14 % 128;
                                if (i14 % 2 == 0) {
                                    throw null;
                                }
                                settransitionvisibility = setTransitionVisibility.setX;
                                int i416 = f56514j;
                                int i417 = (i416 & 77) + (i416 | 77);
                                f56513i = i417 % 128;
                                int i418 = i417 % 2;
                            }
                        }
                    } else {
                        int i419 = f56514j;
                        int i510 = (i419 | 67) << 1;
                        int i511 = -(((~i419) & 67) | (i419 & (-68)));
                        i10 = (i510 & i511) + (i511 | i510);
                        f56513i = i10 % 128;
                        if (i10 % 2 == 0) {
                            im onFocusChangeListener12 = iqVar.setOnFocusChangeListener();
                            throw null;
                        }
                        im onFocusChangeListener13 = iqVar.setOnFocusChangeListener();
                        getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener13, (TransactionFailed) setAnimation.setY(new Object[0], -1761153819, 1761153841, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(onFocusChangeListener13));
                        if (getbeeponfailure != null) {
                            if (((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure))).length >= 7) {
                                int i512 = f56514j;
                                int i513 = ((i512 ^ 97) | (i512 & 97)) << 1;
                                int i514 = -(((~i512) & 97) | (i512 & (-98)));
                                int i515 = (i513 & i514) + (i514 | i513);
                                f56513i = i515 % 128;
                                int i516 = i515 % 2;
                                bArr = new byte[2];
                                bArr2 = new byte[2];
                                System.arraycopy((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure)), 5, bArr, 0, 2);
                                System.arraycopy((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{bfVar}, 252497730, -252497710, System.identityHashCode(bfVar)), 0, bArr2, 0, 2);
                                if (Intrinsics.areEqual((String) setInputExtras.setDividerPadding(new Object[]{bArr}, 1609250238, -1609250236, (int) System.currentTimeMillis()), (String) setInputExtras.setDividerPadding(new Object[]{bArr2}, 1609250238, -1609250236, (int) System.currentTimeMillis()))) {
                                    int i517 = f56513i;
                                    int i518 = i517 ^ 21;
                                    int i519 = -(-((i517 & 21) << 1));
                                    i13 = ((i518 | i519) << 1) - (i519 ^ i518);
                                    f56514j = i13 % 128;
                                    if (i13 % 2 != 0) {
                                        throw null;
                                    }
                                    settransitionvisibility = setTransitionVisibility.setDividerPadding;
                                    int i611 = f56513i;
                                    i11 = ((i611 ^ 89) - (~(-(-((i611 & 89) << 1))))) - 1;
                                    f56514j = i11 % 128;
                                    int i612 = i11 % 2;
                                } else {
                                    im onFocusChangeListener14 = iqVar.setOnFocusChangeListener();
                                    im.setY(new Object[]{onFocusChangeListener14, Boolean.TRUE}, 36630807, -36630802, System.identityHashCode(onFocusChangeListener14));
                                    int i613 = f56513i;
                                    int i614 = (i613 & (-18)) | ((~i613) & 17);
                                    int i615 = -(-((i613 & 17) << 1));
                                    int i616 = (i614 ^ i615) + ((i615 & i614) << 1);
                                    f56514j = i616 % 128;
                                    int i617 = i616 % 2;
                                }
                            } else {
                                im onFocusChangeListener15 = iqVar.setOnFocusChangeListener();
                                im.setY(new Object[]{onFocusChangeListener15, Boolean.TRUE}, 36630807, -36630802, System.identityHashCode(onFocusChangeListener15));
                                int i618 = f56514j + 53;
                                f56513i = i618 % 128;
                                int i619 = i618 % 2;
                            }
                        } else if (setfitssystemwindows == setFitsSystemWindows.setX) {
                            int i620 = f56513i;
                            i12 = (i620 ^ 37) + ((i620 & 37) << 1);
                            f56514j = i12 % 128;
                            if (i12 % 2 == 0) {
                                settransitionvisibility3 = setTransitionVisibility.setDividerPadding;
                                int i72 = 64 / 0;
                            } else {
                                settransitionvisibility3 = setTransitionVisibility.setDividerPadding;
                            }
                            settransitionvisibility = settransitionvisibility3;
                        } else {
                            im onFocusChangeListener16 = iqVar.setOnFocusChangeListener();
                            im.setY(new Object[]{onFocusChangeListener16, Boolean.TRUE}, 36630807, -36630802, System.identityHashCode(onFocusChangeListener16));
                            int i73 = f56513i;
                            i11 = (i73 ^ 85) + ((i73 & 85) << 1);
                            f56514j = i11 % 128;
                            int i6110 = i11 % 2;
                        }
                    }
                }
            } else {
                im onFocusChangeListener17 = iqVar.setOnFocusChangeListener();
                TransactionFailed transactionFailedComponent27 = setAnimation.component25();
                if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener17, (String) TransactionFailed.setX(new Object[]{transactionFailedComponent27}, 1914607362, -1914607356, System.identityHashCode(transactionFailedComponent27))}, 1014467290, -1014467254, System.identityHashCode(onFocusChangeListener17))).booleanValue()) {
                    int i210 = f56513i + 79;
                    f56514j = i210 % 128;
                    int i211 = i210 % 2;
                    crVar3 = (cr) ((setImageTintList) w.setX(new Object[]{csVar}, 1693919772, -1693919769, System.identityHashCode(csVar)));
                    if (!((Boolean) cr.setDividerPadding(new Object[]{crVar3}, 720483124, -720483117, System.identityHashCode(crVar3))).booleanValue()) {
                        int i212 = f56514j;
                        i17 = (i212 ^ 1) + ((i212 & 1) << 1);
                        f56513i = i17 % 128;
                        if (i17 % 2 == 0) {
                            cr crVar9 = (cr) ((setImageTintList) w.setX(new Object[]{csVar}, 1693919772, -1693919769, System.identityHashCode(csVar)));
                            ((Boolean) cr.setDividerPadding(new Object[]{crVar9}, -798032540, 798032540, System.identityHashCode(crVar9))).booleanValue();
                            throw null;
                        }
                        crVar4 = (cr) ((setImageTintList) w.setX(new Object[]{csVar}, 1693919772, -1693919769, System.identityHashCode(csVar)));
                        if (((Boolean) cr.setDividerPadding(new Object[]{crVar4}, -798032540, 798032540, System.identityHashCode(crVar4))).booleanValue()) {
                            i19 = f56514j + 79;
                            f56513i = i19 % 128;
                            if (i19 % 2 != 0) {
                                settransitionvisibility = setTransitionVisibility.setX;
                                int i213 = 34 / 0;
                            } else {
                                settransitionvisibility = setTransitionVisibility.setX;
                            }
                        } else {
                            crVar5 = (cr) ((setImageTintList) w.setX(new Object[]{csVar}, 1693919772, -1693919769, System.identityHashCode(csVar)));
                            if (((Boolean) cr.setDividerPadding(new Object[]{crVar5}, 1108158449, -1108158440, System.identityHashCode(crVar5))).booleanValue()) {
                                int i214 = f56513i;
                                int i215 = ((i214 ^ 95) - (~(-(-((i214 & 95) << 1))))) - 1;
                                f56514j = i215 % 128;
                                int i216 = i215 % 2;
                                crVar6 = (cr) ((setImageTintList) w.setX(new Object[]{csVar}, 1693919772, -1693919769, System.identityHashCode(csVar)));
                                if (!((Boolean) cr.setDividerPadding(new Object[]{crVar6}, 1815100415, -1815100409, System.identityHashCode(crVar6))).booleanValue()) {
                                    int i310 = f56513i;
                                    int i311 = i310 & 21;
                                    int i312 = ((i310 ^ 21) | i311) << 1;
                                    int i313 = -((i310 | 21) & (~i311));
                                    i18 = (i312 ^ i313) + ((i313 & i312) << 1);
                                    f56514j = i18 % 128;
                                    if (i18 % 2 == 0) {
                                        settransitionvisibility = setTransitionVisibility.setY;
                                        int i314 = 91 / 0;
                                    } else {
                                        settransitionvisibility = setTransitionVisibility.setY;
                                    }
                                    int i315 = f56514j + 99;
                                    f56513i = i315 % 128;
                                    int i316 = i315 % 2;
                                }
                            }
                            im onFocusChangeListener18 = iqVar.setOnFocusChangeListener();
                            im.setY(new Object[]{onFocusChangeListener18, Boolean.TRUE}, 36630807, -36630802, System.identityHashCode(onFocusChangeListener18));
                            System.identityHashCode(iqVar);
                            System.identityHashCode(iqVar);
                        }
                    }
                }
                onFocusChangeListener = iqVar.setOnFocusChangeListener();
                transactionFailedComponent25 = setAnimation.component25();
                if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener, (String) TransactionFailed.setX(new Object[]{transactionFailedComponent25}, 1914607362, -1914607356, System.identityHashCode(transactionFailedComponent25))}, 2064855914, -2064855856, System.identityHashCode(onFocusChangeListener))).booleanValue()) {
                    bfVar = new bf(iqVar.setOnFocusChangeListener());
                    if (((be) ((setImageTintList) w.setX(new Object[]{bfVar}, 1693919772, -1693919769, System.identityHashCode(bfVar)))).setNavigationOnClickListener()) {
                        int i317 = f56514j;
                        i15 = (((i317 ^ 41) | (i317 & 41)) << 1) - (((~i317) & 41) | (i317 & (-42)));
                        f56513i = i15 % 128;
                        if (i15 % 2 != 0) {
                            cr crVar10 = (cr) ((setImageTintList) w.setX(new Object[]{csVar}, 1693919772, -1693919769, System.identityHashCode(csVar)));
                            ((Boolean) cr.setDividerPadding(new Object[]{crVar10}, 1815100415, -1815100409, System.identityHashCode(crVar10))).booleanValue();
                            throw null;
                        }
                        crVar2 = (cr) ((setImageTintList) w.setX(new Object[]{csVar}, 1693919772, -1693919769, System.identityHashCode(csVar)));
                        if (((Boolean) cr.setDividerPadding(new Object[]{crVar2}, 1815100415, -1815100409, System.identityHashCode(crVar2))).booleanValue()) {
                            int i318 = f56513i;
                            int i319 = i318 & 95;
                            i16 = ((((i318 ^ 95) | i319) << 1) - (~(-((i318 | 95) & (~i319))))) - 1;
                            f56514j = i16 % 128;
                            if (i16 % 2 == 0) {
                                settransitionvisibility = setTransitionVisibility.setY;
                                im onFocusChangeListener19 = iqVar.setOnFocusChangeListener();
                                im.setY(new Object[]{onFocusChangeListener19, Boolean.TRUE}, -818388399, 818388408, System.identityHashCode(onFocusChangeListener19));
                            } else {
                                settransitionvisibility = setTransitionVisibility.setY;
                                im onFocusChangeListener20 = iqVar.setOnFocusChangeListener();
                                im.setY(new Object[]{onFocusChangeListener20, Boolean.TRUE}, -818388399, 818388408, System.identityHashCode(onFocusChangeListener20));
                            }
                        } else if (!((be) ((setImageTintList) w.setX(new Object[]{bfVar}, 1693919772, -1693919769, System.identityHashCode(bfVar)))).setIncludeFontPadding()) {
                            crVar = (cr) ((setImageTintList) w.setX(new Object[]{csVar}, 1693919772, -1693919769, System.identityHashCode(csVar)));
                            if (((Boolean) cr.setDividerPadding(new Object[]{crVar}, -798032540, 798032540, System.identityHashCode(crVar))).booleanValue()) {
                                int i4110 = f56513i;
                                int i4111 = (i4110 | 67) << 1;
                                int i4112 = -(((~i4110) & 67) | (i4110 & (-68)));
                                int i4113 = (i4111 & i4112) + (i4112 | i4111);
                                f56514j = i4113 % 128;
                                int i4114 = i4113 % 2;
                                if (((be) ((setImageTintList) w.setX(new Object[]{bfVar}, 1693919772, -1693919769, System.identityHashCode(bfVar)))).setLayoutAnimation()) {
                                    int i4115 = f56514j;
                                    i14 = (((i4115 & (-78)) | ((~i4115) & 77)) - (~(-(-((i4115 & 77) << 1))))) - 1;
                                    f56513i = i14 % 128;
                                    if (i14 % 2 == 0) {
                                        throw null;
                                    }
                                    settransitionvisibility = setTransitionVisibility.setX;
                                    int i4116 = f56514j;
                                    int i4117 = (i4116 & 77) + (i4116 | 77);
                                    f56513i = i4117 % 128;
                                    int i4118 = i4117 % 2;
                                }
                            }
                        } else {
                            int i4119 = f56514j;
                            int i5110 = (i4119 | 67) << 1;
                            int i5111 = -(((~i4119) & 67) | (i4119 & (-68)));
                            i10 = (i5110 & i5111) + (i5111 | i5110);
                            f56513i = i10 % 128;
                            if (i10 % 2 == 0) {
                                im onFocusChangeListener110 = iqVar.setOnFocusChangeListener();
                                throw null;
                            }
                            im onFocusChangeListener111 = iqVar.setOnFocusChangeListener();
                            getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener111, (TransactionFailed) setAnimation.setY(new Object[0], -1761153819, 1761153841, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(onFocusChangeListener111));
                            if (getbeeponfailure != null) {
                                if (((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure))).length >= 7) {
                                    int i5112 = f56514j;
                                    int i5113 = ((i5112 ^ 97) | (i5112 & 97)) << 1;
                                    int i5114 = -(((~i5112) & 97) | (i5112 & (-98)));
                                    int i5115 = (i5113 & i5114) + (i5114 | i5113);
                                    f56513i = i5115 % 128;
                                    int i5116 = i5115 % 2;
                                    bArr = new byte[2];
                                    bArr2 = new byte[2];
                                    System.arraycopy((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure)), 5, bArr, 0, 2);
                                    System.arraycopy((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{bfVar}, 252497730, -252497710, System.identityHashCode(bfVar)), 0, bArr2, 0, 2);
                                    if (Intrinsics.areEqual((String) setInputExtras.setDividerPadding(new Object[]{bArr}, 1609250238, -1609250236, (int) System.currentTimeMillis()), (String) setInputExtras.setDividerPadding(new Object[]{bArr2}, 1609250238, -1609250236, (int) System.currentTimeMillis()))) {
                                        int i5117 = f56513i;
                                        int i5118 = i5117 ^ 21;
                                        int i5119 = -(-((i5117 & 21) << 1));
                                        i13 = ((i5118 | i5119) << 1) - (i5119 ^ i5118);
                                        f56514j = i13 % 128;
                                        if (i13 % 2 != 0) {
                                            throw null;
                                        }
                                        settransitionvisibility = setTransitionVisibility.setDividerPadding;
                                        int i6111 = f56513i;
                                        i11 = ((i6111 ^ 89) - (~(-(-((i6111 & 89) << 1))))) - 1;
                                        f56514j = i11 % 128;
                                        int i6112 = i11 % 2;
                                    } else {
                                        im onFocusChangeListener112 = iqVar.setOnFocusChangeListener();
                                        im.setY(new Object[]{onFocusChangeListener112, Boolean.TRUE}, 36630807, -36630802, System.identityHashCode(onFocusChangeListener112));
                                        int i6113 = f56513i;
                                        int i6114 = (i6113 & (-18)) | ((~i6113) & 17);
                                        int i6115 = -(-((i6113 & 17) << 1));
                                        int i6116 = (i6114 ^ i6115) + ((i6115 & i6114) << 1);
                                        f56514j = i6116 % 128;
                                        int i6117 = i6116 % 2;
                                    }
                                } else {
                                    im onFocusChangeListener113 = iqVar.setOnFocusChangeListener();
                                    im.setY(new Object[]{onFocusChangeListener113, Boolean.TRUE}, 36630807, -36630802, System.identityHashCode(onFocusChangeListener113));
                                    int i6118 = f56514j + 53;
                                    f56513i = i6118 % 128;
                                    int i6119 = i6118 % 2;
                                }
                            } else if (setfitssystemwindows == setFitsSystemWindows.setX) {
                                int i621 = f56513i;
                                i12 = (i621 ^ 37) + ((i621 & 37) << 1);
                                f56514j = i12 % 128;
                                if (i12 % 2 == 0) {
                                    settransitionvisibility3 = setTransitionVisibility.setDividerPadding;
                                    int i74 = 64 / 0;
                                } else {
                                    settransitionvisibility3 = setTransitionVisibility.setDividerPadding;
                                }
                                settransitionvisibility = settransitionvisibility3;
                            } else {
                                im onFocusChangeListener114 = iqVar.setOnFocusChangeListener();
                                im.setY(new Object[]{onFocusChangeListener114, Boolean.TRUE}, 36630807, -36630802, System.identityHashCode(onFocusChangeListener114));
                                int i75 = f56513i;
                                i11 = (i75 ^ 85) + ((i75 & 85) << 1);
                                f56514j = i11 % 128;
                                int i61110 = i11 % 2;
                            }
                        }
                    } else if (!((be) ((setImageTintList) w.setX(new Object[]{bfVar}, 1693919772, -1693919769, System.identityHashCode(bfVar)))).setIncludeFontPadding()) {
                        crVar = (cr) ((setImageTintList) w.setX(new Object[]{csVar}, 1693919772, -1693919769, System.identityHashCode(csVar)));
                        if (((Boolean) cr.setDividerPadding(new Object[]{crVar}, -798032540, 798032540, System.identityHashCode(crVar))).booleanValue()) {
                            int i41110 = f56513i;
                            int i41111 = (i41110 | 67) << 1;
                            int i41112 = -(((~i41110) & 67) | (i41110 & (-68)));
                            int i41113 = (i41111 & i41112) + (i41112 | i41111);
                            f56514j = i41113 % 128;
                            int i41114 = i41113 % 2;
                            if (((be) ((setImageTintList) w.setX(new Object[]{bfVar}, 1693919772, -1693919769, System.identityHashCode(bfVar)))).setLayoutAnimation()) {
                                int i41115 = f56514j;
                                i14 = (((i41115 & (-78)) | ((~i41115) & 77)) - (~(-(-((i41115 & 77) << 1))))) - 1;
                                f56513i = i14 % 128;
                                if (i14 % 2 == 0) {
                                    throw null;
                                }
                                settransitionvisibility = setTransitionVisibility.setX;
                                int i41116 = f56514j;
                                int i41117 = (i41116 & 77) + (i41116 | 77);
                                f56513i = i41117 % 128;
                                int i41118 = i41117 % 2;
                            }
                        }
                    } else {
                        int i41119 = f56514j;
                        int i51110 = (i41119 | 67) << 1;
                        int i51111 = -(((~i41119) & 67) | (i41119 & (-68)));
                        i10 = (i51110 & i51111) + (i51111 | i51110);
                        f56513i = i10 % 128;
                        if (i10 % 2 == 0) {
                            im onFocusChangeListener115 = iqVar.setOnFocusChangeListener();
                            throw null;
                        }
                        im onFocusChangeListener116 = iqVar.setOnFocusChangeListener();
                        getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener116, (TransactionFailed) setAnimation.setY(new Object[0], -1761153819, 1761153841, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(onFocusChangeListener116));
                        if (getbeeponfailure != null) {
                            if (((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure))).length >= 7) {
                                int i51112 = f56514j;
                                int i51113 = ((i51112 ^ 97) | (i51112 & 97)) << 1;
                                int i51114 = -(((~i51112) & 97) | (i51112 & (-98)));
                                int i51115 = (i51113 & i51114) + (i51114 | i51113);
                                f56513i = i51115 % 128;
                                int i51116 = i51115 % 2;
                                bArr = new byte[2];
                                bArr2 = new byte[2];
                                System.arraycopy((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure)), 5, bArr, 0, 2);
                                System.arraycopy((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{bfVar}, 252497730, -252497710, System.identityHashCode(bfVar)), 0, bArr2, 0, 2);
                                if (Intrinsics.areEqual((String) setInputExtras.setDividerPadding(new Object[]{bArr}, 1609250238, -1609250236, (int) System.currentTimeMillis()), (String) setInputExtras.setDividerPadding(new Object[]{bArr2}, 1609250238, -1609250236, (int) System.currentTimeMillis()))) {
                                    int i51117 = f56513i;
                                    int i51118 = i51117 ^ 21;
                                    int i51119 = -(-((i51117 & 21) << 1));
                                    i13 = ((i51118 | i51119) << 1) - (i51119 ^ i51118);
                                    f56514j = i13 % 128;
                                    if (i13 % 2 != 0) {
                                        throw null;
                                    }
                                    settransitionvisibility = setTransitionVisibility.setDividerPadding;
                                    int i61111 = f56513i;
                                    i11 = ((i61111 ^ 89) - (~(-(-((i61111 & 89) << 1))))) - 1;
                                    f56514j = i11 % 128;
                                    int i61112 = i11 % 2;
                                } else {
                                    im onFocusChangeListener117 = iqVar.setOnFocusChangeListener();
                                    im.setY(new Object[]{onFocusChangeListener117, Boolean.TRUE}, 36630807, -36630802, System.identityHashCode(onFocusChangeListener117));
                                    int i61113 = f56513i;
                                    int i61114 = (i61113 & (-18)) | ((~i61113) & 17);
                                    int i61115 = -(-((i61113 & 17) << 1));
                                    int i61116 = (i61114 ^ i61115) + ((i61115 & i61114) << 1);
                                    f56514j = i61116 % 128;
                                    int i61117 = i61116 % 2;
                                }
                            } else {
                                im onFocusChangeListener118 = iqVar.setOnFocusChangeListener();
                                im.setY(new Object[]{onFocusChangeListener118, Boolean.TRUE}, 36630807, -36630802, System.identityHashCode(onFocusChangeListener118));
                                int i61118 = f56514j + 53;
                                f56513i = i61118 % 128;
                                int i61119 = i61118 % 2;
                            }
                        } else if (setfitssystemwindows == setFitsSystemWindows.setX) {
                            int i622 = f56513i;
                            i12 = (i622 ^ 37) + ((i622 & 37) << 1);
                            f56514j = i12 % 128;
                            if (i12 % 2 == 0) {
                                settransitionvisibility3 = setTransitionVisibility.setDividerPadding;
                                int i76 = 64 / 0;
                            } else {
                                settransitionvisibility3 = setTransitionVisibility.setDividerPadding;
                            }
                            settransitionvisibility = settransitionvisibility3;
                        } else {
                            im onFocusChangeListener119 = iqVar.setOnFocusChangeListener();
                            im.setY(new Object[]{onFocusChangeListener119, Boolean.TRUE}, 36630807, -36630802, System.identityHashCode(onFocusChangeListener119));
                            int i77 = f56513i;
                            i11 = (i77 ^ 85) + ((i77 & 85) << 1);
                            f56514j = i11 % 128;
                            int i611110 = i11 % 2;
                        }
                    }
                }
            }
            settransitionvisibility = settransitionvisibility4;
            onFocusChangeListener = iqVar.setOnFocusChangeListener();
            transactionFailedComponent25 = setAnimation.component25();
            if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener, (String) TransactionFailed.setX(new Object[]{transactionFailedComponent25}, 1914607362, -1914607356, System.identityHashCode(transactionFailedComponent25))}, 2064855914, -2064855856, System.identityHashCode(onFocusChangeListener))).booleanValue()) {
                bfVar = new bf(iqVar.setOnFocusChangeListener());
                if (((be) ((setImageTintList) w.setX(new Object[]{bfVar}, 1693919772, -1693919769, System.identityHashCode(bfVar)))).setNavigationOnClickListener()) {
                    int i3110 = f56514j;
                    i15 = (((i3110 ^ 41) | (i3110 & 41)) << 1) - (((~i3110) & 41) | (i3110 & (-42)));
                    f56513i = i15 % 128;
                    if (i15 % 2 != 0) {
                        cr crVar11 = (cr) ((setImageTintList) w.setX(new Object[]{csVar}, 1693919772, -1693919769, System.identityHashCode(csVar)));
                        ((Boolean) cr.setDividerPadding(new Object[]{crVar11}, 1815100415, -1815100409, System.identityHashCode(crVar11))).booleanValue();
                        throw null;
                    }
                    crVar2 = (cr) ((setImageTintList) w.setX(new Object[]{csVar}, 1693919772, -1693919769, System.identityHashCode(csVar)));
                    if (((Boolean) cr.setDividerPadding(new Object[]{crVar2}, 1815100415, -1815100409, System.identityHashCode(crVar2))).booleanValue()) {
                        int i3111 = f56513i;
                        int i3112 = i3111 & 95;
                        i16 = ((((i3111 ^ 95) | i3112) << 1) - (~(-((i3111 | 95) & (~i3112))))) - 1;
                        f56514j = i16 % 128;
                        if (i16 % 2 == 0) {
                            settransitionvisibility = setTransitionVisibility.setY;
                            im onFocusChangeListener120 = iqVar.setOnFocusChangeListener();
                            im.setY(new Object[]{onFocusChangeListener120, Boolean.TRUE}, -818388399, 818388408, System.identityHashCode(onFocusChangeListener120));
                        } else {
                            settransitionvisibility = setTransitionVisibility.setY;
                            im onFocusChangeListener21 = iqVar.setOnFocusChangeListener();
                            im.setY(new Object[]{onFocusChangeListener21, Boolean.TRUE}, -818388399, 818388408, System.identityHashCode(onFocusChangeListener21));
                        }
                    } else if (!((be) ((setImageTintList) w.setX(new Object[]{bfVar}, 1693919772, -1693919769, System.identityHashCode(bfVar)))).setIncludeFontPadding()) {
                        crVar = (cr) ((setImageTintList) w.setX(new Object[]{csVar}, 1693919772, -1693919769, System.identityHashCode(csVar)));
                        if (((Boolean) cr.setDividerPadding(new Object[]{crVar}, -798032540, 798032540, System.identityHashCode(crVar))).booleanValue()) {
                            int i411110 = f56513i;
                            int i411111 = (i411110 | 67) << 1;
                            int i411112 = -(((~i411110) & 67) | (i411110 & (-68)));
                            int i411113 = (i411111 & i411112) + (i411112 | i411111);
                            f56514j = i411113 % 128;
                            int i411114 = i411113 % 2;
                            if (((be) ((setImageTintList) w.setX(new Object[]{bfVar}, 1693919772, -1693919769, System.identityHashCode(bfVar)))).setLayoutAnimation()) {
                                int i411115 = f56514j;
                                i14 = (((i411115 & (-78)) | ((~i411115) & 77)) - (~(-(-((i411115 & 77) << 1))))) - 1;
                                f56513i = i14 % 128;
                                if (i14 % 2 == 0) {
                                    throw null;
                                }
                                settransitionvisibility = setTransitionVisibility.setX;
                                int i411116 = f56514j;
                                int i411117 = (i411116 & 77) + (i411116 | 77);
                                f56513i = i411117 % 128;
                                int i411118 = i411117 % 2;
                            }
                        }
                    } else {
                        int i411119 = f56514j;
                        int i511110 = (i411119 | 67) << 1;
                        int i511111 = -(((~i411119) & 67) | (i411119 & (-68)));
                        i10 = (i511110 & i511111) + (i511111 | i511110);
                        f56513i = i10 % 128;
                        if (i10 % 2 == 0) {
                            im onFocusChangeListener1110 = iqVar.setOnFocusChangeListener();
                            throw null;
                        }
                        im onFocusChangeListener1111 = iqVar.setOnFocusChangeListener();
                        getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener1111, (TransactionFailed) setAnimation.setY(new Object[0], -1761153819, 1761153841, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(onFocusChangeListener1111));
                        if (getbeeponfailure != null) {
                            if (((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure))).length >= 7) {
                                int i511112 = f56514j;
                                int i511113 = ((i511112 ^ 97) | (i511112 & 97)) << 1;
                                int i511114 = -(((~i511112) & 97) | (i511112 & (-98)));
                                int i511115 = (i511113 & i511114) + (i511114 | i511113);
                                f56513i = i511115 % 128;
                                int i511116 = i511115 % 2;
                                bArr = new byte[2];
                                bArr2 = new byte[2];
                                System.arraycopy((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure)), 5, bArr, 0, 2);
                                System.arraycopy((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{bfVar}, 252497730, -252497710, System.identityHashCode(bfVar)), 0, bArr2, 0, 2);
                                if (Intrinsics.areEqual((String) setInputExtras.setDividerPadding(new Object[]{bArr}, 1609250238, -1609250236, (int) System.currentTimeMillis()), (String) setInputExtras.setDividerPadding(new Object[]{bArr2}, 1609250238, -1609250236, (int) System.currentTimeMillis()))) {
                                    int i511117 = f56513i;
                                    int i511118 = i511117 ^ 21;
                                    int i511119 = -(-((i511117 & 21) << 1));
                                    i13 = ((i511118 | i511119) << 1) - (i511119 ^ i511118);
                                    f56514j = i13 % 128;
                                    if (i13 % 2 != 0) {
                                        throw null;
                                    }
                                    settransitionvisibility = setTransitionVisibility.setDividerPadding;
                                    int i611111 = f56513i;
                                    i11 = ((i611111 ^ 89) - (~(-(-((i611111 & 89) << 1))))) - 1;
                                    f56514j = i11 % 128;
                                    int i611112 = i11 % 2;
                                } else {
                                    im onFocusChangeListener1112 = iqVar.setOnFocusChangeListener();
                                    im.setY(new Object[]{onFocusChangeListener1112, Boolean.TRUE}, 36630807, -36630802, System.identityHashCode(onFocusChangeListener1112));
                                    int i611113 = f56513i;
                                    int i611114 = (i611113 & (-18)) | ((~i611113) & 17);
                                    int i611115 = -(-((i611113 & 17) << 1));
                                    int i611116 = (i611114 ^ i611115) + ((i611115 & i611114) << 1);
                                    f56514j = i611116 % 128;
                                    int i611117 = i611116 % 2;
                                }
                            } else {
                                im onFocusChangeListener1113 = iqVar.setOnFocusChangeListener();
                                im.setY(new Object[]{onFocusChangeListener1113, Boolean.TRUE}, 36630807, -36630802, System.identityHashCode(onFocusChangeListener1113));
                                int i611118 = f56514j + 53;
                                f56513i = i611118 % 128;
                                int i611119 = i611118 % 2;
                            }
                        } else if (setfitssystemwindows == setFitsSystemWindows.setX) {
                            int i623 = f56513i;
                            i12 = (i623 ^ 37) + ((i623 & 37) << 1);
                            f56514j = i12 % 128;
                            if (i12 % 2 == 0) {
                                settransitionvisibility3 = setTransitionVisibility.setDividerPadding;
                                int i78 = 64 / 0;
                            } else {
                                settransitionvisibility3 = setTransitionVisibility.setDividerPadding;
                            }
                            settransitionvisibility = settransitionvisibility3;
                        } else {
                            im onFocusChangeListener1114 = iqVar.setOnFocusChangeListener();
                            im.setY(new Object[]{onFocusChangeListener1114, Boolean.TRUE}, 36630807, -36630802, System.identityHashCode(onFocusChangeListener1114));
                            int i79 = f56513i;
                            i11 = (i79 ^ 85) + ((i79 & 85) << 1);
                            f56514j = i11 % 128;
                            int i6111110 = i11 % 2;
                        }
                    }
                } else if (!((be) ((setImageTintList) w.setX(new Object[]{bfVar}, 1693919772, -1693919769, System.identityHashCode(bfVar)))).setIncludeFontPadding()) {
                    crVar = (cr) ((setImageTintList) w.setX(new Object[]{csVar}, 1693919772, -1693919769, System.identityHashCode(csVar)));
                    if (((Boolean) cr.setDividerPadding(new Object[]{crVar}, -798032540, 798032540, System.identityHashCode(crVar))).booleanValue()) {
                        int i4111110 = f56513i;
                        int i4111111 = (i4111110 | 67) << 1;
                        int i4111112 = -(((~i4111110) & 67) | (i4111110 & (-68)));
                        int i4111113 = (i4111111 & i4111112) + (i4111112 | i4111111);
                        f56514j = i4111113 % 128;
                        int i4111114 = i4111113 % 2;
                        if (((be) ((setImageTintList) w.setX(new Object[]{bfVar}, 1693919772, -1693919769, System.identityHashCode(bfVar)))).setLayoutAnimation()) {
                            int i4111115 = f56514j;
                            i14 = (((i4111115 & (-78)) | ((~i4111115) & 77)) - (~(-(-((i4111115 & 77) << 1))))) - 1;
                            f56513i = i14 % 128;
                            if (i14 % 2 == 0) {
                                throw null;
                            }
                            settransitionvisibility = setTransitionVisibility.setX;
                            int i4111116 = f56514j;
                            int i4111117 = (i4111116 & 77) + (i4111116 | 77);
                            f56513i = i4111117 % 128;
                            int i4111118 = i4111117 % 2;
                        }
                    }
                } else {
                    int i4111119 = f56514j;
                    int i5111110 = (i4111119 | 67) << 1;
                    int i5111111 = -(((~i4111119) & 67) | (i4111119 & (-68)));
                    i10 = (i5111110 & i5111111) + (i5111111 | i5111110);
                    f56513i = i10 % 128;
                    if (i10 % 2 == 0) {
                        im onFocusChangeListener1115 = iqVar.setOnFocusChangeListener();
                        throw null;
                    }
                    im onFocusChangeListener1116 = iqVar.setOnFocusChangeListener();
                    getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener1116, (TransactionFailed) setAnimation.setY(new Object[0], -1761153819, 1761153841, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(onFocusChangeListener1116));
                    if (getbeeponfailure != null) {
                        if (((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure))).length >= 7) {
                            int i5111112 = f56514j;
                            int i5111113 = ((i5111112 ^ 97) | (i5111112 & 97)) << 1;
                            int i5111114 = -(((~i5111112) & 97) | (i5111112 & (-98)));
                            int i5111115 = (i5111113 & i5111114) + (i5111114 | i5111113);
                            f56513i = i5111115 % 128;
                            int i5111116 = i5111115 % 2;
                            bArr = new byte[2];
                            bArr2 = new byte[2];
                            System.arraycopy((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure)), 5, bArr, 0, 2);
                            System.arraycopy((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{bfVar}, 252497730, -252497710, System.identityHashCode(bfVar)), 0, bArr2, 0, 2);
                            if (Intrinsics.areEqual((String) setInputExtras.setDividerPadding(new Object[]{bArr}, 1609250238, -1609250236, (int) System.currentTimeMillis()), (String) setInputExtras.setDividerPadding(new Object[]{bArr2}, 1609250238, -1609250236, (int) System.currentTimeMillis()))) {
                                int i5111117 = f56513i;
                                int i5111118 = i5111117 ^ 21;
                                int i5111119 = -(-((i5111117 & 21) << 1));
                                i13 = ((i5111118 | i5111119) << 1) - (i5111119 ^ i5111118);
                                f56514j = i13 % 128;
                                if (i13 % 2 != 0) {
                                    throw null;
                                }
                                settransitionvisibility = setTransitionVisibility.setDividerPadding;
                                int i6111111 = f56513i;
                                i11 = ((i6111111 ^ 89) - (~(-(-((i6111111 & 89) << 1))))) - 1;
                                f56514j = i11 % 128;
                                int i6111112 = i11 % 2;
                            } else {
                                im onFocusChangeListener1117 = iqVar.setOnFocusChangeListener();
                                im.setY(new Object[]{onFocusChangeListener1117, Boolean.TRUE}, 36630807, -36630802, System.identityHashCode(onFocusChangeListener1117));
                                int i6111113 = f56513i;
                                int i6111114 = (i6111113 & (-18)) | ((~i6111113) & 17);
                                int i6111115 = -(-((i6111113 & 17) << 1));
                                int i6111116 = (i6111114 ^ i6111115) + ((i6111115 & i6111114) << 1);
                                f56514j = i6111116 % 128;
                                int i6111117 = i6111116 % 2;
                            }
                        } else {
                            im onFocusChangeListener1118 = iqVar.setOnFocusChangeListener();
                            im.setY(new Object[]{onFocusChangeListener1118, Boolean.TRUE}, 36630807, -36630802, System.identityHashCode(onFocusChangeListener1118));
                            int i6111118 = f56514j + 53;
                            f56513i = i6111118 % 128;
                            int i6111119 = i6111118 % 2;
                        }
                    } else if (setfitssystemwindows == setFitsSystemWindows.setX) {
                        int i624 = f56513i;
                        i12 = (i624 ^ 37) + ((i624 & 37) << 1);
                        f56514j = i12 % 128;
                        if (i12 % 2 == 0) {
                            settransitionvisibility3 = setTransitionVisibility.setDividerPadding;
                            int i710 = 64 / 0;
                        } else {
                            settransitionvisibility3 = setTransitionVisibility.setDividerPadding;
                        }
                        settransitionvisibility = settransitionvisibility3;
                    } else {
                        im onFocusChangeListener1119 = iqVar.setOnFocusChangeListener();
                        im.setY(new Object[]{onFocusChangeListener1119, Boolean.TRUE}, 36630807, -36630802, System.identityHashCode(onFocusChangeListener1119));
                        int i711 = f56513i;
                        i11 = (i711 ^ 85) + ((i711 & 85) << 1);
                        f56514j = i11 % 128;
                        int i61111110 = i11 % 2;
                    }
                }
            }
        }
        if (settransitionvisibility == settransitionvisibility4) {
            int i80 = f56513i;
            int i81 = i80 & 27;
            int i82 = (i81 - (~(-(-((i80 ^ 27) | i81))))) - 1;
            f56514j = i82 % 128;
            int i83 = i82 % 2;
            cr crVar12 = (cr) ((setImageTintList) w.setX(new Object[]{csVar}, 1693919772, -1693919769, System.identityHashCode(csVar)));
            if (!(!((Boolean) cr.setDividerPadding(new Object[]{crVar12}, 720483124, -720483117, System.identityHashCode(crVar12))).booleanValue())) {
                int i84 = f56514j + 83;
                f56513i = i84 % 128;
                if (i84 % 2 != 0) {
                    settransitionvisibility2 = setTransitionVisibility.setOnFocusChangeListener;
                    im onFocusChangeListener22 = iqVar.setOnFocusChangeListener();
                    im.setY(new Object[]{onFocusChangeListener22, Boolean.TRUE}, 36630807, -36630802, System.identityHashCode(onFocusChangeListener22));
                } else {
                    settransitionvisibility2 = setTransitionVisibility.setOnFocusChangeListener;
                    im onFocusChangeListener23 = iqVar.setOnFocusChangeListener();
                    im.setY(new Object[]{onFocusChangeListener23, Boolean.TRUE}, 36630807, -36630802, System.identityHashCode(onFocusChangeListener23));
                }
                settransitionvisibility = settransitionvisibility2;
                int i85 = f56513i + 69;
                f56514j = i85 % 128;
                int i86 = i85 % 2;
            }
        }
        if (settransitionvisibility == settransitionvisibility4) {
            int i87 = f56513i + 59;
            f56514j = i87 % 128;
            int i88 = i87 % 2;
            settransitionvisibility = setTransitionVisibility.setOnFocusChangeListener;
            int i89 = f56514j;
            int i90 = (i89 ^ 34) + ((i89 & 34) << 1);
            int i91 = (i90 ^ (-1)) + (i90 << 1);
            f56513i = i91 % 128;
            int i92 = i91 % 2;
        }
        int i93 = f56514j;
        int i94 = ((i93 | 123) << 1) - (i93 ^ 123);
        f56513i = i94 % 128;
        if (i94 % 2 != 0) {
            int i95 = 35 / 0;
        }
        return settransitionvisibility;
    }

    public static /* synthetic */ getBeepOnFailure b(Object[] objArr) throws Exception {
        im imVar = (im) objArr[0];
        int i10 = f56513i;
        int i11 = ((i10 ^ 13) | (i10 & 13)) << 1;
        int i12 = -(((~i10) & 13) | (i10 & (-14)));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f56514j = i13 % 128;
        int i14 = i13 % 2;
        getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = getBeepOnFailure.setOnFocusChangeListener;
        setAnimation setanimation = setAnimation.INSTANCE;
        TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], 1440069230, -1440069166, (int) System.currentTimeMillis());
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed)), null, null, Boolean.FALSE, 30}, -976227287, 976227290, 30);
        setImageTintList setimagetintlist = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 1115257939, -1115257923, System.identityHashCode(getbeeponfailure));
        setImageTintList setimagetintlist2 = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 1115257939, -1115257923, System.identityHashCode(getbeeponfailure));
        int onFocusChangeListener = ((setFindListener) setImageTintList.setX(new Object[]{setimagetintlist2}, -352851471, 352851476, System.identityHashCode(setimagetintlist2))).setOnFocusChangeListener();
        setImageTintList.setX(new Object[]{setimagetintlist, Integer.valueOf(onFocusChangeListener)}, -2003004454, 2003004454, onFocusChangeListener);
        getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{imVar, (TransactionFailed) setAnimation.setY(new Object[0], 634564037, -634564032, (int) System.currentTimeMillis())}, 1431838387, -1431838363, System.identityHashCode(imVar));
        byte b10 = ((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 252497730, -252497710, System.identityHashCode(getbeeponfailure2)))[4];
        setInputExtras.setDividerPadding(new Object[]{(byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure)), 0, 7, Boolean.valueOf(((Boolean) setLogo.setY(new Object[]{Byte.valueOf(b10), 5}, 1812344530, -1812344522, 5)).booleanValue())}, -91299280, 91299286, 0);
        setInputExtras.setDividerPadding(new Object[]{(byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure)), 0, 6, Boolean.valueOf(((Boolean) setLogo.setY(new Object[]{Byte.valueOf(b10), 4}, 1812344530, -1812344522, 4)).booleanValue())}, -91299280, 91299286, 0);
        setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{imVar, getbeeponfailure}, 2008358388, -2008358355, System.identityHashCode(imVar));
        int i15 = f56513i;
        int i16 = (i15 & 116) + (i15 | 116);
        int i17 = (i16 ^ (-1)) + (i16 << 1);
        f56514j = i17 % 128;
        if (i17 % 2 != 0) {
            return getbeeponfailure;
        }
        throw null;
    }

    public static /* synthetic */ fk c(Object[] objArr) {
        activateSession activatesession;
        iq iqVar = (iq) objArr[0];
        setTransitionVisibility settransitionvisibility = (setTransitionVisibility) objArr[1];
        setSelector setselector = (setSelector) objArr[2];
        int i10 = f56514j;
        int i11 = (i10 & (-60)) | ((~i10) & 59);
        int i12 = (i10 & 59) << 1;
        int i13 = (i11 & i12) + (i12 | i11);
        f56513i = i13 % 128;
        int i14 = i13 % 2;
        if (settransitionvisibility == setTransitionVisibility.setX) {
            int i15 = f56514j;
            int i16 = i15 & 119;
            int i17 = -(-((i15 ^ 119) | i16));
            int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
            f56513i = i18 % 128;
            int i19 = i18 % 2;
            activatesession = activateSession.APPROVED_SIGN;
            int i20 = f56514j;
            int i21 = i20 ^ 25;
            int i22 = (((i20 & 25) | i21) << 1) - i21;
            f56513i = i22 % 128;
            int i23 = i22 % 2;
        } else {
            activatesession = activateSession.APPROVED;
            int i24 = f56513i;
            int i25 = ((i24 & 76) + (i24 | 76)) - 1;
            f56514j = i25 % 128;
            int i26 = i25 % 2;
        }
        iu x4 = iqVar.setX();
        fk fkVar = (fk) iu.setX(new Object[]{x4, iqVar.setOnFocusChangeListener(), iqVar.setCompoundDrawableTintBlendMode(), activatesession, fd.APPROVED, setselector, settransitionvisibility}, 1387632794, -1387632788, System.identityHashCode(x4));
        int i27 = f56513i;
        int i28 = ((i27 ^ 85) | (i27 & 85)) << 1;
        int i29 = -(((~i27) & 85) | (i27 & (-86)));
        int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
        f56514j = i30 % 128;
        if (i30 % 2 != 0) {
            return fkVar;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0534  */
    /* JADX WARN: Code duplicated, block: B:101:0x0536  */
    /* JADX WARN: Code duplicated, block: B:102:0x0538 A[Catch: Exception -> 0x08ea, TryCatch #2 {Exception -> 0x08ea, blocks: (B:4:0x002c, B:20:0x00bf, B:24:0x00c3, B:26:0x00e5, B:33:0x0158, B:39:0x0196, B:60:0x031d, B:63:0x035e, B:66:0x03c3, B:72:0x0411, B:78:0x0441, B:80:0x0462, B:86:0x04aa, B:88:0x04d7, B:98:0x051b, B:105:0x0553, B:113:0x05e9, B:115:0x05ec, B:120:0x0643, B:108:0x05ac, B:102:0x0538, B:94:0x04de, B:128:0x0690, B:136:0x0719, B:143:0x0766, B:146:0x07ac, B:149:0x0811, B:131:0x06d6, B:151:0x082e, B:153:0x0860, B:45:0x019e, B:51:0x02ec, B:55:0x02f0, B:162:0x0881, B:164:0x08e6), top: B:174:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:104:0x0551  */
    /* JADX WARN: Code duplicated, block: B:107:0x0585  */
    /* JADX WARN: Code duplicated, block: B:108:0x05ac A[Catch: Exception -> 0x08ea, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x08ea, blocks: (B:4:0x002c, B:20:0x00bf, B:24:0x00c3, B:26:0x00e5, B:33:0x0158, B:39:0x0196, B:60:0x031d, B:63:0x035e, B:66:0x03c3, B:72:0x0411, B:78:0x0441, B:80:0x0462, B:86:0x04aa, B:88:0x04d7, B:98:0x051b, B:105:0x0553, B:113:0x05e9, B:115:0x05ec, B:120:0x0643, B:108:0x05ac, B:102:0x0538, B:94:0x04de, B:128:0x0690, B:136:0x0719, B:143:0x0766, B:146:0x07ac, B:149:0x0811, B:131:0x06d6, B:151:0x082e, B:153:0x0860, B:45:0x019e, B:51:0x02ec, B:55:0x02f0, B:162:0x0881, B:164:0x08e6), top: B:174:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:111:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:113:0x05e9 A[Catch: Exception -> 0x08ea, TRY_ENTER, TryCatch #2 {Exception -> 0x08ea, blocks: (B:4:0x002c, B:20:0x00bf, B:24:0x00c3, B:26:0x00e5, B:33:0x0158, B:39:0x0196, B:60:0x031d, B:63:0x035e, B:66:0x03c3, B:72:0x0411, B:78:0x0441, B:80:0x0462, B:86:0x04aa, B:88:0x04d7, B:98:0x051b, B:105:0x0553, B:113:0x05e9, B:115:0x05ec, B:120:0x0643, B:108:0x05ac, B:102:0x0538, B:94:0x04de, B:128:0x0690, B:136:0x0719, B:143:0x0766, B:146:0x07ac, B:149:0x0811, B:131:0x06d6, B:151:0x082e, B:153:0x0860, B:45:0x019e, B:51:0x02ec, B:55:0x02f0, B:162:0x0881, B:164:0x08e6), top: B:174:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:115:0x05ec A[Catch: Exception -> 0x08ea, TRY_LEAVE, TryCatch #2 {Exception -> 0x08ea, blocks: (B:4:0x002c, B:20:0x00bf, B:24:0x00c3, B:26:0x00e5, B:33:0x0158, B:39:0x0196, B:60:0x031d, B:63:0x035e, B:66:0x03c3, B:72:0x0411, B:78:0x0441, B:80:0x0462, B:86:0x04aa, B:88:0x04d7, B:98:0x051b, B:105:0x0553, B:113:0x05e9, B:115:0x05ec, B:120:0x0643, B:108:0x05ac, B:102:0x0538, B:94:0x04de, B:128:0x0690, B:136:0x0719, B:143:0x0766, B:146:0x07ac, B:149:0x0811, B:131:0x06d6, B:151:0x082e, B:153:0x0860, B:45:0x019e, B:51:0x02ec, B:55:0x02f0, B:162:0x0881, B:164:0x08e6), top: B:174:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:117:0x061d  */
    /* JADX WARN: Code duplicated, block: B:119:0x0642  */
    /* JADX WARN: Code duplicated, block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x050b A[PHI: r6
      0x050b: PHI (r6v69 com.mypinpad.tsdk.i.getBeepOnFailure) = (r6v68 com.mypinpad.tsdk.i.getBeepOnFailure), (r6v110 com.mypinpad.tsdk.i.getBeepOnFailure) binds: [B:95:0x0509, B:89:0x04d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:98:0x051b A[Catch: Exception -> 0x08ea, TRY_ENTER, TryCatch #2 {Exception -> 0x08ea, blocks: (B:4:0x002c, B:20:0x00bf, B:24:0x00c3, B:26:0x00e5, B:33:0x0158, B:39:0x0196, B:60:0x031d, B:63:0x035e, B:66:0x03c3, B:72:0x0411, B:78:0x0441, B:80:0x0462, B:86:0x04aa, B:88:0x04d7, B:98:0x051b, B:105:0x0553, B:113:0x05e9, B:115:0x05ec, B:120:0x0643, B:108:0x05ac, B:102:0x0538, B:94:0x04de, B:128:0x0690, B:136:0x0719, B:143:0x0766, B:146:0x07ac, B:149:0x0811, B:131:0x06d6, B:151:0x082e, B:153:0x0860, B:45:0x019e, B:51:0x02ec, B:55:0x02f0, B:162:0x0881, B:164:0x08e6), top: B:174:0x002a }] */
    public static /* synthetic */ Boolean d(Object[] objArr) {
        Byte bValueOf;
        byte[] bArr;
        int i10;
        getBeepOnFailure getbeeponfailure;
        int i11;
        int i12;
        getBeepOnFailure getbeeponfailure2;
        byte[] bArr2;
        in inVar;
        int i13;
        Boolean bool = Boolean.FALSE;
        iq iqVar = (iq) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i14 = f56514j;
        int i15 = (i14 & 49) + (i14 | 49);
        f56513i = i15 % 128;
        try {
            if (i15 % 2 != 0) {
                im onFocusChangeListener = iqVar.setOnFocusChangeListener();
                setAnimation setanimation = setAnimation.INSTANCE;
                im onFocusChangeListener2 = iqVar.setOnFocusChangeListener();
                try {
                    throw null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            im onFocusChangeListener3 = iqVar.setOnFocusChangeListener();
            setAnimation setanimation2 = setAnimation.INSTANCE;
            getBeepOnFailure getbeeponfailure3 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener3, (TransactionFailed) setAnimation.setY(new Object[0], -1554496015, 1554496070, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(onFocusChangeListener3));
            im onFocusChangeListener4 = iqVar.setOnFocusChangeListener();
            getBeepOnFailure getbeeponfailure4 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener4, (TransactionFailed) setAnimation.setY(new Object[0], -939472057, 939472144, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(onFocusChangeListener4));
            if (getbeeponfailure3 == null && getbeeponfailure4 == null) {
                int i16 = f56514j;
                int i17 = ((i16 | 124) << 1) - (i16 ^ 124);
                int i18 = (i17 ^ (-1)) + (i17 << 1);
                f56513i = i18 % 128;
                int i19 = i18 % 2;
                return bool;
            }
            if (!(!zBooleanValue)) {
                int i20 = f56513i;
                int i21 = i20 + 123;
                f56514j = i21 % 128;
                if (i21 % 2 == 0) {
                    try {
                        throw null;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (getbeeponfailure3 == null) {
                    int i22 = i20 | 81;
                    int i23 = i22 << 1;
                    int i24 = -(i22 & (~(i20 & 81)));
                    int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
                    f56514j = i25 % 128;
                    return Boolean.valueOf(!(i25 % 2 != 0));
                }
            }
            SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
            SouthPacificEndpoint.setX(new Object[]{20025, null, 6}, 1336485880, -1336485874, 20025);
            if (zBooleanValue) {
                cp cpVar = new cp(iqVar.setOnFocusChangeListener());
                aq aqVar = new aq(iqVar.setOnFocusChangeListener());
                am amVar = (am) ((setImageTintList) w.setX(new Object[]{aqVar}, 1693919772, -1693919769, System.identityHashCode(aqVar)));
                if (!((Boolean) am.setY(new Object[]{amVar}, -1378668101, 1378668110, System.identityHashCode(amVar))).booleanValue()) {
                    int i26 = f56514j;
                    int i27 = i26 ^ 63;
                    int i28 = (i26 & 63) << 1;
                    int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
                    f56513i = i29 % 128;
                    return Boolean.valueOf(i29 % 2 != 0);
                }
            }
            im onFocusChangeListener5 = iqVar.setOnFocusChangeListener();
            getBeepOnFailure getbeeponfailure5 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener5, (TransactionFailed) setAnimation.setY(new Object[0], 2061768348, -2061768213, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(onFocusChangeListener5));
            if (getbeeponfailure5 == null) {
                int i30 = f56514j + 37;
                f56513i = i30 % 128;
                if (i30 % 2 != 0) {
                    int i31 = 76 / 0;
                }
                bValueOf = null;
            } else {
                byte[] bArr3 = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure5}, 252497730, -252497710, System.identityHashCode(getbeeponfailure5));
                if (bArr3 == null) {
                    int iIdentityHashCode = System.identityHashCode(iqVar);
                    int i32 = (-723447942) & iIdentityHashCode;
                    int i33 = (~i32) & ((-723447942) | iIdentityHashCode);
                    int i34 = ~iIdentityHashCode;
                    int i35 = (i33 ^ i32) | (i32 & i33);
                    int i36 = ~i35;
                    int i37 = (i35 | i36) & i36;
                    int i38 = i34 ^ 980780973;
                    int i39 = 980780973 & i34;
                    int i40 = (i38 ^ i39) | (i38 & i39);
                    int i41 = ~i40;
                    int i42 = (i41 & (i40 | i41)) | i37;
                    int i43 = (i34 | iIdentityHashCode) & i34;
                    int i44 = (i43 & (-723447942)) | (723447941 & (~i43));
                    int i45 = i43 & 723447941;
                    int i46 = ~((i45 & i44) | (i44 ^ i45));
                    int i47 = i42 & i46;
                    int i48 = (i42 | i46) & (~i47);
                    int i49 = -(-(((i48 & i47) | (i48 ^ i47)) * (-516)));
                    int i50 = 2064370578 ^ i49;
                    int i51 = ((i49 & 2064370578) | i50) << 1;
                    int i52 = -i50;
                    int i53 = ((i51 | i52) << 1) - (i51 ^ i52);
                    int i54 = ((-705986694) & i34) | (705986693 & iIdentityHashCode);
                    int i55 = iIdentityHashCode & (-705986694);
                    int i56 = (i55 & i54) | (i54 ^ i55);
                    int i57 = ~i56;
                    int i58 = (i56 | i57) & i57;
                    int i59 = ((-980780974) & i34) | ((-980780974) ^ i34);
                    int i60 = (i59 & (-723447942)) | (723447941 & (~i59));
                    int i61 = i59 & 723447941;
                    int i62 = ~((i61 & i60) | (i60 ^ i61));
                    int i63 = i58 & i62;
                    int i64 = (((i58 | i62) & (~i63)) | i63) * LibMCryptConstants.IND_HEX_SEGMENTO2;
                    int i65 = i53 & i64;
                    int i66 = ((i53 ^ i64) | i65) << 1;
                    int i67 = -((i64 | i53) & (~i65));
                    int i68 = (i66 & i67) + (i67 | i66);
                    int i69 = ~((i34 & (-723447942)) | (723447941 & (~i34)) | (i34 & 723447941));
                    int i70 = (i68 - (~(-(~(((i69 & 274794280) | (((~i69) & 274794280) | ((-274794281) & i69))) * LibMCryptConstants.IND_HEX_SEGMENTO2))))) - 2;
                    int iIdentityHashCode2 = System.identityHashCode(iqVar);
                    int i71 = ~iIdentityHashCode2;
                    int i72 = (-1376478559) ^ i71;
                    int i73 = ~i71;
                    int i74 = (-1376478559) & i71;
                    int i75 = (i74 & i72) | (i72 ^ i74);
                    int i76 = ~i75;
                    int i77 = (i75 | i76) & i76;
                    int i78 = (-1383718182) ^ iIdentityHashCode2;
                    int i79 = (-1383718182) & iIdentityHashCode2;
                    int i80 = ~((i78 ^ i79) | (i78 & i79));
                    int i81 = ((~i80) & i77) | ((~i77) & i80);
                    int i82 = i77 & i80;
                    int i83 = -(-(((i81 & i82) | (i81 ^ i82)) * ReturnCode.ERR_REPOSITORY));
                    int i84 = (((~i83) & 503345249) | ((-503345250) & i83)) + ((i83 & 503345249) << 1);
                    int i85 = (i71 & (-1383718182)) | (1383718181 & i73);
                    int i86 = i71 & 1383718181;
                    int i87 = ~((i85 & i86) | (i85 ^ i86));
                    int i88 = 1376478558 & iIdentityHashCode2;
                    int i89 = (~i88) & (1376478558 | iIdentityHashCode2);
                    int i90 = ~((i89 ^ i88) | (i88 & i89));
                    int i91 = i87 & i90;
                    int i92 = (i87 | i90) & (~i91);
                    int i93 = (((i92 & i91) | (i92 ^ i91)) * (-950)) + i84;
                    int i94 = ~((i71 ^ 1376478558) | (i71 & 1376478558));
                    int i95 = 1383718181 ^ iIdentityHashCode2;
                    int i96 = iIdentityHashCode2 & 1383718181;
                    int i97 = ~((i96 & i95) | (i95 ^ i96));
                    int i98 = -(-(((i94 & i97) | (i94 ^ i97)) * 950));
                    int i99 = i93 & i98;
                    int i100 = (i93 | i98) & (~i99);
                    int i101 = -(-(i99 << 1));
                    if (i70 <= ((i100 | i101) << 1) - (i100 ^ i101)) {
                        try {
                            throw null;
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    bValueOf = null;
                } else {
                    bValueOf = Byte.valueOf(ArraysKt___ArraysKt.first(bArr3));
                    int i102 = f56514j;
                    int i103 = i102 & 81;
                    int i104 = -(-(i102 | 81));
                    int i105 = ((i103 | i104) << 1) - (i104 ^ i103);
                    f56513i = i105 % 128;
                    int i106 = i105 % 2;
                }
            }
            if (bValueOf == null) {
                int i107 = f56513i;
                int i108 = ((i107 | 37) << 1) - (i107 ^ 37);
                f56514j = i108 % 128;
                int i109 = i108 % 2;
                SouthPacificEndpoint.setX(new Object[]{20007, (TransactionFailed) setAnimation.setY(new Object[0], 2061768348, -2061768213, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20007);
                int i110 = f56513i;
                int i111 = i110 ^ 101;
                int i112 = (((i110 & 101) | i111) << 1) - i111;
                f56514j = i112 % 128;
                int i113 = i112 % 2;
                return bool;
            }
            di diVar = iqVar.f56515f;
            im onFocusChangeListener6 = iqVar.setOnFocusChangeListener();
            im onFocusChangeListener7 = iqVar.setOnFocusChangeListener();
            setBackgroundTintList setbackgroundtintlist = (setBackgroundTintList) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener7}, -296152793, 296152815, System.identityHashCode(onFocusChangeListener7));
            dg dgVar = (dg) di.setDividerPadding(new Object[]{diVar, onFocusChangeListener6, (byte[]) setBackgroundTintList.setX(new Object[]{setbackgroundtintlist}, 1426653476, -1426653475, System.identityHashCode(setbackgroundtintlist)), bValueOf}, 1002023655, -1002023654, System.identityHashCode(diVar));
            if (dgVar == null) {
                int i114 = f56514j;
                int i115 = i114 & 79;
                int i116 = ((i114 | 79) & (~i115)) + (i115 << 1);
                f56513i = i116 % 128;
                int i117 = i116 % 2;
                SouthPacificEndpoint.setX(new Object[]{20009, (getDetailsFieldTextSizeSp) setLogo.setY(new Object[]{Byte.valueOf(bValueOf.byteValue())}, -1836464407, 1836464411, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20009);
                int i118 = f56513i;
                int i119 = (i118 & 107) + (i118 | 107);
                f56514j = i119 % 128;
                if (i119 % 2 != 0) {
                    return bool;
                }
                throw null;
            }
            du duVar = du.INSTANCE;
            if (!((Boolean) du.setOnFocusChangeListener(new Object[]{iqVar.setOnFocusChangeListener()}, 1016771223, -1016771218, (int) System.currentTimeMillis())).booleanValue()) {
                int i120 = f56514j + 7;
                f56513i = i120 % 128;
                if (i120 % 2 != 0) {
                    SouthPacificEndpoint.setX(new Object[]{18570, null, 21}, 1336485880, -1336485874, 18570);
                    return bool;
                }
                SouthPacificEndpoint.setX(new Object[]{20008, null, 6}, 1336485880, -1336485874, 20008);
                return bool;
            }
            setContentDescription setcontentdescription = iqVar.f56517h;
            if (getbeeponfailure3 == null) {
                if (getbeeponfailure4 == null) {
                    int i121 = f56513i;
                    int i122 = (i121 & (-92)) | ((~i121) & 91);
                    int i123 = -(-((i121 & 91) << 1));
                    int i124 = (i122 ^ i123) + ((i123 & i122) << 1);
                    f56514j = i124 % 128;
                    if (i124 % 2 != 0) {
                        return bool;
                    }
                    throw null;
                }
                int i125 = f56514j;
                int i126 = i125 ^ 77;
                int i127 = (i125 & 77) << 1;
                int i128 = (i126 ^ i127) + ((i127 & i126) << 1);
                f56513i = i128 % 128;
                if (i128 % 2 != 0) {
                    im onFocusChangeListener8 = iqVar.setOnFocusChangeListener();
                    try {
                        throw null;
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
                im onFocusChangeListener9 = iqVar.setOnFocusChangeListener();
                getBeepOnFailure getbeeponfailure6 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener9, (TransactionFailed) setAnimation.setY(new Object[0], -939472057, 939472144, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(onFocusChangeListener9));
                if (getbeeponfailure6 == null) {
                    int i129 = f56514j;
                    int i130 = (i129 & 108) + (i129 | 108);
                    int i131 = (i130 ^ (-1)) + (i130 << 1);
                    f56513i = i131 % 128;
                    int i132 = i131 % 2;
                    bArr = null;
                } else {
                    bArr = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure6}, 252497730, -252497710, System.identityHashCode(getbeeponfailure6));
                    int i133 = f56514j;
                    int i134 = i133 & 83;
                    int i135 = ((i133 ^ 83) | i134) << 1;
                    int i136 = -((i133 | 83) & (~i134));
                    int i137 = (i135 ^ i136) + ((i136 & i135) << 1);
                    f56513i = i137 % 128;
                    int i138 = i137 % 2;
                }
                if (bArr == null) {
                    int i139 = f56514j;
                    int i140 = i139 & 31;
                    int i141 = -(-((i139 ^ 31) | i140));
                    int i142 = (i140 ^ i141) + ((i141 & i140) << 1);
                    f56513i = i142 % 128;
                    int i143 = i142 % 2;
                    return bool;
                }
                new ik();
                byte[] bArr4 = (byte[]) ik.setOnFocusChangeListener(new Object[]{iqVar.setOnFocusChangeListener(), dgVar, bArr, setcontentdescription}, 253440841, -253440841, (int) System.currentTimeMillis());
                if (bArr4 == null) {
                    int i144 = f56513i;
                    int i145 = ((i144 & 84) + (i144 | 84)) - 1;
                    f56514j = i145 % 128;
                    int i146 = i145 % 2;
                    int i147 = (i144 & 14) + (i144 | 14);
                    int i148 = (i147 ^ (-1)) + (i147 << 1);
                    f56514j = i148 % 128;
                    if (i148 % 2 != 0) {
                        return bool;
                    }
                    throw null;
                }
                im onFocusChangeListener10 = iqVar.setOnFocusChangeListener();
                getBeepOnFailure getbeeponfailure7 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener10, (TransactionFailed) setAnimation.setY(new Object[0], 937151038, -937150949, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(onFocusChangeListener10));
                if (getbeeponfailure7 == null) {
                    int i149 = f56513i;
                    int i150 = ((i149 & (-66)) | ((~i149) & 65)) + ((i149 & 65) << 1);
                    f56514j = i150 % 128;
                    int i151 = i150 % 2;
                    getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = getBeepOnFailure.setOnFocusChangeListener;
                    TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], 937151038, -937150949, (int) System.currentTimeMillis());
                    getbeeponfailure7 = (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed)), bArr4, null, bool, 28}, -976227287, 976227290, 28);
                    int i152 = f56513i;
                    int i153 = ((i152 ^ 33) - (~(-(-((i152 & 33) << 1))))) - 1;
                    f56514j = i153 % 128;
                    int i154 = i153 % 2;
                    i10 = 2;
                } else {
                    int i155 = f56514j + 119;
                    f56513i = i155 % 128;
                    i10 = 2;
                    int i156 = i155 % 2;
                }
                im onFocusChangeListener11 = iqVar.setOnFocusChangeListener();
                Object[] objArr2 = new Object[i10];
                objArr2[0] = onFocusChangeListener11;
                objArr2[1] = getbeeponfailure7;
                setScrollBarDefaultDelayBeforeFade.setDividerPadding(objArr2, 2008358388, -2008358355, System.identityHashCode(onFocusChangeListener11));
                return Boolean.TRUE;
            }
            int i157 = f56514j;
            int i158 = ((i157 ^ 31) | (i157 & 31)) << 1;
            int i159 = -(((~i157) & 31) | (i157 & (-32)));
            int i160 = (i158 ^ i159) + ((i159 & i158) << 1);
            f56513i = i160 % 128;
            if (i160 % 2 != 0) {
                im onFocusChangeListener12 = iqVar.setOnFocusChangeListener();
                getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener12, (TransactionFailed) setAnimation.setY(new Object[0], -1761153819, 1761153841, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(onFocusChangeListener12));
                int i161 = 15 / 0;
                if (getbeeponfailure != null) {
                    int i162 = f56514j;
                    int i163 = i162 & 99;
                    i11 = i163 + ((i162 ^ 99) | i163);
                    f56513i = i11 % 128;
                    if (i11 % 2 != 0) {
                        i12 = 0;
                        if (((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure)))[0] != 1) {
                        }
                        im onFocusChangeListener13 = iqVar.setOnFocusChangeListener();
                        TransactionFailed transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[i12], -1554496015, 1554496070, (int) System.currentTimeMillis());
                        Object[] objArr3 = new Object[2];
                        objArr3[i12] = onFocusChangeListener13;
                        objArr3[1] = transactionFailed2;
                        getbeeponfailure2 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(objArr3, -1593889019, 1593889062, System.identityHashCode(onFocusChangeListener13));
                        if (getbeeponfailure2 == null) {
                            int i164 = f56513i;
                            int i165 = i164 & 29;
                            int i166 = (((i164 ^ 29) | i165) << 1) - ((~i165) & (i164 | 29));
                            f56514j = i166 % 128;
                            int i167 = i166 % 2;
                            int i168 = i164 & 7;
                            int i169 = -(-((i164 ^ 7) | i168));
                            int i170 = (i168 ^ i169) + ((i169 & i168) << 1);
                            f56514j = i170 % 128;
                            int i171 = i170 % 2;
                            bArr2 = null;
                        } else {
                            bArr2 = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 252497730, -252497710, System.identityHashCode(getbeeponfailure2));
                            int i172 = f56513i;
                            int i173 = ((i172 ^ 81) - (~((i172 & 81) << 1))) - 1;
                            f56514j = i173 % 128;
                            int i174 = i173 % 2;
                        }
                        if (bArr2 == null) {
                            int i175 = f56514j;
                            int i176 = i175 ^ 65;
                            int i177 = ((i175 & 65) | i176) << 1;
                            int i178 = -i176;
                            i13 = (i177 & i178) + (i177 | i178);
                            f56513i = i13 % 128;
                            if (i13 % 2 != 0) {
                                return Boolean.TRUE;
                            }
                            return bool;
                        }
                        new ik();
                        inVar = (in) ik.setOnFocusChangeListener(new Object[]{iqVar.setOnFocusChangeListener(), dgVar, bArr2, setcontentdescription, Boolean.valueOf(zBooleanValue)}, -1531256370, 1531256371, (int) System.currentTimeMillis());
                        if (inVar == null) {
                            dv dvVar = dv.INSTANCE;
                            dv.setOnFocusChangeListener(new Object[]{iqVar.setOnFocusChangeListener(), inVar}, -2054554965, 2054554965, (int) System.currentTimeMillis());
                            int i179 = f56513i + 1;
                            f56514j = i179 % 128;
                            int i180 = i179 % 2;
                            return Boolean.TRUE;
                        }
                        int i181 = f56514j;
                        int i182 = ((i181 & 98) + (i181 | 98)) - 1;
                        f56513i = i182 % 128;
                        int i183 = i182 % 2;
                        int i184 = i181 & 63;
                        int i185 = ((i181 ^ 63) | i184) << 1;
                        int i186 = -((i181 | 63) & (~i184));
                        int i187 = (i185 ^ i186) + ((i186 & i185) << 1);
                        f56513i = i187 % 128;
                        int i188 = i187 % 2;
                        return bool;
                    }
                    if (((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure)))[0] != 0) {
                        i12 = 0;
                        im onFocusChangeListener14 = iqVar.setOnFocusChangeListener();
                        TransactionFailed transactionFailed3 = (TransactionFailed) setAnimation.setY(new Object[i12], -1554496015, 1554496070, (int) System.currentTimeMillis());
                        Object[] objArr4 = new Object[2];
                        objArr4[i12] = onFocusChangeListener14;
                        objArr4[1] = transactionFailed3;
                        getbeeponfailure2 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(objArr4, -1593889019, 1593889062, System.identityHashCode(onFocusChangeListener14));
                        if (getbeeponfailure2 == null) {
                            int i1610 = f56513i;
                            int i1611 = i1610 & 29;
                            int i1612 = (((i1610 ^ 29) | i1611) << 1) - ((~i1611) & (i1610 | 29));
                            f56514j = i1612 % 128;
                            int i1613 = i1612 % 2;
                            int i1614 = i1610 & 7;
                            int i1615 = -(-((i1610 ^ 7) | i1614));
                            int i1710 = (i1614 ^ i1615) + ((i1615 & i1614) << 1);
                            f56514j = i1710 % 128;
                            int i1711 = i1710 % 2;
                            bArr2 = null;
                        } else {
                            bArr2 = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 252497730, -252497710, System.identityHashCode(getbeeponfailure2));
                            int i1712 = f56513i;
                            int i1713 = ((i1712 ^ 81) - (~((i1712 & 81) << 1))) - 1;
                            f56514j = i1713 % 128;
                            int i1714 = i1713 % 2;
                        }
                        if (bArr2 == null) {
                            int i1715 = f56514j;
                            int i1716 = i1715 ^ 65;
                            int i1717 = ((i1715 & 65) | i1716) << 1;
                            int i1718 = -i1716;
                            i13 = (i1717 & i1718) + (i1717 | i1718);
                            f56513i = i13 % 128;
                            if (i13 % 2 != 0) {
                                return Boolean.TRUE;
                            }
                            return bool;
                        }
                        new ik();
                        inVar = (in) ik.setOnFocusChangeListener(new Object[]{iqVar.setOnFocusChangeListener(), dgVar, bArr2, setcontentdescription, Boolean.valueOf(zBooleanValue)}, -1531256370, 1531256371, (int) System.currentTimeMillis());
                        if (inVar == null) {
                            dv dvVar2 = dv.INSTANCE;
                            dv.setOnFocusChangeListener(new Object[]{iqVar.setOnFocusChangeListener(), inVar}, -2054554965, 2054554965, (int) System.currentTimeMillis());
                            int i1719 = f56513i + 1;
                            f56514j = i1719 % 128;
                            int i189 = i1719 % 2;
                            return Boolean.TRUE;
                        }
                        int i1810 = f56514j;
                        int i1811 = ((i1810 & 98) + (i1810 | 98)) - 1;
                        f56513i = i1811 % 128;
                        int i1812 = i1811 % 2;
                        int i1813 = i1810 & 63;
                        int i1814 = ((i1810 ^ 63) | i1813) << 1;
                        int i1815 = -((i1810 | 63) & (~i1813));
                        int i1816 = (i1814 ^ i1815) + ((i1815 & i1814) << 1);
                        f56513i = i1816 % 128;
                        int i1817 = i1816 % 2;
                        return bool;
                    }
                }
            } else {
                im onFocusChangeListener15 = iqVar.setOnFocusChangeListener();
                getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener15, (TransactionFailed) setAnimation.setY(new Object[0], -1761153819, 1761153841, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(onFocusChangeListener15));
                if (getbeeponfailure != null) {
                    int i1616 = f56514j;
                    int i1617 = i1616 & 99;
                    i11 = i1617 + ((i1616 ^ 99) | i1617);
                    f56513i = i11 % 128;
                    if (i11 % 2 != 0) {
                        i12 = 0;
                        if (((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure)))[0] != 1) {
                        }
                        im onFocusChangeListener16 = iqVar.setOnFocusChangeListener();
                        TransactionFailed transactionFailed4 = (TransactionFailed) setAnimation.setY(new Object[i12], -1554496015, 1554496070, (int) System.currentTimeMillis());
                        Object[] objArr5 = new Object[2];
                        objArr5[i12] = onFocusChangeListener16;
                        objArr5[1] = transactionFailed4;
                        getbeeponfailure2 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(objArr5, -1593889019, 1593889062, System.identityHashCode(onFocusChangeListener16));
                        if (getbeeponfailure2 == null) {
                            int i1618 = f56513i;
                            int i1619 = i1618 & 29;
                            int i16110 = (((i1618 ^ 29) | i1619) << 1) - ((~i1619) & (i1618 | 29));
                            f56514j = i16110 % 128;
                            int i16111 = i16110 % 2;
                            int i16112 = i1618 & 7;
                            int i16113 = -(-((i1618 ^ 7) | i16112));
                            int i17110 = (i16112 ^ i16113) + ((i16113 & i16112) << 1);
                            f56514j = i17110 % 128;
                            int i17111 = i17110 % 2;
                            bArr2 = null;
                        } else {
                            bArr2 = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 252497730, -252497710, System.identityHashCode(getbeeponfailure2));
                            int i17112 = f56513i;
                            int i17113 = ((i17112 ^ 81) - (~((i17112 & 81) << 1))) - 1;
                            f56514j = i17113 % 128;
                            int i17114 = i17113 % 2;
                        }
                        if (bArr2 == null) {
                            int i17115 = f56514j;
                            int i17116 = i17115 ^ 65;
                            int i17117 = ((i17115 & 65) | i17116) << 1;
                            int i17118 = -i17116;
                            i13 = (i17117 & i17118) + (i17117 | i17118);
                            f56513i = i13 % 128;
                            if (i13 % 2 != 0) {
                                return Boolean.TRUE;
                            }
                            return bool;
                        }
                        new ik();
                        inVar = (in) ik.setOnFocusChangeListener(new Object[]{iqVar.setOnFocusChangeListener(), dgVar, bArr2, setcontentdescription, Boolean.valueOf(zBooleanValue)}, -1531256370, 1531256371, (int) System.currentTimeMillis());
                        if (inVar == null) {
                            dv dvVar3 = dv.INSTANCE;
                            dv.setOnFocusChangeListener(new Object[]{iqVar.setOnFocusChangeListener(), inVar}, -2054554965, 2054554965, (int) System.currentTimeMillis());
                            int i17119 = f56513i + 1;
                            f56514j = i17119 % 128;
                            int i1818 = i17119 % 2;
                            return Boolean.TRUE;
                        }
                        int i1819 = f56514j;
                        int i18110 = ((i1819 & 98) + (i1819 | 98)) - 1;
                        f56513i = i18110 % 128;
                        int i18111 = i18110 % 2;
                        int i18112 = i1819 & 63;
                        int i18113 = ((i1819 ^ 63) | i18112) << 1;
                        int i18114 = -((i1819 | 63) & (~i18112));
                        int i18115 = (i18113 ^ i18114) + ((i18114 & i18113) << 1);
                        f56513i = i18115 % 128;
                        int i18116 = i18115 % 2;
                        return bool;
                    }
                    if (((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure)))[0] != 0) {
                        i12 = 0;
                        im onFocusChangeListener17 = iqVar.setOnFocusChangeListener();
                        TransactionFailed transactionFailed5 = (TransactionFailed) setAnimation.setY(new Object[i12], -1554496015, 1554496070, (int) System.currentTimeMillis());
                        Object[] objArr6 = new Object[2];
                        objArr6[i12] = onFocusChangeListener17;
                        objArr6[1] = transactionFailed5;
                        getbeeponfailure2 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(objArr6, -1593889019, 1593889062, System.identityHashCode(onFocusChangeListener17));
                        if (getbeeponfailure2 == null) {
                            int i16114 = f56513i;
                            int i16115 = i16114 & 29;
                            int i16116 = (((i16114 ^ 29) | i16115) << 1) - ((~i16115) & (i16114 | 29));
                            f56514j = i16116 % 128;
                            int i16117 = i16116 % 2;
                            int i16118 = i16114 & 7;
                            int i16119 = -(-((i16114 ^ 7) | i16118));
                            int i171110 = (i16118 ^ i16119) + ((i16119 & i16118) << 1);
                            f56514j = i171110 % 128;
                            int i171111 = i171110 % 2;
                            bArr2 = null;
                        } else {
                            bArr2 = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 252497730, -252497710, System.identityHashCode(getbeeponfailure2));
                            int i171112 = f56513i;
                            int i171113 = ((i171112 ^ 81) - (~((i171112 & 81) << 1))) - 1;
                            f56514j = i171113 % 128;
                            int i171114 = i171113 % 2;
                        }
                        if (bArr2 == null) {
                            int i171115 = f56514j;
                            int i171116 = i171115 ^ 65;
                            int i171117 = ((i171115 & 65) | i171116) << 1;
                            int i171118 = -i171116;
                            i13 = (i171117 & i171118) + (i171117 | i171118);
                            f56513i = i13 % 128;
                            if (i13 % 2 != 0) {
                                return Boolean.TRUE;
                            }
                            return bool;
                        }
                        new ik();
                        inVar = (in) ik.setOnFocusChangeListener(new Object[]{iqVar.setOnFocusChangeListener(), dgVar, bArr2, setcontentdescription, Boolean.valueOf(zBooleanValue)}, -1531256370, 1531256371, (int) System.currentTimeMillis());
                        if (inVar == null) {
                            dv dvVar4 = dv.INSTANCE;
                            dv.setOnFocusChangeListener(new Object[]{iqVar.setOnFocusChangeListener(), inVar}, -2054554965, 2054554965, (int) System.currentTimeMillis());
                            int i171119 = f56513i + 1;
                            f56514j = i171119 % 128;
                            int i18117 = i171119 % 2;
                            return Boolean.TRUE;
                        }
                        int i18118 = f56514j;
                        int i18119 = ((i18118 & 98) + (i18118 | 98)) - 1;
                        f56513i = i18119 % 128;
                        int i181110 = i18119 % 2;
                        int i181111 = i18118 & 63;
                        int i181112 = ((i18118 ^ 63) | i181111) << 1;
                        int i181113 = -((i18118 | 63) & (~i181111));
                        int i181114 = (i181112 ^ i181113) + ((i181113 & i181112) << 1);
                        f56513i = i181114 % 128;
                        int i181115 = i181114 % 2;
                        return bool;
                    }
                }
            }
            int i190 = f56513i + 20;
            int i191 = (i190 ^ (-1)) + (i190 << 1);
            f56514j = i191 % 128;
            int i192 = i191 % 2;
            return bool;
        } catch (Exception unused) {
            SouthPacificEndpoint southPacificEndpoint2 = SouthPacificEndpoint.setX;
            SouthPacificEndpoint.setX(new Object[]{"Fail to do offline auth"}, -1166612213, 1166612217, (int) System.currentTimeMillis());
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0458  */
    /* JADX WARN: Code duplicated, block: B:37:0x0467  */
    /* JADX WARN: Code duplicated, block: B:39:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:41:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:43:0x04ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:46:0x0516  */
    /* JADX WARN: Code duplicated, block: B:48:0x0519  */
    /* JADX WARN: Code duplicated, block: B:50:0x051b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0533  */
    /* JADX WARN: Code duplicated, block: B:55:0x0555  */
    /* JADX WARN: Code duplicated, block: B:57:0x055b  */
    /* JADX WARN: Code duplicated, block: B:61:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x05b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:66:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:68:0x05f7  */
    /* JADX WARN: Code duplicated, block: B:70:0x05fa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:73:0x064f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0652  */
    /* JADX WARN: Code duplicated, block: B:77:0x0654  */
    /* JADX WARN: Code duplicated, block: B:79:0x066d  */
    /* JADX WARN: Code duplicated, block: B:81:0x068b  */
    /* JADX WARN: Code duplicated, block: B:83:0x068e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0690  */
    public static /* synthetic */ Boolean e(Object[] objArr) {
        Byte bValueOf;
        dg dgVar;
        im onFocusChangeListener;
        TransactionFailed transactionFailed;
        im onFocusChangeListener2;
        TransactionFailed transactionFailed2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        iq iqVar = (iq) objArr[0];
        cs csVar = (cs) objArr[1];
        int i20 = f56513i;
        int i21 = ((i20 ^ 11) | (i20 & 11)) << 1;
        int i22 = -(((~i20) & 11) | (i20 & (-12)));
        int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
        f56514j = i23 % 128;
        int i24 = i23 % 2;
        setAnimation setanimation = setAnimation.INSTANCE;
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new TransactionFailed[]{(TransactionFailed) setAnimation.setY(new Object[0], 2061768348, -2061768213, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 727546065, -727545958, (int) System.currentTimeMillis()), setAnimation.setAccessibilityTraversalAfter(), (TransactionFailed) setAnimation.setY(new Object[0], 34771733, -34771475, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], -598265962, 598266002, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], -1550249147, 1550249160, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], -1761153819, 1761153841, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 1260159524, -1260159512, (int) System.currentTimeMillis())});
        List listListOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new TransactionFailed[]{(TransactionFailed) setAnimation.setY(new Object[0], 2061768348, -2061768213, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 727546065, -727545958, (int) System.currentTimeMillis()), setAnimation.setAccessibilityTraversalAfter(), (TransactionFailed) setAnimation.setY(new Object[0], 34771733, -34771475, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 1260159524, -1260159512, (int) System.currentTimeMillis())});
        if (((Boolean) setOnFocusChangeListener(new Object[]{csVar}, -27815997, 27815998, (int) System.currentTimeMillis())).booleanValue()) {
            int i25 = f56513i;
            int i26 = i25 & 39;
            int i27 = (i25 ^ 39) | i26;
            int i28 = (i26 & i27) + (i27 | i26);
            f56514j = i28 % 128;
            if (i28 % 2 == 0) {
                im onFocusChangeListener3 = iqVar.setOnFocusChangeListener();
                setRevealOnFocusHint setrevealonfocushint = (setRevealOnFocusHint) im.setY(new Object[]{onFocusChangeListener3}, -967673671, 967673681, System.identityHashCode(onFocusChangeListener3));
                ((Boolean) setRevealOnFocusHint.setY(new Object[]{setrevealonfocushint}, 1247328667, -1247328661, System.identityHashCode(setrevealonfocushint))).booleanValue();
                throw null;
            }
            im onFocusChangeListener4 = iqVar.setOnFocusChangeListener();
            setRevealOnFocusHint setrevealonfocushint2 = (setRevealOnFocusHint) im.setY(new Object[]{onFocusChangeListener4}, -967673671, 967673681, System.identityHashCode(onFocusChangeListener4));
            if (!(!((Boolean) setRevealOnFocusHint.setY(new Object[]{setrevealonfocushint2}, 1247328667, -1247328661, System.identityHashCode(setrevealonfocushint2))).booleanValue())) {
                im onFocusChangeListener5 = iqVar.setOnFocusChangeListener();
                TransactionFailed transactionFailed3 = (TransactionFailed) setAnimation.setY(new Object[0], -1554496015, 1554496070, (int) System.currentTimeMillis());
                if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener5, (String) TransactionFailed.setX(new Object[]{transactionFailed3}, 1914607362, -1914607356, System.identityHashCode(transactionFailed3))}, -203580470, 203580510, System.identityHashCode(onFocusChangeListener5))).booleanValue()) {
                    int i29 = f56513i;
                    int i30 = (i29 ^ 3) + ((i29 & 3) << 1);
                    f56514j = i30 % 128;
                    int i31 = i30 % 2;
                    im onFocusChangeListener6 = iqVar.setOnFocusChangeListener();
                    TransactionFailed transactionFailed4 = (TransactionFailed) setAnimation.setY(new Object[0], -939472057, 939472144, (int) System.currentTimeMillis());
                    if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener6, (String) TransactionFailed.setX(new Object[]{transactionFailed4}, 1914607362, -1914607356, System.identityHashCode(transactionFailed4))}, -203580470, 203580510, System.identityHashCode(onFocusChangeListener6))).booleanValue()) {
                        int i32 = f56513i;
                        int i33 = i32 & 67;
                        int i34 = (i33 - (~(-(-((i32 ^ 67) | i33))))) - 1;
                        f56514j = i34 % 128;
                        int i35 = i34 % 2;
                        im onFocusChangeListener7 = iqVar.setOnFocusChangeListener();
                        TransactionFailed transactionFailed5 = (TransactionFailed) setAnimation.setY(new Object[0], 1272420639, -1272420489, (int) System.currentTimeMillis());
                        if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener7, (String) TransactionFailed.setX(new Object[]{transactionFailed5}, 1914607362, -1914607356, System.identityHashCode(transactionFailed5))}, -203580470, 203580510, System.identityHashCode(onFocusChangeListener7))).booleanValue()) {
                            int i36 = f56514j;
                            int i37 = (i36 & (-8)) | ((~i36) & 7);
                            int i38 = (i36 & 7) << 1;
                            int i39 = (i37 & i38) + (i38 | i37);
                            f56513i = i39 % 128;
                            int i40 = i39 % 2;
                            SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
                            SouthPacificEndpoint.setX(new Object[]{20007, (TransactionFailed) setAnimation.setY(new Object[0], -1554496015, 1554496070, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20007);
                            SouthPacificEndpoint.setX(new Object[]{20007, (TransactionFailed) setAnimation.setY(new Object[0], -939472057, 939472144, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20007);
                            SouthPacificEndpoint.setX(new Object[]{20007, (TransactionFailed) setAnimation.setY(new Object[0], 1272420639, -1272420489, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20007);
                            int i41 = f56513i;
                            int i42 = i41 ^ 113;
                            int i43 = (i41 & 113) << 1;
                            int i44 = ((i42 | i43) << 1) - (i43 ^ i42);
                            f56514j = i44 % 128;
                            int i45 = i44 % 2;
                            return Boolean.FALSE;
                        }
                    }
                }
                im onFocusChangeListener8 = iqVar.setOnFocusChangeListener();
                getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener8, (TransactionFailed) setAnimation.setY(new Object[0], 2061768348, -2061768213, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(onFocusChangeListener8));
                if (getbeeponfailure == null) {
                    int i46 = f56514j;
                    int i47 = i46 & 115;
                    int i48 = (i46 | 115) & (~i47);
                    int i49 = -(-(i47 << 1));
                    int i50 = ((i48 | i49) << 1) - (i48 ^ i49);
                    int i51 = i50 % 128;
                    f56513i = i51;
                    if (i50 % 2 != 0) {
                        throw null;
                    }
                    int i52 = i51 + 65;
                    f56514j = i52 % 128;
                    int i53 = i52 % 2;
                } else {
                    byte[] bArr = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure));
                    if (bArr == null) {
                        int i54 = f56514j;
                        int i55 = i54 & 109;
                        int i56 = i54 | 109;
                        int i57 = ((i55 | i56) << 1) - (i55 ^ i56);
                        f56513i = i57 % 128;
                        if (i57 % 2 != 0) {
                            throw null;
                        }
                        int i58 = i54 & 53;
                        int i59 = i54 | 53;
                        int i60 = (i58 & i59) + (i59 | i58);
                        f56513i = i60 % 128;
                        int i61 = i60 % 2;
                    } else {
                        bValueOf = Byte.valueOf(ArraysKt___ArraysKt.first(bArr));
                        int i62 = f56514j;
                        int i63 = i62 & 119;
                        int i64 = ((i62 | 119) & (~i63)) + (i63 << 1);
                        f56513i = i64 % 128;
                        int i65 = i64 % 2;
                    }
                    im onFocusChangeListener9 = iqVar.setOnFocusChangeListener();
                    im onFocusChangeListener10 = iqVar.setOnFocusChangeListener();
                    setBackgroundTintList setbackgroundtintlist = (setBackgroundTintList) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener10}, -296152793, 296152815, System.identityHashCode(onFocusChangeListener10));
                    byte[] bArr2 = (byte[]) setBackgroundTintList.setX(new Object[]{setbackgroundtintlist}, 1426653476, -1426653475, System.identityHashCode(setbackgroundtintlist));
                    di diVar = iqVar.f56515f;
                    dgVar = (dg) di.setDividerPadding(new Object[]{diVar, onFocusChangeListener9, bArr2, bValueOf}, 1002023655, -1002023654, System.identityHashCode(diVar));
                    onFocusChangeListener = iqVar.setOnFocusChangeListener();
                    transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -1554496015, 1554496070, (int) System.currentTimeMillis());
                    if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, -232375606, 232375652, System.identityHashCode(onFocusChangeListener))).booleanValue()) {
                        i15 = f56514j;
                        int i66 = (i15 & 117) + (i15 | 117);
                        i16 = i66 % 128;
                        f56513i = i16;
                        int i67 = i66 % 2;
                        if (bValueOf == null) {
                            int i68 = i15 & 123;
                            int i69 = -(-((i15 ^ 123) | i68));
                            int i70 = (i68 ^ i69) + ((i68 & i69) << 1);
                            f56513i = i70 % 128;
                            int i71 = i70 % 2;
                            SouthPacificEndpoint southPacificEndpoint2 = SouthPacificEndpoint.setX;
                            SouthPacificEndpoint.setX(new Object[]{20007, (TransactionFailed) setAnimation.setY(new Object[0], 2061768348, -2061768213, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20007);
                            int i72 = f56513i;
                            int i73 = ((i72 ^ 23) | (i72 & 23)) << 1;
                            int i74 = -(((~i72) & 23) | (i72 & (-24)));
                            i19 = (i73 & i74) + (i74 | i73);
                            f56514j = i19 % 128;
                            if (i19 % 2 == 0) {
                                return Boolean.FALSE;
                            }
                            int i75 = 71 / 0;
                            return Boolean.FALSE;
                        }
                        if (dgVar == null) {
                            int i76 = i16 + 63;
                            f56514j = i76 % 128;
                            int i77 = i76 % 2;
                            SouthPacificEndpoint southPacificEndpoint3 = SouthPacificEndpoint.setX;
                            SouthPacificEndpoint.setX(new Object[]{20009, (getDetailsFieldTextSizeSp) setLogo.setY(new Object[]{Byte.valueOf(bValueOf.byteValue())}, -1836464407, 1836464411, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20009);
                            i18 = f56513i + 107;
                            f56514j = i18 % 128;
                            if (i18 % 2 != 0) {
                                return Boolean.FALSE;
                            }
                            throw null;
                        }
                        if (!(!((Boolean) setOnFocusChangeListener(new Object[]{iqVar, listListOf}, 700169587, -700169573, System.identityHashCode(iqVar))).booleanValue())) {
                            int i78 = f56514j;
                            int i79 = (-2) - ((i78 + 44) ^ (-1));
                            f56513i = i79 % 128;
                            int i80 = i79 % 2;
                            i17 = (((i78 & (-84)) | ((~i78) & 83)) - (~(-(-((i78 & 83) << 1))))) - 1;
                            f56513i = i17 % 128;
                            if (i17 % 2 != 0) {
                                return Boolean.FALSE;
                            }
                            int i81 = 9 / 0;
                            return Boolean.FALSE;
                        }
                    }
                    onFocusChangeListener2 = iqVar.setOnFocusChangeListener();
                    transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], -939472057, 939472144, (int) System.currentTimeMillis());
                    if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener2, (String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2))}, -232375606, 232375652, System.identityHashCode(onFocusChangeListener2))).booleanValue()) {
                        i10 = f56514j + 49;
                        i11 = i10 % 128;
                        f56513i = i11;
                        if (i10 % 2 == 0) {
                            throw null;
                        }
                        if (bValueOf == null) {
                            SouthPacificEndpoint southPacificEndpoint4 = SouthPacificEndpoint.setX;
                            SouthPacificEndpoint.setX(new Object[]{20007, (TransactionFailed) setAnimation.setY(new Object[0], 2061768348, -2061768213, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20007);
                            i14 = f56513i + 101;
                            f56514j = i14 % 128;
                            if (i14 % 2 == 0) {
                                return Boolean.FALSE;
                            }
                            int i82 = 74 / 0;
                            return Boolean.FALSE;
                        }
                        if (dgVar == null) {
                            int i83 = i11 + 97;
                            f56514j = i83 % 128;
                            int i84 = i83 % 2;
                            SouthPacificEndpoint southPacificEndpoint5 = SouthPacificEndpoint.setX;
                            SouthPacificEndpoint.setX(new Object[]{20009, (getDetailsFieldTextSizeSp) setLogo.setY(new Object[]{Byte.valueOf(bValueOf.byteValue())}, -1836464407, 1836464411, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20009);
                            int i85 = f56514j;
                            int i86 = (i85 & (-58)) | ((~i85) & 57);
                            int i87 = -(-((i85 & 57) << 1));
                            i13 = (i86 & i87) + (i87 | i86);
                            f56513i = i13 % 128;
                            if (i13 % 2 == 0) {
                                return Boolean.FALSE;
                            }
                            throw null;
                        }
                        if (((Boolean) setOnFocusChangeListener(new Object[]{iqVar, listListOf2}, 700169587, -700169573, System.identityHashCode(iqVar))).booleanValue()) {
                            int i88 = f56513i;
                            int i89 = ((i88 ^ 106) + ((i88 & 106) << 1)) - 1;
                            f56514j = i89 % 128;
                            int i90 = i89 % 2;
                            int i91 = i88 & 39;
                            i12 = (i91 - (~((i88 ^ 39) | i91))) - 1;
                            f56514j = i12 % 128;
                            if (i12 % 2 != 0) {
                                return Boolean.FALSE;
                            }
                            throw null;
                        }
                    }
                }
                bValueOf = null;
                im onFocusChangeListener11 = iqVar.setOnFocusChangeListener();
                im onFocusChangeListener12 = iqVar.setOnFocusChangeListener();
                setBackgroundTintList setbackgroundtintlist2 = (setBackgroundTintList) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener12}, -296152793, 296152815, System.identityHashCode(onFocusChangeListener12));
                byte[] bArr3 = (byte[]) setBackgroundTintList.setX(new Object[]{setbackgroundtintlist2}, 1426653476, -1426653475, System.identityHashCode(setbackgroundtintlist2));
                di diVar2 = iqVar.f56515f;
                dgVar = (dg) di.setDividerPadding(new Object[]{diVar2, onFocusChangeListener11, bArr3, bValueOf}, 1002023655, -1002023654, System.identityHashCode(diVar2));
                onFocusChangeListener = iqVar.setOnFocusChangeListener();
                transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -1554496015, 1554496070, (int) System.currentTimeMillis());
                if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, -232375606, 232375652, System.identityHashCode(onFocusChangeListener))).booleanValue()) {
                    i15 = f56514j;
                    int i610 = (i15 & 117) + (i15 | 117);
                    i16 = i610 % 128;
                    f56513i = i16;
                    int i611 = i610 % 2;
                    if (bValueOf == null) {
                        int i612 = i15 & 123;
                        int i613 = -(-((i15 ^ 123) | i612));
                        int i710 = (i612 ^ i613) + ((i612 & i613) << 1);
                        f56513i = i710 % 128;
                        int i711 = i710 % 2;
                        SouthPacificEndpoint southPacificEndpoint6 = SouthPacificEndpoint.setX;
                        SouthPacificEndpoint.setX(new Object[]{20007, (TransactionFailed) setAnimation.setY(new Object[0], 2061768348, -2061768213, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20007);
                        int i712 = f56513i;
                        int i713 = ((i712 ^ 23) | (i712 & 23)) << 1;
                        int i714 = -(((~i712) & 23) | (i712 & (-24)));
                        i19 = (i713 & i714) + (i714 | i713);
                        f56514j = i19 % 128;
                        if (i19 % 2 == 0) {
                            return Boolean.FALSE;
                        }
                        int i715 = 71 / 0;
                        return Boolean.FALSE;
                    }
                    if (dgVar == null) {
                        int i716 = i16 + 63;
                        f56514j = i716 % 128;
                        int i717 = i716 % 2;
                        SouthPacificEndpoint southPacificEndpoint7 = SouthPacificEndpoint.setX;
                        SouthPacificEndpoint.setX(new Object[]{20009, (getDetailsFieldTextSizeSp) setLogo.setY(new Object[]{Byte.valueOf(bValueOf.byteValue())}, -1836464407, 1836464411, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20009);
                        i18 = f56513i + 107;
                        f56514j = i18 % 128;
                        if (i18 % 2 != 0) {
                            return Boolean.FALSE;
                        }
                        throw null;
                    }
                    if (!(!((Boolean) setOnFocusChangeListener(new Object[]{iqVar, listListOf}, 700169587, -700169573, System.identityHashCode(iqVar))).booleanValue())) {
                        int i718 = f56514j;
                        int i719 = (-2) - ((i718 + 44) ^ (-1));
                        f56513i = i719 % 128;
                        int i810 = i719 % 2;
                        i17 = (((i718 & (-84)) | ((~i718) & 83)) - (~(-(-((i718 & 83) << 1))))) - 1;
                        f56513i = i17 % 128;
                        if (i17 % 2 != 0) {
                            return Boolean.FALSE;
                        }
                        int i811 = 9 / 0;
                        return Boolean.FALSE;
                    }
                }
                onFocusChangeListener2 = iqVar.setOnFocusChangeListener();
                transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], -939472057, 939472144, (int) System.currentTimeMillis());
                if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener2, (String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2))}, -232375606, 232375652, System.identityHashCode(onFocusChangeListener2))).booleanValue()) {
                    i10 = f56514j + 49;
                    i11 = i10 % 128;
                    f56513i = i11;
                    if (i10 % 2 == 0) {
                        throw null;
                    }
                    if (bValueOf == null) {
                        SouthPacificEndpoint southPacificEndpoint8 = SouthPacificEndpoint.setX;
                        SouthPacificEndpoint.setX(new Object[]{20007, (TransactionFailed) setAnimation.setY(new Object[0], 2061768348, -2061768213, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20007);
                        i14 = f56513i + 101;
                        f56514j = i14 % 128;
                        if (i14 % 2 == 0) {
                            return Boolean.FALSE;
                        }
                        int i812 = 74 / 0;
                        return Boolean.FALSE;
                    }
                    if (dgVar == null) {
                        int i813 = i11 + 97;
                        f56514j = i813 % 128;
                        int i814 = i813 % 2;
                        SouthPacificEndpoint southPacificEndpoint9 = SouthPacificEndpoint.setX;
                        SouthPacificEndpoint.setX(new Object[]{20009, (getDetailsFieldTextSizeSp) setLogo.setY(new Object[]{Byte.valueOf(bValueOf.byteValue())}, -1836464407, 1836464411, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20009);
                        int i815 = f56514j;
                        int i816 = (i815 & (-58)) | ((~i815) & 57);
                        int i817 = -(-((i815 & 57) << 1));
                        i13 = (i816 & i817) + (i817 | i816);
                        f56513i = i13 % 128;
                        if (i13 % 2 == 0) {
                            return Boolean.FALSE;
                        }
                        throw null;
                    }
                    if (((Boolean) setOnFocusChangeListener(new Object[]{iqVar, listListOf2}, 700169587, -700169573, System.identityHashCode(iqVar))).booleanValue()) {
                        int i818 = f56513i;
                        int i819 = ((i818 ^ 106) + ((i818 & 106) << 1)) - 1;
                        f56514j = i819 % 128;
                        int i92 = i819 % 2;
                        int i93 = i818 & 39;
                        i12 = (i93 - (~((i818 ^ 39) | i93))) - 1;
                        f56514j = i12 % 128;
                        if (i12 % 2 != 0) {
                            return Boolean.FALSE;
                        }
                        throw null;
                    }
                }
            }
        }
        int i94 = f56514j + 91;
        f56513i = i94 % 128;
        if (i94 % 2 == 0) {
            return Boolean.TRUE;
        }
        int i95 = 41 / 0;
        return Boolean.TRUE;
    }

    public static /* synthetic */ Boolean f(Object[] objArr) {
        cs csVar = (cs) objArr[0];
        int i10 = f56513i;
        int i11 = (i10 & 111) + (i10 | 111);
        f56514j = i11 % 128;
        int i12 = i11 % 2;
        cr crVar = (cr) ((setImageTintList) w.setX(new Object[]{csVar}, 1693919772, -1693919769, System.identityHashCode(csVar)));
        boolean zBooleanValue = ((Boolean) cr.setDividerPadding(new Object[]{crVar}, 352286407, -352286406, System.identityHashCode(crVar))).booleanValue();
        int i13 = f56513i + 85;
        f56514j = i13 % 128;
        if (i13 % 2 != 0) {
            return Boolean.valueOf(zBooleanValue);
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:31:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:34:0x0236  */
    /* JADX WARN: Code duplicated, block: B:37:0x027e  */
    /* JADX WARN: Code duplicated, block: B:40:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:42:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:45:0x030d  */
    /* JADX WARN: Code duplicated, block: B:48:0x034c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0385  */
    /* JADX WARN: Code duplicated, block: B:52:0x0388  */
    /* JADX WARN: Code duplicated, block: B:54:0x038a  */
    public static /* synthetic */ Boolean g(Object[] objArr) {
        int i10;
        im onFocusChangeListener;
        TransactionFailed transactionFailed;
        im onFocusChangeListener2;
        TransactionFailed persistentDrawingCache;
        im onFocusChangeListener3;
        TransactionFailed transactionFailed2;
        im onFocusChangeListener4;
        TransactionFailed transactionFailed3;
        int i11;
        im onFocusChangeListener5;
        TransactionFailed onCapturedPointerListener;
        im onFocusChangeListener6;
        TransactionFailed transactionFailed4;
        int i12;
        iq iqVar = (iq) objArr[0];
        int i13 = f56513i;
        int i14 = (((i13 ^ 69) | (i13 & 69)) << 1) - (((~i13) & 69) | (i13 & (-70)));
        f56514j = i14 % 128;
        int i15 = i14 % 2;
        im onFocusChangeListener7 = iqVar.setOnFocusChangeListener();
        setAnimation setanimation = setAnimation.INSTANCE;
        TransactionFailed transactionFailed5 = (TransactionFailed) setAnimation.setY(new Object[0], -705722506, 705722524, (int) System.currentTimeMillis());
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener7, (String) TransactionFailed.setX(new Object[]{transactionFailed5}, 1914607362, -1914607356, System.identityHashCode(transactionFailed5))}, -1511355589, 1511355624, System.identityHashCode(onFocusChangeListener7));
        String str = "";
        if (getbeeponfailure == null) {
            int i16 = f56513i;
            int i17 = i16 & 23;
            int i18 = (i17 - (~(-(-((i16 ^ 23) | i17))))) - 1;
            int i19 = i18 % 128;
            f56514j = i19;
            int i20 = i18 % 2;
            int i21 = i19 | 39;
            int i22 = (i21 << 1) - ((~(i19 & 39)) & i21);
            f56513i = i22 % 128;
            int i23 = i22 % 2;
        } else {
            byte[] bArr = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure));
            if (bArr == null) {
                int i24 = f56513i;
                int i25 = i24 & 103;
                int i26 = (i25 - (~(-(-((i24 ^ 103) | i25))))) - 1;
                int i27 = i26 % 128;
                f56514j = i27;
                if (i26 % 2 == 0) {
                    throw null;
                }
                i10 = (((i27 | 84) << 1) - (i27 ^ 84)) - 1;
                f56513i = i10 % 128;
            } else {
                String str2 = (String) setInputExtras.setDividerPadding(new Object[]{bArr}, 1609250238, -1609250236, (int) System.currentTimeMillis());
                if (str2 == null) {
                    int i28 = f56513i;
                    int i29 = i28 & 15;
                    int i30 = (i29 - (~(-(-((i28 ^ 15) | i29))))) - 1;
                    f56514j = i30 % 128;
                    if (i30 % 2 == 0) {
                        throw null;
                    }
                    int i31 = i28 & 71;
                    i10 = (i31 - (~((i28 ^ 71) | i31))) - 1;
                    f56514j = i10 % 128;
                } else {
                    int i32 = f56514j;
                    int i33 = ((i32 | 78) << 1) - (i32 ^ 78);
                    int i34 = (i33 ^ (-1)) + (i33 << 1);
                    f56513i = i34 % 128;
                    int i35 = i34 % 2;
                    str = str2;
                }
            }
            int i36 = i10 % 2;
        }
        im onFocusChangeListener8 = iqVar.setOnFocusChangeListener();
        TransactionFailed transactionFailed6 = (TransactionFailed) setAnimation.setY(new Object[0], 2083840602, -2083840519, (int) System.currentTimeMillis());
        if (!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener8, (String) TransactionFailed.setX(new Object[]{transactionFailed6}, 1914607362, -1914607356, System.identityHashCode(transactionFailed6))}, -203580470, 203580510, System.identityHashCode(onFocusChangeListener8))).booleanValue()) {
            int i37 = f56514j + 76;
            int i38 = (i37 ^ (-1)) + (i37 << 1);
            f56513i = i38 % 128;
            if (i38 % 2 != 0) {
                im onFocusChangeListener9 = iqVar.setOnFocusChangeListener();
                TransactionFailed transactionFailed7 = (TransactionFailed) setAnimation.setY(new Object[0], -1343436064, 1343436342, (int) System.currentTimeMillis());
                ((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener9, (String) TransactionFailed.setX(new Object[]{transactionFailed7}, 1914607362, -1914607356, System.identityHashCode(transactionFailed7))}, -203580470, 203580510, System.identityHashCode(onFocusChangeListener9))).booleanValue();
                throw null;
            }
            im onFocusChangeListener10 = iqVar.setOnFocusChangeListener();
            TransactionFailed transactionFailed8 = (TransactionFailed) setAnimation.setY(new Object[0], -1343436064, 1343436342, (int) System.currentTimeMillis());
            if (!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener10, (String) TransactionFailed.setX(new Object[]{transactionFailed8}, 1914607362, -1914607356, System.identityHashCode(transactionFailed8))}, -203580470, 203580510, System.identityHashCode(onFocusChangeListener10))).booleanValue()) {
                onFocusChangeListener = iqVar.setOnFocusChangeListener();
                transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -702011654, 702011654, (int) System.currentTimeMillis());
                if (!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, -203580470, 203580510, System.identityHashCode(onFocusChangeListener))).booleanValue()) {
                    int i39 = f56514j;
                    int i40 = (((i39 | 82) << 1) - (i39 ^ 82)) - 1;
                    f56513i = i40 % 128;
                    int i41 = i40 % 2;
                    onFocusChangeListener2 = iqVar.setOnFocusChangeListener();
                    persistentDrawingCache = setAnimation.setPersistentDrawingCache();
                    if (!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener2, (String) TransactionFailed.setX(new Object[]{persistentDrawingCache}, 1914607362, -1914607356, System.identityHashCode(persistentDrawingCache))}, -203580470, 203580510, System.identityHashCode(onFocusChangeListener2))).booleanValue()) {
                        int i42 = f56514j + 13;
                        f56513i = i42 % 128;
                        int i43 = i42 % 2;
                        onFocusChangeListener3 = iqVar.setOnFocusChangeListener();
                        transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], 249426741, -249426566, (int) System.currentTimeMillis());
                        if (!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener3, (String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2))}, -203580470, 203580510, System.identityHashCode(onFocusChangeListener3))).booleanValue()) {
                            int i44 = f56513i;
                            int i45 = i44 & 11;
                            int i46 = i45 + ((i44 ^ 11) | i45);
                            f56514j = i46 % 128;
                            int i47 = i46 % 2;
                            onFocusChangeListener4 = iqVar.setOnFocusChangeListener();
                            transactionFailed3 = (TransactionFailed) setAnimation.setY(new Object[0], -705722506, 705722524, (int) System.currentTimeMillis());
                            if (!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener4, (String) TransactionFailed.setX(new Object[]{transactionFailed3}, 1914607362, -1914607356, System.identityHashCode(transactionFailed3))}, -203580470, 203580510, System.identityHashCode(onFocusChangeListener4))).booleanValue()) {
                                int i48 = f56514j;
                                int i49 = i48 & 51;
                                i11 = (i49 - (~(-(-((i48 ^ 51) | i49))))) - 1;
                                f56513i = i11 % 128;
                                if (i11 % 2 == 0) {
                                    im onFocusChangeListener11 = iqVar.setOnFocusChangeListener();
                                    TransactionFailed onCapturedPointerListener2 = setAnimation.setOnCapturedPointerListener();
                                    ((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener11, (String) TransactionFailed.setX(new Object[]{onCapturedPointerListener2}, 1914607362, -1914607356, System.identityHashCode(onCapturedPointerListener2))}, -203580470, 203580510, System.identityHashCode(onFocusChangeListener11))).booleanValue();
                                    throw null;
                                }
                                onFocusChangeListener5 = iqVar.setOnFocusChangeListener();
                                onCapturedPointerListener = setAnimation.setOnCapturedPointerListener();
                                if (!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener5, (String) TransactionFailed.setX(new Object[]{onCapturedPointerListener}, 1914607362, -1914607356, System.identityHashCode(onCapturedPointerListener))}, -203580470, 203580510, System.identityHashCode(onFocusChangeListener5))).booleanValue()) {
                                    onFocusChangeListener6 = iqVar.setOnFocusChangeListener();
                                    transactionFailed4 = (TransactionFailed) setAnimation.setY(new Object[0], -249361593, 249361770, (int) System.currentTimeMillis());
                                    if (!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener6, (String) TransactionFailed.setX(new Object[]{transactionFailed4}, 1914607362, -1914607356, System.identityHashCode(transactionFailed4))}, -203580470, 203580510, System.identityHashCode(onFocusChangeListener6))).booleanValue()) {
                                        int i50 = f56514j;
                                        int i51 = ~i50;
                                        int i52 = (i50 & (-16)) | (15 & i51);
                                        int i53 = -(-((i50 & 15) << 1));
                                        int i54 = (i52 & i53) + (i52 | i53);
                                        f56513i = i54 % 128;
                                        int i55 = i54 % 2;
                                        int i56 = ((i50 ^ 111) | (i50 & 111)) << 1;
                                        int i57 = -((i51 & 111) | (i50 & (-112)));
                                        int i58 = (i56 ^ i57) + ((i56 & i57) << 1);
                                        f56513i = i58 % 128;
                                        int i59 = i58 % 2;
                                        i12 = (i50 ^ 59) + ((i50 & 59) << 1);
                                        f56513i = i12 % 128;
                                        if (i12 % 2 == 0) {
                                            return Boolean.TRUE;
                                        }
                                        throw null;
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                md.Companion companion = md.INSTANCE;
                if (!((Boolean) md.Companion.setCompoundDrawableTintBlendMode(new Object[]{str}, -669820145, 669820148, (int) System.currentTimeMillis())).booleanValue()) {
                    onFocusChangeListener = iqVar.setOnFocusChangeListener();
                    transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -702011654, 702011654, (int) System.currentTimeMillis());
                    if (!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, -203580470, 203580510, System.identityHashCode(onFocusChangeListener))).booleanValue()) {
                        int i310 = f56514j;
                        int i410 = (((i310 | 82) << 1) - (i310 ^ 82)) - 1;
                        f56513i = i410 % 128;
                        int i411 = i410 % 2;
                        onFocusChangeListener2 = iqVar.setOnFocusChangeListener();
                        persistentDrawingCache = setAnimation.setPersistentDrawingCache();
                        if (!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener2, (String) TransactionFailed.setX(new Object[]{persistentDrawingCache}, 1914607362, -1914607356, System.identityHashCode(persistentDrawingCache))}, -203580470, 203580510, System.identityHashCode(onFocusChangeListener2))).booleanValue()) {
                            int i412 = f56514j + 13;
                            f56513i = i412 % 128;
                            int i413 = i412 % 2;
                            onFocusChangeListener3 = iqVar.setOnFocusChangeListener();
                            transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], 249426741, -249426566, (int) System.currentTimeMillis());
                            if (!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener3, (String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2))}, -203580470, 203580510, System.identityHashCode(onFocusChangeListener3))).booleanValue()) {
                                int i414 = f56513i;
                                int i415 = i414 & 11;
                                int i416 = i415 + ((i414 ^ 11) | i415);
                                f56514j = i416 % 128;
                                int i417 = i416 % 2;
                                onFocusChangeListener4 = iqVar.setOnFocusChangeListener();
                                transactionFailed3 = (TransactionFailed) setAnimation.setY(new Object[0], -705722506, 705722524, (int) System.currentTimeMillis());
                                if (!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener4, (String) TransactionFailed.setX(new Object[]{transactionFailed3}, 1914607362, -1914607356, System.identityHashCode(transactionFailed3))}, -203580470, 203580510, System.identityHashCode(onFocusChangeListener4))).booleanValue()) {
                                    int i418 = f56514j;
                                    int i419 = i418 & 51;
                                    i11 = (i419 - (~(-(-((i418 ^ 51) | i419))))) - 1;
                                    f56513i = i11 % 128;
                                    if (i11 % 2 == 0) {
                                        im onFocusChangeListener12 = iqVar.setOnFocusChangeListener();
                                        TransactionFailed onCapturedPointerListener3 = setAnimation.setOnCapturedPointerListener();
                                        ((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener12, (String) TransactionFailed.setX(new Object[]{onCapturedPointerListener3}, 1914607362, -1914607356, System.identityHashCode(onCapturedPointerListener3))}, -203580470, 203580510, System.identityHashCode(onFocusChangeListener12))).booleanValue();
                                        throw null;
                                    }
                                    onFocusChangeListener5 = iqVar.setOnFocusChangeListener();
                                    onCapturedPointerListener = setAnimation.setOnCapturedPointerListener();
                                    if (!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener5, (String) TransactionFailed.setX(new Object[]{onCapturedPointerListener}, 1914607362, -1914607356, System.identityHashCode(onCapturedPointerListener))}, -203580470, 203580510, System.identityHashCode(onFocusChangeListener5))).booleanValue()) {
                                        onFocusChangeListener6 = iqVar.setOnFocusChangeListener();
                                        transactionFailed4 = (TransactionFailed) setAnimation.setY(new Object[0], -249361593, 249361770, (int) System.currentTimeMillis());
                                        if (!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener6, (String) TransactionFailed.setX(new Object[]{transactionFailed4}, 1914607362, -1914607356, System.identityHashCode(transactionFailed4))}, -203580470, 203580510, System.identityHashCode(onFocusChangeListener6))).booleanValue()) {
                                            int i510 = f56514j;
                                            int i511 = ~i510;
                                            int i512 = (i510 & (-16)) | (15 & i511);
                                            int i513 = -(-((i510 & 15) << 1));
                                            int i514 = (i512 & i513) + (i512 | i513);
                                            f56513i = i514 % 128;
                                            int i515 = i514 % 2;
                                            int i516 = ((i510 ^ 111) | (i510 & 111)) << 1;
                                            int i517 = -((i511 & 111) | (i510 & (-112)));
                                            int i518 = (i516 ^ i517) + ((i516 & i517) << 1);
                                            f56513i = i518 % 128;
                                            int i519 = i518 % 2;
                                            i12 = (i510 ^ 59) + ((i510 & 59) << 1);
                                            f56513i = i12 % 128;
                                            if (i12 % 2 == 0) {
                                                return Boolean.TRUE;
                                            }
                                            throw null;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        int i60 = f56514j;
        int i61 = ((i60 ^ 113) | (i60 & 113)) << 1;
        int i62 = -((i60 & (-114)) | ((~i60) & 113));
        int i63 = ((i61 | i62) << 1) - (i61 ^ i62);
        f56513i = i63 % 128;
        int i64 = i63 % 2;
        int i65 = i60 | 15;
        int i66 = i65 << 1;
        int i67 = -((~(i60 & 15)) & i65);
        int i68 = (i66 & i67) + (i67 | i66);
        f56513i = i68 % 128;
        if (i68 % 2 == 0) {
            return Boolean.FALSE;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0670  */
    /* JADX WARN: Code duplicated, block: B:102:0x0674  */
    /* JADX WARN: Code duplicated, block: B:104:0x068d  */
    /* JADX WARN: Code duplicated, block: B:107:0x06ab  */
    /* JADX WARN: Code duplicated, block: B:109:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:111:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:112:0x06da  */
    /* JADX WARN: Code duplicated, block: B:115:0x0706  */
    /* JADX WARN: Code duplicated, block: B:117:0x071c  */
    /* JADX WARN: Code duplicated, block: B:119:0x0720  */
    /* JADX WARN: Code duplicated, block: B:121:0x0731  */
    /* JADX WARN: Code duplicated, block: B:124:0x0766  */
    /* JADX WARN: Code duplicated, block: B:126:0x0799  */
    /* JADX WARN: Code duplicated, block: B:128:0x079b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:129:0x079d  */
    /* JADX WARN: Code duplicated, block: B:131:0x07b0  */
    /* JADX WARN: Code duplicated, block: B:133:0x07ce  */
    /* JADX WARN: Code duplicated, block: B:135:0x07eb  */
    /* JADX WARN: Code duplicated, block: B:137:0x07f1  */
    /* JADX WARN: Code duplicated, block: B:140:0x0825  */
    /* JADX WARN: Code duplicated, block: B:142:0x082c  */
    /* JADX WARN: Code duplicated, block: B:146:0x0872  */
    /* JADX WARN: Code duplicated, block: B:148:0x0882  */
    /* JADX WARN: Code duplicated, block: B:150:0x08b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:151:0x08b8  */
    /* JADX WARN: Code duplicated, block: B:153:0x08c6  */
    /* JADX WARN: Code duplicated, block: B:155:0x08e4  */
    /* JADX WARN: Code duplicated, block: B:157:0x0902  */
    /* JADX WARN: Code duplicated, block: B:159:0x0908  */
    /* JADX WARN: Code duplicated, block: B:161:0x0916  */
    /* JADX WARN: Code duplicated, block: B:164:0x0944  */
    /* JADX WARN: Code duplicated, block: B:166:0x096e  */
    /* JADX WARN: Code duplicated, block: B:168:0x0974  */
    /* JADX WARN: Code duplicated, block: B:170:0x0988  */
    /* JADX WARN: Code duplicated, block: B:173:0x09b9  */
    /* JADX WARN: Code duplicated, block: B:175:0x09e8  */
    /* JADX WARN: Code duplicated, block: B:177:0x0a22  */
    /* JADX WARN: Code duplicated, block: B:180:0x0a4f  */
    /* JADX WARN: Code duplicated, block: B:183:0x0a87  */
    /* JADX WARN: Code duplicated, block: B:187:0x0ad6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:188:0x0ad7  */
    /* JADX WARN: Code duplicated, block: B:192:0x0b13  */
    /* JADX WARN: Code duplicated, block: B:195:0x0b3f  */
    /* JADX WARN: Code duplicated, block: B:201:0x05da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x057c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x05a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x05a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x05a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:27:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:29:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:30:0x0203  */
    /* JADX WARN: Code duplicated, block: B:31:0x0220  */
    /* JADX WARN: Code duplicated, block: B:48:0x033f  */
    /* JADX WARN: Code duplicated, block: B:50:0x034a  */
    /* JADX WARN: Code duplicated, block: B:53:0x037a  */
    /* JADX WARN: Code duplicated, block: B:55:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:57:0x03c6 A[PHI: r3
      0x03c6: PHI (r3v154 com.mypinpad.tsdk.i.getBeepOnFailure) = (r3v139 com.mypinpad.tsdk.i.getBeepOnFailure), (r3v177 com.mypinpad.tsdk.i.getBeepOnFailure) binds: [B:54:0x03a5, B:51:0x0377] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:60:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:63:0x0446  */
    /* JADX WARN: Code duplicated, block: B:65:0x045a  */
    /* JADX WARN: Code duplicated, block: B:67:0x0479  */
    /* JADX WARN: Code duplicated, block: B:69:0x0488  */
    /* JADX WARN: Code duplicated, block: B:71:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:74:0x04d0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:75:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:78:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:82:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:84:0x054a  */
    /* JADX WARN: Code duplicated, block: B:86:0x056a  */
    /* JADX WARN: Code duplicated, block: B:93:0x0631  */
    /* JADX WARN: Code duplicated, block: B:95:0x063c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0641  */
    /* JADX WARN: Code duplicated, block: B:99:0x0654  */
    /* JADX WARN: Code duplicated, block: B:9:0x007e  */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x086a, code lost:
    
        if ((!((java.lang.Boolean) com.mypinpad.tsdk.isolation.ao.setY(new java.lang.Object[]{r10}, 743383994, -743383988, java.lang.System.identityHashCode(r10))).booleanValue()) != true) goto L144;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ com.mypinpad.tsdk.isolation.fk h(java.lang.Object[] r20) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 2932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.iq.h(java.lang.Object[]):com.mypinpad.tsdk.i.fk");
    }

    /* JADX WARN: Code duplicated, block: B:105:0x08d1  */
    /* JADX WARN: Code duplicated, block: B:29:0x0288 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x028b  */
    /* JADX WARN: Code duplicated, block: B:33:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:43:0x032f  */
    /* JADX WARN: Code duplicated, block: B:45:0x034f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0368  */
    /* JADX WARN: Code duplicated, block: B:49:0x0390  */
    /* JADX WARN: Code duplicated, block: B:51:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:54:0x051f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0577  */
    /* JADX WARN: Code duplicated, block: B:58:0x058d  */
    /* JADX WARN: Code duplicated, block: B:59:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:60:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:62:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:65:0x0646  */
    /* JADX WARN: Code duplicated, block: B:67:0x068a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:68:0x068b  */
    /* JADX WARN: Code duplicated, block: B:71:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:89:0x07d5 A[PHI: r7
      0x07d5: PHI (r7v65 com.mypinpad.tsdk.i.setFitsSystemWindows) = (r7v64 com.mypinpad.tsdk.i.setFitsSystemWindows), (r7v74 com.mypinpad.tsdk.i.setFitsSystemWindows) binds: [B:88:0x07d3, B:85:0x07ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x07f6 A[PHI: r7
      0x07f6: PHI (r7v73 com.mypinpad.tsdk.i.setFitsSystemWindows) = (r7v64 com.mypinpad.tsdk.i.setFitsSystemWindows), (r7v74 com.mypinpad.tsdk.i.setFitsSystemWindows) binds: [B:88:0x07d3, B:85:0x07ca] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ fk i(Object[] objArr) throws Exception {
        setFitsSystemWindows[] setfitssystemwindowsArrValues;
        int length;
        int i10;
        int i11;
        setFitsSystemWindows setfitssystemwindows;
        boolean z10;
        bf bfVar;
        cr crVar;
        fk fkVar;
        int i12;
        int i13;
        int i14;
        int i15;
        cr crVar2;
        int i16;
        cr crVar3;
        fk fkVar2;
        iq iqVar = (iq) objArr[0];
        int i17 = f56513i;
        int i18 = i17 | 97;
        int i19 = (i18 << 1) - ((~(i17 & 97)) & i18);
        f56514j = i19 % 128;
        if (i19 % 2 == 0) {
            im onFocusChangeListener = iqVar.setOnFocusChangeListener();
            setSupportBackgroundTintMode setsupportbackgroundtintmode = setSupportBackgroundTintMode.setCompoundDrawableTintBlendMode;
            throw null;
        }
        im onFocusChangeListener2 = iqVar.setOnFocusChangeListener();
        if (((setSupportBackgroundTintMode) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener2}, 568936545, -568936540, System.identityHashCode(onFocusChangeListener2))) == setSupportBackgroundTintMode.setCompoundDrawableTintBlendMode) {
            fk fkVar3 = fk.setOnDragListener;
            int i20 = f56513i + 97;
            f56514j = i20 % 128;
            int i21 = i20 % 2;
            return fkVar3;
        }
        im onFocusChangeListener3 = iqVar.setOnFocusChangeListener();
        if (!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener3}, 910478205, -910478157, System.identityHashCode(onFocusChangeListener3))).booleanValue()) {
            int i22 = f56514j;
            int i23 = i22 & 115;
            int i24 = (((i22 | 115) & (~i23)) - (~(i23 << 1))) - 1;
            f56513i = i24 % 128;
            if (i24 % 2 == 0) {
                return (fk) setOnFocusChangeListener(new Object[]{iqVar}, 1131055990, -1131055985, System.identityHashCode(iqVar));
            }
            throw null;
        }
        cs csVar = new cs(iqVar.setOnFocusChangeListener());
        if (((Boolean) setOnFocusChangeListener(new Object[]{iqVar, csVar}, -1611034509, 1611034511, System.identityHashCode(iqVar))).booleanValue()) {
            int i25 = f56514j;
            int i26 = ((i25 & 80) + (i25 | 80)) - 1;
            f56513i = i26 % 128;
            int i27 = i26 % 2;
            if (((Boolean) setOnFocusChangeListener(new Object[]{iqVar}, 1969422347, -1969422336, System.identityHashCode(iqVar))).booleanValue()) {
                boolean zBooleanValue = ((Boolean) setOnFocusChangeListener(new Object[]{csVar}, -27815997, 27815998, (int) System.currentTimeMillis())).booleanValue();
                im onFocusChangeListener4 = iqVar.setOnFocusChangeListener();
                setAnimation setanimation = setAnimation.INSTANCE;
                getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener4, (TransactionFailed) setAnimation.setY(new Object[0], 1440069230, -1440069166, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(onFocusChangeListener4));
                if (getbeeponfailure == null) {
                    int i28 = f56514j;
                    int i29 = i28 & 125;
                    int i30 = ((i28 ^ 125) | i29) << 1;
                    int i31 = -((i28 | 125) & (~i29));
                    int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
                    f56513i = i32 % 128;
                    int i33 = i32 % 2;
                    getbeeponfailure = (getBeepOnFailure) setOnFocusChangeListener(new Object[]{iqVar.setOnFocusChangeListener()}, 1862496766, -1862496758, (int) System.currentTimeMillis());
                    int i34 = f56513i + 85;
                    f56514j = i34 % 128;
                    int i35 = i34 % 2;
                } else {
                    int i36 = f56514j + 125;
                    f56513i = i36 % 128;
                    int i37 = i36 % 2;
                }
                byte bByteValue = ((Byte) setLogo.setY(new Object[]{Byte.valueOf(ArraysKt___ArraysKt.first((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure)))), 6}, 1382640069, -1382640067, 6)).byteValue();
                bd bdVar = new bd(iqVar.setOnFocusChangeListener());
                bb bbVar = (bb) ((setImageTintList) w.setX(new Object[]{bdVar}, 1693919772, -1693919769, System.identityHashCode(bdVar)));
                setFitsSystemWindows setfitssystemwindows2 = (setFitsSystemWindows) bb.setOnFocusChangeListener(new Object[]{bbVar}, -1171807076, 1171807076, System.identityHashCode(bbVar));
                de deVar = new de(iqVar.setOnFocusChangeListener());
                dd ddVar = (dd) ((setImageTintList) w.setX(new Object[]{deVar}, 1693919772, -1693919769, System.identityHashCode(deVar)));
                setOnFocusChangeListener(new Object[]{iqVar, csVar, (md) dd.setDividerPadding(new Object[]{ddVar}, -2041109093, 2041109093, System.identityHashCode(ddVar)), Byte.valueOf(bByteValue)}, -1584835551, 1584835551, System.identityHashCode(iqVar));
                im onFocusChangeListener5 = iqVar.setOnFocusChangeListener();
                if (!((Boolean) im.setY(new Object[]{onFocusChangeListener5}, 61227936, -61227928, System.identityHashCode(onFocusChangeListener5))).booleanValue()) {
                    int i38 = f56513i;
                    int i39 = i38 ^ 105;
                    int i40 = -(-((i38 & 105) << 1));
                    int i41 = ((i39 | i40) << 1) - (i39 ^ i40);
                    f56514j = i41 % 128;
                    int i42 = i41 % 2;
                    im onFocusChangeListener6 = iqVar.setOnFocusChangeListener();
                    if (!((Boolean) im.setY(new Object[]{onFocusChangeListener6}, 413373164, -413373162, System.identityHashCode(onFocusChangeListener6))).booleanValue()) {
                        fkVar2 = (fk) setOnFocusChangeListener(new Object[]{iqVar, setfitssystemwindows2, Boolean.valueOf(zBooleanValue)}, 347813074, -347813068, System.identityHashCode(iqVar));
                        if (fkVar2 != fk.setX) {
                            int i43 = f56513i;
                            int i44 = i43 & 99;
                            int i45 = (~i44) & (i43 | 99);
                            int i46 = -(-(i44 << 1));
                            int i47 = ((i45 | i46) << 1) - (i46 ^ i45);
                            f56514j = i47 % 128;
                            int i48 = i47 % 2;
                            int i49 = ((i43 & (-52)) | ((~i43) & 51)) + ((i43 & 51) << 1);
                            f56514j = i49 % 128;
                            int i50 = i49 % 2;
                            return fkVar2;
                        }
                    } else if (zBooleanValue) {
                        fkVar2 = (fk) setOnFocusChangeListener(new Object[]{iqVar, setfitssystemwindows2, Boolean.valueOf(zBooleanValue)}, 347813074, -347813068, System.identityHashCode(iqVar));
                        if (fkVar2 != fk.setX) {
                            int i410 = f56513i;
                            int i411 = i410 & 99;
                            int i412 = (~i411) & (i410 | 99);
                            int i413 = -(-(i411 << 1));
                            int i414 = ((i412 | i413) << 1) - (i413 ^ i412);
                            f56514j = i414 % 128;
                            int i415 = i414 % 2;
                            int i416 = ((i410 & (-52)) | ((~i410) & 51)) + ((i410 & 51) << 1);
                            f56514j = i416 % 128;
                            int i51 = i416 % 2;
                            return fkVar2;
                        }
                    }
                } else if (zBooleanValue) {
                    fkVar2 = (fk) setOnFocusChangeListener(new Object[]{iqVar, setfitssystemwindows2, Boolean.valueOf(zBooleanValue)}, 347813074, -347813068, System.identityHashCode(iqVar));
                    if (fkVar2 != fk.setX) {
                        int i417 = f56513i;
                        int i418 = i417 & 99;
                        int i419 = (~i418) & (i417 | 99);
                        int i4110 = -(-(i418 << 1));
                        int i4111 = ((i419 | i4110) << 1) - (i4110 ^ i419);
                        f56514j = i4111 % 128;
                        int i4112 = i4111 % 2;
                        int i4113 = ((i417 & (-52)) | ((~i417) & 51)) + ((i417 & 51) << 1);
                        f56514j = i4113 % 128;
                        int i52 = i4113 % 2;
                        return fkVar2;
                    }
                }
                im onFocusChangeListener7 = iqVar.setOnFocusChangeListener();
                if (!((Boolean) im.setY(new Object[]{onFocusChangeListener7}, 61227936, -61227928, System.identityHashCode(onFocusChangeListener7))).booleanValue()) {
                    int i53 = f56514j;
                    int i54 = ((i53 & (-92)) | ((~i53) & 91)) + ((i53 & 91) << 1);
                    f56513i = i54 % 128;
                    int i55 = i54 % 2;
                    im onFocusChangeListener8 = iqVar.setOnFocusChangeListener();
                    if (((Boolean) im.setY(new Object[]{onFocusChangeListener8}, 413373164, -413373162, System.identityHashCode(onFocusChangeListener8))).booleanValue()) {
                        int i56 = f56514j;
                        int i57 = ((i56 & 85) - (~(i56 | 85))) - 1;
                        f56513i = i57 % 128;
                        int i58 = i57 % 2;
                        if (zBooleanValue) {
                            System.identityHashCode(iqVar);
                            System.identityHashCode(iqVar);
                            if (setfitssystemwindows2 == setFitsSystemWindows.setX) {
                                if (!((Boolean) setOnFocusChangeListener(new Object[]{iqVar, Boolean.valueOf(zBooleanValue)}, -1544858550, 1544858566, System.identityHashCode(iqVar))).booleanValue()) {
                                    int i59 = f56514j;
                                    int i60 = (i59 & (-40)) | ((~i59) & 39);
                                    int i61 = -(-((i59 & 39) << 1));
                                    int i62 = (i60 ^ i61) + ((i61 & i60) << 1);
                                    f56513i = i62 % 128;
                                    int i63 = i62 % 2;
                                    if (zBooleanValue) {
                                        cp cpVar = new cp(iqVar.setOnFocusChangeListener());
                                        int i64 = f56513i;
                                        int i65 = i64 & 49;
                                        int i66 = ((i64 ^ 49) | i65) << 1;
                                        int i67 = -((i64 | 49) & (~i65));
                                        int i68 = (i66 ^ i67) + ((i67 & i66) << 1);
                                        f56514j = i68 % 128;
                                        int i69 = i68 % 2;
                                    } else {
                                        bfVar = new bf(iqVar.setOnFocusChangeListener());
                                        if (((be) ((setImageTintList) w.setX(new Object[]{bfVar}, 1693919772, -1693919769, System.identityHashCode(bfVar)))).getNavBarTitleString()) {
                                            int iIdentityHashCode = System.identityHashCode(iqVar);
                                            int i70 = ~iIdentityHashCode;
                                            int i71 = (1180460142 & (~i70)) | (i70 & (-1180460143)) | (1180460142 & i70);
                                            int i72 = ~((i71 & (-27568849)) | (i71 & 27568848) | ((-27568849) & (~i71)));
                                            int i73 = ((-270401) & i70) | (iIdentityHashCode & 270400);
                                            int i74 = (-270401) & iIdentityHashCode;
                                            int i75 = (i73 ^ i74) | (i73 & i74);
                                            int i76 = ~i75;
                                            int i77 = i76 & (i75 | i76);
                                            int i78 = (((i77 & i72) | (i72 ^ i77)) * (-302)) - 1488848804;
                                            int i79 = (i70 & (-27298449)) | (27298448 & iIdentityHashCode);
                                            int i80 = (-27298449) & iIdentityHashCode;
                                            int i81 = (i79 & i80) | (i79 ^ i80);
                                            int i82 = ~i81;
                                            int i83 = -(-(((i81 | i82) & i82) * (-604)));
                                            int i84 = i78 & i83;
                                            int i85 = (i84 - (~(-(-((i78 ^ i83) | i84))))) - 1;
                                            int i86 = ((-27568849) ^ iIdentityHashCode) | ((-27568849) & iIdentityHashCode);
                                            int i87 = ~i86;
                                            int i88 = (i86 | i87) & i87;
                                            int i89 = ((~i88) & 1180189742) | ((-1180189743) & i88);
                                            int i90 = i88 & 1180189742;
                                            int i91 = -(-(((i90 & i89) | (i89 ^ i90)) * 302));
                                            int i92 = i85 & i91;
                                            int i93 = (i91 | i85) & (~i92);
                                            int i94 = -(-(i92 << 1));
                                            i13 = ((i93 | i94) << 1) - (i93 ^ i94);
                                            int iIdentityHashCode2 = System.identityHashCode(iqVar);
                                            int i95 = ~iIdentityHashCode2;
                                            int i96 = iIdentityHashCode2 & 515679304;
                                            int i97 = ((-515679305) & i95) | i96;
                                            int i98 = (-515679305) & iIdentityHashCode2;
                                            int i99 = ~((i97 ^ i98) | (i97 & i98));
                                            int i100 = 67665928 & i99;
                                            int i101 = (~i100) & (67665928 | i99);
                                            int i102 = -(-(((i101 & i100) | (i101 ^ i100)) * (-814)));
                                            int i103 = ((~i102) & 240334909) | (i102 & (-240334910));
                                            int i104 = (i102 & 240334909) << 1;
                                            int i105 = (i103 & i104) + (i104 | i103);
                                            int i106 = ((~i95) & 469053120) | (i95 & (-469053121));
                                            int i107 = i95 & 469053120;
                                            int i108 = ~((i106 & i107) | (i106 ^ i107));
                                            int i109 = (i108 & 21039744) | (i108 ^ 21039744);
                                            int i110 = ((-515679305) | iIdentityHashCode2) & (~i98);
                                            int i111 = (i98 & i110) | (i110 ^ i98);
                                            int i112 = ~i111;
                                            int i113 = (i111 | i112) & i112;
                                            int i114 = i109 & i113;
                                            int i115 = (i109 | i113) & (~i114);
                                            int i116 = ((i115 & i114) | (i115 ^ i114)) * 407;
                                            int i117 = i105 & i116;
                                            int i118 = ((i116 | i105) & (~i117)) + (i117 << 1);
                                            int i119 = ~((515679304 ^ iIdentityHashCode2) | i96);
                                            int i120 = (21039744 & i119) | (21039744 ^ i119);
                                            int i121 = (-469053121) & iIdentityHashCode2;
                                            int i122 = ((-469053121) | iIdentityHashCode2) & (~i121);
                                            int i123 = ~((i122 & i121) | (i122 ^ i121));
                                            int i124 = ((~i123) & i120) | ((~i120) & i123);
                                            int i125 = i123 & i120;
                                            int i126 = ((i125 & i124) | (i124 ^ i125)) * 407;
                                            int i127 = i118 & i126;
                                            i14 = (i126 | i118) & (~i127);
                                            i15 = -(-(i127 << 1));
                                            if (i13 > (i14 & i15) + (i14 | i15)) {
                                                im onFocusChangeListener9 = iqVar.setOnFocusChangeListener();
                                                setFontFeatureSettings setfontfeaturesettings = (setFontFeatureSettings) im.setY(new Object[]{onFocusChangeListener9}, -408299353, 408299353, System.identityHashCode(onFocusChangeListener9));
                                                cs csVar2 = (cs) setFontFeatureSettings.setCompoundDrawableTintBlendMode(new Object[]{setfontfeaturesettings}, -1608275827, 1608275837, System.identityHashCode(setfontfeaturesettings));
                                                Intrinsics.checkNotNull(csVar2);
                                                crVar3 = (cr) ((setImageTintList) w.setX(new Object[]{csVar2}, 1693919772, -1693919769, System.identityHashCode(csVar2)));
                                                int i128 = 41 / 0;
                                                if (((Boolean) cr.setDividerPadding(new Object[]{crVar3}, -590986648, 590986653, System.identityHashCode(crVar3))).booleanValue()) {
                                                    if (((be) ((setImageTintList) w.setX(new Object[]{bfVar}, 1693919772, -1693919769, System.identityHashCode(bfVar)))).UiMessageCallbackKtWhenMappings()) {
                                                        int i129 = f56514j;
                                                        int i130 = i129 & 95;
                                                        int i131 = i130 + ((i129 ^ 95) | i130);
                                                        f56513i = i131 % 128;
                                                        int i132 = i131 % 2;
                                                        im onFocusChangeListener10 = iqVar.setOnFocusChangeListener();
                                                        setFontFeatureSettings setfontfeaturesettings2 = (setFontFeatureSettings) im.setY(new Object[]{onFocusChangeListener10}, -408299353, 408299353, System.identityHashCode(onFocusChangeListener10));
                                                        cs csVar3 = (cs) setFontFeatureSettings.setCompoundDrawableTintBlendMode(new Object[]{setfontfeaturesettings2}, -1608275827, 1608275837, System.identityHashCode(setfontfeaturesettings2));
                                                        Intrinsics.checkNotNull(csVar3);
                                                        crVar = (cr) ((setImageTintList) w.setX(new Object[]{csVar3}, 1693919772, -1693919769, System.identityHashCode(csVar3)));
                                                        if (!(!((Boolean) cr.setDividerPadding(new Object[]{crVar}, 1286694359, -1286694351, System.identityHashCode(crVar))).booleanValue())) {
                                                            int i133 = f56513i;
                                                            int i134 = ((((i133 ^ 21) | (i133 & 21)) << 1) - (~(-(((~i133) & 21) | (i133 & (-22)))))) - 1;
                                                            f56514j = i134 % 128;
                                                            int i135 = i134 % 2;
                                                            fkVar = (fk) setOnFocusChangeListener(new Object[]{iqVar}, -777122735, 777122748, System.identityHashCode(iqVar));
                                                            int i136 = f56514j;
                                                            int i137 = i136 & 57;
                                                            int i138 = -(-((i136 ^ 57) | i137));
                                                            i12 = ((i137 | i138) << 1) - (i138 ^ i137);
                                                            f56513i = i12 % 128;
                                                            if (i12 % 2 == 0) {
                                                                return fkVar;
                                                            }
                                                            throw null;
                                                        }
                                                    }
                                                    im onFocusChangeListener11 = iqVar.setOnFocusChangeListener();
                                                    im.setY(new Object[]{onFocusChangeListener11, Boolean.TRUE}, 36630807, -36630802, System.identityHashCode(onFocusChangeListener11));
                                                    int i139 = f56514j;
                                                    int i140 = (i139 & (-42)) | ((~i139) & 41);
                                                    int i141 = (i139 & 41) << 1;
                                                    int i142 = ((i140 | i141) << 1) - (i141 ^ i140);
                                                    f56513i = i142 % 128;
                                                    int i143 = i142 % 2;
                                                } else {
                                                    int i144 = f56514j;
                                                    int i145 = i144 & 83;
                                                    i16 = i145 + ((i144 ^ 83) | i145);
                                                    f56513i = i16 % 128;
                                                    if (i16 % 2 != 0) {
                                                        im onFocusChangeListener12 = iqVar.setOnFocusChangeListener();
                                                        im.setY(new Object[]{onFocusChangeListener12, Boolean.TRUE}, -818388399, 818388408, System.identityHashCode(onFocusChangeListener12));
                                                    } else {
                                                        im onFocusChangeListener13 = iqVar.setOnFocusChangeListener();
                                                        im.setY(new Object[]{onFocusChangeListener13, Boolean.TRUE}, -818388399, 818388408, System.identityHashCode(onFocusChangeListener13));
                                                    }
                                                }
                                            } else {
                                                im onFocusChangeListener14 = iqVar.setOnFocusChangeListener();
                                                setFontFeatureSettings setfontfeaturesettings3 = (setFontFeatureSettings) im.setY(new Object[]{onFocusChangeListener14}, -408299353, 408299353, System.identityHashCode(onFocusChangeListener14));
                                                cs csVar4 = (cs) setFontFeatureSettings.setCompoundDrawableTintBlendMode(new Object[]{setfontfeaturesettings3}, -1608275827, 1608275837, System.identityHashCode(setfontfeaturesettings3));
                                                Intrinsics.checkNotNull(csVar4);
                                                crVar2 = (cr) ((setImageTintList) w.setX(new Object[]{csVar4}, 1693919772, -1693919769, System.identityHashCode(csVar4)));
                                                if (((Boolean) cr.setDividerPadding(new Object[]{crVar2}, -590986648, 590986653, System.identityHashCode(crVar2))).booleanValue()) {
                                                    if (((be) ((setImageTintList) w.setX(new Object[]{bfVar}, 1693919772, -1693919769, System.identityHashCode(bfVar)))).UiMessageCallbackKtWhenMappings()) {
                                                        int i1210 = f56514j;
                                                        int i1310 = i1210 & 95;
                                                        int i1311 = i1310 + ((i1210 ^ 95) | i1310);
                                                        f56513i = i1311 % 128;
                                                        int i1312 = i1311 % 2;
                                                        im onFocusChangeListener15 = iqVar.setOnFocusChangeListener();
                                                        setFontFeatureSettings setfontfeaturesettings4 = (setFontFeatureSettings) im.setY(new Object[]{onFocusChangeListener15}, -408299353, 408299353, System.identityHashCode(onFocusChangeListener15));
                                                        cs csVar5 = (cs) setFontFeatureSettings.setCompoundDrawableTintBlendMode(new Object[]{setfontfeaturesettings4}, -1608275827, 1608275837, System.identityHashCode(setfontfeaturesettings4));
                                                        Intrinsics.checkNotNull(csVar5);
                                                        crVar = (cr) ((setImageTintList) w.setX(new Object[]{csVar5}, 1693919772, -1693919769, System.identityHashCode(csVar5)));
                                                        if (!(!((Boolean) cr.setDividerPadding(new Object[]{crVar}, 1286694359, -1286694351, System.identityHashCode(crVar))).booleanValue())) {
                                                            int i1313 = f56513i;
                                                            int i1314 = ((((i1313 ^ 21) | (i1313 & 21)) << 1) - (~(-(((~i1313) & 21) | (i1313 & (-22)))))) - 1;
                                                            f56514j = i1314 % 128;
                                                            int i1315 = i1314 % 2;
                                                            fkVar = (fk) setOnFocusChangeListener(new Object[]{iqVar}, -777122735, 777122748, System.identityHashCode(iqVar));
                                                            int i1316 = f56514j;
                                                            int i1317 = i1316 & 57;
                                                            int i1318 = -(-((i1316 ^ 57) | i1317));
                                                            i12 = ((i1317 | i1318) << 1) - (i1318 ^ i1317);
                                                            f56513i = i12 % 128;
                                                            if (i12 % 2 == 0) {
                                                                return fkVar;
                                                            }
                                                            throw null;
                                                        }
                                                    }
                                                    im onFocusChangeListener16 = iqVar.setOnFocusChangeListener();
                                                    im.setY(new Object[]{onFocusChangeListener16, Boolean.TRUE}, 36630807, -36630802, System.identityHashCode(onFocusChangeListener16));
                                                    int i1319 = f56514j;
                                                    int i146 = (i1319 & (-42)) | ((~i1319) & 41);
                                                    int i147 = (i1319 & 41) << 1;
                                                    int i148 = ((i146 | i147) << 1) - (i147 ^ i146);
                                                    f56513i = i148 % 128;
                                                    int i149 = i148 % 2;
                                                } else {
                                                    int i1410 = f56514j;
                                                    int i1411 = i1410 & 83;
                                                    i16 = i1411 + ((i1410 ^ 83) | i1411);
                                                    f56513i = i16 % 128;
                                                    if (i16 % 2 != 0) {
                                                        im onFocusChangeListener17 = iqVar.setOnFocusChangeListener();
                                                        im.setY(new Object[]{onFocusChangeListener17, Boolean.TRUE}, -818388399, 818388408, System.identityHashCode(onFocusChangeListener17));
                                                    } else {
                                                        im onFocusChangeListener18 = iqVar.setOnFocusChangeListener();
                                                        im.setY(new Object[]{onFocusChangeListener18, Boolean.TRUE}, -818388399, 818388408, System.identityHashCode(onFocusChangeListener18));
                                                    }
                                                }
                                            }
                                        } else {
                                            if (((be) ((setImageTintList) w.setX(new Object[]{bfVar}, 1693919772, -1693919769, System.identityHashCode(bfVar)))).UiMessageCallbackKtWhenMappings()) {
                                                int i1211 = f56514j;
                                                int i13110 = i1211 & 95;
                                                int i13111 = i13110 + ((i1211 ^ 95) | i13110);
                                                f56513i = i13111 % 128;
                                                int i13112 = i13111 % 2;
                                                im onFocusChangeListener19 = iqVar.setOnFocusChangeListener();
                                                setFontFeatureSettings setfontfeaturesettings5 = (setFontFeatureSettings) im.setY(new Object[]{onFocusChangeListener19}, -408299353, 408299353, System.identityHashCode(onFocusChangeListener19));
                                                cs csVar6 = (cs) setFontFeatureSettings.setCompoundDrawableTintBlendMode(new Object[]{setfontfeaturesettings5}, -1608275827, 1608275837, System.identityHashCode(setfontfeaturesettings5));
                                                Intrinsics.checkNotNull(csVar6);
                                                crVar = (cr) ((setImageTintList) w.setX(new Object[]{csVar6}, 1693919772, -1693919769, System.identityHashCode(csVar6)));
                                                if (!(!((Boolean) cr.setDividerPadding(new Object[]{crVar}, 1286694359, -1286694351, System.identityHashCode(crVar))).booleanValue())) {
                                                    int i13113 = f56513i;
                                                    int i13114 = ((((i13113 ^ 21) | (i13113 & 21)) << 1) - (~(-(((~i13113) & 21) | (i13113 & (-22)))))) - 1;
                                                    f56514j = i13114 % 128;
                                                    int i13115 = i13114 % 2;
                                                    fkVar = (fk) setOnFocusChangeListener(new Object[]{iqVar}, -777122735, 777122748, System.identityHashCode(iqVar));
                                                    int i13116 = f56514j;
                                                    int i13117 = i13116 & 57;
                                                    int i13118 = -(-((i13116 ^ 57) | i13117));
                                                    i12 = ((i13117 | i13118) << 1) - (i13118 ^ i13117);
                                                    f56513i = i12 % 128;
                                                    if (i12 % 2 == 0) {
                                                        return fkVar;
                                                    }
                                                    throw null;
                                                }
                                            }
                                            im onFocusChangeListener110 = iqVar.setOnFocusChangeListener();
                                            im.setY(new Object[]{onFocusChangeListener110, Boolean.TRUE}, 36630807, -36630802, System.identityHashCode(onFocusChangeListener110));
                                            int i13119 = f56514j;
                                            int i1412 = (i13119 & (-42)) | ((~i13119) & 41);
                                            int i1413 = (i13119 & 41) << 1;
                                            int i1414 = ((i1412 | i1413) << 1) - (i1413 ^ i1412);
                                            f56513i = i1414 % 128;
                                            int i1415 = i1414 % 2;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (!((Boolean) setOnFocusChangeListener(new Object[]{iqVar, Boolean.valueOf(zBooleanValue)}, -1544858550, 1544858566, System.identityHashCode(iqVar))).booleanValue()) {
                        int i510 = f56514j;
                        int i610 = (i510 & (-40)) | ((~i510) & 39);
                        int i611 = -(-((i510 & 39) << 1));
                        int i612 = (i610 ^ i611) + ((i611 & i610) << 1);
                        f56513i = i612 % 128;
                        int i613 = i612 % 2;
                        if (zBooleanValue) {
                            bfVar = new bf(iqVar.setOnFocusChangeListener());
                            if (((be) ((setImageTintList) w.setX(new Object[]{bfVar}, 1693919772, -1693919769, System.identityHashCode(bfVar)))).getNavBarTitleString()) {
                                int iIdentityHashCode3 = System.identityHashCode(iqVar);
                                int i710 = ~iIdentityHashCode3;
                                int i711 = (1180460142 & (~i710)) | (i710 & (-1180460143)) | (1180460142 & i710);
                                int i712 = ~((i711 & (-27568849)) | (i711 & 27568848) | ((-27568849) & (~i711)));
                                int i713 = ((-270401) & i710) | (iIdentityHashCode3 & 270400);
                                int i714 = (-270401) & iIdentityHashCode3;
                                int i715 = (i713 ^ i714) | (i713 & i714);
                                int i716 = ~i715;
                                int i717 = i716 & (i715 | i716);
                                int i718 = (((i717 & i712) | (i712 ^ i717)) * (-302)) - 1488848804;
                                int i719 = (i710 & (-27298449)) | (27298448 & iIdentityHashCode3);
                                int i810 = (-27298449) & iIdentityHashCode3;
                                int i811 = (i719 & i810) | (i719 ^ i810);
                                int i812 = ~i811;
                                int i813 = -(-(((i811 | i812) & i812) * (-604)));
                                int i814 = i718 & i813;
                                int i815 = (i814 - (~(-(-((i718 ^ i813) | i814))))) - 1;
                                int i816 = ((-27568849) ^ iIdentityHashCode3) | ((-27568849) & iIdentityHashCode3);
                                int i817 = ~i816;
                                int i818 = (i816 | i817) & i817;
                                int i819 = ((~i818) & 1180189742) | ((-1180189743) & i818);
                                int i910 = i818 & 1180189742;
                                int i911 = -(-(((i910 & i819) | (i819 ^ i910)) * 302));
                                int i912 = i815 & i911;
                                int i913 = (i911 | i815) & (~i912);
                                int i914 = -(-(i912 << 1));
                                i13 = ((i913 | i914) << 1) - (i913 ^ i914);
                                int iIdentityHashCode4 = System.identityHashCode(iqVar);
                                int i915 = ~iIdentityHashCode4;
                                int i916 = iIdentityHashCode4 & 515679304;
                                int i917 = ((-515679305) & i915) | i916;
                                int i918 = (-515679305) & iIdentityHashCode4;
                                int i919 = ~((i917 ^ i918) | (i917 & i918));
                                int i1010 = 67665928 & i919;
                                int i1011 = (~i1010) & (67665928 | i919);
                                int i1012 = -(-(((i1011 & i1010) | (i1011 ^ i1010)) * (-814)));
                                int i1013 = ((~i1012) & 240334909) | (i1012 & (-240334910));
                                int i1014 = (i1012 & 240334909) << 1;
                                int i1015 = (i1013 & i1014) + (i1014 | i1013);
                                int i1016 = ((~i915) & 469053120) | (i915 & (-469053121));
                                int i1017 = i915 & 469053120;
                                int i1018 = ~((i1016 & i1017) | (i1016 ^ i1017));
                                int i1019 = (i1018 & 21039744) | (i1018 ^ 21039744);
                                int i1110 = ((-515679305) | iIdentityHashCode4) & (~i918);
                                int i1111 = (i918 & i1110) | (i1110 ^ i918);
                                int i1112 = ~i1111;
                                int i1113 = (i1111 | i1112) & i1112;
                                int i1114 = i1019 & i1113;
                                int i1115 = (i1019 | i1113) & (~i1114);
                                int i1116 = ((i1115 & i1114) | (i1115 ^ i1114)) * 407;
                                int i1117 = i1015 & i1116;
                                int i1118 = ((i1116 | i1015) & (~i1117)) + (i1117 << 1);
                                int i1119 = ~((515679304 ^ iIdentityHashCode4) | i916);
                                int i1212 = (21039744 & i1119) | (21039744 ^ i1119);
                                int i1213 = (-469053121) & iIdentityHashCode4;
                                int i1214 = ((-469053121) | iIdentityHashCode4) & (~i1213);
                                int i1215 = ~((i1214 & i1213) | (i1214 ^ i1213));
                                int i1216 = ((~i1215) & i1212) | ((~i1212) & i1215);
                                int i1217 = i1215 & i1212;
                                int i1218 = ((i1217 & i1216) | (i1216 ^ i1217)) * 407;
                                int i1219 = i1118 & i1218;
                                i14 = (i1218 | i1118) & (~i1219);
                                i15 = -(-(i1219 << 1));
                                if (i13 > (i14 & i15) + (i14 | i15)) {
                                    im onFocusChangeListener20 = iqVar.setOnFocusChangeListener();
                                    setFontFeatureSettings setfontfeaturesettings6 = (setFontFeatureSettings) im.setY(new Object[]{onFocusChangeListener20}, -408299353, 408299353, System.identityHashCode(onFocusChangeListener20));
                                    cs csVar7 = (cs) setFontFeatureSettings.setCompoundDrawableTintBlendMode(new Object[]{setfontfeaturesettings6}, -1608275827, 1608275837, System.identityHashCode(setfontfeaturesettings6));
                                    Intrinsics.checkNotNull(csVar7);
                                    crVar3 = (cr) ((setImageTintList) w.setX(new Object[]{csVar7}, 1693919772, -1693919769, System.identityHashCode(csVar7)));
                                    int i1220 = 41 / 0;
                                    if (((Boolean) cr.setDividerPadding(new Object[]{crVar3}, -590986648, 590986653, System.identityHashCode(crVar3))).booleanValue()) {
                                        int i1416 = f56514j;
                                        int i1417 = i1416 & 83;
                                        i16 = i1417 + ((i1416 ^ 83) | i1417);
                                        f56513i = i16 % 128;
                                        if (i16 % 2 != 0) {
                                            im onFocusChangeListener111 = iqVar.setOnFocusChangeListener();
                                            im.setY(new Object[]{onFocusChangeListener111, Boolean.TRUE}, -818388399, 818388408, System.identityHashCode(onFocusChangeListener111));
                                        } else {
                                            im onFocusChangeListener112 = iqVar.setOnFocusChangeListener();
                                            im.setY(new Object[]{onFocusChangeListener112, Boolean.TRUE}, -818388399, 818388408, System.identityHashCode(onFocusChangeListener112));
                                        }
                                    } else {
                                        if (((be) ((setImageTintList) w.setX(new Object[]{bfVar}, 1693919772, -1693919769, System.identityHashCode(bfVar)))).UiMessageCallbackKtWhenMappings()) {
                                            int i12110 = f56514j;
                                            int i131110 = i12110 & 95;
                                            int i131111 = i131110 + ((i12110 ^ 95) | i131110);
                                            f56513i = i131111 % 128;
                                            int i131112 = i131111 % 2;
                                            im onFocusChangeListener113 = iqVar.setOnFocusChangeListener();
                                            setFontFeatureSettings setfontfeaturesettings7 = (setFontFeatureSettings) im.setY(new Object[]{onFocusChangeListener113}, -408299353, 408299353, System.identityHashCode(onFocusChangeListener113));
                                            cs csVar8 = (cs) setFontFeatureSettings.setCompoundDrawableTintBlendMode(new Object[]{setfontfeaturesettings7}, -1608275827, 1608275837, System.identityHashCode(setfontfeaturesettings7));
                                            Intrinsics.checkNotNull(csVar8);
                                            crVar = (cr) ((setImageTintList) w.setX(new Object[]{csVar8}, 1693919772, -1693919769, System.identityHashCode(csVar8)));
                                            if (!(!((Boolean) cr.setDividerPadding(new Object[]{crVar}, 1286694359, -1286694351, System.identityHashCode(crVar))).booleanValue())) {
                                                int i131113 = f56513i;
                                                int i131114 = ((((i131113 ^ 21) | (i131113 & 21)) << 1) - (~(-(((~i131113) & 21) | (i131113 & (-22)))))) - 1;
                                                f56514j = i131114 % 128;
                                                int i131115 = i131114 % 2;
                                                fkVar = (fk) setOnFocusChangeListener(new Object[]{iqVar}, -777122735, 777122748, System.identityHashCode(iqVar));
                                                int i131116 = f56514j;
                                                int i131117 = i131116 & 57;
                                                int i131118 = -(-((i131116 ^ 57) | i131117));
                                                i12 = ((i131117 | i131118) << 1) - (i131118 ^ i131117);
                                                f56513i = i12 % 128;
                                                if (i12 % 2 == 0) {
                                                    return fkVar;
                                                }
                                                throw null;
                                            }
                                        }
                                        im onFocusChangeListener114 = iqVar.setOnFocusChangeListener();
                                        im.setY(new Object[]{onFocusChangeListener114, Boolean.TRUE}, 36630807, -36630802, System.identityHashCode(onFocusChangeListener114));
                                        int i131119 = f56514j;
                                        int i1418 = (i131119 & (-42)) | ((~i131119) & 41);
                                        int i1419 = (i131119 & 41) << 1;
                                        int i14110 = ((i1418 | i1419) << 1) - (i1419 ^ i1418);
                                        f56513i = i14110 % 128;
                                        int i14111 = i14110 % 2;
                                    }
                                } else {
                                    im onFocusChangeListener115 = iqVar.setOnFocusChangeListener();
                                    setFontFeatureSettings setfontfeaturesettings8 = (setFontFeatureSettings) im.setY(new Object[]{onFocusChangeListener115}, -408299353, 408299353, System.identityHashCode(onFocusChangeListener115));
                                    cs csVar9 = (cs) setFontFeatureSettings.setCompoundDrawableTintBlendMode(new Object[]{setfontfeaturesettings8}, -1608275827, 1608275837, System.identityHashCode(setfontfeaturesettings8));
                                    Intrinsics.checkNotNull(csVar9);
                                    crVar2 = (cr) ((setImageTintList) w.setX(new Object[]{csVar9}, 1693919772, -1693919769, System.identityHashCode(csVar9)));
                                    if (((Boolean) cr.setDividerPadding(new Object[]{crVar2}, -590986648, 590986653, System.identityHashCode(crVar2))).booleanValue()) {
                                        int i14112 = f56514j;
                                        int i14113 = i14112 & 83;
                                        i16 = i14113 + ((i14112 ^ 83) | i14113);
                                        f56513i = i16 % 128;
                                        if (i16 % 2 != 0) {
                                            im onFocusChangeListener116 = iqVar.setOnFocusChangeListener();
                                            im.setY(new Object[]{onFocusChangeListener116, Boolean.TRUE}, -818388399, 818388408, System.identityHashCode(onFocusChangeListener116));
                                        } else {
                                            im onFocusChangeListener117 = iqVar.setOnFocusChangeListener();
                                            im.setY(new Object[]{onFocusChangeListener117, Boolean.TRUE}, -818388399, 818388408, System.identityHashCode(onFocusChangeListener117));
                                        }
                                    } else {
                                        if (((be) ((setImageTintList) w.setX(new Object[]{bfVar}, 1693919772, -1693919769, System.identityHashCode(bfVar)))).UiMessageCallbackKtWhenMappings()) {
                                            int i12111 = f56514j;
                                            int i1311110 = i12111 & 95;
                                            int i1311111 = i1311110 + ((i12111 ^ 95) | i1311110);
                                            f56513i = i1311111 % 128;
                                            int i1311112 = i1311111 % 2;
                                            im onFocusChangeListener118 = iqVar.setOnFocusChangeListener();
                                            setFontFeatureSettings setfontfeaturesettings9 = (setFontFeatureSettings) im.setY(new Object[]{onFocusChangeListener118}, -408299353, 408299353, System.identityHashCode(onFocusChangeListener118));
                                            cs csVar10 = (cs) setFontFeatureSettings.setCompoundDrawableTintBlendMode(new Object[]{setfontfeaturesettings9}, -1608275827, 1608275837, System.identityHashCode(setfontfeaturesettings9));
                                            Intrinsics.checkNotNull(csVar10);
                                            crVar = (cr) ((setImageTintList) w.setX(new Object[]{csVar10}, 1693919772, -1693919769, System.identityHashCode(csVar10)));
                                            if (!(!((Boolean) cr.setDividerPadding(new Object[]{crVar}, 1286694359, -1286694351, System.identityHashCode(crVar))).booleanValue())) {
                                                int i1311113 = f56513i;
                                                int i1311114 = ((((i1311113 ^ 21) | (i1311113 & 21)) << 1) - (~(-(((~i1311113) & 21) | (i1311113 & (-22)))))) - 1;
                                                f56514j = i1311114 % 128;
                                                int i1311115 = i1311114 % 2;
                                                fkVar = (fk) setOnFocusChangeListener(new Object[]{iqVar}, -777122735, 777122748, System.identityHashCode(iqVar));
                                                int i1311116 = f56514j;
                                                int i1311117 = i1311116 & 57;
                                                int i1311118 = -(-((i1311116 ^ 57) | i1311117));
                                                i12 = ((i1311117 | i1311118) << 1) - (i1311118 ^ i1311117);
                                                f56513i = i12 % 128;
                                                if (i12 % 2 == 0) {
                                                    return fkVar;
                                                }
                                                throw null;
                                            }
                                        }
                                        im onFocusChangeListener119 = iqVar.setOnFocusChangeListener();
                                        im.setY(new Object[]{onFocusChangeListener119, Boolean.TRUE}, 36630807, -36630802, System.identityHashCode(onFocusChangeListener119));
                                        int i1311119 = f56514j;
                                        int i14114 = (i1311119 & (-42)) | ((~i1311119) & 41);
                                        int i14115 = (i1311119 & 41) << 1;
                                        int i14116 = ((i14114 | i14115) << 1) - (i14115 ^ i14114);
                                        f56513i = i14116 % 128;
                                        int i14117 = i14116 % 2;
                                    }
                                }
                            } else {
                                if (((be) ((setImageTintList) w.setX(new Object[]{bfVar}, 1693919772, -1693919769, System.identityHashCode(bfVar)))).UiMessageCallbackKtWhenMappings()) {
                                    int i12112 = f56514j;
                                    int i13111110 = i12112 & 95;
                                    int i13111111 = i13111110 + ((i12112 ^ 95) | i13111110);
                                    f56513i = i13111111 % 128;
                                    int i13111112 = i13111111 % 2;
                                    im onFocusChangeListener1110 = iqVar.setOnFocusChangeListener();
                                    setFontFeatureSettings setfontfeaturesettings10 = (setFontFeatureSettings) im.setY(new Object[]{onFocusChangeListener1110}, -408299353, 408299353, System.identityHashCode(onFocusChangeListener1110));
                                    cs csVar11 = (cs) setFontFeatureSettings.setCompoundDrawableTintBlendMode(new Object[]{setfontfeaturesettings10}, -1608275827, 1608275837, System.identityHashCode(setfontfeaturesettings10));
                                    Intrinsics.checkNotNull(csVar11);
                                    crVar = (cr) ((setImageTintList) w.setX(new Object[]{csVar11}, 1693919772, -1693919769, System.identityHashCode(csVar11)));
                                    if (!(!((Boolean) cr.setDividerPadding(new Object[]{crVar}, 1286694359, -1286694351, System.identityHashCode(crVar))).booleanValue())) {
                                        int i13111113 = f56513i;
                                        int i13111114 = ((((i13111113 ^ 21) | (i13111113 & 21)) << 1) - (~(-(((~i13111113) & 21) | (i13111113 & (-22)))))) - 1;
                                        f56514j = i13111114 % 128;
                                        int i13111115 = i13111114 % 2;
                                        fkVar = (fk) setOnFocusChangeListener(new Object[]{iqVar}, -777122735, 777122748, System.identityHashCode(iqVar));
                                        int i13111116 = f56514j;
                                        int i13111117 = i13111116 & 57;
                                        int i13111118 = -(-((i13111116 ^ 57) | i13111117));
                                        i12 = ((i13111117 | i13111118) << 1) - (i13111118 ^ i13111117);
                                        f56513i = i12 % 128;
                                        if (i12 % 2 == 0) {
                                            return fkVar;
                                        }
                                        throw null;
                                    }
                                }
                                im onFocusChangeListener1111 = iqVar.setOnFocusChangeListener();
                                im.setY(new Object[]{onFocusChangeListener1111, Boolean.TRUE}, 36630807, -36630802, System.identityHashCode(onFocusChangeListener1111));
                                int i13111119 = f56514j;
                                int i14118 = (i13111119 & (-42)) | ((~i13111119) & 41);
                                int i14119 = (i13111119 & 41) << 1;
                                int i141110 = ((i14118 | i14119) << 1) - (i14119 ^ i14118);
                                f56513i = i141110 % 128;
                                int i141111 = i141110 % 2;
                            }
                        } else {
                            cp cpVar2 = new cp(iqVar.setOnFocusChangeListener());
                            int i614 = f56513i;
                            int i615 = i614 & 49;
                            int i616 = ((i614 ^ 49) | i615) << 1;
                            int i617 = -((i614 | 49) & (~i615));
                            int i618 = (i616 ^ i617) + ((i617 & i616) << 1);
                            f56514j = i618 % 128;
                            int i619 = i618 % 2;
                        }
                    }
                }
                iu x4 = iqVar.setX();
                iu.setX(new Object[]{x4, iqVar.setOnFocusChangeListener(), iqVar.setCompoundDrawableTintBlendMode()}, -1427594487, 1427594496, System.identityHashCode(x4));
                setTransitionVisibility settransitionvisibility = setTransitionVisibility.setOnDragListener;
                im onFocusChangeListener21 = iqVar.setOnFocusChangeListener();
                if (!((Boolean) im.setY(new Object[]{onFocusChangeListener21}, 61227936, -61227928, System.identityHashCode(onFocusChangeListener21))).booleanValue()) {
                    int i150 = f56513i;
                    int i151 = ((i150 ^ 85) - (~((i150 & 85) << 1))) - 1;
                    f56514j = i151 % 128;
                    if (i151 % 2 == 0) {
                        throw null;
                    }
                    if (!zBooleanValue) {
                        int i152 = ((i150 ^ 14) + ((i150 & 14) << 1)) - 1;
                        f56514j = i152 % 128;
                        if (i152 % 2 == 0) {
                            SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
                            SouthPacificEndpoint.setX(new Object[]{12367, null, 55}, 1336485880, -1336485874, 12367);
                            setfitssystemwindowsArrValues = setFitsSystemWindows.values();
                            length = setfitssystemwindowsArrValues.length;
                            i10 = 1;
                        } else {
                            SouthPacificEndpoint southPacificEndpoint2 = SouthPacificEndpoint.setX;
                            SouthPacificEndpoint.setX(new Object[]{20015, null, 6}, 1336485880, -1336485874, 20015);
                            setfitssystemwindowsArrValues = setFitsSystemWindows.values();
                            length = setfitssystemwindowsArrValues.length;
                            i10 = 0;
                        }
                        while (true) {
                            if (i10 >= length) {
                                int i153 = f56513i;
                                int i154 = (((i153 & (-34)) | ((~i153) & 33)) - (~((i153 & 33) << 1))) - 1;
                                f56514j = i154 % 128;
                                i11 = 2;
                                int i155 = i154 % 2;
                                setfitssystemwindows = null;
                                break;
                            }
                            int i156 = f56514j + 97;
                            f56513i = i156 % 128;
                            if (i156 % 2 != 0) {
                                setfitssystemwindows = setfitssystemwindowsArrValues[i10];
                                int i157 = 33 / 0;
                                if (setfitssystemwindows.setDividerPadding() == bByteValue) {
                                    int i158 = f56514j;
                                    int i159 = i158 ^ 77;
                                    int i160 = -(-((i158 & 77) << 1));
                                    int i161 = ((i159 | i160) << 1) - (i159 ^ i160);
                                    f56513i = i161 % 128;
                                    int i162 = i161 % 2;
                                    int i163 = (i158 ^ 107) + ((i158 & 107) << 1);
                                    f56513i = i163 % 128;
                                    int i164 = i163 % 2;
                                    z10 = true;
                                } else {
                                    int i165 = f56514j;
                                    int i166 = ((i165 | 73) << 1) - (i165 ^ 73);
                                    f56513i = i166 % 128;
                                    int i167 = i166 % 2;
                                    z10 = false;
                                }
                            } else {
                                setfitssystemwindows = setfitssystemwindowsArrValues[i10];
                                if (setfitssystemwindows.setDividerPadding() == bByteValue) {
                                    int i1510 = f56514j;
                                    int i1511 = i1510 ^ 77;
                                    int i168 = -(-((i1510 & 77) << 1));
                                    int i169 = ((i1511 | i168) << 1) - (i1511 ^ i168);
                                    f56513i = i169 % 128;
                                    int i1610 = i169 % 2;
                                    int i1611 = (i1510 ^ 107) + ((i1510 & 107) << 1);
                                    f56513i = i1611 % 128;
                                    int i1612 = i1611 % 2;
                                    z10 = true;
                                } else {
                                    int i1613 = f56514j;
                                    int i1614 = ((i1613 | 73) << 1) - (i1613 ^ 73);
                                    f56513i = i1614 % 128;
                                    int i1615 = i1614 % 2;
                                    z10 = false;
                                }
                            }
                            if (z10) {
                                int i170 = f56513i;
                                int i171 = (i170 & 13) + (i170 | 13);
                                f56514j = i171 % 128;
                                int i172 = i171 % 2;
                                i11 = 2;
                                break;
                            }
                            i10 = ((i10 | 1) << 1) - (i10 ^ 1);
                            int i173 = f56513i;
                            int i174 = ((i173 & 34) + (i173 | 34)) - 1;
                            f56514j = i174 % 128;
                            int i175 = i174 % 2;
                        }
                        Object[] objArr2 = new Object[i11];
                        objArr2[0] = iqVar;
                        objArr2[1] = setfitssystemwindows;
                        settransitionvisibility = (setTransitionVisibility) setOnFocusChangeListener(objArr2, 641377475, -641377463, System.identityHashCode(iqVar));
                        if (settransitionvisibility == setTransitionVisibility.setOnFocusChangeListener) {
                            int i176 = f56513i;
                            int i177 = ((i176 & 112) + (i176 | 112)) - 1;
                            f56514j = i177 % 128;
                            if (i177 % 2 == 0) {
                                cr crVar4 = (cr) ((setImageTintList) w.setX(new Object[]{csVar}, 1693919772, -1693919769, System.identityHashCode(csVar)));
                                int i178 = 80 / 0;
                                if (((Boolean) cr.setDividerPadding(new Object[]{crVar4}, 720483124, -720483117, System.identityHashCode(crVar4))).booleanValue()) {
                                    im onFocusChangeListener22 = iqVar.setOnFocusChangeListener();
                                    im.setY(new Object[]{onFocusChangeListener22, Boolean.TRUE}, 36630807, -36630802, System.identityHashCode(onFocusChangeListener22));
                                    int i179 = f56514j;
                                    int i180 = (((i179 | 114) << 1) - (i179 ^ 114)) - 1;
                                    f56513i = i180 % 128;
                                    int i181 = i180 % 2;
                                }
                            } else {
                                cr crVar5 = (cr) ((setImageTintList) w.setX(new Object[]{csVar}, 1693919772, -1693919769, System.identityHashCode(csVar)));
                                if (!(!((Boolean) cr.setDividerPadding(new Object[]{crVar5}, 720483124, -720483117, System.identityHashCode(crVar5))).booleanValue())) {
                                    im onFocusChangeListener23 = iqVar.setOnFocusChangeListener();
                                    im.setY(new Object[]{onFocusChangeListener23, Boolean.TRUE}, 36630807, -36630802, System.identityHashCode(onFocusChangeListener23));
                                    int i1710 = f56514j;
                                    int i182 = (((i1710 | 114) << 1) - (i1710 ^ 114)) - 1;
                                    f56513i = i182 % 128;
                                    int i183 = i182 % 2;
                                }
                            }
                        }
                    }
                }
                setSelector setselector = setSelector.NONE;
                im onFocusChangeListener24 = iqVar.setOnFocusChangeListener();
                setRevealOnFocusHint setrevealonfocushint = (setRevealOnFocusHint) im.setY(new Object[]{onFocusChangeListener24}, -967673671, 967673681, System.identityHashCode(onFocusChangeListener24));
                if (((Boolean) setRevealOnFocusHint.setY(new Object[]{setrevealonfocushint}, -1374154889, 1374154896, System.identityHashCode(setrevealonfocushint))).booleanValue()) {
                    int i184 = f56514j + 53;
                    f56513i = i184 % 128;
                    if (i184 % 2 != 0) {
                        im onFocusChangeListener25 = iqVar.setOnFocusChangeListener();
                        setAnimation setanimation2 = setAnimation.INSTANCE;
                        throw null;
                    }
                    im onFocusChangeListener26 = iqVar.setOnFocusChangeListener();
                    setAnimation setanimation3 = setAnimation.INSTANCE;
                    getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener26, (TransactionFailed) setAnimation.setY(new Object[0], -160077504, 160077624, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(onFocusChangeListener26));
                    if (getbeeponfailure2 != null) {
                        int i185 = f56513i;
                        int i186 = i185 & 99;
                        int i187 = -(-(i185 | 99));
                        int i188 = (i186 ^ i187) + ((i187 & i186) << 1);
                        f56514j = i188 % 128;
                        int i189 = i188 % 2;
                        setSelector setselector2 = setSelector.BALANCE;
                        im onFocusChangeListener27 = iqVar.setOnFocusChangeListener();
                        getBeepOnFailure getbeeponfailure3 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener27, setAnimation.setPersistentDrawingCache()}, -1593889019, 1593889062, System.identityHashCode(onFocusChangeListener27));
                        if (getbeeponfailure3 != null) {
                            int i190 = f56514j;
                            int i191 = i190 & 81;
                            int i192 = ((i190 ^ 81) | i191) << 1;
                            int i193 = -((i190 | 81) & (~i191));
                            int i194 = (i192 ^ i193) + ((i193 & i192) << 1);
                            f56513i = i194 % 128;
                            if (i194 % 2 != 0) {
                                int i195 = 28 / 0;
                            }
                        }
                        setselector = setselector2;
                    }
                }
                im onFocusChangeListener28 = iqVar.setOnFocusChangeListener();
                if (!(!((Boolean) im.setY(new Object[]{onFocusChangeListener28}, 413373164, -413373162, System.identityHashCode(onFocusChangeListener28))).booleanValue())) {
                    int i196 = f56513i;
                    int i197 = i196 & 89;
                    int i198 = -(-((i196 ^ 89) | i197));
                    int i199 = (i197 & i198) + (i198 | i197);
                    f56514j = i199 % 128;
                    int i200 = i199 % 2;
                    im onFocusChangeListener29 = iqVar.setOnFocusChangeListener();
                    if (!((Boolean) im.setY(new Object[]{onFocusChangeListener29}, 61227936, -61227928, System.identityHashCode(onFocusChangeListener29))).booleanValue()) {
                        int i201 = f56513i + 5;
                        f56514j = i201 % 128;
                        if (i201 % 2 == 0) {
                            throw null;
                        }
                        fk fkVar4 = (fk) setOnFocusChangeListener(new Object[]{iqVar, setselector, settransitionvisibility}, -1961328370, 1961328374, System.identityHashCode(iqVar));
                        int i202 = f56513i + 27;
                        f56514j = i202 % 128;
                        int i203 = i202 % 2;
                        return fkVar4;
                    }
                }
                im onFocusChangeListener30 = iqVar.setOnFocusChangeListener();
                if (!((Boolean) im.setY(new Object[]{onFocusChangeListener30}, 413373164, -413373162, System.identityHashCode(onFocusChangeListener30))).booleanValue()) {
                    int i204 = f56513i;
                    int i205 = (i204 | 13) << 1;
                    int i206 = -(((~i204) & 13) | (i204 & (-14)));
                    int i207 = (i205 ^ i206) + ((i206 & i205) << 1);
                    f56514j = i207 % 128;
                    if (i207 % 2 == 0) {
                        im onFocusChangeListener31 = iqVar.setOnFocusChangeListener();
                        ((Boolean) im.setY(new Object[]{onFocusChangeListener31}, 61227936, -61227928, System.identityHashCode(onFocusChangeListener31))).booleanValue();
                        throw null;
                    }
                    im onFocusChangeListener32 = iqVar.setOnFocusChangeListener();
                    if (!((Boolean) im.setY(new Object[]{onFocusChangeListener32}, 61227936, -61227928, System.identityHashCode(onFocusChangeListener32))).booleanValue()) {
                        return (fk) setOnFocusChangeListener(new Object[]{iqVar, settransitionvisibility, setselector}, -1959436552, 1959436562, System.identityHashCode(iqVar));
                    }
                }
                fk fkVar5 = (fk) setOnFocusChangeListener(new Object[]{iqVar, setselector, settransitionvisibility}, 554356218, -554356211, System.identityHashCode(iqVar));
                int i208 = f56514j;
                int i209 = i208 & 95;
                int i210 = (i208 | 95) & (~i209);
                int i211 = -(-(i209 << 1));
                int i212 = ((i210 | i211) << 1) - (i210 ^ i211);
                f56513i = i212 % 128;
                if (i212 % 2 != 0) {
                    int i213 = 1 / 0;
                }
                return fkVar5;
            }
        }
        fk fkVar6 = (fk) setOnFocusChangeListener(new Object[]{iqVar}, 1131055990, -1131055985, System.identityHashCode(iqVar));
        int iIdentityHashCode5 = System.identityHashCode(iqVar);
        int i214 = 1773825856 & iIdentityHashCode5;
        int i215 = (~i214) & (1773825856 | iIdentityHashCode5);
        int i216 = ~iIdentityHashCode5;
        int i217 = -(-((~((i214 & i215) | (i215 ^ i214))) * TypedValues.CycleType.TYPE_EASING));
        int i218 = (((-890642035) & i217) + (i217 | (-890642035))) - 641768440;
        int i219 = ~(((iIdentityHashCode5 | i216) & i216) | 1773825856);
        int i220 = ((~i219) & 17976064) | ((-17976065) & i219);
        int i221 = i219 & 17976064;
        int i222 = -(-(((i221 & i220) | (i220 ^ i221)) * TypedValues.CycleType.TYPE_EASING));
        int i223 = (i218 ^ i222) + ((i222 & i218) << 1);
        int iIdentityHashCode6 = System.identityHashCode(iqVar);
        int i224 = ~iIdentityHashCode6;
        int i225 = (-1534987415) & i224;
        int i226 = ((-1534987415) | i224) & (~i225);
        int i227 = ~((i226 & i225) | (i226 ^ i225));
        int i228 = ((~i227) & 5508096) | ((-5508097) & i227);
        int i229 = i227 & 5508096;
        int i230 = -(-(((i229 & i228) | (i228 ^ i229)) * (-241)));
        int i231 = ((-275567548) ^ i230) + ((i230 & (-275567548)) << 1);
        int i232 = (((i231 | (-1173166622)) << 1) - (~(-((-1173166622) ^ i231)))) - 1;
        int i233 = (iIdentityHashCode6 | i224) & i224;
        int i234 = ((~i233) & (-1534987415)) | (1534987414 & i233);
        int i235 = i233 & (-1534987415);
        int i236 = (i235 & i234) | (i234 ^ i235);
        int i237 = i236 & 5598569;
        int i238 = (i236 | 5598569) & (~i237);
        int i239 = (i238 & i237) | (i238 ^ i237);
        int i240 = ~i239;
        int i241 = (i239 | i240) & i240;
        int i242 = ((~i241) & 90473) | ((-90474) & i241);
        int i243 = i241 & 90473;
        int i244 = ((i243 & i242) | (i242 ^ i243)) * 241;
        int i245 = ((~i244) & i232) | ((~i232) & i244);
        int i246 = -(-((i244 & i232) << 1));
        if (i223 <= (i245 ^ i246) + ((i246 & i245) << 1)) {
            return fkVar6;
        }
        throw null;
    }

    public static /* synthetic */ Boolean j(Object[] objArr) {
        iq iqVar = (iq) objArr[0];
        cs csVar = (cs) objArr[1];
        int i10 = f56514j + 65;
        f56513i = i10 % 128;
        int i11 = i10 % 2;
        im onFocusChangeListener = iqVar.setOnFocusChangeListener();
        setAnimation setanimation = setAnimation.INSTANCE;
        if (((getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener, (TransactionFailed) setAnimation.setY(new Object[0], -692948779, 692948802, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(onFocusChangeListener))) != null) {
            int i12 = f56513i;
            int i13 = i12 + 57;
            f56514j = i13 % 128;
            int i14 = i13 % 2;
            int i15 = (i12 & 83) + (i12 | 83);
            f56514j = i15 % 128;
            int i16 = i15 % 2;
            int i17 = (i12 ^ 33) + ((i12 & 33) << 1);
            f56514j = i17 % 128;
            if (i17 % 2 == 0) {
                ((Boolean) setOnFocusChangeListener(new Object[]{iqVar}, -1928623714, 1928623717, System.identityHashCode(iqVar))).booleanValue();
                throw null;
            }
            if (!(!((Boolean) setOnFocusChangeListener(new Object[]{iqVar}, -1928623714, 1928623717, System.identityHashCode(iqVar))).booleanValue()) && !(!((Boolean) setOnFocusChangeListener(new Object[]{iqVar, csVar}, -2147108811, 2147108820, System.identityHashCode(iqVar))).booleanValue())) {
                int i18 = f56514j;
                int i19 = (((i18 | 104) << 1) - (i18 ^ 104)) - 1;
                f56513i = i19 % 128;
                int i20 = i19 % 2;
                int i21 = (-2) - ((i18 + 66) ^ (-1));
                f56513i = i21 % 128;
                int i22 = i21 % 2;
                return Boolean.TRUE;
            }
        } else {
            int i23 = f56513i;
            int i24 = ((i23 | 55) << 1) - (i23 ^ 55);
            f56514j = i24 % 128;
            int i25 = i24 % 2;
        }
        int i26 = f56514j;
        int i27 = i26 ^ 1;
        int i28 = -(-((i26 & 1) << 1));
        int i29 = (i27 & i28) + (i28 | i27);
        f56513i = i29 % 128;
        if (i29 % 2 == 0) {
            return Boolean.FALSE;
        }
        int i30 = 68 / 0;
        return Boolean.FALSE;
    }

    public static /* synthetic */ Boolean k(Object[] objArr) {
        iq iqVar = (iq) objArr[0];
        cs csVar = (cs) objArr[1];
        int i10 = f56513i;
        int i11 = ((i10 & (-20)) | ((~i10) & 19)) + ((i10 & 19) << 1);
        f56514j = i11 % 128;
        int i12 = i11 % 2;
        setAnimation setanimation = setAnimation.INSTANCE;
        if (!((Boolean) setOnFocusChangeListener(new Object[]{iqVar, CollectionsKt__CollectionsKt.listOf((Object[]) new TransactionFailed[]{(TransactionFailed) setAnimation.setY(new Object[0], 2002669863, -2002669628, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 300582665, -300582602, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], -1633092668, 1633092819, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 634564037, -634564032, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], -2052046062, 2052046231, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 1963048329, -1963048320, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 1272420639, -1272420489, (int) System.currentTimeMillis())})}, 700169587, -700169573, System.identityHashCode(iqVar))).booleanValue()) {
            boolean zBooleanValue = ((Boolean) setOnFocusChangeListener(new Object[]{iqVar, csVar}, 1196472379, -1196472361, System.identityHashCode(iqVar))).booleanValue();
            int i13 = f56514j;
            int i14 = i13 & 65;
            int i15 = -(-(i13 | 65));
            int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
            f56513i = i16 % 128;
            if (i16 % 2 == 0) {
                return Boolean.valueOf(zBooleanValue);
            }
            throw null;
        }
        int i17 = f56514j;
        int i18 = ((i17 ^ 55) | (i17 & 55)) << 1;
        int i19 = -(((~i17) & 55) | (i17 & (-56)));
        int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
        int i21 = i20 % 128;
        f56513i = i21;
        int i22 = i20 % 2;
        int i23 = ((i21 & 89) - (~(-(-(i21 | 89))))) - 1;
        f56514j = i23 % 128;
        if (i23 % 2 != 0) {
            return Boolean.FALSE;
        }
        throw null;
    }

    public static /* synthetic */ fk l(Object[] objArr) {
        iq iqVar = (iq) objArr[0];
        setSelector setselector = (setSelector) objArr[1];
        setTransitionVisibility settransitionvisibility = (setTransitionVisibility) objArr[2];
        int i10 = f56513i;
        int i11 = (i10 ^ 63) + ((i10 & 63) << 1);
        f56514j = i11 % 128;
        if (i11 % 2 == 0) {
            iu x4 = iqVar.setX();
            throw null;
        }
        iu x6 = iqVar.setX();
        fk fkVar = (fk) iu.setX(new Object[]{x6, iqVar.setOnFocusChangeListener(), iqVar.setCompoundDrawableTintBlendMode(), activateSession.AUTHORISING_PLEASE_WAIT, fd.ONLINE_REQUEST, setselector, settransitionvisibility}, 1387632794, -1387632788, System.identityHashCode(x6));
        int i12 = f56514j;
        int i13 = i12 & 55;
        int i14 = (((i12 ^ 55) | i13) << 1) - ((i12 | 55) & (~i13));
        f56513i = i14 % 128;
        int i15 = i14 % 2;
        return fkVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x008f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0426 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x0419 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x0419 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x03cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x03cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:12:0x0095  */
    /* JADX WARN: Code duplicated, block: B:14:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:16:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:18:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:19:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:27:0x0150  */
    /* JADX WARN: Code duplicated, block: B:52:0x0349  */
    /* JADX WARN: Code duplicated, block: B:55:0x0360  */
    /* JADX WARN: Code duplicated, block: B:57:0x0385  */
    /* JADX WARN: Code duplicated, block: B:61:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:92:0x0594  */
    /* JADX WARN: Code duplicated, block: B:93:0x05da  */
    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) throws Exception {
        Object objValueOf;
        int i13;
        fk fkVar;
        Iterator it;
        int i14;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        boolean z10;
        int i15;
        boolean z11;
        int i16 = ~i10;
        int i17 = ~i11;
        String strReplace$default = null;
        switch ((((~(i10 | (~i12))) | i17) * 168) + (((~(i11 | i10)) | (~(i10 | i12))) * (-168)) + (((~(i16 | i17)) | (~(i17 | i12))) * 336) + (i11 * (-167)) + (i10 * (-167))) {
            case 1:
                return f(objArr);
            case 2:
                return j(objArr);
            case 3:
                return g(objArr);
            case 4:
                return l(objArr);
            case 5:
                iq iqVar = (iq) objArr[0];
                System.identityHashCode(iqVar);
                System.identityHashCode(iqVar);
                objValueOf = (fk) iu.setX(new Object[]{iqVar.setX(), iqVar.setOnFocusChangeListener(), iqVar.setCompoundDrawableTintBlendMode(), ValueQualifier.setDividerPadding, setContentCaptureSession.setOnLongClickListener}, 991028938, -991028938, (int) System.currentTimeMillis());
                int i18 = f56513i;
                int i19 = (i18 ^ 95) + ((i18 & 95) << 1);
                f56514j = i19 % 128;
                if (i19 % 2 == 0) {
                    throw null;
                }
                break;
            case 6:
                return h(objArr);
            case 7:
                iq iqVar2 = (iq) objArr[0];
                setSelector setselector = (setSelector) objArr[1];
                setTransitionVisibility settransitionvisibility = (setTransitionVisibility) objArr[2];
                int i20 = f56514j + 79;
                f56513i = i20 % 128;
                int i21 = i20 % 2;
                iu x4 = iqVar2.setX();
                objValueOf = (fk) iu.setX(new Object[]{x4, iqVar2.setOnFocusChangeListener(), iqVar2.setCompoundDrawableTintBlendMode(), activateSession.NOT_AUTHORISED, fd.DECLINED, setselector, settransitionvisibility}, 1387632794, -1387632788, System.identityHashCode(x4));
                int i22 = f56513i;
                int i23 = ((i22 & 91) - (~(-(-(i22 | 91))))) - 1;
                f56514j = i23 % 128;
                if (i23 % 2 == 0) {
                    throw null;
                }
                break;
            case 8:
                return b(objArr);
            case 9:
                return k(objArr);
            case 10:
                return c(objArr);
            case 11:
                iq iqVar3 = (iq) objArr[0];
                int i24 = f56514j;
                int i25 = (i24 & (-90)) | ((~i24) & 89);
                int i26 = (i24 & 89) << 1;
                int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
                f56513i = i27 % 128;
                int i28 = i27 % 2;
                im onFocusChangeListener = iqVar3.setOnFocusChangeListener();
                setAnimation setanimation = setAnimation.INSTANCE;
                getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener, (TransactionFailed) setAnimation.setY(new Object[0], 1260159524, -1260159512, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(onFocusChangeListener));
                if (getbeeponfailure == null) {
                    int i29 = f56514j;
                    int i30 = ((i29 | 107) << 1) - (i29 ^ 107);
                    int i31 = i30 % 128;
                    f56513i = i31;
                    int i32 = i30 % 2;
                    i13 = (-2) - ((i31 + 42) ^ (-1));
                    f56514j = i13 % 128;
                } else {
                    byte[] bArr = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure));
                    if (bArr != null) {
                        String str = (String) setInputExtras.setDividerPadding(new Object[]{bArr}, 1609250238, -1609250236, (int) System.currentTimeMillis());
                        if (str == null) {
                            int i33 = f56514j;
                            int i34 = i33 & 77;
                            int i35 = ((i33 | 77) & (~i34)) + (i34 << 1);
                            f56513i = i35 % 128;
                            if (i35 % 2 != 0) {
                                int i36 = 59 / 0;
                            }
                        } else {
                            strReplace$default = l.replace$default(str, "F", "", false, 4, (Object) null);
                            i13 = f56514j + 83;
                        }
                        if (strReplace$default != null) {
                            int i37 = f56514j;
                            int i38 = ((i37 ^ 20) + ((i37 & 20) << 1)) - 1;
                            f56513i = i38 % 128;
                            int i39 = i38 % 2;
                            objValueOf = Boolean.TRUE;
                        } else {
                            bu buVar = new bu(iqVar3.setOnFocusChangeListener());
                            boolean zAreEqual = Intrinsics.areEqual(l.replace$default(new String(((br) ((setImageTintList) w.setX(new Object[]{buVar}, 1693919772, -1693919769, System.identityHashCode(buVar)))).setLayoutAnimation(), Charsets.UTF_8), "F", "", false, 4, (Object) null), strReplace$default);
                            int i40 = (-2) - ((f56514j + 82) ^ (-1));
                            f56513i = i40 % 128;
                            int i41 = i40 % 2;
                            objValueOf = Boolean.valueOf(zAreEqual);
                        }
                    } else {
                        int i42 = f56514j;
                        int i43 = i42 ^ 119;
                        int i44 = ((i42 & 119) | i43) << 1;
                        int i45 = -i43;
                        int i46 = (i44 & i45) + (i45 | i44);
                        f56513i = i46 % 128;
                        if (i46 % 2 != 0) {
                            int i47 = 87 / 0;
                        }
                        i13 = i42 + 13;
                    }
                    f56513i = i13 % 128;
                }
                int i48 = i13 % 2;
                if (strReplace$default != null) {
                    int i310 = f56514j;
                    int i311 = ((i310 ^ 20) + ((i310 & 20) << 1)) - 1;
                    f56513i = i311 % 128;
                    int i312 = i311 % 2;
                    objValueOf = Boolean.TRUE;
                } else {
                    bu buVar2 = new bu(iqVar3.setOnFocusChangeListener());
                    boolean zAreEqual2 = Intrinsics.areEqual(l.replace$default(new String(((br) ((setImageTintList) w.setX(new Object[]{buVar2}, 1693919772, -1693919769, System.identityHashCode(buVar2)))).setLayoutAnimation(), Charsets.UTF_8), "F", "", false, 4, (Object) null), strReplace$default);
                    int i49 = (-2) - ((f56514j + 82) ^ (-1));
                    f56513i = i49 % 128;
                    int i410 = i49 % 2;
                    objValueOf = Boolean.valueOf(zAreEqual2);
                }
                break;
            case 12:
                return a(objArr);
            case 13:
                iq iqVar4 = (iq) objArr[0];
                int i50 = f56514j;
                int i51 = i50 & 27;
                int i52 = i51 + ((i50 ^ 27) | i51);
                f56513i = i52 % 128;
                if (i52 % 2 != 0) {
                    fkVar = (fk) iu.setX(new Object[]{iqVar4.setX(), iqVar4.setOnFocusChangeListener(), iqVar4.setCompoundDrawableTintBlendMode(), ValueQualifier.setDividerPadding, setContentCaptureSession.setAlwaysDrawnWithCacheEnabled}, 991028938, -991028938, (int) System.currentTimeMillis());
                    int i53 = 35 / 0;
                } else {
                    fkVar = (fk) iu.setX(new Object[]{iqVar4.setX(), iqVar4.setOnFocusChangeListener(), iqVar4.setCompoundDrawableTintBlendMode(), ValueQualifier.setDividerPadding, setContentCaptureSession.setAlwaysDrawnWithCacheEnabled}, 991028938, -991028938, (int) System.currentTimeMillis());
                }
                fk fkVar2 = fkVar;
                System.identityHashCode(iqVar4);
                System.identityHashCode(iqVar4);
                return fkVar2;
            case 14:
                iq iqVar5 = (iq) objArr[0];
                List list = (List) objArr[1];
                int i54 = f56513i;
                int i55 = i54 ^ 95;
                int i56 = (i54 & 95) << 1;
                int i57 = (i55 ^ i56) + ((i55 & i56) << 1);
                f56514j = i57 % 128;
                int i58 = i57 % 2;
                List list2 = list;
                if (list2 instanceof Collection) {
                    int i59 = (i54 & 25) + (i54 | 25);
                    f56514j = i59 % 128;
                    if (i59 % 2 == 0) {
                        list2.isEmpty();
                        throw null;
                    }
                    if (list2.isEmpty()) {
                        int i60 = f56514j;
                        int i61 = (i60 & 71) + (i60 | 71);
                        f56513i = i61 % 128;
                        int i62 = i61 % 2;
                        objValueOf = Boolean.FALSE;
                        break;
                    } else {
                        it = list2.iterator();
                        int i63 = (-2) - ((f56513i + 18) ^ (-1));
                        f56514j = i63 % 128;
                        int i64 = i63 % 2;
                        while (true) {
                            if (it.hasNext()) {
                                int i65 = f56514j;
                                int i66 = (i65 & 71) + (i65 | 71);
                                f56513i = i66 % 128;
                                int i67 = i66 % 2;
                                objValueOf = Boolean.FALSE;
                                break;
                            } else {
                                int i68 = f56514j;
                                int i69 = (i68 ^ 30) + ((i68 & 30) << 1);
                                i14 = (i69 ^ (-1)) + (i69 << 1);
                                f56513i = i14 % 128;
                                if (i14 % 2 != 0) {
                                    TransactionFailed transactionFailed = (TransactionFailed) it.next();
                                    im onFocusChangeListener2 = iqVar5.setOnFocusChangeListener();
                                    zBooleanValue2 = ((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener2, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, -203580470, 203580510, System.identityHashCode(onFocusChangeListener2))).booleanValue();
                                    SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
                                    SouthPacificEndpoint.setX(new Object[]{950, transactionFailed, 3}, 1336485880, -1336485874, 950);
                                    if (zBooleanValue2) {
                                        int i70 = f56514j + 63;
                                        f56513i = i70 % 128;
                                        int i71 = i70 % 2;
                                        objValueOf = Boolean.TRUE;
                                        break;
                                    }
                                } else {
                                    TransactionFailed transactionFailed2 = (TransactionFailed) it.next();
                                    im onFocusChangeListener3 = iqVar5.setOnFocusChangeListener();
                                    zBooleanValue = ((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener3, (String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2))}, -203580470, 203580510, System.identityHashCode(onFocusChangeListener3))).booleanValue();
                                    SouthPacificEndpoint southPacificEndpoint2 = SouthPacificEndpoint.setX;
                                    SouthPacificEndpoint.setX(new Object[]{20007, transactionFailed2, 4}, 1336485880, -1336485874, 20007);
                                    if (!(!zBooleanValue)) {
                                        int i72 = f56514j + 63;
                                        f56513i = i72 % 128;
                                        int i73 = i72 % 2;
                                        objValueOf = Boolean.TRUE;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    it = list2.iterator();
                    int i610 = (-2) - ((f56513i + 18) ^ (-1));
                    f56514j = i610 % 128;
                    int i611 = i610 % 2;
                    while (true) {
                        if (it.hasNext()) {
                            int i612 = f56514j;
                            int i613 = (i612 & 71) + (i612 | 71);
                            f56513i = i613 % 128;
                            int i614 = i613 % 2;
                            objValueOf = Boolean.FALSE;
                            break;
                        } else {
                            int i615 = f56514j;
                            int i616 = (i615 ^ 30) + ((i615 & 30) << 1);
                            i14 = (i616 ^ (-1)) + (i616 << 1);
                            f56513i = i14 % 128;
                            if (i14 % 2 != 0) {
                                TransactionFailed transactionFailed3 = (TransactionFailed) it.next();
                                im onFocusChangeListener4 = iqVar5.setOnFocusChangeListener();
                                zBooleanValue2 = ((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener4, (String) TransactionFailed.setX(new Object[]{transactionFailed3}, 1914607362, -1914607356, System.identityHashCode(transactionFailed3))}, -203580470, 203580510, System.identityHashCode(onFocusChangeListener4))).booleanValue();
                                SouthPacificEndpoint southPacificEndpoint3 = SouthPacificEndpoint.setX;
                                SouthPacificEndpoint.setX(new Object[]{950, transactionFailed3, 3}, 1336485880, -1336485874, 950);
                                if (zBooleanValue2) {
                                    int i74 = f56514j + 63;
                                    f56513i = i74 % 128;
                                    int i75 = i74 % 2;
                                    objValueOf = Boolean.TRUE;
                                    break;
                                }
                            } else {
                                TransactionFailed transactionFailed4 = (TransactionFailed) it.next();
                                im onFocusChangeListener5 = iqVar5.setOnFocusChangeListener();
                                zBooleanValue = ((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener5, (String) TransactionFailed.setX(new Object[]{transactionFailed4}, 1914607362, -1914607356, System.identityHashCode(transactionFailed4))}, -203580470, 203580510, System.identityHashCode(onFocusChangeListener5))).booleanValue();
                                SouthPacificEndpoint southPacificEndpoint4 = SouthPacificEndpoint.setX;
                                SouthPacificEndpoint.setX(new Object[]{20007, transactionFailed4, 4}, 1336485880, -1336485874, 20007);
                                if (!(!zBooleanValue)) {
                                    int i76 = f56514j + 63;
                                    f56513i = i76 % 128;
                                    int i77 = i76 % 2;
                                    objValueOf = Boolean.TRUE;
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 15:
                iq iqVar6 = (iq) objArr[0];
                int i78 = ~System.identityHashCode(iqVar6);
                int i79 = 1429467168 & i78;
                int i80 = i79 | ((~i79) & (1429467168 | i78));
                int i81 = (i80 & (-1622719934)) | (i80 ^ (-1622719934));
                int i82 = ~i81;
                int i83 = -(-(((i81 | i82) & i82) * (-783)));
                int i84 = (-1338515391) & i83;
                int i85 = -(-((i83 ^ (-1338515391)) | i84));
                int i86 = (i84 ^ i85) + ((i85 & i84) << 1);
                int i87 = (1622719933 & i78) | ((~i78) & (-1622719934));
                int i88 = i78 & (-1622719934);
                int i89 = ~((i88 & i87) | (i87 ^ i88));
                int i90 = 1429467168 & i89;
                int i91 = (i89 | 1429467168) & (~i90);
                int i92 = ((i91 & i90) | (i91 ^ i90)) * 783;
                int i93 = (((i86 ^ i92) | (i86 & i92)) << 1) - ((i92 & (~i86)) | ((~i92) & i86));
                int iIdentityHashCode = System.identityHashCode(iqVar6);
                int i94 = (-380014171) | iIdentityHashCode;
                int i95 = (1242072398 & i94) | ((~i94) & (-1242072399));
                int i96 = i94 & (-1242072399);
                int i97 = -(-(((i96 & i95) | (i95 ^ i96)) * (-676)));
                int i98 = ((((~i97) & (-451801937)) | (451801936 & i97)) - (~((i97 & (-451801937)) << 1))) - 1;
                int i99 = ~iIdentityHashCode;
                int i100 = i99 & (-380014171);
                int i101 = ((-380014171) | i99) & (~i100);
                int i102 = ~((i101 & i100) | (i101 ^ i100));
                int i103 = -(-(((i102 & 33588298) | ((~i102) & 33588298) | ((-33588299) & i102)) * 676));
                int i104 = i98 & i103;
                int i105 = (i103 | i98) & (~i104);
                int i106 = i104 << 1;
                int i107 = (i105 ^ i106) + ((i105 & i106) << 1);
                int i108 = (-1242072399) & i99;
                int i109 = (i99 | (-1242072399)) & (~i108);
                int i110 = ~((i108 & i109) | (i109 ^ i108));
                int i111 = 1208484100 & i110;
                int i112 = (i110 | 1208484100) & (~i111);
                int i113 = (i112 & i111) | (i112 ^ i111);
                int i114 = ~((iIdentityHashCode & (-346425873)) | ((-346425873) ^ iIdentityHashCode));
                int i115 = ((i114 & i113) | (i113 ^ i114)) * 676;
                int i116 = i107 & i115;
                int i117 = (i115 | i107) & (~i116);
                int i118 = -(-(i116 << 1));
                if (i93 <= ((i117 | i118) << 1) - (i117 ^ i118)) {
                    im onFocusChangeListener6 = iqVar6.setOnFocusChangeListener();
                    im.setY(new Object[]{onFocusChangeListener6, Boolean.TRUE}, 36630807, -36630802, System.identityHashCode(onFocusChangeListener6));
                } else {
                    im onFocusChangeListener7 = iqVar6.setOnFocusChangeListener();
                    im.setY(new Object[]{onFocusChangeListener7, Boolean.TRUE}, 36630807, -36630802, System.identityHashCode(onFocusChangeListener7));
                }
                objValueOf = fk.setX;
                break;
            case 16:
                return d(objArr);
            case 17:
                iq iqVar7 = (iq) objArr[0];
                int i119 = f56514j;
                int i120 = (((i119 | 110) << 1) - (i119 ^ 110)) - 1;
                f56513i = i120 % 128;
                int i121 = i120 % 2;
                objValueOf = (fk) iu.setX(new Object[]{iqVar7.setX(), iqVar7.setOnFocusChangeListener(), iqVar7.setCompoundDrawableTintBlendMode(), ValueQualifier.setDividerPadding, setContentCaptureSession.setAlwaysDrawnWithCacheEnabled}, 991028938, -991028938, (int) System.currentTimeMillis());
                int i122 = f56513i;
                int i123 = (((i122 & (-2)) | ((~i122) & 1)) - (~((i122 & 1) << 1))) - 1;
                f56514j = i123 % 128;
                if (i123 % 2 == 0) {
                    throw null;
                }
                break;
            case 18:
                return e(objArr);
            case 19:
                return i(objArr);
            default:
                iq iqVar8 = (iq) objArr[0];
                cs csVar = (cs) objArr[1];
                md mdVar = (md) objArr[2];
                byte bByteValue = ((Byte) objArr[3]).byteValue();
                int i124 = f56514j;
                int i125 = i124 & 99;
                int i126 = (((i124 | 99) & (~i125)) - (~(i125 << 1))) - 1;
                f56513i = i126 % 128;
                if (i126 % 2 != 0) {
                    iqVar8.setOnFocusChangeListener();
                    setFitsSystemWindows.setOnFocusChangeListener.setDividerPadding();
                    throw null;
                }
                im onFocusChangeListener8 = iqVar8.setOnFocusChangeListener();
                setFitsSystemWindows setfitssystemwindows = setFitsSystemWindows.setOnFocusChangeListener;
                if (bByteValue == setfitssystemwindows.setDividerPadding()) {
                    int i127 = f56513i;
                    int i128 = i127 ^ 13;
                    int i129 = ((i127 & 13) | i128) << 1;
                    int i130 = -i128;
                    int i131 = (i129 ^ i130) + ((i130 & i129) << 1);
                    f56514j = i131 % 128;
                    int i132 = i131 % 2;
                    if (mdVar == md.setNavigationOnClickListener) {
                        if (bByteValue != setfitssystemwindows.setDividerPadding()) {
                            int i133 = f56513i;
                            int i134 = i133 ^ 119;
                            int i135 = ((i133 & 119) | i134) << 1;
                            int i136 = -i134;
                            i15 = (i135 ^ i136) + ((i135 & i136) << 1);
                            f56514j = i15 % 128;
                            if (i15 % 2 != 0) {
                                setFitsSystemWindows.setX.setDividerPadding();
                                throw null;
                            }
                            if (bByteValue != setFitsSystemWindows.setX.setDividerPadding()) {
                                int i137 = f56514j;
                                int i138 = i137 & 55;
                                int i139 = (i137 ^ 55) | i138;
                                int i140 = ((i138 | i139) << 1) - (i139 ^ i138);
                                f56513i = i140 % 128;
                                int i141 = i140 % 2;
                                if (bByteValue != setFitsSystemWindows.setDividerPadding.setDividerPadding()) {
                                    int i142 = f56513i + 55;
                                    f56514j = i142 % 128;
                                    int i143 = i142 % 2;
                                    z10 = true;
                                }
                            }
                        }
                        int i144 = f56514j;
                        int i145 = ((i144 | 19) << 1) - (i144 ^ 19);
                        f56513i = i145 % 128;
                        int i146 = i145 % 2;
                        z10 = false;
                    } else {
                        int i147 = f56513i + 55;
                        f56514j = i147 % 128;
                        int i148 = i147 % 2;
                        z10 = true;
                    }
                } else {
                    if (bByteValue != setfitssystemwindows.setDividerPadding()) {
                        int i1310 = f56513i;
                        int i1311 = i1310 ^ 119;
                        int i1312 = ((i1310 & 119) | i1311) << 1;
                        int i1313 = -i1311;
                        i15 = (i1312 ^ i1313) + ((i1312 & i1313) << 1);
                        f56514j = i15 % 128;
                        if (i15 % 2 != 0) {
                            setFitsSystemWindows.setX.setDividerPadding();
                            throw null;
                        }
                        if (bByteValue != setFitsSystemWindows.setX.setDividerPadding()) {
                            int i1314 = f56514j;
                            int i1315 = i1314 & 55;
                            int i1316 = (i1314 ^ 55) | i1315;
                            int i149 = ((i1315 | i1316) << 1) - (i1316 ^ i1315);
                            f56513i = i149 % 128;
                            int i1410 = i149 % 2;
                            if (bByteValue != setFitsSystemWindows.setDividerPadding.setDividerPadding()) {
                                int i1411 = f56513i + 55;
                                f56514j = i1411 % 128;
                                int i1412 = i1411 % 2;
                                z10 = true;
                            }
                        }
                    }
                    int i1413 = f56514j;
                    int i1414 = ((i1413 | 19) << 1) - (i1413 ^ 19);
                    f56513i = i1414 % 128;
                    int i1415 = i1414 % 2;
                    z10 = false;
                }
                im.setY(new Object[]{onFocusChangeListener8, Boolean.valueOf(z10)}, 36630807, -36630802, System.identityHashCode(onFocusChangeListener8));
                im onFocusChangeListener9 = iqVar8.setOnFocusChangeListener();
                if (bByteValue != setFitsSystemWindows.setX.setDividerPadding()) {
                    int i150 = f56514j + 71;
                    f56513i = i150 % 128;
                    int i151 = i150 % 2;
                    cr crVar = (cr) ((setImageTintList) w.setX(new Object[]{csVar}, 1693919772, -1693919769, System.identityHashCode(csVar)));
                    if (!((Boolean) cr.setDividerPadding(new Object[]{crVar}, -1991636604, 1991636608, System.identityHashCode(crVar))).booleanValue()) {
                        int i152 = f56513i;
                        int i153 = (i152 | 111) << 1;
                        int i154 = -(i152 ^ 111);
                        int i155 = (i153 ^ i154) + ((i154 & i153) << 1);
                        f56514j = i155 % 128;
                        int i156 = i155 % 2;
                        z11 = false;
                    } else {
                        int i157 = f56513i;
                        int i158 = (i157 & (-66)) | ((~i157) & 65);
                        int i159 = -(-((i157 & 65) << 1));
                        int i160 = (i158 ^ i159) + ((i159 & i158) << 1);
                        f56514j = i160 % 128;
                        int i161 = i160 % 2;
                        z11 = true;
                    }
                } else {
                    int i1510 = f56513i;
                    int i1511 = (i1510 & (-66)) | ((~i1510) & 65);
                    int i1512 = -(-((i1510 & 65) << 1));
                    int i162 = (i1511 ^ i1512) + ((i1512 & i1511) << 1);
                    f56514j = i162 % 128;
                    int i163 = i162 % 2;
                    z11 = true;
                }
                im.setY(new Object[]{onFocusChangeListener9, Boolean.valueOf(z11)}, -818388399, 818388408, System.identityHashCode(onFocusChangeListener9));
                int i164 = f56514j;
                int i165 = (i164 & (-126)) | ((~i164) & 125);
                int i166 = (i164 & 125) << 1;
                int i167 = (i165 & i166) + (i166 | i165);
                f56513i = i167 % 128;
                if (i167 % 2 == 0) {
                    return null;
                }
                int i168 = 77 / 0;
                return null;
        }
        return objValueOf;
    }

    @Override // com.mypinpad.tsdk.isolation.ec
    @Nullable
    public final Object setDividerPadding(@NotNull Continuation<? super fk> continuation) {
        return setOnFocusChangeListener(new Object[]{this, continuation}, 859538919, -859538900, System.identityHashCode(this));
    }
}
