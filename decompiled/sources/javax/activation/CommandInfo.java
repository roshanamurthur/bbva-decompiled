package javax.activation;

import com.fasterxml.jackson.core.JsonPointer;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AccessController;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes12.dex */
public class CommandInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f78842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78843b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Method f78844a;

        static {
            Method declaredMethod = null;
            try {
                declaredMethod = Class.forName("java.beans.Beans").getDeclaredMethod("instantiate", ClassLoader.class, String.class);
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
            }
            f78844a = declaredMethod;
        }
    }

    public CommandInfo(String str, String str2) {
        this.f78842a = str;
        this.f78843b = str2;
    }

    public String getCommandClass() {
        return this.f78843b;
    }

    public String getCommandName() {
        return this.f78842a;
    }

    public Object getCommandObject(DataHandler dataHandler, ClassLoader classLoader) throws IOException, ClassNotFoundException {
        Object objNewInstance;
        int iLastIndexOf;
        InputStream inputStream;
        Method method = a.f78844a;
        String str = this.f78843b;
        if (method != null) {
            objNewInstance = null;
            try {
                objNewInstance = method.invoke(null, classLoader, str);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        } else {
            SecurityManager securityManager = System.getSecurityManager();
            if (securityManager != null) {
                String strReplace = str.replace(JsonPointer.SEPARATOR, '.');
                if (strReplace.startsWith(Constant.BRACKET_OPEN) && (iLastIndexOf = strReplace.lastIndexOf(91) + 2) > 1 && iLastIndexOf < strReplace.length()) {
                    strReplace = strReplace.substring(iLastIndexOf);
                }
                int iLastIndexOf2 = strReplace.lastIndexOf(46);
                if (iLastIndexOf2 != -1) {
                    securityManager.checkPackageAccess(strReplace.substring(0, iLastIndexOf2));
                }
            }
            if (classLoader == null) {
                classLoader = (ClassLoader) AccessController.doPrivileged(new javax.activation.a());
            }
            Class<?> cls = Class.forName(str, true, classLoader);
            try {
                objNewInstance = cls.newInstance();
            } catch (Exception e5) {
                throw new ClassNotFoundException(cls + ": " + e5, e5);
            }
        }
        if (objNewInstance != null) {
            if (objNewInstance instanceof CommandObject) {
                ((CommandObject) objNewInstance).setCommandContext(this.f78842a, dataHandler);
            } else if ((objNewInstance instanceof Externalizable) && dataHandler != null && (inputStream = dataHandler.getInputStream()) != null) {
                ((Externalizable) objNewInstance).readExternal(new ObjectInputStream(inputStream));
            }
        }
        return objNewInstance;
    }
}
