package com.mypinpad.tsdk.isolation;

import android.content.Context;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class getGeneralBgColor implements setScrollCaptureCallback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f55853c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f55854d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f55855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final getTransactionPortrait f55856b;

    public static final class a extends Lambda implements Function1<Integer, Integer> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f55857q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f55858r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static final byte[] f55859s0 = null;

        static {
            b();
            f55857q0 = 0;
            f55858r0 = 1;
        }

        public a() {
            super(1);
        }

        public static void b() {
            f55859s0 = new byte[]{49, -40, -94, -23, -8, MessageUtils.MESSAGE_21_NAK, -21};
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0107 A[Catch: all -> 0x014b, TryCatch #0 {all -> 0x014b, blocks: (B:9:0x00a7, B:19:0x0129, B:12:0x00c1, B:16:0x0100, B:18:0x0107, B:26:0x014d), top: B:33:0x00a7 }] */
        /* JADX WARN: Code duplicated, block: B:26:0x014d A[Catch: all -> 0x014b, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x014b, blocks: (B:9:0x00a7, B:19:0x0129, B:12:0x00c1, B:16:0x0100, B:18:0x0107, B:26:0x014d), top: B:33:0x00a7 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x014f -> B:28:0x0158). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public static java.lang.Integer c(java.lang.Object[] r17, int r18, int r19, int r20) {
            /*
                Method dump skipped, instruction units count: 362
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.getGeneralBgColor.a.c(java.lang.Object[], int, int, int):java.lang.Integer");
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Integer invoke(Integer num) {
            return c(new Object[]{this, num}, -274577483, 274577483, System.identityHashCode(this));
        }
    }

    public getGeneralBgColor(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.f55855a = context;
        this.f55856b = getTransactionPortrait.setZ;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * (-344)) + (i10 * (-344));
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = i14 | i15;
        int i17 = ((~(i16 | i12)) * 345) + (((~(i10 | i15)) | (~(i14 | (~i12)))) * 345) + (((~i16) | (~(i14 | i12))) * 345) + i13;
        if (i17 == 1) {
            getGeneralBgColor getgeneralbgcolor = (getGeneralBgColor) objArr[0];
            int i18 = f55854d;
            int i19 = i18 ^ 1;
            int i20 = (i18 & 1) << 1;
            int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
            int i22 = i21 % 128;
            f55853c = i22;
            int i23 = i21 % 2;
            getTransactionPortrait gettransactionportrait = getgeneralbgcolor.f55856b;
            int i24 = i22 + 115;
            f55854d = i24 % 128;
            int i25 = i24 % 2;
            return gettransactionportrait;
        }
        if (i17 != 2) {
            getGeneralBgColor getgeneralbgcolor2 = (getGeneralBgColor) objArr[0];
            setAutoSizeTextTypeUniformWithPresetSizes setautosizetexttypeuniformwithpresetsizes = (setAutoSizeTextTypeUniformWithPresetSizes) SessionActivationFailure.setX(new Object[]{getgeneralbgcolor2, getgeneralbgcolor2.new a()}, -1911780895, 1911780896, (int) System.currentTimeMillis());
            int i26 = f55853c;
            int i27 = (((i26 | 14) << 1) - (i26 ^ 14)) - 1;
            f55854d = i27 % 128;
            if (i27 % 2 != 0) {
                return setautosizetexttypeuniformwithpresetsizes;
            }
            int i28 = 91 / 0;
            return setautosizetexttypeuniformwithpresetsizes;
        }
        getGeneralBgColor getgeneralbgcolor3 = (getGeneralBgColor) objArr[0];
        int i29 = f55854d;
        int i30 = ((i29 ^ 92) + ((i29 & 92) << 1)) - 1;
        f55853c = i30 % 128;
        int i31 = i30 % 2;
        Context context = getgeneralbgcolor3.f55855a;
        if (i31 == 0) {
            return context;
        }
        int i32 = 58 / 0;
        return context;
    }

    public static final /* synthetic */ Context setX(getGeneralBgColor getgeneralbgcolor) {
        return (Context) setDividerPadding(new Object[]{getgeneralbgcolor}, 2085192464, -2085192462, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.setScrollCaptureCallback
    @NotNull
    public final setAutoSizeTextTypeUniformWithPresetSizes setX() {
        return (setAutoSizeTextTypeUniformWithPresetSizes) setDividerPadding(new Object[]{this}, 535665671, -535665671, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setScrollCaptureCallback
    @NotNull
    public final getTransactionPortrait setDividerPadding() {
        return (getTransactionPortrait) setDividerPadding(new Object[]{this}, 476248079, -476248078, System.identityHashCode(this));
    }
}
