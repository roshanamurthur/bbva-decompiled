package javax.activation;

import java.util.WeakHashMap;
import zj.d;

/* JADX INFO: loaded from: classes12.dex */
public abstract class CommandMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static CommandMap f78845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f78846b = new WeakHashMap();

    public static synchronized CommandMap getDefaultCommandMap() {
        CommandMap commandMap = f78845a;
        if (commandMap != null) {
            return commandMap;
        }
        ClassLoader classLoaderA = d.a();
        WeakHashMap weakHashMap = f78846b;
        CommandMap mailcapCommandMap = (CommandMap) weakHashMap.get(classLoaderA);
        if (mailcapCommandMap == null) {
            mailcapCommandMap = new MailcapCommandMap();
            weakHashMap.put(classLoaderA, mailcapCommandMap);
        }
        return mailcapCommandMap;
    }

    public static synchronized void setDefaultCommandMap(CommandMap commandMap) {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            try {
                securityManager.checkSetFactory();
            } catch (SecurityException e5) {
                ClassLoader classLoader = CommandMap.class.getClassLoader();
                if (classLoader == null || classLoader.getParent() == null || classLoader != commandMap.getClass().getClassLoader()) {
                    throw e5;
                }
            }
        }
        f78846b.remove(d.a());
        f78845a = commandMap;
    }

    public abstract DataContentHandler createDataContentHandler(String str);

    public DataContentHandler createDataContentHandler(String str, DataSource dataSource) {
        return createDataContentHandler(str);
    }

    public abstract CommandInfo[] getAllCommands(String str);

    public CommandInfo[] getAllCommands(String str, DataSource dataSource) {
        return getAllCommands(str);
    }

    public abstract CommandInfo getCommand(String str, String str2);

    public CommandInfo getCommand(String str, String str2, DataSource dataSource) {
        return getCommand(str, str2);
    }

    public String[] getMimeTypes() {
        return null;
    }

    public abstract CommandInfo[] getPreferredCommands(String str);

    public CommandInfo[] getPreferredCommands(String str, DataSource dataSource) {
        return getPreferredCommands(str);
    }
}
