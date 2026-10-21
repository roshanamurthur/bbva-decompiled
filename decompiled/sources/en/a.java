package en;

import java.util.ArrayList;
import java.util.List;
import org.junit.internal.Classes;
import org.junit.runner.FilterFactory;
import org.junit.runner.FilterFactoryParams;
import org.junit.runner.manipulation.Filter;

/* JADX INFO: compiled from: CategoryFilterFactory.java */
/* JADX INFO: loaded from: classes13.dex */
public abstract class a implements FilterFactory {
    public abstract Filter createFilter(List<Class<?>> list);

    @Override // org.junit.runner.FilterFactory
    public Filter createFilter(FilterFactoryParams filterFactoryParams) throws FilterFactory.FilterNotCreatedException {
        try {
            String args = filterFactoryParams.getArgs();
            ArrayList arrayList = new ArrayList();
            for (String str : args.split(",")) {
                arrayList.add(Classes.getClass(str, getClass()));
            }
            return createFilter(arrayList);
        } catch (ClassNotFoundException e5) {
            throw new FilterFactory.FilterNotCreatedException(e5);
        }
    }
}
