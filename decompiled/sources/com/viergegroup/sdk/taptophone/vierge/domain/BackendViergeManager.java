package com.viergegroup.sdk.taptophone.vierge.domain;

import android.app.Application;
import com.bbva.nativesettings.common.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.viergegroup.sdk.taptophone.vierge.models.BackendViergeResponseData;
import com.viergegroup.sdk.taptophone.vierge.models.MessageLectureType;
import com.viergegroup.sdk.taptophone.vierge.models.TransactionBackendParameters;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000e\u001a\u00020\u000fJ6\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f0\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000f0\u0014J6\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f0\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000f0\u0014J6\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f0\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000f0\u0014J\u001a\u0010\u001a\u001a\u00020\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f0\u0014J>\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f0\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000f0\u0014R\u0014\u0010\u0005\u001a\u00020\u0006X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0004R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/viergegroup/sdk/taptophone/vierge/domain/BackendViergeManager;", "", Constants.APPLICATION, "Landroid/app/Application;", "(Landroid/app/Application;)V", "TAG_DEBUG", "", "getTAG_DEBUG", "()Ljava/lang/String;", "getApplication", "()Landroid/app/Application;", "setApplication", "myPinpadHelper", "Lcom/viergegroup/sdk/taptophone/vierge/domain/MyPinpadHelper;", "deactiveSesion", "", "executeTransaction", "parameters", "Lcom/viergegroup/sdk/taptophone/vierge/models/TransactionBackendParameters;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "Lcom/viergegroup/sdk/taptophone/vierge/models/BackendViergeResponseData;", "onChangeUiMessageListener", "Lcom/viergegroup/sdk/taptophone/vierge/models/MessageLectureType;", "executeTransactionRefound", "executeTransactionSaleWithTip", "initalize", "selectorOfExecuteTransaction", "typeExecuteTransaction", "PinPadSdk1032_1.0.32E_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BackendViergeManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public Application f67786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MyPinpadHelper f67787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f67788c;

    public static final class a extends Lambda implements Function1<BackendViergeResponseData, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<BackendViergeResponseData, Unit> f67789p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ BackendViergeManager f67790q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(BackendViergeManager backendViergeManager, Function1 function1) {
            super(1);
            this.f67789p0 = function1;
            this.f67790q0 = backendViergeManager;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(BackendViergeResponseData backendViergeResponseData) {
            BackendViergeResponseData backendViergeResponseData2 = backendViergeResponseData;
            Intrinsics.checkNotNullParameter(backendViergeResponseData2, "");
            this.f67789p0.invoke(backendViergeResponseData2);
            MyPinpadHelper myPinpadHelper = this.f67790q0.f67787b;
            if (myPinpadHelper == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                myPinpadHelper = null;
            }
            myPinpadHelper.deactiveSession();
            return Unit.INSTANCE;
        }
    }

    public static final class b extends Lambda implements Function1<BackendViergeResponseData, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<BackendViergeResponseData, Unit> f67792q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super BackendViergeResponseData, Unit> function1) {
            super(1);
            this.f67792q0 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(BackendViergeResponseData backendViergeResponseData) {
            BackendViergeResponseData backendViergeResponseData2 = backendViergeResponseData;
            Intrinsics.checkNotNullParameter(backendViergeResponseData2, "");
            BackendViergeManager.this.getF67788c();
            backendViergeResponseData2.describeError();
            this.f67792q0.invoke(backendViergeResponseData2);
            return Unit.INSTANCE;
        }
    }

    public static final class c extends Lambda implements Function1<BackendViergeResponseData, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<BackendViergeResponseData, Unit> f67793p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ BackendViergeManager f67794q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(BackendViergeManager backendViergeManager, Function1 function1) {
            super(1);
            this.f67793p0 = function1;
            this.f67794q0 = backendViergeManager;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(BackendViergeResponseData backendViergeResponseData) {
            BackendViergeResponseData backendViergeResponseData2 = backendViergeResponseData;
            Intrinsics.checkNotNullParameter(backendViergeResponseData2, "");
            this.f67793p0.invoke(backendViergeResponseData2);
            MyPinpadHelper myPinpadHelper = this.f67794q0.f67787b;
            if (myPinpadHelper == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                myPinpadHelper = null;
            }
            myPinpadHelper.deactiveSession();
            return Unit.INSTANCE;
        }
    }

    public static final class d extends Lambda implements Function1<MessageLectureType, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<MessageLectureType, Unit> f67795p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Function1<? super MessageLectureType, Unit> function1) {
            super(1);
            this.f67795p0 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(MessageLectureType messageLectureType) {
            MessageLectureType messageLectureType2 = messageLectureType;
            Intrinsics.checkNotNullParameter(messageLectureType2, "");
            this.f67795p0.invoke(messageLectureType2);
            return Unit.INSTANCE;
        }
    }

    public static final class e extends Lambda implements Function1<MessageLectureType, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<MessageLectureType, Unit> f67796p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(Function1<? super MessageLectureType, Unit> function1) {
            super(1);
            this.f67796p0 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(MessageLectureType messageLectureType) {
            MessageLectureType messageLectureType2 = messageLectureType;
            Intrinsics.checkNotNullParameter(messageLectureType2, "");
            this.f67796p0.invoke(messageLectureType2);
            return Unit.INSTANCE;
        }
    }

    public static final class f extends Lambda implements Function1<MessageLectureType, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<MessageLectureType, Unit> f67797p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Function1<? super MessageLectureType, Unit> function1) {
            super(1);
            this.f67797p0 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(MessageLectureType messageLectureType) {
            MessageLectureType messageLectureType2 = messageLectureType;
            Intrinsics.checkNotNullParameter(messageLectureType2, "");
            this.f67797p0.invoke(messageLectureType2);
            return Unit.INSTANCE;
        }
    }

    public static final class g extends Lambda implements Function1<BackendViergeResponseData, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<BackendViergeResponseData, Unit> f67798p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ BackendViergeManager f67799q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(BackendViergeManager backendViergeManager, Function1 function1) {
            super(1);
            this.f67798p0 = function1;
            this.f67799q0 = backendViergeManager;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(BackendViergeResponseData backendViergeResponseData) {
            BackendViergeResponseData backendViergeResponseData2 = backendViergeResponseData;
            Intrinsics.checkNotNullParameter(backendViergeResponseData2, "");
            this.f67798p0.invoke(backendViergeResponseData2);
            MyPinpadHelper myPinpadHelper = this.f67799q0.f67787b;
            if (myPinpadHelper == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                myPinpadHelper = null;
            }
            myPinpadHelper.deactiveSession();
            return Unit.INSTANCE;
        }
    }

    public static final class h extends Lambda implements Function1<MessageLectureType, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<MessageLectureType, Unit> f67800p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(Function1<? super MessageLectureType, Unit> function1) {
            super(1);
            this.f67800p0 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(MessageLectureType messageLectureType) {
            MessageLectureType messageLectureType2 = messageLectureType;
            Intrinsics.checkNotNullParameter(messageLectureType2, "");
            this.f67800p0.invoke(messageLectureType2);
            return Unit.INSTANCE;
        }
    }

    public static final class i extends Lambda implements Function1<BackendViergeResponseData, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<BackendViergeResponseData, Unit> f67801p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ BackendViergeManager f67802q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(BackendViergeManager backendViergeManager, Function1 function1) {
            super(1);
            this.f67801p0 = function1;
            this.f67802q0 = backendViergeManager;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(BackendViergeResponseData backendViergeResponseData) {
            BackendViergeResponseData backendViergeResponseData2 = backendViergeResponseData;
            Intrinsics.checkNotNullParameter(backendViergeResponseData2, "");
            this.f67801p0.invoke(backendViergeResponseData2);
            MyPinpadHelper myPinpadHelper = this.f67802q0.f67787b;
            if (myPinpadHelper == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                myPinpadHelper = null;
            }
            myPinpadHelper.deactiveSession();
            return Unit.INSTANCE;
        }
    }

    public static final class j extends Lambda implements Function1<MessageLectureType, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<MessageLectureType, Unit> f67803p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(Function1<? super MessageLectureType, Unit> function1) {
            super(1);
            this.f67803p0 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(MessageLectureType messageLectureType) {
            MessageLectureType messageLectureType2 = messageLectureType;
            Intrinsics.checkNotNullParameter(messageLectureType2, "");
            this.f67803p0.invoke(messageLectureType2);
            return Unit.INSTANCE;
        }
    }

    public static final class k extends Lambda implements Function1<BackendViergeResponseData, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<BackendViergeResponseData, Unit> f67804p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ BackendViergeManager f67805q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(BackendViergeManager backendViergeManager, Function1 function1) {
            super(1);
            this.f67804p0 = function1;
            this.f67805q0 = backendViergeManager;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(BackendViergeResponseData backendViergeResponseData) {
            BackendViergeResponseData backendViergeResponseData2 = backendViergeResponseData;
            Intrinsics.checkNotNullParameter(backendViergeResponseData2, "");
            this.f67804p0.invoke(backendViergeResponseData2);
            MyPinpadHelper myPinpadHelper = this.f67805q0.f67787b;
            if (myPinpadHelper == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                myPinpadHelper = null;
            }
            myPinpadHelper.deactiveSession();
            return Unit.INSTANCE;
        }
    }

    public static final class l extends Lambda implements Function1<BackendViergeResponseData, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<BackendViergeResponseData, Unit> f67806p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ BackendViergeManager f67807q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(BackendViergeManager backendViergeManager, Function1 function1) {
            super(1);
            this.f67806p0 = function1;
            this.f67807q0 = backendViergeManager;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(BackendViergeResponseData backendViergeResponseData) {
            BackendViergeResponseData backendViergeResponseData2 = backendViergeResponseData;
            Intrinsics.checkNotNullParameter(backendViergeResponseData2, "");
            this.f67806p0.invoke(backendViergeResponseData2);
            MyPinpadHelper myPinpadHelper = this.f67807q0.f67787b;
            if (myPinpadHelper == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                myPinpadHelper = null;
            }
            myPinpadHelper.deactiveSession();
            return Unit.INSTANCE;
        }
    }

    public static final class m extends Lambda implements Function1<MessageLectureType, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<MessageLectureType, Unit> f67808p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public m(Function1<? super MessageLectureType, Unit> function1) {
            super(1);
            this.f67808p0 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(MessageLectureType messageLectureType) {
            MessageLectureType messageLectureType2 = messageLectureType;
            Intrinsics.checkNotNullParameter(messageLectureType2, "");
            this.f67808p0.invoke(messageLectureType2);
            return Unit.INSTANCE;
        }
    }

    public static final class n extends Lambda implements Function1<MessageLectureType, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<MessageLectureType, Unit> f67809p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public n(Function1<? super MessageLectureType, Unit> function1) {
            super(1);
            this.f67809p0 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(MessageLectureType messageLectureType) {
            MessageLectureType messageLectureType2 = messageLectureType;
            Intrinsics.checkNotNullParameter(messageLectureType2, "");
            this.f67809p0.invoke(messageLectureType2);
            return Unit.INSTANCE;
        }
    }

    public static final class o extends Lambda implements Function1<BackendViergeResponseData, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<BackendViergeResponseData, Unit> f67810p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ BackendViergeManager f67811q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(BackendViergeManager backendViergeManager, Function1 function1) {
            super(1);
            this.f67810p0 = function1;
            this.f67811q0 = backendViergeManager;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(BackendViergeResponseData backendViergeResponseData) {
            BackendViergeResponseData backendViergeResponseData2 = backendViergeResponseData;
            Intrinsics.checkNotNullParameter(backendViergeResponseData2, "");
            this.f67810p0.invoke(backendViergeResponseData2);
            MyPinpadHelper myPinpadHelper = this.f67811q0.f67787b;
            if (myPinpadHelper == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                myPinpadHelper = null;
            }
            myPinpadHelper.deactiveSession();
            return Unit.INSTANCE;
        }
    }

    public BackendViergeManager(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        this.f67786a = application;
        this.f67788c = "ROKD";
    }

    public final void deactiveSesion() {
        MyPinpadHelper myPinpadHelper = this.f67787b;
        if (myPinpadHelper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            myPinpadHelper = null;
        }
        myPinpadHelper.deactiveSession();
    }

    public final void executeTransaction(@NotNull TransactionBackendParameters parameters, @NotNull Function1<? super BackendViergeResponseData, Unit> listener, @NotNull Function1<? super MessageLectureType, Unit> onChangeUiMessageListener) {
        Intrinsics.checkNotNullParameter(parameters, "");
        Intrinsics.checkNotNullParameter(listener, "");
        Intrinsics.checkNotNullParameter(onChangeUiMessageListener, "");
        MyPinpadHelper myPinpadHelper = this.f67787b;
        if (myPinpadHelper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            myPinpadHelper = null;
        }
        myPinpadHelper.executeTransaction(parameters, new a(this, listener), new j(onChangeUiMessageListener));
    }

    public final void executeTransactionRefound(@NotNull TransactionBackendParameters parameters, @NotNull Function1<? super BackendViergeResponseData, Unit> listener, @NotNull Function1<? super MessageLectureType, Unit> onChangeUiMessageListener) {
        Intrinsics.checkNotNullParameter(parameters, "");
        Intrinsics.checkNotNullParameter(listener, "");
        Intrinsics.checkNotNullParameter(onChangeUiMessageListener, "");
        MyPinpadHelper myPinpadHelper = this.f67787b;
        if (myPinpadHelper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            myPinpadHelper = null;
        }
        myPinpadHelper.executeTransactionRefound(parameters, new k(this, listener), new f(onChangeUiMessageListener));
    }

    public final void executeTransactionSaleWithTip(@NotNull TransactionBackendParameters parameters, @NotNull Function1<? super BackendViergeResponseData, Unit> listener, @NotNull Function1<? super MessageLectureType, Unit> onChangeUiMessageListener) {
        Intrinsics.checkNotNullParameter(parameters, "");
        Intrinsics.checkNotNullParameter(listener, "");
        Intrinsics.checkNotNullParameter(onChangeUiMessageListener, "");
        MyPinpadHelper myPinpadHelper = this.f67787b;
        if (myPinpadHelper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            myPinpadHelper = null;
        }
        myPinpadHelper.executeTransactionSaleWithTip(parameters, new i(this, listener), new n(onChangeUiMessageListener));
    }

    @NotNull
    /* JADX INFO: renamed from: getApplication, reason: from getter */
    public final Application getF67786a() {
        return this.f67786a;
    }

    @NotNull
    /* JADX INFO: renamed from: getTAG_DEBUG, reason: from getter */
    public final String getF67788c() {
        return this.f67788c;
    }

    public final void initalize(@NotNull Function1<? super BackendViergeResponseData, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "");
        MyPinpadHelper myPinpadHelper = new MyPinpadHelper(this.f67786a);
        this.f67787b = myPinpadHelper;
        myPinpadHelper.createTerminal(new b(listener));
    }

    public final void selectorOfExecuteTransaction(@NotNull String typeExecuteTransaction, @NotNull TransactionBackendParameters parameters, @NotNull Function1<? super BackendViergeResponseData, Unit> listener, @NotNull Function1<? super MessageLectureType, Unit> onChangeUiMessageListener) {
        Intrinsics.checkNotNullParameter(typeExecuteTransaction, "");
        Intrinsics.checkNotNullParameter(parameters, "");
        Intrinsics.checkNotNullParameter(listener, "");
        Intrinsics.checkNotNullParameter(onChangeUiMessageListener, "");
        MyPinpadHelper myPinpadHelper = null;
        switch (typeExecuteTransaction.hashCode()) {
            case -1850946664:
                if (typeExecuteTransaction.equals("Refund")) {
                    MyPinpadHelper myPinpadHelper2 = this.f67787b;
                    if (myPinpadHelper2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    } else {
                        myPinpadHelper = myPinpadHelper2;
                    }
                    myPinpadHelper.executeTransactionRefound(parameters, new c(this, listener), new m(onChangeUiMessageListener));
                    break;
                }
                break;
            case -1570276114:
                if (typeExecuteTransaction.equals("SalePosTip")) {
                    MyPinpadHelper myPinpadHelper3 = this.f67787b;
                    if (myPinpadHelper3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    } else {
                        myPinpadHelper = myPinpadHelper3;
                    }
                    myPinpadHelper.executeTransactionSalePosTip(parameters, new g(this, listener), new h(onChangeUiMessageListener));
                    break;
                }
                break;
            case 2569319:
                if (typeExecuteTransaction.equals("Sale")) {
                    MyPinpadHelper myPinpadHelper4 = this.f67787b;
                    if (myPinpadHelper4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    } else {
                        myPinpadHelper = myPinpadHelper4;
                    }
                    myPinpadHelper.executeTransaction(parameters, new l(this, listener), new e(onChangeUiMessageListener));
                    break;
                }
                break;
            case 313363342:
                if (typeExecuteTransaction.equals("SaleWithTip")) {
                    MyPinpadHelper myPinpadHelper5 = this.f67787b;
                    if (myPinpadHelper5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    } else {
                        myPinpadHelper = myPinpadHelper5;
                    }
                    myPinpadHelper.executeTransactionSaleWithTip(parameters, new o(this, listener), new d(onChangeUiMessageListener));
                    break;
                }
                break;
        }
    }

    public final void setApplication(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        this.f67786a = application;
    }
}
