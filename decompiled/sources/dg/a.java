package dg;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.dynamiclinks.internal.FirebaseDynamicLinkRegistrar;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements ComponentFactory {
    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        return FirebaseDynamicLinkRegistrar.lambda$getComponents$0(componentContainer);
    }
}
