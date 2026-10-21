package com.mypinpad.tsdk.isolation;

import android.text.TextUtils;
import android.widget.ExpandableListView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/mo;", "", "c", "(Lcom/mypinpad/tsdk/i/mo;)V"}, k = 3, mv = {1, 8, 0})
final class d8 extends Lambda implements Function1<mo, Unit> {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final long f55120r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f55121s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f55122t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final byte[] f55123u0 = null;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ byte[][] f55124p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ byte[] f55125q0;

    static {
        b();
        f55121s0 = 0;
        f55122t0 = 1;
        f55120r0 = -8565921480629486518L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8(byte[][] bArr, byte[] bArr2) {
        super(1);
        this.f55124p0 = bArr;
        this.f55125q0 = bArr2;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0120 A[Catch: all -> 0x014a, TryCatch #0 {all -> 0x014a, blocks: (B:8:0x004e, B:12:0x00b2, B:14:0x00c1, B:24:0x0141, B:17:0x00d5, B:21:0x0119, B:23:0x0120, B:27:0x014c, B:11:0x0075), top: B:38:0x004e }] */
    /* JADX WARN: Code duplicated, block: B:27:0x014c A[Catch: all -> 0x014a, TRY_LEAVE, TryCatch #0 {all -> 0x014a, blocks: (B:8:0x004e, B:12:0x00b2, B:14:0x00c1, B:24:0x0141, B:17:0x00d5, B:21:0x0119, B:23:0x0120, B:27:0x014c, B:11:0x0075), top: B:38:0x004e }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0151 -> B:29:0x015a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void a(java.lang.String r23, int r24, java.lang.Object[] r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.d8.a(java.lang.String, int, java.lang.Object[]):void");
    }

    public static void b() {
        f55123u0 = new byte[]{107, -84, 8, 70};
    }

    public final void c(@NotNull mo moVar) throws Throwable {
        Intrinsics.checkNotNullParameter(moVar, "");
        Object[] objArr = new Object[1];
        a("餘饻괃緾\ufb18婓၅憓\udb22", 1 - TextUtils.getCapsMode("", 0, 0), objArr);
        mo.setY(new Object[]{moVar, ((String) objArr[0]).intern(), this.f55124p0}, -1089892218, 1089892227, System.identityHashCode(moVar));
        Object[] objArr2 = new Object[1];
        a("⩚⨹鎈䍵鵟㰔ۻ眨桢脄繏썜꺗웢룤脻\uecceъ\uf510俴⍤䨌㝑\u0c52憌返", ExpandableListView.getPackedPositionType(0L) + 1, objArr2);
        mo.setY(new Object[]{moVar, ((String) objArr2[0]).intern(), this.f55125q0}, -948176262, 948176266, System.identityHashCode(moVar));
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(mo moVar) throws Throwable {
        c(moVar);
        return Unit.INSTANCE;
    }
}
