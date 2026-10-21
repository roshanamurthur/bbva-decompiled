package com.mypinpad.tsdk.isolation;

import bk.v;
import bk.w;
import com.esotericsoftware.asm.Opcodes;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\"\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b$\u0010%R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0005\u001a\u0004\b\b\u0010\u0007R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0005\u001a\u0004\b\u000e\u0010\u0007R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0005\u001a\u0004\b\u0012\u0010\u0007R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0005\u001a\u0004\b\u0015\u0010\u0007R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0005\u001a\u0004\b\u0018\u0010\u0007R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0005\u001a\u0004\b\u001a\u0010\u0007R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0005\u001a\u0004\b\u0010\u0010\u0007R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0005\u001a\u0004\b\u0013\u0010\u0007R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0005\u001a\u0004\b\u001e\u0010\u0007R \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0005\u001a\u0004\b \u0010\u0007R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0005\u001a\u0004\b\"\u0010\u0007R \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0005\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/mypinpad/tsdk/i/dependencies;", "", "", "Lcom/mypinpad/tsdk/i/TerminalCreationFailure;", "a", "Ljava/util/Set;", "setY", "()Ljava/util/Set;", "setOnFocusChangeListener", "b", "setCompoundDrawableTintBlendMode", "setX", "c", "d", "setDividerPadding", "e", "setOnLongClickListener", "f", "setLayoutAnimation", "setTextAlignment", "g", "setNavigationOnClickListener", "setIncludeFontPadding", "h", "getNavBarTitleString", "i", "setOnDragListener", "j", "k", "l", "UiMessageCallbackKtWhenMappings", "m", "setZ", "n", "setAlwaysDrawnWithCacheEnabled", "o", "<init>", "()V"}, k = 1, mv = {1, 5, 1})
public final class dependencies {

    @NotNull
    public static final dependencies INSTANCE = new dependencies();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Set<TerminalCreationFailure> setOnFocusChangeListener = v.setOf(TerminalCreationFailure.setCompoundDrawableTintBlendMode);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Set<TerminalCreationFailure> setX;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Set<TerminalCreationFailure> setCompoundDrawableTintBlendMode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Set<TerminalCreationFailure> setDividerPadding;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Set<TerminalCreationFailure> setOnLongClickListener;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Set<TerminalCreationFailure> setTextAlignment;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Set<TerminalCreationFailure> setIncludeFontPadding;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Set<TerminalCreationFailure> setY;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Set<TerminalCreationFailure> setOnDragListener;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Set<TerminalCreationFailure> getNavBarTitleString;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Set<TerminalCreationFailure> setNavigationOnClickListener;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Set<TerminalCreationFailure> setLayoutAnimation;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public static final Set<TerminalCreationFailure> setZ;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Set<TerminalCreationFailure> UiMessageCallbackKtWhenMappings;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Set<TerminalCreationFailure> setAlwaysDrawnWithCacheEnabled;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f55159p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f55160q = 1;

    static {
        TerminalCreationFailure terminalCreationFailure = TerminalCreationFailure.setDividerPadding;
        setX = v.setOf(terminalCreationFailure);
        setCompoundDrawableTintBlendMode = v.setOf(TerminalCreationFailure.setOnFocusChangeListener);
        TerminalCreationFailure terminalCreationFailure2 = TerminalCreationFailure.setY;
        setDividerPadding = v.setOf(terminalCreationFailure2);
        TerminalCreationFailure terminalCreationFailure3 = TerminalCreationFailure.setLayoutAnimation;
        setOnLongClickListener = v.setOf(terminalCreationFailure3);
        TerminalCreationFailure terminalCreationFailure4 = TerminalCreationFailure.setOnDragListener;
        setTextAlignment = v.setOf(terminalCreationFailure4);
        TerminalCreationFailure terminalCreationFailure5 = TerminalCreationFailure.setZ;
        setIncludeFontPadding = v.setOf(terminalCreationFailure5);
        setY = w.setOf((Object[]) new TerminalCreationFailure[]{terminalCreationFailure, terminalCreationFailure4});
        setOnDragListener = w.setOf((Object[]) new TerminalCreationFailure[]{terminalCreationFailure2, terminalCreationFailure3});
        getNavBarTitleString = w.setOf((Object[]) new TerminalCreationFailure[]{TerminalCreationFailure.setX, TerminalCreationFailure.getNavBarTitleString});
        TerminalCreationFailure terminalCreationFailure6 = TerminalCreationFailure.setNavigationOnClickListener;
        setNavigationOnClickListener = w.setOf((Object[]) new TerminalCreationFailure[]{terminalCreationFailure3, terminalCreationFailure6});
        setLayoutAnimation = w.setOf((Object[]) new TerminalCreationFailure[]{terminalCreationFailure2, terminalCreationFailure3, terminalCreationFailure6});
        setZ = w.setOf((Object[]) new TerminalCreationFailure[]{terminalCreationFailure5, terminalCreationFailure});
        UiMessageCallbackKtWhenMappings = w.setOf((Object[]) new TerminalCreationFailure[]{terminalCreationFailure5, terminalCreationFailure2});
        setAlwaysDrawnWithCacheEnabled = w.setOf((Object[]) new TerminalCreationFailure[]{terminalCreationFailure5, TerminalCreationFailure.setOnLongClickListener});
        int i10 = f55160q;
        int i11 = ((i10 | 33) << 1) - (i10 ^ 33);
        f55159p = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    @JvmName(name = "UiMessageCallbackKtWhenMappings")
    @NotNull
    public static Set<TerminalCreationFailure> UiMessageCallbackKtWhenMappings() {
        return (Set) setCompoundDrawableTintBlendMode(new Object[0], 504618590, -504618580, (int) System.currentTimeMillis());
    }

    @JvmName(name = "getNavBarTitleString")
    @NotNull
    public static Set<TerminalCreationFailure> getNavBarTitleString() {
        return (Set) setCompoundDrawableTintBlendMode(new Object[0], 1899006719, -1899006713, (int) System.currentTimeMillis());
    }

    @JvmName(name = "setAlwaysDrawnWithCacheEnabled")
    @NotNull
    public static Set<TerminalCreationFailure> setAlwaysDrawnWithCacheEnabled() {
        return (Set) setCompoundDrawableTintBlendMode(new Object[0], -17128640, 17128653, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * Opcodes.INSTANCEOF) + (i10 * Opcodes.INSTANCEOF);
        int i14 = ~i12;
        int i15 = ~i10;
        int i16 = (((~(i15 | i11)) | i14) * (-192)) + i13;
        int i17 = ~i11;
        int i18 = i15 | i17;
        int i19 = i14 | i17;
        switch ((((~(i19 | i10)) | (~(i18 | i12)) | (~(i10 | i11 | i12))) * 192) + (((~i19) | (~i18)) * (-384)) + i16) {
            case 1:
                int i20 = f55160q + 61;
                int i21 = i20 % 128;
                f55159p = i21;
                if (i20 % 2 != 0) {
                    throw null;
                }
                int i22 = (((i21 & (-82)) | ((~i21) & 81)) - (~(-(-((i21 & 81) << 1))))) - 1;
                f55160q = i22 % 128;
                if (i22 % 2 == 0) {
                    int i23 = 70 / 0;
                }
                return setZ;
            case 2:
                int i24 = f55159p;
                int i25 = i24 & 69;
                int i26 = i25 + ((i24 ^ 69) | i25);
                f55160q = i26 % 128;
                if (i26 % 2 == 0) {
                    int i27 = 82 / 0;
                }
                return setIncludeFontPadding;
            case 3:
                int i28 = f55159p;
                int i29 = (i28 & (-14)) | ((~i28) & 13);
                int i30 = -(-((i28 & 13) << 1));
                int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
                f55160q = i31 % 128;
                if (i31 % 2 == 0) {
                    int i32 = 46 / 0;
                }
                return setOnDragListener;
            case 4:
                int i33 = f55160q;
                int i34 = ((i33 | 46) << 1) - (i33 ^ 46);
                int i35 = (i34 ^ (-1)) + (i34 << 1);
                f55159p = i35 % 128;
                if (i35 % 2 != 0) {
                    int i36 = 77 / 0;
                }
                return setOnLongClickListener;
            case 5:
                int i37 = f55159p;
                int i38 = (i37 & (-4)) | ((~i37) & 3);
                int i39 = -(-((i37 & 3) << 1));
                int i40 = (i38 & i39) + (i39 | i38);
                f55160q = i40 % 128;
                if (i40 % 2 != 0) {
                    return setAlwaysDrawnWithCacheEnabled;
                }
                throw null;
            case 6:
                int i41 = f55160q;
                int i42 = i41 + 53;
                f55159p = i42 % 128;
                int i43 = i42 % 2;
                int i44 = (i41 ^ 97) + ((i41 & 97) << 1);
                f55159p = i44 % 128;
                if (i44 % 2 != 0) {
                    int i45 = 90 / 0;
                }
                return setY;
            case 7:
                int i46 = f55159p + 81;
                int i47 = i46 % 128;
                f55160q = i47;
                int i48 = i46 % 2;
                int i49 = (((i47 ^ 39) | (i47 & 39)) << 1) - (((~i47) & 39) | (i47 & (-40)));
                f55159p = i49 % 128;
                int i50 = i49 % 2;
                return getNavBarTitleString;
            case 8:
                int i51 = f55160q;
                int i52 = i51 & 89;
                int i53 = i52 + ((i51 ^ 89) | i52);
                f55159p = i53 % 128;
                if (i53 % 2 == 0) {
                    return setOnFocusChangeListener;
                }
                throw null;
            case 9:
                int i54 = f55159p;
                int i55 = ((i54 ^ 100) + ((i54 & 100) << 1)) - 1;
                int i56 = i55 % 128;
                f55160q = i56;
                int i57 = i55 % 2;
                int i58 = i56 + 87;
                f55159p = i58 % 128;
                if (i58 % 2 == 0) {
                    return setDividerPadding;
                }
                throw null;
            case 10:
                int i59 = f55159p;
                int i60 = i59 & 65;
                int i61 = -(-((i59 ^ 65) | i60));
                int i62 = ((i60 | i61) << 1) - (i61 ^ i60);
                int i63 = i62 % 128;
                f55160q = i63;
                int i64 = i62 % 2;
                int i65 = i63 & 17;
                int i66 = (((i63 | 17) & (~i65)) - (~(i65 << 1))) - 1;
                f55159p = i66 % 128;
                if (i66 % 2 != 0) {
                    int i67 = 51 / 0;
                }
                return setLayoutAnimation;
            case 11:
                int i68 = f55160q;
                int i69 = i68 & 65;
                int i70 = (i68 ^ 65) | i69;
                int i71 = (i69 ^ i70) + ((i70 & i69) << 1);
                f55159p = i71 % 128;
                if (i71 % 2 != 0) {
                    int i72 = 9 / 0;
                }
                return setTextAlignment;
            case 12:
                int i73 = f55159p + 13;
                f55160q = i73 % 128;
                if (i73 % 2 != 0) {
                    return setCompoundDrawableTintBlendMode;
                }
                throw null;
            case 13:
                int i74 = f55159p;
                int i75 = ((-1) << 1) - ((i74 + 48) ^ (-1));
                f55160q = i75 % 128;
                int i76 = i75 % 2;
                int i77 = ((i74 & (-72)) | ((~i74) & 71)) + ((i74 & 71) << 1);
                f55160q = i77 % 128;
                int i78 = i77 % 2;
                return UiMessageCallbackKtWhenMappings;
            case 14:
                int i79 = f55159p;
                int i80 = ((i79 & 78) + (i79 | 78)) - 1;
                f55160q = i80 % 128;
                if (i80 % 2 != 0) {
                    return setNavigationOnClickListener;
                }
                throw null;
            default:
                int i81 = f55159p;
                int i82 = ((i81 ^ 119) | (i81 & 119)) << 1;
                int i83 = -(((~i81) & 119) | (i81 & (-120)));
                int i84 = ((i82 | i83) << 1) - (i83 ^ i82);
                int i85 = i84 % 128;
                f55160q = i85;
                int i86 = i84 % 2;
                int i87 = ((i85 | 89) << 1) - (i85 ^ 89);
                f55159p = i87 % 128;
                int i88 = i87 % 2;
                return setX;
        }
    }

    @JvmName(name = "setDividerPadding")
    @NotNull
    public static Set<TerminalCreationFailure> setDividerPadding() {
        return (Set) setCompoundDrawableTintBlendMode(new Object[0], -1378426870, 1378426879, (int) System.currentTimeMillis());
    }

    @JvmName(name = "setIncludeFontPadding")
    @NotNull
    public static Set<TerminalCreationFailure> setIncludeFontPadding() {
        return (Set) setCompoundDrawableTintBlendMode(new Object[0], -500886768, 500886773, (int) System.currentTimeMillis());
    }

    @JvmName(name = "setLayoutAnimation")
    @NotNull
    public static Set<TerminalCreationFailure> setLayoutAnimation() {
        return (Set) setCompoundDrawableTintBlendMode(new Object[0], 1100971865, -1100971854, (int) System.currentTimeMillis());
    }

    @JvmName(name = "setNavigationOnClickListener")
    @NotNull
    public static Set<TerminalCreationFailure> setNavigationOnClickListener() {
        return (Set) setCompoundDrawableTintBlendMode(new Object[0], -1292484869, 1292484871, (int) System.currentTimeMillis());
    }

    @JvmName(name = "setOnDragListener")
    @NotNull
    public static Set<TerminalCreationFailure> setOnDragListener() {
        return (Set) setCompoundDrawableTintBlendMode(new Object[0], -190372723, 190372726, (int) System.currentTimeMillis());
    }

    @JvmName(name = "setOnFocusChangeListener")
    @NotNull
    public static Set<TerminalCreationFailure> setOnFocusChangeListener() {
        return (Set) setCompoundDrawableTintBlendMode(new Object[0], -704702607, 704702619, (int) System.currentTimeMillis());
    }

    @JvmName(name = "setOnLongClickListener")
    @NotNull
    public static Set<TerminalCreationFailure> setOnLongClickListener() {
        return (Set) setCompoundDrawableTintBlendMode(new Object[0], 2001704596, -2001704589, (int) System.currentTimeMillis());
    }

    @JvmName(name = "setTextAlignment")
    @NotNull
    public static Set<TerminalCreationFailure> setTextAlignment() {
        return (Set) setCompoundDrawableTintBlendMode(new Object[0], 1648345672, -1648345658, (int) System.currentTimeMillis());
    }

    @JvmName(name = "setX")
    @NotNull
    public static Set<TerminalCreationFailure> setX() {
        return (Set) setCompoundDrawableTintBlendMode(new Object[0], -2100115178, 2100115182, (int) System.currentTimeMillis());
    }

    @JvmName(name = "setY")
    @NotNull
    public static Set<TerminalCreationFailure> setY() {
        return (Set) setCompoundDrawableTintBlendMode(new Object[0], -1592755360, 1592755368, (int) System.currentTimeMillis());
    }

    @JvmName(name = "setZ")
    @NotNull
    public static Set<TerminalCreationFailure> setZ() {
        return (Set) setCompoundDrawableTintBlendMode(new Object[0], 252391236, -252391235, (int) System.currentTimeMillis());
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    @NotNull
    public static Set<TerminalCreationFailure> setCompoundDrawableTintBlendMode() {
        return (Set) setCompoundDrawableTintBlendMode(new Object[0], -1814256076, 1814256076, (int) System.currentTimeMillis());
    }
}
