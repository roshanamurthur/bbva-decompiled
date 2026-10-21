package w4;

import android.database.Cursor;
import android.os.Bundle;
import com.bbva.androidtoolkit.optional.function.Predicate;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.component.dm.biometriclogin.domain.model.BiometryAuthResult;
import com.bbva.component.dm.biometriclogin.presentation.reactions.BiometricLoginAnalyticsReactions;
import com.bbva.glomohybrid.base.cells.channels.AppStartReadyChannel;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.aead.ChaCha20Poly1305Parameters;
import com.google.crypto.tink.internal.ParametersParser;
import com.google.crypto.tink.internal.ParametersSerializer;
import com.google.crypto.tink.internal.ProtoParametersSerialization;
import com.google.crypto.tink.internal.Serialization;
import com.google.crypto.tink.prf.HkdfPrfParameters;
import com.google.crypto.tink.proto.ChaCha20Poly1305KeyFormat;
import com.google.crypto.tink.proto.HkdfPrfKeyFormat;
import com.google.crypto.tink.proto.KeyTemplate;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.firebase.storage.OnPausedListener;
import com.google.firebase.storage.StorageTask;
import java.security.GeneralSecurityException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Predicate, Channel.BundleAdapter, SQLiteEventStore.a, ParametersParser.ParametersParsingFunction, ParametersSerializer.ParametersSerializationFunction, com.google.firebase.storage.t.a {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f94135p0;

    public /* synthetic */ b(int i10) {
        this.f94135p0 = i10;
    }

    @Override // com.google.firebase.storage.t.a
    public final void a(Object obj, StorageTask.ProvideError provideError) {
        ((OnPausedListener) obj).onPaused(provideError);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.a
    public final Object apply(Object obj) {
        Encoding encoding = SQLiteEventStore.f43867u0;
        return Boolean.valueOf(((Cursor) obj).getCount() > 0);
    }

    @Override // com.google.crypto.tink.internal.ParametersParser.ParametersParsingFunction
    public final Parameters parseParameters(Serialization serialization) throws GeneralSecurityException {
        ProtoParametersSerialization protoParametersSerialization = (ProtoParametersSerialization) serialization;
        ParametersSerializer<ChaCha20Poly1305Parameters, ProtoParametersSerialization> parametersSerializer = com.google.crypto.tink.aead.d.f46549a;
        if (!protoParametersSerialization.getKeyTemplate().getTypeUrl().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters: " + protoParametersSerialization.getKeyTemplate().getTypeUrl());
        }
        try {
            ChaCha20Poly1305KeyFormat.parseFrom(protoParametersSerialization.getKeyTemplate().getValue(), ExtensionRegistryLite.getEmptyRegistry());
            return ChaCha20Poly1305Parameters.create(com.google.crypto.tink.aead.d.b(protoParametersSerialization.getKeyTemplate().getOutputPrefixType()));
        } catch (InvalidProtocolBufferException e5) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e5);
        }
    }

    @Override // com.google.crypto.tink.internal.ParametersSerializer.ParametersSerializationFunction
    public final Serialization serializeParameters(Parameters parameters) {
        HkdfPrfParameters hkdfPrfParameters = (HkdfPrfParameters) parameters;
        ParametersSerializer<HkdfPrfParameters, ProtoParametersSerialization> parametersSerializer = com.google.crypto.tink.prf.a.f46848a;
        return ProtoParametersSerialization.create(KeyTemplate.newBuilder().setTypeUrl("type.googleapis.com/google.crypto.tink.HkdfPrfKey").setValue(HkdfPrfKeyFormat.newBuilder().setParams(com.google.crypto.tink.prf.a.a(hkdfPrfParameters)).setKeySize(hkdfPrfParameters.getKeySizeBytes()).build().toByteString()).setOutputPrefixType(OutputPrefixType.RAW).build());
    }

    @Override // com.bbva.androidtoolkit.optional.function.Predicate
    public final boolean test(Object obj) {
        BiometricLoginAnalyticsReactions.Companion companion = BiometricLoginAnalyticsReactions.Companion;
        return ((BiometryAuthResult) obj) instanceof BiometryAuthResult.AuthError;
    }

    @Override // com.bbva.cellscore.channel.model.Channel.BundleAdapter
    public final Object transform(Bundle bundle) {
        switch (this.f94135p0) {
            case 1:
                AppStartReadyChannel appStartReadyChannel = AppStartReadyChannel.INSTANCE;
                AppStartReadyChannel.AppReadyParams.Companion companion = AppStartReadyChannel.AppReadyParams.Companion;
                Intrinsics.checkNotNull(bundle);
                return companion.from(bundle);
            default:
                String string = bundle.getString("path", null);
                if (string == null || string.length() == 0) {
                    Result.Companion companion2 = Result.INSTANCE;
                    return Result.m5534boximpl(Result.m5535constructorimpl(ResultKt.createFailure(new Exception("Invalid path"))));
                }
                Result.Companion companion3 = Result.INSTANCE;
                Intrinsics.checkNotNull(string);
                return Result.m5534boximpl(Result.m5535constructorimpl(string));
        }
    }
}
