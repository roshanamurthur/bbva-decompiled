package com.bbva.glomohybrid.ui.modals.changeuser.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.bbva.glomohybrid.ui.databinding.InfoDetailBoxViewBinding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w8.a;

/* JADX INFO: compiled from: InfoDetailBoxView.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006J\u0014\u0010\r\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b¨\u0006\u0015"}, d2 = {"Lcom/bbva/glomohybrid/ui/modals/changeuser/ui/InfoDetailBoxView;", "Landroid/widget/LinearLayout;", "", "iconId", "", "setIcon", "", "infoDescription", "setDescription", "infoActionText", "setActionText", "Lkotlin/Function0;", "infoActionLink", "setActionLink", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "gl-ui_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class InfoDetailBoxView extends LinearLayout {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final /* synthetic */ int f34647q0 = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final InfoDetailBoxViewBinding f34648p0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public InfoDetailBoxView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setActionLink(@NotNull Function0<Unit> infoActionLink) {
        Intrinsics.checkNotNullParameter(infoActionLink, "infoActionLink");
        this.f34648p0.infoBoxLink.setOnClickListener(new a(infoActionLink, 1));
    }

    public final void setActionText(@NotNull String infoActionText) {
        Intrinsics.checkNotNullParameter(infoActionText, "infoActionText");
        this.f34648p0.infoBoxLink.setText(infoActionText);
    }

    public final void setDescription(@NotNull String infoDescription) {
        Intrinsics.checkNotNullParameter(infoDescription, "infoDescription");
        this.f34648p0.infoBoxDescription.setText(infoDescription);
    }

    public final void setIcon(int iconId) {
        this.f34648p0.infoBoxIcon.setImageResource(iconId);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public InfoDetailBoxView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ InfoDetailBoxView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public InfoDetailBoxView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        InfoDetailBoxViewBinding infoDetailBoxViewBindingInflate = InfoDetailBoxViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(infoDetailBoxViewBindingInflate, "inflate(...)");
        this.f34648p0 = infoDetailBoxViewBindingInflate;
        setOrientation(1);
    }
}
