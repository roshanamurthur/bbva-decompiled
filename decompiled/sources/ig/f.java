package ig;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f implements ComponentFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69678a;

    public /* synthetic */ f(int i10) {
        this.f69678a = i10;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        switch (this.f69678a) {
            case 0:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(componentContainer);
            case 1:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(componentContainer);
            default:
                return FirebaseSessionsRegistrar.m5289getComponents$lambda3(componentContainer);
        }
    }
}
