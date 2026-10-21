package lh;

/* JADX INFO: compiled from: DataMask.java */
/* JADX INFO: loaded from: classes10.dex */
public enum b {
    DATA_MASK_000 { // from class: lh.b.a
        @Override // lh.b
        public final boolean a(int i10, int i11) {
            return ((i10 + i11) & 1) == 0;
        }
    },
    DATA_MASK_001 { // from class: lh.b.b
        @Override // lh.b
        public final boolean a(int i10, int i11) {
            return (i10 & 1) == 0;
        }
    },
    DATA_MASK_010 { // from class: lh.b.c
        @Override // lh.b
        public final boolean a(int i10, int i11) {
            return i11 % 3 == 0;
        }
    },
    DATA_MASK_011 { // from class: lh.b.d
        @Override // lh.b
        public final boolean a(int i10, int i11) {
            return (i10 + i11) % 3 == 0;
        }
    },
    DATA_MASK_100 { // from class: lh.b.e
        @Override // lh.b
        public final boolean a(int i10, int i11) {
            return (((i11 / 3) + (i10 / 2)) & 1) == 0;
        }
    },
    DATA_MASK_101 { // from class: lh.b.f
        @Override // lh.b
        public final boolean a(int i10, int i11) {
            return (i10 * i11) % 6 == 0;
        }
    },
    DATA_MASK_110 { // from class: lh.b.g
        @Override // lh.b
        public final boolean a(int i10, int i11) {
            return (i10 * i11) % 6 < 3;
        }
    },
    DATA_MASK_111 { // from class: lh.b.h
        @Override // lh.b
        public final boolean a(int i10, int i11) {
            return ((((i10 * i11) % 3) + (i10 + i11)) & 1) == 0;
        }
    };

    b() {
        throw null;
    }

    public abstract boolean a(int i10, int i11);
}
