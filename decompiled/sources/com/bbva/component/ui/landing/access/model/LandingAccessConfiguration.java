package com.bbva.component.ui.landing.access.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.cells.componentkit.model.dsl.TextSettings;
import com.bbva.cells.componentkit.model.dsl.TextSettings$$serializer;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import com.google.firebase.dynamiclinks.DynamicLink;
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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingAccessConfiguration.kt */
/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002>=BG\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b7\u00108BW\b\u0011\u0012\u0006\u00109\u001a\u00020\u001e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010;\u001a\u0004\u0018\u00010:¢\u0006\u0004\b7\u0010<J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0003JO\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\r2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0013HÆ\u0001J\t\u0010\u001d\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001f\u001a\u00020\u001eHÖ\u0001J\u0013\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0016\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106¨\u0006?"}, d2 = {"Lcom/bbva/component/ui/landing/access/model/LandingAccessConfiguration;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$component_ui_landing_access_release", "(Lcom/bbva/component/ui/landing/access/model/LandingAccessConfiguration;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/bbva/component/ui/landing/access/model/LandingImage;", "component1", "Lcom/bbva/cells/componentkit/model/dsl/TextSettings;", "component2", "component3", "component4", "Lcom/bbva/component/ui/landing/access/model/LandingAccessLink;", "component5", "Lcom/bbva/component/ui/landing/access/model/LandingAccessButton;", "component6", AuthConstants.IMAGE, "greeting", "name", "extendedGreeting", DynamicLink.Builder.KEY_LINK, "button", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Lcom/bbva/component/ui/landing/access/model/LandingImage;", "getImage", "()Lcom/bbva/component/ui/landing/access/model/LandingImage;", "b", "Lcom/bbva/cells/componentkit/model/dsl/TextSettings;", "getGreeting", "()Lcom/bbva/cells/componentkit/model/dsl/TextSettings;", "c", "getName", "d", "getExtendedGreeting", "e", "Lcom/bbva/component/ui/landing/access/model/LandingAccessLink;", "getLink", "()Lcom/bbva/component/ui/landing/access/model/LandingAccessLink;", "f", "Lcom/bbva/component/ui/landing/access/model/LandingAccessButton;", "getButton", "()Lcom/bbva/component/ui/landing/access/model/LandingAccessButton;", "<init>", "(Lcom/bbva/component/ui/landing/access/model/LandingImage;Lcom/bbva/cells/componentkit/model/dsl/TextSettings;Lcom/bbva/cells/componentkit/model/dsl/TextSettings;Lcom/bbva/cells/componentkit/model/dsl/TextSettings;Lcom/bbva/component/ui/landing/access/model/LandingAccessLink;Lcom/bbva/component/ui/landing/access/model/LandingAccessButton;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/bbva/component/ui/landing/access/model/LandingImage;Lcom/bbva/cells/componentkit/model/dsl/TextSettings;Lcom/bbva/cells/componentkit/model/dsl/TextSettings;Lcom/bbva/cells/componentkit/model/dsl/TextSettings;Lcom/bbva/component/ui/landing/access/model/LandingAccessLink;Lcom/bbva/component/ui/landing/access/model/LandingAccessButton;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "component-ui-landing-access_release"}, k = 1, mv = {1, 9, 0})
@Serializable
public final /* data */ class LandingAccessConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final LandingImage image;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TextSettings greeting;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final TextSettings name;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final TextSettings extendedGreeting;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final LandingAccessLink link;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final LandingAccessButton button;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: LandingAccessConfiguration.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/component/ui/landing/access/model/LandingAccessConfiguration$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/component/ui/landing/access/model/LandingAccessConfiguration;", "component-ui-landing-access_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<LandingAccessConfiguration> serializer() {
            return LandingAccessConfiguration$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ LandingAccessConfiguration(int i10, LandingImage landingImage, TextSettings textSettings, TextSettings textSettings2, TextSettings textSettings3, LandingAccessLink landingAccessLink, LandingAccessButton landingAccessButton, SerializationConstructorMarker serializationConstructorMarker) {
        if (11 != (i10 & 11)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 11, LandingAccessConfiguration$$serializer.INSTANCE.getDescriptor());
        }
        this.image = landingImage;
        this.greeting = textSettings;
        if ((i10 & 4) == 0) {
            this.name = null;
        } else {
            this.name = textSettings2;
        }
        this.extendedGreeting = textSettings3;
        if ((i10 & 16) == 0) {
            this.link = null;
        } else {
            this.link = landingAccessLink;
        }
        if ((i10 & 32) == 0) {
            this.button = null;
        } else {
            this.button = landingAccessButton;
        }
    }

    public static /* synthetic */ LandingAccessConfiguration copy$default(LandingAccessConfiguration landingAccessConfiguration, LandingImage landingImage, TextSettings textSettings, TextSettings textSettings2, TextSettings textSettings3, LandingAccessLink landingAccessLink, LandingAccessButton landingAccessButton, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            landingImage = landingAccessConfiguration.image;
        }
        if ((i10 & 2) != 0) {
            textSettings = landingAccessConfiguration.greeting;
        }
        TextSettings textSettings4 = textSettings;
        if ((i10 & 4) != 0) {
            textSettings2 = landingAccessConfiguration.name;
        }
        TextSettings textSettings5 = textSettings2;
        if ((i10 & 8) != 0) {
            textSettings3 = landingAccessConfiguration.extendedGreeting;
        }
        TextSettings textSettings6 = textSettings3;
        if ((i10 & 16) != 0) {
            landingAccessLink = landingAccessConfiguration.link;
        }
        LandingAccessLink landingAccessLink2 = landingAccessLink;
        if ((i10 & 32) != 0) {
            landingAccessButton = landingAccessConfiguration.button;
        }
        return landingAccessConfiguration.copy(landingImage, textSettings4, textSettings5, textSettings6, landingAccessLink2, landingAccessButton);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$component_ui_landing_access_release(LandingAccessConfiguration self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeNullableSerializableElement(serialDesc, 0, LandingImage$$serializer.INSTANCE, self.image);
        TextSettings$$serializer textSettings$$serializer = TextSettings$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 1, textSettings$$serializer, self.greeting);
        boolean zShouldEncodeElementDefault = output.shouldEncodeElementDefault(serialDesc, 2);
        TextSettings textSettings = self.name;
        if (zShouldEncodeElementDefault || textSettings != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, textSettings$$serializer, textSettings);
        }
        output.encodeNullableSerializableElement(serialDesc, 3, textSettings$$serializer, self.extendedGreeting);
        boolean zShouldEncodeElementDefault2 = output.shouldEncodeElementDefault(serialDesc, 4);
        LandingAccessLink landingAccessLink = self.link;
        if (zShouldEncodeElementDefault2 || landingAccessLink != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, LandingAccessLink$$serializer.INSTANCE, landingAccessLink);
        }
        boolean zShouldEncodeElementDefault3 = output.shouldEncodeElementDefault(serialDesc, 5);
        LandingAccessButton landingAccessButton = self.button;
        if (!zShouldEncodeElementDefault3 && landingAccessButton == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, LandingAccessButton$$serializer.INSTANCE, landingAccessButton);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LandingImage getImage() {
        return this.image;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextSettings getGreeting() {
        return this.greeting;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextSettings getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TextSettings getExtendedGreeting() {
        return this.extendedGreeting;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final LandingAccessLink getLink() {
        return this.link;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final LandingAccessButton getButton() {
        return this.button;
    }

    @NotNull
    public final LandingAccessConfiguration copy(@Nullable LandingImage image, @NotNull TextSettings greeting, @Nullable TextSettings name, @Nullable TextSettings extendedGreeting, @Nullable LandingAccessLink link, @Nullable LandingAccessButton button) {
        Intrinsics.checkNotNullParameter(greeting, "greeting");
        return new LandingAccessConfiguration(image, greeting, name, extendedGreeting, link, button);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LandingAccessConfiguration)) {
            return false;
        }
        LandingAccessConfiguration landingAccessConfiguration = (LandingAccessConfiguration) other;
        return Intrinsics.areEqual(this.image, landingAccessConfiguration.image) && Intrinsics.areEqual(this.greeting, landingAccessConfiguration.greeting) && Intrinsics.areEqual(this.name, landingAccessConfiguration.name) && Intrinsics.areEqual(this.extendedGreeting, landingAccessConfiguration.extendedGreeting) && Intrinsics.areEqual(this.link, landingAccessConfiguration.link) && Intrinsics.areEqual(this.button, landingAccessConfiguration.button);
    }

    @Nullable
    public final LandingAccessButton getButton() {
        return this.button;
    }

    @Nullable
    public final TextSettings getExtendedGreeting() {
        return this.extendedGreeting;
    }

    @NotNull
    public final TextSettings getGreeting() {
        return this.greeting;
    }

    @Nullable
    public final LandingImage getImage() {
        return this.image;
    }

    @Nullable
    public final LandingAccessLink getLink() {
        return this.link;
    }

    @Nullable
    public final TextSettings getName() {
        return this.name;
    }

    public int hashCode() {
        LandingImage landingImage = this.image;
        int iHashCode = (this.greeting.hashCode() + ((landingImage == null ? 0 : landingImage.hashCode()) * 31)) * 31;
        TextSettings textSettings = this.name;
        int iHashCode2 = (iHashCode + (textSettings == null ? 0 : textSettings.hashCode())) * 31;
        TextSettings textSettings2 = this.extendedGreeting;
        int iHashCode3 = (iHashCode2 + (textSettings2 == null ? 0 : textSettings2.hashCode())) * 31;
        LandingAccessLink landingAccessLink = this.link;
        int iHashCode4 = (iHashCode3 + (landingAccessLink == null ? 0 : landingAccessLink.hashCode())) * 31;
        LandingAccessButton landingAccessButton = this.button;
        return iHashCode4 + (landingAccessButton != null ? landingAccessButton.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LandingAccessConfiguration(image=" + this.image + ", greeting=" + this.greeting + ", name=" + this.name + ", extendedGreeting=" + this.extendedGreeting + ", link=" + this.link + ", button=" + this.button + ")";
    }

    public LandingAccessConfiguration(@Nullable LandingImage landingImage, @NotNull TextSettings greeting, @Nullable TextSettings textSettings, @Nullable TextSettings textSettings2, @Nullable LandingAccessLink landingAccessLink, @Nullable LandingAccessButton landingAccessButton) {
        Intrinsics.checkNotNullParameter(greeting, "greeting");
        this.image = landingImage;
        this.greeting = greeting;
        this.name = textSettings;
        this.extendedGreeting = textSettings2;
        this.link = landingAccessLink;
        this.button = landingAccessButton;
    }

    public /* synthetic */ LandingAccessConfiguration(LandingImage landingImage, TextSettings textSettings, TextSettings textSettings2, TextSettings textSettings3, LandingAccessLink landingAccessLink, LandingAccessButton landingAccessButton, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(landingImage, textSettings, (i10 & 4) != 0 ? null : textSettings2, textSettings3, (i10 & 16) != 0 ? null : landingAccessLink, (i10 & 32) != 0 ? null : landingAccessButton);
    }
}
