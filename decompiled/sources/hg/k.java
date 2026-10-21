package hg;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.iid.Registrar;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@21.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class k implements ComponentFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f69440a = new k();

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        return Registrar.lambda$getComponents$1$Registrar(componentContainer);
    }
}
