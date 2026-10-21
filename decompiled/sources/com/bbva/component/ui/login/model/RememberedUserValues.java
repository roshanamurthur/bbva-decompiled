package com.bbva.component.ui.login.model;

import ad.d;
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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RememberedUserState.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u0017\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u001cB/\b\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u0010\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001b\u0010 J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\tHÆ\u0001J\t\u0010\u000f\u001a\u00020\tHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018¨\u0006#"}, d2 = {"Lcom/bbva/component/ui/login/model/RememberedUserValues;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "component2", "document", "user", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getDocument", "()Ljava/lang/String;", "b", "getUser", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "component-ui-login_release"}, k = 1, mv = {1, 9, 0})
@Serializable
public final /* data */ class RememberedUserValues {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String document;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String user;

    /* JADX INFO: compiled from: RememberedUserState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/component/ui/login/model/RememberedUserValues$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/component/ui/login/model/RememberedUserValues;", "component-ui-login_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<RememberedUserValues> serializer() {
            return RememberedUserValues$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ RememberedUserValues(int i10, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i10 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 3, RememberedUserValues$$serializer.INSTANCE.getDescriptor());
        }
        this.document = str;
        this.user = str2;
    }

    public static /* synthetic */ RememberedUserValues copy$default(RememberedUserValues rememberedUserValues, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = rememberedUserValues.document;
        }
        if ((i10 & 2) != 0) {
            str2 = rememberedUserValues.user;
        }
        return rememberedUserValues.copy(str, str2);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(RememberedUserValues self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.document);
        output.encodeStringElement(serialDesc, 1, self.user);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDocument() {
        return this.document;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUser() {
        return this.user;
    }

    @NotNull
    public final RememberedUserValues copy(@NotNull String document, @NotNull String user) {
        Intrinsics.checkNotNullParameter(document, "document");
        Intrinsics.checkNotNullParameter(user, "user");
        return new RememberedUserValues(document, user);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RememberedUserValues)) {
            return false;
        }
        RememberedUserValues rememberedUserValues = (RememberedUserValues) other;
        return Intrinsics.areEqual(this.document, rememberedUserValues.document) && Intrinsics.areEqual(this.user, rememberedUserValues.user);
    }

    @NotNull
    public final String getDocument() {
        return this.document;
    }

    @NotNull
    public final String getUser() {
        return this.user;
    }

    public int hashCode() {
        return this.user.hashCode() + (this.document.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("RememberedUserValues(document=");
        sb2.append(this.document);
        sb2.append(", user=");
        return d.f(sb2, this.user, ")");
    }

    public RememberedUserValues(@NotNull String document, @NotNull String user) {
        Intrinsics.checkNotNullParameter(document, "document");
        Intrinsics.checkNotNullParameter(user, "user");
        this.document = document;
        this.user = user;
    }
}
