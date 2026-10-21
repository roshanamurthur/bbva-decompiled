package androidx.recyclerview.widget;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.camera2.internal.n1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class DiffUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f22614a = new a();

    public static abstract class Callback {
        public abstract boolean areContentsTheSame(int i10, int i11);

        public abstract boolean areItemsTheSame(int i10, int i11);

        @Nullable
        public Object getChangePayload(int i10, int i11) {
            return null;
        }

        public abstract int getNewListSize();

        public abstract int getOldListSize();
    }

    public static class DiffResult {
        public static final int NO_POSITION = -1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<b> f22615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f22616b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f22617c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Callback f22618d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f22619e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f22620f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f22621g;

        public DiffResult(Callback callback, ArrayList arrayList, int[] iArr, int[] iArr2, boolean z10) {
            int[] iArr3;
            int[] iArr4;
            Callback callback2;
            int i10;
            int i11;
            this.f22615a = arrayList;
            this.f22616b = iArr;
            this.f22617c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f22618d = callback;
            int oldListSize = callback.getOldListSize();
            this.f22619e = oldListSize;
            int newListSize = callback.getNewListSize();
            this.f22620f = newListSize;
            this.f22621g = z10;
            b bVar = arrayList.isEmpty() ? null : (b) arrayList.get(0);
            if (bVar == null || bVar.f22622a != 0 || bVar.f22623b != 0) {
                arrayList.add(0, new b(0, 0, 0));
            }
            arrayList.add(new b(oldListSize, newListSize, 0));
            Iterator it = arrayList.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                iArr3 = this.f22617c;
                iArr4 = this.f22616b;
                callback2 = this.f22618d;
                if (!zHasNext) {
                    break;
                }
                b bVar2 = (b) it.next();
                for (int i12 = 0; i12 < bVar2.f22624c; i12++) {
                    int i13 = bVar2.f22622a + i12;
                    int i14 = bVar2.f22623b + i12;
                    int i15 = callback2.areContentsTheSame(i13, i14) ? 1 : 2;
                    iArr4[i13] = (i14 << 4) | i15;
                    iArr3[i14] = (i13 << 4) | i15;
                }
            }
            if (this.f22621g) {
                Iterator it2 = arrayList.iterator();
                int i16 = 0;
                while (it2.hasNext()) {
                    b bVar3 = (b) it2.next();
                    while (true) {
                        i10 = bVar3.f22622a;
                        if (i16 < i10) {
                            if (iArr4[i16] == 0) {
                                int size = arrayList.size();
                                int i17 = 0;
                                for (int i18 = 0; i18 < size; i18++) {
                                    b bVar4 = (b) arrayList.get(i18);
                                    while (true) {
                                        i11 = bVar4.f22623b;
                                        if (i17 < i11) {
                                            if (iArr3[i17] == 0 && callback2.areItemsTheSame(i16, i17)) {
                                                int i19 = callback2.areContentsTheSame(i16, i17) ? 8 : 4;
                                                iArr4[i16] = (i17 << 4) | i19;
                                                iArr3[i17] = i19 | (i16 << 4);
                                                break;
                                            }
                                            i17++;
                                        }
                                    }
                                    i17 = bVar4.f22624c + i11;
                                }
                            }
                            i16++;
                        }
                    }
                    i16 = bVar3.f22624c + i10;
                }
            }
        }

        @Nullable
        public static c a(ArrayDeque arrayDeque, int i10, boolean z10) {
            c cVar;
            Iterator it = arrayDeque.iterator();
            while (true) {
                if (!it.hasNext()) {
                    cVar = null;
                    break;
                }
                cVar = (c) it.next();
                if (cVar.f22625a == i10 && cVar.f22627c == z10) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                c cVar2 = (c) it.next();
                if (z10) {
                    cVar2.f22626b--;
                } else {
                    cVar2.f22626b++;
                }
            }
            return cVar;
        }

        public int convertNewPositionToOld(@IntRange(from = 0) int i10) {
            int i11 = this.f22620f;
            if (i10 < 0 || i10 >= i11) {
                throw new IndexOutOfBoundsException(n1.e("Index out of bounds - passed position = ", i10, ", new list size = ", i11));
            }
            int i12 = this.f22617c[i10];
            if ((i12 & 15) == 0) {
                return -1;
            }
            return i12 >> 4;
        }

        public int convertOldPositionToNew(@IntRange(from = 0) int i10) {
            int i11 = this.f22619e;
            if (i10 < 0 || i10 >= i11) {
                throw new IndexOutOfBoundsException(n1.e("Index out of bounds - passed position = ", i10, ", old list size = ", i11));
            }
            int i12 = this.f22616b[i10];
            if ((i12 & 15) == 0) {
                return -1;
            }
            return i12 >> 4;
        }

        public void dispatchUpdatesTo(@NonNull RecyclerView.Adapter adapter) {
            dispatchUpdatesTo(new AdapterListUpdateCallback(adapter));
        }

        public void dispatchUpdatesTo(@NonNull ListUpdateCallback listUpdateCallback) {
            int[] iArr;
            Callback callback;
            int i10;
            int i11;
            List<b> list;
            int i12;
            DiffResult diffResult = this;
            BatchingListUpdateCallback batchingListUpdateCallback = listUpdateCallback instanceof BatchingListUpdateCallback ? (BatchingListUpdateCallback) listUpdateCallback : new BatchingListUpdateCallback(listUpdateCallback);
            ArrayDeque arrayDeque = new ArrayDeque();
            List<b> list2 = diffResult.f22615a;
            int size = list2.size() - 1;
            int i13 = diffResult.f22619e;
            int i14 = diffResult.f22620f;
            int i15 = i13;
            while (size >= 0) {
                b bVar = list2.get(size);
                int i16 = bVar.f22622a;
                int i17 = bVar.f22624c;
                int i18 = i16 + i17;
                int i19 = bVar.f22623b;
                int i20 = i19 + i17;
                while (true) {
                    iArr = diffResult.f22616b;
                    callback = diffResult.f22618d;
                    i10 = 0;
                    if (i15 <= i18) {
                        break;
                    }
                    i15--;
                    int i21 = iArr[i15];
                    if ((i21 & 12) != 0) {
                        list = list2;
                        int i22 = i21 >> 4;
                        c cVarA = a(arrayDeque, i22, false);
                        if (cVarA != null) {
                            i12 = i14;
                            int i23 = (i13 - cVarA.f22626b) - 1;
                            batchingListUpdateCallback.onMoved(i15, i23);
                            if ((i21 & 4) != 0) {
                                batchingListUpdateCallback.onChanged(i23, 1, callback.getChangePayload(i15, i22));
                            }
                        } else {
                            i12 = i14;
                            arrayDeque.add(new c(i15, (i13 - i15) - 1, true));
                        }
                    } else {
                        list = list2;
                        i12 = i14;
                        batchingListUpdateCallback.onRemoved(i15, 1);
                        i13--;
                    }
                    list2 = list;
                    i14 = i12;
                }
                List<b> list3 = list2;
                while (i14 > i20) {
                    i14--;
                    int i24 = diffResult.f22617c[i14];
                    if ((i24 & 12) != 0) {
                        int i25 = i24 >> 4;
                        c cVarA2 = a(arrayDeque, i25, true);
                        if (cVarA2 == null) {
                            arrayDeque.add(new c(i14, i13 - i15, false));
                            i11 = 0;
                        } else {
                            i11 = 0;
                            batchingListUpdateCallback.onMoved((i13 - cVarA2.f22626b) - 1, i15);
                            if ((i24 & 4) != 0) {
                                batchingListUpdateCallback.onChanged(i15, 1, callback.getChangePayload(i25, i14));
                            }
                        }
                    } else {
                        i11 = i10;
                        batchingListUpdateCallback.onInserted(i15, 1);
                        i13++;
                    }
                    diffResult = this;
                    i10 = i11;
                }
                i15 = bVar.f22622a;
                int i26 = i15;
                int i27 = i19;
                while (i10 < i17) {
                    if ((iArr[i26] & 15) == 2) {
                        batchingListUpdateCallback.onChanged(i26, 1, callback.getChangePayload(i26, i27));
                    }
                    i26++;
                    i27++;
                    i10++;
                }
                size--;
                diffResult = this;
                i14 = i19;
                list2 = list3;
            }
            batchingListUpdateCallback.dispatchLastEvent();
        }
    }

    public static abstract class ItemCallback<T> {
        public abstract boolean areContentsTheSame(@NonNull T t10, @NonNull T t11);

        public abstract boolean areItemsTheSame(@NonNull T t10, @NonNull T t11);

        @Nullable
        public Object getChangePayload(@NonNull T t10, @NonNull T t11) {
            return null;
        }
    }

    public class a implements Comparator<b> {
        @Override // java.util.Comparator
        public final int compare(b bVar, b bVar2) {
            return bVar.f22622a - bVar2.f22622a;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f22622a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f22623b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f22624c;

        public b(int i10, int i11, int i12) {
            this.f22622a = i10;
            this.f22623b = i11;
            this.f22624c = i12;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f22625a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f22626b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f22627c;

        public c(int i10, int i11, boolean z10) {
            this.f22625a = i10;
            this.f22626b = i11;
            this.f22627c = z10;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f22628a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f22629b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f22630c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f22631d;

        public final int a() {
            return this.f22631d - this.f22630c;
        }

        public final int b() {
            return this.f22629b - this.f22628a;
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f22632a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f22633b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f22634c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f22635d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f22636e;

        public final int a() {
            return Math.min(this.f22634c - this.f22632a, this.f22635d - this.f22633b);
        }
    }

    @NonNull
    public static DiffResult calculateDiff(@NonNull Callback callback) {
        return calculateDiff(callback, true);
    }

    @NonNull
    public static DiffResult calculateDiff(@NonNull Callback callback, boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        d dVar;
        e eVar;
        ArrayList arrayList3;
        ArrayList arrayList4;
        d dVar2;
        b bVar;
        int i10;
        int i11;
        e eVar2;
        e eVar3;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int oldListSize = callback.getOldListSize();
        int newListSize = callback.getNewListSize();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        d dVar3 = new d();
        int i18 = 0;
        dVar3.f22628a = 0;
        dVar3.f22629b = oldListSize;
        dVar3.f22630c = 0;
        dVar3.f22631d = newListSize;
        arrayList6.add(dVar3);
        int i19 = oldListSize + newListSize;
        int i20 = 1;
        int i21 = (((i19 + 1) / 2) * 2) + 1;
        int[] iArr = new int[i21];
        int i22 = i21 / 2;
        int[] iArr2 = new int[i21];
        ArrayList arrayList7 = new ArrayList();
        while (!arrayList6.isEmpty()) {
            d dVar4 = (d) arrayList6.remove(arrayList6.size() - i20);
            if (dVar4.b() >= i20 && dVar4.a() >= i20) {
                int iA = ((dVar4.a() + dVar4.b()) + i20) / 2;
                int i23 = i20 + i22;
                iArr[i23] = dVar4.f22628a;
                iArr2[i23] = dVar4.f22629b;
                int i24 = i18;
                while (true) {
                    if (i24 >= iA) {
                        arrayList = arrayList7;
                        arrayList2 = arrayList6;
                        dVar = dVar4;
                        eVar = null;
                        break;
                    }
                    int i25 = Math.abs(dVar4.b() - dVar4.a()) % 2 == i20 ? i20 : i18;
                    int iB = dVar4.b() - dVar4.a();
                    int i26 = -i24;
                    int i27 = i26;
                    while (true) {
                        if (i27 > i24) {
                            arrayList = arrayList7;
                            arrayList2 = arrayList6;
                            i10 = i18;
                            i11 = iA;
                            eVar2 = null;
                            break;
                        }
                        if (i27 == i26 || (i27 != i24 && iArr[i27 + 1 + i22] > iArr[(i27 - 1) + i22])) {
                            i15 = iArr[i27 + 1 + i22];
                            i16 = i15;
                        } else {
                            i15 = iArr[(i27 - 1) + i22];
                            i16 = i15 + 1;
                        }
                        i11 = iA;
                        arrayList2 = arrayList6;
                        int i28 = ((i16 - dVar4.f22628a) + dVar4.f22630c) - i27;
                        int i29 = (i24 == 0 || i16 != i15) ? i28 : i28 - 1;
                        arrayList = arrayList7;
                        while (i16 < dVar4.f22629b && i28 < dVar4.f22631d && callback.areItemsTheSame(i16, i28)) {
                            i16++;
                            i28++;
                        }
                        iArr[i27 + i22] = i16;
                        if (i25 != 0) {
                            int i30 = iB - i27;
                            i17 = i25;
                            if (i30 >= i26 + 1 && i30 <= i24 - 1 && iArr2[i30 + i22] <= i16) {
                                eVar2 = new e();
                                eVar2.f22632a = i15;
                                eVar2.f22633b = i29;
                                eVar2.f22634c = i16;
                                eVar2.f22635d = i28;
                                i10 = 0;
                                eVar2.f22636e = false;
                                break;
                            }
                        } else {
                            i17 = i25;
                        }
                        i27 += 2;
                        i18 = 0;
                        iA = i11;
                        arrayList6 = arrayList2;
                        arrayList7 = arrayList;
                        i25 = i17;
                    }
                    if (eVar2 != null) {
                        eVar = eVar2;
                        dVar = dVar4;
                        break;
                    }
                    int i31 = (dVar4.b() - dVar4.a()) % 2 == 0 ? 1 : i10;
                    int iB2 = dVar4.b() - dVar4.a();
                    int i32 = i26;
                    while (true) {
                        if (i32 > i24) {
                            dVar = dVar4;
                            eVar3 = null;
                            break;
                        }
                        if (i32 == i26 || (i32 != i24 && iArr2[i32 + 1 + i22] < iArr2[(i32 - 1) + i22])) {
                            i12 = iArr2[i32 + 1 + i22];
                            i13 = i12;
                        } else {
                            i12 = iArr2[(i32 - 1) + i22];
                            i13 = i12 - 1;
                        }
                        int i33 = dVar4.f22631d - ((dVar4.f22629b - i13) - i32);
                        int i34 = (i24 == 0 || i13 != i12) ? i33 : i33 + 1;
                        while (true) {
                            if (i13 > dVar4.f22628a && i33 > dVar4.f22630c) {
                                dVar = dVar4;
                                if (!callback.areItemsTheSame(i13 - 1, i33 - 1)) {
                                    break;
                                }
                                i13--;
                                i33--;
                                dVar4 = dVar;
                            } else {
                                dVar = dVar4;
                                break;
                            }
                        }
                        iArr2[i32 + i22] = i13;
                        if (i31 != 0 && (i14 = iB2 - i32) >= i26 && i14 <= i24 && iArr[i14 + i22] >= i13) {
                            eVar3 = new e();
                            eVar3.f22632a = i13;
                            eVar3.f22633b = i33;
                            eVar3.f22634c = i12;
                            eVar3.f22635d = i34;
                            eVar3.f22636e = true;
                            break;
                        }
                        i32 += 2;
                        dVar4 = dVar;
                    }
                    if (eVar3 != null) {
                        eVar = eVar3;
                        break;
                    }
                    i24++;
                    iA = i11;
                    arrayList6 = arrayList2;
                    arrayList7 = arrayList;
                    dVar4 = dVar;
                    i20 = 1;
                    i18 = 0;
                }
            } else {
                arrayList = arrayList7;
                arrayList2 = arrayList6;
                dVar = dVar4;
                eVar = null;
                break;
            }
            if (eVar != null) {
                if (eVar.a() > 0) {
                    int i35 = eVar.f22635d;
                    int i36 = eVar.f22633b;
                    int i37 = i35 - i36;
                    int i38 = eVar.f22634c;
                    int i39 = eVar.f22632a;
                    int i40 = i38 - i39;
                    if (i37 == i40) {
                        bVar = new b(i39, i36, i40);
                    } else if (eVar.f22636e) {
                        bVar = new b(i39, i36, eVar.a());
                    } else {
                        bVar = i37 > i40 ? new b(i39, i36 + 1, eVar.a()) : new b(i39 + 1, i36, eVar.a());
                    }
                    arrayList5.add(bVar);
                }
                if (arrayList.isEmpty()) {
                    dVar2 = new d();
                    arrayList4 = arrayList;
                    i20 = 1;
                } else {
                    i20 = 1;
                    arrayList4 = arrayList;
                    dVar2 = (d) arrayList4.remove(arrayList.size() - 1);
                }
                dVar2.f22628a = dVar.f22628a;
                dVar2.f22630c = dVar.f22630c;
                dVar2.f22629b = eVar.f22632a;
                dVar2.f22631d = eVar.f22633b;
                arrayList3 = arrayList2;
                arrayList3.add(dVar2);
                dVar.f22629b = dVar.f22629b;
                dVar.f22631d = dVar.f22631d;
                dVar.f22628a = eVar.f22634c;
                dVar.f22630c = eVar.f22635d;
                arrayList3.add(dVar);
            } else {
                arrayList3 = arrayList2;
                arrayList4 = arrayList;
                i20 = 1;
                arrayList4.add(dVar);
            }
            arrayList7 = arrayList4;
            arrayList6 = arrayList3;
            i18 = 0;
        }
        Collections.sort(arrayList5, f22614a);
        return new DiffResult(callback, arrayList5, iArr, iArr2, z10);
    }
}
