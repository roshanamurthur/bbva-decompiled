package com.mypinpad.tsdk.isolation;

import androidx.compose.animation.core.AnimationKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/setShadowLayer;", "", "Lcom/mypinpad/tsdk/i/me;", "p0", "Lcom/mypinpad/tsdk/i/values;", "setCompoundDrawableTintBlendMode", "(Lcom/mypinpad/tsdk/i/me;)Lcom/mypinpad/tsdk/i/values;", "Lcom/mypinpad/tsdk/i/exceptionHandler;", "<init>", "(Lcom/mypinpad/tsdk/i/exceptionHandler;)V", "setDividerPadding"}, k = 1, mv = {1, 5, 1})
public final class setShadowLayer {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f60555c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f60556d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final exceptionHandler f60557a;

    /* JADX INFO: renamed from: setDividerPadding, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Long[] f60554b = {1L, 10L, 100L, 1000L, 10000L, 100000L, Long.valueOf(AnimationKt.MillisToNanos), 10000000L};

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cr;", "", "setCompoundDrawableTintBlendMode", "(Lcom/mypinpad/tsdk/i/cr;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends Lambda implements Function1<cr, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f60558p0 = new a();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f60559q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static final int f60560r0;

        static {
            int i10 = f60559q0;
            int i11 = (i10 ^ 95) + ((i10 & 95) << 1);
            f60560r0 = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
        }

        public a() {
            super(1);
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = (((~(i10 | (~i12))) | (~i11)) * 305) + (((~(i10 | i11)) | (~(i10 | i12))) * 305) + (i11 * 306) + (i10 * 306) + TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS;
            int i14 = f60560r0;
            if (i13 != 1) {
                cr crVar = (cr) objArr[1];
                int i15 = ((i14 ^ 18) + ((i14 & 18) << 1)) - 1;
                f60559q0 = i15 % 128;
                if (i15 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(crVar, "");
                    cr.setDividerPadding(new Object[]{crVar, Boolean.TRUE}, 1459052326, -1459052324, System.identityHashCode(crVar));
                    cr.setDividerPadding(new Object[]{crVar, Boolean.FALSE}, -2146251303, 2146251306, System.identityHashCode(crVar));
                    return null;
                }
                Intrinsics.checkNotNullParameter(crVar, "");
                Boolean bool = Boolean.FALSE;
                cr.setDividerPadding(new Object[]{crVar, bool}, 1459052326, -1459052324, System.identityHashCode(crVar));
                cr.setDividerPadding(new Object[]{crVar, bool}, -2146251303, 2146251306, System.identityHashCode(crVar));
                return null;
            }
            a aVar = (a) objArr[0];
            Object obj = objArr[1];
            int i16 = i14 ^ 63;
            int i17 = (i14 & 63) << 1;
            int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
            f60559q0 = i18 % 128;
            cr crVar2 = (cr) obj;
            if (i18 % 2 != 0) {
                a(new Object[]{aVar, crVar2}, -2130864314, 2130864314, System.identityHashCode(aVar));
                Unit unit = Unit.INSTANCE;
                throw null;
            }
            a(new Object[]{aVar, crVar2}, -2130864314, 2130864314, System.identityHashCode(aVar));
            Unit unit2 = Unit.INSTANCE;
            int i19 = i14 & 125;
            int i20 = ((~i19) & (i14 | 125)) + (i19 << 1);
            f60559q0 = i20 % 128;
            int i21 = i20 % 2;
            return unit2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(cr crVar) {
            return a(new Object[]{this, crVar}, 1155780470, -1155780469, System.identityHashCode(this));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cr;", "", "setCompoundDrawableTintBlendMode", "(Lcom/mypinpad/tsdk/i/cr;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class b extends Lambda implements Function1<cr, Unit> {

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static int f60561s0 = 0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static int f60562t0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ setFontFeatureSettings f60563p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ setMax f60564q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Ref.BooleanRef f60565r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(setFontFeatureSettings setfontfeaturesettings, setMax setmax, Ref.BooleanRef booleanRef) {
            super(1);
            this.f60563p0 = setfontfeaturesettings;
            this.f60564q0 = setmax;
            this.f60565r0 = booleanRef;
        }

        /* JADX WARN: Code duplicated, block: B:41:0x0229  */
        /* JADX WARN: Code duplicated, block: B:43:0x0244  */
        /* JADX WARN: Code duplicated, block: B:45:0x0255  */
        /* JADX WARN: Code duplicated, block: B:46:0x0265  */
        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            int i13;
            int i14 = ~i10;
            int i15 = ~i11;
            int i16 = i14 | i15;
            if (((~(i16 | i12)) * 345) + (((~(i10 | i15)) | (~(i14 | (~i12)))) * 345) + (((~i16) | (~(i14 | i12))) * 345) + (i11 * (-344)) + (i10 * (-344)) != 1) {
                b bVar = (b) objArr[0];
                Object obj = objArr[1];
                int i17 = f60562t0;
                int i18 = i17 & 53;
                int i19 = i18 + ((i17 ^ 53) | i18);
                f60561s0 = i19 % 128;
                cr crVar = (cr) obj;
                Object[] objArr2 = new Object[2];
                if (i19 % 2 == 0) {
                    objArr2[0] = bVar;
                    objArr2[1] = crVar;
                    a(objArr2, -1602446825, 1602446826, System.identityHashCode(bVar));
                    return Unit.INSTANCE;
                }
                objArr2[0] = bVar;
                objArr2[1] = crVar;
                a(objArr2, -1602446825, 1602446826, System.identityHashCode(bVar));
                int i20 = 10 / 0;
                return Unit.INSTANCE;
            }
            b bVar2 = (b) objArr[0];
            cr crVar2 = (cr) objArr[1];
            int i21 = f60562t0;
            int i22 = (((i21 | 60) << 1) - (i21 ^ 60)) - 1;
            f60561s0 = i22 % 128;
            if (i22 % 2 != 0) {
                Intrinsics.checkNotNullParameter(crVar2, "");
                setFontFeatureSettings setfontfeaturesettings = bVar2.f60563p0;
                ((Boolean) setFontFeatureSettings.setCompoundDrawableTintBlendMode(new Object[]{setfontfeaturesettings}, 1612421959, -1612421951, System.identityHashCode(setfontfeaturesettings))).booleanValue();
                throw null;
            }
            Intrinsics.checkNotNullParameter(crVar2, "");
            setFontFeatureSettings setfontfeaturesettings2 = bVar2.f60563p0;
            if (((Boolean) setFontFeatureSettings.setCompoundDrawableTintBlendMode(new Object[]{setfontfeaturesettings2}, 1612421959, -1612421951, System.identityHashCode(setfontfeaturesettings2))).booleanValue()) {
                cr.setDividerPadding(new Object[]{crVar2, Boolean.TRUE}, 1459052326, -1459052324, System.identityHashCode(crVar2));
                int i23 = f60561s0;
                int i24 = i23 ^ 73;
                int i25 = ((i23 & 73) | i24) << 1;
                int i26 = -i24;
                int i27 = (i25 ^ i26) + ((i25 & i26) << 1);
                f60562t0 = i27 % 128;
                int i28 = i27 % 2;
            }
            setMax setmax = bVar2.f60564q0;
            Terminal terminal = (Terminal) setMax.setX(new Object[]{setmax}, -1116972605, 1116972608, System.identityHashCode(setmax));
            Terminal terminal2 = Terminal.KERNEL_3;
            Ref.BooleanRef booleanRef = bVar2.f60565r0;
            setFontFeatureSettings setfontfeaturesettings3 = bVar2.f60563p0;
            if (terminal != terminal2) {
                int i29 = f60561s0;
                int i30 = i29 & 41;
                int i31 = -(-(i29 | 41));
                int i32 = (i30 & i31) + (i31 | i30);
                f60562t0 = i32 % 128;
                int i33 = i32 % 2;
                if (!(!((Boolean) setFontFeatureSettings.setCompoundDrawableTintBlendMode(new Object[]{setfontfeaturesettings3}, -1512289586, 1512289586, System.identityHashCode(setfontfeaturesettings3))).booleanValue())) {
                    int i34 = f60561s0;
                    int i35 = (-2) - (((i34 & 12) + (i34 | 12)) ^ (-1));
                    f60562t0 = i35 % 128;
                    if (i35 % 2 == 0) {
                        cr.setDividerPadding(new Object[]{crVar2, Boolean.FALSE}, 1459052326, -1459052324, System.identityHashCode(crVar2));
                    } else {
                        cr.setDividerPadding(new Object[]{crVar2, Boolean.TRUE}, 1459052326, -1459052324, System.identityHashCode(crVar2));
                    }
                }
                if (((Boolean) setFontFeatureSettings.setCompoundDrawableTintBlendMode(new Object[]{setfontfeaturesettings3}, -1570467641, 1570467643, System.identityHashCode(setfontfeaturesettings3))).booleanValue()) {
                    int i36 = f60561s0;
                    int i37 = i36 & 101;
                    int i38 = -(-(i36 | 101));
                    int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
                    f60562t0 = i39 % 128;
                    int i40 = i39 % 2;
                    if (((Boolean) cr.setDividerPadding(new Object[]{crVar2}, -590986648, 590986653, System.identityHashCode(crVar2))).booleanValue()) {
                        booleanRef.element = false;
                        int i41 = f60561s0;
                        int i42 = i41 ^ 113;
                        int i43 = (((i41 & 113) | i42) << 1) - i42;
                        f60562t0 = i43 % 128;
                        int i44 = i43 % 2;
                    } else {
                        int i45 = f60561s0 + 119;
                        f60562t0 = i45 % 128;
                        if (i45 % 2 == 0) {
                            cr.setDividerPadding(new Object[]{crVar2, Boolean.FALSE}, 1459052326, -1459052324, System.identityHashCode(crVar2));
                        } else {
                            cr.setDividerPadding(new Object[]{crVar2, Boolean.TRUE}, 1459052326, -1459052324, System.identityHashCode(crVar2));
                        }
                    }
                }
            } else {
                booleanRef.element = true;
                int i46 = f60562t0;
                int i47 = (((i46 | 106) << 1) - (i46 ^ 106)) - 1;
                f60561s0 = i47 % 128;
                int i48 = i47 % 2;
            }
            if (((Terminal) setMax.setX(new Object[]{setmax}, -1116972605, 1116972608, System.identityHashCode(setmax))) == terminal2) {
                int i49 = f60562t0 + 89;
                f60561s0 = i49 % 128;
                if (i49 % 2 != 0) {
                    int i50 = 26 / 0;
                    if (!((Boolean) cr.setDividerPadding(new Object[]{crVar2}, 352286407, -352286406, System.identityHashCode(crVar2))).booleanValue()) {
                        if (!(!((Boolean) setFontFeatureSettings.setCompoundDrawableTintBlendMode(new Object[]{setfontfeaturesettings3}, -2133249192, 2133249203, System.identityHashCode(setfontfeaturesettings3))).booleanValue())) {
                            i13 = f60561s0 + 1;
                            f60562t0 = i13 % 128;
                            if (i13 % 2 == 0) {
                                cr.setDividerPadding(new Object[]{crVar2, Boolean.TRUE}, -2146251303, 2146251306, System.identityHashCode(crVar2));
                            } else {
                                cr.setDividerPadding(new Object[]{crVar2, Boolean.TRUE}, -2146251303, 2146251306, System.identityHashCode(crVar2));
                            }
                        }
                    }
                } else if (!((Boolean) cr.setDividerPadding(new Object[]{crVar2}, 352286407, -352286406, System.identityHashCode(crVar2))).booleanValue()) {
                    if (!(!((Boolean) setFontFeatureSettings.setCompoundDrawableTintBlendMode(new Object[]{setfontfeaturesettings3}, -2133249192, 2133249203, System.identityHashCode(setfontfeaturesettings3))).booleanValue())) {
                        i13 = f60561s0 + 1;
                        f60562t0 = i13 % 128;
                        if (i13 % 2 == 0) {
                            cr.setDividerPadding(new Object[]{crVar2, Boolean.TRUE}, -2146251303, 2146251306, System.identityHashCode(crVar2));
                        } else {
                            cr.setDividerPadding(new Object[]{crVar2, Boolean.TRUE}, -2146251303, 2146251306, System.identityHashCode(crVar2));
                        }
                    }
                }
            } else if (!(!((Boolean) setFontFeatureSettings.setCompoundDrawableTintBlendMode(new Object[]{setfontfeaturesettings3}, -2133249192, 2133249203, System.identityHashCode(setfontfeaturesettings3))).booleanValue())) {
                i13 = f60561s0 + 1;
                f60562t0 = i13 % 128;
                if (i13 % 2 == 0) {
                    cr.setDividerPadding(new Object[]{crVar2, Boolean.TRUE}, -2146251303, 2146251306, System.identityHashCode(crVar2));
                } else {
                    cr.setDividerPadding(new Object[]{crVar2, Boolean.TRUE}, -2146251303, 2146251306, System.identityHashCode(crVar2));
                }
            }
            crVar2.setDividerPadding();
            int i51 = f60561s0;
            int i52 = (((i51 ^ 39) | (i51 & 39)) << 1) - (((~i51) & 39) | (i51 & (-40)));
            f60562t0 = i52 % 128;
            int i53 = i52 % 2;
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(cr crVar) {
            return a(new Object[]{this, crVar}, -80465362, 80465362, System.identityHashCode(this));
        }
    }

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.setShadowLayer$setDividerPadding, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/mypinpad/tsdk/i/setShadowLayer$setDividerPadding;", "", "", "", "setOnFocusChangeListener", "[Ljava/lang/Long;", "setX", "<init>", "()V"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f60566a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f60567b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i11;
            int i14 = ~(i13 | i10);
            int i15 = ~i12;
            int i16 = ~(i15 | i10);
            if (((i13 | i16) * 712) + (((~(i10 | i11 | i12)) | (~(i13 | i15 | i10))) * (-712)) + ((i14 | i16) * (-712)) + (i11 * 713) + (i10 * (-711)) == 1) {
                me meVar = (me) objArr[0];
                int i17 = f60567b;
                int i18 = (i17 & (-8)) | ((~i17) & 7);
                int i19 = (i17 & 7) << 1;
                int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
                f60566a = i20 % 128;
                int i21 = i20 % 2;
                Long l6 = (Long) setCompoundDrawableTintBlendMode(new Object[]{meVar}, 958887331, -958887331, (int) System.currentTimeMillis());
                int i22 = f60566a;
                int i23 = i22 & 39;
                int i24 = -(-((i22 ^ 39) | i23));
                int i25 = (i23 & i24) + (i24 | i23);
                f60567b = i25 % 128;
                int i26 = i25 % 2;
                return l6;
            }
            me meVar2 = (me) objArr[0];
            int i27 = f60566a + 59;
            f60567b = i27 % 128;
            if (i27 % 2 == 0) {
                meVar2.setOnDragListener();
                throw null;
            }
            Byte onDragListener = meVar2.setOnDragListener();
            if (onDragListener == null) {
                int i28 = f60566a;
                int i29 = i28 & 61;
                int i30 = i29 + ((i28 ^ 61) | i29);
                f60567b = i30 % 128;
                if (i30 % 2 != 0) {
                    return null;
                }
                throw null;
            }
            byte bByteValue = onDragListener.byteValue();
            if (bByteValue >= ((Long[]) setShadowLayer.setDividerPadding(new Object[0], -1581758601, 1581758602, (int) System.currentTimeMillis())).length) {
                throw new fh(50, String.valueOf((int) bByteValue));
            }
            Long lValueOf = Long.valueOf(((Long[]) setShadowLayer.setDividerPadding(new Object[0], -1581758601, 1581758602, (int) System.currentTimeMillis()))[bByteValue].longValue());
            int i31 = f60567b;
            int i32 = i31 ^ 59;
            int i33 = (i31 & 59) << 1;
            int i34 = (i32 & i33) + (i33 | i32);
            f60566a = i34 % 128;
            if (i34 % 2 == 0) {
                return lValueOf;
            }
            int i35 = 28 / 0;
            return lValueOf;
        }

        public static final /* synthetic */ Long setDividerPadding(me meVar) {
            return (Long) setCompoundDrawableTintBlendMode(new Object[]{meVar}, 1431241485, -1431241484, (int) System.currentTimeMillis());
        }
    }

    public /* synthetic */ class setOnFocusChangeListener {
        public static final /* synthetic */ int[] setOnFocusChangeListener;

        static {
            int[] iArr = new int[Terminal.valuesCustom().length];
            iArr[Terminal.KERNEL_3.ordinal()] = 1;
            iArr[Terminal.KERNEL_4.ordinal()] = 2;
            iArr[Terminal.KERNEL_6.ordinal()] = 3;
            iArr[Terminal.KERNEL_EFTPOS.ordinal()] = 4;
            setOnFocusChangeListener = iArr;
            int i10 = (-1) - (~111);
            int i11 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
        }
    }

    static {
        int i10 = f60555c;
        int i11 = i10 & 81;
        int i12 = i11 + ((i10 ^ 81) | i11);
        f60556d = i12 % 128;
        int i13 = i12 % 2;
    }

    public setShadowLayer(@NotNull exceptionHandler exceptionhandler) {
        Intrinsics.checkNotNullParameter(exceptionhandler, "");
        this.f60557a = exceptionhandler;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x02ed  */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws Exception {
        Boolean bool;
        Object next;
        cs csVar;
        int i13 = ~i10;
        int i14 = (((~(i10 | i12)) | i11) * 272) + (((~(i13 | i12)) | (~(i13 | i11))) * (-272)) + (((~((~i11) | i13 | (~i12))) | (~(i10 | i11 | i12))) * (-272)) + (i11 * (-271)) + (i10 * 273);
        int i15 = 2;
        if (i14 == 1) {
            int i16 = f60555c;
            int i17 = (((i16 | 40) << 1) - (i16 ^ 40)) - 1;
            int i18 = i17 % 128;
            f60556d = i18;
            int i19 = i17 % 2;
            int i20 = (i18 ^ 119) + ((i18 & 119) << 1);
            f60555c = i20 % 128;
            int i21 = i20 % 2;
            return f60554b;
        }
        if (i14 == 2) {
            Terminal terminal = (Terminal) objArr[0];
            int i22 = f60555c;
            int i23 = i22 & 55;
            int i24 = (i23 - (~((i22 ^ 55) | i23))) - 1;
            f60556d = i24 % 128;
            if (i24 % 2 == 0) {
                int i25 = setOnFocusChangeListener.setOnFocusChangeListener[terminal.ordinal()];
                throw null;
            }
            int i26 = setOnFocusChangeListener.setOnFocusChangeListener[terminal.ordinal()];
            if (i26 == 1 || i26 == 2 || i26 == 3 || i26 == 4) {
                int i27 = f60555c;
                int i28 = i27 | 71;
                int i29 = ((i28 << 1) - (~(-((~(i27 & 71)) & i28)))) - 1;
                f60556d = i29 % 128;
                if (i29 % 2 == 0) {
                    throw null;
                }
                bool = Boolean.FALSE;
            } else {
                int i30 = f60555c;
                int i31 = i30 & 23;
                int i32 = -(-((i30 ^ 23) | i31));
                int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
                f60556d = i33 % 128;
                if (i33 % 2 == 0) {
                    int i34 = 30 / 0;
                    bool = Boolean.TRUE;
                } else {
                    bool = Boolean.TRUE;
                }
            }
            return bool;
        }
        if (i14 != 3) {
            setShadowLayer setshadowlayer = (setShadowLayer) objArr[0];
            me meVar = (me) objArr[1];
            Intrinsics.checkNotNullParameter(meVar, "");
            SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
            SouthPacificEndpoint.setX(new Object[]{10005, null, 6}, 1336485880, -1336485874, 10005);
            values valuesVar = new values();
            Long l6 = (Long) Companion.setCompoundDrawableTintBlendMode(new Object[]{meVar}, 1431241485, -1431241484, (int) System.currentTimeMillis());
            for (setMax setmax : setshadowlayer.f60557a.setOnFocusChangeListener(meVar.setCompoundDrawableTintBlendMode())) {
                Integer y7 = meVar.setY();
                Object[] objArr2 = new Object[i15];
                objArr2[0] = setmax;
                objArr2[1] = y7;
                setDividerPadding(objArr2, 1727918414, -1727918411, (int) System.currentTimeMillis());
                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                booleanRef.element = true;
                setFontFeatureSettings setfontfeaturesettings = new setFontFeatureSettings(false, false, false, false, null, 31, null);
                setMaxWidth setmaxwidth = (setMaxWidth) setMax.setX(new Object[]{setmax}, 466549121, -466549106, System.identityHashCode(setmax));
                setAnimation setanimation = setAnimation.INSTANCE;
                TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -692948779, 692948802, (int) System.currentTimeMillis());
                String str = (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed));
                Object[] objArr3 = new Object[i15];
                objArr3[0] = setmaxwidth;
                objArr3[1] = str;
                getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setMaxWidth.setX(objArr3, -480651882, 480651889, System.identityHashCode(setmaxwidth));
                if (getbeeponfailure == null) {
                    csVar = null;
                } else {
                    csVar = new cs(getbeeponfailure);
                    a aVar = a.f60558p0;
                    Object[] objArr4 = new Object[i15];
                    objArr4[0] = csVar;
                    objArr4[1] = aVar;
                }
                Object[] objArr5 = new Object[i15];
                objArr5[0] = setfontfeaturesettings;
                objArr5[1] = csVar;
                setFontFeatureSettings.setCompoundDrawableTintBlendMode(objArr5, -1309573751, 1309573755, System.identityHashCode(setfontfeaturesettings));
                if (((Boolean) setMax.setX(new Object[]{setmax}, 1497723990, -1497723985, System.identityHashCode(setmax))).booleanValue()) {
                    long layoutAnimation = meVar.setLayoutAnimation();
                    if (l6 != null && layoutAnimation == l6.longValue()) {
                        setFontFeatureSettings.setCompoundDrawableTintBlendMode(new Object[]{setfontfeaturesettings}, 797149146, -797149140, System.identityHashCode(setfontfeaturesettings));
                    }
                }
                if (meVar.setLayoutAnimation() == 0) {
                    if (Intrinsics.areEqual((Boolean) setMax.setX(new Object[]{setmax}, 1649969822, -1649969809, System.identityHashCode(setmax)), Boolean.FALSE)) {
                        booleanRef.element = false;
                    } else {
                        setFontFeatureSettings.setCompoundDrawableTintBlendMode(new Object[]{setfontfeaturesettings}, -1116953809, 1116953814, System.identityHashCode(setfontfeaturesettings));
                    }
                }
                if (((Terminal) setMax.setX(new Object[]{setmax}, -1116972605, 1116972608, System.identityHashCode(setmax))) == Terminal.KERNEL_13) {
                    setMaxWidth setmaxwidth2 = (setMaxWidth) setMax.setX(new Object[]{setmax}, 466549121, -466549106, System.identityHashCode(setmax));
                    TransactionFailed transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], 1249003821, -1249003575, (int) System.currentTimeMillis());
                    String str2 = (String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2));
                    Object[] objArr6 = new Object[i15];
                    objArr6[0] = setmaxwidth2;
                    objArr6[1] = str2;
                    getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) setMaxWidth.setX(objArr6, -480651882, 480651889, System.identityHashCode(setmaxwidth2));
                    if (getbeeponfailure2 == null) {
                        throw new setIndeterminateDrawable(3020, null, null, 6, null);
                    }
                    if (meVar.setLayoutAnimation() > ((Long) setInputExtras.setDividerPadding(new Object[]{(byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 252497730, -252497710, System.identityHashCode(getbeeponfailure2))}, -879493274, 879493283, (int) System.currentTimeMillis())).longValue()) {
                        booleanRef.element = false;
                    }
                } else if (((Long) setMax.setX(new Object[]{setmax}, 1485288090, -1485288080, System.identityHashCode(setmax))) != null) {
                    long layoutAnimation2 = meVar.setLayoutAnimation();
                    Long l7 = (Long) setMax.setX(new Object[]{setmax}, 1485288090, -1485288080, System.identityHashCode(setmax));
                    Intrinsics.checkNotNull(l7);
                    if (layoutAnimation2 > l7.longValue()) {
                        booleanRef.element = false;
                    } else if (!((Boolean) setDividerPadding(new Object[]{(Terminal) setMax.setX(new Object[]{setmax}, -1116972605, 1116972608, System.identityHashCode(setmax))}, 132465287, -132465285, (int) System.currentTimeMillis())).booleanValue()) {
                        long layoutAnimation3 = meVar.setLayoutAnimation();
                        Long l10 = (Long) setMax.setX(new Object[]{setmax}, 1485288090, -1485288080, System.identityHashCode(setmax));
                        Intrinsics.checkNotNull(l10);
                        if (layoutAnimation3 == l10.longValue()) {
                            booleanRef.element = false;
                        }
                    }
                }
                if (((Long) setMax.setX(new Object[]{setmax}, -830321268, 830321272, System.identityHashCode(setmax))) != null) {
                    long layoutAnimation4 = meVar.setLayoutAnimation();
                    Long l11 = (Long) setMax.setX(new Object[]{setmax}, -830321268, 830321272, System.identityHashCode(setmax));
                    Intrinsics.checkNotNull(l11);
                    if (layoutAnimation4 > l11.longValue()) {
                        setFontFeatureSettings.setCompoundDrawableTintBlendMode(new Object[]{setfontfeaturesettings}, -1486503178, 1486503191, System.identityHashCode(setfontfeaturesettings));
                    }
                }
                setMaxWidth setmaxwidth3 = (setMaxWidth) setMax.setX(new Object[]{setmax}, 466549121, -466549106, System.identityHashCode(setmax));
                TransactionFailed transactionFailed3 = (TransactionFailed) setAnimation.setY(new Object[0], 248525859, -248525591, (int) System.currentTimeMillis());
                getBeepOnFailure getbeeponfailure3 = (getBeepOnFailure) setMaxWidth.setX(new Object[]{setmaxwidth3, (String) TransactionFailed.setX(new Object[]{transactionFailed3}, 1914607362, -1914607356, System.identityHashCode(transactionFailed3))}, -480651882, 480651889, System.identityHashCode(setmaxwidth3));
                if (((Long) setMax.setX(new Object[]{setmax}, -830321268, 830321272, System.identityHashCode(setmax))) == null && getbeeponfailure3 != null && meVar.setLayoutAnimation() > ((Long) setInputExtras.setDividerPadding(new Object[]{(byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 252497730, -252497710, System.identityHashCode(getbeeponfailure3))}, -879493274, 879493283, (int) System.currentTimeMillis())).longValue()) {
                    setFontFeatureSettings.setCompoundDrawableTintBlendMode(new Object[]{setfontfeaturesettings}, -1486503178, 1486503191, System.identityHashCode(setfontfeaturesettings));
                }
                Long l12 = meVar.setX() ? 0L : (Long) setMax.setX(new Object[]{setmax}, 679016108, -679016106, System.identityHashCode(setmax));
                if (l12 != null && meVar.setLayoutAnimation() >= l12.longValue()) {
                    setFontFeatureSettings.setCompoundDrawableTintBlendMode(new Object[]{setfontfeaturesettings}, -607042329, 607042336, System.identityHashCode(setfontfeaturesettings));
                }
                cs csVar2 = (cs) setFontFeatureSettings.setCompoundDrawableTintBlendMode(new Object[]{setfontfeaturesettings}, -1608275827, 1608275837, System.identityHashCode(setfontfeaturesettings));
                if (csVar2 != null) {
                }
                if (booleanRef.element) {
                    values.setY(new Object[]{valuesVar, new setImageURI(setmax, setfontfeaturesettings)}, 1508320102, -1508320102, System.identityHashCode(valuesVar));
                }
                SouthPacificEndpoint southPacificEndpoint2 = SouthPacificEndpoint.setX;
                getDetailsFieldTextSizeSp[] getdetailsfieldtextsizespArr = new getDetailsFieldTextSizeSp[5];
                getdetailsfieldtextsizespArr[0] = (getDetailsFieldTextSizeSp) initialisedefault.setCompoundDrawableTintBlendMode(new Object[]{Boolean.valueOf(booleanRef.element)}, -772901588, 772901588, (int) System.currentTimeMillis());
                getdetailsfieldtextsizespArr[1] = setInputExtras.setNavigationOnClickListener(setmax.setY().setY());
                getdetailsfieldtextsizespArr[2] = setLogo.setX(setmax.setDividerPadding().setY());
                String alwaysDrawnWithCacheEnabled = setmax.setAlwaysDrawnWithCacheEnabled();
                getdetailsfieldtextsizespArr[3] = alwaysDrawnWithCacheEnabled == null ? null : (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{alwaysDrawnWithCacheEnabled}, 1240364979, -1240364979, (int) System.currentTimeMillis());
                getdetailsfieldtextsizespArr[4] = setLogo.setX(setmax.setX().setDividerPadding());
                SouthPacificEndpoint.setX(new Object[]{10006, new TerminalLogger(getdetailsfieldtextsizespArr, null, 2, null), 4}, 1336485880, -1336485874, 10006);
                i15 = 2;
            }
            return valuesVar;
        }
        setMax setmax2 = (setMax) objArr[0];
        Integer num = (Integer) objArr[1];
        int i35 = ~((int) System.currentTimeMillis());
        int i36 = (-543041) & i35;
        int i37 = ((-543041) | i35) & (~i36);
        int i38 = ((i37 & i36) | (i37 ^ i36)) * 494;
        int i39 = 1135156676 ^ i38;
        int i40 = ((i38 & 1135156676) | i39) << 1;
        int i41 = -i39;
        int i42 = (i40 & i41) + (i40 | i41);
        int i43 = (i35 & (-625633605)) | (i35 ^ (-625633605));
        int i44 = ~i43;
        int i45 = (i43 | i44) & i44;
        int i46 = ((~i45) & 1513198721) | ((-1513198722) & i45);
        int i47 = i45 & 1513198721;
        int i48 = ((i47 & i46) | (i46 ^ i47) | 625090564) * 494;
        int i49 = i42 & i48;
        int i50 = (i48 ^ i42) | i49;
        int i51 = (i49 & i50) + (i50 | i49);
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i52 = ~iCurrentTimeMillis;
        int i53 = (-1411273589) & i52;
        int i54 = ((~i52) & (-1411273589)) | (1411273588 & i52) | i53;
        int i55 = ~i54;
        int i56 = (i54 | i55) & i55;
        int i57 = (i56 & 1410859824) | (1410859824 ^ i56);
        int i58 = 1560237949 ^ iCurrentTimeMillis;
        int i59 = iCurrentTimeMillis & 1560237949;
        int i60 = ~((i58 ^ i59) | (i58 & i59));
        int i61 = ((~i60) & i57) | ((~i57) & i60);
        int i62 = i57 & i60;
        int i63 = ((i62 & i61) | (i61 ^ i62)) * (-502);
        int i64 = ((-1741841715) & i63) + (i63 | (-1741841715));
        int i65 = (i52 ^ (-1411273589)) | i53;
        int i66 = ~((i65 & 1559824185) | ((-1559824186) & i65) | ((~i65) & 1559824185));
        int i67 = i59 | i58;
        int i68 = ~i67;
        int i69 = (i67 | i68) & i68;
        int i70 = i66 & i69;
        int i71 = (i69 | i66) & (~i70);
        int i72 = -(-(((i71 & i70) | (i71 ^ i70)) * 502));
        int i73 = ((i64 ^ i72) | (i64 & i72)) << 1;
        int i74 = -((i72 & (~i64)) | ((~i72) & i64));
        if (i51 <= (i73 & i74) + (i74 | i73)) {
            ((List) setMax.setX(new Object[]{setmax2}, -1485936157, 1485936171, System.identityHashCode(setmax2))).iterator();
            throw null;
        }
        Iterator it = ((List) setMax.setX(new Object[]{setmax2}, -1485936157, 1485936171, System.identityHashCode(setmax2))).iterator();
        int i75 = f60555c;
        int i76 = i75 ^ 57;
        int i77 = -(-((i75 & 57) << 1));
        int i78 = (i76 ^ i77) + ((i77 & i76) << 1);
        f60556d = i78 % 128;
        int i79 = i78 % 2;
        while (true) {
            if (!it.hasNext()) {
                int i80 = f60556d;
                int i81 = i80 & 55;
                int i82 = ((i80 ^ 55) | i81) << 1;
                int i83 = -((i80 | 55) & (~i81));
                int i84 = (i82 ^ i83) + ((i83 & i82) << 1);
                f60555c = i84 % 128;
                int i85 = i84 % 2;
                next = null;
                break;
            }
            int i86 = f60556d;
            int i87 = i86 ^ 95;
            int i88 = (((i86 & 95) | i87) << 1) - i87;
            f60555c = i88 % 128;
            if (i88 % 2 != 0) {
                setNextFocusRightId setnextfocusrightid = (setNextFocusRightId) it.next();
                Integer.parseInt((String) setNextFocusRightId.setOnFocusChangeListener(new Object[]{setnextfocusrightid}, 1937295720, -1937295716, System.identityHashCode(setnextfocusrightid)));
                throw null;
            }
            next = it.next();
            setNextFocusRightId setnextfocusrightid2 = (setNextFocusRightId) next;
            int i89 = Integer.parseInt((String) setNextFocusRightId.setOnFocusChangeListener(new Object[]{setnextfocusrightid2}, 1937295720, -1937295716, System.identityHashCode(setnextfocusrightid2)));
            if (num != null) {
                if (i89 == num.intValue()) {
                    int i90 = f60556d;
                    int i91 = (((i90 ^ 61) | (i90 & 61)) << 1) - ((i90 & (-62)) | (61 & (~i90)));
                    f60555c = i91 % 128;
                    int i92 = i91 % 2;
                    int i93 = ((i90 | 49) << 1) - (i90 ^ 49);
                    int i94 = i93 % 128;
                    f60555c = i94;
                    int i95 = i93 % 2;
                    int i96 = ((i94 ^ 78) + ((i94 & 78) << 1)) - 1;
                    f60556d = i96 % 128;
                    if (i96 % 2 != 0) {
                        break;
                    }
                    int i97 = 46 / 0;
                    break;
                }
            } else {
                int i98 = f60555c;
                int i99 = i98 & 19;
                int i100 = (i98 ^ 19) | i99;
                int i101 = ((i99 | i100) << 1) - (i99 ^ i100);
                f60556d = i101 % 128;
                int i102 = i101 % 2;
                int i103 = (((i98 | 114) << 1) - (i98 ^ 114)) - 1;
                f60556d = i103 % 128;
                int i104 = i103 % 2;
            }
            int i105 = f60555c + 61;
            f60556d = i105 % 128;
            int i106 = i105 % 2;
        }
        setNextFocusRightId setnextfocusrightid3 = (setNextFocusRightId) next;
        if (setnextfocusrightid3 != null) {
            int i107 = f60555c;
            int i108 = i107 & 17;
            int i109 = i108 + ((i107 ^ 17) | i108);
            f60556d = i109 % 128;
            int i110 = i109 % 2;
            if (((Long) setNextFocusRightId.setOnFocusChangeListener(new Object[]{setnextfocusrightid3}, -530442036, 530442036, System.identityHashCode(setnextfocusrightid3))) != null) {
                int i111 = f60556d;
                int i112 = i111 ^ 23;
                int i113 = (i111 & 23) << 1;
                int i114 = ((i112 | i113) << 1) - (i113 ^ i112);
                f60555c = i114 % 128;
                int i115 = i114 % 2;
                setMax.setX(new Object[]{setmax2, (Long) setNextFocusRightId.setOnFocusChangeListener(new Object[]{setnextfocusrightid3}, -530442036, 530442036, System.identityHashCode(setnextfocusrightid3))}, 1897321794, -1897321793, System.identityHashCode(setmax2));
                System.currentTimeMillis();
                System.currentTimeMillis();
            }
            if (((Long) setNextFocusRightId.setOnFocusChangeListener(new Object[]{setnextfocusrightid3}, -1378069820, 1378069827, System.identityHashCode(setnextfocusrightid3))) != null) {
                int i116 = f60555c;
                int i117 = (i116 & 100) + (i116 | 100);
                int i118 = (i117 ^ (-1)) + (i117 << 1);
                f60556d = i118 % 128;
                int i119 = i118 % 2;
                setMax.setX(new Object[]{setmax2, (Long) setNextFocusRightId.setOnFocusChangeListener(new Object[]{setnextfocusrightid3}, -1378069820, 1378069827, System.identityHashCode(setnextfocusrightid3))}, -341693205, 341693224, System.identityHashCode(setmax2));
                int i120 = f60556d;
                int i121 = (-2) - (((i120 & 78) + (i120 | 78)) ^ (-1));
                f60555c = i121 % 128;
                int i122 = i121 % 2;
            }
            if (((Long) setNextFocusRightId.setOnFocusChangeListener(new Object[]{setnextfocusrightid3}, -2040215454, 2040215456, System.identityHashCode(setnextfocusrightid3))) != null) {
                int i123 = f60556d;
                int i124 = i123 ^ 75;
                int i125 = (i123 & 75) << 1;
                int i126 = (i124 ^ i125) + ((i125 & i124) << 1);
                f60555c = i126 % 128;
                int i127 = i126 % 2;
                setMax.setX(new Object[]{setmax2, (Long) setNextFocusRightId.setOnFocusChangeListener(new Object[]{setnextfocusrightid3}, -2040215454, 2040215456, System.identityHashCode(setnextfocusrightid3))}, -1969237334, 1969237340, System.identityHashCode(setmax2));
                int i128 = f60556d;
                int i129 = (i128 & 79) + (i128 | 79);
                f60555c = i129 % 128;
                int i130 = i129 % 2;
            }
            setMaxWidth setmaxwidth4 = (setMaxWidth) setMax.setX(new Object[]{setmax2}, 466549121, -466549106, System.identityHashCode(setmax2));
            setMaxWidth.setX(new Object[]{setmaxwidth4, (setMaxWidth) setNextFocusRightId.setOnFocusChangeListener(new Object[]{setnextfocusrightid3}, -1587359231, 1587359237, System.identityHashCode(setnextfocusrightid3))}, 1087552335, -1087552333, System.identityHashCode(setmaxwidth4));
            int i131 = f60556d + 5;
            f60555c = i131 % 128;
            int i132 = i131 % 2;
        }
        int i133 = f60556d;
        int i134 = ((i133 | 123) << 1) - (i133 ^ 123);
        f60555c = i134 % 128;
        if (i134 % 2 != 0) {
            int i135 = 20 / 0;
        }
        return null;
    }

    @NotNull
    public final values setCompoundDrawableTintBlendMode(@NotNull me p4) {
        return (values) setDividerPadding(new Object[]{this, p4}, 1207297972, -1207297972, System.identityHashCode(this));
    }

    public static final /* synthetic */ Long[] setDividerPadding() {
        return (Long[]) setDividerPadding(new Object[0], -1581758601, 1581758602, (int) System.currentTimeMillis());
    }
}
