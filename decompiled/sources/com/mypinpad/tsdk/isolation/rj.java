package com.mypinpad.tsdk.isolation;

import com.mypinpad.tsdk.api.TerminalSession;
import com.mypinpad.tsdk.api.callbacks.SessionActivationFailure;
import com.mypinpad.tsdk.api.callbacks.SessionActivationFailureCause;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class rj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f58123a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f58124b = 1;

    public static final class setDividerPadding implements Function2<TerminalSession, rh, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f58125q0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Function2<TerminalSession, SessionActivationFailure, Unit> f58126p0;

        public setDividerPadding() {
            throw null;
        }

        public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
            SessionActivationFailure sessionActivationFailure;
            int i13 = ~i11;
            int i14 = ((i10 | i13) * 983) + (i11 * 984) + (i10 * (-1965));
            int i15 = ~i10;
            int i16 = ~i12;
            if ((((~(i15 | i11)) | (~(i16 | i15))) * 983) + (((~(i13 | i16)) | i15) * (-983)) + i14 != 1) {
                setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
                Object obj = objArr[1];
                Object obj2 = objArr[2];
                int i17 = f58125q0 + 63;
                int i18 = i17 % 128;
                int i19 = i17 % 2;
                setOnFocusChangeListener(new Object[]{setdividerpadding, (TerminalSession) obj, (rh) obj2}, 1163016079, -1163016078, System.identityHashCode(setdividerpadding));
                Unit unit = Unit.INSTANCE;
                int i20 = f58125q0;
                int i21 = i20 ^ 105;
                int i22 = ((((i20 & 105) | i21) << 1) - (~(-i21))) - 1;
                int i23 = i22 % 128;
                int i24 = i22 % 2;
                return unit;
            }
            setDividerPadding setdividerpadding2 = (setDividerPadding) objArr[0];
            TerminalSession terminalSession = (TerminalSession) objArr[1];
            rh rhVar = (rh) objArr[2];
            int i25 = f58125q0;
            int i26 = i25 & 13;
            int i27 = (i25 | 13) & (~i26);
            int i28 = i26 << 1;
            int i29 = ((i27 | i28) << 1) - (i27 ^ i28);
            int i30 = i29 % 128;
            if (i29 % 2 == 0) {
                Function2<TerminalSession, SessionActivationFailure, Unit> function2 = setdividerpadding2.f58126p0;
                throw null;
            }
            Function2<TerminalSession, SessionActivationFailure, Unit> function3 = setdividerpadding2.f58126p0;
            if (rhVar != null) {
                sessionActivationFailure = (SessionActivationFailure) rj.setY(new Object[]{rhVar}, 500227953, -500227952, (int) System.currentTimeMillis());
                int i31 = f58125q0;
                int i32 = i31 | 57;
                int i33 = (i32 << 1) - ((~(i31 & 57)) & i32);
                int i34 = i33 % 128;
                int i35 = i33 % 2;
            } else {
                int i36 = (i30 & (-118)) | ((~i30) & 117);
                int i37 = (i30 & 117) << 1;
                int i38 = ((i36 | i37) << 1) - (i36 ^ i37);
                f58125q0 = i38 % 128;
                int i39 = i38 % 2;
                sessionActivationFailure = null;
            }
            function3.invoke(terminalSession, sessionActivationFailure);
            int i40 = f58125q0;
            int i41 = (i40 & 105) + (i40 | 105);
            int i42 = i41 % 128;
            int i43 = i41 % 2;
            return null;
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Unit] */
        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(TerminalSession terminalSession, rh rhVar) {
            return setOnFocusChangeListener(new Object[]{this, terminalSession, rhVar}, -1377845094, 1377845094, System.identityHashCode(this));
        }
    }

    public /* synthetic */ class setOnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f58127a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f58128b;
        public static final /* synthetic */ int[] setDividerPadding;

        static {
            int[] iArr = new int[rk.values().length];
            try {
                iArr[rk.setDividerPadding.ordinal()] = 1;
                int i10 = (1 & (-12)) | ((~1) & 11);
                int i11 = -(-((1 & 11) << 1));
                int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
                f58127a = i12 % 128;
                int i13 = i12 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[rk.setY.ordinal()] = 2;
                int i14 = f58127a;
                int i15 = i14 & 5;
                int i16 = -(-((i14 ^ 5) | i15));
                int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
                f58128b = i17 % 128;
                int i18 = i17 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[rk.setX.ordinal()] = 3;
                int i19 = f58127a;
                int i20 = (i19 & (-32)) | ((~i19) & 31);
                int i21 = (i19 & 31) << 1;
                int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                f58128b = i22 % 128;
                int i23 = i22 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[rk.setOnFocusChangeListener.ordinal()] = 4;
                int i24 = f58128b;
                int i25 = i24 & 97;
                int i26 = (i25 - (~(-(-((i24 ^ 97) | i25))))) - 1;
                f58127a = i26 % 128;
                int i27 = i26 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[rk.setCompoundDrawableTintBlendMode.ordinal()] = 5;
                int i28 = f58128b;
                int i29 = ((i28 & 55) - (~(-(-(i28 | 55))))) - 1;
                f58127a = i29 % 128;
                int i30 = i29 % 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[rk.setLayoutAnimation.ordinal()] = 6;
                int i31 = f58128b;
                int i32 = i31 & 21;
                int i33 = (i31 ^ 21) | i32;
                int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
                f58127a = i34 % 128;
                int i35 = i34 % 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[rk.setOnDragListener.ordinal()] = 7;
                int i36 = f58128b;
                int i37 = ((i36 & (-84)) | ((~i36) & 83)) + ((i36 & 83) << 1);
                f58127a = i37 % 128;
                int i38 = i37 % 2;
            } catch (NoSuchFieldError unused7) {
            }
            setDividerPadding = iArr;
            int i39 = f58127a + 101;
            f58128b = i39 % 128;
            int i40 = i39 % 2;
        }
    }

    public final class setY implements SessionActivationFailure {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f58129b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f58130c = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ rh f58131a;

        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = ~i11;
            int i15 = ~i12;
            int i16 = (((~(i14 | i15)) | i13) * 68) + ((~(i11 | i13 | i15)) * (-68)) + (((~(i10 | i11)) | (~(i13 | i14 | i15)) | (~(i12 | i11))) * (-68)) + (i11 * (-67)) + (i10 * 69);
            Throwable th2 = null;
            if (i16 != 1) {
                setY sety = (setY) objArr[0];
                int i17 = f58130c;
                int i18 = i17 & 63;
                int i19 = (i17 | 63) & (~i18);
                int i20 = -(-(i18 << 1));
                int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
                f58129b = i21 % 128;
                int i22 = i21 % 2;
                rk onFocusChangeListener = sety.f58131a.setOnFocusChangeListener();
                if (i22 == 0) {
                    return (SessionActivationFailureCause) rj.setY(new Object[]{onFocusChangeListener}, -1672796855, 1672796855, (int) System.currentTimeMillis());
                }
                throw null;
            }
            setY sety2 = (setY) objArr[0];
            int i23 = f58129b;
            int i24 = ((i23 ^ 107) | (i23 & 107)) << 1;
            int i25 = -(((~i23) & 107) | (i23 & (-108)));
            int i26 = (i24 & i25) + (i25 | i24);
            f58130c = i26 % 128;
            int i27 = i26 % 2;
            rh rhVar = sety2.f58131a;
            if (i27 == 0) {
                rhVar.setDividerPadding();
                throw null;
            }
            qw dividerPadding = rhVar.setDividerPadding();
            if (dividerPadding != null) {
                int i28 = f58130c;
                int i29 = ((((i28 ^ 57) | (i28 & 57)) << 1) - (~(-(((~i28) & 57) | (i28 & (-58)))))) - 1;
                f58129b = i29 % 128;
                int i30 = i29 % 2;
                Throwable compoundDrawableTintBlendMode = rx.setCompoundDrawableTintBlendMode(dividerPadding);
                if (i30 != 0) {
                    int i31 = 65 / 0;
                }
                int i32 = f58130c;
                int i33 = ((i32 | 5) << 1) - (i32 ^ 5);
                f58129b = i33 % 128;
                if (i33 % 2 != 0) {
                    throw null;
                }
                th2 = compoundDrawableTintBlendMode;
            } else {
                int i34 = f58130c;
                int i35 = i34 & 63;
                int i36 = i34 | 63;
                int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
                f58129b = i37 % 128;
                if (i37 % 2 != 0) {
                    throw null;
                }
            }
            return th2;
        }

        @Override // com.mypinpad.tsdk.api.callbacks.SessionActivationFailure
        @NotNull
        public final SessionActivationFailureCause getCause() {
            return (SessionActivationFailureCause) setDividerPadding(new Object[]{this}, 896494835, -896494835, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.api.callbacks.SessionActivationFailure
        @Nullable
        public final Throwable getException() {
            return (Throwable) setDividerPadding(new Object[]{this}, -57378735, 57378736, System.identityHashCode(this));
        }
    }

    public static final /* synthetic */ SessionActivationFailure setCompoundDrawableTintBlendMode(rh rhVar) {
        return (SessionActivationFailure) setY(new Object[]{rhVar}, 500227953, -500227952, (int) System.currentTimeMillis());
    }

    public static final /* synthetic */ SessionActivationFailureCause setDividerPadding(rk rkVar) {
        return (SessionActivationFailureCause) setY(new Object[]{rkVar}, -1672796855, 1672796855, (int) System.currentTimeMillis());
    }

    @NotNull
    public static final Function2<TerminalSession, rh, Unit> setOnFocusChangeListener(@NotNull Function2<? super TerminalSession, ? super SessionActivationFailure, Unit> function2) {
        return (Function2) setY(new Object[]{function2}, 2084858729, -2084858725, (int) System.currentTimeMillis());
    }

    public static Object setY(Object[] objArr, int i10, int i11, int i12) {
        Object obj;
        SessionActivationFailureCause sessionActivationFailureCause;
        int i13;
        setDividerPadding setdividerpadding;
        SessionActivationFailureCause sessionActivationFailureCause2;
        int i14 = (i11 * 949) + (i10 * (-947));
        int i15 = ~i10;
        int i16 = ~i11;
        int i17 = ((i10 | i16) * 948) + ((~((~i12) | i15 | i16)) * (-948)) + (((~(i16 | i12)) | i15) * (-948)) + i14;
        if (i17 == 1) {
            rh rhVar = (rh) objArr[0];
            int i18 = f58123a;
            int i19 = (i18 ^ 1) + ((i18 & 1) << 1);
            f58124b = i19 % 128;
            if (i19 % 2 != 0) {
                return (SessionActivationFailure) setY(new Object[]{rhVar}, 1635465366, -1635465364, (int) System.currentTimeMillis());
            }
            throw null;
        }
        if (i17 == 2) {
            rh rhVar2 = (rh) objArr[0];
            setY sety = new setY();
            sety.f58131a = rhVar2;
            int i20 = f58124b + 47;
            f58123a = i20 % 128;
            int i21 = i20 % 2;
            obj = sety;
        } else {
            if (i17 == 3) {
                rk rkVar = (rk) objArr[0];
                int i22 = f58124b;
                int i23 = ((i22 ^ 9) - (~(-(-((i22 & 9) << 1))))) - 1;
                f58123a = i23 % 128;
                if (i23 % 2 != 0) {
                    int i24 = setOnFocusChangeListener.setDividerPadding[rkVar.ordinal()];
                    throw null;
                }
                switch (setOnFocusChangeListener.setDividerPadding[rkVar.ordinal()]) {
                    case 1:
                        sessionActivationFailureCause = SessionActivationFailureCause.NETWORK_CONNECTION_ERROR;
                        int i25 = f58124b;
                        int i26 = ((i25 | 56) << 1) - (i25 ^ 56);
                        i13 = (i26 ^ (-1)) + (i26 << 1);
                        f58123a = i13 % 128;
                        break;
                    case 2:
                        SessionActivationFailureCause sessionActivationFailureCause3 = SessionActivationFailureCause.DEVICE_STATE_FAILURE;
                        int i27 = f58123a;
                        int i28 = (i27 & (-22)) | ((~i27) & 21);
                        int i29 = (i27 & 21) << 1;
                        int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
                        f58124b = i30 % 128;
                        if (i30 % 2 != 0) {
                            return sessionActivationFailureCause3;
                        }
                        int i31 = 31 / 0;
                        return sessionActivationFailureCause3;
                    case 3:
                        SessionActivationFailureCause sessionActivationFailureCause4 = SessionActivationFailureCause.DEVICE_STATE_FAILURE;
                        int i32 = f58124b;
                        int i33 = ((i32 | 102) << 1) - (i32 ^ 102);
                        int i34 = (i33 ^ (-1)) + (i33 << 1);
                        f58123a = i34 % 128;
                        if (i34 % 2 == 0) {
                            return sessionActivationFailureCause4;
                        }
                        throw null;
                    case 4:
                        SessionActivationFailureCause sessionActivationFailureCause5 = SessionActivationFailureCause.NFC_ERROR;
                        int i35 = f58123a;
                        int i36 = (i35 & 45) + (i35 | 45);
                        f58124b = i36 % 128;
                        int i37 = i36 % 2;
                        return sessionActivationFailureCause5;
                    case 5:
                        SessionActivationFailureCause sessionActivationFailureCause6 = SessionActivationFailureCause.CONFIGURATION_VALIDATION_HASH_FAILURE;
                        int i38 = f58124b;
                        int i39 = i38 ^ 31;
                        int i40 = ((31 & i38) | i39) << 1;
                        int i41 = -i39;
                        int i42 = (i40 & i41) + (i40 | i41);
                        f58123a = i42 % 128;
                        int i43 = i42 % 2;
                        return sessionActivationFailureCause6;
                    case 6:
                        SessionActivationFailureCause sessionActivationFailureCause7 = SessionActivationFailureCause.DEACTIVATED;
                        int i44 = f58123a + 81;
                        f58124b = i44 % 128;
                        if (i44 % 2 != 0) {
                            return sessionActivationFailureCause7;
                        }
                        throw null;
                    case 7:
                        sessionActivationFailureCause = SessionActivationFailureCause.INTERNAL_ERROR;
                        i13 = f58123a + 11;
                        f58124b = i13 % 128;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                int i45 = i13 % 2;
                return sessionActivationFailureCause;
            }
            if (i17 != 4) {
                rk rkVar2 = (rk) objArr[0];
                int i46 = f58123a;
                int i47 = i46 & 33;
                int i48 = i47 + ((i46 ^ 33) | i47);
                f58124b = i48 % 128;
                if (i48 % 2 == 0) {
                    sessionActivationFailureCause2 = (SessionActivationFailureCause) setY(new Object[]{rkVar2}, 1696228347, -1696228344, (int) System.currentTimeMillis());
                    int i49 = 86 / 0;
                } else {
                    sessionActivationFailureCause2 = (SessionActivationFailureCause) setY(new Object[]{rkVar2}, 1696228347, -1696228344, (int) System.currentTimeMillis());
                }
                int i50 = f58124b;
                int i51 = i50 & 87;
                int i52 = -(-(i50 | 87));
                int i53 = ((i51 | i52) << 1) - (i52 ^ i51);
                f58123a = i53 % 128;
                int i54 = i53 % 2;
                return sessionActivationFailureCause2;
            }
            Function2<TerminalSession, SessionActivationFailure, Unit> function2 = (Function2) objArr[0];
            Intrinsics.checkNotNullParameter(function2, "");
            setdividerpadding = new setDividerPadding();
            setdividerpadding.f58126p0 = function2;
            int i55 = f58123a + 111;
            f58124b = i55 % 128;
            if (i55 % 2 == 0) {
                obj = setdividerpadding;
                throw null;
            }
        }
        obj = setdividerpadding;
        return obj;
    }
}
