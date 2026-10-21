package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mypinpad.tsdk.api.Terminal;
import com.mypinpad.tsdk.api.callbacks.TerminalCreationFailure;
import com.mypinpad.tsdk.api.callbacks.TerminalCreationFailureCause;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class rm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f58132a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f58133b = 1;

    public static final class setDividerPadding implements Function2<Terminal, rl, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f58134q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f58135r0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Function2<Terminal, TerminalCreationFailure, Unit> f58136p0;

        public setDividerPadding() {
            throw null;
        }

        public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
            Unit unit;
            TerminalCreationFailure terminalCreationFailure;
            int i13 = (i11 * TypedValues.MotionType.TYPE_EASING) + (i10 * 302);
            int i14 = ~i10;
            int i15 = ~i12;
            if (((~(i11 | i15)) * 301) + (((~(i10 | i15 | i11)) | (~(i12 | i14)) | (~((~i11) | i14))) * (-301)) + (((~(i14 | i15)) | i11) * (-602)) + i13 != 1) {
                setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
                Terminal terminal = (Terminal) objArr[1];
                rl rlVar = (rl) objArr[2];
                int i16 = f58134q0;
                int i17 = i16 & 87;
                int i18 = -(-(i16 | 87));
                int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
                int i20 = i19 % 128;
                f58135r0 = i20;
                int i21 = i19 % 2;
                Function2<Terminal, TerminalCreationFailure, Unit> function2 = setdividerpadding.f58136p0;
                unit = null;
                if (rlVar != null) {
                    int i22 = i20 & 71;
                    int i23 = (i20 ^ 71) | i22;
                    int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                    f58134q0 = i24 % 128;
                    if (i24 % 2 != 0) {
                        throw null;
                    }
                    terminalCreationFailure = (TerminalCreationFailure) rm.setOnFocusChangeListener(new Object[]{rlVar}, 1616080535, -1616080534, (int) System.currentTimeMillis());
                } else {
                    int i25 = (i20 & 68) + (i20 | 68);
                    int i26 = (i25 ^ (-1)) + (i25 << 1);
                    f58134q0 = i26 % 128;
                    int i27 = i26 % 2;
                    terminalCreationFailure = null;
                }
                function2.invoke(terminal, terminalCreationFailure);
                int i28 = f58135r0;
                int i29 = (i28 & 73) + (i28 | 73);
                f58134q0 = i29 % 128;
                if (i29 % 2 != 0) {
                    throw null;
                }
            } else {
                setDividerPadding setdividerpadding2 = (setDividerPadding) objArr[0];
                Object obj = objArr[1];
                Object obj2 = objArr[2];
                int i30 = f58135r0;
                int i31 = i30 & 53;
                int i32 = (i30 ^ 53) | i31;
                int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
                f58134q0 = i33 % 128;
                int i34 = i33 % 2;
                setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding2, (Terminal) obj, (rl) obj2}, -833993604, 833993604, System.identityHashCode(setdividerpadding2));
                unit = Unit.INSTANCE;
                int i35 = f58135r0;
                int i36 = (i35 & (-44)) | ((~i35) & 43);
                int i37 = -(-((i35 & 43) << 1));
                int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
                f58134q0 = i38 % 128;
                if (i38 % 2 != 0) {
                    int i39 = 50 / 0;
                }
            }
            return unit;
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Unit] */
        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Terminal terminal, rl rlVar) {
            return setCompoundDrawableTintBlendMode(new Object[]{this, terminal, rlVar}, -1494519721, 1494519722, System.identityHashCode(this));
        }
    }

    public /* synthetic */ class setOnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f58137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f58138b;
        public static final /* synthetic */ int[] setX;

        static {
            int[] iArr = new int[ri.values().length];
            try {
                iArr[ri.setX.ordinal()] = 1;
                int i10 = 117 & (~0);
                int i11 = -(-0);
                int i12 = (i10 & i11) + (i10 | i11);
                f58138b = i12 % 128;
                int i13 = i12 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ri.setY.ordinal()] = 2;
                int i14 = f58138b;
                int i15 = ((i14 ^ 25) | (i14 & 25)) << 1;
                int i16 = -(((~i14) & 25) | (i14 & (-26)));
                int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
                f58137a = i17 % 128;
                int i18 = i17 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ri.setCompoundDrawableTintBlendMode.ordinal()] = 3;
                int i19 = f58137a;
                int i20 = ((i19 | 21) << 1) - (i19 ^ 21);
                f58138b = i20 % 128;
                int i21 = i20 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ri.setDividerPadding.ordinal()] = 4;
                int i22 = f58137a;
                int i23 = (i22 ^ 121) + ((i22 & 121) << 1);
                f58138b = i23 % 128;
                int i24 = i23 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ri.setOnFocusChangeListener.ordinal()] = 5;
                int i25 = f58138b;
                int i26 = (i25 ^ 113) + ((i25 & 113) << 1);
                f58137a = i26 % 128;
                int i27 = i26 % 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ri.setLayoutAnimation.ordinal()] = 6;
                int i28 = f58138b + 77;
                f58137a = i28 % 128;
                int i29 = i28 % 2;
            } catch (NoSuchFieldError unused6) {
            }
            setX = iArr;
            int i30 = f58137a + 113;
            f58138b = i30 % 128;
            if (i30 % 2 == 0) {
                int i31 = 33 / 0;
            }
        }
    }

    public static final class setY implements TerminalCreationFailure {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f58139b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f58140c = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ rl f58141a;

        public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
            TerminalCreationFailureCause terminalCreationFailureCause;
            int i13 = ~i10;
            int i14 = i13 | i11;
            int i15 = (((~i14) | (~(i13 | i12)) | (~(i11 | i12))) * (-754)) + (i11 * (-753)) + (i10 * 755);
            int i16 = ~(i14 | i12);
            int i17 = ~i12;
            if (((i13 | i17) * 754) + (((~(i10 | i17 | i11)) | i16) * (-754)) + i15 != 1) {
                setY sety = (setY) objArr[0];
                int i18 = f58140c;
                int i19 = (-2) - (((i18 ^ 126) + ((i18 & 126) << 1)) ^ (-1));
                f58139b = i19 % 128;
                int i20 = i19 % 2;
                ri onFocusChangeListener = sety.f58141a.setOnFocusChangeListener();
                if (i20 != 0) {
                    terminalCreationFailureCause = (TerminalCreationFailureCause) rm.setOnFocusChangeListener(new Object[]{onFocusChangeListener}, 904102197, -904102197, (int) System.currentTimeMillis());
                    int i21 = 95 / 0;
                } else {
                    terminalCreationFailureCause = (TerminalCreationFailureCause) rm.setOnFocusChangeListener(new Object[]{onFocusChangeListener}, 904102197, -904102197, (int) System.currentTimeMillis());
                }
                int i22 = f58139b;
                int i23 = (i22 & 45) + (i22 | 45);
                f58140c = i23 % 128;
                int i24 = i23 % 2;
                return terminalCreationFailureCause;
            }
            setY sety2 = (setY) objArr[0];
            int i25 = f58140c;
            int i26 = i25 | 83;
            int i27 = i26 << 1;
            int i28 = -((~(i25 & 83)) & i26);
            int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
            f58139b = i29 % 128;
            int i30 = i29 % 2;
            rl rlVar = sety2.f58141a;
            if (i30 != 0) {
                rlVar.setCompoundDrawableTintBlendMode();
                throw null;
            }
            qw compoundDrawableTintBlendMode = rlVar.setCompoundDrawableTintBlendMode();
            if (compoundDrawableTintBlendMode != null) {
                int i31 = f58139b;
                int i32 = (i31 & 47) + (i31 | 47);
                f58140c = i32 % 128;
                if (i32 % 2 != 0) {
                    return rx.setCompoundDrawableTintBlendMode(compoundDrawableTintBlendMode);
                }
                rx.setCompoundDrawableTintBlendMode(compoundDrawableTintBlendMode);
                throw null;
            }
            int i33 = f58139b;
            int i34 = i33 & 69;
            int i35 = -(-(i33 | 69));
            int i36 = (i34 & i35) + (i35 | i34);
            f58140c = i36 % 128;
            if (i36 % 2 != 0) {
                return null;
            }
            throw null;
        }

        @Override // com.mypinpad.tsdk.api.callbacks.TerminalCreationFailure
        @NotNull
        public final TerminalCreationFailureCause getCause() {
            return (TerminalCreationFailureCause) setOnFocusChangeListener(new Object[]{this}, 1018267009, -1018267009, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.api.callbacks.TerminalCreationFailure
        @Nullable
        public final Throwable getException() {
            return (Throwable) setOnFocusChangeListener(new Object[]{this}, -665599049, 665599050, System.identityHashCode(this));
        }
    }

    public static final /* synthetic */ TerminalCreationFailureCause setCompoundDrawableTintBlendMode(ri riVar) {
        return (TerminalCreationFailureCause) setOnFocusChangeListener(new Object[]{riVar}, 904102197, -904102197, (int) System.currentTimeMillis());
    }

    public static Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        Object obj;
        TerminalCreationFailureCause terminalCreationFailureCause;
        int i13;
        setDividerPadding setdividerpadding;
        int i14 = (i11 * (-667)) + (i10 * (-1335));
        int i15 = ~i11;
        int i16 = i10 | i12;
        int i17 = ((i15 | i16) * 668) + ((i10 | (~(i12 | i15))) * 1336) + (((~i16) | i15) * (-668)) + i14;
        if (i17 == 1) {
            rl rlVar = (rl) objArr[0];
            Intrinsics.checkNotNullParameter(rlVar, "");
            setY sety = new setY();
            sety.f58141a = rlVar;
            int i18 = f58133b;
            int i19 = i18 & 91;
            int i20 = ((i18 ^ 91) | i19) << 1;
            int i21 = -((i18 | 91) & (~i19));
            int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
            f58132a = i22 % 128;
            int i23 = i22 % 2;
            obj = sety;
        } else {
            if (i17 == 2) {
                ri riVar = (ri) objArr[0];
                int i24 = f58132a + 55;
                f58133b = i24 % 128;
                int i25 = i24 % 2;
                switch (setOnFocusChangeListener.setX[riVar.ordinal()]) {
                    case 1:
                        terminalCreationFailureCause = TerminalCreationFailureCause.NETWORK_CONNECTION_ERROR;
                        i13 = (-2) - ((f58132a + 52) ^ (-1));
                        break;
                    case 2:
                        TerminalCreationFailureCause terminalCreationFailureCause2 = TerminalCreationFailureCause.DEVICE_STATE_FAILURE;
                        int i26 = f58132a + 47;
                        f58133b = i26 % 128;
                        if (i26 % 2 != 0) {
                            return terminalCreationFailureCause2;
                        }
                        throw null;
                    case 3:
                        terminalCreationFailureCause = TerminalCreationFailureCause.DEVICE_STATE_FAILURE;
                        i13 = f58132a + 77;
                        break;
                    case 4:
                        TerminalCreationFailureCause terminalCreationFailureCause3 = TerminalCreationFailureCause.INTERNAL_ERROR;
                        System.currentTimeMillis();
                        System.currentTimeMillis();
                        return terminalCreationFailureCause3;
                    case 5:
                        TerminalCreationFailureCause terminalCreationFailureCause4 = TerminalCreationFailureCause.UNSUPPORTED_ANDROID_OS_VERSION;
                        int i27 = f58132a;
                        int i28 = (-2) - (((i27 ^ 78) + ((i27 & 78) << 1)) ^ (-1));
                        f58133b = i28 % 128;
                        if (i28 % 2 != 0) {
                            return terminalCreationFailureCause4;
                        }
                        throw null;
                    case 6:
                        TerminalCreationFailureCause terminalCreationFailureCause5 = TerminalCreationFailureCause.TERMINAL_NOT_INITIALISED_YET;
                        int i29 = f58133b;
                        int i30 = i29 & 3;
                        int i31 = i29 | 3;
                        int i32 = (i30 & i31) + (i31 | i30);
                        f58132a = i32 % 128;
                        int i33 = i32 % 2;
                        return terminalCreationFailureCause5;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                f58133b = i13 % 128;
                int i34 = i13 % 2;
                return terminalCreationFailureCause;
            }
            if (i17 != 3) {
                ri riVar2 = (ri) objArr[0];
                int i35 = f58133b;
                int i36 = (i35 ^ 104) + ((i35 & 104) << 1);
                int i37 = (i36 ^ (-1)) + (i36 << 1);
                f58132a = i37 % 128;
                int i38 = i37 % 2;
                TerminalCreationFailureCause terminalCreationFailureCause6 = (TerminalCreationFailureCause) setOnFocusChangeListener(new Object[]{riVar2}, 1529632304, -1529632302, (int) System.currentTimeMillis());
                int i39 = f58132a;
                int i40 = (((i39 & (-64)) | ((~i39) & 63)) - (~(-(-((i39 & 63) << 1))))) - 1;
                f58133b = i40 % 128;
                int i41 = i40 % 2;
                return terminalCreationFailureCause6;
            }
            Function2<Terminal, TerminalCreationFailure, Unit> function2 = (Function2) objArr[0];
            Intrinsics.checkNotNullParameter(function2, "");
            setdividerpadding = new setDividerPadding();
            setdividerpadding.f58136p0 = function2;
            int i42 = f58133b;
            int i43 = (i42 & 117) + (i42 | 117);
            f58132a = i43 % 128;
            if (i43 % 2 != 0) {
                obj = setdividerpadding;
                int i44 = 86 / 0;
                obj = setdividerpadding;
            }
        }
        obj = setdividerpadding;
        return obj;
    }

    @NotNull
    public static final TerminalCreationFailure setOnFocusChangeListener(@NotNull rl rlVar) {
        return (TerminalCreationFailure) setOnFocusChangeListener(new Object[]{rlVar}, 1616080535, -1616080534, (int) System.currentTimeMillis());
    }

    @NotNull
    public static final Function2<Terminal, rl, Unit> setOnFocusChangeListener(@NotNull Function2<? super Terminal, ? super TerminalCreationFailure, Unit> function2) {
        return (Function2) setOnFocusChangeListener(new Object[]{function2}, -517954559, 517954562, (int) System.currentTimeMillis());
    }
}
