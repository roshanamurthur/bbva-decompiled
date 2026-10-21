package androidx.databinding;

import android.view.View;
import androidx.annotation.RestrictTo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class MergedDataBinderMapper extends DataBinderMapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f20529a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f20530b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f20531c = new CopyOnWriteArrayList();

    public final boolean a() {
        CopyOnWriteArrayList<String> copyOnWriteArrayList = this.f20531c;
        boolean z10 = false;
        for (String str : copyOnWriteArrayList) {
            try {
                Class<?> cls = Class.forName(str);
                if (DataBinderMapper.class.isAssignableFrom(cls)) {
                    addMapper((DataBinderMapper) cls.newInstance());
                    copyOnWriteArrayList.remove(str);
                    z10 = true;
                }
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
            }
        }
        return z10;
    }

    public void addMapper(DataBinderMapper dataBinderMapper) {
        if (this.f20529a.add(dataBinderMapper.getClass())) {
            this.f20530b.add(dataBinderMapper);
            Iterator<DataBinderMapper> it = dataBinderMapper.collectDependencies().iterator();
            while (it.hasNext()) {
                addMapper(it.next());
            }
        }
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int i10) {
        Iterator it = this.f20530b.iterator();
        while (it.hasNext()) {
            String strConvertBrIdToString = ((DataBinderMapper) it.next()).convertBrIdToString(i10);
            if (strConvertBrIdToString != null) {
                return strConvertBrIdToString;
            }
        }
        if (a()) {
            return convertBrIdToString(i10);
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i10) {
        Iterator it = this.f20530b.iterator();
        while (it.hasNext()) {
            ViewDataBinding dataBinder = ((DataBinderMapper) it.next()).getDataBinder(dataBindingComponent, view, i10);
            if (dataBinder != null) {
                return dataBinder;
            }
        }
        if (a()) {
            return getDataBinder(dataBindingComponent, view, i10);
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(String str) {
        Iterator it = this.f20530b.iterator();
        while (it.hasNext()) {
            int layoutId = ((DataBinderMapper) it.next()).getLayoutId(str);
            if (layoutId != 0) {
                return layoutId;
            }
        }
        if (a()) {
            return getLayoutId(str);
        }
        return 0;
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i10) {
        Iterator it = this.f20530b.iterator();
        while (it.hasNext()) {
            ViewDataBinding dataBinder = ((DataBinderMapper) it.next()).getDataBinder(dataBindingComponent, viewArr, i10);
            if (dataBinder != null) {
                return dataBinder;
            }
        }
        if (a()) {
            return getDataBinder(dataBindingComponent, viewArr, i10);
        }
        return null;
    }

    public void addMapper(String str) {
        this.f20531c.add(str + ".DataBinderMapperImpl");
    }
}
