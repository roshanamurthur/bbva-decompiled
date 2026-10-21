package com.bbva.glomohybrid.landing.presentation.adapter;

import androidx.recyclerview.widget.DiffUtil;
import com.bbva.glomohybrid.landing.domain.sections.model.LandingSection;
import com.bbva.glomohybrid.landing.presentation.model.LandingHeaderState;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingSectionsDiffCallback.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0018"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/adapter/LandingSectionsDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "", "getOldListSize", "getNewListSize", "oldItemPosition", "newItemPosition", "", "areItemsTheSame", "areContentsTheSame", "", "getChangePayload", "Lcom/bbva/glomohybrid/landing/presentation/adapter/LandingAdapter$HeaderStyle;", "oldHeaderStyle", "newHeaderStyle", "Lcom/bbva/glomohybrid/landing/presentation/model/LandingHeaderState;", "oldHeader", "newHeader", "", "Lcom/bbva/glomohybrid/landing/domain/sections/model/LandingSection;", "oldSections", "newSections", "<init>", "(Lcom/bbva/glomohybrid/landing/presentation/adapter/LandingAdapter$HeaderStyle;Lcom/bbva/glomohybrid/landing/presentation/adapter/LandingAdapter$HeaderStyle;Lcom/bbva/glomohybrid/landing/presentation/model/LandingHeaderState;Lcom/bbva/glomohybrid/landing/presentation/model/LandingHeaderState;Ljava/util/List;Ljava/util/List;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class LandingSectionsDiffCallback extends DiffUtil.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LandingAdapter.HeaderStyle f33009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LandingAdapter.HeaderStyle f33010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final LandingHeaderState f33011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final LandingHeaderState f33012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final List<LandingSection> f33013e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final List<LandingSection> f33014f;

    /* JADX WARN: Multi-variable type inference failed */
    public LandingSectionsDiffCallback(@NotNull LandingAdapter.HeaderStyle oldHeaderStyle, @NotNull LandingAdapter.HeaderStyle newHeaderStyle, @NotNull LandingHeaderState oldHeader, @NotNull LandingHeaderState newHeader, @NotNull List<? extends LandingSection> oldSections, @NotNull List<? extends LandingSection> newSections) {
        Intrinsics.checkNotNullParameter(oldHeaderStyle, "oldHeaderStyle");
        Intrinsics.checkNotNullParameter(newHeaderStyle, "newHeaderStyle");
        Intrinsics.checkNotNullParameter(oldHeader, "oldHeader");
        Intrinsics.checkNotNullParameter(newHeader, "newHeader");
        Intrinsics.checkNotNullParameter(oldSections, "oldSections");
        Intrinsics.checkNotNullParameter(newSections, "newSections");
        this.f33009a = oldHeaderStyle;
        this.f33010b = newHeaderStyle;
        this.f33011c = oldHeader;
        this.f33012d = newHeader;
        this.f33013e = oldSections;
        this.f33014f = newSections;
    }

    public static boolean a(int i10) {
        return i10 == 0;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        if (a(oldItemPosition) && a(newItemPosition)) {
            return Intrinsics.areEqual(this.f33011c, this.f33012d) && this.f33009a == this.f33010b;
        }
        if (a(oldItemPosition) || a(newItemPosition)) {
            return false;
        }
        return Intrinsics.areEqual(this.f33013e.get(oldItemPosition - 1), this.f33014f.get(newItemPosition - 1));
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        if (a(oldItemPosition) && a(newItemPosition)) {
            return true;
        }
        if (a(oldItemPosition) || a(newItemPosition)) {
            return false;
        }
        return Intrinsics.areEqual(this.f33013e.get(oldItemPosition - 1).getId(), this.f33014f.get(newItemPosition - 1).getId());
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    @Nullable
    public Object getChangePayload(int oldItemPosition, int newItemPosition) {
        if (!a(oldItemPosition) || !a(newItemPosition)) {
            return super.getChangePayload(oldItemPosition, newItemPosition);
        }
        LandingAdapter.HeaderStyle headerStyle = LandingAdapter.HeaderStyle.SKELETON;
        LandingItemsAnimator.Animation animation = null;
        LandingAdapter.HeaderStyle headerStyle2 = this.f33010b;
        LandingAdapter.HeaderStyle headerStyle3 = this.f33009a;
        LandingItemsAnimator.Animation animation2 = ((headerStyle3 == headerStyle && headerStyle2 == LandingAdapter.HeaderStyle.SMALL_HEADER) || (headerStyle3 == LandingAdapter.HeaderStyle.LARGE_HEADER && headerStyle2 == LandingAdapter.HeaderStyle.SMALL_HEADER)) ? LandingItemsAnimator.Animation.COLLAPSE : null;
        if (animation2 != null) {
            return animation2;
        }
        LandingAdapter.HeaderStyle headerStyle4 = LandingAdapter.HeaderStyle.SMALL_HEADER;
        if ((headerStyle3 == headerStyle4 && headerStyle2 == LandingAdapter.HeaderStyle.LARGE_HEADER) || (headerStyle3 == headerStyle4 && headerStyle2 == headerStyle)) {
            animation = LandingItemsAnimator.Animation.EXPAND;
        }
        return animation;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public int getNewListSize() {
        return this.f33014f.size() + 1;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public int getOldListSize() {
        return this.f33013e.size() + 1;
    }
}
