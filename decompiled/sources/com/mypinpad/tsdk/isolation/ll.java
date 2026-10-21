package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class ll extends ky {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f56962i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f56963j = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final getValue f56964f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final component10 f56965g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final setFontFeatureSettings f56966h;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cv;", "", "setY", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends Lambda implements Function1<cv, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f56967p0 = new a();

        static {
            int i10 = 1 & 89;
            int i11 = (1 ^ 89) | i10;
            int i12 = (i10 & i11) + (i10 | i11);
            int i13 = i12 % 128;
            int i14 = i12 % 2;
        }

        public a() {
            super(1);
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i12;
            int i14 = i13 | i10;
            int i15 = ((~(i14 | i11)) * 52) + (i11 * 53) + (i10 * (-51));
            int i16 = ~i11;
            int i17 = (((~i14) | (~(i16 | i10)) | (~(i16 | i13))) * (-52)) + i15;
            int i18 = ~i10;
            if ((((~(i18 | i11)) | (~(i13 | i18))) * 52) + i17 == 1) {
                a aVar = (a) objArr[0];
                a(new Object[]{aVar, (cv) objArr[1]}, 1697447491, -1697447491, System.identityHashCode(aVar));
                return Unit.INSTANCE;
            }
            cv cvVar = (cv) objArr[1];
            Intrinsics.checkNotNullParameter(cvVar, "");
            cv.setDividerPadding(new Object[]{cvVar, Boolean.TRUE}, -1881163515, 1881163517, System.identityHashCode(cvVar));
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(cv cvVar) {
            return a(new Object[]{this, cvVar}, 1556676771, -1556676770, System.identityHashCode(this));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ll(@NotNull kz kzVar, @NotNull setTextKeepState settextkeepstate, @NotNull lj ljVar, @NotNull getValue getvalue, @NotNull component10 component10Var, @NotNull setFontFeatureSettings setfontfeaturesettings) {
        super(kzVar, settextkeepstate, ljVar);
        Intrinsics.checkNotNullParameter(kzVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(ljVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        Intrinsics.checkNotNullParameter(component10Var, "");
        Intrinsics.checkNotNullParameter(setfontfeaturesettings, "");
        this.f56964f = getvalue;
        this.f56965g = component10Var;
        this.f56966h = setfontfeaturesettings;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0123  */
    /* JADX WARN: Code duplicated, block: B:22:0x017e  */
    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) throws Exception {
        boolean z10;
        setFitsSystemWindows setfitssystemwindows;
        int i13;
        boolean z11;
        ds dsVar;
        ll llVar = (ll) objArr[0];
        aq aqVar = new aq(llVar.setOnFocusChangeListener());
        am amVar = (am) ((setImageTintList) w.setX(new Object[]{aqVar}, 1693919772, -1693919769, System.identityHashCode(aqVar)));
        de deVar = new de(llVar.setOnFocusChangeListener());
        dd ddVar = (dd) ((setImageTintList) w.setX(new Object[]{deVar}, 1693919772, -1693919769, System.identityHashCode(deVar)));
        if (((md) dd.setDividerPadding(new Object[]{ddVar}, -2041109093, 2041109093, System.identityHashCode(ddVar))) == md.setNavigationOnClickListener) {
            int i14 = f56963j;
            int i15 = i14 & 43;
            int i16 = (i15 - (~((i14 ^ 43) | i15))) - 1;
            int i17 = i16 % 128;
            f56962i = i17;
            int i18 = i16 % 2;
            int i19 = (i17 & 77) + (i17 | 77);
            f56963j = i19 % 128;
            int i20 = i19 % 2;
            z10 = true;
        } else {
            int i21 = f56963j;
            int i22 = i21 ^ 9;
            int i23 = ((i21 & 9) | i22) << 1;
            int i24 = -i22;
            int i25 = (i23 ^ i24) + ((i23 & i24) << 1);
            f56962i = i25 % 128;
            int i26 = i25 % 2;
            z10 = false;
        }
        kz onFocusChangeListener = llVar.setOnFocusChangeListener();
        if (z10) {
            int i27 = f56963j;
            int i28 = i27 & 51;
            int i29 = (i27 | 51) & (~i28);
            int i30 = -(-(i28 << 1));
            int i31 = (i29 ^ i30) + ((i29 & i30) << 1);
            f56962i = i31 % 128;
            int i32 = i31 % 2;
            setfitssystemwindows = setFitsSystemWindows.setOnFocusChangeListener;
            int i33 = f56963j;
            int i34 = i33 & 59;
            int i35 = ((i33 ^ 59) | i34) << 1;
            int i36 = -((i33 | 59) & (~i34));
            int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
            f56962i = i37 % 128;
            int i38 = i37 % 2;
        } else {
            if (!(!((Boolean) am.setY(new Object[]{amVar}, -452511308, 452511311, System.identityHashCode(amVar))).booleanValue())) {
                System.identityHashCode(llVar);
                System.identityHashCode(llVar);
                setFontFeatureSettings setfontfeaturesettings = llVar.f56966h;
                if (((Boolean) setFontFeatureSettings.setCompoundDrawableTintBlendMode(new Object[]{setfontfeaturesettings}, 1612421959, -1612421951, System.identityHashCode(setfontfeaturesettings))).booleanValue()) {
                    setfitssystemwindows = setFitsSystemWindows.setX;
                    int i39 = f56963j;
                    i13 = ((i39 & 20) + (i39 | 20)) - 1;
                } else {
                    int i40 = f56962i;
                    int i41 = (i40 & (-80)) | ((~i40) & 79);
                    int i42 = (i40 & 79) << 1;
                    int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
                    f56963j = i43 % 128;
                    int i44 = i43 % 2;
                    setfitssystemwindows = setFitsSystemWindows.setDividerPadding;
                    int i45 = f56963j;
                    i13 = ((i45 | 119) << 1) - (i45 ^ 119);
                }
            } else {
                setfitssystemwindows = setFitsSystemWindows.setX;
                int i310 = f56963j;
                i13 = ((i310 & 20) + (i310 | 20)) - 1;
            }
            f56962i = i13 % 128;
            int i46 = i13 % 2;
        }
        kz.setOnFocusChangeListener(new Object[]{onFocusChangeListener, setfitssystemwindows}, 738496851, -738496847, System.identityHashCode(onFocusChangeListener));
        if (((Boolean) am.setY(new Object[]{amVar}, -452511308, 452511311, System.identityHashCode(amVar))).booleanValue()) {
            int i47 = f56962i;
            int i48 = (((i47 | 47) << 1) - (~(-(i47 ^ 47)))) - 1;
            int i49 = i48 % 128;
            f56963j = i49;
            int i50 = i48 % 2;
            if (!(!z10)) {
                int i51 = f56963j + 71;
                f56962i = i51 % 128;
                int i52 = i51 % 2;
                z11 = false;
            } else {
                int i53 = i49 + 67;
                int i54 = i53 % 128;
                f56962i = i54;
                int i55 = i53 % 2;
                int i56 = (((i54 | 126) << 1) - (i54 ^ 126)) - 1;
                f56963j = i56 % 128;
                int i57 = i56 % 2;
                z11 = true;
            }
        } else {
            int i58 = f56963j + 71;
            f56962i = i58 % 128;
            int i59 = i58 % 2;
            z11 = false;
        }
        kz onFocusChangeListener2 = llVar.setOnFocusChangeListener();
        if (!(!z11)) {
            int i60 = f56963j;
            int i61 = i60 ^ 109;
            int i62 = ((i60 & 109) | i61) << 1;
            int i63 = -i61;
            int i64 = (i62 & i63) + (i62 | i63);
            f56962i = i64 % 128;
            if (i64 % 2 != 0) {
                ds dsVar2 = ds.setCompoundDrawableTintBlendMode;
                throw null;
            }
            dsVar = ds.setY;
        } else {
            dsVar = ds.setCompoundDrawableTintBlendMode;
            int i65 = f56963j;
            int i66 = i65 & 33;
            int i67 = (i65 | 33) & (~i66);
            int i68 = i66 << 1;
            int i69 = (i67 & i68) + (i67 | i68);
            f56962i = i69 % 128;
            int i70 = i69 % 2;
        }
        kz.setOnFocusChangeListener(new Object[]{onFocusChangeListener2, dsVar}, -1851091220, 1851091220, System.identityHashCode(onFocusChangeListener2));
        setEms setems = new setEms(llVar.setOnFocusChangeListener().setViewTranslationCallback(), z11);
        kz onFocusChangeListener3 = llVar.setOnFocusChangeListener();
        if (((ds) kz.setOnFocusChangeListener(new Object[]{onFocusChangeListener3}, -1080464866, 1080464872, System.identityHashCode(onFocusChangeListener3))) == ds.setCompoundDrawableTintBlendMode) {
            cz czVar = new cz(llVar.setOnFocusChangeListener());
            int i71 = f56962i;
            int i72 = i71 & 83;
            int i73 = i72 + ((i71 ^ 83) | i72);
            f56963j = i73 % 128;
            int i74 = i73 % 2;
        }
        kz onFocusChangeListener4 = llVar.setOnFocusChangeListener();
        kz.setOnFocusChangeListener(new Object[]{onFocusChangeListener4}, 1068055759, -1068055756, System.identityHashCode(onFocusChangeListener4));
        ee eeVar = ee.setDividerPadding;
        fk fkVar = (fk) ee.setOnFocusChangeListener(new Object[]{llVar.setOnFocusChangeListener(), llVar.f56964f, setems}, 1044341421, -1044341412, (int) System.currentTimeMillis());
        int i75 = f56962i;
        int i76 = ((i75 | 97) << 1) - (i75 ^ 97);
        f56963j = i76 % 128;
        int i77 = i76 % 2;
        return fkVar;
    }

    @Override // com.mypinpad.tsdk.isolation.ec
    @Nullable
    public final Object setDividerPadding(@NotNull Continuation<? super fk> continuation) {
        return setY(new Object[]{this, continuation}, 921998578, -921998578, System.identityHashCode(this));
    }
}
