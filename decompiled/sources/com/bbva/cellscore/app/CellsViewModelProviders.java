package com.bbva.cellscore.app;

import android.app.Application;
import android.content.Context;
import androidx.datastore.preferences.protobuf.q;
import androidx.fragment.app.Fragment;
import com.bbva.cells.component.kit.ui.helper.ContextHelper;
import com.bbva.cells.component.kit.ui.viewmodel.ViewModel;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public class CellsViewModelProviders {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Fragment f26903a;

    public static <T extends ViewModel> T of(int i10, Context context, Class<T> cls) {
        Fragment fragment = f26903a;
        int iHashCode = fragment == null ? ContextHelper.getOwner(context).hashCode() : fragment.hashCode();
        try {
            T tNewInstance = cls.getConstructor(Application.class).newInstance((Application) context.getApplicationContext());
            tNewInstance.setId(i10);
            ComponentManager.addComponentToPage(iHashCode, i10, tNewInstance);
            return tNewInstance;
        } catch (IllegalAccessException e5) {
            throw new RuntimeException(q.c("Cannot create an instance of ", cls), e5);
        } catch (InstantiationException e7) {
            throw new RuntimeException(q.c("Cannot create an instance of ", cls), e7);
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException(q.c("Cannot create an instance of ", cls), e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(q.c("Cannot create an instance of ", cls), e11);
        }
    }
}
