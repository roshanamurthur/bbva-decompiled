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

/* JADX INFO: compiled from: DefaultFidoAuthenticateCallback.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B+\u0012\"\u0010\f\u001a\u001e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\n\u0012\u0004\u0012\u00020\u00060\tj\u0002`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000f"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/callbacks/DefaultFidoAuthenticateCallback;", "Lcom/bbva/sl/ar/android/secsdk/fido/FidoSdk$FidoAuthenticateCallback;", "Lcom/bbva/sl/ar/android/secsdk/fido/model/FidoSession;", "p0", "Lcom/bbva/sl/ar/android/secsdk/fido/exception/FidoException;", "fidoException", "", "authenticateFailed", "authenticateCompleted", "Lkotlin/Function1;", "Lcom/bbva/glomoutils/Either;", "Lcom/bbva/component/dm/biometriclogin/proxy/SimpleCallback;", "block", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class DefaultFidoAuthenticateCallback implements FidoSdk.FidoAuthenticateCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function1<Either<? extends FidoException, Unit>, Unit> f27459a;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultFidoAuthenticateCallback(@NotNull Function1<? super Either<? extends FidoException, Unit>, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.f27459a = block;
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk.FidoAuthenticateCallback
    public void authenticateCompleted(@Nullable FidoSession p4) {
        this.f27459a.invoke(EitherKt.right(Unit.INSTANCE));
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk.FidoAuthenticateCallback
    public void authenticateFailed(@Nullable FidoSession p4, @NotNull FidoException fidoException) {
        Intrinsics.checkNotNullParameter(fidoException, "fidoException");
        this.f27459a.invoke(EitherKt.left(fidoException));
    }
}
