package com.mypinpad.tsdk.isolation;

import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.UStringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/component1;", "", "Lcom/mypinpad/tsdk/i/setGroupIndicator;", "p0", "Lcom/mypinpad/tsdk/i/setId;", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/setGroupIndicator;)Lcom/mypinpad/tsdk/i/setId;", "<init>", "()V"}, k = 1, mv = {1, 5, 1})
public final class component1 {

    @NotNull
    public static final component1 INSTANCE = new component1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f54838a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f54839b = 1;

    public /* synthetic */ class setDividerPadding {
        public static final /* synthetic */ int[] setY;

        static {
            int[] iArr = new int[Terminal.valuesCustom().length];
            iArr[Terminal.KERNEL_2.ordinal()] = 1;
            iArr[Terminal.KERNEL_3.ordinal()] = 2;
            iArr[Terminal.KERNEL_4.ordinal()] = 3;
            iArr[Terminal.KERNEL_6.ordinal()] = 4;
            iArr[Terminal.KERNEL_13.ordinal()] = 5;
            iArr[Terminal.KERNEL_INTERAC.ordinal()] = 6;
            iArr[Terminal.KERNEL_EFTPOS.ordinal()] = 7;
            setY = iArr;
            int i10 = (1 & 15) + (1 | 15);
            int i11 = i10 % 128;
            int i12 = i10 % 2;
        }
    }

    static {
        int i10 = f54838a;
        int i11 = ((i10 ^ 8) + ((i10 & 8) << 1)) - 1;
        f54839b = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ HashMap a(Object[] objArr) {
        List list = (List) objArr[0];
        Terminal terminal = (Terminal) objArr[1];
        setBackgroundTintList setbackgroundtintlist = (setBackgroundTintList) objArr[2];
        String str = (String) objArr[3];
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        int i10 = f54839b;
        int i11 = ((i10 ^ 15) | (i10 & 15)) << 1;
        int i12 = -(((~i10) & 15) | (i10 & (-16)));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f54838a = i13 % 128;
        int i14 = i13 % 2;
        while (!(!it.hasNext())) {
            int i15 = f54839b;
            int i16 = i15 & 61;
            int i17 = (i15 ^ 61) | i16;
            int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
            f54838a = i18 % 128;
            int i19 = i18 % 2;
            getDynamicButtonTextSizeSp getdynamicbuttontextsizesp = (getDynamicButtonTextSizeSp) it.next();
            md.Companion companion = md.INSTANCE;
            map.put((md) md.Companion.setCompoundDrawableTintBlendMode(new Object[]{Byte.valueOf(((Byte) getDynamicButtonTextSizeSp.setOnFocusChangeListener(new Object[]{getdynamicbuttontextsizesp}, -1033718513, 1033718523, System.identityHashCode(getdynamicbuttontextsizesp))).byteValue())}, -998269109, 998269109, (int) System.currentTimeMillis()), (setMax) setOnFocusChangeListener(new Object[]{getdynamicbuttontextsizesp, terminal, setbackgroundtintlist, str}, -2111904579, 2111904590, (int) System.currentTimeMillis()));
            int i20 = f54838a;
            int i21 = (((i20 | 94) << 1) - (i20 ^ 94)) - 1;
            f54839b = i21 % 128;
            int i22 = i21 % 2;
        }
        int i23 = f54838a;
        int i24 = (i23 & 35) + (i23 | 35);
        f54839b = i24 % 128;
        if (i24 % 2 == 0) {
            int i25 = 21 / 0;
        }
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00c7 A[PHI: r6
      0x00c7: PHI (r6v13 com.mypinpad.tsdk.i.getBeepOnFailure) = (r6v9 com.mypinpad.tsdk.i.getBeepOnFailure), (r6v20 com.mypinpad.tsdk.i.getBeepOnFailure) binds: [B:18:0x00c5, B:15:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0117  */
    /* JADX WARN: Code duplicated, block: B:31:0x0158 A[SYNTHETIC] */
    public static /* synthetic */ setMaxWidth b(Object[] objArr) throws Exception {
        getBeepOnFailure next;
        setScrollContainer setscrollcontainer;
        setMaxWidth setmaxwidth = (setMaxWidth) objArr[0];
        Terminal terminal = (Terminal) objArr[1];
        int i10 = f54838a;
        int i11 = ((i10 | 111) << 1) - (i10 ^ 111);
        f54839b = i11 % 128;
        if (i11 % 2 != 0 ? setDividerPadding.setY[terminal.ordinal()] == 1 : setDividerPadding.setY[terminal.ordinal()] == 0) {
            Iterator<getBeepOnFailure> it = setmaxwidth.iterator();
            int i12 = f54839b;
            int i13 = ((i12 ^ 53) | (i12 & 53)) << 1;
            int i14 = -(((~i12) & 53) | (i12 & (-54)));
            int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
            while (true) {
                f54838a = i15 % 128;
                int i16 = i15 % 2;
                if (!it.hasNext()) {
                    break;
                }
                int i17 = f54839b;
                int i18 = (((i17 & (-104)) | ((~i17) & 103)) - (~((i17 & 103) << 1))) - 1;
                f54838a = i18 % 128;
                if (i18 % 2 != 0) {
                    next = it.next();
                    setImageTintList setimagetintlist = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next}, 1115257939, -1115257923, System.identityHashCode(next));
                    int i19 = 82 / 0;
                    if (((Integer) setImageTintList.setX(new Object[]{setimagetintlist}, 1174276769, -1174276767, System.identityHashCode(setimagetintlist))).intValue() != 0) {
                        int i20 = f54839b + 85;
                        f54838a = i20 % 128;
                        int i21 = i20 % 2;
                        setOnGenericMotionListener setongenericmotionlistener = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
                        setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next}, 865402441, -865402437, System.identityHashCode(next));
                        if (!((Boolean) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer)), terminal}, 1118214839, -1118214838, (int) System.currentTimeMillis())).booleanValue()) {
                            int i22 = f54838a;
                            int i23 = i22 ^ 17;
                            int i24 = ((i22 & 17) | i23) << 1;
                            int i25 = -i23;
                            int i26 = (i24 ^ i25) + ((i24 & i25) << 1);
                            f54839b = i26 % 128;
                            int i27 = i26 % 2;
                            getBeepOnFailure.setOnFocusChangeListener(new Object[]{next, CollectionsKt__CollectionsKt.listOf((Object[]) new setTextSize[]{setTextSize.setY, setTextSize.setX})}, 897972546, -897972531, System.identityHashCode(next));
                            int i28 = f54839b;
                            int i29 = ((i28 | 25) << 1) - (i28 ^ 25);
                            f54838a = i29 % 128;
                            int i30 = i29 % 2;
                        }
                    }
                } else {
                    next = it.next();
                    setImageTintList setimagetintlist2 = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next}, 1115257939, -1115257923, System.identityHashCode(next));
                    if (((Integer) setImageTintList.setX(new Object[]{setimagetintlist2}, 1174276769, -1174276767, System.identityHashCode(setimagetintlist2))).intValue() != 0) {
                        int i210 = f54839b + 85;
                        f54838a = i210 % 128;
                        int i211 = i210 % 2;
                        setOnGenericMotionListener setongenericmotionlistener2 = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
                        setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next}, 865402441, -865402437, System.identityHashCode(next));
                        if (!((Boolean) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer)), terminal}, 1118214839, -1118214838, (int) System.currentTimeMillis())).booleanValue()) {
                            int i212 = f54838a;
                            int i213 = i212 ^ 17;
                            int i214 = ((i212 & 17) | i213) << 1;
                            int i215 = -i213;
                            int i216 = (i214 ^ i215) + ((i214 & i215) << 1);
                            f54839b = i216 % 128;
                            int i217 = i216 % 2;
                            getBeepOnFailure.setOnFocusChangeListener(new Object[]{next, CollectionsKt__CollectionsKt.listOf((Object[]) new setTextSize[]{setTextSize.setY, setTextSize.setX})}, 897972546, -897972531, System.identityHashCode(next));
                            int i218 = f54839b;
                            int i219 = ((i218 | 25) << 1) - (i218 ^ 25);
                            f54838a = i219 % 128;
                            int i31 = i219 % 2;
                        }
                    }
                }
                int i32 = f54839b;
                int i33 = i32 & 123;
                int i34 = ((i32 ^ 123) | i33) << 1;
                int i35 = -((i32 | 123) & (~i33));
                i15 = (i34 ^ i35) + ((i35 & i34) << 1);
            }
        }
        int i36 = f54839b;
        int i37 = i36 & 61;
        int i38 = i36 | 61;
        int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
        f54838a = i39 % 128;
        if (i39 % 2 != 0) {
            int i40 = 6 / 0;
        }
        return setmaxwidth;
    }

    public static /* synthetic */ setMaxWidth c(Object[] objArr) {
        List list = (List) objArr[0];
        Terminal terminal = (Terminal) objArr[1];
        setMaxWidth setmaxwidth = new setMaxWidth();
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        int i10 = f54839b;
        int i11 = ((i10 ^ 88) + ((i10 & 88) << 1)) - 1;
        f54838a = i11 % 128;
        int i12 = i11 % 2;
        while (it.hasNext()) {
            int i13 = f54838a;
            int i14 = (((i13 ^ 49) | (i13 & 49)) << 1) - (((~i13) & 49) | (i13 & (-50)));
            f54839b = i14 % 128;
            if (i14 % 2 == 0) {
                getAmount getamount = (getAmount) it.next();
                getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = getBeepOnFailure.setOnFocusChangeListener;
                arrayList.add((getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{setcompounddrawabletintblendmode, (String) getAmount.setDividerPadding(new Object[]{getamount}, -974939786, 974939787, System.identityHashCode(getamount)), (String) getAmount.setDividerPadding(new Object[]{getamount}, 335580367, -335580365, System.identityHashCode(getamount)), terminal}, -1778552586, 1778552596, System.identityHashCode(setcompounddrawabletintblendmode)));
                throw null;
            }
            getAmount getamount2 = (getAmount) it.next();
            getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode2 = getBeepOnFailure.setOnFocusChangeListener;
            arrayList.add((getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{setcompounddrawabletintblendmode2, (String) getAmount.setDividerPadding(new Object[]{getamount2}, -974939786, 974939787, System.identityHashCode(getamount2)), (String) getAmount.setDividerPadding(new Object[]{getamount2}, 335580367, -335580365, System.identityHashCode(getamount2)), terminal}, -1778552586, 1778552596, System.identityHashCode(setcompounddrawabletintblendmode2)));
        }
        setmaxwidth.addAll(arrayList);
        int i15 = f54839b + 93;
        f54838a = i15 % 128;
        int i16 = i15 % 2;
        return setmaxwidth;
    }

    public static setId d(Object[] objArr) {
        setGroupIndicator setgroupindicator = (setGroupIndicator) objArr[0];
        Intrinsics.checkNotNullParameter(setgroupindicator, "");
        setId setid = new setId(g(Terminal.OTHER, (List) setGroupIndicator.setDividerPadding(new Object[]{setgroupindicator}, -993618938, 993618939, System.identityHashCode(setgroupindicator))), (Map) setOnFocusChangeListener(new Object[]{(List) setGroupIndicator.setDividerPadding(new Object[]{setgroupindicator}, 62049690, -62049685, System.identityHashCode(setgroupindicator))}, -2050568038, 2050568040, (int) System.currentTimeMillis()), (List) setOnFocusChangeListener(new Object[]{(List) setGroupIndicator.setDividerPadding(new Object[]{setgroupindicator}, 28329434, -28329426, System.identityHashCode(setgroupindicator))}, 531812745, -531812736, (int) System.currentTimeMillis()), (List) setOnFocusChangeListener(new Object[]{(List) setGroupIndicator.setDividerPadding(new Object[]{setgroupindicator}, 359911588, -359911586, System.identityHashCode(setgroupindicator))}, 1509653892, -1509653889, (int) System.currentTimeMillis()), (List) setOnFocusChangeListener(new Object[]{(List) setGroupIndicator.setDividerPadding(new Object[]{setgroupindicator}, -1229679799, 1229679806, System.identityHashCode(setgroupindicator))}, 1379599799, -1379599787, (int) System.currentTimeMillis()), (setPopupTheme) setOnFocusChangeListener(new Object[]{(component7) setGroupIndicator.setDividerPadding(new Object[]{setgroupindicator}, 2001311321, -2001311318, System.identityHashCode(setgroupindicator))}, 1058883278, -1058883272, (int) System.currentTimeMillis()));
        int i10 = f54838a;
        int i11 = (i10 & (-70)) | ((~i10) & 69);
        int i12 = (i10 & 69) << 1;
        int i13 = (i11 & i12) + (i12 | i11);
        f54839b = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 49 / 0;
        }
        return setid;
    }

    public static setMaxWidth e(Terminal terminal, setMaxWidth setmaxwidth) {
        return (setMaxWidth) setOnFocusChangeListener(new Object[]{setmaxwidth, terminal}, 1012576596, -1012576589, (int) System.currentTimeMillis());
    }

    public static Map f(Terminal terminal, List list) {
        return (Map) setOnFocusChangeListener(new Object[]{list, terminal}, 801705905, -801705901, (int) System.currentTimeMillis());
    }

    public static setMaxWidth g(Terminal terminal, List list) {
        return (setMaxWidth) setOnFocusChangeListener(new Object[]{list, terminal}, -1691881024, 1691881032, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ setNextFocusRightId h(Object[] objArr) {
        setFilters setfilters = (setFilters) objArr[0];
        setNextFocusRightId setnextfocusrightid = new setNextFocusRightId(setfilters.setCompoundDrawableTintBlendMode(), setfilters.setDividerPadding(), setfilters.setOnFocusChangeListener(), setfilters.setX(), g((Terminal) objArr[1], setfilters.setY()));
        int i10 = f54839b;
        int i11 = i10 ^ 55;
        int i12 = ((i10 & 55) | i11) << 1;
        int i13 = -i11;
        int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
        f54838a = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 70 / 0;
        }
        return setnextfocusrightid;
    }

    public static Map<md, setMax> i(List<getDynamicButtonTextSizeSp> list, Terminal terminal, setBackgroundTintList setbackgroundtintlist, String str) {
        return (Map) setOnFocusChangeListener(new Object[]{list, terminal, setbackgroundtintlist, str}, 547680618, -547680618, (int) System.currentTimeMillis());
    }

    public static getInstallationId j(Terminal terminal, component9 component9Var) {
        return (getInstallationId) setOnFocusChangeListener(new Object[]{terminal, component9Var}, 2003153964, -2003153954, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ setPopupTheme k(Object[] objArr) {
        component7 component7Var = (component7) objArr[0];
        List list = (List) component7.setCompoundDrawableTintBlendMode(new Object[]{component7Var}, -29687274, 29687278, System.identityHashCode(component7Var));
        List list2 = (List) component7.setCompoundDrawableTintBlendMode(new Object[]{component7Var}, 683859146, -683859143, System.identityHashCode(component7Var));
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        int i10 = f54839b;
        int i11 = i10 & 89;
        int i12 = -(-((i10 ^ 89) | i11));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f54838a = i13 % 128;
        while (true) {
            int i14 = i13 % 2;
            if (!it.hasNext()) {
                setPopupTheme setpopuptheme = new setPopupTheme(list, arrayList);
                int i15 = f54839b;
                int i16 = i15 & 43;
                int i17 = ((i15 | 43) & (~i16)) + (i16 << 1);
                f54838a = i17 % 128;
                if (i17 % 2 == 0) {
                    return setpopuptheme;
                }
                throw null;
            }
            int i18 = f54839b + 109;
            f54838a = i18 % 128;
            int i19 = i18 % 2;
            component8 component8Var = (component8) it.next();
            Terminal.Companion companion = Terminal.INSTANCE;
            Terminal terminal = (Terminal) Terminal.Companion.setDividerPadding(new Object[]{Byte.valueOf(((Byte) component8.setX(new Object[]{component8Var}, 1646691248, -1646691244, System.identityHashCode(component8Var))).byteValue())}, -670685073, 670685073, (int) System.currentTimeMillis());
            if (terminal != null) {
                int i20 = (-2) - ((f54839b + 16) ^ (-1));
                f54838a = i20 % 128;
                int i21 = i20 % 2;
                if (terminal.setCompoundDrawableTintBlendMode()) {
                    arrayList.add(new SouthAmericaEndpoint(terminal, (List) component8.setX(new Object[]{component8Var}, -309760526, 309760527, System.identityHashCode(component8Var))));
                    int i22 = f54838a;
                    int i23 = (i22 | 123) << 1;
                    int i24 = -(((~i22) & 123) | (i22 & (-124)));
                    i13 = (i23 ^ i24) + ((i24 & i23) << 1);
                    f54839b = i13 % 128;
                }
            }
            throw new setIndeterminateDrawable(AuthApiStatusCodes.AUTH_API_ACCESS_FORBIDDEN, String.valueOf((int) ((Byte) component8.setX(new Object[]{component8Var}, 1646691248, -1646691244, System.identityHashCode(component8Var))).byteValue()), null, 4, null);
        }
    }

    @NotNull
    public static setId setDividerPadding(@NotNull setGroupIndicator p4) {
        return (setId) setOnFocusChangeListener(new Object[]{p4}, -1978374289, 1978374290, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        Object setdownloadlistener;
        int i13 = ~((~i10) | (~i11));
        int i14 = ~i12;
        int i15 = ((i10 | i11 | i12) * 220) + (((~(i14 | i11)) | i10) * (-440)) + ((i13 | (~(i14 | i10 | i11))) * 220) + (i11 * (-219)) + (i10 * 221);
        int i16 = 1;
        switch (i15) {
            case 1:
                return d(objArr);
            case 2:
                List<PinPadConfiguration> list = (List) objArr[0];
                HashMap map = new HashMap();
                int i17 = f54838a;
                int i18 = ((i17 & (-66)) | ((~i17) & 65)) + ((i17 & 65) << 1);
                f54839b = i18 % 128;
                int i19 = i18 % 2;
                for (PinPadConfiguration pinPadConfiguration : list) {
                    int i20 = f54838a;
                    int i21 = ((i20 ^ 125) - (~((i20 & 125) << 1))) - 1;
                    f54839b = i21 % 128;
                    int i22 = i21 % 2;
                    Terminal.Companion companion = Terminal.INSTANCE;
                    Terminal terminal = (Terminal) Terminal.Companion.setDividerPadding(new Object[]{Byte.valueOf(((Byte) PinPadConfiguration.setX(new Object[]{pinPadConfiguration}, -2026598109, 2026598112, System.identityHashCode(pinPadConfiguration))).byteValue())}, -670685073, 670685073, (int) System.currentTimeMillis());
                    if (terminal != null) {
                        int i23 = f54839b;
                        int i24 = ((i23 ^ 87) | (i23 & 87)) << 1;
                        int i25 = -(((~i23) & 87) | (i23 & (-88)));
                        int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
                        f54838a = i26 % 128;
                        int i27 = i26 % 2;
                        if (terminal.setCompoundDrawableTintBlendMode()) {
                            map.put(terminal, new getCurrency(terminal, e(terminal, g(terminal, (List) PinPadConfiguration.setX(new Object[]{pinPadConfiguration}, 1798210358, -1798210353, System.identityHashCode(pinPadConfiguration)))), f(terminal, (List) PinPadConfiguration.setX(new Object[]{pinPadConfiguration}, 999272966, -999272966, System.identityHashCode(pinPadConfiguration))), j(terminal, (component9) PinPadConfiguration.setX(new Object[]{pinPadConfiguration}, 1329146222, -1329146220, System.identityHashCode(pinPadConfiguration)))));
                            int i28 = f54838a + 79;
                            f54839b = i28 % 128;
                            int i29 = i28 % 2;
                        }
                    }
                    throw new setIndeterminateDrawable(AuthApiStatusCodes.AUTH_API_ACCESS_FORBIDDEN, String.valueOf((int) ((Byte) PinPadConfiguration.setX(new Object[]{pinPadConfiguration}, -2026598109, 2026598112, System.identityHashCode(pinPadConfiguration))).byteValue()), null, 4, null);
                }
                int i30 = f54839b;
                int i31 = (-2) - (((i30 & 70) + (i30 | 70)) ^ (-1));
                f54838a = i31 % 128;
                int i32 = i31 % 2;
                return map;
            case 3:
                List<setOutlineSpotShadowColor> list2 = (List) objArr[0];
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                for (setOutlineSpotShadowColor setoutlinespotshadowcolor : list2) {
                    byte[] x4 = setInputExtras.setX((String) setOutlineSpotShadowColor.setOnFocusChangeListener(new Object[]{setoutlinespotshadowcolor}, 2047494275, -2047494267, System.identityHashCode(setoutlinespotshadowcolor)));
                    byte b10 = setInputExtras.setX((String) setOutlineSpotShadowColor.setOnFocusChangeListener(new Object[]{setoutlinespotshadowcolor}, 171651992, -171651987, System.identityHashCode(setoutlinespotshadowcolor)))[0];
                    byte[] x6 = setInputExtras.setX((String) setOutlineSpotShadowColor.setOnFocusChangeListener(new Object[]{setoutlinespotshadowcolor}, 854637327, -854637320, System.identityHashCode(setoutlinespotshadowcolor)));
                    byte[] x7 = setInputExtras.setX((String) setOutlineSpotShadowColor.setOnFocusChangeListener(new Object[]{setoutlinespotshadowcolor}, 935940647, -935940647, System.identityHashCode(setoutlinespotshadowcolor)));
                    byte bByteValue = ((Byte) setOutlineSpotShadowColor.setOnFocusChangeListener(new Object[]{setoutlinespotshadowcolor}, -550403319, 550403321, System.identityHashCode(setoutlinespotshadowcolor))).byteValue();
                    byte bByteValue2 = ((Byte) setOutlineSpotShadowColor.setOnFocusChangeListener(new Object[]{setoutlinespotshadowcolor}, 1232564774, -1232564764, System.identityHashCode(setoutlinespotshadowcolor))).byteValue();
                    byte[] x10 = setInputExtras.setX((String) setOutlineSpotShadowColor.setOnFocusChangeListener(new Object[]{setoutlinespotshadowcolor}, 1546806463, -1546806459, System.identityHashCode(setoutlinespotshadowcolor)));
                    String str = (String) setOutlineSpotShadowColor.setOnFocusChangeListener(new Object[]{setoutlinespotshadowcolor}, 1177526978, -1177526972, System.identityHashCode(setoutlinespotshadowcolor));
                    arrayList.add(new dg(x4, b10, x6, x7, bByteValue, bByteValue2, null, x10, str == null ? null : setInputExtras.setX(str), 64, null));
                }
                return arrayList;
            case 4:
                List list3 = (List) objArr[0];
                Terminal terminal2 = (Terminal) objArr[1];
                HashMap map2 = new HashMap();
                Iterator it = list3.iterator();
                int i33 = f54838a;
                int i34 = (i33 ^ 81) + ((i33 & 81) << 1);
                f54839b = i34 % 128;
                while (true) {
                    int i35 = i34 % 2;
                    if (!it.hasNext()) {
                        int i36 = (-2) - ((f54838a + 38) ^ (-1));
                        f54839b = i36 % 128;
                        int i37 = i36 % 2;
                        setdownloadlistener = map2;
                    } else {
                        setFirstBaselineToTopHeight setfirstbaselinetotopheight = (setFirstBaselineToTopHeight) it.next();
                        setBackgroundTintList setbackgroundtintlist = new setBackgroundTintList(setInputExtras.setX(setfirstbaselinetotopheight.setCompoundDrawableTintBlendMode()));
                        map2.put(setbackgroundtintlist, new create(setbackgroundtintlist, g(terminal2, setfirstbaselinetotopheight.setOnFocusChangeListener()), i(setfirstbaselinetotopheight.setX(), terminal2, setbackgroundtintlist, setfirstbaselinetotopheight.setY()), setfirstbaselinetotopheight.setY()));
                        int i38 = f54839b + 72;
                        i34 = (i38 ^ (-1)) + (i38 << 1);
                        f54838a = i34 % 128;
                    }
                    break;
                }
                break;
            case 5:
                return h(objArr);
            case 6:
                return k(objArr);
            case 7:
                return b(objArr);
            case 8:
                return c(objArr);
            case 9:
                List<component4> list4 = (List) objArr[0];
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                System.currentTimeMillis();
                System.currentTimeMillis();
                for (component4 component4Var : list4) {
                    arrayList2.add(new setDefaultFocusHighlightEnabled((String) component4.setX(new Object[]{component4Var}, 2053087812, -2053087812, System.identityHashCode(component4Var)), (String) component4.setX(new Object[]{component4Var}, 2069738297, -2069738296, System.identityHashCode(component4Var))));
                    int i39 = f54838a + 25;
                    f54839b = i39 % 128;
                    int i40 = i39 % 2;
                }
                List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2);
                int i41 = f54839b + 101;
                f54838a = i41 % 128;
                int i42 = i41 % 2;
                return mutableList;
            case 10:
                Terminal terminal3 = (Terminal) objArr[0];
                component9 component9Var = (component9) objArr[1];
                switch (setDividerPadding.setY[terminal3.ordinal()]) {
                    case 1:
                        component3 component3Var = (component3) component9Var;
                        setdownloadlistener = new setDownloadListener(component3Var == null ? false : ((Boolean) component3.setCompoundDrawableTintBlendMode(new Object[]{component3Var}, -1640427560, 1640427560, System.identityHashCode(component3Var))).booleanValue());
                        break;
                    case 2:
                        if (component9Var == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.mypinpad.softpos.emv.terminal.config.Kernel3ConfigDto");
                        }
                        getClass getclass = (getClass) component9Var;
                        getX.Companion companion2 = getX.INSTANCE;
                        int iIntValue = ((Integer) getClass.setCompoundDrawableTintBlendMode(new Object[]{getclass}, 151746280, -151746278, System.identityHashCode(getclass))).intValue();
                        setdownloadlistener = new setRevealOnFocusHint((getX) getX.Companion.setX(new Object[]{Integer.valueOf(iIntValue)}, -1040261987, 1040261987, iIntValue), ((Boolean) getClass.setCompoundDrawableTintBlendMode(new Object[]{getclass}, 1048143719, -1048143715, System.identityHashCode(getclass))).booleanValue(), ((Boolean) getClass.setCompoundDrawableTintBlendMode(new Object[]{getclass}, 508147586, -508147586, System.identityHashCode(getclass))).booleanValue(), ((Boolean) getClass.setCompoundDrawableTintBlendMode(new Object[]{getclass}, -432862421, 432862422, System.identityHashCode(getclass))).booleanValue(), ((Boolean) getClass.setCompoundDrawableTintBlendMode(new Object[]{getclass}, 678208067, -678208062, System.identityHashCode(getclass))).booleanValue(), ((Boolean) getClass.setCompoundDrawableTintBlendMode(new Object[]{getclass}, 1858361531, -1858361528, System.identityHashCode(getclass))).booleanValue());
                        break;
                        break;
                    case 3:
                        if (component9Var == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.mypinpad.softpos.emv.terminal.config.Kernel4ConfigDto");
                        }
                        setTextCursorDrawable settextcursordrawable = (setTextCursorDrawable) component9Var;
                        setdownloadlistener = new setWebViewClient(((Boolean) setTextCursorDrawable.setCompoundDrawableTintBlendMode(new Object[]{settextcursordrawable}, 1016853657, -1016853656, System.identityHashCode(settextcursordrawable))).booleanValue(), (String) setTextCursorDrawable.setCompoundDrawableTintBlendMode(new Object[]{settextcursordrawable}, -69742332, 69742335, System.identityHashCode(settextcursordrawable)), (Long) setTextCursorDrawable.setCompoundDrawableTintBlendMode(new Object[]{settextcursordrawable}, 1127438340, -1127438340, System.identityHashCode(settextcursordrawable)));
                        break;
                        break;
                    case 4:
                        if (component9Var == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.mypinpad.softpos.emv.terminal.config.Kernel6ConfigDto");
                        }
                        component6 component6Var = (component6) component9Var;
                        setdownloadlistener = new setProgressTintMode(((Boolean) component6.setDividerPadding(new Object[]{component6Var}, 323682778, -323682778, System.identityHashCode(component6Var))).booleanValue());
                        break;
                        break;
                    case 5:
                        if (component9Var == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.mypinpad.softpos.emv.terminal.config.Kernel13ConfigDto");
                        }
                        setOnItemClickListener setonitemclicklistener = (setOnItemClickListener) component9Var;
                        setdownloadlistener = new setInitialScale((String) setOnItemClickListener.setDividerPadding(new Object[]{setonitemclicklistener}, 1567811735, -1567811733, System.identityHashCode(setonitemclicklistener)), (String) setOnItemClickListener.setDividerPadding(new Object[]{setonitemclicklistener}, -1512127988, 1512127989, System.identityHashCode(setonitemclicklistener)));
                        break;
                        break;
                    case 6:
                        if (component9Var == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.mypinpad.softpos.emv.terminal.config.KernelInteracConfigDto");
                        }
                        setEdgeEffectColor setedgeeffectcolor = (setEdgeEffectColor) component9Var;
                        setdownloadlistener = new getDetailsFieldBgColor((String) setEdgeEffectColor.setCompoundDrawableTintBlendMode(new Object[]{setedgeeffectcolor}, -304488956, 304488956, System.identityHashCode(setedgeeffectcolor)));
                        break;
                        break;
                    case 7:
                        if (component9Var == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.mypinpad.softpos.emv.terminal.config.KernelEftposConfigDto");
                        }
                        component5 component5Var = (component5) component9Var;
                        setdownloadlistener = new getNavBarBgColor((String) component5.setOnFocusChangeListener(new Object[]{component5Var}, 2005816493, -2005816493, System.identityHashCode(component5Var)));
                        break;
                        break;
                    default:
                        setdownloadlistener = null;
                        break;
                }
                break;
            case 11:
                getDynamicButtonTextSizeSp getdynamicbuttontextsizesp = (getDynamicButtonTextSizeSp) objArr[0];
                Terminal terminal4 = (Terminal) objArr[1];
                setBackgroundTintList setbackgroundtintlist2 = (setBackgroundTintList) objArr[2];
                String str2 = (String) objArr[3];
                md.Companion companion3 = md.INSTANCE;
                md mdVar = (md) md.Companion.setCompoundDrawableTintBlendMode(new Object[]{Byte.valueOf(((Byte) getDynamicButtonTextSizeSp.setOnFocusChangeListener(new Object[]{getdynamicbuttontextsizesp}, -1033718513, 1033718523, System.identityHashCode(getdynamicbuttontextsizesp))).byteValue())}, -998269109, 998269109, (int) System.currentTimeMillis());
                boolean zBooleanValue = ((Boolean) getDynamicButtonTextSizeSp.setOnFocusChangeListener(new Object[]{getdynamicbuttontextsizesp}, 453271493, -453271488, System.identityHashCode(getdynamicbuttontextsizesp))).booleanValue();
                Boolean bool = (Boolean) getDynamicButtonTextSizeSp.setOnFocusChangeListener(new Object[]{getdynamicbuttontextsizesp}, 1208707323, -1208707320, System.identityHashCode(getdynamicbuttontextsizesp));
                boolean zBooleanValue2 = ((Boolean) getDynamicButtonTextSizeSp.setOnFocusChangeListener(new Object[]{getdynamicbuttontextsizesp}, -225684549, 225684549, System.identityHashCode(getdynamicbuttontextsizesp))).booleanValue();
                boolean zBooleanValue3 = ((Boolean) getDynamicButtonTextSizeSp.setOnFocusChangeListener(new Object[]{getdynamicbuttontextsizesp}, 49057765, -49057757, System.identityHashCode(getdynamicbuttontextsizesp))).booleanValue();
                boolean zBooleanValue4 = ((Boolean) getDynamicButtonTextSizeSp.setOnFocusChangeListener(new Object[]{getdynamicbuttontextsizesp}, 471676015, -471676004, System.identityHashCode(getdynamicbuttontextsizesp))).booleanValue();
                Long l6 = (Long) getDynamicButtonTextSizeSp.setOnFocusChangeListener(new Object[]{getdynamicbuttontextsizesp}, 427014427, -427014421, System.identityHashCode(getdynamicbuttontextsizesp));
                Long l7 = (Long) getDynamicButtonTextSizeSp.setOnFocusChangeListener(new Object[]{getdynamicbuttontextsizesp}, 1682879148, -1682879141, System.identityHashCode(getdynamicbuttontextsizesp));
                Long l10 = (Long) getDynamicButtonTextSizeSp.setOnFocusChangeListener(new Object[]{getdynamicbuttontextsizesp}, 6084722, -6084713, System.identityHashCode(getdynamicbuttontextsizesp));
                List list5 = (List) getDynamicButtonTextSizeSp.setOnFocusChangeListener(new Object[]{getdynamicbuttontextsizesp}, -1313532706, 1313532710, System.identityHashCode(getdynamicbuttontextsizesp));
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
                Iterator it2 = list5.iterator();
                int i43 = f54839b;
                int i44 = i43 & 33;
                int i45 = -(-((i43 ^ 33) | i44));
                int i46 = (i44 & i45) + (i45 | i44);
                f54838a = i46 % 128;
                int i47 = i46 % 2;
                while (it2.hasNext()) {
                    int i48 = f54839b;
                    int i49 = i48 & 121;
                    int i50 = (i48 | 121) & (~i49);
                    int i51 = i49 << 1;
                    int i52 = (i50 & i51) + (i50 | i51);
                    f54838a = i52 % 128;
                    int i53 = i52 % 2;
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = (setFilters) it2.next();
                    objArr2[i16] = terminal4;
                    arrayList3.add((setNextFocusRightId) setOnFocusChangeListener(objArr2, 2116156023, -2116156018, (int) System.currentTimeMillis()));
                    int i54 = f54838a;
                    i16 = 1;
                    int i55 = (i54 | 5) << 1;
                    int i56 = -(((~i54) & 5) | (i54 & (-6)));
                    int i57 = ((i55 | i56) << 1) - (i56 ^ i55);
                    f54839b = i57 % 128;
                    int i58 = i57 % 2;
                }
                Object[] objArr3 = new Object[i16];
                objArr3[0] = getdynamicbuttontextsizesp;
                setMax setmax = new setMax(mdVar, terminal4, setbackgroundtintlist2, zBooleanValue, bool, zBooleanValue2, zBooleanValue3, zBooleanValue4, l6, l7, l10, arrayList3, (setMaxWidth) setOnFocusChangeListener(new Object[]{(List) getDynamicButtonTextSizeSp.setOnFocusChangeListener(objArr3, -1205018466, 1205018468, System.identityHashCode(getdynamicbuttontextsizesp)), terminal4}, -1691881024, 1691881032, (int) System.currentTimeMillis()), str2);
                int i59 = f54839b + 9;
                f54838a = i59 % 128;
                int i60 = i59 % 2;
                return setmax;
            case 12:
                List list6 = (List) objArr[0];
                ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list6, 10));
                Iterator it3 = list6.iterator();
                int i61 = f54839b;
                int i62 = ((i61 ^ 62) + ((i61 & 62) << 1)) - 1;
                while (true) {
                    f54838a = i62 % 128;
                    int i63 = i62 % 2;
                    if (!it3.hasNext()) {
                        List mutableList2 = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList4);
                        int i64 = f54838a;
                        int i65 = i64 & 59;
                        int i66 = ((((i64 ^ 59) | i65) << 1) - (~(-((i64 | 59) & (~i65))))) - 1;
                        f54839b = i66 % 128;
                        int i67 = i66 % 2;
                        return mutableList2;
                    }
                    setTextFilterEnabled settextfilterenabled = (setTextFilterEnabled) it3.next();
                    arrayList4.add(new dn(setInputExtras.setX((String) setTextFilterEnabled.setX(new Object[]{settextfilterenabled}, 1304105018, -1304105017, System.identityHashCode(settextfilterenabled))), UStringsKt.toUByte((String) setTextFilterEnabled.setX(new Object[]{settextfilterenabled}, -878664251, 878664256, System.identityHashCode(settextfilterenabled)), 16), (List) setTextFilterEnabled.setX(new Object[]{settextfilterenabled}, 1964626400, -1964626397, System.identityHashCode(settextfilterenabled))));
                    int i68 = f54839b;
                    i62 = ((i68 | 95) << 1) - (i68 ^ 95);
                }
                break;
            default:
                return a(objArr);
        }
        return setdownloadlistener;
    }
}
