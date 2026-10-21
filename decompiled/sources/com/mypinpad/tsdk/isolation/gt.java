package com.mypinpad.tsdk.isolation;

import bk.w;
import com.bbva.sl.ar.core.libmcrypt.impl.LibMCryptConstants;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$Bg\u0012\u0006\u0010\u0007\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0097@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/mypinpad/tsdk/i/gt;", "Lcom/mypinpad/tsdk/i/GlobalEndpoint;", "Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;", "", "setOnDragListener", "()Z", "Lcom/mypinpad/tsdk/i/fg;", "p0", "Lcom/mypinpad/tsdk/i/fk;", "setCompoundDrawableTintBlendMode", "(Lcom/mypinpad/tsdk/i/fg;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/mypinpad/tsdk/i/setBackgroundTintList;", "Lcom/mypinpad/tsdk/i/setTextKeepState;", "p1", "Lcom/mypinpad/tsdk/i/gz;", "p2", "Lcom/mypinpad/tsdk/i/me;", "p3", "Lcom/mypinpad/tsdk/i/getValue;", "p4", "Lcom/mypinpad/tsdk/i/di;", "p5", "Lcom/mypinpad/tsdk/i/component10;", "p6", "Lcom/mypinpad/tsdk/i/setTop;", "p7", "Lcom/mypinpad/tsdk/i/setFontFeatureSettings;", "p8", "Lcom/mypinpad/tsdk/i/setContentDescription;", "p9", "Lcom/mypinpad/tsdk/i/component17;", "p10", "Lcom/mypinpad/tsdk/i/io;", "p11", "<init>", "(Lcom/mypinpad/tsdk/i/setBackgroundTintList;Lcom/mypinpad/tsdk/i/setTextKeepState;Lcom/mypinpad/tsdk/i/gz;Lcom/mypinpad/tsdk/i/me;Lcom/mypinpad/tsdk/i/getValue;Lcom/mypinpad/tsdk/i/di;Lcom/mypinpad/tsdk/i/component10;Lcom/mypinpad/tsdk/i/setTop;Lcom/mypinpad/tsdk/i/setFontFeatureSettings;Lcom/mypinpad/tsdk/i/setContentDescription;Lcom/mypinpad/tsdk/i/component17;Lcom/mypinpad/tsdk/i/io;)V", "setX"}, k = 1, mv = {1, 5, 1})
public final class gt extends GlobalEndpoint<setScrollBarDefaultDelayBeforeFade> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static int f56077s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static int f56078t = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final gz f56079n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final setContentDescription f56080o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final component17 f56081p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final io f56082q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final ex f56083r;

    @NotNull
    public static Set<fg> setCompoundDrawableTintBlendMode = w.setOf((Object[]) new fg[]{fg.UiMessageCallbackKtWhenMappings, fg.setTextAlignment});

    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static int f56084s0 = 0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static int f56085t0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f56086p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f56088r0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object[] objArr = {this, obj};
            System.identityHashCode(this);
            a aVar = (a) objArr[0];
            Object obj2 = objArr[1];
            int i10 = f56084s0;
            int i11 = ((i10 | 51) << 1) - (i10 ^ 51);
            f56085t0 = i11 % 128;
            int i12 = i11 % 2;
            aVar.f56086p0 = obj2;
            int i13 = aVar.f56088r0;
            int i14 = (Integer.MAX_VALUE & i13) | ((~i13) & Integer.MIN_VALUE);
            int i15 = i13 & Integer.MIN_VALUE;
            aVar.f56088r0 = (i15 & i14) | (i14 ^ i15);
            Object compoundDrawableTintBlendMode = gt.this.setCompoundDrawableTintBlendMode(null, aVar);
            int i16 = f56085t0;
            int i17 = i16 & 101;
            int i18 = (((i16 | 101) & (~i17)) - (~(i17 << 1))) - 1;
            f56084s0 = i18 % 128;
            int i19 = i18 % 2;
            return compoundDrawableTintBlendMode;
        }
    }

    public /* synthetic */ class setDividerPadding {
        public static final /* synthetic */ int[] setDividerPadding;

        static {
            int[] iArr = new int[fg.values().length];
            iArr[fg.setDividerPadding.ordinal()] = 1;
            iArr[fg.setY.ordinal()] = 2;
            iArr[fg.setCompoundDrawableTintBlendMode.ordinal()] = 3;
            iArr[fg.setOnLongClickListener.ordinal()] = 4;
            iArr[fg.setNavigationOnClickListener.ordinal()] = 5;
            iArr[fg.setLayoutAnimation.ordinal()] = 6;
            iArr[fg.setOnDragListener.ordinal()] = 7;
            iArr[fg.UiMessageCallbackKtWhenMappings.ordinal()] = 8;
            iArr[fg.setIncludeFontPadding.ordinal()] = 9;
            iArr[fg.setTextAlignment.ordinal()] = 10;
            iArr[fg.setTextScaleX.ordinal()] = 11;
            setDividerPadding = iArr;
            int i10 = 75 % 128;
            if (75 % 2 == 0) {
                throw null;
            }
        }
    }

    static {
        int i10 = f56078t + 77;
        f56077s = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 3 / 0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gt(@NotNull setBackgroundTintList setbackgroundtintlist, @NotNull setTextKeepState settextkeepstate, @NotNull gz gzVar, @NotNull me meVar, @NotNull getValue getvalue, @NotNull di diVar, @NotNull component10 component10Var, @NotNull setTop settop, @NotNull setFontFeatureSettings setfontfeaturesettings, @NotNull setContentDescription setcontentdescription, @NotNull component17 component17Var, @NotNull io ioVar) throws Exception {
        super(settextkeepstate, getvalue, diVar, component10Var, settop, setfontfeaturesettings);
        Intrinsics.checkNotNullParameter(setbackgroundtintlist, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(gzVar, "");
        Intrinsics.checkNotNullParameter(meVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        Intrinsics.checkNotNullParameter(diVar, "");
        Intrinsics.checkNotNullParameter(component10Var, "");
        Intrinsics.checkNotNullParameter(settop, "");
        Intrinsics.checkNotNullParameter(setfontfeaturesettings, "");
        Intrinsics.checkNotNullParameter(setcontentdescription, "");
        Intrinsics.checkNotNullParameter(component17Var, "");
        Intrinsics.checkNotNullParameter(ioVar, "");
        this.f56079n = gzVar;
        this.f56080o = setcontentdescription;
        this.f56081p = component17Var;
        this.f56082q = ioVar;
        setX(new gv(setbackgroundtintlist, diVar, component17Var));
        setScrollBarDefaultDelayBeforeFade navigationOnClickListener = setNavigationOnClickListener();
        setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{navigationOnClickListener, meVar.setCompoundDrawableTintBlendMode(), settop}, -919932723, 919932782, System.identityHashCode(navigationOnClickListener));
        setAnimation setanimation = setAnimation.INSTANCE;
        setY(meVar, (TransactionFailed) setAnimation.setY(new Object[0], -983972997, 983973214, (int) System.currentTimeMillis()));
        this.f56083r = new ex();
    }

    /* JADX WARN: Code duplicated, block: B:106:0x064a  */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x0074 A[PHI: r8
      0x0074: PHI (r8v37 com.mypinpad.tsdk.i.gt$a) = (r8v36 com.mypinpad.tsdk.i.gt$a), (r8v39 com.mypinpad.tsdk.i.gt$a) binds: [B:13:0x0072, B:10:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:15:0x0130  */
    /* JADX WARN: Code duplicated, block: B:47:0x035a  */
    /* JADX WARN: Code duplicated, block: B:78:0x04cb  */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) throws Exception {
        boolean z10;
        a aVar;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        fk fkVar;
        int i18;
        fk fkVar2;
        int i19;
        fk fkVar3;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24 = (i11 * 517) + (i10 * (-515));
        int i25 = ~i11;
        int i26 = ~(i25 | i12);
        int i27 = ~i12;
        int i28 = i26 | (~(i27 | i10));
        int i29 = ~(i27 | i11);
        int i30 = ~i10;
        if ((((~(i30 | i11)) | i29) * LibMCryptConstants.IND_HEX_SEGMENTO2) + (((~(i12 | i25 | i30)) | (~(i30 | i27 | i11))) * LibMCryptConstants.IND_HEX_SEGMENTO2) + ((i28 | i29) * (-516)) + i24 == 1) {
            gt gtVar = (gt) objArr[0];
            int i31 = f56078t;
            int i32 = i31 & 7;
            int i33 = i32 + ((i31 ^ 7) | i32);
            f56077s = i33 % 128;
            int i34 = i33 % 2;
            if (CollectionsKt___CollectionsKt.contains(setCompoundDrawableTintBlendMode, gtVar.setLayoutAnimation())) {
                int i35 = f56078t + 1;
                f56077s = i35 % 128;
                int i36 = i35 % 2;
                z10 = Boolean.FALSE;
            } else {
                int i37 = f56078t + 67;
                f56077s = i37 % 128;
                int i38 = i37 % 2;
                z10 = true;
            }
            return z10;
        }
        gt gtVar2 = (gt) objArr[0];
        fg fgVar = (fg) objArr[1];
        Continuation continuation = (Continuation) objArr[2];
        int i39 = f56077s;
        int i40 = ((i39 | 117) << 1) - (i39 ^ 117);
        f56078t = i40 % 128;
        int i41 = i40 % 2;
        if (!(continuation instanceof a)) {
            aVar = gtVar2.new a(continuation);
            int i42 = f56078t;
            int i43 = i42 & 61;
            int i44 = (i42 ^ 61) | i43;
            int i45 = ((i43 | i44) << 1) - (i44 ^ i43);
            f56077s = i45 % 128;
            int i46 = i45 % 2;
        } else {
            int i47 = (i39 & 69) + (i39 | 69);
            int i48 = i47 % 128;
            f56078t = i48;
            if (i47 % 2 == 0) {
                aVar = (a) continuation;
                int i49 = 92 / 0;
                if ((aVar.f56088r0 & Integer.MIN_VALUE) != 0) {
                    int i50 = i48 + 62;
                    int i51 = (i50 ^ (-1)) + (i50 << 1);
                    f56077s = i51 % 128;
                    int i52 = i51 % 2;
                    int i53 = aVar.f56088r0;
                    int iIdentityHashCode = System.identityHashCode(gtVar2);
                    int i54 = -(-(i53 * (-903)));
                    int i55 = Integer.MIN_VALUE | i54;
                    int i56 = (i55 << 1) - ((~(i54 & Integer.MIN_VALUE)) & i55);
                    int i57 = ~((Integer.MAX_VALUE ^ iIdentityHashCode) | (Integer.MAX_VALUE & iIdentityHashCode));
                    int i58 = ~iIdentityHashCode;
                    int i59 = ~i53;
                    int i60 = ~i58;
                    int i61 = ~((i58 & i59) | (i53 & i60) | (i58 & i53));
                    int i62 = i57 & i61;
                    int i63 = (~i62) & (i57 | i61);
                    int i64 = (i56 - (~(-(-(((i62 & i63) | (i63 ^ i62)) * (-1808)))))) - 1;
                    int i65 = (i59 | i53) & i59;
                    int i66 = (i65 & Integer.MAX_VALUE) | (Integer.MAX_VALUE ^ i65);
                    int i67 = ~((i66 & iIdentityHashCode) | (i66 ^ iIdentityHashCode));
                    int i68 = (i60 & Integer.MIN_VALUE) | (i58 & Integer.MAX_VALUE);
                    int i69 = i58 & Integer.MIN_VALUE;
                    int i70 = (i68 & i69) | (i68 ^ i69);
                    int i71 = i70 & i53;
                    int i72 = (i70 | i53) & (~i71);
                    int i73 = (i72 & i71) | (i72 ^ i71);
                    int i74 = ~i73;
                    int i75 = (i73 | i74) & i74;
                    int i76 = (i64 - (~(-(~(((i75 & i67) | (((~i75) & i67) | ((~i67) & i75))) * 904))))) - 2;
                    int i77 = Integer.MAX_VALUE & i53;
                    int i78 = (~i77) & (Integer.MAX_VALUE | i53);
                    int i79 = ~((i77 & i78) | (i78 ^ i77));
                    int i80 = i59 ^ iIdentityHashCode;
                    int i81 = i59 & iIdentityHashCode;
                    int i82 = (i80 & i81) | (i80 ^ i81);
                    int i83 = ~i82;
                    int i84 = (i82 | i83) & i83;
                    int i85 = ((~i84) & i79) | ((~i79) & i84);
                    int i86 = i79 & i84;
                    int i87 = (i86 & i85) | (i85 ^ i86);
                    int i88 = ~(i58 | Integer.MIN_VALUE);
                    int i89 = ((i87 & i88) | (i87 ^ i88)) * 904;
                    int i90 = i76 & i89;
                    int i91 = (i89 | i76) & (~i90);
                    int i92 = -(-(i90 << 1));
                    aVar.f56088r0 = (i91 ^ i92) + ((i91 & i92) << 1);
                    int i93 = f56077s;
                    int i94 = (i93 ^ 69) + ((i93 & 69) << 1);
                    f56078t = i94 % 128;
                    int i95 = i94 % 2;
                } else {
                    aVar = gtVar2.new a(continuation);
                    int i410 = f56078t;
                    int i411 = i410 & 61;
                    int i412 = (i410 ^ 61) | i411;
                    int i413 = ((i411 | i412) << 1) - (i412 ^ i411);
                    f56077s = i413 % 128;
                    int i414 = i413 % 2;
                }
            } else {
                aVar = (a) continuation;
                if ((aVar.f56088r0 & Integer.MIN_VALUE) != 0) {
                    int i510 = i48 + 62;
                    int i511 = (i510 ^ (-1)) + (i510 << 1);
                    f56077s = i511 % 128;
                    int i512 = i511 % 2;
                    int i513 = aVar.f56088r0;
                    int iIdentityHashCode2 = System.identityHashCode(gtVar2);
                    int i514 = -(-(i513 * (-903)));
                    int i515 = Integer.MIN_VALUE | i514;
                    int i516 = (i515 << 1) - ((~(i514 & Integer.MIN_VALUE)) & i515);
                    int i517 = ~((Integer.MAX_VALUE ^ iIdentityHashCode2) | (Integer.MAX_VALUE & iIdentityHashCode2));
                    int i518 = ~iIdentityHashCode2;
                    int i519 = ~i513;
                    int i610 = ~i518;
                    int i611 = ~((i518 & i519) | (i513 & i610) | (i518 & i513));
                    int i612 = i517 & i611;
                    int i613 = (~i612) & (i517 | i611);
                    int i614 = (i516 - (~(-(-(((i612 & i613) | (i613 ^ i612)) * (-1808)))))) - 1;
                    int i615 = (i519 | i513) & i519;
                    int i616 = (i615 & Integer.MAX_VALUE) | (Integer.MAX_VALUE ^ i615);
                    int i617 = ~((i616 & iIdentityHashCode2) | (i616 ^ iIdentityHashCode2));
                    int i618 = (i610 & Integer.MIN_VALUE) | (i518 & Integer.MAX_VALUE);
                    int i619 = i518 & Integer.MIN_VALUE;
                    int i710 = (i618 & i619) | (i618 ^ i619);
                    int i711 = i710 & i513;
                    int i712 = (i710 | i513) & (~i711);
                    int i713 = (i712 & i711) | (i712 ^ i711);
                    int i714 = ~i713;
                    int i715 = (i713 | i714) & i714;
                    int i716 = (i614 - (~(-(~(((i715 & i617) | (((~i715) & i617) | ((~i617) & i715))) * 904))))) - 2;
                    int i717 = Integer.MAX_VALUE & i513;
                    int i718 = (~i717) & (Integer.MAX_VALUE | i513);
                    int i719 = ~((i717 & i718) | (i718 ^ i717));
                    int i810 = i519 ^ iIdentityHashCode2;
                    int i811 = i519 & iIdentityHashCode2;
                    int i812 = (i810 & i811) | (i810 ^ i811);
                    int i813 = ~i812;
                    int i814 = (i812 | i813) & i813;
                    int i815 = ((~i814) & i719) | ((~i719) & i814);
                    int i816 = i719 & i814;
                    int i817 = (i816 & i815) | (i815 ^ i816);
                    int i818 = ~(i518 | Integer.MIN_VALUE);
                    int i819 = ((i817 & i818) | (i817 ^ i818)) * 904;
                    int i96 = i716 & i819;
                    int i97 = (i819 | i716) & (~i96);
                    int i98 = -(-(i96 << 1));
                    aVar.f56088r0 = (i97 ^ i98) + ((i97 & i98) << 1);
                    int i99 = f56077s;
                    int i910 = (i99 ^ 69) + ((i99 & 69) << 1);
                    f56078t = i910 % 128;
                    int i911 = i910 % 2;
                } else {
                    aVar = gtVar2.new a(continuation);
                    int i415 = f56078t;
                    int i416 = i415 & 61;
                    int i417 = (i415 ^ 61) | i416;
                    int i418 = ((i416 | i417) << 1) - (i417 ^ i416);
                    f56077s = i418 % 128;
                    int i419 = i418 % 2;
                }
            }
        }
        Object compoundDrawableTintBlendMode = aVar.f56086p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        switch (aVar.f56088r0) {
            case 0:
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                switch (setDividerPadding.setDividerPadding[fgVar.ordinal()]) {
                    case 1:
                        hu huVar = new hu((gv) gtVar2.setNavigationOnClickListener(), gtVar2.setOnFocusChangeListener(), gtVar2.f56083r, gtVar2.f56081p, gtVar2.setY(), gtVar2.f56079n, gtVar2.f56082q);
                        aVar.f56088r0 = 1;
                        compoundDrawableTintBlendMode = ec.setCompoundDrawableTintBlendMode(new Object[]{huVar, aVar}, 1559788296, -1559788294, System.identityHashCode(huVar));
                        if (compoundDrawableTintBlendMode == coroutine_suspended) {
                            int i100 = f56078t;
                            int i101 = ((i100 & 42) + (i100 | 42)) - 1;
                            int i102 = i101 % 128;
                            f56077s = i102;
                            int i103 = i101 % 2;
                            int i104 = i102 & 111;
                            int i105 = i104 + ((i102 ^ 111) | i104);
                            f56078t = i105 % 128;
                            if (i105 % 2 != 0) {
                                return coroutine_suspended;
                            }
                            i13 = 72;
                            int i106 = i13 / 0;
                            return coroutine_suspended;
                        }
                        fk fkVar4 = (fk) compoundDrawableTintBlendMode;
                        int i107 = f56077s + 117;
                        f56078t = i107 % 128;
                        int i108 = i107 % 2;
                        return fkVar4;
                    case 2:
                        ht htVar = new ht((gv) gtVar2.setNavigationOnClickListener(), gtVar2.setOnFocusChangeListener(), gtVar2.f56083r, gtVar2.setY(), gtVar2.f56082q);
                        aVar.f56088r0 = 2;
                        compoundDrawableTintBlendMode = ec.setCompoundDrawableTintBlendMode(new Object[]{htVar, aVar}, 1559788296, -1559788294, System.identityHashCode(htVar));
                        if (compoundDrawableTintBlendMode == coroutine_suspended) {
                            int i109 = f56078t + 99;
                            f56077s = i109 % 128;
                            if (i109 % 2 == 0) {
                                return coroutine_suspended;
                            }
                            i13 = 21;
                        } else {
                            coroutine_suspended = (fk) compoundDrawableTintBlendMode;
                            int i110 = f56078t;
                            int i111 = i110 & 1;
                            i17 = ((i110 | 1) & (~i111)) + (i111 << 1);
                            f56077s = i17 % 128;
                            if (i17 % 2 != 0) {
                                return coroutine_suspended;
                            }
                            i13 = 34;
                        }
                        int i1010 = i13 / 0;
                        return coroutine_suspended;
                    case 3:
                        hs hsVar = new hs((gv) gtVar2.setNavigationOnClickListener(), gtVar2.setOnFocusChangeListener(), gtVar2.f56083r, gtVar2.setY(), gtVar2.f56081p, gtVar2.f56079n, gtVar2.f56082q);
                        aVar.f56088r0 = 3;
                        compoundDrawableTintBlendMode = ec.setCompoundDrawableTintBlendMode(new Object[]{hsVar, aVar}, 1559788296, -1559788294, System.identityHashCode(hsVar));
                        if (compoundDrawableTintBlendMode == coroutine_suspended) {
                            int i112 = f56078t;
                            i14 = i112 ^ 1;
                            i15 = -((i112 & 1) << 1);
                            i16 = (i14 - (~(-i15))) - 1;
                            f56077s = i16 % 128;
                            int i113 = i16 % 2;
                            return coroutine_suspended;
                        }
                        fkVar = (fk) compoundDrawableTintBlendMode;
                        int i114 = f56078t;
                        int i115 = i114 & 125;
                        int i116 = -(-((i114 ^ 125) | i115));
                        i18 = ((i115 | i116) << 1) - (i116 ^ i115);
                        f56077s = i18 % 128;
                        int i117 = i18 % 2;
                        return fkVar;
                    case 4:
                        ia iaVar = new ia((gv) gtVar2.setNavigationOnClickListener(), gtVar2.setOnFocusChangeListener(), gtVar2.f56083r, gtVar2.setY(), gtVar2.f56082q, gtVar2.f56079n, et.INSTANCE, gtVar2.f56081p);
                        aVar.f56088r0 = 4;
                        compoundDrawableTintBlendMode = ec.setCompoundDrawableTintBlendMode(new Object[]{iaVar, aVar}, 1559788296, -1559788294, System.identityHashCode(iaVar));
                        if (compoundDrawableTintBlendMode == coroutine_suspended) {
                            int i118 = f56078t;
                            int i119 = (((i118 | 63) << 1) - (~(-(((~i118) & 63) | (i118 & (-64)))))) - 1;
                            f56077s = i119 % 128;
                            if (i119 % 2 == 0) {
                                return coroutine_suspended;
                            }
                            int i120 = 5 / 0;
                            return coroutine_suspended;
                        }
                        fkVar = (fk) compoundDrawableTintBlendMode;
                        int i121 = f56077s;
                        int i122 = (i121 | 93) << 1;
                        int i123 = -(((~i121) & 93) | (i121 & (-94)));
                        i18 = (i122 & i123) + (i123 | i122);
                        f56078t = i18 % 128;
                        int i1110 = i18 % 2;
                        return fkVar;
                    case 5:
                        hx hxVar = new hx((gv) gtVar2.setNavigationOnClickListener(), gtVar2.setOnFocusChangeListener(), gtVar2.f56083r, gtVar2.setY(), gtVar2.f56079n, gtVar2.f56082q, et.INSTANCE);
                        aVar.f56088r0 = 5;
                        compoundDrawableTintBlendMode = ec.setCompoundDrawableTintBlendMode(new Object[]{hxVar, aVar}, 1559788296, -1559788294, System.identityHashCode(hxVar));
                        if (compoundDrawableTintBlendMode == coroutine_suspended) {
                            int i124 = f56077s;
                            int i125 = i124 & 59;
                            int i126 = -(-((i124 ^ 59) | i125));
                            int i127 = (i125 & i126) + (i126 | i125);
                            f56078t = i127 % 128;
                            if (i127 % 2 != 0) {
                                return coroutine_suspended;
                            }
                            throw null;
                        }
                        fkVar = (fk) compoundDrawableTintBlendMode;
                        int i128 = f56078t;
                        int i129 = (i128 & (-104)) | ((~i128) & 103);
                        int i130 = -(-((i128 & 103) << 1));
                        i18 = (i129 & i130) + (i130 | i129);
                        f56077s = i18 % 128;
                        int i1111 = i18 % 2;
                        return fkVar;
                    case 6:
                        hv hvVar = new hv((gv) gtVar2.setNavigationOnClickListener(), gtVar2.setOnFocusChangeListener(), gtVar2.f56083r, gtVar2.setY(), gtVar2.f56079n, gtVar2.f56082q, et.INSTANCE);
                        aVar.f56088r0 = 6;
                        compoundDrawableTintBlendMode = ec.setCompoundDrawableTintBlendMode(new Object[]{hvVar, aVar}, 1559788296, -1559788294, System.identityHashCode(hvVar));
                        if (compoundDrawableTintBlendMode == coroutine_suspended) {
                            int i131 = f56077s;
                            int i132 = i131 & 65;
                            int i133 = ((i131 | 65) & (~i132)) + (i132 << 1);
                            f56078t = i133 % 128;
                            if (i133 % 2 != 0) {
                                return coroutine_suspended;
                            }
                            throw null;
                        }
                        fkVar2 = (fk) compoundDrawableTintBlendMode;
                        int i134 = f56077s;
                        int i135 = i134 & 3;
                        i19 = i135 + ((i134 ^ 3) | i135);
                        f56078t = i19 % 128;
                        if (i19 % 2 != 0) {
                            return fkVar2;
                        }
                        throw null;
                    case 7:
                        hy hyVar = new hy((gv) gtVar2.setNavigationOnClickListener(), gtVar2.setOnFocusChangeListener(), gtVar2.f56083r, gtVar2.setY(), gtVar2.f56079n, gtVar2.f56082q, et.INSTANCE);
                        aVar.f56088r0 = 7;
                        compoundDrawableTintBlendMode = hy.setX(new Object[]{hyVar, aVar}, 1769335038, -1769335037, System.identityHashCode(hyVar));
                        if (compoundDrawableTintBlendMode == coroutine_suspended) {
                            int i136 = f56077s;
                            int i137 = i136 | 11;
                            int i138 = i137 << 1;
                            int i139 = -((~(i136 & 11)) & i137);
                            i16 = (i138 & i139) + (i139 | i138);
                            f56078t = i16 % 128;
                        } else {
                            coroutine_suspended = (fk) compoundDrawableTintBlendMode;
                            int i140 = f56078t;
                            int i141 = i140 & 89;
                            i14 = ((i140 ^ 89) | i141) << 1;
                            i15 = (i140 | 89) & (~i141);
                            i16 = (i14 - (~(-i15))) - 1;
                            f56077s = i16 % 128;
                        }
                        int i1112 = i16 % 2;
                        return coroutine_suspended;
                    case 8:
                        hz hzVar = new hz((gv) gtVar2.setNavigationOnClickListener(), gtVar2.setOnFocusChangeListener(), gtVar2.f56083r, gtVar2.setY(), et.INSTANCE, gtVar2.f56080o, gtVar2.setCompoundDrawableTintBlendMode());
                        aVar.f56088r0 = 8;
                        compoundDrawableTintBlendMode = ec.setCompoundDrawableTintBlendMode(new Object[]{hzVar, aVar}, 1559788296, -1559788294, System.identityHashCode(hzVar));
                        if (compoundDrawableTintBlendMode == coroutine_suspended) {
                            int i142 = f56077s;
                            int i143 = ((i142 & 105) - (~(-(-(i142 | 105))))) - 1;
                            f56078t = i143 % 128;
                            if (i143 % 2 != 0) {
                                return coroutine_suspended;
                            }
                            throw null;
                        }
                        return (fk) compoundDrawableTintBlendMode;
                    case 9:
                        hn hnVar = new hn((gv) gtVar2.setNavigationOnClickListener(), gtVar2.setOnFocusChangeListener(), gtVar2.f56083r, gtVar2.setY(), et.INSTANCE);
                        aVar.f56088r0 = 9;
                        compoundDrawableTintBlendMode = ec.setCompoundDrawableTintBlendMode(new Object[]{hnVar, aVar}, 1559788296, -1559788294, System.identityHashCode(hnVar));
                        if (compoundDrawableTintBlendMode == coroutine_suspended) {
                            int i144 = f56078t;
                            int i145 = i144 & 53;
                            int i146 = (i144 | 53) & (~i145);
                            int i147 = -(-(i145 << 1));
                            int i148 = ((i146 | i147) << 1) - (i146 ^ i147);
                            f56077s = i148 % 128;
                            if (i148 % 2 == 0) {
                                return coroutine_suspended;
                            }
                            throw null;
                        }
                        coroutine_suspended = (fk) compoundDrawableTintBlendMode;
                        int i149 = f56078t + 70;
                        i16 = (i149 ^ (-1)) + (i149 << 1);
                        f56077s = i16 % 128;
                        int i1113 = i16 % 2;
                        return coroutine_suspended;
                    case 10:
                        hp hpVar = new hp((gv) gtVar2.setNavigationOnClickListener(), gtVar2.setOnFocusChangeListener(), gtVar2.f56083r, gtVar2.setY(), et.INSTANCE);
                        aVar.f56088r0 = 10;
                        compoundDrawableTintBlendMode = ec.setCompoundDrawableTintBlendMode(new Object[]{hpVar, aVar}, 1559788296, -1559788294, System.identityHashCode(hpVar));
                        if (compoundDrawableTintBlendMode == coroutine_suspended) {
                            int i150 = f56077s;
                            int i151 = (i150 & (-38)) | ((~i150) & 37);
                            int i152 = -(-((i150 & 37) << 1));
                            int i153 = ((i151 | i152) << 1) - (i152 ^ i151);
                            f56078t = i153 % 128;
                            if (i153 % 2 != 0) {
                                return coroutine_suspended;
                            }
                            throw null;
                        }
                        fkVar3 = (fk) compoundDrawableTintBlendMode;
                        int iIdentityHashCode3 = System.identityHashCode(gtVar2);
                        int i154 = 443026770 ^ iIdentityHashCode3;
                        int i155 = ~iIdentityHashCode3;
                        int i156 = 443026770 & iIdentityHashCode3;
                        int i157 = ~((i154 & i156) | (i154 ^ i156));
                        int i158 = (-496051914) & iIdentityHashCode3;
                        int i159 = (~i158) & ((-496051914) | iIdentityHashCode3);
                        int i160 = (i158 & i159) | (i159 ^ i158);
                        int i161 = ~i160;
                        int i162 = ((i157 & 93397641) | (93397641 ^ i157) | ((i160 | i161) & i161)) * (-754);
                        int i163 = 387173473 & i162;
                        int i164 = i163 + ((i162 ^ 387173473) | i163);
                        int i165 = (93397641 & iIdentityHashCode3) | ((-93397642) & i155);
                        int i166 = iIdentityHashCode3 & (-93397642);
                        int i167 = ~((i166 & i165) | (i165 ^ i166));
                        int i168 = i155 ^ (-443026771);
                        int i169 = (-443026771) & i155;
                        int i170 = (i169 & i168) | (i168 ^ i169);
                        int i171 = i170 & (-496051914);
                        int i172 = (i170 | (-496051914)) & (~i171);
                        int i173 = (i172 & i171) | (i172 ^ i171);
                        int i174 = ~i173;
                        int i175 = (i173 | i174) & i174;
                        int i176 = (i164 - (~(-(-(((i167 & i175) | (i167 ^ i175)) * (-754)))))) - 1;
                        int i177 = 443026770 & i155;
                        int i178 = (443026770 | i155) & (~i177);
                        int i179 = ((i177 & i178) | (i178 ^ i177)) * 754;
                        int i180 = i176 & i179;
                        int i181 = i179 | i176;
                        i20 = (i180 ^ i181) + ((i181 & i180) << 1);
                        int iIdentityHashCode4 = System.identityHashCode(gtVar2);
                        int i182 = ~iIdentityHashCode4;
                        int i183 = (-673328336) ^ i182;
                        int i184 = i182 & (-673328336);
                        int i185 = (i183 ^ i184) | (i183 & i184);
                        int i186 = ~i185;
                        int i187 = (i185 | i186) & i186;
                        int i188 = ((~i187) & 131279) | ((-131280) & i187);
                        int i189 = i187 & 131279;
                        int i190 = (i189 & i188) | (i188 ^ i189);
                        int i191 = (-1183122193) ^ iIdentityHashCode4;
                        int i192 = iIdentityHashCode4 & (-1183122193);
                        int i193 = ~((i191 ^ i192) | (i191 & i192));
                        int i194 = -(-(((i190 & i193) | (i190 ^ i193)) * (-252)));
                        int i195 = (1351009478 | i194) << 1;
                        int i196 = -((i194 & (-1351009479)) | (1351009478 & (~i194)));
                        i21 = ((i195 & i196) + (i196 | i195)) - (-1794049212);
                        int i197 = i184 | i183 | (-1856319249);
                        int i198 = ~i197;
                        i22 = (i197 | i198) & i198;
                        int i199 = i192 | i191;
                        int i200 = ~i199;
                        i23 = (i199 | i200) & i200;
                        if (i20 > (i21 - (~(-(-(((i23 & i22) | (i22 ^ i23)) * 252))))) - 1) {
                            return fkVar3;
                        }
                        throw null;
                    case 11:
                        int i201 = f56077s;
                        int i202 = i201 & 73;
                        int i203 = (i201 | 73) & (~i202);
                        int i204 = i202 << 1;
                        int i205 = (i203 & i204) + (i203 | i204);
                        f56078t = i205 % 128;
                        if (i205 % 2 != 0) {
                            return null;
                        }
                        throw null;
                    default:
                        throw new fh(1, fgVar.toString());
                }
            case 1:
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                int i206 = f56078t;
                int i207 = i206 & 73;
                int i208 = i206 | 73;
                int i209 = (i207 & i208) + (i208 | i207);
                f56077s = i209 % 128;
                int i210 = i209 % 2;
                fk fkVar5 = (fk) compoundDrawableTintBlendMode;
                int i1011 = f56077s + 117;
                f56078t = i1011 % 128;
                int i1012 = i1011 % 2;
                return fkVar5;
            case 2:
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                coroutine_suspended = (fk) compoundDrawableTintBlendMode;
                int i1114 = f56078t;
                int i1115 = i1114 & 1;
                i17 = ((i1114 | 1) & (~i1115)) + (i1115 << 1);
                f56077s = i17 % 128;
                if (i17 % 2 != 0) {
                    return coroutine_suspended;
                }
                i13 = 34;
                int i1013 = i13 / 0;
                return coroutine_suspended;
            case 3:
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                fkVar = (fk) compoundDrawableTintBlendMode;
                int i1116 = f56078t;
                int i1117 = i1116 & 125;
                int i1118 = -(-((i1116 ^ 125) | i1117));
                i18 = ((i1117 | i1118) << 1) - (i1118 ^ i1117);
                f56077s = i18 % 128;
                int i1119 = i18 % 2;
                return fkVar;
            case 4:
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                int i211 = f56078t + 65;
                f56077s = i211 % 128;
                int i212 = i211 % 2;
                fkVar = (fk) compoundDrawableTintBlendMode;
                int i1210 = f56077s;
                int i1211 = (i1210 | 93) << 1;
                int i1212 = -(((~i1210) & 93) | (i1210 & (-94)));
                i18 = (i1211 & i1212) + (i1212 | i1211);
                f56078t = i18 % 128;
                int i11110 = i18 % 2;
                return fkVar;
            case 5:
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                int i213 = f56078t;
                int i214 = (((i213 ^ 61) | (i213 & 61)) << 1) - (((~i213) & 61) | (i213 & (-62)));
                f56077s = i214 % 128;
                int i215 = i214 % 2;
                fkVar = (fk) compoundDrawableTintBlendMode;
                int i1213 = f56078t;
                int i1214 = (i1213 & (-104)) | ((~i1213) & 103);
                int i1310 = -(-((i1213 & 103) << 1));
                i18 = (i1214 & i1310) + (i1310 | i1214);
                f56077s = i18 % 128;
                int i11111 = i18 % 2;
                return fkVar;
            case 6:
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                fkVar2 = (fk) compoundDrawableTintBlendMode;
                int i1311 = f56077s;
                int i1312 = i1311 & 3;
                i19 = i1312 + ((i1311 ^ 3) | i1312);
                f56078t = i19 % 128;
                if (i19 % 2 != 0) {
                    return fkVar2;
                }
                throw null;
            case 7:
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                int i216 = f56077s;
                int i217 = (i216 & 45) + (i216 | 45);
                f56078t = i217 % 128;
                int i218 = i217 % 2;
                coroutine_suspended = (fk) compoundDrawableTintBlendMode;
                int i1410 = f56078t;
                int i1411 = i1410 & 89;
                i14 = ((i1410 ^ 89) | i1411) << 1;
                i15 = (i1410 | 89) & (~i1411);
                i16 = (i14 - (~(-i15))) - 1;
                f56077s = i16 % 128;
                int i11112 = i16 % 2;
                return coroutine_suspended;
            case 8:
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                return (fk) compoundDrawableTintBlendMode;
            case 9:
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                int i219 = f56078t;
                int i220 = ((((i219 ^ 91) | (i219 & 91)) << 1) - (~(-(((~i219) & 91) | (i219 & (-92)))))) - 1;
                f56077s = i220 % 128;
                int i221 = i220 % 2;
                coroutine_suspended = (fk) compoundDrawableTintBlendMode;
                int i1412 = f56078t + 70;
                i16 = (i1412 ^ (-1)) + (i1412 << 1);
                f56077s = i16 % 128;
                int i11113 = i16 % 2;
                return coroutine_suspended;
            case 10:
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                int i222 = f56077s;
                int i223 = (((i222 ^ 75) | (i222 & 75)) << 1) - (((~i222) & 75) | (i222 & (-76)));
                f56078t = i223 % 128;
                int i224 = i223 % 2;
                fkVar3 = (fk) compoundDrawableTintBlendMode;
                int iIdentityHashCode5 = System.identityHashCode(gtVar2);
                int i1510 = 443026770 ^ iIdentityHashCode5;
                int i1511 = ~iIdentityHashCode5;
                int i1512 = 443026770 & iIdentityHashCode5;
                int i1513 = ~((i1510 & i1512) | (i1510 ^ i1512));
                int i1514 = (-496051914) & iIdentityHashCode5;
                int i1515 = (~i1514) & ((-496051914) | iIdentityHashCode5);
                int i1610 = (i1514 & i1515) | (i1515 ^ i1514);
                int i1611 = ~i1610;
                int i1612 = ((i1513 & 93397641) | (93397641 ^ i1513) | ((i1610 | i1611) & i1611)) * (-754);
                int i1613 = 387173473 & i1612;
                int i1614 = i1613 + ((i1612 ^ 387173473) | i1613);
                int i1615 = (93397641 & iIdentityHashCode5) | ((-93397642) & i1511);
                int i1616 = iIdentityHashCode5 & (-93397642);
                int i1617 = ~((i1616 & i1615) | (i1615 ^ i1616));
                int i1618 = i1511 ^ (-443026771);
                int i1619 = (-443026771) & i1511;
                int i1710 = (i1619 & i1618) | (i1618 ^ i1619);
                int i1711 = i1710 & (-496051914);
                int i1712 = (i1710 | (-496051914)) & (~i1711);
                int i1713 = (i1712 & i1711) | (i1712 ^ i1711);
                int i1714 = ~i1713;
                int i1715 = (i1713 | i1714) & i1714;
                int i1716 = (i1614 - (~(-(-(((i1617 & i1715) | (i1617 ^ i1715)) * (-754)))))) - 1;
                int i1717 = 443026770 & i1511;
                int i1718 = (443026770 | i1511) & (~i1717);
                int i1719 = ((i1717 & i1718) | (i1718 ^ i1717)) * 754;
                int i1810 = i1716 & i1719;
                int i1811 = i1719 | i1716;
                i20 = (i1810 ^ i1811) + ((i1811 & i1810) << 1);
                int iIdentityHashCode6 = System.identityHashCode(gtVar2);
                int i1812 = ~iIdentityHashCode6;
                int i1813 = (-673328336) ^ i1812;
                int i1814 = i1812 & (-673328336);
                int i1815 = (i1813 ^ i1814) | (i1813 & i1814);
                int i1816 = ~i1815;
                int i1817 = (i1815 | i1816) & i1816;
                int i1818 = ((~i1817) & 131279) | ((-131280) & i1817);
                int i1819 = i1817 & 131279;
                int i1910 = (i1819 & i1818) | (i1818 ^ i1819);
                int i1911 = (-1183122193) ^ iIdentityHashCode6;
                int i1912 = iIdentityHashCode6 & (-1183122193);
                int i1913 = ~((i1911 ^ i1912) | (i1911 & i1912));
                int i1914 = -(-(((i1910 & i1913) | (i1910 ^ i1913)) * (-252)));
                int i1915 = (1351009478 | i1914) << 1;
                int i1916 = -((i1914 & (-1351009479)) | (1351009478 & (~i1914)));
                i21 = ((i1915 & i1916) + (i1916 | i1915)) - (-1794049212);
                int i1917 = i1814 | i1813 | (-1856319249);
                int i1918 = ~i1917;
                i22 = (i1917 | i1918) & i1918;
                int i1919 = i1912 | i1911;
                int i2010 = ~i1919;
                i23 = (i1919 | i2010) & i2010;
                if (i20 > (i21 - (~(-(-(((i23 & i22) | (i22 ^ i23)) * 252))))) - 1) {
                    return fkVar3;
                }
                throw null;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.mypinpad.tsdk.isolation.GlobalEndpoint
    @Nullable
    public final Object setCompoundDrawableTintBlendMode(@NotNull fg fgVar, @NotNull Continuation<? super fk> continuation) {
        return setX(new Object[]{this, fgVar, continuation}, -948867444, 948867444, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.GlobalEndpoint
    public final boolean setOnDragListener() {
        return ((Boolean) setX(new Object[]{this}, 1386873145, -1386873144, System.identityHashCode(this))).booleanValue();
    }
}
