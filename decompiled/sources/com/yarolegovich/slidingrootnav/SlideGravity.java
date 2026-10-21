package com.yarolegovich.slidingrootnav;

import androidx.customview.widget.ViewDragHelper;

/* JADX INFO: loaded from: classes7.dex */
public enum SlideGravity {
    LEFT { // from class: com.yarolegovich.slidingrootnav.SlideGravity.a
        @Override // com.yarolegovich.slidingrootnav.SlideGravity
        public final c a() {
            return new d();
        }
    },
    RIGHT { // from class: com.yarolegovich.slidingrootnav.SlideGravity.b
        @Override // com.yarolegovich.slidingrootnav.SlideGravity
        public final c a() {
            return new e();
        }
    };

    public interface c {
        int a(int i10, int i11);

        int b(float f6, int i10);

        void c(ViewDragHelper viewDragHelper);

        int d(float f6, int i10);

        int e(float f6, int i10);

        float f(int i10, int i11);
    }

    public static class d implements c {
        @Override // com.yarolegovich.slidingrootnav.SlideGravity.c
        public final int a(int i10, int i11) {
            return Math.max(0, Math.min(i10, i11));
        }

        @Override // com.yarolegovich.slidingrootnav.SlideGravity.c
        public final int b(float f6, int i10) {
            if (f6 > 0.0f) {
                return i10;
            }
            return 0;
        }

        @Override // com.yarolegovich.slidingrootnav.SlideGravity.c
        public final void c(ViewDragHelper viewDragHelper) {
            viewDragHelper.setEdgeTrackingEnabled(1);
        }

        @Override // com.yarolegovich.slidingrootnav.SlideGravity.c
        public final int d(float f6, int i10) {
            return (int) (f6 * i10);
        }

        @Override // com.yarolegovich.slidingrootnav.SlideGravity.c
        public final int e(float f6, int i10) {
            if (f6 > 0.5f) {
                return i10;
            }
            return 0;
        }

        @Override // com.yarolegovich.slidingrootnav.SlideGravity.c
        public final float f(int i10, int i11) {
            return i10 / i11;
        }
    }

    public static class e implements c {
        @Override // com.yarolegovich.slidingrootnav.SlideGravity.c
        public final int a(int i10, int i11) {
            return Math.max(-i11, Math.min(i10, 0));
        }

        @Override // com.yarolegovich.slidingrootnav.SlideGravity.c
        public final int b(float f6, int i10) {
            if (f6 > 0.0f) {
                return 0;
            }
            return -i10;
        }

        @Override // com.yarolegovich.slidingrootnav.SlideGravity.c
        public final void c(ViewDragHelper viewDragHelper) {
            viewDragHelper.setEdgeTrackingEnabled(2);
        }

        @Override // com.yarolegovich.slidingrootnav.SlideGravity.c
        public final int d(float f6, int i10) {
            return (int) (-(f6 * i10));
        }

        @Override // com.yarolegovich.slidingrootnav.SlideGravity.c
        public final int e(float f6, int i10) {
            if (f6 > 0.5f) {
                return -i10;
            }
            return 0;
        }

        @Override // com.yarolegovich.slidingrootnav.SlideGravity.c
        public final float f(int i10, int i11) {
            return Math.abs(i10) / i11;
        }
    }

    SlideGravity() {
        throw null;
    }

    public abstract c a();
}
