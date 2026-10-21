package com.mypinpad.tsdk.isolation;

import android.content.Context;
import com.esotericsoftware.asm.Opcodes;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setImportantForContentCapture implements setScrollCaptureCallback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f59859c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f59860d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f59861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final getTransactionPortrait f59862b;

    public static final class a extends Lambda implements Function1<Integer, Integer> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f59863q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f59864r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static final byte[] f59865s0 = null;

        static {
            b();
            f59863q0 = 0;
            f59864r0 = 1;
        }

        public a() {
            super(1);
        }

        public static void b() {
            f59865s0 = new byte[]{94, -105, -29, 99, 8, -21, MessageUtils.MESSAGE_21_NAK};
        }

        /* JADX WARN: Code duplicated, block: B:14:0x00b8 A[Catch: all -> 0x00fc, TryCatch #0 {all -> 0x00fc, blocks: (B:5:0x0052, B:15:0x00da, B:8:0x006d, B:12:0x00b1, B:14:0x00b8, B:22:0x00fe), top: B:35:0x0052 }] */
        /* JADX WARN: Code duplicated, block: B:22:0x00fe A[Catch: all -> 0x00fc, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00fc, blocks: (B:5:0x0052, B:15:0x00da, B:8:0x006d, B:12:0x00b1, B:14:0x00b8, B:22:0x00fe), top: B:35:0x0052 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0100 -> B:24:0x0107). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public static java.lang.Integer c(java.lang.Object[] r12, int r13, int r14, int r15) {
            /*
                Method dump skipped, instruction units count: 362
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.setImportantForContentCapture.a.c(java.lang.Object[], int, int, int):java.lang.Integer");
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Integer invoke(Integer num) {
            return c(new Object[]{this, num}, 2059922319, -2059922318, System.identityHashCode(this));
        }
    }

    public setImportantForContentCapture(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.f59861a = context;
        this.f59862b = getTransactionPortrait.setTextAlignment;
    }

    public static final /* synthetic */ Context setX(setImportantForContentCapture setimportantforcontentcapture) {
        return (Context) setY(new Object[]{setimportantforcontentcapture}, 1933566136, -1933566135, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * Opcodes.INSTANCEOF) + (i10 * Opcodes.INSTANCEOF);
        int i14 = ~i12;
        int i15 = ~i10;
        int i16 = (((~(i15 | i11)) | i14) * (-192)) + i13;
        int i17 = ~i11;
        int i18 = i15 | i17;
        int i19 = i14 | i17;
        int i20 = (((~(i10 | i11 | i12)) | (~(i19 | i10)) | (~(i18 | i12))) * 192) + (((~i19) | (~i18)) * (-384)) + i16;
        if (i20 == 1) {
            setImportantForContentCapture setimportantforcontentcapture = (setImportantForContentCapture) objArr[0];
            System.currentTimeMillis();
            System.currentTimeMillis();
            Context context = setimportantforcontentcapture.f59861a;
            int i21 = f59860d + 121;
            f59859c = i21 % 128;
            int i22 = i21 % 2;
            return context;
        }
        if (i20 != 2) {
            setImportantForContentCapture setimportantforcontentcapture2 = (setImportantForContentCapture) objArr[0];
            setAutoSizeTextTypeUniformWithPresetSizes setautosizetexttypeuniformwithpresetsizes = (setAutoSizeTextTypeUniformWithPresetSizes) SessionActivationFailure.setX(new Object[]{setimportantforcontentcapture2, setimportantforcontentcapture2.new a()}, -1911780895, 1911780896, (int) System.currentTimeMillis());
            int i23 = f59859c;
            int i24 = i23 & 85;
            int i25 = (i23 | 85) & (~i24);
            int i26 = i24 << 1;
            int i27 = (i25 ^ i26) + ((i25 & i26) << 1);
            f59860d = i27 % 128;
            if (i27 % 2 != 0) {
                return setautosizetexttypeuniformwithpresetsizes;
            }
            int i28 = 71 / 0;
            return setautosizetexttypeuniformwithpresetsizes;
        }
        setImportantForContentCapture setimportantforcontentcapture3 = (setImportantForContentCapture) objArr[0];
        int i29 = f59859c;
        int i30 = i29 & 81;
        int i31 = ((((i29 ^ 81) | i30) << 1) - (~(-((~i30) & (i29 | 81))))) - 1;
        f59860d = i31 % 128;
        int i32 = i31 % 2;
        getTransactionPortrait gettransactionportrait = setimportantforcontentcapture3.f59862b;
        int i33 = i29 & 71;
        int i34 = -(-((i29 ^ 71) | i33));
        int i35 = (i33 & i34) + (i34 | i33);
        f59860d = i35 % 128;
        if (i35 % 2 != 0) {
            return gettransactionportrait;
        }
        throw null;
    }

    @Override // com.mypinpad.tsdk.isolation.setScrollCaptureCallback
    @NotNull
    public final getTransactionPortrait setDividerPadding() {
        return (getTransactionPortrait) setY(new Object[]{this}, 1261235268, -1261235266, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setScrollCaptureCallback
    @NotNull
    public final setAutoSizeTextTypeUniformWithPresetSizes setX() {
        return (setAutoSizeTextTypeUniformWithPresetSizes) setY(new Object[]{this}, -133225356, 133225356, System.identityHashCode(this));
    }
}
