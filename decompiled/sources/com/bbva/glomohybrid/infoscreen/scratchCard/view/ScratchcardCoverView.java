package com.bbva.glomohybrid.infoscreen.scratchCard.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bbva.glomohybrid.base.activityConfigurators.ScratchcardConfiguration;
import com.bbva.glomohybrid.infoscreen.R;
import com.bbva.glomohybrid.infoscreen.databinding.ScratchcardCoverBinding;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ScratchcardCoverView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\u000e"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/scratchCard/view/ScratchcardCoverView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/bbva/glomohybrid/base/activityConfigurators/ScratchcardConfiguration;", "config", "", "setupViews", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class ScratchcardCoverView extends ConstraintLayout {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final ScratchcardCoverBinding f32475p0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ScratchcardCoverView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setupViews(@Nullable ScratchcardConfiguration config) {
        ScratchcardCoverBinding scratchcardCoverBinding = this.f32475p0;
        scratchcardCoverBinding.titleScreenLabel.setText(config != null ? config.getTitleScreen() : null);
        scratchcardCoverBinding.screenImage.setImageResource(R.drawable.lean_operations);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ScratchcardCoverView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ScratchcardCoverView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ScratchcardCoverView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        ScratchcardCoverBinding scratchcardCoverBindingInflate = ScratchcardCoverBinding.inflate(LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(scratchcardCoverBindingInflate, "inflate(...)");
        this.f32475p0 = scratchcardCoverBindingInflate;
    }
}
