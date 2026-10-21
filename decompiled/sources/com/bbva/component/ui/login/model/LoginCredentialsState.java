package com.bbva.component.ui.login.model;

import androidx.camera.core.imagecapture.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LoginCredentialsState.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:BE\u0012\b\b\u0002\u0010\u0014\u001a\u00020\t\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\u0004\b4\u00105BQ\b\u0017\u0012\u0006\u00106\u001a\u00020\u001c\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\u00108\u001a\u0004\u0018\u000107¢\u0006\u0004\b4\u00109J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003JG\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0001J\t\u0010\u001b\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001cHÖ\u0001J\u0013\u0010\u001f\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0015\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001f\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u0006<"}, d2 = {"Lcom/bbva/component/ui/login/model/LoginCredentialsState;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "Lcom/bbva/component/ui/login/model/BuilderType;", "component2", "Lcom/bbva/component/ui/login/model/Button;", "component3", "Lcom/bbva/component/ui/login/model/ButtonLink;", "component4", "", "Lcom/bbva/component/ui/login/model/InputForm;", "component5", "showAnimation", "builderType", "loginButton", "rememberPassword", "inputs", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Z", "getShowAnimation", "()Z", "b", "Lcom/bbva/component/ui/login/model/BuilderType;", "getBuilderType", "()Lcom/bbva/component/ui/login/model/BuilderType;", "c", "Lcom/bbva/component/ui/login/model/Button;", "getLoginButton", "()Lcom/bbva/component/ui/login/model/Button;", "d", "Lcom/bbva/component/ui/login/model/ButtonLink;", "getRememberPassword", "()Lcom/bbva/component/ui/login/model/ButtonLink;", "e", "Ljava/util/List;", "getInputs", "()Ljava/util/List;", "<init>", "(ZLcom/bbva/component/ui/login/model/BuilderType;Lcom/bbva/component/ui/login/model/Button;Lcom/bbva/component/ui/login/model/ButtonLink;Ljava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLcom/bbva/component/ui/login/model/BuilderType;Lcom/bbva/component/ui/login/model/Button;Lcom/bbva/component/ui/login/model/ButtonLink;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "component-ui-login_release"}, k = 1, mv = {1, 9, 0})
@Serializable
public final /* data */ class LoginCredentialsState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final KSerializer<Object>[] f28556f = {null, EnumsKt.createSimpleEnumSerializer("com.bbva.component.ui.login.model.BuilderType", BuilderType.values()), null, null, new ArrayListSerializer(new PolymorphicSerializer(Reflection.getOrCreateKotlinClass(InputForm.class), new Annotation[0]))};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean showAnimation;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final BuilderType builderType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Button loginButton;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final ButtonLink rememberPassword;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final List<InputForm> inputs;

    /* JADX INFO: compiled from: LoginCredentialsState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/component/ui/login/model/LoginCredentialsState$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/component/ui/login/model/LoginCredentialsState;", "component-ui-login_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<LoginCredentialsState> serializer() {
            return LoginCredentialsState$$serializer.INSTANCE;
        }
    }

    public LoginCredentialsState() {
        this(false, (BuilderType) null, (Button) null, (ButtonLink) null, (List) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LoginCredentialsState copy$default(LoginCredentialsState loginCredentialsState, boolean z10, BuilderType builderType, Button button, ButtonLink buttonLink, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = loginCredentialsState.showAnimation;
        }
        if ((i10 & 2) != 0) {
            builderType = loginCredentialsState.builderType;
        }
        BuilderType builderType2 = builderType;
        if ((i10 & 4) != 0) {
            button = loginCredentialsState.loginButton;
        }
        Button button2 = button;
        if ((i10 & 8) != 0) {
            buttonLink = loginCredentialsState.rememberPassword;
        }
        ButtonLink buttonLink2 = buttonLink;
        if ((i10 & 16) != 0) {
            list = loginCredentialsState.inputs;
        }
        return loginCredentialsState.copy(z10, builderType2, button2, buttonLink2, list);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(LoginCredentialsState self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !self.showAnimation) {
            output.encodeBooleanElement(serialDesc, 0, self.showAnimation);
        }
        boolean zShouldEncodeElementDefault = output.shouldEncodeElementDefault(serialDesc, 1);
        KSerializer<Object>[] kSerializerArr = f28556f;
        if (zShouldEncodeElementDefault || self.builderType != BuilderType.CREATE) {
            output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.builderType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.loginButton != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, Button$$serializer.INSTANCE, self.loginButton);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.rememberPassword != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, ButtonLink$$serializer.INSTANCE, self.rememberPassword);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && Intrinsics.areEqual(self.inputs, CollectionsKt__CollectionsKt.emptyList())) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, kSerializerArr[4], self.inputs);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getShowAnimation() {
        return this.showAnimation;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BuilderType getBuilderType() {
        return this.builderType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Button getLoginButton() {
        return this.loginButton;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ButtonLink getRememberPassword() {
        return this.rememberPassword;
    }

    @Nullable
    public final List<InputForm> component5() {
        return this.inputs;
    }

    @NotNull
    public final LoginCredentialsState copy(boolean showAnimation, @NotNull BuilderType builderType, @Nullable Button loginButton, @Nullable ButtonLink rememberPassword, @Nullable List<? extends InputForm> inputs) {
        Intrinsics.checkNotNullParameter(builderType, "builderType");
        return new LoginCredentialsState(showAnimation, builderType, loginButton, rememberPassword, inputs);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoginCredentialsState)) {
            return false;
        }
        LoginCredentialsState loginCredentialsState = (LoginCredentialsState) other;
        return this.showAnimation == loginCredentialsState.showAnimation && this.builderType == loginCredentialsState.builderType && Intrinsics.areEqual(this.loginButton, loginCredentialsState.loginButton) && Intrinsics.areEqual(this.rememberPassword, loginCredentialsState.rememberPassword) && Intrinsics.areEqual(this.inputs, loginCredentialsState.inputs);
    }

    @NotNull
    public final BuilderType getBuilderType() {
        return this.builderType;
    }

    @Nullable
    public final List<InputForm> getInputs() {
        return this.inputs;
    }

    @Nullable
    public final Button getLoginButton() {
        return this.loginButton;
    }

    @Nullable
    public final ButtonLink getRememberPassword() {
        return this.rememberPassword;
    }

    public final boolean getShowAnimation() {
        return this.showAnimation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z10 = this.showAnimation;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        int iHashCode = (this.builderType.hashCode() + (r1 * 31)) * 31;
        Button button = this.loginButton;
        int iHashCode2 = (iHashCode + (button == null ? 0 : button.hashCode())) * 31;
        ButtonLink buttonLink = this.rememberPassword;
        int iHashCode3 = (iHashCode2 + (buttonLink == null ? 0 : buttonLink.hashCode())) * 31;
        List<InputForm> list = this.inputs;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("LoginCredentialsState(showAnimation=");
        sb2.append(this.showAnimation);
        sb2.append(", builderType=");
        sb2.append(this.builderType);
        sb2.append(", loginButton=");
        sb2.append(this.loginButton);
        sb2.append(", rememberPassword=");
        sb2.append(this.rememberPassword);
        sb2.append(", inputs=");
        return a.c(sb2, this.inputs, ")");
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ LoginCredentialsState(int i10, boolean z10, BuilderType builderType, Button button, ButtonLink buttonLink, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.showAnimation = (i10 & 1) == 0 ? true : z10;
        if ((i10 & 2) == 0) {
            this.builderType = BuilderType.CREATE;
        } else {
            this.builderType = builderType;
        }
        if ((i10 & 4) == 0) {
            this.loginButton = null;
        } else {
            this.loginButton = button;
        }
        if ((i10 & 8) == 0) {
            this.rememberPassword = null;
        } else {
            this.rememberPassword = buttonLink;
        }
        if ((i10 & 16) == 0) {
            this.inputs = CollectionsKt__CollectionsKt.emptyList();
        } else {
            this.inputs = list;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LoginCredentialsState(boolean z10, @NotNull BuilderType builderType, @Nullable Button button, @Nullable ButtonLink buttonLink, @Nullable List<? extends InputForm> list) {
        Intrinsics.checkNotNullParameter(builderType, "builderType");
        this.showAnimation = z10;
        this.builderType = builderType;
        this.loginButton = button;
        this.rememberPassword = buttonLink;
        this.inputs = list;
    }

    public /* synthetic */ LoginCredentialsState(boolean z10, BuilderType builderType, Button button, ButtonLink buttonLink, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? BuilderType.CREATE : builderType, (i10 & 4) != 0 ? null : button, (i10 & 8) == 0 ? buttonLink : null, (i10 & 16) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
