package com.bbva.component.ui.login.credentials;

import com.bbva.cells.componentkit.ActionSpec;
import com.bbva.cells.componentkit.JsonDeserializer;
import com.bbva.cells.componentkit.ViewModel;
import com.bbva.component.ui.login.credentials.documentlist.DocumentListSelector;
import com.bbva.component.ui.login.handler.FormValidatorHandler;
import com.bbva.component.ui.login.model.DocumentItem;
import com.bbva.component.ui.login.model.DocumentListConfig;
import com.bbva.component.ui.login.model.DocumentSelector;
import com.bbva.component.ui.login.model.InputFieldData;
import com.bbva.component.ui.login.model.InputFieldDataKt;
import com.bbva.component.ui.login.model.InputFieldIdentifier;
import com.bbva.component.ui.login.model.InputFormResult;
import com.bbva.component.ui.login.model.LoginCredentialsState;
import com.bbva.component.ui.login.model.LoginResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LoginCredentialsViewModel.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*B\u0017\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0005J\u000e\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\u0003J\u000e\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0011\u001a\u00020\u0003J\u0006\u0010\u0012\u001a\u00020\u0003R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00138\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006+"}, d2 = {"Lcom/bbva/component/ui/login/credentials/LoginCredentialsFormViewModel;", "Lcom/bbva/cells/componentkit/ViewModel;", "Lcom/bbva/component/ui/login/model/LoginCredentialsState;", "", "initialize", "Lcom/bbva/component/ui/login/model/InputFieldData;", "formFieldData", "addFormFieldData", "input", "onTextChange", "", "length", "onDataInsertedLengthChange", "onButtonLoginEnabled", "Lcom/bbva/component/ui/login/model/DocumentSelector;", "documentSelector", "onDocumentSelectorTapped", "onRememberedPasswordTaped", "onLoginButtonTaped", "Lkotlinx/coroutines/flow/Flow;", "Lcom/bbva/component/ui/login/credentials/LoginEvent;", "y0", "Lkotlinx/coroutines/flow/Flow;", "getOnEvents", "()Lkotlinx/coroutines/flow/Flow;", "onEvents", "Lcom/bbva/component/ui/login/model/DocumentItem;", "F0", "getDocumentSelectorState", "documentSelectorState", "Lkotlinx/coroutines/flow/StateFlow;", "", "G0", "Lkotlinx/coroutines/flow/StateFlow;", "isFormValid", "()Lkotlinx/coroutines/flow/StateFlow;", "Lcom/bbva/component/ui/login/handler/FormValidatorHandler;", "formValidatorHandler", "Lcom/bbva/component/ui/login/credentials/documentlist/DocumentListSelector;", "documentListSelector", "<init>", "(Lcom/bbva/component/ui/login/handler/FormValidatorHandler;Lcom/bbva/component/ui/login/credentials/documentlist/DocumentListSelector;)V", "Companion", "component-ui-login_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLoginCredentialsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginCredentialsViewModel.kt\ncom/bbva/component/ui/login/credentials/LoginCredentialsFormViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,104:1\n1549#2:105\n1620#2,3:106\n*S KotlinDebug\n*F\n+ 1 LoginCredentialsViewModel.kt\ncom/bbva/component/ui/login/credentials/LoginCredentialsFormViewModel\n*L\n79#1:105\n79#1:106,3\n*E\n"})
public final class LoginCredentialsFormViewModel extends ViewModel<LoginCredentialsState> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final ActionSpec<LoginEvent> H0 = new ActionSpec<>("login-event");

    @NotNull
    public final MutableStateFlow<DocumentItem> E0;

    @NotNull
    public final StateFlow F0;

    /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
    @NotNull
    public final StateFlow<Boolean> isFormValid;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public final FormValidatorHandler f28479w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public final DocumentListSelector f28480x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Flow<LoginEvent> onEvents;

    /* JADX INFO: compiled from: LoginCredentialsViewModel.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/component/ui/login/credentials/LoginCredentialsFormViewModel$Companion;", "", "()V", "loginEvent", "Lcom/bbva/cells/componentkit/ActionSpec;", "Lcom/bbva/component/ui/login/credentials/LoginEvent;", "getLoginEvent", "()Lcom/bbva/cells/componentkit/ActionSpec;", "component-ui-login_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ActionSpec<LoginEvent> getLoginEvent() {
            return LoginCredentialsFormViewModel.H0;
        }
    }

    /* JADX INFO: compiled from: LoginCredentialsViewModel.kt */
    public static final class a extends Lambda implements Function1<DocumentItem, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DocumentItem documentItem) {
            DocumentItem it = documentItem;
            Intrinsics.checkNotNullParameter(it, "it");
            LoginCredentialsFormViewModel loginCredentialsFormViewModel = LoginCredentialsFormViewModel.this;
            loginCredentialsFormViewModel.E0.setValue(it);
            loginCredentialsFormViewModel.f28479w0.onDocumentListSelectorChange(it.getName());
            loginCredentialsFormViewModel.fire(LoginCredentialsFormViewModel.INSTANCE.getLoginEvent(), new LoginEvent.OnItemListSelected(it));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginCredentialsFormViewModel(@NotNull FormValidatorHandler formValidatorHandler, @NotNull DocumentListSelector documentListSelector) {
        super(new JsonDeserializer(LoginCredentialsState.INSTANCE.serializer()));
        Intrinsics.checkNotNullParameter(formValidatorHandler, "formValidatorHandler");
        Intrinsics.checkNotNullParameter(documentListSelector, "documentListSelector");
        this.f28479w0 = formValidatorHandler;
        this.f28480x0 = documentListSelector;
        this.onEvents = events(H0);
        MutableStateFlow<DocumentItem> MutableStateFlow = StateFlowKt.MutableStateFlow(new DocumentItem("", ""));
        this.E0 = MutableStateFlow;
        this.F0 = FlowKt.asStateFlow(MutableStateFlow);
        this.isFormValid = formValidatorHandler.isFormValid();
    }

    public final void addFormFieldData(@NotNull InputFieldData formFieldData) {
        Intrinsics.checkNotNullParameter(formFieldData, "formFieldData");
        this.f28479w0.addFormFieldData(formFieldData);
    }

    @NotNull
    public final Flow<DocumentItem> getDocumentSelectorState() {
        return this.F0;
    }

    @NotNull
    public final Flow<LoginEvent> getOnEvents() {
        return this.onEvents;
    }

    public final void initialize() {
        this.E0.setValue(new DocumentItem("", ""));
        this.f28479w0.initialize();
    }

    @NotNull
    public final StateFlow<Boolean> isFormValid() {
        return this.isFormValid;
    }

    public final void onButtonLoginEnabled() {
        fire(H0, LoginEvent.LoginButtonEnabled.INSTANCE);
    }

    public final void onDataInsertedLengthChange(int length) {
        fire(H0, new LoginEvent.OnPasswordDataInsertedLength(length));
    }

    public final void onDocumentSelectorTapped(@NotNull DocumentSelector documentSelector) {
        Intrinsics.checkNotNullParameter(documentSelector, "documentSelector");
        DocumentListConfig documentListConfig = documentSelector.getDocumentListConfig();
        DocumentListSelector documentListSelector = this.f28480x0;
        documentListSelector.setup(documentListConfig);
        Unit unit = Unit.INSTANCE;
        documentListSelector.show(new a());
    }

    public final void onLoginButtonTaped() {
        InputFieldIdentifier inputFieldIdentifier = InputFieldIdentifier.DOCUMENT_TYPE;
        DocumentItem selectedItem = this.f28480x0.getSelectedItem();
        String tag = selectedItem != null ? selectedItem.getTag() : null;
        if (tag == null) {
            tag = "";
        }
        InputFormResult inputFormResult = new InputFormResult(inputFieldIdentifier, tag);
        List<InputFieldData> listDataResult = this.f28479w0.dataResult();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listDataResult, 10));
        Iterator<T> it = listDataResult.iterator();
        while (it.hasNext()) {
            arrayList.add(InputFieldDataKt.inputFormResult((InputFieldData) it.next()));
        }
        fire(H0, new LoginEvent.OnLoginButtonTaped(new LoginResult((List) CollectionsKt___CollectionsKt.toCollection(arrayList, inputFormResult.getValue().length() > 0 ? CollectionsKt__CollectionsKt.mutableListOf(inputFormResult) : new ArrayList()))));
    }

    public final void onRememberedPasswordTaped() {
        fire(H0, LoginEvent.OnRememberedPasswordTaped.INSTANCE);
    }

    public final void onTextChange(@NotNull InputFieldData input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.f28479w0.onEditTextChange(input);
    }
}
