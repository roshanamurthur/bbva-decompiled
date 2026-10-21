package com.bbva.notifications.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.bbva.notifications.R;
import com.bbva.notifications.databinding.NotificationRowViewBinding;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NotificationRowView.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/bbva/notifications/view/NotificationRowView;", "Landroid/widget/LinearLayout;", "", "text", "", "setTitle", "setDescription", "setTextOrHide", "Landroid/util/AttributeSet;", "p0", "Landroid/util/AttributeSet;", "getAttrs", "()Landroid/util/AttributeSet;", "attrs", "", "q0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getDefStyleAttr", "()I", "defStyleAttr", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class NotificationRowView extends LinearLayout {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final AttributeSet attrs;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    public final int defStyleAttr;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final NotificationRowViewBinding f35474r0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NotificationRowView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Nullable
    public final AttributeSet getAttrs() {
        return this.attrs;
    }

    public final int getDefStyleAttr() {
        return this.defStyleAttr;
    }

    public final void setDescription(@Nullable String text) {
        this.f35474r0.notificationRowDescriptionTextView.setText(text);
    }

    public final void setTextOrHide(@Nullable String text) {
        int i10;
        if (text == null || l.isBlank(text)) {
            i10 = 8;
        } else {
            setDescription(text);
            i10 = 0;
        }
        setVisibility(i10);
    }

    public final void setTitle(@Nullable String text) {
        this.f35474r0.notificationRowTitleTextView.setText(text);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NotificationRowView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ NotificationRowView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NotificationRowView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.attrs = attributeSet;
        this.defStyleAttr = i10;
        NotificationRowViewBinding notificationRowViewBindingInflate = NotificationRowViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(notificationRowViewBindingInflate, "inflate(...)");
        this.f35474r0 = notificationRowViewBindingInflate;
        setOrientation(1);
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, R.styleable.NotificationRowView, i10, 0);
        try {
            Result.Companion companion = Result.INSTANCE;
            setTitle(typedArrayObtainStyledAttributes.getString(R.styleable.NotificationRowView_notificationRowTitleText));
            setDescription(typedArrayObtainStyledAttributes.getString(R.styleable.NotificationRowView_notificationRowDescriptionText));
            Result.m5535constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
