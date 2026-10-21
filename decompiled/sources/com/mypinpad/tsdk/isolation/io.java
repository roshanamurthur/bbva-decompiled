package com.mypinpad.tsdk.isolation;

import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0007"}, d2 = {"Lcom/mypinpad/tsdk/i/io;", "Lcom/mypinpad/tsdk/i/ig;", "", "p0", "", "setX", "(J)V", "()V", "Lcom/mypinpad/tsdk/i/setTextKeepState;", "<init>", "(Lcom/mypinpad/tsdk/i/setTextKeepState;)V", "setDividerPadding"}, k = 1, mv = {1, 5, 1})
public class io extends ig {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f56504g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f56505h = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final setTextKeepState f56506e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Timer f56507f;

    public static final class setOnFocusChangeListener extends TimerTask {
        public setOnFocusChangeListener() {
        }

        public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
            setTextKeepState y7 = io.setY(io.this);
            setTextKeepState.setCompoundDrawableTintBlendMode(new Object[]{y7, new a(setTextLocales.setX, null, null, null, null, 30, null)}, 565642854, -565642852, System.identityHashCode(y7));
            return null;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            setOnFocusChangeListener(new Object[]{this}, 2058509933, -2058509933, System.identityHashCode(this));
        }
    }

    static {
        int i10 = f56504g;
        int i11 = i10 | 67;
        int i12 = (i11 << 1) - ((~(i10 & 67)) & i11);
        f56505h = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    public io(@NotNull setTextKeepState settextkeepstate) {
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        this.f56506e = settextkeepstate;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0071 A[PHI: r9
      0x0071: PHI (r9v25 java.util.Timer) = (r9v24 java.util.Timer), (r9v29 java.util.Timer) binds: [B:17:0x006f, B:14:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x007e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0086  */
    /* JADX WARN: Code duplicated, block: B:35:0x012e  */
    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        Timer timer;
        int i13;
        int i14 = (i11 * 971) + (i10 * (-1939));
        int i15 = ~i11;
        int i16 = ~(i15 | i10);
        int i17 = ~((~i12) | i11);
        int i18 = ~i10;
        int i19 = (((~(i18 | i15)) | i17) * 970) + ((~(i11 | i18)) * 1940) + ((i16 | i17) * (-970)) + i14;
        if (i19 == 1) {
            io ioVar = (io) objArr[0];
            long jLongValue = ((Number) objArr[1]).longValue();
            int i20 = f56504g;
            int i21 = ((i20 ^ 39) | (i20 & 39)) << 1;
            int i22 = -(((~i20) & 39) | (i20 & (-40)));
            int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
            f56505h = i23 % 128;
            if (i23 % 2 == 0) {
                setOnFocusChangeListener(new Object[]{ioVar}, -971551267, 971551270, System.identityHashCode(ioVar));
                super.setOnFocusChangeListener();
                if (jLongValue > 1) {
                    Timer timer2 = new Timer("TIMEOUT TIMER", false);
                    ioVar.f56507f = timer2;
                    timer2.schedule(ioVar.new setOnFocusChangeListener(), jLongValue);
                    int i24 = f56504g;
                    int i25 = i24 & 39;
                    int i26 = (i24 | 39) & (~i25);
                    int i27 = i25 << 1;
                    int i28 = (i26 ^ i27) + ((i26 & i27) << 1);
                    f56505h = i28 % 128;
                    int i29 = i28 % 2;
                }
            } else {
                setOnFocusChangeListener(new Object[]{ioVar}, -971551267, 971551270, System.identityHashCode(ioVar));
                super.setOnFocusChangeListener();
                if (jLongValue > 0) {
                    Timer timer3 = new Timer("TIMEOUT TIMER", false);
                    ioVar.f56507f = timer3;
                    timer3.schedule(ioVar.new setOnFocusChangeListener(), jLongValue);
                    int i210 = f56504g;
                    int i211 = i210 & 39;
                    int i212 = (i210 | 39) & (~i211);
                    int i213 = i211 << 1;
                    int i214 = (i212 ^ i213) + ((i212 & i213) << 1);
                    f56505h = i214 % 128;
                    int i215 = i214 % 2;
                }
            }
            int i30 = f56504g;
            int i31 = i30 | 1;
            int i32 = (i31 << 1) - ((~(i30 & 1)) & i31);
            f56505h = i32 % 128;
            int i33 = i32 % 2;
            return null;
        }
        if (i19 == 2) {
            io ioVar2 = (io) objArr[0];
            int i34 = f56504g;
            int i35 = i34 & 29;
            int i36 = ((i34 | 29) & (~i35)) + (i35 << 1);
            f56505h = i36 % 128;
            int i37 = i36 % 2;
            super.setX();
            setOnFocusChangeListener(new Object[]{ioVar2}, -971551267, 971551270, System.identityHashCode(ioVar2));
            int i38 = f56505h;
            int i39 = ((i38 ^ 67) | (i38 & 67)) << 1;
            int i40 = -(((~i38) & 67) | (i38 & (-68)));
            int i41 = (i39 & i40) + (i40 | i39);
            f56504g = i41 % 128;
            if (i41 % 2 == 0) {
                return null;
            }
            int i42 = 33 / 0;
            return null;
        }
        if (i19 != 3) {
            io ioVar3 = (io) objArr[0];
            int i43 = f56505h;
            int i44 = i43 & 69;
            int i45 = -(-(i43 | 69));
            int i46 = ((i44 | i45) << 1) - (i45 ^ i44);
            int i47 = i46 % 128;
            f56504g = i47;
            int i48 = i46 % 2;
            setTextKeepState settextkeepstate = ioVar3.f56506e;
            int i49 = (i47 ^ 79) + ((i47 & 79) << 1);
            f56505h = i49 % 128;
            if (i49 % 2 != 0) {
                return settextkeepstate;
            }
            throw null;
        }
        io ioVar4 = (io) objArr[0];
        int i50 = f56504g + 29;
        int i51 = i50 % 128;
        f56505h = i51;
        if (i50 % 2 == 0) {
            timer = ioVar4.f56507f;
            int i52 = 48 / 0;
            if (timer != null) {
                i13 = (i51 ^ 51) + ((i51 & 51) << 1);
                f56504g = i13 % 128;
                if (i13 % 2 != 0) {
                    timer.cancel();
                    ioVar4.f56507f = null;
                    int i53 = 7 / 0;
                } else {
                    timer.cancel();
                    ioVar4.f56507f = null;
                }
            }
        } else {
            timer = ioVar4.f56507f;
            if (timer != null) {
                i13 = (i51 ^ 51) + ((i51 & 51) << 1);
                f56504g = i13 % 128;
                if (i13 % 2 != 0) {
                    timer.cancel();
                    ioVar4.f56507f = null;
                    int i54 = 7 / 0;
                } else {
                    timer.cancel();
                    ioVar4.f56507f = null;
                }
            }
        }
        int i55 = f56504g;
        int i56 = (i55 & 69) + (i55 | 69);
        f56505h = i56 % 128;
        if (i56 % 2 != 0) {
            return null;
        }
        int i57 = 58 / 0;
        return null;
    }

    public static final /* synthetic */ setTextKeepState setY(io ioVar) {
        return (setTextKeepState) setOnFocusChangeListener(new Object[]{ioVar}, -378788455, 378788455, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.ig
    public final void setX() {
        setOnFocusChangeListener(new Object[]{this}, 907662633, -907662631, System.identityHashCode(this));
    }

    public final void setX(long p4) {
        setOnFocusChangeListener(new Object[]{this, Long.valueOf(p4)}, 308640336, -308640335, System.identityHashCode(this));
    }
}
