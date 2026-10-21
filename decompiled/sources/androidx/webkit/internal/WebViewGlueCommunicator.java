package androidx.webkit.internal;

import android.os.Build;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: loaded from: classes2.dex */
public class WebViewGlueCommunicator {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final WebkitToCompatConverter f24081a = new WebkitToCompatConverter(WebViewGlueCommunicator.getFactory().getWebkitToCompatConverter());
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final WebViewProviderFactory f24082a;

        static {
            WebViewProviderFactory incompatibleApkWebViewProviderFactory;
            try {
                incompatibleApkWebViewProviderFactory = new WebViewProviderFactoryAdapter((WebViewProviderFactoryBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebViewProviderFactoryBoundaryInterface.class, WebViewGlueCommunicator.a()));
            } catch (ClassNotFoundException unused) {
                incompatibleApkWebViewProviderFactory = new IncompatibleApkWebViewProviderFactory();
            } catch (IllegalAccessException e5) {
                throw new RuntimeException(e5);
            } catch (NoSuchMethodException e7) {
                throw new RuntimeException(e7);
            } catch (InvocationTargetException e10) {
                throw new RuntimeException(e10);
            }
            f24082a = incompatibleApkWebViewProviderFactory;
        }
    }

    public static InvocationHandler a() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, getWebViewClassLoader()).getDeclaredMethod("createWebViewProviderFactory", new Class[0]).invoke(null, new Object[0]);
    }

    @NonNull
    public static WebkitToCompatConverter getCompatConverter() {
        return a.f24081a;
    }

    @NonNull
    public static WebViewProviderFactory getFactory() {
        return b.f24082a;
    }

    @NonNull
    public static ClassLoader getWebViewClassLoader() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ApiHelperForP.getWebViewClassLoader();
        }
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", new Class[0]);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, new Object[0]).getClass().getClassLoader();
        } catch (IllegalAccessException e5) {
            throw new RuntimeException(e5);
        } catch (NoSuchMethodException e7) {
            throw new RuntimeException(e7);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }
}
