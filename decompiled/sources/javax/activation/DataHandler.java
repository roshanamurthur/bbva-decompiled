package javax.activation;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.net.URL;
import zj.b;
import zj.c;
import zj.d;

/* JADX INFO: loaded from: classes12.dex */
public class DataHandler {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ActivationDataFlavor[] f78847k = new ActivationDataFlavor[0];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static DataContentHandlerFactory f78848l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataSource f78849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zj.a f78850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f78851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f78852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CommandMap f78853e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ActivationDataFlavor[] f78854f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public DataContentHandler f78855g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public DataContentHandler f78856h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public DataContentHandlerFactory f78857i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f78858j;

    public class a implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ DataContentHandler f78859p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ PipedOutputStream f78860q0;

        public a(DataContentHandler dataContentHandler, PipedOutputStream pipedOutputStream) {
            this.f78859p0 = dataContentHandler;
            this.f78860q0 = pipedOutputStream;
        }

        @Override // java.lang.Runnable
        public final void run() {
            PipedOutputStream pipedOutputStream = this.f78860q0;
            try {
                DataContentHandler dataContentHandler = this.f78859p0;
                DataHandler dataHandler = DataHandler.this;
                dataContentHandler.writeTo(dataHandler.f78851c, dataHandler.f78852d, pipedOutputStream);
            } catch (IOException unused) {
            } catch (Throwable th2) {
                try {
                    pipedOutputStream.close();
                } catch (IOException unused2) {
                }
                throw th2;
            }
            try {
                pipedOutputStream.close();
            } catch (IOException unused3) {
            }
        }
    }

    public DataHandler(DataSource dataSource) {
        this.f78850b = null;
        this.f78851c = null;
        this.f78852d = null;
        this.f78853e = null;
        this.f78854f = f78847k;
        this.f78855g = null;
        this.f78856h = null;
        this.f78858j = null;
        this.f78849a = dataSource;
        this.f78857i = f78848l;
    }

    public static synchronized void setDataContentHandlerFactory(DataContentHandlerFactory dataContentHandlerFactory) {
        if (f78848l != null) {
            throw new Error("DataContentHandlerFactory already defined");
        }
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            try {
                securityManager.checkSetFactory();
            } catch (SecurityException e5) {
                if (DataHandler.class.getClassLoader() != dataContentHandlerFactory.getClass().getClassLoader()) {
                    throw e5;
                }
            }
        }
        f78848l = dataContentHandlerFactory;
    }

    public final synchronized String a() {
        if (this.f78858j == null) {
            String contentType = getContentType();
            try {
                this.f78858j = new MimeType(contentType).getBaseType();
            } catch (MimeTypeParseException unused) {
                this.f78858j = contentType;
            }
        }
        return this.f78858j;
    }

    public final synchronized CommandMap b() {
        CommandMap commandMap = this.f78853e;
        if (commandMap != null) {
            return commandMap;
        }
        return CommandMap.getDefaultCommandMap();
    }

    public final synchronized DataContentHandler c() {
        DataContentHandlerFactory dataContentHandlerFactory;
        try {
            DataContentHandlerFactory dataContentHandlerFactory2 = f78848l;
            if (dataContentHandlerFactory2 != this.f78857i) {
                this.f78857i = dataContentHandlerFactory2;
                this.f78856h = null;
                this.f78855g = null;
                this.f78854f = f78847k;
            }
            DataContentHandler dataContentHandler = this.f78855g;
            if (dataContentHandler != null) {
                return dataContentHandler;
            }
            String strA = a();
            if (this.f78856h == null && (dataContentHandlerFactory = f78848l) != null) {
                this.f78856h = dataContentHandlerFactory.createDataContentHandler(strA);
            }
            DataContentHandler dataContentHandler2 = this.f78856h;
            if (dataContentHandler2 != null) {
                this.f78855g = dataContentHandler2;
            }
            if (this.f78855g == null) {
                if (this.f78849a != null) {
                    this.f78855g = b().createDataContentHandler(strA, this.f78849a);
                } else {
                    this.f78855g = b().createDataContentHandler(strA);
                }
            }
            DataSource dataSource = this.f78849a;
            if (dataSource != null) {
                DataContentHandler dataContentHandler3 = this.f78855g;
                b bVar = new b();
                bVar.f95079b = null;
                bVar.f95078a = dataSource;
                bVar.f95080c = dataContentHandler3;
                this.f78855g = bVar;
            } else {
                DataContentHandler dataContentHandler4 = this.f78855g;
                Object obj = this.f78851c;
                String str = this.f78852d;
                c cVar = new c();
                cVar.f95081a = null;
                cVar.f95082b = obj;
                cVar.f95083c = str;
                cVar.f95084d = dataContentHandler4;
                this.f78855g = cVar;
            }
            return this.f78855g;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public CommandInfo[] getAllCommands() {
        DataSource dataSource = this.f78849a;
        return dataSource != null ? b().getAllCommands(a(), dataSource) : b().getAllCommands(a());
    }

    public Object getBean(CommandInfo commandInfo) {
        try {
            ClassLoader classLoaderA = d.a();
            if (classLoaderA == null) {
                classLoaderA = getClass().getClassLoader();
            }
            return commandInfo.getCommandObject(this, classLoaderA);
        } catch (IOException | ClassNotFoundException unused) {
            return null;
        }
    }

    public CommandInfo getCommand(String str) {
        DataSource dataSource = this.f78849a;
        return dataSource != null ? b().getCommand(a(), str, dataSource) : b().getCommand(a(), str);
    }

    public Object getContent() throws IOException {
        Object obj = this.f78851c;
        return obj != null ? obj : c().getContent(getDataSource());
    }

    public String getContentType() {
        DataSource dataSource = this.f78849a;
        return dataSource != null ? dataSource.getContentType() : this.f78852d;
    }

    public DataSource getDataSource() {
        DataSource dataSource = this.f78849a;
        if (dataSource != null) {
            return dataSource;
        }
        if (this.f78850b == null) {
            zj.a aVar = new zj.a();
            aVar.f95077a = this;
            this.f78850b = aVar;
        }
        return this.f78850b;
    }

    public InputStream getInputStream() throws IOException {
        DataSource dataSource = this.f78849a;
        if (dataSource != null) {
            return dataSource.getInputStream();
        }
        DataContentHandler dataContentHandlerC = c();
        if (dataContentHandlerC == null) {
            throw new UnsupportedDataTypeException("no DCH for MIME type " + a());
        }
        if ((dataContentHandlerC instanceof c) && ((c) dataContentHandlerC).f95084d == null) {
            throw new UnsupportedDataTypeException("no object DCH for MIME type " + a());
        }
        PipedOutputStream pipedOutputStream = new PipedOutputStream();
        PipedInputStream pipedInputStream = new PipedInputStream(pipedOutputStream);
        new Thread(new a(dataContentHandlerC, pipedOutputStream), "DataHandler.getInputStream").start();
        return pipedInputStream;
    }

    public String getName() {
        DataSource dataSource = this.f78849a;
        if (dataSource != null) {
            return dataSource.getName();
        }
        return null;
    }

    public OutputStream getOutputStream() throws IOException {
        DataSource dataSource = this.f78849a;
        if (dataSource != null) {
            return dataSource.getOutputStream();
        }
        return null;
    }

    public CommandInfo[] getPreferredCommands() {
        DataSource dataSource = this.f78849a;
        return dataSource != null ? b().getPreferredCommands(a(), dataSource) : b().getPreferredCommands(a());
    }

    public Object getTransferData(ActivationDataFlavor activationDataFlavor) throws IOException {
        return c().getTransferData(activationDataFlavor, this.f78849a);
    }

    public synchronized ActivationDataFlavor[] getTransferDataFlavors() {
        try {
            if (f78848l != this.f78857i) {
                this.f78854f = f78847k;
            }
            ActivationDataFlavor[] activationDataFlavorArr = this.f78854f;
            ActivationDataFlavor[] activationDataFlavorArr2 = f78847k;
            if (activationDataFlavorArr == activationDataFlavorArr2) {
                this.f78854f = c().mo5511getTransferDataFlavors();
            }
            ActivationDataFlavor[] activationDataFlavorArr3 = this.f78854f;
            if (activationDataFlavorArr3 == activationDataFlavorArr2) {
                return activationDataFlavorArr3;
            }
            return (ActivationDataFlavor[]) activationDataFlavorArr3.clone();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public boolean isDataFlavorSupported(ActivationDataFlavor activationDataFlavor) {
        for (ActivationDataFlavor activationDataFlavor2 : getTransferDataFlavors()) {
            if (activationDataFlavor2.equals(activationDataFlavor)) {
                return true;
            }
        }
        return false;
    }

    public synchronized void setCommandMap(CommandMap commandMap) {
        if (commandMap != this.f78853e || commandMap == null) {
            this.f78854f = f78847k;
            this.f78855g = null;
            this.f78853e = commandMap;
        }
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        DataSource dataSource = this.f78849a;
        if (dataSource == null) {
            c().writeTo(this.f78851c, this.f78852d, outputStream);
            return;
        }
        byte[] bArr = new byte[8192];
        InputStream inputStream = dataSource.getInputStream();
        while (true) {
            try {
                int i10 = inputStream.read(bArr);
                if (i10 <= 0) {
                    inputStream.close();
                    return;
                }
                outputStream.write(bArr, 0, i10);
            } catch (Throwable th2) {
                inputStream.close();
                throw th2;
            }
        }
    }

    public DataHandler(Object obj, String str) {
        this.f78849a = null;
        this.f78850b = null;
        this.f78853e = null;
        this.f78854f = f78847k;
        this.f78855g = null;
        this.f78856h = null;
        this.f78858j = null;
        this.f78851c = obj;
        this.f78852d = str;
        this.f78857i = f78848l;
    }

    public DataHandler(URL url) {
        this.f78849a = null;
        this.f78850b = null;
        this.f78851c = null;
        this.f78852d = null;
        this.f78853e = null;
        this.f78854f = f78847k;
        this.f78855g = null;
        this.f78856h = null;
        this.f78857i = null;
        this.f78858j = null;
        this.f78849a = new URLDataSource(url);
        this.f78857i = f78848l;
    }
}
