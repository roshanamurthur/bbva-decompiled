package com.bbva.component.dm.singlesignon.data.model;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.n1;
import androidx.constraintlayout.core.parser.a;
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

/* JADX INFO: compiled from: SingleSignOnRequest.kt */
/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\"#B7\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\fJ\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J!\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!HÇ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006$"}, d2 = {"Lcom/bbva/component/dm/singlesignon/data/model/SingleSignOnRequest;", "", "seen1", "", "host", "", "path", "body", "Lcom/bbva/component/dm/singlesignon/data/model/SingleSignOnBody;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lcom/bbva/component/dm/singlesignon/data/model/SingleSignOnBody;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Lcom/bbva/component/dm/singlesignon/data/model/SingleSignOnBody;)V", "getBody", "()Lcom/bbva/component/dm/singlesignon/data/model/SingleSignOnBody;", "getHost", "()Ljava/lang/String;", "getPath", "component1", "component2", "component3", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "component-dm-singlesignon_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Serializable
public final /* data */ class SingleSignOnRequest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final SingleSignOnBody body;

    @NotNull
    private final String host;

    @NotNull
    private final String path;

    /* JADX INFO: compiled from: SingleSignOnRequest.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/component/dm/singlesignon/data/model/SingleSignOnRequest$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/component/dm/singlesignon/data/model/SingleSignOnRequest;", "component-dm-singlesignon_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<SingleSignOnRequest> serializer() {
            return SingleSignOnRequest$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ SingleSignOnRequest(int i10, String str, String str2, SingleSignOnBody singleSignOnBody, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i10 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 7, SingleSignOnRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.host = str;
        this.path = str2;
        this.body = singleSignOnBody;
    }

    public static /* synthetic */ SingleSignOnRequest copy$default(SingleSignOnRequest singleSignOnRequest, String str, String str2, SingleSignOnBody singleSignOnBody, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = singleSignOnRequest.host;
        }
        if ((i10 & 2) != 0) {
            str2 = singleSignOnRequest.path;
        }
        if ((i10 & 4) != 0) {
            singleSignOnBody = singleSignOnRequest.body;
        }
        return singleSignOnRequest.copy(str, str2, singleSignOnBody);
    }

    @JvmStatic
    public static final void write$Self(@NotNull SingleSignOnRequest self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeStringElement(serialDesc, 0, self.host);
        output.encodeStringElement(serialDesc, 1, self.path);
        output.encodeSerializableElement(serialDesc, 2, SingleSignOnBody$$serializer.INSTANCE, self.body);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHost() {
        return this.host;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SingleSignOnBody getBody() {
        return this.body;
    }

    @NotNull
    public final SingleSignOnRequest copy(@NotNull String host, @NotNull String path, @NotNull SingleSignOnBody body) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(body, "body");
        return new SingleSignOnRequest(host, path, body);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SingleSignOnRequest)) {
            return false;
        }
        SingleSignOnRequest singleSignOnRequest = (SingleSignOnRequest) other;
        return Intrinsics.areEqual(this.host, singleSignOnRequest.host) && Intrinsics.areEqual(this.path, singleSignOnRequest.path) && Intrinsics.areEqual(this.body, singleSignOnRequest.body);
    }

    @NotNull
    public final SingleSignOnBody getBody() {
        return this.body;
    }

    @NotNull
    public final String getHost() {
        return this.host;
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        return this.body.hashCode() + n1.c(this.path, this.host.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.host;
        String str2 = this.path;
        SingleSignOnBody singleSignOnBody = this.body;
        StringBuilder sbC = a.c("SingleSignOnRequest(host=", str, ", path=", str2, ", body=");
        sbC.append(singleSignOnBody);
        sbC.append(")");
        return sbC.toString();
    }

    public SingleSignOnRequest(@NotNull String host, @NotNull String path, @NotNull SingleSignOnBody body) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(body, "body");
        this.host = host;
        this.path = path;
        this.body = body;
    }
}
