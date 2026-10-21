package com.bbva.component.ui.login.model;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LoginState.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/bbva/component/ui/login/model/LoginState.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/bbva/component/ui/login/model/LoginState;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "component-ui-login_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
public final class LoginState$$serializer implements GeneratedSerializer<LoginState> {

    @NotNull
    public static final LoginState$$serializer INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f28568a;

    static {
        LoginState$$serializer loginState$$serializer = new LoginState$$serializer();
        INSTANCE = loginState$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bbva.component.ui.login.model.LoginState", loginState$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("loginType", false);
        pluginGeneratedSerialDescriptor.addElement("loginCredentialsState", true);
        pluginGeneratedSerialDescriptor.addElement("rememberedUserState", true);
        f28568a = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{LoginState.f28564d[0], BuiltinSerializersKt.getNullable(LoginCredentialsState$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(RememberedUserState$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public LoginState deserialize(@NotNull Decoder decoder) {
        int i10;
        LoginViewType loginViewType;
        LoginCredentialsState loginCredentialsState;
        RememberedUserState rememberedUserState;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
        KSerializer[] kSerializerArr = LoginState.f28564d;
        LoginViewType loginViewType2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            loginViewType = (LoginViewType) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 0, kSerializerArr[0], null);
            loginCredentialsState = (LoginCredentialsState) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 1, LoginCredentialsState$$serializer.INSTANCE, null);
            rememberedUserState = (RememberedUserState) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, RememberedUserState$$serializer.INSTANCE, null);
            i10 = 7;
        } else {
            boolean z10 = true;
            int i11 = 0;
            LoginCredentialsState loginCredentialsState2 = null;
            RememberedUserState rememberedUserState2 = null;
            while (z10) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    loginViewType2 = (LoginViewType) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 0, kSerializerArr[0], loginViewType2);
                    i11 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    loginCredentialsState2 = (LoginCredentialsState) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 1, LoginCredentialsState$$serializer.INSTANCE, loginCredentialsState2);
                    i11 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    rememberedUserState2 = (RememberedUserState) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, RememberedUserState$$serializer.INSTANCE, rememberedUserState2);
                    i11 |= 4;
                }
            }
            i10 = i11;
            loginViewType = loginViewType2;
            loginCredentialsState = loginCredentialsState2;
            rememberedUserState = rememberedUserState2;
        }
        compositeDecoderBeginStructure.endStructure(descriptor);
        return new LoginState(i10, loginViewType, loginCredentialsState, rememberedUserState, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f28568a;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull LoginState value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
        LoginState.write$Self(value, compositeEncoderBeginStructure, descriptor);
        compositeEncoderBeginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
