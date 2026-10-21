package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.MembersInjector;

/* JADX INFO: loaded from: classes9.dex */
public final class MembersInjectors {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a implements MembersInjector<Object> {
        private static final /* synthetic */ a[] $VALUES;
        public static final a INSTANCE;

        static {
            a aVar = new a("INSTANCE", 0);
            INSTANCE = aVar;
            $VALUES = new a[]{aVar};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        @Override // com.google.android.datatransport.runtime.dagger.MembersInjector
        public final void injectMembers(Object obj) {
            Preconditions.checkNotNull(obj, "Cannot inject members into a null reference");
        }
    }

    public static <T> MembersInjector<T> noOp() {
        return a.INSTANCE;
    }
}
