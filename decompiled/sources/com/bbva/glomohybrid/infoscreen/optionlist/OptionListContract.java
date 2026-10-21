package com.bbva.glomohybrid.infoscreen.optionlist;

import ad.d;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.infoscreen.optionlist.model.OptionData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: OptionListContract.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/optionlist/OptionListContract;", "", "()V", "Event", "Intent", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class OptionListContract {

    /* JADX INFO: compiled from: OptionListContract.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/optionlist/OptionListContract$Event;", "", "()V", "Finish", "NavigateTo", "NavigateToAffiliatePage", "OpenDialer", "Starting", "Lcom/bbva/glomohybrid/infoscreen/optionlist/OptionListContract$Event$Finish;", "Lcom/bbva/glomohybrid/infoscreen/optionlist/OptionListContract$Event$NavigateTo;", "Lcom/bbva/glomohybrid/infoscreen/optionlist/OptionListContract$Event$NavigateToAffiliatePage;", "Lcom/bbva/glomohybrid/infoscreen/optionlist/OptionListContract$Event$OpenDialer;", "Lcom/bbva/glomohybrid/infoscreen/optionlist/OptionListContract$Event$Starting;", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Event {

        /* JADX INFO: compiled from: OptionListContract.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/optionlist/OptionListContract$Event$Finish;", "Lcom/bbva/glomohybrid/infoscreen/optionlist/OptionListContract$Event;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Finish extends Event {

            @NotNull
            public static final Finish INSTANCE = new Finish();

            public Finish() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Finish)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 2073052941;
            }

            @NotNull
            public String toString() {
                return "Finish";
            }
        }

        /* JADX INFO: compiled from: OptionListContract.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/optionlist/OptionListContract$Event$NavigateTo;", "Lcom/bbva/glomohybrid/infoscreen/optionlist/OptionListContract$Event;", "Lcom/bbva/glomohybrid/infoscreen/optionlist/model/OptionData;", "component1", "optionData", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/glomohybrid/infoscreen/optionlist/model/OptionData;", "getOptionData", "()Lcom/bbva/glomohybrid/infoscreen/optionlist/model/OptionData;", "<init>", "(Lcom/bbva/glomohybrid/infoscreen/optionlist/model/OptionData;)V", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class NavigateTo extends Event {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final OptionData optionData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NavigateTo(@NotNull OptionData optionData) {
                super(null);
                Intrinsics.checkNotNullParameter(optionData, "optionData");
                this.optionData = optionData;
            }

            public static /* synthetic */ NavigateTo copy$default(NavigateTo navigateTo, OptionData optionData, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    optionData = navigateTo.optionData;
                }
                return navigateTo.copy(optionData);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final OptionData getOptionData() {
                return this.optionData;
            }

            @NotNull
            public final NavigateTo copy(@NotNull OptionData optionData) {
                Intrinsics.checkNotNullParameter(optionData, "optionData");
                return new NavigateTo(optionData);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NavigateTo) && Intrinsics.areEqual(this.optionData, ((NavigateTo) other).optionData);
            }

            @NotNull
            public final OptionData getOptionData() {
                return this.optionData;
            }

            public int hashCode() {
                return this.optionData.hashCode();
            }

            @NotNull
            public String toString() {
                return "NavigateTo(optionData=" + this.optionData + ")";
            }
        }

        /* JADX INFO: compiled from: OptionListContract.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/optionlist/OptionListContract$Event$NavigateToAffiliatePage;", "Lcom/bbva/glomohybrid/infoscreen/optionlist/OptionListContract$Event;", "Lcom/bbva/glomohybrid/infoscreen/optionlist/model/OptionData;", "component1", "optionData", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/glomohybrid/infoscreen/optionlist/model/OptionData;", "getOptionData", "()Lcom/bbva/glomohybrid/infoscreen/optionlist/model/OptionData;", "<init>", "(Lcom/bbva/glomohybrid/infoscreen/optionlist/model/OptionData;)V", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class NavigateToAffiliatePage extends Event {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final OptionData optionData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NavigateToAffiliatePage(@NotNull OptionData optionData) {
                super(null);
                Intrinsics.checkNotNullParameter(optionData, "optionData");
                this.optionData = optionData;
            }

            public static /* synthetic */ NavigateToAffiliatePage copy$default(NavigateToAffiliatePage navigateToAffiliatePage, OptionData optionData, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    optionData = navigateToAffiliatePage.optionData;
                }
                return navigateToAffiliatePage.copy(optionData);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final OptionData getOptionData() {
                return this.optionData;
            }

            @NotNull
            public final NavigateToAffiliatePage copy(@NotNull OptionData optionData) {
                Intrinsics.checkNotNullParameter(optionData, "optionData");
                return new NavigateToAffiliatePage(optionData);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NavigateToAffiliatePage) && Intrinsics.areEqual(this.optionData, ((NavigateToAffiliatePage) other).optionData);
            }

            @NotNull
            public final OptionData getOptionData() {
                return this.optionData;
            }

            public int hashCode() {
                return this.optionData.hashCode();
            }

            @NotNull
            public String toString() {
                return "NavigateToAffiliatePage(optionData=" + this.optionData + ")";
            }
        }

        /* JADX INFO: compiled from: OptionListContract.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/optionlist/OptionListContract$Event$OpenDialer;", "Lcom/bbva/glomohybrid/infoscreen/optionlist/OptionListContract$Event;", "", "component1", "phone", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getPhone", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
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

        /* JADX INFO: compiled from: OptionListContract.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/optionlist/OptionListContract$Event$Starting;", "Lcom/bbva/glomohybrid/infoscreen/optionlist/OptionListContract$Event;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Starting extends Event {

            @NotNull
            public static final Starting INSTANCE = new Starting();

            public Starting() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Starting)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 1329521722;
            }

            @NotNull
            public String toString() {
                return "Starting";
            }
        }

        public Event() {
        }

        public /* synthetic */ Event(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: OptionListContract.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/optionlist/OptionListContract$Intent;", "", "()V", "ButtonOptionTapped", "OptionSelected", "Lcom/bbva/glomohybrid/infoscreen/optionlist/OptionListContract$Intent$ButtonOptionTapped;", "Lcom/bbva/glomohybrid/infoscreen/optionlist/OptionListContract$Intent$OptionSelected;", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Intent {

        /* JADX INFO: compiled from: OptionListContract.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/optionlist/OptionListContract$Intent$ButtonOptionTapped;", "Lcom/bbva/glomohybrid/infoscreen/optionlist/OptionListContract$Intent;", "Lcom/bbva/glomohybrid/infoscreen/optionlist/model/OptionData;", "component1", "data", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/glomohybrid/infoscreen/optionlist/model/OptionData;", "getData", "()Lcom/bbva/glomohybrid/infoscreen/optionlist/model/OptionData;", "<init>", "(Lcom/bbva/glomohybrid/infoscreen/optionlist/model/OptionData;)V", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class ButtonOptionTapped extends Intent {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final OptionData data;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ButtonOptionTapped(@NotNull OptionData data) {
                super(null);
                Intrinsics.checkNotNullParameter(data, "data");
                this.data = data;
            }

            public static /* synthetic */ ButtonOptionTapped copy$default(ButtonOptionTapped buttonOptionTapped, OptionData optionData, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    optionData = buttonOptionTapped.data;
                }
                return buttonOptionTapped.copy(optionData);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final OptionData getData() {
                return this.data;
            }

            @NotNull
            public final ButtonOptionTapped copy(@NotNull OptionData data) {
                Intrinsics.checkNotNullParameter(data, "data");
                return new ButtonOptionTapped(data);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ButtonOptionTapped) && Intrinsics.areEqual(this.data, ((ButtonOptionTapped) other).data);
            }

            @NotNull
            public final OptionData getData() {
                return this.data;
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            @NotNull
            public String toString() {
                return "ButtonOptionTapped(data=" + this.data + ")";
            }
        }

        /* JADX INFO: compiled from: OptionListContract.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/optionlist/OptionListContract$Intent$OptionSelected;", "Lcom/bbva/glomohybrid/infoscreen/optionlist/OptionListContract$Intent;", "Lcom/bbva/glomohybrid/infoscreen/optionlist/model/OptionData;", "component1", "data", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/glomohybrid/infoscreen/optionlist/model/OptionData;", "getData", "()Lcom/bbva/glomohybrid/infoscreen/optionlist/model/OptionData;", "<init>", "(Lcom/bbva/glomohybrid/infoscreen/optionlist/model/OptionData;)V", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class OptionSelected extends Intent {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final OptionData data;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OptionSelected(@NotNull OptionData data) {
                super(null);
                Intrinsics.checkNotNullParameter(data, "data");
                this.data = data;
            }

            public static /* synthetic */ OptionSelected copy$default(OptionSelected optionSelected, OptionData optionData, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    optionData = optionSelected.data;
                }
                return optionSelected.copy(optionData);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final OptionData getData() {
                return this.data;
            }

            @NotNull
            public final OptionSelected copy(@NotNull OptionData data) {
                Intrinsics.checkNotNullParameter(data, "data");
                return new OptionSelected(data);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OptionSelected) && Intrinsics.areEqual(this.data, ((OptionSelected) other).data);
            }

            @NotNull
            public final OptionData getData() {
                return this.data;
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            @NotNull
            public String toString() {
                return "OptionSelected(data=" + this.data + ")";
            }
        }

        public Intent() {
        }

        public /* synthetic */ Intent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
