package com.google.firebase.tracing;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRegistrarProcessor;
import com.google.firebase.tracing.FirebaseTrace;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class ComponentMonitor implements ComponentRegistrarProcessor {
    @Override // com.google.firebase.components.ComponentRegistrarProcessor
    public List<Component<?>> processRegistrar(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final Component<?> componentWithFactory : componentRegistrar.getComponents()) {
            final String name = componentWithFactory.getName();
            if (name != null) {
                componentWithFactory = componentWithFactory.withFactory(new ComponentFactory() { // from class: og.a
                    @Override // com.google.firebase.components.ComponentFactory
                    public final Object create(ComponentContainer componentContainer) {
                        String str = name;
                        Component component = componentWithFactory;
                        try {
                            FirebaseTrace.pushTrace(str);
                            return component.getFactory().create(componentContainer);
                        } finally {
                            FirebaseTrace.popTrace();
                        }
                    }
                });
            }
            arrayList.add(componentWithFactory);
        }
        return arrayList;
    }
}
