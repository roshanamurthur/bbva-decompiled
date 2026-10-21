package androidx.recyclerview.widget;

import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.g0;
import androidx.appcompat.widget.o1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface ViewTypeStorage {

    public static class IsolatedViewTypeStorage implements ViewTypeStorage {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SparseArray<s> f22939a = new SparseArray<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f22940b = 0;

        public class a implements ViewTypeLookup {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SparseIntArray f22941a = new SparseIntArray(1);

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final SparseIntArray f22942b = new SparseIntArray(1);

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final s f22943c;

            public a(s sVar) {
                this.f22943c = sVar;
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public final void dispose() {
                SparseArray<s> sparseArray = IsolatedViewTypeStorage.this.f22939a;
                for (int size = sparseArray.size() - 1; size >= 0; size--) {
                    if (sparseArray.valueAt(size) == this.f22943c) {
                        sparseArray.removeAt(size);
                    }
                }
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public final int globalToLocal(int i10) {
                SparseIntArray sparseIntArray = this.f22942b;
                int iIndexOfKey = sparseIntArray.indexOfKey(i10);
                if (iIndexOfKey >= 0) {
                    return sparseIntArray.valueAt(iIndexOfKey);
                }
                StringBuilder sbC = o1.c("requested global type ", i10, " does not belong to the adapter:");
                sbC.append(this.f22943c.f23080c);
                throw new IllegalStateException(sbC.toString());
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public final int localToGlobal(int i10) {
                SparseIntArray sparseIntArray = this.f22941a;
                int iIndexOfKey = sparseIntArray.indexOfKey(i10);
                if (iIndexOfKey > -1) {
                    return sparseIntArray.valueAt(iIndexOfKey);
                }
                IsolatedViewTypeStorage isolatedViewTypeStorage = IsolatedViewTypeStorage.this;
                int i11 = isolatedViewTypeStorage.f22940b;
                isolatedViewTypeStorage.f22940b = i11 + 1;
                isolatedViewTypeStorage.f22939a.put(i11, this.f22943c);
                sparseIntArray.put(i10, i11);
                this.f22942b.put(i11, i10);
                return i11;
            }
        }

        @Override // androidx.recyclerview.widget.ViewTypeStorage
        @NonNull
        public ViewTypeLookup createViewTypeWrapper(@NonNull s sVar) {
            return new a(sVar);
        }

        @Override // androidx.recyclerview.widget.ViewTypeStorage
        @NonNull
        public s getWrapperForGlobalType(int i10) {
            s sVar = this.f22939a.get(i10);
            if (sVar != null) {
                return sVar;
            }
            throw new IllegalArgumentException(g0.c("Cannot find the wrapper for global view type ", i10));
        }
    }

    public interface ViewTypeLookup {
        void dispose();

        int globalToLocal(int i10);

        int localToGlobal(int i10);
    }

    @NonNull
    ViewTypeLookup createViewTypeWrapper(@NonNull s sVar);

    @NonNull
    s getWrapperForGlobalType(int i10);

    public static class SharedIdRangeViewTypeStorage implements ViewTypeStorage {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SparseArray<List<s>> f22945a = new SparseArray<>();

        @Override // androidx.recyclerview.widget.ViewTypeStorage
        @NonNull
        public ViewTypeLookup createViewTypeWrapper(@NonNull s sVar) {
            return new a(sVar);
        }

        @Override // androidx.recyclerview.widget.ViewTypeStorage
        @NonNull
        public s getWrapperForGlobalType(int i10) {
            List<s> list = this.f22945a.get(i10);
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException(g0.c("Cannot find the wrapper for global view type ", i10));
            }
            return list.get(0);
        }

        public class a implements ViewTypeLookup {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final s f22946a;

            public a(s sVar) {
                this.f22946a = sVar;
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public final void dispose() {
                SparseArray<List<s>> sparseArray = SharedIdRangeViewTypeStorage.this.f22945a;
                for (int size = sparseArray.size() - 1; size >= 0; size--) {
                    List<s> listValueAt = sparseArray.valueAt(size);
                    if (listValueAt.remove(this.f22946a) && listValueAt.isEmpty()) {
                        sparseArray.removeAt(size);
                    }
                }
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public final int localToGlobal(int i10) {
                SharedIdRangeViewTypeStorage sharedIdRangeViewTypeStorage = SharedIdRangeViewTypeStorage.this;
                List<s> arrayList = sharedIdRangeViewTypeStorage.f22945a.get(i10);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    sharedIdRangeViewTypeStorage.f22945a.put(i10, arrayList);
                }
                s sVar = this.f22946a;
                if (!arrayList.contains(sVar)) {
                    arrayList.add(sVar);
                }
                return i10;
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public final int globalToLocal(int i10) {
                return i10;
            }
        }
    }
}
