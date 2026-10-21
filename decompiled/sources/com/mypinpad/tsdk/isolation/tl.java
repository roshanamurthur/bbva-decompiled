package com.mypinpad.tsdk.isolation;

import android.content.Context;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import java.util.Currency;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Stream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class tl implements tn {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f61132h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f61133i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f61134j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f61135k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final byte[] f61136l = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f61137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final sd f61138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final tp f61139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final tt f61140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final setAccessibilityDelegate f61141e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f61142f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final UUID f61143g;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/rs;", "p0", "", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/rs;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a extends Lambda implements Function1<rs, Unit> {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f61144r0 = 0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static int f61145s0 = 1;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<rs, Unit> f61147q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super rs, Unit> function1) {
            super(1);
            this.f61147q0 = function1;
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) throws Throwable {
            Unit unit;
            int i13 = ~i11;
            int i14 = (((~((~i12) | i13)) | (~(i13 | i10))) * (-245)) + (i11 * 246) + (i10 * (-244));
            int i15 = ~(i13 | i12);
            if (((i10 | i15) * 245) + (i15 * (-245)) + i14 != 1) {
                a aVar = (a) objArr[0];
                rs rsVar = (rs) objArr[1];
                int i16 = f61144r0;
                int i17 = i16 & 65;
                int i18 = -(-((i16 ^ 65) | i17));
                int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                f61145s0 = i19 % 128;
                unit = null;
                if (i19 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(rsVar, "");
                    boolean z10 = rsVar instanceof rw;
                    throw null;
                }
                Intrinsics.checkNotNullParameter(rsVar, "");
                if (rsVar instanceof rw) {
                    rw rwVar = (rw) rsVar;
                    pc.setY(new ou(tl.this.setOnFocusChangeListener(), null, 10057, getDisplayExponent.setCompoundDrawableTintBlendMode(getDisplayExponent.setCompoundDrawableTintBlendMode(rwVar.setX()), mw.setDividerPadding(rwVar.setOnFocusChangeListener())), 2, null));
                    int i20 = f61145s0;
                    int i21 = ((((i20 ^ 49) | (i20 & 49)) << 1) - (~(-((49 & (~i20)) | (i20 & (-50)))))) - 1;
                    f61144r0 = i21 % 128;
                    int i22 = i21 % 2;
                }
                aVar.f61147q0.invoke((rs) uz.setCompoundDrawableTintBlendMode(new Object[]{rsVar}, 1881517747, -1881517746, (int) System.currentTimeMillis()));
                try {
                    ss ssVar = ss.setCompoundDrawableTintBlendMode;
                    Boolean bool = mg.setCompoundDrawableTintBlendMode;
                    Intrinsics.checkNotNullExpressionValue(bool, "");
                    ss.setX(new Object[]{null, Boolean.valueOf(bool.booleanValue()), 1}, -299762084, 299762084, 1);
                    int i23 = f61145s0 + 81;
                    f61144r0 = i23 % 128;
                    if (i23 % 2 != 0) {
                        throw null;
                    }
                } catch (Exception unused) {
                }
            } else {
                a aVar2 = (a) objArr[0];
                Object obj = objArr[1];
                int i24 = f61144r0;
                int i25 = (i24 ^ 49) + ((49 & i24) << 1);
                f61145s0 = i25 % 128;
                int i26 = i25 % 2;
                a(new Object[]{aVar2, (rs) obj}, -1290401353, 1290401353, System.identityHashCode(aVar2));
                unit = Unit.INSTANCE;
                int i27 = f61144r0 + 47;
                f61145s0 = i27 % 128;
                if (i27 % 2 == 0) {
                    int i28 = 3 / 0;
                }
            }
            return unit;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(rs rsVar) {
            return a(new Object[]{this, rsVar}, 346679747, -346679746, System.identityHashCode(this));
        }
    }

    static {
        a();
        f61135k = 0;
        f61133i = 0;
        f61134j = 1;
        f61132h = -3071441514641978085L;
    }

    public tl(@NotNull Context context, @NotNull sd sdVar, @NotNull tp tpVar, @NotNull tt ttVar) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(sdVar, "");
        Intrinsics.checkNotNullParameter(tpVar, "");
        Intrinsics.checkNotNullParameter(ttVar, "");
        this.f61137a = context;
        this.f61138b = sdVar;
        this.f61139c = tpVar;
        this.f61140d = ttVar;
        this.f61141e = nf.setOnFocusChangeListener().setCompoundDrawableTintBlendMode();
        this.f61142f = tpVar.setDividerPadding();
        this.f61143g = tpVar.setY();
    }

    public static void a() {
        f61136l = new byte[]{27, 42, Constants.FCI_TEMPLATE, 101};
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [com.mypinpad.tsdk.i.s9] */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * (-500)) + (i10 * (-500));
        int i14 = ~i11;
        int i15 = ~(i14 | i10);
        int i16 = ~i10;
        if (((~(i16 | (~i12) | i11)) * 501) + ((~(i14 | i16)) * 1002) + ((i15 | (~(i16 | i11 | i12))) * 501) + i13 == 1) {
            tl tlVar = (tl) objArr[0];
            int i17 = f61133i + 37;
            int i18 = i17 % 128;
            f61134j = i18;
            if (i17 % 2 == 0) {
                long j10 = tlVar.f61142f;
                throw null;
            }
            long j11 = tlVar.f61142f;
            int i19 = i18 + 41;
            f61133i = i19 % 128;
            int i20 = i19 % 2;
            return Long.valueOf(j11);
        }
        sq sqVar = (sq) objArr[0];
        Map map = (Map) objArr[1];
        Stream stream = Currency.getAvailableCurrencies().stream();
        final u9 u9Var = new u9(sqVar);
        Object obj = stream.filter(new Predicate() { // from class: com.mypinpad.tsdk.i.s9
            @Override // java.util.function.Predicate
            public final boolean test(Object obj2) {
                Function1 function1 = u9Var;
                int i21 = tl.f61133i + 89;
                tl.f61134j = i21 % 128;
                if (i21 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(function1, "");
                    ((Boolean) function1.invoke(obj2)).booleanValue();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(function1, "");
                boolean zBooleanValue = ((Boolean) function1.invoke(obj2)).booleanValue();
                int i22 = tl.f61134j + 23;
                tl.f61133i = i22 % 128;
                if (i22 % 2 == 0) {
                    return zBooleanValue;
                }
                throw null;
            }
        }).findAny().get();
        Intrinsics.checkNotNullExpressionValue(obj, "");
        Currency currency = (Currency) obj;
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        ur urVar = new ur(locale, currency, (sf) map.get(currency));
        String str = (String) ur.setX(new Object[]{urVar, Long.valueOf(sqVar.setCompoundDrawableTintBlendMode())}, -1158643154, 1158643154, System.identityHashCode(urVar));
        int i21 = f61134j + 49;
        f61133i = i21 % 128;
        if (i21 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x014e A[Catch: all -> 0x0180, TryCatch #0 {all -> 0x0180, blocks: (B:8:0x0075, B:12:0x00d1, B:14:0x00e0, B:24:0x0172, B:17:0x00f7, B:21:0x0145, B:23:0x014e, B:27:0x0182, B:11:0x009b), top: B:38:0x0075 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0182 A[Catch: all -> 0x0180, TRY_LEAVE, TryCatch #0 {all -> 0x0180, blocks: (B:8:0x0075, B:12:0x00d1, B:14:0x00e0, B:24:0x0172, B:17:0x00f7, B:21:0x0145, B:23:0x014e, B:27:0x0182, B:11:0x009b), top: B:38:0x0075 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0187 -> B:29:0x0192). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.mypinpad.tsdk.isolation.tn
    public final void getNavBarTitleString() {
        /*
            Method dump skipped, instruction units count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.tl.getNavBarTitleString():void");
    }

    @Override // com.mypinpad.tsdk.isolation.tn
    public final void setCompoundDrawableTintBlendMode() throws Throwable {
        int i10 = f61134j + 3;
        f61133i = i10 % 128;
        int i11 = i10 % 2;
        tp tpVar = this.f61139c;
        if (i11 == 0) {
            tp.setOnFocusChangeListener(new Object[]{tpVar}, 434867013, -434867013, System.identityHashCode(tpVar));
        } else {
            tp.setOnFocusChangeListener(new Object[]{tpVar}, 434867013, -434867013, System.identityHashCode(tpVar));
            throw null;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.tn
    public final boolean setDividerPadding() {
        int i10 = f61133i + 17;
        f61134j = i10 % 128;
        int i11 = i10 % 2;
        sd sdVar = this.f61138b;
        if (i11 == 0) {
            ((Boolean) sd.setDividerPadding(new Object[]{sdVar}, 343712990, -343712988, System.identityHashCode(sdVar))).booleanValue();
            throw null;
        }
        boolean zBooleanValue = ((Boolean) sd.setDividerPadding(new Object[]{sdVar}, 343712990, -343712988, System.identityHashCode(sdVar))).booleanValue();
        int i12 = f61133i + 59;
        f61134j = i12 % 128;
        int i13 = i12 % 2;
        return zBooleanValue;
    }

    @Override // com.mypinpad.tsdk.isolation.tn
    @NotNull
    public final UUID setOnFocusChangeListener() {
        int i10 = f61133i;
        int i11 = i10 + 57;
        f61134j = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 79;
        f61134j = i13 % 128;
        int i14 = i13 % 2;
        UUID uuid = this.f61143g;
        if (i14 == 0) {
            int i15 = 7 / 0;
        }
        return uuid;
    }

    @Override // com.mypinpad.tsdk.isolation.tn
    public final void setY(@NotNull ns nsVar) {
        int i10 = f61134j + 105;
        f61133i = i10 % 128;
        int i11 = i10 % 2;
        tp tpVar = this.f61139c;
        if (i11 == 0) {
            Intrinsics.checkNotNullParameter(nsVar, "");
            tpVar.setOnFocusChangeListener(nsVar);
        } else {
            Intrinsics.checkNotNullParameter(nsVar, "");
            tpVar.setOnFocusChangeListener(nsVar);
            throw null;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.tn
    public final void setDividerPadding(@NotNull Throwable th2) {
        int i10 = f61134j + 45;
        f61133i = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(th2, "");
        this.f61139c.setCompoundDrawableTintBlendMode(th2);
        int i12 = f61134j + 79;
        f61133i = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // com.mypinpad.tsdk.isolation.tn
    public final long setY() {
        return ((Long) setX(new Object[]{this}, 593194023, -593194022, System.identityHashCode(this))).longValue();
    }

    @Override // com.mypinpad.tsdk.isolation.tn
    public final void setX(@NotNull sq sqVar, @NotNull Function1<? super sa, Unit> function1, @NotNull Function1<? super Boolean, Unit> function2, @Nullable re reVar, @NotNull Function1<? super rs, Unit> function3) throws Throwable {
        float f6;
        Context context = this.f61137a;
        Intrinsics.checkNotNullParameter(sqVar, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function3, "");
        mu.setCompoundDrawableTintBlendMode(new Object[]{200003, null, null, 6}, -1968587119, 1968587120, 200003);
        sd sdVar = this.f61138b;
        setIndeterminate y7 = sh.setY((sk) sd.setDividerPadding(new Object[]{sdVar}, 152054942, -152054934, System.identityHashCode(sdVar)));
        try {
            if (nf.setY().setX(context) == setExtractedText.setCompoundDrawableTintBlendMode) {
                int i10 = f61133i + 15;
                f61134j = i10 % 128;
                f6 = i10 % 2 == 0 ? 2.0f : 0.0f;
            } else {
                f6 = 41.0f;
            }
            int i11 = f61134j + 45;
            f61133i = i11 % 128;
            int i12 = i11 % 2;
        } catch (init unused) {
            f6 = 0.0f;
        }
        int i13 = y7 == setIndeterminate.setOnFocusChangeListener ? 3 : 5;
        int iIntValue = ((Integer) sh.setY(new Object[]{Integer.valueOf(i13), context}, -957578882, 957578883, i13)).intValue();
        this.f61140d.setX();
        tp tpVar = this.f61139c;
        Context context2 = this.f61137a;
        setAccessibilityDelegate setaccessibilitydelegate = this.f61141e;
        oh ohVar = new oh(sh.setCompoundDrawableTintBlendMode((sk) sd.setDividerPadding(new Object[]{sdVar}, 152054942, -152054934, System.identityHashCode(sdVar)), (String) setX(new Object[]{sqVar, (Map) sd.setDividerPadding(new Object[]{sdVar}, 1427969386, -1427969383, System.identityHashCode(sdVar))}, -1267726584, 1267726584, (int) System.currentTimeMillis()), sqVar.setDividerPadding(), iIntValue, f6), new setFooterDividersEnabled(y7, sh.setDividerPadding(sdVar.setOnFocusChangeListener(), context, f6, iIntValue)), reVar);
        Unit unit = Unit.INSTANCE;
        tpVar.setOnFocusChangeListener(context2, setaccessibilitydelegate, sqVar, function1, function2, ohVar, new a(function3));
    }

    @Override // com.mypinpad.tsdk.isolation.tn
    public final void setX() {
        int i10 = f61134j + 29;
        f61133i = i10 % 128;
        int i11 = i10 % 2;
        tp tpVar = this.f61139c;
        if (i11 != 0) {
            tpVar.setCompoundDrawableTintBlendMode();
            int i12 = 76 / 0;
        } else {
            tpVar.setCompoundDrawableTintBlendMode();
        }
    }
}
