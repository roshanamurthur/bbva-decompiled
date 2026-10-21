package com.google.firebase.platforminfo;

import android.content.Context;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Dependency;
import kg.a;
import kg.c;

/* JADX INFO: loaded from: classes10.dex */
public class LibraryVersionComponent {

    public interface VersionExtractor<T> {
        String extract(T t10);
    }

    public static Component<?> create(String str, String str2) {
        return Component.intoSet(new a(str, str2), (Class<a>) c.class);
    }

    public static Component<?> fromContext(final String str, final VersionExtractor<Context> versionExtractor) {
        return Component.intoSetBuilder(c.class).add(Dependency.required((Class<?>) Context.class)).factory(new ComponentFactory() { // from class: kg.d
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return new a(str, versionExtractor.extract((Context) componentContainer.get(Context.class)));
            }
        }).build();
    }
}
