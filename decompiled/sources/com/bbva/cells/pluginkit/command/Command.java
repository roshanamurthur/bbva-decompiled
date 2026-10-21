package com.bbva.cells.pluginkit.command;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.cells.pluginkit.command.model.CommandResult;
import com.bbva.cells.pluginkit.command.model.Errors;
import com.bbva.cells.pluginkit.command.model.Void;
import com.bbva.cells.pluginkit.postmessage.PostMessenger;
import com.bbva.cells.pluginkit.provider.PlatformProvider;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Command.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B'\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#\u0012\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010%¢\u0006\u0004\b'\u0010(J\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0001\u0010\u0001\u0018\u0001H\u0086\bJ\u001d\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR2\u0010\u000f\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e\u0012\u0004\u0012\u00020\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001d\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {"Lcom/bbva/cells/pluginkit/command/Command;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lcom/bbva/cells/pluginkit/command/DependencyProvider;", "inject", "", "raw", "Lcom/bbva/cells/pluginkit/command/model/CommandResult;", "executeAction", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "params", "execute", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lkotlin/reflect/KClass;", "components", "Ljava/util/Map;", "getComponents", "()Ljava/util/Map;", "setComponents", "(Ljava/util/Map;)V", "Lcom/bbva/cells/pluginkit/provider/PlatformProvider;", "platformProvider", "Lcom/bbva/cells/pluginkit/provider/PlatformProvider;", "getPlatformProvider", "()Lcom/bbva/cells/pluginkit/provider/PlatformProvider;", "setPlatformProvider", "(Lcom/bbva/cells/pluginkit/provider/PlatformProvider;)V", "Lcom/bbva/cells/pluginkit/postmessage/PostMessenger;", "postMessenger", "Lcom/bbva/cells/pluginkit/postmessage/PostMessenger;", "getPostMessenger", "()Lcom/bbva/cells/pluginkit/postmessage/PostMessenger;", "setPostMessenger", "(Lcom/bbva/cells/pluginkit/postmessage/PostMessenger;)V", "Lkotlinx/serialization/KSerializer;", "serializer", "Lcom/bbva/cells/pluginkit/command/ParamsValidator;", "validator", "<init>", "(Lkotlinx/serialization/KSerializer;Lcom/bbva/cells/pluginkit/command/ParamsValidator;)V", "pluginkit_release"}, k = 1, mv = {1, 4, 1})
public abstract class Command<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KSerializer<T> f26808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ParamsValidator<T> f26809b;
    public Map<KClass<?>, ? extends Object> components;
    public PlatformProvider platformProvider;
    public PostMessenger postMessenger;

    public Command(@NotNull KSerializer<T> serializer, @Nullable ParamsValidator<T> paramsValidator) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f26808a = serializer;
        this.f26809b = paramsValidator;
    }

    @Nullable
    public abstract Object execute(T t10, @NotNull Continuation<? super CommandResult> continuation);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Nullable
    public final Object executeAction(@Nullable String str, @NotNull Continuation<? super CommandResult> continuation) {
        try {
            Object objDecodeFromString = str != null ? Json.INSTANCE.decodeFromString(this.f26808a, str) : Void.INSTANCE;
            ParamsValidator<T> paramsValidator = this.f26809b;
            return (paramsValidator == 0 || paramsValidator.isValid(objDecodeFromString)) ? execute(objDecodeFromString, continuation) : new CommandResult.Error(Errors.ErrorMalformedParam);
        } catch (Exception unused) {
            return new CommandResult.Error(Errors.ErrorMalformedParam);
        }
    }

    @NotNull
    public final Map<KClass<?>, Object> getComponents() {
        Map<KClass<?>, ? extends Object> map = this.components;
        if (map == null) {
            Intrinsics.throwUninitializedPropertyAccessException("components");
        }
        return map;
    }

    @NotNull
    public final PlatformProvider getPlatformProvider() {
        PlatformProvider platformProvider = this.platformProvider;
        if (platformProvider == null) {
            Intrinsics.throwUninitializedPropertyAccessException("platformProvider");
        }
        return platformProvider;
    }

    @NotNull
    public final PostMessenger getPostMessenger() {
        PostMessenger postMessenger = this.postMessenger;
        if (postMessenger == null) {
            Intrinsics.throwUninitializedPropertyAccessException("postMessenger");
        }
        return postMessenger;
    }

    public final /* synthetic */ <T> DependencyProvider<T> inject() {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new DependencyProvider<>(Reflection.getOrCreateKotlinClass(Object.class), new Function0<Map<KClass<?>, ? extends Object>>() { // from class: com.bbva.cells.pluginkit.command.Command.inject.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Map<KClass<?>, ? extends Object> invoke() {
                return Command.this.getComponents();
            }
        });
    }

    public final void setComponents(@NotNull Map<KClass<?>, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.components = map;
    }

    public final void setPlatformProvider(@NotNull PlatformProvider platformProvider) {
        Intrinsics.checkNotNullParameter(platformProvider, "<set-?>");
        this.platformProvider = platformProvider;
    }

    public final void setPostMessenger(@NotNull PostMessenger postMessenger) {
        Intrinsics.checkNotNullParameter(postMessenger, "<set-?>");
        this.postMessenger = postMessenger;
    }

    public /* synthetic */ Command(KSerializer kSerializer, ParamsValidator paramsValidator, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kSerializer, (i10 & 2) != 0 ? null : paramsValidator);
    }
}
