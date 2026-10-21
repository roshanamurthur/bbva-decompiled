package com.bbva.glomohybrid.ui.modals.changeuser.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bbva.cellswidgets.CellsTextView;
import com.bbva.glomohybrid.base.extensions.ViewExtensionsKt;
import com.bbva.glomohybrid.ui.databinding.ChangeUserModalViewBinding;
import com.bbva.glomohybrid.ui.modals.changeuser.adapters.FeaturesListAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InfoView.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006J\u0014\u0010\r\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bJ,\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011¨\u0006\u001b"}, d2 = {"Lcom/bbva/glomohybrid/ui/modals/changeuser/ui/InfoView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "iconId", "", "headerIcon", "", "title", "setHeader", "message", "setMessage", "", "featuresList", "setFeaturesList", "infoIconId", "infoDescription", "infoActionText", "Lkotlin/Function0;", "infoActionLink", "setInfoDetailBox", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "gl-ui_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class InfoView extends ConstraintLayout {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final ChangeUserModalViewBinding f34649p0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public InfoView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void headerIcon(int iconId) {
        this.f34649p0.infoIcon.setImageResource(iconId);
    }

    public final void setFeaturesList(@NotNull List<String> featuresList) {
        Intrinsics.checkNotNullParameter(featuresList, "featuresList");
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        ChangeUserModalViewBinding changeUserModalViewBinding = this.f34649p0;
        changeUserModalViewBinding.featuresList.setLayoutManager(linearLayoutManager);
        changeUserModalViewBinding.featuresList.setAdapter(new FeaturesListAdapter(featuresList));
    }

    public final void setHeader(@Nullable String title) {
        ChangeUserModalViewBinding changeUserModalViewBinding = this.f34649p0;
        CellsTextView infoTitle = changeUserModalViewBinding.infoTitle;
        Intrinsics.checkNotNullExpressionValue(infoTitle, "infoTitle");
        ViewExtensionsKt.show(infoTitle, true ^ (title == null || l.isBlank(title)));
        changeUserModalViewBinding.infoTitle.setText(title);
    }

    public final void setInfoDetailBox(int infoIconId, @NotNull String infoDescription, @NotNull String infoActionText, @NotNull Function0<Unit> infoActionLink) {
        Intrinsics.checkNotNullParameter(infoDescription, "infoDescription");
        Intrinsics.checkNotNullParameter(infoActionText, "infoActionText");
        Intrinsics.checkNotNullParameter(infoActionLink, "infoActionLink");
        InfoDetailBoxView infoDetailBoxView = this.f34649p0.infoBoxView;
        infoDetailBoxView.setVisibility(0);
        infoDetailBoxView.setIcon(infoIconId);
        infoDetailBoxView.setDescription(infoDescription);
        infoDetailBoxView.setActionText(infoActionText);
        infoDetailBoxView.setActionLink(infoActionLink);
    }

    public final void setMessage(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f34649p0.infoDescription.setText(message);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public InfoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ InfoView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public InfoView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        ChangeUserModalViewBinding changeUserModalViewBindingInflate = ChangeUserModalViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(changeUserModalViewBindingInflate, "inflate(...)");
        this.f34649p0 = changeUserModalViewBindingInflate;
    }
}
