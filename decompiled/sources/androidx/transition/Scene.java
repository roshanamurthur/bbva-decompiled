package androidx.transition;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class Scene {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f23637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23638b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewGroup f23639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f23640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Runnable f23641e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Runnable f23642f;

    public Scene(@NonNull ViewGroup viewGroup) {
        this.f23639c = viewGroup;
    }

    @Nullable
    public static Scene getCurrentScene(@NonNull ViewGroup viewGroup) {
        return (Scene) viewGroup.getTag(R.id.transition_current_scene);
    }

    @NonNull
    public static Scene getSceneForLayout(@NonNull ViewGroup viewGroup, @LayoutRes int i10, @NonNull Context context) {
        int i11 = R.id.transition_scene_layoutid_cache;
        SparseArray sparseArray = (SparseArray) viewGroup.getTag(i11);
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            viewGroup.setTag(i11, sparseArray);
        }
        Scene scene = (Scene) sparseArray.get(i10);
        if (scene != null) {
            return scene;
        }
        Scene scene2 = new Scene();
        scene2.f23637a = context;
        scene2.f23639c = viewGroup;
        scene2.f23638b = i10;
        sparseArray.put(i10, scene2);
        return scene2;
    }

    public void enter() {
        View view = this.f23640d;
        ViewGroup viewGroup = this.f23639c;
        int i10 = this.f23638b;
        if (i10 > 0 || view != null) {
            getSceneRoot().removeAllViews();
            if (i10 > 0) {
                LayoutInflater.from(this.f23637a).inflate(i10, viewGroup);
            } else {
                viewGroup.addView(view);
            }
        }
        Runnable runnable = this.f23641e;
        if (runnable != null) {
            runnable.run();
        }
        viewGroup.setTag(R.id.transition_current_scene, this);
    }

    public void exit() {
        Runnable runnable;
        if (getCurrentScene(this.f23639c) != this || (runnable = this.f23642f) == null) {
            return;
        }
        runnable.run();
    }

    @NonNull
    public ViewGroup getSceneRoot() {
        return this.f23639c;
    }

    public void setEnterAction(@Nullable Runnable runnable) {
        this.f23641e = runnable;
    }

    public void setExitAction(@Nullable Runnable runnable) {
        this.f23642f = runnable;
    }

    public Scene(@NonNull ViewGroup viewGroup, @NonNull View view) {
        this.f23639c = viewGroup;
        this.f23640d = view;
    }
}
