package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0006\u001a\u00020\u00028\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\t\"\u0004\b\b\u0010\rR\"\u0010\u0010\u001a\u00020\u00028\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\t\"\u0004\b\u0006\u0010\rR\"\u0010\u0017\u001a\u00020\u00118\u0007@\u0007X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\b\u0010\u0016"}, d2 = {"Lcom/mypinpad/tsdk/i/br;", "Lcom/mypinpad/tsdk/i/t;", "", "p0", "", "p1", "setOnFocusChangeListener", "([BI)I", "setDividerPadding", "()[B", "f", "[B", "setLayoutAnimation", "([B)V", "g", "setNavigationOnClickListener", "setX", "", "i", "Ljava/lang/String;", "setAlwaysDrawnWithCacheEnabled", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "setCompoundDrawableTintBlendMode", "<init>", "()V"}, k = 1, mv = {1, 5, 1})
public final class br extends t {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f54724j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f54725k = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public byte[] setOnFocusChangeListener;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public byte[] setX;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f54728h;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public String setCompoundDrawableTintBlendMode;

    static {
        int i10 = f54724j;
        int i11 = (i10 & 45) + (i10 | 45);
        f54725k = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    public br() {
        super(setAnimation.TerminalErrorCodes().setDividerPadding());
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        Object obj;
        int i13;
        int i14 = ((~(i11 | i12)) * TypedValues.CycleType.TYPE_EASING) + (i11 * 421) + (i10 * (-419));
        int i15 = ~i10;
        switch ((((~(i15 | (~i11))) | (~(i11 | (~i12)))) * TypedValues.CycleType.TYPE_EASING) + ((i11 | i15) * (-420)) + i14) {
            case 1:
                br brVar = (br) objArr[0];
                byte[] bArr = (byte[]) objArr[1];
                int i16 = f54725k;
                int i17 = i16 & 91;
                int i18 = -(-((i16 ^ 91) | i17));
                int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
                f54724j = i19 % 128;
                if (i19 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(bArr, "");
                    brVar.setOnFocusChangeListener = bArr;
                    return null;
                }
                Intrinsics.checkNotNullParameter(bArr, "");
                brVar.setOnFocusChangeListener = bArr;
                throw null;
            case 2:
                br brVar2 = (br) objArr[0];
                String str = (String) objArr[1];
                int i20 = f54724j;
                int i21 = (-2) - (((i20 & 76) + (i20 | 76)) ^ (-1));
                f54725k = i21 % 128;
                int i22 = i21 % 2;
                Intrinsics.checkNotNullParameter(str, "");
                brVar2.setCompoundDrawableTintBlendMode = str;
                int i23 = f54725k;
                int i24 = ((i23 | 15) << 1) - (i23 ^ 15);
                f54724j = i24 % 128;
                if (i24 % 2 == 0) {
                    return null;
                }
                throw null;
            case 3:
                br brVar3 = (br) objArr[0];
                StringBuilder sb2 = new StringBuilder();
                sb2.append(new String((byte[]) setDividerPadding(new Object[]{brVar3}, 852545853, -852545845, System.identityHashCode(brVar3)), Charsets.UTF_8));
                sb2.append('D');
                sb2.append((String) setInputExtras.setDividerPadding(new Object[]{(byte[]) setDividerPadding(new Object[]{brVar3}, -1105949976, 1105949985, System.identityHashCode(brVar3))}, 1609250238, -1609250236, (int) System.currentTimeMillis()));
                sb2.append((String) setDividerPadding(new Object[]{brVar3}, -1973278694, 1973278698, System.identityHashCode(brVar3)));
                sb2.append((String) setDividerPadding(new Object[]{brVar3}, 1626133488, -1626133481, System.identityHashCode(brVar3)));
                brVar3.setX((byte[]) setDividerPadding(new Object[]{sb2.toString()}, 439750779, -439750769, (int) System.currentTimeMillis()));
                byte[] dividerPadding = super.setDividerPadding();
                int i25 = f54724j;
                int i26 = i25 & 93;
                int i27 = i25 | 93;
                int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
                f54725k = i28 % 128;
                int i29 = i28 % 2;
                return dividerPadding;
            case 4:
                br brVar4 = (br) objArr[0];
                int i30 = f54724j;
                int i31 = (((i30 | 94) << 1) - (i30 ^ 94)) - 1;
                int i32 = i31 % 128;
                f54725k = i32;
                int i33 = i31 % 2;
                obj = brVar4.f54728h;
                if (obj == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i34 = f54725k;
                    int i35 = (i34 & 4) + (i34 | 4);
                    int i36 = (i35 ^ (-1)) + (i35 << 1);
                    f54724j = i36 % 128;
                    if (i36 % 2 == 0) {
                        return null;
                    }
                    throw null;
                }
                int i37 = ((i32 & 2) + (i32 | 2)) - 1;
                int i38 = i37 % 128;
                f54724j = i38;
                if (i37 % 2 != 0) {
                    throw null;
                }
                int i39 = i38 & 27;
                int i40 = ((i38 ^ 27) | i39) << 1;
                int i41 = -((i38 | 27) & (~i39));
                int i42 = ((i40 | i41) << 1) - (i41 ^ i40);
                f54725k = i42 % 128;
                int i43 = i42 % 2;
                break;
                break;
            case 5:
                br brVar5 = (br) objArr[0];
                byte[] bArr2 = (byte[]) objArr[1];
                int i44 = f54724j;
                int i45 = (i44 & (-84)) | ((~i44) & 83);
                int i46 = -(-((i44 & 83) << 1));
                int i47 = ((i45 | i46) << 1) - (i46 ^ i45);
                f54725k = i47 % 128;
                if (i47 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(bArr2, "");
                    brVar5.setX = bArr2;
                    return null;
                }
                Intrinsics.checkNotNullParameter(bArr2, "");
                brVar5.setX = bArr2;
                throw null;
            case 6:
                br brVar6 = (br) objArr[0];
                byte[] bArr3 = (byte[]) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                int i48 = f54725k;
                int i49 = i48 & 65;
                int i50 = i49 + ((i48 ^ 65) | i49);
                f54724j = i50 % 128;
                int i51 = i50 % 2;
                int onFocusChangeListener = super.setOnFocusChangeListener(bArr3, iIntValue);
                List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) setInputExtras.setDividerPadding(new Object[]{brVar6.setCompoundDrawableTintBlendMode()}, 1609250238, -1609250236, (int) System.currentTimeMillis()), new char[]{'D'}, false, 0, 6, (Object) null);
                String str2 = (String) listSplit$default.get(0);
                Charset charset = Charsets.UTF_8;
                if (str2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                byte[] bytes = str2.getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes, "");
                setDividerPadding(new Object[]{brVar6, bytes}, 470085672, -470085671, System.identityHashCode(brVar6));
                String str3 = (String) listSplit$default.get(1);
                if (str3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String strSubstring = str3.substring(0, 4);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                setDividerPadding(new Object[]{brVar6, (byte[]) setInputExtras.setDividerPadding(new Object[]{strSubstring}, -1768743273, 1768743278, (int) System.currentTimeMillis())}, -54327137, 54327142, System.identityHashCode(brVar6));
                String str4 = (String) listSplit$default.get(1);
                if (str4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String strSubstring2 = str4.substring(4, 7);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                setDividerPadding(new Object[]{brVar6, strSubstring2}, -2003539319, 2003539319, System.identityHashCode(brVar6));
                String str5 = (String) listSplit$default.get(1);
                if (str5 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String strSubstring3 = str5.substring(7);
                Intrinsics.checkNotNullExpressionValue(strSubstring3, "");
                setDividerPadding(new Object[]{brVar6, strSubstring3}, 372005292, -372005290, System.identityHashCode(brVar6));
                int i52 = f54725k;
                int i53 = i52 & 1;
                int i54 = i53 + ((i52 ^ 1) | i53);
                f54724j = i54 % 128;
                if (i54 % 2 == 0) {
                    return Integer.valueOf(onFocusChangeListener);
                }
                throw null;
            case 7:
                br brVar7 = (br) objArr[0];
                int i55 = f54725k;
                int i56 = i55 & 27;
                int i57 = i56 + ((i55 ^ 27) | i56);
                f54724j = i57 % 128;
                int i58 = i57 % 2;
                obj = brVar7.setCompoundDrawableTintBlendMode;
                if (obj == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i59 = f54724j;
                    int i60 = i59 ^ 67;
                    int i61 = -(-((i59 & 67) << 1));
                    int i62 = (i60 ^ i61) + ((i61 & i60) << 1);
                    f54725k = i62 % 128;
                    if (i62 % 2 != 0) {
                        return null;
                    }
                    throw null;
                }
                int i63 = (((i55 & (-126)) | ((~i55) & 125)) - (~(-(-((i55 & 125) << 1))))) - 1;
                f54724j = i63 % 128;
                if (i63 % 2 != 0) {
                    int i64 = 8 / 0;
                }
                int i65 = i55 + 26;
                int i66 = (i65 ^ (-1)) + (i65 << 1);
                f54724j = i66 % 128;
                if (i66 % 2 != 0) {
                    throw null;
                }
                break;
            case 8:
                br brVar8 = (br) objArr[0];
                int i67 = f54724j;
                int i68 = (i67 & (-88)) | ((~i67) & 87);
                int i69 = -(-((i67 & 87) << 1));
                int i70 = (i68 & i69) + (i68 | i69);
                f54725k = i70 % 128;
                int i71 = i70 % 2;
                obj = brVar8.setOnFocusChangeListener;
                if (obj == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i72 = f54725k;
                    int i73 = i72 & 107;
                    int i74 = (i72 | 107) & (~i73);
                    int i75 = i73 << 1;
                    int i76 = (i74 & i75) + (i74 | i75);
                    f54724j = i76 % 128;
                    if (i76 % 2 == 0) {
                        return null;
                    }
                    throw null;
                }
                int i77 = i67 & 9;
                int i78 = (i67 | 9) & (~i77);
                int i79 = -(-(i77 << 1));
                int i80 = ((i78 | i79) << 1) - (i78 ^ i79);
                f54725k = i80 % 128;
                if (i80 % 2 == 0) {
                    throw null;
                }
                break;
            case 9:
                br brVar9 = (br) objArr[0];
                int i81 = f54724j;
                int i82 = i81 ^ 55;
                int i83 = -(-((i81 & 55) << 1));
                int i84 = (i82 ^ i83) + ((i83 & i82) << 1);
                int i85 = i84 % 128;
                f54725k = i85;
                int i86 = i84 % 2;
                obj = brVar9.setX;
                if (i86 == 0) {
                    throw null;
                }
                if (obj == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i87 = f54725k;
                    int i88 = ((i87 & 94) + (i87 | 94)) - 1;
                    f54724j = i88 % 128;
                    if (i88 % 2 == 0) {
                        return null;
                    }
                    throw null;
                }
                int i89 = i85 + 87;
                f54724j = i89 % 128;
                int i90 = i89 % 2;
                break;
                break;
            case 10:
                String strStringPlus = (String) objArr[0];
                int i91 = f54725k + 75;
                f54724j = i91 % 128;
                int i92 = i91 % 2;
                if (strStringPlus.length() % 2 == 1) {
                    int i93 = f54725k;
                    int i94 = ((i93 | 30) << 1) - (i93 ^ 30);
                    int i95 = (i94 ^ (-1)) + (i94 << 1);
                    f54724j = i95 % 128;
                    int i96 = i95 % 2;
                    strStringPlus = Intrinsics.stringPlus(strStringPlus, "F");
                    int i97 = f54724j;
                    int i98 = (i97 ^ 10) + ((i97 & 10) << 1);
                    i13 = (i98 ^ (-1)) + (i98 << 1);
                    f54725k = i13 % 128;
                } else {
                    i13 = f54725k + 53;
                    f54724j = i13 % 128;
                }
                int i99 = i13 % 2;
                byte[] bArr4 = (byte[]) setInputExtras.setDividerPadding(new Object[]{strStringPlus}, -1768743273, 1768743278, (int) System.currentTimeMillis());
                int i100 = f54725k;
                int i101 = (((i100 & (-12)) | ((~i100) & 11)) - (~((i100 & 11) << 1))) - 1;
                f54724j = i101 % 128;
                int i102 = i101 % 2;
                return bArr4;
            default:
                br brVar10 = (br) objArr[0];
                String str6 = (String) objArr[1];
                int i103 = f54725k;
                int i104 = i103 & 113;
                int i105 = i104 + ((i103 ^ 113) | i104);
                f54724j = i105 % 128;
                int i106 = i105 % 2;
                Intrinsics.checkNotNullParameter(str6, "");
                brVar10.f54728h = str6;
                int i107 = f54724j;
                int i108 = i107 & 51;
                int i109 = (i107 | 51) & (~i108);
                int i110 = i108 << 1;
                int i111 = (i109 ^ i110) + ((i109 & i110) << 1);
                f54725k = i111 % 128;
                int i112 = i111 % 2;
                return null;
        }
        return obj;
    }

    @JvmName(name = "setLayoutAnimation")
    @NotNull
    public final byte[] setLayoutAnimation() {
        return (byte[]) setDividerPadding(new Object[]{this}, 852545853, -852545845, System.identityHashCode(this));
    }

    @JvmName(name = "setNavigationOnClickListener")
    @NotNull
    public final byte[] setNavigationOnClickListener() {
        return (byte[]) setDividerPadding(new Object[]{this}, -1105949976, 1105949985, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setImageTintList, com.mypinpad.tsdk.isolation.setLeftTopRightBottom
    public final int setOnFocusChangeListener(@Nullable byte[] p4, int p10) {
        return ((Integer) setDividerPadding(new Object[]{this, p4, Integer.valueOf(p10)}, 119247369, -119247363, p10)).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.setImageTintList
    @NotNull
    public final byte[] setDividerPadding() {
        return (byte[]) setDividerPadding(new Object[]{this}, 1356844571, -1356844568, System.identityHashCode(this));
    }

    @JvmName(name = "setDividerPadding")
    public final void setDividerPadding(@NotNull String str) {
        setDividerPadding(new Object[]{this, str}, 372005292, -372005290, System.identityHashCode(this));
    }
}
