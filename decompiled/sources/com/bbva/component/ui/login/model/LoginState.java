package com.bbva.component.ui.login.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LoginState.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B'\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b&\u0010'B9\b\u0017\u0012\u0006\u0010(\u001a\u00020\u0015\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b&\u0010+J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\rHÆ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006."}, d2 = {"Lcom/bbva/component/ui/login/model/LoginState;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "Lcom/bbva/component/ui/login/model/LoginViewType;", "component1", "Lcom/bbva/component/ui/login/model/LoginCredentialsState;", "component2", "Lcom/bbva/component/ui/login/model/RememberedUserState;", "component3", "loginType", "loginCredentialsState", "rememberedUserState", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Lcom/bbva/component/ui/login/model/LoginViewType;", "getLoginType", "()Lcom/bbva/component/ui/login/model/LoginViewType;", "b", "Lcom/bbva/component/ui/login/model/LoginCredentialsState;", "getLoginCredentialsState", "()Lcom/bbva/component/ui/login/model/LoginCredentialsState;", "c", "Lcom/bbva/component/ui/login/model/RememberedUserState;", "getRememberedUserState", "()Lcom/bbva/component/ui/login/model/RememberedUserState;", "<init>", "(Lcom/bbva/component/ui/login/model/LoginViewType;Lcom/bbva/component/ui/login/model/LoginCredentialsState;Lcom/bbva/component/ui/login/model/RememberedUserState;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/bbva/component/ui/login/model/LoginViewType;Lcom/bbva/component/ui/login/model/LoginCredentialsState;Lcom/bbva/component/ui/login/model/RememberedUserState;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "component-ui-login_release"}, k = 1, mv = {1, 9, 0})
@Serializable
public final /* data */ class LoginState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final KSerializer<Object>[] f28564d = {EnumsKt.createSimpleEnumSerializer("com.bbva.component.ui.login.model.LoginViewType", LoginViewType.values()), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LoginViewType loginType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final LoginCredentialsState loginCredentialsState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final RememberedUserState rememberedUserState;

    /* JADX INFO: compiled from: LoginState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/component/ui/login/model/LoginState$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/component/ui/login/model/LoginState;", "component-ui-login_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<LoginState> serializer() {
            return LoginState$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ LoginState(int i10, LoginViewType loginViewType, LoginCredentialsState loginCredentialsState, RememberedUserState rememberedUserState, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i10 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 1, LoginState$$serializer.INSTANCE.getDescriptor());
        }
        this.loginType = loginViewType;
        if ((i10 & 2) == 0) {
            this.loginCredentialsState = null;
        } else {
            this.loginCredentialsState = loginCredentialsState;
        }
        if ((i10 & 4) == 0) {
            this.rememberedUserState = null;
        } else {
            this.rememberedUserState = rememberedUserState;
        }
    }

    public static /* synthetic */ LoginState copy$default(LoginState loginState, LoginViewType loginViewType, LoginCredentialsState loginCredentialsState, RememberedUserState rememberedUserState, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            loginViewType = loginState.loginType;
        }
        if ((i10 & 2) != 0) {
            loginCredentialsState = loginState.loginCredentialsState;
        }
        if ((i10 & 4) != 0) {
            rememberedUserState = loginState.rememberedUserState;
        }
        return loginState.copy(loginViewType, loginCredentialsState, rememberedUserState);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(LoginState self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, f28564d[0], self.loginType);
        boolean zShouldEncodeElementDefault = output.shouldEncodeElementDefault(serialDesc, 1);
        LoginCredentialsState loginCredentialsState = self.loginCredentialsState;
        if (zShouldEncodeElementDefault || loginCredentialsState != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, LoginCredentialsState$$serializer.INSTANCE, loginCredentialsState);
        }
        boolean zShouldEncodeElementDefault2 = output.shouldEncodeElementDefault(serialDesc, 2);
        RememberedUserState rememberedUserState = self.rememberedUserState;
        if (!zShouldEncodeElementDefault2 && rememberedUserState == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, RememberedUserState$$serializer.INSTANCE, rememberedUserState);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LoginViewType getLoginType() {
        return this.loginType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LoginCredentialsState getLoginCredentialsState() {
        return this.loginCredentialsState;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final RememberedUserState getRememberedUserState() {
        return this.rememberedUserState;
    }

    @NotNull
    public final LoginState copy(@NotNull LoginViewType loginType, @Nullable LoginCredentialsState loginCredentialsState, @Nullable RememberedUserState rememberedUserState) {
        Intrinsics.checkNotNullParameter(loginType, "loginType");
        return new LoginState(loginType, loginCredentialsState, rememberedUserState);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoginState)) {
            return false;
        }
        LoginState loginState = (LoginState) other;
        return this.loginType == loginState.loginType && Intrinsics.areEqual(this.loginCredentialsState, loginState.loginCredentialsState) && Intrinsics.areEqual(this.rememberedUserState, loginState.rememberedUserState);
    }

    @Nullable
    public final LoginCredentialsState getLoginCredentialsState() {
        return this.loginCredentialsState;
    }

    @NotNull
    public final LoginViewType getLoginType() {
        return this.loginType;
    }

    @Nullable
    public final RememberedUserState getRememberedUserState() {
        return this.rememberedUserState;
    }

    public int hashCode() {
        int iHashCode = this.loginType.hashCode() * 31;
        LoginCredentialsState loginCredentialsState = this.loginCredentialsState;
        int iHashCode2 = (iHashCode + (loginCredentialsState == null ? 0 : loginCredentialsState.hashCode())) * 31;
        RememberedUserState rememberedUserState = this.rememberedUserState;
        return iHashCode2 + (rememberedUserState != null ? rememberedUserState.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LoginState(loginType=" + this.loginType + ", loginCredentialsState=" + this.loginCredentialsState + ", rememberedUserState=" + this.rememberedUserState + ")";
    }

    public LoginState(@NotNull LoginViewType loginType, @Nullable LoginCredentialsState loginCredentialsState, @Nullable RememberedUserState rememberedUserState) {
        Intrinsics.checkNotNullParameter(loginType, "loginType");
        this.loginType = loginType;
        this.loginCredentialsState = loginCredentialsState;
        this.rememberedUserState = rememberedUserState;
    }

    public /* synthetic */ LoginState(LoginViewType loginViewType, LoginCredentialsState loginCredentialsState, RememberedUserState rememberedUserState, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(loginViewType, (i10 & 2) != 0 ? null : loginCredentialsState, (i10 & 4) != 0 ? null : rememberedUserState);
    }
}
