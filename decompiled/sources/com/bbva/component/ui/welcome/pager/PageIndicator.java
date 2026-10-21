package com.bbva.component.ui.welcome.pager;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.Observer;
import com.bbva.cells.component.kit.ui.helper.ContextHelper;
import com.bbva.component.ui.welcome.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PageIndicator.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018B\u001d\b\u0016\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0017\u0010\u001bB%\b\u0016\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001c\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u001dB-\b\u0017\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001c\u001a\u00020\t\u0012\u0006\u0010\u001e\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007R+\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u0005\u0010\u000fR+\u0010\u0014\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u000f¨\u0006 "}, d2 = {"Lcom/bbva/component/ui/welcome/pager/PageIndicator;", "Landroid/widget/LinearLayout;", "Lcom/bbva/component/ui/welcome/pager/WelcomePagerViewModel;", "viewModel", "", "setNumPages", "initialize$component_ui_welcome_release", "(Lcom/bbva/component/ui/welcome/pager/WelcomePagerViewModel;)V", "initialize", "", "<set-?>", "p0", "Lkotlin/properties/ReadWriteProperty;", "getNumPages", "()I", "(I)V", "numPages", "q0", "getSelectedPage", "setSelectedPage", "selectedPage", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "component-ui-welcome_release"}, k = 1, mv = {1, 4, 0})
public final class PageIndicator extends LinearLayout {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f28811r0 = {androidx.camera.core.impl.utils.c.e(PageIndicator.class, "numPages", "getNumPages()I", 0), androidx.camera.core.impl.utils.c.e(PageIndicator.class, "selectedPage", "getSelectedPage()I", 0)};

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final ObservableProperty f28812p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final ObservableProperty f28813q0;

    /* JADX INFO: compiled from: PageIndicator.kt */
    public static final class a<T> implements Observer<List<? extends Page>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ WelcomePagerViewModel f28831b;

        public a(WelcomePagerViewModel welcomePagerViewModel) {
            this.f28831b = welcomePagerViewModel;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(List<? extends Page> list) {
            PageIndicator.this.setNumPages(this.f28831b);
        }
    }

    /* JADX INFO: compiled from: PageIndicator.kt */
    public static final class b<T> implements Observer<List<? extends Mode>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ WelcomePagerViewModel f28833b;

        public b(WelcomePagerViewModel welcomePagerViewModel) {
            this.f28833b = welcomePagerViewModel;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(List<? extends Mode> list) {
            PageIndicator.this.setNumPages(this.f28833b);
        }
    }

    /* JADX INFO: compiled from: PageIndicator.kt */
    public static final class c<T> implements Observer<String> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ WelcomePagerViewModel f28835b;

        public c(WelcomePagerViewModel welcomePagerViewModel) {
            this.f28835b = welcomePagerViewModel;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(String str) {
            PageIndicator.this.setNumPages(this.f28835b);
        }
    }

    public PageIndicator(@Nullable Context context) {
        super(context);
        Delegates delegates = Delegates.INSTANCE;
        final int i10 = 0;
        this.f28812p0 = new ObservableProperty<Integer>(i10) { // from class: com.bbva.component.ui.welcome.pager.PageIndicator$$special$$inlined$observable$1
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(@NotNull KProperty<?> property, Integer oldValue, Integer newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                newValue.intValue();
                oldValue.intValue();
                PageIndicator.access$setupPageIndicators(this);
            }
        };
        this.f28813q0 = new ObservableProperty<Integer>(i10) { // from class: com.bbva.component.ui.welcome.pager.PageIndicator$$special$$inlined$observable$2
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(@NotNull KProperty<?> property, Integer oldValue, Integer newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                newValue.intValue();
                oldValue.intValue();
                PageIndicator.access$enableSelectedPage(this);
            }
        };
        setOrientation(0);
        setGravity(1);
    }

    public static final void access$enableSelectedPage(PageIndicator pageIndicator) {
        pageIndicator.getClass();
        c6.a aVar = new c6.a(pageIndicator);
        int childCount = pageIndicator.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            Integer numValueOf = Integer.valueOf(i10);
            View childAt = pageIndicator.getChildAt(i10);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(index)");
            aVar.invoke(numValueOf, childAt);
        }
    }

    public static final void access$setupPageIndicators(PageIndicator pageIndicator) {
        pageIndicator.removeAllViews();
        int numPages = pageIndicator.getNumPages();
        for (int i10 = 0; i10 < numPages; i10++) {
            View.inflate(pageIndicator.getContext(), R.layout.layout_page_indicator, pageIndicator);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getNumPages() {
        return ((Number) this.f28812p0.getValue(this, f28811r0[0])).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getSelectedPage() {
        return ((Number) this.f28813q0.getValue(this, f28811r0[1])).intValue();
    }

    public final void initialize$component_ui_welcome_release(@NotNull WelcomePagerViewModel viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        viewModel.getPageList$component_ui_welcome_release().observe(ContextHelper.getOwner(getContext()), new a(viewModel));
        viewModel.getModeList$component_ui_welcome_release().observe(ContextHelper.getOwner(getContext()), new b(viewModel));
        viewModel.getCurrentMode$component_ui_welcome_release().observe(ContextHelper.getOwner(getContext()), new c(viewModel));
    }

    public final void setNumPages(int i10) {
        this.f28812p0.setValue(this, f28811r0[0], Integer.valueOf(i10));
    }

    public final void setSelectedPage(int i10) {
        this.f28813q0.setValue(this, f28811r0[1], Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setNumPages(WelcomePagerViewModel viewModel) {
        if (getNumPages() == 0) {
            setNumPages(viewModel.pagesToShow$component_ui_welcome_release().size());
        }
    }

    public PageIndicator(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Delegates delegates = Delegates.INSTANCE;
        final int i10 = 0;
        this.f28812p0 = new ObservableProperty<Integer>(i10) { // from class: com.bbva.component.ui.welcome.pager.PageIndicator$$special$$inlined$observable$3
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(@NotNull KProperty<?> property, Integer oldValue, Integer newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                newValue.intValue();
                oldValue.intValue();
                PageIndicator.access$setupPageIndicators(this);
            }
        };
        this.f28813q0 = new ObservableProperty<Integer>(i10) { // from class: com.bbva.component.ui.welcome.pager.PageIndicator$$special$$inlined$observable$4
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(@NotNull KProperty<?> property, Integer oldValue, Integer newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                newValue.intValue();
                oldValue.intValue();
                PageIndicator.access$enableSelectedPage(this);
            }
        };
        setOrientation(0);
        setGravity(1);
    }

    public PageIndicator(@Nullable Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Delegates delegates = Delegates.INSTANCE;
        final int i11 = 0;
        this.f28812p0 = new ObservableProperty<Integer>(i11) { // from class: com.bbva.component.ui.welcome.pager.PageIndicator$$special$$inlined$observable$5
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(@NotNull KProperty<?> property, Integer oldValue, Integer newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                newValue.intValue();
                oldValue.intValue();
                PageIndicator.access$setupPageIndicators(this);
            }
        };
        this.f28813q0 = new ObservableProperty<Integer>(i11) { // from class: com.bbva.component.ui.welcome.pager.PageIndicator$$special$$inlined$observable$6
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(@NotNull KProperty<?> property, Integer oldValue, Integer newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                newValue.intValue();
                oldValue.intValue();
                PageIndicator.access$enableSelectedPage(this);
            }
        };
        setOrientation(0);
        setGravity(1);
    }

    @TargetApi(21)
    public PageIndicator(@Nullable Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        Delegates delegates = Delegates.INSTANCE;
        final int i12 = 0;
        this.f28812p0 = new ObservableProperty<Integer>(i12) { // from class: com.bbva.component.ui.welcome.pager.PageIndicator$$special$$inlined$observable$7
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(@NotNull KProperty<?> property, Integer oldValue, Integer newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                newValue.intValue();
                oldValue.intValue();
                PageIndicator.access$setupPageIndicators(this);
            }
        };
        this.f28813q0 = new ObservableProperty<Integer>(i12) { // from class: com.bbva.component.ui.welcome.pager.PageIndicator$$special$$inlined$observable$8
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(@NotNull KProperty<?> property, Integer oldValue, Integer newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                newValue.intValue();
                oldValue.intValue();
                PageIndicator.access$enableSelectedPage(this);
            }
        };
        setOrientation(0);
        setGravity(1);
    }
}
