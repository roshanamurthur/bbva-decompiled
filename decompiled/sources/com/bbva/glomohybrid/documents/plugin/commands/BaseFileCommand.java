package com.bbva.glomohybrid.documents.plugin.commands;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.glomohybrid.documents.common.model.CannotOpenFileException;
import com.bbva.glomohybrid.documents.common.model.DefaultOpenDocumentException;
import com.bbva.glomohybrid.documents.common.model.LocalFile;
import com.bbva.glomohybrid.documents.common.model.OpenDocumentException;
import com.bbva.glomohybrid.documents.plugin.Injector;
import com.bbva.glomohybrid.documents.plugin.model.DocumentDTO;
import com.bbva.glomoutils.Either;
import com.bbva.glomoutils.EitherKt;
import com.bbva.glomoutils.scheduler.ThreadDispatchers;
import com.bbva.glomoutils.usecase.UseCaseWithParams;
import com.cells.validator.ValidatorChecker;
import java.io.File;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: BaseFileCommand.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B#\u0012\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,\u0012\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000.¢\u0006\u0004\b0\u00101J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0004¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0014J'\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00028\u0000H¤@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0014J\f\u0010\u0019\u001a\u00020\u0018*\u00020\u0017H\u0004R\u001a\u0010\u001f\u001a\u00020\u001a8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010%\u001a\u00020 8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R&\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00180&8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\u0082\u0002\u0004\n\u0002\b\u0019¨\u00062"}, d2 = {"Lcom/bbva/glomohybrid/documents/plugin/commands/BaseFileCommand;", "Lcom/bbva/glomohybrid/documents/plugin/model/DocumentDTO;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "params", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "", "execute", "(Lcom/bbva/glomohybrid/documents/plugin/model/DocumentDTO;Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;)V", "postExecute", "", "throwable", "Lorg/json/JSONObject;", "mapUseCaseError", "param", "Lcom/bbva/glomoutils/Either;", "Ljava/io/File;", "fetchFile", "(Lcom/bbva/glomohybrid/documents/plugin/model/DocumentDTO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/glomohybrid/documents/common/model/LocalFile;", "file", "openFile", "Landroidx/lifecycle/LifecycleOwner;", "", "isStarted", "Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;", "p0", "Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;", "getDispatchers", "()Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;", "dispatchers", "Lkotlinx/coroutines/CoroutineScope;", "q0", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lcom/bbva/glomoutils/usecase/UseCaseWithParams;", "r0", "Lcom/bbva/glomoutils/usecase/UseCaseWithParams;", "getOpenFileUseCase", "()Lcom/bbva/glomoutils/usecase/UseCaseWithParams;", "openFileUseCase", "Ljava/lang/Class;", "clazz", "Lcom/cells/validator/ValidatorChecker;", "validator", "<init>", "(Ljava/lang/Class;Lcom/cells/validator/ValidatorChecker;)V", "gl-documents_release"}, k = 1, mv = {1, 9, 0})
public abstract class BaseFileCommand<T extends DocumentDTO> extends AbstractCommand<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ThreadDispatchers dispatchers;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CoroutineScope coroutineScope;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final UseCaseWithParams<LocalFile, Boolean> openFileUseCase;

    /* JADX INFO: compiled from: BaseFileCommand.kt */
    public static final class a extends Lambda implements Function1<Activity, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ BaseFileCommand<T> f32099p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ T f32100q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f32101r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(BaseFileCommand<T> baseFileCommand, T t10, CommandCallback commandCallback) {
            super(1);
            this.f32099p0 = baseFileCommand;
            this.f32100q0 = t10;
            this.f32101r0 = commandCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Activity activity) {
            this.f32099p0.postExecute(this.f32100q0, this.f32101r0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: BaseFileCommand.kt */
    public static final class b extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f32102p0 = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: BaseFileCommand.kt */
    public static final class c extends Lambda implements Function0<JSONObject> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f32103p0 = new c(0);

        @Override // kotlin.jvm.functions.Function0
        public final JSONObject invoke() {
            return CannotOpenFileException.INSTANCE.getPayloadError();
        }
    }

    /* JADX INFO: compiled from: BaseFileCommand.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.documents.plugin.commands.BaseFileCommand$postExecute$1", f = "BaseFileCommand.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nBaseFileCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseFileCommand.kt\ncom/bbva/glomohybrid/documents/plugin/commands/BaseFileCommand$postExecute$1\n+ 2 Either.kt\ncom/bbva/glomoutils/EitherKt\n*L\n1#1,85:1\n53#2,3:86\n60#2,3:89\n39#2,5:92\n*S KotlinDebug\n*F\n+ 1 BaseFileCommand.kt\ncom/bbva/glomohybrid/documents/plugin/commands/BaseFileCommand$postExecute$1\n*L\n54#1:86,3\n55#1:89,3\n56#1:92,5\n*E\n"})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f32104p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ BaseFileCommand<T> f32105q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ T f32106r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f32107s0;

        /* JADX INFO: compiled from: BaseFileCommand.kt */
        @DebugMetadata(c = "com.bbva.glomohybrid.documents.plugin.commands.BaseFileCommand$postExecute$1$1", f = "BaseFileCommand.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Either<? extends Throwable, ? extends File>>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public int f32108p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ BaseFileCommand<T> f32109q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ T f32110r0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(BaseFileCommand<T> baseFileCommand, T t10, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f32109q0 = baseFileCommand;
                this.f32110r0 = t10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.f32109q0, this.f32110r0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Either<? extends Throwable, ? extends File>> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i10 = this.f32108p0;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f32108p0 = 1;
                    obj = this.f32109q0.fetchFile(this.f32110r0, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(BaseFileCommand<T> baseFileCommand, T t10, CommandCallback commandCallback, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f32105q0 = baseFileCommand;
            this.f32106r0 = t10;
            this.f32107s0 = commandCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new d(this.f32105q0, this.f32106r0, this.f32107s0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f32104p0;
            T t10 = this.f32106r0;
            BaseFileCommand<T> baseFileCommand = this.f32105q0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher coroutineDispatcherIo = baseFileCommand.getDispatchers().io();
                a aVar = new a(baseFileCommand, t10, null);
                this.f32104p0 = 1;
                obj = BuildersKt.withContext(coroutineDispatcherIo, aVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Either<JSONObject, Unit> eitherOpenFile = (Either) obj;
            if (!(eitherOpenFile instanceof Either.Right)) {
                if (!(eitherOpenFile instanceof Either.Left)) {
                    throw new NoWhenBranchMatchedException();
                }
                eitherOpenFile = EitherKt.left(baseFileCommand.mapUseCaseError((Throwable) ((Either.Left) eitherOpenFile).getError()));
            }
            if (eitherOpenFile instanceof Either.Right) {
                eitherOpenFile = baseFileCommand.openFile(new LocalFile((File) ((Either.Right) eitherOpenFile).getValue(), t10.getMimeType()));
            } else if (!(eitherOpenFile instanceof Either.Left)) {
                throw new NoWhenBranchMatchedException();
            }
            boolean z10 = eitherOpenFile instanceof Either.Right;
            CommandCallback commandCallback = this.f32107s0;
            if (z10) {
                commandCallback.sendEvent();
            } else if (eitherOpenFile instanceof Either.Left) {
                commandCallback.sendError((JSONObject) ((Either.Left) eitherOpenFile).getError());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseFileCommand(@NotNull Class<T> clazz, @NotNull ValidatorChecker<T> validator) {
        super(clazz, validator);
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(validator, "validator");
        Injector injector = Injector.INSTANCE;
        ThreadDispatchers threadDispatcher = injector.getThreadDispatcher();
        this.dispatchers = threadDispatcher;
        this.coroutineScope = CoroutineScopeKt.CoroutineScope(threadDispatcher.main());
        this.openFileUseCase = injector.getUseCaseFactory().openFileUseCase();
    }

    @Nullable
    public abstract Object fetchFile(@NotNull T t10, @NotNull Continuation<? super Either<? extends Throwable, ? extends File>> continuation);

    @NotNull
    public final CoroutineScope getCoroutineScope() {
        return this.coroutineScope;
    }

    @NotNull
    public final ThreadDispatchers getDispatchers() {
        return this.dispatchers;
    }

    @NotNull
    public final UseCaseWithParams<LocalFile, Boolean> getOpenFileUseCase() {
        return this.openFileUseCase;
    }

    public final boolean isStarted(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<this>");
        return CollectionsKt__CollectionsKt.listOf((Object[]) new Lifecycle.State[]{Lifecycle.State.RESUMED, Lifecycle.State.STARTED}).contains(lifecycleOwner.getLifecycle().getF21906d());
    }

    @NotNull
    public JSONObject mapUseCaseError(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return throwable instanceof OpenDocumentException ? ((OpenDocumentException) throwable).getPayloadError() : DefaultOpenDocumentException.INSTANCE.getPayloadError();
    }

    @NotNull
    public Either<JSONObject, Unit> openFile(@NotNull LocalFile file) {
        Intrinsics.checkNotNullParameter(file, "file");
        Either.Companion companion = Either.INSTANCE;
        ComponentCallbacks2 componentCallbacks2 = this.mActivityContainer.get().get();
        Intrinsics.checkNotNull(componentCallbacks2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        return companion.cond(isStarted((LifecycleOwner) componentCallbacks2) && this.openFileUseCase.execute(file).booleanValue(), b.f32102p0, c.f32103p0);
    }

    public final void postExecute(@NotNull T params, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new d(this, params, callback, null), 3, null);
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@NotNull T params, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.mActivityContainer.get().ifPresentOrElse(new q8.a(new a(this, params, callback), 0), new q8.b(0, callback));
    }
}
