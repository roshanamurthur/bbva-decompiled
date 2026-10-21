package com.bbva.cells.pluginkit.provider;

import android.app.Activity;
import com.bbva.cells.pluginkit.command.model.Errors;
import com.bbva.cells.pluginkit.permission.PermissionLauncher;
import com.bbva.cells.pluginkit.permission.PermissionReport;
import com.bbva.plugin.filefetcher.command.FetchCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RestrictedAction.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\b\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u001b\u0012\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u0010\"\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00072\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\tJ!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00072\u0006\u0010\r\u001a\u00020\fH\u0094@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lcom/bbva/cells/pluginkit/provider/RestrictedAction;", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "O", "Lcom/bbva/cells/pluginkit/provider/Action;", "Lcom/bbva/cells/pluginkit/provider/PlatformProvider;", "provider", "params", "Lcom/bbva/cells/pluginkit/provider/ActionResult;", FetchCommand.ID, "(Lcom/bbva/cells/pluginkit/provider/PlatformProvider;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "components", "executeGranted", "Lcom/bbva/cells/pluginkit/permission/PermissionReport;", "report", "executeDenied", "(Lcom/bbva/cells/pluginkit/permission/PermissionReport;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "a", "[Ljava/lang/String;", "getPermissions", "()[Ljava/lang/String;", "permissions", "<init>", "([Ljava/lang/String;)V", "pluginkit_release"}, k = 1, mv = {1, 4, 1})
public abstract class RestrictedAction<I, O> implements Action<I, O> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String[] permissions;

    /* JADX INFO: compiled from: RestrictedAction.kt */
    @DebugMetadata(c = "com.bbva.cells.pluginkit.provider.RestrictedAction", f = "RestrictedAction.kt", i = {0, 0, 0}, l = {15, 18, 20}, m = "fetch$suspendImpl", n = {"this", "provider", "params"}, s = {"L$0", "L$1", "L$2"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f26858p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f26859q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public RestrictedAction f26861s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public PlatformProvider f26862t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public Object f26863u0;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f26858p0 = obj;
            this.f26859q0 |= Integer.MIN_VALUE;
            return RestrictedAction.a(RestrictedAction.this, null, null, this);
        }
    }

    public RestrictedAction(@NotNull String... permissions) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        this.permissions = permissions;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object a(RestrictedAction restrictedAction, PlatformProvider platformProvider, Object obj, Continuation continuation) {
        a aVar;
        RestrictedAction restrictedAction2;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f26859q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f26859q0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objRequest = aVar.f26858p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f26859q0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objRequest);
            Activity activity = platformProvider.getActivity();
            if (activity == null) {
                return new ActionResult.Error(Errors.ErrorNotAvailable);
            }
            PermissionLauncher permissionLauncher = platformProvider.getPermissionLauncher();
            String[] strArr = restrictedAction.permissions;
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
            aVar.f26861s0 = restrictedAction;
            aVar.f26862t0 = platformProvider;
            aVar.f26863u0 = obj;
            aVar.f26859q0 = 1;
            objRequest = permissionLauncher.request(activity, strArr2, aVar);
            if (objRequest == coroutine_suspended) {
                restrictedAction2 = restrictedAction;
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(objRequest);
                    return (ActionResult) objRequest;
                }
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objRequest);
                return (ActionResult) objRequest;
            }
            obj = aVar.f26863u0;
            platformProvider = aVar.f26862t0;
            RestrictedAction restrictedAction3 = aVar.f26861s0;
            ResultKt.throwOnFailure(objRequest);
            restrictedAction2 = restrictedAction3;
        }
        restrictedAction2 = restrictedAction;
        PermissionReport permissionReport = (PermissionReport) objRequest;
        if (permissionReport.areAllGranted()) {
            aVar.f26861s0 = null;
            aVar.f26862t0 = null;
            aVar.f26863u0 = null;
            aVar.f26859q0 = 2;
            objRequest = restrictedAction2.executeGranted(platformProvider, obj, aVar);
            if (objRequest == coroutine_suspended) {
                return coroutine_suspended;
            }
            return (ActionResult) objRequest;
        }
        aVar.f26861s0 = null;
        aVar.f26862t0 = null;
        aVar.f26863u0 = null;
        aVar.f26859q0 = 3;
        objRequest = restrictedAction2.executeDenied(permissionReport, aVar);
        if (objRequest == coroutine_suspended) {
            return coroutine_suspended;
        }
        return (ActionResult) objRequest;
    }

    @Nullable
    public Object executeDenied(@NotNull PermissionReport permissionReport, @NotNull Continuation<? super ActionResult<O>> continuation) {
        return permissionReport.hasPermanentlyDeniedAnyPermission() ? new ActionResult.Error(Errors.ErrorPermissionPermanentlyDenied) : new ActionResult.Error(Errors.ErrorPermissionDenied);
    }

    @Nullable
    public abstract Object executeGranted(@NotNull PlatformProvider platformProvider, I i10, @NotNull Continuation<? super ActionResult<O>> continuation);

    @Override // com.bbva.cells.pluginkit.provider.Action
    @Nullable
    public Object fetch(@NotNull PlatformProvider platformProvider, I i10, @NotNull Continuation<? super ActionResult<O>> continuation) {
        return a(this, platformProvider, i10, continuation);
    }

    @NotNull
    public final String[] getPermissions() {
        return this.permissions;
    }
}
