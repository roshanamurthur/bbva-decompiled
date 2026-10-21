package w4;

import android.os.Bundle;
import com.bbva.androidtoolkit.optional.function.Predicate;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.component.dm.biometriclogin.domain.model.BiometryAuthResult;
import com.bbva.component.dm.biometriclogin.presentation.reactions.BiometricLoginAnalyticsReactions;
import com.bbva.glomohybrid.base.activityConfigurators.ScratchcardConfiguration;
import com.bbva.glomohybrid.base.file.channels.FileInteractionChannelsKt;
import com.bbva.glomoutils.Either;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.aead.ChaCha20Poly1305Parameters;
import com.google.crypto.tink.internal.ParametersSerializer;
import com.google.crypto.tink.internal.ProtoParametersSerialization;
import com.google.crypto.tink.internal.Serialization;
import com.google.crypto.tink.proto.ChaCha20Poly1305KeyFormat;
import com.google.crypto.tink.proto.KeyTemplate;
import com.google.firebase.FirebaseException;
import com.google.firebase.appcheck.AppCheckToken;
import com.google.firebase.appcheck.internal.DefaultAppCheckTokenResult;
import com.google.firebase.storage.OnProgressListener;
import com.google.firebase.storage.StorageTask;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Predicate, Channel.BundleAdapter, Channel.ObjectAdapter, ParametersSerializer.ParametersSerializationFunction, Continuation, com.google.firebase.storage.t.a {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f94134p0;

    public /* synthetic */ a(int i10) {
        this.f94134p0 = i10;
    }

    @Override // com.google.firebase.storage.t.a
    public final void a(Object obj, StorageTask.ProvideError provideError) {
        ((OnProgressListener) obj).onProgress(provideError);
    }

    @Override // com.google.crypto.tink.internal.ParametersSerializer.ParametersSerializationFunction
    public final Serialization serializeParameters(Parameters parameters) {
        ParametersSerializer<ChaCha20Poly1305Parameters, ProtoParametersSerialization> parametersSerializer = com.google.crypto.tink.aead.d.f46549a;
        return ProtoParametersSerialization.create(KeyTemplate.newBuilder().setTypeUrl("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key").setValue(ChaCha20Poly1305KeyFormat.getDefaultInstance().toByteString()).setOutputPrefixType(com.google.crypto.tink.aead.d.a(((ChaCha20Poly1305Parameters) parameters).getVariant())).build());
    }

    @Override // com.bbva.androidtoolkit.optional.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f94134p0) {
            case 0:
                BiometricLoginAnalyticsReactions.Companion companion = BiometricLoginAnalyticsReactions.Companion;
                return ((BiometryAuthResult) obj) instanceof BiometryAuthResult.Success;
            default:
                return ((BiometryAuthResult) obj) instanceof BiometryAuthResult.AuthError;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        return task.isSuccessful() ? Tasks.forResult(DefaultAppCheckTokenResult.constructFromAppCheckToken((AppCheckToken) task.getResult())) : Tasks.forResult(DefaultAppCheckTokenResult.constructFromError(new FirebaseException(task.getException().getMessage(), task.getException())));
    }

    @Override // com.bbva.cellscore.channel.model.Channel.BundleAdapter
    public final Object transform(Bundle bundle) {
        ScratchcardConfiguration.Companion companion = ScratchcardConfiguration.INSTANCE;
        Intrinsics.checkNotNull(bundle);
        return companion.from(bundle);
    }

    @Override // com.bbva.cellscore.channel.model.Channel.ObjectAdapter
    public final Object transform(Object obj) {
        Either either = (Either) obj;
        Intrinsics.checkNotNull(either);
        return FileInteractionChannelsKt.access$toWebObject(either);
    }
}
