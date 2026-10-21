package com.bbva.showinfo.model;

import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: InfoElement.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \b2\u00020\u0001:\u0005\b\t\n\u000b\fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/bbva/showinfo/model/SnackBarDuration;", "", "", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getSnackBarValue", "()I", "snackBarValue", "Companion", "Defined", "Indefinite", "Long", "Short", "Lcom/bbva/showinfo/model/SnackBarDuration$Defined;", "Lcom/bbva/showinfo/model/SnackBarDuration$Indefinite;", "Lcom/bbva/showinfo/model/SnackBarDuration$Long;", "Lcom/bbva/showinfo/model/SnackBarDuration$Short;", "showinfo_release"}, k = 1, mv = {1, 9, 0})
public abstract class SnackBarDuration {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int snackBarValue;

    /* JADX INFO: compiled from: InfoElement.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/showinfo/model/SnackBarDuration$Companion;", "", "()V", "of", "Lcom/bbva/showinfo/model/SnackBarDuration;", "value", "", "showinfo_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SnackBarDuration of(int value) {
            if (value == -2) {
                return Indefinite.INSTANCE;
            }
            if (value != -1) {
                return value != 0 ? new Defined(value) : Long.INSTANCE;
            }
            return Short.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: InfoElement.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/showinfo/model/SnackBarDuration$Defined;", "Lcom/bbva/showinfo/model/SnackBarDuration;", "millis", "", "(I)V", "showinfo_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Defined extends SnackBarDuration {
        public Defined(int i10) {
            super(i10, null);
        }
    }

    /* JADX INFO: compiled from: InfoElement.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/showinfo/model/SnackBarDuration$Indefinite;", "Lcom/bbva/showinfo/model/SnackBarDuration;", "()V", "showinfo_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Indefinite extends SnackBarDuration {

        @NotNull
        public static final Indefinite INSTANCE = new Indefinite();

        public Indefinite() {
            super(-2, null);
        }
    }

    /* JADX INFO: compiled from: InfoElement.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/showinfo/model/SnackBarDuration$Long;", "Lcom/bbva/showinfo/model/SnackBarDuration;", "()V", "showinfo_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Long extends SnackBarDuration {

        @NotNull
        public static final Long INSTANCE = new Long();

        public Long() {
            super(0, null);
        }
    }

    /* JADX INFO: compiled from: InfoElement.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/showinfo/model/SnackBarDuration$Short;", "Lcom/bbva/showinfo/model/SnackBarDuration;", "()V", "showinfo_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Short extends SnackBarDuration {

        @NotNull
        public static final Short INSTANCE = new Short();

        public Short() {
            super(-1, null);
        }
    }

    public SnackBarDuration(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this.snackBarValue = i10;
    }

    public final int getSnackBarValue() {
        return this.snackBarValue;
    }
}
