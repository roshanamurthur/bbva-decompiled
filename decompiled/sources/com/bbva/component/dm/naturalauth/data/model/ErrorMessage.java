package com.bbva.component.dm.naturalauth.data.model;

import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.constants.PushConstants;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.Transient;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ResponseErrorMessage.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232B/\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0004\b,\u0010-B9\b\u0017\u0012\u0006\u0010.\u001a\u00020\u0015\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b,\u00101J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\tHÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\rHÆ\u0003J7\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\t2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\rHÆ\u0001J\t\u0010\u0014\u001a\u00020\tHÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001dR&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u001d¨\u00064"}, d2 = {"Lcom/bbva/component/dm/naturalauth/data/model/ErrorMessage;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "component2", "component3", "", "component4", "code", "message", "type", "parameters", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "b", "getMessage", "c", "getType", "d", "Ljava/util/List;", "getParameters", "()Ljava/util/List;", "getParameters$annotations", "()V", "e", "Lkotlin/Lazy;", "getClientSdkCode", "clientSdkCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "component-dm-naturalauth_release"}, k = 1, mv = {1, 9, 0})
@Serializable
public final /* data */ class ErrorMessage {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String code;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String message;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String type;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<String> parameters;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy clientSdkCode;

    /* JADX INFO: compiled from: ResponseErrorMessage.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/component/dm/naturalauth/data/model/ErrorMessage$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/component/dm/naturalauth/data/model/ErrorMessage;", "component-dm-naturalauth_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<ErrorMessage> serializer() {
            return ErrorMessage$$serializer.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ResponseErrorMessage.kt */
    public static final class a extends Lambda implements Function0<String> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return l.replace$default((String) CollectionsKt___CollectionsKt.last(StringsKt__StringsKt.split$default((CharSequence) ErrorMessage.this.getMessage(), new String[]{"#"}, false, 0, 6, (Object) null)), " ", PushConstants.GE_PARAMS_SEPARATOR, false, 4, (Object) null);
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ ErrorMessage(int i10, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i10 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 7, ErrorMessage$$serializer.INSTANCE.getDescriptor());
        }
        this.code = str;
        this.message = str2;
        this.type = str3;
        this.parameters = CollectionsKt__CollectionsKt.emptyList();
        this.clientSdkCode = LazyKt__LazyJVMKt.lazy(new a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ErrorMessage copy$default(ErrorMessage errorMessage, String str, String str2, String str3, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = errorMessage.code;
        }
        if ((i10 & 2) != 0) {
            str2 = errorMessage.message;
        }
        if ((i10 & 4) != 0) {
            str3 = errorMessage.type;
        }
        if ((i10 & 8) != 0) {
            list = errorMessage.parameters;
        }
        return errorMessage.copy(str, str2, str3, list);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(ErrorMessage self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.code);
        output.encodeStringElement(serialDesc, 1, self.message);
        output.encodeStringElement(serialDesc, 2, self.type);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final List<String> component4() {
        return this.parameters;
    }

    @NotNull
    public final ErrorMessage copy(@NotNull String code, @NotNull String message, @NotNull String type, @NotNull List<String> parameters) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        return new ErrorMessage(code, message, type, parameters);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorMessage)) {
            return false;
        }
        ErrorMessage errorMessage = (ErrorMessage) other;
        return Intrinsics.areEqual(this.code, errorMessage.code) && Intrinsics.areEqual(this.message, errorMessage.message) && Intrinsics.areEqual(this.type, errorMessage.type) && Intrinsics.areEqual(this.parameters, errorMessage.parameters);
    }

    @NotNull
    public final String getClientSdkCode() {
        return (String) this.clientSdkCode.getValue();
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final List<String> getParameters() {
        return this.parameters;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.parameters.hashCode() + n1.c(this.type, n1.c(this.message, this.code.hashCode() * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ErrorMessage(code=");
        sb2.append(this.code);
        sb2.append(", message=");
        sb2.append(this.message);
        sb2.append(", type=");
        sb2.append(this.type);
        sb2.append(", parameters=");
        return androidx.camera.core.imagecapture.a.c(sb2, this.parameters, ")");
    }

    public ErrorMessage(@NotNull String code, @NotNull String message, @NotNull String type, @NotNull List<String> parameters) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.code = code;
        this.message = message;
        this.type = type;
        this.parameters = parameters;
        this.clientSdkCode = LazyKt__LazyJVMKt.lazy(new a());
    }

    public /* synthetic */ ErrorMessage(String str, String str2, String str3, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i10 & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }

    @Transient
    public static /* synthetic */ void getParameters$annotations() {
    }
}
