package com.mypinpad.tsdk.isolation;

import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006R\u001a\u0010\u000f\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/mypinpad/tsdk/i/setFindListener;", "", "", "p0", "", "setX", "([B)Z", "", "setOnFocusChangeListener", "()I", "setCompoundDrawableTintBlendMode", "()[B", "Lcom/mypinpad/tsdk/i/PinViewportDp;", "a", "Lcom/mypinpad/tsdk/i/PinViewportDp;", "setY", "()Lcom/mypinpad/tsdk/i/PinViewportDp;", "<init>", "(Lcom/mypinpad/tsdk/i/PinViewportDp;)V"}, k = 1, mv = {1, 5, 1})
public abstract class setFindListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f59703g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f59704h = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final PinViewportDp setY;

    /* JADX INFO: renamed from: setY, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final IntRange f59698b = new IntRange(48, 57);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final IntRange[] f59699c = {new IntRange(65, 90), new IntRange(97, 122)};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final IntRange f59700d = new IntRange(32, 32);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final IntRange[] f59701e = {new IntRange(33, 47), new IntRange(58, 64), new IntRange(91, 96), new IntRange(123, 126)};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final IntRange[] f59702f = {new IntRange(0, 31), new IntRange(127, 127)};

    public /* synthetic */ class setCompoundDrawableTintBlendMode {
        public static final /* synthetic */ int[] setX;

        static {
            int[] iArr = new int[PinViewportDp.values().length];
            iArr[PinViewportDp.getNavBarTitleString.ordinal()] = 1;
            iArr[PinViewportDp.setNavigationOnClickListener.ordinal()] = 2;
            iArr[PinViewportDp.setOnDragListener.ordinal()] = 3;
            iArr[PinViewportDp.setOnLongClickListener.ordinal()] = 4;
            iArr[PinViewportDp.setLayoutAnimation.ordinal()] = 5;
            iArr[PinViewportDp.setDividerPadding.ordinal()] = 6;
            iArr[PinViewportDp.setX.ordinal()] = 7;
            iArr[PinViewportDp.setOnFocusChangeListener.ordinal()] = 8;
            iArr[PinViewportDp.setY.ordinal()] = 9;
            iArr[PinViewportDp.setCompoundDrawableTintBlendMode.ordinal()] = 10;
            setX = iArr;
            int i10 = ((69 << 1) - (~(-((~0) & 69)))) - 1;
            int i11 = i10 % 128;
            int i12 = i10 % 2;
        }
    }

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.setFindListener$setY, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0014\u0010\u000b\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\t\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0005"}, d2 = {"Lcom/mypinpad/tsdk/i/setFindListener$setY;", "", "", "Lkotlin/ranges/IntRange;", "setCompoundDrawableTintBlendMode", "[Lkotlin/ranges/IntRange;", "setOnFocusChangeListener", "setOnLongClickListener", "setY", "setX", "Lkotlin/ranges/IntRange;", "setDividerPadding", "getNavBarTitleString", "<init>", "()V"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f59706a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f59707b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
            int i13;
            int i14 = (i11 * (-574)) + (i10 * (-574));
            int i15 = ~i10;
            int i16 = ~i12;
            int i17 = ~(i15 | i16);
            int i18 = ~((~i11) | i12);
            if ((((~(i10 | i16)) | (~(i12 | i15))) * 575) + (((~(i11 | i16)) | i18) * (-575)) + ((i17 | i18) * 1150) + i14 != 1) {
                byte[] bArr = (byte[]) objArr[0];
                IntRange[] intRangeArr = (IntRange[]) objArr[1];
                int i19 = f59706a;
                int i20 = i19 & 83;
                int i21 = (i19 | 83) & (~i20);
                int i22 = i20 << 1;
                int i23 = ((i21 | i22) << 1) - (i21 ^ i22);
                f59707b = i23 % 128;
                int i24 = i23 % 2;
                boolean zBooleanValue = ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{bArr, intRangeArr}, 258291379, -258291378, (int) System.currentTimeMillis())).booleanValue();
                int i25 = (-2) - ((f59707b + 58) ^ (-1));
                f59706a = i25 % 128;
                if (i25 % 2 != 0) {
                    int i26 = 14 / 0;
                }
                return Boolean.valueOf(zBooleanValue);
            }
            byte[] bArr2 = (byte[]) objArr[0];
            IntRange[] intRangeArr2 = (IntRange[]) objArr[1];
            int i27 = f59706a;
            int i28 = i27 & 123;
            int i29 = ((i27 ^ 123) | i28) << 1;
            int i30 = -((~i28) & (i27 | 123));
            int i31 = (i29 & i30) + (i29 | i30);
            f59707b = i31 % 128;
            int i32 = i31 % 2;
            int length = bArr2.length;
            int i33 = ((i27 & 58) + (i27 | 58)) - 1;
            f59707b = i33 % 128;
            int i34 = i33 % 2;
            int i35 = 0;
            while (i35 < length) {
                int i36 = f59707b;
                int i37 = (i36 ^ 31) + ((i36 & 31) << 1);
                int i38 = i37 % 128;
                f59706a = i38;
                int i39 = i37 % 2;
                byte b10 = bArr2[i35];
                int length2 = intRangeArr2.length;
                int i40 = (i38 & 53) + (i38 | 53);
                f59707b = i40 % 128;
                int i41 = i40 % 2;
                int i42 = 0;
                while (true) {
                    if (i42 >= length2) {
                        int i43 = f59707b;
                        int i44 = ~i43;
                        int i45 = (((i43 & (-40)) | (i44 & 39)) - (~((i43 & 39) << 1))) - 1;
                        f59706a = i45 % 128;
                        int i46 = i45 % 2;
                        int i47 = (((i43 & (-18)) | (i44 & 17)) - (~(-(-((i43 & 17) << 1))))) - 1;
                        int i48 = i47 % 128;
                        f59706a = i48;
                        int i49 = i47 % 2;
                        int i50 = (i48 | 25) << 1;
                        int i51 = -(i48 ^ 25);
                        int i52 = ((i50 | i51) << 1) - (i51 ^ i50);
                        f59707b = i52 % 128;
                        int i53 = i52 % 2;
                        return Boolean.FALSE;
                    }
                    System.currentTimeMillis();
                    System.currentTimeMillis();
                    IntRange intRange = intRangeArr2[i42];
                    int first = intRange.getFirst();
                    int last = intRange.getLast();
                    if (first <= b10) {
                        int i54 = f59706a;
                        int i55 = i54 + 91;
                        i13 = i55 % 128;
                        f59707b = i13;
                        int i56 = i55 % 2;
                        if (b10 <= last) {
                            break;
                        }
                        int i57 = i54 + 75;
                        f59707b = i57 % 128;
                        int i58 = i57 % 2;
                    } else {
                        int i59 = (-2) - ((f59706a + 40) ^ (-1));
                        f59707b = i59 % 128;
                        int i60 = i59 % 2;
                    }
                    i42 = (-2) - (((i42 ^ 2) + ((i42 & 2) << 1)) ^ (-1));
                    int i61 = f59706a;
                    int i62 = ((i61 ^ 99) | (i61 & 99)) << 1;
                    int i63 = -(((~i61) & 99) | (i61 & (-100)));
                    int i64 = (i62 ^ i63) + ((i63 & i62) << 1);
                    f59707b = i64 % 128;
                    int i65 = i64 % 2;
                }
                int i66 = i13 | 11;
                int i67 = ((i66 << 1) - (~(-(i66 & (~(i13 & 11)))))) - 1;
                f59706a = i67 % 128;
                int i68 = i67 % 2;
                int i69 = (i13 & 111) + (i13 | 111);
                f59706a = i69 % 128;
                int i70 = i69 % 2;
                System.currentTimeMillis();
                System.currentTimeMillis();
                System.currentTimeMillis();
                System.currentTimeMillis();
                i35 = ((i35 & 2) + (i35 | 2)) - 1;
                int i71 = f59706a;
                int i72 = (((i71 | 24) << 1) - (i71 ^ 24)) - 1;
                f59707b = i72 % 128;
                int i73 = i72 % 2;
            }
            int i74 = f59706a;
            int i75 = i74 & 95;
            int i76 = (i75 - (~((i74 ^ 95) | i75))) - 1;
            f59707b = i76 % 128;
            if (i76 % 2 != 0) {
                return Boolean.TRUE;
            }
            throw null;
        }
    }

    static {
        int i10 = f59704h;
        int i11 = i10 & 31;
        int i12 = ((i10 | 31) & (~i11)) + (i11 << 1);
        f59703g = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 94 / 0;
        }
    }

    public setFindListener(@NotNull PinViewportDp pinViewportDp) {
        Intrinsics.checkNotNullParameter(pinViewportDp, "");
        this.setY = pinViewportDp;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        byte[] bArr;
        boolean zBooleanValue;
        int i13 = ~i10;
        int i14 = (((~(i10 | (~i11))) | (~(i11 | i13 | i12))) * 235) + (((~(i13 | i12)) | i11) * (-470)) + (((~((~i12) | i13)) | i11) * (-235)) + (i11 * 471) + (i10 * 236);
        int i15 = 0;
        if (i14 != 1) {
            if (i14 != 2) {
                setFindListener setfindlistener = (setFindListener) objArr[0];
                int i16 = f59703g;
                int i17 = (i16 | 39) << 1;
                int i18 = -(((~i16) & 39) | (i16 & (-40)));
                int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
                int i20 = i19 % 128;
                f59704h = i20;
                int i21 = i19 % 2;
                PinViewportDp pinViewportDp = setfindlistener.setY;
                if (i21 == 0) {
                    int i22 = 22 / 0;
                }
                int i23 = ((i20 & (-30)) | ((~i20) & 29)) + ((i20 & 29) << 1);
                f59703g = i23 % 128;
                if (i23 % 2 == 0) {
                    return pinViewportDp;
                }
                throw null;
            }
            setFindListener setfindlistener2 = (setFindListener) objArr[0];
            byte[] bArr2 = (byte[]) objArr[1];
            int i24 = f59703g;
            int i25 = (i24 ^ 83) + ((i24 & 83) << 1);
            f59704h = i25 % 128;
            if (i25 % 2 == 0) {
                Intrinsics.checkNotNullParameter(bArr2, "");
                int i26 = setCompoundDrawableTintBlendMode.setX[setfindlistener2.setY.ordinal()];
                throw null;
            }
            Intrinsics.checkNotNullParameter(bArr2, "");
            int i27 = setCompoundDrawableTintBlendMode.setX[setfindlistener2.setY.ordinal()];
            IntRange intRange = f59700d;
            IntRange[] intRangeArr = f59699c;
            IntRange intRange2 = f59698b;
            switch (i27) {
                case 1:
                    String str = (String) setInputExtras.setDividerPadding(new Object[]{bArr2, Boolean.TRUE, 1}, -1521120231, 1521120244, 1);
                    Charset charset = Charsets.UTF_8;
                    if (str == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    byte[] bytes = str.getBytes(charset);
                    Intrinsics.checkNotNullExpressionValue(bytes, "");
                    zBooleanValue = ((Boolean) Companion.setCompoundDrawableTintBlendMode(new Object[]{bytes, new IntRange[]{intRange2}}, 928918568, -928918568, (int) System.currentTimeMillis())).booleanValue();
                    int i28 = f59703g;
                    int i29 = (-2) - (((i28 & 24) + (i28 | 24)) ^ (-1));
                    f59704h = i29 % 128;
                    if (i29 % 2 == 0) {
                        throw null;
                    }
                    break;
                case 2:
                    int i30 = f59704h;
                    int i31 = ((i30 & 124) + (i30 | 124)) - 1;
                    f59703g = i31 % 128;
                    int i32 = i31 % 2;
                    return Boolean.TRUE;
                case 3:
                default:
                    throw new setOnHierarchyChangeListener(2009, setfindlistener2.setY.toString());
                case 4:
                case 5:
                case 6:
                    String str2 = (String) setInputExtras.setDividerPadding(new Object[]{bArr2, Boolean.FALSE, 3}, -1521120231, 1521120244, 3);
                    Charset charset2 = Charsets.UTF_8;
                    if (str2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    byte[] bytes2 = str2.getBytes(charset2);
                    Intrinsics.checkNotNullExpressionValue(bytes2, "");
                    zBooleanValue = ((Boolean) Companion.setCompoundDrawableTintBlendMode(new Object[]{bytes2, new IntRange[]{intRange2}}, 928918568, -928918568, (int) System.currentTimeMillis())).booleanValue();
                    int i33 = f59703g;
                    int i34 = i33 ^ 51;
                    int i35 = (((i33 & 51) | i34) << 1) - i34;
                    f59704h = i35 % 128;
                    int i36 = i35 % 2;
                    break;
                    break;
                case 7:
                    zBooleanValue = ((Boolean) Companion.setCompoundDrawableTintBlendMode(new Object[]{bArr2, (IntRange[]) Arrays.copyOf(intRangeArr, intRangeArr.length)}, 928918568, -928918568, (int) System.currentTimeMillis())).booleanValue();
                    int i37 = f59703g;
                    int i38 = i37 & 17;
                    int i39 = -(-((i37 ^ 17) | i38));
                    int i40 = ((i38 | i39) << 1) - (i39 ^ i38);
                    f59704h = i40 % 128;
                    int i41 = i40 % 2;
                    break;
                case 8:
                    SpreadBuilder spreadBuilder = new SpreadBuilder(2);
                    spreadBuilder.addSpread(intRangeArr);
                    spreadBuilder.add(intRange2);
                    zBooleanValue = ((Boolean) Companion.setCompoundDrawableTintBlendMode(new Object[]{bArr2, (IntRange[]) spreadBuilder.toArray(new IntRange[spreadBuilder.size()])}, 928918568, -928918568, (int) System.currentTimeMillis())).booleanValue();
                    int i42 = f59703g;
                    int i43 = i42 & 103;
                    int i44 = (i43 - (~(-(-((i42 ^ 103) | i43))))) - 1;
                    f59704h = i44 % 128;
                    if (i44 % 2 == 0) {
                        int i45 = 85 / 0;
                        return Boolean.valueOf(zBooleanValue);
                    }
                    break;
                case 9:
                    SpreadBuilder spreadBuilder2 = new SpreadBuilder(5);
                    spreadBuilder2.addSpread(intRangeArr);
                    spreadBuilder2.add(intRange2);
                    spreadBuilder2.add(intRange);
                    spreadBuilder2.addSpread(f59701e);
                    spreadBuilder2.addSpread(f59702f);
                    zBooleanValue = ((Boolean) Companion.setCompoundDrawableTintBlendMode(new Object[]{bArr2, (IntRange[]) spreadBuilder2.toArray(new IntRange[spreadBuilder2.size()])}, 928918568, -928918568, (int) System.currentTimeMillis())).booleanValue();
                    int i46 = f59704h;
                    int i47 = i46 & 15;
                    int i48 = -(-(i46 | 15));
                    int i49 = (i47 ^ i48) + ((i48 & i47) << 1);
                    f59703g = i49 % 128;
                    if (i49 % 2 != 0) {
                        throw null;
                    }
                    break;
                case 10:
                    SpreadBuilder spreadBuilder3 = new SpreadBuilder(3);
                    spreadBuilder3.addSpread(intRangeArr);
                    spreadBuilder3.add(intRange2);
                    spreadBuilder3.add(intRange);
                    zBooleanValue = ((Boolean) Companion.setCompoundDrawableTintBlendMode(new Object[]{bArr2, (IntRange[]) spreadBuilder3.toArray(new IntRange[spreadBuilder3.size()])}, 928918568, -928918568, (int) System.currentTimeMillis())).booleanValue();
                    int i50 = f59703g;
                    int i51 = ((i50 ^ 59) - (~((i50 & 59) << 1))) - 1;
                    f59704h = i51 % 128;
                    int i52 = i51 % 2;
                    break;
            }
            return Boolean.valueOf(zBooleanValue);
        }
        setFindListener setfindlistener3 = (setFindListener) objArr[0];
        int i53 = f59703g + 103;
        f59704h = i53 % 128;
        if (i53 % 2 == 0) {
            int i54 = setCompoundDrawableTintBlendMode.setX[setfindlistener3.setY.ordinal()];
            throw null;
        }
        switch (setCompoundDrawableTintBlendMode.setX[setfindlistener3.setY.ordinal()]) {
            case 1:
            case 2:
            case 3:
                int onFocusChangeListener = setfindlistener3.setOnFocusChangeListener();
                bArr = new byte[onFocusChangeListener];
                int i55 = f59703g;
                int i56 = (i55 & 21) + (i55 | 21);
                f59704h = i56 % 128;
                int i57 = i56 % 2;
                int i58 = 0;
                while (i58 < onFocusChangeListener) {
                    int i59 = f59704h + 23;
                    f59703g = i59 % 128;
                    int i60 = i59 % 2;
                    bArr[i58] = 0;
                    int iIdentityHashCode = System.identityHashCode(setfindlistener3);
                    int i61 = 933 - (~(-(-(i58 * (-932)))));
                    int i62 = ~i58;
                    int i63 = (i62 | i58) & i62;
                    int i64 = ~iIdentityHashCode;
                    int i65 = (iIdentityHashCode | i64) & i64;
                    int i66 = (-2) & i65;
                    int i67 = (i65 | (-2)) & (~i66);
                    int i68 = ~((i67 & i66) | (i67 ^ i66));
                    int i69 = ((~i68) & i63) | ((~i63) & i68);
                    int i70 = i68 & i63;
                    int i71 = -(-(((i70 & i69) | (i69 ^ i70)) * (-933)));
                    int i72 = (i61 & i71) + (i71 | i61);
                    int i73 = i62 & i64;
                    int i74 = (~i73) & (i64 | i62);
                    int i75 = (i73 & i74) | (i74 ^ i73);
                    int i76 = ~i75;
                    int i77 = (i75 | i76) & i76;
                    int i78 = (i62 & (-2)) | ((~i62) & 1);
                    int i79 = i62 & 1;
                    int i80 = ~((i78 & i79) | (i78 ^ i79));
                    int i81 = ((i77 & i80) | ((~i80) & i77) | ((~i77) & i80)) * 933;
                    int i82 = i72 & i81;
                    int i83 = ((i81 | i72) & (~i82)) + (i82 << 1);
                    int i84 = (i58 & (-2)) | i79;
                    int i85 = i58 & 1;
                    i58 = (i83 - (~(-(~(-(-((~((i85 & i84) | (i84 ^ i85))) * 933))))))) - 2;
                    int i86 = f59704h;
                    int i87 = (((i86 | 56) << 1) - (i86 ^ 56)) - 1;
                    f59703g = i87 % 128;
                    int i88 = i87 % 2;
                }
                int iIdentityHashCode2 = System.identityHashCode(setfindlistener3);
                int i89 = 1339784175 ^ iIdentityHashCode2;
                int i90 = 1339784175 & iIdentityHashCode2;
                int i91 = (i90 & i89) | (i89 ^ i90);
                int i92 = ~i91;
                int i93 = (-168178739) - (~(-(-((((i91 | i92) & i92) | 1108482112) * 449))));
                int i94 = i93 ^ 1523214144;
                int i95 = (1523214144 & i93) << 1;
                int i96 = ((i94 | i95) << 1) - (i95 ^ i94);
                int i97 = ~iIdentityHashCode2;
                int i98 = 1188190280 & i97;
                int i99 = (i97 | 1188190280) & (~i98);
                int i100 = (i99 & i98) | (i99 ^ i98);
                int i101 = ((-1260076008) & i100) | ((~i100) & 1260076007);
                int i102 = i100 & 1260076007;
                int i103 = ~((i102 & i101) | (i101 ^ i102));
                int i104 = (i96 - (~(-(~(((i103 & 1108482112) | (1108482112 ^ i103)) * 449))))) - 2;
                int iIdentityHashCode3 = System.identityHashCode(setfindlistener3);
                int i105 = ~(((-139526145) & iIdentityHashCode3) | ((-139526145) ^ iIdentityHashCode3));
                int i106 = -(-(((i105 & 822233600) | (822233600 ^ i105)) * 501));
                int i107 = 1492338888 & i106;
                int i108 = -(-(i106 | 1492338888));
                int i109 = ((i107 | i108) << 1) - (i108 ^ i107);
                int i110 = i109 & (-1201106530);
                int i111 = (i110 - (~(((-1201106530) ^ i109) | i110))) - 1;
                int i112 = ~iIdentityHashCode3;
                int i113 = (iIdentityHashCode3 | i112) & i112;
                int i114 = ((~i113) & 1940573900) | ((-1940573901) & i113);
                int i115 = i113 & 1940573900;
                int i116 = (i115 & i114) | (i114 ^ i115);
                int i117 = (1257866444 & i116) | ((~i116) & (-1257866445));
                int i118 = i116 & (-1257866445);
                int i119 = -(-((~((i118 & i117) | (i117 ^ i118))) * 501));
                int i120 = i111 | i119;
                int i121 = i120 << 1;
                int i122 = -((~(i119 & i111)) & i120);
                if (i104 > (i121 & i122) + (i122 | i121)) {
                    int i123 = 20 / 0;
                }
                break;
            case 4:
            case 5:
            case 6:
                int onFocusChangeListener2 = setfindlistener3.setOnFocusChangeListener();
                bArr = new byte[onFocusChangeListener2];
                int i124 = f59704h;
                int i125 = ((i124 | 32) << 1) - (i124 ^ 32);
                int i126 = (i125 ^ (-1)) + (i125 << 1);
                f59703g = i126 % 128;
                while (true) {
                    int i127 = i126 % 2;
                    if (i15 >= onFocusChangeListener2) {
                        int i128 = f59704h + 15;
                        f59703g = i128 % 128;
                        int i129 = i128 % 2;
                    } else {
                        int i130 = f59703g;
                        int i131 = i130 & 85;
                        int i132 = ((i130 ^ 85) | i131) << 1;
                        int i133 = -((i130 | 85) & (~i131));
                        int i134 = (i132 ^ i133) + ((i133 & i132) << 1);
                        f59704h = i134 % 128;
                        int i135 = i134 % 2;
                        bArr[i15] = 48;
                        int iIdentityHashCode4 = System.identityHashCode(setfindlistener3);
                        int i136 = -(-(i15 * (-987)));
                        int i137 = (989 & i136) + (i136 | 989);
                        int i138 = ~i15;
                        int i139 = (i138 | i15) & i138;
                        int i140 = ~iIdentityHashCode4;
                        int i141 = i139 ^ i140;
                        int i142 = i139 & i140;
                        int i143 = (i141 & i142) | (i141 ^ i142);
                        int i144 = (i143 & 1) | (i143 ^ 1);
                        int i145 = ~i144;
                        int i146 = (i144 | i145) & i145;
                        int i147 = i15 & 1;
                        int i148 = (~i147) & (i15 | 1);
                        int i149 = (i147 & i148) | (i148 ^ i147);
                        int i150 = ~((i149 & iIdentityHashCode4) | (i149 ^ iIdentityHashCode4));
                        int i151 = i146 ^ i150;
                        int i152 = i146 & i150;
                        int i153 = ((i152 & i151) | (i151 ^ i152)) * 988;
                        int i154 = ((((~i153) & i137) | ((~i137) & i153)) - (~((i137 & i153) << 1))) - 1;
                        int i155 = i139 ^ 1;
                        int i156 = i139 & 1;
                        int i157 = -(-(((i155 & i156) | (i155 ^ i156)) * (-988)));
                        int i158 = i154 ^ i157;
                        int i159 = ((i157 & i154) | i158) << 1;
                        int i160 = -i158;
                        int i161 = (i159 ^ i160) + ((i159 & i160) << 1);
                        int i162 = ~((-2) | i139);
                        int i163 = i139 & iIdentityHashCode4;
                        int i164 = (iIdentityHashCode4 | i139) & (~i163);
                        int i165 = ~((i164 & i163) | (i164 ^ i163));
                        int i166 = (i165 & i162) | (i162 ^ i165);
                        int i167 = i140 & 1;
                        int i168 = (~i167) & (i140 | 1);
                        int i169 = (i167 & i168) | (i168 ^ i167);
                        int i170 = ~((i15 & i169) | (i138 & i169) | ((~i169) & i15));
                        int i171 = i166 & i170;
                        int i172 = (i170 | i166) & (~i171);
                        int i173 = -(-(((i172 & i171) | (i172 ^ i171)) * 988));
                        int i174 = i161 ^ i173;
                        i15 = ((((i173 & i161) | i174) << 1) - (~(-i174))) - 1;
                        int i175 = f59703g;
                        int i176 = i175 ^ 25;
                        i126 = (((i175 & 25) | i176) << 1) - i176;
                        f59704h = i126 % 128;
                    }
                    break;
                }
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                int onFocusChangeListener3 = setfindlistener3.setOnFocusChangeListener();
                byte[] bArr3 = new byte[onFocusChangeListener3];
                int i177 = f59704h;
                int i178 = i177 & 35;
                int i179 = (i177 ^ 35) | i178;
                while (true) {
                    int i180 = i178 + i179;
                    f59703g = i180 % 128;
                    int i181 = i180 % 2;
                    if (i15 >= onFocusChangeListener3) {
                        int i182 = f59704h;
                        int i183 = (i182 & (-36)) | ((~i182) & 35);
                        int i184 = (i182 & 35) << 1;
                        int i185 = (i183 & i184) + (i184 | i183);
                        f59703g = i185 % 128;
                        int i186 = i185 % 2;
                        return bArr3;
                    }
                    int i187 = f59704h;
                    int i188 = i187 & 89;
                    int i189 = (~i188) & (i187 | 89);
                    int i190 = -(-(i188 << 1));
                    int i191 = (i189 ^ i190) + ((i190 & i189) << 1);
                    f59703g = i191 % 128;
                    int i192 = i191 % 2;
                    bArr3[i15] = 65;
                    int i193 = i15 & 1;
                    int i194 = (i15 ^ 1) | i193;
                    i15 = ((i193 | i194) << 1) - (i194 ^ i193);
                    i178 = i187 & 85;
                    i179 = i187 | 85;
                }
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return bArr;
    }

    public final boolean setCompoundDrawableTintBlendMode(@NotNull byte[] p4) {
        return ((Boolean) setY(new Object[]{this, p4}, -2109739487, 2109739489, System.identityHashCode(this))).booleanValue();
    }

    public abstract int setOnFocusChangeListener();

    public abstract boolean setX(@NotNull byte[] p4);

    @NotNull
    public final byte[] setCompoundDrawableTintBlendMode() {
        return (byte[]) setY(new Object[]{this}, -333856840, 333856841, System.identityHashCode(this));
    }

    @JvmName(name = "setY")
    @NotNull
    public final PinViewportDp setY() {
        return (PinViewportDp) setY(new Object[]{this}, -1552351757, 1552351757, System.identityHashCode(this));
    }
}
