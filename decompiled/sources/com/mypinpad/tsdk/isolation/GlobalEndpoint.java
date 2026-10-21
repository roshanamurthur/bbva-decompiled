package com.mypinpad.tsdk.isolation;

import androidx.exifinterface.media.ExifInterface;
import com.mypinpad.tsdk.isolation.setScrollBarDefaultDelayBeforeFade;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b&\u0018\u0000 \n*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\nB9\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u001d\u0012\u0006\u0010\u0018\u001a\u00020!\u0012\u0006\u00108\u001a\u00020%\u0012\u0006\u00109\u001a\u00020*\u0012\u0006\u0010:\u001a\u00020.\u0012\u0006\u0010;\u001a\u000200¢\u0006\u0004\b<\u0010=J\u001b\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\tH\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\f\u001a\u00020\u0006H\u0087@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u0006H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0013H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0011\u0010\u0019J\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0016¢\u0006\u0004\b\f\u0010\u001aJ\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\f\u001a\u00020\u001d8\u0005X\u0085\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\n\u0010 R\u001a\u0010\n\u001a\u00020!8\u0005X\u0085\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u0011\u0010$R\u001a\u0010)\u001a\u00020%8\u0005X\u0085\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\f\u0010(R\u001a\u0010\u0007\u001a\u00020*8\u0005X\u0085\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b\u0007\u0010-R\u0011\u0010\u0011\u001a\u00020.X\u0005¢\u0006\u0006\n\u0004\b\u0014\u0010/R\u001a\u0010\u001b\u001a\u0002008\u0005X\u0085\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b\u0014\u00103R\"\u0010\u0014\u001a\u00028\u00008\u0005@\u0005X\u0085.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b)\u00106\"\u0004\b\u0007\u00107\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/mypinpad/tsdk/i/GlobalEndpoint;", "Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/mypinpad/tsdk/i/ff;", "Lcom/mypinpad/tsdk/i/fg;", "p0", "", "setX", "(Lcom/mypinpad/tsdk/i/fg;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/mypinpad/tsdk/i/fk;", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/fk;)Lcom/mypinpad/tsdk/i/fg;", "setCompoundDrawableTintBlendMode", "", "setOnDragListener", "()Z", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setY", "(Lcom/mypinpad/tsdk/i/fk;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/mypinpad/tsdk/i/eu;", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/eu;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/mypinpad/tsdk/i/me;", "Lcom/mypinpad/tsdk/i/TransactionFailed;", "p1", "(Lcom/mypinpad/tsdk/i/me;Lcom/mypinpad/tsdk/i/TransactionFailed;)V", "(Lcom/mypinpad/tsdk/i/me;)V", "setLayoutAnimation", "()Lcom/mypinpad/tsdk/i/fg;", "Lcom/mypinpad/tsdk/i/setTextKeepState;", "c", "Lcom/mypinpad/tsdk/i/setTextKeepState;", "()Lcom/mypinpad/tsdk/i/setTextKeepState;", "Lcom/mypinpad/tsdk/i/getValue;", "d", "Lcom/mypinpad/tsdk/i/getValue;", "()Lcom/mypinpad/tsdk/i/getValue;", "Lcom/mypinpad/tsdk/i/di;", "e", "Lcom/mypinpad/tsdk/i/di;", "()Lcom/mypinpad/tsdk/i/di;", "setNavigationOnClickListener", "Lcom/mypinpad/tsdk/i/component10;", "f", "Lcom/mypinpad/tsdk/i/component10;", "()Lcom/mypinpad/tsdk/i/component10;", "Lcom/mypinpad/tsdk/i/setTop;", "Lcom/mypinpad/tsdk/i/setTop;", "Lcom/mypinpad/tsdk/i/setFontFeatureSettings;", "g", "Lcom/mypinpad/tsdk/i/setFontFeatureSettings;", "()Lcom/mypinpad/tsdk/i/setFontFeatureSettings;", "h", "Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;", "()Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;", "(Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;)V", "p2", "p3", "p4", "p5", "<init>", "(Lcom/mypinpad/tsdk/i/setTextKeepState;Lcom/mypinpad/tsdk/i/getValue;Lcom/mypinpad/tsdk/i/di;Lcom/mypinpad/tsdk/i/component10;Lcom/mypinpad/tsdk/i/setTop;Lcom/mypinpad/tsdk/i/setFontFeatureSettings;)V"}, k = 1, mv = {1, 5, 1})
public abstract class GlobalEndpoint<T extends setScrollBarDefaultDelayBeforeFade> extends ff {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f51764l = 0;
    public static int m = 1;

    /* JADX INFO: renamed from: setOnFocusChangeListener, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static List<TransactionFailed> setY;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final setTextKeepState setCompoundDrawableTintBlendMode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final getValue setOnFocusChangeListener;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final di setNavigationOnClickListener;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final component10 setX;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final setFontFeatureSettings setLayoutAnimation;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public T setDividerPadding;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f51771i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f51772j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public fg f51773k;

    /* JADX INFO: renamed from: setDividerPadding, reason: from kotlin metadata */
    @NotNull
    protected setTop setY;

    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public GlobalEndpoint f51774p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public eu f51775q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f51776r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ GlobalEndpoint<T> f51777s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f51778t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(GlobalEndpoint<T> globalEndpoint, Continuation<? super a> continuation) {
            super(continuation);
            this.f51777s0 = globalEndpoint;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object[] objArr = {this, obj};
            System.identityHashCode(this);
            a aVar = (a) objArr[0];
            aVar.f51776r0 = objArr[1];
            int i10 = aVar.f51778t0;
            aVar.f51778t0 = (i10 & Integer.MIN_VALUE) | (i10 ^ Integer.MIN_VALUE);
            return aVar.f51777s0.setDividerPadding(null, aVar);
        }
    }

    public /* synthetic */ class setDividerPadding {
        public static final /* synthetic */ int[] setDividerPadding;
        public static final /* synthetic */ int[] setX;

        static {
            int[] iArr = new int[setTextLocales.values().length];
            iArr[setTextLocales.setOnDragListener.ordinal()] = 1;
            iArr[setTextLocales.setOnFocusChangeListener.ordinal()] = 2;
            iArr[setTextLocales.setY.ordinal()] = 3;
            iArr[setTextLocales.getNavBarTitleString.ordinal()] = 4;
            setDividerPadding = iArr;
            int[] iArr2 = new int[Terminal.valuesCustom().length];
            iArr2[Terminal.KERNEL_EFTPOS.ordinal()] = 1;
            iArr2[Terminal.KERNEL_2.ordinal()] = 2;
            iArr2[Terminal.KERNEL_3.ordinal()] = 3;
            iArr2[Terminal.KERNEL_4.ordinal()] = 4;
            iArr2[Terminal.KERNEL_6.ordinal()] = 5;
            iArr2[Terminal.KERNEL_13.ordinal()] = 6;
            iArr2[Terminal.KERNEL_INTERAC.ordinal()] = 7;
            setX = iArr2;
            int i10 = (1 - (-54)) - 1;
            int i11 = i10 % 128;
            int i12 = i10 % 2;
        }
    }

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.GlobalEndpoint$setOnFocusChangeListener, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002X\u0007¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/mypinpad/tsdk/i/GlobalEndpoint$setOnFocusChangeListener;", "", "", "Lcom/mypinpad/tsdk/i/TransactionFailed;", "setY", "Ljava/util/List;", "setDividerPadding", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        setAnimation setanimation = setAnimation.INSTANCE;
        setY = CollectionsKt__CollectionsKt.listOf((Object[]) new TransactionFailed[]{(TransactionFailed) setAnimation.setY(new Object[0], 1746945990, -1746945775, (int) System.currentTimeMillis()), setAnimation.junkify()});
        int i10 = f51764l + 41;
        m = i10 % 128;
        int i11 = i10 % 2;
    }

    public GlobalEndpoint(@NotNull setTextKeepState settextkeepstate, @NotNull getValue getvalue, @NotNull di diVar, @NotNull component10 component10Var, @NotNull setTop settop, @NotNull setFontFeatureSettings setfontfeaturesettings) {
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        Intrinsics.checkNotNullParameter(diVar, "");
        Intrinsics.checkNotNullParameter(component10Var, "");
        Intrinsics.checkNotNullParameter(settop, "");
        Intrinsics.checkNotNullParameter(setfontfeaturesettings, "");
        this.f51771i = System.currentTimeMillis();
        this.setCompoundDrawableTintBlendMode = settextkeepstate;
        this.setOnFocusChangeListener = getvalue;
        this.setNavigationOnClickListener = diVar;
        this.setX = component10Var;
        this.setY = settop;
        this.setLayoutAnimation = setfontfeaturesettings;
    }

    public static /* synthetic */ void a(Object[] objArr) throws Exception {
        GlobalEndpoint globalEndpoint = (GlobalEndpoint) objArr[0];
        me meVar = (me) objArr[1];
        TransactionFailed transactionFailed = (TransactionFailed) objArr[2];
        int i10 = f51764l;
        int i11 = i10 & 29;
        int i12 = (i11 - (~((i10 ^ 29) | i11))) - 1;
        m = i12 % 128;
        if (i12 % 2 == 0) {
            Intrinsics.checkNotNullParameter(meVar, "");
            Intrinsics.checkNotNullParameter(transactionFailed, "");
            meVar.setX();
            throw null;
        }
        Intrinsics.checkNotNullParameter(meVar, "");
        Intrinsics.checkNotNullParameter(transactionFailed, "");
        if (meVar.setX()) {
            setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) setCompoundDrawableTintBlendMode(new Object[]{globalEndpoint}, 1296722380, -1296722364, System.identityHashCode(globalEndpoint));
            getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = getBeepOnFailure.setOnFocusChangeListener;
            String str = (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed));
            int onFocusChangeListener = ((setFindListener) TransactionFailed.setX(new Object[]{transactionFailed}, -570885530, 570885532, System.identityHashCode(transactionFailed))).setOnFocusChangeListener();
            byte[] bArr = new byte[onFocusChangeListener];
            int i13 = f51764l;
            int i14 = (i13 ^ 33) + ((i13 & 33) << 1);
            m = i14 % 128;
            int i15 = i14 % 2;
            int i16 = 0;
            while (i16 < onFocusChangeListener) {
                int i17 = f51764l + 69;
                int i18 = i17 % 128;
                m = i18;
                if (i17 % 2 == 0) {
                    bArr[i16] = 0;
                    i16 >>= 1;
                } else {
                    bArr[i16] = 0;
                    i16 = (i16 ^ 1) + ((i16 & 1) << 1);
                }
                int i19 = i18 + 57;
                f51764l = i19 % 128;
                int i20 = i19 % 2;
            }
            setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{str, bArr, null, Boolean.FALSE, 28}, -976227287, 976227290, 28)}, 2008358388, -2008358355, System.identityHashCode(setscrollbardefaultdelaybeforefade));
            int i21 = m + 57;
            f51764l = i21 % 128;
            int i22 = i21 % 2;
        }
        int i23 = m;
        int i24 = i23 & 45;
        int i25 = i24 + ((i23 ^ 45) | i24);
        f51764l = i25 % 128;
        int i26 = i25 % 2;
    }

    public static /* synthetic */ Object b(Object[] objArr) {
        GlobalEndpoint globalEndpoint = (GlobalEndpoint) objArr[0];
        Continuation continuation = (Continuation) objArr[1];
        int i10 = f51764l + 121;
        m = i10 % 128;
        int i11 = i10 % 2;
        Object y7 = ff.setY(new Object[]{globalEndpoint, fk.setCompoundDrawableTintBlendMode, continuation}, -1420809961, 1420809961, System.identityHashCode(globalEndpoint));
        if (y7 == ek.a.getCOROUTINE_SUSPENDED()) {
            int i12 = m;
            int i13 = i12 | 33;
            int i14 = (i13 << 1) - ((~(i12 & 33)) & i13);
            f51764l = i14 % 128;
            if (i14 % 2 == 0) {
                return y7;
            }
            throw null;
        }
        Unit unit = Unit.INSTANCE;
        int i15 = f51764l;
        int i16 = i15 & 95;
        int i17 = (i15 ^ 95) | i16;
        int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
        m = i18 % 128;
        if (i18 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ fg c(Object[] objArr) {
        GlobalEndpoint globalEndpoint = (GlobalEndpoint) objArr[0];
        int i10 = m;
        int i11 = ((i10 | 31) << 1) - (i10 ^ 31);
        f51764l = i11 % 128;
        int i12 = i11 % 2;
        fg fgVar = globalEndpoint.f51773k;
        if (i12 == 0) {
            return fgVar;
        }
        throw null;
    }

    public static /* synthetic */ setFontFeatureSettings d(Object[] objArr) {
        GlobalEndpoint globalEndpoint = (GlobalEndpoint) objArr[0];
        int i10 = f51764l;
        int i11 = i10 & 29;
        int i12 = -(-(i10 | 29));
        int i13 = (i11 & i12) + (i12 | i11);
        int i14 = i13 % 128;
        m = i14;
        int i15 = i13 % 2;
        setFontFeatureSettings setfontfeaturesettings = globalEndpoint.setLayoutAnimation;
        if (i15 == 0) {
            int i16 = 4 / 0;
        }
        int i17 = i14 & 71;
        int i18 = (i14 | 71) & (~i17);
        int i19 = -(-(i17 << 1));
        int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
        f51764l = i20 % 128;
        if (i20 % 2 == 0) {
            return setfontfeaturesettings;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0061, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0062, code lost:
    
        r9 = kotlin.Unit.INSTANCE;
        r1 = com.mypinpad.tsdk.isolation.GlobalEndpoint.m;
        r3 = (r1 ^ 53) + ((r1 & 53) << 1);
        com.mypinpad.tsdk.isolation.GlobalEndpoint.f51764l = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0071, code lost:
    
        if ((r3 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0073, code lost:
    
        r1 = 13 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0076, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003f, code lost:
    
        if (r9 == ek.a.getCOROUTINE_SUSPENDED()) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0056, code lost:
    
        if (r9 == ek.a.getCOROUTINE_SUSPENDED()) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0058, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.GlobalEndpoint.m + 41;
        com.mypinpad.tsdk.isolation.GlobalEndpoint.f51764l = r0 % 128;
        r0 = r0 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object e(java.lang.Object[] r9) {
        /*
            r0 = 0
            r1 = r9[r0]
            com.mypinpad.tsdk.i.GlobalEndpoint r1 = (com.mypinpad.tsdk.isolation.GlobalEndpoint) r1
            r2 = 1
            r3 = r9[r2]
            com.mypinpad.tsdk.i.fk r3 = (com.mypinpad.tsdk.isolation.fk) r3
            r4 = 2
            r9 = r9[r4]
            kotlin.coroutines.Continuation r9 = (kotlin.coroutines.Continuation) r9
            int r5 = com.mypinpad.tsdk.isolation.GlobalEndpoint.m
            r6 = r5 & 82
            r5 = r5 | 82
            int r6 = r6 + r5
            r5 = -1
            int r5 = r5 << r2
            r6 = r6 ^ (-1)
            int r5 = r5 - r6
            int r6 = r5 % 128
            com.mypinpad.tsdk.isolation.GlobalEndpoint.f51764l = r6
            int r5 = r5 % r4
            r6 = 1420809961(0x54afd6e9, float:6.041799E12)
            r7 = -1420809961(0xffffffffab502917, float:-7.395347E-13)
            r8 = 3
            if (r5 == 0) goto L42
            java.lang.Object[] r5 = new java.lang.Object[r8]
            r5[r0] = r1
            r5[r2] = r3
            r5[r4] = r9
            int r9 = java.lang.System.identityHashCode(r1)
            java.lang.Object r9 = com.mypinpad.tsdk.isolation.ff.setY(r5, r7, r6, r9)
            java.lang.Object r1 = ek.a.getCOROUTINE_SUSPENDED()
            r3 = 7
            int r3 = r3 / r0
            if (r9 != r1) goto L62
            goto L58
        L42:
            java.lang.Object[] r5 = new java.lang.Object[r8]
            r5[r0] = r1
            r5[r2] = r3
            r5[r4] = r9
            int r9 = java.lang.System.identityHashCode(r1)
            java.lang.Object r9 = com.mypinpad.tsdk.isolation.ff.setY(r5, r7, r6, r9)
            java.lang.Object r1 = ek.a.getCOROUTINE_SUSPENDED()
            if (r9 != r1) goto L62
        L58:
            int r0 = com.mypinpad.tsdk.isolation.GlobalEndpoint.m
            int r0 = r0 + 41
            int r1 = r0 % 128
            com.mypinpad.tsdk.isolation.GlobalEndpoint.f51764l = r1
            int r0 = r0 % r4
            return r9
        L62:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            int r1 = com.mypinpad.tsdk.isolation.GlobalEndpoint.m
            r3 = r1 ^ 53
            r1 = r1 & 53
            int r1 = r1 << r2
            int r3 = r3 + r1
            int r1 = r3 % 128
            com.mypinpad.tsdk.isolation.GlobalEndpoint.f51764l = r1
            int r3 = r3 % r4
            if (r3 == 0) goto L76
            r1 = 13
            int r1 = r1 / r0
        L76:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.GlobalEndpoint.e(java.lang.Object[]):java.lang.Object");
    }

    public static /* synthetic */ fg f(Object[] objArr) {
        fk fkVar = (fk) objArr[1];
        int i10 = m;
        int i11 = (i10 | 121) << 1;
        int i12 = -(i10 ^ 121);
        int i13 = (i11 & i12) + (i12 | i11);
        f51764l = i13 % 128;
        int i14 = i13 % 2;
        Intrinsics.checkNotNullParameter(fkVar, "");
        setForegroundTintMode setforegroundtintmode = setForegroundTintMode.INSTANCE;
        setForegroundTintMode.setX(new Object[]{Intrinsics.stringPlus("start kernel signal ", fkVar)}, 1819518050, -1819518048, (int) System.currentTimeMillis());
        fg dividerPadding = fkVar.setDividerPadding();
        if (dividerPadding == null) {
            throw new fh(14, fkVar.toString());
        }
        int i15 = m;
        int i16 = ((i15 & 76) + (i15 | 76)) - 1;
        f51764l = i16 % 128;
        if (i16 % 2 != 0) {
            int i17 = 12 / 0;
        }
        return dividerPadding;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:12:0x0034  */
    /* JADX WARN: Code duplicated, block: B:17:0x00e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x00e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:20:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:22:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:23:0x0116  */
    /* JADX WARN: Code duplicated, block: B:25:0x0157  */
    /* JADX WARN: Code duplicated, block: B:28:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:30:0x01d7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:34:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:36:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:39:0x020f  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x020c, code lost:
    
        if (com.mypinpad.tsdk.isolation.ff.setY(new java.lang.Object[]{r1, r5, r7}, -1420809961, 1420809961, java.lang.System.identityHashCode(r1)) == r6) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0223, code lost:
    
        if (com.mypinpad.tsdk.isolation.ff.setY(new java.lang.Object[]{r1, r5, r7}, -1420809961, 1420809961, java.lang.System.identityHashCode(r1)) == r6) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0225, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.GlobalEndpoint.f51764l;
        r1 = r0 ^ 91;
        r3 = ((r0 & 91) | r1) << 1;
        r1 = -r1;
        r4 = (r3 ^ r1) + ((r1 & r3) << 1);
        com.mypinpad.tsdk.isolation.GlobalEndpoint.m = r4 % 128;
        r4 = r4 % 2;
        r1 = ((r0 ^ 109) - (~(-(-((r0 & 109) << 1))))) - 1;
        com.mypinpad.tsdk.isolation.GlobalEndpoint.m = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0249, code lost:
    
        return r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object g(java.lang.Object[] r16) {
        /*
            Method dump skipped, instruction units count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.GlobalEndpoint.g(java.lang.Object[]):java.lang.Object");
    }

    public static /* synthetic */ Object h(Object[] objArr) throws Exception {
        GlobalEndpoint globalEndpoint = (GlobalEndpoint) objArr[0];
        fg fgVar = (fg) objArr[1];
        Continuation continuation = (Continuation) objArr[2];
        int i10 = f51764l + 59;
        m = i10 % 128;
        if (i10 % 2 != 0) {
            return setCompoundDrawableTintBlendMode(new Object[]{globalEndpoint, fgVar, continuation}, -1335352906, 1335352910, (int) System.currentTimeMillis());
        }
        setCompoundDrawableTintBlendMode(new Object[]{globalEndpoint, fgVar, continuation}, -1335352906, 1335352910, (int) System.currentTimeMillis());
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:106:0x0705  */
    /* JADX WARN: Code duplicated, block: B:109:0x0726  */
    /* JADX WARN: Code duplicated, block: B:111:0x0740  */
    /* JADX WARN: Code duplicated, block: B:114:0x0762  */
    /* JADX WARN: Code duplicated, block: B:116:0x0764  */
    /* JADX WARN: Code duplicated, block: B:117:0x0779  */
    /* JADX WARN: Code duplicated, block: B:119:0x078e  */
    /* JADX WARN: Code duplicated, block: B:120:0x07ab  */
    /* JADX WARN: Code duplicated, block: B:53:0x0362  */
    /* JADX WARN: Code restructure failed: missing block: B:142:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00fb, code lost:
    
        if (r0 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ff, code lost:
    
        if (r0 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0102, code lost:
    
        r0 = (((r1 | 110) << 1) - (r1 ^ 110)) - 1;
        com.mypinpad.tsdk.isolation.GlobalEndpoint.m = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0110, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        r0 = com.mypinpad.tsdk.isolation.GlobalEndpoint.f51764l;
        r1 = ((r0 ^ 100) + ((r0 & 100) << 1)) - 1;
        com.mypinpad.tsdk.isolation.GlobalEndpoint.m = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setCompoundDrawableTintBlendMode(java.lang.Object[] r18, int r19, int r20, int r21) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 2134
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.GlobalEndpoint.setCompoundDrawableTintBlendMode(java.lang.Object[], int, int, int):java.lang.Object");
    }

    @Nullable
    public abstract Object setCompoundDrawableTintBlendMode(@NotNull fg fgVar, @NotNull Continuation<? super fk> continuation);

    @Nullable
    public final Object setDividerPadding(@NotNull eu euVar, @NotNull Continuation<? super Unit> continuation) {
        return setCompoundDrawableTintBlendMode(new Object[]{this, euVar, continuation}, -489857506, 489857518, System.identityHashCode(this));
    }

    @Nullable
    public final fg setLayoutAnimation() {
        return (fg) setCompoundDrawableTintBlendMode(new Object[]{this}, -1108242364, 1108242373, System.identityHashCode(this));
    }

    @JvmName(name = "setNavigationOnClickListener")
    @NotNull
    public final T setNavigationOnClickListener() {
        return (T) setCompoundDrawableTintBlendMode(new Object[]{this}, 1296722380, -1296722364, System.identityHashCode(this));
    }

    public boolean setOnDragListener() {
        System.identityHashCode(this);
        System.identityHashCode(this);
        int i10 = f51764l;
        int i11 = i10 & 31;
        int i12 = (i10 | 31) & (~i11);
        int i13 = -(-(i11 << 1));
        int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
        m = i14 % 128;
        if (i14 % 2 == 0) {
            int i15 = 10 / 0;
        }
        return true;
    }

    @Override // com.mypinpad.tsdk.isolation.ff
    @NotNull
    public final fg setOnFocusChangeListener(@NotNull fk p4) {
        return (fg) setCompoundDrawableTintBlendMode(new Object[]{this, p4}, -1235745413, 1235745420, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ff
    @Nullable
    public final Object setX(@NotNull fg fgVar, @NotNull Continuation<? super Unit> continuation) {
        return setCompoundDrawableTintBlendMode(new Object[]{this, fgVar, continuation}, -866766424, 866766427, System.identityHashCode(this));
    }

    public final void setY(@NotNull me p4, @NotNull TransactionFailed p10) throws Exception {
        setCompoundDrawableTintBlendMode(new Object[]{this, p4, p10}, -1710999359, 1710999360, System.identityHashCode(this));
    }

    @JvmName(name = "setDividerPadding")
    @NotNull
    public final setFontFeatureSettings setDividerPadding() {
        return (setFontFeatureSettings) setCompoundDrawableTintBlendMode(new Object[]{this}, 1497106409, -1497106404, System.identityHashCode(this));
    }

    @JvmName(name = "setOnFocusChangeListener")
    @NotNull
    public final setTextKeepState setOnFocusChangeListener() {
        return (setTextKeepState) setCompoundDrawableTintBlendMode(new Object[]{this}, 1071949121, -1071949107, System.identityHashCode(this));
    }

    @JvmName(name = "setX")
    public final void setX(@NotNull T t10) throws Exception {
        setCompoundDrawableTintBlendMode(new Object[]{this, t10}, -934440272, 934440289, System.identityHashCode(this));
    }

    @Nullable
    public final Object setY(@NotNull fk fkVar, @NotNull Continuation<? super Unit> continuation) {
        return setCompoundDrawableTintBlendMode(new Object[]{this, fkVar, continuation}, -247890144, 247890146, System.identityHashCode(this));
    }

    @JvmName(name = "setX")
    @NotNull
    public final component10 setX() {
        return (component10) setCompoundDrawableTintBlendMode(new Object[]{this}, 671693198, -671693198, System.identityHashCode(this));
    }

    @Nullable
    public final Object setY(@NotNull Continuation<? super Unit> continuation) {
        return setCompoundDrawableTintBlendMode(new Object[]{this, continuation}, -444508826, 444508844, System.identityHashCode(this));
    }

    @JvmName(name = "setY")
    @NotNull
    public final getValue setY() {
        return (getValue) setCompoundDrawableTintBlendMode(new Object[]{this}, -128258542, 128258553, System.identityHashCode(this));
    }

    public final void setCompoundDrawableTintBlendMode(@NotNull me p4) throws Exception {
        setCompoundDrawableTintBlendMode(new Object[]{this, p4}, 713541873, -713541860, System.identityHashCode(this));
    }

    @Nullable
    public final Object setCompoundDrawableTintBlendMode(@NotNull Continuation<? super Unit> continuation) {
        return setCompoundDrawableTintBlendMode(new Object[]{this, continuation}, 2037451168, -2037451160, System.identityHashCode(this));
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    @NotNull
    public final di setCompoundDrawableTintBlendMode() {
        return (di) setCompoundDrawableTintBlendMode(new Object[]{this}, 1670440937, -1670440931, System.identityHashCode(this));
    }
}
