package com.mypinpad.tsdk.isolation;

import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0010\u0010\u001aR\u001c\u0010 \u001a\u0004\u0018\u00010\u001c8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\r\u0010\u001fR\u001a\u0010$\u001a\u00020!8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u0003\u001a\u0004\u0018\u00010&8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\u0014\u001a\u0004\u0018\u00010+8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b\u001b\u0010.R\u001c\u0010)\u001a\u0004\u0018\u00010+8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010-\u001a\u0004\b0\u0010.R\u001c\u0010\u000b\u001a\u0004\u0018\u00010+8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b \u0010.R\u001c\u0010\u000f\u001a\u0004\u0018\u00010+8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b3\u0010.R\u001c\u00100\u001a\u0004\u0018\u00010+8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010-\u001a\u0004\b5\u0010."}, d2 = {"Lcom/mypinpad/tsdk/i/component12;", "", "Lcom/mypinpad/tsdk/i/getDetailsFieldTextSizeSp;", "setAlwaysDrawnWithCacheEnabled", "()Lcom/mypinpad/tsdk/i/getDetailsFieldTextSizeSp;", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Long;", "setY", "()Ljava/lang/Long;", "setDividerPadding", "b", "setX", "setCompoundDrawableTintBlendMode", "Lcom/mypinpad/tsdk/i/component13;", "c", "Lcom/mypinpad/tsdk/i/component13;", "setOnFocusChangeListener", "()Lcom/mypinpad/tsdk/i/component13;", "UiMessageCallbackKtWhenMappings", "Ljava/util/Date;", "d", "Ljava/util/Date;", "()Ljava/util/Date;", "setOnLongClickListener", "Lcom/mypinpad/tsdk/i/setProgressDrawableTiled;", "e", "Lcom/mypinpad/tsdk/i/setProgressDrawableTiled;", "()Lcom/mypinpad/tsdk/i/setProgressDrawableTiled;", "setOnDragListener", "", "f", "Z", "setNavigationOnClickListener", "()Z", "Lcom/mypinpad/tsdk/i/setImportantForAccessibility;", "g", "Lcom/mypinpad/tsdk/i/setImportantForAccessibility;", "setLayoutAnimation", "()Lcom/mypinpad/tsdk/i/setImportantForAccessibility;", "", "h", "[B", "()[B", "i", "getNavBarTitleString", "j", "k", "setIncludeFontPadding", "l", "setTextAlignment"}, k = 1, mv = {1, 5, 1})
public final class component12 {
    public static int m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f54842n = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Long setDividerPadding;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Long setCompoundDrawableTintBlendMode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final component13 UiMessageCallbackKtWhenMappings;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Date setOnLongClickListener;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final setProgressDrawableTiled setOnDragListener;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final boolean setNavigationOnClickListener;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final setImportantForAccessibility setAlwaysDrawnWithCacheEnabled;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final byte[] setOnFocusChangeListener;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final byte[] setLayoutAnimation;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final byte[] setY;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final byte[] setX;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final byte[] getNavBarTitleString;

    public component12(Long l6, Long l7, component13 component13Var, Date date, setProgressDrawableTiled setprogressdrawabletiled, boolean z10, setImportantForAccessibility setimportantforaccessibility, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        z10 = (i10 & 32) != 0 ? false : z10;
        setimportantforaccessibility = (i10 & 64) != 0 ? null : setimportantforaccessibility;
        bArr = (i10 & 128) != 0 ? null : bArr;
        bArr2 = (i10 & 256) != 0 ? null : bArr2;
        bArr3 = (i10 & 512) != 0 ? null : bArr3;
        bArr4 = (i10 & 1024) != 0 ? null : bArr4;
        bArr5 = (i10 & 2048) != 0 ? null : bArr5;
        Intrinsics.checkNotNullParameter(date, "");
        this.setDividerPadding = l6;
        this.setCompoundDrawableTintBlendMode = l7;
        this.UiMessageCallbackKtWhenMappings = component13Var;
        this.setOnLongClickListener = date;
        this.setOnDragListener = setprogressdrawabletiled;
        this.setNavigationOnClickListener = z10;
        this.setAlwaysDrawnWithCacheEnabled = setimportantforaccessibility;
        this.setOnFocusChangeListener = bArr;
        this.setLayoutAnimation = bArr2;
        this.setY = bArr3;
        this.setX = bArr4;
        this.getNavBarTitleString = bArr5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        String dividerPadding;
        List<String> onFocusChangeListener;
        String strJoinToString$default;
        getDetailsFieldTextSizeSp getdetailsfieldtextsizesp;
        char c10;
        Object obj;
        int i13 = ((~i11) * (-783)) + (i11 * (-782)) + (i10 * 784);
        int i14 = ~i10;
        int i15 = ~i12;
        switch (((i14 | (~(i11 | i15))) * 783) + ((~(i14 | i15 | i11)) * (-783)) + i13) {
            case 1:
                component12 component12Var = (component12) objArr[0];
                getDetailsFieldTextSizeSp[] getdetailsfieldtextsizespArr = new getDetailsFieldTextSizeSp[13];
                Long l6 = component12Var.setDividerPadding;
                getdetailsfieldtextsizespArr[0] = l6 == null ? null : getCancelButtonIconDrawableId.setOnFocusChangeListener(l6.longValue());
                Long l7 = component12Var.setCompoundDrawableTintBlendMode;
                getdetailsfieldtextsizespArr[1] = l7 == null ? null : getCancelButtonIconDrawableId.setOnFocusChangeListener(l7.longValue());
                component13 component13Var = component12Var.UiMessageCallbackKtWhenMappings;
                getdetailsfieldtextsizespArr[2] = component13Var == null ? null : (getDetailsFieldTextSizeSp) setLogo.setY(new Object[]{Byte.valueOf(component13Var.setCompoundDrawableTintBlendMode())}, -1836464407, 1836464411, (int) System.currentTimeMillis());
                String string = component12Var.setOnLongClickListener.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                getdetailsfieldtextsizespArr[3] = (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{string}, 1240364979, -1240364979, (int) System.currentTimeMillis());
                setProgressDrawableTiled setprogressdrawabletiled = component12Var.setOnDragListener;
                getdetailsfieldtextsizespArr[4] = (setprogressdrawabletiled == null || (dividerPadding = setprogressdrawabletiled.setX().setDividerPadding()) == null) ? null : (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{dividerPadding}, 1240364979, -1240364979, (int) System.currentTimeMillis());
                setProgressDrawableTiled setprogressdrawabletiled2 = component12Var.setOnDragListener;
                getdetailsfieldtextsizespArr[5] = setprogressdrawabletiled2 == null ? null : (getDetailsFieldTextSizeSp) setLogo.setY(new Object[]{Byte.valueOf(setprogressdrawabletiled2.setY())}, -1836464407, 1836464411, (int) System.currentTimeMillis());
                getdetailsfieldtextsizespArr[6] = (getDetailsFieldTextSizeSp) initialisedefault.setCompoundDrawableTintBlendMode(new Object[]{Boolean.valueOf(component12Var.setNavigationOnClickListener)}, -772901588, 772901588, (int) System.currentTimeMillis());
                setImportantForAccessibility setimportantforaccessibility = component12Var.setAlwaysDrawnWithCacheEnabled;
                getdetailsfieldtextsizespArr[7] = (setimportantforaccessibility == null || (onFocusChangeListener = setimportantforaccessibility.setOnFocusChangeListener()) == null || (strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(onFocusChangeListener, null, null, null, 0, null, null, 63, null)) == null) ? null : (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{strJoinToString$default}, 1240364979, -1240364979, (int) System.currentTimeMillis());
                byte[] bArr = component12Var.setOnFocusChangeListener;
                if (bArr == null) {
                    c10 = '\b';
                    getdetailsfieldtextsizesp = null;
                } else {
                    getdetailsfieldtextsizesp = (getDetailsFieldTextSizeSp) setInputExtras.setDividerPadding(new Object[]{bArr}, -1588575357, 1588575372, (int) System.currentTimeMillis());
                    c10 = '\b';
                }
                getdetailsfieldtextsizespArr[c10] = getdetailsfieldtextsizesp;
                byte[] bArr2 = component12Var.setLayoutAnimation;
                getdetailsfieldtextsizespArr[9] = bArr2 == null ? null : (getDetailsFieldTextSizeSp) setInputExtras.setDividerPadding(new Object[]{bArr2}, -1588575357, 1588575372, (int) System.currentTimeMillis());
                byte[] bArr3 = component12Var.setY;
                getdetailsfieldtextsizespArr[10] = bArr3 == null ? null : (getDetailsFieldTextSizeSp) setInputExtras.setDividerPadding(new Object[]{bArr3}, -1588575357, 1588575372, (int) System.currentTimeMillis());
                byte[] bArr4 = component12Var.setX;
                getdetailsfieldtextsizespArr[11] = bArr4 == null ? null : (getDetailsFieldTextSizeSp) setInputExtras.setDividerPadding(new Object[]{bArr4}, -1588575357, 1588575372, (int) System.currentTimeMillis());
                byte[] bArr5 = component12Var.getNavBarTitleString;
                getdetailsfieldtextsizespArr[12] = bArr5 == null ? null : (getDetailsFieldTextSizeSp) setInputExtras.setDividerPadding(new Object[]{bArr5}, -1588575357, 1588575372, (int) System.currentTimeMillis());
                return new TerminalLogger(getdetailsfieldtextsizespArr, null, 2, 0 == true ? 1 : 0);
            case 2:
                component12 component12Var2 = (component12) objArr[0];
                int i16 = m;
                int i17 = ((i16 ^ 66) + ((i16 & 66) << 1)) - 1;
                f54842n = i17 % 128;
                int i18 = i17 % 2;
                obj = component12Var2.setOnFocusChangeListener;
                int i19 = i16 & 33;
                int i20 = (i16 ^ 33) | i19;
                int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
                f54842n = i21 % 128;
                int i22 = i21 % 2;
                break;
            case 3:
                component12 component12Var3 = (component12) objArr[0];
                int i23 = f54842n + 1;
                int i24 = i23 % 128;
                m = i24;
                int i25 = i23 % 2;
                setProgressDrawableTiled setprogressdrawabletiled3 = component12Var3.setOnDragListener;
                int i26 = (i24 ^ 117) + ((i24 & 117) << 1);
                f54842n = i26 % 128;
                int i27 = i26 % 2;
                return setprogressdrawabletiled3;
            case 4:
                component12 component12Var4 = (component12) objArr[0];
                int i28 = m;
                int i29 = ((i28 ^ 71) - (~((i28 & 71) << 1))) - 1;
                int i30 = i29 % 128;
                f54842n = i30;
                int i31 = i29 % 2;
                obj = component12Var4.setY;
                if (i31 == 0) {
                    throw null;
                }
                int i32 = ((i30 | 17) << 1) - (i30 ^ 17);
                m = i32 % 128;
                if (i32 % 2 != 0) {
                    throw null;
                }
                break;
            case 5:
                component12 component12Var5 = (component12) objArr[0];
                int i33 = m;
                int i34 = i33 ^ 9;
                int i35 = ((i33 & 9) | i34) << 1;
                int i36 = -i34;
                int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
                f54842n = i37 % 128;
                int i38 = i37 % 2;
                obj = component12Var5.setCompoundDrawableTintBlendMode;
                if (i38 == 0) {
                    throw null;
                }
                int i39 = (i33 & 5) + (i33 | 5);
                f54842n = i39 % 128;
                int i40 = i39 % 2;
                break;
                break;
            case 6:
                component12 component12Var6 = (component12) objArr[0];
                int i41 = m;
                int i42 = i41 | 15;
                int i43 = (i42 << 1) - (i42 & (~(i41 & 15)));
                f54842n = i43 % 128;
                int i44 = i43 % 2;
                boolean z10 = component12Var6.setNavigationOnClickListener;
                int i45 = (((i41 | 108) << 1) - (i41 ^ 108)) - 1;
                f54842n = i45 % 128;
                int i46 = i45 % 2;
                return Boolean.valueOf(z10);
            case 7:
                int i47 = f54842n;
                int i48 = ((i47 | 75) << 1) - (((~i47) & 75) | (i47 & (-76)));
                m = i48 % 128;
                int i49 = i48 % 2;
                setRenderEffect setrendereffect = setRenderEffect.INSTANCE;
                int i50 = m;
                int i51 = i50 & 117;
                int i52 = i51 + ((i50 ^ 117) | i51);
                f54842n = i52 % 128;
                int i53 = i52 % 2;
                return "";
            case 8:
                component12 component12Var7 = (component12) objArr[0];
                int i54 = f54842n;
                int i55 = i54 & 77;
                int i56 = -(-((i54 ^ 77) | i55));
                int i57 = (i55 ^ i56) + ((i55 & i56) << 1);
                m = i57 % 128;
                int i58 = i57 % 2;
                obj = component12Var7.getNavBarTitleString;
                int i59 = (i54 | 119) << 1;
                int i60 = -(i54 ^ 119);
                int i61 = ((i59 | i60) << 1) - (i60 ^ i59);
                m = i61 % 128;
                if (i61 % 2 != 0) {
                    throw null;
                }
                break;
            case 9:
                component12 component12Var8 = (component12) objArr[0];
                int i62 = f54842n;
                int i63 = ((i62 ^ 8) + ((i62 & 8) << 1)) - 1;
                int i64 = i63 % 128;
                m = i64;
                int i65 = i63 % 2;
                obj = component12Var8.setOnLongClickListener;
                int i66 = i64 & 39;
                int i67 = (i64 ^ 39) | i66;
                int i68 = (i66 ^ i67) + ((i67 & i66) << 1);
                f54842n = i68 % 128;
                int i69 = i68 % 2;
                break;
            case 10:
                component12 component12Var9 = (component12) objArr[0];
                int i70 = f54842n + 91;
                int i71 = i70 % 128;
                m = i71;
                int i72 = i70 % 2;
                setImportantForAccessibility setimportantforaccessibility2 = component12Var9.setAlwaysDrawnWithCacheEnabled;
                int i73 = (i71 & 111) + (i71 | 111);
                f54842n = i73 % 128;
                if (i73 % 2 != 0) {
                    return setimportantforaccessibility2;
                }
                throw null;
            case 11:
                component12 component12Var10 = (component12) objArr[0];
                int i74 = f54842n;
                int i75 = ((i74 | 101) << 1) - (((~i74) & 101) | (i74 & (-102)));
                int i76 = i75 % 128;
                m = i76;
                int i77 = i75 % 2;
                obj = component12Var10.UiMessageCallbackKtWhenMappings;
                if (i77 != 0) {
                    int i78 = 30 / 0;
                }
                int i79 = (i76 | 103) << 1;
                int i80 = -(((~i76) & 103) | (i76 & (-104)));
                int i81 = ((i79 | i80) << 1) - (i80 ^ i79);
                f54842n = i81 % 128;
                if (i81 % 2 == 0) {
                    throw null;
                }
                break;
            case 12:
                component12 component12Var11 = (component12) objArr[0];
                int i82 = f54842n;
                int i83 = i82 ^ 11;
                int i84 = (i82 & 11) << 1;
                int i85 = ((i83 | i84) << 1) - (i84 ^ i83);
                int i86 = i85 % 128;
                m = i86;
                int i87 = i85 % 2;
                obj = component12Var11.setX;
                int i88 = (i86 & 104) + (i86 | 104);
                int i89 = (i88 ^ (-1)) + (i88 << 1);
                f54842n = i89 % 128;
                int i90 = i89 % 2;
                break;
            case 13:
                component12 component12Var12 = (component12) objArr[0];
                int i91 = f54842n;
                int i92 = ((i91 & 100) + (i91 | 100)) - 1;
                m = i92 % 128;
                int i93 = i92 % 2;
                obj = component12Var12.setLayoutAnimation;
                int i94 = i91 & 37;
                int i95 = (((i91 | 37) & (~i94)) - (~(-(-(i94 << 1))))) - 1;
                m = i95 % 128;
                int i96 = i95 % 2;
                break;
            default:
                component12 component12Var13 = (component12) objArr[0];
                int i97 = m;
                int i98 = (((i97 & (-102)) | ((~i97) & 101)) - (~((i97 & 101) << 1))) - 1;
                int i99 = i98 % 128;
                f54842n = i99;
                int i100 = i98 % 2;
                obj = component12Var13.setDividerPadding;
                if (i100 == 0) {
                    int i101 = 6 / 0;
                }
                int i102 = i99 + 27;
                m = i102 % 128;
                if (i102 % 2 != 0) {
                    throw null;
                }
                break;
        }
        return obj;
    }

    @JvmName(name = "getNavBarTitleString")
    @Nullable
    public final byte[] getNavBarTitleString() {
        return (byte[]) setX(new Object[]{this}, -1770896091, 1770896104, System.identityHashCode(this));
    }

    @NotNull
    public final getDetailsFieldTextSizeSp setAlwaysDrawnWithCacheEnabled() {
        return (getDetailsFieldTextSizeSp) setX(new Object[]{this}, -838704000, 838704001, System.identityHashCode(this));
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    @NotNull
    public final Date setCompoundDrawableTintBlendMode() {
        return (Date) setX(new Object[]{this}, -1795922846, 1795922855, System.identityHashCode(this));
    }

    @JvmName(name = "setDividerPadding")
    @Nullable
    public final setProgressDrawableTiled setDividerPadding() {
        return (setProgressDrawableTiled) setX(new Object[]{this}, 972931950, -972931947, System.identityHashCode(this));
    }

    @JvmName(name = "setIncludeFontPadding")
    @Nullable
    public final byte[] setIncludeFontPadding() {
        return (byte[]) setX(new Object[]{this}, -927483712, 927483724, System.identityHashCode(this));
    }

    @JvmName(name = "setLayoutAnimation")
    @Nullable
    public final setImportantForAccessibility setLayoutAnimation() {
        return (setImportantForAccessibility) setX(new Object[]{this}, 1496871361, -1496871351, System.identityHashCode(this));
    }

    @JvmName(name = "setNavigationOnClickListener")
    public final boolean setNavigationOnClickListener() {
        return ((Boolean) setX(new Object[]{this}, -1666503461, 1666503467, System.identityHashCode(this))).booleanValue();
    }

    @JvmName(name = "setOnDragListener")
    @Nullable
    public final byte[] setOnDragListener() {
        return (byte[]) setX(new Object[]{this}, 940527128, -940527124, System.identityHashCode(this));
    }

    @JvmName(name = "setOnFocusChangeListener")
    @Nullable
    public final component13 setOnFocusChangeListener() {
        return (component13) setX(new Object[]{this}, -1223512608, 1223512619, System.identityHashCode(this));
    }

    @JvmName(name = "setOnLongClickListener")
    @Nullable
    public final byte[] setOnLongClickListener() {
        return (byte[]) setX(new Object[]{this}, 305043302, -305043300, System.identityHashCode(this));
    }

    @JvmName(name = "setTextAlignment")
    @Nullable
    public final byte[] setTextAlignment() {
        return (byte[]) setX(new Object[]{this}, 808531158, -808531150, System.identityHashCode(this));
    }

    @JvmName(name = "setY")
    @Nullable
    public final Long setY() {
        return (Long) setX(new Object[]{this}, 2015756496, -2015756496, System.identityHashCode(this));
    }

    @NotNull
    public final String toString() {
        return (String) setX(new Object[]{this}, -1826061153, 1826061160, System.identityHashCode(this));
    }

    @JvmName(name = "setX")
    @Nullable
    public final Long setX() {
        return (Long) setX(new Object[]{this}, -1804967839, 1804967844, System.identityHashCode(this));
    }
}
