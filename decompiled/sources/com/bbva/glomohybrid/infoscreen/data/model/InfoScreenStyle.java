package com.bbva.glomohybrid.infoscreen.data.model;

import com.bbva.glomohybrid.infoscreen.R;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: InfoScreenData.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0011\u0012R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\u0082\u0001\u0002\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/data/model/InfoScreenStyle;", "", "", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getTitleColor", "()I", "titleColor", "b", "getDescriptionLabelColor", "descriptionLabelColor", "c", "getBackgroundColor", "backgroundColor", "d", "getAppBarBackgroundColor", "appBarBackgroundColor", "InfoScreenStyleBlue", "InfoScreenStyleWhite", "Lcom/bbva/glomohybrid/infoscreen/data/model/InfoScreenStyle$InfoScreenStyleBlue;", "Lcom/bbva/glomohybrid/infoscreen/data/model/InfoScreenStyle$InfoScreenStyleWhite;", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public abstract class InfoScreenStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int titleColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int descriptionLabelColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int backgroundColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int appBarBackgroundColor;

    /* JADX INFO: compiled from: InfoScreenData.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/data/model/InfoScreenStyle$InfoScreenStyleBlue;", "Lcom/bbva/glomohybrid/infoscreen/data/model/InfoScreenStyle;", "()V", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InfoScreenStyleBlue extends InfoScreenStyle {

        @NotNull
        public static final InfoScreenStyleBlue INSTANCE = new InfoScreenStyleBlue();

        /* JADX WARN: Illegal instructions before constructor call */
        public InfoScreenStyleBlue() {
            int i10 = R.color.BBVA_WHITE;
            int i11 = R.color.BBVA_DARK_CORE_BLUE;
            super(i10, i10, i11, i11, null);
        }
    }

    /* JADX INFO: compiled from: InfoScreenData.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/data/model/InfoScreenStyle$InfoScreenStyleWhite;", "Lcom/bbva/glomohybrid/infoscreen/data/model/InfoScreenStyle;", "()V", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InfoScreenStyleWhite extends InfoScreenStyle {

        @NotNull
        public static final InfoScreenStyleWhite INSTANCE = new InfoScreenStyleWhite();

        /* JADX WARN: Illegal instructions before constructor call */
        public InfoScreenStyleWhite() {
            int i10 = R.color.BBVA_600;
            super(i10, i10, android.R.color.transparent, R.color.BBVA_CORE_BLUE, null);
        }
    }

    public InfoScreenStyle(int i10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this.titleColor = i10;
        this.descriptionLabelColor = i11;
        this.backgroundColor = i12;
        this.appBarBackgroundColor = i13;
    }

    public final int getAppBarBackgroundColor() {
        return this.appBarBackgroundColor;
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getDescriptionLabelColor() {
        return this.descriptionLabelColor;
    }

    public final int getTitleColor() {
        return this.titleColor;
    }
}
