package com.bbva.glomohybrid.cellsweb.presentation.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ModalID.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\b\t\nR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/presentation/model/ModalID;", "", "", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "ChangeUser", "ErrorSSO", "ErrorTechnical", "Lcom/bbva/glomohybrid/cellsweb/presentation/model/ModalID$ChangeUser;", "Lcom/bbva/glomohybrid/cellsweb/presentation/model/ModalID$ErrorSSO;", "Lcom/bbva/glomohybrid/cellsweb/presentation/model/ModalID$ErrorTechnical;", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public abstract class ModalID {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: compiled from: ModalID.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/presentation/model/ModalID$ChangeUser;", "Lcom/bbva/glomohybrid/cellsweb/presentation/model/ModalID;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeUser extends ModalID {

        @NotNull
        public static final ChangeUser INSTANCE = new ChangeUser();

        public ChangeUser() {
            super("single_app_half_modal_change_user", null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChangeUser)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1775075275;
        }

        @NotNull
        public String toString() {
            return "ChangeUser";
        }
    }

    /* JADX INFO: compiled from: ModalID.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/presentation/model/ModalID$ErrorSSO;", "Lcom/bbva/glomohybrid/cellsweb/presentation/model/ModalID;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ErrorSSO extends ModalID {

        @NotNull
        public static final ErrorSSO INSTANCE = new ErrorSSO();

        public ErrorSSO() {
            super("single_app_half_modal_sso_error", null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ErrorSSO)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1140949783;
        }

        @NotNull
        public String toString() {
            return "ErrorSSO";
        }
    }

    /* JADX INFO: compiled from: ModalID.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/presentation/model/ModalID$ErrorTechnical;", "Lcom/bbva/glomohybrid/cellsweb/presentation/model/ModalID;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ErrorTechnical extends ModalID {

        @NotNull
        public static final ErrorTechnical INSTANCE = new ErrorTechnical();

        public ErrorTechnical() {
            super("single_app_half_modal_error", null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ErrorTechnical)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -871357851;
        }

        @NotNull
        public String toString() {
            return "ErrorTechnical";
        }
    }

    public ModalID(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this.id = str;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }
}
