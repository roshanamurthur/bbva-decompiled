package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J9\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/mypinpad/tsdk/i/startTransaction;", "", "Lcom/mypinpad/tsdk/i/setTouchDelegate;", "p0", "Lcom/mypinpad/tsdk/i/eu;", "p1", "Lcom/mypinpad/tsdk/i/setAdjustViewBounds;", "p2", "Lcom/mypinpad/tsdk/i/values;", "p3", "Lcom/mypinpad/tsdk/i/setTextColor;", "p4", "Lcom/mypinpad/tsdk/i/setPreferKeepClear;", "setX", "(Lcom/mypinpad/tsdk/i/setTouchDelegate;Lcom/mypinpad/tsdk/i/eu;Lcom/mypinpad/tsdk/i/setAdjustViewBounds;Lcom/mypinpad/tsdk/i/values;Lcom/mypinpad/tsdk/i/setTextColor;)Lcom/mypinpad/tsdk/i/setPreferKeepClear;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class startTransaction {

    @NotNull
    public static final startTransaction INSTANCE = new startTransaction();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f60921a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f60922b = 1;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/setImageURI;", "p0", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/setImageURI;)Lcom/mypinpad/tsdk/i/setImageURI;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends Lambda implements Function1<setImageURI, setImageURI> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f60923p0 = new a();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f60924q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f60925r0 = 1;

        static {
            int i10 = f60925r0;
            int i11 = ((i10 | 43) << 1) - (i10 ^ 43);
            f60924q0 = i11 % 128;
            int i12 = i11 % 2;
        }

        public a() {
            super(1);
        }

        public static /* synthetic */ setImageURI a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = (i11 * (-657)) + (i10 * 659);
            int i14 = ~((~i10) | i11);
            int i15 = ~((~i11) | i10);
            int i16 = ~(i10 | i12);
            if (((i16 | i15) * 658) + (i15 * 658) + ((i14 | i15 | i16) * (-658)) + i13 != 1) {
                a aVar = (a) objArr[0];
                Object obj = objArr[1];
                int i17 = f60924q0;
                int i18 = ((i17 ^ 81) - (~((i17 & 81) << 1))) - 1;
                f60925r0 = i18 % 128;
                setImageURI setimageuri = (setImageURI) obj;
                if (i18 % 2 != 0) {
                    return a(new Object[]{aVar, setimageuri}, -1524167327, 1524167328, System.identityHashCode(aVar));
                }
                a(new Object[]{aVar, setimageuri}, -1524167327, 1524167328, System.identityHashCode(aVar));
                throw null;
            }
            setImageURI setimageuri2 = (setImageURI) objArr[1];
            Intrinsics.checkNotNullParameter(setimageuri2, "");
            setImageURI setimageuri3 = (setImageURI) setImageURI.setX(new Object[]{setimageuri2, new setFontFeatureSettings(false, false, false, false, null, 31, null)}, -1897769378, 1897769381, (int) System.currentTimeMillis());
            setMax setmax = (setMax) setImageURI.setX(new Object[]{setimageuri3}, -1896705164, 1896705168, System.identityHashCode(setimageuri3));
            setMaxWidth setmaxwidth = (setMaxWidth) setMax.setX(new Object[]{setmax}, 466549121, -466549106, System.identityHashCode(setmax));
            setAnimation setanimation = setAnimation.INSTANCE;
            TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -692948779, 692948802, (int) System.currentTimeMillis());
            getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setMaxWidth.setX(new Object[]{setmaxwidth, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, -480651882, 480651889, System.identityHashCode(setmaxwidth));
            if (getbeeponfailure != null) {
                setFontFeatureSettings setfontfeaturesettings = (setFontFeatureSettings) setImageURI.setX(new Object[]{setimageuri3}, -1838857790, 1838857790, System.identityHashCode(setimageuri3));
                cs csVar = new cs(getbeeponfailure);
                Unit unit = Unit.INSTANCE;
                setFontFeatureSettings.setCompoundDrawableTintBlendMode(new Object[]{setfontfeaturesettings, csVar}, -1309573751, 1309573755, System.identityHashCode(setfontfeaturesettings));
                int i19 = f60925r0;
                int i20 = i19 ^ 29;
                int i21 = ((((i19 & 29) | i20) << 1) - (~(-i20))) - 1;
                f60924q0 = i21 % 128;
                int i22 = i21 % 2;
            }
            int i23 = f60924q0;
            int i24 = i23 & 105;
            int i25 = (i23 | 105) & (~i24);
            int i26 = i24 << 1;
            int i27 = (i25 & i26) + (i25 | i26);
            f60925r0 = i27 % 128;
            if (i27 % 2 != 0) {
                return setimageuri3;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ setImageURI invoke(setImageURI setimageuri) {
            return a(new Object[]{this, setimageuri}, -1648253568, 1648253568, System.identityHashCode(this));
        }
    }

    static {
        int i10 = f60922b;
        int i11 = ((-1) << 1) - ((-1) ^ ((i10 & 4) + (i10 | 4)));
        f60921a = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    @NotNull
    public static setPreferKeepClear setX(@NotNull setTouchDelegate p4, @NotNull eu p10, @NotNull setAdjustViewBounds p11, @NotNull values p12, @Nullable setTextColor p13) {
        return (setPreferKeepClear) setY(new Object[]{p4, p10, p11, p12, p13}, -306947982, 306947982, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        setTouchDelegate settouchdelegate = (setTouchDelegate) objArr[0];
        eu euVar = (eu) objArr[1];
        setAdjustViewBounds setadjustviewbounds = (setAdjustViewBounds) objArr[2];
        values valuesVar = (values) objArr[3];
        setTextColor settextcolor = (setTextColor) objArr[4];
        int i13 = f60922b;
        int i14 = i13 & 7;
        int i15 = (i13 ^ 7) | i14;
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        f60921a = i16 % 128;
        int i17 = i16 % 2;
        Intrinsics.checkNotNullParameter(settouchdelegate, "");
        Intrinsics.checkNotNullParameter(euVar, "");
        Intrinsics.checkNotNullParameter(setadjustviewbounds, "");
        Intrinsics.checkNotNullParameter(valuesVar, "");
        if (settextcolor != null) {
            int i18 = f60922b;
            int i19 = ((i18 | 59) << 1) - (i18 ^ 59);
            f60921a = i19 % 128;
            int i20 = i19 % 2;
            if (!(!((Boolean) setTextColor.setCompoundDrawableTintBlendMode(new Object[]{settextcolor}, -241966471, 241966480, System.identityHashCode(settextcolor))).booleanValue())) {
                if (((Boolean) setTextColor.setCompoundDrawableTintBlendMode(new Object[]{settextcolor}, 1166317983, -1166317975, System.identityHashCode(settextcolor))).booleanValue()) {
                    setPreferKeepClear setpreferkeepclear = new setPreferKeepClear((l) setTextColor.setCompoundDrawableTintBlendMode(new Object[]{settextcolor}, -1276529327, 1276529329, System.identityHashCode(settextcolor)));
                    int i21 = f60921a + 93;
                    f60922b = i21 % 128;
                    int i22 = i21 % 2;
                    return setpreferkeepclear;
                }
                setPreferKeepClear setpreferkeepclear2 = new setPreferKeepClear(null, 1, null);
                int i23 = f60921a;
                int i24 = ((i23 | 91) << 1) - (i23 ^ 91);
                f60922b = i24 % 128;
                int i25 = i24 % 2;
                return setpreferkeepclear2;
            }
        }
        if (settouchdelegate == setTouchDelegate.setDividerPadding) {
            int i26 = f60921a;
            int i27 = i26 & 113;
            int i28 = i27 + ((i26 ^ 113) | i27);
            f60922b = i28 % 128;
            if (i28 % 2 == 0) {
                values.setY(new Object[]{valuesVar, a.f60923p0}, 1066085569, -1066085566, System.identityHashCode(valuesVar));
                throw null;
            }
            values.setY(new Object[]{valuesVar, a.f60923p0}, 1066085569, -1066085566, System.identityHashCode(valuesVar));
            int i29 = f60921a;
            int i30 = i29 | 29;
            int i31 = (i30 << 1) - ((~(i29 & 29)) & i30);
            f60922b = i31 % 128;
            int i32 = i31 % 2;
        }
        setAdjustViewBounds.setCompoundDrawableTintBlendMode(new Object[]{setadjustviewbounds}, 730478759, -730478740, System.identityHashCode(setadjustviewbounds));
        int i33 = f60921a;
        int i34 = i33 & 115;
        int i35 = -(-((i33 ^ 115) | i34));
        int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
        f60922b = i36 % 128;
        int i37 = i36 % 2;
        setPreferKeepClear setpreferkeepclear3 = new setPreferKeepClear((l) eu.setY(new Object[]{new setHighlightColor()}, 2109649987, -2109649975, (int) System.currentTimeMillis()));
        int i38 = f60922b;
        int i39 = (i38 & 7) + (i38 | 7);
        f60921a = i39 % 128;
        int i40 = i39 % 2;
        return setpreferkeepclear3;
    }
}
