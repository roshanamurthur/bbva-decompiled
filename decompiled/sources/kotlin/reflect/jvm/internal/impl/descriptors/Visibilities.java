package kotlin.reflect.jvm.internal.impl.descriptors;

import bk.p;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Visibilities.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class Visibilities {

    @NotNull
    public static final Visibilities INSTANCE = new Visibilities();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Map<Visibility, Integer> f80236a;

    /* JADX INFO: compiled from: Visibilities.kt */
    public static final class Inherited extends Visibility {

        @NotNull
        public static final Inherited INSTANCE = new Inherited();

        public Inherited() {
            super("inherited", false);
        }
    }

    /* JADX INFO: compiled from: Visibilities.kt */
    public static final class Internal extends Visibility {

        @NotNull
        public static final Internal INSTANCE = new Internal();

        public Internal() {
            super("internal", false);
        }
    }

    /* JADX INFO: compiled from: Visibilities.kt */
    public static final class InvisibleFake extends Visibility {

        @NotNull
        public static final InvisibleFake INSTANCE = new InvisibleFake();

        public InvisibleFake() {
            super("invisible_fake", false);
        }
    }

    /* JADX INFO: compiled from: Visibilities.kt */
    public static final class Local extends Visibility {

        @NotNull
        public static final Local INSTANCE = new Local();

        public Local() {
            super("local", false);
        }
    }

    /* JADX INFO: compiled from: Visibilities.kt */
    public static final class Private extends Visibility {

        @NotNull
        public static final Private INSTANCE = new Private();

        public Private() {
            super("private", false);
        }
    }

    /* JADX INFO: compiled from: Visibilities.kt */
    public static final class PrivateToThis extends Visibility {

        @NotNull
        public static final PrivateToThis INSTANCE = new PrivateToThis();

        public PrivateToThis() {
            super("private_to_this", false);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        @NotNull
        public String getInternalDisplayName() {
            return "private/*private to this*/";
        }
    }

    /* JADX INFO: compiled from: Visibilities.kt */
    public static final class Protected extends Visibility {

        @NotNull
        public static final Protected INSTANCE = new Protected();

        public Protected() {
            super("protected", true);
        }
    }

    /* JADX INFO: compiled from: Visibilities.kt */
    public static final class Public extends Visibility {

        @NotNull
        public static final Public INSTANCE = new Public();

        public Public() {
            super("public", true);
        }
    }

    /* JADX INFO: compiled from: Visibilities.kt */
    public static final class Unknown extends Visibility {

        @NotNull
        public static final Unknown INSTANCE = new Unknown();

        public Unknown() {
            super("unknown", false);
        }
    }

    static {
        Map mapCreateMapBuilder = p.createMapBuilder();
        mapCreateMapBuilder.put(PrivateToThis.INSTANCE, 0);
        mapCreateMapBuilder.put(Private.INSTANCE, 0);
        mapCreateMapBuilder.put(Internal.INSTANCE, 1);
        mapCreateMapBuilder.put(Protected.INSTANCE, 1);
        mapCreateMapBuilder.put(Public.INSTANCE, 2);
        f80236a = p.build(mapCreateMapBuilder);
    }

    @Nullable
    public final Integer compareLocal$compiler_common(@NotNull Visibility first, @NotNull Visibility second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        if (first == second) {
            return 0;
        }
        Map<Visibility, Integer> map = f80236a;
        Integer num = map.get(first);
        Integer num2 = map.get(second);
        if (num == null || num2 == null || Intrinsics.areEqual(num, num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    public final boolean isPrivate(@NotNull Visibility visibility) {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        return visibility == Private.INSTANCE || visibility == PrivateToThis.INSTANCE;
    }
}
