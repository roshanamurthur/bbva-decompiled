package com.bbva.glomohybrid.cellsweb.presentation;

import ad.d;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.base.models.ModalType;
import com.bbva.glomohybrid.base.router.Route;
import com.bbva.glomohybrid.cellsweb.presentation.model.ScreenState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CellsWebContract.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/presentation/CellsWebContract;", "", "()V", "Event", "Intent", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CellsWebContract {

    /* JADX INFO: compiled from: CellsWebContract.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/presentation/CellsWebContract$Event;", "", "()V", "NativeNavigation", "OpenDialer", "ShowModal", "Lcom/bbva/glomohybrid/cellsweb/presentation/CellsWebContract$Event$NativeNavigation;", "Lcom/bbva/glomohybrid/cellsweb/presentation/CellsWebContract$Event$OpenDialer;", "Lcom/bbva/glomohybrid/cellsweb/presentation/CellsWebContract$Event$ShowModal;", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Event {

        /* JADX INFO: compiled from: CellsWebContract.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/presentation/CellsWebContract$Event$NativeNavigation;", "Lcom/bbva/glomohybrid/cellsweb/presentation/CellsWebContract$Event;", "Lcom/bbva/glomohybrid/base/router/Route;", "component1", "route", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/glomohybrid/base/router/Route;", "getRoute", "()Lcom/bbva/glomohybrid/base/router/Route;", "<init>", "(Lcom/bbva/glomohybrid/base/router/Route;)V", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class NativeNavigation extends Event {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Route route;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NativeNavigation(@NotNull Route route) {
                super(null);
                Intrinsics.checkNotNullParameter(route, "route");
                this.route = route;
            }

            public static /* synthetic */ NativeNavigation copy$default(NativeNavigation nativeNavigation, Route route, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    route = nativeNavigation.route;
                }
                return nativeNavigation.copy(route);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Route getRoute() {
                return this.route;
            }

            @NotNull
            public final NativeNavigation copy(@NotNull Route route) {
                Intrinsics.checkNotNullParameter(route, "route");
                return new NativeNavigation(route);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NativeNavigation) && Intrinsics.areEqual(this.route, ((NativeNavigation) other).route);
            }

            @NotNull
            public final Route getRoute() {
                return this.route;
            }

            public int hashCode() {
                return this.route.hashCode();
            }

            @NotNull
            public String toString() {
                return "NativeNavigation(route=" + this.route + ")";
            }
        }

        /* JADX INFO: compiled from: CellsWebContract.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/presentation/CellsWebContract$Event$OpenDialer;", "Lcom/bbva/glomohybrid/cellsweb/presentation/CellsWebContract$Event;", "", "component1", "phone", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getPhone", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class OpenDialer extends Event {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final String phone;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OpenDialer(@NotNull String phone) {
                super(null);
                Intrinsics.checkNotNullParameter(phone, "phone");
                this.phone = phone;
            }

            public static /* synthetic */ OpenDialer copy$default(OpenDialer openDialer, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = openDialer.phone;
                }
                return openDialer.copy(str);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getPhone() {
                return this.phone;
            }

            @NotNull
            public final OpenDialer copy(@NotNull String phone) {
                Intrinsics.checkNotNullParameter(phone, "phone");
                return new OpenDialer(phone);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OpenDialer) && Intrinsics.areEqual(this.phone, ((OpenDialer) other).phone);
            }

            @NotNull
            public final String getPhone() {
                return this.phone;
            }

            public int hashCode() {
                return this.phone.hashCode();
            }

            @NotNull
            public String toString() {
                return d.f(new StringBuilder("OpenDialer(phone="), this.phone, ")");
            }
        }

        /* JADX INFO: compiled from: CellsWebContract.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/presentation/CellsWebContract$Event$ShowModal;", "Lcom/bbva/glomohybrid/cellsweb/presentation/CellsWebContract$Event;", "Lcom/bbva/glomohybrid/base/models/ModalType;", "component1", "modal", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/glomohybrid/base/models/ModalType;", "getModal", "()Lcom/bbva/glomohybrid/base/models/ModalType;", "<init>", "(Lcom/bbva/glomohybrid/base/models/ModalType;)V", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class ShowModal extends Event {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final ModalType modal;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowModal(@NotNull ModalType modal) {
                super(null);
                Intrinsics.checkNotNullParameter(modal, "modal");
                this.modal = modal;
            }

            public static /* synthetic */ ShowModal copy$default(ShowModal showModal, ModalType modalType, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    modalType = showModal.modal;
                }
                return showModal.copy(modalType);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final ModalType getModal() {
                return this.modal;
            }

            @NotNull
            public final ShowModal copy(@NotNull ModalType modal) {
                Intrinsics.checkNotNullParameter(modal, "modal");
                return new ShowModal(modal);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowModal) && Intrinsics.areEqual(this.modal, ((ShowModal) other).modal);
            }

            @NotNull
            public final ModalType getModal() {
                return this.modal;
            }

            public int hashCode() {
                return this.modal.hashCode();
            }

            @NotNull
            public String toString() {
                return "ShowModal(modal=" + this.modal + ")";
            }
        }

        public Event() {
        }

        public /* synthetic */ Event(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: CellsWebContract.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/presentation/CellsWebContract$Intent;", "", "()V", "CloseScreen", "ScreenStateChange", "Lcom/bbva/glomohybrid/cellsweb/presentation/CellsWebContract$Intent$CloseScreen;", "Lcom/bbva/glomohybrid/cellsweb/presentation/CellsWebContract$Intent$ScreenStateChange;", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Intent {

        /* JADX INFO: compiled from: CellsWebContract.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/presentation/CellsWebContract$Intent$CloseScreen;", "Lcom/bbva/glomohybrid/cellsweb/presentation/CellsWebContract$Intent;", "()V", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class CloseScreen extends Intent {

            @NotNull
            public static final CloseScreen INSTANCE = new CloseScreen();

            public CloseScreen() {
                super(null);
            }
        }

        /* JADX INFO: compiled from: CellsWebContract.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/presentation/CellsWebContract$Intent$ScreenStateChange;", "Lcom/bbva/glomohybrid/cellsweb/presentation/CellsWebContract$Intent;", "Lcom/bbva/glomohybrid/cellsweb/presentation/model/ScreenState;", "component1", "screenState", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/glomohybrid/cellsweb/presentation/model/ScreenState;", "getScreenState", "()Lcom/bbva/glomohybrid/cellsweb/presentation/model/ScreenState;", "<init>", "(Lcom/bbva/glomohybrid/cellsweb/presentation/model/ScreenState;)V", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class ScreenStateChange extends Intent {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final ScreenState screenState;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ScreenStateChange(@NotNull ScreenState screenState) {
                super(null);
                Intrinsics.checkNotNullParameter(screenState, "screenState");
                this.screenState = screenState;
            }

            public static /* synthetic */ ScreenStateChange copy$default(ScreenStateChange screenStateChange, ScreenState screenState, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    screenState = screenStateChange.screenState;
                }
                return screenStateChange.copy(screenState);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final ScreenState getScreenState() {
                return this.screenState;
            }

            @NotNull
            public final ScreenStateChange copy(@NotNull ScreenState screenState) {
                Intrinsics.checkNotNullParameter(screenState, "screenState");
                return new ScreenStateChange(screenState);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ScreenStateChange) && this.screenState == ((ScreenStateChange) other).screenState;
            }

            @NotNull
            public final ScreenState getScreenState() {
                return this.screenState;
            }

            public int hashCode() {
                return this.screenState.hashCode();
            }

            @NotNull
            public String toString() {
                return "ScreenStateChange(screenState=" + this.screenState + ")";
            }
        }

        public Intent() {
        }

        public /* synthetic */ Intent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
