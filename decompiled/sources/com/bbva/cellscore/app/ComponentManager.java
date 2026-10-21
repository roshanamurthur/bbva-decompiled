package com.bbva.cellscore.app;

import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bbva.cells.component.kit.common.Component;
import com.bbva.cells.component.kit.common.Disposable;

/* JADX INFO: loaded from: classes2.dex */
public class ComponentManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ComponentManager f26905c = new ComponentManager();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComponentContainer f26906a = new ComponentContainer();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PageContainer f26907b = new PageContainer();

    public static void add(@IdRes int i10, @NonNull Object obj) {
        ComponentContainer componentContainer = f26905c.f26906a;
        componentContainer.getClass();
        componentContainer.f26904a.put(String.valueOf(i10), obj);
    }

    public static void addComponentToPage(int i10, @IdRes int i11, @NonNull Object obj) {
        ComponentContainer componentContainer = f26905c.f26907b.get(i10);
        componentContainer.getClass();
        componentContainer.f26904a.put(String.valueOf(i11), obj);
    }

    @VisibleForTesting
    public static void addPageContainer(PageContainer pageContainer) {
        f26905c.f26907b = pageContainer;
    }

    public static void clearScreen(int i10) {
        ComponentManager componentManager = f26905c;
        for (Object obj : componentManager.f26907b.get(i10).f26904a.values()) {
            if (obj instanceof Disposable) {
                ((Disposable) obj).dispose();
            }
        }
        componentManager.f26907b.remove(i10);
    }

    public static <T> T get(@NonNull String str) {
        return (T) f26905c.f26906a.f26904a.get(str);
    }

    public static void remove(@NonNull String str) {
        f26905c.f26906a.f26904a.remove(str);
    }

    public static void add(@NonNull String str, @NonNull Object obj) {
        f26905c.f26906a.f26904a.put(str, obj);
    }

    public static void addComponentToPage(int i10, @NonNull String str, @NonNull Object obj) {
        f26905c.f26907b.get(i10).f26904a.put(str, obj);
    }

    public static <T> T get(int i10, @NonNull String str) {
        return (T) f26905c.f26907b.get(i10).f26904a.get(str);
    }

    public static void remove(@IdRes int i10) {
        ComponentContainer componentContainer = f26905c.f26906a;
        componentContainer.getClass();
        componentContainer.f26904a.remove(String.valueOf(i10));
    }

    public static void add(@NonNull Component component) {
        ComponentContainer componentContainer = f26905c.f26906a;
        componentContainer.f26904a.put(component.getId(), component);
    }

    public static void addComponentToPage(int i10, @NonNull Component component) {
        ComponentContainer componentContainer = f26905c.f26907b.get(i10);
        componentContainer.f26904a.put(component.getId(), component);
    }
}
