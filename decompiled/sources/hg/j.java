package hg;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.iid.Registrar;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@21.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class j implements ComponentFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f69439a = new j();

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        return Registrar.lambda$getComponents$0$Registrar(componentContainer);
    }
}
