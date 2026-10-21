package com.mypinpad.tsdk.isolation;

import android.content.Context;
import android.os.VibrationEffect;
import android.os.Vibrator;
import com.vasco.digipass.sdk.DigipassSDKConstants;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class ny implements nm {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f57366d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f57367e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f57368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f57369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f57370c;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/os/Vibrator;", "b", "()Landroid/os/Vibrator;"}, k = 3, mv = {1, 8, 0})
    public static final class a extends Lambda implements Function0<Vibrator> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static final long f57371q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f57372r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static int f57373s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static final byte[] f57374t0 = null;

        static {
            c();
            f57372r0 = 0;
            f57373s0 = 1;
            f57371q0 = -2538395814494117089L;
        }

        public a() {
            super(0);
        }

        public static void c() {
            f57374t0 = new byte[]{52, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, 70, -90};
        }

        /* JADX WARN: Code duplicated, block: B:21:0x012a A[Catch: all -> 0x0158, TryCatch #0 {all -> 0x0158, blocks: (B:6:0x005f, B:10:0x00bb, B:12:0x00ca, B:22:0x014c, B:15:0x00de, B:19:0x0123, B:21:0x012a, B:25:0x015a, B:9:0x0084), top: B:37:0x005f }] */
        /* JADX WARN: Code duplicated, block: B:25:0x015a A[Catch: all -> 0x0158, TRY_LEAVE, TryCatch #0 {all -> 0x0158, blocks: (B:6:0x005f, B:10:0x00bb, B:12:0x00ca, B:22:0x014c, B:15:0x00de, B:19:0x0123, B:21:0x012a, B:25:0x015a, B:9:0x0084), top: B:37:0x005f }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x015f -> B:27:0x016b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @org.jetbrains.annotations.NotNull
        public final android.os.Vibrator b() throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 418
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.ny.a.b():android.os.Vibrator");
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Vibrator invoke() throws Throwable {
            int i10 = f57372r0 + 121;
            f57373s0 = i10 % 128;
            if (i10 % 2 == 0) {
                b();
                throw null;
            }
            Vibrator vibratorB = b();
            int i11 = f57372r0 + 75;
            f57373s0 = i11 % 128;
            int i12 = i11 % 2;
            return vibratorB;
        }
    }

    public ny(@NotNull Context context, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "");
        this.f57368a = context;
        this.f57369b = z10;
        this.f57370c = LazyKt__LazyJVMKt.lazy(new a());
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        Object obj;
        int i13 = ~i11;
        int i14 = ~(i13 | i12);
        int i15 = ~i12;
        int i16 = (((~((~i10) | i12)) | (~(i11 | i15))) * 406) + ((~(i13 | i15 | i10)) * (-406)) + ((i14 | (~(i15 | i10 | i11))) * (-406)) + (i11 * 407) + (i10 * (-405));
        if (i16 != 1) {
            if (i16 != 2) {
                ny nyVar = (ny) objArr[0];
                int i17 = f57367e + 119;
                int i18 = i17 % 128;
                f57366d = i18;
                int i19 = i17 % 2;
                obj = nyVar.f57368a;
                int i20 = i18 + 99;
                f57367e = i20 % 128;
                if (i20 % 2 == 0) {
                    throw null;
                }
            } else {
                ny nyVar2 = (ny) objArr[0];
                int i21 = f57367e;
                int i22 = (i21 & (-68)) | ((~i21) & 67);
                int i23 = (i21 & 67) << 1;
                int i24 = (i22 & i23) + (i23 | i22);
                f57366d = i24 % 128;
                int i25 = i24 % 2;
                obj = (Vibrator) nyVar2.f57370c.getValue();
                int i26 = f57367e + 57;
                f57366d = i26 % 128;
                if (i26 % 2 != 0) {
                    throw null;
                }
            }
            return obj;
        }
        ny nyVar3 = (ny) objArr[0];
        int i27 = f57366d;
        int i28 = ((i27 | 77) << 1) - (i27 ^ 77);
        int i29 = i28 % 128;
        f57367e = i29;
        int i30 = i28 % 2;
        if (nyVar3.f57369b) {
            int i31 = ((i29 ^ 22) + ((i29 & 22) << 1)) - 1;
            f57366d = i31 % 128;
            if (i31 % 2 != 0) {
                Vibrator vibrator = (Vibrator) setOnFocusChangeListener(new Object[]{nyVar3}, -1628641197, 1628641199, System.identityHashCode(nyVar3));
                long[] jArr = new long[5];
                jArr[1] = 100;
                jArr[1] = 10;
                jArr[5] = 100;
                jArr[2] = 10;
                vibrator.vibrate(VibrationEffect.createWaveform(jArr, -1));
            } else {
                ((Vibrator) setOnFocusChangeListener(new Object[]{nyVar3}, -1628641197, 1628641199, System.identityHashCode(nyVar3))).vibrate(VibrationEffect.createWaveform(new long[]{100, 10, 100, 10}, -1));
            }
            int i32 = f57367e;
            int i33 = (i32 | 47) << 1;
            int i34 = -(i32 ^ 47);
            int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
            f57366d = i35 % 128;
            int i36 = i35 % 2;
        }
        int i37 = f57366d;
        int i38 = i37 & 67;
        int i39 = ((i37 ^ 67) | i38) << 1;
        int i40 = -((i37 | 67) & (~i38));
        int i41 = ((i39 | i40) << 1) - (i40 ^ i39);
        f57367e = i41 % 128;
        if (i41 % 2 != 0) {
            return null;
        }
        int i42 = 28 / 0;
        return null;
    }

    public static final /* synthetic */ Context setY(ny nyVar) {
        return (Context) setOnFocusChangeListener(new Object[]{nyVar}, 1525578969, -1525578969, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.nm
    public final void setY() {
        setOnFocusChangeListener(new Object[]{this}, -1819664060, 1819664061, System.identityHashCode(this));
    }
}
