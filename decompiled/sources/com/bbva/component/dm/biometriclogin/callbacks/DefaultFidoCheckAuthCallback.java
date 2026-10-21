package com.bbva.component.dm.biometriclogin.callbacks;

import com.bbva.glomoutils.Either;
import com.bbva.glomoutils.EitherKt;
import com.bbva.sl.ar.android.secsdk.fido.FidoSdk;
import com.bbva.sl.ar.android.secsdk.fido.exception.FidoException;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoSession;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DefaultFidoCheckAuthCallback.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B+\u0012\"\u0010\u000f\u001a\u001e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\r\u0012\u0004\u0012\u00020\u00060\fj\u0002`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001a\u0010\u000b\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u0012"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/callbacks/DefaultFidoCheckAuthCallback;", "Lcom/bbva/sl/ar/android/secsdk/fido/FidoSdk$FidoCheckAuthenticateCallback;", "Lcom/bbva/sl/ar/android/secsdk/fido/model/FidoSession;", "fidoSession", "", "canAuthenticate", "", "checkCompleted", "p0", "Lcom/bbva/sl/ar/android/secsdk/fido/exception/FidoException;", "fidoException", "checkFailed", "Lkotlin/Function1;", "Lcom/bbva/glomoutils/Either;", "Lcom/bbva/component/dm/biometriclogin/proxy/BooleanCallback;", "block", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class DefaultFidoCheckAuthCallback implements FidoSdk.FidoCheckAuthenticateCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function1<Either<? extends FidoException, Boolean>, Unit> f27460a;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultFidoCheckAuthCallback(@NotNull Function1<? super Either<? extends FidoException, Boolean>, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.f27460a = block;
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk.FidoCheckAuthenticateCallback
    public void checkCompleted(@Nullable FidoSession fidoSession, boolean canAuthenticate) {
        this.f27460a.invoke(EitherKt.right(Boolean.valueOf(canAuthenticate)));
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk.FidoCheckAuthenticateCallback
    public void checkFailed(@Nullable FidoSession p4, @NotNull FidoException fidoException) {
        Intrinsics.checkNotNullParameter(fidoException, "fidoException");
        this.f27460a.invoke(EitherKt.left(fidoException));
    }
}
