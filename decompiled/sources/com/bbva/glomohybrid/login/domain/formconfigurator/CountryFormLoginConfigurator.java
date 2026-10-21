package com.bbva.glomohybrid.login.domain.formconfigurator;

import android.content.Context;
import androidx.annotation.StringRes;
import com.bbva.cells.componentkit.model.dsl.Resource;
import com.bbva.cells.componentkit.model.dsl.ResourceId;
import com.bbva.component.ui.login.model.Accessibility;
import com.bbva.component.ui.login.model.ButtonLink;
import com.bbva.component.ui.login.model.InputFieldConfig;
import com.bbva.component.ui.login.model.InputFieldIdentifier;
import com.bbva.component.ui.login.model.InputForm;
import com.bbva.component.ui.login.model.ResourceType;
import com.bbva.component.ui.login.model.Validations;
import com.bbva.glomohybrid.login.R;
import com.bbva.glomohybrid.login.domain.usecase.FetchLoginFeatureFlagsModelUseCase;
import com.mastercard.sonic.StatusCode;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CountryFormLoginConfigurator.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006H\u0016R!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0019"}, d2 = {"Lcom/bbva/glomohybrid/login/domain/formconfigurator/CountryFormLoginConfigurator;", "Lcom/bbva/glomohybrid/login/domain/formconfigurator/FormLoginConfigurator;", "", "textResource", "Lcom/bbva/component/ui/login/model/ButtonLink;", "configureRememberedPassword", "Lcom/bbva/component/ui/login/model/InputFieldConfig;", "inputPassword", "Lcom/bbva/component/ui/login/model/InputFieldIdentifier;", "identifier", "inputFieldConfig", "", "Lcom/bbva/component/ui/login/model/InputForm;", "updateInputForm", "c", "Lkotlin/Lazy;", "getInputsForm", "()Ljava/util/List;", "inputsForm", "Landroid/content/Context;", "context", "Lcom/bbva/glomohybrid/login/domain/usecase/FetchLoginFeatureFlagsModelUseCase;", "featureFlagsModelUseCase", "<init>", "(Landroid/content/Context;Lcom/bbva/glomohybrid/login/domain/usecase/FetchLoginFeatureFlagsModelUseCase;)V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCountryFormLoginConfigurator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryFormLoginConfigurator.kt\ncom/bbva/glomohybrid/login/domain/formconfigurator/CountryFormLoginConfigurator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,113:1\n800#2,11:114\n223#2,2:125\n*S KotlinDebug\n*F\n+ 1 CountryFormLoginConfigurator.kt\ncom/bbva/glomohybrid/login/domain/formconfigurator/CountryFormLoginConfigurator\n*L\n34#1:114,11\n35#1:125,2\n*E\n"})
public final class CountryFormLoginConfigurator implements FormLoginConfigurator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f33367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final FetchLoginFeatureFlagsModelUseCase f33368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy inputsForm;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f33370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Lazy f33371e;

    /* JADX INFO: compiled from: CountryFormLoginConfigurator.kt */
    public static final class a extends Lambda implements Function0<InputFieldConfig> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final InputFieldConfig invoke() {
            CountryFormLoginConfigurator countryFormLoginConfigurator = CountryFormLoginConfigurator.this;
            String string = countryFormLoginConfigurator.f33367a.getString(R.string.login_password_name);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            ResourceType resourceType = new ResourceType("literal", string);
            String string2 = countryFormLoginConfigurator.f33367a.getString(R.string.login_wrong_password_length);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            Validations validations = new Validations(".{0}|.{6,10}", false, new ResourceType("literal", string2));
            String string3 = countryFormLoginConfigurator.f33367a.getString(R.string.login_invalid_password_chars);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return new InputFieldConfig(InputFieldIdentifier.PASSWORD, resourceType, true, "customPassword", 10, (String) null, "[a-zA-Z0-9]+", CollectionsKt__CollectionsKt.listOf((Object[]) new Validations[]{new Validations("\\w*", false, new ResourceType("literal", string3)), validations}), (Accessibility) null, false, StatusCode.SUCCESS, (DefaultConstructorMarker) null);
        }
    }

    /* JADX INFO: compiled from: CountryFormLoginConfigurator.kt */
    public static final class b extends Lambda implements Function0<InputFieldConfig> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final InputFieldConfig invoke() {
            CountryFormLoginConfigurator countryFormLoginConfigurator = CountryFormLoginConfigurator.this;
            String string = countryFormLoginConfigurator.f33367a.getString(R.string.login_identity_card);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            ResourceType resourceType = new ResourceType("literal", string);
            String string2 = countryFormLoginConfigurator.f33367a.getString(R.string.login_wrong_username_length);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            Validations validations = new Validations(".{0}|.{10}", false, new ResourceType("literal", string2));
            String string3 = countryFormLoginConfigurator.f33367a.getString(R.string.login_invalid_username_characters);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return new InputFieldConfig(InputFieldIdentifier.PHONE, resourceType, false, "number", 10, "## ########", (String) null, CollectionsKt__CollectionsKt.listOf((Object[]) new Validations[]{validations, new Validations("\\d*", false, new ResourceType("literal", string3))}), (Accessibility) null, false, 832, (DefaultConstructorMarker) null);
        }
    }

    /* JADX INFO: compiled from: CountryFormLoginConfigurator.kt */
    public static final class c extends Lambda implements Function0<List<? extends InputFieldConfig>> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends InputFieldConfig> invoke() {
            CountryFormLoginConfigurator countryFormLoginConfigurator = CountryFormLoginConfigurator.this;
            return CollectionsKt__CollectionsKt.listOf((Object[]) new InputFieldConfig[]{CountryFormLoginConfigurator.access$getConfigurePhoneNumber(countryFormLoginConfigurator), CountryFormLoginConfigurator.access$getConfigurePassword(countryFormLoginConfigurator)});
        }
    }

    public CountryFormLoginConfigurator(@NotNull Context context, @NotNull FetchLoginFeatureFlagsModelUseCase featureFlagsModelUseCase) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(featureFlagsModelUseCase, "featureFlagsModelUseCase");
        this.f33367a = context;
        this.f33368b = featureFlagsModelUseCase;
        this.inputsForm = LazyKt__LazyJVMKt.lazy(new c());
        this.f33370d = LazyKt__LazyJVMKt.lazy(new a());
        this.f33371e = LazyKt__LazyJVMKt.lazy(new b());
    }

    public static final InputFieldConfig access$getConfigurePassword(CountryFormLoginConfigurator countryFormLoginConfigurator) {
        return (InputFieldConfig) countryFormLoginConfigurator.f33370d.getValue();
    }

    public static final InputFieldConfig access$getConfigurePhoneNumber(CountryFormLoginConfigurator countryFormLoginConfigurator) {
        return (InputFieldConfig) countryFormLoginConfigurator.f33371e.getValue();
    }

    @Override // com.bbva.glomohybrid.login.domain.formconfigurator.FormLoginConfigurator
    @NotNull
    public ButtonLink configureRememberedPassword(@StringRes int textResource) {
        return new ButtonLink(new Resource(this.f33367a.getString(textResource), (ResourceId) null, 2, (DefaultConstructorMarker) null), this.f33368b.execute().getForgotPassword());
    }

    @Override // com.bbva.glomohybrid.login.domain.formconfigurator.FormLoginConfigurator
    @NotNull
    public List<InputForm> getInputsForm() {
        return (List) this.inputsForm.getValue();
    }

    @Override // com.bbva.glomohybrid.login.domain.formconfigurator.FormLoginConfigurator
    @NotNull
    public InputFieldConfig inputPassword() {
        List<InputForm> inputsForm = getInputsForm();
        ArrayList<InputFieldConfig> arrayList = new ArrayList();
        for (Object obj : inputsForm) {
            if (obj instanceof InputFieldConfig) {
                arrayList.add(obj);
            }
        }
        for (InputFieldConfig inputFieldConfig : arrayList) {
            if (inputFieldConfig.getInputFieldIdentifier() == InputFieldIdentifier.PASSWORD) {
                return inputFieldConfig;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // com.bbva.glomohybrid.login.domain.formconfigurator.FormLoginConfigurator
    @NotNull
    public List<InputForm> updateInputForm(@NotNull InputFieldIdentifier identifier, @NotNull InputFieldConfig inputFieldConfig) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(inputFieldConfig, "inputFieldConfig");
        return CollectionsKt__CollectionsKt.emptyList();
    }
}
