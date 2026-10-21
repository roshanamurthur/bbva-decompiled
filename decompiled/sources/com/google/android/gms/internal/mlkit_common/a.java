package com.google.android.gms.internal.mlkit_common;

import android.animation.ValueAnimator;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import androidx.compose.ui.graphics.vector.PathBuilder;
import com.bbva.androidtoolkit.optional.function.Predicate;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.component.dm.biometriclogin.domain.model.BiometricErrorNavigation;
import com.bbva.component.dm.headers.interceptor.AccessToken;
import com.bbva.glomohybrid.cellsweb.presentation.channels.UserTypeChannels;
import com.bbva.glomohybrid.login.presentation.reactions.LoginReaction;
import com.bbva.glomohybrid.login.presentation.view.LoginContract;
import com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import com.google.android.material.internal.MultiViewUpdateListener;
import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.aead.XChaCha20Poly1305Parameters;
import com.google.crypto.tink.aead.e;
import com.google.crypto.tink.internal.ParametersParser;
import com.google.crypto.tink.internal.ParametersSerializer;
import com.google.crypto.tink.internal.ProtoParametersSerialization;
import com.google.crypto.tink.internal.Serialization;
import com.google.crypto.tink.proto.XChaCha20Poly1305KeyFormat;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.firebase.encoders.FieldDescriptor;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.FactoryInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.module.dsl.OptionDSLKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements Reaction.ReactionExecution, Predicate, Channel.RestoreExecutor, SQLiteEventStore.a, MultiViewUpdateListener.a, ParametersParser.ParametersParsingFunction {
    public static KoinDefinition a(Module module, FactoryInstanceFactory factoryInstanceFactory, Function1 function1) {
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static void b(int i10, int i11, ASN1ObjectIdentifier aSN1ObjectIdentifier, HashMap map, Integer num) {
        map.put(num, new XMSSMTParameters(i10, i11, aSN1ObjectIdentifier));
    }

    public static void d(int i10, FieldDescriptor.Builder builder) {
        zzay zzayVar = new zzay();
        zzayVar.zza(i10);
        builder.withProperty(zzayVar.zzb()).build();
    }

    public static void e(PathBuilder pathBuilder, float f6, float f10, float f11, float f12) {
        pathBuilder.moveTo(f6, f10);
        pathBuilder.horizontalLineToRelative(f11);
        pathBuilder.verticalLineToRelative(f12);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.a
    public Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        Encoding encoding = SQLiteEventStore.f43867u0;
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            TransportContext.Builder priority = TransportContext.builder().setBackendName(cursor.getString(1)).setPriority(PriorityMapping.valueOf(cursor.getInt(2)));
            String string = cursor.getString(3);
            arrayList.add(priority.setExtras(string == null ? null : Base64.decode(string, 0)).build());
        }
        return arrayList;
    }

    @Override // com.google.android.material.internal.MultiViewUpdateListener.a
    public void c(ValueAnimator valueAnimator, View view) {
        view.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
    public void execute(Object obj, Object obj2) {
        LoginReaction.Companion companion = LoginReaction.INSTANCE;
        ((LoginGlobalViewModel) obj).setIntent(LoginContract.Intent.LoadUserRememberedCredentials.INSTANCE);
    }

    @Override // com.bbva.cellscore.channel.model.Channel.RestoreExecutor
    public Object onRestore(Bundle bundle) {
        return (AccessToken) bundle.getParcelable(UserTypeChannels.GLOBAL_AUTH_GLOMO);
    }

    @Override // com.google.crypto.tink.internal.ParametersParser.ParametersParsingFunction
    public Parameters parseParameters(Serialization serialization) throws GeneralSecurityException {
        ProtoParametersSerialization protoParametersSerialization = (ProtoParametersSerialization) serialization;
        ParametersSerializer<XChaCha20Poly1305Parameters, ProtoParametersSerialization> parametersSerializer = e.f46554a;
        if (!protoParametersSerialization.getKeyTemplate().getTypeUrl().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters: " + protoParametersSerialization.getKeyTemplate().getTypeUrl());
        }
        try {
            XChaCha20Poly1305KeyFormat.parseFrom(protoParametersSerialization.getKeyTemplate().getValue(), ExtensionRegistryLite.getEmptyRegistry());
            return XChaCha20Poly1305Parameters.create(e.b(protoParametersSerialization.getKeyTemplate().getOutputPrefixType()));
        } catch (InvalidProtocolBufferException e5) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e5);
        }
    }

    @Override // com.bbva.androidtoolkit.optional.function.Predicate
    public boolean test(Object obj) {
        return ((BiometricErrorNavigation) obj) instanceof BiometricErrorNavigation.NotEnrolled;
    }
}
