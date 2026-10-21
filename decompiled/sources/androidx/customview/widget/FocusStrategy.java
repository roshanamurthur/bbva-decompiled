package androidx.customview.widget;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class FocusStrategy {

    public interface BoundsAdapter<T> {
        void obtainBounds(T t10, Rect rect);
    }

    public interface CollectionAdapter<T, V> {
        V get(T t10, int i10);

        int size(T t10);
    }

    public static class a<T> implements Comparator<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Rect f20488p0 = new Rect();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Rect f20489q0 = new Rect();

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final boolean f20490r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final BoundsAdapter<T> f20491s0;

        public a(boolean z10, ExploreByTouchHelper.a aVar) {
            this.f20490r0 = z10;
            this.f20491s0 = aVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            BoundsAdapter<T> boundsAdapter = this.f20491s0;
            Rect rect = this.f20488p0;
            boundsAdapter.obtainBounds(t10, rect);
            Rect rect2 = this.f20489q0;
            boundsAdapter.obtainBounds(t11, rect2);
            int i10 = rect.top;
            int i11 = rect2.top;
            if (i10 < i11) {
                return -1;
            }
            if (i10 > i11) {
                return 1;
            }
            int i12 = rect.left;
            int i13 = rect2.left;
            boolean z10 = this.f20490r0;
            if (i12 < i13) {
                return z10 ? 1 : -1;
            }
            if (i12 > i13) {
                return z10 ? -1 : 1;
            }
            int i14 = rect.bottom;
            int i15 = rect2.bottom;
            if (i14 < i15) {
                return -1;
            }
            if (i14 > i15) {
                return 1;
            }
            int i16 = rect.right;
            int i17 = rect2.right;
            if (i16 < i17) {
                return z10 ? 1 : -1;
            }
            if (i16 > i17) {
                return z10 ? -1 : 1;
            }
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:29:0x004e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0052 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    public static boolean a(int i10, @NonNull Rect rect, @NonNull Rect rect2, @NonNull Rect rect3) {
        int iD;
        int i11;
        int i12;
        boolean zB = b(i10, rect, rect2);
        if (b(i10, rect, rect3) || !zB) {
            return false;
        }
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    if (rect.bottom <= rect3.top) {
                        if (i10 != 17 && i10 != 66) {
                            iD = d(i10, rect, rect2);
                            if (i10 != 17) {
                                i11 = rect.left;
                                i12 = rect3.left;
                            } else if (i10 != 33) {
                                i11 = rect.top;
                                i12 = rect3.top;
                            } else if (i10 != 66) {
                                i11 = rect3.right;
                                i12 = rect.right;
                            } else {
                                if (i10 == 130) {
                                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                }
                                i11 = rect3.bottom;
                                i12 = rect.bottom;
                            }
                            if (iD < Math.max(1, i11 - i12)) {
                                return true;
                            }
                            return false;
                        }
                    }
                } else if (rect.right <= rect3.left) {
                    if (i10 != 17) {
                        iD = d(i10, rect, rect2);
                        if (i10 != 17) {
                            i11 = rect.left;
                            i12 = rect3.left;
                        } else if (i10 != 33) {
                            i11 = rect.top;
                            i12 = rect3.top;
                        } else if (i10 != 66) {
                            i11 = rect3.right;
                            i12 = rect.right;
                        } else {
                            if (i10 == 130) {
                                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            }
                            i11 = rect3.bottom;
                            i12 = rect.bottom;
                        }
                        if (iD < Math.max(1, i11 - i12)) {
                            return true;
                        }
                        return false;
                    }
                }
            } else if (rect.top >= rect3.bottom) {
                if (i10 != 17) {
                    iD = d(i10, rect, rect2);
                    if (i10 != 17) {
                        i11 = rect.left;
                        i12 = rect3.left;
                    } else if (i10 != 33) {
                        i11 = rect.top;
                        i12 = rect3.top;
                    } else if (i10 != 66) {
                        i11 = rect3.right;
                        i12 = rect.right;
                    } else {
                        if (i10 == 130) {
                            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        }
                        i11 = rect3.bottom;
                        i12 = rect.bottom;
                    }
                    if (iD < Math.max(1, i11 - i12)) {
                        return true;
                    }
                    return false;
                }
            }
        } else if (rect.left >= rect3.right) {
            if (i10 != 17) {
                iD = d(i10, rect, rect2);
                if (i10 != 17) {
                    i11 = rect.left;
                    i12 = rect3.left;
                } else if (i10 != 33) {
                    i11 = rect.top;
                    i12 = rect3.top;
                } else if (i10 != 66) {
                    i11 = rect3.right;
                    i12 = rect.right;
                } else {
                    if (i10 == 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    i11 = rect3.bottom;
                    i12 = rect.bottom;
                }
                if (iD < Math.max(1, i11 - i12)) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    public static boolean b(int i10, @NonNull Rect rect, @NonNull Rect rect2) {
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static boolean c(int i10, @NonNull Rect rect, @NonNull Rect rect2) {
        if (i10 == 17) {
            int i11 = rect.right;
            int i12 = rect2.right;
            return (i11 > i12 || rect.left >= i12) && rect.left > rect2.left;
        }
        if (i10 == 33) {
            int i13 = rect.bottom;
            int i14 = rect2.bottom;
            return (i13 > i14 || rect.top >= i14) && rect.top > rect2.top;
        }
        if (i10 == 66) {
            int i15 = rect.left;
            int i16 = rect2.left;
            return (i15 < i16 || rect.right <= i16) && rect.right < rect2.right;
        }
        if (i10 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i17 = rect.top;
        int i18 = rect2.top;
        return (i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom;
    }

    public static int d(int i10, @NonNull Rect rect, @NonNull Rect rect2) {
        int i11;
        int i12;
        if (i10 == 17) {
            i11 = rect.left;
            i12 = rect2.right;
        } else if (i10 == 33) {
            i11 = rect.top;
            i12 = rect2.bottom;
        } else if (i10 == 66) {
            i11 = rect2.left;
            i12 = rect.right;
        } else {
            if (i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i11 = rect2.top;
            i12 = rect.bottom;
        }
        return Math.max(0, i11 - i12);
    }

    public static int e(int i10, @NonNull Rect rect, @NonNull Rect rect2) {
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }
}
