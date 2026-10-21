package com.mypinpad.tsdk.isolation;

import android.os.SystemClock;
import android.view.Gravity;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/mo;", "", "c", "(Lcom/mypinpad/tsdk/i/mo;)V"}, k = 3, mv = {1, 8, 0})
final class w7 extends Lambda implements Function1<mo, Unit> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final long f61608q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f61609r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f61610s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final byte[] f61611t0 = null;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Pair<String, String> f61612p0;

    static {
        b();
        f61609r0 = 0;
        f61610s0 = 1;
        f61608q0 = 2666147060737132574L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(Pair<String, String> pair) {
        super(1);
        this.f61612p0 = pair;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00fb A[Catch: all -> 0x0125, TryCatch #0 {all -> 0x0125, blocks: (B:6:0x003a, B:10:0x008f, B:12:0x009e, B:22:0x011c, B:15:0x00b2, B:19:0x00f3, B:21:0x00fb, B:25:0x0127, B:9:0x005f), top: B:34:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0127 A[Catch: all -> 0x0125, TRY_LEAVE, TryCatch #0 {all -> 0x0125, blocks: (B:6:0x003a, B:10:0x008f, B:12:0x009e, B:22:0x011c, B:15:0x00b2, B:19:0x00f3, B:21:0x00fb, B:25:0x0127, B:9:0x005f), top: B:34:0x003a }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x012e -> B:27:0x0139). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void a(java.lang.String r22, int r23, java.lang.Object[] r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.w7.a(java.lang.String, int, java.lang.Object[]):void");
    }

    public static void b() {
        f61611t0 = new byte[]{113, 126, 19, 62};
    }

    public final void c(@NotNull mo moVar) throws Throwable {
        Intrinsics.checkNotNullParameter(moVar, "");
        Object[] objArr = new Object[1];
        a("멭먃\uf775\u09bb벫鏕쁔銍", (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Pair<String, String> pair = this.f61612p0;
        mo.setY(new Object[]{moVar, strIntern, pair.getFirst()}, -52655784, 52655794, System.identityHashCode(moVar));
        Object[] objArr2 = new Object[1];
        a("滛溭\u0dcc큫楨ᦛᡅ", 1 - Gravity.getAbsoluteGravity(0, 0), objArr2);
        mo.setY(new Object[]{moVar, ((String) objArr2[0]).intern(), pair.getSecond()}, -52655784, 52655794, System.identityHashCode(moVar));
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(mo moVar) throws Throwable {
        c(moVar);
        return Unit.INSTANCE;
    }
}
