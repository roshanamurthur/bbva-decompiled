package com.bbva.plugin.naturalauthentication.command;

import android.app.Activity;
import androidx.appcompat.widget.w1;
import androidx.camera.core.z;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.androidtoolkit.optional.Optional;
import com.bbva.androidtoolkit.optional.function.Consumer;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.ErrorMessage;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.ethermobilesdk.naturalauthentication.NaturalAuthentication;
import com.bbva.plugin.naturalauthentication.command.FidoCommand;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoSession;
import ib.m;
import ib.n;
import k0.e;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FidoCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b\u001a\u0010\u001bJo\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072M\u0010\u0013\u001aI\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\tJw\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072M\u0010\u0013\u001aI\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\tJR\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u000528\u0010\u0013\u001a4\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00120\u0016¨\u0006\u001c"}, d2 = {"Lcom/bbva/plugin/naturalauthentication/command/FidoCommand;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "Lcom/bbva/androidtoolkit/plugin/response/ErrorMessage;", "error", "", Constants.backendRequestUserId, "Lkotlin/Function3;", "Lcom/bbva/ethermobilesdk/naturalauthentication/NaturalAuthentication;", "Lkotlin/ParameterName;", "name", "client", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Lcom/bbva/sl/ar/android/secsdk/fido/model/FidoSession;", "session", "", "block", "withAuthClient", "tenant", "Lkotlin/Function2;", "withClient", "Ljava/lang/Class;", "clazz", "<init>", "(Ljava/lang/Class;)V", "naturalauthentication-plugin_release"}, k = 1, mv = {2, 0, 0})
public abstract class FidoCommand<T> extends AbstractCommand<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Lazy f35867p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Lazy f35868q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FidoCommand(@NotNull Class<T> clazz) {
        super(clazz);
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        this.f35867p0 = LazyKt__LazyJVMKt.lazy(new m());
        this.f35868q0 = LazyKt__LazyJVMKt.lazy(new n());
    }

    public static /* synthetic */ void withAuthClient$default(FidoCommand fidoCommand, CommandCallback commandCallback, ErrorMessage errorMessage, String str, Function3 function3, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: withAuthClient");
        }
        if ((i10 & 2) != 0) {
            errorMessage = Errors.ErrorDefault;
        }
        fidoCommand.withAuthClient(commandCallback, errorMessage, str, function3);
    }

    public static /* synthetic */ void withClient$default(FidoCommand fidoCommand, CommandCallback commandCallback, ErrorMessage errorMessage, Function2 function2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: withClient");
        }
        if ((i10 & 2) != 0) {
            errorMessage = Errors.ErrorDefault;
        }
        fidoCommand.withClient(commandCallback, errorMessage, function2);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ib.i] */
    public final void withAuthClient(@NotNull CommandCallback callback, @NotNull ErrorMessage error, @NotNull final String userId, @NotNull final Function3<? super NaturalAuthentication, ? super Activity, ? super FidoSession, Unit> block) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            Optional<Activity> optional = this.mActivityContainer.get();
            final ?? r1 = new Function1() { // from class: ib.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Activity activity = (Activity) obj;
                    String userId2 = userId;
                    Intrinsics.checkNotNullParameter(userId2, "$userId");
                    FidoCommand this$0 = this;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Function3 block2 = block;
                    Intrinsics.checkNotNullParameter(block2, "$block");
                    FidoSession fidoSession = new FidoSession(userId2, (String) this$0.f35867p0.getValue());
                    NaturalAuthentication naturalAuthentication = (NaturalAuthentication) this$0.f35868q0.getValue();
                    Intrinsics.checkNotNull(activity);
                    block2.invoke(naturalAuthentication, activity, fidoSession);
                    return Unit.INSTANCE;
                }
            };
            optional.ifPresentOrElse(new Consumer() { // from class: ib.j
                @Override // com.bbva.androidtoolkit.optional.function.Consumer
                public final void accept(Object obj) {
                    Function1 tmp0 = r1;
                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                    tmp0.invoke(obj);
                }
            }, new w1(callback, 5));
        } catch (Exception unused) {
            callback.sendError(error);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ib.k] */
    public final void withClient(@NotNull CommandCallback callback, @NotNull ErrorMessage error, @NotNull final Function2<? super NaturalAuthentication, ? super Activity, Unit> block) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            Optional<Activity> optional = this.mActivityContainer.get();
            final ?? r1 = new Function1() { // from class: ib.k
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Activity activity = (Activity) obj;
                    Function2 block2 = block;
                    Intrinsics.checkNotNullParameter(block2, "$block");
                    FidoCommand this$0 = this;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    NaturalAuthentication naturalAuthentication = (NaturalAuthentication) this$0.f35868q0.getValue();
                    Intrinsics.checkNotNull(activity);
                    block2.invoke(naturalAuthentication, activity);
                    return Unit.INSTANCE;
                }
            };
            optional.ifPresentOrElse(new Consumer() { // from class: ib.l
                @Override // com.bbva.androidtoolkit.optional.function.Consumer
                public final void accept(Object obj) {
                    Function1 tmp0 = r1;
                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                    tmp0.invoke(obj);
                }
            }, new z(callback, 3));
        } catch (Exception unused) {
            callback.sendError(error);
        }
    }

    public static /* synthetic */ void withAuthClient$default(FidoCommand fidoCommand, CommandCallback commandCallback, ErrorMessage errorMessage, String str, String str2, Function3 function3, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: withAuthClient");
        }
        if ((i10 & 2) != 0) {
            errorMessage = Errors.ErrorDefault;
        }
        fidoCommand.withAuthClient(commandCallback, errorMessage, str, str2, function3);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ib.o] */
    public final void withAuthClient(@NotNull CommandCallback callback, @NotNull ErrorMessage error, @NotNull final String userId, @NotNull final String tenant, @NotNull final Function3<? super NaturalAuthentication, ? super Activity, ? super FidoSession, Unit> block) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(tenant, "tenant");
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            Optional<Activity> optional = this.mActivityContainer.get();
            final ?? r1 = new Function1() { // from class: ib.o
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Activity activity = (Activity) obj;
                    String userId2 = userId;
                    Intrinsics.checkNotNullParameter(userId2, "$userId");
                    String tenant2 = tenant;
                    Intrinsics.checkNotNullParameter(tenant2, "$tenant");
                    FidoCommand this$0 = this;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Function3 block2 = block;
                    Intrinsics.checkNotNullParameter(block2, "$block");
                    FidoSession fidoSession = new FidoSession(userId2, tenant2, (String) this$0.f35867p0.getValue());
                    NaturalAuthentication naturalAuthentication = (NaturalAuthentication) this$0.f35868q0.getValue();
                    Intrinsics.checkNotNull(activity);
                    block2.invoke(naturalAuthentication, activity, fidoSession);
                    return Unit.INSTANCE;
                }
            };
            optional.ifPresentOrElse(new Consumer() { // from class: ib.p
                @Override // com.bbva.androidtoolkit.optional.function.Consumer
                public final void accept(Object obj) {
                    Function1 tmp0 = r1;
                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                    tmp0.invoke(obj);
                }
            }, new e(callback, 2));
        } catch (Exception unused) {
            callback.sendError(error);
        }
    }
}
