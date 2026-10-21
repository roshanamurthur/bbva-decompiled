package com.mypinpad.tsdk.isolation;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/mo;", "", "c", "(Lcom/mypinpad/tsdk/i/mo;)V"}, k = 3, mv = {1, 8, 0})
final class r7 extends Lambda implements Function1<mo, Unit> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final long f58067q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f58068r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f58069s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final int f58070t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final byte[] f58071u0 = null;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ setHorizontalScrollBarEnabled f58072p0;

    static {
        b();
        f58070t0 = 1;
        f58068r0 = 0;
        f58069s0 = 1;
        f58067q0 = -223635604283273353L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(setHorizontalScrollBarEnabled sethorizontalscrollbarenabled) {
        super(1);
        this.f58072p0 = sethorizontalscrollbarenabled;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0102 A[Catch: all -> 0x012e, TryCatch #0 {all -> 0x012e, blocks: (B:8:0x003f, B:12:0x0098, B:14:0x00a7, B:24:0x0124, B:17:0x00bc, B:21:0x00fb, B:23:0x0102, B:27:0x0130, B:11:0x0064), top: B:38:0x003f }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0130 A[Catch: all -> 0x012e, TRY_LEAVE, TryCatch #0 {all -> 0x012e, blocks: (B:8:0x003f, B:12:0x0098, B:14:0x00a7, B:24:0x0124, B:17:0x00bc, B:21:0x00fb, B:23:0x0102, B:27:0x0130, B:11:0x0064), top: B:38:0x003f }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0136 -> B:29:0x013d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void a(java.lang.String r21, int r22, java.lang.Object[] r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.r7.a(java.lang.String, int, java.lang.Object[]):void");
    }

    public static void b() {
        f58071u0 = new byte[]{120, 57, -32, 115};
    }

    public final void c(@NotNull mo moVar) throws Throwable {
        int i10 = f58068r0 + 61;
        f58069s0 = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(moVar, "");
        Object[] objArr = new Object[1];
        a("\ue94f\ue09f匲\ue93d擪͖鐌칶枀銺", (-1) - TextUtils.lastIndexOf("", '0', 0, 0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        setHorizontalScrollBarEnabled sethorizontalscrollbarenabled = this.f58072p0;
        setBreakStrategy setbreakstrategy = (setBreakStrategy) sethorizontalscrollbarenabled;
        mo.setY(new Object[]{moVar, strIntern, (byte[]) setBreakStrategy.setY(new Object[]{setbreakstrategy}, -1496220400, 1496220400, System.identityHashCode(setbreakstrategy))}, -948176262, 948176266, System.identityHashCode(moVar));
        Object[] objArr2 = new Object[1];
        a("\u20f9䘤ꗪₗ漏ꗣ拔叕긼", ViewConfiguration.getScrollDefaultDelay() >> 16, objArr2);
        setBreakStrategy setbreakstrategy2 = (setBreakStrategy) sethorizontalscrollbarenabled;
        mo.setY(new Object[]{moVar, ((String) objArr2[0]).intern(), (byte[]) setBreakStrategy.setY(new Object[]{setbreakstrategy2}, -1690322503, 1690322504, System.identityHashCode(setbreakstrategy2))}, -948176262, 948176266, System.identityHashCode(moVar));
        int i12 = f58068r0 + 45;
        f58069s0 = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(mo moVar) throws Throwable {
        int i10 = f58068r0 + 41;
        f58069s0 = i10 % 128;
        int i11 = i10 % 2;
        c(moVar);
        Unit unit = Unit.INSTANCE;
        int i12 = f58069s0 + 81;
        f58068r0 = i12 % 128;
        int i13 = i12 % 2;
        return unit;
    }
}
