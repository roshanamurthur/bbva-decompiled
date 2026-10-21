package p5;

import com.bbva.component.ui.login.credentials.LoginCredentialsView;
import com.bbva.component.ui.login.model.DocumentItem;
import com.bbva.component.ui.login.view.DocumentSelectorView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LoginCredentialsView.kt */
/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.bbva.component.ui.login.credentials.LoginCredentialsView$updateInputTypeSelector$2", f = "LoginCredentialsView.kt", i = {}, l = {145}, m = "invokeSuspend", n = {}, s = {})
public final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f92569p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ LoginCredentialsView f92570q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ DocumentSelectorView f92571r0;

    /* JADX INFO: compiled from: LoginCredentialsView.kt */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ DocumentSelectorView f92572p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LoginCredentialsView f92573q0;

        public a(DocumentSelectorView documentSelectorView, LoginCredentialsView loginCredentialsView) {
            this.f92572p0 = documentSelectorView;
            this.f92573q0 = loginCredentialsView;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            DocumentItem documentItem = (DocumentItem) obj;
            this.f92572p0.setText(documentItem.getName());
            if (documentItem.getTag().length() > 0) {
                this.f92573q0.getLoginButton().setVisibility(0);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(LoginCredentialsView loginCredentialsView, DocumentSelectorView documentSelectorView, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f92570q0 = loginCredentialsView;
        this.f92571r0 = documentSelectorView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new f(this.f92570q0, this.f92571r0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f92569p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            LoginCredentialsView loginCredentialsView = this.f92570q0;
            Flow<DocumentItem> documentSelectorState = loginCredentialsView.getViewModel().getDocumentSelectorState();
            a aVar = new a(this.f92571r0, loginCredentialsView);
            this.f92569p0 = 1;
            if (documentSelectorState.collect(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
