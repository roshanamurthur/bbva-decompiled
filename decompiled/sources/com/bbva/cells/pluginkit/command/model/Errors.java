package com.bbva.cells.pluginkit.command.model;

import com.bbva.glomohybrid.infoscreen.scratchCard.activity.ScratchcardActivity;
import com.bbva.sdkcatalog.openpay.plugin.data.error.ErrorMessages;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.EnumDescriptor;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ErrorMessage.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\u0001\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0002\u0014\u0013R!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u00038VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, d2 = {"Lcom/bbva/cells/pluginkit/command/model/Errors;", "", "Lcom/bbva/cells/pluginkit/command/model/ErrorMessage;", "Lkotlinx/serialization/KSerializer;", "serializer$delegate", "Lkotlin/Lazy;", "getSerializer", "()Lkotlinx/serialization/KSerializer;", "serializer", "", "code", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getCode", "()I", "", "message", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "Companion", "$serializer", "ErrorDefault", "ErrorCanceled", "ErrorMalformedParam", "ErrorPermissionDenied", "ErrorNotAvailable", "ErrorNotSupported", "ErrorPermissionPermanentlyDenied", "pluginkit_release"}, k = 1, mv = {1, 4, 1})
@Serializable
public enum Errors implements ErrorMessage<Errors> {
    ErrorDefault(-1, "Error"),
    ErrorCanceled(0, ScratchcardActivity.SCRATCHCARD_RESULT_CANCELED),
    ErrorMalformedParam(1, ErrorMessages.INCORRECT_PARAMETERS),
    ErrorPermissionDenied(2, "Permission Denied"),
    ErrorNotAvailable(3, "Not available"),
    ErrorNotSupported(4, "Not Supported"),
    ErrorPermissionPermanentlyDenied(5, "Permission Permanently Denied");


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int code;

    @NotNull
    private final String message;

    /* JADX INFO: renamed from: serializer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy serializer = LazyKt__LazyJVMKt.lazy(a.f26817p0);

    /* JADX INFO: compiled from: ErrorMessage.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/cells/pluginkit/command/model/Errors$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/cells/pluginkit/command/model/Errors;", "pluginkit_release"}, k = 1, mv = {1, 4, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<Errors> serializer() {
            return new GeneratedSerializer<Errors>() { // from class: com.bbva.cells.pluginkit.command.model.Errors$$serializer

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ EnumDescriptor f26816a;

                static {
                    EnumDescriptor enumDescriptor = new EnumDescriptor("com.bbva.cells.pluginkit.command.model.Errors", 7);
                    enumDescriptor.addElement("ErrorDefault", false);
                    enumDescriptor.addElement("ErrorCanceled", false);
                    enumDescriptor.addElement("ErrorMalformedParam", false);
                    enumDescriptor.addElement("ErrorPermissionDenied", false);
                    enumDescriptor.addElement("ErrorNotAvailable", false);
                    enumDescriptor.addElement("ErrorNotSupported", false);
                    enumDescriptor.addElement("ErrorPermissionPermanentlyDenied", false);
                    f26816a = enumDescriptor;
                }

                @Override // kotlinx.serialization.internal.GeneratedSerializer
                @NotNull
                public KSerializer<?>[] childSerializers() {
                    return new KSerializer[]{IntSerializer.INSTANCE, StringSerializer.INSTANCE};
                }

                @Override // kotlinx.serialization.DeserializationStrategy
                @NotNull
                public Errors deserialize(@NotNull Decoder decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return Errors.values()[decoder.decodeEnum(f26816a)];
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
                @NotNull
                public SerialDescriptor getDescriptor() {
                    return f26816a;
                }

                @Override // kotlinx.serialization.SerializationStrategy
                public void serialize(@NotNull Encoder encoder, @NotNull Errors value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeEnum(f26816a, value.ordinal());
                }

                @Override // kotlinx.serialization.internal.GeneratedSerializer
                @NotNull
                public KSerializer<?>[] typeParametersSerializers() {
                    return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
                }
            };
        }
    }

    /* JADX INFO: compiled from: ErrorMessage.kt */
    public static final class a extends Lambda implements Function0<KSerializer<Errors>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f26817p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final KSerializer<Errors> invoke() {
            return Errors.INSTANCE.serializer();
        }
    }

    Errors(int i10, String str) {
        this.code = i10;
        this.message = str;
    }

    @Override // com.bbva.cells.pluginkit.command.model.ErrorMessage
    public int getCode() {
        return this.code;
    }

    @Override // com.bbva.cells.pluginkit.command.model.ErrorMessage
    @NotNull
    public String getMessage() {
        return this.message;
    }

    @Override // com.bbva.cells.pluginkit.command.model.Serializer
    @NotNull
    public KSerializer<Errors> getSerializer() {
        return (KSerializer) this.serializer.getValue();
    }

    @Override // com.bbva.cells.pluginkit.command.model.ErrorMessage
    @NotNull
    public CommandResult toResult() {
        return ErrorMessage.DefaultImpls.toResult(this);
    }
}
