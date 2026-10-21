package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.collection.LongSparseArray;

/* JADX INFO: loaded from: classes2.dex */
public interface StableIdStorage {

    public static class IsolatedStableIdStorage implements StableIdStorage {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f22882a = 0;

        public class a implements StableIdLookup {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LongSparseArray<Long> f22883a = new LongSparseArray<>();

            public a() {
            }

            @Override // androidx.recyclerview.widget.StableIdStorage.StableIdLookup
            public final long localToGlobal(long j10) {
                LongSparseArray<Long> longSparseArray = this.f22883a;
                Long lValueOf = longSparseArray.get(j10);
                if (lValueOf == null) {
                    IsolatedStableIdStorage isolatedStableIdStorage = IsolatedStableIdStorage.this;
                    long j11 = isolatedStableIdStorage.f22882a;
                    isolatedStableIdStorage.f22882a = 1 + j11;
                    lValueOf = Long.valueOf(j11);
                    longSparseArray.put(j10, lValueOf);
                }
                return lValueOf.longValue();
            }
        }

        @Override // androidx.recyclerview.widget.StableIdStorage
        @NonNull
        public StableIdLookup createStableIdLookup() {
            return new a();
        }
    }

    public static class NoStableIdStorage implements StableIdStorage {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f22885a = new a();

        public class a implements StableIdLookup {
            @Override // androidx.recyclerview.widget.StableIdStorage.StableIdLookup
            public final long localToGlobal(long j10) {
                return -1L;
            }
        }

        @Override // androidx.recyclerview.widget.StableIdStorage
        @NonNull
        public StableIdLookup createStableIdLookup() {
            return this.f22885a;
        }
    }

    public interface StableIdLookup {
        long localToGlobal(long j10);
    }

    @NonNull
    StableIdLookup createStableIdLookup();

    public static class SharedPoolStableIdStorage implements StableIdStorage {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f22886a = new a();

        @Override // androidx.recyclerview.widget.StableIdStorage
        @NonNull
        public StableIdLookup createStableIdLookup() {
            return this.f22886a;
        }

        public class a implements StableIdLookup {
            @Override // androidx.recyclerview.widget.StableIdStorage.StableIdLookup
            public final long localToGlobal(long j10) {
                return j10;
            }
        }
    }
}
