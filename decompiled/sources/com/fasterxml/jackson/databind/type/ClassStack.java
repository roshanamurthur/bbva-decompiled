package com.fasterxml.jackson.databind.type;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.fasterxml.jackson.databind.JavaType;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public final class ClassStack {
    protected final Class<?> _current;
    protected final ClassStack _parent;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<ResolvedRecursiveType> f43454a;

    public ClassStack(Class<?> cls) {
        this(null, cls);
    }

    public void addSelfReference(ResolvedRecursiveType resolvedRecursiveType) {
        if (this.f43454a == null) {
            this.f43454a = new ArrayList<>();
        }
        this.f43454a.add(resolvedRecursiveType);
    }

    public ClassStack child(Class<?> cls) {
        return new ClassStack(this, cls);
    }

    public ClassStack find(Class<?> cls) {
        if (this._current == cls) {
            return this;
        }
        for (ClassStack classStack = this._parent; classStack != null; classStack = classStack._parent) {
            if (classStack._current == cls) {
                return classStack;
            }
        }
        return null;
    }

    public void resolveSelfReferences(JavaType javaType) {
        ArrayList<ResolvedRecursiveType> arrayList = this.f43454a;
        if (arrayList != null) {
            Iterator<ResolvedRecursiveType> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().setReference(javaType);
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[ClassStack (self-refs: ");
        ArrayList<ResolvedRecursiveType> arrayList = this.f43454a;
        sb2.append(arrayList == null ? "0" : String.valueOf(arrayList.size()));
        sb2.append(RootService.CLOSE_BRACKET);
        for (ClassStack classStack = this; classStack != null; classStack = classStack._parent) {
            sb2.append(' ');
            sb2.append(classStack._current.getName());
        }
        sb2.append(AbstractJsonLexerKt.END_LIST);
        return sb2.toString();
    }

    public ClassStack(ClassStack classStack, Class<?> cls) {
        this._parent = classStack;
        this._current = cls;
    }
}
