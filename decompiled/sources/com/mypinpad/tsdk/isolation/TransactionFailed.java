package com.mypinpad.tsdk.isolation;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010)\u001a\u00020\u0005\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010+\u001a\u00020\u0018\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010.\u001a\u00020\u0005\u0012\b\b\u0002\u0010/\u001a\u00020\n¢\u0006\u0004\b0\u00101J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0007R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0015\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001e\u001a\u00020\nX\u0007¢\u0006\u0006\n\u0004\b\u001b\u0010\u001dR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001e\u0010#R\u0011\u0010\u001b\u001a\u00020\u0005X\u0007¢\u0006\u0006\n\u0004\b\u0015\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0005X\u0007¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u001b\u0010'\u001a\u00020$8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010("}, d2 = {"Lcom/mypinpad/tsdk/i/TransactionFailed;", "Lcom/mypinpad/tsdk/i/getDetailsFieldTextSizeSp;", "", GenerateActivationFormCommand.HASH_CODE, "()I", "", "setCompoundDrawableTintBlendMode", "()Ljava/lang/String;", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "setOnFocusChangeListener", "getNavBarTitleString", "", "Lcom/mypinpad/tsdk/i/TerminalCreationFailure;", "b", "Ljava/util/Set;", "setY", "()Ljava/util/Set;", "setNavigationOnClickListener", "Lcom/mypinpad/tsdk/i/setFindListener;", "c", "Lcom/mypinpad/tsdk/i/setFindListener;", "setDividerPadding", "()Lcom/mypinpad/tsdk/i/setFindListener;", "Z", "setX", "", "Lcom/mypinpad/tsdk/i/setTextSize;", "d", "[Lcom/mypinpad/tsdk/i/setTextSize;", "()[Lcom/mypinpad/tsdk/i/setTextSize;", "", "e", "Lkotlin/Lazy;", "setOnDragListener", "()[B", "p1", "p2", "p3", "Lcom/mypinpad/tsdk/i/getPinGridButtonNumFontSizeSp;", "p4", "p5", "p6", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lcom/mypinpad/tsdk/i/setFindListener;Lcom/mypinpad/tsdk/i/getPinGridButtonNumFontSizeSp;Ljava/lang/String;Z)V"}, k = 1, mv = {1, 5, 1})
public final class TransactionFailed implements getDetailsFieldTextSizeSp {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f51914f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f51915g = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String getNavBarTitleString;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Set<TerminalCreationFailure> setNavigationOnClickListener;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final setFindListener setY;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final setTextSize[] setCompoundDrawableTintBlendMode;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy setOnDragListener;

    /* JADX INFO: renamed from: setDividerPadding, reason: from kotlin metadata */
    public boolean setX;

    @NotNull
    public String setOnFocusChangeListener;

    /* JADX INFO: renamed from: setY, reason: from kotlin metadata */
    @NotNull
    public String setDividerPadding;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "setY", "()[B"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends Lambda implements Function0<byte[]> {
        public a() {
            super(0);
        }

        public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
            int i13 = (i11 * (-864)) + (i10 * 866);
            int i14 = ~i11;
            int i15 = ~i10;
            int i16 = ~i12;
            if ((((~(i10 | i16)) | (~(i14 | i16))) * 865) + ((~(i12 | i10)) * 865) + (((~(i15 | i16)) | i14) * (-865)) + i13 != 1) {
                a aVar = (a) objArr[0];
                return (byte[]) setY(new Object[]{aVar}, -1423050328, 1423050329, System.identityHashCode(aVar));
            }
            TransactionFailed transactionFailed = TransactionFailed.this;
            return (byte[]) setInputExtras.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, -1768743273, 1768743278, (int) System.currentTimeMillis());
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [byte[], java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ byte[] invoke() {
            return setY(new Object[]{this}, -921494355, 921494355, System.identityHashCode(this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TransactionFailed(@NotNull String str, @NotNull String str2, @NotNull Set<? extends TerminalCreationFailure> set, @NotNull setFindListener setfindlistener, @NotNull getPinGridButtonNumFontSizeSp getpingridbuttonnumfontsizesp, @NotNull String str3, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(set, "");
        Intrinsics.checkNotNullParameter(setfindlistener, "");
        Intrinsics.checkNotNullParameter(getpingridbuttonnumfontsizesp, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.getNavBarTitleString = str;
        this.setNavigationOnClickListener = set;
        this.setY = setfindlistener;
        this.setX = z10;
        this.setCompoundDrawableTintBlendMode = getpingridbuttonnumfontsizesp.setOnFocusChangeListener();
        setRenderEffect setrendereffect = setRenderEffect.INSTANCE;
        this.setDividerPadding = "";
        this.setOnFocusChangeListener = "";
        this.setOnDragListener = LazyKt__LazyJVMKt.lazy(new a());
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        boolean zEquals;
        int i13 = ((~i11) * (-783)) + (i11 * (-782)) + (i10 * 784);
        int i14 = ~i10;
        int i15 = ~i12;
        switch (((i14 | (~(i11 | i15))) * 783) + ((~(i14 | i15 | i11)) * (-783)) + i13) {
            case 1:
                TransactionFailed transactionFailed = (TransactionFailed) objArr[0];
                int i16 = f51915g;
                int i17 = (i16 & (-88)) | ((~i16) & 87);
                int i18 = (i16 & 87) << 1;
                int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
                f51914f = i19 % 128;
                if (i19 % 2 == 0) {
                    return (String) setInputExtras.setDividerPadding(new Object[]{(byte[]) setX(new Object[]{transactionFailed}, 2029048574, -2029048570, System.identityHashCode(transactionFailed))}, 1609250238, -1609250236, (int) System.currentTimeMillis());
                }
                int i20 = 39 / 0;
                return (String) setInputExtras.setDividerPadding(new Object[]{(byte[]) setX(new Object[]{transactionFailed}, 2029048574, -2029048570, System.identityHashCode(transactionFailed))}, 1609250238, -1609250236, (int) System.currentTimeMillis());
            case 2:
                TransactionFailed transactionFailed2 = (TransactionFailed) objArr[0];
                int i21 = f51914f;
                int i22 = i21 & 101;
                int i23 = (((i21 ^ 101) | i22) << 1) - ((~i22) & (i21 | 101));
                f51915g = i23 % 128;
                int i24 = i23 % 2;
                setFindListener setfindlistener = transactionFailed2.setY;
                int i25 = (((i21 & (-112)) | ((~i21) & 111)) - (~((i21 & 111) << 1))) - 1;
                f51915g = i25 % 128;
                int i26 = i25 % 2;
                return setfindlistener;
            case 3:
                TransactionFailed transactionFailed3 = (TransactionFailed) objArr[0];
                int i27 = f51915g;
                int i28 = (i27 & 113) + (i27 | 113);
                f51914f = i28 % 128;
                int i29 = i28 % 2;
                Set<TerminalCreationFailure> set = transactionFailed3.setNavigationOnClickListener;
                int i30 = (i27 | 37) << 1;
                int i31 = -(i27 ^ 37);
                int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
                f51914f = i32 % 128;
                if (i32 % 2 == 0) {
                    return set;
                }
                throw null;
            case 4:
                TransactionFailed transactionFailed4 = (TransactionFailed) objArr[0];
                int i33 = f51914f;
                int i34 = (-2) - ((((i33 | 78) << 1) - (i33 ^ 78)) ^ (-1));
                f51915g = i34 % 128;
                int i35 = i34 % 2;
                byte[] bArr = (byte[]) transactionFailed4.setOnDragListener.getValue();
                if (i35 != 0) {
                    return bArr;
                }
                throw null;
            case 5:
                TransactionFailed transactionFailed5 = (TransactionFailed) objArr[0];
                int i36 = f51915g;
                int i37 = i36 & 67;
                int i38 = -(-((i36 ^ 67) | i37));
                int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
                f51914f = i39 % 128;
                int i40 = i39 % 2;
                String str = transactionFailed5.getNavBarTitleString;
                if (i40 != 0) {
                    str.hashCode();
                    throw null;
                }
                int iHashCode = str.hashCode();
                int i41 = f51914f;
                int i42 = (i41 ^ 111) + ((i41 & 111) << 1);
                f51915g = i42 % 128;
                if (i42 % 2 == 0) {
                    int i43 = 48 / 0;
                }
                return Integer.valueOf(iHashCode);
            case 6:
                TransactionFailed transactionFailed6 = (TransactionFailed) objArr[0];
                int i44 = f51915g;
                int i45 = i44 & 5;
                int i46 = (i45 - (~(-(-((i44 ^ 5) | i45))))) - 1;
                int i47 = i46 % 128;
                f51914f = i47;
                int i48 = i46 % 2;
                String str2 = transactionFailed6.getNavBarTitleString;
                if (i48 != 0) {
                    int i49 = 97 / 0;
                }
                int i50 = i47 & 21;
                int i51 = -(-(i47 | 21));
                int i52 = ((i50 | i51) << 1) - (i51 ^ i50);
                f51915g = i52 % 128;
                int i53 = i52 % 2;
                return str2;
            case 7:
                TransactionFailed transactionFailed7 = (TransactionFailed) objArr[0];
                int i54 = f51914f;
                int i55 = ((i54 | 105) << 1) - (i54 ^ 105);
                int i56 = i55 % 128;
                f51915g = i56;
                int i57 = i55 % 2;
                setTextSize[] settextsizeArr = transactionFailed7.setCompoundDrawableTintBlendMode;
                if (i57 == 0) {
                    throw null;
                }
                int i58 = i56 ^ 69;
                int i59 = (i56 & 69) << 1;
                int i60 = (i58 & i59) + (i59 | i58);
                f51914f = i60 % 128;
                if (i60 % 2 == 0) {
                    return settextsizeArr;
                }
                throw null;
            default:
                TransactionFailed transactionFailed8 = (TransactionFailed) objArr[0];
                Object obj = objArr[1];
                int i61 = f51915g;
                int i62 = i61 & 11;
                int i63 = (i61 | 11) & (~i62);
                int i64 = -(-(i62 << 1));
                int i65 = (i63 ^ i64) + ((i63 & i64) << 1);
                int i66 = i65 % 128;
                f51914f = i66;
                int i67 = i65 % 2;
                if (obj instanceof TransactionFailed) {
                    int i68 = i66 & 43;
                    int i69 = i68 + ((i66 ^ 43) | i68);
                    f51915g = i69 % 128;
                    int i70 = i69 % 2;
                    zEquals = Intrinsics.areEqual(((TransactionFailed) obj).getNavBarTitleString, transactionFailed8.getNavBarTitleString);
                    int i71 = f51915g;
                    int i72 = i71 & 13;
                    int i73 = (i71 | 13) & (~i72);
                    int i74 = -(-(i72 << 1));
                    int i75 = (i73 ^ i74) + ((i73 & i74) << 1);
                    f51914f = i75 % 128;
                    if (i75 % 2 != 0) {
                        throw null;
                    }
                } else {
                    zEquals = super.equals(obj);
                    int i76 = f51914f;
                    int i77 = i76 & 15;
                    int i78 = -(-((i76 ^ 15) | i77));
                    int i79 = (i77 ^ i78) + ((i78 & i77) << 1);
                    f51915g = i79 % 128;
                    int i80 = i79 % 2;
                }
                return Boolean.valueOf(zEquals);
        }
    }

    public final boolean equals(@Nullable Object p4) {
        return ((Boolean) setX(new Object[]{this, p4}, 1802866270, -1802866270, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setX(new Object[]{this}, 340835748, -340835743, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.getDetailsFieldTextSizeSp
    @NotNull
    public final String setCompoundDrawableTintBlendMode() {
        return (String) setX(new Object[]{this}, 1149920996, -1149920995, System.identityHashCode(this));
    }

    @JvmName(name = "setDividerPadding")
    @NotNull
    public final setFindListener setDividerPadding() {
        return (setFindListener) setX(new Object[]{this}, -570885530, 570885532, System.identityHashCode(this));
    }

    @JvmName(name = "setOnDragListener")
    @NotNull
    public final byte[] setOnDragListener() {
        return (byte[]) setX(new Object[]{this}, 2029048574, -2029048570, System.identityHashCode(this));
    }

    @JvmName(name = "setOnFocusChangeListener")
    @NotNull
    public final String setOnFocusChangeListener() {
        return (String) setX(new Object[]{this}, 1914607362, -1914607356, System.identityHashCode(this));
    }

    @JvmName(name = "setY")
    @NotNull
    public final Set<TerminalCreationFailure> setY() {
        return (Set) setX(new Object[]{this}, 1253802503, -1253802500, System.identityHashCode(this));
    }

    public /* synthetic */ TransactionFailed(String str, String str2, Set set, setFindListener setfindlistener, getPinGridButtonNumFontSizeSp getpingridbuttonnumfontsizesp, String str3, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, set, setfindlistener, getpingridbuttonnumfontsizesp, str3, (i10 & 64) != 0 ? false : z10);
    }

    @JvmName(name = "setX")
    @NotNull
    public final setTextSize[] setX() {
        return (setTextSize[]) setX(new Object[]{this}, -1568503950, 1568503957, System.identityHashCode(this));
    }
}
