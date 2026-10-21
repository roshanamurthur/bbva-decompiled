package com.bbva.cellscore.channel.model;

import android.app.Activity;
import com.bbva.androidtoolkit.optional.function.Predicate;
import com.bbva.cells.component.kit.tracking.TrackingEvent;
import com.bbva.cellscore.trace.TrackerController;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class Reaction<C, P> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f26967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Channel<P> f26968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ReactionExecution<C, P> f26969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public NavigationExecution<C, P> f26970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TracerMessageMapper<P> f26971e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f26972f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f26973g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String[] f26974h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f26975i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Action<P> f26976j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f26977k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Predicate<P> f26978l;

    public interface NavigationExecution<C, P> {
        void execute(Activity activity, C c10, P p4);
    }

    public interface ReactionExecution<C, P> {
        void execute(C c10, P p4);
    }

    public interface ReactionExecutionError {
        void error(Throwable th2);
    }

    public interface TracerMessageMapper<P> {
        TrackingEvent map(String str, P p4);
    }

    public Reaction() {
        throw null;
    }

    public boolean cleanChannel() {
        return this.f26973g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Reaction reaction = (Reaction) obj;
        if (this.f26972f != reaction.f26972f || this.f26973g != reaction.f26973g || this.f26975i != reaction.f26975i || !this.f26967a.equals(reaction.f26967a) || !this.f26968b.getName().equals(reaction.f26968b.getName()) || !Arrays.equals(this.f26974h, reaction.f26974h)) {
            return false;
        }
        Action<P> action = reaction.f26976j;
        Action<P> action2 = this.f26976j;
        if (action2 != null && action == null) {
            return false;
        }
        if (action2 != null) {
            return action2.getId().equals(action.getId());
        }
        return action == null;
    }

    public boolean filter(P p4) {
        Predicate<P> predicate = this.f26978l;
        return predicate == null || predicate.test(p4);
    }

    public Action<P> getAction() {
        return this.f26976j;
    }

    public Channel<P> getChannel() {
        return this.f26968b;
    }

    public String getComponentId() {
        return this.f26967a;
    }

    public long getDelay() {
        return this.f26975i;
    }

    public ReactionExecution<C, P> getExecution() {
        return this.f26969c;
    }

    public NavigationExecution<C, P> getNavigation() {
        return this.f26970d;
    }

    public String[] getPermissionsNeeded() {
        return this.f26974h;
    }

    public TracerMessageMapper<P> getTracerMessage() {
        return this.f26971e;
    }

    public boolean hasWebNavigation() {
        return this.f26977k;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f26968b.hashCode() + (this.f26967a.hashCode() * 31)) * 31) + (this.f26972f ? 1 : 0)) * 31) + (this.f26973g ? 1 : 0)) * 31) + Arrays.hashCode(this.f26974h)) * 31;
        long j10 = this.f26975i;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        Action<P> action = this.f26976j;
        return i10 + (action != null ? action.hashCode() : 0);
    }

    public boolean isNavigation() {
        return this.f26972f;
    }

    public boolean isTraceEnable() {
        return this.f26971e != null;
    }

    public String testFeatureFlag() {
        return null;
    }

    public String toString() {
        return "Channel:" + this.f26968b.getName() + " componentId:" + this.f26967a + " autoClean:" + this.f26973g;
    }

    public void trace(TrackerController trackerController, P p4) {
        if (isTraceEnable()) {
            Action<P> action = this.f26976j;
            trackerController.trace(this.f26971e.map(action == null ? "" : action.getId(), p4));
        }
    }

    public static final class Builder<C, P> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f26979a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Channel<P> f26980b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ReactionExecution<C, P> f26981c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public NavigationExecution<C, P> f26982d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public TracerMessageMapper<P> f26983e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f26984f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f26985g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String[] f26986h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f26987i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Action<P> f26988j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f26989k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Predicate<P> f26990l;

        public Builder<C, P> action(Action<P> action) {
            this.f26988j = action;
            return this;
        }

        public Reaction<C, P> build() {
            Reaction<C, P> reaction = new Reaction<>();
            reaction.f26967a = this.f26979a;
            reaction.f26968b = this.f26980b;
            reaction.f26969c = this.f26981c;
            reaction.f26970d = this.f26982d;
            reaction.f26972f = this.f26984f;
            reaction.f26973g = this.f26985g;
            reaction.f26974h = this.f26986h;
            reaction.f26975i = this.f26987i;
            reaction.f26976j = this.f26988j;
            reaction.f26971e = this.f26983e;
            reaction.f26977k = this.f26989k;
            reaction.f26978l = this.f26990l;
            return reaction;
        }

        public Builder<C, P> channel(Channel<P> channel) {
            this.f26980b = channel;
            return this;
        }

        public Builder<C, P> cleanChannel(boolean z10) {
            this.f26985g = z10;
            return this;
        }

        public Builder<C, P> componentId(String str) {
            this.f26979a = str;
            return this;
        }

        public Builder<C, P> delay(long j10) {
            this.f26987i = j10;
            return this;
        }

        public Builder<C, P> execution(ReactionExecution<C, P> reactionExecution) {
            this.f26981c = reactionExecution;
            return this;
        }

        public Builder<C, P> filter(Predicate<P> predicate) {
            this.f26990l = predicate;
            return this;
        }

        public Builder<C, P> navigation(NavigationExecution<C, P> navigationExecution, boolean z10) {
            this.f26984f = navigationExecution != null;
            this.f26989k = z10;
            this.f26982d = navigationExecution;
            return this;
        }

        public Builder<C, P> permissionsNeeded(String[] strArr) {
            this.f26986h = strArr;
            return this;
        }

        public Builder<C, P> tracerMapper(TracerMessageMapper<P> tracerMessageMapper) {
            this.f26983e = tracerMessageMapper;
            return this;
        }

        public Builder<C, P> featureFlagFilter(String str) {
            return this;
        }
    }
}
