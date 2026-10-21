package com.mypinpad.tsdk.isolation;

import bk.g;
import bk.w;
import com.google.android.gms.wearable.WearableStatusCodes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fBU\u0012\u0006\u0010\u0003\u001a\u00020\u0007\u0012\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0014\u0012\u0006\u00105\u001a\u00020!¢\u0006\u0004\b6\u00107J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0005\u0010\nR&\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u0019\u0010\u0018R \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0018R\u001a\u0010\u0005\u001a\u00020!8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b \u0010$R,\u0010(\u001a\u0014\u0012\u0004\u0012\u00020%\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u001a0\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0010\u001a\u0004\b(\u0010\u0012R&\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020*0)8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b\u000b\u0010-R&\u00100\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0)8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b/\u0010-"}, d2 = {"Lcom/mypinpad/tsdk/i/setId;", "", "Lcom/mypinpad/tsdk/i/setContentDescription;", "p0", "", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/setContentDescription;)V", "Lcom/mypinpad/tsdk/i/setMaxWidth;", "a", "Lcom/mypinpad/tsdk/i/setMaxWidth;", "()Lcom/mypinpad/tsdk/i/setMaxWidth;", "getNavBarTitleString", "", "Lcom/mypinpad/tsdk/i/Terminal;", "Lcom/mypinpad/tsdk/i/getCurrency;", "b", "Ljava/util/Map;", "setCompoundDrawableTintBlendMode", "()Ljava/util/Map;", "setY", "", "Lcom/mypinpad/tsdk/i/setDefaultFocusHighlightEnabled;", "c", "Ljava/util/List;", "()Ljava/util/List;", "setX", "", "Lcom/mypinpad/tsdk/i/dg;", "d", "Lcom/mypinpad/tsdk/i/dn;", "e", "setOnFocusChangeListener", "setOnDragListener", "Lcom/mypinpad/tsdk/i/setPopupTheme;", "f", "Lcom/mypinpad/tsdk/i/setPopupTheme;", "()Lcom/mypinpad/tsdk/i/setPopupTheme;", "Lcom/mypinpad/tsdk/i/md;", "Lcom/mypinpad/tsdk/i/setMax;", "g", "setOnLongClickListener", "Lcom/mypinpad/tsdk/i/CancelPinPadLaunchRequest;", "Lcom/mypinpad/tsdk/i/create;", "h", "Lcom/mypinpad/tsdk/i/CancelPinPadLaunchRequest;", "()Lcom/mypinpad/tsdk/i/CancelPinPadLaunchRequest;", "i", "setNavigationOnClickListener", "setLayoutAnimation", "p1", "p2", "p3", "p4", "p5", "<init>", "(Lcom/mypinpad/tsdk/i/setMaxWidth;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/mypinpad/tsdk/i/setPopupTheme;)V"}, k = 1, mv = {1, 5, 1})
public final class setId {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final Set<TransactionFailed> f59810j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f59811k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f59812l = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final setMaxWidth getNavBarTitleString;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<Terminal, getCurrency> setY;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<setDefaultFocusHighlightEnabled> setX;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<dg> setCompoundDrawableTintBlendMode;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<dn> setOnDragListener;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final setPopupTheme setDividerPadding;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f59819g;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CancelPinPadLaunchRequest<Terminal, create> setOnFocusChangeListener;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CancelPinPadLaunchRequest<md, setMax> setLayoutAnimation;

    static {
        setAnimation setanimation = setAnimation.INSTANCE;
        f59810j = w.setOf((Object[]) new TransactionFailed[]{(TransactionFailed) setAnimation.setY(new Object[0], 567755471, -567755289, (int) System.currentTimeMillis()), setAnimation.junkify(), setAnimation.setOnCapturedPointerListener(), (TransactionFailed) setAnimation.setY(new Object[0], -835982431, 835982546, (int) System.currentTimeMillis())});
        int i10 = f59812l;
        int i11 = (i10 & 28) + (i10 | 28);
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        f59811k = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 55 / 0;
        }
    }

    public setId(@NotNull setMaxWidth setmaxwidth, @NotNull Map<Terminal, getCurrency> map, @NotNull List<setDefaultFocusHighlightEnabled> list, @NotNull List<dg> list2, @NotNull List<dn> list3, @NotNull setPopupTheme setpopuptheme) {
        Intrinsics.checkNotNullParameter(setmaxwidth, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(setpopuptheme, "");
        this.getNavBarTitleString = setmaxwidth;
        this.setY = map;
        this.setX = list;
        this.setCompoundDrawableTintBlendMode = list2;
        this.setOnDragListener = list3;
        this.setDividerPadding = setpopuptheme;
        Collection<getCurrency> collectionValues = map.values();
        ArrayList<Pair> arrayList = new ArrayList();
        for (getCurrency getcurrency : collectionValues) {
            Collection collectionValues2 = ((Map) getCurrency.setX(new Object[]{getcurrency}, -1971128226, 1971128227, System.identityHashCode(getcurrency))).values();
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collectionValues2, 10));
            Iterator it = collectionValues2.iterator();
            while (it.hasNext()) {
                arrayList2.add(TuplesKt.to((Terminal) getCurrency.setX(new Object[]{getcurrency}, 1627963721, -1627963717, System.identityHashCode(getcurrency)), (create) it.next()));
            }
            g.addAll(arrayList, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            create createVar = (create) ((Pair) it2.next()).getSecond();
            g.addAll(arrayList3, ((Map) create.setDividerPadding(new Object[]{createVar}, 127736117, -127736111, System.identityHashCode(createVar))).values());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : arrayList3) {
            setMax setmax = (setMax) obj;
            md mdVar = (md) setMax.setX(new Object[]{setmax}, 1678059478, -1678059469, System.identityHashCode(setmax));
            Object arrayList4 = linkedHashMap.get(mdVar);
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
                linkedHashMap.put(mdVar, arrayList4);
            }
            ((List) arrayList4).add(obj);
        }
        this.f59819g = linkedHashMap;
        CancelPinPadLaunchRequest<Terminal, create> cancelPinPadLaunchRequest = new CancelPinPadLaunchRequest<>();
        for (Pair pair : arrayList) {
            Object first = pair.getFirst();
            create createVar2 = (create) pair.getSecond();
            CancelPinPadLaunchRequest.setOnFocusChangeListener(new Object[]{cancelPinPadLaunchRequest, first, (setBackgroundTintList) create.setDividerPadding(new Object[]{createVar2}, 1355723687, -1355723682, System.identityHashCode(createVar2)), pair.getSecond()}, -235006928, 235006933, System.identityHashCode(cancelPinPadLaunchRequest));
        }
        Unit unit = Unit.INSTANCE;
        this.setOnFocusChangeListener = cancelPinPadLaunchRequest;
        CancelPinPadLaunchRequest<md, setMax> cancelPinPadLaunchRequest2 = new CancelPinPadLaunchRequest<>();
        for (Pair pair2 : arrayList) {
            create createVar3 = (create) pair2.getSecond();
            for (Map.Entry entry : ((Map) create.setDividerPadding(new Object[]{createVar3}, 127736117, -127736111, System.identityHashCode(createVar3))).entrySet()) {
                md mdVar2 = (md) entry.getKey();
                setMax setmax2 = (setMax) entry.getValue();
                create createVar4 = (create) pair2.getSecond();
                CancelPinPadLaunchRequest.setOnFocusChangeListener(new Object[]{cancelPinPadLaunchRequest2, mdVar2, (setBackgroundTintList) create.setDividerPadding(new Object[]{createVar4}, 1355723687, -1355723682, System.identityHashCode(createVar4)), setmax2}, -235006928, 235006933, System.identityHashCode(cancelPinPadLaunchRequest2));
            }
        }
        Unit unit2 = Unit.INSTANCE;
        this.setLayoutAnimation = cancelPinPadLaunchRequest2;
    }

    /* JADX WARN: Code duplicated, block: B:139:0x02ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x02d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x0556 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x05ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x069f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:0x0512 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x0512 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x0686 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:0x05d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:? A[LOOP:5: B:79:0x058e->B:155:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x016b  */
    /* JADX WARN: Code duplicated, block: B:41:0x027c  */
    /* JADX WARN: Code duplicated, block: B:45:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:49:0x030a A[LOOP:2: B:30:0x0178->B:49:0x030a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x037a A[PHI: r3
      0x037a: PHI (r3v53 java.util.Map<com.mypinpad.tsdk.i.Terminal, com.mypinpad.tsdk.i.getCurrency>) = 
      (r3v52 java.util.Map<com.mypinpad.tsdk.i.Terminal, com.mypinpad.tsdk.i.getCurrency>)
      (r3v62 java.util.Map<com.mypinpad.tsdk.i.Terminal, com.mypinpad.tsdk.i.getCurrency>)
     binds: [B:56:0x0376, B:53:0x036c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x0422  */
    /* JADX WARN: Code duplicated, block: B:66:0x04de  */
    /* JADX WARN: Code duplicated, block: B:69:0x0515  */
    /* JADX WARN: Code duplicated, block: B:71:0x0545 A[PHI: r11
      0x0545: PHI (r11v30 java.lang.Object) = (r11v29 java.lang.Object), (r11v31 java.lang.Object) binds: [B:70:0x0543, B:67:0x0510] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x0552  */
    /* JADX WARN: Code duplicated, block: B:78:0x0562  */
    /* JADX WARN: Code duplicated, block: B:81:0x0594  */
    /* JADX WARN: Code duplicated, block: B:83:0x05d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x0686  */
    /* JADX WARN: Code duplicated, block: B:93:0x06be  */
    /* JADX WARN: Code duplicated, block: B:94:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:96:0x06c4 A[LOOP:3: B:59:0x039d->B:96:0x06c4, LOOP_END] */
    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) throws Exception {
        Object obj;
        Map<Terminal, getCurrency> map;
        Terminal key;
        getCurrency value;
        setMaxWidth setmaxwidth;
        ArrayList arrayList;
        Iterator<T> it;
        boolean z10;
        int i13;
        Iterator it2;
        TransactionFailed transactionFailed;
        boolean zBooleanValue;
        int i14;
        int i15;
        int i16;
        Object next;
        TransactionFailed transactionFailed2;
        int i17;
        TransactionFailed transactionFailed3;
        Iterator<T> it3;
        Iterator<T> it4;
        int i18;
        int i19 = ~i11;
        int i20 = ((~((~i12) | i19 | i10)) * 130) + (i11 * 131) + (i10 * (-129));
        int i21 = i19 | i10;
        int i22 = 1382968989;
        int i23 = -1382968983;
        switch ((((~((~i10) | i11)) | (~(i21 | i12))) * 130) + ((~i21) * (-260)) + i20) {
            case 1:
                setId setid = (setId) objArr[0];
                int i24 = f59812l;
                int i25 = i24 & 89;
                int i26 = i25 + ((i24 ^ 89) | i25);
                f59811k = i26 % 128;
                int i27 = i26 % 2;
                obj = setid.setLayoutAnimation;
                int i28 = (i24 & 105) + (i24 | 105);
                f59811k = i28 % 128;
                if (i28 % 2 != 0) {
                    throw null;
                }
                break;
            case 2:
                setId setid2 = (setId) objArr[0];
                int i29 = f59812l;
                int i30 = (i29 & (-18)) | ((~i29) & 17);
                int i31 = (i29 & 17) << 1;
                int i32 = (i30 & i31) + (i31 | i30);
                int i33 = i32 % 128;
                f59811k = i33;
                int i34 = i32 % 2;
                List<setDefaultFocusHighlightEnabled> list = setid2.setX;
                int i35 = (i33 & (-6)) | ((~i33) & 5);
                int i36 = -(-((i33 & 5) << 1));
                int i37 = (i35 & i36) + (i35 | i36);
                f59812l = i37 % 128;
                int i38 = i37 % 2;
                return list;
            case 3:
                setId setid3 = (setId) objArr[0];
                int i39 = f59811k;
                int i40 = (i39 & (-52)) | ((~i39) & 51);
                int i41 = -(-((i39 & 51) << 1));
                int i42 = (i40 & i41) + (i41 | i40);
                f59812l = i42 % 128;
                int i43 = i42 % 2;
                obj = setid3.setOnFocusChangeListener;
                if (i43 == 0) {
                    int i44 = 73 / 0;
                }
                break;
            case 4:
                setId setid4 = (setId) objArr[0];
                int i45 = f59811k;
                int i46 = i45 ^ 55;
                int i47 = -(-((i45 & 55) << 1));
                int i48 = (i46 ^ i47) + ((i47 & i46) << 1);
                f59812l = i48 % 128;
                if (i48 % 2 == 0) {
                    setPopupTheme setpopuptheme = setid4.setDividerPadding;
                    throw null;
                }
                setPopupTheme setpopuptheme2 = setid4.setDividerPadding;
                int i49 = ~System.identityHashCode(setid4);
                int i50 = i49 & 536060957;
                int i51 = (536060957 | i49) & (~i50);
                int i52 = (i51 & i50) | (i51 ^ i50);
                int i53 = ((-1853143288) & i52) | ((~i52) & 1853143287);
                int i54 = i52 & 1853143287;
                int i55 = ~((i54 & i53) | (i53 ^ i54));
                int i56 = 242262037 & i55;
                int i57 = (i55 | 242262037) & (~i56);
                int i58 = -(-(((i57 & i56) | (i57 ^ i56)) * (-828)));
                int i59 = 670394820 ^ i58;
                int i60 = -(-((i58 & 670394820) << 1));
                int i61 = (i59 ^ i60) + ((i60 & i59) << 1);
                int i62 = 2146942207 ^ i49;
                int i63 = i49 & 2146942207;
                int i64 = ((i63 & i62) | (i62 ^ i63)) * (-828);
                int i65 = i61 & i64;
                int i66 = (i64 ^ i61) | i65;
                int i67 = (i65 & i66) + (i66 | i65);
                int i68 = (i67 ^ 448312320) + ((448312320 & i67) << 1);
                int iIdentityHashCode = System.identityHashCode(setid4);
                int i69 = ~iIdentityHashCode;
                int i70 = (i69 | iIdentityHashCode) & i69;
                int i71 = ((~i70) & 996829717) | ((-996829718) & i70);
                int i72 = i70 & 996829717;
                int i73 = 1819480348 - (~(-(~(((i72 & i71) | (i71 ^ i72)) * (-757)))));
                int i74 = (2146365055 & iIdentityHashCode) | (2146365055 ^ iIdentityHashCode);
                int i75 = ~i74;
                int i76 = ((i74 | i75) & i75) * 1514;
                int i77 = ((~i76) & i73) | ((~i73) & i76);
                int i78 = (i76 & i73) << 1;
                int i79 = ((i77 | i78) << 1) - (i78 ^ i77);
                int i80 = 1451525739 & i69;
                int i81 = (i69 | 1451525739) & (~i80);
                int i82 = ~((i81 & i80) | (i81 ^ i80));
                int i83 = 694839316 & i82;
                int i84 = (i82 | 694839316) & (~i83);
                int i85 = (i84 & i83) | (i84 ^ i83);
                int i86 = (-1149535339) & iIdentityHashCode;
                int i87 = (iIdentityHashCode | (-1149535339)) & (~i86);
                int i88 = ~((i87 & i86) | (i87 ^ i86));
                int i89 = i85 & i88;
                int i90 = (i88 | i85) & (~i89);
                int i91 = -(-(((i90 & i89) | (i90 ^ i89)) * 757));
                if (i68 <= ((((~i91) & i79) | ((~i79) & i91)) - (~((i91 & i79) << 1))) - 1) {
                    return setpopuptheme2;
                }
                throw null;
            case 5:
                setId setid5 = (setId) objArr[0];
                int i92 = f59812l;
                int i93 = i92 & 121;
                int i94 = (i93 - (~((i92 ^ 121) | i93))) - 1;
                f59811k = i94 % 128;
                if (i94 % 2 == 0) {
                    return setid5.f59819g;
                }
                LinkedHashMap linkedHashMap = setid5.f59819g;
                throw null;
            case 6:
                setId setid6 = (setId) objArr[0];
                int i95 = f59812l;
                int i96 = (i95 & (-36)) | ((~i95) & 35);
                int i97 = (i95 & 35) << 1;
                int i98 = (i96 ^ i97) + ((i97 & i96) << 1);
                int i99 = i98 % 128;
                f59811k = i99;
                int i100 = i98 % 2;
                setMaxWidth setmaxwidth2 = setid6.getNavBarTitleString;
                int i101 = i99 & 57;
                int i102 = ((i99 ^ 57) | i101) << 1;
                int i103 = -((i99 | 57) & (~i101));
                int i104 = ((i102 | i103) << 1) - (i103 ^ i102);
                f59812l = i104 % 128;
                if (i104 % 2 != 0) {
                    return setmaxwidth2;
                }
                int i105 = 37 / 0;
                return setmaxwidth2;
            case 7:
                setId setid7 = (setId) objArr[0];
                int i106 = f59811k + 33;
                f59812l = i106 % 128;
                if (i106 % 2 != 0) {
                    return setid7.setOnDragListener;
                }
                List<dn> list2 = setid7.setOnDragListener;
                throw null;
            case 8:
                setId setid8 = (setId) objArr[0];
                int i107 = f59811k;
                int i108 = (i107 ^ 117) + ((i107 & 117) << 1);
                f59812l = i108 % 128;
                if (i108 % 2 == 0) {
                    map = setid8.setY;
                    int i109 = 91 / 0;
                    if (!map.isEmpty()) {
                        System.identityHashCode(setid8);
                        System.identityHashCode(setid8);
                        int i110 = f59812l;
                        int i111 = (((i110 & (-118)) | ((~i110) & 117)) - (~(-(-((i110 & 117) << 1))))) - 1;
                        f59811k = i111 % 128;
                        int i112 = i111 % 2;
                        for (Map.Entry<Terminal, getCurrency> entry : map.entrySet()) {
                            key = entry.getKey();
                            value = entry.getValue();
                            setmaxwidth = new setMaxWidth();
                            setMaxWidth.setX(new Object[]{setmaxwidth, (setMaxWidth) setCompoundDrawableTintBlendMode(new Object[]{setid8}, i22, i23, System.identityHashCode(setid8))}, 1087552335, -1087552333, System.identityHashCode(setmaxwidth));
                            setMaxWidth.setX(new Object[]{setmaxwidth, (setMaxWidth) getCurrency.setX(new Object[]{value}, -614599099, 614599102, System.identityHashCode(value))}, 1087552335, -1087552333, System.identityHashCode(setmaxwidth));
                            Set<TransactionFailed> set = f59810j;
                            arrayList = new ArrayList();
                            it = set.iterator();
                            int i113 = f59811k;
                            int i114 = (i113 & 57) + (i113 | 57);
                            f59812l = i114 % 128;
                            int i115 = i114 % 2;
                            while (it.hasNext()) {
                                int iIdentityHashCode2 = System.identityHashCode(setid8);
                                int i116 = ~iIdentityHashCode2;
                                int i117 = i116 & (i116 | iIdentityHashCode2);
                                int i118 = ((-1442912727) & (~i117)) | (1442912726 & i117);
                                int i119 = i117 & (-1442912727);
                                int i120 = (i118 & i119) | (i118 ^ i119);
                                int i121 = ~i120;
                                int i122 = (i120 | i121) & i121;
                                int i123 = -(~(((i122 & 67176662) | (i122 ^ 67176662)) * 529));
                                int i124 = (644410790 & i123) + (i123 | 644410790);
                                int i125 = (i124 ^ (-1)) + (i124 << 1);
                                int i126 = (-1442912727) & iIdentityHashCode2;
                                int i127 = ((-1442912727) | iIdentityHashCode2) & (~i126);
                                int i128 = (i127 & i126) | (i127 ^ i126);
                                int i129 = ~i128;
                                int i130 = (i128 | i129) & i129;
                                int i131 = ((i130 & 71265526) | (71265526 ^ i130)) * 529;
                                int i132 = i125 & i131;
                                i14 = (((i125 ^ i131) | i132) << 1) - ((i125 | i131) & (~i132));
                                int iIdentityHashCode3 = System.identityHashCode(setid8);
                                int i133 = (-67244129) ^ iIdentityHashCode3;
                                int i134 = ~iIdentityHashCode3;
                                int i135 = (-67244129) & iIdentityHashCode3;
                                int i136 = ~((i133 ^ i135) | (i133 & i135));
                                int i137 = (-262561657) ^ i136;
                                int i138 = (-262561657) & i136;
                                int i139 = 1798062489 - (~(-(~(-(-(((i137 ^ i138) | (i137 & i138)) * (-476)))))));
                                int i140 = -(~((~((iIdentityHashCode3 & 67244128) | ((-67244129) & i134) | i135)) * 952));
                                int i141 = ((i139 & i140) + (i139 | i140)) - 1;
                                int i142 = ((-100815993) & i134) | ((-100815993) ^ i134);
                                int i143 = i142 ^ (-228989793);
                                int i144 = i142 & (-228989793);
                                int i145 = -(-((~((i144 & i143) | (i143 ^ i144))) * 476));
                                i15 = i141 & i145;
                                i16 = -(-((i145 ^ i141) | i15));
                                if (i14 > ((i15 | i16) << 1) - (i16 ^ i15)) {
                                    next = it.next();
                                    transactionFailed3 = (TransactionFailed) next;
                                    setOnGenericMotionListener setongenericmotionlistener = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
                                    int i146 = 29 / 0;
                                    if (!((Boolean) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed3}, 1914607362, -1914607356, System.identityHashCode(transactionFailed3)), key}, 1118214839, -1118214838, (int) System.currentTimeMillis())).booleanValue()) {
                                        continue;
                                    } else {
                                        int i147 = f59812l;
                                        i17 = (i147 & 1) + (i147 | 1);
                                        f59811k = i17 % 128;
                                        if (i17 % 2 == 0) {
                                            arrayList.add(next);
                                            throw null;
                                        }
                                        arrayList.add(next);
                                    }
                                } else {
                                    next = it.next();
                                    transactionFailed2 = (TransactionFailed) next;
                                    setOnGenericMotionListener setongenericmotionlistener2 = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
                                    if (((Boolean) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2)), key}, 1118214839, -1118214838, (int) System.currentTimeMillis())).booleanValue()) {
                                        int i148 = f59812l;
                                        i17 = (i148 & 1) + (i148 | 1);
                                        f59811k = i17 % 128;
                                        if (i17 % 2 == 0) {
                                            arrayList.add(next);
                                            throw null;
                                        }
                                        arrayList.add(next);
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                int i149 = f59812l;
                                int i150 = i149 & 19;
                                int i151 = ((i149 | 19) & (~i150)) + (i150 << 1);
                                f59811k = i151 % 128;
                                int i152 = i151 % 2;
                                it2 = arrayList.iterator();
                                int i153 = f59811k;
                                int i154 = ((i153 ^ 73) | (i153 & 73)) << 1;
                                int i155 = -(((~i153) & 73) | (i153 & (-74)));
                                int i156 = (i154 & i155) + (i155 | i154);
                                f59812l = i156 % 128;
                                int i157 = i156 % 2;
                                while (true) {
                                    if (it2.hasNext()) {
                                        int i158 = f59812l;
                                        int i159 = ((i158 ^ 62) + ((i158 & 62) << 1)) - 1;
                                        f59811k = i159 % 128;
                                        int i160 = i159 % 2;
                                        transactionFailed = (TransactionFailed) it2.next();
                                        zBooleanValue = ((Boolean) setMaxWidth.setX(new Object[]{setmaxwidth, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, 2135130751, -2135130733, System.identityHashCode(setmaxwidth))).booleanValue();
                                        if (zBooleanValue) {
                                            SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
                                            StringBuilder sb2 = new StringBuilder("Mandatory tag '");
                                            sb2.append((String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed)));
                                            sb2.append("' is missing from kernel configuration: ");
                                            sb2.append((int) ((Terminal) getCurrency.setX(new Object[]{value}, 1627963721, -1627963717, System.identityHashCode(value))).setY());
                                            SouthPacificEndpoint.setX(new Object[]{sb2.toString()}, -34485176, 34485177, (int) System.currentTimeMillis());
                                            StringBuilder sb3 = new StringBuilder();
                                            sb3.append((int) ((Terminal) getCurrency.setX(new Object[]{value}, 1627963721, -1627963717, System.identityHashCode(value))).setY());
                                            sb3.append(", ");
                                            sb3.append(transactionFailed.setOnFocusChangeListener());
                                            throw new setIndeterminateDrawable(WearableStatusCodes.DUPLICATE_CAPABILITY, sb3.toString(), null, 4, null);
                                        }
                                        if (zBooleanValue) {
                                            int i161 = f59812l;
                                            int i162 = ~i161;
                                            int i163 = ((i161 & (-4)) | (i162 & 3)) + ((i161 & 3) << 1);
                                            f59811k = i163 % 128;
                                            int i164 = i163 % 2;
                                            int i165 = ((i161 ^ 19) | (i161 & 19)) << 1;
                                            int i166 = -((i161 & (-20)) | (i162 & 19));
                                            int i167 = (i165 & i166) + (i166 | i165);
                                            f59811k = i167 % 128;
                                            int i168 = i167 % 2;
                                            z10 = false;
                                        }
                                    } else {
                                        int i169 = f59811k;
                                        int i170 = i169 | 43;
                                        int i171 = i170 << 1;
                                        int i172 = -((~(i169 & 43)) & i170);
                                        int i173 = (i171 ^ i172) + ((i172 & i171) << 1);
                                        f59812l = i173 % 128;
                                        int i174 = i173 % 2;
                                        z10 = true;
                                    }
                                }
                            } else {
                                int i1610 = f59811k;
                                int i175 = i1610 | 43;
                                int i176 = i175 << 1;
                                int i177 = -((~(i1610 & 43)) & i175);
                                int i178 = (i176 ^ i177) + ((i177 & i176) << 1);
                                f59812l = i178 % 128;
                                int i179 = i178 % 2;
                                z10 = true;
                            }
                            if (!z10) {
                                int i180 = f59811k;
                                int i181 = ((i180 | 47) << 1) - (i180 ^ 47);
                                int i182 = i181 % 128;
                                f59812l = i182;
                                int i183 = i181 % 2;
                                int i184 = i182 & 23;
                                int i185 = (i182 | 23) & (~i184);
                                int i186 = i184 << 1;
                                i13 = (i185 & i186) + (i185 | i186);
                                f59811k = i13 % 128;
                                if (i13 % 2 == 0) {
                                    throw null;
                                }
                                obj = Boolean.FALSE;
                            } else {
                                i22 = 1382968989;
                                i23 = -1382968983;
                            }
                        }
                    }
                    break;
                } else {
                    map = setid8.setY;
                    if (!map.isEmpty()) {
                        System.identityHashCode(setid8);
                        System.identityHashCode(setid8);
                        int i1110 = f59812l;
                        int i1111 = (((i1110 & (-118)) | ((~i1110) & 117)) - (~(-(-((i1110 & 117) << 1))))) - 1;
                        f59811k = i1111 % 128;
                        int i1112 = i1111 % 2;
                        while (r3.hasNext()) {
                            key = entry.getKey();
                            value = entry.getValue();
                            setmaxwidth = new setMaxWidth();
                            setMaxWidth.setX(new Object[]{setmaxwidth, (setMaxWidth) setCompoundDrawableTintBlendMode(new Object[]{setid8}, i22, i23, System.identityHashCode(setid8))}, 1087552335, -1087552333, System.identityHashCode(setmaxwidth));
                            setMaxWidth.setX(new Object[]{setmaxwidth, (setMaxWidth) getCurrency.setX(new Object[]{value}, -614599099, 614599102, System.identityHashCode(value))}, 1087552335, -1087552333, System.identityHashCode(setmaxwidth));
                            Set<TransactionFailed> set2 = f59810j;
                            arrayList = new ArrayList();
                            it = set2.iterator();
                            int i1113 = f59811k;
                            int i1114 = (i1113 & 57) + (i1113 | 57);
                            f59812l = i1114 % 128;
                            int i1115 = i1114 % 2;
                            while (it.hasNext()) {
                                int iIdentityHashCode4 = System.identityHashCode(setid8);
                                int i1116 = ~iIdentityHashCode4;
                                int i1117 = i1116 & (i1116 | iIdentityHashCode4);
                                int i1118 = ((-1442912727) & (~i1117)) | (1442912726 & i1117);
                                int i1119 = i1117 & (-1442912727);
                                int i1210 = (i1118 & i1119) | (i1118 ^ i1119);
                                int i1211 = ~i1210;
                                int i1212 = (i1210 | i1211) & i1211;
                                int i1213 = -(~(((i1212 & 67176662) | (i1212 ^ 67176662)) * 529));
                                int i1214 = (644410790 & i1213) + (i1213 | 644410790);
                                int i1215 = (i1214 ^ (-1)) + (i1214 << 1);
                                int i1216 = (-1442912727) & iIdentityHashCode4;
                                int i1217 = ((-1442912727) | iIdentityHashCode4) & (~i1216);
                                int i1218 = (i1217 & i1216) | (i1217 ^ i1216);
                                int i1219 = ~i1218;
                                int i1310 = (i1218 | i1219) & i1219;
                                int i1311 = ((i1310 & 71265526) | (71265526 ^ i1310)) * 529;
                                int i1312 = i1215 & i1311;
                                i14 = (((i1215 ^ i1311) | i1312) << 1) - ((i1215 | i1311) & (~i1312));
                                int iIdentityHashCode5 = System.identityHashCode(setid8);
                                int i1313 = (-67244129) ^ iIdentityHashCode5;
                                int i1314 = ~iIdentityHashCode5;
                                int i1315 = (-67244129) & iIdentityHashCode5;
                                int i1316 = ~((i1313 ^ i1315) | (i1313 & i1315));
                                int i1317 = (-262561657) ^ i1316;
                                int i1318 = (-262561657) & i1316;
                                int i1319 = 1798062489 - (~(-(~(-(-(((i1317 ^ i1318) | (i1317 & i1318)) * (-476)))))));
                                int i1410 = -(~((~((iIdentityHashCode5 & 67244128) | ((-67244129) & i1314) | i1315)) * 952));
                                int i1411 = ((i1319 & i1410) + (i1319 | i1410)) - 1;
                                int i1412 = ((-100815993) & i1314) | ((-100815993) ^ i1314);
                                int i1413 = i1412 ^ (-228989793);
                                int i1414 = i1412 & (-228989793);
                                int i1415 = -(-((~((i1414 & i1413) | (i1413 ^ i1414))) * 476));
                                i15 = i1411 & i1415;
                                i16 = -(-((i1415 ^ i1411) | i15));
                                if (i14 > ((i15 | i16) << 1) - (i16 ^ i15)) {
                                    next = it.next();
                                    transactionFailed3 = (TransactionFailed) next;
                                    setOnGenericMotionListener setongenericmotionlistener3 = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
                                    int i1416 = 29 / 0;
                                    if (!((Boolean) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed3}, 1914607362, -1914607356, System.identityHashCode(transactionFailed3)), key}, 1118214839, -1118214838, (int) System.currentTimeMillis())).booleanValue()) {
                                        continue;
                                    } else {
                                        int i1417 = f59812l;
                                        i17 = (i1417 & 1) + (i1417 | 1);
                                        f59811k = i17 % 128;
                                        if (i17 % 2 == 0) {
                                            arrayList.add(next);
                                            throw null;
                                        }
                                        arrayList.add(next);
                                    }
                                } else {
                                    next = it.next();
                                    transactionFailed2 = (TransactionFailed) next;
                                    setOnGenericMotionListener setongenericmotionlistener4 = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
                                    if (((Boolean) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2)), key}, 1118214839, -1118214838, (int) System.currentTimeMillis())).booleanValue()) {
                                        int i1418 = f59812l;
                                        i17 = (i1418 & 1) + (i1418 | 1);
                                        f59811k = i17 % 128;
                                        if (i17 % 2 == 0) {
                                            arrayList.add(next);
                                            throw null;
                                        }
                                        arrayList.add(next);
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                int i1419 = f59812l;
                                int i1510 = i1419 & 19;
                                int i1511 = ((i1419 | 19) & (~i1510)) + (i1510 << 1);
                                f59811k = i1511 % 128;
                                int i1512 = i1511 % 2;
                                it2 = arrayList.iterator();
                                int i1513 = f59811k;
                                int i1514 = ((i1513 ^ 73) | (i1513 & 73)) << 1;
                                int i1515 = -(((~i1513) & 73) | (i1513 & (-74)));
                                int i1516 = (i1514 & i1515) + (i1515 | i1514);
                                f59812l = i1516 % 128;
                                int i1517 = i1516 % 2;
                                while (true) {
                                    if (it2.hasNext()) {
                                        int i1518 = f59812l;
                                        int i1519 = ((i1518 ^ 62) + ((i1518 & 62) << 1)) - 1;
                                        f59811k = i1519 % 128;
                                        int i1611 = i1519 % 2;
                                        transactionFailed = (TransactionFailed) it2.next();
                                        zBooleanValue = ((Boolean) setMaxWidth.setX(new Object[]{setmaxwidth, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, 2135130751, -2135130733, System.identityHashCode(setmaxwidth))).booleanValue();
                                        if (zBooleanValue) {
                                            SouthPacificEndpoint southPacificEndpoint2 = SouthPacificEndpoint.setX;
                                            StringBuilder sb4 = new StringBuilder("Mandatory tag '");
                                            sb4.append((String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed)));
                                            sb4.append("' is missing from kernel configuration: ");
                                            sb4.append((int) ((Terminal) getCurrency.setX(new Object[]{value}, 1627963721, -1627963717, System.identityHashCode(value))).setY());
                                            SouthPacificEndpoint.setX(new Object[]{sb4.toString()}, -34485176, 34485177, (int) System.currentTimeMillis());
                                            StringBuilder sb5 = new StringBuilder();
                                            sb5.append((int) ((Terminal) getCurrency.setX(new Object[]{value}, 1627963721, -1627963717, System.identityHashCode(value))).setY());
                                            sb5.append(", ");
                                            sb5.append(transactionFailed.setOnFocusChangeListener());
                                            throw new setIndeterminateDrawable(WearableStatusCodes.DUPLICATE_CAPABILITY, sb5.toString(), null, 4, null);
                                        }
                                        if (zBooleanValue) {
                                            int i1612 = f59812l;
                                            int i1613 = ~i1612;
                                            int i1614 = ((i1612 & (-4)) | (i1613 & 3)) + ((i1612 & 3) << 1);
                                            f59811k = i1614 % 128;
                                            int i1615 = i1614 % 2;
                                            int i1616 = ((i1612 ^ 19) | (i1612 & 19)) << 1;
                                            int i1617 = -((i1612 & (-20)) | (i1613 & 19));
                                            int i1618 = (i1616 & i1617) + (i1617 | i1616);
                                            f59811k = i1618 % 128;
                                            int i1619 = i1618 % 2;
                                            z10 = false;
                                        }
                                    } else {
                                        int i16110 = f59811k;
                                        int i1710 = i16110 | 43;
                                        int i1711 = i1710 << 1;
                                        int i1712 = -((~(i16110 & 43)) & i1710);
                                        int i1713 = (i1711 ^ i1712) + ((i1712 & i1711) << 1);
                                        f59812l = i1713 % 128;
                                        int i1714 = i1713 % 2;
                                        z10 = true;
                                    }
                                }
                            } else {
                                int i16111 = f59811k;
                                int i1715 = i16111 | 43;
                                int i1716 = i1715 << 1;
                                int i1717 = -((~(i16111 & 43)) & i1715);
                                int i1718 = (i1716 ^ i1717) + ((i1717 & i1716) << 1);
                                f59812l = i1718 % 128;
                                int i1719 = i1718 % 2;
                                z10 = true;
                            }
                            if (!z10) {
                                int i187 = f59811k;
                                int i188 = ((i187 | 47) << 1) - (i187 ^ 47);
                                int i189 = i188 % 128;
                                f59812l = i189;
                                int i1810 = i188 % 2;
                                int i1811 = i189 & 23;
                                int i1812 = (i189 | 23) & (~i1811);
                                int i1813 = i1811 << 1;
                                i13 = (i1812 & i1813) + (i1812 | i1813);
                                f59811k = i13 % 128;
                                if (i13 % 2 == 0) {
                                    throw null;
                                }
                                obj = Boolean.FALSE;
                            } else {
                                i22 = 1382968989;
                                i23 = -1382968983;
                            }
                            break;
                        }
                    }
                }
                int i190 = f59812l;
                int i191 = ((i190 ^ 60) + ((i190 & 60) << 1)) - 1;
                f59811k = i191 % 128;
                if (i191 % 2 != 0) {
                    throw null;
                }
                obj = Boolean.TRUE;
                break;
                break;
            case 9:
                setId setid9 = (setId) objArr[0];
                setContentDescription setcontentdescription = (setContentDescription) objArr[1];
                int i192 = f59812l;
                int i193 = i192 & 21;
                int i194 = i193 + ((i192 ^ 21) | i193);
                f59811k = i194 % 128;
                int i195 = i194 % 2;
                Intrinsics.checkNotNullParameter(setcontentdescription, "");
                Map<Terminal, getCurrency> map2 = setid9.setY;
                if (!map2.isEmpty()) {
                    int i196 = f59811k;
                    int i197 = (((i196 | 8) << 1) - (i196 ^ 8)) - 1;
                    f59812l = i197 % 128;
                    int i198 = i197 % 2;
                    Iterator<Map.Entry<Terminal, getCurrency>> it5 = map2.entrySet().iterator();
                    int i199 = f59811k;
                    int i200 = i199 & 31;
                    int i201 = i200 + ((i199 ^ 31) | i200);
                    f59812l = i201 % 128;
                    int i202 = i201 % 2;
                    while (it5.hasNext()) {
                        int i203 = f59811k;
                        int i204 = i203 & 63;
                        int i205 = ((((i203 ^ 63) | i204) << 1) - (~(-((i203 | 63) & (~i204))))) - 1;
                        f59812l = i205 % 128;
                        if (i205 % 2 == 0) {
                            Map.Entry<Terminal, getCurrency> next2 = it5.next();
                            getCurrency value2 = next2.getValue();
                            ((Boolean) getCurrency.setX(new Object[]{value2, next2.getKey(), (setMaxWidth) setCompoundDrawableTintBlendMode(new Object[]{setid9}, 1382968989, -1382968983, System.identityHashCode(setid9))}, -893217322, 893217328, System.identityHashCode(value2))).booleanValue();
                            throw null;
                        }
                        Map.Entry<Terminal, getCurrency> next3 = it5.next();
                        getCurrency value3 = next3.getValue();
                        if (!(!((Boolean) getCurrency.setX(new Object[]{value3, next3.getKey(), (setMaxWidth) setCompoundDrawableTintBlendMode(new Object[]{setid9}, 1382968989, -1382968983, System.identityHashCode(setid9))}, -893217322, 893217328, System.identityHashCode(value3))).booleanValue())) {
                        }
                    }
                }
                List<setDefaultFocusHighlightEnabled> list3 = setid9.setX;
                if (list3 instanceof Collection) {
                    int i206 = f59812l + 25;
                    f59811k = i206 % 128;
                    int i207 = i206 % 2;
                    if (!list3.isEmpty()) {
                        it3 = list3.iterator();
                        int i208 = f59811k + 121;
                        f59812l = i208 % 128;
                        int i209 = i208 % 2;
                        while (!(!it3.hasNext())) {
                            int i210 = f59812l;
                            int i211 = (i210 ^ 112) + ((i210 & 112) << 1);
                            int i212 = (i211 ^ (-1)) + (i211 << 1);
                            f59811k = i212 % 128;
                            int i213 = i212 % 2;
                            setDefaultFocusHighlightEnabled setdefaultfocushighlightenabled = (setDefaultFocusHighlightEnabled) it3.next();
                            ((Boolean) setDefaultFocusHighlightEnabled.setCompoundDrawableTintBlendMode(new Object[]{setdefaultfocushighlightenabled}, -200342298, 200342301, System.identityHashCode(setdefaultfocushighlightenabled))).booleanValue();
                            int i214 = f59812l;
                            int i215 = i214 ^ 57;
                            int i216 = ((i214 & 57) | i215) << 1;
                            int i217 = -i215;
                            int i218 = (i216 ^ i217) + ((i216 & i217) << 1);
                            f59811k = i218 % 128;
                            int i219 = i218 % 2;
                        }
                    }
                } else {
                    it3 = list3.iterator();
                    int i2010 = f59811k + 121;
                    f59812l = i2010 % 128;
                    int i2011 = i2010 % 2;
                    while (!(!it3.hasNext())) {
                        int i2110 = f59812l;
                        int i2111 = (i2110 ^ 112) + ((i2110 & 112) << 1);
                        int i2112 = (i2111 ^ (-1)) + (i2111 << 1);
                        f59811k = i2112 % 128;
                        int i2113 = i2112 % 2;
                        setDefaultFocusHighlightEnabled setdefaultfocushighlightenabled2 = (setDefaultFocusHighlightEnabled) it3.next();
                        ((Boolean) setDefaultFocusHighlightEnabled.setCompoundDrawableTintBlendMode(new Object[]{setdefaultfocushighlightenabled2}, -200342298, 200342301, System.identityHashCode(setdefaultfocushighlightenabled2))).booleanValue();
                        int i2114 = f59812l;
                        int i2115 = i2114 ^ 57;
                        int i2116 = ((i2114 & 57) | i2115) << 1;
                        int i2117 = -i2115;
                        int i2118 = (i2116 ^ i2117) + ((i2116 & i2117) << 1);
                        f59811k = i2118 % 128;
                        int i2119 = i2118 % 2;
                    }
                }
                List<dg> list4 = setid9.setCompoundDrawableTintBlendMode;
                if (list4 instanceof Collection) {
                    int iIdentityHashCode6 = System.identityHashCode(setid9);
                    int i220 = (-1277710516) & iIdentityHashCode6;
                    int i221 = (~i220) & ((-1277710516) | iIdentityHashCode6);
                    int i222 = ~iIdentityHashCode6;
                    int i223 = -(-(((i220 & i221) | (i221 ^ i220)) * (-859)));
                    int i224 = (((-1677380940) | i223) << 1) - (i223 ^ (-1677380940));
                    int i225 = (1277710515 & i222) | ((~i222) & (-1277710516));
                    int i226 = (-1277710516) & i222;
                    int i227 = ~((i226 & i225) | (i225 ^ i226));
                    int i228 = (1832579259 & i222) | ((-1832579260) & iIdentityHashCode6);
                    int i229 = 1832579259 & iIdentityHashCode6;
                    int i230 = ~((i229 & i228) | (i228 ^ i229));
                    int i231 = ((i227 & i230) | (i227 ^ i230)) * 859;
                    int i232 = i224 & i231;
                    int i233 = (i231 ^ i224) | i232;
                    int i234 = (i232 ^ i233) + ((i233 & i232) << 1);
                    int i235 = (iIdentityHashCode6 | i222) & i222;
                    int i236 = ((~i235) & 1629139129) | ((-1629139130) & i235);
                    int i237 = i235 & 1629139129;
                    int i238 = ~((i237 & i236) | (i236 ^ i237));
                    int i239 = i238 & 203440130;
                    int i240 = (i238 | 203440130) & (~i239);
                    int i241 = (i234 - (~(-(-(((i240 & i239) | (i240 ^ i239)) * 859))))) - 1;
                    int iIdentityHashCode7 = System.identityHashCode(setid9);
                    int i242 = ~iIdentityHashCode7;
                    int i243 = (i242 | iIdentityHashCode7) & i242;
                    int i244 = ((~i243) & 212343952) | ((-212343953) & i243);
                    int i245 = i243 & 212343952;
                    int i246 = ~((i245 & i244) | (i244 ^ i245));
                    int i247 = 1155592848 - (~(((i246 & (-1370238654)) | ((-1370238654) ^ i246)) * 226));
                    int i248 = 1370238653 ^ iIdentityHashCode7;
                    int i249 = 1370238653 & iIdentityHashCode7;
                    int i250 = ~((i248 ^ i249) | (i248 & i249));
                    int i251 = (201330688 ^ i250) | (i250 & 201330688);
                    int i252 = 212343952 & i242;
                    int i253 = (i242 | 212343952) & (~i252);
                    int i254 = (i253 & i252) | (i253 ^ i252);
                    int i255 = (i254 & 1370238653) | ((~i254) & (-1370238654));
                    int i256 = i254 & (-1370238654);
                    int i257 = ~((i256 & i255) | (i255 ^ i256));
                    int i258 = (((i257 & i251) | ((~i257) & i251) | ((~i251) & i257)) * (-113)) + (i247 ^ (-1)) + (i247 << 1);
                    int i259 = 212343952 & iIdentityHashCode7;
                    int i260 = (iIdentityHashCode7 | 212343952) & (~i259);
                    int i261 = (~((i260 & i259) | (i260 ^ i259))) * 113;
                    int i262 = i258 ^ i261;
                    int i263 = ((i261 & i258) | i262) << 1;
                    int i264 = -i262;
                    if (i241 <= (i263 ^ i264) + ((i263 & i264) << 1)) {
                        list4.isEmpty();
                        throw null;
                    }
                    if (!list4.isEmpty()) {
                        it4 = list4.iterator();
                        int i265 = f59811k;
                        int i266 = (i265 ^ 95) + ((i265 & 95) << 1);
                        f59812l = i266 % 128;
                        int i267 = i266 % 2;
                        while (it4.hasNext()) {
                            int i268 = f59812l;
                            i18 = (i268 ^ 57) + ((i268 & 57) << 1);
                            f59811k = i18 % 128;
                            if (i18 % 2 != 0) {
                                dg dgVar = (dg) it4.next();
                                ((Boolean) dg.setX(new Object[]{dgVar, setcontentdescription}, 981690615, -981690612, System.identityHashCode(dgVar))).booleanValue();
                                int i269 = 88 / 0;
                            } else {
                                dg dgVar2 = (dg) it4.next();
                                ((Boolean) dg.setX(new Object[]{dgVar2, setcontentdescription}, 981690615, -981690612, System.identityHashCode(dgVar2))).booleanValue();
                            }
                        }
                    }
                } else {
                    it4 = list4.iterator();
                    int i2610 = f59811k;
                    int i2611 = (i2610 ^ 95) + ((i2610 & 95) << 1);
                    f59812l = i2611 % 128;
                    int i2612 = i2611 % 2;
                    while (it4.hasNext()) {
                        int i2613 = f59812l;
                        i18 = (i2613 ^ 57) + ((i2613 & 57) << 1);
                        f59811k = i18 % 128;
                        if (i18 % 2 != 0) {
                            dg dgVar3 = (dg) it4.next();
                            ((Boolean) dg.setX(new Object[]{dgVar3, setcontentdescription}, 981690615, -981690612, System.identityHashCode(dgVar3))).booleanValue();
                            int i2614 = 88 / 0;
                        } else {
                            dg dgVar4 = (dg) it4.next();
                            ((Boolean) dg.setX(new Object[]{dgVar4, setcontentdescription}, 981690615, -981690612, System.identityHashCode(dgVar4))).booleanValue();
                        }
                    }
                }
                ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{setid9}, -579330573, 579330581, System.identityHashCode(setid9))).booleanValue();
                int i270 = f59811k;
                int i271 = i270 & 23;
                int i272 = ((i270 | 23) & (~i271)) + (i271 << 1);
                f59812l = i272 % 128;
                int i273 = i272 % 2;
                return null;
            case 10:
                setId setid10 = (setId) objArr[0];
                int i274 = f59811k;
                int i275 = i274 ^ 37;
                int i276 = ((((i274 & 37) | i275) << 1) - (~(-i275))) - 1;
                int i277 = i276 % 128;
                f59812l = i277;
                int i278 = i276 % 2;
                obj = setid10.setY;
                int i279 = i277 + 43;
                f59811k = i279 % 128;
                if (i279 % 2 != 0) {
                    throw null;
                }
                break;
            default:
                setId setid11 = (setId) objArr[0];
                int i280 = f59811k;
                int i281 = i280 + 34;
                int i282 = (i281 ^ (-1)) + (i281 << 1);
                f59812l = i282 % 128;
                int i283 = i282 % 2;
                obj = setid11.setCompoundDrawableTintBlendMode;
                int i284 = (i280 ^ 111) + ((i280 & 111) << 1);
                f59812l = i284 % 128;
                if (i284 % 2 == 0) {
                    throw null;
                }
                break;
        }
        return obj;
    }

    @JvmName(name = "getNavBarTitleString")
    @NotNull
    public final CancelPinPadLaunchRequest<Terminal, create> getNavBarTitleString() {
        return (CancelPinPadLaunchRequest) setCompoundDrawableTintBlendMode(new Object[]{this}, -285918332, 285918335, System.identityHashCode(this));
    }

    public final void setDividerPadding(@NotNull setContentDescription p4) throws Exception {
        setCompoundDrawableTintBlendMode(new Object[]{this, p4}, -1811659539, 1811659548, System.identityHashCode(this));
    }

    @JvmName(name = "setNavigationOnClickListener")
    @NotNull
    public final CancelPinPadLaunchRequest<md, setMax> setNavigationOnClickListener() {
        return (CancelPinPadLaunchRequest) setCompoundDrawableTintBlendMode(new Object[]{this}, -1452003193, 1452003194, System.identityHashCode(this));
    }

    @JvmName(name = "setOnDragListener")
    @NotNull
    public final setPopupTheme setOnDragListener() {
        return (setPopupTheme) setCompoundDrawableTintBlendMode(new Object[]{this}, -1871279024, 1871279028, System.identityHashCode(this));
    }

    @JvmName(name = "setOnFocusChangeListener")
    @NotNull
    public final List<dn> setOnFocusChangeListener() {
        return (List) setCompoundDrawableTintBlendMode(new Object[]{this}, 1695868503, -1695868496, System.identityHashCode(this));
    }

    @JvmName(name = "setOnLongClickListener")
    @NotNull
    public final Map<md, List<setMax>> setOnLongClickListener() {
        return (Map) setCompoundDrawableTintBlendMode(new Object[]{this}, 1633912096, -1633912091, System.identityHashCode(this));
    }

    @JvmName(name = "setX")
    @NotNull
    public final List<dg> setX() {
        return (List) setCompoundDrawableTintBlendMode(new Object[]{this}, 1593631797, -1593631797, System.identityHashCode(this));
    }

    @JvmName(name = "setY")
    @NotNull
    public final List<setDefaultFocusHighlightEnabled> setY() {
        return (List) setCompoundDrawableTintBlendMode(new Object[]{this}, 2058426419, -2058426417, System.identityHashCode(this));
    }

    @JvmName(name = "setDividerPadding")
    @NotNull
    public final setMaxWidth setDividerPadding() {
        return (setMaxWidth) setCompoundDrawableTintBlendMode(new Object[]{this}, 1382968989, -1382968983, System.identityHashCode(this));
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    @NotNull
    public final Map<Terminal, getCurrency> setCompoundDrawableTintBlendMode() {
        return (Map) setCompoundDrawableTintBlendMode(new Object[]{this}, 1240606079, -1240606069, System.identityHashCode(this));
    }
}
