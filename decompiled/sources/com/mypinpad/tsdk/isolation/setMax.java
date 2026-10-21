package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.android.gms.wearable.WearableStatusCodes;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0011\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010D\u001a\u00020\u001c\u0012\b\b\u0002\u0010E\u001a\u00020\u0006\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010G\u001a\u00020\u0006\u0012\b\b\u0002\u0010H\u001a\u00020\u0006\u0012\b\b\u0002\u0010I\u001a\u00020\u0006\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u000100\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u000100\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u000100\u0012\u000e\b\u0002\u0010M\u001a\b\u0012\u0004\u0012\u00020:09\u0012\b\b\u0002\u0010N\u001a\u00020\u0004\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\t¢\u0006\u0004\bP\u0010QJ\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u001c8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010%\u001a\u00020\u00068\u0007X\u0087\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010)\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u0007\u0010(R\u001a\u0010\u001f\u001a\u00020\u00068\u0007X\u0087\u0006¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b+\u0010$R\u001a\u0010-\u001a\u00020\u00068\u0007X\u0087\u0006¢\u0006\f\n\u0004\b,\u0010\"\u001a\u0004\b-\u0010$R\u001a\u0010+\u001a\u00020\u00068\u0007X\u0087\u0006¢\u0006\f\n\u0004\b.\u0010\"\u001a\u0004\b/\u0010$R$\u00105\u001a\u0004\u0018\u0001008\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b\u001b\u00103\"\u0004\b\u0014\u00104R$\u0010/\u001a\u0004\u0018\u0001008\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b6\u00102\u001a\u0004\b7\u00103\"\u0004\b\u001f\u00104R$\u00107\u001a\u0004\u0018\u0001008\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b8\u00102\u001a\u0004\b\u0016\u00103\"\u0004\b\u0007\u00104R \u0010#\u001a\b\u0012\u0004\u0012\u00020:098\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b%\u0010=R\u001a\u0010\u0019\u001a\u00020\u00048\u0007X\u0087\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\b)\u0010\u000b"}, d2 = {"Lcom/mypinpad/tsdk/i/setMax;", "", "Lcom/mypinpad/tsdk/i/Terminal;", "p0", "Lcom/mypinpad/tsdk/i/setMaxWidth;", "p1", "", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/Terminal;Lcom/mypinpad/tsdk/i/setMaxWidth;)Z", "", "toString", "()Ljava/lang/String;", "", GenerateActivationFormCommand.HASH_CODE, "()I", "equals", "(Ljava/lang/Object;)Z", "Lcom/mypinpad/tsdk/i/md;", "a", "Lcom/mypinpad/tsdk/i/md;", "setX", "()Lcom/mypinpad/tsdk/i/md;", "setIncludeFontPadding", "b", "Lcom/mypinpad/tsdk/i/Terminal;", "setDividerPadding", "()Lcom/mypinpad/tsdk/i/Terminal;", "setNavigationOnClickListener", "Lcom/mypinpad/tsdk/i/setBackgroundTintList;", "c", "Lcom/mypinpad/tsdk/i/setBackgroundTintList;", "setY", "()Lcom/mypinpad/tsdk/i/setBackgroundTintList;", "d", "Z", "setCompoundDrawableTintBlendMode", "()Z", "setZ", "e", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "setAlwaysDrawnWithCacheEnabled", "f", "setLayoutAnimation", "g", "getNavBarTitleString", "h", "setOnDragListener", "", "i", "Ljava/lang/Long;", "()Ljava/lang/Long;", "(Ljava/lang/Long;)V", "UiMessageCallbackKtWhenMappings", "j", "setOnLongClickListener", "k", "", "Lcom/mypinpad/tsdk/i/setNextFocusRightId;", "l", "Ljava/util/List;", "()Ljava/util/List;", "m", "Lcom/mypinpad/tsdk/i/setMaxWidth;", "setTextAlignment", "()Lcom/mypinpad/tsdk/i/setMaxWidth;", "n", "Ljava/lang/String;", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "<init>", "(Lcom/mypinpad/tsdk/i/md;Lcom/mypinpad/tsdk/i/Terminal;Lcom/mypinpad/tsdk/i/setBackgroundTintList;ZLjava/lang/Boolean;ZZZLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Lcom/mypinpad/tsdk/i/setMaxWidth;Ljava/lang/String;)V"}, k = 1, mv = {1, 5, 1})
public final /* data */ class setMax {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f60053o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f60054p = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final md setIncludeFontPadding;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Terminal setNavigationOnClickListener;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final setBackgroundTintList setOnFocusChangeListener;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final boolean setZ;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Boolean setAlwaysDrawnWithCacheEnabled;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final boolean setY;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final boolean getNavBarTitleString;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final boolean setLayoutAnimation;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Long UiMessageCallbackKtWhenMappings;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Long setOnDragListener;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Long setOnLongClickListener;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<setNextFocusRightId> setCompoundDrawableTintBlendMode;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final setMaxWidth setDividerPadding;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String setX;

    public static final class a extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f60068q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f60069r0 = 1;

        public a() {
            super(0);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x00c6  */
        /* JADX WARN: Code duplicated, block: B:18:0x00cd  */
        public static /* synthetic */ Boolean a(Object[] objArr, int i10, int i11, int i12) {
            Boolean boolValueOf;
            int i13 = (((~(i10 | (~i12))) | (~i11)) * 305) + (((~(i10 | i11)) | (~(i10 | i12))) * 305) + (i11 * 306) + (i10 * 306) + TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS;
            boolean z10 = false;
            if (i13 != 1) {
                a aVar = (a) objArr[0];
                int i14 = f60069r0;
                int i15 = i14 & 35;
                int i16 = (i15 - (~(-(-((i14 ^ 35) | i15))))) - 1;
                f60068q0 = i16 % 128;
                int i17 = i16 % 2;
                boolValueOf = a(new Object[]{aVar}, -1640314882, 1640314883, System.identityHashCode(aVar));
                int i18 = f60069r0;
                int i19 = i18 & 21;
                int i20 = i19 + ((i18 ^ 21) | i19);
                f60068q0 = i20 % 128;
                if (i20 % 2 != 0) {
                    int i21 = 91 / 0;
                }
            } else {
                a aVar2 = (a) objArr[0];
                int i22 = f60069r0;
                int i23 = i22 & 25;
                int i24 = (i22 ^ 25) | i23;
                int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
                f60068q0 = i25 % 128;
                int i26 = i25 % 2;
                setMax setmax = setMax.this;
                if (((Terminal) setMax.setX(new Object[]{setmax}, -1116972605, 1116972608, System.identityHashCode(setmax))) != Terminal.KERNEL_13) {
                    int i27 = f60068q0 + 125;
                    f60069r0 = i27 % 128;
                    int i28 = i27 % 2;
                    setMax setmax2 = setMax.this;
                    if (i28 == 0) {
                        int i29 = 0 / 0;
                        if (((md) setMax.setX(new Object[]{setmax2}, 1678059478, -1678059469, System.identityHashCode(setmax2))) != md.getNavBarTitleString) {
                            int i30 = f60069r0;
                            int i31 = ((i30 | 103) << 1) - (i30 ^ 103);
                            f60068q0 = i31 % 128;
                            int i32 = i31 % 2;
                            z10 = true;
                        } else {
                            System.identityHashCode(aVar2);
                            System.identityHashCode(aVar2);
                        }
                    } else if (((md) setMax.setX(new Object[]{setmax2}, 1678059478, -1678059469, System.identityHashCode(setmax2))) != md.getNavBarTitleString) {
                        int i33 = f60069r0;
                        int i34 = ((i33 | 103) << 1) - (i33 ^ 103);
                        f60068q0 = i34 % 128;
                        int i35 = i34 % 2;
                        z10 = true;
                    } else {
                        System.identityHashCode(aVar2);
                        System.identityHashCode(aVar2);
                    }
                } else {
                    int i36 = f60069r0;
                    int i37 = ((i36 | 103) << 1) - (i36 ^ 103);
                    f60068q0 = i37 % 128;
                    int i38 = i37 % 2;
                    z10 = true;
                }
                boolValueOf = Boolean.valueOf(z10);
                int i39 = f60069r0;
                int i40 = (i39 & (-60)) | ((~i39) & 59);
                int i41 = -(-((i39 & 59) << 1));
                int i42 = (i40 ^ i41) + ((i41 & i40) << 1);
                f60068q0 = i42 % 128;
                if (i42 % 2 != 0) {
                    throw null;
                }
            }
            return boolValueOf;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Boolean invoke() {
            return a(new Object[]{this}, 751233306, -751233306, System.identityHashCode(this));
        }
    }

    public static final class b extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f60071q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f60072r0 = 1;

        public b() {
            super(0);
        }

        public static /* synthetic */ Boolean a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ((i10 | i11) * (-366)) + (i11 * 367) + (i10 * 367);
            int i14 = ~i11;
            if ((((~(i10 | i14 | i12)) | (~(i11 | (~i10)))) * 366) + (((~(i14 | i12)) | i10) * (-366)) + i13 != 1) {
                b bVar = (b) objArr[0];
                int i15 = f60071q0 + 109;
                f60072r0 = i15 % 128;
                int i16 = i15 % 2;
                setMax setmax = setMax.this;
                Boolean boolValueOf = Boolean.valueOf(((Boolean) setTitleMargin.setX(new Object[]{(Long) setMax.setX(new Object[]{setmax}, 679016108, -679016106, System.identityHashCode(setmax))}, -197290940, 197290941, (int) System.currentTimeMillis())).booleanValue());
                int i17 = f60071q0;
                int i18 = i17 & 9;
                int i19 = (i18 - (~((i17 ^ 9) | i18))) - 1;
                f60072r0 = i19 % 128;
                int i20 = i19 % 2;
                return boolValueOf;
            }
            b bVar2 = (b) objArr[0];
            int i21 = f60072r0;
            int i22 = (i21 & (-106)) | ((~i21) & 105);
            int i23 = -(-((i21 & 105) << 1));
            int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
            f60071q0 = i24 % 128;
            int i25 = i24 % 2;
            Boolean boolA = a(new Object[]{bVar2}, -1439307313, 1439307313, System.identityHashCode(bVar2));
            int i26 = f60071q0;
            int i27 = ((i26 & 12) + (i26 | 12)) - 1;
            f60072r0 = i27 % 128;
            int i28 = i27 % 2;
            return boolA;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Boolean invoke() {
            return a(new Object[]{this}, -1295845997, 1295845998, System.identityHashCode(this));
        }
    }

    public static final class c extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static int f60074t0 = 0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public static int f60075u0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Terminal f60076p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ setMaxWidth f60077q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ setMax f60078r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ setNextFocusRightId f60079s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Terminal terminal, setMaxWidth setmaxwidth, setMax setmax, setNextFocusRightId setnextfocusrightid) {
            super(0);
            this.f60076p0 = terminal;
            this.f60077q0 = setmaxwidth;
            this.f60078r0 = setmax;
            this.f60079s0 = setnextfocusrightid;
        }

        public static /* synthetic */ Boolean a(Object[] objArr, int i10, int i11, int i12) throws Exception {
            int i13 = (i11 * (-463)) + (i10 * 465);
            int i14 = ~i11;
            int i15 = ~i12;
            int i16 = ~(i14 | i15);
            int i17 = ~(i14 | i10);
            if ((((~(i10 | i12)) | i17) * 464) + ((i14 | (~i10) | i12) * (-464)) + (((~(i15 | i10)) | i16 | i17) * 464) + i13 == 1) {
                c cVar = (c) objArr[0];
                setMaxWidth setmaxwidth = new setMaxWidth();
                setMaxWidth.setX(new Object[]{setmaxwidth, cVar.f60077q0}, 1087552335, -1087552333, System.identityHashCode(setmaxwidth));
                setMax setmax = cVar.f60078r0;
                setMaxWidth.setX(new Object[]{setmaxwidth, (setMaxWidth) setMax.setX(new Object[]{setmax}, 466549121, -466549106, System.identityHashCode(setmax))}, 1087552335, -1087552333, System.identityHashCode(setmaxwidth));
                setNextFocusRightId setnextfocusrightid = cVar.f60079s0;
                setMaxWidth.setX(new Object[]{setmaxwidth, (setMaxWidth) setNextFocusRightId.setOnFocusChangeListener(new Object[]{setnextfocusrightid}, -1587359231, 1587359237, System.identityHashCode(setnextfocusrightid))}, 1087552335, -1087552333, System.identityHashCode(setmaxwidth));
                Boolean boolValueOf = Boolean.valueOf(((Boolean) setMaxWidth.setX(new Object[]{setmaxwidth, cVar.f60076p0, new setTextSize[0]}, 114360989, -114360961, System.identityHashCode(setmaxwidth))).booleanValue());
                int i18 = f60075u0 + 49;
                f60074t0 = i18 % 128;
                int i19 = i18 % 2;
                return boolValueOf;
            }
            c cVar2 = (c) objArr[0];
            int i20 = f60074t0;
            int i21 = i20 & 79;
            int i22 = ((((i20 ^ 79) | i21) << 1) - (~(-((i20 | 79) & (~i21))))) - 1;
            f60075u0 = i22 % 128;
            int i23 = i22 % 2;
            Boolean boolA = a(new Object[]{cVar2}, 640184006, -640184005, System.identityHashCode(cVar2));
            int i24 = f60074t0;
            int i25 = (i24 & 99) + (i24 | 99);
            f60075u0 = i25 % 128;
            if (i25 % 2 != 0) {
                return boolA;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Boolean invoke() {
            return a(new Object[]{this}, 1975491074, -1975491074, System.identityHashCode(this));
        }
    }

    public static final class d extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f60080q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f60081r0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ setNextFocusRightId f60082p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(setNextFocusRightId setnextfocusrightid) {
            super(0);
            this.f60082p0 = setnextfocusrightid;
        }

        public static /* synthetic */ Boolean a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = ~i11;
            int i15 = (~(i13 | i14)) | (~(i14 | i12));
            int i16 = ~i12;
            int i17 = i16 | i10;
            if (((~i17) * 886) + ((i10 | (~(i11 | i16))) * (-1772)) + ((i15 | (~(i17 | i11))) * 886) + (i11 * (-885)) + (i10 * 1773) != 1) {
                d dVar = (d) objArr[0];
                int i18 = f60080q0;
                int i19 = i18 & 79;
                int i20 = ((i18 | 79) & (~i19)) + (i19 << 1);
                f60081r0 = i20 % 128;
                if (i20 % 2 != 0) {
                    return a(new Object[]{dVar}, 886497004, -886497003, System.identityHashCode(dVar));
                }
                a(new Object[]{dVar}, 886497004, -886497003, System.identityHashCode(dVar));
                throw null;
            }
            d dVar2 = (d) objArr[0];
            int i21 = f60080q0;
            int i22 = ((i21 | 6) << 1) - (i21 ^ 6);
            int i23 = (i22 ^ (-1)) + (i22 << 1);
            f60081r0 = i23 % 128;
            int i24 = i23 % 2;
            setNextFocusRightId setnextfocusrightid = dVar2.f60082p0;
            Boolean boolValueOf = Boolean.valueOf(((Boolean) setTitleMargin.setX(new Object[]{(Long) setNextFocusRightId.setOnFocusChangeListener(new Object[]{setnextfocusrightid}, -2040215454, 2040215456, System.identityHashCode(setnextfocusrightid))}, -197290940, 197290941, (int) System.currentTimeMillis())).booleanValue());
            int i25 = f60081r0;
            int i26 = ((i25 & 88) + (i25 | 88)) - 1;
            f60080q0 = i26 % 128;
            int i27 = i26 % 2;
            return boolValueOf;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Boolean invoke() {
            return a(new Object[]{this}, 398787870, -398787870, System.identityHashCode(this));
        }
    }

    public static final class e extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ setNextFocusRightId f60083p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(setNextFocusRightId setnextfocusrightid) {
            super(0);
            this.f60083p0 = setnextfocusrightid;
        }

        public static /* synthetic */ Boolean a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = ~i11;
            if (((i10 | i12) * 104) + ((~(i11 | (~i12) | i10)) * (-104)) + (((~(i13 | i14)) | (~(i14 | i12))) * 104) + (i11 * (-103)) + (i10 * (-103)) != 1) {
                e eVar = (e) objArr[0];
                return a(new Object[]{eVar}, -282078341, 282078342, System.identityHashCode(eVar));
            }
            setNextFocusRightId setnextfocusrightid = ((e) objArr[0]).f60083p0;
            return Boolean.valueOf(((Boolean) setTitleMargin.setX(new Object[]{(Long) setNextFocusRightId.setOnFocusChangeListener(new Object[]{setnextfocusrightid}, -530442036, 530442036, System.identityHashCode(setnextfocusrightid))}, -197290940, 197290941, (int) System.currentTimeMillis())).booleanValue());
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Boolean invoke() {
            return a(new Object[]{this}, 1444820411, -1444820411, System.identityHashCode(this));
        }
    }

    public static final class f extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f60084q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f60085r0 = 1;

        public f() {
            super(0);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x007f  */
        public static /* synthetic */ Boolean a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~((~i10) | i11);
            int i14 = ~i12;
            int i15 = (((~(i14 | i11)) | i13) * (-1188)) + (i11 * (-1187)) + (i10 * 595);
            int i16 = ~i11;
            int i17 = (~(i12 | i16)) | i13;
            int i18 = ~(i14 | i10);
            int i19 = (((~(i10 | i16)) | (~(i16 | i14)) | i18) * 594) + ((i17 | i18) * 594) + i15;
            boolean z10 = false;
            if (i19 == 1) {
                f fVar = (f) objArr[0];
                int i20 = f60084q0;
                int i21 = i20 & 67;
                int i22 = ((((i20 ^ 67) | i21) << 1) - (~(-((i20 | 67) & (~i21))))) - 1;
                f60085r0 = i22 % 128;
                if (i22 % 2 != 0) {
                    return a(new Object[]{fVar}, -488439922, 488439922, System.identityHashCode(fVar));
                }
                a(new Object[]{fVar}, -488439922, 488439922, System.identityHashCode(fVar));
                throw null;
            }
            f fVar2 = (f) objArr[0];
            int i23 = f60085r0 + 3;
            f60084q0 = i23 % 128;
            if (i23 % 2 != 0) {
                setMax setmax = setMax.this;
                Terminal.Companion companion = Terminal.INSTANCE;
                throw null;
            }
            setMax setmax2 = setMax.this;
            if (((Terminal) setMax.setX(new Object[]{setmax2}, -1116972605, 1116972608, System.identityHashCode(setmax2))) != Terminal.KERNEL_13) {
                setMax setmax3 = setMax.this;
                if (((md) setMax.setX(new Object[]{setmax3}, 1678059478, -1678059469, System.identityHashCode(setmax3))) != md.setLayoutAnimation) {
                    int i24 = f60085r0;
                    int i25 = i24 & 7;
                    int i26 = (i25 - (~((i24 ^ 7) | i25))) - 1;
                    f60084q0 = i26 % 128;
                    int i27 = i26 % 2;
                    z10 = true;
                } else {
                    int i28 = f60084q0;
                    int i29 = ((i28 ^ 32) + ((i28 & 32) << 1)) - 1;
                    f60085r0 = i29 % 128;
                    int i30 = i29 % 2;
                }
            } else {
                int i210 = f60085r0;
                int i211 = i210 & 7;
                int i212 = (i211 - (~((i210 ^ 7) | i211))) - 1;
                f60084q0 = i212 % 128;
                int i213 = i212 % 2;
                z10 = true;
            }
            Boolean boolValueOf = Boolean.valueOf(z10);
            int i31 = f60084q0;
            int i32 = ((i31 | 13) << 1) - (i31 ^ 13);
            f60085r0 = i32 % 128;
            int i33 = i32 % 2;
            return boolValueOf;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Boolean invoke() {
            return a(new Object[]{this}, 746103097, -746103096, System.identityHashCode(this));
        }
    }

    public static final class g extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f60087q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f60088r0 = 1;

        public g() {
            super(0);
        }

        public static /* synthetic */ Boolean a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~((~i10) | (~i11));
            int i14 = ~i12;
            if (((i10 | i11 | i12) * 220) + (((~(i14 | i11)) | i10) * (-440)) + ((i13 | (~(i14 | i10 | i11))) * 220) + (i11 * (-219)) + (i10 * 221) == 1) {
                g gVar = (g) objArr[0];
                int i15 = f60088r0 + 3;
                f60087q0 = i15 % 128;
                if (i15 % 2 == 0) {
                    return a(new Object[]{gVar}, -1234619134, 1234619134, System.identityHashCode(gVar));
                }
                int i16 = 12 / 0;
                return a(new Object[]{gVar}, -1234619134, 1234619134, System.identityHashCode(gVar));
            }
            g gVar2 = (g) objArr[0];
            int i17 = f60087q0;
            int i18 = i17 & 85;
            int i19 = -(-(i17 | 85));
            int i20 = (i18 & i19) + (i19 | i18);
            f60088r0 = i20 % 128;
            int i21 = i20 % 2;
            setMax setmax = setMax.this;
            Boolean boolValueOf = Boolean.valueOf(((Boolean) setTitleMargin.setX(new Object[]{(Long) setMax.setX(new Object[]{setmax}, -830321268, 830321272, System.identityHashCode(setmax))}, -197290940, 197290941, (int) System.currentTimeMillis())).booleanValue());
            int i22 = f60087q0;
            int i23 = (i22 ^ 15) + ((i22 & 15) << 1);
            f60088r0 = i23 % 128;
            int i24 = i23 % 2;
            return boolValueOf;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Boolean invoke() {
            return a(new Object[]{this}, -2074100343, 2074100344, System.identityHashCode(this));
        }
    }

    public static final class h extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f60090q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f60091r0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ setNextFocusRightId f60092p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(setNextFocusRightId setnextfocusrightid) {
            super(0);
            this.f60092p0 = setnextfocusrightid;
        }

        public static /* synthetic */ Boolean a(Object[] objArr, int i10, int i11, int i12) {
            Boolean boolValueOf;
            int i13 = ~i10;
            if ((((~(i10 | i11)) | (~(i12 | i13))) * 433) + (((~((~i11) | i12)) | i13) * (-433)) + ((~((~i12) | i13 | i11)) * 433) + (i11 * 434) + (i10 * (-432)) == 1) {
                h hVar = (h) objArr[0];
                int i14 = f60090q0;
                int i15 = i14 & 63;
                int i16 = (i14 ^ 63) | i15;
                int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
                f60091r0 = i17 % 128;
                int i18 = i17 % 2;
                Boolean boolA = a(new Object[]{hVar}, 378234262, -378234262, System.identityHashCode(hVar));
                int i19 = f60091r0;
                int i20 = ((i19 ^ 103) - (~(-(-((i19 & 103) << 1))))) - 1;
                f60090q0 = i20 % 128;
                int i21 = i20 % 2;
                return boolA;
            }
            h hVar2 = (h) objArr[0];
            int i22 = f60090q0;
            int i23 = ((i22 & (-48)) | ((~i22) & 47)) + ((i22 & 47) << 1);
            f60091r0 = i23 % 128;
            int i24 = i23 % 2;
            setNextFocusRightId setnextfocusrightid = hVar2.f60092p0;
            if (i24 == 0) {
                boolValueOf = Boolean.valueOf(((Boolean) setTitleMargin.setX(new Object[]{(Long) setNextFocusRightId.setOnFocusChangeListener(new Object[]{setnextfocusrightid}, -1378069820, 1378069827, System.identityHashCode(setnextfocusrightid))}, -197290940, 197290941, (int) System.currentTimeMillis())).booleanValue());
                int i25 = 88 / 0;
            } else {
                boolValueOf = Boolean.valueOf(((Boolean) setTitleMargin.setX(new Object[]{(Long) setNextFocusRightId.setOnFocusChangeListener(new Object[]{setnextfocusrightid}, -1378069820, 1378069827, System.identityHashCode(setnextfocusrightid))}, -197290940, 197290941, (int) System.currentTimeMillis())).booleanValue());
            }
            int i26 = f60091r0;
            int i27 = (i26 & 65) + (i26 | 65);
            f60090q0 = i27 % 128;
            int i28 = i27 % 2;
            return boolValueOf;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Boolean invoke() {
            return a(new Object[]{this}, 728904573, -728904572, System.identityHashCode(this));
        }
    }

    public static final class i extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Terminal f60093p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ setMaxWidth f60094q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ setMax f60095r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Terminal terminal, setMaxWidth setmaxwidth, setMax setmax) {
            super(0);
            this.f60093p0 = terminal;
            this.f60094q0 = setmaxwidth;
            this.f60095r0 = setmax;
        }

        public static /* synthetic */ Boolean a(Object[] objArr, int i10, int i11, int i12) throws Exception {
            int i13 = ~i12;
            if ((((~((~i10) | i11)) | (~(i11 | i13))) * 560) + ((~(i12 | (~i11) | i10)) * (-560)) + ((~(i13 | i10)) * (-560)) + (i11 * 561) + (i10 * (-559)) == 1) {
                i iVar = (i) objArr[0];
                return a(new Object[]{iVar}, -1977784556, 1977784556, System.identityHashCode(iVar));
            }
            i iVar2 = (i) objArr[0];
            setMaxWidth setmaxwidth = new setMaxWidth();
            setMaxWidth.setX(new Object[]{setmaxwidth, iVar2.f60094q0}, 1087552335, -1087552333, System.identityHashCode(setmaxwidth));
            setMax setmax = iVar2.f60095r0;
            setMaxWidth.setX(new Object[]{setmaxwidth, (setMaxWidth) setMax.setX(new Object[]{setmax}, 466549121, -466549106, System.identityHashCode(setmax))}, 1087552335, -1087552333, System.identityHashCode(setmaxwidth));
            return Boolean.valueOf(((Boolean) setMaxWidth.setX(new Object[]{setmaxwidth, iVar2.f60093p0, new setTextSize[0]}, 114360989, -114360961, System.identityHashCode(setmaxwidth))).booleanValue());
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Boolean invoke() {
            return a(new Object[]{this}, -439978034, 439978035, System.identityHashCode(this));
        }
    }

    public static final class j extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f60096q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f60097r0 = 1;

        public j() {
            super(0);
        }

        public static /* synthetic */ Boolean a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i11;
            int i14 = ~i12;
            if ((((~(i10 | i14 | i11)) | (~(i12 | i13)) | (~((~i10) | i13))) * 988) + ((i10 | i13) * (-988)) + (((~(i13 | i14 | i10)) | (~(i10 | i11 | i12))) * 988) + (i11 * (-987)) + (i10 * 989) != 1) {
                j jVar = (j) objArr[0];
                int i15 = f60096q0;
                int i16 = ((i15 | 3) << 1) - (i15 ^ 3);
                f60097r0 = i16 % 128;
                Object[] objArr2 = new Object[1];
                if (i16 % 2 != 0) {
                    objArr2[0] = jVar;
                    return a(objArr2, -336137834, 336137835, System.identityHashCode(jVar));
                }
                objArr2[0] = jVar;
                a(objArr2, -336137834, 336137835, System.identityHashCode(jVar));
                throw null;
            }
            j jVar2 = (j) objArr[0];
            int i17 = f60097r0;
            int i18 = i17 & 45;
            int i19 = -(-(i17 | 45));
            int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
            f60096q0 = i20 % 128;
            int i21 = i20 % 2;
            setMax setmax = setMax.this;
            Boolean boolValueOf = Boolean.valueOf(((Boolean) setTitleMargin.setX(new Object[]{(Long) setMax.setX(new Object[]{setmax}, 1485288090, -1485288080, System.identityHashCode(setmax))}, -197290940, 197290941, (int) System.currentTimeMillis())).booleanValue());
            int i22 = f60096q0;
            int i23 = i22 ^ 71;
            int i24 = (((i22 & 71) | i23) << 1) - i23;
            f60097r0 = i24 % 128;
            if (i24 % 2 != 0) {
                return boolValueOf;
            }
            int i25 = 57 / 0;
            return boolValueOf;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Boolean invoke() {
            return a(new Object[]{this}, -1173090746, 1173090746, System.identityHashCode(this));
        }
    }

    public setMax(@NotNull md mdVar, @NotNull Terminal terminal, @NotNull setBackgroundTintList setbackgroundtintlist, boolean z10, @Nullable Boolean bool, boolean z11, boolean z12, boolean z13, @Nullable Long l6, @Nullable Long l7, @Nullable Long l10, @NotNull List<setNextFocusRightId> list, @NotNull setMaxWidth setmaxwidth, @Nullable String str) {
        Intrinsics.checkNotNullParameter(mdVar, "");
        Intrinsics.checkNotNullParameter(terminal, "");
        Intrinsics.checkNotNullParameter(setbackgroundtintlist, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(setmaxwidth, "");
        this.setIncludeFontPadding = mdVar;
        this.setNavigationOnClickListener = terminal;
        this.setOnFocusChangeListener = setbackgroundtintlist;
        this.setZ = z10;
        this.setAlwaysDrawnWithCacheEnabled = bool;
        this.setY = z11;
        this.getNavBarTitleString = z12;
        this.setLayoutAnimation = z13;
        this.UiMessageCallbackKtWhenMappings = l6;
        this.setOnDragListener = l7;
        this.setOnLongClickListener = l10;
        this.setCompoundDrawableTintBlendMode = list;
        this.setDividerPadding = setmaxwidth;
        this.setX = str;
    }

    public static /* synthetic */ List a(Object[] objArr) {
        setMax setmax = (setMax) objArr[0];
        int i10 = f60054p;
        int i11 = i10 & 51;
        int i12 = (~i11) & (i10 | 51);
        int i13 = i11 << 1;
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        f60053o = i14 % 128;
        int i15 = i14 % 2;
        List<setNextFocusRightId> list = setmax.setCompoundDrawableTintBlendMode;
        if (i15 != 0) {
            throw null;
        }
        int i16 = (-2) - (((i10 & 66) + (i10 | 66)) ^ (-1));
        f60053o = i16 % 128;
        int i17 = i16 % 2;
        return list;
    }

    public static /* synthetic */ Long b(Object[] objArr) {
        setMax setmax = (setMax) objArr[0];
        int i10 = f60054p;
        int i11 = i10 & 57;
        int i12 = -(-((i10 ^ 57) | i11));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        int i14 = i13 % 128;
        f60053o = i14;
        int i15 = i13 % 2;
        Long l6 = setmax.UiMessageCallbackKtWhenMappings;
        if (i15 != 0) {
            int i16 = 4 / 0;
        }
        int i17 = i14 & 19;
        int i18 = (i17 - (~(-(-((i14 ^ 19) | i17))))) - 1;
        f60054p = i18 % 128;
        if (i18 % 2 != 0) {
            return l6;
        }
        throw null;
    }

    public static /* synthetic */ void c(Object[] objArr) {
        setMax setmax = (setMax) objArr[0];
        Long l6 = (Long) objArr[1];
        int i10 = f60054p;
        int i11 = i10 & 123;
        int i12 = -(-((i10 ^ 123) | i11));
        int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
        f60053o = i13 % 128;
        int i14 = i13 % 2;
        setmax.setOnDragListener = l6;
        int i15 = i10 & 75;
        int i16 = (~i15) & (i10 | 75);
        int i17 = -(-(i15 << 1));
        int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
        f60053o = i18 % 128;
        if (i18 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void d(Object[] objArr) {
        int i10 = f60053o;
        int i11 = ~i10;
        int i12 = (i10 & (-90)) | (i11 & 89);
        int i13 = -(-((i10 & 89) << 1));
        int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
        f60054p = i14 % 128;
        int i15 = i14 % 2;
        int i16 = (((i10 & (-84)) | (i11 & 83)) - (~(-(-((i10 & 83) << 1))))) - 1;
        f60054p = i16 % 128;
        if (i16 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Boolean e(Object[] objArr) {
        setMax setmax = (setMax) objArr[0];
        int i10 = f60053o;
        int i11 = (i10 ^ 78) + ((i10 & 78) << 1);
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        f60054p = i12 % 128;
        int i13 = i12 % 2;
        boolean z10 = setmax.setZ;
        if (i13 == 0) {
            int i14 = 90 / 0;
        }
        return Boolean.valueOf(z10);
    }

    public static /* synthetic */ Long f(Object[] objArr) {
        setMax setmax = (setMax) objArr[0];
        int i10 = f60053o;
        int i11 = ((i10 ^ 102) + ((i10 & 102) << 1)) - 1;
        f60054p = i11 % 128;
        int i12 = i11 % 2;
        Long l6 = setmax.setOnDragListener;
        if (i12 != 0) {
            return l6;
        }
        throw null;
    }

    public static /* synthetic */ setMaxWidth g(Object[] objArr) {
        setMax setmax = (setMax) objArr[0];
        int i10 = f60054p;
        int i11 = i10 & 71;
        int i12 = (i10 ^ 71) | i11;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        int i14 = i13 % 128;
        f60053o = i14;
        int i15 = i13 % 2;
        setMaxWidth setmaxwidth = setmax.setDividerPadding;
        if (i15 != 0) {
            throw null;
        }
        int i16 = i14 & 101;
        int i17 = (i14 | 101) & (~i16);
        int i18 = -(-(i16 << 1));
        int i19 = (i17 & i18) + (i17 | i18);
        f60054p = i19 % 128;
        if (i19 % 2 != 0) {
            return setmaxwidth;
        }
        throw null;
    }

    public static /* synthetic */ Boolean h(Object[] objArr) {
        setMax setmax = (setMax) objArr[0];
        int i10 = f60054p;
        int i11 = i10 & 17;
        int i12 = ((i10 | 17) & (~i11)) + (i11 << 1);
        f60053o = i12 % 128;
        int i13 = i12 % 2;
        boolean z10 = setmax.setY;
        if (i13 != 0) {
            int i14 = 2 / 0;
        }
        return Boolean.valueOf(z10);
    }

    public static /* synthetic */ Boolean i(Object[] objArr) {
        setMax setmax = (setMax) objArr[0];
        int i10 = f60054p;
        int i11 = ((((i10 ^ 95) | (i10 & 95)) << 1) - (~(-(((~i10) & 95) | (i10 & (-96)))))) - 1;
        f60053o = i11 % 128;
        int i12 = i11 % 2;
        Boolean bool = setmax.setAlwaysDrawnWithCacheEnabled;
        if (i12 != 0) {
            int i13 = 39 / 0;
        }
        return bool;
    }

    public static /* synthetic */ Boolean j(Object[] objArr) {
        setMax setmax = (setMax) objArr[0];
        Terminal terminal = (Terminal) objArr[1];
        setMaxWidth setmaxwidth = (setMaxWidth) objArr[2];
        Intrinsics.checkNotNullParameter(terminal, "");
        Intrinsics.checkNotNullParameter(setmaxwidth, "");
        ((Boolean) setX(new Object[]{setmax, "configuration", new i(terminal, setmaxwidth, setmax)}, -970216441, 970216459, System.identityHashCode(setmax))).booleanValue();
        ((Boolean) setX(new Object[]{setmax, "Reader contactless transaction limit", setmax.new j()}, -970216441, 970216459, System.identityHashCode(setmax))).booleanValue();
        ((Boolean) setX(new Object[]{setmax, "Reader contactless floor limit", setmax.new g()}, -970216441, 970216459, System.identityHashCode(setmax))).booleanValue();
        ((Boolean) setX(new Object[]{setmax, "Reader CVM required limit", setmax.new b()}, -970216441, 970216459, System.identityHashCode(setmax))).booleanValue();
        int i10 = f60054p;
        int i11 = i10 & 117;
        int i12 = -(-((i10 ^ 117) | i11));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f60053o = i13 % 128;
        int i14 = i13 % 2;
        for (setNextFocusRightId setnextfocusrightid : setmax.setCompoundDrawableTintBlendMode) {
            ((Boolean) setX(new Object[]{setmax, Intrinsics.stringPlus("Currency configuration: ", (String) setNextFocusRightId.setOnFocusChangeListener(new Object[]{setnextfocusrightid}, 1937295720, -1937295716, System.identityHashCode(setnextfocusrightid))), new c(terminal, setmaxwidth, setmax, setnextfocusrightid)}, -970216441, 970216459, System.identityHashCode(setmax))).booleanValue();
            ((Boolean) setX(new Object[]{setmax, Intrinsics.stringPlus((String) setNextFocusRightId.setOnFocusChangeListener(new Object[]{setnextfocusrightid}, 1937295720, -1937295716, System.identityHashCode(setnextfocusrightid)), ": Reader contactless transaction limit"), new e(setnextfocusrightid)}, -970216441, 970216459, System.identityHashCode(setmax))).booleanValue();
            ((Boolean) setX(new Object[]{setmax, Intrinsics.stringPlus((String) setNextFocusRightId.setOnFocusChangeListener(new Object[]{setnextfocusrightid}, 1937295720, -1937295716, System.identityHashCode(setnextfocusrightid)), ":Reader contactless floor limit"), new h(setnextfocusrightid)}, -970216441, 970216459, System.identityHashCode(setmax))).booleanValue();
            ((Boolean) setX(new Object[]{setmax, Intrinsics.stringPlus((String) setNextFocusRightId.setOnFocusChangeListener(new Object[]{setnextfocusrightid}, 1937295720, -1937295716, System.identityHashCode(setnextfocusrightid)), ":Reader CVM required limit"), new d(setnextfocusrightid)}, -970216441, 970216459, System.identityHashCode(setmax))).booleanValue();
            int i15 = f60054p;
            int i16 = ((i15 | 31) << 1) - (i15 ^ 31);
            f60053o = i16 % 128;
            int i17 = i16 % 2;
        }
        ((Boolean) setX(new Object[]{setmax, "Money Add transaction type", setmax.new a()}, -970216441, 970216459, System.identityHashCode(setmax))).booleanValue();
        ((Boolean) setX(new Object[]{setmax, "Balance Enquiry transaction type", setmax.new f()}, -970216441, 970216459, System.identityHashCode(setmax))).booleanValue();
        int i18 = f60054p + 13;
        f60053o = i18 % 128;
        if (i18 % 2 == 0) {
            return Boolean.TRUE;
        }
        throw null;
    }

    public static /* synthetic */ Terminal k(Object[] objArr) {
        setMax setmax = (setMax) objArr[0];
        int i10 = f60053o;
        int i11 = i10 + 17;
        f60054p = i11 % 128;
        int i12 = i11 % 2;
        Terminal terminal = setmax.setNavigationOnClickListener;
        if (i12 == 0) {
            int i13 = 26 / 0;
        }
        int i14 = i10 + 113;
        f60054p = i14 % 128;
        int i15 = i14 % 2;
        return terminal;
    }

    public static /* synthetic */ md l(Object[] objArr) {
        setMax setmax = (setMax) objArr[0];
        int i10 = f60054p;
        int i11 = (((i10 | 12) << 1) - (i10 ^ 12)) - 1;
        int i12 = i11 % 128;
        f60053o = i12;
        int i13 = i11 % 2;
        md mdVar = setmax.setIncludeFontPadding;
        int i14 = (i12 & 57) + (i12 | 57);
        f60054p = i14 % 128;
        if (i14 % 2 != 0) {
            return mdVar;
        }
        throw null;
    }

    public static /* synthetic */ setBackgroundTintList m(Object[] objArr) {
        setMax setmax = (setMax) objArr[0];
        int i10 = f60054p;
        int i11 = i10 & 43;
        int i12 = -(-(i10 | 43));
        int i13 = (i11 & i12) + (i12 | i11);
        f60053o = i13 % 128;
        int i14 = i13 % 2;
        setBackgroundTintList setbackgroundtintlist = setmax.setOnFocusChangeListener;
        if (i14 != 0) {
            int i15 = 39 / 0;
        }
        return setbackgroundtintlist;
    }

    public static /* synthetic */ void n(Object[] objArr) {
        setMax setmax = (setMax) objArr[0];
        Long l6 = (Long) objArr[1];
        int i10 = f60054p;
        int i11 = i10 & 97;
        int i12 = ((i10 ^ 97) | i11) << 1;
        int i13 = ((~i10) & 97) | (i10 & (-98));
        int i14 = -i13;
        int i15 = (i12 ^ i14) + ((i12 & i14) << 1);
        f60053o = i15 % 128;
        int i16 = i15 % 2;
        setmax.setOnLongClickListener = l6;
        if (i16 != 0) {
            throw null;
        }
        int i17 = (i13 - (~(-(-(i11 << 1))))) - 1;
        f60053o = i17 % 128;
        if (i17 % 2 != 0) {
            int i18 = 81 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02cc, code lost:
    
        if ((r2 % 2) == 0) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02ce, code lost:
    
        r7 = 50 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02cf, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        return java.lang.Boolean.valueOf(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if ((r9 instanceof com.mypinpad.tsdk.isolation.setMax) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        r9 = (r4 & 117) + (r4 | 117);
        r1 = r9 % 128;
        com.mypinpad.tsdk.isolation.setMax.f60053o = r1;
        r9 = r9 % 2;
        r9 = (((r1 | 50) << 1) - (r1 ^ 50)) - 1;
        com.mypinpad.tsdk.isolation.setMax.f60054p = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        r9 = (com.mypinpad.tsdk.isolation.setMax) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        if (r2.setIncludeFontPadding == r9.setIncludeFontPadding) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        r9 = r5 & 37;
        r9 = r9 + ((r5 ^ 37) | r9);
        com.mypinpad.tsdk.isolation.setMax.f60054p = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
    
        if ((r9 % 2) != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
    
        r5 = r5 + 48;
        r9 = (r5 ^ (-1)) + (r5 << 1);
        com.mypinpad.tsdk.isolation.setMax.f60054p = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007c, code lost:
    
        return java.lang.Boolean.valueOf(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0081, code lost:
    
        if (r2.setNavigationOnClickListener == r9.setNavigationOnClickListener) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0083, code lost:
    
        r9 = r4 + 43;
        com.mypinpad.tsdk.isolation.setMax.f60053o = r9 % 128;
        r9 = r9 % 2;
        r2 = r4 & 121;
        r9 = ((r4 ^ 121) | r2) << 1;
        r2 = -((~r2) & (r4 | 121));
        r4 = (r9 ^ r2) + ((r9 & r2) << 1);
        com.mypinpad.tsdk.isolation.setMax.f60053o = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a1, code lost:
    
        if ((r4 % 2) == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a3, code lost:
    
        r9 = 35 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a6, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00af, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r2.setOnFocusChangeListener, r9.setOnFocusChangeListener) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b1, code lost:
    
        r9 = com.mypinpad.tsdk.isolation.setMax.f60054p;
        r2 = r9 & 93;
        r9 = -(-((r9 ^ 93) | r2));
        r4 = (r2 & r9) + (r9 | r2);
        r9 = r4 % 128;
        com.mypinpad.tsdk.isolation.setMax.f60053o = r9;
        r4 = r4 % 2;
        r4 = r9 & 91;
        r2 = ((r9 ^ 91) | r4) << 1;
        r9 = -((r9 | 91) & (~r4));
        r3 = (r2 & r9) + (r9 | r2);
        com.mypinpad.tsdk.isolation.setMax.f60054p = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d9, code lost:
    
        if ((r3 % 2) != 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00db, code lost:
    
        r9 = 58 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00de, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e5, code lost:
    
        if (r2.setZ == r9.setZ) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e7, code lost:
    
        r9 = com.mypinpad.tsdk.isolation.setMax.f60054p;
        r2 = r9 & 75;
        r2 = (r2 - (~(-(-((r9 ^ 75) | r2))))) - 1;
        r9 = r2 % 128;
        com.mypinpad.tsdk.isolation.setMax.f60053o = r9;
        r2 = r2 % 2;
        r2 = (r9 & 39) + (r9 | 39);
        com.mypinpad.tsdk.isolation.setMax.f60054p = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0103, code lost:
    
        if ((r2 % 2) != 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0105, code lost:
    
        r9 = 76 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0108, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0112, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r2.setAlwaysDrawnWithCacheEnabled, r9.setAlwaysDrawnWithCacheEnabled) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0114, code lost:
    
        r9 = com.mypinpad.tsdk.isolation.setMax.f60054p;
        r2 = (r9 & (-124)) | ((~r9) & 123);
        r9 = (r9 & 123) << 1;
        r4 = ((r2 | r9) << 1) - (r9 ^ r2);
        r9 = r4 % 128;
        com.mypinpad.tsdk.isolation.setMax.f60053o = r9;
        r4 = r4 % 2;
        r2 = r9 & 39;
        r9 = (r9 | 39) & (~r2);
        r2 = -(-(r2 << 1));
        r3 = ((r9 | r2) << 1) - (r9 ^ r2);
        com.mypinpad.tsdk.isolation.setMax.f60054p = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x013f, code lost:
    
        if ((r3 % 2) != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0141, code lost:
    
        r5 = 3 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0142, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0147, code lost:
    
        if (r2.setY == r9.setY) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0149, code lost:
    
        r9 = com.mypinpad.tsdk.isolation.setMax.f60054p;
        r1 = (((r9 & (-4)) | ((~r9) & 3)) - (~(-(-((r9 & 3) << 1))))) - 1;
        r9 = r1 % 128;
        com.mypinpad.tsdk.isolation.setMax.f60053o = r9;
        r1 = r1 % 2;
        r1 = (r9 ^ 79) + ((r9 & 79) << 1);
        com.mypinpad.tsdk.isolation.setMax.f60054p = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0169, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x016e, code lost:
    
        if (r2.getNavBarTitleString == r9.getNavBarTitleString) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0170, code lost:
    
        r9 = com.mypinpad.tsdk.isolation.setMax.f60054p;
        r1 = r9 & 85;
        r9 = ((r9 | 85) & (~r1)) + (r1 << 1);
        com.mypinpad.tsdk.isolation.setMax.f60053o = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0180, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0187, code lost:
    
        if (r2.setLayoutAnimation == r9.setLayoutAnimation) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0189, code lost:
    
        r9 = com.mypinpad.tsdk.isolation.setMax.f60053o;
        r0 = r9 & 53;
        r2 = (r9 ^ 53) | r0;
        r4 = (r0 & r2) + (r0 | r2);
        com.mypinpad.tsdk.isolation.setMax.f60054p = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        if (r2 == r9) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x019a, code lost:
    
        if ((r4 % 2) != 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x019c, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x019e, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x019f, code lost:
    
        r2 = ((r9 | 41) << 1) - (r9 ^ 41);
        com.mypinpad.tsdk.isolation.setMax.f60054p = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01ab, code lost:
    
        if ((r2 % 2) != 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01ad, code lost:
    
        r8 = 67 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01b2, code lost:
    
        return java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01b7, code lost:
    
        return java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01c1, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r2.UiMessageCallbackKtWhenMappings, r9.UiMessageCallbackKtWhenMappings)) == true) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01cb, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r2.setOnDragListener, r9.setOnDragListener) == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01d5, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r2.setOnLongClickListener, r9.setOnLongClickListener) != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01d7, code lost:
    
        r9 = com.mypinpad.tsdk.isolation.setMax.f60054p;
        r1 = ((r9 & 116) + (r9 | 116)) - 1;
        com.mypinpad.tsdk.isolation.setMax.f60053o = r1 % 128;
        r1 = r1 % 2;
        r1 = r9 & 79;
        r1 = (r1 - (~(-(-((r9 ^ 79) | r1))))) - 1;
        com.mypinpad.tsdk.isolation.setMax.f60053o = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01f5, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01ff, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r2.setCompoundDrawableTintBlendMode, r9.setCompoundDrawableTintBlendMode) != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0201, code lost:
    
        r9 = com.mypinpad.tsdk.isolation.setMax.f60054p;
        r1 = r9 & 43;
        r1 = (r1 - (~((r9 ^ 43) | r1))) - 1;
        r9 = r1 % 128;
        com.mypinpad.tsdk.isolation.setMax.f60053o = r9;
        r1 = r1 % 2;
        r1 = r9 & 41;
        r9 = (r9 | 41) & (~r1);
        r1 = -(-(r1 << 1));
        r2 = (r9 ^ r1) + ((r9 & r1) << 1);
        com.mypinpad.tsdk.isolation.setMax.f60054p = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        if (r2 == r9) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0225, code lost:
    
        if ((r2 % 2) == 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0227, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0228, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0231, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r2.setDividerPadding, r9.setDividerPadding) != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0233, code lost:
    
        r9 = com.mypinpad.tsdk.isolation.setMax.f60053o + 75;
        r1 = r9 % 128;
        com.mypinpad.tsdk.isolation.setMax.f60054p = r1;
        r9 = r9 % 2;
        r2 = r1 & 67;
        r9 = (((r1 ^ 67) | r2) << 1) - ((r1 | 67) & (~r2));
        com.mypinpad.tsdk.isolation.setMax.f60053o = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x024c, code lost:
    
        if ((r9 % 2) != 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x024e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x024f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        r5 = r5 + 97;
        com.mypinpad.tsdk.isolation.setMax.f60054p = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0259, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r2.setX, r9.setX)) == true) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x025b, code lost:
    
        r9 = com.mypinpad.tsdk.isolation.setMax.f60053o + 33;
        com.mypinpad.tsdk.isolation.setMax.f60054p = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0267, code lost:
    
        return java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0268, code lost:
    
        r9 = com.mypinpad.tsdk.isolation.setMax.f60053o;
        r1 = r9 | 117;
        r2 = r1 << 1;
        r1 = -(r1 & (~(r9 & 117)));
        r3 = (r2 & r1) + (r1 | r2);
        com.mypinpad.tsdk.isolation.setMax.f60054p = r3 % 128;
        r3 = r3 % 2;
        r1 = r9 & 25;
        r9 = (r9 ^ 25) | r1;
        r2 = (r1 & r9) + (r9 | r1);
        com.mypinpad.tsdk.isolation.setMax.f60054p = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x028c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x028d, code lost:
    
        r9 = com.mypinpad.tsdk.isolation.setMax.f60054p;
        r2 = ((r9 | 117) << 1) - (r9 ^ 117);
        r9 = r2 % 128;
        com.mypinpad.tsdk.isolation.setMax.f60053o = r9;
        r2 = r2 % 2;
        r2 = ((r9 | 17) << 1) - (r9 ^ 17);
        com.mypinpad.tsdk.isolation.setMax.f60054p = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02a7, code lost:
    
        if ((r2 % 2) != 0) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02a9, code lost:
    
        r6 = 75 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02aa, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02ab, code lost:
    
        r9 = com.mypinpad.tsdk.isolation.setMax.f60053o;
        r2 = (((r9 ^ 91) | (r9 & 91)) << 1) - (((~r9) & 91) | (r9 & (-92)));
        r9 = r2 % 128;
        com.mypinpad.tsdk.isolation.setMax.f60054p = r9;
        r2 = r2 % 2;
        r2 = (r9 ^ 111) + ((r9 & 111) << 1);
        com.mypinpad.tsdk.isolation.setMax.f60053o = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        if ((r5 % 2) != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Boolean o(java.lang.Object[] r9) {
        /*
            Method dump skipped, instruction units count: 720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setMax.o(java.lang.Object[]):java.lang.Boolean");
    }

    public static /* synthetic */ Boolean p(Object[] objArr) {
        setMax setmax = (setMax) objArr[0];
        int i10 = f60053o;
        int i11 = ((i10 ^ 82) + ((i10 & 82) << 1)) - 1;
        int i12 = i11 % 128;
        f60054p = i12;
        int i13 = i11 % 2;
        boolean z10 = setmax.getNavBarTitleString;
        if (i13 == 0) {
            int i14 = 73 / 0;
        }
        int i15 = i12 ^ 9;
        int i16 = ((i12 & 9) | i15) << 1;
        int i17 = -i15;
        int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
        f60053o = i18 % 128;
        if (i18 % 2 == 0) {
            return Boolean.valueOf(z10);
        }
        int i19 = 17 / 0;
        return Boolean.valueOf(z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v131 */
    /* JADX WARN: Type inference failed for: r13v195 */
    /* JADX WARN: Type inference failed for: r13v197 */
    /* JADX WARN: Type inference failed for: r13v82 */
    /* JADX WARN: Type inference failed for: r14v121 */
    /* JADX WARN: Type inference failed for: r14v127 */
    /* JADX WARN: Type inference failed for: r14v217 */
    /* JADX WARN: Type inference failed for: r14v225 */
    /* JADX WARN: Type inference failed for: r14v237 */
    /* JADX WARN: Type inference failed for: r14v238 */
    /* JADX WARN: Type inference failed for: r14v63 */
    /* JADX WARN: Type inference failed for: r14v75, types: [int] */
    /* JADX WARN: Type inference failed for: r3v39, types: [int] */
    /* JADX WARN: Type inference failed for: r3v66 */
    /* JADX WARN: Type inference failed for: r3v74 */
    /* JADX WARN: Type inference failed for: r4v58 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r8v23 */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int i13 = ~i12;
        int i14 = ((i10 | i12) * 164) + (((~(i13 | i11)) | i10) * (-328)) + (i11 * (-163)) + (i10 * 165);
        int i15 = ~i10;
        int i16 = ~i11;
        int i17 = (((~(i10 | i13 | i11)) | (~(i12 | i16)) | (~(i15 | i16))) * 164) + i14;
        int iHashCode5 = 0;
        switch (i17) {
            case 1:
                setMax setmax = (setMax) objArr[0];
                Long l6 = (Long) objArr[1];
                int i18 = f60054p;
                int i19 = ((i18 | 75) << 1) - (i18 ^ 75);
                int i20 = i19 % 128;
                f60053o = i20;
                int i21 = i19 % 2;
                setmax.UiMessageCallbackKtWhenMappings = l6;
                int i22 = i20 + 27;
                f60054p = i22 % 128;
                int i23 = i22 % 2;
                return null;
            case 2:
                setMax setmax2 = (setMax) objArr[0];
                int i24 = f60054p;
                int i25 = ((i24 & 126) + (i24 | 126)) - 1;
                int i26 = i25 % 128;
                f60053o = i26;
                int i27 = i25 % 2;
                Long l7 = setmax2.setOnLongClickListener;
                int i28 = (i26 & (-88)) | ((~i26) & 87);
                int i29 = -(-((i26 & 87) << 1));
                int i30 = ((i28 | i29) << 1) - (i28 ^ i29);
                f60054p = i30 % 128;
                int i31 = i30 % 2;
                return l7;
            case 3:
                return k(objArr);
            case 4:
                return f(objArr);
            case 5:
                return e(objArr);
            case 6:
                n(objArr);
                return null;
            case 7:
                return o(objArr);
            case 8:
                setMax setmax3 = (setMax) objArr[0];
                int i32 = f60053o;
                int i33 = ((i32 ^ 13) - (~((i32 & 13) << 1))) - 1;
                f60054p = i33 % 128;
                int i34 = i33 % 2;
                String str = setmax3.setX;
                int i35 = i32 & 85;
                int i36 = (i32 ^ 85) | i35;
                int i37 = ((i35 | i36) << 1) - (i35 ^ i36);
                f60054p = i37 % 128;
                int i38 = i37 % 2;
                return str;
            case 9:
                return l(objArr);
            case 10:
                return b(objArr);
            case 11:
                return h(objArr);
            case 12:
                return j(objArr);
            case 13:
                return i(objArr);
            case 14:
                return a(objArr);
            case 15:
                return g(objArr);
            case 16:
                return p(objArr);
            case 17:
                return m(objArr);
            case 18:
                setMax setmax4 = (setMax) objArr[0];
                String str2 = (String) objArr[1];
                Function0 function0 = (Function0) objArr[2];
                int i39 = f60053o;
                int i40 = i39 ^ 65;
                int i41 = ((i39 & 65) | i40) << 1;
                int i42 = -i40;
                int i43 = (i41 ^ i42) + ((i41 & i42) << 1);
                f60054p = i43 % 128;
                int i44 = i43 % 2;
                Boolean bool = (Boolean) function0.invoke();
                if (bool.booleanValue()) {
                    boolean zBooleanValue = bool.booleanValue();
                    int i45 = f60053o;
                    int i46 = i45 & 97;
                    int i47 = i46 + ((i45 ^ 97) | i46);
                    f60054p = i47 % 128;
                    int i48 = i47 % 2;
                    return Boolean.valueOf(zBooleanValue);
                }
                SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
                StringBuilder sbD = ci.a.d("Invalid ", str2, " for kernel ");
                sbD.append((int) ((Terminal) setX(new Object[]{setmax4}, -1116972605, 1116972608, System.identityHashCode(setmax4))).setY());
                sbD.append(", transaction type ");
                sbD.append((int) ((md) setX(new Object[]{setmax4}, 1678059478, -1678059469, System.identityHashCode(setmax4))).setDividerPadding());
                SouthPacificEndpoint.setX(new Object[]{sbD.toString()}, 818541572, -818541572, (int) System.currentTimeMillis());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(getPinPadLandscape.setX(setmax4.setDividerPadding().setY()));
                sb2.append(", ");
                sb2.append((int) setmax4.setX().setDividerPadding());
                throw new setIndeterminateDrawable(WearableStatusCodes.DUPLICATE_LISTENER, sb2.toString(), null, 4, null);
            case 19:
                c(objArr);
                return null;
            case 20:
                d(objArr);
                return "TC";
            case 21:
                setMax setmax5 = (setMax) objArr[0];
                int i49 = f60053o;
                int i50 = i49 & 97;
                int i51 = -(-((i49 ^ 97) | i50));
                int i52 = ((i50 | i51) << 1) - (i50 ^ i51);
                f60054p = i52 % 128;
                int i53 = i52 % 2;
                boolean z10 = setmax5.setLayoutAnimation;
                int i54 = i49 ^ 63;
                int i55 = (i49 & 63) << 1;
                int i56 = (i54 & i55) + (i55 | i54);
                f60054p = i56 % 128;
                int i57 = i56 % 2;
                return Boolean.valueOf(z10);
            default:
                setMax setmax6 = (setMax) objArr[0];
                int i58 = f60053o + 115;
                f60054p = i58 % 128;
                int i59 = i58 % 2;
                int iHashCode6 = setmax6.setIncludeFontPadding.hashCode();
                int i60 = iHashCode6 * 31;
                int iHashCode7 = setmax6.setNavigationOnClickListener.hashCode();
                int iIdentityHashCode = System.identityHashCode(setmax6);
                int i61 = iHashCode7 * (-661);
                int i62 = iHashCode6 * (-20491);
                int i63 = i61 & i62;
                int i64 = -(-((i62 ^ i61) | i63));
                int i65 = (i63 ^ i64) + ((i64 & i63) << 1);
                int i66 = ~iIdentityHashCode;
                int i67 = i66 & (i66 | iIdentityHashCode);
                int i68 = ~iHashCode7;
                int i69 = ~i60;
                int i70 = ~(i68 | i69);
                int i71 = i67 ^ i70;
                int i72 = i67 & i70;
                int i73 = ((i72 & i71) | (i71 ^ i72)) * 1324;
                int i74 = ((i65 | i73) << 1) - (i73 ^ i65);
                int i75 = ~((iHashCode7 ^ iIdentityHashCode) | (iHashCode7 & iIdentityHashCode));
                int i76 = i60 & iIdentityHashCode;
                int i77 = (iIdentityHashCode | i60) & (~i76);
                int i78 = ~((i77 & i76) | (i77 ^ i76));
                int i79 = i75 & i78;
                int i80 = (i75 | i78) & (~i79);
                int i81 = -(-(((i80 & i79) | (i80 ^ i79)) * (-1324)));
                int i82 = i74 & i81;
                int i83 = i82 + ((i81 ^ i74) | i82);
                int i84 = ((i68 | iHashCode7) & i68) | i60;
                int i85 = ~i84;
                int i86 = (i84 | i85) & i85;
                int i87 = (i69 & i68) | ((~i69) & iHashCode7);
                int i88 = iHashCode7 & i69;
                int i89 = (i87 & i88) | (i87 ^ i88);
                int i90 = ~i89;
                int i91 = (i89 | i90) & i90;
                int i92 = ((~i91) & i86) | ((~i86) & i91);
                int i93 = i86 & i91;
                int i94 = -(-(((i93 & i92) | (i92 ^ i93)) * 662));
                int iE = c2.b.e(i83 ^ i94, ~(-(-((i94 & i83) << 1))), 1, 31);
                int i95 = -(-setmax6.setOnFocusChangeListener.hashCode());
                int i96 = ((iE & i95) + (iE | i95)) * 31;
                boolean z11 = setmax6.setZ;
                ?? r13 = z11;
                if (z11) {
                    System.identityHashCode(setmax6);
                    System.identityHashCode(setmax6);
                    int i97 = f60054p + 109;
                    f60053o = i97 % 128;
                    int i98 = i97 % 2;
                    r13 = 1;
                }
                int i99 = ((i96 | r13) == true ? 1 : 0) << 1;
                int i100 = -(r13 ^ i96);
                int i101 = (i99 ^ i100) + ((i100 & i99) << 1);
                int i102 = i101 * 31;
                Boolean bool2 = setmax6.setAlwaysDrawnWithCacheEnabled;
                if (bool2 == null) {
                    System.identityHashCode(setmax6);
                    System.identityHashCode(setmax6);
                    int i103 = f60053o;
                    int i104 = i103 | 47;
                    int i105 = i104 << 1;
                    int i106 = -((~(i103 & 47)) & i104);
                    int i107 = ((i105 | i106) << 1) - (i106 ^ i105);
                    f60054p = i107 % 128;
                    int i108 = i107 % 2;
                    iHashCode = 0;
                } else {
                    iHashCode = bool2.hashCode();
                    int i109 = f60054p;
                    int i110 = i109 & 45;
                    int i111 = i109 | 45;
                    int i112 = (i110 & i111) + (i111 | i110);
                    f60053o = i112 % 128;
                    int i113 = i112 % 2;
                }
                int iIdentityHashCode2 = System.identityHashCode(setmax6);
                int i114 = iHashCode * 399;
                int i115 = -(-(i101 * 12369));
                int i116 = (((i114 ^ i115) | (i114 & i115)) << 1) - ((i115 & (~i114)) | ((~i115) & i114));
                int i117 = ~iHashCode;
                int i118 = (i117 | iHashCode) & i117;
                int i119 = i118 & i102;
                int i120 = (i118 | i102) & (~i119);
                int i121 = ~i102;
                int i122 = (i120 & i119) | (i120 ^ i119);
                int i123 = ~i122;
                int i124 = (i122 | i123) & i123;
                int i125 = (i121 | i102) & i121;
                int i126 = i125 & iHashCode;
                int i127 = i124 | (~(i126 | ((~i126) & (i125 | iHashCode))));
                int i128 = ~iIdentityHashCode2;
                int i129 = i125 & i128;
                int i130 = (iIdentityHashCode2 & i125) | ((~i125) & iIdentityHashCode2) | i129;
                int i131 = ~i130;
                int i132 = (i130 | i131) & i131;
                int i133 = -(-(((i132 & i127) | (i127 ^ i132)) * 398));
                int i134 = i116 ^ i133;
                int i135 = (((i133 & i116) | i134) << 1) - i134;
                int i136 = -(-(((iHashCode ^ i102) | (iHashCode & i102)) * (-1194)));
                int i137 = ((~i136) & i135) | ((~i135) & i136);
                int i138 = (i135 & i136) << 1;
                int i139 = ((i137 | i138) << 1) - (i138 ^ i137);
                int i140 = (~i129) & (i125 | i128);
                int i141 = (i140 & i129) | (i140 ^ i129);
                int i142 = ~i141;
                int i143 = (i141 | i142) & i142;
                int i144 = ~((i102 & i117) | (i117 ^ i102));
                int i145 = i143 & i144;
                int i146 = (i144 | i143) & (~i145);
                int i147 = (i146 & i145) | (i146 ^ i145);
                int i148 = i121 & iHashCode;
                int i149 = (iHashCode | i121) & (~i148);
                int i150 = (i149 & i148) | (i149 ^ i148);
                int i151 = ~i150;
                int i152 = (i150 | i151) & i151;
                int i153 = (i139 - (~(-(-(((i147 & i152) | (i147 ^ i152)) * 398))))) - 1;
                int i154 = i153 * 31;
                boolean z12 = setmax6.setY;
                ?? r14 = z12;
                if (z12) {
                    int i155 = f60054p;
                    int i156 = i155 & 11;
                    int i157 = i156 + ((i155 ^ 11) | i156);
                    f60053o = i157 % 128;
                    boolean z13 = i157 % 2 != 0;
                    int i158 = i155 ^ 85;
                    int i159 = ((i155 & 85) | i158) << 1;
                    int i160 = -i158;
                    int i161 = (i159 ^ i160) + ((i159 & i160) << 1);
                    f60053o = i161 % 128;
                    int i162 = i161 % 2;
                    r14 = !z13;
                }
                int iIdentityHashCode3 = System.identityHashCode(setmax6);
                int i163 = r14 * 165;
                int i164 = i153 * (-5053);
                int i165 = ((~i164) & i163) | ((~i163) & i164);
                int i166 = -(-((i163 & i164) << 1));
                int i167 = ((i165 | i166) << 1) - (i166 ^ i165);
                int i168 = ~iIdentityHashCode3;
                int i169 = ~((i168 ^ i154) | (i168 & i154));
                int i170 = r14 & i169;
                int i171 = (i169 | r14) & (~i170);
                int i172 = ((i171 & i170) | (i171 ^ i170)) * (-328);
                int i173 = ((i167 | i172) << 1) - (i167 ^ i172);
                int i174 = -(~(-(-(((r14 ^ iIdentityHashCode3) | (r14 & iIdentityHashCode3)) * 164))));
                int i175 = ((i173 ^ i174) + ((i174 & i173) << 1)) - 1;
                int i176 = ~r14;
                int i177 = ~i154;
                int i178 = ((~i177) & i176) | ((~i176) & i177);
                int i179 = i176 & i177;
                int i180 = (i179 & i178) | (i178 ^ i179);
                int i181 = ~i180;
                int i182 = (i180 | i181) & i181;
                int i183 = (iIdentityHashCode3 & i177) | (i177 ^ iIdentityHashCode3);
                int i184 = ~i183;
                int i185 = (i183 | i184) & i184;
                int i186 = ((~i185) & i182) | ((~i182) & i185);
                int i187 = i185 & i182;
                int i188 = (i187 & i186) | (i186 ^ i187);
                ?? r10 = i168 & r14;
                int i189 = (r14 | i168) & (~(r10 == true ? 1 : 0));
                int i190 = (i189 & (r10 == true ? 1 : 0)) | (i189 ^ (r10 == true ? 1 : 0));
                int i191 = i190 ^ i154;
                int i192 = i154 & i190;
                int i193 = ~((i192 & i191) | (i191 ^ i192));
                int i194 = -(~(((i193 & i188) | (i188 ^ i193)) * 164));
                int i195 = ((i175 ^ i194) + ((i194 & i175) << 1)) - 1;
                int i196 = i195 * 31;
                boolean z14 = setmax6.getNavBarTitleString;
                ?? r3 = z14;
                if (z14) {
                    int i197 = f60053o;
                    int i198 = i197 + 66;
                    int i199 = (i198 ^ (-1)) + (i198 << 1);
                    f60054p = i199 % 128;
                    int i200 = i199 % 2;
                    int i201 = ((i197 ^ 117) - (~((i197 & 117) << 1))) - 1;
                    f60054p = i201 % 128;
                    int i202 = i201 % 2;
                    r3 = 1;
                }
                int iIdentityHashCode4 = System.identityHashCode(setmax6);
                int i203 = r3 * 51;
                int i204 = -(-(i195 * (-1519)));
                int i205 = i203 & i204;
                int i206 = (i204 ^ i203) | i205;
                int i207 = (i205 ^ i206) + ((i206 & i205) << 1);
                int i208 = r3 ^ iIdentityHashCode4;
                int i209 = ~iIdentityHashCode4;
                int i210 = r3 & iIdentityHashCode4;
                int i211 = -(-(((i208 & i210) | (i208 ^ i210)) * (-50)));
                int i212 = i207 & i211;
                int i213 = -(-((i211 ^ i207) | i212));
                int i214 = (i212 ^ i213) + ((i213 & i212) << 1);
                int i215 = ~r3;
                int i216 = ~i196;
                int i217 = ((~i216) & i215) | ((~i215) & i216);
                int i218 = i215 & i216;
                int i219 = (i218 & i217) | (i217 ^ i218);
                int i220 = ~((i219 & iIdentityHashCode4) | (i219 & i209) | ((~i219) & iIdentityHashCode4));
                int i221 = (iIdentityHashCode4 | i209) & i209;
                int i222 = i216 & i221;
                int i223 = (~i222) & (i216 | i221);
                int i224 = (i222 & i223) | (i223 ^ i222);
                int i225 = ((i224 & r3) == true ? 1 : 0) | ((i224 ^ r3) == true ? 1 : 0);
                int i226 = ~i225;
                int i227 = (i225 | i226) & i226;
                int i228 = ((i220 & i227) | ((~i227) & i220) | ((~i220) & i227)) * 50;
                int i229 = i214 & i228;
                int i230 = i228 | i214;
                int i231 = (i229 ^ i230) + ((i230 & i229) << 1);
                int i232 = i216 & i209;
                int i233 = ~(i232 | ((i209 | i216) & (~i232)));
                ?? r11 = i216 ^ r3;
                int i234 = i216 & r3;
                int i235 = ~((i234 & (r11 == true ? 1 : 0)) | ((r11 == true ? 1 : 0) ^ i234));
                int i236 = ((~i235) & i233) | ((~i233) & i235);
                int i237 = i235 & i233;
                int i238 = (i237 & i236) | (i236 ^ i237);
                int i239 = ((i221 ^ r3) == true ? 1 : 0) | (r3 & i221);
                int i240 = ~i239;
                int i241 = (i239 | i240) & i240;
                int i242 = i238 & i241;
                int i243 = (i238 | i241) & (~i242);
                int iE2 = c2.b.e(i231, ~(-(-(((i243 & i242) | (i243 ^ i242)) * 50))), 1, 31);
                boolean z15 = setmax6.setLayoutAnimation;
                ?? r15 = z15;
                if (z15) {
                    int i244 = f60053o;
                    int i245 = ((i244 ^ 47) | (i244 & 47)) << 1;
                    int i246 = -((i244 & (-48)) | ((~i244) & 47));
                    int i247 = ((i245 | i246) << 1) - (i245 ^ i246);
                    f60054p = i247 % 128;
                    int i248 = i247 % 2;
                    int i249 = i244 & 3;
                    int i250 = ((i244 | 3) & (~i249)) + (i249 << 1);
                    f60054p = i250 % 128;
                    int i251 = i250 % 2;
                    r15 = 1;
                }
                ?? r12 = iE2 & r15;
                int i252 = (((((iE2 ^ r15) == true ? 1 : 0) | (r12 == true ? 1 : 0)) << 1) - (~(-(((iE2 | r15) == true ? 1 : 0) & (~(r12 == true ? 1 : 0)))))) - 1;
                int i253 = i252 * 31;
                Long l10 = setmax6.UiMessageCallbackKtWhenMappings;
                if (l10 == null) {
                    int i254 = f60053o;
                    int i255 = ((i254 & (-56)) | ((~i254) & 55)) + ((i254 & 55) << 1);
                    f60054p = i255 % 128;
                    iHashCode2 = i255 % 2 == 0 ? 1 : 0;
                } else {
                    iHashCode2 = l10.hashCode();
                    int i256 = f60054p + 75;
                    f60053o = i256 % 128;
                    int i257 = i256 % 2;
                }
                int iIdentityHashCode5 = System.identityHashCode(setmax6);
                int i258 = iHashCode2 * (-109);
                int i259 = -(-(i252 * 3441));
                int i260 = (i258 & i259) + (i259 | i258);
                int i261 = ~iHashCode2;
                int i262 = i261 & (i261 | iHashCode2);
                int i263 = i253 & iIdentityHashCode5;
                int i264 = (i253 ^ iIdentityHashCode5) | i263;
                int i265 = ~i264;
                int i266 = (i264 | i265) & i265;
                int i267 = i262 & i266;
                int i268 = (i266 | i262) & (~i267);
                int i269 = -(-(((i268 & i267) | (i268 ^ i267)) * (-220)));
                int i270 = ((~i269) & i260) | ((~i260) & i269);
                int i271 = -(-((i269 & i260) << 1));
                int i272 = (i270 ^ i271) + ((i271 & i270) << 1);
                int i273 = iHashCode2 & i253;
                int i274 = (~i273) & (iHashCode2 | i253);
                int i275 = ~i253;
                int i276 = ~((i273 & i274) | (i274 ^ i273));
                int i277 = (iIdentityHashCode5 | i253) & (~i263);
                int i278 = (i277 & i263) | (i277 ^ i263);
                int i279 = ~i278;
                int i280 = (i278 | i279) & i279;
                int i281 = i276 ^ i280;
                int i282 = i280 & i276;
                int i283 = (-2) - (((i272 - (~(-(~(-(-(((i282 & i281) | (i281 ^ i282)) * 220))))))) - 1) ^ (-1));
                int i284 = (i253 & i262) | (i262 ^ i253);
                int i285 = ~i284;
                int i286 = (i284 | i285) & i285;
                int i287 = (iHashCode2 & i275) | (i275 ^ iHashCode2);
                int i288 = ~i287;
                int i289 = (i286 | ((i287 | i288) & i288)) * 110;
                int i290 = i283 & i289;
                int i291 = -(-((i289 ^ i283) | i290));
                int i292 = (i290 & i291) + (i291 | i290);
                int i293 = i292 * 31;
                Long l11 = setmax6.setOnDragListener;
                if (l11 == null) {
                    int i294 = f60053o;
                    int i295 = (-2) - ((((i294 | 114) << 1) - (i294 ^ 114)) ^ (-1));
                    f60054p = i295 % 128;
                    int i296 = i295 % 2;
                    iHashCode3 = 0;
                } else {
                    iHashCode3 = l11.hashCode();
                    int i297 = f60053o;
                    int i298 = ((i297 & (-2)) | ((~i297) & 1)) + ((i297 & 1) << 1);
                    f60054p = i298 % 128;
                    int i299 = i298 % 2;
                }
                int iIdentityHashCode6 = System.identityHashCode(setmax6);
                int i300 = iHashCode3 * (-103);
                int i301 = i292 * (-3193);
                int i302 = ((((i300 ^ i301) | (i300 & i301)) << 1) - (~(-((i301 & (~i300)) | ((~i301) & i300))))) - 1;
                int i303 = ~iHashCode3;
                int i304 = ~i293;
                int i305 = ~((i303 & i304) | ((~i304) & i303) | ((~i303) & i304));
                int i306 = i304 & iIdentityHashCode6;
                int i307 = (i304 | iIdentityHashCode6) & (~i306);
                int i308 = (i307 & i306) | (i307 ^ i306);
                int i309 = ~i308;
                int i310 = (i308 | i309) & i309;
                int i311 = i305 & i310;
                int i312 = (i305 | i310) & (~i311);
                int i313 = -(-(((i312 & i311) | (i312 ^ i311)) * 104));
                int i314 = i302 ^ i313;
                int i315 = -(-((i313 & i302) << 1));
                int i316 = (i314 & i315) + (i315 | i314);
                int i317 = ~iIdentityHashCode6;
                int i318 = i317 ^ iHashCode3;
                int i319 = i317 & iHashCode3;
                int i320 = -(~((~(i293 | (i319 & i318) | (i318 ^ i319))) * (-104)));
                int iE3 = c2.b.e(((i316 ^ i320) + ((i320 & i316) << 1)) - 1, ~(-(-(((iHashCode3 ^ iIdentityHashCode6) | (iHashCode3 & iIdentityHashCode6)) * 104))), 1, 31);
                Long l12 = setmax6.setOnLongClickListener;
                if (l12 == null) {
                    int i321 = f60053o;
                    int i322 = ((i321 | 75) << 1) - (((~i321) & 75) | (i321 & (-76)));
                    int i323 = i322 % 128;
                    f60054p = i323;
                    int i324 = i322 % 2;
                    int i325 = i323 + 79;
                    f60053o = i325 % 128;
                    int i326 = i325 % 2;
                    iHashCode4 = 0;
                } else {
                    iHashCode4 = l12.hashCode();
                    System.identityHashCode(setmax6);
                    System.identityHashCode(setmax6);
                }
                int i327 = -(-iHashCode4);
                int i328 = (((iE3 | i327) << 1) - (iE3 ^ i327)) * 31;
                int iHashCode8 = setmax6.setCompoundDrawableTintBlendMode.hashCode();
                int i329 = i328 & iHashCode8;
                int i330 = ((((i328 ^ iHashCode8) | i329) << 1) - (~(-((iHashCode8 | i328) & (~i329))))) - 1;
                int i331 = i330 * 31;
                int iHashCode9 = setmax6.setDividerPadding.hashCode();
                int iIdentityHashCode7 = System.identityHashCode(setmax6);
                int i332 = ((iHashCode9 * (-500)) - (~(-(~(i330 * (-15500)))))) - 2;
                int i333 = ~i331;
                int i334 = i333 & iHashCode9;
                int i335 = (~i334) & (i333 | iHashCode9);
                int i336 = ~iHashCode9;
                int i337 = ~((i334 & i335) | (i335 ^ i334));
                int i338 = i336 & i331;
                int i339 = (~i338) & (i336 | i331);
                int i340 = (i338 & i339) | (i339 ^ i338);
                int i341 = ~iIdentityHashCode7;
                int i342 = (i340 & i341) | ((~i340) & iIdentityHashCode7);
                int i343 = iIdentityHashCode7 & i340;
                int i344 = ~((i343 & i342) | (i342 ^ i343));
                int i345 = i337 & i344;
                int i346 = (i344 | i337) & (~i345);
                int i347 = -(-(((i346 & i345) | (i346 ^ i345)) * 501));
                int i348 = i332 & i347;
                int i349 = ((i332 ^ i347) | i348) << 1;
                int i350 = -((i347 | i332) & (~i348));
                int i351 = ((i349 | i350) << 1) - (i350 ^ i349);
                int i352 = i336 & i333;
                int i353 = -(-((~(((i333 | i336) & (~i352)) | i352)) * 1002));
                int i354 = i351 & i353;
                int i355 = i354 + ((i353 ^ i351) | i354);
                int i356 = i336 & i341;
                int i357 = (i336 | i341) & (~i356);
                int i358 = (i356 & i357) | (i357 ^ i356);
                int i359 = (i331 & i358) | (i358 ^ i331);
                int i360 = ~i359;
                int i361 = -(-(((i359 | i360) & i360) * 501));
                int i362 = (((i355 | i361) << 1) - (~(-((i361 & (~i355)) | ((~i361) & i355))))) - 1;
                int i363 = i362 * 31;
                String str3 = setmax6.setX;
                if (str3 == null) {
                    int i364 = f60053o;
                    int i365 = ((i364 ^ 3) | (i364 & 3)) << 1;
                    int i366 = -(((~i364) & 3) | (i364 & (-4)));
                    int i367 = (i365 & i366) + (i366 | i365);
                    int i368 = i367 % 128;
                    f60054p = i368;
                    int i369 = i367 % 2;
                    int i370 = ((i368 & 108) + (i368 | 108)) - 1;
                    f60053o = i370 % 128;
                    int i371 = i370 % 2;
                } else {
                    iHashCode5 = str3.hashCode();
                    int i372 = f60054p + 17;
                    f60053o = i372 % 128;
                    int i373 = i372 % 2;
                }
                int iIdentityHashCode8 = System.identityHashCode(setmax6);
                int i374 = iHashCode5 * 141;
                int i375 = i362 * (-8649);
                int i376 = i374 ^ i375;
                int i377 = ((i375 & i374) | i376) << 1;
                int i378 = -i376;
                int i379 = (i377 & i378) + (i377 | i378);
                int i380 = ~iIdentityHashCode8;
                int i381 = ((i363 ^ iIdentityHashCode8) | (i363 & iIdentityHashCode8)) * 140;
                int i382 = i379 & i381;
                int i383 = i381 | i379;
                int i384 = (i382 & i383) + (i383 | i382);
                int i385 = ~iHashCode5;
                int i386 = i385 & i363;
                int i387 = ~((i385 ^ i363) | i386);
                int i388 = i380 & i363;
                int i389 = (~i388) & (i380 | i363);
                int i390 = ~i363;
                int i391 = ~((i388 & i389) | (i389 ^ i388));
                int i392 = ((~i391) & i387) | ((~i387) & i391);
                int i393 = i387 & i391;
                int i394 = (i384 - (~(((i393 & i392) | (i392 ^ i393)) * (-280)))) - 1;
                int i395 = ~((i390 ^ iHashCode5) | (i390 & iHashCode5));
                int i396 = ~((iHashCode5 & i380) | (i380 & i385) | ((~i380) & iHashCode5));
                int i397 = i395 & i396;
                int i398 = (i396 | i395) & (~i397);
                int i399 = (i398 & i397) | (i398 ^ i397);
                int i400 = (i363 & (~i385)) | (i385 & i390);
                int i401 = (i400 & i386) | (i400 ^ i386);
                int i402 = i401 ^ iIdentityHashCode8;
                int i403 = iIdentityHashCode8 & i401;
                int i404 = (i403 & i402) | (i402 ^ i403);
                int i405 = ~i404;
                int i406 = (i404 | i405) & i405;
                int i407 = (i394 - (~(((i406 & i399) | (i399 ^ i406)) * 140))) - 1;
                int i408 = f60054p;
                int i409 = i408 & 53;
                int i410 = ((i408 ^ 53) | i409) << 1;
                int i411 = -((i408 | 53) & (~i409));
                int i412 = (i410 & i411) + (i411 | i410);
                f60053o = i412 % 128;
                int i413 = i412 % 2;
                return Integer.valueOf(i407);
        }
    }

    public final boolean equals(@Nullable Object p4) {
        return ((Boolean) setX(new Object[]{this, p4}, -1410902961, 1410902968, System.identityHashCode(this))).booleanValue();
    }

    @JvmName(name = "getNavBarTitleString")
    public final boolean getNavBarTitleString() {
        return ((Boolean) setX(new Object[]{this}, 3314454, -3314438, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setX(new Object[]{this}, -480982885, 480982885, System.identityHashCode(this))).intValue();
    }

    @JvmName(name = "setAlwaysDrawnWithCacheEnabled")
    @Nullable
    public final String setAlwaysDrawnWithCacheEnabled() {
        return (String) setX(new Object[]{this}, -1935099766, 1935099774, System.identityHashCode(this));
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    public final boolean setCompoundDrawableTintBlendMode() {
        return ((Boolean) setX(new Object[]{this}, 1497723990, -1497723985, System.identityHashCode(this))).booleanValue();
    }

    @JvmName(name = "setDividerPadding")
    @NotNull
    public final Terminal setDividerPadding() {
        return (Terminal) setX(new Object[]{this}, -1116972605, 1116972608, System.identityHashCode(this));
    }

    @JvmName(name = "setIncludeFontPadding")
    @Nullable
    public final Long setIncludeFontPadding() {
        return (Long) setX(new Object[]{this}, 679016108, -679016106, System.identityHashCode(this));
    }

    @JvmName(name = "setLayoutAnimation")
    public final boolean setLayoutAnimation() {
        return ((Boolean) setX(new Object[]{this}, 605633600, -605633589, System.identityHashCode(this))).booleanValue();
    }

    @JvmName(name = "setNavigationOnClickListener")
    @Nullable
    public final Long setNavigationOnClickListener() {
        return (Long) setX(new Object[]{this}, 1485288090, -1485288080, System.identityHashCode(this));
    }

    @JvmName(name = "setOnDragListener")
    public final boolean setOnDragListener() {
        return ((Boolean) setX(new Object[]{this}, 1793045552, -1793045531, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setOnFocusChangeListener(@NotNull Terminal p4, @NotNull setMaxWidth p10) {
        return ((Boolean) setX(new Object[]{this, p4, p10}, -1456822105, 1456822117, System.identityHashCode(this))).booleanValue();
    }

    @JvmName(name = "setOnLongClickListener")
    @Nullable
    public final Long setOnLongClickListener() {
        return (Long) setX(new Object[]{this}, -830321268, 830321272, System.identityHashCode(this));
    }

    @JvmName(name = "setTextAlignment")
    @NotNull
    public final setMaxWidth setTextAlignment() {
        return (setMaxWidth) setX(new Object[]{this}, 466549121, -466549106, System.identityHashCode(this));
    }

    @JvmName(name = "setY")
    public final void setY(@Nullable Long l6) {
        setX(new Object[]{this, l6}, -341693205, 341693224, System.identityHashCode(this));
    }

    @JvmName(name = "setZ")
    @NotNull
    public final List<setNextFocusRightId> setZ() {
        return (List) setX(new Object[]{this}, -1485936157, 1485936171, System.identityHashCode(this));
    }

    @NotNull
    public final String toString() {
        return (String) setX(new Object[]{this}, -699597746, 699597766, System.identityHashCode(this));
    }

    @JvmName(name = "setOnFocusChangeListener")
    public final void setOnFocusChangeListener(@Nullable Long l6) {
        setX(new Object[]{this, l6}, -1969237334, 1969237340, System.identityHashCode(this));
    }

    @JvmName(name = "setY")
    @NotNull
    public final setBackgroundTintList setY() {
        return (setBackgroundTintList) setX(new Object[]{this}, 1901627190, -1901627173, System.identityHashCode(this));
    }

    @JvmName(name = "setOnFocusChangeListener")
    @Nullable
    public final Boolean setOnFocusChangeListener() {
        return (Boolean) setX(new Object[]{this}, 1649969822, -1649969809, System.identityHashCode(this));
    }

    public /* synthetic */ setMax(md mdVar, Terminal terminal, setBackgroundTintList setbackgroundtintlist, boolean z10, Boolean bool, boolean z11, boolean z12, boolean z13, Long l6, Long l7, Long l10, List list, setMaxWidth setmaxwidth, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(mdVar, terminal, setbackgroundtintlist, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? null : bool, (i10 & 32) != 0 ? false : z11, (i10 & 64) != 0 ? true : z12, (i10 & 128) != 0 ? false : z13, (i10 & 256) != 0 ? null : l6, (i10 & 512) != 0 ? null : l7, (i10 & 1024) != 0 ? null : l10, (i10 & 2048) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i10 & 4096) != 0 ? new setMaxWidth() : setmaxwidth, (i10 & 8192) != 0 ? null : str);
    }

    @JvmName(name = "setX")
    public final void setX(@Nullable Long l6) {
        setX(new Object[]{this, l6}, 1897321794, -1897321793, System.identityHashCode(this));
    }

    @JvmName(name = "setX")
    @NotNull
    public final md setX() {
        return (md) setX(new Object[]{this}, 1678059478, -1678059469, System.identityHashCode(this));
    }
}
