package com.mypinpad.tsdk.isolation;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u0015B\u0007¢\u0006\u0004\b'\u0010(J?\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0011\u0010\u0016J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u001aJ'\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u0015\u0010\u001cJ\u001f\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0015\u0010\u001aJ'\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u001dH\u0017¢\u0006\u0004\b\u0018\u0010\u001eJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u001dH\u0017¢\u0006\u0004\b\u0011\u0010\u001eJ?\u0010%\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020\u001f2\b\u0010\u0007\u001a\u0004\u0018\u00010 2\b\u0010\t\u001a\u0004\u0018\u00010!2\b\u0010\u000b\u001a\u0004\u0018\u00010\"2\b\u0010\r\u001a\u0004\u0018\u00010#H\u0015¢\u0006\u0004\b%\u0010&"}, d2 = {"Lcom/mypinpad/tsdk/i/kc;", "Lcom/mypinpad/tsdk/i/ez;", "Lcom/mypinpad/tsdk/i/fb;", "Lcom/mypinpad/tsdk/i/iv;", "Lcom/mypinpad/tsdk/i/ew;", "p0", "Lcom/mypinpad/tsdk/i/setTextKeepState;", "p1", "Lcom/mypinpad/tsdk/i/activateSession;", "p2", "Lcom/mypinpad/tsdk/i/fd;", "p3", "", "p4", "Lcom/mypinpad/tsdk/i/setTransitionVisibility;", "p5", "Lcom/mypinpad/tsdk/i/fk;", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/iv;Lcom/mypinpad/tsdk/i/setTextKeepState;Lcom/mypinpad/tsdk/i/activateSession;Lcom/mypinpad/tsdk/i/fd;Lcom/mypinpad/tsdk/i/setTransitionVisibility;)Lcom/mypinpad/tsdk/i/fk;", "Lcom/mypinpad/tsdk/i/ValueQualifier;", "Lcom/mypinpad/tsdk/i/setContentCaptureSession;", "setY", "(Lcom/mypinpad/tsdk/i/iv;Lcom/mypinpad/tsdk/i/setTextKeepState;Lcom/mypinpad/tsdk/i/ValueQualifier;Lcom/mypinpad/tsdk/i/setContentCaptureSession;)Lcom/mypinpad/tsdk/i/fk;", "", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/iv;Lcom/mypinpad/tsdk/i/setTextKeepState;)V", "(Lcom/mypinpad/tsdk/i/iv;Lcom/mypinpad/tsdk/i/setTextKeepState;)Lcom/mypinpad/tsdk/i/fk;", "Lcom/mypinpad/tsdk/i/setRotationX;", "(Lcom/mypinpad/tsdk/i/iv;Lcom/mypinpad/tsdk/i/setTextKeepState;Lcom/mypinpad/tsdk/i/setRotationX;)Lcom/mypinpad/tsdk/i/fk;", "", "(Lcom/mypinpad/tsdk/i/iv;Lcom/mypinpad/tsdk/i/setTextKeepState;[B)Lcom/mypinpad/tsdk/i/fk;", "Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;", "Lcom/mypinpad/tsdk/i/j;", "Lcom/mypinpad/tsdk/i/f;", "Lcom/mypinpad/tsdk/i/l;", "Lcom/mypinpad/tsdk/i/getBeepOnFailure;", "", "setCompoundDrawableTintBlendMode", "(Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;Lcom/mypinpad/tsdk/i/j;Lcom/mypinpad/tsdk/i/f;Lcom/mypinpad/tsdk/i/l;Lcom/mypinpad/tsdk/i/getBeepOnFailure;)Ljava/lang/String;", "<init>", "()V"}, k = 1, mv = {1, 5, 1})
public final class kc extends ez implements ew<iv>, fb<iv> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final List<TransactionFailed> f56771k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f56772l = 0;
    public static int m = 1;

    /* JADX INFO: renamed from: setY, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/TransactionFailed;", "p0", "", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/TransactionFailed;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends Lambda implements Function1<TransactionFailed, CharSequence> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f56773q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f56774r0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ setScrollBarDefaultDelayBeforeFade f56775p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade) {
            super(1);
            this.f56775p0 = setscrollbardefaultdelaybeforefade;
        }

        public static /* synthetic */ CharSequence a(Object[] objArr, int i10, int i11, int i12) {
            String string;
            CharSequence charSequenceStringPlus;
            int i13 = i10 | i11;
            int i14 = (i13 * (-502)) + (i11 * 503) + (i10 * 503);
            int i15 = ~i10;
            int i16 = ~((~i11) | i15);
            int i17 = i15 | (~i12);
            int i18 = i16 | (~i17);
            int i19 = ~(i12 | i13);
            if ((((~(i17 | i11)) | i19) * 502) + ((i18 | i19) * (-502)) + i14 != 1) {
                a aVar = (a) objArr[0];
                Object obj = objArr[1];
                int i20 = f56773q0;
                int i21 = i20 & 73;
                int i22 = -(-((i20 ^ 73) | i21));
                int i23 = (i21 & i22) + (i22 | i21);
                f56774r0 = i23 % 128;
                int i24 = i23 % 2;
                charSequenceStringPlus = a(new Object[]{aVar, (TransactionFailed) obj}, -1438921623, 1438921624, System.identityHashCode(aVar));
                int i25 = f56773q0 + 69;
                f56774r0 = i25 % 128;
                int i26 = i25 % 2;
            } else {
                a aVar2 = (a) objArr[0];
                TransactionFailed transactionFailed = (TransactionFailed) objArr[1];
                int i27 = f56773q0;
                int i28 = (-2) - ((((i27 | 26) << 1) - (i27 ^ 26)) ^ (-1));
                f56774r0 = i28 % 128;
                int i29 = i28 % 2;
                Intrinsics.checkNotNullParameter(transactionFailed, "");
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = aVar2.f56775p0;
                getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, transactionFailed}, -1593889019, 1593889062, System.identityHashCode(setscrollbardefaultdelaybeforefade));
                if (getbeeponfailure == null) {
                    int i30 = f56774r0;
                    int i31 = ((i30 & 54) + (i30 | 54)) - 1;
                    f56773q0 = i31 % 128;
                    string = null;
                    if (i31 % 2 != 0) {
                        throw null;
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    setScrollContainer setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                    sb2.append((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer)));
                    sb2.append(" [");
                    setImageTintList setimagetintlist = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 1115257939, -1115257923, System.identityHashCode(getbeeponfailure));
                    setFocusable setfocusable = (setFocusable) setImageTintList.setX(new Object[]{setimagetintlist}, 290021075, -290021067, System.identityHashCode(setimagetintlist));
                    sb2.append(((Integer) setFocusable.setOnFocusChangeListener(new Object[]{setfocusable}, -1668155176, 1668155184, System.identityHashCode(setfocusable))).intValue());
                    sb2.append("] - ");
                    sb2.append((String) setInputExtras.setDividerPadding(new Object[]{(byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure))}, 1609250238, -1609250236, (int) System.currentTimeMillis()));
                    string = sb2.toString();
                    int i32 = f56774r0;
                    int i33 = (i32 & 103) + (i32 | 103);
                    f56773q0 = i33 % 128;
                    int i34 = i33 % 2;
                }
                if (string == null) {
                    int i35 = f56774r0;
                    int i36 = ((i35 | 121) << 1) - (i35 ^ 121);
                    f56773q0 = i36 % 128;
                    if (i36 % 2 != 0) {
                        charSequenceStringPlus = Intrinsics.stringPlus((String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed)), " - not present");
                        int i37 = 79 / 0;
                    } else {
                        charSequenceStringPlus = Intrinsics.stringPlus((String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed)), " - not present");
                    }
                    int i38 = f56774r0 + 69;
                    f56773q0 = i38 % 128;
                    if (i38 % 2 != 0) {
                        int i39 = 17 / 0;
                    }
                } else {
                    int i40 = f56774r0;
                    int i41 = ((i40 ^ 79) | (i40 & 79)) << 1;
                    int i42 = -(((~i40) & 79) | (i40 & (-80)));
                    int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
                    f56773q0 = i43 % 128;
                    if (i43 % 2 != 0) {
                        int i44 = 10 / 0;
                    }
                    charSequenceStringPlus = string;
                }
            }
            return charSequenceStringPlus;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CharSequence invoke(TransactionFailed transactionFailed) {
            return a(new Object[]{this, transactionFailed}, -1574588964, 1574588964, System.identityHashCode(this));
        }
    }

    static {
        setAnimation setanimation = setAnimation.INSTANCE;
        f56771k = CollectionsKt__CollectionsKt.listOf((Object[]) new TransactionFailed[]{(TransactionFailed) setAnimation.setY(new Object[0], 1723373489, -1723373305, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 1963048329, -1963048320, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 2002669863, -2002669628, (int) System.currentTimeMillis()), setAnimation.setSmoothScrollbarEnabled(), (TransactionFailed) setAnimation.setY(new Object[0], 564262388, -564262139, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 2141741374, -2141741339, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 34771733, -34771475, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 85310968, -85310894, (int) System.currentTimeMillis()), setAnimation.TransactionErrorCause(), (TransactionFailed) setAnimation.setY(new Object[0], 1260159524, -1260159512, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], -145700013, 145700244, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 1817971805, -1817971762, (int) System.currentTimeMillis()), setAnimation.getSuppressed(), setAnimation.TerminalSessionDefaultImpls(), setAnimation.setPersistentDrawingCache(), (TransactionFailed) setAnimation.setY(new Object[0], -817759528, 817759728, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 1217059921, -1217059727, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], -1456953734, 1456953950, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], -154084724, 154084974, (int) System.currentTimeMillis()), setAnimation.setHint(), (TransactionFailed) setAnimation.setY(new Object[0], 2061768348, -2061768213, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 249426741, -249426566, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], -705722506, 705722524, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 2083840602, -2083840519, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 2023104344, -2023104064, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 840618122, -840618073, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 567755471, -567755289, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 1191388665, -1191388473, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], -956296156, 956296218, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 812392256, -812392155, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], -1457907498, 1457907557, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 634564037, -634564032, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], -1716948967, 1716948995, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 1420987301, -1420987149, (int) System.currentTimeMillis()), setAnimation.setOnCapturedPointerListener(), setAnimation.setTranscriptMode(), (TransactionFailed) setAnimation.setY(new Object[0], -1656838877, 1656838993, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 1272420639, -1272420489, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 1440069230, -1440069166, (int) System.currentTimeMillis()), setAnimation.setAccessibilityTraversalAfter(), (TransactionFailed) setAnimation.setY(new Object[0], 1526736749, -1526736594, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], -835982431, 835982546, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 300582665, -300582602, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], -249361593, 249361770, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], -2052046062, 2052046231, (int) System.currentTimeMillis()), setAnimation.setCompoundDrawablePadding(), (TransactionFailed) setAnimation.setY(new Object[0], -598265962, 598266002, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], -1550249147, 1550249160, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], -49734503, 49734731, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 1877415399, -1877415355, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 843474092, -843473889, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], -702011654, 702011654, (int) System.currentTimeMillis()), setAnimation.setTextClassifier(), (TransactionFailed) setAnimation.setY(new Object[0], -1956154611, 1956154852, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 1939842367, -1939842115, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], -309520583, 309520724, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 2127052714, -2127052617, (int) System.currentTimeMillis())});
        int i10 = m;
        int i11 = ((i10 | 106) << 1) - (i10 ^ 106);
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        f56772l = i12 % 128;
        int i13 = i12 % 2;
    }

    public static /* synthetic */ void a(Object[] objArr) throws Exception {
        iv ivVar = (iv) objArr[1];
        setTextKeepState settextkeepstate = (setTextKeepState) objArr[2];
        int i10 = m;
        int i11 = i10 & 55;
        int i12 = i11 + ((i10 ^ 55) | i11);
        f56772l = i12 % 128;
        int i13 = i12 % 2;
        Intrinsics.checkNotNullParameter(ivVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        ez.setX(ivVar, settextkeepstate, activateSession.CLEAR_DISPLAY, ValueQualifier.setCompoundDrawableTintBlendMode, (byte[]) Companion.setDividerPadding(new Object[0], 1162043999, -1162043995, (int) System.currentTimeMillis()), null);
        int i14 = m;
        int i15 = i14 & 73;
        int i16 = i15 + ((i14 ^ 73) | i15);
        f56772l = i16 % 128;
        if (i16 % 2 != 0) {
            int i17 = 99 / 0;
        }
    }

    public static /* synthetic */ fk b(Object[] objArr) {
        kc kcVar = (kc) objArr[0];
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[1];
        setTextKeepState settextkeepstate = (setTextKeepState) objArr[2];
        System.identityHashCode(kcVar);
        System.identityHashCode(kcVar);
        fk fkVar = (fk) setDividerPadding(new Object[]{kcVar, (iv) setscrollbardefaultdelaybeforefade, settextkeepstate}, 37118063, -37118043, System.identityHashCode(kcVar));
        int i10 = f56772l;
        int i11 = i10 ^ 7;
        int i12 = (((i10 & 7) | i11) << 1) - i11;
        m = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 7 / 0;
        }
        return fkVar;
    }

    public static /* synthetic */ fk c(Object[] objArr) throws Exception {
        kc kcVar = (kc) objArr[0];
        iv ivVar = (iv) objArr[1];
        setTextKeepState settextkeepstate = (setTextKeepState) objArr[2];
        int i10 = m;
        int i11 = (i10 ^ 23) + ((i10 & 23) << 1);
        f56772l = i11 % 128;
        int i12 = i11 % 2;
        Intrinsics.checkNotNullParameter(ivVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        activateSession activatesession = activateSession.SEE_PHONE;
        ValueQualifier valueQualifier = ValueQualifier.setDividerPadding;
        ez.setX(ivVar, settextkeepstate, activatesession, valueQualifier, (byte[]) Companion.setDividerPadding(new Object[0], 1771099405, -1771099402, (int) System.currentTimeMillis()), null);
        activateSession activatesession2 = (activateSession) activateSession.Companion.setCompoundDrawableTintBlendMode(new Object[0], 689677017, -689677017, (int) System.currentTimeMillis());
        byte[] bArr = (byte[]) iv.setCompoundDrawableTintBlendMode(new Object[]{ivVar}, -1323053543, 1323053546, System.identityHashCode(ivVar));
        if (bArr == null) {
            int i13 = m + 55;
            f56772l = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 16 / 0;
                bArr = (byte[]) Companion.setDividerPadding(new Object[0], 446732567, -446732562, (int) System.currentTimeMillis());
            } else {
                bArr = (byte[]) Companion.setDividerPadding(new Object[0], 446732567, -446732562, (int) System.currentTimeMillis());
            }
        } else {
            int i15 = f56772l;
            int i16 = ((i15 ^ 87) - (~(-(-((i15 & 87) << 1))))) - 1;
            m = i16 % 128;
            int i17 = i16 % 2;
        }
        fk onFocusChangeListener = ez.setOnFocusChangeListener(kcVar, ivVar, settextkeepstate, null, ez.setY(fd.END_APPLICATION, getY.setOnFocusChangeListener, Boolean.TRUE, null, null, null, null, null, 192), ez.setY(ivVar, activatesession2, valueQualifier, bArr), null);
        int i18 = f56772l + 13;
        m = i18 % 128;
        if (i18 % 2 != 0) {
            return onFocusChangeListener;
        }
        throw null;
    }

    public static /* synthetic */ fk d(Object[] objArr) {
        kc kcVar = (kc) objArr[0];
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[1];
        setTextKeepState settextkeepstate = (setTextKeepState) objArr[2];
        byte[] bArr = (byte[]) objArr[3];
        int i10 = f56772l;
        int i11 = i10 ^ 107;
        int i12 = (((i10 & 107) | i11) << 1) - i11;
        m = i12 % 128;
        iv ivVar = (iv) setscrollbardefaultdelaybeforefade;
        if (i12 % 2 != 0) {
            return (fk) setDividerPadding(new Object[]{kcVar, ivVar, settextkeepstate, bArr}, 483519789, -483519779, System.identityHashCode(kcVar));
        }
        fk fkVar = (fk) setDividerPadding(new Object[]{kcVar, ivVar, settextkeepstate, bArr}, 483519789, -483519779, System.identityHashCode(kcVar));
        int i13 = 19 / 0;
        return fkVar;
    }

    public static /* synthetic */ fk e(Object[] objArr) {
        kc kcVar = (kc) objArr[0];
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[1];
        setTextKeepState settextkeepstate = (setTextKeepState) objArr[2];
        int i10 = m;
        int i11 = i10 & 73;
        int i12 = -(-((i10 ^ 73) | i11));
        int i13 = (i11 & i12) + (i12 | i11);
        f56772l = i13 % 128;
        int i14 = i13 % 2;
        fk fkVar = (fk) setDividerPadding(new Object[]{kcVar, (iv) setscrollbardefaultdelaybeforefade, settextkeepstate}, 1115421908, -1115421896, System.identityHashCode(kcVar));
        int i15 = f56772l;
        int i16 = ((i15 ^ 45) - (~((i15 & 45) << 1))) - 1;
        m = i16 % 128;
        if (i16 % 2 != 0) {
            return fkVar;
        }
        throw null;
    }

    public static /* synthetic */ fk f(Object[] objArr) {
        kc kcVar = (kc) objArr[0];
        iv ivVar = (iv) objArr[1];
        setTextKeepState settextkeepstate = (setTextKeepState) objArr[2];
        Intrinsics.checkNotNullParameter(ivVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        fk onFocusChangeListener = ez.setOnFocusChangeListener(kcVar, ivVar, settextkeepstate, null, ez.setY(fd.END_APPLICATION, getY.setNavigationOnClickListener, Boolean.TRUE, null, null, null, null, null, 192), null, new f(activateSession.N_A, ez.setY.setNavigationOnClickListener(), ez.setY.setOnLongClickListener(), setDrawSelectorOnTop.setOnFocusChangeListener, ez.setY.setOnFocusChangeListener()));
        int i10 = m;
        int i11 = i10 & 21;
        int i12 = (((i10 | 21) & (~i11)) - (~(i11 << 1))) - 1;
        f56772l = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 92 / 0;
        }
        return onFocusChangeListener;
    }

    public static /* synthetic */ fk g(Object[] objArr) {
        kc kcVar = (kc) objArr[0];
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[1];
        setTextKeepState settextkeepstate = (setTextKeepState) objArr[2];
        int i10 = m;
        int i11 = i10 & 97;
        int i12 = (((i10 ^ 97) | i11) << 1) - ((i10 | 97) & (~i11));
        f56772l = i12 % 128;
        int i13 = i12 % 2;
        fk fkVar = (fk) setDividerPadding(new Object[]{kcVar, (iv) setscrollbardefaultdelaybeforefade, settextkeepstate}, -417568641, 417568641, System.identityHashCode(kcVar));
        int i14 = f56772l;
        int i15 = i14 & 95;
        int i16 = -(-((i14 ^ 95) | i15));
        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
        m = i17 % 128;
        if (i17 % 2 != 0) {
            return fkVar;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0884  */
    /* JADX WARN: Code duplicated, block: B:77:0x089d  */
    /* JADX WARN: Code duplicated, block: B:78:0x089e  */
    /* JADX WARN: Code duplicated, block: B:80:0x08af  */
    /* JADX WARN: Code duplicated, block: B:81:0x08c5  */
    /* JADX WARN: Code duplicated, block: B:85:0x0927  */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws Exception {
        String str;
        int i13;
        getBeepOnFailure getbeeponfailure;
        byte[] bArr;
        String str2;
        Object string;
        int i14;
        int i15;
        int i16;
        fk fkVar;
        fk fkVar2;
        int i17;
        int i18 = ~i10;
        switch ((((~(i10 | i11)) | (~(i12 | i18))) * 433) + (((~((~i11) | i12)) | i18) * (-433)) + ((~((~i12) | i18 | i11)) * 433) + (i11 * 434) + (i10 * (-432))) {
            case 1:
                kc kcVar = (kc) objArr[0];
                iv ivVar = (iv) objArr[1];
                setTextKeepState settextkeepstate = (setTextKeepState) objArr[2];
                setRotationX setrotationx = (setRotationX) objArr[3];
                Intrinsics.checkNotNullParameter(ivVar, "");
                Intrinsics.checkNotNullParameter(settextkeepstate, "");
                Intrinsics.checkNotNullParameter(setrotationx, "");
                fk onFocusChangeListener = ez.setOnFocusChangeListener(kcVar, ivVar, settextkeepstate, null, ez.setY(fd.TRY_AGAIN, getY.setOnFocusChangeListener, Boolean.TRUE, null, null, null, null, null, 192), ez.setY(ivVar, (activateSession) activateSession.Companion.setCompoundDrawableTintBlendMode(new Object[0], 689677017, -689677017, (int) System.currentTimeMillis()), ValueQualifier.setOnFocusChangeListener, (byte[]) Companion.setDividerPadding(new Object[0], 446732567, -446732562, (int) System.currentTimeMillis())), new f(activateSession.N_A, setrotationx.setDividerPadding(), ez.setY.setOnLongClickListener(), ez.setY.setLayoutAnimation(), ez.setY.setOnFocusChangeListener()));
                int i19 = f56772l;
                int i20 = ((i19 | 37) << 1) - (i19 ^ 37);
                m = i20 % 128;
                int i21 = i20 % 2;
                return onFocusChangeListener;
            case 2:
                return c(objArr);
            case 3:
                return g(objArr);
            case 4:
                a(objArr);
                return null;
            case 5:
                return f(objArr);
            case 6:
                return b(objArr);
            case 7:
                return d(objArr);
            case 8:
                return e(objArr);
            case 9:
                kc kcVar2 = (kc) objArr[0];
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[1];
                j jVar = (j) objArr[2];
                f fVar = (f) objArr[3];
                l lVar = (l) objArr[4];
                getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) objArr[5];
                Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(CollectionsKt___CollectionsKt.joinToString$default(f56771k, RootService.LINE_BREAK, null, null, 0, null, new a(setscrollbardefaultdelaybeforefade), 30, null));
                sb2.append("\n\nTVR: ");
                getBeepOnFailure getbeeponfailure3 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, setAnimation.TransactionErrorCause()}, -1593889019, 1593889062, System.identityHashCode(setscrollbardefaultdelaybeforefade));
                if (getbeeponfailure3 == null) {
                    int i22 = f56772l;
                    int i23 = (-2) - ((((i22 | 102) << 1) - (i22 ^ 102)) ^ (-1));
                    int i24 = i23 % 128;
                    m = i24;
                    int i25 = i23 % 2;
                    int i26 = i24 & 53;
                    int i27 = (i26 - (~((i24 ^ 53) | i26))) - 1;
                    f56772l = i27 % 128;
                    int i28 = i27 % 2;
                } else {
                    byte[] bArr2 = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 252497730, -252497710, System.identityHashCode(getbeeponfailure3));
                    if (bArr2 == null) {
                        int i29 = m;
                        int i30 = (-2) - ((((i29 | 28) << 1) - (i29 ^ 28)) ^ (-1));
                        f56772l = i30 % 128;
                        int i31 = i30 % 2;
                        int i32 = i29 & 43;
                        int i33 = (i32 - (~(-(-((i29 ^ 43) | i32))))) - 1;
                        f56772l = i33 % 128;
                        int i34 = i33 % 2;
                    } else {
                        str = (String) setInputExtras.setDividerPadding(new Object[]{bArr2}, 1609250238, -1609250236, (int) System.currentTimeMillis());
                        int i35 = f56772l;
                        int i36 = (i35 ^ 75) + ((i35 & 75) << 1);
                        m = i36 % 128;
                        i13 = 2;
                        int i37 = i36 % 2;
                    }
                    sb2.append((Object) str);
                    sb2.append("\nTSI: ");
                    TransactionFailed importantForContentCapture = setAnimation.setImportantForContentCapture();
                    Object[] objArr2 = new Object[i13];
                    objArr2[0] = setscrollbardefaultdelaybeforefade;
                    objArr2[1] = importantForContentCapture;
                    getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(objArr2, -1593889019, 1593889062, System.identityHashCode(setscrollbardefaultdelaybeforefade));
                    if (getbeeponfailure == null) {
                        int i38 = m;
                        int i39 = i38 & 125;
                        int i40 = -(-(i38 | 125));
                        i15 = ((i39 | i40) << 1) - (i40 ^ i39);
                        f56772l = i15 % 128;
                        if (i15 % 2 != 0) {
                            throw null;
                        }
                    } else {
                        bArr = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure));
                        if (bArr == null) {
                            int i41 = m + 87;
                            int i42 = i41 % 128;
                            f56772l = i42;
                            int i43 = i41 % 2;
                            int i44 = i42 & 113;
                            int i45 = i44 + ((i42 ^ 113) | i44);
                            m = i45 % 128;
                            int i46 = i45 % 2;
                        } else {
                            str2 = (String) setInputExtras.setDividerPadding(new Object[]{bArr}, 1609250238, -1609250236, (int) System.currentTimeMillis());
                            int i47 = m;
                            int i48 = ((((i47 ^ 11) | (i47 & 11)) << 1) - (~(-(((~i47) & 11) | (i47 & (-12)))))) - 1;
                            f56772l = i48 % 128;
                            int i49 = i48 % 2;
                        }
                        sb2.append((Object) str2);
                        String string2 = sb2.toString();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(super.setCompoundDrawableTintBlendMode(setscrollbardefaultdelaybeforefade, jVar, fVar, lVar, getbeeponfailure2));
                        sb3.append("\n\nDiscretionary tag list\n");
                        sb3.append(string2);
                        string = sb3.toString();
                        int i50 = f56772l;
                        int i51 = i50 & 53;
                        int i52 = -(-((i50 ^ 53) | i51));
                        i14 = ((i51 | i52) << 1) - (i52 ^ i51);
                        m = i14 % 128;
                        if (i14 % 2 == 0) {
                            throw null;
                        }
                    }
                    str2 = null;
                    sb2.append((Object) str2);
                    String string3 = sb2.toString();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(super.setCompoundDrawableTintBlendMode(setscrollbardefaultdelaybeforefade, jVar, fVar, lVar, getbeeponfailure2));
                    sb4.append("\n\nDiscretionary tag list\n");
                    sb4.append(string3);
                    string = sb4.toString();
                    int i53 = f56772l;
                    int i54 = i53 & 53;
                    int i55 = -(-((i53 ^ 53) | i54));
                    i14 = ((i54 | i55) << 1) - (i55 ^ i54);
                    m = i14 % 128;
                    if (i14 % 2 == 0) {
                        throw null;
                    }
                }
                str = null;
                i13 = 2;
                sb2.append((Object) str);
                sb2.append("\nTSI: ");
                TransactionFailed importantForContentCapture2 = setAnimation.setImportantForContentCapture();
                Object[] objArr3 = new Object[i13];
                objArr3[0] = setscrollbardefaultdelaybeforefade;
                objArr3[1] = importantForContentCapture2;
                getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(objArr3, -1593889019, 1593889062, System.identityHashCode(setscrollbardefaultdelaybeforefade));
                if (getbeeponfailure == null) {
                    int i310 = m;
                    int i311 = i310 & 125;
                    int i410 = -(-(i310 | 125));
                    i15 = ((i311 | i410) << 1) - (i410 ^ i311);
                    f56772l = i15 % 128;
                    if (i15 % 2 != 0) {
                        throw null;
                    }
                } else {
                    bArr = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure));
                    if (bArr == null) {
                        int i411 = m + 87;
                        int i412 = i411 % 128;
                        f56772l = i412;
                        int i413 = i411 % 2;
                        int i414 = i412 & 113;
                        int i415 = i414 + ((i412 ^ 113) | i414);
                        m = i415 % 128;
                        int i416 = i415 % 2;
                    } else {
                        str2 = (String) setInputExtras.setDividerPadding(new Object[]{bArr}, 1609250238, -1609250236, (int) System.currentTimeMillis());
                        int i417 = m;
                        int i418 = ((((i417 ^ 11) | (i417 & 11)) << 1) - (~(-(((~i417) & 11) | (i417 & (-12)))))) - 1;
                        f56772l = i418 % 128;
                        int i419 = i418 % 2;
                    }
                    sb2.append((Object) str2);
                    String string4 = sb2.toString();
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(super.setCompoundDrawableTintBlendMode(setscrollbardefaultdelaybeforefade, jVar, fVar, lVar, getbeeponfailure2));
                    sb5.append("\n\nDiscretionary tag list\n");
                    sb5.append(string4);
                    string = sb5.toString();
                    int i56 = f56772l;
                    int i57 = i56 & 53;
                    int i58 = -(-((i56 ^ 53) | i57));
                    i14 = ((i57 | i58) << 1) - (i58 ^ i57);
                    m = i14 % 128;
                    if (i14 % 2 == 0) {
                        throw null;
                    }
                }
                str2 = null;
                sb2.append((Object) str2);
                String string5 = sb2.toString();
                StringBuilder sb6 = new StringBuilder();
                sb6.append(super.setCompoundDrawableTintBlendMode(setscrollbardefaultdelaybeforefade, jVar, fVar, lVar, getbeeponfailure2));
                sb6.append("\n\nDiscretionary tag list\n");
                sb6.append(string5);
                string = sb6.toString();
                int i59 = f56772l;
                int i510 = i59 & 53;
                int i511 = -(-((i59 ^ 53) | i510));
                i14 = ((i510 | i511) << 1) - (i511 ^ i510);
                m = i14 % 128;
                if (i14 % 2 == 0) {
                    throw null;
                }
            case 10:
                kc kcVar3 = (kc) objArr[0];
                iv ivVar2 = (iv) objArr[1];
                setTextKeepState settextkeepstate2 = (setTextKeepState) objArr[2];
                byte[] bArr3 = (byte[]) objArr[3];
                int i60 = m;
                int i61 = ((((i60 ^ 37) | (i60 & 37)) << 1) - (~(-(((~i60) & 37) | (i60 & (-38)))))) - 1;
                f56772l = i61 % 128;
                if (i61 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(ivVar2, "");
                    Intrinsics.checkNotNullParameter(settextkeepstate2, "");
                    Intrinsics.checkNotNullParameter(bArr3, "");
                    throw null;
                }
                Intrinsics.checkNotNullParameter(ivVar2, "");
                Intrinsics.checkNotNullParameter(settextkeepstate2, "");
                Intrinsics.checkNotNullParameter(bArr3, "");
                fk fkVar3 = (fk) setDividerPadding(new Object[]{kcVar3, ivVar2, settextkeepstate2, ValueQualifier.setY, setContentCaptureSession.setLayoutAnimation}, 611466742, -611466721, System.identityHashCode(kcVar3));
                int i62 = m;
                int i63 = ((i62 & (-72)) | ((~i62) & 71)) + ((i62 & 71) << 1);
                f56772l = i63 % 128;
                int i64 = i63 % 2;
                return fkVar3;
            case 11:
                kc kcVar4 = (kc) objArr[0];
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade2 = (setScrollBarDefaultDelayBeforeFade) objArr[1];
                setTextKeepState settextkeepstate3 = (setTextKeepState) objArr[2];
                int i65 = m;
                int i66 = i65 ^ 87;
                int i67 = -(-((i65 & 87) << 1));
                int i68 = (i66 & i67) + (i67 | i66);
                f56772l = i68 % 128;
                if (i68 % 2 != 0) {
                    i16 = 1;
                    fkVar = (fk) setDividerPadding(new Object[]{kcVar4, (iv) setscrollbardefaultdelaybeforefade2, settextkeepstate3}, 324101183, -324101168, System.identityHashCode(kcVar4));
                    int i69 = 1 / 0;
                } else {
                    i16 = 1;
                    fkVar = (fk) setDividerPadding(new Object[]{kcVar4, (iv) setscrollbardefaultdelaybeforefade2, settextkeepstate3}, 324101183, -324101168, System.identityHashCode(kcVar4));
                }
                fk fkVar4 = fkVar;
                int i70 = f56772l;
                int i71 = ((i70 ^ 123) - (~(-(-((i70 & 123) << i16))))) - i16;
                m = i71 % 128;
                int i72 = i71 % 2;
                return fkVar4;
            case 12:
                kc kcVar5 = (kc) objArr[0];
                iv ivVar3 = (iv) objArr[1];
                setTextKeepState settextkeepstate4 = (setTextKeepState) objArr[2];
                int i73 = m;
                int i74 = (i73 ^ 67) + ((i73 & 67) << 1);
                f56772l = i74 % 128;
                int i75 = i74 % 2;
                Intrinsics.checkNotNullParameter(ivVar3, "");
                Intrinsics.checkNotNullParameter(settextkeepstate4, "");
                fk fkVar5 = (fk) setDividerPadding(new Object[]{kcVar5, ivVar3, settextkeepstate4, ValueQualifier.setY, setContentCaptureSession.setNavigationOnClickListener}, 611466742, -611466721, System.identityHashCode(kcVar5));
                int i76 = f56772l;
                int i77 = i76 ^ 77;
                int i78 = (i76 & 77) << 1;
                int i79 = (i77 & i78) + (i78 | i77);
                m = i79 % 128;
                int i80 = i79 % 2;
                return fkVar5;
            case 13:
                kc kcVar6 = (kc) objArr[0];
                iv ivVar4 = (iv) objArr[1];
                setTextKeepState settextkeepstate5 = (setTextKeepState) objArr[2];
                activateSession activatesession = (activateSession) objArr[3];
                fd fdVar = (fd) objArr[4];
                setTransitionVisibility settransitionvisibility = (setTransitionVisibility) objArr[5];
                Intrinsics.checkNotNullParameter(ivVar4, "");
                Intrinsics.checkNotNullParameter(settextkeepstate5, "");
                Intrinsics.checkNotNullParameter(activatesession, "");
                Intrinsics.checkNotNullParameter(fdVar, "");
                Intrinsics.checkNotNullParameter(settransitionvisibility, "");
                f fVar2 = new f(ez.setY.setOnDragListener(), ez.setY.setNavigationOnClickListener(), ez.setY.setOnLongClickListener(), ez.setY.setLayoutAnimation(), ez.setY.setOnFocusChangeListener());
                l y7 = ez.setY(ivVar4, activatesession, ValueQualifier.setCompoundDrawableTintBlendMode, (byte[]) ez.setY.setX(new Object[0], -1446138994, 1446139003, (int) System.currentTimeMillis()));
                j y10 = ez.setY(fdVar, (getY) ez.setY.setX(new Object[0], 368505141, -368505137, (int) System.currentTimeMillis()), Boolean.TRUE, Boolean.FALSE, null, settransitionvisibility, null, null, 192);
                ey eyVar = ey.INSTANCE;
                string = ez.setOnFocusChangeListener(kcVar6, ivVar4, settextkeepstate5, (getBeepOnFailure) ey.setY(new Object[]{ivVar4}, 1660534021, -1660534020, (int) System.currentTimeMillis()), y10, y7, fVar2);
                int i81 = f56772l + 119;
                m = i81 % 128;
                if (i81 % 2 == 0) {
                    throw null;
                }
                break;
            case 14:
                kc kcVar7 = (kc) objArr[0];
                activateSession activatesession2 = (activateSession) objArr[1];
                fd fdVar2 = (fd) objArr[2];
                iv ivVar5 = (iv) objArr[3];
                setTextKeepState settextkeepstate6 = (setTextKeepState) objArr[4];
                ValueQualifier valueQualifier = (ValueQualifier) objArr[5];
                byte[] bArr4 = (byte[]) objArr[6];
                string = ez.setOnFocusChangeListener(kcVar7, ivVar5, settextkeepstate6, null, ez.setY(fdVar2, (getY) objArr[7], Boolean.TRUE, null, null, null, null, null, 192), ez.setY(ivVar5, activatesession2, valueQualifier, (byte[]) Companion.setDividerPadding(new Object[0], 446732567, -446732562, (int) System.currentTimeMillis())), new f(activatesession2, ez.setY.setNavigationOnClickListener(), (setContentCaptureSession) objArr[8], ez.setY.setLayoutAnimation(), bArr4));
                int i82 = m;
                int i83 = (i82 ^ 105) + ((i82 & 105) << 1);
                f56772l = i83 % 128;
                if (i83 % 2 != 0) {
                    throw null;
                }
                break;
            case 15:
                kc kcVar8 = (kc) objArr[0];
                iv ivVar6 = (iv) objArr[1];
                setTextKeepState settextkeepstate7 = (setTextKeepState) objArr[2];
                Intrinsics.checkNotNullParameter(ivVar6, "");
                Intrinsics.checkNotNullParameter(settextkeepstate7, "");
                fk onFocusChangeListener2 = ez.setOnFocusChangeListener(kcVar8, ivVar6, settextkeepstate7, null, ez.setY(fd.END_APPLICATION, (getY) ez.setY.setX(new Object[0], 368505141, -368505137, (int) System.currentTimeMillis()), Boolean.TRUE, null, null, null, null, null, 192), ez.setY(ivVar6, (activateSession) activateSession.Companion.setCompoundDrawableTintBlendMode(new Object[0], 689677017, -689677017, (int) System.currentTimeMillis()), ValueQualifier.setY, (byte[]) Companion.setDividerPadding(new Object[0], 446732567, -446732562, (int) System.currentTimeMillis())), new f(activateSession.ERROR_OTHER_CARD, setItemChecked.setX, ez.setY.setOnLongClickListener(), ez.setY.setLayoutAnimation(), ez.setY.setOnFocusChangeListener()));
                int i84 = f56772l + 109;
                m = i84 % 128;
                if (i84 % 2 != 0) {
                    return onFocusChangeListener2;
                }
                int i85 = 80 / 0;
                return onFocusChangeListener2;
            case 16:
                kc kcVar9 = (kc) objArr[0];
                iv ivVar7 = (iv) objArr[1];
                setTextKeepState settextkeepstate8 = (setTextKeepState) objArr[2];
                byte[] bArr5 = (byte[]) objArr[3];
                int i86 = f56772l + 49;
                m = i86 % 128;
                if (i86 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(ivVar7, "");
                    Intrinsics.checkNotNullParameter(settextkeepstate8, "");
                    Intrinsics.checkNotNullParameter(bArr5, "");
                    fkVar2 = (fk) setDividerPadding(new Object[]{kcVar9, (activateSession) ez.setY.setX(new Object[0], -750761700, 750761703, (int) System.currentTimeMillis()), fd.SELECT_NEXT, ivVar7, settextkeepstate8, (ValueQualifier) ez.setY.setX(new Object[0], -160680657, 160680667, (int) System.currentTimeMillis()), bArr5, getY.setCompoundDrawableTintBlendMode, setContentCaptureSession.setLayoutAnimation}, -2085647366, 2085647380, System.identityHashCode(kcVar9));
                    int i87 = 65 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(ivVar7, "");
                    Intrinsics.checkNotNullParameter(settextkeepstate8, "");
                    Intrinsics.checkNotNullParameter(bArr5, "");
                    fkVar2 = (fk) setDividerPadding(new Object[]{kcVar9, (activateSession) ez.setY.setX(new Object[0], -750761700, 750761703, (int) System.currentTimeMillis()), fd.SELECT_NEXT, ivVar7, settextkeepstate8, (ValueQualifier) ez.setY.setX(new Object[0], -160680657, 160680667, (int) System.currentTimeMillis()), bArr5, getY.setCompoundDrawableTintBlendMode, setContentCaptureSession.setLayoutAnimation}, -2085647366, 2085647380, System.identityHashCode(kcVar9));
                }
                fk fkVar6 = fkVar2;
                int i88 = f56772l;
                int i89 = i88 & 35;
                int i90 = (i88 | 35) & (~i89);
                int i91 = i89 << 1;
                int i92 = (i90 ^ i91) + ((i90 & i91) << 1);
                m = i92 % 128;
                if (i92 % 2 != 0) {
                    return fkVar6;
                }
                int i93 = 31 / 0;
                return fkVar6;
            case 17:
                kc kcVar10 = (kc) objArr[0];
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade3 = (setScrollBarDefaultDelayBeforeFade) objArr[1];
                setTextKeepState settextkeepstate9 = (setTextKeepState) objArr[2];
                byte[] bArr6 = (byte[]) objArr[3];
                int i94 = m;
                int i95 = (i94 & 45) + (i94 | 45);
                f56772l = i95 % 128;
                iv ivVar8 = (iv) setscrollbardefaultdelaybeforefade3;
                if (i95 % 2 != 0) {
                    string = (fk) setDividerPadding(new Object[]{kcVar10, ivVar8, settextkeepstate9, bArr6}, 1660550511, -1660550495, System.identityHashCode(kcVar10));
                    int i96 = 7 / 0;
                } else {
                    string = (fk) setDividerPadding(new Object[]{kcVar10, ivVar8, settextkeepstate9, bArr6}, 1660550511, -1660550495, System.identityHashCode(kcVar10));
                }
                int i97 = f56772l;
                int i98 = i97 & 41;
                int i99 = (i98 - (~((i97 ^ 41) | i98))) - 1;
                m = i99 % 128;
                if (i99 % 2 == 0) {
                    throw null;
                }
                break;
            case 18:
                kc kcVar11 = (kc) objArr[0];
                iv ivVar9 = (iv) objArr[1];
                setTextKeepState settextkeepstate10 = (setTextKeepState) objArr[2];
                ValueQualifier valueQualifier2 = (ValueQualifier) objArr[3];
                setContentCaptureSession setcontentcapturesession = (setContentCaptureSession) objArr[4];
                int i100 = m;
                int i101 = ((i100 | 3) << 1) - (i100 ^ 3);
                f56772l = i101 % 128;
                int i102 = i101 % 2;
                Intrinsics.checkNotNullParameter(ivVar9, "");
                Intrinsics.checkNotNullParameter(settextkeepstate10, "");
                Intrinsics.checkNotNullParameter(valueQualifier2, "");
                Intrinsics.checkNotNullParameter(setcontentcapturesession, "");
                activateSession.Companion companion = activateSession.INSTANCE;
                fk fkVar7 = (fk) setDividerPadding(new Object[]{kcVar11, (activateSession) activateSession.Companion.setCompoundDrawableTintBlendMode(new Object[0], -1920552587, 1920552589, (int) System.currentTimeMillis()), fd.DECLINED, ivVar9, settextkeepstate10, valueQualifier2, (byte[]) ez.setY.setX(new Object[0], 1517968692, -1517968681, (int) System.currentTimeMillis()), (getY) ez.setY.setX(new Object[0], 368505141, -368505137, (int) System.currentTimeMillis()), setcontentcapturesession}, -2085647366, 2085647380, System.identityHashCode(kcVar11));
                int i103 = m;
                int i104 = ((i103 | 118) << 1) - (i103 ^ 118);
                int i105 = (i104 ^ (-1)) + (i104 << 1);
                f56772l = i105 % 128;
                int i106 = i105 % 2;
                return fkVar7;
            case 19:
                kc kcVar12 = (kc) objArr[0];
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade4 = (setScrollBarDefaultDelayBeforeFade) objArr[1];
                setTextKeepState settextkeepstate11 = (setTextKeepState) objArr[2];
                int i107 = m;
                int i108 = ((i107 ^ 27) | (i107 & 27)) << 1;
                int i109 = -(((~i107) & 27) | (i107 & (-28)));
                int i110 = (i108 & i109) + (i109 | i108);
                f56772l = i110 % 128;
                iv ivVar10 = (iv) setscrollbardefaultdelaybeforefade4;
                if (i110 % 2 != 0) {
                    string = (fk) setDividerPadding(new Object[]{kcVar12, ivVar10, settextkeepstate11}, -1917568006, 1917568011, System.identityHashCode(kcVar12));
                    int i111 = 14 / 0;
                    i17 = 1;
                } else {
                    i17 = 1;
                    string = (fk) setDividerPadding(new Object[]{kcVar12, ivVar10, settextkeepstate11}, -1917568006, 1917568011, System.identityHashCode(kcVar12));
                }
                int i112 = f56772l;
                int i113 = (-2) - ((((i112 | 74) << i17) - (i112 ^ 74)) ^ (-1));
                m = i113 % 128;
                if (i113 % 2 == 0) {
                    throw null;
                }
                break;
            case 20:
                kc kcVar13 = (kc) objArr[0];
                iv ivVar11 = (iv) objArr[1];
                setTextKeepState settextkeepstate12 = (setTextKeepState) objArr[2];
                int i114 = m;
                int i115 = (i114 & 13) + (i114 | 13);
                f56772l = i115 % 128;
                if (i115 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(ivVar11, "");
                    Intrinsics.checkNotNullParameter(settextkeepstate12, "");
                    return (fk) setDividerPadding(new Object[]{kcVar13, ivVar11, settextkeepstate12, ValueQualifier.setY, setContentCaptureSession.setOnFocusChangeListener}, 611466742, -611466721, System.identityHashCode(kcVar13));
                }
                Intrinsics.checkNotNullParameter(ivVar11, "");
                Intrinsics.checkNotNullParameter(settextkeepstate12, "");
                throw null;
            case 21:
                kc kcVar14 = (kc) objArr[0];
                iv ivVar12 = (iv) objArr[1];
                setTextKeepState settextkeepstate13 = (setTextKeepState) objArr[2];
                ValueQualifier valueQualifier3 = (ValueQualifier) objArr[3];
                setContentCaptureSession setcontentcapturesession2 = (setContentCaptureSession) objArr[4];
                int i116 = f56772l;
                int i117 = i116 & 69;
                int i118 = (i116 ^ 69) | i117;
                int i119 = (i117 & i118) + (i117 | i118);
                m = i119 % 128;
                int i120 = i119 % 2;
                Intrinsics.checkNotNullParameter(ivVar12, "");
                Intrinsics.checkNotNullParameter(settextkeepstate13, "");
                Intrinsics.checkNotNullParameter(valueQualifier3, "");
                Intrinsics.checkNotNullParameter(setcontentcapturesession2, "");
                fk fkVar8 = (fk) setDividerPadding(new Object[]{kcVar14, activateSession.ERROR_OTHER_CARD, fd.END_APPLICATION, ivVar12, settextkeepstate13, valueQualifier3, (byte[]) ez.setY.setX(new Object[0], 1517968692, -1517968681, (int) System.currentTimeMillis()), (getY) ez.setY.setX(new Object[0], 368505141, -368505137, (int) System.currentTimeMillis()), setcontentcapturesession2}, -2085647366, 2085647380, System.identityHashCode(kcVar14));
                int i121 = m;
                int i122 = (i121 & (-94)) | ((~i121) & 93);
                int i123 = -(-((i121 & 93) << 1));
                int i124 = (i122 ^ i123) + ((i123 & i122) << 1);
                f56772l = i124 % 128;
                int i125 = i124 % 2;
                return fkVar8;
            default:
                kc kcVar15 = (kc) objArr[0];
                iv ivVar13 = (iv) objArr[1];
                setTextKeepState settextkeepstate14 = (setTextKeepState) objArr[2];
                int i126 = f56772l + 50;
                int i127 = (i126 ^ (-1)) + (i126 << 1);
                m = i127 % 128;
                int i128 = i127 % 2;
                Intrinsics.checkNotNullParameter(ivVar13, "");
                Intrinsics.checkNotNullParameter(settextkeepstate14, "");
                fk fkVar9 = (fk) setDividerPadding(new Object[]{kcVar15, ivVar13, settextkeepstate14, ValueQualifier.setY, setContentCaptureSession.setOnLongClickListener}, 611466742, -611466721, System.identityHashCode(kcVar15));
                int i129 = m;
                int i130 = i129 & 61;
                int i131 = i130 + ((i129 ^ 61) | i130);
                f56772l = i131 % 128;
                int i132 = i131 % 2;
                return fkVar9;
        }
        return string;
    }

    @Override // com.mypinpad.tsdk.isolation.ew
    public final /* synthetic */ fk a_(setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, setTextKeepState settextkeepstate) {
        return (fk) setDividerPadding(new Object[]{this, setscrollbardefaultdelaybeforefade, settextkeepstate}, -756379676, 756379682, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ew
    public final /* synthetic */ fk b_(setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, setTextKeepState settextkeepstate) {
        return (fk) setDividerPadding(new Object[]{this, setscrollbardefaultdelaybeforefade, settextkeepstate}, -1446076039, 1446076042, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.fb
    public final /* synthetic */ fk setCompoundDrawableTintBlendMode(setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, setTextKeepState settextkeepstate) {
        return (fk) setDividerPadding(new Object[]{this, setscrollbardefaultdelaybeforefade, settextkeepstate}, -1388368374, 1388368385, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.fb
    public final /* synthetic */ fk setOnFocusChangeListener(setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, setTextKeepState settextkeepstate) {
        return (fk) setDividerPadding(new Object[]{this, setscrollbardefaultdelaybeforefade, settextkeepstate}, -1462045326, 1462045345, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ew
    public final /* synthetic */ fk setY(setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, setTextKeepState settextkeepstate, byte[] bArr) {
        return (fk) setDividerPadding(new Object[]{this, setscrollbardefaultdelaybeforefade, settextkeepstate, bArr}, -553116239, 553116246, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ez
    @NotNull
    public final String setCompoundDrawableTintBlendMode(@NotNull setScrollBarDefaultDelayBeforeFade p4, @Nullable j p10, @Nullable f p11, @Nullable l p12, @Nullable getBeepOnFailure p13) {
        return (String) setDividerPadding(new Object[]{this, p4, p10, p11, p12, p13}, 304351866, -304351857, System.identityHashCode(this));
    }

    @NotNull
    public final fk setOnFocusChangeListener(@NotNull iv p4, @NotNull setTextKeepState p10, @NotNull byte[] p11) {
        return (fk) setDividerPadding(new Object[]{this, p4, p10, p11}, 483519789, -483519779, System.identityHashCode(this));
    }

    @NotNull
    public final fk setY(@NotNull iv p4, @NotNull setTextKeepState p10) {
        return (fk) setDividerPadding(new Object[]{this, p4, p10}, 37118063, -37118043, System.identityHashCode(this));
    }

    @NotNull
    public final fk setOnFocusChangeListener(@NotNull iv p4, @NotNull setTextKeepState p10) {
        return (fk) setDividerPadding(new Object[]{this, p4, p10}, 644326672, -644326670, System.identityHashCode(this));
    }

    @NotNull
    public final fk setY(@NotNull iv p4, @NotNull setTextKeepState p10, @NotNull setRotationX p11) {
        return (fk) setDividerPadding(new Object[]{this, p4, p10, p11}, -1386322137, 1386322138, System.identityHashCode(this));
    }

    @NotNull
    public final fk setOnFocusChangeListener(@NotNull iv p4, @NotNull setTextKeepState p10, @NotNull ValueQualifier p11, @NotNull setContentCaptureSession p12) {
        return (fk) setDividerPadding(new Object[]{this, p4, p10, p11, p12}, -96080429, 96080447, System.identityHashCode(this));
    }

    @NotNull
    public final fk setY(@NotNull iv p4, @NotNull setTextKeepState p10, @NotNull ValueQualifier p11, @NotNull setContentCaptureSession p12) {
        return (fk) setDividerPadding(new Object[]{this, p4, p10, p11, p12}, 611466742, -611466721, System.identityHashCode(this));
    }

    @NotNull
    public final fk setOnFocusChangeListener(@NotNull iv ivVar, @NotNull setTextKeepState settextkeepstate, @NotNull activateSession activatesession, @NotNull fd fdVar, @NotNull setTransitionVisibility settransitionvisibility) {
        return (fk) setDividerPadding(new Object[]{this, ivVar, settextkeepstate, activatesession, fdVar, settransitionvisibility}, 1701233296, -1701233283, System.identityHashCode(this));
    }

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.kc$setY, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/mypinpad/tsdk/i/kc$setY;", "", "", "Lcom/mypinpad/tsdk/i/TransactionFailed;", "setCompoundDrawableTintBlendMode", "Ljava/util/List;", "<init>", "()V"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f56776a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f56777b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
            byte[] bArr;
            int i13 = ~((~i10) | (~i11));
            int i14 = (i13 * 1512) + (i11 * (-755)) + (i10 * (-755));
            int i15 = i10 | i11;
            int i16 = ((i15 | (~i12)) * 756) + ((i13 | (~(i15 | i12))) * (-756)) + i14;
            if (i16 == 1) {
                int i17 = f56777b;
                int i18 = i17 & 61;
                int i19 = -(-((i17 ^ 61) | i18));
                int i20 = (i18 & i19) + (i19 | i18);
                int i21 = i20 % 128;
                f56776a = i21;
                int i22 = i20 % 2;
                byte[] bArr2 = {0, 0, 0};
                int i23 = (i21 | 117) << 1;
                int i24 = -(((~i21) & 117) | (i21 & (-118)));
                int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
                f56777b = i25 % 128;
                int i26 = i25 % 2;
                return bArr2;
            }
            if (i16 == 2) {
                int i27 = f56777b;
                int i28 = i27 ^ 1;
                int i29 = ((((i27 & 1) | i28) << 1) - (~(-i28))) - 1;
                f56776a = i29 % 128;
                if (i29 % 2 == 0) {
                    return new byte[]{0, 0, 10};
                }
                byte[] bArr3 = new byte[5];
                bArr3[1] = 1;
                bArr3[0] = 0;
                bArr3[5] = 2;
                return bArr3;
            }
            if (i16 == 3) {
                int i30 = f56777b;
                int i31 = i30 ^ 29;
                int i32 = -(-((i30 & 29) << 1));
                int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
                f56776a = i33 % 128;
                int i34 = i33 % 2;
                byte[] bArr4 = (byte[]) setDividerPadding(new Object[0], 1855288463, -1855288461, (int) System.currentTimeMillis());
                int i35 = f56777b;
                int i36 = i35 & 101;
                int i37 = i36 + ((i35 ^ 101) | i36);
                f56776a = i37 % 128;
                if (i37 % 2 == 0) {
                    return bArr4;
                }
                throw null;
            }
            if (i16 == 4) {
                int i38 = f56777b + 106;
                int i39 = (i38 ^ (-1)) + (i38 << 1);
                f56776a = i39 % 128;
                if (i39 % 2 != 0) {
                    bArr = (byte[]) setDividerPadding(new Object[0], -416869510, 416869510, (int) System.currentTimeMillis());
                    int i40 = 81 / 0;
                } else {
                    bArr = (byte[]) setDividerPadding(new Object[0], -416869510, 416869510, (int) System.currentTimeMillis());
                }
                int i41 = f56776a;
                int i42 = ((i41 ^ 58) + ((i41 & 58) << 1)) - 1;
                f56777b = i42 % 128;
                int i43 = i42 % 2;
                return bArr;
            }
            if (i16 != 5) {
                int i44 = f56776a;
                int i45 = i44 & 97;
                int i46 = -(-((i44 ^ 97) | i45));
                int i47 = (i45 ^ i46) + ((i46 & i45) << 1);
                f56777b = i47 % 128;
                if (i47 % 2 != 0) {
                    return new byte[]{0, 0, 3};
                }
                byte[] bArr5 = new byte[4];
                bArr5[0] = 0;
                bArr5[1] = 1;
                bArr5[5] = 2;
                return bArr5;
            }
            int i48 = f56777b;
            int i49 = i48 ^ 107;
            int i50 = ((i48 & 107) | i49) << 1;
            int i51 = -i49;
            int i52 = (i50 & i51) + (i50 | i51);
            f56776a = i52 % 128;
            int i53 = i52 % 2;
            byte[] bArr6 = (byte[]) setDividerPadding(new Object[0], 578872413, -578872412, (int) System.currentTimeMillis());
            int i54 = f56777b;
            int i55 = i54 ^ 65;
            int i56 = ((i54 & 65) | i55) << 1;
            int i57 = -i55;
            int i58 = ((i56 | i57) << 1) - (i56 ^ i57);
            f56776a = i58 % 128;
            if (i58 % 2 == 0) {
                return bArr6;
            }
            throw null;
        }

        public static final /* synthetic */ byte[] setX() {
            return (byte[]) setDividerPadding(new Object[0], 1162043999, -1162043995, (int) System.currentTimeMillis());
        }

        public static final /* synthetic */ byte[] setY() {
            return (byte[]) setDividerPadding(new Object[0], 446732567, -446732562, (int) System.currentTimeMillis());
        }

        public static final /* synthetic */ byte[] setDividerPadding() {
            return (byte[]) setDividerPadding(new Object[0], 1771099405, -1771099402, (int) System.currentTimeMillis());
        }
    }

    @Override // com.mypinpad.tsdk.isolation.ew
    public final /* synthetic */ fk setDividerPadding(setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, setTextKeepState settextkeepstate) {
        return (fk) setDividerPadding(new Object[]{this, setscrollbardefaultdelaybeforefade, settextkeepstate}, -1005347647, 1005347655, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ew
    public final /* synthetic */ fk setDividerPadding(setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, setTextKeepState settextkeepstate, byte[] bArr) {
        return (fk) setDividerPadding(new Object[]{this, setscrollbardefaultdelaybeforefade, settextkeepstate, bArr}, 1633789164, -1633789147, System.identityHashCode(this));
    }

    @NotNull
    public final fk setDividerPadding(@NotNull iv p4, @NotNull setTextKeepState p10, @NotNull byte[] p11) {
        return (fk) setDividerPadding(new Object[]{this, p4, p10, p11}, 1660550511, -1660550495, System.identityHashCode(this));
    }

    public final void setDividerPadding(@NotNull iv p4, @NotNull setTextKeepState p10) throws Exception {
        setDividerPadding(new Object[]{this, p4, p10}, -543624988, 543624992, System.identityHashCode(this));
    }
}
