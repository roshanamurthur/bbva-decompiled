package com.bbva.component.ui.carousel.cards;

import ad.d;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.component.ui.carousel.cards.model.CarouselCardItem;
import com.bbva.component.ui.carousel.cards.model.CarouselCardItem$$serializer;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.dynamiclinks.DynamicLink;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CarouselCardsContract.kt */
/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/bbva/component/ui/carousel/cards/CarouselCardsContract;", "", "()V", "Event", "State", "component-ui-carousel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CarouselCardsContract {
    public static final int $stable = 0;

    @NotNull
    public static final CarouselCardsContract INSTANCE = new CarouselCardsContract();

    /* JADX INFO: compiled from: CarouselCardsContract.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/component/ui/carousel/cards/CarouselCardsContract$Event;", "", "()V", "CardSelected", "HeaderLinkClicked", "Lcom/bbva/component/ui/carousel/cards/CarouselCardsContract$Event$CardSelected;", "Lcom/bbva/component/ui/carousel/cards/CarouselCardsContract$Event$HeaderLinkClicked;", "component-ui-carousel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Event {
        public static final int $stable = 0;

        /* JADX INFO: compiled from: CarouselCardsContract.kt */
        @StabilityInferred(parameters = 0)
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/component/ui/carousel/cards/CarouselCardsContract$Event$CardSelected;", "Lcom/bbva/component/ui/carousel/cards/CarouselCardsContract$Event;", "", "component1", "id", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "component-ui-carousel_release"}, k = 1, mv = {1, 8, 0})
        public static final /* data */ class CardSelected extends Event {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final String id;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CardSelected(@NotNull String id) {
                super(null);
                Intrinsics.checkNotNullParameter(id, "id");
                this.id = id;
            }

            public static /* synthetic */ CardSelected copy$default(CardSelected cardSelected, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = cardSelected.id;
                }
                return cardSelected.copy(str);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getId() {
                return this.id;
            }

            @NotNull
            public final CardSelected copy(@NotNull String id) {
                Intrinsics.checkNotNullParameter(id, "id");
                return new CardSelected(id);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CardSelected) && Intrinsics.areEqual(this.id, ((CardSelected) other).id);
            }

            @NotNull
            public final String getId() {
                return this.id;
            }

            public int hashCode() {
                return this.id.hashCode();
            }

            @NotNull
            public String toString() {
                return d.f(new StringBuilder("CardSelected(id="), this.id, ")");
            }
        }

        /* JADX INFO: compiled from: CarouselCardsContract.kt */
        @StabilityInferred(parameters = 0)
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/component/ui/carousel/cards/CarouselCardsContract$Event$HeaderLinkClicked;", "Lcom/bbva/component/ui/carousel/cards/CarouselCardsContract$Event;", "()V", "component-ui-carousel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class HeaderLinkClicked extends Event {
            public static final int $stable = 0;

            @NotNull
            public static final HeaderLinkClicked INSTANCE = new HeaderLinkClicked();

            public HeaderLinkClicked() {
                super(null);
            }
        }

        public Event() {
        }

        public /* synthetic */ Event(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: CarouselCardsContract.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0003'&(B\u001d\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b \u0010!B5\b\u0017\u0012\u0006\u0010\"\u001a\u00020\u0013\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b \u0010%J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J#\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\t2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006)"}, d2 = {"Lcom/bbva/component/ui/carousel/cards/CarouselCardsContract$State;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "Lcom/bbva/component/ui/carousel/cards/CarouselCardsContract$State$Header;", "component1", "", "Lcom/bbva/component/ui/carousel/cards/model/CarouselCardItem;", "component2", "header", FirebaseAnalytics.Param.ITEMS, "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Lcom/bbva/component/ui/carousel/cards/CarouselCardsContract$State$Header;", "getHeader", "()Lcom/bbva/component/ui/carousel/cards/CarouselCardsContract$State$Header;", "b", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "<init>", "(Lcom/bbva/component/ui/carousel/cards/CarouselCardsContract$State$Header;Ljava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/bbva/component/ui/carousel/cards/CarouselCardsContract$State$Header;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "Header", "component-ui-carousel_release"}, k = 1, mv = {1, 8, 0})
    @Serializable
    public static final /* data */ class State {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Header header;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<CarouselCardItem> items;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        /* JADX INFO: compiled from: CarouselCardsContract.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/component/ui/carousel/cards/CarouselCardsContract$State$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/component/ui/carousel/cards/CarouselCardsContract$State;", "component-ui-carousel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer<State> serializer() {
                return CarouselCardsContract$State$$serializer.INSTANCE;
            }
        }

        /* JADX INFO: compiled from: CarouselCardsContract.kt */
        @StabilityInferred(parameters = 0)
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u001b\u0012\u0006\u0010\f\u001a\u00020\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001b\u0010\u001cB/\b\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u0010\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001b\u0010 J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\u000f\u001a\u00020\tHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018¨\u0006#"}, d2 = {"Lcom/bbva/component/ui/carousel/cards/CarouselCardsContract$State$Header;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "component2", "title", DynamicLink.Builder.KEY_LINK, "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "b", "getLink", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "component-ui-carousel_release"}, k = 1, mv = {1, 8, 0})
        @Serializable
        public static final /* data */ class Header {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final String title;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String link;

            /* JADX INFO: compiled from: CarouselCardsContract.kt */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/component/ui/carousel/cards/CarouselCardsContract$State$Header$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/component/ui/carousel/cards/CarouselCardsContract$State$Header;", "component-ui-carousel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @NotNull
                public final KSerializer<Header> serializer() {
                    return CarouselCardsContract$State$Header$$serializer.INSTANCE;
                }
            }

            @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
            public /* synthetic */ Header(int i10, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i10 & 1)) {
                    PluginExceptionsKt.throwMissingFieldException(i10, 1, CarouselCardsContract$State$Header$$serializer.INSTANCE.getDescriptor());
                }
                this.title = str;
                if ((i10 & 2) == 0) {
                    this.link = null;
                } else {
                    this.link = str2;
                }
            }

            public static /* synthetic */ Header copy$default(Header header, String str, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = header.title;
                }
                if ((i10 & 2) != 0) {
                    str2 = header.link;
                }
                return header.copy(str, str2);
            }

            @JvmStatic
            public static final void write$Self(@NotNull Header self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
                Intrinsics.checkNotNullParameter(self, "self");
                Intrinsics.checkNotNullParameter(output, "output");
                Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
                output.encodeStringElement(serialDesc, 0, self.title);
                boolean zShouldEncodeElementDefault = output.shouldEncodeElementDefault(serialDesc, 1);
                String str = self.link;
                if (!zShouldEncodeElementDefault && str == null) {
                    return;
                }
                output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, str);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @Nullable
            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getLink() {
                return this.link;
            }

            @NotNull
            public final Header copy(@NotNull String title, @Nullable String link) {
                Intrinsics.checkNotNullParameter(title, "title");
                return new Header(title, link);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Header)) {
                    return false;
                }
                Header header = (Header) other;
                return Intrinsics.areEqual(this.title, header.title) && Intrinsics.areEqual(this.link, header.link);
            }

            @Nullable
            public final String getLink() {
                return this.link;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int iHashCode = this.title.hashCode() * 31;
                String str = this.link;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @NotNull
            public String toString() {
                StringBuilder sb2 = new StringBuilder("Header(title=");
                sb2.append(this.title);
                sb2.append(", link=");
                return d.f(sb2, this.link, ")");
            }

            public Header(@NotNull String title, @Nullable String str) {
                Intrinsics.checkNotNullParameter(title, "title");
                this.title = title;
                this.link = str;
            }

            public /* synthetic */ Header(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i10 & 2) != 0 ? null : str2);
            }
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ State(int i10, Header header, List list, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i10 & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i10, 3, CarouselCardsContract$State$$serializer.INSTANCE.getDescriptor());
            }
            this.header = header;
            this.items = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ State copy$default(State state, Header header, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                header = state.header;
            }
            if ((i10 & 2) != 0) {
                list = state.items;
            }
            return state.copy(header, list);
        }

        @JvmStatic
        public static final void write$Self(@NotNull State self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            output.encodeSerializableElement(serialDesc, 0, CarouselCardsContract$State$Header$$serializer.INSTANCE, self.header);
            output.encodeSerializableElement(serialDesc, 1, new ArrayListSerializer(CarouselCardItem$$serializer.INSTANCE), self.items);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Header getHeader() {
            return this.header;
        }

        @NotNull
        public final List<CarouselCardItem> component2() {
            return this.items;
        }

        @NotNull
        public final State copy(@NotNull Header header, @NotNull List<CarouselCardItem> items) {
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(items, "items");
            return new State(header, items);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return Intrinsics.areEqual(this.header, state.header) && Intrinsics.areEqual(this.items, state.items);
        }

        @NotNull
        public final Header getHeader() {
            return this.header;
        }

        @NotNull
        public final List<CarouselCardItem> getItems() {
            return this.items;
        }

        public int hashCode() {
            return this.items.hashCode() + (this.header.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "State(header=" + this.header + ", items=" + this.items + ")";
        }

        public State(@NotNull Header header, @NotNull List<CarouselCardItem> items) {
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(items, "items");
            this.header = header;
            this.items = items;
        }
    }
}
