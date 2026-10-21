package com.mypinpad.tsdk.isolation;

import dk.e;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \f2\u00020\u0001:\u0001\fB%\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0014\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\r8\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/mypinpad/tsdk/i/setAutoSizeTextTypeUniformWithPresetSizes;", "", "Lcom/mypinpad/tsdk/i/getTransactionPortrait;", "a", "Lcom/mypinpad/tsdk/i/getTransactionPortrait;", "setOnFocusChangeListener", "()Lcom/mypinpad/tsdk/i/getTransactionPortrait;", "", "b", "Ljava/lang/String;", "setCompoundDrawableTintBlendMode", "()Ljava/lang/String;", "setDividerPadding", "", "c", "Z", "setX", "()Z", "p0", "p1", "p2", "<init>", "(Lcom/mypinpad/tsdk/i/getTransactionPortrait;Ljava/lang/String;Z)V"}, k = 1, mv = {1, 5, 1})
public final class setAutoSizeTextTypeUniformWithPresetSizes {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f59468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f59469e = 1;

    /* JADX INFO: renamed from: setDividerPadding, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final getTransactionPortrait setOnFocusChangeListener;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String setDividerPadding;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final boolean setX;

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.setAutoSizeTextTypeUniformWithPresetSizes$setDividerPadding, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0007\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/mypinpad/tsdk/i/setAutoSizeTextTypeUniformWithPresetSizes$setDividerPadding;", "", "Lcom/mypinpad/tsdk/i/setAutoSizeTextTypeUniformWithPresetSizes;", "", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/setAutoSizeTextTypeUniformWithPresetSizes;)Ljava/lang/String;", "", "setOnFocusChangeListener", "(Ljava/lang/Iterable;)Ljava/lang/String;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f59473a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f59474b = 1;

        /* JADX INFO: renamed from: com.mypinpad.tsdk.i.setAutoSizeTextTypeUniformWithPresetSizes$setDividerPadding$a */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/setAutoSizeTextTypeUniformWithPresetSizes;", "p0", "", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/setAutoSizeTextTypeUniformWithPresetSizes;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 5, 1}, xi = 48)
        public static final class a extends Lambda implements Function1<setAutoSizeTextTypeUniformWithPresetSizes, CharSequence> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final a f59475p0 = new a();

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public static int f59476q0 = 0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public static int f59477r0 = 1;

            static {
                int i10 = f59477r0;
                int i11 = i10 & 93;
                int i12 = (i10 | 93) & (~i11);
                int i13 = i11 << 1;
                int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
                f59476q0 = i14 % 128;
                if (i14 % 2 != 0) {
                    throw null;
                }
            }

            public a() {
                super(1);
            }

            public static /* synthetic */ CharSequence a(Object[] objArr, int i10, int i11) {
                CharSequence charSequenceA;
                int i12 = (i11 * 825) + (i10 * 1649);
                int i13 = ~i11;
                if ((((~i10) | i13) * 824) + ((i11 | i10) * (-1648)) + ((i10 | i13) * (-824)) + i12 != 1) {
                    setAutoSizeTextTypeUniformWithPresetSizes setautosizetexttypeuniformwithpresetsizes = (setAutoSizeTextTypeUniformWithPresetSizes) objArr[1];
                    int i14 = f59476q0 + 1;
                    f59477r0 = i14 % 128;
                    int i15 = i14 % 2;
                    Intrinsics.checkNotNullParameter(setautosizetexttypeuniformwithpresetsizes, "");
                    Companion companion = setAutoSizeTextTypeUniformWithPresetSizes.INSTANCE;
                    charSequenceA = (String) Companion.setCompoundDrawableTintBlendMode(new Object[]{setautosizetexttypeuniformwithpresetsizes}, 682845536, -682845535, (int) System.currentTimeMillis());
                    int i16 = f59477r0 + 89;
                    f59476q0 = i16 % 128;
                    if (i16 % 2 != 0) {
                        int i17 = 39 / 0;
                    }
                } else {
                    a aVar = (a) objArr[0];
                    Object obj = objArr[1];
                    int i18 = f59476q0;
                    int i19 = i18 & 75;
                    int i20 = (i19 - (~(-(-((i18 ^ 75) | i19))))) - 1;
                    f59477r0 = i20 % 128;
                    setAutoSizeTextTypeUniformWithPresetSizes setautosizetexttypeuniformwithpresetsizes2 = (setAutoSizeTextTypeUniformWithPresetSizes) obj;
                    if (i20 % 2 == 0) {
                        System.identityHashCode(aVar);
                        a(new Object[]{aVar, setautosizetexttypeuniformwithpresetsizes2}, 1666804805, -1666804805);
                        throw null;
                    }
                    System.identityHashCode(aVar);
                    charSequenceA = a(new Object[]{aVar, setautosizetexttypeuniformwithpresetsizes2}, 1666804805, -1666804805);
                    int i21 = f59477r0;
                    int i22 = (i21 ^ 63) + ((i21 & 63) << 1);
                    f59476q0 = i22 % 128;
                    int i23 = i22 % 2;
                }
                return charSequenceA;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ CharSequence invoke(setAutoSizeTextTypeUniformWithPresetSizes setautosizetexttypeuniformwithpresetsizes) {
                Object[] objArr = {this, setautosizetexttypeuniformwithpresetsizes};
                System.identityHashCode(this);
                return a(objArr, 385725925, -385725924);
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
            int i13;
            int i14 = ~i10;
            int i15 = ~i11;
            int i16 = i14 | i15;
            int i17 = ~i16;
            int i18 = ~i12;
            int i19 = ((i17 | (~(i14 | i18)) | (~(i15 | i18))) * (-1136)) + (i11 * 569) + (i10 * 569);
            int i20 = i10 | i18;
            int i21 = (((~i20) | (~(i11 | i18)) | (~(i16 | i12))) * 568) + (((~(i14 | i12)) | (~(i15 | i12)) | (~(i20 | i11))) * (-568)) + i19;
            String str = "";
            if (i21 != 1) {
                Iterable iterable = (Iterable) objArr[0];
                Intrinsics.checkNotNullParameter(iterable, "");
                String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt___CollectionsKt.sortedWith(CollectionsKt___CollectionsKt.toList(iterable), new Comparator() { // from class: com.mypinpad.tsdk.i.setAutoSizeTextTypeUniformWithPresetSizes.setDividerPadding.4
                    public static /* synthetic */ Object setX(Object[] objArr2, int i22, int i23, int i24) {
                        Object obj = objArr2[1];
                        setAutoSizeTextTypeUniformWithPresetSizes setautosizetexttypeuniformwithpresetsizes = (setAutoSizeTextTypeUniformWithPresetSizes) obj;
                        setAutoSizeTextTypeUniformWithPresetSizes setautosizetexttypeuniformwithpresetsizes2 = (setAutoSizeTextTypeUniformWithPresetSizes) objArr2[2];
                        return Integer.valueOf(e.compareValues(Integer.valueOf(((getTransactionPortrait) setAutoSizeTextTypeUniformWithPresetSizes.setCompoundDrawableTintBlendMode(new Object[]{setautosizetexttypeuniformwithpresetsizes}, -2144215474, 2144215475, System.identityHashCode(setautosizetexttypeuniformwithpresetsizes))).setCompoundDrawableTintBlendMode()), Integer.valueOf(((getTransactionPortrait) setAutoSizeTextTypeUniformWithPresetSizes.setCompoundDrawableTintBlendMode(new Object[]{setautosizetexttypeuniformwithpresetsizes2}, -2144215474, 2144215475, System.identityHashCode(setautosizetexttypeuniformwithpresetsizes2))).setCompoundDrawableTintBlendMode())));
                    }

                    @Override // java.util.Comparator
                    public final int compare(T t10, T t11) {
                        return ((Integer) setX(new Object[]{this, t10, t11}, -1385769153, 1385769153, System.identityHashCode(this))).intValue();
                    }
                }), "", null, null, 0, null, a.f59475p0, 30, null);
                int i22 = f59474b;
                int i23 = ((i22 | 29) << 1) - (i22 ^ 29);
                f59473a = i23 % 128;
                int i24 = i23 % 2;
                return strJoinToString$default;
            }
            setAutoSizeTextTypeUniformWithPresetSizes setautosizetexttypeuniformwithpresetsizes = (setAutoSizeTextTypeUniformWithPresetSizes) objArr[0];
            Intrinsics.checkNotNullParameter(setautosizetexttypeuniformwithpresetsizes, "");
            StringBuilder sb2 = new StringBuilder("#");
            sb2.append(((getTransactionPortrait) setAutoSizeTextTypeUniformWithPresetSizes.setCompoundDrawableTintBlendMode(new Object[]{setautosizetexttypeuniformwithpresetsizes}, -2144215474, 2144215475, System.identityHashCode(setautosizetexttypeuniformwithpresetsizes))).setCompoundDrawableTintBlendMode());
            sb2.append('.');
            if (((Boolean) setAutoSizeTextTypeUniformWithPresetSizes.setCompoundDrawableTintBlendMode(new Object[]{setautosizetexttypeuniformwithpresetsizes}, -418746983, 418746985, System.identityHashCode(setautosizetexttypeuniformwithpresetsizes))).booleanValue()) {
                int i25 = f59473a;
                int i26 = ((i25 | 117) << 1) - (i25 ^ 117);
                int i27 = i26 % 128;
                f59474b = i27;
                int i28 = i26 % 2;
                int i29 = i27 & 85;
                int i30 = (i29 - (~((i27 ^ 85) | i29))) - 1;
                f59473a = i30 % 128;
                int i31 = i30 % 2;
                i13 = 1;
            } else {
                int i32 = f59474b;
                int i33 = i32 & 43;
                int i34 = (i32 | 43) & (~i33);
                int i35 = -(-(i33 << 1));
                int i36 = (i34 & i35) + (i34 | i35);
                f59473a = i36 % 128;
                int i37 = i36 % 2;
                i13 = 0;
            }
            sb2.append(i13);
            sb2.append('.');
            String str2 = (String) setAutoSizeTextTypeUniformWithPresetSizes.setCompoundDrawableTintBlendMode(new Object[]{setautosizetexttypeuniformwithpresetsizes}, 616624233, -616624233, System.identityHashCode(setautosizetexttypeuniformwithpresetsizes));
            if (str2 == null) {
                int i38 = f59474b;
                int i39 = ((i38 | 19) << 1) - (i38 ^ 19);
                int i40 = i39 % 128;
                f59473a = i40;
                int i41 = i39 % 2;
                int i42 = (((i40 ^ 11) | (i40 & 11)) << 1) - (((~i40) & 11) | (i40 & (-12)));
                f59474b = i42 % 128;
                int i43 = i42 % 2;
            } else {
                str = str2;
            }
            sb2.append(str);
            String string = sb2.toString();
            int i44 = f59474b;
            int i45 = i44 & 13;
            int i46 = (((i44 | 13) & (~i45)) - (~(-(-(i45 << 1))))) - 1;
            f59473a = i46 % 128;
            if (i46 % 2 == 0) {
                return string;
            }
            throw null;
        }

        @NotNull
        public static String setDividerPadding(@NotNull setAutoSizeTextTypeUniformWithPresetSizes setautosizetexttypeuniformwithpresetsizes) {
            return (String) setCompoundDrawableTintBlendMode(new Object[]{setautosizetexttypeuniformwithpresetsizes}, 682845536, -682845535, (int) System.currentTimeMillis());
        }

        @NotNull
        public static String setOnFocusChangeListener(@NotNull Iterable<setAutoSizeTextTypeUniformWithPresetSizes> iterable) {
            return (String) setCompoundDrawableTintBlendMode(new Object[]{iterable}, -698795434, 698795434, (int) System.currentTimeMillis());
        }
    }

    static {
        int i10 = f59469e;
        int i11 = (i10 & 65) + (i10 | 65);
        f59468d = i11 % 128;
        int i12 = i11 % 2;
    }

    public setAutoSizeTextTypeUniformWithPresetSizes(@NotNull getTransactionPortrait gettransactionportrait, @Nullable String str, boolean z10) {
        Intrinsics.checkNotNullParameter(gettransactionportrait, "");
        this.setOnFocusChangeListener = gettransactionportrait;
        this.setDividerPadding = str;
        this.setX = z10;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * (-463)) + (i10 * 465);
        int i14 = ~i11;
        int i15 = ~i12;
        int i16 = ~(i14 | i15);
        int i17 = ~(i14 | i10);
        int i18 = (((~(i10 | i12)) | i17) * 464) + ((i14 | (~i10) | i12) * (-464)) + (((~(i15 | i10)) | i16 | i17) * 464) + i13;
        int i19 = f59468d;
        if (i18 == 1) {
            setAutoSizeTextTypeUniformWithPresetSizes setautosizetexttypeuniformwithpresetsizes = (setAutoSizeTextTypeUniformWithPresetSizes) objArr[0];
            int i20 = i19 & 49;
            int i21 = (i19 | 49) & (~i20);
            int i22 = i20 << 1;
            int i23 = (i21 & i22) + (i22 | i21);
            f59469e = i23 % 128;
            int i24 = i23 % 2;
            getTransactionPortrait gettransactionportrait = setautosizetexttypeuniformwithpresetsizes.setOnFocusChangeListener;
            if (i24 != 0) {
                return gettransactionportrait;
            }
            throw null;
        }
        if (i18 != 2) {
            setAutoSizeTextTypeUniformWithPresetSizes setautosizetexttypeuniformwithpresetsizes2 = (setAutoSizeTextTypeUniformWithPresetSizes) objArr[0];
            int i25 = i19 + 105;
            f59469e = i25 % 128;
            int i26 = i25 % 2;
            String str = setautosizetexttypeuniformwithpresetsizes2.setDividerPadding;
            if (i26 != 0) {
                return str;
            }
            throw null;
        }
        setAutoSizeTextTypeUniformWithPresetSizes setautosizetexttypeuniformwithpresetsizes3 = (setAutoSizeTextTypeUniformWithPresetSizes) objArr[0];
        int i27 = ((i19 | 97) << 1) - (i19 ^ 97);
        f59469e = i27 % 128;
        int i28 = i27 % 2;
        boolean z10 = setautosizetexttypeuniformwithpresetsizes3.setX;
        if (i28 == 0) {
            throw null;
        }
        int i29 = i19 + 121;
        f59469e = i29 % 128;
        if (i29 % 2 != 0) {
            return Boolean.valueOf(z10);
        }
        throw null;
    }

    @JvmName(name = "setOnFocusChangeListener")
    @NotNull
    public final getTransactionPortrait setOnFocusChangeListener() {
        return (getTransactionPortrait) setCompoundDrawableTintBlendMode(new Object[]{this}, -2144215474, 2144215475, System.identityHashCode(this));
    }

    @JvmName(name = "setX")
    public final boolean setX() {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, -418746983, 418746985, System.identityHashCode(this))).booleanValue();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ setAutoSizeTextTypeUniformWithPresetSizes(getTransactionPortrait gettransactionportrait, String str, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i10 & 2) != 0 ? null : str;
        this(gettransactionportrait, str, (i10 & 4) != 0 ? str == null : z10);
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    @Nullable
    public final String setCompoundDrawableTintBlendMode() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, 616624233, -616624233, System.identityHashCode(this));
    }
}
