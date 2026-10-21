package com.bbva.glomohybrid.infoscreen.data.model;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InfoScreenData.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\n\u001a\u00020\u0002\u0012\b\b\u0001\u0010\r\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/data/model/InfoScreenData;", "", "", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getHeaderImage", "()I", "headerImage", "b", "getToolbarTitle", "toolbarTitle", "c", "getTitle", "title", "d", "getDescription", "description", "e", "getPositiveButton", "positiveButton", "f", "Ljava/lang/Integer;", "getNegativeButton", "()Ljava/lang/Integer;", "negativeButton", "Lcom/bbva/glomohybrid/infoscreen/data/model/InfoScreenStyle;", "g", "Lcom/bbva/glomohybrid/infoscreen/data/model/InfoScreenStyle;", "getStyle", "()Lcom/bbva/glomohybrid/infoscreen/data/model/InfoScreenStyle;", "style", "<init>", "(IIIIILjava/lang/Integer;Lcom/bbva/glomohybrid/infoscreen/data/model/InfoScreenStyle;)V", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class InfoScreenData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int headerImage;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int toolbarTitle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int title;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int description;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int positiveButton;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer negativeButton;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final InfoScreenStyle style;

    public InfoScreenData(@DrawableRes int i10, @StringRes int i11, @StringRes int i12, @StringRes int i13, @StringRes int i14, @StringRes @Nullable Integer num, @NotNull InfoScreenStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.headerImage = i10;
        this.toolbarTitle = i11;
        this.title = i12;
        this.description = i13;
        this.positiveButton = i14;
        this.negativeButton = num;
        this.style = style;
    }

    public final int getDescription() {
        return this.description;
    }

    public final int getHeaderImage() {
        return this.headerImage;
    }

    @Nullable
    public final Integer getNegativeButton() {
        return this.negativeButton;
    }

    public final int getPositiveButton() {
        return this.positiveButton;
    }

    @NotNull
    public final InfoScreenStyle getStyle() {
        return this.style;
    }

    public final int getTitle() {
        return this.title;
    }

    public final int getToolbarTitle() {
        return this.toolbarTitle;
    }

    public /* synthetic */ InfoScreenData(int i10, int i11, int i12, int i13, int i14, Integer num, InfoScreenStyle infoScreenStyle, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, i12, i13, i14, (i15 & 32) != 0 ? null : num, (i15 & 64) != 0 ? InfoScreenStyle.InfoScreenStyleWhite.INSTANCE : infoScreenStyle);
    }
}
