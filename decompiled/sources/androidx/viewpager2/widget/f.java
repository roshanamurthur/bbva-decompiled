package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: ScrollEventAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewPager2.OnPageChangeCallback f23997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ViewPager2 f23998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final RecyclerView f23999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayoutManager f24000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24001e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24002f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f24003g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f24004h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f24005i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f24006j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f24007k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f24008l;
    public boolean m;

    /* JADX INFO: compiled from: ScrollEventAdapter.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f24009a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f24010b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f24011c;
    }

    public f(@NonNull ViewPager2 viewPager2) {
        this.f23998b = viewPager2;
        ViewPager2.i iVar = viewPager2.f23968y0;
        this.f23999c = iVar;
        this.f24000d = (LinearLayoutManager) iVar.getLayoutManager();
        this.f24003g = new a();
        c();
    }

    public final void a(int i10) {
        ViewPager2.OnPageChangeCallback onPageChangeCallback = this.f23997a;
        if (onPageChangeCallback != null) {
            onPageChangeCallback.onPageSelected(i10);
        }
    }

    public final void b(int i10) {
        if ((this.f24001e == 3 && this.f24002f == 0) || this.f24002f == i10) {
            return;
        }
        this.f24002f = i10;
        ViewPager2.OnPageChangeCallback onPageChangeCallback = this.f23997a;
        if (onPageChangeCallback != null) {
            onPageChangeCallback.onPageScrollStateChanged(i10);
        }
    }

    public final void c() {
        this.f24001e = 0;
        this.f24002f = 0;
        a aVar = this.f24003g;
        aVar.f24009a = -1;
        aVar.f24010b = 0.0f;
        aVar.f24011c = 0;
        this.f24004h = -1;
        this.f24005i = -1;
        this.f24006j = false;
        this.f24007k = false;
        this.m = false;
        this.f24008l = false;
    }

    public final void d(boolean z10) {
        this.m = z10;
        this.f24001e = z10 ? 4 : 1;
        int i10 = this.f24005i;
        if (i10 != -1) {
            this.f24004h = i10;
            this.f24005i = -1;
        } else if (this.f24004h == -1) {
            this.f24004h = this.f24000d.findFirstVisibleItemPosition();
        }
        b(1);
    }

    /* JADX WARN: Code duplicated, block: B:61:0x011b  */
    /* JADX WARN: Code duplicated, block: B:65:0x0128  */
    /* JADX WARN: Code duplicated, block: B:67:0x0132 A[LOOP:2: B:64:0x0126->B:67:0x0132, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x0135 A[SYNTHETIC] */
    public final void e() {
        int top;
        int childCount;
        int i10;
        int top2;
        int i11;
        int bottom;
        int i12;
        LinearLayoutManager linearLayoutManager = this.f24000d;
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        a aVar = this.f24003g;
        aVar.f24009a = iFindFirstVisibleItemPosition;
        if (iFindFirstVisibleItemPosition == -1) {
            aVar.f24009a = -1;
            aVar.f24010b = 0.0f;
            aVar.f24011c = 0;
            return;
        }
        View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
        if (viewFindViewByPosition == null) {
            aVar.f24009a = -1;
            aVar.f24010b = 0.0f;
            aVar.f24011c = 0;
            return;
        }
        int leftDecorationWidth = linearLayoutManager.getLeftDecorationWidth(viewFindViewByPosition);
        int rightDecorationWidth = linearLayoutManager.getRightDecorationWidth(viewFindViewByPosition);
        int topDecorationHeight = linearLayoutManager.getTopDecorationHeight(viewFindViewByPosition);
        int bottomDecorationHeight = linearLayoutManager.getBottomDecorationHeight(viewFindViewByPosition);
        ViewGroup.LayoutParams layoutParams = viewFindViewByPosition.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            leftDecorationWidth += marginLayoutParams.leftMargin;
            rightDecorationWidth += marginLayoutParams.rightMargin;
            topDecorationHeight += marginLayoutParams.topMargin;
            bottomDecorationHeight += marginLayoutParams.bottomMargin;
        }
        int height = viewFindViewByPosition.getHeight() + topDecorationHeight + bottomDecorationHeight;
        int width = viewFindViewByPosition.getWidth() + leftDecorationWidth + rightDecorationWidth;
        int orientation = linearLayoutManager.getOrientation();
        RecyclerView recyclerView = this.f23999c;
        if (orientation == 0) {
            top = (viewFindViewByPosition.getLeft() - leftDecorationWidth) - recyclerView.getPaddingLeft();
            if (this.f23998b.v0.getLayoutDirection() == 1) {
                top = -top;
            }
            height = width;
        } else {
            top = (viewFindViewByPosition.getTop() - topDecorationHeight) - recyclerView.getPaddingTop();
        }
        int i13 = -top;
        aVar.f24011c = i13;
        if (i13 >= 0) {
            aVar.f24010b = height != 0 ? i13 / height : 0.0f;
            return;
        }
        int childCount2 = linearLayoutManager.getChildCount();
        if (childCount2 != 0) {
            boolean z10 = linearLayoutManager.getOrientation() == 0;
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, childCount2, 2);
            for (int i14 = 0; i14 < childCount2; i14++) {
                View childAt = linearLayoutManager.getChildAt(i14);
                if (childAt == null) {
                    throw new IllegalStateException("null view contained in the view hierarchy");
                }
                ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : b.f23985a;
                int[] iArr2 = iArr[i14];
                if (z10) {
                    top2 = childAt.getLeft();
                    i11 = marginLayoutParams2.leftMargin;
                } else {
                    top2 = childAt.getTop();
                    i11 = marginLayoutParams2.topMargin;
                }
                iArr2[0] = top2 - i11;
                int[] iArr3 = iArr[i14];
                if (z10) {
                    bottom = childAt.getRight();
                    i12 = marginLayoutParams2.rightMargin;
                } else {
                    bottom = childAt.getBottom();
                    i12 = marginLayoutParams2.bottomMargin;
                }
                iArr3[1] = bottom + i12;
            }
            Arrays.sort(iArr, new androidx.viewpager2.widget.a());
            int i15 = 1;
            while (true) {
                if (i15 >= childCount2) {
                    int[] iArr4 = iArr[0];
                    int i16 = iArr4[1];
                    int i17 = iArr4[0];
                    int i18 = i16 - i17;
                    if (i17 <= 0 && iArr[childCount2 - 1][1] >= i18) {
                        if (linearLayoutManager.getChildCount() <= 1) {
                        }
                    }
                } else if (iArr[i15 - 1][1] == iArr[i15][0]) {
                    i15++;
                }
                childCount = linearLayoutManager.getChildCount();
                for (i10 = 0; i10 < childCount; i10++) {
                    if (!b.a(linearLayoutManager.getChildAt(i10))) {
                        throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
                    }
                }
            }
        } else if (linearLayoutManager.getChildCount() <= 1) {
            childCount = linearLayoutManager.getChildCount();
            while (i10 < childCount) {
                if (!b.a(linearLayoutManager.getChildAt(i10))) {
                    throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
                }
            }
        }
        throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(aVar.f24011c)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i10) {
        ViewPager2.OnPageChangeCallback onPageChangeCallback;
        int i11 = this.f24001e;
        boolean z10 = true;
        if (!(i11 == 1 && this.f24002f == 1) && i10 == 1) {
            d(false);
            return;
        }
        if ((i11 == 1 || i11 == 4) && i10 == 2) {
            if (this.f24007k) {
                b(2);
                this.f24006j = true;
                return;
            }
            return;
        }
        if (i11 != 1 && i11 != 4) {
            z10 = false;
        }
        a aVar = this.f24003g;
        if (z10 && i10 == 0) {
            e();
            if (!this.f24007k) {
                int i12 = aVar.f24009a;
                if (i12 != -1 && (onPageChangeCallback = this.f23997a) != null) {
                    onPageChangeCallback.onPageScrolled(i12, 0.0f, 0);
                }
            } else if (aVar.f24011c == 0) {
                int i13 = this.f24004h;
                int i14 = aVar.f24009a;
                if (i13 != i14) {
                    a(i14);
                }
            }
            b(0);
            c();
        }
        if (this.f24001e == 2 && i10 == 0 && this.f24008l) {
            e();
            if (aVar.f24011c == 0) {
                int i15 = this.f24005i;
                int i16 = aVar.f24009a;
                if (i15 != i16) {
                    if (i16 == -1) {
                        i16 = 0;
                    }
                    a(i16);
                }
                b(0);
                c();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:17:0x002c  */
    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(@NonNull RecyclerView recyclerView, int i10, int i11) {
        int i12;
        this.f24007k = true;
        e();
        boolean z10 = this.f24006j;
        a aVar = this.f24003g;
        if (z10) {
            this.f24006j = false;
            if (i11 <= 0) {
                if (i11 == 0) {
                    if ((i10 < 0) == (this.f23998b.v0.getLayoutDirection() == 1)) {
                        if (aVar.f24011c != 0) {
                            i12 = aVar.f24009a + 1;
                        }
                    }
                }
                i12 = aVar.f24009a;
            } else if (aVar.f24011c != 0) {
                i12 = aVar.f24009a + 1;
            } else {
                i12 = aVar.f24009a;
            }
            this.f24005i = i12;
            if (this.f24004h != i12) {
                a(i12);
            }
        } else if (this.f24001e == 0) {
            int i13 = aVar.f24009a;
            if (i13 == -1) {
                i13 = 0;
            }
            a(i13);
        }
        int i14 = aVar.f24009a;
        if (i14 == -1) {
            i14 = 0;
        }
        float f6 = aVar.f24010b;
        int i15 = aVar.f24011c;
        ViewPager2.OnPageChangeCallback onPageChangeCallback = this.f23997a;
        if (onPageChangeCallback != null) {
            onPageChangeCallback.onPageScrolled(i14, f6, i15);
        }
        int i16 = aVar.f24009a;
        int i17 = this.f24005i;
        if ((i16 == i17 || i17 == -1) && aVar.f24011c == 0 && this.f24002f != 1) {
            b(0);
            c();
        }
    }
}
