package androidx.webkit.internal;

import androidx.annotation.NonNull;
import androidx.webkit.ScriptHandler;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: loaded from: classes2.dex */
public class ScriptHandlerImpl extends ScriptHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ScriptHandlerBoundaryInterface f24062a;

    @NonNull
    public static ScriptHandlerImpl toScriptHandler(@NonNull InvocationHandler invocationHandler) {
        ScriptHandlerBoundaryInterface scriptHandlerBoundaryInterface = (ScriptHandlerBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(ScriptHandlerBoundaryInterface.class, invocationHandler);
        ScriptHandlerImpl scriptHandlerImpl = new ScriptHandlerImpl();
        scriptHandlerImpl.f24062a = scriptHandlerBoundaryInterface;
        return scriptHandlerImpl;
    }

    @Override // androidx.webkit.ScriptHandler
    public void remove() {
        this.f24062a.remove();
    }
}
