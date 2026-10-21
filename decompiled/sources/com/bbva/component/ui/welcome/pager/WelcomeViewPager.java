package com.bbva.component.ui.welcome.pager;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WelcomeViewPager.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!B\u001b\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b \u0010$J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u000f\u0010\u0012\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0010\u0010\u0011R?\u0010\u001d\u001a\u001f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006%"}, d2 = {"Lcom/bbva/component/ui/welcome/pager/WelcomeViewPager;", "Landroidx/viewpager/widget/ViewPager;", "Lcom/bbva/component/ui/welcome/pager/WelcomePagerViewModel;", "viewModel", "", "setupPagerAdapter", "initialize$component_ui_welcome_release", "(Lcom/bbva/component/ui/welcome/pager/WelcomePagerViewModel;)V", "initialize", "Landroidx/viewpager/widget/PagerAdapter;", "getAdapter", "", AnalyticsConstants.Key.ITEM, "", "smoothScroll", "setCurrentItem", "moveToNextItem$component_ui_welcome_release", "()V", "moveToNextItem", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "position", "B1", "Lkotlin/jvm/functions/Function1;", "getOnSelectPageListener", "()Lkotlin/jvm/functions/Function1;", "setOnSelectPageListener", "(Lkotlin/jvm/functions/Function1;)V", "onSelectPageListener", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "component-ui-welcome_release"}, k = 1, mv = {1, 4, 0})
public final class WelcomeViewPager extends ViewPager {

    /* JADX INFO: renamed from: B1, reason: from kotlin metadata */
    @Nullable
    public Function1<? super Integer, Unit> onSelectPageListener;
    public int C1;

    /* JADX INFO: compiled from: WelcomeViewPager.kt */
    public static final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            WelcomeViewPager.this.setCurrentItem(1, false);
        }
    }

    /* JADX INFO: compiled from: WelcomeViewPager.kt */
    public static final class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator it) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            Object animatedValue = it.getAnimatedValue();
            if (animatedValue == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
            int iIntValue = ((Integer) animatedValue).intValue();
            WelcomeViewPager welcomeViewPager = WelcomeViewPager.this;
            welcomeViewPager.fakeDragBy(-(iIntValue - welcomeViewPager.getScrollX()));
        }
    }

    /* JADX INFO: compiled from: WelcomeViewPager.kt */
    public static final class c extends Lambda implements Function2<Integer, WelcomePageLayout, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ int f28857p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i10) {
            super(2);
            this.f28857p0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Integer num, WelcomePageLayout welcomePageLayout) {
            num.intValue();
            WelcomePageLayout it = welcomePageLayout;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.getPageIndex() == this.f28857p0) {
                it.onPageVisible();
            } else {
                it.onPageHidden();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomeViewPager(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setupPagerAdapter(WelcomePagerViewModel viewModel) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        setAdapter(new WelcomePagerAdapter(context, viewModel));
    }

    @Override // androidx.viewpager.widget.ViewPager
    @NotNull
    public PagerAdapter getAdapter() {
        PagerAdapter adapter = super.getAdapter();
        Intrinsics.checkNotNull(adapter);
        return adapter;
    }

    @Nullable
    public final Function1<Integer, Unit> getOnSelectPageListener() {
        return this.onSelectPageListener;
    }

    public final void initialize$component_ui_welcome_release(@NotNull WelcomePagerViewModel viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        setupPagerAdapter(viewModel);
        addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.bbva.component.ui.welcome.pager.WelcomeViewPager$setupPageChangeListener$1
            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int state) {
                WelcomeViewPager welcomeViewPager = this.f28859a;
                welcomeViewPager.C1 = state;
                if (state != 0) {
                    return;
                }
                int currentItem = welcomeViewPager.getCurrentItem();
                if (currentItem == 0) {
                    welcomeViewPager.setCurrentItem(welcomeViewPager.getAdapter().getCount() - 2, false);
                } else if (currentItem == welcomeViewPager.getAdapter().getCount() - 1) {
                    welcomeViewPager.setCurrentItem(1, false);
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int position) {
                WelcomeViewPager welcomeViewPager = this.f28859a;
                int count = welcomeViewPager.getAdapter().getCount() - 1;
                int currentItem = welcomeViewPager.getCurrentItem();
                if (1 <= currentItem && count > currentItem) {
                    welcomeViewPager.v(welcomeViewPager.getCurrentItem());
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }
        });
        post(new a());
    }

    public final void moveToNextItem$component_ui_welcome_release() {
        if (this.C1 == 0) {
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            int scrollX = getScrollX();
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(scrollX, measuredWidth + scrollX);
            valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
            valueAnimatorOfInt.setDuration(300L);
            beginFakeDrag();
            valueAnimatorOfInt.addListener(new Animator.AnimatorListener() { // from class: com.bbva.component.ui.welcome.pager.WelcomeViewPager$moveToNextItem$$inlined$apply$lambda$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(@Nullable Animator animation) {
                    this.f28858a.endFakeDrag();
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(@Nullable Animator animation) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(@Nullable Animator animation) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(@Nullable Animator animation) {
                }
            });
            valueAnimatorOfInt.addUpdateListener(new b());
            valueAnimatorOfInt.start();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int item, boolean smoothScroll) {
        super.setCurrentItem(item, smoothScroll);
        v(item);
    }

    public final void setOnSelectPageListener(@Nullable Function1<? super Integer, Unit> function1) {
        this.onSelectPageListener = function1;
    }

    public final void v(int i10) {
        c cVar = new c(i10);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            Integer numValueOf = Integer.valueOf(i11);
            View childAt = getChildAt(i11);
            if (childAt == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.bbva.component.ui.welcome.pager.WelcomePageLayout");
            }
            cVar.invoke(numValueOf, (WelcomePageLayout) childAt);
        }
        Function1<? super Integer, Unit> function1 = this.onSelectPageListener;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(i10 - 1));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomeViewPager(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
