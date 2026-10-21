package com.bbva.cells.pluginkit.postmessage;

import androidx.camera.core.impl.a;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.model.constants.BanxicoConstants;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Model.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 &*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002'&B'\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b \u0010!BC\b\u0017\u0012\u0006\u0010\"\u001a\u00020\u0010\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b \u0010%J\t\u0010\u0004\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0007\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ>\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00028\u0000HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\n\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u0017\u0010\f\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\b¨\u0006("}, d2 = {"Lcom/bbva/cells/pluginkit/postmessage/PostMessageContent;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "component1", "component2", "component3", "component4", "()Ljava/lang/Object;", "pluginName", "origin", "action", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/bbva/cells/pluginkit/postmessage/PostMessageContent;", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getPluginName", "()Ljava/lang/String;", "b", "getOrigin", "c", "getAction", "d", "Ljava/lang/Object;", "getPayload", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "pluginkit_release"}, k = 1, mv = {1, 4, 1})
@Serializable
public final /* data */ class PostMessageContent<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String pluginName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String origin;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String action;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final T payload;

    /* JADX INFO: compiled from: Model.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00050\u0004\"\u0004\b\u0001\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0004HÆ\u0001¨\u0006\b"}, d2 = {"Lcom/bbva/cells/pluginkit/postmessage/PostMessageContent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/cells/pluginkit/postmessage/PostMessageContent;", "T0", "typeSerial0", "pluginkit_release"}, k = 1, mv = {1, 4, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <T0> KSerializer<PostMessageContent<T0>> serializer(@NotNull KSerializer<T0> typeSerial0) {
            Intrinsics.checkNotNullParameter(typeSerial0, "typeSerial0");
            return new PostMessageContent$$serializer(typeSerial0);
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ PostMessageContent(int i10, String str, String str2, String str3, T t10, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 1) == 0) {
            throw new MissingFieldException("pluginName");
        }
        this.pluginName = str;
        if ((i10 & 2) == 0) {
            throw new MissingFieldException("origin");
        }
        this.origin = str2;
        if ((i10 & 4) == 0) {
            throw new MissingFieldException("action");
        }
        this.action = str3;
        if ((i10 & 8) == 0) {
            throw new MissingFieldException(BanxicoConstants.KEY_HISTORICAL_PAYLOAD);
        }
        this.payload = t10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PostMessageContent copy$default(PostMessageContent postMessageContent, String str, String str2, String str3, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            str = postMessageContent.pluginName;
        }
        if ((i10 & 2) != 0) {
            str2 = postMessageContent.origin;
        }
        if ((i10 & 4) != 0) {
            str3 = postMessageContent.action;
        }
        if ((i10 & 8) != 0) {
            obj = postMessageContent.payload;
        }
        return postMessageContent.copy(str, str2, str3, obj);
    }

    @JvmStatic
    public static final <T0> void write$Self(@NotNull PostMessageContent<T0> self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc, @NotNull KSerializer<T0> typeSerial0) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        Intrinsics.checkNotNullParameter(typeSerial0, "typeSerial0");
        output.encodeStringElement(serialDesc, 0, self.pluginName);
        output.encodeStringElement(serialDesc, 1, self.origin);
        output.encodeStringElement(serialDesc, 2, self.action);
        output.encodeSerializableElement(serialDesc, 3, typeSerial0, self.payload);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPluginName() {
        return this.pluginName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOrigin() {
        return this.origin;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    public final T component4() {
        return this.payload;
    }

    @NotNull
    public final PostMessageContent<T> copy(@NotNull String pluginName, @NotNull String origin, @NotNull String action, T payload) {
        Intrinsics.checkNotNullParameter(pluginName, "pluginName");
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(action, "action");
        return new PostMessageContent<>(pluginName, origin, action, payload);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostMessageContent)) {
            return false;
        }
        PostMessageContent postMessageContent = (PostMessageContent) other;
        return Intrinsics.areEqual(this.pluginName, postMessageContent.pluginName) && Intrinsics.areEqual(this.origin, postMessageContent.origin) && Intrinsics.areEqual(this.action, postMessageContent.action) && Intrinsics.areEqual(this.payload, postMessageContent.payload);
    }

    @NotNull
    public final String getAction() {
        return this.action;
    }

    @NotNull
    public final String getOrigin() {
        return this.origin;
    }

    public final T getPayload() {
        return this.payload;
    }

    @NotNull
    public final String getPluginName() {
        return this.pluginName;
    }

    public int hashCode() {
        String str = this.pluginName;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.origin;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.action;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        T t10 = this.payload;
        return iHashCode3 + (t10 != null ? t10.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PostMessageContent(pluginName=");
        sb2.append(this.pluginName);
        sb2.append(", origin=");
        sb2.append(this.origin);
        sb2.append(", action=");
        sb2.append(this.action);
        sb2.append(", payload=");
        return a.e(sb2, this.payload, ")");
    }

    public PostMessageContent(@NotNull String pluginName, @NotNull String origin, @NotNull String action, T t10) {
        Intrinsics.checkNotNullParameter(pluginName, "pluginName");
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(action, "action");
        this.pluginName = pluginName;
        this.origin = origin;
        this.action = action;
        this.payload = t10;
    }
}
