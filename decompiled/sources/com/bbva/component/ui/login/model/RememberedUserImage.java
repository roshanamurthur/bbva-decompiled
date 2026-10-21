package com.bbva.component.ui.login.model;

import ad.d;
import com.bbva.cells.componentkit.model.dsl.ImageSettings;
import com.bbva.cells.componentkit.model.dsl.ImageSettings$$serializer;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RememberedUserState.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B+\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\"\u0010#B9\b\u0017\u0012\u0006\u0010$\u001a\u00020\u0013\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b\"\u0010'J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\u0012\u001a\u00020\tHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001b¨\u0006*"}, d2 = {"Lcom/bbva/component/ui/login/model/RememberedUserImage;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "Lcom/bbva/cells/componentkit/model/dsl/ImageSettings;", "component2", "component3", "imageBase64", "imageId", "avatar", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getImageBase64", "()Ljava/lang/String;", "b", "Lcom/bbva/cells/componentkit/model/dsl/ImageSettings;", "getImageId", "()Lcom/bbva/cells/componentkit/model/dsl/ImageSettings;", "c", "getAvatar", "<init>", "(Ljava/lang/String;Lcom/bbva/cells/componentkit/model/dsl/ImageSettings;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/bbva/cells/componentkit/model/dsl/ImageSettings;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "component-ui-login_release"}, k = 1, mv = {1, 9, 0})
@Serializable
public final /* data */ class RememberedUserImage {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String imageBase64;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final ImageSettings imageId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String avatar;

    /* JADX INFO: compiled from: RememberedUserState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/component/ui/login/model/RememberedUserImage$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/component/ui/login/model/RememberedUserImage;", "component-ui-login_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<RememberedUserImage> serializer() {
            return RememberedUserImage$$serializer.INSTANCE;
        }
    }

    public RememberedUserImage() {
        this((String) null, (ImageSettings) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ RememberedUserImage copy$default(RememberedUserImage rememberedUserImage, String str, ImageSettings imageSettings, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = rememberedUserImage.imageBase64;
        }
        if ((i10 & 2) != 0) {
            imageSettings = rememberedUserImage.imageId;
        }
        if ((i10 & 4) != 0) {
            str2 = rememberedUserImage.avatar;
        }
        return rememberedUserImage.copy(str, imageSettings, str2);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(RememberedUserImage self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.imageBase64 != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.imageBase64);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.imageId != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, ImageSettings$$serializer.INSTANCE, self.imageId);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.avatar == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.avatar);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getImageBase64() {
        return this.imageBase64;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ImageSettings getImageId() {
        return this.imageId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    @NotNull
    public final RememberedUserImage copy(@Nullable String imageBase64, @Nullable ImageSettings imageId, @Nullable String avatar) {
        return new RememberedUserImage(imageBase64, imageId, avatar);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RememberedUserImage)) {
            return false;
        }
        RememberedUserImage rememberedUserImage = (RememberedUserImage) other;
        return Intrinsics.areEqual(this.imageBase64, rememberedUserImage.imageBase64) && Intrinsics.areEqual(this.imageId, rememberedUserImage.imageId) && Intrinsics.areEqual(this.avatar, rememberedUserImage.avatar);
    }

    @Nullable
    public final String getAvatar() {
        return this.avatar;
    }

    @Nullable
    public final String getImageBase64() {
        return this.imageBase64;
    }

    @Nullable
    public final ImageSettings getImageId() {
        return this.imageId;
    }

    public int hashCode() {
        String str = this.imageBase64;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ImageSettings imageSettings = this.imageId;
        int iHashCode2 = (iHashCode + (imageSettings == null ? 0 : imageSettings.hashCode())) * 31;
        String str2 = this.avatar;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("RememberedUserImage(imageBase64=");
        sb2.append(this.imageBase64);
        sb2.append(", imageId=");
        sb2.append(this.imageId);
        sb2.append(", avatar=");
        return d.f(sb2, this.avatar, ")");
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ RememberedUserImage(int i10, String str, ImageSettings imageSettings, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 1) == 0) {
            this.imageBase64 = null;
        } else {
            this.imageBase64 = str;
        }
        if ((i10 & 2) == 0) {
            this.imageId = null;
        } else {
            this.imageId = imageSettings;
        }
        if ((i10 & 4) == 0) {
            this.avatar = null;
        } else {
            this.avatar = str2;
        }
    }

    public RememberedUserImage(@Nullable String str, @Nullable ImageSettings imageSettings, @Nullable String str2) {
        this.imageBase64 = str;
        this.imageId = imageSettings;
        this.avatar = str2;
    }

    public /* synthetic */ RememberedUserImage(String str, ImageSettings imageSettings, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : imageSettings, (i10 & 4) != 0 ? null : str2);
    }
}
