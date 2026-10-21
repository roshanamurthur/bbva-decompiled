package com.bbva.glomoconfig;

import bk.p;
import bk.q;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;

/* JADX INFO: compiled from: ComponentFactory.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J:\u0010\u0002\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0016J:\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0016J(\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00050\u00032\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J<\u0010\f\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00050\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¨\u0006\r"}, d2 = {"Lcom/bbva/glomoconfig/ComponentFactory;", "Lorg/koin/core/component/KoinComponent;", "literal", "Lkotlin/Pair;", "", "", "name", "value", "type", "resource", "visibilityItem", "visibility", "visibilityPair", "gl-config_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ComponentFactory extends KoinComponent {

    /* JADX INFO: compiled from: ComponentFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        public static Koin getKoin(@NotNull ComponentFactory componentFactory) {
            return KoinComponent.DefaultImpls.getKoin(componentFactory);
        }

        @NotNull
        public static Pair<String, Map<String, String>> literal(@NotNull ComponentFactory componentFactory, @NotNull String name, @NotNull String value, @NotNull String type) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(type, "type");
            return new Pair<>(name, q.mapOf(TuplesKt.to("type", type), TuplesKt.to("value", value)));
        }

        public static /* synthetic */ Pair literal$default(ComponentFactory componentFactory, String str, String str2, String str3, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: literal");
            }
            if ((i10 & 4) != 0) {
                str3 = "literal";
            }
            return componentFactory.literal(str, str2, str3);
        }

        @NotNull
        public static Pair<String, Map<String, String>> resource(@NotNull ComponentFactory componentFactory, @NotNull String name, @NotNull String value, @NotNull String type) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(type, "type");
            return new Pair<>(name, q.mapOf(TuplesKt.to("type", type), TuplesKt.to("value", value)));
        }

        public static /* synthetic */ Pair resource$default(ComponentFactory componentFactory, String str, String str2, String str3, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resource");
            }
            if ((i10 & 4) != 0) {
                str3 = "resource";
            }
            return componentFactory.resource(str, str2, str3);
        }

        @NotNull
        public static Pair<String, Map<String, String>> visibilityItem(@NotNull ComponentFactory componentFactory, @NotNull String visibility) {
            Intrinsics.checkNotNullParameter(visibility, "visibility");
            return new Pair<>("visibility", p.mapOf(TuplesKt.to("value", visibility)));
        }

        @NotNull
        public static Pair<String, Map<String, Map<String, String>>> visibilityPair(@NotNull ComponentFactory componentFactory, @NotNull String name, @NotNull String visibility) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(visibility, "visibility");
            return new Pair<>(name, p.mapOf(componentFactory.visibilityItem(visibility)));
        }
    }

    @NotNull
    Pair<String, Map<String, String>> literal(@NotNull String name, @NotNull String value, @NotNull String type);

    @NotNull
    Pair<String, Map<String, String>> resource(@NotNull String name, @NotNull String value, @NotNull String type);

    @NotNull
    Pair<String, Map<String, String>> visibilityItem(@NotNull String visibility);

    @NotNull
    Pair<String, Map<String, Map<String, String>>> visibilityPair(@NotNull String name, @NotNull String visibility);
}
