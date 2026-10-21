package com.bbva.component.ui.login.model;

import bk.q;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.TuplesKt;
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

/* JADX INFO: compiled from: LoginCredentialsState.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B3\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b&\u0010'BC\b\u0017\u0012\u0006\u0010(\u001a\u00020\u0017\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b&\u0010+J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tJ\t\u0010\r\u001a\u00020\fHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\fHÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\fHÆ\u0001J\t\u0010\u0016\u001a\u00020\nHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001f¨\u0006."}, d2 = {"Lcom/bbva/component/ui/login/model/Accessibility;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "", "toMap", "Lcom/bbva/component/ui/login/model/ResourceType;", "component1", "component2", "component3", "component4", "description", "rightIcon", "passwordIconShow", "passwordIconHide", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Lcom/bbva/component/ui/login/model/ResourceType;", "getDescription", "()Lcom/bbva/component/ui/login/model/ResourceType;", "b", "getRightIcon", "c", "getPasswordIconShow", "d", "getPasswordIconHide", "<init>", "(Lcom/bbva/component/ui/login/model/ResourceType;Lcom/bbva/component/ui/login/model/ResourceType;Lcom/bbva/component/ui/login/model/ResourceType;Lcom/bbva/component/ui/login/model/ResourceType;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/bbva/component/ui/login/model/ResourceType;Lcom/bbva/component/ui/login/model/ResourceType;Lcom/bbva/component/ui/login/model/ResourceType;Lcom/bbva/component/ui/login/model/ResourceType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "component-ui-login_release"}, k = 1, mv = {1, 9, 0})
@Serializable
public final /* data */ class Accessibility {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ResourceType description;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final ResourceType rightIcon;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final ResourceType passwordIconShow;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final ResourceType passwordIconHide;

    /* JADX INFO: compiled from: LoginCredentialsState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/component/ui/login/model/Accessibility$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/component/ui/login/model/Accessibility;", "component-ui-login_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<Accessibility> serializer() {
            return Accessibility$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ Accessibility(int i10, ResourceType resourceType, ResourceType resourceType2, ResourceType resourceType3, ResourceType resourceType4, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i10 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 1, Accessibility$$serializer.INSTANCE.getDescriptor());
        }
        this.description = resourceType;
        if ((i10 & 2) == 0) {
            this.rightIcon = null;
        } else {
            this.rightIcon = resourceType2;
        }
        if ((i10 & 4) == 0) {
            this.passwordIconShow = null;
        } else {
            this.passwordIconShow = resourceType3;
        }
        if ((i10 & 8) == 0) {
            this.passwordIconHide = null;
        } else {
            this.passwordIconHide = resourceType4;
        }
    }

    public static /* synthetic */ Accessibility copy$default(Accessibility accessibility, ResourceType resourceType, ResourceType resourceType2, ResourceType resourceType3, ResourceType resourceType4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            resourceType = accessibility.description;
        }
        if ((i10 & 2) != 0) {
            resourceType2 = accessibility.rightIcon;
        }
        if ((i10 & 4) != 0) {
            resourceType3 = accessibility.passwordIconShow;
        }
        if ((i10 & 8) != 0) {
            resourceType4 = accessibility.passwordIconHide;
        }
        return accessibility.copy(resourceType, resourceType2, resourceType3, resourceType4);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(Accessibility self, CompositeEncoder output, SerialDescriptor serialDesc) {
        ResourceType$$serializer resourceType$$serializer = ResourceType$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 0, resourceType$$serializer, self.description);
        boolean zShouldEncodeElementDefault = output.shouldEncodeElementDefault(serialDesc, 1);
        ResourceType resourceType = self.rightIcon;
        if (zShouldEncodeElementDefault || resourceType != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, resourceType$$serializer, resourceType);
        }
        boolean zShouldEncodeElementDefault2 = output.shouldEncodeElementDefault(serialDesc, 2);
        ResourceType resourceType2 = self.passwordIconShow;
        if (zShouldEncodeElementDefault2 || resourceType2 != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, resourceType$$serializer, resourceType2);
        }
        boolean zShouldEncodeElementDefault3 = output.shouldEncodeElementDefault(serialDesc, 3);
        ResourceType resourceType3 = self.passwordIconHide;
        if (!zShouldEncodeElementDefault3 && resourceType3 == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, resourceType$$serializer, resourceType3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ResourceType getDescription() {
        return this.description;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ResourceType getRightIcon() {
        return this.rightIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ResourceType getPasswordIconShow() {
        return this.passwordIconShow;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ResourceType getPasswordIconHide() {
        return this.passwordIconHide;
    }

    @NotNull
    public final Accessibility copy(@NotNull ResourceType description, @Nullable ResourceType rightIcon, @Nullable ResourceType passwordIconShow, @Nullable ResourceType passwordIconHide) {
        Intrinsics.checkNotNullParameter(description, "description");
        return new Accessibility(description, rightIcon, passwordIconShow, passwordIconHide);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Accessibility)) {
            return false;
        }
        Accessibility accessibility = (Accessibility) other;
        return Intrinsics.areEqual(this.description, accessibility.description) && Intrinsics.areEqual(this.rightIcon, accessibility.rightIcon) && Intrinsics.areEqual(this.passwordIconShow, accessibility.passwordIconShow) && Intrinsics.areEqual(this.passwordIconHide, accessibility.passwordIconHide);
    }

    @NotNull
    public final ResourceType getDescription() {
        return this.description;
    }

    @Nullable
    public final ResourceType getPasswordIconHide() {
        return this.passwordIconHide;
    }

    @Nullable
    public final ResourceType getPasswordIconShow() {
        return this.passwordIconShow;
    }

    @Nullable
    public final ResourceType getRightIcon() {
        return this.rightIcon;
    }

    public int hashCode() {
        int iHashCode = this.description.hashCode() * 31;
        ResourceType resourceType = this.rightIcon;
        int iHashCode2 = (iHashCode + (resourceType == null ? 0 : resourceType.hashCode())) * 31;
        ResourceType resourceType2 = this.passwordIconShow;
        int iHashCode3 = (iHashCode2 + (resourceType2 == null ? 0 : resourceType2.hashCode())) * 31;
        ResourceType resourceType3 = this.passwordIconHide;
        return iHashCode3 + (resourceType3 != null ? resourceType3.hashCode() : 0);
    }

    @NotNull
    public final Map<String, Object> toMap() {
        Pair[] pairArr = new Pair[4];
        pairArr[0] = TuplesKt.to("description", this.description.toMap());
        ResourceType resourceType = this.rightIcon;
        pairArr[1] = TuplesKt.to("rightIcon", resourceType != null ? resourceType.toMap() : null);
        ResourceType resourceType2 = this.passwordIconShow;
        pairArr[2] = TuplesKt.to("passwordIconShow", resourceType2 != null ? resourceType2.toMap() : null);
        ResourceType resourceType3 = this.passwordIconHide;
        pairArr[3] = TuplesKt.to("passwordIconHide", resourceType3 != null ? resourceType3.toMap() : null);
        return q.mapOf(pairArr);
    }

    @NotNull
    public String toString() {
        return "Accessibility(description=" + this.description + ", rightIcon=" + this.rightIcon + ", passwordIconShow=" + this.passwordIconShow + ", passwordIconHide=" + this.passwordIconHide + ")";
    }

    public Accessibility(@NotNull ResourceType description, @Nullable ResourceType resourceType, @Nullable ResourceType resourceType2, @Nullable ResourceType resourceType3) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.description = description;
        this.rightIcon = resourceType;
        this.passwordIconShow = resourceType2;
        this.passwordIconHide = resourceType3;
    }

    public /* synthetic */ Accessibility(ResourceType resourceType, ResourceType resourceType2, ResourceType resourceType3, ResourceType resourceType4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(resourceType, (i10 & 2) != 0 ? null : resourceType2, (i10 & 4) != 0 ? null : resourceType3, (i10 & 8) != 0 ? null : resourceType4);
    }
}
