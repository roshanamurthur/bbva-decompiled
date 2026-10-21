package com.bbva.glomohybrid.infoscreen;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InfoScreenContract.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/InfoScreenContract;", "", "()V", "Event", "Style", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class InfoScreenContract {

    /* JADX INFO: compiled from: InfoScreenContract.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/InfoScreenContract$Event;", "", "()V", "CloseButtonClick", "NegativeButtonClick", "PositiveButtonClick", "Lcom/bbva/glomohybrid/infoscreen/InfoScreenContract$Event$CloseButtonClick;", "Lcom/bbva/glomohybrid/infoscreen/InfoScreenContract$Event$NegativeButtonClick;", "Lcom/bbva/glomohybrid/infoscreen/InfoScreenContract$Event$PositiveButtonClick;", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Event {

        /* JADX INFO: compiled from: InfoScreenContract.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/InfoScreenContract$Event$CloseButtonClick;", "Lcom/bbva/glomohybrid/infoscreen/InfoScreenContract$Event;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class CloseButtonClick extends Event {

            @NotNull
            public static final CloseButtonClick INSTANCE = new CloseButtonClick();

            public CloseButtonClick() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CloseButtonClick)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -1318419684;
            }

            @NotNull
            public String toString() {
                return "CloseButtonClick";
            }
        }

        /* JADX INFO: compiled from: InfoScreenContract.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/InfoScreenContract$Event$NegativeButtonClick;", "Lcom/bbva/glomohybrid/infoscreen/InfoScreenContract$Event;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class NegativeButtonClick extends Event {

            @NotNull
            public static final NegativeButtonClick INSTANCE = new NegativeButtonClick();

            public NegativeButtonClick() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NegativeButtonClick)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -55636349;
            }

            @NotNull
            public String toString() {
                return "NegativeButtonClick";
            }
        }

        /* JADX INFO: compiled from: InfoScreenContract.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/InfoScreenContract$Event$PositiveButtonClick;", "Lcom/bbva/glomohybrid/infoscreen/InfoScreenContract$Event;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class PositiveButtonClick extends Event {

            @NotNull
            public static final PositiveButtonClick INSTANCE = new PositiveButtonClick();

            public PositiveButtonClick() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PositiveButtonClick)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 440139327;
            }

            @NotNull
            public String toString() {
                return "PositiveButtonClick";
            }
        }

        public Event() {
        }

        public /* synthetic */ Event(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: InfoScreenContract.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0014\u0015\u0016R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006\u0082\u0001\u0003\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/InfoScreenContract$Style;", "", "", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getToolbarBackground", "()I", "toolbarBackground", "b", "getBackgroundColor", "backgroundColor", "c", "getToolbarTitleColor", "toolbarTitleColor", "d", "getTitleColor", "titleColor", "e", "getDescriptionColor", "descriptionColor", "StyleBlue", "StyleDefault", "StyleWhite", "Lcom/bbva/glomohybrid/infoscreen/InfoScreenContract$Style$StyleBlue;", "Lcom/bbva/glomohybrid/infoscreen/InfoScreenContract$Style$StyleDefault;", "Lcom/bbva/glomohybrid/infoscreen/InfoScreenContract$Style$StyleWhite;", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
    public static abstract class Style {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final int toolbarBackground;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final int backgroundColor;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final int toolbarTitleColor;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public final int titleColor;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public final int descriptionColor;

        /* JADX INFO: compiled from: InfoScreenContract.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/InfoScreenContract$Style$StyleBlue;", "Lcom/bbva/glomohybrid/infoscreen/InfoScreenContract$Style;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class StyleBlue extends Style {

            @NotNull
            public static final StyleBlue INSTANCE = new StyleBlue();

            /* JADX WARN: Illegal instructions before constructor call */
            public StyleBlue() {
                int i10 = R.color.BBVA_DARK_CORE_BLUE;
                int i11 = R.color.BBVA_WHITE;
                super(i10, i10, i11, i11, i11, null);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof StyleBlue)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 2008362756;
            }

            @NotNull
            public String toString() {
                return "StyleBlue";
            }
        }

        /* JADX INFO: compiled from: InfoScreenContract.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/InfoScreenContract$Style$StyleDefault;", "Lcom/bbva/glomohybrid/infoscreen/InfoScreenContract$Style;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class StyleDefault extends Style {

            @NotNull
            public static final StyleDefault INSTANCE = new StyleDefault();

            /* JADX WARN: Illegal instructions before constructor call */
            public StyleDefault() {
                int i10 = R.color.BBVA_DARK_CORE_BLUE;
                int i11 = R.color.BBVA_WHITE;
                int i12 = R.color.BBVA_BLACK;
                super(i10, i11, i11, i12, i12, null);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof StyleDefault)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -493789353;
            }

            @NotNull
            public String toString() {
                return "StyleDefault";
            }
        }

        /* JADX INFO: compiled from: InfoScreenContract.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/InfoScreenContract$Style$StyleWhite;", "Lcom/bbva/glomohybrid/infoscreen/InfoScreenContract$Style;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class StyleWhite extends Style {

            @NotNull
            public static final StyleWhite INSTANCE = new StyleWhite();

            /* JADX WARN: Illegal instructions before constructor call */
            public StyleWhite() {
                int i10 = R.color.BBVA_WHITE;
                int i11 = R.color.BBVA_BLACK;
                super(i10, i10, i11, i11, i11, null);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof StyleWhite)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -2146000193;
            }

            @NotNull
            public String toString() {
                return "StyleWhite";
            }
        }

        public Style(int i10, int i11, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this.toolbarBackground = i10;
            this.backgroundColor = i11;
            this.toolbarTitleColor = i12;
            this.titleColor = i13;
            this.descriptionColor = i14;
        }

        public final int getBackgroundColor() {
            return this.backgroundColor;
        }

        public final int getDescriptionColor() {
            return this.descriptionColor;
        }

        public final int getTitleColor() {
            return this.titleColor;
        }

        public final int getToolbarBackground() {
            return this.toolbarBackground;
        }

        public final int getToolbarTitleColor() {
            return this.toolbarTitleColor;
        }
    }
}
