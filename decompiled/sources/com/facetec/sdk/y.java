package com.facetec.sdk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    C0579r f42976a = new C0579r();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    List<C0579r> f42979d = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    List<List<Integer>> f42978c = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    List<C0579r> f42980e = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    List<List<List<Integer>>> f42977b = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f42981f = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f42984i = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f42983h = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f42982g = false;

    private z a(int i10, int i11) {
        int i12 = 0;
        for (int i13 = 0; i13 < this.f42979d.size(); i13++) {
            C0579r c0579r = this.f42979d.get(i13);
            int size = 0;
            for (int i14 = 0; i14 < c0579r.f42788a.size(); i14++) {
                List<Integer> list = c0579r.f42788a.get(i14);
                int i15 = i11 + size;
                if (i12 == i10 && i15 < c0579r.f42791d.size()) {
                    return c0579r.f42791d.get(i15);
                }
                i12++;
                size += list.size();
            }
        }
        return new z();
    }

    public static List<List<Integer>> e(List<C0579r> list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.addAll(list.get(i10).f42788a);
        }
        return arrayList;
    }

    public final boolean b(List<List<Integer>> list, int i10, x xVar) {
        int iMax;
        int i11;
        List<Integer> list2;
        int i12;
        int i13;
        ArrayList arrayList;
        List<Integer> list3;
        int i14;
        boolean z10;
        int i15;
        int i16;
        int i17;
        ArrayList arrayList2;
        z zVar;
        int iIntValue;
        List<List<Integer>> list4 = list;
        int i18 = i10;
        int i19 = 0;
        if (list.size() <= i18) {
            return false;
        }
        List listAsList = Arrays.asList(aa.b(aa.g(list4.subList(0, i18))));
        int i20 = i18;
        int i21 = 0;
        while (true) {
            int i22 = 1;
            if (i20 >= list.size()) {
                return i21 > 0;
            }
            List<Integer> list5 = list4.get(i20);
            int i23 = i19;
            while (true) {
                if (i23 >= list5.size()) {
                    iMax = i19;
                    i11 = iMax;
                    break;
                }
                if (listAsList.contains(list5.get(i23))) {
                    iMax = Math.max(i19, i23 - 4);
                    i11 = 1;
                    break;
                }
                i23 += 3;
            }
            if (xVar == x.INTRA_SESSION || i11 != 0) {
                while (iMax < list5.size()) {
                    ArrayList arrayList3 = new ArrayList();
                    int i24 = i19;
                    while (true) {
                        int i25 = iMax + i24;
                        if (i25 >= list5.size()) {
                            break;
                        }
                        int iIntValue2 = list5.get(i25).intValue();
                        arrayList3.add(Integer.valueOf(iIntValue2));
                        if (b(arrayList3)) {
                            break;
                        }
                        if (iIntValue2 == ((Integer) androidx.appcompat.view.menu.b.b(arrayList3, i22)).intValue()) {
                            while (true) {
                                i25++;
                                if (i25 >= list5.size() || iIntValue2 != (iIntValue = list5.get(i25).intValue())) {
                                    break;
                                }
                                arrayList3.add(Integer.valueOf(iIntValue));
                                i24++;
                            }
                        }
                        i24 += i22;
                    }
                    if (b(arrayList3)) {
                        int i26 = i19;
                        while (i26 < list.size() && (xVar == x.INTRA_SESSION || i26 < i18)) {
                            List<Integer> list6 = list4.get(i26);
                            int i27 = i19;
                            while (i27 < list6.size() - arrayList3.size()) {
                                ArrayList arrayList4 = new ArrayList();
                                int i28 = i19;
                                while (i28 < arrayList3.size()) {
                                    int iIntValue3 = list6.get(i27 + i28).intValue();
                                    boolean z11 = iIntValue3 == ((Integer) arrayList3.get(i28)).intValue();
                                    boolean z12 = i27 == iMax && i26 == i20;
                                    if (!z11 || z12) {
                                        break;
                                    }
                                    arrayList4.add(Integer.valueOf(iIntValue3));
                                    if (arrayList4.size() == arrayList3.size()) {
                                        int i29 = i21 + 1;
                                        ArrayList arrayList5 = new ArrayList();
                                        ArrayList arrayList6 = new ArrayList();
                                        if (xVar == x.INTER_FACETEC_SESSION) {
                                            int i30 = 0;
                                            while (i30 < arrayList3.size()) {
                                                int i31 = iMax + i30;
                                                List<Integer> list7 = list5;
                                                List<Integer> list8 = list6;
                                                int i32 = 0;
                                                int i33 = 0;
                                                while (true) {
                                                    if (i32 >= this.f42980e.size()) {
                                                        i15 = i29;
                                                        i16 = i28;
                                                        i17 = iMax;
                                                        arrayList2 = arrayList3;
                                                        zVar = new z();
                                                        break;
                                                    }
                                                    C0579r c0579r = this.f42980e.get(i32);
                                                    i15 = i29;
                                                    i16 = i28;
                                                    i17 = iMax;
                                                    int i34 = i33;
                                                    int i35 = 0;
                                                    int size = 0;
                                                    while (i35 < c0579r.f42788a.size()) {
                                                        List<Integer> list9 = c0579r.f42788a.get(i35);
                                                        arrayList2 = arrayList3;
                                                        int i36 = i31 + size;
                                                        int i37 = i31;
                                                        if (i34 == i20 && i36 < c0579r.f42791d.size()) {
                                                            zVar = c0579r.f42791d.get(i36);
                                                            break;
                                                        }
                                                        i34++;
                                                        size = list9.size() + size;
                                                        i35++;
                                                        arrayList3 = arrayList2;
                                                        i31 = i37;
                                                    }
                                                    i32++;
                                                    i33 = i34;
                                                    i28 = i16;
                                                    i29 = i15;
                                                    iMax = i17;
                                                }
                                                arrayList5.add(zVar);
                                                i30++;
                                                list5 = list7;
                                                list6 = list8;
                                                i28 = i16;
                                                i29 = i15;
                                                iMax = i17;
                                                arrayList3 = arrayList2;
                                            }
                                            i14 = i29;
                                            list2 = list5;
                                            i12 = i28;
                                            i13 = iMax;
                                            arrayList = arrayList3;
                                            list3 = list6;
                                            for (int i38 = 0; i38 < arrayList4.size(); i38++) {
                                                arrayList6.add(a(i26, i27 + i38));
                                            }
                                            this.f42976a.f42796i.add(new ArrayList(Arrays.asList(arrayList5, arrayList6)));
                                            z10 = true;
                                        } else {
                                            i14 = i29;
                                            list2 = list5;
                                            i12 = i28;
                                            i13 = iMax;
                                            arrayList = arrayList3;
                                            list3 = list6;
                                            int i39 = xVar != x.INTRA_SESSION ? 0 : this.f42981f;
                                            for (int i40 = 0; i40 < arrayList.size(); i40++) {
                                                arrayList5.add(a(i39 + i20, i13 + i40));
                                            }
                                            for (int i41 = 0; i41 < arrayList4.size(); i41++) {
                                                arrayList6.add(a(i39 + i26, i27 + i41));
                                            }
                                            if (xVar == x.INTRA_SESSION) {
                                                z10 = true;
                                                this.f42976a.f42792e.add(new ArrayList(Arrays.asList(arrayList5, arrayList6)));
                                            } else {
                                                z10 = true;
                                                this.f42976a.f42789b.add(new ArrayList(Arrays.asList(arrayList5, arrayList6)));
                                            }
                                        }
                                        i21 = i14;
                                        if (i21 == 5) {
                                            return z10;
                                        }
                                    } else {
                                        list2 = list5;
                                        i12 = i28;
                                        i13 = iMax;
                                        arrayList = arrayList3;
                                        list3 = list6;
                                    }
                                    i28 = i12 + 1;
                                    listAsList = listAsList;
                                    list5 = list2;
                                    list6 = list3;
                                    iMax = i13;
                                    arrayList3 = arrayList;
                                }
                                i27++;
                                listAsList = listAsList;
                                list5 = list5;
                                list6 = list6;
                                iMax = iMax;
                                arrayList3 = arrayList3;
                                i19 = 0;
                            }
                            i26++;
                            list4 = list;
                            i18 = i10;
                            i19 = 0;
                        }
                    }
                    iMax++;
                    list4 = list;
                    i18 = i10;
                    listAsList = listAsList;
                    list5 = list5;
                    i19 = 0;
                    i22 = 1;
                }
            }
            i20++;
            list4 = list;
            i18 = i10;
            listAsList = listAsList;
            i19 = 0;
        }
    }

    private static boolean b(List<Integer> list) {
        return list.size() >= 3 && aa.a(list);
    }
}
