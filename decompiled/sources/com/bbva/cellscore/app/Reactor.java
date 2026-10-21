package com.bbva.cellscore.app;

import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import com.bbva.cells.component.kit.model.ActionSpec;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class Reactor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Reactor f26909b = new Reactor();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f26910a = new ArrayList();

    public static class ActionFire {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f26911a;

        public ActionFire(String str) {
            this.f26911a = str;
        }

        public <T> ActionFireParam<T> doAction(@NonNull ActionSpec<T> actionSpec) {
            return new ActionFireParam<>(this.f26911a, actionSpec);
        }
    }

    public static class ActionFireParam<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f26912a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ActionSpec<T> f26913b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public T f26914c;

        public ActionFireParam(String str, ActionSpec<T> actionSpec) {
            this.f26912a = str;
            this.f26913b = actionSpec;
        }

        public void clean() {
            String id = this.f26913b.getId();
            Iterator it = Reactor.f26909b.f26910a.iterator();
            while (it.hasNext()) {
                ((ReactorPublisher) it.next()).clean(this.f26912a, id);
            }
        }

        public void fire() {
            String id = this.f26913b.getId();
            T t10 = this.f26914c;
            Iterator it = Reactor.f26909b.f26910a.iterator();
            while (it.hasNext()) {
                ((ReactorPublisher) it.next()).publish(this.f26912a, id, t10);
            }
        }

        public ActionFireParam<T> with(T t10) {
            this.f26914c = t10;
            return this;
        }
    }

    public static void addPublisher(@NonNull ReactorPublisher reactorPublisher) {
        f26909b.f26910a.add(reactorPublisher);
    }

    public static ActionFire in(@NonNull String str) {
        return new ActionFire(str);
    }

    public static ActionFire inside(@NonNull String str) {
        return in(str);
    }

    public static void removePublisher(@NonNull ReactorPublisher reactorPublisher) {
        f26909b.f26910a.remove(reactorPublisher);
    }

    public static ActionFire in(@IdRes int i10) {
        return new ActionFire(String.valueOf(i10));
    }

    public static ActionFire inside(@IdRes int i10) {
        return in(String.valueOf(i10));
    }
}
