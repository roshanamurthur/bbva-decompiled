package kotlin.reflect.jvm.internal.impl.utils;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public class DFS {

    public static abstract class CollectingNodeHandler<N, R, C extends Iterable<R>> extends AbstractNodeHandler<N, C> {

        @NotNull
        protected final C result;

        public CollectingNodeHandler(@NotNull C c10) {
            if (c10 != null) {
                this.result = c10;
            } else {
                a(0);
                throw null;
            }
        }

        public static /* synthetic */ void a(int i10) {
            String str = i10 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 1 ? 3 : 2];
            if (i10 != 1) {
                objArr[0] = "result";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/DFS$CollectingNodeHandler";
            }
            if (i10 != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS$CollectingNodeHandler";
            } else {
                objArr[1] = "result";
            }
            if (i10 != 1) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 1) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
        @NotNull
        public C result() {
            C c10 = this.result;
            if (c10 != null) {
                return c10;
            }
            a(1);
            throw null;
        }
    }

    public interface Neighbors<N> {
        @NotNull
        Iterable<? extends N> getNeighbors(N n7);
    }

    public interface NodeHandler<N, R> {
        void afterChildren(N n7);

        boolean beforeChildren(N n7);

        R result();
    }

    public static abstract class NodeHandlerWithListResult<N, R> extends CollectingNodeHandler<N, R, LinkedList<R>> {
        public NodeHandlerWithListResult() {
            super(new LinkedList());
        }
    }

    public interface Visited<N> {
        boolean checkAndMarkVisited(N n7);
    }

    public static class VisitedWithSet<N> implements Visited<N> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set<N> f82097a;

        public VisitedWithSet() {
            this(new HashSet());
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Visited
        public boolean checkAndMarkVisited(N n7) {
            return this.f82097a.add(n7);
        }

        public VisitedWithSet(@NotNull Set<N> set) {
            if (set == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "visited", "kotlin/reflect/jvm/internal/impl/utils/DFS$VisitedWithSet", "<init>"));
            }
            this.f82097a = set;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [N] */
    public static class a<N> extends AbstractNodeHandler<N, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f82098a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean[] f82099b;

        public a(boolean[] zArr, Function1 function1) {
            this.f82098a = function1;
            this.f82099b = zArr;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
        public boolean beforeChildren(N n7) {
            boolean zBooleanValue = ((Boolean) this.f82098a.invoke(n7)).booleanValue();
            boolean[] zArr = this.f82099b;
            if (zBooleanValue) {
                zArr[0] = true;
            }
            return !zArr[0];
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
        public Boolean result() {
            return Boolean.valueOf(this.f82099b[0]);
        }
    }

    public static /* synthetic */ void a(int i10) {
        Object[] objArr = new Object[3];
        switch (i10) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case 17:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (i10) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static <N, R> R dfs(@NotNull Collection<N> collection, @NotNull Neighbors<N> neighbors, @NotNull Visited<N> visited, @NotNull NodeHandler<N, R> nodeHandler) {
        if (collection == null) {
            a(0);
            throw null;
        }
        if (neighbors == null) {
            a(1);
            throw null;
        }
        if (visited == null) {
            a(2);
            throw null;
        }
        if (nodeHandler == null) {
            a(3);
            throw null;
        }
        Iterator<N> it = collection.iterator();
        while (it.hasNext()) {
            doDfs(it.next(), neighbors, visited, nodeHandler);
        }
        return nodeHandler.result();
    }

    public static <N> void doDfs(@NotNull N n7, @NotNull Neighbors<N> neighbors, @NotNull Visited<N> visited, @NotNull NodeHandler<N, ?> nodeHandler) {
        if (n7 == null) {
            a(22);
            throw null;
        }
        if (neighbors == null) {
            a(23);
            throw null;
        }
        if (visited == null) {
            a(24);
            throw null;
        }
        if (nodeHandler == null) {
            a(25);
            throw null;
        }
        if (visited.checkAndMarkVisited(n7) && nodeHandler.beforeChildren(n7)) {
            Iterator<? extends N> it = neighbors.getNeighbors(n7).iterator();
            while (it.hasNext()) {
                doDfs(it.next(), neighbors, visited, nodeHandler);
            }
            nodeHandler.afterChildren(n7);
        }
    }

    public static <N> Boolean ifAny(@NotNull Collection<N> collection, @NotNull Neighbors<N> neighbors, @NotNull Function1<N, Boolean> function1) {
        if (collection == null) {
            a(7);
            throw null;
        }
        if (neighbors == null) {
            a(8);
            throw null;
        }
        if (function1 != null) {
            return (Boolean) dfs(collection, neighbors, new a(new boolean[1], function1));
        }
        a(9);
        throw null;
    }

    public static <N, R> R dfs(@NotNull Collection<N> collection, @NotNull Neighbors<N> neighbors, @NotNull NodeHandler<N, R> nodeHandler) {
        if (collection == null) {
            a(4);
            throw null;
        }
        if (neighbors == null) {
            a(5);
            throw null;
        }
        if (nodeHandler != null) {
            return (R) dfs(collection, neighbors, new VisitedWithSet(), nodeHandler);
        }
        a(6);
        throw null;
    }

    public static abstract class AbstractNodeHandler<N, R> implements NodeHandler<N, R> {
        @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
        public boolean beforeChildren(N n7) {
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
        public void afterChildren(N n7) {
        }
    }
}
